package com.dhcc.xml.ent.entity.credit.db;

import java.util.List;

/**  
  * Title: Eb_AcctMdf_Info<br/>  
  * Description: 企业担保账户按段更正请求记录基础段<br/>  
  * @author ChenJingYuan  
  * @date 2018-8-8  
  */  
public class Eb_AcctMdf_Info {
	/**
	 *主表的主键信息
	 */  
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
	/**企业授信协议基本信息段数据表映射*/  
	private com.dhcc.xml.ent.entity.credit.db.Eb_CorpCtr_Info Eb_CorpCtr_Info;
	/**企业授信协议共同授信人信息段数据表映射*/  
	private List<Eb_CorpCtrRel_Info> Eb_CorpCtrRel_Info_List;
	
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
	 * 获取 eb_CorpCtr_Info
	 * @return the eb_CorpCtr_Info 企业授信协议基本信息段数据表映射 
	 */
	public com.dhcc.xml.ent.entity.credit.db.Eb_CorpCtr_Info getEb_CorpCtr_Info() {
		return Eb_CorpCtr_Info;
	}

	/**  
	 * 设置 eb_CorpCtr_Info  
	 * @param eb_CorpCtr_Info 企业授信协议基本信息段数据表映射  
	 */
	public void setEb_CorpCtr_Info(com.dhcc.xml.ent.entity.credit.db.Eb_CorpCtr_Info eb_CorpCtr_Info) {
		Eb_CorpCtr_Info = eb_CorpCtr_Info;
	}

	/**  
	 * 获取 eb_CorpCtrRel_Info_List
	 * @return the eb_CorpCtrRel_Info_List 企业授信协议共同授信人信息段数据表映射 
	 */
	public List<Eb_CorpCtrRel_Info> getEb_CorpCtrRel_Info_List() {
		return Eb_CorpCtrRel_Info_List;
	}

	/**  
	 * 设置 eb_CorpCtrRel_Info_List  
	 * @param eb_CorpCtrRel_Info_List 企业授信协议共同授信人信息段数据表映射  
	 */
	public void setEb_CorpCtrRel_Info_List(
			List<Eb_CorpCtrRel_Info> eb_CorpCtrRel_Info_List) {
		Eb_CorpCtrRel_Info_List = eb_CorpCtrRel_Info_List;
	}
}
