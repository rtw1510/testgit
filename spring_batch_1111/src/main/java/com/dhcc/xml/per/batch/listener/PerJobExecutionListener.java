package com.dhcc.xml.per.batch.listener;

//import com.dhcc.client.collt.entity.VerifyResults;


import com.dhcc.client.collt.service.impl.ValidateCollectServiceImpl;
import com.dhcc.client.collt.entity.VerifyResults;
import com.dhcc.core.util.CommonUtils;
import com.dhcc.xml.per.batch.launch.PerBatchJobExecute;
import com.dhcc.xml.service.MessageInfoService;
import com.dhcc.xml.entity.BatchExecuteInfo;
import com.dhcc.xml.entity.BatchJob;
import com.dhcc.xml.entity.MessageInfo;
import com.dhcc.xml.util.*;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.JobParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class PerJobExecutionListener implements JobExecutionListener {
	
	public static Map<String,Integer> JOB_MAP = new HashMap<String,Integer>();
	/** Job名称 */  
	private String jobName;
	@Autowired
	private MessageInfoService messageInfoService;

	
	public void beforeJob(JobExecution jobExecution) {
		jobName=jobExecution.getJobInstance().getJobName();
		JobParameters jobParameters=jobExecution.getJobParameters();
		String type = jobParameters.getString("type");
		//一个记录类型的开始时间
		if(PerJobExecutionListener.JOB_MAP.get(jobName)==null|| PerJobExecutionListener.JOB_MAP.get(jobName)==0){
			PerJobExecutionListener.JOB_MAP.put(jobName,0);
			/**start插入批量执行情况信息表*/
			BatchJob batchJob = new BatchJob();
			batchJob.setJobName(jobName);
			batchJob = messageInfoService.getBatchJob("MessageInfo_getBatchJob", batchJob);
			BatchExecuteInfo batchExecuteInfo = new BatchExecuteInfo();
			batchExecuteInfo.setJobId(jobName);
			batchExecuteInfo.setStepId(jobName);
			batchExecuteInfo.setStepDesc(batchJob.getJobDesc());
			batchExecuteInfo.setExecuteSts("3");
			batchExecuteInfo.setStartTime(UpdateDate.getDateFormat("yyyy-MM-dd HH:mm:ss"));
			messageInfoService.insertExecuteInfo("MessageInfo_insertExecuteInfo",batchExecuteInfo);
			/**end插入批量执行情况信息表*/
		}
	}
	
	public void afterJob(JobExecution jobExecution) {
		JobParameters jobParameters=jobExecution.getJobParameters();
		String type = jobParameters.getString("type");
		jobName = jobExecution.getJobInstance().getJobName();//执行JOB的名称
		if("1".equals(type)){//生成报文
			if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
				try {
					String tx_date = jobParameters.getString("tx_date");
					String br_no = jobParameters.getString("br_no");
					String filePath = jobParameters.getString("filePath");
					String fileName = jobParameters.getString("fileName");
					String infrectype = fileName.substring(22, 25);
					/**获取要生成的报文头(开始)*/
					int sum = Integer.parseInt(jobExecution.getJobParameters().getString("sum"));
					int maxSum = Integer.parseInt(jobExecution.getJobParameters().getString("maxSum"));
					int jobSum = 0;//当前job需要遍历的次数
					int formPageNumber = 0;//当前job生成报文的开始坐标
					int toPageNumber = 0;//当前job生成报文的结束坐标
					if(sum/maxSum==0){
						formPageNumber = 1;
						toPageNumber = sum;
					}else{
						if (sum % maxSum > 0) {//计算生成几个Job来生成当前报文
							jobSum = sum / maxSum + 1;
						} else {
							jobSum = sum / maxSum;
						}
						formPageNumber = (jobSum - PerJobExecutionListener.JOB_MAP.get(jobName)) * maxSum + 1;
						if(PerJobExecutionListener.JOB_MAP.get(jobName)==1){//最后一次执行该Job
							toPageNumber = sum;
						}else{
							toPageNumber = (jobSum - PerJobExecutionListener.JOB_MAP.get(jobName) + 1) * maxSum;
						}
					}
					
					//执行成功当前Job-1
					PerJobExecutionListener.JOB_MAP.put(jobName, PerJobExecutionListener.JOB_MAP.get(jobName)-1);
					if(PerJobExecutionListener.JOB_MAP.get(jobName)>0){//还需要执行当前Job
						sum = maxSum;//当前执行Job的总条数
					}else {//最后一次执行job计算出最后一次执行的总条数
						if(sum % maxSum==0){
							sum = maxSum;//当前执行Jobs的总条数
						}else{
							sum = sum % maxSum;//当前执行Jobs的总条数
						}
					}
					String count = CommonUtils.formatCount(sum+"",7);
					String fileHeader = jobExecution.getJobParameters().getString("fileHeader") + count + "\r\n";
					/**获取要生成的报文头(结束)*/
					
					/**报文临时文件追加(开始)*/
					//String newPath = filePath+fileName+".txt";双斜杠不可用！！
					String newPath = "d:\\test\\"+fileName+".txt";
					for(int i=1;;i++){
						String oldPath="d:\\test\\"+fileName+"-"+i+".txt";
			            File file = new File(oldPath);
			            if (!file.exists()) {//报文文件不存在退出
			            	break;
			            }
						FileAdder.writeFile(oldPath, newPath,fileHeader);
					}
					/**报文临时文件追加(结束)*/
					MessageInfo messageInfo = new MessageInfo();
					/**生成报文加压加密(开始)*/
					ValidateCollectServiceImpl validateCollect = new ValidateCollectServiceImpl();
					VerifyResults verifyResult= validateCollect.Verify("d:\\test\\", newPath);
					if("SUCCESS".equals(verifyResult.getSm4EncStatus())&&verifyResult.getSm4EncErrorMsg()==null){
						messageInfo.setGen_sts("3");
					}else{
						messageInfo.setGen_sts("4");
					}
					/**生成报文加压加密(结束)*/
					messageInfo.setInfrectype(infrectype);
					messageInfo.setGen_file_name(fileName);
					messageInfo.setGen_file_path(filePath);
					messageInfo.setGen_num(sum+"");
					messageInfo.setGen_date(UpdateDate.getDateFormat("yyyyMMdd"));
					messageInfo.setGen_oprr("");
					messageInfo.setGen_brno(br_no);
					messageInfo.setGen_download_flag("0");
					messageInfo.setTx_date(tx_date);
					messageInfo.setFile_type("1");//本监听只用于个人报文生成监听
					messageInfo.setJob_name(jobName);
					messageInfoService.insertMessageInfo("MessageInfo_insertMessageInfo",messageInfo);
					/**start根据jobName获取job相关配置信息*/
					BatchJob batchJob = new BatchJob();
					batchJob.setJobName(jobName);
					batchJob=messageInfoService.getBatchJob("MessageInfo_getBatchJob",batchJob);
					/**end根据jobName获取job相关配置信息*/
					Map<String,String> map = new HashMap<String,String>();
					String[] tables = batchJob.getRemarks().split(",");
					String[] fields = batchJob.getJobFlows().split(",");
					String mainTableName = tables[0];//主表的名称
					map.put("tableName", mainTableName);
					map.put("infrectype", infrectype);
					map.put("fileName", fileName);
					map.put("formPageNumber", formPageNumber+"");
					map.put("toPageNumber", toPageNumber+"");
					messageInfoService.updateFileName("MessageInfo_updateFileName",map);//更新主表生成报文后的的信息
					
					/**start更新子表的相关信息*/
					int i = 0;
					for(String table:tables){//更新子表的报文名和上报状态
						if(!table.equals(mainTableName)){
							StringBuffer sbf = new StringBuffer();
							sbf.append("UPDATE " + table + " T1 SET FILENAME = '" + fileName + "',RPT_DATE=FUN_GETSYSDATE(),RPT_TYPE='2' " +
								"WHERE EXISTS (SELECT 1 FROM "+mainTableName+" T2 WHERE T1.MAIN_ID = T2.RECORD_ID AND T2.CHECK_STS='1' AND T2." + fields[i] + "='1')");
							map.put("updateSql", sbf.toString());
							messageInfoService.updateRptType("MessageInfo_updateRptType",map);//更新子表状态和每个段FLAG标志
						}
						i++;
					}
					/**end更新子表的相关信息*/
					
					if(batchJob!=null&& PerJobExecutionListener.JOB_MAP.get(jobName)>0){//还需要执行当前Job
						System.out.println("============="+ PerJobExecutionListener.JOB_MAP.get(jobName)+"=============");
						String javaPath = batchJob.getJavaPath();
						String javaFun = batchJob.getJavaFun();
						//1、反射入口创建
						Class<?> clazz = ConfiguratorFactory.createClass(javaPath);
						Method method = null;
						//2、method调用配置
						method = clazz.getDeclaredMethod(javaFun,String.class,String.class,String.class,String.class);
						method.invoke(clazz.newInstance(),jobName,br_no,tx_date,type); 
					}else{//最后一次运行该Job更新对应数据表上报状态
						String flows = batchJob.getJobFlows();//获取待更新字段名
						StringBuffer strBuf =  new StringBuffer();
						if(flows!=null&&!"".equals(flows)){
							String[] arr_flow=flows.split(",");
							strBuf.append("UPDATE "+ mainTableName + " T1 SET ");
							for(String str:arr_flow){
								strBuf.append(str + " = (CASE WHEN T1." + str + " = '1' THEN '2' ELSE T1." + str + " END)," );
							}
							strBuf.deleteCharAt(strBuf.length()-1);
							strBuf.append(" WHERE T1.RPT_TYPE = '1' AND T1.CHECK_STS = '1'");
						}else{
							strBuf.append("UPDATE "+ mainTableName + " T1 SET T1.RPT_TYPE = '2' WHERE T1.RPT_TYPE = '1' AND T1.CHECK_STS = '1'");
						}
						map.put("updateSql", strBuf.toString());
//						messageInfoBo.updateRptType("MessageInfo.updateRptType", map);//更新主表上报状态和每个段FLAG标志
						/**start更新批量执行情况信息表*/
						BatchExecuteInfo batchExecuteInfo = new BatchExecuteInfo();
						batchExecuteInfo.setJobId(jobName);
						batchExecuteInfo.setExecuteSts("1");//执行成功
						batchExecuteInfo.setExecuteMsg("报文生成成功");
						batchExecuteInfo.setEndTime(UpdateDate.getDateFormat("yyyy-MM-dd HH:mm:ss"));
						messageInfoService.updateExecuteInfo("MessageInfo_updateExecuteInfo",batchExecuteInfo);
						/**end更新批量执行情况信息表*/
						if(batchJob!=null&&batchJob.getNextJob().length()>1){
							BatchJob nextBatchJob = new BatchJob();
							nextBatchJob.setJobName(batchJob.getNextJob());
							nextBatchJob = messageInfoService.getBatchJob("MessageInfo_getBatchJob",nextBatchJob);
							String nextJavaPath = nextBatchJob.getJavaPath();
							String nextJavaFun = nextBatchJob.getJavaFun();
							//1、反射入口创建
							Class<?> clazz = ConfiguratorFactory.createClass(nextJavaPath);
							Method method = null;
							//2、method调用配置

							ApplicationContext applicationContext = SpringContextUtil.getApplicationContext();
							PerBatchJobExecute perBatchJobExecute = applicationContext.getBean(PerBatchJobExecute.class);

							method = clazz.getDeclaredMethod(nextJavaFun,String.class,String.class,String.class,String.class);
							method.invoke(perBatchJobExecute,nextBatchJob.getJobName(),br_no,tx_date,type);
						}
					}
					String sql="";
					List<String> sqlList=new ArrayList<String>();
					for(String table:tables){
						sql="INSERT INTO "+table.replace("PB_", "PH_")+" SELECT * FROM "+table+ " WHERE FILENAME = '"+fileName+"'";
						if(!sqlList.contains(sql)) {
							sqlList.add(sql);
						}
					}
					/**start历史数据迁移*/
					if(sqlList!=null&&sqlList.size()>0){
						DBUtils.execute_sql(sqlList);
					}
					/**end历史数据迁移*/
				} catch (Exception e1) {//出现异常也要把JOB_MAP当前值至为0
					PerJobExecutionListener.JOB_MAP.put(jobName,0);//Job执行出现错误停止当前Job报文生成功能
					/**start更新批量执行情况信息表*/
					BatchExecuteInfo batchExecuteInfo = new BatchExecuteInfo();
					batchExecuteInfo.setJobId(jobName);
					batchExecuteInfo.setExecuteSts("2");//执行失败
					batchExecuteInfo.setExecuteMsg("报文生成失败");
					batchExecuteInfo.setEndTime(UpdateDate.getDateFormat("yyyy-MM-dd HH:mm:ss"));
					messageInfoService.updateExecuteInfo("MessageInfo_updateExecuteInfo",batchExecuteInfo);
					/**end更新批量执行情况信息表*/
					e1.printStackTrace();
				}
			} else if (jobExecution.getStatus() == BatchStatus.FAILED) {
				PerJobExecutionListener.JOB_MAP.put(jobName,0);//Job执行出现错误停止当前Job报文生成功能
				/**start更新批量执行情况信息表*/
				BatchExecuteInfo batchExecuteInfo = new BatchExecuteInfo();
				batchExecuteInfo.setJobId(jobName);
				batchExecuteInfo.setExecuteSts("2");//执行失败
				batchExecuteInfo.setExecuteMsg("报文生成失败");
				batchExecuteInfo.setEndTime(UpdateDate.getDateFormat("yyyy-MM-dd HH:mm:ss"));
				messageInfoService.updateExecuteInfo("MessageInfo_updateExecuteInfo",batchExecuteInfo);
				/**end更新批量执行情况信息表*/
			}
		}else if("2".equals(type)){//校验
			if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
				try {
					//执行成功当前Job-1
					PerJobExecutionListener.JOB_MAP.put(jobName, PerJobExecutionListener.JOB_MAP.get(jobName)-1);
					String tx_date = jobParameters.getString("tx_date");
					String br_no = jobParameters.getString("br_no");
					/**start根据jobName获取job相关配置信息*/
					BatchJob batchJob = new BatchJob();
					batchJob.setJobName(jobName);
					batchJob=messageInfoService.getBatchJob("MessageInfo_getBatchJob",batchJob);
					/**end根据jobName获取job相关配置信息*/
					String[] tables = batchJob.getRemarks().split(",");
					String mainTableName = tables[0];//主表的名称
					
					/**start更新批量执行情况信息表*/
					BatchExecuteInfo batchExecuteInfo = new BatchExecuteInfo();
					batchExecuteInfo.setJobId(jobName);
					batchExecuteInfo.setExecuteSts("1");//执行成功
					batchExecuteInfo.setExecuteMsg("校验完成");
					batchExecuteInfo.setEndTime(UpdateDate.getDateFormat("yyyy-MM-dd HH:mm:ss"));
					messageInfoService.updateExecuteInfo("MessageInfo_updateExecuteInfo",batchExecuteInfo);
					/**end更新批量执行情况信息表*/
					
					if(batchJob!=null&& PerJobExecutionListener.JOB_MAP.get(jobName)>0){//还需要执行当前Job
						System.out.println("============="+ PerJobExecutionListener.JOB_MAP.get(jobName)+"=============");
						String javaPath = batchJob.getJavaPath();
						String javaFun = batchJob.getJavaFun();
						//1、反射入口创建
						Class<?> clazz = ConfiguratorFactory.createClass(javaPath);
						Method method = null;
						//2、method调用配置
						method = clazz.getDeclaredMethod(javaFun,String.class,String.class,String.class,String.class);
						method.invoke(clazz.newInstance(),jobName,br_no,tx_date,type); 
					}else{//最后一次运行该Job更新对应数据表上报状态
						//回刷错误表
						String updateErrorTable=messageInfoService.updateErrorTable("MessageInfo_updateErrorTable",mainTableName);
						//修改校验状态
						String updateCheckSts=messageInfoService.updateCheckSts("MessageInfo_updateCheckSts",mainTableName);
						
						if(batchJob!=null&&batchJob.getNextJob().length()>1){
							BatchJob nextBatchJob = new BatchJob();
							nextBatchJob.setJobName(batchJob.getNextJob());
							nextBatchJob = messageInfoService.getBatchJob("MessageInfo_getBatchJob",nextBatchJob);
							String nextJavaPath = nextBatchJob.getJavaPath();
							String nextJavaFun = nextBatchJob.getJavaFun();
							//1、反射入口创建
							Class<?> clazz = ConfiguratorFactory.createClass(nextJavaPath);
							Method method = null;
							//2、method调用配置
							method = clazz.getDeclaredMethod(nextJavaFun,String.class,String.class,String.class,String.class);
							method.invoke(clazz.newInstance(),nextBatchJob.getJobName(),br_no,tx_date,type); 
						}
					}
				} catch (Exception e1) {//出现异常也要把JOB_MAP当前值至为0
					PerJobExecutionListener.JOB_MAP.put(jobName,0);//Job执行出现错误停止当前Job报文生成功能
					e1.printStackTrace();
				}
			} else if (jobExecution.getStatus() == BatchStatus.FAILED) {
				PerJobExecutionListener.JOB_MAP.put(jobName,0);//Job执行出现错误停止当前Job报文生成功能
			}
		}else if("3".equals(type)){//生成报文
			if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
				try {

					String tx_date = jobParameters.getString("tx_date");
					String br_no = jobParameters.getString("br_no");
					String filePath = jobParameters.getString("filePath");
					String fileName = jobParameters.getString("fileName");
					String infrectype = fileName.substring(22, 25);
					/**获取要生成的报文头(开始)*/
					int sum = Integer.parseInt(jobExecution.getJobParameters().getString("sum"));
					int maxSum = Integer.parseInt(jobExecution.getJobParameters().getString("maxSum"));
					int jobSum = 0;//当前job需要遍历的次数
					int formPageNumber = 0;//当前job生成报文的开始坐标
					int toPageNumber = 0;//当前job生成报文的结束坐标
					if(sum/maxSum==0){
						formPageNumber = 1;
						toPageNumber = sum;
					}else{
						if (sum % maxSum > 0) {//计算生成几个Job来生成当前报文
							jobSum = sum / maxSum + 1;
						} else {
							jobSum = sum / maxSum;
						}
						formPageNumber = (PerJobExecutionListener.JOB_MAP.get(jobName)) * maxSum + 1;
						if(PerJobExecutionListener.JOB_MAP.get(jobName)==1){//最后一次执行该Job
							toPageNumber = sum;
						}else{
							toPageNumber = (jobSum - PerJobExecutionListener.JOB_MAP.get(jobName) + 1) * maxSum;
						}
					}

					//执行成功当前Job-1
					PerJobExecutionListener.JOB_MAP.put(jobName, PerJobExecutionListener.JOB_MAP.get(jobName)-1);
					if(PerJobExecutionListener.JOB_MAP.get(jobName)>0){//还需要执行当前Job
						sum = maxSum;//当前执行Job的总条数
					}else {//最后一次执行job计算出最后一次执行的总条数
						if(sum % maxSum==0){
							sum = maxSum;//当前执行Jobs的总条数
						}else{
							sum = sum % maxSum;//当前执行Jobs的总条数
						}
					}

					int countInt = 0;
					for(int i=1;;i++){
						String oldPath=filePath+fileName+"-"+i+".txt";
						File file = new File(oldPath);
						if (!file.exists()) {//报文文件不存在退出
							break;
						}
						int t = this.getFileLineNum(oldPath)-1;
						countInt+=t;

					}
					String count = CommonUtils.formatCount(countInt+"",7);
					String fileHeader = jobExecution.getJobParameters().getString("fileHeader") + count + "\r\n";
					/**获取要生成的报文头(结束)*/

					/**报文临时文件追加(开始)*/
					String newPath = filePath+fileName+".txt";
					for(int i=1;;i++){
						String oldPath=filePath+fileName+"-"+i+".txt";
						File file = new File(oldPath);
						if (!file.exists()) {//报文文件不存在退出
							break;
						}
						FileAdder.writeFile(oldPath, newPath,fileHeader);
					}
					/**报文临时文件追加(结束)*/
					MessageInfo messageInfo = new MessageInfo();
					/**生成报文加压加密(开始)*/
					/*ValidateCollectBoImpl validateCollect = new ValidateCollectBoImpl();
					VerifyResults verifyResult= validateCollect.Verify(filePath, newPath);
					if("SUCCESS".equals(verifyResult.getSm4EncStatus())&&verifyResult.getSm4EncErrorMsg()==null){
						messageInfo.setGen_sts("3");
					}else{
						messageInfo.setGen_sts("4");
					}*/
					/**生成报文加压加密(结束)*/
					messageInfo.setInfrectype(infrectype);
					messageInfo.setGen_file_name(fileName);
					messageInfo.setGen_file_path(filePath);
					messageInfo.setGen_num(sum+"");
					messageInfo.setGen_date(UpdateDate.getDateFormat("yyyyMMdd"));
					messageInfo.setGen_oprr("");
					messageInfo.setGen_brno(br_no);
					messageInfo.setGen_download_flag("0");
					messageInfo.setTx_date(tx_date);
					messageInfo.setFile_type("1");//本监听只用于个人报文生成监听
					messageInfo.setJob_name(jobName);
					messageInfoService.insertMessageInfo("MessageInfo_insertMessageInfo",messageInfo);
					/**start根据jobName获取job相关配置信息*/
					BatchJob batchJob = new BatchJob();
					batchJob.setJobName(jobName);
					batchJob=messageInfoService.getBatchJob("MessageInfo_getBatchJob", batchJob);
					/**end根据jobName获取job相关配置信息*/
					Map<String,String> map = new HashMap<String,String>();
					String[] tables = batchJob.getRemarks().split(",");
					String[] fields = batchJob.getJobFlows().split(",");
					String mainTableName = tables[0];//主表的名称
					map.put("tableName", mainTableName);
					map.put("infrectype", infrectype);
					map.put("fileName", fileName);
					map.put("formPageNumber", formPageNumber+"");
					map.put("toPageNumber", toPageNumber+"");
					messageInfoService.updateFileName("MessageInfo_updateFileName",map);//更新主表生成报文后的的信息

					/**start更新子表的相关信息*/
					int i = 0;
					for(String table:tables){//更新子表的报文名和上报状态
						if(!table.equals(mainTableName)){
							StringBuffer sbf = new StringBuffer();
							sbf.append("UPDATE " + table + " T1 SET FILENAME = '" + fileName + "',RPT_DATE=FUN_GETSYSDATE(),RPT_TYPE = '2' " +
									"WHERE EXISTS (SELECT 1 FROM "+mainTableName+" T2 WHERE T1.MAIN_ID = T2.RECORD_ID AND T2.RPT_TYPE = '1' AND T2." + fields[i] + "='1')");
							map.put("updateSql", sbf.toString());
							messageInfoService.updateRptType("MessageInfo_updateRptType",map);//更新子表状态和每个段FLAG标志
						}
						i++;
					}
					/**end更新子表的相关信息*/

					if(batchJob!=null&& PerJobExecutionListener.JOB_MAP.get(jobName)>0){//还需要执行当前Job
						System.out.println("============="+ PerJobExecutionListener.JOB_MAP.get(jobName)+"=============");
						String javaPath = batchJob.getJavaPath();
						String javaFun = batchJob.getJavaFun();
						//1、反射入口创建
						Class<?> clazz = ConfiguratorFactory.createClass(javaPath);
						Method method = null;
						//2、method调用配置
						method = clazz.getDeclaredMethod(javaFun,String.class,String.class,String.class,String.class);
						method.invoke(clazz.newInstance(),jobName,br_no,tx_date,type);
					}else{//最后一次运行该Job更新对应数据表上报状态
						String flows = batchJob.getJobFlows();//获取待更新字段名
						StringBuffer strBuf =  new StringBuffer();
						if(flows!=null&&!"".equals(flows)){
							String[] arr_flow=flows.split(",");
							strBuf.append("UPDATE "+ mainTableName + " T1 SET ");
							for(String str:arr_flow){
								strBuf.append(str + " = (CASE WHEN T1." + str + " = '1' THEN '2' ELSE T1." + str + " END)," );
							}
							strBuf.deleteCharAt(strBuf.length()-1);
							strBuf.append(" WHERE T1.RPT_TYPE = '1' AND T1.CHECK_STS = '1'");
						}else{
							strBuf.append("UPDATE "+ mainTableName + " T1 SET T1.RPT_TYPE = '2' WHERE T1.RPT_TYPE = '1' AND T1.CHECK_STS = '1'");
						}
						map.put("updateSql", strBuf.toString());
//						messageInfoBo.updateRptType("MessageInfo.updateRptType", map);//更新主表上报状态和每个段FLAG标志
						/**start更新批量执行情况信息表*/
						BatchExecuteInfo batchExecuteInfo = new BatchExecuteInfo();
						batchExecuteInfo.setJobId(jobName);
						batchExecuteInfo.setExecuteSts("1");//执行成功
						batchExecuteInfo.setExecuteMsg("报文生成成功");
						batchExecuteInfo.setEndTime(UpdateDate.getDateFormat("yyyy-MM-dd HH:mm:ss"));
						messageInfoService.updateExecuteInfo("MessageInfo_updateExecuteInfo",batchExecuteInfo);
						/**end更新批量执行情况信息表*/
						if(batchJob!=null&&batchJob.getNextJob().length()>1){
							BatchJob nextBatchJob = new BatchJob();
							nextBatchJob.setJobName(batchJob.getNextJob());
							nextBatchJob = messageInfoService.getBatchJob("MessageInfo_getBatchJob",nextBatchJob);
							String nextJavaPath = nextBatchJob.getJavaPath();
							String nextJavaFun = nextBatchJob.getJavaFun();
							//1、反射入口创建
							Class<?> clazz = ConfiguratorFactory.createClass(nextJavaPath);
							Method method = null;
							//2、method调用配置
							method = clazz.getDeclaredMethod(nextJavaFun,String.class,String.class,String.class,String.class);
							method.invoke(clazz.newInstance(),nextBatchJob.getJobName(),br_no,tx_date,type);
						}
					}
					/**start历史数据迁移*/
					String sql="";
					List<String> sqlList=new ArrayList<String>();
					for(String table:tables){
						sql="INSERT INTO "+table.replace("PB_", "PH_")+" SELECT * FROM "+table+ " WHERE FILENAME = '"+fileName+"'";
						if(!sqlList.contains(sql)) {
							sqlList.add(sql);
						}
					}
					if(sqlList!=null&&sqlList.size()>0){
						DBUtils.execute_sql(sqlList);
					}
					/**end历史数据迁移*/
				} catch (Exception e1) {//出现异常也要把JOB_MAP当前值至为0
					PerJobExecutionListener.JOB_MAP.put(jobName,0);//Job执行出现错误停止当前Job报文生成功能
					/**start更新批量执行情况信息表*/
					BatchExecuteInfo batchExecuteInfo = new BatchExecuteInfo();
					batchExecuteInfo.setJobId(jobName);
					batchExecuteInfo.setExecuteSts("2");//执行失败
					batchExecuteInfo.setExecuteMsg("报文生成失败");
					batchExecuteInfo.setEndTime(UpdateDate.getDateFormat("yyyy-MM-dd HH:mm:ss"));
					messageInfoService.updateExecuteInfo("MessageInfo_updateExecuteInfo",batchExecuteInfo);
					/**end更新批量执行情况信息表*/
					e1.printStackTrace();
				}
			} else if (jobExecution.getStatus() == BatchStatus.FAILED) {
				PerJobExecutionListener.JOB_MAP.put(jobName,0);//Job执行出现错误停止当前Job报文生成功能
				/**start更新批量执行情况信息表*/
				BatchExecuteInfo batchExecuteInfo = new BatchExecuteInfo();
				batchExecuteInfo.setJobId(jobName);
				batchExecuteInfo.setExecuteSts("2");//执行失败
				batchExecuteInfo.setExecuteMsg("报文生成失败");
				batchExecuteInfo.setEndTime(UpdateDate.getDateFormat("yyyy-MM-dd HH:mm:ss"));
				messageInfoService.updateExecuteInfo("MessageInfo_updateExecuteInfo",batchExecuteInfo);
				/**end更新批量执行情况信息表*/
			}
		}
		
	}

	public  int getFileLineNum(String filePath) {
		try {
			LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(filePath));
			lineNumberReader.skip(Long.MAX_VALUE);
			int lineNumber = lineNumberReader.getLineNumber();
			return lineNumber + 1;//实际上是读取换行符数量 , 所以需要+1
		} catch (IOException e) {
			return -1;
		}
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
}
