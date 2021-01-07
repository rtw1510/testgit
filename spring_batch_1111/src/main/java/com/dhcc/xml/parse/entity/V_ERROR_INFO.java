package com.dhcc.xml.parse.entity;

/**
 * Title: V_ERROR_INFO<br/>
 * Description:错误统计（反馈报文记录） <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-8-1
 */
public class V_ERROR_INFO {
	/** ID编码 */  
	private String id;						                                               
	/** 客户号 */  
	private String cust_no;                                                      
	/** 信息记录类型 */  
	private String infrectype;                                             
	/** 错误数据主键 */  
	private String err_keys; 
	/** 错误数据主键详情 */ 
	private String err_keys_desc;  
	/** 反馈报文名 */ 
	private String fb_file_name;                                       
	/** 反馈信息代码 */ 
	private String fbcode;                                                   
	/** 反馈信息 */ 
	private String fbmsg;                                                  
	/** 校验规则代码 */  
	private String rulecode;                                                   
	/** 校验规则描述 */  
	private String ruledesc;                                               
	/** 错误类型：1-校验错误;2-反馈错误。 */  
	private String err_type;   
	/** 错误类型：0-物理校验错误;1-逻辑校验错误；2-反馈错误。 */  
	private String err_type_detail;    
	/** 征信类型：1-个人，2-企业。 */   
	private String cri_type;      
	/** 原报文表数据ID */ 
	private String record_id;                                
	/** 原报文数据操作员 */  
	private String record_oprr_no;
	/** 原报文数据机构号   */  
	private String record_brno;                                         
	/** 原报文数据机构名称 */   
	private String record_brname;                                      
	/** 数据加载日期  */ 
	private String tx_date;                                          
	/** 数据加载操作员  */  
	private String oprr_no;
	/** 数据更新日期 */
	private String up_date;                                               
	/** 数据更新操作员 */ 
	private String up_oprr_no;                                           
	/** 数据状态：0-未修改,1-修改中，2-已修改 */  
	private String data_sts;                                               
	/**  认领状态：0-未认领，1-已认领。 */  
	private String confirm_sts;    
	/** 元数据RptDate*/  
	private String rpt_date;
	//表名
	private String table_name;
	//文件名
	private String file_name;
	
	public V_ERROR_INFO() {
		super();
	}

	/**  
	 * 获取 id
	 * @return the id ID编码 
	 */
	public String getId() {
		return id;
	}

	/**  
	 * 设置 id  
	 * @param id ID编码  
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**  
	 * 获取 cust_no
	 * @return the cust_no 客户号 
	 */
	public String getCust_no() {
		return cust_no;
	}

	/**  
	 * 设置 cust_no  
	 * @param cust_no 客户号  
	 */
	public void setCust_no(String custNo) {
		cust_no = custNo;
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
	 * 获取 err_keys
	 * @return the err_keys 错误数据主键 
	 */
	public String getErr_keys() {
		return err_keys;
	}

	/**  
	 * 设置 err_keys  
	 * @param err_keys 错误数据主键  
	 */
	public void setErr_keys(String errKeys) {
		err_keys = errKeys;
	}

	/**  
	 * 获取 err_keys_desc
	 * @return the err_keys_desc 错误数据主键详情 
	 */
	public String getErr_keys_desc() {
		return err_keys_desc;
	}

	/**  
	 * 设置 err_keys_desc  
	 * @param err_keys_desc 错误数据主键详情  
	 */
	public void setErr_keys_desc(String errKeysDesc) {
		err_keys_desc = errKeysDesc;
	}

	/**  
	 * 获取 fb_file_name
	 * @return the fb_file_name 反馈报文名 
	 */
	public String getFb_file_name() {
		return fb_file_name;
	}

	/**  
	 * 设置 fb_file_name  
	 * @param fb_file_name 反馈报文名  
	 */
	public void setFb_file_name(String fbFileName) {
		fb_file_name = fbFileName;
	}

	/**  
	 * 获取 fbcode
	 * @return the fbcode 反馈信息代码 
	 */
	public String getFbcode() {
		return fbcode;
	}

	/**  
	 * 设置 fbcode  
	 * @param fbcode 反馈信息代码  
	 */
	public void setFbcode(String fbcode) {
		this.fbcode = fbcode;
	}

	/**  
	 * 获取 fbmsg
	 * @return the fbmsg 反馈信息 
	 */
	public String getFbmsg() {
		return fbmsg;
	}

	/**  
	 * 设置 fbmsg  
	 * @param fbmsg 反馈信息  
	 */
	public void setFbmsg(String fbmsg) {
		this.fbmsg = fbmsg;
	}

	/**  
	 * 获取 rulecode
	 * @return the rulecode 校验规则代码 
	 */
	public String getRulecode() {
		return rulecode;
	}

	/**  
	 * 设置 rulecode  
	 * @param rulecode 校验规则代码  
	 */
	public void setRulecode(String rulecode) {
		this.rulecode = rulecode;
	}

	/**  
	 * 获取 ruledesc
	 * @return the ruledesc 校验规则描述 
	 */
	public String getRuledesc() {
		return ruledesc;
	}

	/**  
	 * 设置 ruledesc  
	 * @param ruledesc 校验规则描述  
	 */
	public void setRuledesc(String ruledesc) {
		this.ruledesc = ruledesc;
	}

	/**  
	 * 获取 err_type
	 * @return the err_type 错误类型：1-校验错误;2-反馈错误。 
	 */
	public String getErr_type() {
		return err_type;
	}

	/**  
	 * 设置 err_type  
	 * @param err_type 错误类型：1-校验错误;2-反馈错误。  
	 */
	public void setErr_type(String errType) {
		err_type = errType;
	}

	/**  
	 * 获取 err_type_detail
	 * @return the err_type_detail 错误类型：0-物理校验错误;1-逻辑校验错误；2-反馈错误。 
	 */
	public String getErr_type_detail() {
		return err_type_detail;
	}

	/**  
	 * 设置 err_type_detail  
	 * @param err_type_detail 错误类型：0-物理校验错误;1-逻辑校验错误；2-反馈错误。  
	 */
	public void setErr_type_detail(String errTypeDetail) {
		err_type_detail = errTypeDetail;
	}

	/**  
	 * 获取 cri_type
	 * @return the cri_type 征信类型：1-个人，2-企业。 
	 */
	public String getCri_type() {
		return cri_type;
	}

	/**  
	 * 设置 cri_type  
	 * @param cri_type 征信类型：1-个人，2-企业。  
	 */
	public void setCri_type(String criType) {
		cri_type = criType;
	}

	/**  
	 * 获取 record_id
	 * @return the record_id 原报文表数据ID 
	 */
	public String getRecord_id() {
		return record_id;
	}

	/**  
	 * 设置 record_id  
	 * @param record_id 原报文表数据ID  
	 */
	public void setRecord_id(String recordId) {
		record_id = recordId;
	}

	/**  
	 * 获取 record_oprr_no
	 * @return the record_oprr_no 原报文数据操作员 
	 */
	public String getRecord_oprr_no() {
		return record_oprr_no;
	}

	/**  
	 * 设置 record_oprr_no  
	 * @param record_oprr_no 原报文数据操作员  
	 */
	public void setRecord_oprr_no(String recordOprrNo) {
		record_oprr_no = recordOprrNo;
	}

	/**  
	 * 获取 record_brno
	 * @return the record_brno 原报文数据机构号 
	 */
	public String getRecord_brno() {
		return record_brno;
	}

	/**  
	 * 设置 record_brno  
	 * @param record_brno 原报文数据机构号  
	 */
	public void setRecord_brno(String recordBrno) {
		record_brno = recordBrno;
	}

	/**  
	 * 获取 record_brname
	 * @return the record_brname 原报文数据机构名称 
	 */
	public String getRecord_brname() {
		return record_brname;
	}

	/**  
	 * 设置 record_brname  
	 * @param record_brname 原报文数据机构名称  
	 */
	public void setRecord_brname(String recordBrname) {
		record_brname = recordBrname;
	}

	/**  
	 * 获取 tx_date
	 * @return the tx_date 数据加载日期 
	 */
	public String getTx_date() {
		return tx_date;
	}

	/**  
	 * 设置 tx_date  
	 * @param tx_date 数据加载日期  
	 */
	public void setTx_date(String txDate) {
		tx_date = txDate;
	}

	/**  
	 * 获取 oprr_no
	 * @return the oprr_no 数据加载操作员 
	 */
	public String getOprr_no() {
		return oprr_no;
	}

	/**  
	 * 设置 oprr_no  
	 * @param oprr_no 数据加载操作员  
	 */
	public void setOprr_no(String oprrNo) {
		oprr_no = oprrNo;
	}

	/**  
	 * 获取 up_date
	 * @return the up_date 数据更新日期 
	 */
	public String getUp_date() {
		return up_date;
	}

	/**  
	 * 设置 up_date  
	 * @param up_date 数据更新日期  
	 */
	public void setUp_date(String upDate) {
		up_date = upDate;
	}

	/**  
	 * 获取 up_oprr_no
	 * @return the up_oprr_no 数据更新操作员 
	 */
	public String getUp_oprr_no() {
		return up_oprr_no;
	}

	/**  
	 * 设置 up_oprr_no  
	 * @param up_oprr_no 数据更新操作员  
	 */
	public void setUp_oprr_no(String upOprrNo) {
		up_oprr_no = upOprrNo;
	}

	/**  
	 * 获取 data_sts
	 * @return the data_sts 数据状态：0-未修改1-修改中，2-已修改 
	 */
	public String getData_sts() {
		return data_sts;
	}

	/**  
	 * 设置 data_sts  
	 * @param data_sts 数据状态：0-未修改1-修改中，2-已修改  
	 */
	public void setData_sts(String dataSts) {
		data_sts = dataSts;
	}

	/**  
	 * 获取 confirm_sts
	 * @return the confirm_sts 认领状态：0-未认领，1-已认领。 
	 */
	public String getConfirm_sts() {
		return confirm_sts;
	}

	/**  
	 * 设置 confirm_sts  
	 * @param confirm_sts 认领状态：0-未认领，1-已认领。  
	 */
	public void setConfirm_sts(String confirmSts) {
		confirm_sts = confirmSts;
	}
	
	public String getTable_name() {
		return table_name;
	}

	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getRpt_date() {
		return rpt_date;
	}

	public void setRpt_date(String rpt_date) {
		this.rpt_date = rpt_date;
	}
}
