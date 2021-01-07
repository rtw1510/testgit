package com.dhcc.xml.ent.entity.finance.db;

/**
 * Title: EB_FinaBal02_Info<br/>
 * Description:数据库映射：基础段+2002版资产负债表段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
public class EB_FinaBal02_Info {
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
	/* 2、2002版资产负债表段 */
	/**
	 *货币资金
	 */
	private String CurrencyFunds;
	/**
	 *短期投资
	 */
	private String ShortTermInvestments;
	/**
	 *应收票据
	 */
	private String NotesReceivable;
	/**
	 *应收股利
	 */
	private String DividendsReceivable;
	/**
	 *应收利息
	 */
	private String InterestReceivable;
	/**
	 *应收账款
	 */
	private String AccountsReceivable;
	/**
	 *其他应收款
	 */
	private String OtherReceivables;
	/**
	 *预付账款
	 */
	private String Prepayments;
	/**
	 *期货保证金
	 */
	private String FutureGuarantee;
	/**
	 *应收补贴款
	 */
	private String AllowanceReceivable;
	/**
	 *应收出口退税
	 */
	private String ExportDrawbackReceivable;
	/**
	 *存货
	 */
	private String Inventories;
	/**
	 *存货原材料
	 */
	private String RawMaterials;
	/**
	 *存货产成品
	 */
	private String FinishedProducts;
	/**
	 *待摊费用
	 */
	private String DeferredExpenses;
	/**
	 *待处理流动资产净损失
	 */
	private String UnsettledGLOnCurrentAssets;
	/**
	 *一年内到期的长期债权投资
	 */
	private String LongTermDebentureInvestmentFallingDueInAYear;
	/**
	 *其他流动资产
	 */
	private String OtherCurrentAssets;
	/**
	 *流动资产合计
	 */
	private String TotalCurrentAssets;
	/**
	 *长期投资
	 */
	private String LongTermInvestment;
	/**
	 *长期股权投资
	 */
	private String LongTermEquityInvestment;
	/**
	 *长期债权投资
	 */
	private String LongTermSecuritiesInvestment;
	/**
	 *合并价差
	 */
	private String IncorporatingPriceDifference;
	/**
	 *长期投资合计
	 */
	private String TotalLongTermInvestment;
	/**
	 *固定资产原价
	 */
	private String OriginalCostOfFixedAsset;
	/**
	 *累计折旧
	 */
	private String FixedAssetAccumulatedDepreciation;
	/**
	 *固定资产净值
	 */
	private String FixedAssetsNetValue;
	/**
	 *固定资产值减值准备
	 */
	private String ProvisionForImpairmentOfFixedAssets;
	/**
	 *固定资产净额
	 */
	private String NetValueOfFixedAssets;
	/**
	 *固定资产清理
	 */
	private String FixedAssetsPendingForDisposal;
	/**
	 *工程物资
	 */
	private String ConstructionMaterials;
	/**
	 *在建工程
	 */
	private String ConstructionInProgress;
	/**
	 *待处理固定资产净损失
	 */
	private String UnsettledGLOnFixedAssets;
	/**
	 *固定资产合计
	 */
	private String TotalFixedAssets;
	/**
	 *无形资产
	 */
	private String IntangibleAssets;
	/**
	 *（无形资产科目下）土地使用权
	 */
	private String LandUseRights;
	/**
	 *递延资产
	 */
	private String DeferredAssets;
	/**
	 *（递延资产科目下）固定资产修理
	 */
	private String IncludingFixedAssetsRepair;
	/**
	 *（递延资产科目下）固定资产改良支出
	 */
	private String ImprovementExpenditureOfFixedAssets;
	/**
	 *其他长期资产
	 */
	private String OtherLongTermAssets;
	/**
	 *（其他长期资产科目下）特准储备物资
	 */
	private String AmongItSpeciallyApprovedReservingMaterials;
	/**
	 *无形及其他资产合计
	 */
	private String TotalIntangibleAssetsAndOtherAssets;
	/**
	 *递延税款借项
	 */
	private String DeferredAssetsDebits;
	/**
	 *资产总计
	 */
	private String TotalAssets;
	/**
	 *短期借款
	 */
	private String ShortTermBorrowings;
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
	 *应付工资
	 */
	private String WagesOrSalariesPayables;
	/**
	 *应付福利费
	 */
	private String EmployeeBenefits;
	/**
	 *应付利润
	 */
	private String IncomePayable;
	/**
	 *应交税金
	 */
	private String TaxesPayable;
	/**
	 *其他应交款
	 */
	private String OtherPayableToGovernment;
	/**
	 *其他应付款
	 */
	private String OtherPayable;
	/**
	 *预提费用
	 */
	private String ProvisionForExpenses;
	/**
	 *预计负债
	 */
	private String Provisions;
	/**
	 *一年内到期的长期负债
	 */
	private String LongTermLiabilitiesDueWithinOneYear;
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
	private String BondsPayable;
	/**
	 *长期应付款
	 */
	private String LongTermPayables;
	/**
	 *专项应付款
	 */
	private String GrantsPayable;
	/**
	 *其他长期负债
	 */
	private String OtherLongTermLiabilities;
	/**
	 *（其他长期负债科目下）特准储备基金
	 */
	private String SpecialReserveFund;
	/**
	 *长期负债合计
	 */
	private String TotalLongTermLiabilities;
	/**
	 *递延税款贷项
	 */
	private String DeferredTaxationCredit;
	/**
	 *负债合计
	 */
	private String TotalLiabilities;
	/**
	 *少数股东权益
	 */
	private String MinorityInterest;
	/**
	 *实收资本
	 */
	private String PaidInCapital;
	/**
	 *国家资本
	 */
	private String NationalCapital;
	/**
	 *集体资本
	 */
	private String CollectiveCapital;
	/**
	 *法人资本
	 */
	private String LegalPersonsCapital;
	/**
	 *（法人资本科目下）国有法人资本
	 */
	private String StateOwnedLegalPersonsCapital;
	/**
	 *（法人资本科目下）集体法人资本
	 */
	private String CollectiveLegalPersonsCapital;
	/**
	 *个人资本
	 */
	private String PersonalCapital;
	/**
	 *外商资本
	 */
	private String ForeignBusinessmensCapital;
	/**
	 *资本公积
	 */
	private String CapitalrRserve;
	/**
	 *盈余公积
	 */
	private String SurplusReserve;
	/**
	 *（盈余公积科目下）法定盈余公积
	 */
	private String StatutorySurplusReserve;
	/**
	 *（盈余公积科目下）公益金
	 */
	private String PublicWelfareFund;
	/**
	 *（盈余公积科目下）补充流动资本
	 */
	private String SupplermentaryCurrentCapital;
	/**
	 *未确认的投资损失
	 */
	private String UnaffirmedInvestmentLoss;
	/**
	 *未分配利润
	 */
	private String UnappropriatedProfit;
	/**
	 *外币报表折算差额
	 */
	private String DifferenceOnTranslationOfForeignCurrencyFinancialStatements;
	/**
	 *所有者权益合计
	 */
	private String TotalEquity;
	/**
	 *负债和所有者权益总计
	 */
	private String TotalEquityAndLiabilities;

	public EB_FinaBal02_Info() {
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
	 * 获取 shortTermInvestments
	 * 
	 * @return the shortTermInvestments 短期投资
	 */
	public String getShortTermInvestments() {
		return ShortTermInvestments;
	}

	/**
	 * 设置 shortTermInvestments
	 * 
	 * @param shortTermInvestments
	 *            短期投资
	 */
	public void setShortTermInvestments(String shortTermInvestments) {
		ShortTermInvestments = shortTermInvestments;
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
	 * 获取 futureGuarantee
	 * 
	 * @return the futureGuarantee 期货保证金
	 */
	public String getFutureGuarantee() {
		return FutureGuarantee;
	}

	/**
	 * 设置 futureGuarantee
	 * 
	 * @param futureGuarantee
	 *            期货保证金
	 */
	public void setFutureGuarantee(String futureGuarantee) {
		FutureGuarantee = futureGuarantee;
	}

	/**
	 * 获取 allowanceReceivable
	 * 
	 * @return the allowanceReceivable 应收补贴款
	 */
	public String getAllowanceReceivable() {
		return AllowanceReceivable;
	}

	/**
	 * 设置 allowanceReceivable
	 * 
	 * @param allowanceReceivable
	 *            应收补贴款
	 */
	public void setAllowanceReceivable(String allowanceReceivable) {
		AllowanceReceivable = allowanceReceivable;
	}

	/**
	 * 获取 exportDrawbackReceivable
	 * 
	 * @return the exportDrawbackReceivable 应收出口退税
	 */
	public String getExportDrawbackReceivable() {
		return ExportDrawbackReceivable;
	}

	/**
	 * 设置 exportDrawbackReceivable
	 * 
	 * @param exportDrawbackReceivable
	 *            应收出口退税
	 */
	public void setExportDrawbackReceivable(String exportDrawbackReceivable) {
		ExportDrawbackReceivable = exportDrawbackReceivable;
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
	 * 获取 rawMaterials
	 * 
	 * @return the rawMaterials 存货原材料
	 */
	public String getRawMaterials() {
		return RawMaterials;
	}

	/**
	 * 设置 rawMaterials
	 * 
	 * @param rawMaterials
	 *            存货原材料
	 */
	public void setRawMaterials(String rawMaterials) {
		RawMaterials = rawMaterials;
	}

	/**
	 * 获取 finishedProducts
	 * 
	 * @return the finishedProducts 存货产成品
	 */
	public String getFinishedProducts() {
		return FinishedProducts;
	}

	/**
	 * 设置 finishedProducts
	 * 
	 * @param finishedProducts
	 *            存货产成品
	 */
	public void setFinishedProducts(String finishedProducts) {
		FinishedProducts = finishedProducts;
	}

	/**
	 * 获取 deferredExpenses
	 * 
	 * @return the deferredExpenses 待摊费用
	 */
	public String getDeferredExpenses() {
		return DeferredExpenses;
	}

	/**
	 * 设置 deferredExpenses
	 * 
	 * @param deferredExpenses
	 *            待摊费用
	 */
	public void setDeferredExpenses(String deferredExpenses) {
		DeferredExpenses = deferredExpenses;
	}

	/**
	 * 获取 unsettledGLOnCurrentAssets
	 * 
	 * @return the unsettledGLOnCurrentAssets 待处理流动资产净损失
	 */
	public String getUnsettledGLOnCurrentAssets() {
		return UnsettledGLOnCurrentAssets;
	}

	/**
	 * 设置 unsettledGLOnCurrentAssets
	 * 
	 * @param unsettledGLOnCurrentAssets
	 *            待处理流动资产净损失
	 */
	public void setUnsettledGLOnCurrentAssets(String unsettledGLOnCurrentAssets) {
		UnsettledGLOnCurrentAssets = unsettledGLOnCurrentAssets;
	}

	/**
	 * 获取 longTermDebentureInvestmentFallingDueInAYear
	 * 
	 * @return the longTermDebentureInvestmentFallingDueInAYear 一年内到期的长期债权投资
	 */
	public String getLongTermDebentureInvestmentFallingDueInAYear() {
		return LongTermDebentureInvestmentFallingDueInAYear;
	}

	/**
	 * 设置 longTermDebentureInvestmentFallingDueInAYear
	 * 
	 * @param longTermDebentureInvestmentFallingDueInAYear
	 *            一年内到期的长期债权投资
	 */
	public void setLongTermDebentureInvestmentFallingDueInAYear(
			String longTermDebentureInvestmentFallingDueInAYear) {
		LongTermDebentureInvestmentFallingDueInAYear = longTermDebentureInvestmentFallingDueInAYear;
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
	 * 获取 longTermInvestment
	 * 
	 * @return the longTermInvestment 长期投资
	 */
	public String getLongTermInvestment() {
		return LongTermInvestment;
	}

	/**
	 * 设置 longTermInvestment
	 * 
	 * @param longTermInvestment
	 *            长期投资
	 */
	public void setLongTermInvestment(String longTermInvestment) {
		LongTermInvestment = longTermInvestment;
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
	 * 获取 longTermSecuritiesInvestment
	 * 
	 * @return the longTermSecuritiesInvestment 长期债权投资
	 */
	public String getLongTermSecuritiesInvestment() {
		return LongTermSecuritiesInvestment;
	}

	/**
	 * 设置 longTermSecuritiesInvestment
	 * 
	 * @param longTermSecuritiesInvestment
	 *            长期债权投资
	 */
	public void setLongTermSecuritiesInvestment(
			String longTermSecuritiesInvestment) {
		LongTermSecuritiesInvestment = longTermSecuritiesInvestment;
	}

	/**
	 * 获取 incorporatingPriceDifference
	 * 
	 * @return the incorporatingPriceDifference 合并价差
	 */
	public String getIncorporatingPriceDifference() {
		return IncorporatingPriceDifference;
	}

	/**
	 * 设置 incorporatingPriceDifference
	 * 
	 * @param incorporatingPriceDifference
	 *            合并价差
	 */
	public void setIncorporatingPriceDifference(
			String incorporatingPriceDifference) {
		IncorporatingPriceDifference = incorporatingPriceDifference;
	}

	/**
	 * 获取 totalLongTermInvestment
	 * 
	 * @return the totalLongTermInvestment 长期投资合计
	 */
	public String getTotalLongTermInvestment() {
		return TotalLongTermInvestment;
	}

	/**
	 * 设置 totalLongTermInvestment
	 * 
	 * @param totalLongTermInvestment
	 *            长期投资合计
	 */
	public void setTotalLongTermInvestment(String totalLongTermInvestment) {
		TotalLongTermInvestment = totalLongTermInvestment;
	}

	/**
	 * 获取 originalCostOfFixedAsset
	 * 
	 * @return the originalCostOfFixedAsset 固定资产原价
	 */
	public String getOriginalCostOfFixedAsset() {
		return OriginalCostOfFixedAsset;
	}

	/**
	 * 设置 originalCostOfFixedAsset
	 * 
	 * @param originalCostOfFixedAsset
	 *            固定资产原价
	 */
	public void setOriginalCostOfFixedAsset(String originalCostOfFixedAsset) {
		OriginalCostOfFixedAsset = originalCostOfFixedAsset;
	}

	/**
	 * 获取 fixedAssetAccumulatedDepreciation
	 * 
	 * @return the fixedAssetAccumulatedDepreciation 累计折旧
	 */
	public String getFixedAssetAccumulatedDepreciation() {
		return FixedAssetAccumulatedDepreciation;
	}

	/**
	 * 设置 fixedAssetAccumulatedDepreciation
	 * 
	 * @param fixedAssetAccumulatedDepreciation
	 *            累计折旧
	 */
	public void setFixedAssetAccumulatedDepreciation(
			String fixedAssetAccumulatedDepreciation) {
		FixedAssetAccumulatedDepreciation = fixedAssetAccumulatedDepreciation;
	}

	/**
	 * 获取 fixedAssetsNetValue
	 * 
	 * @return the fixedAssetsNetValue 固定资产净值
	 */
	public String getFixedAssetsNetValue() {
		return FixedAssetsNetValue;
	}

	/**
	 * 设置 fixedAssetsNetValue
	 * 
	 * @param fixedAssetsNetValue
	 *            固定资产净值
	 */
	public void setFixedAssetsNetValue(String fixedAssetsNetValue) {
		FixedAssetsNetValue = fixedAssetsNetValue;
	}

	/**
	 * 获取 provisionForImpairmentOfFixedAssets
	 * 
	 * @return the provisionForImpairmentOfFixedAssets 固定资产值减值准备
	 */
	public String getProvisionForImpairmentOfFixedAssets() {
		return ProvisionForImpairmentOfFixedAssets;
	}

	/**
	 * 设置 provisionForImpairmentOfFixedAssets
	 * 
	 * @param provisionForImpairmentOfFixedAssets
	 *            固定资产值减值准备
	 */
	public void setProvisionForImpairmentOfFixedAssets(
			String provisionForImpairmentOfFixedAssets) {
		ProvisionForImpairmentOfFixedAssets = provisionForImpairmentOfFixedAssets;
	}

	/**
	 * 获取 netValueOfFixedAssets
	 * 
	 * @return the netValueOfFixedAssets 固定资产净额
	 */
	public String getNetValueOfFixedAssets() {
		return NetValueOfFixedAssets;
	}

	/**
	 * 设置 netValueOfFixedAssets
	 * 
	 * @param netValueOfFixedAssets
	 *            固定资产净额
	 */
	public void setNetValueOfFixedAssets(String netValueOfFixedAssets) {
		NetValueOfFixedAssets = netValueOfFixedAssets;
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
	 * 获取 unsettledGLOnFixedAssets
	 * 
	 * @return the unsettledGLOnFixedAssets 待处理固定资产净损失
	 */
	public String getUnsettledGLOnFixedAssets() {
		return UnsettledGLOnFixedAssets;
	}

	/**
	 * 设置 unsettledGLOnFixedAssets
	 * 
	 * @param unsettledGLOnFixedAssets
	 *            待处理固定资产净损失
	 */
	public void setUnsettledGLOnFixedAssets(String unsettledGLOnFixedAssets) {
		UnsettledGLOnFixedAssets = unsettledGLOnFixedAssets;
	}

	/**
	 * 获取 totalFixedAssets
	 * 
	 * @return the totalFixedAssets 固定资产合计
	 */
	public String getTotalFixedAssets() {
		return TotalFixedAssets;
	}

	/**
	 * 设置 totalFixedAssets
	 * 
	 * @param totalFixedAssets
	 *            固定资产合计
	 */
	public void setTotalFixedAssets(String totalFixedAssets) {
		TotalFixedAssets = totalFixedAssets;
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
	 * 获取 landUseRights
	 * 
	 * @return the landUseRights （无形资产科目下）土地使用权
	 */
	public String getLandUseRights() {
		return LandUseRights;
	}

	/**
	 * 设置 landUseRights
	 * 
	 * @param landUseRights
	 *            （无形资产科目下）土地使用权
	 */
	public void setLandUseRights(String landUseRights) {
		LandUseRights = landUseRights;
	}

	/**
	 * 获取 deferredAssets
	 * 
	 * @return the deferredAssets 递延资产
	 */
	public String getDeferredAssets() {
		return DeferredAssets;
	}

	/**
	 * 设置 deferredAssets
	 * 
	 * @param deferredAssets
	 *            递延资产
	 */
	public void setDeferredAssets(String deferredAssets) {
		DeferredAssets = deferredAssets;
	}

	/**
	 * 获取 includingFixedAssetsRepair
	 * 
	 * @return the includingFixedAssetsRepair （递延资产科目下）固定资产修理
	 */
	public String getIncludingFixedAssetsRepair() {
		return IncludingFixedAssetsRepair;
	}

	/**
	 * 设置 includingFixedAssetsRepair
	 * 
	 * @param includingFixedAssetsRepair
	 *            （递延资产科目下）固定资产修理
	 */
	public void setIncludingFixedAssetsRepair(String includingFixedAssetsRepair) {
		IncludingFixedAssetsRepair = includingFixedAssetsRepair;
	}

	/**
	 * 获取 improvementExpenditureOfFixedAssets
	 * 
	 * @return the improvementExpenditureOfFixedAssets （递延资产科目下）固定资产改良支出
	 */
	public String getImprovementExpenditureOfFixedAssets() {
		return ImprovementExpenditureOfFixedAssets;
	}

	/**
	 * 设置 improvementExpenditureOfFixedAssets
	 * 
	 * @param improvementExpenditureOfFixedAssets
	 *            （递延资产科目下）固定资产改良支出
	 */
	public void setImprovementExpenditureOfFixedAssets(
			String improvementExpenditureOfFixedAssets) {
		ImprovementExpenditureOfFixedAssets = improvementExpenditureOfFixedAssets;
	}

	/**
	 * 获取 otherLongTermAssets
	 * 
	 * @return the otherLongTermAssets 其他长期资产
	 */
	public String getOtherLongTermAssets() {
		return OtherLongTermAssets;
	}

	/**
	 * 设置 otherLongTermAssets
	 * 
	 * @param otherLongTermAssets
	 *            其他长期资产
	 */
	public void setOtherLongTermAssets(String otherLongTermAssets) {
		OtherLongTermAssets = otherLongTermAssets;
	}

	/**
	 * 获取 amongItSpeciallyApprovedReservingMaterials
	 * 
	 * @return the amongItSpeciallyApprovedReservingMaterials （其他长期资产科目下）特准储备物资
	 */
	public String getAmongItSpeciallyApprovedReservingMaterials() {
		return AmongItSpeciallyApprovedReservingMaterials;
	}

	/**
	 * 设置 amongItSpeciallyApprovedReservingMaterials
	 * 
	 * @param amongItSpeciallyApprovedReservingMaterials
	 *            （其他长期资产科目下）特准储备物资
	 */
	public void setAmongItSpeciallyApprovedReservingMaterials(
			String amongItSpeciallyApprovedReservingMaterials) {
		AmongItSpeciallyApprovedReservingMaterials = amongItSpeciallyApprovedReservingMaterials;
	}

	/**
	 * 获取 totalIntangibleAssetsAndOtherAssets
	 * 
	 * @return the totalIntangibleAssetsAndOtherAssets 无形及其他资产合计
	 */
	public String getTotalIntangibleAssetsAndOtherAssets() {
		return TotalIntangibleAssetsAndOtherAssets;
	}

	/**
	 * 设置 totalIntangibleAssetsAndOtherAssets
	 * 
	 * @param totalIntangibleAssetsAndOtherAssets
	 *            无形及其他资产合计
	 */
	public void setTotalIntangibleAssetsAndOtherAssets(
			String totalIntangibleAssetsAndOtherAssets) {
		TotalIntangibleAssetsAndOtherAssets = totalIntangibleAssetsAndOtherAssets;
	}

	/**
	 * 获取 deferredAssetsDebits
	 * 
	 * @return the deferredAssetsDebits 递延税款借项
	 */
	public String getDeferredAssetsDebits() {
		return DeferredAssetsDebits;
	}

	/**
	 * 设置 deferredAssetsDebits
	 * 
	 * @param deferredAssetsDebits
	 *            递延税款借项
	 */
	public void setDeferredAssetsDebits(String deferredAssetsDebits) {
		DeferredAssetsDebits = deferredAssetsDebits;
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
	 * 获取 wagesOrSalariesPayables
	 * 
	 * @return the wagesOrSalariesPayables 应付工资
	 */
	public String getWagesOrSalariesPayables() {
		return WagesOrSalariesPayables;
	}

	/**
	 * 设置 wagesOrSalariesPayables
	 * 
	 * @param wagesOrSalariesPayables
	 *            应付工资
	 */
	public void setWagesOrSalariesPayables(String wagesOrSalariesPayables) {
		WagesOrSalariesPayables = wagesOrSalariesPayables;
	}

	/**
	 * 获取 employeeBenefits
	 * 
	 * @return the employeeBenefits 应付福利费
	 */
	public String getEmployeeBenefits() {
		return EmployeeBenefits;
	}

	/**
	 * 设置 employeeBenefits
	 * 
	 * @param employeeBenefits
	 *            应付福利费
	 */
	public void setEmployeeBenefits(String employeeBenefits) {
		EmployeeBenefits = employeeBenefits;
	}

	/**
	 * 获取 incomePayable
	 * 
	 * @return the incomePayable 应付利润
	 */
	public String getIncomePayable() {
		return IncomePayable;
	}

	/**
	 * 设置 incomePayable
	 * 
	 * @param incomePayable
	 *            应付利润
	 */
	public void setIncomePayable(String incomePayable) {
		IncomePayable = incomePayable;
	}

	/**
	 * 获取 taxesPayable
	 * 
	 * @return the taxesPayable 应交税金
	 */
	public String getTaxesPayable() {
		return TaxesPayable;
	}

	/**
	 * 设置 taxesPayable
	 * 
	 * @param taxesPayable
	 *            应交税金
	 */
	public void setTaxesPayable(String taxesPayable) {
		TaxesPayable = taxesPayable;
	}

	/**
	 * 获取 otherPayableToGovernment
	 * 
	 * @return the otherPayableToGovernment 其他应交款
	 */
	public String getOtherPayableToGovernment() {
		return OtherPayableToGovernment;
	}

	/**
	 * 设置 otherPayableToGovernment
	 * 
	 * @param otherPayableToGovernment
	 *            其他应交款
	 */
	public void setOtherPayableToGovernment(String otherPayableToGovernment) {
		OtherPayableToGovernment = otherPayableToGovernment;
	}

	/**
	 * 获取 otherPayable
	 * 
	 * @return the otherPayable 其他应付款
	 */
	public String getOtherPayable() {
		return OtherPayable;
	}

	/**
	 * 设置 otherPayable
	 * 
	 * @param otherPayable
	 *            其他应付款
	 */
	public void setOtherPayable(String otherPayable) {
		OtherPayable = otherPayable;
	}

	/**
	 * 获取 provisionForExpenses
	 * 
	 * @return the provisionForExpenses 预提费用
	 */
	public String getProvisionForExpenses() {
		return ProvisionForExpenses;
	}

	/**
	 * 设置 provisionForExpenses
	 * 
	 * @param provisionForExpenses
	 *            预提费用
	 */
	public void setProvisionForExpenses(String provisionForExpenses) {
		ProvisionForExpenses = provisionForExpenses;
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
	 * 获取 longTermLiabilitiesDueWithinOneYear
	 * 
	 * @return the longTermLiabilitiesDueWithinOneYear 一年内到期的长期负债
	 */
	public String getLongTermLiabilitiesDueWithinOneYear() {
		return LongTermLiabilitiesDueWithinOneYear;
	}

	/**
	 * 设置 longTermLiabilitiesDueWithinOneYear
	 * 
	 * @param longTermLiabilitiesDueWithinOneYear
	 *            一年内到期的长期负债
	 */
	public void setLongTermLiabilitiesDueWithinOneYear(
			String longTermLiabilitiesDueWithinOneYear) {
		LongTermLiabilitiesDueWithinOneYear = longTermLiabilitiesDueWithinOneYear;
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
	 * 获取 bondsPayable
	 * 
	 * @return the bondsPayable 应付债券
	 */
	public String getBondsPayable() {
		return BondsPayable;
	}

	/**
	 * 设置 bondsPayable
	 * 
	 * @param bondsPayable
	 *            应付债券
	 */
	public void setBondsPayable(String bondsPayable) {
		BondsPayable = bondsPayable;
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
	 * 获取 otherLongTermLiabilities
	 * 
	 * @return the otherLongTermLiabilities 其他长期负债
	 */
	public String getOtherLongTermLiabilities() {
		return OtherLongTermLiabilities;
	}

	/**
	 * 设置 otherLongTermLiabilities
	 * 
	 * @param otherLongTermLiabilities
	 *            其他长期负债
	 */
	public void setOtherLongTermLiabilities(String otherLongTermLiabilities) {
		OtherLongTermLiabilities = otherLongTermLiabilities;
	}

	/**
	 * 获取 specialReserveFund
	 * 
	 * @return the specialReserveFund （其他长期负债科目下）特准储备基金
	 */
	public String getSpecialReserveFund() {
		return SpecialReserveFund;
	}

	/**
	 * 设置 specialReserveFund
	 * 
	 * @param specialReserveFund
	 *            （其他长期负债科目下）特准储备基金
	 */
	public void setSpecialReserveFund(String specialReserveFund) {
		SpecialReserveFund = specialReserveFund;
	}

	/**
	 * 获取 totalLongTermLiabilities
	 * 
	 * @return the totalLongTermLiabilities 长期负债合计
	 */
	public String getTotalLongTermLiabilities() {
		return TotalLongTermLiabilities;
	}

	/**
	 * 设置 totalLongTermLiabilities
	 * 
	 * @param totalLongTermLiabilities
	 *            长期负债合计
	 */
	public void setTotalLongTermLiabilities(String totalLongTermLiabilities) {
		TotalLongTermLiabilities = totalLongTermLiabilities;
	}

	/**
	 * 获取 deferredTaxationCredit
	 * 
	 * @return the deferredTaxationCredit 递延税款贷项
	 */
	public String getDeferredTaxationCredit() {
		return DeferredTaxationCredit;
	}

	/**
	 * 设置 deferredTaxationCredit
	 * 
	 * @param deferredTaxationCredit
	 *            递延税款贷项
	 */
	public void setDeferredTaxationCredit(String deferredTaxationCredit) {
		DeferredTaxationCredit = deferredTaxationCredit;
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
	 * 获取 minorityInterest
	 * 
	 * @return the minorityInterest 少数股东权益
	 */
	public String getMinorityInterest() {
		return MinorityInterest;
	}

	/**
	 * 设置 minorityInterest
	 * 
	 * @param minorityInterest
	 *            少数股东权益
	 */
	public void setMinorityInterest(String minorityInterest) {
		MinorityInterest = minorityInterest;
	}

	/**
	 * 获取 paidInCapital
	 * 
	 * @return the paidInCapital 实收资本
	 */
	public String getPaidInCapital() {
		return PaidInCapital;
	}

	/**
	 * 设置 paidInCapital
	 * 
	 * @param paidInCapital
	 *            实收资本
	 */
	public void setPaidInCapital(String paidInCapital) {
		PaidInCapital = paidInCapital;
	}

	/**
	 * 获取 nationalCapital
	 * 
	 * @return the nationalCapital 国家资本
	 */
	public String getNationalCapital() {
		return NationalCapital;
	}

	/**
	 * 设置 nationalCapital
	 * 
	 * @param nationalCapital
	 *            国家资本
	 */
	public void setNationalCapital(String nationalCapital) {
		NationalCapital = nationalCapital;
	}

	/**
	 * 获取 collectiveCapital
	 * 
	 * @return the collectiveCapital 集体资本
	 */
	public String getCollectiveCapital() {
		return CollectiveCapital;
	}

	/**
	 * 设置 collectiveCapital
	 * 
	 * @param collectiveCapital
	 *            集体资本
	 */
	public void setCollectiveCapital(String collectiveCapital) {
		CollectiveCapital = collectiveCapital;
	}

	/**
	 * 获取 legalPersonsCapital
	 * 
	 * @return the legalPersonsCapital 法人资本
	 */
	public String getLegalPersonsCapital() {
		return LegalPersonsCapital;
	}

	/**
	 * 设置 legalPersonsCapital
	 * 
	 * @param legalPersonsCapital
	 *            法人资本
	 */
	public void setLegalPersonsCapital(String legalPersonsCapital) {
		LegalPersonsCapital = legalPersonsCapital;
	}

	/**
	 * 获取 stateOwnedLegalPersonsCapital
	 * 
	 * @return the stateOwnedLegalPersonsCapital （法人资本科目下）国有法人资本
	 */
	public String getStateOwnedLegalPersonsCapital() {
		return StateOwnedLegalPersonsCapital;
	}

	/**
	 * 设置 stateOwnedLegalPersonsCapital
	 * 
	 * @param stateOwnedLegalPersonsCapital
	 *            （法人资本科目下）国有法人资本
	 */
	public void setStateOwnedLegalPersonsCapital(
			String stateOwnedLegalPersonsCapital) {
		StateOwnedLegalPersonsCapital = stateOwnedLegalPersonsCapital;
	}

	/**
	 * 获取 collectiveLegalPersonsCapital
	 * 
	 * @return the collectiveLegalPersonsCapital （法人资本科目下）集体法人资本
	 */
	public String getCollectiveLegalPersonsCapital() {
		return CollectiveLegalPersonsCapital;
	}

	/**
	 * 设置 collectiveLegalPersonsCapital
	 * 
	 * @param collectiveLegalPersonsCapital
	 *            （法人资本科目下）集体法人资本
	 */
	public void setCollectiveLegalPersonsCapital(
			String collectiveLegalPersonsCapital) {
		CollectiveLegalPersonsCapital = collectiveLegalPersonsCapital;
	}

	/**
	 * 获取 personalCapital
	 * 
	 * @return the personalCapital 个人资本
	 */
	public String getPersonalCapital() {
		return PersonalCapital;
	}

	/**
	 * 设置 personalCapital
	 * 
	 * @param personalCapital
	 *            个人资本
	 */
	public void setPersonalCapital(String personalCapital) {
		PersonalCapital = personalCapital;
	}

	/**
	 * 获取 foreignBusinessmensCapital
	 * 
	 * @return the foreignBusinessmensCapital 外商资本
	 */
	public String getForeignBusinessmensCapital() {
		return ForeignBusinessmensCapital;
	}

	/**
	 * 设置 foreignBusinessmensCapital
	 * 
	 * @param foreignBusinessmensCapital
	 *            外商资本
	 */
	public void setForeignBusinessmensCapital(String foreignBusinessmensCapital) {
		ForeignBusinessmensCapital = foreignBusinessmensCapital;
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
	 * 获取 statutorySurplusReserve
	 * 
	 * @return the statutorySurplusReserve （盈余公积科目下）法定盈余公积
	 */
	public String getStatutorySurplusReserve() {
		return StatutorySurplusReserve;
	}

	/**
	 * 设置 statutorySurplusReserve
	 * 
	 * @param statutorySurplusReserve
	 *            （盈余公积科目下）法定盈余公积
	 */
	public void setStatutorySurplusReserve(String statutorySurplusReserve) {
		StatutorySurplusReserve = statutorySurplusReserve;
	}

	/**
	 * 获取 publicWelfareFund
	 * 
	 * @return the publicWelfareFund （盈余公积科目下）公益金
	 */
	public String getPublicWelfareFund() {
		return PublicWelfareFund;
	}

	/**
	 * 设置 publicWelfareFund
	 * 
	 * @param publicWelfareFund
	 *            （盈余公积科目下）公益金
	 */
	public void setPublicWelfareFund(String publicWelfareFund) {
		PublicWelfareFund = publicWelfareFund;
	}

	/**
	 * 获取 supplermentaryCurrentCapital
	 * 
	 * @return the supplermentaryCurrentCapital （盈余公积科目下）补充流动资本
	 */
	public String getSupplermentaryCurrentCapital() {
		return SupplermentaryCurrentCapital;
	}

	/**
	 * 设置 supplermentaryCurrentCapital
	 * 
	 * @param supplermentaryCurrentCapital
	 *            （盈余公积科目下）补充流动资本
	 */
	public void setSupplermentaryCurrentCapital(
			String supplermentaryCurrentCapital) {
		SupplermentaryCurrentCapital = supplermentaryCurrentCapital;
	}

	/**
	 * 获取 unaffirmedInvestmentLoss
	 * 
	 * @return the unaffirmedInvestmentLoss 未确认的投资损失
	 */
	public String getUnaffirmedInvestmentLoss() {
		return UnaffirmedInvestmentLoss;
	}

	/**
	 * 设置 unaffirmedInvestmentLoss
	 * 
	 * @param unaffirmedInvestmentLoss
	 *            未确认的投资损失
	 */
	public void setUnaffirmedInvestmentLoss(String unaffirmedInvestmentLoss) {
		UnaffirmedInvestmentLoss = unaffirmedInvestmentLoss;
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
	 * 获取 differenceOnTranslationOfForeignCurrencyFinancialStatements
	 * 
	 * @return the differenceOnTranslationOfForeignCurrencyFinancialStatements
	 *         外币报表折算差额
	 */
	public String getDifferenceOnTranslationOfForeignCurrencyFinancialStatements() {
		return DifferenceOnTranslationOfForeignCurrencyFinancialStatements;
	}

	/**
	 * 设置 differenceOnTranslationOfForeignCurrencyFinancialStatements
	 * 
	 * @param differenceOnTranslationOfForeignCurrencyFinancialStatements
	 *            外币报表折算差额
	 */
	public void setDifferenceOnTranslationOfForeignCurrencyFinancialStatements(
			String differenceOnTranslationOfForeignCurrencyFinancialStatements) {
		DifferenceOnTranslationOfForeignCurrencyFinancialStatements = differenceOnTranslationOfForeignCurrencyFinancialStatements;
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
	 * @return the totalEquityAndLiabilities 负债和所有者权益总计
	 */
	public String getTotalEquityAndLiabilities() {
		return TotalEquityAndLiabilities;
	}

	/**
	 * 设置 totalEquityAndLiabilities
	 * 
	 * @param totalEquityAndLiabilities
	 *            负债和所有者权益总计
	 */
	public void setTotalEquityAndLiabilities(String totalEquityAndLiabilities) {
		TotalEquityAndLiabilities = totalEquityAndLiabilities;
	}
}
