package com.dhcc.xml.parse.entity;

/**  
  * Title: S_MSG_INFO<br/>  
  * Description: 报文信息表映射类<br/>  
  * @author ChenJingYuan  
  * @date 2018-8-1  
  */  
public class S_MSG_INFO {
	/**
	 *ID编号
	 */  
	private String id;
	/**
	 *信息记录类型
	 */  
	private String InfRecType;
	/**
	 *数据报送文件名
	 */  
	private String gen_file_name;
	/**
	 *报送条数
	 */  
	private String gen_num;
	/**
	 *报文生成时间
	 */  
	private String gen_time;
	/**
	 *上报情况(1-待上报，2-待反馈加载，3-已加载)
	 */  
	private String fb_file_name;
	/**
	 *上报条数
	 */  
	private String fb_time;
	/**
	 *成功加载条数（上报条数-错误反馈条数）
	 */  
	private String fb_succ_num;
	/**
	 *反馈错误条数
	 */  
	private String fb_err_num;
	
	public S_MSG_INFO() {
		super();
	}

	/**  
	 * 获取 id
	 * @return the id ID编号 
	 */
	public String getId() {
		return id;
	}

	/**  
	 * 设置 id  
	 * @param id ID编号  
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**  
	 * 获取 infRecType
	 * @return the infRecType 信息记录类型 
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**  
	 * 设置 infRecType  
	 * @param infRecType 信息记录类型  
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**  
	 * 获取 gen_file_name
	 * @return the gen_file_name 数据报送文件名 
	 */
	public String getGen_file_name() {
		return gen_file_name;
	}

	/**  
	 * 设置 gen_file_name  
	 * @param gen_file_name 数据报送文件名  
	 */
	public void setGen_file_name(String genFileName) {
		gen_file_name = genFileName;
	}

	/**  
	 * 获取 gen_num
	 * @return the gen_num 报送条数 
	 */
	public String getGen_num() {
		return gen_num;
	}

	/**  
	 * 设置 gen_num  
	 * @param gen_num 报送条数  
	 */
	public void setGen_num(String genNum) {
		gen_num = genNum;
	}

	/**  
	 * 获取 gen_time
	 * @return the gen_time 报文生成时间 
	 */
	public String getGen_time() {
		return gen_time;
	}

	/**  
	 * 设置 gen_time  
	 * @param gen_time 报文生成时间  
	 */
	public void setGen_time(String genTime) {
		gen_time = genTime;
	}

	/**  
	 * 获取 fb_file_name
	 * @return the fb_file_name 上报情况(1-待上报，2-待反馈加载，3-已加载) 
	 */
	public String getFb_file_name() {
		return fb_file_name;
	}

	/**  
	 * 设置 fb_file_name  
	 * @param fb_file_name 上报情况(1-待上报，2-待反馈加载，3-已加载)  
	 */
	public void setFb_file_name(String fbFileName) {
		fb_file_name = fbFileName;
	}

	/**  
	 * 获取 fb_time
	 * @return the fb_time 上报条数 
	 */
	public String getFb_time() {
		return fb_time;
	}

	/**  
	 * 设置 fb_time  
	 * @param fb_time 上报条数  
	 */
	public void setFb_time(String fbTime) {
		fb_time = fbTime;
	}

	/**  
	 * 获取 fb_succ_num
	 * @return the fb_succ_num 成功加载条数（上报条数-错误反馈条数） 
	 */
	public String getFb_succ_num() {
		return fb_succ_num;
	}

	/**  
	 * 设置 fb_succ_num  
	 * @param fb_succ_num 成功加载条数（上报条数-错误反馈条数）  
	 */
	public void setFb_succ_num(String fbSuccNum) {
		fb_succ_num = fbSuccNum;
	}

	/**  
	 * 获取 fb_err_num
	 * @return the fb_err_num 反馈错误条数 
	 */
	public String getFb_err_num() {
		return fb_err_num;
	}

	/**  
	 * 设置 fb_err_num  
	 * @param fb_err_num 反馈错误条数  
	 */
	public void setFb_err_num(String fbErrNum) {
		fb_err_num = fbErrNum;
	}
}
