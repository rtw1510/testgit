package com.dhcc.xml.parse.batch.listener;

import com.dhcc.xml.parse.entity.FbMessageInfo;
import com.dhcc.xml.parse.service.FbMessageInfoService;
import org.apache.log4j.Logger;
import org.springframework.batch.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: SimpleStepExecutionListener<br/>
 * Description:跑批Step监听用时和状态监听 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-5-12
 */
@Component("parseStepListener")
public class ParseStepListener implements StepExecutionListener {
	Logger logger = Logger.getLogger(ParseStepListener.class);
	private FbMessageInfo fbMessageInfo;
	@Autowired
	private FbMessageInfoService fbMessageInfoService;
	public void beforeStep(StepExecution stepExecution) {
		System.out.println("Step执行监听类。。。。。。。。。。。。。。beforeStep");
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		JobParameters JobParameters=stepExecution.getJobParameters();
		String infRecType = JobParameters.getString("infRecType");//信息记录类型
		String fileFullPath = JobParameters.getString("fileFullPath");//反馈文件全路径
		String fbFileName = JobParameters.getString("fileName");//反馈报文名称
		String genFileName = fbFileName.substring(0, 29)+"0";//已报送报文名称
		String fileType = JobParameters.getString("fileType");
		Map<String,String> map =new HashMap<String,String>();
		map.put("infRecType", infRecType);
		map.put("fbFileName", fbFileName.substring(0, 30));
		map.put("genFileName", genFileName);

		//Step解析反馈报文执行成功更新
		fbMessageInfo = new FbMessageInfo();
		if (stepExecution.getStatus() == BatchStatus.COMPLETED) {
			//修改源表上报状态
			String[] tableNames = fbMessageInfoService.getTableNames(map).split(",");
			String mainTableName = tableNames[0];
			for(String tableName : tableNames){
				map.put("tableName", tableName);
				if(tableName.equals(mainTableName)){//更新主表的数据信息状态
					//1、更新错误表不存在的原数据上报状态为3
					fbMessageInfoService.updateDataTableSucc("FbMessageInfo_updateDataMainTableSucc",map);
					//2、更新错误表存在的原数据上报状态为4
					fbMessageInfoService.updateDataTableFail("FbMessageInfo_updateDataMainTableFail",map);
					//3、根据原数据更新错误表的数据的相关关联信息
					fbMessageInfoService.updateErrorTable(map);
					//4、根据反馈码和反馈信息更新错误表的校验错误码
//					fbMessageInfoService.updateRuleCode(map);
					fbMessageInfo.setFb_file_sts("1");//反馈报文解析状态（1-成功）
				}else{
					//1、更新子表不存在的原数据上报状态为3
					fbMessageInfoService.updateDataTableSucc("FbMessageInfo_updateDataSubTableSucc",map);
					//2、更新错误表存在的原数据上报状态为4
					fbMessageInfoService.updateDataTableFail("FbMessageInfo_updateDataSubTableFail",map);
				}
			}
		}else{
			fbMessageInfo.setFb_file_sts("3");//反馈报文解析状态（3-失败）
		}
		fbMessageInfo.setFb_file_name(fbFileName.replace(".txt", ""));
		//5、更新反馈报文状态
		fbMessageInfoService.updateFbFileSts(fbMessageInfo);
		return stepExecution.getExitStatus();
	}

	public FbMessageInfo getFbMessageInfo() {
		return fbMessageInfo;
	}

	public void setFbMessageInfo(FbMessageInfo fbMessageInfo) {
		this.fbMessageInfo = fbMessageInfo;
	}
}
