/**
 * 
 */
package com.dhcc.xml.entity;

/**  
  * Title: BatchExecuteInfo<br/>  
  * Description: 执行情况信息表<br/>  
  * @author ChenJingYuan  
  * @date 2020-4-24  
  */  
public class BatchExecuteInfo {
	private String id;
	private String batchDate;
	private String jobId;
	private String stepId;
	private String stepDesc;
	private String startTime;
	private String endTime;
	private String sumTime;
	private String executeSts;
	private String executeMsg;
	public BatchExecuteInfo() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBatchDate() {
		return batchDate;
	}
	public void setBatchDate(String batchDate) {
		this.batchDate = batchDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getStepId() {
		return stepId;
	}
	public void setStepId(String stepId) {
		this.stepId = stepId;
	}
	public String getStepDesc() {
		return stepDesc;
	}
	public void setStepDesc(String stepDesc) {
		this.stepDesc = stepDesc;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getSumTime() {
		return sumTime;
	}
	public void setSumTime(String sumTime) {
		this.sumTime = sumTime;
	}
	public String getExecuteSts() {
		return executeSts;
	}
	public void setExecuteSts(String executeSts) {
		this.executeSts = executeSts;
	}
	public String getExecuteMsg() {
		return executeMsg;
	}
	public void setExecuteMsg(String executeMsg) {
		this.executeMsg = executeMsg;
	}
}

