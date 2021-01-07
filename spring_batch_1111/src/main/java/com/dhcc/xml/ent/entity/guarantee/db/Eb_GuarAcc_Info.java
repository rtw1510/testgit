package com.dhcc.xml.ent.entity.guarantee.db;

import java.util.List;

/**  
  * Title: Eb_GuarAcc_Info<br/>  
  * Description: 企业担保账户记录<br/>  
  * @author ChenJingYuan  
  * @date 2020-4-18  
  */  
public class Eb_GuarAcc_Info {
	/**主表的主键信息*/ 
	private String Record_Id;
	/**
	 *信息记录类型[1..1]
	 */
	private String InfRecType;
	/**
	 *账户类型[1..1]
	 */
	private String AcctType;
	/**
	 *账户标识码[1..1]
	 */
	private String AcctCode;
	/**
	 *信息报告日期[1..1]
	 */
	private String RptDate;
	/**
	 *报告时点说明代码[1..1]
	 */
	private String RptDateCode;
	/**
	 *债务人名称[1..1]
	 */
	private String Name;
	/**
	 *债务人身份标识类型[1..1]
	 */
	private String IDType;
	/**
	 *债务人身份标识号码[1..1]
	 */
	private String IDNum;
	/**
	 *业务管理机构代码[1..1]
	 */
	private String MngmtOrgCode;
	/**
	 *担保业务大类[1..1]
	 */
	private String BusiLines;
	/**
	 *担保业务种类细分1..1]
	 */
	private String BusiDtilLines;
	/**
	 *开户日期[1..1]
	 */
	private String OpenDate;
	/**
	 *担保金额[1..1]
	 */
	private String GuarAmt;
	/**
	 *币种[1..1]
	 */
	private String Cy;
	/**
	 *到期日期[1..1]
	 */
	private String DueDate;
	/**
	 *反担保方式[1..1]
	 */
	private String GuarMode;
	/**
	 *其他还款保证方式[1..1]
	 */
	private String OthRepyGuarWay;
	/**
	 *保证金百分比[1..1]
	 */
	private String SecDep;
	/**
	 *担保合同文本编号[1..1]
	 */
	private String CtrctTxtCode;
	
	private String Mcc;
	
	/**
	 *账户状态[1..1]
	 */
	private String AcctStatus;
	/**
	 *在保余额[1..1]
	 */
	private String LoanAmt;
	/**
	 *余额变化日期 [1..1]
	 */
	private String RepayPrd;
	/**
	 *五级分类[1..1]
	 */
	private String FiveCate;
	/**
	 *五级分类认定日期[1..1]
	 */
	private String FiveCateAdjDate;
	/**
	 *风险敞口[1..1]
	 */
	private String RiEx;
	/**
	 *代偿（垫款）标识[1..1]
	 */
	private String CompAdvFlag;
	/**
	 *账户关闭日期[1..1]
	 */
	private String CloseDate;
	
	private String GUARACCBASEINF_FLAG;
	private String GUARACCREL_FLAG;
	private String GUARACCMOT_FLAG;
	private String GUARACCMCC_FLAG;
	private String GUARACCAMT_FLAG;

	/**企业担保账户记录相关还款责任人*/  
	private List<Eb_GuarAccRel_Info> Eb_GuarAccRel_Info_List;
	/** 抵质押合同信息*/  
	private List<Eb_Guacct_Info> Eb_Guacct_Info_List;  
	public Eb_GuarAcc_Info() {
		super();
	}
	public String getInfRecType() {
		return InfRecType;
	}
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}
	public String getAcctType() {
		return AcctType;
	}
	public void setAcctType(String acctType) {
		AcctType = acctType;
	}
	
	/**  
	 * 获取 acctCode
	 * @return the acctCode 账户标识码[1..1] 
	 */
	public String getAcctCode() {
		return AcctCode;
	}
	/**  
	 * 设置 acctCode  
	 * @param acctCode 账户标识码[1..1]  
	 */
	public void setAcctCode(String acctCode) {
		AcctCode = acctCode;
	}
	public String getRptDate() {
		return RptDate;
	}
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}
	public String getRptDateCode() {
		return RptDateCode;
	}
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getIDType() {
		return IDType;
	}
	public void setIDType(String iDType) {
		IDType = iDType;
	}
	public String getIDNum() {
		return IDNum;
	}
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}
	public String getMngmtOrgCode() {
		return MngmtOrgCode;
	}
	public void setMngmtOrgCode(String mngmtOrgCode) {
		MngmtOrgCode = mngmtOrgCode;
	}
	public String getBusiLines() {
		return BusiLines;
	}
	public void setBusiLines(String busiLines) {
		BusiLines = busiLines;
	}
	public String getBusiDtilLines() {
		return BusiDtilLines;
	}
	public void setBusiDtilLines(String busiDtilLines) {
		BusiDtilLines = busiDtilLines;
	}
	public String getOpenDate() {
		return OpenDate;
	}
	public void setOpenDate(String openDate) {
		OpenDate = openDate;
	}
	public String getGuarAmt() {
		return GuarAmt;
	}
	public void setGuarAmt(String guarAmt) {
		GuarAmt = guarAmt;
	}
	public String getCy() {
		return Cy;
	}
	public void setCy(String cy) {
		Cy = cy;
	}
	public String getDueDate() {
		return DueDate;
	}
	public void setDueDate(String dueDate) {
		DueDate = dueDate;
	}
	public String getGuarMode() {
		return GuarMode;
	}
	public void setGuarMode(String guarMode) {
		GuarMode = guarMode;
	}
	public String getOthRepyGuarWay() {
		return OthRepyGuarWay;
	}
	public void setOthRepyGuarWay(String othRepyGuarWay) {
		OthRepyGuarWay = othRepyGuarWay;
	}
	public String getSecDep() {
		return SecDep;
	}
	public void setSecDep(String secDep) {
		SecDep = secDep;
	}
	public String getCtrctTxtCode() {
		return CtrctTxtCode;
	}
	public void setCtrctTxtCode(String ctrctTxtCode) {
		CtrctTxtCode = ctrctTxtCode;
	}
	public String getMcc() {
		return Mcc;
	}
	public void setMcc(String mcc) {
		Mcc = mcc;
	}
	public String getAcctStatus() {
		return AcctStatus;
	}
	public void setAcctStatus(String acctStatus) {
		AcctStatus = acctStatus;
	}
	public String getLoanAmt() {
		return LoanAmt;
	}
	public void setLoanAmt(String loanAmt) {
		LoanAmt = loanAmt;
	}
	public String getRepayPrd() {
		return RepayPrd;
	}
	public void setRepayPrd(String repayPrd) {
		RepayPrd = repayPrd;
	}
	public String getFiveCate() {
		return FiveCate;
	}
	public void setFiveCate(String fiveCate) {
		FiveCate = fiveCate;
	}
	public String getFiveCateAdjDate() {
		return FiveCateAdjDate;
	}
	public void setFiveCateAdjDate(String fiveCateAdjDate) {
		FiveCateAdjDate = fiveCateAdjDate;
	}
	public String getRiEx() {
		return RiEx;
	}
	public void setRiEx(String riEx) {
		RiEx = riEx;
	}
	public String getCompAdvFlag() {
		return CompAdvFlag;
	}
	public void setCompAdvFlag(String compAdvFlag) {
		CompAdvFlag = compAdvFlag;
	}
	public String getCloseDate() {
		return CloseDate;
	}
	public void setCloseDate(String closeDate) {
		CloseDate = closeDate;
	}
	public String getGUARACCBASEINF_FLAG() {
		return GUARACCBASEINF_FLAG;
	}
	public void setGUARACCBASEINF_FLAG(String gUARACCBASEINF_FLAG) {
		GUARACCBASEINF_FLAG = gUARACCBASEINF_FLAG;
	}
	public String getGUARACCREL_FLAG() {
		return GUARACCREL_FLAG;
	}
	public void setGUARACCREL_FLAG(String gUARACCREL_FLAG) {
		GUARACCREL_FLAG = gUARACCREL_FLAG;
	}
	public String getGUARACCMOT_FLAG() {
		return GUARACCMOT_FLAG;
	}
	public void setGUARACCMOT_FLAG(String gUARACCMOT_FLAG) {
		GUARACCMOT_FLAG = gUARACCMOT_FLAG;
	}
	public String getGUARACCMCC_FLAG() {
		return GUARACCMCC_FLAG;
	}
	public void setGUARACCMCC_FLAG(String gUARACCMCC_FLAG) {
		GUARACCMCC_FLAG = gUARACCMCC_FLAG;
	}
	public String getGUARACCAMT_FLAG() {
		return GUARACCAMT_FLAG;
	}
	public void setGUARACCAMT_FLAG(String gUARACCAMT_FLAG) {
		GUARACCAMT_FLAG = gUARACCAMT_FLAG;
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
}
