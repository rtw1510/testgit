package com.dhcc.xml.ent.entity.guarantee.db;

import java.util.List;

/**  
  * Title: Eb_GuarAcc_Info<br/>  
  * Description: ��ҵ�����˻���¼<br/>  
  * @author ChenJingYuan  
  * @date 2020-4-18  
  */  
public class Eb_GuarAcc_Info {
	/**�����������Ϣ*/ 
	private String Record_Id;
	/**
	 *��Ϣ��¼����[1..1]
	 */
	private String InfRecType;
	/**
	 *�˻�����[1..1]
	 */
	private String AcctType;
	/**
	 *�˻���ʶ��[1..1]
	 */
	private String AcctCode;
	/**
	 *��Ϣ��������[1..1]
	 */
	private String RptDate;
	/**
	 *����ʱ��˵������[1..1]
	 */
	private String RptDateCode;
	/**
	 *ծ��������[1..1]
	 */
	private String Name;
	/**
	 *ծ������ݱ�ʶ����[1..1]
	 */
	private String IDType;
	/**
	 *ծ������ݱ�ʶ����[1..1]
	 */
	private String IDNum;
	/**
	 *ҵ������������[1..1]
	 */
	private String MngmtOrgCode;
	/**
	 *����ҵ�����[1..1]
	 */
	private String BusiLines;
	/**
	 *����ҵ������ϸ��1..1]
	 */
	private String BusiDtilLines;
	/**
	 *��������[1..1]
	 */
	private String OpenDate;
	/**
	 *�������[1..1]
	 */
	private String GuarAmt;
	/**
	 *����[1..1]
	 */
	private String Cy;
	/**
	 *��������[1..1]
	 */
	private String DueDate;
	/**
	 *��������ʽ[1..1]
	 */
	private String GuarMode;
	/**
	 *�������֤��ʽ[1..1]
	 */
	private String OthRepyGuarWay;
	/**
	 *��֤��ٷֱ�[1..1]
	 */
	private String SecDep;
	/**
	 *������ͬ�ı����[1..1]
	 */
	private String CtrctTxtCode;
	
	private String Mcc;
	
	/**
	 *�˻�״̬[1..1]
	 */
	private String AcctStatus;
	/**
	 *�ڱ����[1..1]
	 */
	private String LoanAmt;
	/**
	 *���仯���� [1..1]
	 */
	private String RepayPrd;
	/**
	 *�弶����[1..1]
	 */
	private String FiveCate;
	/**
	 *�弶�����϶�����[1..1]
	 */
	private String FiveCateAdjDate;
	/**
	 *���ճ���[1..1]
	 */
	private String RiEx;
	/**
	 *����������ʶ[1..1]
	 */
	private String CompAdvFlag;
	/**
	 *�˻��ر�����[1..1]
	 */
	private String CloseDate;
	
	private String GUARACCBASEINF_FLAG;
	private String GUARACCREL_FLAG;
	private String GUARACCMOT_FLAG;
	private String GUARACCMCC_FLAG;
	private String GUARACCAMT_FLAG;

	/**��ҵ�����˻���¼��ػ���������*/  
	private List<Eb_GuarAccRel_Info> Eb_GuarAccRel_Info_List;
	/** ����Ѻ��ͬ��Ϣ*/  
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
	 * ��ȡ acctCode
	 * @return the acctCode �˻���ʶ��[1..1] 
	 */
	public String getAcctCode() {
		return AcctCode;
	}
	/**  
	 * ���� acctCode  
	 * @param acctCode �˻���ʶ��[1..1]  
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
	 * ��ȡ eb_GuarAccRel_Info_List
	 * @return the eb_GuarAccRel_Info_List ��ҵ�����˻���¼��ػ��������� 
	 */
	public List<Eb_GuarAccRel_Info> getEb_GuarAccRel_Info_List() {
		return Eb_GuarAccRel_Info_List;
	}
	/**  
	 * ���� eb_GuarAccRel_Info_List  
	 * @param eb_GuarAccRel_Info_List ��ҵ�����˻���¼��ػ���������  
	 */
	public void setEb_GuarAccRel_Info_List(
			List<Eb_GuarAccRel_Info> eb_GuarAccRel_Info_List) {
		Eb_GuarAccRel_Info_List = eb_GuarAccRel_Info_List;
	}
	/**  
	 * ��ȡ eb_Guacct_Info_List
	 * @return the eb_Guacct_Info_List ����Ѻ��ͬ��Ϣ 
	 */
	public List<Eb_Guacct_Info> getEb_Guacct_Info_List() {
		return Eb_Guacct_Info_List;
	}
	/**  
	 * ���� eb_Guacct_Info_List  
	 * @param eb_Guacct_Info_List ����Ѻ��ͬ��Ϣ  
	 */
	public void setEb_Guacct_Info_List(List<Eb_Guacct_Info> eb_Guacct_Info_List) {
		Eb_Guacct_Info_List = eb_Guacct_Info_List;
	}
	/**  
	 * ��ȡ record_Id
	 * @return the record_Id �����������Ϣ 
	 */
	public String getRecord_Id() {
		return Record_Id;
	}
	/**  
	 * ���� record_Id  
	 * @param record_Id �����������Ϣ  
	 */
	public void setRecord_Id(String record_Id) {
		Record_Id = record_Id;
	}
}
