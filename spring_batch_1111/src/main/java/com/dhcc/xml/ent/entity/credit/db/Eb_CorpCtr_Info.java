package com.dhcc.xml.ent.entity.credit.db;

import java.util.List;

/**  
  * Title: Eb_CorpCtr_Info<br/>  
  * Description: 企业授信协议基本信息段数据表映射<br/>  
  * @author ChenJingYuan  
  * @date 2018-7-25  
  */  
public class Eb_CorpCtr_Info {
	/**
	 *主表的主键信息
	 */  
	private String Record_Id;
	/**
	 * 信息记录类型 [1..1]
	 */
	private String InfRecType;
	/**
	 * 授信协议标识码 [1..1]
	 */
	private String ContractCode;
	/**
	 * 信息报告日期 [1..1]
	 */
	private String RptDate;
	/**
	 * 报告时点说明代码 [1..1]
	 */
	private String RptDateCode;
	/**
	 * 受信人名称 [1..1]
	 */
	private String Name;
	/**
	 * 受信人身份标识类型 [1..1]
	 */
	private String IDType;
	/**
	 * 受信人身份标识证件号码 [1..1]
	 */
	private String IDNum;
	/**
	 * 业务管理机构代码 [1..1]
	 */
	private String MngmtOrgCode;
	/**
	 * 授信额度类型 [1..1]
	 */
	private String CreditLimType;
	/**
	 * 额度循环标志 [1..1]
	 */
	private String LimLoopFlg;
	/**
	 * 授信额度 [1..1]
	 */
	private String CreditLim;
	/**
	 * 币种 [1..1]
	 */
	private String Cy;
	/**
	 * 额度生效日期 [1..1]
	 */
	private String ConEffDate;
	/**
	 * 额度到期日期 [1..1]
	 */
	private String ConExpDate;
	/**
	 * 额度状态 [1..1]
	 */
	private String ConStatus;
	/**授信限额*/  
	private  String CreditRest;
	/**授信限额编号*/  
	private String CreditRestCode;
	/**
	 *共同受信人信息段上报标志
	 */  
	private String CORPCTRREL_FLAG;
	/**
	 *额度信息段上报标志
	 */  
	private String CORPCTRLIM_FLAG;
	/** 企业授信协议共同授信人信息段*/  
	private List<Eb_CorpCtrRel_Info> Eb_CorpCtrRel_Info_List;
	
	public Eb_CorpCtr_Info() {
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
	 * 获取 cORPCTRREL_FLAG
	 * @return the cORPCTRREL_FLAG 共同受信人信息段上报标志 
	 */
	public String getCORPCTRREL_FLAG() {
		return CORPCTRREL_FLAG;
	}
	/**  
	 * 设置 cORPCTRREL_FLAG  
	 * @param cORPCTRREL_FLAG 共同受信人信息段上报标志  
	 */
	public void setCORPCTRREL_FLAG(String cORPCTRRELFLAG) {
		CORPCTRREL_FLAG = cORPCTRRELFLAG;
	}
	/**  
	 * 获取 cORPCTRLIM_FLAG
	 * @return the cORPCTRLIM_FLAG 额度信息段上报标志 
	 */
	public String getCORPCTRLIM_FLAG() {
		return CORPCTRLIM_FLAG;
	}
	/**  
	 * 设置 cORPCTRLIM_FLAG  
	 * @param cORPCTRLIM_FLAG 额度信息段上报标志  
	 */
	public void setCORPCTRLIM_FLAG(String cORPCTRLIMFLAG) {
		CORPCTRLIM_FLAG = cORPCTRLIMFLAG;
	}
	/**  
	 * 获取 infRecType
	 * @return the infRecType 信息记录类型 [1..1] 
	 */
	public String getInfRecType() {
		return InfRecType;
	}
	/**  
	 * 设置 infRecType  
	 * @param infRecType 信息记录类型 [1..1]  
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}
	/**  
	 * 获取 contractCode
	 * @return the contractCode 授信协议标识码 [1..1] 
	 */
	public String getContractCode() {
		return ContractCode;
	}
	/**  
	 * 设置 contractCode  
	 * @param contractCode 授信协议标识码 [1..1]  
	 */
	public void setContractCode(String contractCode) {
		ContractCode = contractCode;
	}
	/**  
	 * 获取 rptDate
	 * @return the rptDate 信息报告日期 [1..1] 
	 */
	public String getRptDate() {
		return RptDate;
	}
	/**  
	 * 设置 rptDate  
	 * @param rptDate 信息报告日期 [1..1]  
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}
	/**  
	 * 获取 rptDateCode
	 * @return the rptDateCode 报告时点说明代码 [1..1] 
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}
	/**  
	 * 设置 rptDateCode  
	 * @param rptDateCode 报告时点说明代码 [1..1]  
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}
	/**  
	 * 获取 name
	 * @return the name 受信人名称 [1..1] 
	 */
	public String getName() {
		return Name;
	}
	/**  
	 * 设置 name  
	 * @param name 受信人名称 [1..1]  
	 */
	public void setName(String name) {
		Name = name;
	}
	/**  
	 * 获取 iDType
	 * @return the iDType 受信人身份标识类型 [1..1] 
	 */
	public String getIDType() {
		return IDType;
	}
	/**  
	 * 设置 iDType  
	 * @param iDType 受信人身份标识类型 [1..1]  
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}
	/**  
	 * 获取 iDNum
	 * @return the iDNum 受信人身份标识证件号码 [1..1] 
	 */
	public String getIDNum() {
		return IDNum;
	}
	/**  
	 * 设置 iDNum  
	 * @param iDNum 受信人身份标识证件号码 [1..1]  
	 */
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}
	/**  
	 * 获取 mngmtOrgCode
	 * @return the mngmtOrgCode 业务管理机构代码 [1..1] 
	 */
	public String getMngmtOrgCode() {
		return MngmtOrgCode;
	}
	/**  
	 * 设置 mngmtOrgCode  
	 * @param mngmtOrgCode 业务管理机构代码 [1..1]  
	 */
	public void setMngmtOrgCode(String mngmtOrgCode) {
		MngmtOrgCode = mngmtOrgCode;
	}
	/**  
	 * 获取 creditLimType
	 * @return the creditLimType 授信额度类型 [1..1] 
	 */
	public String getCreditLimType() {
		return CreditLimType;
	}
	/**  
	 * 设置 creditLimType  
	 * @param creditLimType 授信额度类型 [1..1]  
	 */
	public void setCreditLimType(String creditLimType) {
		CreditLimType = creditLimType;
	}
	/**  
	 * 获取 limLoopFlg
	 * @return the limLoopFlg 额度循环标志 [1..1] 
	 */
	public String getLimLoopFlg() {
		return LimLoopFlg;
	}
	/**  
	 * 设置 limLoopFlg  
	 * @param limLoopFlg 额度循环标志 [1..1]  
	 */
	public void setLimLoopFlg(String limLoopFlg) {
		LimLoopFlg = limLoopFlg;
	}
	/**  
	 * 获取 creditLim
	 * @return the creditLim 授信额度 [1..1] 
	 */
	public String getCreditLim() {
		return CreditLim;
	}
	/**  
	 * 设置 creditLim  
	 * @param creditLim 授信额度 [1..1]  
	 */
	public void setCreditLim(String creditLim) {
		CreditLim = creditLim;
	}
	/**  
	 * 获取 cy
	 * @return the cy 币种 [1..1] 
	 */
	public String getCy() {
		return Cy;
	}
	/**  
	 * 设置 cy  
	 * @param cy 币种 [1..1]  
	 */
	public void setCy(String cy) {
		Cy = cy;
	}
	/**  
	 * 获取 conEffDate
	 * @return the conEffDate 额度生效日期 [1..1] 
	 */
	public String getConEffDate() {
		return ConEffDate;
	}
	/**  
	 * 设置 conEffDate  
	 * @param conEffDate 额度生效日期 [1..1]  
	 */
	public void setConEffDate(String conEffDate) {
		ConEffDate = conEffDate;
	}
	/**  
	 * 获取 conExpDate
	 * @return the conExpDate 额度到期日期 [1..1] 
	 */
	public String getConExpDate() {
		return ConExpDate;
	}
	/**  
	 * 设置 conExpDate  
	 * @param conExpDate 额度到期日期 [1..1]  
	 */
	public void setConExpDate(String conExpDate) {
		ConExpDate = conExpDate;
	}
	/**  
	 * 获取 conStatus
	 * @return the conStatus 额度状态 [1..1] 
	 */
	public String getConStatus() {
		return ConStatus;
	}
	/**  
	 * 设置 conStatus  
	 * @param conStatus 额度状态 [1..1]  
	 */
	public void setConStatus(String conStatus) {
		ConStatus = conStatus;
	}
	/**  
	 * 获取 creditRest
	 * @return the creditRest 授信限额 
	 */
	public String getCreditRest() {
		return CreditRest;
	}
	/**  
	 * 设置 creditRest  
	 * @param creditRest 授信限额  
	 */
	public void setCreditRest(String creditRest) {
		CreditRest = creditRest;
	}
	/**  
	 * 获取 creditRestCode
	 * @return the creditRestCode 授信限额编号 
	 */
	public String getCreditRestCode() {
		return CreditRestCode;
	}
	/**  
	 * 设置 creditRestCode  
	 * @param creditRestCode 授信限额编号  
	 */
	public void setCreditRestCode(String creditRestCode) {
		CreditRestCode = creditRestCode;
	}
	/**  
	 * 获取 eb_CorpCtrRel_Info_List
	 * @return the eb_CorpCtrRel_Info_List 企业授信协议共同授信人信息段 
	 */
	public List<Eb_CorpCtrRel_Info> getEb_CorpCtrRel_Info_List() {
		return Eb_CorpCtrRel_Info_List;
	}
	/**  
	 * 设置 eb_CorpCtrRel_Info_List  
	 * @param eb_CorpCtrRel_Info_List 企业授信协议共同授信人信息段  
	 */
	public void setEb_CorpCtrRel_Info_List(
			List<Eb_CorpCtrRel_Info> eb_CorpCtrRel_Info_List) {
		Eb_CorpCtrRel_Info_List = eb_CorpCtrRel_Info_List;
	}
}
