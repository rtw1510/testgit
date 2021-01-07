package com.dhcc.xml.parse.batch.listener;

import com.dhcc.xml.parse.batch.processor.BatchItemProcessor;
import com.dhcc.xml.parse.entity.FbMessageInfo;
import com.dhcc.xml.parse.service.FbMessageInfoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Title: JobListener<br/>
 * Description:Job执行用时和执行状态监听 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-5-12
 */
@Component("parseJobListener")
public class ParseJobListener implements JobExecutionListener {
	private static final Log logger = LogFactory.getLog(BatchItemProcessor.class);
	/** Spring框架提供连接、操作数据库工具类 */  
	private JdbcTemplate jdbcTemplate;
	/** Job名称 */  
	private String jobName;
	/** Job开始时间 */  
	private long startTime;
	/** Job停止时间 */  
	private long endTime;
	/** Step运行消耗的总时间 */  
	private long totalTime;
	/**执行Step的状态描述1-执行成功，2-执行失败，3-正在执行*/  
	private String excuteSts;
	/**执行Step状态信息描述 */  
	private String excuteMsg;
	@Autowired
	private FbMessageInfoService fbMessageInfoService;
	private FbMessageInfo fbMessageInfo;
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("当前执行的job start........." + jobName);

	}
	public void afterJob(JobExecution jobExecution) {
		System.out.println("当前执行的job END........." + jobName);
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	public long getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(long totalTime) {
		this.totalTime = totalTime;
	}
	public String getExcuteSts() {
		return excuteSts;
	}
	public void setExcuteSts(String excuteSts) {
		this.excuteSts = excuteSts;
	}
	public String getExcuteMsg() {
		return excuteMsg;
	}
	public void setExcuteMsg(String excuteMsg) {
		this.excuteMsg = excuteMsg;
	}
	public FbMessageInfo getFbMessageInfo() {
		return fbMessageInfo;
	}
	public void setFbMessageInfo(FbMessageInfo fbMessageInfo) {
		this.fbMessageInfo = fbMessageInfo;
	}
	public FbMessageInfoService getFbMessageInfoService() {
		return fbMessageInfoService;
	}
	public void setFbMessageInfoService(FbMessageInfoService fbMessageInfoService) {
		this.fbMessageInfoService = fbMessageInfoService;
	}
}
