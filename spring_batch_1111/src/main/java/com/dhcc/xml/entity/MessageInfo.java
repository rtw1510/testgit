package com.dhcc.xml.entity;

/**  
  * Title: MessageInfo<br/>  
  * Description:二代征信报文信息管理 <br/>  
  * @author ChenJingYuan  
  * @date 2018-8-16  
  */  
public class MessageInfo{
	/** ID编号 */  
	private String id;						          
	/** 信息记录类型  */  
	private String infrectype;        
	/** 数据报送文件名 */  
	private String gen_file_name;   
	/** 数据报送文件路径 */  
	private String gen_file_path; 
	/** 报送条数 */  
	private String gen_num;               
	/** 报文生成时间 */  
	private String gen_date;  
	/** 报文状态0-正在生成;1-生成成功；2-生成失败 ;3-校验、加压、加密成功;4-校验、加压、加密失败*/  
	private String gen_sts;
	/** 生成报文操作员 */  
	private String gen_oprr;
	/** 机构号 */  
	private String gen_brno;
	/** 下载标志：0-未下载，1-已下载 */  
	private String gen_download_flag; 
	/** 反馈报文加载日期 */  
	private String tx_date;
	/** 1-个人；2-企业 */  
	private String file_type;
	/** job名称*/  
	private String job_name;
	public MessageInfo() {
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
	 * 获取 infrectype
	 * @return the infrectype 信息记录类型 
	 */
	public String getInfrectype() {
		return infrectype;
	}
	/**  
	 * 设置 infrectype  
	 * @param infrectype 信息记录类型  
	 */
	public void setInfrectype(String infrectype) {
		this.infrectype = infrectype;
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
	public void setGen_file_name(String gen_file_name) {
		this.gen_file_name = gen_file_name;
	}
	/**  
	 * 获取 gen_file_path
	 * @return the gen_file_path 数据报送文件路径 
	 */
	public String getGen_file_path() {
		return gen_file_path;
	}
	/**  
	 * 设置 gen_file_path  
	 * @param gen_file_path 数据报送文件路径  
	 */
	public void setGen_file_path(String gen_file_path) {
		this.gen_file_path = gen_file_path;
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
	public void setGen_num(String gen_num) {
		this.gen_num = gen_num;
	}
	/**  
	 * 获取 gen_date
	 * @return the gen_date 报文生成时间 
	 */
	public String getGen_date() {
		return gen_date;
	}
	/**  
	 * 设置 gen_date  
	 * @param gen_date 报文生成时间  
	 */
	public void setGen_date(String gen_date) {
		this.gen_date = gen_date;
	}
	/**  
	 * 获取 gen_sts
	 * @return the gen_sts 报文状态0-正在生成；1-生成成功；2-生成失败 ;3-校验、加压、加密成功;4-校验、加压、加密失败
	 */
	public String getGen_sts() {
		return gen_sts;
	}
	/**  
	 * 设置 gen_sts  
	 * @param gen_sts 报文状态0-正在生成；1-生成成功；2-生成失败  ;3-校验、加压、加密成功;4-校验、加压、加密失败
	 */
	public void setGen_sts(String gen_sts) {
		this.gen_sts = gen_sts;
	}
	/**  
	 * 获取 gen_oprr
	 * @return the gen_oprr 生成报文操作员 
	 */
	public String getGen_oprr() {
		return gen_oprr;
	}
	/**  
	 * 设置 gen_oprr  
	 * @param gen_oprr 生成报文操作员  
	 */
	public void setGen_oprr(String gen_oprr) {
		this.gen_oprr = gen_oprr;
	}
	/**  
	 * 获取 gen_brno
	 * @return the gen_brno 机构号 
	 */
	public String getGen_brno() {
		return gen_brno;
	}
	/**  
	 * 设置 gen_brno  
	 * @param gen_brno 机构号  
	 */
	public void setGen_brno(String gen_brno) {
		this.gen_brno = gen_brno;
	}
	/**  
	 * 获取 gen_download_flag
	 * @return the gen_download_flag 下载标志：0-未下载，1-已下载 
	 */
	public String getGen_download_flag() {
		return gen_download_flag;
	}
	/**  
	 * 设置 gen_download_flag  
	 * @param gen_download_flag 下载标志：0-未下载，1-已下载  
	 */
	public void setGen_download_flag(String gen_download_flag) {
		this.gen_download_flag = gen_download_flag;
	}
	/**  
	 * 获取 tx_date
	 * @return the tx_date 反馈报文加载日期 
	 */
	public String getTx_date() {
		return tx_date;
	}
	/**  
	 * 设置 tx_date  
	 * @param tx_date 反馈报文加载日期  
	 */
	public void setTx_date(String tx_date) {
		this.tx_date = tx_date;
	}
	/**  
	 * 获取 file_type
	 * @return the file_type 1-个人；2-企业 
	 */
	public String getFile_type() {
		return file_type;
	}
	/**  
	 * 设置 file_type  
	 * @param file_type 1-个人；2-企业  
	 */
	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}
	/**  
	 * 获取 job_name
	 * @return the job_name job名称 
	 */
	public String getJob_name() {
		return job_name;
	}
	/**  
	 * 设置 job_name  
	 * @param job_name job名称  
	 */
	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}
}
