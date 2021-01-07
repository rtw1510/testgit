package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: IncomeStatementProfitAppropriation2002Sgmt<br/>
 * Description:2002版利润及利润分配表段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "MainRevenuefRevenue",
		"SalesIncomeOfExportGoodsProducts", "SalesIncomeOfImportGoodsProducts",
		"DiscountAndAllowance", "NetAmountOfIncomeFromMainBusiness",
		"MainOperatingCost", "SalesIncomeOfExportProducts",
		"PrincipleBusinessTaxAndExtraCharge", "OperationExpense",
		"OthersOperatingCost", "DeferredIncome", "IncomeFromSalesAgency",
		"OtherOperatingIncome", "PrincipleBusinessProfit",
		"OtherBusinessProfit", "SellingExpenses",
		"GeneralAndAdministrativeExpenses", "FinancialExpenses",
		"OthersExpenses", "OperatingProfits", "InvestmentIncome",
		"FuturesIncome", "AllowanceIncome", "AllowanceIncomeBeforeAllowance",
		"NonOperatingIncome", "NetGainOnDisposalOfFixedAssets",
		"IncomeFromNonCurrencyTrade", "IncomeFromSalesOfIntangibleAssets",
		"IncomeFromPenalty", "OthersIncome",
		"CalculatingFromTheContentSalaryBefore", "NonOperatingExpenses",
		"LossFromDisposalOfFixedAssets", "ExchangeOfNonMonetaryAssetsLoss",
		"LossOfLawsuits", "PaymentForDonation", "OtherPayments",
		"BalanceOfContentSalary", "TotalProfit", "Incometax", "ImparimentLoss",
		"UnrealizedInvestmentLosses", "NetProfit",
		"ProfitDistributionAtBeginningOfPeriod",
		"CompensationOfSurplusReserve", "OtherAdjustmentFactors",
		"ProfitAvailableForDistribution", "ProfitReservedForASingleItem",
		"SupplementaryCurrentCapital",
		"AppropriationOfStatutorySurplusReserves",
		"AppropriationOfStatutoryWelfareFund",
		"AppropriationOfStaffIncentiveAndWelfareFund",
		"AppropriationOfReserveFund", "AppropriationOfEnterpriseExpansionFund",
		"ProfitsCapitalizadOnReturnOfInvestment", "Others",
		"ProfitAvailableForOwnersDistribution",
		"PreferredStockDividendsPayable",
		"WithdrawalOtherCommonAccumulationFund",
		"PayableDividendsOfCommonStock",
		"TransferFromOrdinarySharesDividendToPaidInCapitalOrStock",
		"OthersForOwners", "UnappropriatedProfit", "LossCompensatedBeforeTheTax" },namespace = "com.dhcc.xml.ent.entity.finance")
// 指定序列成的xml节点顺序
public class IncomeStatementProfitAppropriation2002Sgmt {
	/**
	 *主营业务收入
	 */
	@XmlElement
	private String MainRevenuefRevenue;
	/**
	 *（主营业务收入科目下）出口产品销售收入
	 */
	@XmlElement
	private String SalesIncomeOfExportGoodsProducts;
	/**
	 *（主营业务收入科目下）进口产品销售收入
	 */
	@XmlElement
	private String SalesIncomeOfImportGoodsProducts;
	/**
	 *销售折扣与折让
	 */
	@XmlElement
	private String DiscountAndAllowance;
	/**
	 *主营业务收入净额
	 */
	@XmlElement
	private String NetAmountOfIncomeFromMainBusiness;
	/**
	 *主营业务成本
	 */
	@XmlElement
	private String MainOperatingCost;
	/**
	 *（主营业务成本科目下）出口产品销售成本
	 */
	@XmlElement
	private String SalesIncomeOfExportProducts;
	/**
	 * 主营业务税金及附加
	 */
	@XmlElement
	private String PrincipleBusinessTaxAndExtraCharge;
	/**
	 *经营费用
	 */
	@XmlElement
	private String OperationExpense;
	/**
	 *其他（业务成本）
	 */
	@XmlElement
	private String OthersOperatingCost;
	/**
	 *递延收益
	 */
	@XmlElement
	private String DeferredIncome;
	/**
	 *代购代销收入
	 */
	@XmlElement
	private String IncomeFromSalesAgency;
	/**
	 *其他（收入）
	 */
	@XmlElement
	private String OtherOperatingIncome;
	/**
	 * 主营业务利润
	 */
	@XmlElement
	private String PrincipleBusinessProfit;
	/**
	 *其他业务利润
	 */
	@XmlElement
	private String OtherBusinessProfit;
	/**
	 *营业费用
	 */
	@XmlElement
	private String SellingExpenses;
	/**
	 *管理费用
	 */
	@XmlElement
	private String GeneralAndAdministrativeExpenses;
	/**
	 *财务费用
	 */
	@XmlElement
	private String FinancialExpenses;
	/**
	 *其他（费用）
	 */
	@XmlElement
	private String OthersExpenses;
	/**
	 *营业利润
	 */
	@XmlElement
	private String OperatingProfits;
	/**
	 *投资收益
	 */
	@XmlElement
	private String InvestmentIncome;
	/**
	 *期货收益
	 */
	@XmlElement
	private String FuturesIncome;
	/**
	 *补贴收入
	 */
	@XmlElement
	private String AllowanceIncome;
	/**
	 *（补贴收入科目下）补贴前亏损的企业补贴收入
	 */
	@XmlElement
	private String AllowanceIncomeBeforeAllowance;
	/**
	 *营业外收入
	 */
	@XmlElement
	private String NonOperatingIncome;
	/**
	 *（营业外收入科目下）处置固定资产净收益
	 */
	@XmlElement
	private String NetGainOnDisposalOfFixedAssets;
	/**
	 *（营业外收入科目下）非货币性交易收益
	 */
	@XmlElement
	private String IncomeFromNonCurrencyTrade;
	/**
	 *（营业外收入科目下）出售无形资产收益
	 */
	@XmlElement
	private String IncomeFromSalesOfIntangibleAssets;
	/**
	 *（营业外收入科目下）罚款净收入
	 */
	@XmlElement
	private String IncomeFromPenalty;
	/**
	 *其他（利润）
	 */
	@XmlElement
	private String OthersIncome;
	/**
	 *（其他科目下）用以前年度含量工资节余弥补利润
	 */
	@XmlElement
	private String CalculatingFromTheContentSalaryBefore;
	/**
	 *营业外支出
	 */
	@XmlElement
	private String NonOperatingExpenses;
	/**
	 *（营业外支出科目下）处置固定资产净损失
	 */
	@XmlElement
	private String LossFromDisposalOfFixedAssets;
	/**
	 *（营业外支出科目下）债务重组损失
	 */
	@XmlElement
	private String ExchangeOfNonMonetaryAssetsLoss;
	/**
	 *（营业外支出科目下）罚款支出
	 */
	@XmlElement
	private String LossOfLawsuits;
	/**
	 *（营业外支出科目下）捐赠支出
	 */
	@XmlElement
	private String PaymentForDonation;
	/**
	 * 其他支出
	 */
	@XmlElement
	private String OtherPayments;
	/**
	 *（其他支出）结转的含量工资包干节余
	 */
	@XmlElement
	private String BalanceOfContentSalary;
	/**
	 *利润总额
	 */
	@XmlElement
	private String TotalProfit;
	/**
	 *所得税
	 */
	@XmlElement
	private String Incometax;
	/**
	 *少数股东损益
	 */
	@XmlElement
	private String ImparimentLoss;
	/**
	 *未确认的投资损失
	 */
	@XmlElement
	private String UnrealizedInvestmentLosses;
	/**
	 *净利润
	 */
	@XmlElement
	private String NetProfit;
	/**
	 *年初未分配利润
	 */
	@XmlElement
	private String ProfitDistributionAtBeginningOfPeriod;
	/**
	 *盈余公积补亏
	 */
	@XmlElement
	private String CompensationOfSurplusReserve;
	/**
	 *其他调整因素
	 */
	@XmlElement
	private String OtherAdjustmentFactors;
	/**
	 *可供分配的利润
	 */
	@XmlElement
	private String ProfitAvailableForDistribution;
	/**
	 *单项留用的利润
	 */
	@XmlElement
	private String ProfitReservedForASingleItem;
	/**
	 *补充流动资本
	 */
	@XmlElement
	private String SupplementaryCurrentCapital;
	/**
	 * 提取法定盈余公积
	 */
	@XmlElement
	private String AppropriationOfStatutorySurplusReserves;
	/**
	 *提取法定公益金
	 */
	@XmlElement
	private String AppropriationOfStatutoryWelfareFund;
	/**
	 *提取职工奖励及福利基金
	 */
	@XmlElement
	private String AppropriationOfStaffIncentiveAndWelfareFund;
	/**
	 *提取储备基金
	 */
	@XmlElement
	private String AppropriationOfReserveFund;
	/**
	 *提取企业发展基金
	 */
	@XmlElement
	private String AppropriationOfEnterpriseExpansionFund;
	/**
	 *利润归还投资
	 */
	@XmlElement
	private String ProfitsCapitalizadOnReturnOfInvestment;
	/**
	 *（可供分配的利润科目下）其他
	 */
	@XmlElement
	private String Others;
	/**
	 *可供投资者分配的利润
	 */
	@XmlElement
	private String ProfitAvailableForOwnersDistribution;
	/**
	 *应付优先股股利
	 */
	@XmlElement
	private String PreferredStockDividendsPayable;
	/**
	 *提取任意盈余公积
	 */
	@XmlElement
	private String WithdrawalOtherCommonAccumulationFund;
	/**
	 *应付普通股股利
	 */
	@XmlElement
	private String PayableDividendsOfCommonStock;
	/**
	 *转作资本的普通股股利
	 */
	@XmlElement
	private String TransferFromOrdinarySharesDividendToPaidInCapitalOrStock;

	/**
	 *（可供投资者分配的利润科目下）其他
	 */
	@XmlElement
	private String OthersForOwners;
	/**
	 *未分配利润
	 */
	@XmlElement
	private String UnappropriatedProfit;
	/**
	 *（未分配利润科目下）应由以后年度税前利润弥补的亏损
	 */
	@XmlElement
	private String LossCompensatedBeforeTheTax;

	public IncomeStatementProfitAppropriation2002Sgmt() {
		super();
	}

	/**  
	 * 获取 mainRevenuefRevenue
	 * @return the mainRevenuefRevenue 主营业务收入 
	 */
	public String getMainRevenuefRevenue() {
		return MainRevenuefRevenue;
	}

	/**  
	 * 设置 mainRevenuefRevenue  
	 * @param mainRevenuefRevenue 主营业务收入  
	 */
	public void setMainRevenuefRevenue(String mainRevenuefRevenue) {
		MainRevenuefRevenue = mainRevenuefRevenue;
	}

	/**  
	 * 获取 salesIncomeOfExportGoodsProducts
	 * @return the salesIncomeOfExportGoodsProducts （主营业务收入科目下）出口产品销售收入 
	 */
	public String getSalesIncomeOfExportGoodsProducts() {
		return SalesIncomeOfExportGoodsProducts;
	}

	/**  
	 * 设置 salesIncomeOfExportGoodsProducts  
	 * @param salesIncomeOfExportGoodsProducts （主营业务收入科目下）出口产品销售收入  
	 */
	public void setSalesIncomeOfExportGoodsProducts(
			String salesIncomeOfExportGoodsProducts) {
		SalesIncomeOfExportGoodsProducts = salesIncomeOfExportGoodsProducts;
	}

	/**  
	 * 获取 salesIncomeOfImportGoodsProducts
	 * @return the salesIncomeOfImportGoodsProducts （主营业务收入科目下）进口产品销售收入 
	 */
	public String getSalesIncomeOfImportGoodsProducts() {
		return SalesIncomeOfImportGoodsProducts;
	}

	/**  
	 * 设置 salesIncomeOfImportGoodsProducts  
	 * @param salesIncomeOfImportGoodsProducts （主营业务收入科目下）进口产品销售收入  
	 */
	public void setSalesIncomeOfImportGoodsProducts(
			String salesIncomeOfImportGoodsProducts) {
		SalesIncomeOfImportGoodsProducts = salesIncomeOfImportGoodsProducts;
	}

	/**  
	 * 获取 discountAndAllowance
	 * @return the discountAndAllowance 销售折扣与折让 
	 */
	public String getDiscountAndAllowance() {
		return DiscountAndAllowance;
	}

	/**  
	 * 设置 discountAndAllowance  
	 * @param discountAndAllowance 销售折扣与折让  
	 */
	public void setDiscountAndAllowance(String discountAndAllowance) {
		DiscountAndAllowance = discountAndAllowance;
	}

	/**  
	 * 获取 netAmountOfIncomeFromMainBusiness
	 * @return the netAmountOfIncomeFromMainBusiness 主营业务收入净额 
	 */
	public String getNetAmountOfIncomeFromMainBusiness() {
		return NetAmountOfIncomeFromMainBusiness;
	}

	/**  
	 * 设置 netAmountOfIncomeFromMainBusiness  
	 * @param netAmountOfIncomeFromMainBusiness 主营业务收入净额  
	 */
	public void setNetAmountOfIncomeFromMainBusiness(
			String netAmountOfIncomeFromMainBusiness) {
		NetAmountOfIncomeFromMainBusiness = netAmountOfIncomeFromMainBusiness;
	}

	/**  
	 * 获取 mainOperatingCost
	 * @return the mainOperatingCost 主营业务成本 
	 */
	public String getMainOperatingCost() {
		return MainOperatingCost;
	}

	/**  
	 * 设置 mainOperatingCost  
	 * @param mainOperatingCost 主营业务成本  
	 */
	public void setMainOperatingCost(String mainOperatingCost) {
		MainOperatingCost = mainOperatingCost;
	}

	/**  
	 * 获取 salesIncomeOfExportProducts
	 * @return the salesIncomeOfExportProducts （主营业务成本科目下）出口产品销售成本 
	 */
	public String getSalesIncomeOfExportProducts() {
		return SalesIncomeOfExportProducts;
	}

	/**  
	 * 设置 salesIncomeOfExportProducts  
	 * @param salesIncomeOfExportProducts （主营业务成本科目下）出口产品销售成本  
	 */
	public void setSalesIncomeOfExportProducts(String salesIncomeOfExportProducts) {
		SalesIncomeOfExportProducts = salesIncomeOfExportProducts;
	}

	/**  
	 * 获取 principleBusinessTaxAndExtraCharge
	 * @return the principleBusinessTaxAndExtraCharge 主营业务税金及附加 
	 */
	public String getPrincipleBusinessTaxAndExtraCharge() {
		return PrincipleBusinessTaxAndExtraCharge;
	}

	/**  
	 * 设置 principleBusinessTaxAndExtraCharge  
	 * @param principleBusinessTaxAndExtraCharge 主营业务税金及附加  
	 */
	public void setPrincipleBusinessTaxAndExtraCharge(
			String principleBusinessTaxAndExtraCharge) {
		PrincipleBusinessTaxAndExtraCharge = principleBusinessTaxAndExtraCharge;
	}

	/**  
	 * 获取 operationExpense
	 * @return the operationExpense 经营费用 
	 */
	public String getOperationExpense() {
		return OperationExpense;
	}

	/**  
	 * 设置 operationExpense  
	 * @param operationExpense 经营费用  
	 */
	public void setOperationExpense(String operationExpense) {
		OperationExpense = operationExpense;
	}

	/**  
	 * 获取 othersOperatingCost
	 * @return the othersOperatingCost 其他（业务成本） 
	 */
	public String getOthersOperatingCost() {
		return OthersOperatingCost;
	}

	/**  
	 * 设置 othersOperatingCost  
	 * @param othersOperatingCost 其他（业务成本）  
	 */
	public void setOthersOperatingCost(String othersOperatingCost) {
		OthersOperatingCost = othersOperatingCost;
	}

	/**  
	 * 获取 deferredIncome
	 * @return the deferredIncome 递延收益 
	 */
	public String getDeferredIncome() {
		return DeferredIncome;
	}

	/**  
	 * 设置 deferredIncome  
	 * @param deferredIncome 递延收益  
	 */
	public void setDeferredIncome(String deferredIncome) {
		DeferredIncome = deferredIncome;
	}

	/**  
	 * 获取 incomeFromSalesAgency
	 * @return the incomeFromSalesAgency 代购代销收入 
	 */
	public String getIncomeFromSalesAgency() {
		return IncomeFromSalesAgency;
	}

	/**  
	 * 设置 incomeFromSalesAgency  
	 * @param incomeFromSalesAgency 代购代销收入  
	 */
	public void setIncomeFromSalesAgency(String incomeFromSalesAgency) {
		IncomeFromSalesAgency = incomeFromSalesAgency;
	}

	/**  
	 * 获取 otherOperatingIncome
	 * @return the otherOperatingIncome 其他（收入） 
	 */
	public String getOtherOperatingIncome() {
		return OtherOperatingIncome;
	}

	/**  
	 * 设置 otherOperatingIncome  
	 * @param otherOperatingIncome 其他（收入）  
	 */
	public void setOtherOperatingIncome(String otherOperatingIncome) {
		OtherOperatingIncome = otherOperatingIncome;
	}

	/**  
	 * 获取 principleBusinessProfit
	 * @return the principleBusinessProfit 主营业务利润 
	 */
	public String getPrincipleBusinessProfit() {
		return PrincipleBusinessProfit;
	}

	/**  
	 * 设置 principleBusinessProfit  
	 * @param principleBusinessProfit 主营业务利润  
	 */
	public void setPrincipleBusinessProfit(String principleBusinessProfit) {
		PrincipleBusinessProfit = principleBusinessProfit;
	}

	/**  
	 * 获取 otherBusinessProfit
	 * @return the otherBusinessProfit 其他业务利润 
	 */
	public String getOtherBusinessProfit() {
		return OtherBusinessProfit;
	}

	/**  
	 * 设置 otherBusinessProfit  
	 * @param otherBusinessProfit 其他业务利润  
	 */
	public void setOtherBusinessProfit(String otherBusinessProfit) {
		OtherBusinessProfit = otherBusinessProfit;
	}

	/**  
	 * 获取 sellingExpenses
	 * @return the sellingExpenses 营业费用 
	 */
	public String getSellingExpenses() {
		return SellingExpenses;
	}

	/**  
	 * 设置 sellingExpenses  
	 * @param sellingExpenses 营业费用  
	 */
	public void setSellingExpenses(String sellingExpenses) {
		SellingExpenses = sellingExpenses;
	}

	/**  
	 * 获取 generalAndAdministrativeExpenses
	 * @return the generalAndAdministrativeExpenses 管理费用 
	 */
	public String getGeneralAndAdministrativeExpenses() {
		return GeneralAndAdministrativeExpenses;
	}

	/**  
	 * 设置 generalAndAdministrativeExpenses  
	 * @param generalAndAdministrativeExpenses 管理费用  
	 */
	public void setGeneralAndAdministrativeExpenses(
			String generalAndAdministrativeExpenses) {
		GeneralAndAdministrativeExpenses = generalAndAdministrativeExpenses;
	}

	/**  
	 * 获取 financialExpenses
	 * @return the financialExpenses 财务费用 
	 */
	public String getFinancialExpenses() {
		return FinancialExpenses;
	}

	/**  
	 * 设置 financialExpenses  
	 * @param financialExpenses 财务费用  
	 */
	public void setFinancialExpenses(String financialExpenses) {
		FinancialExpenses = financialExpenses;
	}

	/**  
	 * 获取 othersExpenses
	 * @return the othersExpenses 其他（费用） 
	 */
	public String getOthersExpenses() {
		return OthersExpenses;
	}

	/**  
	 * 设置 othersExpenses  
	 * @param othersExpenses 其他（费用）  
	 */
	public void setOthersExpenses(String othersExpenses) {
		OthersExpenses = othersExpenses;
	}

	/**  
	 * 获取 operatingProfits
	 * @return the operatingProfits 营业利润 
	 */
	public String getOperatingProfits() {
		return OperatingProfits;
	}

	/**  
	 * 设置 operatingProfits  
	 * @param operatingProfits 营业利润  
	 */
	public void setOperatingProfits(String operatingProfits) {
		OperatingProfits = operatingProfits;
	}

	/**  
	 * 获取 investmentIncome
	 * @return the investmentIncome 投资收益 
	 */
	public String getInvestmentIncome() {
		return InvestmentIncome;
	}

	/**  
	 * 设置 investmentIncome  
	 * @param investmentIncome 投资收益  
	 */
	public void setInvestmentIncome(String investmentIncome) {
		InvestmentIncome = investmentIncome;
	}

	/**  
	 * 获取 futuresIncome
	 * @return the futuresIncome 期货收益 
	 */
	public String getFuturesIncome() {
		return FuturesIncome;
	}

	/**  
	 * 设置 futuresIncome  
	 * @param futuresIncome 期货收益  
	 */
	public void setFuturesIncome(String futuresIncome) {
		FuturesIncome = futuresIncome;
	}

	/**  
	 * 获取 allowanceIncome
	 * @return the allowanceIncome 补贴收入 
	 */
	public String getAllowanceIncome() {
		return AllowanceIncome;
	}

	/**  
	 * 设置 allowanceIncome  
	 * @param allowanceIncome 补贴收入  
	 */
	public void setAllowanceIncome(String allowanceIncome) {
		AllowanceIncome = allowanceIncome;
	}

	/**  
	 * 获取 allowanceIncomeBeforeAllowance
	 * @return the allowanceIncomeBeforeAllowance （补贴收入科目下）补贴前亏损的企业补贴收入 
	 */
	public String getAllowanceIncomeBeforeAllowance() {
		return AllowanceIncomeBeforeAllowance;
	}

	/**  
	 * 设置 allowanceIncomeBeforeAllowance  
	 * @param allowanceIncomeBeforeAllowance （补贴收入科目下）补贴前亏损的企业补贴收入  
	 */
	public void setAllowanceIncomeBeforeAllowance(
			String allowanceIncomeBeforeAllowance) {
		AllowanceIncomeBeforeAllowance = allowanceIncomeBeforeAllowance;
	}

	/**  
	 * 获取 nonOperatingIncome
	 * @return the nonOperatingIncome 营业外收入 
	 */
	public String getNonOperatingIncome() {
		return NonOperatingIncome;
	}

	/**  
	 * 设置 nonOperatingIncome  
	 * @param nonOperatingIncome 营业外收入  
	 */
	public void setNonOperatingIncome(String nonOperatingIncome) {
		NonOperatingIncome = nonOperatingIncome;
	}

	/**  
	 * 获取 netGainOnDisposalOfFixedAssets
	 * @return the netGainOnDisposalOfFixedAssets （营业外收入科目下）处置固定资产净收益 
	 */
	public String getNetGainOnDisposalOfFixedAssets() {
		return NetGainOnDisposalOfFixedAssets;
	}

	/**  
	 * 设置 netGainOnDisposalOfFixedAssets  
	 * @param netGainOnDisposalOfFixedAssets （营业外收入科目下）处置固定资产净收益  
	 */
	public void setNetGainOnDisposalOfFixedAssets(
			String netGainOnDisposalOfFixedAssets) {
		NetGainOnDisposalOfFixedAssets = netGainOnDisposalOfFixedAssets;
	}

	/**  
	 * 获取 incomeFromNonCurrencyTrade
	 * @return the incomeFromNonCurrencyTrade （营业外收入科目下）非货币性交易收益 
	 */
	public String getIncomeFromNonCurrencyTrade() {
		return IncomeFromNonCurrencyTrade;
	}

	/**  
	 * 设置 incomeFromNonCurrencyTrade  
	 * @param incomeFromNonCurrencyTrade （营业外收入科目下）非货币性交易收益  
	 */
	public void setIncomeFromNonCurrencyTrade(String incomeFromNonCurrencyTrade) {
		IncomeFromNonCurrencyTrade = incomeFromNonCurrencyTrade;
	}

	/**  
	 * 获取 incomeFromSalesOfIntangibleAssets
	 * @return the incomeFromSalesOfIntangibleAssets （营业外收入科目下）出售无形资产收益 
	 */
	public String getIncomeFromSalesOfIntangibleAssets() {
		return IncomeFromSalesOfIntangibleAssets;
	}

	/**  
	 * 设置 incomeFromSalesOfIntangibleAssets  
	 * @param incomeFromSalesOfIntangibleAssets （营业外收入科目下）出售无形资产收益  
	 */
	public void setIncomeFromSalesOfIntangibleAssets(
			String incomeFromSalesOfIntangibleAssets) {
		IncomeFromSalesOfIntangibleAssets = incomeFromSalesOfIntangibleAssets;
	}

	/**  
	 * 获取 incomeFromPenalty
	 * @return the incomeFromPenalty （营业外收入科目下）罚款净收入 
	 */
	public String getIncomeFromPenalty() {
		return IncomeFromPenalty;
	}

	/**  
	 * 设置 incomeFromPenalty  
	 * @param incomeFromPenalty （营业外收入科目下）罚款净收入  
	 */
	public void setIncomeFromPenalty(String incomeFromPenalty) {
		IncomeFromPenalty = incomeFromPenalty;
	}

	/**  
	 * 获取 othersIncome
	 * @return the othersIncome 其他（利润） 
	 */
	public String getOthersIncome() {
		return OthersIncome;
	}

	/**  
	 * 设置 othersIncome  
	 * @param othersIncome 其他（利润）  
	 */
	public void setOthersIncome(String othersIncome) {
		OthersIncome = othersIncome;
	}

	/**  
	 * 获取 calculatingFromTheContentSalaryBefore
	 * @return the calculatingFromTheContentSalaryBefore （其他科目下）用以前年度含量工资节余弥补利润 
	 */
	public String getCalculatingFromTheContentSalaryBefore() {
		return CalculatingFromTheContentSalaryBefore;
	}

	/**  
	 * 设置 calculatingFromTheContentSalaryBefore  
	 * @param calculatingFromTheContentSalaryBefore （其他科目下）用以前年度含量工资节余弥补利润  
	 */
	public void setCalculatingFromTheContentSalaryBefore(
			String calculatingFromTheContentSalaryBefore) {
		CalculatingFromTheContentSalaryBefore = calculatingFromTheContentSalaryBefore;
	}

	/**  
	 * 获取 nonOperatingExpenses
	 * @return the nonOperatingExpenses 营业外支出 
	 */
	public String getNonOperatingExpenses() {
		return NonOperatingExpenses;
	}

	/**  
	 * 设置 nonOperatingExpenses  
	 * @param nonOperatingExpenses 营业外支出  
	 */
	public void setNonOperatingExpenses(String nonOperatingExpenses) {
		NonOperatingExpenses = nonOperatingExpenses;
	}

	/**  
	 * 获取 lossFromDisposalOfFixedAssets
	 * @return the lossFromDisposalOfFixedAssets （营业外支出科目下）处置固定资产净损失 
	 */
	public String getLossFromDisposalOfFixedAssets() {
		return LossFromDisposalOfFixedAssets;
	}

	/**  
	 * 设置 lossFromDisposalOfFixedAssets  
	 * @param lossFromDisposalOfFixedAssets （营业外支出科目下）处置固定资产净损失  
	 */
	public void setLossFromDisposalOfFixedAssets(
			String lossFromDisposalOfFixedAssets) {
		LossFromDisposalOfFixedAssets = lossFromDisposalOfFixedAssets;
	}

	/**  
	 * 获取 exchangeOfNonMonetaryAssetsLoss
	 * @return the exchangeOfNonMonetaryAssetsLoss （营业外支出科目下）债务重组损失 
	 */
	public String getExchangeOfNonMonetaryAssetsLoss() {
		return ExchangeOfNonMonetaryAssetsLoss;
	}

	/**  
	 * 设置 exchangeOfNonMonetaryAssetsLoss  
	 * @param exchangeOfNonMonetaryAssetsLoss （营业外支出科目下）债务重组损失  
	 */
	public void setExchangeOfNonMonetaryAssetsLoss(
			String exchangeOfNonMonetaryAssetsLoss) {
		ExchangeOfNonMonetaryAssetsLoss = exchangeOfNonMonetaryAssetsLoss;
	}

	/**  
	 * 获取 lossOfLawsuits
	 * @return the lossOfLawsuits （营业外支出科目下）罚款支出 
	 */
	public String getLossOfLawsuits() {
		return LossOfLawsuits;
	}

	/**  
	 * 设置 lossOfLawsuits  
	 * @param lossOfLawsuits （营业外支出科目下）罚款支出  
	 */
	public void setLossOfLawsuits(String lossOfLawsuits) {
		LossOfLawsuits = lossOfLawsuits;
	}

	/**  
	 * 获取 paymentForDonation
	 * @return the paymentForDonation （营业外支出科目下）捐赠支出 
	 */
	public String getPaymentForDonation() {
		return PaymentForDonation;
	}

	/**  
	 * 设置 paymentForDonation  
	 * @param paymentForDonation （营业外支出科目下）捐赠支出  
	 */
	public void setPaymentForDonation(String paymentForDonation) {
		PaymentForDonation = paymentForDonation;
	}

	/**  
	 * 获取 otherPayments
	 * @return the otherPayments 其他支出 
	 */
	public String getOtherPayments() {
		return OtherPayments;
	}

	/**  
	 * 设置 otherPayments  
	 * @param otherPayments 其他支出  
	 */
	public void setOtherPayments(String otherPayments) {
		OtherPayments = otherPayments;
	}

	/**  
	 * 获取 balanceOfContentSalary
	 * @return the balanceOfContentSalary （其他支出）结转的含量工资包干节余 
	 */
	public String getBalanceOfContentSalary() {
		return BalanceOfContentSalary;
	}

	/**  
	 * 设置 balanceOfContentSalary  
	 * @param balanceOfContentSalary （其他支出）结转的含量工资包干节余  
	 */
	public void setBalanceOfContentSalary(String balanceOfContentSalary) {
		BalanceOfContentSalary = balanceOfContentSalary;
	}

	/**  
	 * 获取 totalProfit
	 * @return the totalProfit 利润总额 
	 */
	public String getTotalProfit() {
		return TotalProfit;
	}

	/**  
	 * 设置 totalProfit  
	 * @param totalProfit 利润总额  
	 */
	public void setTotalProfit(String totalProfit) {
		TotalProfit = totalProfit;
	}

	/**  
	 * 获取 incometax
	 * @return the incometax 所得税 
	 */
	public String getIncometax() {
		return Incometax;
	}

	/**  
	 * 设置 incometax  
	 * @param incometax 所得税  
	 */
	public void setIncometax(String incometax) {
		Incometax = incometax;
	}

	/**  
	 * 获取 imparimentLoss
	 * @return the imparimentLoss 少数股东损益 
	 */
	public String getImparimentLoss() {
		return ImparimentLoss;
	}

	/**  
	 * 设置 imparimentLoss  
	 * @param imparimentLoss 少数股东损益  
	 */
	public void setImparimentLoss(String imparimentLoss) {
		ImparimentLoss = imparimentLoss;
	}

	/**  
	 * 获取 unrealizedInvestmentLosses
	 * @return the unrealizedInvestmentLosses 未确认的投资损失 
	 */
	public String getUnrealizedInvestmentLosses() {
		return UnrealizedInvestmentLosses;
	}

	/**  
	 * 设置 unrealizedInvestmentLosses  
	 * @param unrealizedInvestmentLosses 未确认的投资损失  
	 */
	public void setUnrealizedInvestmentLosses(String unrealizedInvestmentLosses) {
		UnrealizedInvestmentLosses = unrealizedInvestmentLosses;
	}

	/**  
	 * 获取 netProfit
	 * @return the netProfit 净利润 
	 */
	public String getNetProfit() {
		return NetProfit;
	}

	/**  
	 * 设置 netProfit  
	 * @param netProfit 净利润  
	 */
	public void setNetProfit(String netProfit) {
		NetProfit = netProfit;
	}

	/**  
	 * 获取 profitDistributionAtBeginningOfPeriod
	 * @return the profitDistributionAtBeginningOfPeriod 年初未分配利润 
	 */
	public String getProfitDistributionAtBeginningOfPeriod() {
		return ProfitDistributionAtBeginningOfPeriod;
	}

	/**  
	 * 设置 profitDistributionAtBeginningOfPeriod  
	 * @param profitDistributionAtBeginningOfPeriod 年初未分配利润  
	 */
	public void setProfitDistributionAtBeginningOfPeriod(
			String profitDistributionAtBeginningOfPeriod) {
		ProfitDistributionAtBeginningOfPeriod = profitDistributionAtBeginningOfPeriod;
	}

	/**  
	 * 获取 compensationOfSurplusReserve
	 * @return the compensationOfSurplusReserve 盈余公积补亏 
	 */
	public String getCompensationOfSurplusReserve() {
		return CompensationOfSurplusReserve;
	}

	/**  
	 * 设置 compensationOfSurplusReserve  
	 * @param compensationOfSurplusReserve 盈余公积补亏  
	 */
	public void setCompensationOfSurplusReserve(String compensationOfSurplusReserve) {
		CompensationOfSurplusReserve = compensationOfSurplusReserve;
	}

	/**  
	 * 获取 otherAdjustmentFactors
	 * @return the otherAdjustmentFactors 其他调整因素 
	 */
	public String getOtherAdjustmentFactors() {
		return OtherAdjustmentFactors;
	}

	/**  
	 * 设置 otherAdjustmentFactors  
	 * @param otherAdjustmentFactors 其他调整因素  
	 */
	public void setOtherAdjustmentFactors(String otherAdjustmentFactors) {
		OtherAdjustmentFactors = otherAdjustmentFactors;
	}

	/**  
	 * 获取 profitAvailableForDistribution
	 * @return the profitAvailableForDistribution 可供分配的利润 
	 */
	public String getProfitAvailableForDistribution() {
		return ProfitAvailableForDistribution;
	}

	/**  
	 * 设置 profitAvailableForDistribution  
	 * @param profitAvailableForDistribution 可供分配的利润  
	 */
	public void setProfitAvailableForDistribution(
			String profitAvailableForDistribution) {
		ProfitAvailableForDistribution = profitAvailableForDistribution;
	}

	/**  
	 * 获取 profitReservedForASingleItem
	 * @return the profitReservedForASingleItem 单项留用的利润 
	 */
	public String getProfitReservedForASingleItem() {
		return ProfitReservedForASingleItem;
	}

	/**  
	 * 设置 profitReservedForASingleItem  
	 * @param profitReservedForASingleItem 单项留用的利润  
	 */
	public void setProfitReservedForASingleItem(String profitReservedForASingleItem) {
		ProfitReservedForASingleItem = profitReservedForASingleItem;
	}

	/**  
	 * 获取 supplementaryCurrentCapital
	 * @return the supplementaryCurrentCapital 补充流动资本 
	 */
	public String getSupplementaryCurrentCapital() {
		return SupplementaryCurrentCapital;
	}

	/**  
	 * 设置 supplementaryCurrentCapital  
	 * @param supplementaryCurrentCapital 补充流动资本  
	 */
	public void setSupplementaryCurrentCapital(String supplementaryCurrentCapital) {
		SupplementaryCurrentCapital = supplementaryCurrentCapital;
	}

	/**  
	 * 获取 appropriationOfStatutorySurplusReserves
	 * @return the appropriationOfStatutorySurplusReserves 提取法定盈余公积 
	 */
	public String getAppropriationOfStatutorySurplusReserves() {
		return AppropriationOfStatutorySurplusReserves;
	}

	/**  
	 * 设置 appropriationOfStatutorySurplusReserves  
	 * @param appropriationOfStatutorySurplusReserves 提取法定盈余公积  
	 */
	public void setAppropriationOfStatutorySurplusReserves(
			String appropriationOfStatutorySurplusReserves) {
		AppropriationOfStatutorySurplusReserves = appropriationOfStatutorySurplusReserves;
	}

	/**  
	 * 获取 appropriationOfStatutoryWelfareFund
	 * @return the appropriationOfStatutoryWelfareFund 提取法定公益金 
	 */
	public String getAppropriationOfStatutoryWelfareFund() {
		return AppropriationOfStatutoryWelfareFund;
	}

	/**  
	 * 设置 appropriationOfStatutoryWelfareFund  
	 * @param appropriationOfStatutoryWelfareFund 提取法定公益金  
	 */
	public void setAppropriationOfStatutoryWelfareFund(
			String appropriationOfStatutoryWelfareFund) {
		AppropriationOfStatutoryWelfareFund = appropriationOfStatutoryWelfareFund;
	}

	/**  
	 * 获取 appropriationOfStaffIncentiveAndWelfareFund
	 * @return the appropriationOfStaffIncentiveAndWelfareFund 提取职工奖励及福利基金 
	 */
	public String getAppropriationOfStaffIncentiveAndWelfareFund() {
		return AppropriationOfStaffIncentiveAndWelfareFund;
	}

	/**  
	 * 设置 appropriationOfStaffIncentiveAndWelfareFund  
	 * @param appropriationOfStaffIncentiveAndWelfareFund 提取职工奖励及福利基金  
	 */
	public void setAppropriationOfStaffIncentiveAndWelfareFund(
			String appropriationOfStaffIncentiveAndWelfareFund) {
		AppropriationOfStaffIncentiveAndWelfareFund = appropriationOfStaffIncentiveAndWelfareFund;
	}

	/**  
	 * 获取 appropriationOfReserveFund
	 * @return the appropriationOfReserveFund 提取储备基金 
	 */
	public String getAppropriationOfReserveFund() {
		return AppropriationOfReserveFund;
	}

	/**  
	 * 设置 appropriationOfReserveFund  
	 * @param appropriationOfReserveFund 提取储备基金  
	 */
	public void setAppropriationOfReserveFund(String appropriationOfReserveFund) {
		AppropriationOfReserveFund = appropriationOfReserveFund;
	}

	/**  
	 * 获取 appropriationOfEnterpriseExpansionFund
	 * @return the appropriationOfEnterpriseExpansionFund 提取企业发展基金 
	 */
	public String getAppropriationOfEnterpriseExpansionFund() {
		return AppropriationOfEnterpriseExpansionFund;
	}

	/**  
	 * 设置 appropriationOfEnterpriseExpansionFund  
	 * @param appropriationOfEnterpriseExpansionFund 提取企业发展基金  
	 */
	public void setAppropriationOfEnterpriseExpansionFund(
			String appropriationOfEnterpriseExpansionFund) {
		AppropriationOfEnterpriseExpansionFund = appropriationOfEnterpriseExpansionFund;
	}

	/**  
	 * 获取 profitsCapitalizadOnReturnOfInvestment
	 * @return the profitsCapitalizadOnReturnOfInvestment 利润归还投资 
	 */
	public String getProfitsCapitalizadOnReturnOfInvestment() {
		return ProfitsCapitalizadOnReturnOfInvestment;
	}

	/**  
	 * 设置 profitsCapitalizadOnReturnOfInvestment  
	 * @param profitsCapitalizadOnReturnOfInvestment 利润归还投资  
	 */
	public void setProfitsCapitalizadOnReturnOfInvestment(
			String profitsCapitalizadOnReturnOfInvestment) {
		ProfitsCapitalizadOnReturnOfInvestment = profitsCapitalizadOnReturnOfInvestment;
	}

	/**  
	 * 获取 others
	 * @return the others （可供分配的利润科目下）其他 
	 */
	public String getOthers() {
		return Others;
	}

	/**  
	 * 设置 others  
	 * @param others （可供分配的利润科目下）其他  
	 */
	public void setOthers(String others) {
		Others = others;
	}

	/**  
	 * 获取 profitAvailableForOwnersDistribution
	 * @return the profitAvailableForOwnersDistribution 可供投资者分配的利润 
	 */
	public String getProfitAvailableForOwnersDistribution() {
		return ProfitAvailableForOwnersDistribution;
	}

	/**  
	 * 设置 profitAvailableForOwnersDistribution  
	 * @param profitAvailableForOwnersDistribution 可供投资者分配的利润  
	 */
	public void setProfitAvailableForOwnersDistribution(
			String profitAvailableForOwnersDistribution) {
		ProfitAvailableForOwnersDistribution = profitAvailableForOwnersDistribution;
	}

	/**  
	 * 获取 preferredStockDividendsPayable
	 * @return the preferredStockDividendsPayable 应付优先股股利 
	 */
	public String getPreferredStockDividendsPayable() {
		return PreferredStockDividendsPayable;
	}

	/**  
	 * 设置 preferredStockDividendsPayable  
	 * @param preferredStockDividendsPayable 应付优先股股利  
	 */
	public void setPreferredStockDividendsPayable(
			String preferredStockDividendsPayable) {
		PreferredStockDividendsPayable = preferredStockDividendsPayable;
	}

	/**  
	 * 获取 withdrawalOtherCommonAccumulationFund
	 * @return the withdrawalOtherCommonAccumulationFund 提取任意盈余公积 
	 */
	public String getWithdrawalOtherCommonAccumulationFund() {
		return WithdrawalOtherCommonAccumulationFund;
	}

	/**  
	 * 设置 withdrawalOtherCommonAccumulationFund  
	 * @param withdrawalOtherCommonAccumulationFund 提取任意盈余公积  
	 */
	public void setWithdrawalOtherCommonAccumulationFund(
			String withdrawalOtherCommonAccumulationFund) {
		WithdrawalOtherCommonAccumulationFund = withdrawalOtherCommonAccumulationFund;
	}

	/**  
	 * 获取 payableDividendsOfCommonStock
	 * @return the payableDividendsOfCommonStock 应付普通股股利 
	 */
	public String getPayableDividendsOfCommonStock() {
		return PayableDividendsOfCommonStock;
	}

	/**  
	 * 设置 payableDividendsOfCommonStock  
	 * @param payableDividendsOfCommonStock 应付普通股股利  
	 */
	public void setPayableDividendsOfCommonStock(
			String payableDividendsOfCommonStock) {
		PayableDividendsOfCommonStock = payableDividendsOfCommonStock;
	}

	/**  
	 * 获取 transferFromOrdinarySharesDividendToPaidInCapitalOrStock
	 * @return the transferFromOrdinarySharesDividendToPaidInCapitalOrStock 转作资本的普通股股利 
	 */
	public String getTransferFromOrdinarySharesDividendToPaidInCapitalOrStock() {
		return TransferFromOrdinarySharesDividendToPaidInCapitalOrStock;
	}

	/**  
	 * 设置 transferFromOrdinarySharesDividendToPaidInCapitalOrStock  
	 * @param transferFromOrdinarySharesDividendToPaidInCapitalOrStock 转作资本的普通股股利  
	 */
	public void setTransferFromOrdinarySharesDividendToPaidInCapitalOrStock(
			String transferFromOrdinarySharesDividendToPaidInCapitalOrStock) {
		TransferFromOrdinarySharesDividendToPaidInCapitalOrStock = transferFromOrdinarySharesDividendToPaidInCapitalOrStock;
	}

	/**  
	 * 获取 othersForOwners
	 * @return the othersForOwners （可供投资者分配的利润科目下）其他 
	 */
	public String getOthersForOwners() {
		return OthersForOwners;
	}

	/**  
	 * 设置 othersForOwners  
	 * @param othersForOwners （可供投资者分配的利润科目下）其他  
	 */
	public void setOthersForOwners(String othersForOwners) {
		OthersForOwners = othersForOwners;
	}

	/**  
	 * 获取 unappropriatedProfit
	 * @return the unappropriatedProfit 未分配利润 
	 */
	public String getUnappropriatedProfit() {
		return UnappropriatedProfit;
	}

	/**  
	 * 设置 unappropriatedProfit  
	 * @param unappropriatedProfit 未分配利润  
	 */
	public void setUnappropriatedProfit(String unappropriatedProfit) {
		UnappropriatedProfit = unappropriatedProfit;
	}

	/**  
	 * 获取 lossCompensatedBeforeTheTax
	 * @return the lossCompensatedBeforeTheTax （未分配利润科目下）应由以后年度税前利润弥补的亏损 
	 */
	public String getLossCompensatedBeforeTheTax() {
		return LossCompensatedBeforeTheTax;
	}

	/**  
	 * 设置 lossCompensatedBeforeTheTax  
	 * @param lossCompensatedBeforeTheTax （未分配利润科目下）应由以后年度税前利润弥补的亏损  
	 */
	public void setLossCompensatedBeforeTheTax(String lossCompensatedBeforeTheTax) {
		LossCompensatedBeforeTheTax = lossCompensatedBeforeTheTax;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IncomeStatementProfitAppropriation2002Sgmt [AllowanceIncome="
				+ AllowanceIncome + ", AllowanceIncomeBeforeAllowance="
				+ AllowanceIncomeBeforeAllowance
				+ ", AppropriationOfEnterpriseExpansionFund="
				+ AppropriationOfEnterpriseExpansionFund
				+ ", AppropriationOfReserveFund=" + AppropriationOfReserveFund
				+ ", AppropriationOfStaffIncentiveAndWelfareFund="
				+ AppropriationOfStaffIncentiveAndWelfareFund
				+ ", AppropriationOfStatutorySurplusReserves="
				+ AppropriationOfStatutorySurplusReserves
				+ ", AppropriationOfStatutoryWelfareFund="
				+ AppropriationOfStatutoryWelfareFund
				+ ", BalanceOfContentSalary=" + BalanceOfContentSalary
				+ ", CalculatingFromTheContentSalaryBefore="
				+ CalculatingFromTheContentSalaryBefore
				+ ", CompensationOfSurplusReserve="
				+ CompensationOfSurplusReserve + ", DeferredIncome="
				+ DeferredIncome + ", DiscountAndAllowance="
				+ DiscountAndAllowance + ", ExchangeOfNonMonetaryAssetsLoss="
				+ ExchangeOfNonMonetaryAssetsLoss + ", FinancialExpenses="
				+ FinancialExpenses + ", FuturesIncome=" + FuturesIncome
				+ ", GeneralAndAdministrativeExpenses="
				+ GeneralAndAdministrativeExpenses + ", ImparimentLoss="
				+ ImparimentLoss + ", IncomeFromNonCurrencyTrade="
				+ IncomeFromNonCurrencyTrade + ", IncomeFromPenalty="
				+ IncomeFromPenalty + ", IncomeFromSalesAgency="
				+ IncomeFromSalesAgency
				+ ", IncomeFromSalesOfIntangibleAssets="
				+ IncomeFromSalesOfIntangibleAssets + ", Incometax="
				+ Incometax + ", InvestmentIncome=" + InvestmentIncome
				+ ", LossCompensatedBeforeTheTax="
				+ LossCompensatedBeforeTheTax
				+ ", LossFromDisposalOfFixedAssets="
				+ LossFromDisposalOfFixedAssets + ", LossOfLawsuits="
				+ LossOfLawsuits + ", MainOperatingCost=" + MainOperatingCost
				+ ", MainRevenuefRevenue=" + MainRevenuefRevenue
				+ ", NetAmountOfIncomeFromMainBusiness="
				+ NetAmountOfIncomeFromMainBusiness
				+ ", NetGainOnDisposalOfFixedAssets="
				+ NetGainOnDisposalOfFixedAssets + ", NetProfit=" + NetProfit
				+ ", NonOperatingExpenses=" + NonOperatingExpenses
				+ ", NonOperatingIncome=" + NonOperatingIncome
				+ ", OperatingProfits=" + OperatingProfits
				+ ", OperationExpense=" + OperationExpense
				+ ", OtherAdjustmentFactors=" + OtherAdjustmentFactors
				+ ", OtherBusinessProfit=" + OtherBusinessProfit
				+ ", OtherOperatingIncome=" + OtherOperatingIncome
				+ ", OtherPayments=" + OtherPayments + ", Others=" + Others
				+ ", OthersExpenses=" + OthersExpenses + ", OthersForOwners="
				+ OthersForOwners + ", OthersIncome=" + OthersIncome
				+ ", OthersOperatingCost=" + OthersOperatingCost
				+ ", PayableDividendsOfCommonStock="
				+ PayableDividendsOfCommonStock + ", PaymentForDonation="
				+ PaymentForDonation + ", PreferredStockDividendsPayable="
				+ PreferredStockDividendsPayable + ", PrincipleBusinessProfit="
				+ PrincipleBusinessProfit
				+ ", PrincipleBusinessTaxAndExtraCharge="
				+ PrincipleBusinessTaxAndExtraCharge
				+ ", ProfitAvailableForDistribution="
				+ ProfitAvailableForDistribution
				+ ", ProfitAvailableForOwnersDistribution="
				+ ProfitAvailableForOwnersDistribution
				+ ", ProfitDistributionAtBeginningOfPeriod="
				+ ProfitDistributionAtBeginningOfPeriod
				+ ", ProfitReservedForASingleItem="
				+ ProfitReservedForASingleItem
				+ ", ProfitsCapitalizadOnReturnOfInvestment="
				+ ProfitsCapitalizadOnReturnOfInvestment
				+ ", SalesIncomeOfExportGoodsProducts="
				+ SalesIncomeOfExportGoodsProducts
				+ ", SalesIncomeOfExportProducts="
				+ SalesIncomeOfExportProducts
				+ ", SalesIncomeOfImportGoodsProducts="
				+ SalesIncomeOfImportGoodsProducts + ", SellingExpenses="
				+ SellingExpenses + ", SupplementaryCurrentCapital="
				+ SupplementaryCurrentCapital + ", TotalProfit=" + TotalProfit
				+ ", TransferFromOrdinarySharesDividendToPaidInCapitalOrStock="
				+ TransferFromOrdinarySharesDividendToPaidInCapitalOrStock
				+ ", UnappropriatedProfit=" + UnappropriatedProfit
				+ ", UnrealizedInvestmentLosses=" + UnrealizedInvestmentLosses
				+ ", WithdrawalOtherCommonAccumulationFund="
				+ WithdrawalOtherCommonAccumulationFund + "]";
	}
}
