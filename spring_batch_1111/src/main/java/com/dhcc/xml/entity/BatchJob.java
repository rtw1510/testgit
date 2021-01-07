/**
 * 
 */
package com.dhcc.xml.entity;

/**  
  * Title: BatchJob<br/>  
  * Description: 报文生成JOB配置表<br/>  
  * @author ChenJingYuan  
  * @date 2020-4-24  
  */  
public class BatchJob {
	private String id;
	private String jobName;
	private String jobLev;
	private String jobDesc;
	private String jobFlows;
	private String nextJob;
	private String jobUpOne;
	private String jobUpTwo;
	private String jobSts;
	private String remarks;
	private String jobTimes;
	private String javaPath;
	private String javaFun;
	private String infrecType;
	public BatchJob() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobLev() {
		return jobLev;
	}
	public void setJobLev(String jobLev) {
		this.jobLev = jobLev;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public String getJobFlows() {
		return jobFlows;
	}
	public void setJobFlows(String jobFlows) {
		this.jobFlows = jobFlows;
	}
	public String getNextJob() {
		return nextJob;
	}
	public void setNextJob(String nextJob) {
		this.nextJob = nextJob;
	}
	public String getJobUpOne() {
		return jobUpOne;
	}
	public void setJobUpOne(String jobUpOne) {
		this.jobUpOne = jobUpOne;
	}
	public String getJobUpTwo() {
		return jobUpTwo;
	}
	public void setJobUpTwo(String jobUpTwo) {
		this.jobUpTwo = jobUpTwo;
	}
	public String getJobSts() {
		return jobSts;
	}
	public void setJobSts(String jobSts) {
		this.jobSts = jobSts;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getJobTimes() {
		return jobTimes;
	}
	public void setJobTimes(String jobTimes) {
		this.jobTimes = jobTimes;
	}
	public String getJavaPath() {
		return javaPath;
	}
	public void setJavaPath(String javaPath) {
		this.javaPath = javaPath;
	}
	public String getJavaFun() {
		return javaFun;
	}
	public void setJavaFun(String javaFun) {
		this.javaFun = javaFun;
	}
	public String getInfrecType() {
		return infrecType;
	}
	public void setInfrecType(String infrecType) {
		this.infrecType = infrecType;
	}
}

