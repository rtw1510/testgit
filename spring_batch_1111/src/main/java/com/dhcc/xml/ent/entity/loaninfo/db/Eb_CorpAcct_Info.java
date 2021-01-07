package com.dhcc.xml.ent.entity.loaninfo.db;

import java.util.List;

/**
 * Title: Eb_CorpAcct_Info<br/>
 * Description: ��ҵ����˻�������Ϣ��¼���ݿ�ӳ���<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-7-24
 */
public class Eb_CorpAcct_Info {
	/**
	 *�����������Ϣ
	 */  
	private String Record_Id;
	/* 1��������*/
	/**
	 * ��Ϣ��¼���� [1..1]
	 */
	private String InfRecType;
	/**
	 * �˻����� [1..1]
	 */
	private String AcctType;
	/**
	 * �˻���ʶ�� [1..1]
	 */
	private String AcctCode;
	/**
	 * ��Ϣ�������� [1..1]
	 */
	private String RptDate;
	/**
	 * ����ʱ��˵������ [1..1]
	 */
	private String RptDateCode;
	/**
	 * ��������� [1..1]
	 */
	private String Name;
	/**
	 * �������ݱ�ʶ���� [1..1]
	 */
	private String IDType;
	/**
	 * �������ݱ�ʶ���� [1..1]
	 */
	private String IDNum;
	/**
	 * ҵ������������ [1..1]
	 */
	private String MngmtOrgCode;
	/* 2��������Ϣ��*/
	/**
	 * ���ҵ����� [1..1]
	 */
	private String BusiLines;
	/**
	 * ���ҵ������ϸ�� [1..1]
	 */
	private String BusiDtlLines;
	/**
	 * �������� [1..1]
	 */
	private String OpenDate;
	/**
	 * ���� [1..1]
	 */
	private String Cy;
	/**
	 * ���ö�� [0..1]
	 */
	private String AcctCredLine;
	/**
	 * ����� [0..1]
	 */
	private String LoanAmt;
	/**
	 * �ִηſ��־ [0..1]
	 */
	private String Flag;
	/**
	 * �������� [0..1]
	 */
	private String DueDate;
	/**
	 * ���ʽ [0..1]
	 */
	private String RepayMode;
	/**
	 * ����Ƶ�� [0..1]
	 */
	private String RepayFreqcy;
	/**
	 * ҵ������������������� [0..1]
	 */
	private String ApplyBusiDist;
	/**
	 * ������ʽ [0..1]
	 */
	private String GuarMode;
	/**
	 * �������֤��ʽ [0..1]
	 */
	private String OthRepyGuarWay;
	/**
	 * ������޷��� [0..1]
	 */
	private String LoanTimeLimCat;
	/**
	 * �������ʽ [0..1]
	 */
	private String LoaFrm;
	/**
	 * ����ʵ��Ͷ�� [0..1]
	 */
	private String ActInvest;
	/**
	 * ҵ��Ӫ���� [0..1]
	 */
	private String FundSou;
	/**
	 * �ʲ�ת�ñ�־ [0..1]
	 */
	private String AssetTrandFlag;
	/*5�����Ŷ����Ϣ��*/
	/**
	 *����Э���ʶ��
	 */
	private String Mcc;

	/**
	 * ��ʼծȨ������ [1..1]
	 */
	private String InitCredName;
	/**
	 * ��ʼծȨ�˻������� [1..1]
	 */
	private String InitCedOrgCode;
	/**
	 * ԭծ������ [1..1]
	 */
	private String OrigDbtCate;
	/**
	 * ծȨת��ʱ�Ļ���״̬ [1..1]
	 */
	private String InitRpySts;

	/**
	 *������Ϣ���ϱ���־
	 */
	private String CORPBASEINFO_FLAG;
	/**
	 *��ػ��������˶��ϱ���־
	 */
	private String CORPRLT_FLAG;
	/**
	 *����Ѻ����Ϣ���ϱ���־
	 */
	private String CORPCCC_FLAG;
	/**
	 *���Ŷ����Ϣ���ϱ���־
	 */
	private String CORPMCC_FLAG;
	/**
	 *��ʼծȨ˵�����ϱ���־
	 */
	private String CORPCRED_FLAG;
	/**
	 *���������Ϣ���ϱ���־
	 */
	private String CORPACCRETU_FLAG;
	/**
	 *�ض�����˵�����ϱ���־
	 */
	private String CORPACCSPEC_FLAG;
	/**��ҵ����˻��������������*/  
	private List<Eb_CorpAccRlt_Info> Eb_CorpAccRlt_Info_List;
	/**��ҵ����˻����������Ϣ*/  
	private Eb_CorpAccRetu_Info Eb_CorpAccRetu_Info;
	/**�ض�����˵����*/  
	private List<Eb_CorpAccSpec_Info> Eb_CorpAccSpec_Info_List;
	/**����Ѻ��ͬ��Ϣ*/  
	private List<Eb_Guacct_Info> Eb_Guacct_Info_List;

	public Eb_CorpAcct_Info() {
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
	 * @return the infRecType ��Ϣ��¼���� [1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * ���� infRecType
	 * 
	 * @param infRecType
	 *            ��Ϣ��¼���� [1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * ��ȡ acctType
	 * 
	 * @return the acctType �˻����� [1..1]
	 */
	public String getAcctType() {
		return AcctType;
	}

	/**
	 * ���� acctType
	 * 
	 * @param acctType
	 *            �˻����� [1..1]
	 */
	public void setAcctType(String acctType) {
		AcctType = acctType;
	}

	/**
	 * ��ȡ acctCode
	 * 
	 * @return the acctCode �˻���ʶ�� [1..1]
	 */
	public String getAcctCode() {
		return AcctCode;
	}

	/**
	 * ���� acctCode
	 * 
	 * @param acctCode
	 *            �˻���ʶ�� [1..1]
	 */
	public void setAcctCode(String acctCode) {
		AcctCode = acctCode;
	}

	/**
	 * ��ȡ rptDate
	 * 
	 * @return the rptDate ��Ϣ�������� [1..1]
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * ���� rptDate
	 * 
	 * @param rptDate
	 *            ��Ϣ�������� [1..1]
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	/**
	 * ��ȡ rptDateCode
	 * 
	 * @return the rptDateCode ����ʱ��˵������ [1..1]
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}

	/**
	 * ���� rptDateCode
	 * 
	 * @param rptDateCode
	 *            ����ʱ��˵������ [1..1]
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}

	/**
	 * ��ȡ name
	 * 
	 * @return the name ��������� [1..1]
	 */
	public String getName() {
		return Name;
	}

	/**
	 * ���� name
	 * 
	 * @param name
	 *            ��������� [1..1]
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * ��ȡ iDType
	 * 
	 * @return the iDType �������ݱ�ʶ���� [1..1]
	 */
	public String getIDType() {
		return IDType;
	}

	/**
	 * ���� iDType
	 * 
	 * @param iDType
	 *            �������ݱ�ʶ���� [1..1]
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}

	/**
	 * ��ȡ iDNum
	 * 
	 * @return the iDNum �������ݱ�ʶ���� [1..1]
	 */
	public String getIDNum() {
		return IDNum;
	}

	/**
	 * ���� iDNum
	 * 
	 * @param iDNum
	 *            �������ݱ�ʶ���� [1..1]
	 */
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}

	/**
	 * ��ȡ mngmtOrgCode
	 * 
	 * @return the mngmtOrgCode ҵ������������ [1..1]
	 */
	public String getMngmtOrgCode() {
		return MngmtOrgCode;
	}

	/**
	 * ���� mngmtOrgCode
	 * 
	 * @param mngmtOrgCode
	 *            ҵ������������ [1..1]
	 */
	public void setMngmtOrgCode(String mngmtOrgCode) {
		MngmtOrgCode = mngmtOrgCode;
	}

	/**
	 * ��ȡ busiLines
	 * 
	 * @return the busiLines ���ҵ����� [1..1]
	 */
	public String getBusiLines() {
		return BusiLines;
	}

	/**
	 * ���� busiLines
	 * 
	 * @param busiLines
	 *            ���ҵ����� [1..1]
	 */
	public void setBusiLines(String busiLines) {
		BusiLines = busiLines;
	}

	/**
	 * ��ȡ busiDtlLines
	 * 
	 * @return the busiDtlLines ���ҵ������ϸ�� [1..1]
	 */
	public String getBusiDtlLines() {
		return BusiDtlLines;
	}

	/**
	 * ���� busiDtlLines
	 * 
	 * @param busiDtlLines
	 *            ���ҵ������ϸ�� [1..1]
	 */
	public void setBusiDtlLines(String busiDtlLines) {
		BusiDtlLines = busiDtlLines;
	}

	/**
	 * ��ȡ openDate
	 * 
	 * @return the openDate �������� [1..1]
	 */
	public String getOpenDate() {
		return OpenDate;
	}

	/**
	 * ���� openDate
	 * 
	 * @param openDate
	 *            �������� [1..1]
	 */
	public void setOpenDate(String openDate) {
		OpenDate = openDate;
	}

	/**
	 * ��ȡ cy
	 * 
	 * @return the cy ���� [1..1]
	 */
	public String getCy() {
		return Cy;
	}

	/**
	 * ���� cy
	 * 
	 * @param cy
	 *            ���� [1..1]
	 */
	public void setCy(String cy) {
		Cy = cy;
	}

	/**
	 * ��ȡ acctCredLine
	 * 
	 * @return the acctCredLine ���ö�� [0..1]
	 */
	public String getAcctCredLine() {
		return AcctCredLine;
	}

	/**
	 * ���� acctCredLine
	 * 
	 * @param acctCredLine
	 *            ���ö�� [0..1]
	 */
	public void setAcctCredLine(String acctCredLine) {
		AcctCredLine = acctCredLine;
	}

	/**
	 * ��ȡ loanAmt
	 * 
	 * @return the loanAmt ����� [0..1]
	 */
	public String getLoanAmt() {
		return LoanAmt;
	}

	/**
	 * ���� loanAmt
	 * 
	 * @param loanAmt
	 *            ����� [0..1]
	 */
	public void setLoanAmt(String loanAmt) {
		LoanAmt = loanAmt;
	}

	/**
	 * ��ȡ flag
	 * 
	 * @return the flag �ִηſ��־ [0..1]
	 */
	public String getFlag() {
		return Flag;
	}

	/**
	 * ���� flag
	 * 
	 * @param flag
	 *            �ִηſ��־ [0..1]
	 */
	public void setFlag(String flag) {
		Flag = flag;
	}

	/**
	 * ��ȡ dueDate
	 * 
	 * @return the dueDate �������� [0..1]
	 */
	public String getDueDate() {
		return DueDate;
	}

	/**
	 * ���� dueDate
	 * 
	 * @param dueDate
	 *            �������� [0..1]
	 */
	public void setDueDate(String dueDate) {
		DueDate = dueDate;
	}

	/**
	 * ��ȡ repayMode
	 * 
	 * @return the repayMode ���ʽ [0..1]
	 */
	public String getRepayMode() {
		return RepayMode;
	}

	/**
	 * ���� repayMode
	 * 
	 * @param repayMode
	 *            ���ʽ [0..1]
	 */
	public void setRepayMode(String repayMode) {
		RepayMode = repayMode;
	}

	/**
	 * ��ȡ repayFreqcy
	 * 
	 * @return the repayFreqcy ����Ƶ�� [0..1]
	 */
	public String getRepayFreqcy() {
		return RepayFreqcy;
	}

	/**
	 * ���� repayFreqcy
	 * 
	 * @param repayFreqcy
	 *            ����Ƶ�� [0..1]
	 */
	public void setRepayFreqcy(String repayFreqcy) {
		RepayFreqcy = repayFreqcy;
	}

	/**
	 * ��ȡ applyBusiDist
	 * 
	 * @return the applyBusiDist ҵ������������������� [0..1]
	 */
	public String getApplyBusiDist() {
		return ApplyBusiDist;
	}

	/**
	 * ���� applyBusiDist
	 * 
	 * @param applyBusiDist
	 *            ҵ������������������� [0..1]
	 */
	public void setApplyBusiDist(String applyBusiDist) {
		ApplyBusiDist = applyBusiDist;
	}

	/**
	 * ��ȡ guarMode
	 * 
	 * @return the guarMode ������ʽ [0..1]
	 */
	public String getGuarMode() {
		return GuarMode;
	}

	/**
	 * ���� guarMode
	 * 
	 * @param guarMode
	 *            ������ʽ [0..1]
	 */
	public void setGuarMode(String guarMode) {
		GuarMode = guarMode;
	}

	/**
	 * ��ȡ othRepyGuarWay
	 * 
	 * @return the othRepyGuarWay �������֤��ʽ [0..1]
	 */
	public String getOthRepyGuarWay() {
		return OthRepyGuarWay;
	}

	/**
	 * ���� othRepyGuarWay
	 * 
	 * @param othRepyGuarWay
	 *            �������֤��ʽ [0..1]
	 */
	public void setOthRepyGuarWay(String othRepyGuarWay) {
		OthRepyGuarWay = othRepyGuarWay;
	}

	/**
	 * ��ȡ loanTimeLimCat
	 * 
	 * @return the loanTimeLimCat ������޷��� [0..1]
	 */
	public String getLoanTimeLimCat() {
		return LoanTimeLimCat;
	}

	/**
	 * ���� loanTimeLimCat
	 * 
	 * @param loanTimeLimCat
	 *            ������޷��� [0..1]
	 */
	public void setLoanTimeLimCat(String loanTimeLimCat) {
		LoanTimeLimCat = loanTimeLimCat;
	}

	/**
	 * ��ȡ loaFrm
	 * 
	 * @return the loaFrm �������ʽ [0..1]
	 */
	public String getLoaFrm() {
		return LoaFrm;
	}

	/**
	 * ���� loaFrm
	 * 
	 * @param loaFrm
	 *            �������ʽ [0..1]
	 */
	public void setLoaFrm(String loaFrm) {
		LoaFrm = loaFrm;
	}

	/**
	 * ��ȡ actInvest
	 * 
	 * @return the actInvest ����ʵ��Ͷ�� [0..1]
	 */
	public String getActInvest() {
		return ActInvest;
	}

	/**
	 * ���� actInvest
	 * 
	 * @param actInvest
	 *            ����ʵ��Ͷ�� [0..1]
	 */
	public void setActInvest(String actInvest) {
		ActInvest = actInvest;
	}

	/**
	 * ��ȡ fundSou
	 * 
	 * @return the fundSou �ʽ���Դ [0..1]
	 */
	public String getFundSou() {
		return FundSou;
	}

	/**
	 * ���� fundSou
	 * 
	 * @param fundSou
	 *            �ʽ���Դ [0..1]
	 */
	public void setFundSou(String fundSou) {
		FundSou = fundSou;
	}

	/**
	 * ��ȡ assetTrandFlag
	 * 
	 * @return the assetTrandFlag �ʲ�ת�ñ�־ [0..1]
	 */
	public String getAssetTrandFlag() {
		return AssetTrandFlag;
	}

	/**
	 * ���� assetTrandFlag
	 * 
	 * @param assetTrandFlag
	 *            �ʲ�ת�ñ�־ [0..1]
	 */
	public void setAssetTrandFlag(String assetTrandFlag) {
		AssetTrandFlag = assetTrandFlag;
	}

	/**
	 * ��ȡ mcc
	 * 
	 * @return the mcc ����Э���ʶ��
	 */
	public String getMcc() {
		return Mcc;
	}

	/**
	 * ���� mcc
	 * 
	 * @param mcc
	 *            ����Э���ʶ��
	 */
	public void setMcc(String mcc) {
		Mcc = mcc;
	}

	/**
	 * ��ȡ initCredName
	 * 
	 * @return the initCredName ��ʼծȨ������ [1..1]
	 */
	public String getInitCredName() {
		return InitCredName;
	}

	/**
	 * ���� initCredName
	 * 
	 * @param initCredName
	 *            ��ʼծȨ������ [1..1]
	 */
	public void setInitCredName(String initCredName) {
		InitCredName = initCredName;
	}

	/**
	 * ��ȡ initCedOrgCode
	 * 
	 * @return the initCedOrgCode ��ʼծȨ�˻������� [1..1]
	 */
	public String getInitCedOrgCode() {
		return InitCedOrgCode;
	}

	/**
	 * ���� initCedOrgCode
	 * 
	 * @param initCedOrgCode
	 *            ��ʼծȨ�˻������� [1..1]
	 */
	public void setInitCedOrgCode(String initCedOrgCode) {
		InitCedOrgCode = initCedOrgCode;
	}

	/**
	 * ��ȡ origDbtCate
	 * 
	 * @return the origDbtCate ԭծ������ [1..1]
	 */
	public String getOrigDbtCate() {
		return OrigDbtCate;
	}

	/**
	 * ���� origDbtCate
	 * 
	 * @param origDbtCate
	 *            ԭծ������ [1..1]
	 */
	public void setOrigDbtCate(String origDbtCate) {
		OrigDbtCate = origDbtCate;
	}

	/**
	 * ��ȡ initRpySts
	 * 
	 * @return the initRpySts ծȨת��ʱ�Ļ���״̬ [1..1]
	 */
	public String getInitRpySts() {
		return InitRpySts;
	}

	/**
	 * ���� initRpySts
	 * 
	 * @param initRpySts
	 *            ծȨת��ʱ�Ļ���״̬ [1..1]
	 */
	public void setInitRpySts(String initRpySts) {
		InitRpySts = initRpySts;
	}

	/**
	 * ��ȡ cORPBASEINFO_FLAG
	 * 
	 * @return the cORPBASEINFO_FLAG ������Ϣ���ϱ���־
	 */
	public String getCORPBASEINFO_FLAG() {
		return CORPBASEINFO_FLAG;
	}

	/**
	 * ���� cORPBASEINFO_FLAG
	 * 
	 * @param cORPBASEINFO_FLAG
	 *            ������Ϣ���ϱ���־
	 */
	public void setCORPBASEINFO_FLAG(String cORPBASEINFOFLAG) {
		CORPBASEINFO_FLAG = cORPBASEINFOFLAG;
	}

	/**
	 * ��ȡ cORPRLT_FLAG
	 * 
	 * @return the cORPRLT_FLAG ��ػ��������˶��ϱ���־
	 */
	public String getCORPRLT_FLAG() {
		return CORPRLT_FLAG;
	}

	/**
	 * ���� cORPRLT_FLAG
	 * 
	 * @param cORPRLT_FLAG
	 *            ��ػ��������˶��ϱ���־
	 */
	public void setCORPRLT_FLAG(String cORPRLTFLAG) {
		CORPRLT_FLAG = cORPRLTFLAG;
	}

	/**
	 * ��ȡ cORPCCC_FLAG
	 * 
	 * @return the cORPCCC_FLAG ����Ѻ����Ϣ���ϱ���־
	 */
	public String getCORPCCC_FLAG() {
		return CORPCCC_FLAG;
	}

	/**
	 * ���� cORPCCC_FLAG
	 * 
	 * @param cORPCCC_FLAG
	 *            ����Ѻ����Ϣ���ϱ���־
	 */
	public void setCORPCCC_FLAG(String cORPCCCFLAG) {
		CORPCCC_FLAG = cORPCCCFLAG;
	}

	/**
	 * ��ȡ cORPMCC_FLAG
	 * 
	 * @return the cORPMCC_FLAG ���Ŷ����Ϣ���ϱ���־
	 */
	public String getCORPMCC_FLAG() {
		return CORPMCC_FLAG;
	}

	/**
	 * ���� cORPMCC_FLAG
	 * 
	 * @param cORPMCC_FLAG
	 *            ���Ŷ����Ϣ���ϱ���־
	 */
	public void setCORPMCC_FLAG(String cORPMCCFLAG) {
		CORPMCC_FLAG = cORPMCCFLAG;
	}

	/**
	 * ��ȡ cORPCRED_FLAG
	 * 
	 * @return the cORPCRED_FLAG ��ʼծȨ˵�����ϱ���־
	 */
	public String getCORPCRED_FLAG() {
		return CORPCRED_FLAG;
	}

	/**
	 * ���� cORPCRED_FLAG
	 * 
	 * @param cORPCRED_FLAG
	 *            ��ʼծȨ˵�����ϱ���־
	 */
	public void setCORPCRED_FLAG(String cORPCREDFLAG) {
		CORPCRED_FLAG = cORPCREDFLAG;
	}

	/**
	 * ��ȡ cORPACCRETU_FLAG
	 * 
	 * @return the cORPACCRETU_FLAG ���������Ϣ���ϱ���־
	 */
	public String getCORPACCRETU_FLAG() {
		return CORPACCRETU_FLAG;
	}

	/**
	 * ���� cORPACCRETU_FLAG
	 * 
	 * @param cORPACCRETU_FLAG
	 *            ���������Ϣ���ϱ���־
	 */
	public void setCORPACCRETU_FLAG(String cORPACCRETUFLAG) {
		CORPACCRETU_FLAG = cORPACCRETUFLAG;
	}

	/**
	 * ��ȡ cORPACCSPEC_FLAG
	 * 
	 * @return the cORPACCSPEC_FLAG �ض�����˵�����ϱ���־
	 */
	public String getCORPACCSPEC_FLAG() {
		return CORPACCSPEC_FLAG;
	}

	/**
	 * ���� cORPACCSPEC_FLAG
	 * 
	 * @param cORPACCSPEC_FLAG
	 *            �ض�����˵�����ϱ���־
	 */
	public void setCORPACCSPEC_FLAG(String cORPACCSPECFLAG) {
		CORPACCSPEC_FLAG = cORPACCSPECFLAG;
	}

	/**  
	 * ��ȡ eb_CorpAccRlt_Info_List
	 * @return the eb_CorpAccRlt_Info_List ��ҵ����˻�������������� 
	 */
	public List<Eb_CorpAccRlt_Info> getEb_CorpAccRlt_Info_List() {
		return Eb_CorpAccRlt_Info_List;
	}

	/**  
	 * ���� eb_CorpAccRlt_Info_List  
	 * @param eb_CorpAccRlt_Info_List ��ҵ����˻��������������  
	 */
	public void setEb_CorpAccRlt_Info_List(
			List<Eb_CorpAccRlt_Info> eb_CorpAccRlt_Info_List) {
		Eb_CorpAccRlt_Info_List = eb_CorpAccRlt_Info_List;
	}

	/**  
	 * ��ȡ eb_CorpAccRetu_Info
	 * @return the eb_CorpAccRetu_Info ��ҵ����˻����������Ϣ 
	 */
	public Eb_CorpAccRetu_Info getEb_CorpAccRetu_Info() {
		return Eb_CorpAccRetu_Info;
	}

	/**  
	 * ���� eb_CorpAccRetu_Info  
	 * @param eb_CorpAccRetu_Info ��ҵ����˻����������Ϣ  
	 */
	public void setEb_CorpAccRetu_Info(Eb_CorpAccRetu_Info eb_CorpAccRetu_Info) {
		Eb_CorpAccRetu_Info = eb_CorpAccRetu_Info;
	}

	/**  
	 * ��ȡ eb_CorpAccSpec_Info_List
	 * @return the eb_CorpAccSpec_Info_List �ض�����˵���� 
	 */
	public List<Eb_CorpAccSpec_Info> getEb_CorpAccSpec_Info_List() {
		return Eb_CorpAccSpec_Info_List;
	}

	/**  
	 * ���� eb_CorpAccSpec_Info_List  
	 * @param eb_CorpAccSpec_Info_List �ض�����˵����  
	 */
	public void setEb_CorpAccSpec_Info_List(
			List<Eb_CorpAccSpec_Info> eb_CorpAccSpec_Info_List) {
		Eb_CorpAccSpec_Info_List = eb_CorpAccSpec_Info_List;
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
}
