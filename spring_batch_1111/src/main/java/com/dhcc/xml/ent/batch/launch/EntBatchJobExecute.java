package com.dhcc.xml.ent.batch.launch;


import com.dhcc.core.util.CommonUtils;
import com.dhcc.xml.ent.batch.listener.EntJobExecutionListener;
import com.dhcc.xml.entity.BatchExecuteInfo;
import com.dhcc.xml.entity.BatchJob;
import com.dhcc.xml.entity.SubmitOrgInfo;
import com.dhcc.xml.service.DBLaunchService;
import com.dhcc.xml.service.MessageInfoService;
import com.dhcc.xml.util.ConfiguratorFactory;
import com.dhcc.xml.util.SpringContextUtil;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Title: EntBatchJobExecute<br/>
 * Description: 报文生成调用入口<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-8-15
 */
@Component
public class EntBatchJobExecute {

	@Autowired
	private MessageInfoService messageInfoService;
	@Autowired
	private JobLauncher jobLauncher;
	@Autowired
	private DBLaunchService dbLaunchService;


	/*@Autowired
	private Job tJob01;*/

	/**
	 * 批量执行情况信息表
	 */
	public String run(String job_name,String br_no, String tx_date,String type) {
		// "20160101";
		try {
			if(job_name==null||"".equals(job_name)){
				job_name="InBasInfJob";
			}
			String currenDate =  UpdateDate.getDateFormat("yyyyMMdd");
			String currentTime = UpdateDate.getDateFormat("yyyyMMddHHmmss");

			Map<String, String> map = new HashMap<String, String>();
			map.put("tx_date", tx_date);
			map.put("br_no", br_no);
			map.put("type", type);


			BatchJob batchJob = new BatchJob();
			batchJob.setJobName(job_name);
			batchJob = messageInfoService.getBatchJob("MessageInfo_getBatchJob",batchJob);

			//如果是校验，回刷校验状态为1
			if("2".equals(type)||"3".equals(type)){
				dbLaunchService.updatePageNumber(job_name+"_updateCheckSts",map);
				dbLaunchService.updatePageNumber(job_name+"_dleError",map);
			}

			//查询各类报文要生成的数量
			//Job第一次进入的时候更新数据表的PAGENUMBER并获取待生成条数
			String sum = "";
			if(EntJobExecutionListener.JOB_MAP.get(job_name)==null||EntJobExecutionListener.JOB_MAP.get(job_name)==0){
				sum = dbLaunchService.updatePageNumber(job_name+"_updatePageNumber",map);
				if("0".equals(sum)){//没有要生成的报文直接退出当前Job
					if(batchJob!=null&&batchJob.getNextJob().length()>0){
						String nextJobName = batchJob.getNextJob();
						BatchJob nextBatchJob = new BatchJob();
						nextBatchJob.setJobName(nextJobName);
						nextBatchJob = messageInfoService.getBatchJob("MessageInfo_getBatchJob", nextBatchJob);
						if(nextBatchJob!=null){
							String nextJavaPath = nextBatchJob.getJavaPath();
							String nextJavaFun = nextBatchJob.getJavaFun();
							//1、反射入口创建
							Class<?> clazz = ConfiguratorFactory.createClass(nextJavaPath);
							Method method = null;
							//2、method调用配置
							method = clazz.getDeclaredMethod(nextJavaFun,String.class,String.class,String.class,String.class);
							//问题：反射创建对象bean注入为空
							//Object object= clazz.newInstance();
							ApplicationContext applicationContext = SpringContextUtil.getApplicationContext();
							EntBatchJobExecute entBatchJobExecute = applicationContext.getBean(EntBatchJobExecute.class);
							method.invoke(entBatchJobExecute,nextBatchJob.getJobName(),br_no,tx_date,type);
						}
					}
					return job_name+"没有可生成的报文";
				}
			}else{
				sum = dbLaunchService.queryCount(job_name+"_getMaxPageNumber",map);
			}
			//格式化报文数量字段（补齐7位）
			sum= CommonUtils.formatCount(sum,7);

			//上报机构相关信息
			SubmitOrgInfo submitOrgInfo = dbLaunchService.querySubmitOrgInfo("SubmitOrg_Info_selectInfo");
			String orgCode = submitOrgInfo.getOrgCode();
			String version = submitOrgInfo.getCriVersion();
			//上报报文名组装
			String fileName = orgCode + currenDate + batchJob.getInfrecType() + "0" + dbLaunchService.getSerialNo("S_MSG_SERIALNO_getSerialNo", orgCode, currenDate, batchJob.getInfrecType()) + "0";
			//上报报文头组装
			String fileHeader = "A050" + batchJob.getInfrecType() + version + (("110".equals(batchJob.getInfrecType())||"310".equals(batchJob.getInfrecType())) ? "10":"  ") + orgCode + currentTime + "0";
			//报文生成的路径
			String filePath = dbLaunchService.getPath("S_PATH_INFO_getPath", "MESSAGEINFO_ENT_PATH")+currenDate+"/";
			String maxSum = dbLaunchService.getPath("S_PATH_INFO_getPath", "MESSAGEINFO_MAXSUM");
			String maxGridSize = dbLaunchService.getPath("S_PATH_INFO_getPath", "MESSAGEINFO_MAXGRIDSIZE");
			String gridSize = dbLaunchService.getPath("S_PATH_INFO_getPath", "MESSAGEINFO_GRIDSIZE");
			String pageNumber = dbLaunchService.getPath("S_PATH_INFO_getPath", "MESSAGEINFO_PAGENUMBER");
			//Job job = (Job) context.getBean(job_name);
			ApplicationContext applicationContext = SpringContextUtil.getApplicationContext();
			Job job = (Job) applicationContext.getBean(job_name);

			JobExecution run =
					jobLauncher.run(job, new JobParametersBuilder()
				.addString("jobName", job.getName())
				.addString("sum", sum)
				//每个报文文件最大值
				.addString("maxSum", maxSum)
				//线程数量
				.addString("gridSize", gridSize)
				//最大线程数量
				.addString("maxGridSize", maxGridSize)
				//分页大小
				.addString("pageNumber", pageNumber)
				.addString("tx_date", tx_date)
				.addString("br_no", br_no)
				.addString("queryId",job_name+"_selectAllInfo")

				.addString("filePath", filePath)
				.addString("fileName", fileName)
				.addString("fileHeader", fileHeader)
				.addString("type", type)//1：生成报文 2：校验
			    .toJobParameters());
			} catch (Exception e) {
				EntJobExecutionListener.JOB_MAP.put(job_name,0);
				/**start更新批量执行情况信息表*/
				BatchExecuteInfo batchExecuteInfo = new BatchExecuteInfo();
				batchExecuteInfo.setJobId(job_name);
				batchExecuteInfo.setExecuteSts("2");//执行失败
				batchExecuteInfo.setExecuteMsg("报文生成失败");
				batchExecuteInfo.setEndTime(UpdateDate.getDateFormat("yyyy-MM-dd HH:mm:ss"));
				messageInfoService.updateExecuteInfo("MessageInfo_updateExecuteInfo",batchExecuteInfo);
				/**end更新批量执行情况信息表*/
				e.printStackTrace();
				return job_name+"出现异常！";
			}
		return job_name+"调度成功！";
	}
}