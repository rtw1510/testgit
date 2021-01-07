package com.dhcc.xml.per.entity.guarantee.db;

import java.util.List;

/**
 * Title: Pb_LnsecAcct_Info<br/>
 * Description: ���˵����˻���Ϣ��<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-8-8
 */
public class Pb_LnsecAcct_Info {
	/**�����������Ϣ*/ 
	private String Record_Id;
	/** ��Ϣ��¼����[1..1] */
	private String InfRecType;
	/** �˻�����[1..1] */
	private String AcctType;
	/** �˻���ʶ��[1..1] */
	private String AcctCode;
	/** ��Ϣ��������[1..1] */
	private String RptDate;
	/** ����ʱ��˵������[1..1] */
	private String RptDateCode;
	/** ծ��������[1..1] */
	private String Name;
	/** ծ����֤������[1..1] */
	private String IDType;
	/** ծ����֤������[1..1] */
	private String IDNum;
	/** ҵ������������[1..1] */
	private String MngmtOrgCode;
	/** ����ҵ�����[1..1] */
	private String BusiLines;
	/** ����ҵ������ϸ��[1..1] */
	private String BusiDtilLines;
	/** ��������[1..1] */
	private String OpenDate;
	/** ���ö��[1..1] */
	private String AcctCredLine;
	/** ����[1..1] */
	private String Cy;
	/** ��������[1..1] */
	private String DueDate;
	/** ��������ʽ[1..1] */
	private String GuarMode;
	/** �������֤��ʽ[1..1] */
	private String OthRepyGuarWay;
	/** ��֤��ٷֱ�[1..1] */
	private String SecDep;
	/** ������ͬ�ı����[1..1] */
	private String CtrctTxtCd;
	/** �˻�״̬[1..1] */
	private String AcctStatus;
	/** �ڱ����[1..1] */
	private String LoanAmt;
	/** ���仯����[1..1] */
	private String RepayPrd;
	/** �弶����[1..1] */
	private String FiveCate;
	/** �弶�����϶�����[1..1] */
	private String FiveCateAdjDate;
	/** ���ճ���[1..1] */
	private String RiEx;
	/** ����������ʶ[1..1] */
	private String CompAdvFlag;
	/** �˻��ر�����[1..1] */
	private String CloseDate;

	/** ������Ϣ���ϱ���ʶ */
	private String LNSECACCTBASEINF_FLAG;
	/** ��ػ��������˶��ϱ���־ */
	private String LNSECACCTREL_FLAG;
	/** �ڱ�������Ϣ���ϱ���־ */
	private String LNSECACCTAMT_FLAG;
	/** ����Ѻ����Ϣ���ϱ���־ */
	private String LNSECACCTMOT_FLAG;
	
	/** ��ػ��������˶�*/  
	private List<Pb_LnsecAcctRel_Info> Pb_LnsecAcctRel_Info_List;
	/** ����Ѻ��ͬ��Ϣ*/  
	private List<Pb_Guacct_Info> Pb_Guacct_Info_List; 

	public Pb_LnsecAcct_Info() {
		super();
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

	/**
	 * ��ȡ infRecType
	 * 
	 * @return the infRecType ��Ϣ��¼����[1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * ���� infRecType
	 * 
	 * @param infRecType
	 *            ��Ϣ��¼����[1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * ��ȡ acctType
	 * 
	 * @return the acctType �˻�����[1..1]
	 */
	public String getAcctType() {
		return AcctType;
	}

	/**
	 * ���� acctType
	 * 
	 * @param acctType
	 *            �˻�����[1..1]
	 */
	public void setAcctType(String acctType) {
		AcctType = acctType;
	}

	/**
	 * ��ȡ acctCode
	 * 
	 * @return the acctCode �˻���ʶ��[1..1]
	 */
	public String getAcctCode() {
		return AcctCode;
	}

	/**
	 * ���� acctCode
	 * 
	 * @param acctCode
	 *            �˻���ʶ��[1..1]
	 */
	public void setAcctCode(String acctCode) {
		AcctCode = acctCode;
	}

	/**
	 * ��ȡ rptDate
	 * 
	 * @return the rptDate ��Ϣ��������[1..1]
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * ���� rptDate
	 * 
	 * @param rptDate
	 *            ��Ϣ��������[1..1]
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	/**
	 * ��ȡ rptDateCode
	 * 
	 * @return the rptDateCode ����ʱ��˵������[1..1]
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}

	/**
	 * ���� rptDateCode
	 * 
	 * @param rptDateCode
	 *            ����ʱ��˵������[1..1]
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}

	/**
	 * ��ȡ name
	 * 
	 * @return the name ծ��������[1..1]
	 */
	public String getName() {
		return Name;
	}

	/**
	 * ���� name
	 * 
	 * @param name
	 *            ծ��������[1..1]
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * ��ȡ iDType
	 * 
	 * @return the iDType ծ����֤������[1..1]
	 */
	public String getIDType() {
		return IDType;
	}

	/**
	 * ���� iDType
	 * 
	 * @param iDType
	 *            ծ����֤������[1..1]
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}

	/**
	 * ��ȡ iDNum
	 * 
	 * @return the iDNum ծ����֤������[1..1]
	 */
	public String getIDNum() {
		return IDNum;
	}

	/**
	 * ���� iDNum
	 * 
	 * @param iDNum
	 *            ծ����֤������[1..1]
	 */
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}

	/**
	 * ��ȡ mngmtOrgCode
	 * 
	 * @return the mngmtOrgCode ҵ������������[1..1]
	 */
	public String getMngmtOrgCode() {
		return MngmtOrgCode;
	}

	/**
	 * ���� mngmtOrgCode
	 * 
	 * @param mngmtOrgCode
	 *            ҵ������������[1..1]
	 */
	public void setMngmtOrgCode(String mngmtOrgCode) {
		MngmtOrgCode = mngmtOrgCode;
	}

	/**
	 * ��ȡ busiLines
	 * 
	 * @return the busiLines ����ҵ�����[1..1]
	 */
	public String getBusiLines() {
		return BusiLines;
	}

	/**
	 * ���� busiLines
	 * 
	 * @param busiLines
	 *            ����ҵ�����[1..1]
	 */
	public void setBusiLines(String busiLines) {
		BusiLines = busiLines;
	}

	/**
	 * ��ȡ busiDtilLines
	 * 
	 * @return the busiDtilLines ����ҵ������ϸ��[1..1]
	 */
	public String getBusiDtilLines() {
		return BusiDtilLines;
	}

	/**
	 * ���� busiDtilLines
	 * 
	 * @param busiDtilLines
	 *            ����ҵ������ϸ��[1..1]
	 */
	public void setBusiDtilLines(String busiDtilLines) {
		BusiDtilLines = busiDtilLines;
	}

	/**
	 * ��ȡ openDate
	 * 
	 * @return the openDate ��������[1..1]
	 */
	public String getOpenDate() {
		return OpenDate;
	}

	/**
	 * ���� openDate
	 * 
	 * @param openDate
	 *            ��������[1..1]
	 */
	public void setOpenDate(String openDate) {
		OpenDate = openDate;
	}

	/**
	 * ��ȡ acctCredLine
	 * 
	 * @return the acctCredLine ���ö��[1..1]
	 */
	public String getAcctCredLine() {
		return AcctCredLine;
	}

	/**
	 * ���� acctCredLine
	 * 
	 * @param acctCredLine
	 *            ���ö��[1..1]
	 */
	public void setAcctCredLine(String acctCredLine) {
		AcctCredLine = acctCredLine;
	}

	/**
	 * ��ȡ cy
	 * 
	 * @return the cy ����[1..1]
	 */
	public String getCy() {
		return Cy;
	}

	/**
	 * ���� cy
	 * 
	 * @param cy
	 *            ����[1..1]
	 */
	public void setCy(String cy) {
		Cy = cy;
	}

	/**
	 * ��ȡ dueDate
	 * 
	 * @return the dueDate ��������[1..1]
	 */
	public String getDueDate() {
		return DueDate;
	}

	/**
	 * ���� dueDate
	 * 
	 * @param dueDate
	 *            ��������[1..1]
	 */
	public void setDueDate(String dueDate) {
		DueDate = dueDate;
	}

	/**
	 * ��ȡ guarMode
	 * 
	 * @return the guarMode ��������ʽ[1..1]
	 */
	public String getGuarMode() {
		return GuarMode;
	}

	/**
	 * ���� guarMode
	 * 
	 * @param guarMode
	 *            ��������ʽ[1..1]
	 */
	public void setGuarMode(String guarMode) {
		GuarMode = guarMode;
	}

	/**
	 * ��ȡ othRepyGuarWay
	 * 
	 * @return the othRepyGuarWay �������֤��ʽ[1..1]
	 */
	public String getOthRepyGuarWay() {
		return OthRepyGuarWay;
	}

	/**
	 * ���� othRepyGuarWay
	 * 
	 * @param othRepyGuarWay
	 *            �������֤��ʽ[1..1]
	 */
	public void setOthRepyGuarWay(String othRepyGuarWay) {
		OthRepyGuarWay = othRepyGuarWay;
	}

	/**
	 * ��ȡ secDep
	 * 
	 * @return the secDep ��֤��ٷֱ�[1..1]
	 */
	public String getSecDep() {
		return SecDep;
	}

	/**
	 * ���� secDep
	 * 
	 * @param secDep
	 *            ��֤��ٷֱ�[1..1]
	 */
	public void setSecDep(String secDep) {
		SecDep = secDep;
	}

	/**
	 * ��ȡ ctrctTxtCd
	 * 
	 * @return the ctrctTxtCd ������ͬ�ı����[1..1]
	 */
	public String getCtrctTxtCd() {
		return CtrctTxtCd;
	}

	/**
	 * ���� ctrctTxtCd
	 * 
	 * @param ctrctTxtCd
	 *            ������ͬ�ı����[1..1]
	 */
	public void setCtrctTxtCd(String ctrctTxtCd) {
		CtrctTxtCd = ctrctTxtCd;
	}

	/**
	 * ��ȡ acctStatus
	 * 
	 * @return the acctStatus �˻�״̬[1..1]
	 */
	public String getAcctStatus() {
		return AcctStatus;
	}

	/**
	 * ���� acctStatus
	 * 
	 * @param acctStatus
	 *            �˻�״̬[1..1]
	 */
	public void setAcctStatus(String acctStatus) {
		AcctStatus = acctStatus;
	}

	/**
	 * ��ȡ loanAmt
	 * 
	 * @return the loanAmt �ڱ����[1..1]
	 */
	public String getLoanAmt() {
		return LoanAmt;
	}

	/**
	 * ���� loanAmt
	 * 
	 * @param loanAmt
	 *            �ڱ����[1..1]
	 */
	public void setLoanAmt(String loanAmt) {
		LoanAmt = loanAmt;
	}

	/**
	 * ��ȡ repayPrd
	 * 
	 * @return the repayPrd ���仯����[1..1]
	 */
	public String getRepayPrd() {
		return RepayPrd;
	}

	/**
	 * ���� repayPrd
	 * 
	 * @param repayPrd
	 *            ���仯����[1..1]
	 */
	public void setRepayPrd(String repayPrd) {
		RepayPrd = repayPrd;
	}

	/**
	 * ��ȡ fiveCate
	 * 
	 * @return the fiveCate �弶����[1..1]
	 */
	public String getFiveCate() {
		return FiveCate;
	}

	/**
	 * ���� fiveCate
	 * 
	 * @param fiveCate
	 *            �弶����[1..1]
	 */
	public void setFiveCate(String fiveCate) {
		FiveCate = fiveCate;
	}

	/**
	 * ��ȡ fiveCateAdjDate
	 * 
	 * @return the fiveCateAdjDate �弶�����϶�����[1..1]
	 */
	public String getFiveCateAdjDate() {
		return FiveCateAdjDate;
	}

	/**
	 * ���� fiveCateAdjDate
	 * 
	 * @param fiveCateAdjDate
	 *            �弶�����϶�����[1..1]
	 */
	public void setFiveCateAdjDate(String fiveCateAdjDate) {
		FiveCateAdjDate = fiveCateAdjDate;
	}

	/**
	 * ��ȡ riEx
	 * 
	 * @return the riEx ���ճ���[1..1]
	 */
	public String getRiEx() {
		return RiEx;
	}

	/**
	 * ���� riEx
	 * 
	 * @param riEx
	 *            ���ճ���[1..1]
	 */
	public void setRiEx(String riEx) {
		RiEx = riEx;
	}

	/**
	 * ��ȡ compAdvFlag
	 * 
	 * @return the compAdvFlag ����������ʶ[1..1]
	 */
	public String getCompAdvFlag() {
		return CompAdvFlag;
	}

	/**
	 * ���� compAdvFlag
	 * 
	 * @param compAdvFlag
	 *            ����������ʶ[1..1]
	 */
	public void setCompAdvFlag(String compAdvFlag) {
		CompAdvFlag = compAdvFlag;
	}

	/**
	 * ��ȡ closeDate
	 * 
	 * @return the closeDate �˻��ر�����[1..1]
	 */
	public String getCloseDate() {
		return CloseDate;
	}

	/**
	 * ���� closeDate
	 * 
	 * @param closeDate
	 *            �˻��ر�����[1..1]
	 */
	public void setCloseDate(String closeDate) {
		CloseDate = closeDate;
	}

	/**
	 * ��ȡ lNSECACCTBASEINF_FLAG
	 * 
	 * @return the lNSECACCTBASEINF_FLAG ������Ϣ���ϱ���ʶ
	 */
	public String getLNSECACCTBASEINF_FLAG() {
		return LNSECACCTBASEINF_FLAG;
	}

	/**
	 * ���� lNSECACCTBASEINF_FLAG
	 * 
	 * @param lNSECACCTBASEINF_FLAG
	 *            ������Ϣ���ϱ���ʶ
	 */
	public void setLNSECACCTBASEINF_FLAG(String lNSECACCTBASEINFFLAG) {
		LNSECACCTBASEINF_FLAG = lNSECACCTBASEINFFLAG;
	}

	/**
	 * ��ȡ lNSECACCTREL_FLAG
	 * 
	 * @return the lNSECACCTREL_FLAG ��ػ��������˶��ϱ���־
	 */
	public String getLNSECACCTREL_FLAG() {
		return LNSECACCTREL_FLAG;
	}

	/**
	 * ���� lNSECACCTREL_FLAG
	 * 
	 * @param lNSECACCTREL_FLAG
	 *            ��ػ��������˶��ϱ���־
	 */
	public void setLNSECACCTREL_FLAG(String lNSECACCTRELFLAG) {
		LNSECACCTREL_FLAG = lNSECACCTRELFLAG;
	}

	/**
	 * ��ȡ lNSECACCTAMT_FLAG
	 * 
	 * @return the lNSECACCTAMT_FLAG �ڱ�������Ϣ���ϱ���־
	 */
	public String getLNSECACCTAMT_FLAG() {
		return LNSECACCTAMT_FLAG;
	}

	/**
	 * ���� lNSECACCTAMT_FLAG
	 * 
	 * @param lNSECACCTAMT_FLAG
	 *            �ڱ�������Ϣ���ϱ���־
	 */
	public void setLNSECACCTAMT_FLAG(String lNSECACCTAMTFLAG) {
		LNSECACCTAMT_FLAG = lNSECACCTAMTFLAG;
	}

	/**
	 * ��ȡ lNSECACCTMOT_FLAG
	 * 
	 * @return the lNSECACCTMOT_FLAG ����Ѻ����Ϣ���ϱ���־
	 */
	public String getLNSECACCTMOT_FLAG() {
		return LNSECACCTMOT_FLAG;
	}

	/**
	 * ���� lNSECACCTMOT_FLAG
	 * 
	 * @param lNSECACCTMOT_FLAG
	 *            ����Ѻ����Ϣ���ϱ���־
	 */
	public void setLNSECACCTMOT_FLAG(String lNSECACCTMOTFLAG) {
		LNSECACCTMOT_FLAG = lNSECACCTMOTFLAG;
	}
	/**  
	 * ��ȡ pb_LnsecAcctRel_Info_List
	 * @return the pb_LnsecAcctRel_Info_List ��ػ��������˶� 
	 */
	public List<Pb_LnsecAcctRel_Info> getPb_LnsecAcctRel_Info_List() {
		return Pb_LnsecAcctRel_Info_List;
	}
	/**  
	 * ���� pb_LnsecAcctRel_Info_List  
	 * @param pb_LnsecAcctRel_Info_List ��ػ��������˶�  
	 */
	public void setPb_LnsecAcctRel_Info_List(
			List<Pb_LnsecAcctRel_Info> pb_LnsecAcctRel_Info_List) {
		Pb_LnsecAcctRel_Info_List = pb_LnsecAcctRel_Info_List;
	}

	/**  
	 * ��ȡ pb_Guacct_Info_List
	 * @return the pb_Guacct_Info_List ����Ѻ��ͬ��Ϣ 
	 */
	public List<Pb_Guacct_Info> getPb_Guacct_Info_List() {
		return Pb_Guacct_Info_List;
	}

	/**  
	 * ���� pb_Guacct_Info_List  
	 * @param pb_Guacct_Info_List ����Ѻ��ͬ��Ϣ  
	 */
	public void setPb_Guacct_Info_List(List<Pb_Guacct_Info> pb_Guacct_Info_List) {
		Pb_Guacct_Info_List = pb_Guacct_Info_List;
	}
}
