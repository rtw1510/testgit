package com.dhcc.xml.ent.entity.finance.db;

/**
 * Title: EB_FinaBal07_Info<br/>
 * Description:数据库映射：基础段+2007版资产负债表段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
public class EB_FinaBal07_Info {
	/* 1、基础段 */
	/**
	 *信息记录类型[1..1]
	 */
	private String InfRecType;
	/**
	 *企业名称[1..1]
	 */
	private String EntName;
	/**
	 *企业身份标识类型[1..1]
	 */
	private String EntCertType;
	/**
	 *企业身份标识号码1..1]
	 */
	private String EntCertNum;
	/**
	 *信息报告日期[1..1]
	 */
	private String RptDate;
	/**
	 *报表年份[1..1]
	 */
	private String SheetYear;
	/**
	 *报表类型[1..1]
	 */
	private String SheetType;
	/**
	 *报表类型细分[1..1]
	 */
	private String SheetTypeDivide;
	/**
	 *审计事务所名称[1..1]
	 */
	private String AuditFirmName;
	/**
	 *审计人员名称[1..1]
	 */
	private String AuditorName;
	/**
	 *审计时间[1..1]
	 */
	private String AuditTime;
	/**
	 *客户资料维护机构代码[1..1]
	 */
	private String Cimoc;
	/**
	 *报告时点说明代码[1..1]
	 */
	private String RptDateCode;
	/* 2、2007版资产负债表段 */
	/**
	 *货币资金
	 */
	private String CurrencyFunds;
	/**
	 *交易性金融资产
	 */
	private String FinancialAssetsHeldForTrading;
	/**
	 *应收票据
	 */
	private String NotesReceivable;
	/**
	 *应收账款
	 */
	private String AccountsReceivable;
	/**
	 *预付账款
	 */
	private String Prepayments;
	/**
	 *应收利息
	 */
	private String InterestReceivable;
	/**
	 *应收股利
	 */
	private String DividendsReceivable;
	/**
	 *其他应收款
	 */
	private String OtherReceivables;
	/**
	 *存货
	 */
	private String Inventories;
	/**
	 *一年内到期的非流动资产
	 */
	private String CurrentPortionOfNonCurrentAssets;
	/**
	 *其他流动资产
	 */
	private String OtherCurrentAssets;
	/**
	 *流动资产合计
	 */
	private String TotalCurrentAssets;
	/**
	 *可供出售的金融资产
	 */
	private String FinancialAssetsAvailableForSale;
	/**
	 *持有至到期投资
	 */
	private String HeldToMaturityInvestments;
	/**
	 *长期股权投资
	 */
	private String LongTermEquityInvestment;
	/**
	 *长期应收款
	 */
	private String LongTermReceivables;
	/**
	 *投资性房地产
	 */
	private String InvestmentProperties;
	/**
	 *固定资产
	 */
	private String FixedAssets;
	/**
	 *在建工程
	 */
	private String ConstructionInProgress;
	/**
	 *工程物资
	 */
	private String ConstructionMaterials;
	/**
	 *固定资产清理
	 */
	private String FixedAssetsPendingForDisposal;
	/**
	 *生产性生物资产
	 */
	private String NonCurrentBiologicalAssets;
	/**
	 *油气资产
	 */
	private String OilAndGasAssets;
	/**
	 *无形资产
	 */
	private String IntangibleAssets;
	/**
	 *开发支出
	 */
	private String DevelopmentDisbursements;
	/**
	 *商誉
	 */
	private String Goodwill;
	/**
	 *长期待摊费用
	 */
	private String LongTermDeferredExpenses;
	/**
	 *递延所得税资产
	 */
	private String DeferredTaxAssets;
	/**
	 *其他非流动资产
	 */
	private String OtherNonCurrentAssets;
	/**
	 *非流动资产合计
	 */
	private String TotalNonCurrentAssets;
	/**
	 *资产总计
	 */
	private String TotalAssets;
	/**
	 *短期借款
	 */
	private String ShortTermBorrowings;
	/**
	 *交易性金融负债
	 */
	private String FinancialLiabilitiesHeldForTrading;
	/**
	 *应付票据
	 */
	private String NotesPayable;
	/**
	 *应付账款
	 */
	private String AccountsPayable;
	/**
	 *预收账款
	 */
	private String ReceiptsInAdvance;
	/**
	 *应付利息
	 */
	private String InterestPayable;
	/**
	 *应付职工薪酬
	 */
	private String EmployeeBenefitsPayable;
	/**
	 *应交税费
	 */
	private String TaxsPayable;
	/**
	 *应付股利
	 */
	private String DividendsPayable;
	/**
	 *其他应付款
	 */
	private String OtherPayables;
	/**
	 *一年内到期的非流动负债
	 */
	private String CurrentPortionOfLongTermLiabilities;
	/**
	 *其他流动负债
	 */
	private String OtherCurrentLiabilities;
	/**
	 *流动负债合计
	 */
	private String TotalCurrentLiabilities;
	/**
	 *长期借款
	 */
	private String LongTermBorrowings;
	/**
	 *应付债券
	 */
	private String BondsPayables;
	/**
	 *长期应付款
	 */
	private String LongTermPayables;
	/**
	 *专项应付款
	 */
	private String GrantsPayable;
	/**
	 *预计负债
	 */
	private String Provisions;
	/**
	 *递延所得税负债
	 */
	private String DeferredTaxLiabilities;
	/**
	 *其他非流动负债
	 */
	private String OtherNonCurrentLiabilities;
	/**
	 *非流动负债合计
	 */
	private String TotalNonCurrentLiabilities;
	/**
	 *负债合计
	 */
	private String TotalLiabilities;
	/**
	 *实收资本（或股本）
	 */
	private String PaidInCapitalOrShareCapital;
	/**
	 *资本公积
	 */
	private String CapitalrRserve;
	/**
	 *减：库存股
	 */
	private String LessTreasuryStocks;
	/**
	 *盈余公积
	 */
	private String SurplusReserve;
	/**
	 *未分配利润
	 */
	private String UnappropriatedProfit;
	/**
	 *所有者权益合计
	 */
	private String TotalEquity;
	/**
	 *负债和所有者权益合计
	 */
	private String TotalEquityAndLiabilities;

	public EB_FinaBal07_Info() {
		super();
	}


	/**
	 * 获取 infRecType
	 * 
	 * @return the infRecType 信息记录类型[1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * 设置 infRecType
	 * 
	 * @param infRecType
	 *            信息记录类型[1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * 获取 entName
	 * 
	 * @return the entName 企业名称[1..1]
	 */
	public String getEntName() {
		return EntName;
	}

	/**
	 * 设置 entName
	 * 
	 * @param entName
	 *            企业名称[1..1]
	 */
	public void setEntName(String entName) {
		EntName = entName;
	}

	/**
	 * 获取 entCertType
	 * 
	 * @return the entCertType 企业身份标识类型[1..1]
	 */
	public String getEntCertType() {
		return EntCertType;
	}

	/**
	 * 设置 entCertType
	 * 
	 * @param entCertType
	 *            企业身份标识类型[1..1]
	 */
	public void setEntCertType(String entCertType) {
		EntCertType = entCertType;
	}

	/**
	 * 获取 entCertNum
	 * 
	 * @return the entCertNum 企业身份标识号码1..1]
	 */
	public String getEntCertNum() {
		return EntCertNum;
	}

	/**
	 * 设置 entCertNum
	 * 
	 * @param entCertNum
	 *            企业身份标识号码1..1]
	 */
	public void setEntCertNum(String entCertNum) {
		EntCertNum = entCertNum;
	}

	/**
	 * 获取 rptDate
	 * 
	 * @return the rptDate 信息报告日期[1..1]
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * 设置 rptDate
	 * 
	 * @param rptDate
	 *            信息报告日期[1..1]
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	/**
	 * 获取 sheetYear
	 * 
	 * @return the sheetYear 报表年份[1..1]
	 */
	public String getSheetYear() {
		return SheetYear;
	}

	/**
	 * 设置 sheetYear
	 * 
	 * @param sheetYear
	 *            报表年份[1..1]
	 */
	public void setSheetYear(String sheetYear) {
		SheetYear = sheetYear;
	}

	/**
	 * 获取 sheetType
	 * 
	 * @return the sheetType 报表类型[1..1]
	 */
	public String getSheetType() {
		return SheetType;
	}

	/**
	 * 设置 sheetType
	 * 
	 * @param sheetType
	 *            报表类型[1..1]
	 */
	public void setSheetType(String sheetType) {
		SheetType = sheetType;
	}

	/**
	 * 获取 sheetTypeDivide
	 * 
	 * @return the sheetTypeDivide 报表类型细分[1..1]
	 */
	public String getSheetTypeDivide() {
		return SheetTypeDivide;
	}

	/**
	 * 设置 sheetTypeDivide
	 * 
	 * @param sheetTypeDivide
	 *            报表类型细分[1..1]
	 */
	public void setSheetTypeDivide(String sheetTypeDivide) {
		SheetTypeDivide = sheetTypeDivide;
	}

	/**
	 * 获取 auditFirmName
	 * 
	 * @return the auditFirmName 审计事务所名称[1..1]
	 */
	public String getAuditFirmName() {
		return AuditFirmName;
	}

	/**
	 * 设置 auditFirmName
	 * 
	 * @param auditFirmName
	 *            审计事务所名称[1..1]
	 */
	public void setAuditFirmName(String auditFirmName) {
		AuditFirmName = auditFirmName;
	}

	/**
	 * 获取 auditorName
	 * 
	 * @return the auditorName 审计人员名称[1..1]
	 */
	public String getAuditorName() {
		return AuditorName;
	}

	/**
	 * 设置 auditorName
	 * 
	 * @param auditorName
	 *            审计人员名称[1..1]
	 */
	public void setAuditorName(String auditorName) {
		AuditorName = auditorName;
	}

	/**
	 * 获取 auditTime
	 * 
	 * @return the auditTime 审计时间[1..1]
	 */
	public String getAuditTime() {
		return AuditTime;
	}

	/**
	 * 设置 auditTime
	 * 
	 * @param auditTime
	 *            审计时间[1..1]
	 */
	public void setAuditTime(String auditTime) {
		AuditTime = auditTime;
	}

	/**
	 * 获取 cimoc
	 * 
	 * @return the cimoc 客户资料维护机构代码[1..1]
	 */
	public String getCimoc() {
		return Cimoc;
	}

	/**
	 * 设置 cimoc
	 * 
	 * @param cimoc
	 *            客户资料维护机构代码[1..1]
	 */
	public void setCimoc(String cimoc) {
		Cimoc = cimoc;
	}

	/**
	 * 获取 rptDateCode
	 * 
	 * @return the rptDateCode 报告时点说明代码[1..1]
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}

	/**
	 * 设置 rptDateCode
	 * 
	 * @param rptDateCode
	 *            报告时点说明代码[1..1]
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}

	/**
	 * 获取 currencyFunds
	 * 
	 * @return the currencyFunds 货币资金
	 */
	public String getCurrencyFunds() {
		return CurrencyFunds;
	}

	/**
	 * 设置 currencyFunds
	 * 
	 * @param currencyFunds
	 *            货币资金
	 */
	public void setCurrencyFunds(String currencyFunds) {
		CurrencyFunds = currencyFunds;
	}

	/**
	 * 获取 financialAssetsHeldForTrading
	 * 
	 * @return the financialAssetsHeldForTrading 交易性金融资产
	 */
	public String getFinancialAssetsHeldForTrading() {
		return FinancialAssetsHeldForTrading;
	}

	/**
	 * 设置 financialAssetsHeldForTrading
	 * 
	 * @param financialAssetsHeldForTrading
	 *            交易性金融资产
	 */
	public void setFinancialAssetsHeldForTrading(
			String financialAssetsHeldForTrading) {
		FinancialAssetsHeldForTrading = financialAssetsHeldForTrading;
	}

	/**
	 * 获取 notesReceivable
	 * 
	 * @return the notesReceivable 应收票据
	 */
	public String getNotesReceivable() {
		return NotesReceivable;
	}

	/**
	 * 设置 notesReceivable
	 * 
	 * @param notesReceivable
	 *            应收票据
	 */
	public void setNotesReceivable(String notesReceivable) {
		NotesReceivable = notesReceivable;
	}

	/**
	 * 获取 accountsReceivable
	 * 
	 * @return the accountsReceivable 应收账款
	 */
	public String getAccountsReceivable() {
		return AccountsReceivable;
	}

	/**
	 * 设置 accountsReceivable
	 * 
	 * @param accountsReceivable
	 *            应收账款
	 */
	public void setAccountsReceivable(String accountsReceivable) {
		AccountsReceivable = accountsReceivable;
	}

	/**
	 * 获取 prepayments
	 * 
	 * @return the prepayments 预付账款
	 */
	public String getPrepayments() {
		return Prepayments;
	}

	/**
	 * 设置 prepayments
	 * 
	 * @param prepayments
	 *            预付账款
	 */
	public void setPrepayments(String prepayments) {
		Prepayments = prepayments;
	}

	/**
	 * 获取 interestReceivable
	 * 
	 * @return the interestReceivable 应收利息
	 */
	public String getInterestReceivable() {
		return InterestReceivable;
	}

	/**
	 * 设置 interestReceivable
	 * 
	 * @param interestReceivable
	 *            应收利息
	 */
	public void setInterestReceivable(String interestReceivable) {
		InterestReceivable = interestReceivable;
	}

	/**
	 * 获取 dividendsReceivable
	 * 
	 * @return the dividendsReceivable 应收股利
	 */
	public String getDividendsReceivable() {
		return DividendsReceivable;
	}

	/**
	 * 设置 dividendsReceivable
	 * 
	 * @param dividendsReceivable
	 *            应收股利
	 */
	public void setDividendsReceivable(String dividendsReceivable) {
		DividendsReceivable = dividendsReceivable;
	}

	/**
	 * 获取 otherReceivables
	 * 
	 * @return the otherReceivables 其他应收款
	 */
	public String getOtherReceivables() {
		return OtherReceivables;
	}

	/**
	 * 设置 otherReceivables
	 * 
	 * @param otherReceivables
	 *            其他应收款
	 */
	public void setOtherReceivables(String otherReceivables) {
		OtherReceivables = otherReceivables;
	}

	/**
	 * 获取 inventories
	 * 
	 * @return the inventories 存货
	 */
	public String getInventories() {
		return Inventories;
	}

	/**
	 * 设置 inventories
	 * 
	 * @param inventories
	 *            存货
	 */
	public void setInventories(String inventories) {
		Inventories = inventories;
	}

	/**
	 * 获取 currentPortionOfNonCurrentAssets
	 * 
	 * @return the currentPortionOfNonCurrentAssets 一年内到期的非流动资产
	 */
	public String getCurrentPortionOfNonCurrentAssets() {
		return CurrentPortionOfNonCurrentAssets;
	}

	/**
	 * 设置 currentPortionOfNonCurrentAssets
	 * 
	 * @param currentPortionOfNonCurrentAssets
	 *            一年内到期的非流动资产
	 */
	public void setCurrentPortionOfNonCurrentAssets(
			String currentPortionOfNonCurrentAssets) {
		CurrentPortionOfNonCurrentAssets = currentPortionOfNonCurrentAssets;
	}

	/**
	 * 获取 otherCurrentAssets
	 * 
	 * @return the otherCurrentAssets 其他流动资产
	 */
	public String getOtherCurrentAssets() {
		return OtherCurrentAssets;
	}

	/**
	 * 设置 otherCurrentAssets
	 * 
	 * @param otherCurrentAssets
	 *            其他流动资产
	 */
	public void setOtherCurrentAssets(String otherCurrentAssets) {
		OtherCurrentAssets = otherCurrentAssets;
	}

	/**
	 * 获取 totalCurrentAssets
	 * 
	 * @return the totalCurrentAssets 流动资产合计
	 */
	public String getTotalCurrentAssets() {
		return TotalCurrentAssets;
	}

	/**
	 * 设置 totalCurrentAssets
	 * 
	 * @param totalCurrentAssets
	 *            流动资产合计
	 */
	public void setTotalCurrentAssets(String totalCurrentAssets) {
		TotalCurrentAssets = totalCurrentAssets;
	}

	/**
	 * 获取 financialAssetsAvailableForSale
	 * 
	 * @return the financialAssetsAvailableForSale 可供出售的金融资产
	 */
	public String getFinancialAssetsAvailableForSale() {
		return FinancialAssetsAvailableForSale;
	}

	/**
	 * 设置 financialAssetsAvailableForSale
	 * 
	 * @param financialAssetsAvailableForSale
	 *            可供出售的金融资产
	 */
	public void setFinancialAssetsAvailableForSale(
			String financialAssetsAvailableForSale) {
		FinancialAssetsAvailableForSale = financialAssetsAvailableForSale;
	}

	/**
	 * 获取 heldToMaturityInvestments
	 * 
	 * @return the heldToMaturityInvestments 持有至到期投资
	 */
	public String getHeldToMaturityInvestments() {
		return HeldToMaturityInvestments;
	}

	/**
	 * 设置 heldToMaturityInvestments
	 * 
	 * @param heldToMaturityInvestments
	 *            持有至到期投资
	 */
	public void setHeldToMaturityInvestments(String heldToMaturityInvestments) {
		HeldToMaturityInvestments = heldToMaturityInvestments;
	}

	/**
	 * 获取 longTermEquityInvestment
	 * 
	 * @return the longTermEquityInvestment 长期股权投资
	 */
	public String getLongTermEquityInvestment() {
		return LongTermEquityInvestment;
	}

	/**
	 * 设置 longTermEquityInvestment
	 * 
	 * @param longTermEquityInvestment
	 *            长期股权投资
	 */
	public void setLongTermEquityInvestment(String longTermEquityInvestment) {
		LongTermEquityInvestment = longTermEquityInvestment;
	}

	/**
	 * 获取 longTermReceivables
	 * 
	 * @return the longTermReceivables 长期应收款
	 */
	public String getLongTermReceivables() {
		return LongTermReceivables;
	}

	/**
	 * 设置 longTermReceivables
	 * 
	 * @param longTermReceivables
	 *            长期应收款
	 */
	public void setLongTermReceivables(String longTermReceivables) {
		LongTermReceivables = longTermReceivables;
	}

	/**
	 * 获取 investmentProperties
	 * 
	 * @return the investmentProperties 投资性房地产
	 */
	public String getInvestmentProperties() {
		return InvestmentProperties;
	}

	/**
	 * 设置 investmentProperties
	 * 
	 * @param investmentProperties
	 *            投资性房地产
	 */
	public void setInvestmentProperties(String investmentProperties) {
		InvestmentProperties = investmentProperties;
	}

	/**
	 * 获取 fixedAssets
	 * 
	 * @return the fixedAssets 固定资产
	 */
	public String getFixedAssets() {
		return FixedAssets;
	}

	/**
	 * 设置 fixedAssets
	 * 
	 * @param fixedAssets
	 *            固定资产
	 */
	public void setFixedAssets(String fixedAssets) {
		FixedAssets = fixedAssets;
	}

	/**
	 * 获取 constructionInProgress
	 * 
	 * @return the constructionInProgress 在建工程
	 */
	public String getConstructionInProgress() {
		return ConstructionInProgress;
	}

	/**
	 * 设置 constructionInProgress
	 * 
	 * @param constructionInProgress
	 *            在建工程
	 */
	public void setConstructionInProgress(String constructionInProgress) {
		ConstructionInProgress = constructionInProgress;
	}

	/**
	 * 获取 constructionMaterials
	 * 
	 * @return the constructionMaterials 工程物资
	 */
	public String getConstructionMaterials() {
		return ConstructionMaterials;
	}

	/**
	 * 设置 constructionMaterials
	 * 
	 * @param constructionMaterials
	 *            工程物资
	 */
	public void setConstructionMaterials(String constructionMaterials) {
		ConstructionMaterials = constructionMaterials;
	}

	/**
	 * 获取 fixedAssetsPendingForDisposal
	 * 
	 * @return the fixedAssetsPendingForDisposal 固定资产清理
	 */
	public String getFixedAssetsPendingForDisposal() {
		return FixedAssetsPendingForDisposal;
	}

	/**
	 * 设置 fixedAssetsPendingForDisposal
	 * 
	 * @param fixedAssetsPendingForDisposal
	 *            固定资产清理
	 */
	public void setFixedAssetsPendingForDisposal(
			String fixedAssetsPendingForDisposal) {
		FixedAssetsPendingForDisposal = fixedAssetsPendingForDisposal;
	}

	/**
	 * 获取 nonCurrentBiologicalAssets
	 * 
	 * @return the nonCurrentBiologicalAssets 生产性生物资产
	 */
	public String getNonCurrentBiologicalAssets() {
		return NonCurrentBiologicalAssets;
	}

	/**
	 * 设置 nonCurrentBiologicalAssets
	 * 
	 * @param nonCurrentBiologicalAssets
	 *            生产性生物资产
	 */
	public void setNonCurrentBiologicalAssets(String nonCurrentBiologicalAssets) {
		NonCurrentBiologicalAssets = nonCurrentBiologicalAssets;
	}

	/**
	 * 获取 oilAndGasAssets
	 * 
	 * @return the oilAndGasAssets 油气资产
	 */
	public String getOilAndGasAssets() {
		return OilAndGasAssets;
	}

	/**
	 * 设置 oilAndGasAssets
	 * 
	 * @param oilAndGasAssets
	 *            油气资产
	 */
	public void setOilAndGasAssets(String oilAndGasAssets) {
		OilAndGasAssets = oilAndGasAssets;
	}

	/**
	 * 获取 intangibleAssets
	 * 
	 * @return the intangibleAssets 无形资产
	 */
	public String getIntangibleAssets() {
		return IntangibleAssets;
	}

	/**
	 * 设置 intangibleAssets
	 * 
	 * @param intangibleAssets
	 *            无形资产
	 */
	public void setIntangibleAssets(String intangibleAssets) {
		IntangibleAssets = intangibleAssets;
	}

	/**
	 * 获取 developmentDisbursements
	 * 
	 * @return the developmentDisbursements 开发支出
	 */
	public String getDevelopmentDisbursements() {
		return DevelopmentDisbursements;
	}

	/**
	 * 设置 developmentDisbursements
	 * 
	 * @param developmentDisbursements
	 *            开发支出
	 */
	public void setDevelopmentDisbursements(String developmentDisbursements) {
		DevelopmentDisbursements = developmentDisbursements;
	}

	/**
	 * 获取 goodwill
	 * 
	 * @return the goodwill 商誉
	 */
	public String getGoodwill() {
		return Goodwill;
	}

	/**
	 * 设置 goodwill
	 * 
	 * @param goodwill
	 *            商誉
	 */
	public void setGoodwill(String goodwill) {
		Goodwill = goodwill;
	}

	/**
	 * 获取 longTermDeferredExpenses
	 * 
	 * @return the longTermDeferredExpenses 长期待摊费用
	 */
	public String getLongTermDeferredExpenses() {
		return LongTermDeferredExpenses;
	}

	/**
	 * 设置 longTermDeferredExpenses
	 * 
	 * @param longTermDeferredExpenses
	 *            长期待摊费用
	 */
	public void setLongTermDeferredExpenses(String longTermDeferredExpenses) {
		LongTermDeferredExpenses = longTermDeferredExpenses;
	}

	/**
	 * 获取 deferredTaxAssets
	 * 
	 * @return the deferredTaxAssets 递延所得税资产
	 */
	public String getDeferredTaxAssets() {
		return DeferredTaxAssets;
	}

	/**
	 * 设置 deferredTaxAssets
	 * 
	 * @param deferredTaxAssets
	 *            递延所得税资产
	 */
	public void setDeferredTaxAssets(String deferredTaxAssets) {
		DeferredTaxAssets = deferredTaxAssets;
	}

	/**
	 * 获取 otherNonCurrentAssets
	 * 
	 * @return the otherNonCurrentAssets 其他非流动资产
	 */
	public String getOtherNonCurrentAssets() {
		return OtherNonCurrentAssets;
	}

	/**
	 * 设置 otherNonCurrentAssets
	 * 
	 * @param otherNonCurrentAssets
	 *            其他非流动资产
	 */
	public void setOtherNonCurrentAssets(String otherNonCurrentAssets) {
		OtherNonCurrentAssets = otherNonCurrentAssets;
	}

	/**
	 * 获取 totalNonCurrentAssets
	 * 
	 * @return the totalNonCurrentAssets 非流动资产合计
	 */
	public String getTotalNonCurrentAssets() {
		return TotalNonCurrentAssets;
	}

	/**
	 * 设置 totalNonCurrentAssets
	 * 
	 * @param totalNonCurrentAssets
	 *            非流动资产合计
	 */
	public void setTotalNonCurrentAssets(String totalNonCurrentAssets) {
		TotalNonCurrentAssets = totalNonCurrentAssets;
	}

	/**
	 * 获取 totalAssets
	 * 
	 * @return the totalAssets 资产总计
	 */
	public String getTotalAssets() {
		return TotalAssets;
	}

	/**
	 * 设置 totalAssets
	 * 
	 * @param totalAssets
	 *            资产总计
	 */
	public void setTotalAssets(String totalAssets) {
		TotalAssets = totalAssets;
	}

	/**
	 * 获取 shortTermBorrowings
	 * 
	 * @return the shortTermBorrowings 短期借款
	 */
	public String getShortTermBorrowings() {
		return ShortTermBorrowings;
	}

	/**
	 * 设置 shortTermBorrowings
	 * 
	 * @param shortTermBorrowings
	 *            短期借款
	 */
	public void setShortTermBorrowings(String shortTermBorrowings) {
		ShortTermBorrowings = shortTermBorrowings;
	}

	/**
	 * 获取 financialLiabilitiesHeldForTrading
	 * 
	 * @return the financialLiabilitiesHeldForTrading 交易性金融负债
	 */
	public String getFinancialLiabilitiesHeldForTrading() {
		return FinancialLiabilitiesHeldForTrading;
	}

	/**
	 * 设置 financialLiabilitiesHeldForTrading
	 * 
	 * @param financialLiabilitiesHeldForTrading
	 *            交易性金融负债
	 */
	public void setFinancialLiabilitiesHeldForTrading(
			String financialLiabilitiesHeldForTrading) {
		FinancialLiabilitiesHeldForTrading = financialLiabilitiesHeldForTrading;
	}

	/**
	 * 获取 notesPayable
	 * 
	 * @return the notesPayable 应付票据
	 */
	public String getNotesPayable() {
		return NotesPayable;
	}

	/**
	 * 设置 notesPayable
	 * 
	 * @param notesPayable
	 *            应付票据
	 */
	public void setNotesPayable(String notesPayable) {
		NotesPayable = notesPayable;
	}

	/**
	 * 获取 accountsPayable
	 * 
	 * @return the accountsPayable 应付账款
	 */
	public String getAccountsPayable() {
		return AccountsPayable;
	}

	/**
	 * 设置 accountsPayable
	 * 
	 * @param accountsPayable
	 *            应付账款
	 */
	public void setAccountsPayable(String accountsPayable) {
		AccountsPayable = accountsPayable;
	}

	/**
	 * 获取 receiptsInAdvance
	 * 
	 * @return the receiptsInAdvance 预收账款
	 */
	public String getReceiptsInAdvance() {
		return ReceiptsInAdvance;
	}

	/**
	 * 设置 receiptsInAdvance
	 * 
	 * @param receiptsInAdvance
	 *            预收账款
	 */
	public void setReceiptsInAdvance(String receiptsInAdvance) {
		ReceiptsInAdvance = receiptsInAdvance;
	}

	/**
	 * 获取 interestPayable
	 * 
	 * @return the interestPayable 应付利息
	 */
	public String getInterestPayable() {
		return InterestPayable;
	}

	/**
	 * 设置 interestPayable
	 * 
	 * @param interestPayable
	 *            应付利息
	 */
	public void setInterestPayable(String interestPayable) {
		InterestPayable = interestPayable;
	}

	/**
	 * 获取 employeeBenefitsPayable
	 * 
	 * @return the employeeBenefitsPayable 应付职工薪酬
	 */
	public String getEmployeeBenefitsPayable() {
		return EmployeeBenefitsPayable;
	}

	/**
	 * 设置 employeeBenefitsPayable
	 * 
	 * @param employeeBenefitsPayable
	 *            应付职工薪酬
	 */
	public void setEmployeeBenefitsPayable(String employeeBenefitsPayable) {
		EmployeeBenefitsPayable = employeeBenefitsPayable;
	}

	/**
	 * 获取 taxsPayable
	 * 
	 * @return the taxsPayable 应交税费
	 */
	public String getTaxsPayable() {
		return TaxsPayable;
	}

	/**
	 * 设置 taxsPayable
	 * 
	 * @param taxsPayable
	 *            应交税费
	 */
	public void setTaxsPayable(String taxsPayable) {
		TaxsPayable = taxsPayable;
	}

	/**
	 * 获取 dividendsPayable
	 * 
	 * @return the dividendsPayable 应付股利
	 */
	public String getDividendsPayable() {
		return DividendsPayable;
	}

	/**
	 * 设置 dividendsPayable
	 * 
	 * @param dividendsPayable
	 *            应付股利
	 */
	public void setDividendsPayable(String dividendsPayable) {
		DividendsPayable = dividendsPayable;
	}

	/**
	 * 获取 otherPayables
	 * 
	 * @return the otherPayables 其他应付款
	 */
	public String getOtherPayables() {
		return OtherPayables;
	}

	/**
	 * 设置 otherPayables
	 * 
	 * @param otherPayables
	 *            其他应付款
	 */
	public void setOtherPayables(String otherPayables) {
		OtherPayables = otherPayables;
	}

	/**
	 * 获取 currentPortionOfLongTermLiabilities
	 * 
	 * @return the currentPortionOfLongTermLiabilities 一年内到期的非流动负债
	 */
	public String getCurrentPortionOfLongTermLiabilities() {
		return CurrentPortionOfLongTermLiabilities;
	}

	/**
	 * 设置 currentPortionOfLongTermLiabilities
	 * 
	 * @param currentPortionOfLongTermLiabilities
	 *            一年内到期的非流动负债
	 */
	public void setCurrentPortionOfLongTermLiabilities(
			String currentPortionOfLongTermLiabilities) {
		CurrentPortionOfLongTermLiabilities = currentPortionOfLongTermLiabilities;
	}

	/**
	 * 获取 otherCurrentLiabilities
	 * 
	 * @return the otherCurrentLiabilities 其他流动负债
	 */
	public String getOtherCurrentLiabilities() {
		return OtherCurrentLiabilities;
	}

	/**
	 * 设置 otherCurrentLiabilities
	 * 
	 * @param otherCurrentLiabilities
	 *            其他流动负债
	 */
	public void setOtherCurrentLiabilities(String otherCurrentLiabilities) {
		OtherCurrentLiabilities = otherCurrentLiabilities;
	}

	/**
	 * 获取 totalCurrentLiabilities
	 * 
	 * @return the totalCurrentLiabilities 流动负债合计
	 */
	public String getTotalCurrentLiabilities() {
		return TotalCurrentLiabilities;
	}

	/**
	 * 设置 totalCurrentLiabilities
	 * 
	 * @param totalCurrentLiabilities
	 *            流动负债合计
	 */
	public void setTotalCurrentLiabilities(String totalCurrentLiabilities) {
		TotalCurrentLiabilities = totalCurrentLiabilities;
	}

	/**
	 * 获取 longTermBorrowings
	 * 
	 * @return the longTermBorrowings 长期借款
	 */
	public String getLongTermBorrowings() {
		return LongTermBorrowings;
	}

	/**
	 * 设置 longTermBorrowings
	 * 
	 * @param longTermBorrowings
	 *            长期借款
	 */
	public void setLongTermBorrowings(String longTermBorrowings) {
		LongTermBorrowings = longTermBorrowings;
	}

	/**
	 * 获取 bondsPayables
	 * 
	 * @return the bondsPayables 应付债券
	 */
	public String getBondsPayables() {
		return BondsPayables;
	}

	/**
	 * 设置 bondsPayables
	 * 
	 * @param bondsPayables
	 *            应付债券
	 */
	public void setBondsPayables(String bondsPayables) {
		BondsPayables = bondsPayables;
	}

	/**
	 * 获取 longTermPayables
	 * 
	 * @return the longTermPayables 长期应付款
	 */
	public String getLongTermPayables() {
		return LongTermPayables;
	}

	/**
	 * 设置 longTermPayables
	 * 
	 * @param longTermPayables
	 *            长期应付款
	 */
	public void setLongTermPayables(String longTermPayables) {
		LongTermPayables = longTermPayables;
	}

	/**
	 * 获取 grantsPayable
	 * 
	 * @return the grantsPayable 专项应付款
	 */
	public String getGrantsPayable() {
		return GrantsPayable;
	}

	/**
	 * 设置 grantsPayable
	 * 
	 * @param grantsPayable
	 *            专项应付款
	 */
	public void setGrantsPayable(String grantsPayable) {
		GrantsPayable = grantsPayable;
	}

	/**
	 * 获取 provisions
	 * 
	 * @return the provisions 预计负债
	 */
	public String getProvisions() {
		return Provisions;
	}

	/**
	 * 设置 provisions
	 * 
	 * @param provisions
	 *            预计负债
	 */
	public void setProvisions(String provisions) {
		Provisions = provisions;
	}

	/**
	 * 获取 deferredTaxLiabilities
	 * 
	 * @return the deferredTaxLiabilities 递延所得税负债
	 */
	public String getDeferredTaxLiabilities() {
		return DeferredTaxLiabilities;
	}

	/**
	 * 设置 deferredTaxLiabilities
	 * 
	 * @param deferredTaxLiabilities
	 *            递延所得税负债
	 */
	public void setDeferredTaxLiabilities(String deferredTaxLiabilities) {
		DeferredTaxLiabilities = deferredTaxLiabilities;
	}

	/**
	 * 获取 otherNonCurrentLiabilities
	 * 
	 * @return the otherNonCurrentLiabilities 其他非流动负债
	 */
	public String getOtherNonCurrentLiabilities() {
		return OtherNonCurrentLiabilities;
	}

	/**
	 * 设置 otherNonCurrentLiabilities
	 * 
	 * @param otherNonCurrentLiabilities
	 *            其他非流动负债
	 */
	public void setOtherNonCurrentLiabilities(String otherNonCurrentLiabilities) {
		OtherNonCurrentLiabilities = otherNonCurrentLiabilities;
	}

	/**
	 * 获取 totalNonCurrentLiabilities
	 * 
	 * @return the totalNonCurrentLiabilities 非流动负债合计
	 */
	public String getTotalNonCurrentLiabilities() {
		return TotalNonCurrentLiabilities;
	}

	/**
	 * 设置 totalNonCurrentLiabilities
	 * 
	 * @param totalNonCurrentLiabilities
	 *            非流动负债合计
	 */
	public void setTotalNonCurrentLiabilities(String totalNonCurrentLiabilities) {
		TotalNonCurrentLiabilities = totalNonCurrentLiabilities;
	}

	/**
	 * 获取 totalLiabilities
	 * 
	 * @return the totalLiabilities 负债合计
	 */
	public String getTotalLiabilities() {
		return TotalLiabilities;
	}

	/**
	 * 设置 totalLiabilities
	 * 
	 * @param totalLiabilities
	 *            负债合计
	 */
	public void setTotalLiabilities(String totalLiabilities) {
		TotalLiabilities = totalLiabilities;
	}

	/**
	 * 获取 paidInCapitalOrShareCapital
	 * 
	 * @return the paidInCapitalOrShareCapital 实收资本（或股本）
	 */
	public String getPaidInCapitalOrShareCapital() {
		return PaidInCapitalOrShareCapital;
	}

	/**
	 * 设置 paidInCapitalOrShareCapital
	 * 
	 * @param paidInCapitalOrShareCapital
	 *            实收资本（或股本）
	 */
	public void setPaidInCapitalOrShareCapital(
			String paidInCapitalOrShareCapital) {
		PaidInCapitalOrShareCapital = paidInCapitalOrShareCapital;
	}

	/**
	 * 获取 capitalrRserve
	 * 
	 * @return the capitalrRserve 资本公积
	 */
	public String getCapitalrRserve() {
		return CapitalrRserve;
	}

	/**
	 * 设置 capitalrRserve
	 * 
	 * @param capitalrRserve
	 *            资本公积
	 */
	public void setCapitalrRserve(String capitalrRserve) {
		CapitalrRserve = capitalrRserve;
	}

	/**
	 * 获取 lessTreasuryStocks
	 * 
	 * @return the lessTreasuryStocks 减：库存股
	 */
	public String getLessTreasuryStocks() {
		return LessTreasuryStocks;
	}

	/**
	 * 设置 lessTreasuryStocks
	 * 
	 * @param lessTreasuryStocks
	 *            减：库存股
	 */
	public void setLessTreasuryStocks(String lessTreasuryStocks) {
		LessTreasuryStocks = lessTreasuryStocks;
	}

	/**
	 * 获取 surplusReserve
	 * 
	 * @return the surplusReserve 盈余公积
	 */
	public String getSurplusReserve() {
		return SurplusReserve;
	}

	/**
	 * 设置 surplusReserve
	 * 
	 * @param surplusReserve
	 *            盈余公积
	 */
	public void setSurplusReserve(String surplusReserve) {
		SurplusReserve = surplusReserve;
	}

	/**
	 * 获取 unappropriatedProfit
	 * 
	 * @return the unappropriatedProfit 未分配利润
	 */
	public String getUnappropriatedProfit() {
		return UnappropriatedProfit;
	}

	/**
	 * 设置 unappropriatedProfit
	 * 
	 * @param unappropriatedProfit
	 *            未分配利润
	 */
	public void setUnappropriatedProfit(String unappropriatedProfit) {
		UnappropriatedProfit = unappropriatedProfit;
	}

	/**
	 * 获取 totalEquity
	 * 
	 * @return the totalEquity 所有者权益合计
	 */
	public String getTotalEquity() {
		return TotalEquity;
	}

	/**
	 * 设置 totalEquity
	 * 
	 * @param totalEquity
	 *            所有者权益合计
	 */
	public void setTotalEquity(String totalEquity) {
		TotalEquity = totalEquity;
	}

	/**
	 * 获取 totalEquityAndLiabilities
	 * 
	 * @return the totalEquityAndLiabilities 负债和所有者权益合计
	 */
	public String getTotalEquityAndLiabilities() {
		return TotalEquityAndLiabilities;
	}

	/**
	 * 设置 totalEquityAndLiabilities
	 * 
	 * @param totalEquityAndLiabilities
	 *            负债和所有者权益合计
	 */
	public void setTotalEquityAndLiabilities(String totalEquityAndLiabilities) {
		TotalEquityAndLiabilities = totalEquityAndLiabilities;
	}
}
