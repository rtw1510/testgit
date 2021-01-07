package com.dhcc.xml.ent.entity.loaninfo.db;

import java.util.List;

/**
 * Title: Eb_CorpAcct_Info<br/>
 * Description: 企业借贷账户基本信息记录数据库映射表<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-7-24
 */
public class Eb_CorpAcct_Info {
	/**
	 *主表的主键信息
	 */  
	private String Record_Id;
	/* 1、基础段*/
	/**
	 * 信息记录类型 [1..1]
	 */
	private String InfRecType;
	/**
	 * 账户类型 [1..1]
	 */
	private String AcctType;
	/**
	 * 账户标识码 [1..1]
	 */
	private String AcctCode;
	/**
	 * 信息报告日期 [1..1]
	 */
	private String RptDate;
	/**
	 * 报告时点说明代码 [1..1]
	 */
	private String RptDateCode;
	/**
	 * 借款人名称 [1..1]
	 */
	private String Name;
	/**
	 * 借款人身份标识类型 [1..1]
	 */
	private String IDType;
	/**
	 * 借款人身份标识号码 [1..1]
	 */
	private String IDNum;
	/**
	 * 业务管理机构代码 [1..1]
	 */
	private String MngmtOrgCode;
	/* 2、基本信息段*/
	/**
	 * 借贷业务大类 [1..1]
	 */
	private String BusiLines;
	/**
	 * 借贷业务种类细分 [1..1]
	 */
	private String BusiDtlLines;
	/**
	 * 开户日期 [1..1]
	 */
	private String OpenDate;
	/**
	 * 币种 [1..1]
	 */
	private String Cy;
	/**
	 * 信用额度 [0..1]
	 */
	private String AcctCredLine;
	/**
	 * 借款金额 [0..1]
	 */
	private String LoanAmt;
	/**
	 * 分次放款标志 [0..1]
	 */
	private String Flag;
	/**
	 * 到期日期 [0..1]
	 */
	private String DueDate;
	/**
	 * 还款方式 [0..1]
	 */
	private String RepayMode;
	/**
	 * 还款频率 [0..1]
	 */
	private String RepayFreqcy;
	/**
	 * 业务申请地行政区划代码 [0..1]
	 */
	private String ApplyBusiDist;
	/**
	 * 担保方式 [0..1]
	 */
	private String GuarMode;
	/**
	 * 其他还款保证方式 [0..1]
	 */
	private String OthRepyGuarWay;
	/**
	 * 借款期限分类 [0..1]
	 */
	private String LoanTimeLimCat;
	/**
	 * 贷款发放形式 [0..1]
	 */
	private String LoaFrm;
	/**
	 * 贷款实际投向 [0..1]
	 */
	private String ActInvest;
	/**
	 * 业务经营类型 [0..1]
	 */
	private String FundSou;
	/**
	 * 资产转让标志 [0..1]
	 */
	private String AssetTrandFlag;
	/*5、授信额度信息段*/
	/**
	 *授信协议标识码
	 */
	private String Mcc;

	/**
	 * 初始债权人名称 [1..1]
	 */
	private String InitCredName;
	/**
	 * 初始债权人机构代码 [1..1]
	 */
	private String InitCedOrgCode;
	/**
	 * 原债务种类 [1..1]
	 */
	private String OrigDbtCate;
	/**
	 * 债权转移时的还款状态 [1..1]
	 */
	private String InitRpySts;

	/**
	 *基本信息段上报标志
	 */
	private String CORPBASEINFO_FLAG;
	/**
	 *相关还款责任人段上报标志
	 */
	private String CORPRLT_FLAG;
	/**
	 *抵质押物信息段上报标志
	 */
	private String CORPCCC_FLAG;
	/**
	 *授信额度信息段上报标志
	 */
	private String CORPMCC_FLAG;
	/**
	 *初始债权说明段上报标志
	 */
	private String CORPCRED_FLAG;
	/**
	 *还款表现信息段上报标志
	 */
	private String CORPACCRETU_FLAG;
	/**
	 *特定交易说明段上报标志
	 */
	private String CORPACCSPEC_FLAG;
	/**企业借贷账户还款相关责任人*/  
	private List<Eb_CorpAccRlt_Info> Eb_CorpAccRlt_Info_List;
	/**企业借贷账户还款表现信息*/  
	private Eb_CorpAccRetu_Info Eb_CorpAccRetu_Info;
	/**特定交易说明段*/  
	private List<Eb_CorpAccSpec_Info> Eb_CorpAccSpec_Info_List;
	/**抵质押合同信息*/  
	private List<Eb_Guacct_Info> Eb_Guacct_Info_List;

	public Eb_CorpAcct_Info() {
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
	 * 
	 * @return the infRecType 信息记录类型 [1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * 设置 infRecType
	 * 
	 * @param infRecType
	 *            信息记录类型 [1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * 获取 acctType
	 * 
	 * @return the acctType 账户类型 [1..1]
	 */
	public String getAcctType() {
		return AcctType;
	}

	/**
	 * 设置 acctType
	 * 
	 * @param acctType
	 *            账户类型 [1..1]
	 */
	public void setAcctType(String acctType) {
		AcctType = acctType;
	}

	/**
	 * 获取 acctCode
	 * 
	 * @return the acctCode 账户标识码 [1..1]
	 */
	public String getAcctCode() {
		return AcctCode;
	}

	/**
	 * 设置 acctCode
	 * 
	 * @param acctCode
	 *            账户标识码 [1..1]
	 */
	public void setAcctCode(String acctCode) {
		AcctCode = acctCode;
	}

	/**
	 * 获取 rptDate
	 * 
	 * @return the rptDate 信息报告日期 [1..1]
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * 设置 rptDate
	 * 
	 * @param rptDate
	 *            信息报告日期 [1..1]
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	/**
	 * 获取 rptDateCode
	 * 
	 * @return the rptDateCode 报告时点说明代码 [1..1]
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}

	/**
	 * 设置 rptDateCode
	 * 
	 * @param rptDateCode
	 *            报告时点说明代码 [1..1]
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}

	/**
	 * 获取 name
	 * 
	 * @return the name 借款人名称 [1..1]
	 */
	public String getName() {
		return Name;
	}

	/**
	 * 设置 name
	 * 
	 * @param name
	 *            借款人名称 [1..1]
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * 获取 iDType
	 * 
	 * @return the iDType 借款人身份标识类型 [1..1]
	 */
	public String getIDType() {
		return IDType;
	}

	/**
	 * 设置 iDType
	 * 
	 * @param iDType
	 *            借款人身份标识类型 [1..1]
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}

	/**
	 * 获取 iDNum
	 * 
	 * @return the iDNum 借款人身份标识号码 [1..1]
	 */
	public String getIDNum() {
		return IDNum;
	}

	/**
	 * 设置 iDNum
	 * 
	 * @param iDNum
	 *            借款人身份标识号码 [1..1]
	 */
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}

	/**
	 * 获取 mngmtOrgCode
	 * 
	 * @return the mngmtOrgCode 业务管理机构代码 [1..1]
	 */
	public String getMngmtOrgCode() {
		return MngmtOrgCode;
	}

	/**
	 * 设置 mngmtOrgCode
	 * 
	 * @param mngmtOrgCode
	 *            业务管理机构代码 [1..1]
	 */
	public void setMngmtOrgCode(String mngmtOrgCode) {
		MngmtOrgCode = mngmtOrgCode;
	}

	/**
	 * 获取 busiLines
	 * 
	 * @return the busiLines 借贷业务大类 [1..1]
	 */
	public String getBusiLines() {
		return BusiLines;
	}

	/**
	 * 设置 busiLines
	 * 
	 * @param busiLines
	 *            借贷业务大类 [1..1]
	 */
	public void setBusiLines(String busiLines) {
		BusiLines = busiLines;
	}

	/**
	 * 获取 busiDtlLines
	 * 
	 * @return the busiDtlLines 借贷业务种类细分 [1..1]
	 */
	public String getBusiDtlLines() {
		return BusiDtlLines;
	}

	/**
	 * 设置 busiDtlLines
	 * 
	 * @param busiDtlLines
	 *            借贷业务种类细分 [1..1]
	 */
	public void setBusiDtlLines(String busiDtlLines) {
		BusiDtlLines = busiDtlLines;
	}

	/**
	 * 获取 openDate
	 * 
	 * @return the openDate 开户日期 [1..1]
	 */
	public String getOpenDate() {
		return OpenDate;
	}

	/**
	 * 设置 openDate
	 * 
	 * @param openDate
	 *            开户日期 [1..1]
	 */
	public void setOpenDate(String openDate) {
		OpenDate = openDate;
	}

	/**
	 * 获取 cy
	 * 
	 * @return the cy 币种 [1..1]
	 */
	public String getCy() {
		return Cy;
	}

	/**
	 * 设置 cy
	 * 
	 * @param cy
	 *            币种 [1..1]
	 */
	public void setCy(String cy) {
		Cy = cy;
	}

	/**
	 * 获取 acctCredLine
	 * 
	 * @return the acctCredLine 信用额度 [0..1]
	 */
	public String getAcctCredLine() {
		return AcctCredLine;
	}

	/**
	 * 设置 acctCredLine
	 * 
	 * @param acctCredLine
	 *            信用额度 [0..1]
	 */
	public void setAcctCredLine(String acctCredLine) {
		AcctCredLine = acctCredLine;
	}

	/**
	 * 获取 loanAmt
	 * 
	 * @return the loanAmt 借款金额 [0..1]
	 */
	public String getLoanAmt() {
		return LoanAmt;
	}

	/**
	 * 设置 loanAmt
	 * 
	 * @param loanAmt
	 *            借款金额 [0..1]
	 */
	public void setLoanAmt(String loanAmt) {
		LoanAmt = loanAmt;
	}

	/**
	 * 获取 flag
	 * 
	 * @return the flag 分次放款标志 [0..1]
	 */
	public String getFlag() {
		return Flag;
	}

	/**
	 * 设置 flag
	 * 
	 * @param flag
	 *            分次放款标志 [0..1]
	 */
	public void setFlag(String flag) {
		Flag = flag;
	}

	/**
	 * 获取 dueDate
	 * 
	 * @return the dueDate 到期日期 [0..1]
	 */
	public String getDueDate() {
		return DueDate;
	}

	/**
	 * 设置 dueDate
	 * 
	 * @param dueDate
	 *            到期日期 [0..1]
	 */
	public void setDueDate(String dueDate) {
		DueDate = dueDate;
	}

	/**
	 * 获取 repayMode
	 * 
	 * @return the repayMode 还款方式 [0..1]
	 */
	public String getRepayMode() {
		return RepayMode;
	}

	/**
	 * 设置 repayMode
	 * 
	 * @param repayMode
	 *            还款方式 [0..1]
	 */
	public void setRepayMode(String repayMode) {
		RepayMode = repayMode;
	}

	/**
	 * 获取 repayFreqcy
	 * 
	 * @return the repayFreqcy 还款频率 [0..1]
	 */
	public String getRepayFreqcy() {
		return RepayFreqcy;
	}

	/**
	 * 设置 repayFreqcy
	 * 
	 * @param repayFreqcy
	 *            还款频率 [0..1]
	 */
	public void setRepayFreqcy(String repayFreqcy) {
		RepayFreqcy = repayFreqcy;
	}

	/**
	 * 获取 applyBusiDist
	 * 
	 * @return the applyBusiDist 业务申请地行政区划代码 [0..1]
	 */
	public String getApplyBusiDist() {
		return ApplyBusiDist;
	}

	/**
	 * 设置 applyBusiDist
	 * 
	 * @param applyBusiDist
	 *            业务申请地行政区划代码 [0..1]
	 */
	public void setApplyBusiDist(String applyBusiDist) {
		ApplyBusiDist = applyBusiDist;
	}

	/**
	 * 获取 guarMode
	 * 
	 * @return the guarMode 担保方式 [0..1]
	 */
	public String getGuarMode() {
		return GuarMode;
	}

	/**
	 * 设置 guarMode
	 * 
	 * @param guarMode
	 *            担保方式 [0..1]
	 */
	public void setGuarMode(String guarMode) {
		GuarMode = guarMode;
	}

	/**
	 * 获取 othRepyGuarWay
	 * 
	 * @return the othRepyGuarWay 其他还款保证方式 [0..1]
	 */
	public String getOthRepyGuarWay() {
		return OthRepyGuarWay;
	}

	/**
	 * 设置 othRepyGuarWay
	 * 
	 * @param othRepyGuarWay
	 *            其他还款保证方式 [0..1]
	 */
	public void setOthRepyGuarWay(String othRepyGuarWay) {
		OthRepyGuarWay = othRepyGuarWay;
	}

	/**
	 * 获取 loanTimeLimCat
	 * 
	 * @return the loanTimeLimCat 借款期限分类 [0..1]
	 */
	public String getLoanTimeLimCat() {
		return LoanTimeLimCat;
	}

	/**
	 * 设置 loanTimeLimCat
	 * 
	 * @param loanTimeLimCat
	 *            借款期限分类 [0..1]
	 */
	public void setLoanTimeLimCat(String loanTimeLimCat) {
		LoanTimeLimCat = loanTimeLimCat;
	}

	/**
	 * 获取 loaFrm
	 * 
	 * @return the loaFrm 贷款发放形式 [0..1]
	 */
	public String getLoaFrm() {
		return LoaFrm;
	}

	/**
	 * 设置 loaFrm
	 * 
	 * @param loaFrm
	 *            贷款发放形式 [0..1]
	 */
	public void setLoaFrm(String loaFrm) {
		LoaFrm = loaFrm;
	}

	/**
	 * 获取 actInvest
	 * 
	 * @return the actInvest 贷款实际投向 [0..1]
	 */
	public String getActInvest() {
		return ActInvest;
	}

	/**
	 * 设置 actInvest
	 * 
	 * @param actInvest
	 *            贷款实际投向 [0..1]
	 */
	public void setActInvest(String actInvest) {
		ActInvest = actInvest;
	}

	/**
	 * 获取 fundSou
	 * 
	 * @return the fundSou 资金来源 [0..1]
	 */
	public String getFundSou() {
		return FundSou;
	}

	/**
	 * 设置 fundSou
	 * 
	 * @param fundSou
	 *            资金来源 [0..1]
	 */
	public void setFundSou(String fundSou) {
		FundSou = fundSou;
	}

	/**
	 * 获取 assetTrandFlag
	 * 
	 * @return the assetTrandFlag 资产转让标志 [0..1]
	 */
	public String getAssetTrandFlag() {
		return AssetTrandFlag;
	}

	/**
	 * 设置 assetTrandFlag
	 * 
	 * @param assetTrandFlag
	 *            资产转让标志 [0..1]
	 */
	public void setAssetTrandFlag(String assetTrandFlag) {
		AssetTrandFlag = assetTrandFlag;
	}

	/**
	 * 获取 mcc
	 * 
	 * @return the mcc 授信协议标识码
	 */
	public String getMcc() {
		return Mcc;
	}

	/**
	 * 设置 mcc
	 * 
	 * @param mcc
	 *            授信协议标识码
	 */
	public void setMcc(String mcc) {
		Mcc = mcc;
	}

	/**
	 * 获取 initCredName
	 * 
	 * @return the initCredName 初始债权人名称 [1..1]
	 */
	public String getInitCredName() {
		return InitCredName;
	}

	/**
	 * 设置 initCredName
	 * 
	 * @param initCredName
	 *            初始债权人名称 [1..1]
	 */
	public void setInitCredName(String initCredName) {
		InitCredName = initCredName;
	}

	/**
	 * 获取 initCedOrgCode
	 * 
	 * @return the initCedOrgCode 初始债权人机构代码 [1..1]
	 */
	public String getInitCedOrgCode() {
		return InitCedOrgCode;
	}

	/**
	 * 设置 initCedOrgCode
	 * 
	 * @param initCedOrgCode
	 *            初始债权人机构代码 [1..1]
	 */
	public void setInitCedOrgCode(String initCedOrgCode) {
		InitCedOrgCode = initCedOrgCode;
	}

	/**
	 * 获取 origDbtCate
	 * 
	 * @return the origDbtCate 原债务种类 [1..1]
	 */
	public String getOrigDbtCate() {
		return OrigDbtCate;
	}

	/**
	 * 设置 origDbtCate
	 * 
	 * @param origDbtCate
	 *            原债务种类 [1..1]
	 */
	public void setOrigDbtCate(String origDbtCate) {
		OrigDbtCate = origDbtCate;
	}

	/**
	 * 获取 initRpySts
	 * 
	 * @return the initRpySts 债权转移时的还款状态 [1..1]
	 */
	public String getInitRpySts() {
		return InitRpySts;
	}

	/**
	 * 设置 initRpySts
	 * 
	 * @param initRpySts
	 *            债权转移时的还款状态 [1..1]
	 */
	public void setInitRpySts(String initRpySts) {
		InitRpySts = initRpySts;
	}

	/**
	 * 获取 cORPBASEINFO_FLAG
	 * 
	 * @return the cORPBASEINFO_FLAG 基本信息段上报标志
	 */
	public String getCORPBASEINFO_FLAG() {
		return CORPBASEINFO_FLAG;
	}

	/**
	 * 设置 cORPBASEINFO_FLAG
	 * 
	 * @param cORPBASEINFO_FLAG
	 *            基本信息段上报标志
	 */
	public void setCORPBASEINFO_FLAG(String cORPBASEINFOFLAG) {
		CORPBASEINFO_FLAG = cORPBASEINFOFLAG;
	}

	/**
	 * 获取 cORPRLT_FLAG
	 * 
	 * @return the cORPRLT_FLAG 相关还款责任人段上报标志
	 */
	public String getCORPRLT_FLAG() {
		return CORPRLT_FLAG;
	}

	/**
	 * 设置 cORPRLT_FLAG
	 * 
	 * @param cORPRLT_FLAG
	 *            相关还款责任人段上报标志
	 */
	public void setCORPRLT_FLAG(String cORPRLTFLAG) {
		CORPRLT_FLAG = cORPRLTFLAG;
	}

	/**
	 * 获取 cORPCCC_FLAG
	 * 
	 * @return the cORPCCC_FLAG 抵质押物信息段上报标志
	 */
	public String getCORPCCC_FLAG() {
		return CORPCCC_FLAG;
	}

	/**
	 * 设置 cORPCCC_FLAG
	 * 
	 * @param cORPCCC_FLAG
	 *            抵质押物信息段上报标志
	 */
	public void setCORPCCC_FLAG(String cORPCCCFLAG) {
		CORPCCC_FLAG = cORPCCCFLAG;
	}

	/**
	 * 获取 cORPMCC_FLAG
	 * 
	 * @return the cORPMCC_FLAG 授信额度信息段上报标志
	 */
	public String getCORPMCC_FLAG() {
		return CORPMCC_FLAG;
	}

	/**
	 * 设置 cORPMCC_FLAG
	 * 
	 * @param cORPMCC_FLAG
	 *            授信额度信息段上报标志
	 */
	public void setCORPMCC_FLAG(String cORPMCCFLAG) {
		CORPMCC_FLAG = cORPMCCFLAG;
	}

	/**
	 * 获取 cORPCRED_FLAG
	 * 
	 * @return the cORPCRED_FLAG 初始债权说明段上报标志
	 */
	public String getCORPCRED_FLAG() {
		return CORPCRED_FLAG;
	}

	/**
	 * 设置 cORPCRED_FLAG
	 * 
	 * @param cORPCRED_FLAG
	 *            初始债权说明段上报标志
	 */
	public void setCORPCRED_FLAG(String cORPCREDFLAG) {
		CORPCRED_FLAG = cORPCREDFLAG;
	}

	/**
	 * 获取 cORPACCRETU_FLAG
	 * 
	 * @return the cORPACCRETU_FLAG 还款表现信息段上报标志
	 */
	public String getCORPACCRETU_FLAG() {
		return CORPACCRETU_FLAG;
	}

	/**
	 * 设置 cORPACCRETU_FLAG
	 * 
	 * @param cORPACCRETU_FLAG
	 *            还款表现信息段上报标志
	 */
	public void setCORPACCRETU_FLAG(String cORPACCRETUFLAG) {
		CORPACCRETU_FLAG = cORPACCRETUFLAG;
	}

	/**
	 * 获取 cORPACCSPEC_FLAG
	 * 
	 * @return the cORPACCSPEC_FLAG 特定交易说明段上报标志
	 */
	public String getCORPACCSPEC_FLAG() {
		return CORPACCSPEC_FLAG;
	}

	/**
	 * 设置 cORPACCSPEC_FLAG
	 * 
	 * @param cORPACCSPEC_FLAG
	 *            特定交易说明段上报标志
	 */
	public void setCORPACCSPEC_FLAG(String cORPACCSPECFLAG) {
		CORPACCSPEC_FLAG = cORPACCSPECFLAG;
	}

	/**  
	 * 获取 eb_CorpAccRlt_Info_List
	 * @return the eb_CorpAccRlt_Info_List 企业借贷账户还款相关责任人 
	 */
	public List<Eb_CorpAccRlt_Info> getEb_CorpAccRlt_Info_List() {
		return Eb_CorpAccRlt_Info_List;
	}

	/**  
	 * 设置 eb_CorpAccRlt_Info_List  
	 * @param eb_CorpAccRlt_Info_List 企业借贷账户还款相关责任人  
	 */
	public void setEb_CorpAccRlt_Info_List(
			List<Eb_CorpAccRlt_Info> eb_CorpAccRlt_Info_List) {
		Eb_CorpAccRlt_Info_List = eb_CorpAccRlt_Info_List;
	}

	/**  
	 * 获取 eb_CorpAccRetu_Info
	 * @return the eb_CorpAccRetu_Info 企业借贷账户还款表现信息 
	 */
	public Eb_CorpAccRetu_Info getEb_CorpAccRetu_Info() {
		return Eb_CorpAccRetu_Info;
	}

	/**  
	 * 设置 eb_CorpAccRetu_Info  
	 * @param eb_CorpAccRetu_Info 企业借贷账户还款表现信息  
	 */
	public void setEb_CorpAccRetu_Info(Eb_CorpAccRetu_Info eb_CorpAccRetu_Info) {
		Eb_CorpAccRetu_Info = eb_CorpAccRetu_Info;
	}

	/**  
	 * 获取 eb_CorpAccSpec_Info_List
	 * @return the eb_CorpAccSpec_Info_List 特定交易说明段 
	 */
	public List<Eb_CorpAccSpec_Info> getEb_CorpAccSpec_Info_List() {
		return Eb_CorpAccSpec_Info_List;
	}

	/**  
	 * 设置 eb_CorpAccSpec_Info_List  
	 * @param eb_CorpAccSpec_Info_List 特定交易说明段  
	 */
	public void setEb_CorpAccSpec_Info_List(
			List<Eb_CorpAccSpec_Info> eb_CorpAccSpec_Info_List) {
		Eb_CorpAccSpec_Info_List = eb_CorpAccSpec_Info_List;
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
