package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InstitutionBalanceSheetSgmt<br/>
 * Description:事业单位资产负债表段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "CurrencyFunds", "ShortTermInvestments",
		"AmountOfFinancialReturn", "NotesReceivable", "AccountsReceivable",
		"Prepayments", "OtherReceivables", "Inventories", "OtherCurrentAssets",
		"TotalCurrentAssets", "LongTermInvestment", "FixedAssets",
		"OriginalCostOfFixedAsset", "FixedAssetAccumulatedDepreciation",
		"ConstructionInProcess", "IntangibleAssets",
		"OriginalPriceOfIntangibleAssets", "AccumulatedAmortization",
		"AssetsToBeProcessedPendingTheProfit", "TotalNonCurrentAssets",
		"TotalAssets", "ShortTermBorrowings", "TaxPayable", "TreasuryPayable",
		"PayableFinancialSpecialAccount", "EmployeeBenefitsPayable",
		"NotesPayable", "AccountsPayable", "ReceiptsInAdvance",
		"OtherPayables", "OtherCurrentLiabilities", "TotalCurrentLiabilities",
		"LongTermBorrowings", "LongTermPayables", "TotalNonCurrentLiabilities",
		"TotalLiabilities", "EnterpriseFund", "NonCurrentAssetsFund",
		"SpecialPurposeFunds", "FinancialAidCarriedOver",
		"FinancialAidBalance", "NonFinancialAidCarriedOver",
		"NonFinancialAidBalance", "UndertakingsBalance", "OperatingBalance",
		"TotalNetAssets", "TotalLiabilitiesAndNetAssets" },namespace = "com.dhcc.xml.ent.entity.finance")
// 指定序列成的xml节点顺序
public class InstitutionBalanceSheetSgmt {
	/**
	 *货币资金
	 */
	@XmlElement
	private String CurrencyFunds;
	/**
	 *短期投资
	 */
	@XmlElement
	private String ShortTermInvestments;
	/**
	 *财政应返还额度
	 */
	@XmlElement
	private String AmountOfFinancialReturn;
	/**
	 *应收票据
	 */
	@XmlElement
	private String NotesReceivable;
	/**
	 *应收账款
	 */
	@XmlElement
	private String AccountsReceivable;
	/**
	 *预付账款
	 */
	@XmlElement
	private String Prepayments;
	/**
	 *其他应收款
	 */
	@XmlElement
	private String OtherReceivables;
	/**
	 *存货
	 */
	@XmlElement
	private String Inventories;
	/**
	 *其他流动资产
	 */
	@XmlElement
	private String OtherCurrentAssets;
	/**
	 *流动资产合计
	 */
	@XmlElement
	private String TotalCurrentAssets;
	/**
	 *长期投资
	 */
	@XmlElement
	private String LongTermInvestment;
	/**
	 *固定资产
	 */
	@XmlElement
	private String FixedAssets;
	/**
	 *固定资产原价
	 */
	@XmlElement
	private String OriginalCostOfFixedAsset;
	/**
	 *累计折旧
	 */
	@XmlElement
	private String FixedAssetAccumulatedDepreciation;
	/**
	 *在建工程
	 */
	@XmlElement
	private String ConstructionInProcess;
	/**
	 *无形资产
	 */
	@XmlElement
	private String IntangibleAssets;
	/**
	 *无形资产原价
	 */
	@XmlElement
	private String OriginalPriceOfIntangibleAssets;
	/**
	 *累计摊销
	 */
	@XmlElement
	private String AccumulatedAmortization;
	/**
	 *待处置资产损溢
	 */
	@XmlElement
	private String AssetsToBeProcessedPendingTheProfit;
	/**
	 *非流动资产合计
	 */
	@XmlElement
	private String TotalNonCurrentAssets;
	/**
	 *资产总计
	 */
	@XmlElement
	private String TotalAssets;
	/**
	 *短期借款
	 */
	@XmlElement
	private String ShortTermBorrowings;
	/**
	 *应缴税费
	 */
	@XmlElement
	private String TaxPayable;
	/**
	 *应缴国库款
	 */
	@XmlElement
	private String TreasuryPayable;
	/**
	 *应缴财政专户款
	 */
	@XmlElement
	private String PayableFinancialSpecialAccount;
	/**
	 *应付职工薪酬
	 */
	@XmlElement
	private String EmployeeBenefitsPayable;
	/**
	 *应付票据
	 */
	@XmlElement
	private String NotesPayable;
	/**
	 *应付账款
	 */
	@XmlElement
	private String AccountsPayable;
	/**
	 *预收账款
	 */
	@XmlElement
	private String ReceiptsInAdvance;
	/**
	 *其他应付款
	 */
	@XmlElement
	private String OtherPayables;
	/**
	 *其他流动负债
	 */
	@XmlElement
	private String OtherCurrentLiabilities;
	/**
	 *流动负债合计
	 */
	@XmlElement
	private String TotalCurrentLiabilities;
	/**
	 *长期借款
	 */
	@XmlElement
	private String LongTermBorrowings;
	/**
	 *长期应付款
	 */
	@XmlElement
	private String LongTermPayables;
	/**
	 *非流动负债合计
	 */
	@XmlElement
	private String TotalNonCurrentLiabilities;
	/**
	 *负债合计
	 */
	@XmlElement
	private String TotalLiabilities;
	/**
	 *事业基金
	 */
	@XmlElement
	private String EnterpriseFund;
	/**
	 *非流动资产基金
	 */
	@XmlElement
	private String NonCurrentAssetsFund;
	/**
	 *专用基金
	 */
	@XmlElement
	private String SpecialPurposeFunds;
	/**
	 *财政补助结转
	 */
	@XmlElement
	private String FinancialAidCarriedOver;
	/**
	 *财政补助结余
	 */
	@XmlElement
	private String FinancialAidBalance;
	/**
	 *非财政补助结转
	 */
	@XmlElement
	private String NonFinancialAidCarriedOver;
	/**
	 *非财政补助结余
	 */
	@XmlElement
	private String NonFinancialAidBalance;
	/**
	 *事业结余
	 */
	@XmlElement
	private String UndertakingsBalance;
	/**
	 *经营结余
	 */
	@XmlElement
	private String OperatingBalance;
	/**
	 *净资产合计
	 */
	@XmlElement
	private String TotalNetAssets;
	/**
	 *负债和净资产总计
	 */
	@XmlElement
	private String TotalLiabilitiesAndNetAssets;

	public InstitutionBalanceSheetSgmt() {
		super();
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
	 * 获取 amountOfFinancialReturn
	 * 
	 * @return the amountOfFinancialReturn 财政应返还额度
	 */
	public String getAmountOfFinancialReturn() {
		return AmountOfFinancialReturn;
	}

	/**
	 * 设置 amountOfFinancialReturn
	 * 
	 * @param amountOfFinancialReturn
	 *            财政应返还额度
	 */
	public void setAmountOfFinancialReturn(String amountOfFinancialReturn) {
		AmountOfFinancialReturn = amountOfFinancialReturn;
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
	 * 获取 constructionInProcess
	 * 
	 * @return the constructionInProcess 在建工程
	 */
	public String getConstructionInProcess() {
		return ConstructionInProcess;
	}

	/**
	 * 设置 constructionInProcess
	 * 
	 * @param constructionInProcess
	 *            在建工程
	 */
	public void setConstructionInProcess(String constructionInProcess) {
		ConstructionInProcess = constructionInProcess;
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
	 * 获取 originalPriceOfIntangibleAssets
	 * 
	 * @return the originalPriceOfIntangibleAssets 无形资产原价
	 */
	public String getOriginalPriceOfIntangibleAssets() {
		return OriginalPriceOfIntangibleAssets;
	}

	/**
	 * 设置 originalPriceOfIntangibleAssets
	 * 
	 * @param originalPriceOfIntangibleAssets
	 *            无形资产原价
	 */
	public void setOriginalPriceOfIntangibleAssets(
			String originalPriceOfIntangibleAssets) {
		OriginalPriceOfIntangibleAssets = originalPriceOfIntangibleAssets;
	}

	/**
	 * 获取 accumulatedAmortization
	 * 
	 * @return the accumulatedAmortization 累计摊销
	 */
	public String getAccumulatedAmortization() {
		return AccumulatedAmortization;
	}

	/**
	 * 设置 accumulatedAmortization
	 * 
	 * @param accumulatedAmortization
	 *            累计摊销
	 */
	public void setAccumulatedAmortization(String accumulatedAmortization) {
		AccumulatedAmortization = accumulatedAmortization;
	}

	/**
	 * 获取 assetsToBeProcessedPendingTheProfit
	 * 
	 * @return the assetsToBeProcessedPendingTheProfit 待处置资产损溢
	 */
	public String getAssetsToBeProcessedPendingTheProfit() {
		return AssetsToBeProcessedPendingTheProfit;
	}

	/**
	 * 设置 assetsToBeProcessedPendingTheProfit
	 * 
	 * @param assetsToBeProcessedPendingTheProfit
	 *            待处置资产损溢
	 */
	public void setAssetsToBeProcessedPendingTheProfit(
			String assetsToBeProcessedPendingTheProfit) {
		AssetsToBeProcessedPendingTheProfit = assetsToBeProcessedPendingTheProfit;
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
	 * 获取 taxPayable
	 * 
	 * @return the taxPayable 应缴税费
	 */
	public String getTaxPayable() {
		return TaxPayable;
	}

	/**
	 * 设置 taxPayable
	 * 
	 * @param taxPayable
	 *            应缴税费
	 */
	public void setTaxPayable(String taxPayable) {
		TaxPayable = taxPayable;
	}

	/**
	 * 获取 treasuryPayable
	 * 
	 * @return the treasuryPayable 应缴国库款
	 */
	public String getTreasuryPayable() {
		return TreasuryPayable;
	}

	/**
	 * 设置 treasuryPayable
	 * 
	 * @param treasuryPayable
	 *            应缴国库款
	 */
	public void setTreasuryPayable(String treasuryPayable) {
		TreasuryPayable = treasuryPayable;
	}

	/**
	 * 获取 payableFinancialSpecialAccount
	 * 
	 * @return the payableFinancialSpecialAccount 应缴财政专户款
	 */
	public String getPayableFinancialSpecialAccount() {
		return PayableFinancialSpecialAccount;
	}

	/**
	 * 设置 payableFinancialSpecialAccount
	 * 
	 * @param payableFinancialSpecialAccount
	 *            应缴财政专户款
	 */
	public void setPayableFinancialSpecialAccount(
			String payableFinancialSpecialAccount) {
		PayableFinancialSpecialAccount = payableFinancialSpecialAccount;
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
	 * @return the accountsPayable 应付账款 
	 */
	public String getAccountsPayable() {
		return AccountsPayable;
	}

	/**  
	 * 设置 accountsPayable  
	 * @param accountsPayable 应付账款  
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
	 * 获取 enterpriseFund
	 * 
	 * @return the enterpriseFund 事业基金
	 */
	public String getEnterpriseFund() {
		return EnterpriseFund;
	}

	/**
	 * 设置 enterpriseFund
	 * 
	 * @param enterpriseFund
	 *            事业基金
	 */
	public void setEnterpriseFund(String enterpriseFund) {
		EnterpriseFund = enterpriseFund;
	}

	/**
	 * 获取 nonCurrentAssetsFund
	 * 
	 * @return the nonCurrentAssetsFund 非流动资产基金
	 */
	public String getNonCurrentAssetsFund() {
		return NonCurrentAssetsFund;
	}

	/**
	 * 设置 nonCurrentAssetsFund
	 * 
	 * @param nonCurrentAssetsFund
	 *            非流动资产基金
	 */
	public void setNonCurrentAssetsFund(String nonCurrentAssetsFund) {
		NonCurrentAssetsFund = nonCurrentAssetsFund;
	}

	/**
	 * 获取 specialPurposeFunds
	 * 
	 * @return the specialPurposeFunds 专用基金
	 */
	public String getSpecialPurposeFunds() {
		return SpecialPurposeFunds;
	}

	/**
	 * 设置 specialPurposeFunds
	 * 
	 * @param specialPurposeFunds
	 *            专用基金
	 */
	public void setSpecialPurposeFunds(String specialPurposeFunds) {
		SpecialPurposeFunds = specialPurposeFunds;
	}

	/**
	 * 获取 financialAidCarriedOver
	 * 
	 * @return the financialAidCarriedOver 财政补助结转
	 */
	public String getFinancialAidCarriedOver() {
		return FinancialAidCarriedOver;
	}

	/**
	 * 设置 financialAidCarriedOver
	 * 
	 * @param financialAidCarriedOver
	 *            财政补助结转
	 */
	public void setFinancialAidCarriedOver(String financialAidCarriedOver) {
		FinancialAidCarriedOver = financialAidCarriedOver;
	}

	/**
	 * 获取 financialAidBalance
	 * 
	 * @return the financialAidBalance 财政补助结余
	 */
	public String getFinancialAidBalance() {
		return FinancialAidBalance;
	}

	/**
	 * 设置 financialAidBalance
	 * 
	 * @param financialAidBalance
	 *            财政补助结余
	 */
	public void setFinancialAidBalance(String financialAidBalance) {
		FinancialAidBalance = financialAidBalance;
	}

	/**
	 * 获取 nonFinancialAidCarriedOver
	 * 
	 * @return the nonFinancialAidCarriedOver 非财政补助结转
	 */
	public String getNonFinancialAidCarriedOver() {
		return NonFinancialAidCarriedOver;
	}

	/**
	 * 设置 nonFinancialAidCarriedOver
	 * 
	 * @param nonFinancialAidCarriedOver
	 *            非财政补助结转
	 */
	public void setNonFinancialAidCarriedOver(String nonFinancialAidCarriedOver) {
		NonFinancialAidCarriedOver = nonFinancialAidCarriedOver;
	}

	/**
	 * 获取 nonFinancialAidBalance
	 * 
	 * @return the nonFinancialAidBalance 非财政补助结余
	 */
	public String getNonFinancialAidBalance() {
		return NonFinancialAidBalance;
	}

	/**
	 * 设置 nonFinancialAidBalance
	 * 
	 * @param nonFinancialAidBalance
	 *            非财政补助结余
	 */
	public void setNonFinancialAidBalance(String nonFinancialAidBalance) {
		NonFinancialAidBalance = nonFinancialAidBalance;
	}

	/**
	 * 获取 undertakingsBalance
	 * 
	 * @return the undertakingsBalance 事业结余
	 */
	public String getUndertakingsBalance() {
		return UndertakingsBalance;
	}

	/**
	 * 设置 undertakingsBalance
	 * 
	 * @param undertakingsBalance
	 *            事业结余
	 */
	public void setUndertakingsBalance(String undertakingsBalance) {
		UndertakingsBalance = undertakingsBalance;
	}

	/**
	 * 获取 operatingBalance
	 * 
	 * @return the operatingBalance 经营结余
	 */
	public String getOperatingBalance() {
		return OperatingBalance;
	}

	/**
	 * 设置 operatingBalance
	 * 
	 * @param operatingBalance
	 *            经营结余
	 */
	public void setOperatingBalance(String operatingBalance) {
		OperatingBalance = operatingBalance;
	}

	/**
	 * 获取 totalNetAssets
	 * 
	 * @return the totalNetAssets 净资产合计
	 */
	public String getTotalNetAssets() {
		return TotalNetAssets;
	}

	/**
	 * 设置 totalNetAssets
	 * 
	 * @param totalNetAssets
	 *            净资产合计
	 */
	public void setTotalNetAssets(String totalNetAssets) {
		TotalNetAssets = totalNetAssets;
	}

	/**
	 * 获取 totalLiabilitiesAndNetAssets
	 * 
	 * @return the totalLiabilitiesAndNetAssets 负债和净资产总计
	 */
	public String getTotalLiabilitiesAndNetAssets() {
		return TotalLiabilitiesAndNetAssets;
	}

	/**
	 * 设置 totalLiabilitiesAndNetAssets
	 * 
	 * @param totalLiabilitiesAndNetAssets
	 *            负债和净资产总计
	 */
	public void setTotalLiabilitiesAndNetAssets(
			String totalLiabilitiesAndNetAssets) {
		TotalLiabilitiesAndNetAssets = totalLiabilitiesAndNetAssets;
	}

	@Override
	public String toString() {
		return "InstitutionBalanceSheetSgmt [" + "CurrencyFunds="
				+ CurrencyFunds + "ShortTermInvestments="
				+ ShortTermInvestments + "AmountOfFinancialReturn="
				+ AmountOfFinancialReturn + "NotesReceivable="
				+ NotesReceivable + "AccountsReceivable=" + AccountsReceivable
				+ "Prepayments=" + Prepayments + "OtherReceivables="
				+ OtherReceivables + "Inventories =" + Inventories
				+ "OtherCurrentAssets=" + OtherCurrentAssets
				+ "TotalCurrentAssets=" + TotalCurrentAssets
				+ "LongTermInvestment=" + LongTermInvestment + "FixedAssets="
				+ FixedAssets + "OriginalCostOfFixedAsset="
				+ OriginalCostOfFixedAsset
				+ "FixedAssetAccumulatedDepreciation="
				+ FixedAssetAccumulatedDepreciation + "ConstructionInProcess="
				+ ConstructionInProcess + "IntangibleAssets="
				+ IntangibleAssets + "OriginalPriceOfIntangibleAssets="
				+ OriginalPriceOfIntangibleAssets + "AccumulatedAmortization="
				+ AccumulatedAmortization
				+ "AssetsToBeProcessedPendingTheProfit="
				+ AssetsToBeProcessedPendingTheProfit
				+ "TotalNonCurrentAssets =" + TotalNonCurrentAssets
				+ "TotalAssets=" + TotalAssets + "ShortTermBorrowings="
				+ ShortTermBorrowings + "TaxPayable=" + TaxPayable
				+ "TreasuryPayable=" + TreasuryPayable
				+ "PayableFinancialSpecialAccount="
				+ PayableFinancialSpecialAccount + "EmployeeBenefitsPayable?="
				+ EmployeeBenefitsPayable + "NotesPayable=" + NotesPayable
				+ "AccountsPayable=" + AccountsPayable + "ReceiptsInAdvance="
				+ ReceiptsInAdvance + "OtherPayables=" + OtherPayables
				+ "OtherCurrentLiabilities=" + OtherCurrentLiabilities
				+ "TotalCurrentLiabilities=" + TotalCurrentLiabilities
				+ "LongTermBorrowings=" + LongTermBorrowings
				+ "LongTermPayables=" + LongTermPayables
				+ "TotalNonCurrentLiabilities=" + TotalNonCurrentLiabilities
				+ "TotalLiabilities=" + TotalLiabilities + "EnterpriseFund="
				+ EnterpriseFund + "NonCurrentAssetsFund="
				+ NonCurrentAssetsFund + "SpecialPurposeFunds="
				+ SpecialPurposeFunds + "FinancialAidCarriedOver="
				+ FinancialAidCarriedOver + "FinancialAidBalance="
				+ FinancialAidBalance + "NonFinancialAidCarriedOver="
				+ NonFinancialAidCarriedOver + "NonFinancialAidBalance="
				+ NonFinancialAidBalance + "UndertakingsBalance="
				+ UndertakingsBalance + "OperatingBalance=" + OperatingBalance
				+ "TotalNetAssets=" + TotalNetAssets
				+ "TotalLiabilitiesAndNetAssets" + TotalLiabilitiesAndNetAssets
				+ "]";
	}

}
