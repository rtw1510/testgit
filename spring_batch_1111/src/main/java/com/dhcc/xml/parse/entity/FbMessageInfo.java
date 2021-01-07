package com.dhcc.xml.parse.entity;

/**  
  * Title: MessageInfo<br/>  
  * Description:二代征信报文信息管理 <br/>  
  * @author ChenJingYuan  
  * @date 2018-8-16  
  */  
public class FbMessageInfo{
	/** ID编号 */  
	private String id;						          
	/** 信息记录类型  */  
	private String infrectype;        
	/** 反馈报文文件名 */  
	private String fb_file_name;    
	/** 反馈报文文件路径 */  
	private String fb_file_path;  
	/** 反馈标识 */  
	private String fb_flag;               
	/** 反馈文件版本号 */  
	private String fb_version;      
	/** 反馈文件生成时间 */  
	private String fb_time;       
	/** 正确入库记录数 */  
	private String fb_succ_num;     
	/** 错误反馈记录数 */  
	private String fb_err_num;      
	/** 上传操作员所属机构号*/  
	private String br_no;
	/** 上传操作员号*/  
	private String oprr_no;
	/** 更新操作员所属机构号*/  
	private String upd_brno;
	/** 更新操作员号*/  
	private String upd_oprrno;
	/** 上传日期yyyy-MM-dd*/  
	private String tx_date;
	/** 上传时间yyyy-MM-dd HH:mm:ss*/  
	private String tx_time;
	/** 解析入库日期yyyy-MM-dd*/  
	private String up_date;
	/** 解析入库时间yyyy-MM-dd HH:mm:ss*/  
	private String up_time;
	/** 文件状态：0-未解析;1-已解析;2-正在解析；3-解析失败*/  
	private String fb_file_sts;
	/** 原报文文件名称*/  
	private String gen_file_name;
	/** 报文属性：1-个人；2-企业*/  
	private String file_type;
	public FbMessageInfo() {
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
	 * 获取 fb_file_name
	 * @return the fb_file_name 反馈报文文件名 
	 */
	public String getFb_file_name() {
		return fb_file_name;
	}
	/**  
	 * 设置 fb_file_name  
	 * @param fb_file_name 反馈报文文件名  
	 */
	public void setFb_file_name(String fb_file_name) {
		this.fb_file_name = fb_file_name;
	}
	/**  
	 * 获取 fb_file_path
	 * @return the fb_file_path 反馈报文文件路径 
	 */
	public String getFb_file_path() {
		return fb_file_path;
	}
	/**  
	 * 设置 fb_file_path  
	 * @param fb_file_path 反馈报文文件路径  
	 */
	public void setFb_file_path(String fb_file_path) {
		this.fb_file_path = fb_file_path;
	}
	/**  
	 * 获取 fb_flag
	 * @return the fb_flag 反馈标识 
	 */
	public String getFb_flag() {
		return fb_flag;
	}
	/**  
	 * 设置 fb_flag  
	 * @param fb_flag 反馈标识  
	 */
	public void setFb_flag(String fb_flag) {
		this.fb_flag = fb_flag;
	}
	/**  
	 * 获取 fb_version
	 * @return the fb_version 反馈文件版本号 
	 */
	public String getFb_version() {
		return fb_version;
	}
	/**  
	 * 设置 fb_version  
	 * @param fb_version 反馈文件版本号  
	 */
	public void setFb_version(String fb_version) {
		this.fb_version = fb_version;
	}
	/**  
	 * 获取 fb_time
	 * @return the fb_time 反馈文件生成时间 
	 */
	public String getFb_time() {
		return fb_time;
	}
	/**  
	 * 设置 fb_time  
	 * @param fb_time 反馈文件生成时间  
	 */
	public void setFb_time(String fb_time) {
		this.fb_time = fb_time;
	}
	/**  
	 * 获取 fb_succ_num
	 * @return the fb_succ_num 正确入库记录数 
	 */
	public String getFb_succ_num() {
		return fb_succ_num;
	}
	/**  
	 * 设置 fb_succ_num  
	 * @param fb_succ_num 正确入库记录数  
	 */
	public void setFb_succ_num(String fb_succ_num) {
		this.fb_succ_num = fb_succ_num;
	}
	/**  
	 * 获取 fb_err_num
	 * @return the fb_err_num 错误反馈记录数 
	 */
	public String getFb_err_num() {
		return fb_err_num;
	}
	/**  
	 * 设置 fb_err_num  
	 * @param fb_err_num 错误反馈记录数  
	 */
	public void setFb_err_num(String fb_err_num) {
		this.fb_err_num = fb_err_num;
	}
	/**  
	 * 获取 br_no
	 * @return the br_no 上传操作员所属机构号 
	 */
	public String getBr_no() {
		return br_no;
	}
	/**  
	 * 设置 br_no  
	 * @param br_no 上传操作员所属机构号  
	 */
	public void setBr_no(String br_no) {
		this.br_no = br_no;
	}
	/**  
	 * 获取 oprr_no
	 * @return the oprr_no 上传操作员号 
	 */
	public String getOprr_no() {
		return oprr_no;
	}
	/**  
	 * 设置 oprr_no  
	 * @param oprr_no 上传操作员号  
	 */
	public void setOprr_no(String oprr_no) {
		this.oprr_no = oprr_no;
	}
	/**  
	 * 获取 upd_brno
	 * @return the upd_brno 更新操作员所属机构号 
	 */
	public String getUpd_brno() {
		return upd_brno;
	}
	/**  
	 * 设置 upd_brno  
	 * @param upd_brno 更新操作员所属机构号  
	 */
	public void setUpd_brno(String upd_brno) {
		this.upd_brno = upd_brno;
	}
	/**  
	 * 获取 upd_oprrno
	 * @return the upd_oprrno 更新操作员号 
	 */
	public String getUpd_oprrno() {
		return upd_oprrno;
	}
	/**  
	 * 设置 upd_oprrno  
	 * @param upd_oprrno 更新操作员号  
	 */
	public void setUpd_oprrno(String upd_oprrno) {
		this.upd_oprrno = upd_oprrno;
	}
	/**  
	 * 获取 tx_date
	 * @return the tx_date 上传日期yyyy-MM-dd 
	 */
	public String getTx_date() {
		return tx_date;
	}
	/**  
	 * 设置 tx_date  
	 * @param tx_date 上传日期yyyy-MM-dd  
	 */
	public void setTx_date(String tx_date) {
		this.tx_date = tx_date;
	}
	/**  
	 * 获取 tx_time
	 * @return the tx_time 上传时间yyyy-MM-dd HH:mm:ss 
	 */
	public String getTx_time() {
		return tx_time;
	}
	/**  
	 * 设置 tx_time  
	 * @param tx_time 上传时间yyyy-MM-dd HH:mm:ss  
	 */
	public void setTx_time(String tx_time) {
		this.tx_time = tx_time;
	}
	/**  
	 * 获取 up_date
	 * @return the up_date 解析入库日期yyyy-MM-dd 
	 */
	public String getUp_date() {
		return up_date;
	}
	/**  
	 * 设置 up_date  
	 * @param up_date 解析入库日期yyyy-MM-dd  
	 */
	public void setUp_date(String up_date) {
		this.up_date = up_date;
	}
	/**  
	 * 获取 up_time
	 * @return the up_time 解析入库时间yyyy-MM-dd HH:mm:ss 
	 */
	public String getUp_time() {
		return up_time;
	}
	/**  
	 * 设置 up_time  
	 * @param up_time 解析入库时间yyyy-MM-dd HH:mm:ss  
	 */
	public void setUp_time(String up_time) {
		this.up_time = up_time;
	}
	/**  
	 * 获取 fb_file_sts
	 * @return the fb_file_sts 文件状态：0-未解析;1-已解析;2-正在解析；3-解析失败 
	 */
	public String getFb_file_sts() {
		return fb_file_sts;
	}
	/**  
	 * 设置 fb_file_sts  
	 * @param fb_file_sts 文件状态：0-未解析;1-已解析;2-正在解析；3-解析失败  
	 */
	public void setFb_file_sts(String fb_file_sts) {
		this.fb_file_sts = fb_file_sts;
	}
	/**  
	 * 获取 gen_file_name
	 * @return the gen_file_name 原报文文件名称 
	 */
	public String getGen_file_name() {
		return gen_file_name;
	}
	/**  
	 * 设置 gen_file_name  
	 * @param gen_file_name 原报文文件名称  
	 */
	public void setGen_file_name(String gen_file_name) {
		this.gen_file_name = gen_file_name;
	}
	/**  
	 * 获取 file_type
	 * @return the file_type 报文属性：1-个人；2-企业 
	 */
	public String getFile_type() {
		return file_type;
	}
	/**  
	 * 设置 file_type  
	 * @param file_type 报文属性：1-个人；2-企业  
	 */
	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}
}
