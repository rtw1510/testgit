package com.dhcc.xml.per.entity.credit.db;

import java.util.List;

/**  
  * Title: Pb_LnctrctBase_Info<br/>  
  * Description: 个人征信授信协议基本信息表<br/>  
  * @author ChenJingYuan  
  * @date 2018-11-16  
  */  
public class Pb_LnctrctBase_Info {

	/** 主表的主键信息 */
	private String Record_Id;
	/* 1、基础段基础段 */
	/** 信息记录类型[1..1] */
	private String InfRecType;
	/** 授信协议标识码[1..1] */
	private String ContractCode;
	/** 信息报告日期[1..1] */
	private String RptDate;
	/** 报告时点说明代码[1..1] */
	private String RptDateCode;
	/** 受信人姓名[1..1] */
	private String Name;
	/** 受信人证件类型[1..1] */
	private String IDType;
	/** 受信人证件号码[1..1] */
	private String IDNum;
	/** 业务管理机构代码[1..1] */
	private String MngmtOrgCode;

	/* 2、额度信息段 */

	/** 授信额度类型[1..1] */
	private String CreditLimType;
	/** 额度循环标志[1..1] */
	private String LimLoopFlg;
	/** 授信额度[1..1] */
	private String CreditLim;
	/** 币种[1..1] */
	private String Cy;
	/** 额度生效日期[1..1] */
	private String ConEffDate;
	/** 额度到期日期[1..1] */
	private String ConExpDate;
	/** 额度状态[1..1] */
	private String ConStatus;
	/** 授信限额[0..1] */
	private String CreditRest;
	/** 授信限额编号[0..1] */
	private String CreditRestCode;

	/* 3、上报标志 */
	private String LNCTRCTBASE_FLAG; // 基础段上报标志
	private String LNCTRCTREL_FLAG; // 共同受信人信息段上报标志
	private String LNCTRCTLIM_FLAG; // 额度信息段上报标志
	/**共同受信人信息段*/  
	private List<Pb_LnctrctRel_Info> Pb_LnctrctRel_Info_List;

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
	 * @return the infRecType 1、基础段基础段 
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**  
	 * 设置 infRecType  
	 * @param infRecType 1、基础段基础段  
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**  
	 * 获取 contractCode
	 * @return the contractCode 授信协议标识码[1..1] 
	 */
	public String getContractCode() {
		return ContractCode;
	}

	/**  
	 * 设置 contractCode  
	 * @param contractCode 授信协议标识码[1..1]  
	 */
	public void setContractCode(String contractCode) {
		ContractCode = contractCode;
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
	 * 获取 rptDateCode
	 * @return the rptDateCode 报告时点说明代码[1..1] 
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}

	/**  
	 * 设置 rptDateCode  
	 * @param rptDateCode 报告时点说明代码[1..1]  
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}

	/**  
	 * 获取 name
	 * @return the name 受信人姓名[1..1] 
	 */
	public String getName() {
		return Name;
	}

	/**  
	 * 设置 name  
	 * @param name 受信人姓名[1..1]  
	 */
	public void setName(String name) {
		Name = name;
	}

	/**  
	 * 获取 iDType
	 * @return the iDType 受信人证件类型[1..1] 
	 */
	public String getIDType() {
		return IDType;
	}

	/**  
	 * 设置 iDType  
	 * @param iDType 受信人证件类型[1..1]  
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}

	/**  
	 * 获取 iDNum
	 * @return the iDNum 受信人证件号码[1..1] 
	 */
	public String getIDNum() {
		return IDNum;
	}

	/**  
	 * 设置 iDNum  
	 * @param iDNum 受信人证件号码[1..1]  
	 */
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}

	/**  
	 * 获取 mngmtOrgCode
	 * @return the mngmtOrgCode 业务管理机构代码[1..1] 
	 */
	public String getMngmtOrgCode() {
		return MngmtOrgCode;
	}

	/**  
	 * 设置 mngmtOrgCode  
	 * @param mngmtOrgCode 业务管理机构代码[1..1]  
	 */
	public void setMngmtOrgCode(String mngmtOrgCode) {
		MngmtOrgCode = mngmtOrgCode;
	}

	/**  
	 * 获取 creditLimType
	 * @return the creditLimType 2、额度信息段 
	 */
	public String getCreditLimType() {
		return CreditLimType;
	}

	/**  
	 * 设置 creditLimType  
	 * @param creditLimType 2、额度信息段  
	 */
	public void setCreditLimType(String creditLimType) {
		CreditLimType = creditLimType;
	}

	/**  
	 * 获取 limLoopFlg
	 * @return the limLoopFlg 额度循环标志[1..1] 
	 */
	public String getLimLoopFlg() {
		return LimLoopFlg;
	}

	/**  
	 * 设置 limLoopFlg  
	 * @param limLoopFlg 额度循环标志[1..1]  
	 */
	public void setLimLoopFlg(String limLoopFlg) {
		LimLoopFlg = limLoopFlg;
	}

	/**  
	 * 获取 creditLim
	 * @return the creditLim 授信额度[1..1] 
	 */
	public String getCreditLim() {
		return CreditLim;
	}

	/**  
	 * 设置 creditLim  
	 * @param creditLim 授信额度[1..1]  
	 */
	public void setCreditLim(String creditLim) {
		CreditLim = creditLim;
	}

	/**  
	 * 获取 cy
	 * @return the cy 币种[1..1] 
	 */
	public String getCy() {
		return Cy;
	}

	/**  
	 * 设置 cy  
	 * @param cy 币种[1..1]  
	 */
	public void setCy(String cy) {
		Cy = cy;
	}

	/**  
	 * 获取 conEffDate
	 * @return the conEffDate 额度生效日期[1..1] 
	 */
	public String getConEffDate() {
		return ConEffDate;
	}

	/**  
	 * 设置 conEffDate  
	 * @param conEffDate 额度生效日期[1..1]  
	 */
	public void setConEffDate(String conEffDate) {
		ConEffDate = conEffDate;
	}

	/**  
	 * 获取 conExpDate
	 * @return the conExpDate 额度到期日期[1..1] 
	 */
	public String getConExpDate() {
		return ConExpDate;
	}

	/**  
	 * 设置 conExpDate  
	 * @param conExpDate 额度到期日期[1..1]  
	 */
	public void setConExpDate(String conExpDate) {
		ConExpDate = conExpDate;
	}

	/**  
	 * 获取 conStatus
	 * @return the conStatus 额度状态[1..1] 
	 */
	public String getConStatus() {
		return ConStatus;
	}

	/**  
	 * 设置 conStatus  
	 * @param conStatus 额度状态[1..1]  
	 */
	public void setConStatus(String conStatus) {
		ConStatus = conStatus;
	}

	/**  
	 * 获取 creditRest
	 * @return the creditRest 授信限额[0..1] 
	 */
	public String getCreditRest() {
		return CreditRest;
	}

	/**  
	 * 设置 creditRest  
	 * @param creditRest 授信限额[0..1]  
	 */
	public void setCreditRest(String creditRest) {
		CreditRest = creditRest;
	}

	/**  
	 * 获取 creditRestCode
	 * @return the creditRestCode 授信限额编号[0..1] 
	 */
	public String getCreditRestCode() {
		return CreditRestCode;
	}

	/**  
	 * 设置 creditRestCode  
	 * @param creditRestCode 授信限额编号[0..1]  
	 */
	public void setCreditRestCode(String creditRestCode) {
		CreditRestCode = creditRestCode;
	}

	/**  
	 * 获取 lNCTRCTBASE_FLAG
	 * @return the lNCTRCTBASE_FLAG #{bare_field_comment} 
	 */
	public String getLNCTRCTBASE_FLAG() {
		return LNCTRCTBASE_FLAG;
	}

	/**  
	 * 设置 lNCTRCTBASE_FLAG  
	 * @param lNCTRCTBASE_FLAG #{bare_field_comment}  
	 */
	public void setLNCTRCTBASE_FLAG(String lNCTRCTBASE_FLAG) {
		LNCTRCTBASE_FLAG = lNCTRCTBASE_FLAG;
	}

	/**  
	 * 获取 lNCTRCTREL_FLAG
	 * @return the lNCTRCTREL_FLAG #{bare_field_comment} 
	 */
	public String getLNCTRCTREL_FLAG() {
		return LNCTRCTREL_FLAG;
	}

	/**  
	 * 设置 lNCTRCTREL_FLAG  
	 * @param lNCTRCTREL_FLAG #{bare_field_comment}  
	 */
	public void setLNCTRCTREL_FLAG(String lNCTRCTREL_FLAG) {
		LNCTRCTREL_FLAG = lNCTRCTREL_FLAG;
	}

	/**  
	 * 获取 lNCTRCTLIM_FLAG
	 * @return the lNCTRCTLIM_FLAG #{bare_field_comment} 
	 */
	public String getLNCTRCTLIM_FLAG() {
		return LNCTRCTLIM_FLAG;
	}

	/**  
	 * 设置 lNCTRCTLIM_FLAG  
	 * @param lNCTRCTLIM_FLAG #{bare_field_comment}  
	 */
	public void setLNCTRCTLIM_FLAG(String lNCTRCTLIM_FLAG) {
		LNCTRCTLIM_FLAG = lNCTRCTLIM_FLAG;
	}

	/**  
	 * 获取 pb_LnctrctRel_Info_List
	 * @return the pb_LnctrctRel_Info_List 共同受信人信息段 
	 */
	public List<Pb_LnctrctRel_Info> getPb_LnctrctRel_Info_List() {
		return Pb_LnctrctRel_Info_List;
	}

	/**  
	 * 设置 pb_LnctrctRel_Info_List  
	 * @param pb_LnctrctRel_Info_List 共同受信人信息段  
	 */
	public void setPb_LnctrctRel_Info_List(
			List<Pb_LnctrctRel_Info> pb_LnctrctRel_Info_List) {
		Pb_LnctrctRel_Info_List = pb_LnctrctRel_Info_List;
	}
}
