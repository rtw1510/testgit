package com.dhcc.xml.ent.entity.guarantee.db;

import java.util.List;

/**  
  * Title: Eb_AcctMdf_Info<br/>  
  * Description: 企业担保账户按段更正请求记录基础段<br/>  
  * @author ChenJingYuan  
  * @date 2018-8-8  
  */  
public class Eb_AcctMdf_Info {
	/**主表的主键信息*/ 
	private String Record_Id;
	/**
	 *信息记录类型[1..1]
	 */
	private String InfRecType;
	/**
	 *待更正业务标识[1..1]
	 */
	private String ModRecCode;
	/**
	 *信息报告日期[1..1]
	 */
	private String RptDate;
	/**
	 *账户类型
	 */
	private String AcctType;
	/**
	 *待更正段段标[1..1]
	 */
	private String MdfcSgmtCode;
	/** 企业担保账户记录*/  
	private com.dhcc.xml.ent.entity.guarantee.db.Eb_GuarAcc_Info Eb_GuarAcc_Info;
	/**企业担保账户记录相关还款责任人*/  
	private List<Eb_GuarAccRel_Info> Eb_GuarAccRel_Info_List;
	/** 抵质押合同信息*/  
	private List<Eb_Guacct_Info> Eb_Guacct_Info_List;
	public Eb_AcctMdf_Info() {
		super();
	}
	/**  
	 * 获取 record_Id
	 * @return the record_Id 主表的主键信息 
	 */
	public String getRecord_Id() {
		return Record_Id;
	}

	/**  
	 * 设置 record_Id  
	 * @param record_Id 主表的主键信息  
	 */
	public void setRecord_Id(String record_Id) {
		Record_Id = record_Id;
	}

	/**  
	 * 获取 infRecType
	 * @return the infRecType 信息记录类型[1..1] 
	 */
	public String getInfRecType() {
		return InfRecType;
	}
	/**  
	 * 设置 infRecType  
	 * @param infRecType 信息记录类型[1..1]  
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}
	/**  
	 * 获取 modRecCode
	 * @return the modRecCode 待更正业务标识[1..1] 
	 */
	public String getModRecCode() {
		return ModRecCode;
	}
	/**  
	 * 设置 modRecCode  
	 * @param modRecCode 待更正业务标识[1..1]  
	 */
	public void setModRecCode(String modRecCode) {
		ModRecCode = modRecCode;
	}
	/**  
	 * 获取 rptDate
	 * @return the rptDate 信息报告日期[1..1] 
	 */
	public String getRptDate() {
		return RptDate;
	}
	/**  
	 * 设置 rptDate  
	 * @param rptDate 信息报告日期[1..1]  
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}
	/**  
	 * 获取 acctType
	 * @return the acctType 账户类型 
	 */
	public String getAcctType() {
		return AcctType;
	}
	/**  
	 * 设置 acctType  
	 * @param acctType 账户类型  
	 */
	public void setAcctType(String acctType) {
		AcctType = acctType;
	}
	/**  
	 * 获取 mdfcSgmtCode
	 * @return the mdfcSgmtCode 待更正段段标[1..1] 
	 */
	public String getMdfcSgmtCode() {
		return MdfcSgmtCode;
	}
	/**  
	 * 设置 mdfcSgmtCode  
	 * @param mdfcSgmtCode 待更正段段标[1..1]  
	 */
	public void setMdfcSgmtCode(String mdfcSgmtCode) {
		MdfcSgmtCode = mdfcSgmtCode;
	}
	/**  
	 * 获取 eb_GuarAcc_Info
	 * @return the eb_GuarAcc_Info 企业担保账户记录 
	 */
	public com.dhcc.xml.ent.entity.guarantee.db.Eb_GuarAcc_Info getEb_GuarAcc_Info() {
		return Eb_GuarAcc_Info;
	}
	/**  
	 * 设置 eb_GuarAcc_Info  
	 * @param eb_GuarAcc_Info 企业担保账户记录  
	 */
	public void setEb_GuarAcc_Info(com.dhcc.xml.ent.entity.guarantee.db.Eb_GuarAcc_Info eb_GuarAcc_Info) {
		Eb_GuarAcc_Info = eb_GuarAcc_Info;
	}
	/**  
	 * 获取 eb_GuarAccRel_Info_List
	 * @return the eb_GuarAccRel_Info_List 企业担保账户记录相关还款责任人 
	 */
	public List<Eb_GuarAccRel_Info> getEb_GuarAccRel_Info_List() {
		return Eb_GuarAccRel_Info_List;
	}
	/**  
	 * 设置 eb_GuarAccRel_Info_List  
	 * @param eb_GuarAccRel_Info_List 企业担保账户记录相关还款责任人  
	 */
	public void setEb_GuarAccRel_Info_List(
			List<Eb_GuarAccRel_Info> eb_GuarAccRel_Info_List) {
		Eb_GuarAccRel_Info_List = eb_GuarAccRel_Info_List;
	}
	/**  
	 * 获取 eb_Guacct_Info_List
	 * @return the eb_Guacct_Info_List 抵质押合同信息 
	 */
	public List<Eb_Guacct_Info> getEb_Guacct_Info_List() {
		return Eb_Guacct_Info_List;
	}
	/**  
	 * 设置 eb_Guacct_Info_List  
	 * @param eb_Guacct_Info_List 抵质押合同信息  
	 */
	public void setEb_Guacct_Info_List(List<Eb_Guacct_Info> eb_Guacct_Info_List) {
		Eb_Guacct_Info_List = eb_Guacct_Info_List;
	}
}
