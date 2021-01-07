package com.dhcc.xml.per.entity.loaninfo.db;

import java.util.List;

public class Pb_Lnacct_Info {
	
	/**�����������Ϣ*/ 
	private String Record_Id;
	/* 1�������λ����� */
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
	/** ���������[1..1] */
	private String Name;
	/** �����֤������[1..1] */
	private String IDType;
	/** �����֤������[1..1] */
	private String IDNum;
	/** ҵ������������[1..1] */
	private String MngmtOrgCode;
	/* 2��������Ϣ�� */
	/** ���ҵ�����[1..1] */
	private String BusiLines;
	/** ���ҵ������ϸ��[1..1] */
	private String BusiDtlLines;
	/** ��������[1..1] */
	private String OpenDate;
	/** ����[1..1] */
	private String Cy;
	/** ���ö��[0..1] */
	private String AcctCredLine;
	/** �����[0..1] */
	private String LoanAmt;
	/** �ִηſ��־[0..1] */
	private String Flag;
	/** ��������[0..1] */
	private String DueDate;
	/** ���ʽ[0..1] */
	private String RepayMode;
	/** ����Ƶ��[0..1] */
	private String RepayFreqcy;
	/** ��������[0..1] */
	private String RepayPrd;
	/** ҵ�������������������[0..1] */
	private String ApplyBusiDist;
	/** ������ʽ[0..1] */
	private String GuarMode;
	/** �������֤��ʽ[0..1] */
	private String OthRepyGuarWay;
	/** �ʲ�ת�ñ�־[0..1] */
	private String AssetTrandFlag;
	/** �ʽ���Դ[0..1] */
	private String FundSou;
	/** �������ʽ[0..1] */
	private String LoanForm;
	/** ��Ƭ��ʶ��[0..1] */
	private String CreditID;
	/** �����ͬ���[0..1] */
	private String LoanConCode;
	/** �Ƿ�Ϊ����ס������[0..1] */
	private String FirstHouLoanFlag;
	/* 3�����Ŷ����Ϣ�� */
	/** ����Э���ʶ��*/
	private String Mcc;
	/* 4����ʼծȨ˵���� */
	/** ��ʼծȨ������[1..1] */
	private String InitCredName;
	/** ��ʼծȨ�˻�������[1..1] */
	private String InitCredOrgNm;
	/** ԭծ������[1..1] */
	private String OrigDbtCate;
	/** ծȨת��ʱ�Ļ���״̬[1..1] */
	private String InitRpySts;
	
	private String LNACCTBASE_FLAG;
	private String LNACCTBASEINF_FLAG;
	private String LNACCTRLT_FLAG;
	private String LNACCTMOT_FLAG;
	private String LNACCTCCC_FLAG;
	private String LNACCTCRED_FLAG;
	private String LNACCTMONTH_FLAG;
	private String LNACCTBIG_FLAG;
	private String LNACCTDBT_FLAG;
	private String LNACCTSPC_FLAG;
	
	/**��ػ��������˶�*/
	private List<Pb_Lnacctrlt_Info> Pb_Lnacctrlt_Info_List;
	/**�¶ȱ�����Ϣ��*/
	private Pb_Lnacctmonth_Info Pb_Lnacctmonth_Info;
	/**���¶ȱ�����Ϣ��*/
	private Pb_Lnacctdbt_Info Pb_Lnacctdbt_Info;
	/**���⽻��˵����*/
	private List<Pb_Lnacctspc_Info> Pb_Lnacctspc_Info_List;
	/**����Ѻ����Ϣ��*/  
	private List<Pb_Guacct_Info> Pb_Guacct_Info_List;
	
	public Pb_Lnacct_Info() {
		super();
	}
	/**  
	 * ��ȡ lNACCTBASE_FLAG
	 * @return the lNACCTBASE_FLAG #{bare_field_comment} 
	 */
	public String getLNACCTBASE_FLAG() {
		return LNACCTBASE_FLAG;
	}
	/**  
	 * ���� lNACCTBASE_FLAG  
	 * @param lNACCTBASE_FLAG #{bare_field_comment}  
	 */
	public void setLNACCTBASE_FLAG(String lNACCTBASE_FLAG) {
		LNACCTBASE_FLAG = lNACCTBASE_FLAG;
	}
	/**  
	 * ��ȡ lNACCTBASEINF_FLAG
	 * @return the lNACCTBASEINF_FLAG #{bare_field_comment} 
	 */
	public String getLNACCTBASEINF_FLAG() {
		return LNACCTBASEINF_FLAG;
	}
	/**  
	 * ���� lNACCTBASEINF_FLAG  
	 * @param lNACCTBASEINF_FLAG #{bare_field_comment}  
	 */
	public void setLNACCTBASEINF_FLAG(String lNACCTBASEINF_FLAG) {
		LNACCTBASEINF_FLAG = lNACCTBASEINF_FLAG;
	}
	/**  
	 * ��ȡ lNACCTRLT_FLAG
	 * @return the lNACCTRLT_FLAG #{bare_field_comment} 
	 */
	public String getLNACCTRLT_FLAG() {
		return LNACCTRLT_FLAG;
	}
	/**  
	 * ���� lNACCTRLT_FLAG  
	 * @param lNACCTRLT_FLAG #{bare_field_comment}  
	 */
	public void setLNACCTRLT_FLAG(String lNACCTRLT_FLAG) {
		LNACCTRLT_FLAG = lNACCTRLT_FLAG;
	}
	/**  
	 * ��ȡ lNACCTMOT_FLAG
	 * @return the lNACCTMOT_FLAG #{bare_field_comment} 
	 */
	public String getLNACCTMOT_FLAG() {
		return LNACCTMOT_FLAG;
	}
	/**  
	 * ���� lNACCTMOT_FLAG  
	 * @param lNACCTMOT_FLAG #{bare_field_comment}  
	 */
	public void setLNACCTMOT_FLAG(String lNACCTMOT_FLAG) {
		LNACCTMOT_FLAG = lNACCTMOT_FLAG;
	}
	/**  
	 * ��ȡ lNACCTCCC_FLAG
	 * @return the lNACCTCCC_FLAG #{bare_field_comment} 
	 */
	public String getLNACCTCCC_FLAG() {
		return LNACCTCCC_FLAG;
	}
	/**  
	 * ���� lNACCTCCC_FLAG  
	 * @param lNACCTCCC_FLAG #{bare_field_comment}  
	 */
	public void setLNACCTCCC_FLAG(String lNACCTCCC_FLAG) {
		LNACCTCCC_FLAG = lNACCTCCC_FLAG;
	}
	/**  
	 * ��ȡ lNACCTCRED_FLAG
	 * @return the lNACCTCRED_FLAG #{bare_field_comment} 
	 */
	public String getLNACCTCRED_FLAG() {
		return LNACCTCRED_FLAG;
	}
	/**  
	 * ���� lNACCTCRED_FLAG  
	 * @param lNACCTCRED_FLAG #{bare_field_comment}  
	 */
	public void setLNACCTCRED_FLAG(String lNACCTCRED_FLAG) {
		LNACCTCRED_FLAG = lNACCTCRED_FLAG;
	}
	/**  
	 * ��ȡ lNACCTMONTH_FLAG
	 * @return the lNACCTMONTH_FLAG #{bare_field_comment} 
	 */
	public String getLNACCTMONTH_FLAG() {
		return LNACCTMONTH_FLAG;
	}
	/**  
	 * ���� lNACCTMONTH_FLAG  
	 * @param lNACCTMONTH_FLAG #{bare_field_comment}  
	 */
	public void setLNACCTMONTH_FLAG(String lNACCTMONTH_FLAG) {
		LNACCTMONTH_FLAG = lNACCTMONTH_FLAG;
	}
	/**  
	 * ��ȡ lNACCTBIG_FLAG
	 * @return the lNACCTBIG_FLAG #{bare_field_comment} 
	 */
	public String getLNACCTBIG_FLAG() {
		return LNACCTBIG_FLAG;
	}
	/**  
	 * ���� lNACCTBIG_FLAG  
	 * @param lNACCTBIG_FLAG #{bare_field_comment}  
	 */
	public void setLNACCTBIG_FLAG(String lNACCTBIG_FLAG) {
		LNACCTBIG_FLAG = lNACCTBIG_FLAG;
	}
	/**  
	 * ��ȡ lNACCTDBT_FLAG
	 * @return the lNACCTDBT_FLAG #{bare_field_comment} 
	 */
	public String getLNACCTDBT_FLAG() {
		return LNACCTDBT_FLAG;
	}
	/**  
	 * ���� lNACCTDBT_FLAG  
	 * @param lNACCTDBT_FLAG #{bare_field_comment}  
	 */
	public void setLNACCTDBT_FLAG(String lNACCTDBT_FLAG) {
		LNACCTDBT_FLAG = lNACCTDBT_FLAG;
	}
	/**  
	 * ��ȡ lNACCTSPC_FLAG
	 * @return the lNACCTSPC_FLAG #{bare_field_comment} 
	 */
	public String getLNACCTSPC_FLAG() {
		return LNACCTSPC_FLAG;
	}
	/**  
	 * ���� lNACCTSPC_FLAG  
	 * @param lNACCTSPC_FLAG #{bare_field_comment}  
	 */
	public void setLNACCTSPC_FLAG(String lNACCTSPC_FLAG) {
		LNACCTSPC_FLAG = lNACCTSPC_FLAG;
	}
	/**  
	 * ��ȡ infRecType
	 * @return the infRecType 1�������λ����� 
	 */
	public String getInfRecType() {
		return InfRecType;
	}
	/**  
	 * ���� infRecType  
	 * @param infRecType 1�������λ�����  
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}
	/**  
	 * ��ȡ acctType
	 * @return the acctType �˻�����[1..1] 
	 */
	public String getAcctType() {
		return AcctType;
	}
	/**  
	 * ���� acctType  
	 * @param acctType �˻�����[1..1]  
	 */
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
	/**  
	 * ��ȡ rptDate
	 * @return the rptDate ��Ϣ��������[1..1] 
	 */
	public String getRptDate() {
		return RptDate;
	}
	/**  
	 * ���� rptDate  
	 * @param rptDate ��Ϣ��������[1..1]  
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}
	/**  
	 * ��ȡ rptDateCode
	 * @return the rptDateCode ����ʱ��˵������[1..1] 
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}
	/**  
	 * ���� rptDateCode  
	 * @param rptDateCode ����ʱ��˵������[1..1]  
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}
	/**  
	 * ��ȡ name
	 * @return the name ���������[1..1] 
	 */
	public String getName() {
		return Name;
	}
	/**  
	 * ���� name  
	 * @param name ���������[1..1]  
	 */
	public void setName(String name) {
		Name = name;
	}
	/**  
	 * ��ȡ iDType
	 * @return the iDType �����֤������[1..1] 
	 */
	public String getIDType() {
		return IDType;
	}
	/**  
	 * ���� iDType  
	 * @param iDType �����֤������[1..1]  
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}
	/**  
	 * ��ȡ iDNum
	 * @return the iDNum �����֤������[1..1] 
	 */
	public String getIDNum() {
		return IDNum;
	}
	/**  
	 * ���� iDNum  
	 * @param iDNum �����֤������[1..1]  
	 */
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}
	/**  
	 * ��ȡ mngmtOrgCode
	 * @return the mngmtOrgCode ҵ������������[1..1] 
	 */
	public String getMngmtOrgCode() {
		return MngmtOrgCode;
	}
	/**  
	 * ���� mngmtOrgCode  
	 * @param mngmtOrgCode ҵ������������[1..1]  
	 */
	public void setMngmtOrgCode(String mngmtOrgCode) {
		MngmtOrgCode = mngmtOrgCode;
	}
	/**  
	 * ��ȡ busiLines
	 * @return the busiLines 2��������Ϣ�� 
	 */
	public String getBusiLines() {
		return BusiLines;
	}
	/**  
	 * ���� busiLines  
	 * @param busiLines 2��������Ϣ��  
	 */
	public void setBusiLines(String busiLines) {
		BusiLines = busiLines;
	}
	/**  
	 * ��ȡ busiDtlLines
	 * @return the busiDtlLines ���ҵ������ϸ��[1..1] 
	 */
	public String getBusiDtlLines() {
		return BusiDtlLines;
	}
	/**  
	 * ���� busiDtlLines  
	 * @param busiDtlLines ���ҵ������ϸ��[1..1]  
	 */
	public void setBusiDtlLines(String busiDtlLines) {
		BusiDtlLines = busiDtlLines;
	}
	/**  
	 * ��ȡ openDate
	 * @return the openDate ��������[1..1] 
	 */
	public String getOpenDate() {
		return OpenDate;
	}
	/**  
	 * ���� openDate  
	 * @param openDate ��������[1..1]  
	 */
	public void setOpenDate(String openDate) {
		OpenDate = openDate;
	}
	/**  
	 * ��ȡ cy
	 * @return the cy ����[1..1] 
	 */
	public String getCy() {
		return Cy;
	}
	/**  
	 * ���� cy  
	 * @param cy ����[1..1]  
	 */
	public void setCy(String cy) {
		Cy = cy;
	}
	/**  
	 * ��ȡ acctCredLine
	 * @return the acctCredLine ���ö��[0..1] 
	 */
	public String getAcctCredLine() {
		return AcctCredLine;
	}
	/**  
	 * ���� acctCredLine  
	 * @param acctCredLine ���ö��[0..1]  
	 */
	public void setAcctCredLine(String acctCredLine) {
		AcctCredLine = acctCredLine;
	}
	/**  
	 * ��ȡ loanAmt
	 * @return the loanAmt �����[0..1] 
	 */
	public String getLoanAmt() {
		return LoanAmt;
	}
	/**  
	 * ���� loanAmt  
	 * @param loanAmt �����[0..1]  
	 */
	public void setLoanAmt(String loanAmt) {
		LoanAmt = loanAmt;
	}
	/**  
	 * ��ȡ flag
	 * @return the flag �ִηſ��־[0..1] 
	 */
	public String getFlag() {
		return Flag;
	}
	/**  
	 * ���� flag  
	 * @param flag �ִηſ��־[0..1]  
	 */
	public void setFlag(String flag) {
		Flag = flag;
	}
	/**  
	 * ��ȡ dueDate
	 * @return the dueDate ��������[0..1] 
	 */
	public String getDueDate() {
		return DueDate;
	}
	/**  
	 * ���� dueDate  
	 * @param dueDate ��������[0..1]  
	 */
	public void setDueDate(String dueDate) {
		DueDate = dueDate;
	}
	/**  
	 * ��ȡ repayMode
	 * @return the repayMode ���ʽ[0..1] 
	 */
	public String getRepayMode() {
		return RepayMode;
	}
	/**  
	 * ���� repayMode  
	 * @param repayMode ���ʽ[0..1]  
	 */
	public void setRepayMode(String repayMode) {
		RepayMode = repayMode;
	}
	/**  
	 * ��ȡ repayFreqcy
	 * @return the repayFreqcy ����Ƶ��[0..1] 
	 */
	public String getRepayFreqcy() {
		return RepayFreqcy;
	}
	/**  
	 * ���� repayFreqcy  
	 * @param repayFreqcy ����Ƶ��[0..1]  
	 */
	public void setRepayFreqcy(String repayFreqcy) {
		RepayFreqcy = repayFreqcy;
	}
	/**  
	 * ��ȡ repayPrd
	 * @return the repayPrd ��������[0..1] 
	 */
	public String getRepayPrd() {
		return RepayPrd;
	}
	/**  
	 * ���� repayPrd  
	 * @param repayPrd ��������[0..1]  
	 */
	public void setRepayPrd(String repayPrd) {
		RepayPrd = repayPrd;
	}
	/**  
	 * ��ȡ applyBusiDist
	 * @return the applyBusiDist ҵ�������������������[0..1] 
	 */
	public String getApplyBusiDist() {
		return ApplyBusiDist;
	}
	/**  
	 * ���� applyBusiDist  
	 * @param applyBusiDist ҵ�������������������[0..1]  
	 */
	public void setApplyBusiDist(String applyBusiDist) {
		ApplyBusiDist = applyBusiDist;
	}
	/**  
	 * ��ȡ guarMode
	 * @return the guarMode ������ʽ[0..1] 
	 */
	public String getGuarMode() {
		return GuarMode;
	}
	/**  
	 * ���� guarMode  
	 * @param guarMode ������ʽ[0..1]  
	 */
	public void setGuarMode(String guarMode) {
		GuarMode = guarMode;
	}
	/**  
	 * ��ȡ othRepyGuarWay
	 * @return the othRepyGuarWay �������֤��ʽ[0..1] 
	 */
	public String getOthRepyGuarWay() {
		return OthRepyGuarWay;
	}
	/**  
	 * ���� othRepyGuarWay  
	 * @param othRepyGuarWay �������֤��ʽ[0..1]  
	 */
	public void setOthRepyGuarWay(String othRepyGuarWay) {
		OthRepyGuarWay = othRepyGuarWay;
	}
	/**  
	 * ��ȡ assetTrandFlag
	 * @return the assetTrandFlag �ʲ�ת�ñ�־[0..1] 
	 */
	public String getAssetTrandFlag() {
		return AssetTrandFlag;
	}
	/**  
	 * ���� assetTrandFlag  
	 * @param assetTrandFlag �ʲ�ת�ñ�־[0..1]  
	 */
	public void setAssetTrandFlag(String assetTrandFlag) {
		AssetTrandFlag = assetTrandFlag;
	}
	/**  
	 * ��ȡ fundSou
	 * @return the fundSou �ʽ���Դ[0..1] 
	 */
	public String getFundSou() {
		return FundSou;
	}
	/**  
	 * ���� fundSou  
	 * @param fundSou �ʽ���Դ[0..1]  
	 */
	public void setFundSou(String fundSou) {
		FundSou = fundSou;
	}
	/**  
	 * ��ȡ loanForm
	 * @return the loanForm �������ʽ[0..1] 
	 */
	public String getLoanForm() {
		return LoanForm;
	}
	/**  
	 * ���� loanForm  
	 * @param loanForm �������ʽ[0..1]  
	 */
	public void setLoanForm(String loanForm) {
		LoanForm = loanForm;
	}
	/**  
	 * ��ȡ creditID
	 * @return the creditID ��Ƭ��ʶ��[0..1] 
	 */
	public String getCreditID() {
		return CreditID;
	}
	/**  
	 * ���� creditID  
	 * @param creditID ��Ƭ��ʶ��[0..1]  
	 */
	public void setCreditID(String creditID) {
		CreditID = creditID;
	}
	/**  
	 * ��ȡ loanConCode
	 * @return the loanConCode �����ͬ���[0..1] 
	 */
	public String getLoanConCode() {
		return LoanConCode;
	}
	/**  
	 * ���� loanConCode  
	 * @param loanConCode �����ͬ���[0..1]  
	 */
	public void setLoanConCode(String loanConCode) {
		LoanConCode = loanConCode;
	}
	/**  
	 * ��ȡ firstHouLoanFlag
	 * @return the firstHouLoanFlag �Ƿ�Ϊ����ס������[0..1] 
	 */
	public String getFirstHouLoanFlag() {
		return FirstHouLoanFlag;
	}
	/**  
	 * ���� firstHouLoanFlag  
	 * @param firstHouLoanFlag �Ƿ�Ϊ����ס������[0..1]  
	 */
	public void setFirstHouLoanFlag(String firstHouLoanFlag) {
		FirstHouLoanFlag = firstHouLoanFlag;
	}
	/**  
	 * ��ȡ mcc
	 * @return the mcc 3�����Ŷ����Ϣ�� 
	 */
	public String getMcc() {
		return Mcc;
	}
	/**  
	 * ���� mcc  
	 * @param mcc 3�����Ŷ����Ϣ��  
	 */
	public void setMcc(String mcc) {
		Mcc = mcc;
	}
	/**  
	 * ��ȡ initCredName
	 * @return the initCredName 4����ʼծȨ˵���� 
	 */
	public String getInitCredName() {
		return InitCredName;
	}
	/**  
	 * ���� initCredName  
	 * @param initCredName 4����ʼծȨ˵����  
	 */
	public void setInitCredName(String initCredName) {
		InitCredName = initCredName;
	}
	/**  
	 * ��ȡ initCredOrgNm
	 * @return the initCredOrgNm ��ʼծȨ�˻�������[1..1] 
	 */
	public String getInitCredOrgNm() {
		return InitCredOrgNm;
	}
	/**  
	 * ���� initCredOrgNm  
	 * @param initCredOrgNm ��ʼծȨ�˻�������[1..1]  
	 */
	public void setInitCredOrgNm(String initCredOrgNm) {
		InitCredOrgNm = initCredOrgNm;
	}
	/**  
	 * ��ȡ origDbtCate
	 * @return the origDbtCate ԭծ������[1..1] 
	 */
	public String getOrigDbtCate() {
		return OrigDbtCate;
	}
	/**  
	 * ���� origDbtCate  
	 * @param origDbtCate ԭծ������[1..1]  
	 */
	public void setOrigDbtCate(String origDbtCate) {
		OrigDbtCate = origDbtCate;
	}
	/**  
	 * ��ȡ initRpySts
	 * @return the initRpySts ծȨת��ʱ�Ļ���״̬[1..1] 
	 */
	public String getInitRpySts() {
		return InitRpySts;
	}
	/**  
	 * ���� initRpySts  
	 * @param initRpySts ծȨת��ʱ�Ļ���״̬[1..1]  
	 */
	public void setInitRpySts(String initRpySts) {
		InitRpySts = initRpySts;
	}
	/**  
	 * ��ȡ pb_Lnacctrlt_Info_List
	 * @return the pb_Lnacctrlt_Info_List ��ػ��������˶� 
	 */
	public List<Pb_Lnacctrlt_Info> getPb_Lnacctrlt_Info_List() {
		return Pb_Lnacctrlt_Info_List;
	}
	/**  
	 * ���� pb_Lnacctrlt_Info_List  
	 * @param pb_Lnacctrlt_Info_List ��ػ��������˶�  
	 */
	public void setPb_Lnacctrlt_Info_List(
			List<Pb_Lnacctrlt_Info> pb_Lnacctrlt_Info_List) {
		Pb_Lnacctrlt_Info_List = pb_Lnacctrlt_Info_List;
	}
	/**  
	 * ��ȡ pb_Lnacctmonth_Info
	 * @return the pb_Lnacctmonth_Info �¶ȱ�����Ϣ�� 
	 */
	public Pb_Lnacctmonth_Info getPb_Lnacctmonth_Info() {
		return Pb_Lnacctmonth_Info;
	}
	/**  
	 * ���� pb_Lnacctmonth_Info  
	 * @param pb_Lnacctmonth_Info �¶ȱ�����Ϣ��  
	 */
	public void setPb_Lnacctmonth_Info(Pb_Lnacctmonth_Info pb_Lnacctmonth_Info) {
		Pb_Lnacctmonth_Info = pb_Lnacctmonth_Info;
	}
	/**  
	 * ��ȡ pb_Lnacctdbt_Info
	 * @return the pb_Lnacctdbt_Info ���¶ȱ�����Ϣ�� 
	 */
	public Pb_Lnacctdbt_Info getPb_Lnacctdbt_Info() {
		return Pb_Lnacctdbt_Info;
	}
	/**  
	 * ���� pb_Lnacctdbt_Info  
	 * @param pb_Lnacctdbt_Info ���¶ȱ�����Ϣ��  
	 */
	public void setPb_Lnacctdbt_Info(Pb_Lnacctdbt_Info pb_Lnacctdbt_Info) {
		Pb_Lnacctdbt_Info = pb_Lnacctdbt_Info;
	}
	/**  
	 * ��ȡ pb_Lnacctspc_Info_List
	 * @return the pb_Lnacctspc_Info_List ���⽻��˵���� 
	 */
	public List<Pb_Lnacctspc_Info> getPb_Lnacctspc_Info_List() {
		return Pb_Lnacctspc_Info_List;
	}
	/**  
	 * ���� pb_Lnacctspc_Info_List  
	 * @param pb_Lnacctspc_Info_List ���⽻��˵����  
	 */
	public void setPb_Lnacctspc_Info_List(
			List<Pb_Lnacctspc_Info> pb_Lnacctspc_Info_List) {
		Pb_Lnacctspc_Info_List = pb_Lnacctspc_Info_List;
	}
	/**  
	 * ��ȡ pb_Guacct_Info_List
	 * @return the pb_Guacct_Info_List ����Ѻ����Ϣ�� 
	 */
	public List<Pb_Guacct_Info> getPb_Guacct_Info_List() {
		return Pb_Guacct_Info_List;
	}
	/**  
	 * ���� pb_Guacct_Info_List  
	 * @param pb_Guacct_Info_List ����Ѻ����Ϣ��  
	 */
	public void setPb_Guacct_Info_List(List<Pb_Guacct_Info> pb_Guacct_Info_List) {
		Pb_Guacct_Info_List = pb_Guacct_Info_List;
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
