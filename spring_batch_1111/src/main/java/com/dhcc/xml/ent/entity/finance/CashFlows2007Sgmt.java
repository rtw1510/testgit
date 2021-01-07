package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: CashFlows2007Sgmt<br/>
 * Description:2007版现金流量表段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = {
		"CashReceivedFromSalesOfGoodsOrRendingOfServices",
		"TaxRefunds",
		"OtherCashReceivedRelatingToOperatingActivities",
		"TotalCashInflowsFromOperatingActivities",
		"CashPaidForGoodsAndServices",
		"CashPaidToAndOnBehalfOfEmployees",
		"PaymentsOfAllTypesOfTaxes",
		"OtherCashPaymentsFromOperatingActivities",
		"TotalCashOutflowsFromOperatingActivities",
		"NetCashFlowsFromOperatingActivities",
		"CashReceivedFromReturnOfInvestment",
		"CashReceivedFromOnvestments",
		"NetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets",
		"NetCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities",
		"CashReceivedRelatingToOtherInvestingActivities",
		"TotalCashInflowsFromInvestingActivities",
		"CashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents",
		"CashPaymentsForInvestments",
		"NetCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits",
		"CashPaymentsRelatedToOtherInvestingActivities",
		"SubTotalOfCashOutflows", "NetCashFlowsFromInvestingActivities",
		"CashReceivedFromInvestors", "CashFromBorrowings",
		"OtherCashReceivedRelatingToFinancingActivities",
		"TotalCashInflowsFromFinancingActivities", "CashRepaymentsForDebts",
		"CashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses",
		"CashPaymentsRelatedToOtherFinancingActivities",
		"TotalCashOutflowsFromFinancingActivities",
		"NetCashFlowsFromFinancingActivities",
		"EffectOfExchangRateChangesOnCash",
		"NetIncreaseInCashAndCashEquivalents",
		"InitialCashAndCashEquivalentsBalance",
		"TheFinalCashAndCashEquivalentsBalance", "NetProfit",
		"ProvisionForAssetImpairment", "DepreciationOfFixedAssets",
		"AmortisationOfIntangibleAssets",
		"AmortisationOfLongTermDefferedExpenses", "DecreaseOfDefferedExpenses",
		"AdditionOfAccuedExpense",
		"LossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets",
		"LossesOnScrappingOfFixedAssets", "ProfitOrLossFromChangesInFairValue",
		"FinanceExpense", "LossesArsingFromInvestment",
		"DeferredIncomeTaxAssets", "DeferredIncomeTaxLiabilities",
		"DecreaseInInventories", "DecreaseInOperatingReceivables",
		"IncreaseInOperatingReceivables", "Others",
		"NetCashFlowsFromOperatingActivitiesMi", "DebtsTransferToCapital",
		"OneYearDueConvertibleBonds", "FinancingRentToTheFixedAsset",
		"NonCashOthers", "CashAtTheEndOfPeriod",
		"CashAtTheBeginningOfThePeriod", "CashEquivalentsAtTheEndOfThePeriod",
		"CashEquivalentsAtTheBeginningOfThePeriod",
		"NetIncreaseInCashAndCashEquivalentsMi" },namespace = "com.dhcc.xml.ent.entity.finance")
public class CashFlows2007Sgmt {
	/**
	 * 销售商品和提供劳务收到的现金
	 */
	
	private String CashReceivedFromSalesOfGoodsOrRendingOfServices;
	/**
	 * 收到的税费返还
	 */
	
	private String TaxRefunds;
	/**
	 * 收到其他与经营活动有关的现金
	 */
	
	private String OtherCashReceivedRelatingToOperatingActivities;
	/**
	 * 经营活动现金流入小计
	 */
	
	private String TotalCashInflowsFromOperatingActivities;
	/**
	 * 购买商品、接受劳务支付的现金
	 */
	
	private String CashPaidForGoodsAndServices;
	/**
	 * 支付给职工以及为职工支付的现金
	 */
	
	private String CashPaidToAndOnBehalfOfEmployees;
	/**
	 * 支付的各项税费
	 */
	
	private String PaymentsOfAllTypesOfTaxes;
	/**
	 * 支付其他与经营活动有关的现金
	 */
	
	private String OtherCashPaymentsFromOperatingActivities;
	/**
	 * 经营活动现金流出小计
	 */
	
	private String TotalCashOutflowsFromOperatingActivities;
	/**
	 * 经营活动产生的现金流量净额
	 */
	
	private String NetCashFlowsFromOperatingActivities;
	/**
	 * 收回投资所收到的现金
	 */
	
	private String CashReceivedFromReturnOfInvestment;
	/**
	 * 取得投资收益所收到的现金
	 */
	
	private String CashReceivedFromOnvestments;
	/**
	 * 处置固定资产无形资产和其他长期资产所收回的现金净额
	 */
	
	private String NetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	/**
	 * 处置子公司及其他营业单位收到的现金净额
	 */
	
	private String NetCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities;
	/**
	 * 收到其他与投资活动有关的现金
	 */
	
	private String CashReceivedRelatingToOtherInvestingActivities;
	/**
	 * 投资活动现金流入小计
	 */
	
	private String TotalCashInflowsFromInvestingActivities;
	/**
	 * 购建固定资产无形资产和其他长期资产所支付的现金
	 */
	
	private String CashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents;
	/**
	 * 投资所支付的现金
	 */
	
	private String CashPaymentsForInvestments;
	/**
	 * 取得子公司及其他营业单位支付的现金净额
	 */
	
	private String NetCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits;

	/**
	 *支付其他与投资活动有关的现金
	 */
	
	private String CashPaymentsRelatedToOtherInvestingActivities;
	/**
	 * 投资活动现金流出小计
	 */
	
	private String SubTotalOfCashOutflows;
	/**
	 * 投资活动产生的现金流量净额
	 */
	
	private String NetCashFlowsFromInvestingActivities;
	/**
	 * 吸收投资收到的现金
	 */
	
	private String CashReceivedFromInvestors;
	/**
	 * 取得借款收到的现金
	 */
	
	private String CashFromBorrowings;
	/**
	 * 收到其他与筹资活动有关的现金
	 */
	
	private String OtherCashReceivedRelatingToFinancingActivities;
	/**
	 * 筹资活动现金流入小计
	 */
	
	private String TotalCashInflowsFromFinancingActivities;
	/**
	 * 偿还债务所支付的现金
	 */
	
	private String CashRepaymentsForDebts;
	/**
	 * 分配股利、利润或偿付利息所支付的现金
	 */
	
	private String CashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses;
	/**
	 * 支付其他与筹资活动有关的现金
	 */
	private String CashPaymentsRelatedToOtherFinancingActivities;
	/**
	 * 筹资活动现金流出小计
	 */
	private String TotalCashOutflowsFromFinancingActivities;
	/**
	 * 筹集活动产生的现金流量净额
	 */
	private String NetCashFlowsFromFinancingActivities;
	/**
	 * 汇率变动对现金及现金等价物的影响
	 */
	private String EffectOfExchangRateChangesOnCash;
	/**
	 * 现金及现金等价物净增加额
	 */
	private String NetIncreaseInCashAndCashEquivalents;
	/**
	 * 期初现金及现金等价物余额
	 */
	
	private String InitialCashAndCashEquivalentsBalance;
	/**
	 * 期末现金及现金等价物余额
	 */
	
	private String TheFinalCashAndCashEquivalentsBalance;
	/**
	 * 净利润
	 */
	
	private String NetProfit;
	/**
	 * 资产减值准备
	 */
	
	private String ProvisionForAssetImpairment;
	/**
	 * 固定资产折旧、油气资产折耗、生产性生物资产折旧
	 */
	
	private String DepreciationOfFixedAssets;
	/**
	 * 无形资产摊销
	 */
	
	private String AmortisationOfIntangibleAssets;
	/**
	 * 长期待摊费用摊销
	 */
	
	private String AmortisationOfLongTermDefferedExpenses;
	/**
	 * 待摊费用减少
	 */
	
	private String DecreaseOfDefferedExpenses;
	/**
	 * 预提费用增加
	 */
	
	private String AdditionOfAccuedExpense;
	/**
	 * 处置固定资产无形资产和其他长期资产的损失
	 */
	
	private String LossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	/**
	 * 固定资产报废损失
	 */
	
	private String LossesOnScrappingOfFixedAssets;
	/**
	 * 公允价值变动损失
	 */
	
	private String ProfitOrLossFromChangesInFairValue;
	/**
	 * 财务费用
	 */
	
	private String FinanceExpense;
	/**
	 * 投资损失
	 */
	
	private String LossesArsingFromInvestment;
	/**
	 * 递延所得税资产减少
	 */
	
	private String DeferredIncomeTaxAssets;
	/**
	 * 递延所得税负债增加
	 */
	
	private String DeferredIncomeTaxLiabilities;
	/**
	 * 存货的减少
	 */
	
	private String DecreaseInInventories;
	/**
	 * 经营性应收项目的减少
	 */
	
	private String DecreaseInOperatingReceivables;
	/**
	 * 经营性应付项目的增加
	 */
	
	private String IncreaseInOperatingReceivables;
	/**
	 * （净利润调节为经营活动现金流量科目下）其他
	 */
	
	private String Others;
	/**
	 *经营活动产生的现金流量净额
	 */
	
	private String NetCashFlowsFromOperatingActivitiesMi;
	/**
	 * 债务转为资本
	 */
	
	private String DebtsTransferToCapital;
	/**
	 * 一年内到期的可转换公司债券
	 */
	
	private String OneYearDueConvertibleBonds;
	/**
	 * 融资租入固定资产
	 */
	
	private String FinancingRentToTheFixedAsset;

	/**
	 *（不涉及现金收支的投资和筹资活动科目下）其他
	 */
	
	private String NonCashOthers;
	/**
	 * 现金的期末余额
	 */
	
	private String CashAtTheEndOfPeriod;
	/**
	 * 现金的期初余额
	 */
	
	private String CashAtTheBeginningOfThePeriod;
	/**
	 * 现金等价物的期末余额
	 */
	
	private String CashEquivalentsAtTheEndOfThePeriod;
	/**
	 * 现金等价物的期初余额
	 */
	
	private String CashEquivalentsAtTheBeginningOfThePeriod;

	/**
	 *现金及现金等价物净增加额
	 */
	
	private String NetIncreaseInCashAndCashEquivalentsMi;

	public CashFlows2007Sgmt() {
		super();
	}

	/**  
	 * 获取 cashReceivedFromSalesOfGoodsOrRendingOfServices
	 * @return the cashReceivedFromSalesOfGoodsOrRendingOfServices 销售商品和提供劳务收到的现金 
	 */
	public String getCashReceivedFromSalesOfGoodsOrRendingOfServices() {
		return CashReceivedFromSalesOfGoodsOrRendingOfServices;
	}

	/**  
	 * 设置 cashReceivedFromSalesOfGoodsOrRendingOfServices  
	 * @param cashReceivedFromSalesOfGoodsOrRendingOfServices 销售商品和提供劳务收到的现金  
	 */
	public void setCashReceivedFromSalesOfGoodsOrRendingOfServices(
			String cashReceivedFromSalesOfGoodsOrRendingOfServices) {
		CashReceivedFromSalesOfGoodsOrRendingOfServices = cashReceivedFromSalesOfGoodsOrRendingOfServices;
	}

	/**  
	 * 获取 taxRefunds
	 * @return the taxRefunds 收到的税费返还 
	 */
	public String getTaxRefunds() {
		return TaxRefunds;
	}

	/**  
	 * 设置 taxRefunds  
	 * @param taxRefunds 收到的税费返还  
	 */
	public void setTaxRefunds(String taxRefunds) {
		TaxRefunds = taxRefunds;
	}

	/**  
	 * 获取 otherCashReceivedRelatingToOperatingActivities
	 * @return the otherCashReceivedRelatingToOperatingActivities 收到其他与经营活动有关的现金 
	 */
	public String getOtherCashReceivedRelatingToOperatingActivities() {
		return OtherCashReceivedRelatingToOperatingActivities;
	}

	/**  
	 * 设置 otherCashReceivedRelatingToOperatingActivities  
	 * @param otherCashReceivedRelatingToOperatingActivities 收到其他与经营活动有关的现金  
	 */
	public void setOtherCashReceivedRelatingToOperatingActivities(
			String otherCashReceivedRelatingToOperatingActivities) {
		OtherCashReceivedRelatingToOperatingActivities = otherCashReceivedRelatingToOperatingActivities;
	}

	/**  
	 * 获取 totalCashInflowsFromOperatingActivities
	 * @return the totalCashInflowsFromOperatingActivities 经营活动现金流入小计 
	 */
	public String getTotalCashInflowsFromOperatingActivities() {
		return TotalCashInflowsFromOperatingActivities;
	}

	/**  
	 * 设置 totalCashInflowsFromOperatingActivities  
	 * @param totalCashInflowsFromOperatingActivities 经营活动现金流入小计  
	 */
	public void setTotalCashInflowsFromOperatingActivities(
			String totalCashInflowsFromOperatingActivities) {
		TotalCashInflowsFromOperatingActivities = totalCashInflowsFromOperatingActivities;
	}

	/**  
	 * 获取 cashPaidForGoodsAndServices
	 * @return the cashPaidForGoodsAndServices 购买商品、接受劳务支付的现金 
	 */
	public String getCashPaidForGoodsAndServices() {
		return CashPaidForGoodsAndServices;
	}

	/**  
	 * 设置 cashPaidForGoodsAndServices  
	 * @param cashPaidForGoodsAndServices 购买商品、接受劳务支付的现金  
	 */
	public void setCashPaidForGoodsAndServices(String cashPaidForGoodsAndServices) {
		CashPaidForGoodsAndServices = cashPaidForGoodsAndServices;
	}

	/**  
	 * 获取 cashPaidToAndOnBehalfOfEmployees
	 * @return the cashPaidToAndOnBehalfOfEmployees 支付给职工以及为职工支付的现金 
	 */
	public String getCashPaidToAndOnBehalfOfEmployees() {
		return CashPaidToAndOnBehalfOfEmployees;
	}

	/**  
	 * 设置 cashPaidToAndOnBehalfOfEmployees  
	 * @param cashPaidToAndOnBehalfOfEmployees 支付给职工以及为职工支付的现金  
	 */
	public void setCashPaidToAndOnBehalfOfEmployees(
			String cashPaidToAndOnBehalfOfEmployees) {
		CashPaidToAndOnBehalfOfEmployees = cashPaidToAndOnBehalfOfEmployees;
	}

	/**  
	 * 获取 paymentsOfAllTypesOfTaxes
	 * @return the paymentsOfAllTypesOfTaxes 支付的各项税费 
	 */
	public String getPaymentsOfAllTypesOfTaxes() {
		return PaymentsOfAllTypesOfTaxes;
	}

	/**  
	 * 设置 paymentsOfAllTypesOfTaxes  
	 * @param paymentsOfAllTypesOfTaxes 支付的各项税费  
	 */
	public void setPaymentsOfAllTypesOfTaxes(String paymentsOfAllTypesOfTaxes) {
		PaymentsOfAllTypesOfTaxes = paymentsOfAllTypesOfTaxes;
	}

	/**  
	 * 获取 otherCashPaymentsFromOperatingActivities
	 * @return the otherCashPaymentsFromOperatingActivities 支付其他与经营活动有关的现金 
	 */
	public String getOtherCashPaymentsFromOperatingActivities() {
		return OtherCashPaymentsFromOperatingActivities;
	}

	/**  
	 * 设置 otherCashPaymentsFromOperatingActivities  
	 * @param otherCashPaymentsFromOperatingActivities 支付其他与经营活动有关的现金  
	 */
	public void setOtherCashPaymentsFromOperatingActivities(
			String otherCashPaymentsFromOperatingActivities) {
		OtherCashPaymentsFromOperatingActivities = otherCashPaymentsFromOperatingActivities;
	}

	/**  
	 * 获取 totalCashOutflowsFromOperatingActivities
	 * @return the totalCashOutflowsFromOperatingActivities 经营活动现金流出小计 
	 */
	public String getTotalCashOutflowsFromOperatingActivities() {
		return TotalCashOutflowsFromOperatingActivities;
	}

	/**  
	 * 设置 totalCashOutflowsFromOperatingActivities  
	 * @param totalCashOutflowsFromOperatingActivities 经营活动现金流出小计  
	 */
	public void setTotalCashOutflowsFromOperatingActivities(
			String totalCashOutflowsFromOperatingActivities) {
		TotalCashOutflowsFromOperatingActivities = totalCashOutflowsFromOperatingActivities;
	}

	/**  
	 * 获取 netCashFlowsFromOperatingActivities
	 * @return the netCashFlowsFromOperatingActivities 经营活动产生的现金流量净额 
	 */
	public String getNetCashFlowsFromOperatingActivities() {
		return NetCashFlowsFromOperatingActivities;
	}

	/**  
	 * 设置 netCashFlowsFromOperatingActivities  
	 * @param netCashFlowsFromOperatingActivities 经营活动产生的现金流量净额  
	 */
	public void setNetCashFlowsFromOperatingActivities(
			String netCashFlowsFromOperatingActivities) {
		NetCashFlowsFromOperatingActivities = netCashFlowsFromOperatingActivities;
	}

	/**  
	 * 获取 cashReceivedFromReturnOfInvestment
	 * @return the cashReceivedFromReturnOfInvestment 收回投资所收到的现金 
	 */
	public String getCashReceivedFromReturnOfInvestment() {
		return CashReceivedFromReturnOfInvestment;
	}

	/**  
	 * 设置 cashReceivedFromReturnOfInvestment  
	 * @param cashReceivedFromReturnOfInvestment 收回投资所收到的现金  
	 */
	public void setCashReceivedFromReturnOfInvestment(
			String cashReceivedFromReturnOfInvestment) {
		CashReceivedFromReturnOfInvestment = cashReceivedFromReturnOfInvestment;
	}

	/**  
	 * 获取 cashReceivedFromOnvestments
	 * @return the cashReceivedFromOnvestments 取得投资收益所收到的现金 
	 */
	public String getCashReceivedFromOnvestments() {
		return CashReceivedFromOnvestments;
	}

	/**  
	 * 设置 cashReceivedFromOnvestments  
	 * @param cashReceivedFromOnvestments 取得投资收益所收到的现金  
	 */
	public void setCashReceivedFromOnvestments(String cashReceivedFromOnvestments) {
		CashReceivedFromOnvestments = cashReceivedFromOnvestments;
	}

	/**  
	 * 获取 netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 * @return the netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets 处置固定资产无形资产和其他长期资产所收回的现金净额 
	 */
	public String getNetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets() {
		return NetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	}

	/**  
	 * 设置 netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets  
	 * @param netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets 处置固定资产无形资产和其他长期资产所收回的现金净额  
	 */
	public void setNetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets(
			String netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets) {
		NetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets = netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	}

	/**  
	 * 获取 netCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities
	 * @return the netCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities 处置子公司及其他营业单位收到的现金净额 
	 */
	public String getNetCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities() {
		return NetCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities;
	}

	/**  
	 * 设置 netCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities  
	 * @param netCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities 处置子公司及其他营业单位收到的现金净额  
	 */
	public void setNetCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities(
			String netCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities) {
		NetCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities = netCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities;
	}

	/**  
	 * 获取 cashReceivedRelatingToOtherInvestingActivities
	 * @return the cashReceivedRelatingToOtherInvestingActivities 收到其他与投资活动有关的现金 
	 */
	public String getCashReceivedRelatingToOtherInvestingActivities() {
		return CashReceivedRelatingToOtherInvestingActivities;
	}

	/**  
	 * 设置 cashReceivedRelatingToOtherInvestingActivities  
	 * @param cashReceivedRelatingToOtherInvestingActivities 收到其他与投资活动有关的现金  
	 */
	public void setCashReceivedRelatingToOtherInvestingActivities(
			String cashReceivedRelatingToOtherInvestingActivities) {
		CashReceivedRelatingToOtherInvestingActivities = cashReceivedRelatingToOtherInvestingActivities;
	}

	/**  
	 * 获取 totalCashInflowsFromInvestingActivities
	 * @return the totalCashInflowsFromInvestingActivities 投资活动现金流入小计 
	 */
	public String getTotalCashInflowsFromInvestingActivities() {
		return TotalCashInflowsFromInvestingActivities;
	}

	/**  
	 * 设置 totalCashInflowsFromInvestingActivities  
	 * @param totalCashInflowsFromInvestingActivities 投资活动现金流入小计  
	 */
	public void setTotalCashInflowsFromInvestingActivities(
			String totalCashInflowsFromInvestingActivities) {
		TotalCashInflowsFromInvestingActivities = totalCashInflowsFromInvestingActivities;
	}

	/**  
	 * 获取 cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents
	 * @return the cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents 购建固定资产无形资产和其他长期资产所支付的现金 
	 */
	public String getCashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents() {
		return CashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents;
	}

	/**  
	 * 设置 cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents  
	 * @param cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents 购建固定资产无形资产和其他长期资产所支付的现金  
	 */
	public void setCashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents(
			String cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents) {
		CashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents = cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents;
	}

	/**  
	 * 获取 cashPaymentsForInvestments
	 * @return the cashPaymentsForInvestments 投资所支付的现金 
	 */
	public String getCashPaymentsForInvestments() {
		return CashPaymentsForInvestments;
	}

	/**  
	 * 设置 cashPaymentsForInvestments  
	 * @param cashPaymentsForInvestments 投资所支付的现金  
	 */
	public void setCashPaymentsForInvestments(String cashPaymentsForInvestments) {
		CashPaymentsForInvestments = cashPaymentsForInvestments;
	}

	/**  
	 * 获取 netCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits
	 * @return the netCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits 取得子公司及其他营业单位支付的现金净额 
	 */
	public String getNetCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits() {
		return NetCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits;
	}

	/**  
	 * 设置 netCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits  
	 * @param netCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits 取得子公司及其他营业单位支付的现金净额  
	 */
	public void setNetCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits(
			String netCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits) {
		NetCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits = netCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits;
	}

	/**  
	 * 获取 cashPaymentsRelatedToOtherInvestingActivities
	 * @return the cashPaymentsRelatedToOtherInvestingActivities 支付其他与投资活动有关的现金 
	 */
	public String getCashPaymentsRelatedToOtherInvestingActivities() {
		return CashPaymentsRelatedToOtherInvestingActivities;
	}

	/**  
	 * 设置 cashPaymentsRelatedToOtherInvestingActivities  
	 * @param cashPaymentsRelatedToOtherInvestingActivities 支付其他与投资活动有关的现金  
	 */
	public void setCashPaymentsRelatedToOtherInvestingActivities(
			String cashPaymentsRelatedToOtherInvestingActivities) {
		CashPaymentsRelatedToOtherInvestingActivities = cashPaymentsRelatedToOtherInvestingActivities;
	}

	/**  
	 * 获取 subTotalOfCashOutflows
	 * @return the subTotalOfCashOutflows 投资活动现金流出小计 
	 */
	public String getSubTotalOfCashOutflows() {
		return SubTotalOfCashOutflows;
	}

	/**  
	 * 设置 subTotalOfCashOutflows  
	 * @param subTotalOfCashOutflows 投资活动现金流出小计  
	 */
	public void setSubTotalOfCashOutflows(String subTotalOfCashOutflows) {
		SubTotalOfCashOutflows = subTotalOfCashOutflows;
	}

	/**  
	 * 获取 netCashFlowsFromInvestingActivities
	 * @return the netCashFlowsFromInvestingActivities 投资活动产生的现金流量净额 
	 */
	public String getNetCashFlowsFromInvestingActivities() {
		return NetCashFlowsFromInvestingActivities;
	}

	/**  
	 * 设置 netCashFlowsFromInvestingActivities  
	 * @param netCashFlowsFromInvestingActivities 投资活动产生的现金流量净额  
	 */
	public void setNetCashFlowsFromInvestingActivities(
			String netCashFlowsFromInvestingActivities) {
		NetCashFlowsFromInvestingActivities = netCashFlowsFromInvestingActivities;
	}

	/**  
	 * 获取 cashReceivedFromInvestors
	 * @return the cashReceivedFromInvestors 吸收投资收到的现金 
	 */
	public String getCashReceivedFromInvestors() {
		return CashReceivedFromInvestors;
	}

	/**  
	 * 设置 cashReceivedFromInvestors  
	 * @param cashReceivedFromInvestors 吸收投资收到的现金  
	 */
	public void setCashReceivedFromInvestors(String cashReceivedFromInvestors) {
		CashReceivedFromInvestors = cashReceivedFromInvestors;
	}

	/**  
	 * 获取 cashFromBorrowings
	 * @return the cashFromBorrowings 取得借款收到的现金 
	 */
	public String getCashFromBorrowings() {
		return CashFromBorrowings;
	}

	/**  
	 * 设置 cashFromBorrowings  
	 * @param cashFromBorrowings 取得借款收到的现金  
	 */
	public void setCashFromBorrowings(String cashFromBorrowings) {
		CashFromBorrowings = cashFromBorrowings;
	}

	/**  
	 * 获取 otherCashReceivedRelatingToFinancingActivities
	 * @return the otherCashReceivedRelatingToFinancingActivities 收到其他与筹资活动有关的现金 
	 */
	public String getOtherCashReceivedRelatingToFinancingActivities() {
		return OtherCashReceivedRelatingToFinancingActivities;
	}

	/**  
	 * 设置 otherCashReceivedRelatingToFinancingActivities  
	 * @param otherCashReceivedRelatingToFinancingActivities 收到其他与筹资活动有关的现金  
	 */
	public void setOtherCashReceivedRelatingToFinancingActivities(
			String otherCashReceivedRelatingToFinancingActivities) {
		OtherCashReceivedRelatingToFinancingActivities = otherCashReceivedRelatingToFinancingActivities;
	}

	/**  
	 * 获取 totalCashInflowsFromFinancingActivities
	 * @return the totalCashInflowsFromFinancingActivities 筹资活动现金流入小计 
	 */
	public String getTotalCashInflowsFromFinancingActivities() {
		return TotalCashInflowsFromFinancingActivities;
	}

	/**  
	 * 设置 totalCashInflowsFromFinancingActivities  
	 * @param totalCashInflowsFromFinancingActivities 筹资活动现金流入小计  
	 */
	public void setTotalCashInflowsFromFinancingActivities(
			String totalCashInflowsFromFinancingActivities) {
		TotalCashInflowsFromFinancingActivities = totalCashInflowsFromFinancingActivities;
	}

	/**  
	 * 获取 cashRepaymentsForDebts
	 * @return the cashRepaymentsForDebts 偿还债务所支付的现金 
	 */
	public String getCashRepaymentsForDebts() {
		return CashRepaymentsForDebts;
	}

	/**  
	 * 设置 cashRepaymentsForDebts  
	 * @param cashRepaymentsForDebts 偿还债务所支付的现金  
	 */
	public void setCashRepaymentsForDebts(String cashRepaymentsForDebts) {
		CashRepaymentsForDebts = cashRepaymentsForDebts;
	}

	/**  
	 * 获取 cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses
	 * @return the cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses 分配股利、利润或偿付利息所支付的现金 
	 */
	public String getCashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses() {
		return CashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses;
	}

	/**  
	 * 设置 cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses  
	 * @param cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses 分配股利、利润或偿付利息所支付的现金  
	 */
	public void setCashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses(
			String cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses) {
		CashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses = cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses;
	}

	/**  
	 * 获取 cashPaymentsRelatedToOtherFinancingActivities
	 * @return the cashPaymentsRelatedToOtherFinancingActivities 支付其他与筹资活动有关的现金 
	 */
	public String getCashPaymentsRelatedToOtherFinancingActivities() {
		return CashPaymentsRelatedToOtherFinancingActivities;
	}

	/**  
	 * 设置 cashPaymentsRelatedToOtherFinancingActivities  
	 * @param cashPaymentsRelatedToOtherFinancingActivities 支付其他与筹资活动有关的现金  
	 */
	public void setCashPaymentsRelatedToOtherFinancingActivities(
			String cashPaymentsRelatedToOtherFinancingActivities) {
		CashPaymentsRelatedToOtherFinancingActivities = cashPaymentsRelatedToOtherFinancingActivities;
	}

	/**  
	 * 获取 totalCashOutflowsFromFinancingActivities
	 * @return the totalCashOutflowsFromFinancingActivities 筹资活动现金流出小计 
	 */
	public String getTotalCashOutflowsFromFinancingActivities() {
		return TotalCashOutflowsFromFinancingActivities;
	}

	/**  
	 * 设置 totalCashOutflowsFromFinancingActivities  
	 * @param totalCashOutflowsFromFinancingActivities 筹资活动现金流出小计  
	 */
	public void setTotalCashOutflowsFromFinancingActivities(
			String totalCashOutflowsFromFinancingActivities) {
		TotalCashOutflowsFromFinancingActivities = totalCashOutflowsFromFinancingActivities;
	}

	/**  
	 * 获取 netCashFlowsFromFinancingActivities
	 * @return the netCashFlowsFromFinancingActivities 筹集活动产生的现金流量净额 
	 */
	public String getNetCashFlowsFromFinancingActivities() {
		return NetCashFlowsFromFinancingActivities;
	}

	/**  
	 * 设置 netCashFlowsFromFinancingActivities  
	 * @param netCashFlowsFromFinancingActivities 筹集活动产生的现金流量净额  
	 */
	public void setNetCashFlowsFromFinancingActivities(
			String netCashFlowsFromFinancingActivities) {
		NetCashFlowsFromFinancingActivities = netCashFlowsFromFinancingActivities;
	}

	/**  
	 * 获取 effectOfExchangRateChangesOnCash
	 * @return the effectOfExchangRateChangesOnCash 汇率变动对现金及现金等价物的影响 
	 */
	public String getEffectOfExchangRateChangesOnCash() {
		return EffectOfExchangRateChangesOnCash;
	}

	/**  
	 * 设置 effectOfExchangRateChangesOnCash  
	 * @param effectOfExchangRateChangesOnCash 汇率变动对现金及现金等价物的影响  
	 */
	public void setEffectOfExchangRateChangesOnCash(
			String effectOfExchangRateChangesOnCash) {
		EffectOfExchangRateChangesOnCash = effectOfExchangRateChangesOnCash;
	}

	/**  
	 * 获取 netIncreaseInCashAndCashEquivalents
	 * @return the netIncreaseInCashAndCashEquivalents 现金及现金等价物净增加额 
	 */
	public String getNetIncreaseInCashAndCashEquivalents() {
		return NetIncreaseInCashAndCashEquivalents;
	}

	/**  
	 * 设置 netIncreaseInCashAndCashEquivalents  
	 * @param netIncreaseInCashAndCashEquivalents 现金及现金等价物净增加额  
	 */
	public void setNetIncreaseInCashAndCashEquivalents(
			String netIncreaseInCashAndCashEquivalents) {
		NetIncreaseInCashAndCashEquivalents = netIncreaseInCashAndCashEquivalents;
	}

	/**  
	 * 获取 initialCashAndCashEquivalentsBalance
	 * @return the initialCashAndCashEquivalentsBalance 期初现金及现金等价物余额 
	 */
	public String getInitialCashAndCashEquivalentsBalance() {
		return InitialCashAndCashEquivalentsBalance;
	}

	/**  
	 * 设置 initialCashAndCashEquivalentsBalance  
	 * @param initialCashAndCashEquivalentsBalance 期初现金及现金等价物余额  
	 */
	public void setInitialCashAndCashEquivalentsBalance(
			String initialCashAndCashEquivalentsBalance) {
		InitialCashAndCashEquivalentsBalance = initialCashAndCashEquivalentsBalance;
	}

	/**  
	 * 获取 theFinalCashAndCashEquivalentsBalance
	 * @return the theFinalCashAndCashEquivalentsBalance 期末现金及现金等价物余额 
	 */
	public String getTheFinalCashAndCashEquivalentsBalance() {
		return TheFinalCashAndCashEquivalentsBalance;
	}

	/**  
	 * 设置 theFinalCashAndCashEquivalentsBalance  
	 * @param theFinalCashAndCashEquivalentsBalance 期末现金及现金等价物余额  
	 */
	public void setTheFinalCashAndCashEquivalentsBalance(
			String theFinalCashAndCashEquivalentsBalance) {
		TheFinalCashAndCashEquivalentsBalance = theFinalCashAndCashEquivalentsBalance;
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
	 * 获取 provisionForAssetImpairment
	 * @return the provisionForAssetImpairment 资产减值准备 
	 */
	public String getProvisionForAssetImpairment() {
		return ProvisionForAssetImpairment;
	}

	/**  
	 * 设置 provisionForAssetImpairment  
	 * @param provisionForAssetImpairment 资产减值准备  
	 */
	public void setProvisionForAssetImpairment(String provisionForAssetImpairment) {
		ProvisionForAssetImpairment = provisionForAssetImpairment;
	}

	/**  
	 * 获取 depreciationOfFixedAssets
	 * @return the depreciationOfFixedAssets 固定资产折旧、油气资产折耗、生产性生物资产折旧 
	 */
	public String getDepreciationOfFixedAssets() {
		return DepreciationOfFixedAssets;
	}

	/**  
	 * 设置 depreciationOfFixedAssets  
	 * @param depreciationOfFixedAssets 固定资产折旧、油气资产折耗、生产性生物资产折旧  
	 */
	public void setDepreciationOfFixedAssets(String depreciationOfFixedAssets) {
		DepreciationOfFixedAssets = depreciationOfFixedAssets;
	}

	/**  
	 * 获取 amortisationOfIntangibleAssets
	 * @return the amortisationOfIntangibleAssets 无形资产摊销 
	 */
	public String getAmortisationOfIntangibleAssets() {
		return AmortisationOfIntangibleAssets;
	}

	/**  
	 * 设置 amortisationOfIntangibleAssets  
	 * @param amortisationOfIntangibleAssets 无形资产摊销  
	 */
	public void setAmortisationOfIntangibleAssets(
			String amortisationOfIntangibleAssets) {
		AmortisationOfIntangibleAssets = amortisationOfIntangibleAssets;
	}

	/**  
	 * 获取 amortisationOfLongTermDefferedExpenses
	 * @return the amortisationOfLongTermDefferedExpenses 长期待摊费用摊销 
	 */
	public String getAmortisationOfLongTermDefferedExpenses() {
		return AmortisationOfLongTermDefferedExpenses;
	}

	/**  
	 * 设置 amortisationOfLongTermDefferedExpenses  
	 * @param amortisationOfLongTermDefferedExpenses 长期待摊费用摊销  
	 */
	public void setAmortisationOfLongTermDefferedExpenses(
			String amortisationOfLongTermDefferedExpenses) {
		AmortisationOfLongTermDefferedExpenses = amortisationOfLongTermDefferedExpenses;
	}

	/**  
	 * 获取 decreaseOfDefferedExpenses
	 * @return the decreaseOfDefferedExpenses 待摊费用减少 
	 */
	public String getDecreaseOfDefferedExpenses() {
		return DecreaseOfDefferedExpenses;
	}

	/**  
	 * 设置 decreaseOfDefferedExpenses  
	 * @param decreaseOfDefferedExpenses 待摊费用减少  
	 */
	public void setDecreaseOfDefferedExpenses(String decreaseOfDefferedExpenses) {
		DecreaseOfDefferedExpenses = decreaseOfDefferedExpenses;
	}

	/**  
	 * 获取 additionOfAccuedExpense
	 * @return the additionOfAccuedExpense 预提费用增加 
	 */
	public String getAdditionOfAccuedExpense() {
		return AdditionOfAccuedExpense;
	}

	/**  
	 * 设置 additionOfAccuedExpense  
	 * @param additionOfAccuedExpense 预提费用增加  
	 */
	public void setAdditionOfAccuedExpense(String additionOfAccuedExpense) {
		AdditionOfAccuedExpense = additionOfAccuedExpense;
	}

	/**  
	 * 获取 lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 * @return the lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets 处置固定资产无形资产和其他长期资产的损失 
	 */
	public String getLossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets() {
		return LossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	}

	/**  
	 * 设置 lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets  
	 * @param lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets 处置固定资产无形资产和其他长期资产的损失  
	 */
	public void setLossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets(
			String lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets) {
		LossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets = lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	}

	/**  
	 * 获取 lossesOnScrappingOfFixedAssets
	 * @return the lossesOnScrappingOfFixedAssets 固定资产报废损失 
	 */
	public String getLossesOnScrappingOfFixedAssets() {
		return LossesOnScrappingOfFixedAssets;
	}

	/**  
	 * 设置 lossesOnScrappingOfFixedAssets  
	 * @param lossesOnScrappingOfFixedAssets 固定资产报废损失  
	 */
	public void setLossesOnScrappingOfFixedAssets(
			String lossesOnScrappingOfFixedAssets) {
		LossesOnScrappingOfFixedAssets = lossesOnScrappingOfFixedAssets;
	}

	/**  
	 * 获取 profitOrLossFromChangesInFairValue
	 * @return the profitOrLossFromChangesInFairValue 公允价值变动损失 
	 */
	public String getProfitOrLossFromChangesInFairValue() {
		return ProfitOrLossFromChangesInFairValue;
	}

	/**  
	 * 设置 profitOrLossFromChangesInFairValue  
	 * @param profitOrLossFromChangesInFairValue 公允价值变动损失  
	 */
	public void setProfitOrLossFromChangesInFairValue(
			String profitOrLossFromChangesInFairValue) {
		ProfitOrLossFromChangesInFairValue = profitOrLossFromChangesInFairValue;
	}

	/**  
	 * 获取 financeExpense
	 * @return the financeExpense 财务费用 
	 */
	public String getFinanceExpense() {
		return FinanceExpense;
	}

	/**  
	 * 设置 financeExpense  
	 * @param financeExpense 财务费用  
	 */
	public void setFinanceExpense(String financeExpense) {
		FinanceExpense = financeExpense;
	}

	/**  
	 * 获取 lossesArsingFromInvestment
	 * @return the lossesArsingFromInvestment 投资损失 
	 */
	public String getLossesArsingFromInvestment() {
		return LossesArsingFromInvestment;
	}

	/**  
	 * 设置 lossesArsingFromInvestment  
	 * @param lossesArsingFromInvestment 投资损失  
	 */
	public void setLossesArsingFromInvestment(String lossesArsingFromInvestment) {
		LossesArsingFromInvestment = lossesArsingFromInvestment;
	}

	/**  
	 * 获取 deferredIncomeTaxAssets
	 * @return the deferredIncomeTaxAssets 递延所得税资产减少 
	 */
	public String getDeferredIncomeTaxAssets() {
		return DeferredIncomeTaxAssets;
	}

	/**  
	 * 设置 deferredIncomeTaxAssets  
	 * @param deferredIncomeTaxAssets 递延所得税资产减少  
	 */
	public void setDeferredIncomeTaxAssets(String deferredIncomeTaxAssets) {
		DeferredIncomeTaxAssets = deferredIncomeTaxAssets;
	}

	/**  
	 * 获取 deferredIncomeTaxLiabilities
	 * @return the deferredIncomeTaxLiabilities 递延所得税负债增加 
	 */
	public String getDeferredIncomeTaxLiabilities() {
		return DeferredIncomeTaxLiabilities;
	}

	/**  
	 * 设置 deferredIncomeTaxLiabilities  
	 * @param deferredIncomeTaxLiabilities 递延所得税负债增加  
	 */
	public void setDeferredIncomeTaxLiabilities(String deferredIncomeTaxLiabilities) {
		DeferredIncomeTaxLiabilities = deferredIncomeTaxLiabilities;
	}

	/**  
	 * 获取 decreaseInInventories
	 * @return the decreaseInInventories 存货的减少 
	 */
	public String getDecreaseInInventories() {
		return DecreaseInInventories;
	}

	/**  
	 * 设置 decreaseInInventories  
	 * @param decreaseInInventories 存货的减少  
	 */
	public void setDecreaseInInventories(String decreaseInInventories) {
		DecreaseInInventories = decreaseInInventories;
	}

	/**  
	 * 获取 decreaseInOperatingReceivables
	 * @return the decreaseInOperatingReceivables 经营性应收项目的减少 
	 */
	public String getDecreaseInOperatingReceivables() {
		return DecreaseInOperatingReceivables;
	}

	/**  
	 * 设置 decreaseInOperatingReceivables  
	 * @param decreaseInOperatingReceivables 经营性应收项目的减少  
	 */
	public void setDecreaseInOperatingReceivables(
			String decreaseInOperatingReceivables) {
		DecreaseInOperatingReceivables = decreaseInOperatingReceivables;
	}

	/**  
	 * 获取 increaseInOperatingReceivables
	 * @return the increaseInOperatingReceivables 经营性应付项目的增加 
	 */
	public String getIncreaseInOperatingReceivables() {
		return IncreaseInOperatingReceivables;
	}

	/**  
	 * 设置 increaseInOperatingReceivables  
	 * @param increaseInOperatingReceivables 经营性应付项目的增加  
	 */
	public void setIncreaseInOperatingReceivables(
			String increaseInOperatingReceivables) {
		IncreaseInOperatingReceivables = increaseInOperatingReceivables;
	}

	/**  
	 * 获取 others
	 * @return the others （净利润调节为经营活动现金流量科目下）其他 
	 */
	public String getOthers() {
		return Others;
	}

	/**  
	 * 设置 others  
	 * @param others （净利润调节为经营活动现金流量科目下）其他  
	 */
	public void setOthers(String others) {
		Others = others;
	}

	/**  
	 * 获取 netCashFlowsFromOperatingActivitiesMi
	 * @return the netCashFlowsFromOperatingActivitiesMi 经营活动产生的现金流量净额 
	 */
	public String getNetCashFlowsFromOperatingActivitiesMi() {
		return NetCashFlowsFromOperatingActivitiesMi;
	}

	/**  
	 * 设置 netCashFlowsFromOperatingActivitiesMi  
	 * @param netCashFlowsFromOperatingActivitiesMi 经营活动产生的现金流量净额  
	 */
	public void setNetCashFlowsFromOperatingActivitiesMi(
			String netCashFlowsFromOperatingActivitiesMi) {
		NetCashFlowsFromOperatingActivitiesMi = netCashFlowsFromOperatingActivitiesMi;
	}

	/**  
	 * 获取 debtsTransferToCapital
	 * @return the debtsTransferToCapital 债务转为资本 
	 */
	public String getDebtsTransferToCapital() {
		return DebtsTransferToCapital;
	}

	/**  
	 * 设置 debtsTransferToCapital  
	 * @param debtsTransferToCapital 债务转为资本  
	 */
	public void setDebtsTransferToCapital(String debtsTransferToCapital) {
		DebtsTransferToCapital = debtsTransferToCapital;
	}

	/**  
	 * 获取 oneYearDueConvertibleBonds
	 * @return the oneYearDueConvertibleBonds 一年内到期的可转换公司债券 
	 */
	public String getOneYearDueConvertibleBonds() {
		return OneYearDueConvertibleBonds;
	}

	/**  
	 * 设置 oneYearDueConvertibleBonds  
	 * @param oneYearDueConvertibleBonds 一年内到期的可转换公司债券  
	 */
	public void setOneYearDueConvertibleBonds(String oneYearDueConvertibleBonds) {
		OneYearDueConvertibleBonds = oneYearDueConvertibleBonds;
	}

	/**  
	 * 获取 financingRentToTheFixedAsset
	 * @return the financingRentToTheFixedAsset 融资租入固定资产 
	 */
	public String getFinancingRentToTheFixedAsset() {
		return FinancingRentToTheFixedAsset;
	}

	/**  
	 * 设置 financingRentToTheFixedAsset  
	 * @param financingRentToTheFixedAsset 融资租入固定资产  
	 */
	public void setFinancingRentToTheFixedAsset(String financingRentToTheFixedAsset) {
		FinancingRentToTheFixedAsset = financingRentToTheFixedAsset;
	}

	/**  
	 * 获取 nonCashOthers
	 * @return the nonCashOthers （不涉及现金收支的投资和筹资活动科目下）其他 
	 */
	public String getNonCashOthers() {
		return NonCashOthers;
	}

	/**  
	 * 设置 nonCashOthers  
	 * @param nonCashOthers （不涉及现金收支的投资和筹资活动科目下）其他  
	 */
	public void setNonCashOthers(String nonCashOthers) {
		NonCashOthers = nonCashOthers;
	}

	/**  
	 * 获取 cashAtTheEndOfPeriod
	 * @return the cashAtTheEndOfPeriod 现金的期末余额 
	 */
	public String getCashAtTheEndOfPeriod() {
		return CashAtTheEndOfPeriod;
	}

	/**  
	 * 设置 cashAtTheEndOfPeriod  
	 * @param cashAtTheEndOfPeriod 现金的期末余额  
	 */
	public void setCashAtTheEndOfPeriod(String cashAtTheEndOfPeriod) {
		CashAtTheEndOfPeriod = cashAtTheEndOfPeriod;
	}

	/**  
	 * 获取 cashAtTheBeginningOfThePeriod
	 * @return the cashAtTheBeginningOfThePeriod 现金的期初余额 
	 */
	public String getCashAtTheBeginningOfThePeriod() {
		return CashAtTheBeginningOfThePeriod;
	}

	/**  
	 * 设置 cashAtTheBeginningOfThePeriod  
	 * @param cashAtTheBeginningOfThePeriod 现金的期初余额  
	 */
	public void setCashAtTheBeginningOfThePeriod(
			String cashAtTheBeginningOfThePeriod) {
		CashAtTheBeginningOfThePeriod = cashAtTheBeginningOfThePeriod;
	}

	/**  
	 * 获取 cashEquivalentsAtTheEndOfThePeriod
	 * @return the cashEquivalentsAtTheEndOfThePeriod 现金等价物的期末余额 
	 */
	public String getCashEquivalentsAtTheEndOfThePeriod() {
		return CashEquivalentsAtTheEndOfThePeriod;
	}

	/**  
	 * 设置 cashEquivalentsAtTheEndOfThePeriod  
	 * @param cashEquivalentsAtTheEndOfThePeriod 现金等价物的期末余额  
	 */
	public void setCashEquivalentsAtTheEndOfThePeriod(
			String cashEquivalentsAtTheEndOfThePeriod) {
		CashEquivalentsAtTheEndOfThePeriod = cashEquivalentsAtTheEndOfThePeriod;
	}

	/**  
	 * 获取 cashEquivalentsAtTheBeginningOfThePeriod
	 * @return the cashEquivalentsAtTheBeginningOfThePeriod 现金等价物的期初余额 
	 */
	public String getCashEquivalentsAtTheBeginningOfThePeriod() {
		return CashEquivalentsAtTheBeginningOfThePeriod;
	}

	/**  
	 * 设置 cashEquivalentsAtTheBeginningOfThePeriod  
	 * @param cashEquivalentsAtTheBeginningOfThePeriod 现金等价物的期初余额  
	 */
	public void setCashEquivalentsAtTheBeginningOfThePeriod(
			String cashEquivalentsAtTheBeginningOfThePeriod) {
		CashEquivalentsAtTheBeginningOfThePeriod = cashEquivalentsAtTheBeginningOfThePeriod;
	}

	/**  
	 * 获取 netIncreaseInCashAndCashEquivalentsMi
	 * @return the netIncreaseInCashAndCashEquivalentsMi 现金及现金等价物净增加额 
	 */
	public String getNetIncreaseInCashAndCashEquivalentsMi() {
		return NetIncreaseInCashAndCashEquivalentsMi;
	}

	/**  
	 * 设置 netIncreaseInCashAndCashEquivalentsMi  
	 * @param netIncreaseInCashAndCashEquivalentsMi 现金及现金等价物净增加额  
	 */
	public void setNetIncreaseInCashAndCashEquivalentsMi(
			String netIncreaseInCashAndCashEquivalentsMi) {
		NetIncreaseInCashAndCashEquivalentsMi = netIncreaseInCashAndCashEquivalentsMi;
	}

	/**  
	 * Title: toString<br\>  
	 * Description: <br\>  
	 * @return 
	 */
	@Override
	public String toString() {
		return "CashFlows2007Sgmt [AdditionOfAccuedExpense="
				+ AdditionOfAccuedExpense
				+ ", AmortisationOfIntangibleAssets="
				+ AmortisationOfIntangibleAssets
				+ ", AmortisationOfLongTermDefferedExpenses="
				+ AmortisationOfLongTermDefferedExpenses
				+ ", CashAtTheBeginningOfThePeriod="
				+ CashAtTheBeginningOfThePeriod
				+ ", CashAtTheEndOfPeriod="
				+ CashAtTheEndOfPeriod
				+ ", CashEquivalentsAtTheBeginningOfThePeriod="
				+ CashEquivalentsAtTheBeginningOfThePeriod
				+ ", CashEquivalentsAtTheEndOfThePeriod="
				+ CashEquivalentsAtTheEndOfThePeriod
				+ ", CashFromBorrowings="
				+ CashFromBorrowings
				+ ", CashPaidForGoodsAndServices="
				+ CashPaidForGoodsAndServices
				+ ", CashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents="
				+ CashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents
				+ ", CashPaidToAndOnBehalfOfEmployees="
				+ CashPaidToAndOnBehalfOfEmployees
				+ ", CashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses="
				+ CashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses
				+ ", CashPaymentsForInvestments="
				+ CashPaymentsForInvestments
				+ ", CashPaymentsRelatedToOtherFinancingActivities="
				+ CashPaymentsRelatedToOtherFinancingActivities
				+ ", CashPaymentsRelatedToOtherInvestingActivities="
				+ CashPaymentsRelatedToOtherInvestingActivities
				+ ", CashReceivedFromInvestors="
				+ CashReceivedFromInvestors
				+ ", CashReceivedFromOnvestments="
				+ CashReceivedFromOnvestments
				+ ", CashReceivedFromReturnOfInvestment="
				+ CashReceivedFromReturnOfInvestment
				+ ", CashReceivedFromSalesOfGoodsOrRendingOfServices="
				+ CashReceivedFromSalesOfGoodsOrRendingOfServices
				+ ", CashReceivedRelatingToOtherInvestingActivities="
				+ CashReceivedRelatingToOtherInvestingActivities
				+ ", CashRepaymentsForDebts="
				+ CashRepaymentsForDebts
				+ ", DebtsTransferToCapital="
				+ DebtsTransferToCapital
				+ ", DecreaseInInventories="
				+ DecreaseInInventories
				+ ", DecreaseInOperatingReceivables="
				+ DecreaseInOperatingReceivables
				+ ", DecreaseOfDefferedExpenses="
				+ DecreaseOfDefferedExpenses
				+ ", DeferredIncomeTaxAssets="
				+ DeferredIncomeTaxAssets
				+ ", DeferredIncomeTaxLiabilities="
				+ DeferredIncomeTaxLiabilities
				+ ", DepreciationOfFixedAssets="
				+ DepreciationOfFixedAssets
				+ ", EffectOfExchangRateChangesOnCash="
				+ EffectOfExchangRateChangesOnCash
				+ ", FinanceExpense="
				+ FinanceExpense
				+ ", FinancingRentToTheFixedAsset="
				+ FinancingRentToTheFixedAsset
				+ ", IncreaseInOperatingReceivables="
				+ IncreaseInOperatingReceivables
				+ ", InitialCashAndCashEquivalentsBalance="
				+ InitialCashAndCashEquivalentsBalance
				+ ", LossesArsingFromInvestment="
				+ LossesArsingFromInvestment
				+ ", LossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets="
				+ LossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
				+ ", LossesOnScrappingOfFixedAssets="
				+ LossesOnScrappingOfFixedAssets
				+ ", NetCashFlowsFromFinancingActivities="
				+ NetCashFlowsFromFinancingActivities
				+ ", NetCashFlowsFromInvestingActivities="
				+ NetCashFlowsFromInvestingActivities
				+ ", NetCashFlowsFromOperatingActivities="
				+ NetCashFlowsFromOperatingActivities
				+ ", NetCashFlowsFromOperatingActivitiesMi="
				+ NetCashFlowsFromOperatingActivitiesMi
				+ ", NetCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities="
				+ NetCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities
				+ ", NetCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits="
				+ NetCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits
				+ ", NetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets="
				+ NetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
				+ ", NetIncreaseInCashAndCashEquivalents="
				+ NetIncreaseInCashAndCashEquivalents
				+ ", NetIncreaseInCashAndCashEquivalentsMi="
				+ NetIncreaseInCashAndCashEquivalentsMi + ", NetProfit="
				+ NetProfit + ", NonCashOthers=" + NonCashOthers
				+ ", OneYearDueConvertibleBonds=" + OneYearDueConvertibleBonds
				+ ", OtherCashPaymentsFromOperatingActivities="
				+ OtherCashPaymentsFromOperatingActivities
				+ ", OtherCashReceivedRelatingToFinancingActivities="
				+ OtherCashReceivedRelatingToFinancingActivities
				+ ", OtherCashReceivedRelatingToOperatingActivities="
				+ OtherCashReceivedRelatingToOperatingActivities + ", Others="
				+ Others + ", PaymentsOfAllTypesOfTaxes="
				+ PaymentsOfAllTypesOfTaxes
				+ ", ProfitOrLossFromChangesInFairValue="
				+ ProfitOrLossFromChangesInFairValue
				+ ", ProvisionForAssetImpairment="
				+ ProvisionForAssetImpairment + ", SubTotalOfCashOutflows="
				+ SubTotalOfCashOutflows + ", TaxRefunds=" + TaxRefunds
				+ ", TheFinalCashAndCashEquivalentsBalance="
				+ TheFinalCashAndCashEquivalentsBalance
				+ ", TotalCashInflowsFromFinancingActivities="
				+ TotalCashInflowsFromFinancingActivities
				+ ", TotalCashInflowsFromInvestingActivities="
				+ TotalCashInflowsFromInvestingActivities
				+ ", TotalCashInflowsFromOperatingActivities="
				+ TotalCashInflowsFromOperatingActivities
				+ ", TotalCashOutflowsFromFinancingActivities="
				+ TotalCashOutflowsFromFinancingActivities
				+ ", TotalCashOutflowsFromOperatingActivities="
				+ TotalCashOutflowsFromOperatingActivities + "]";
	}
}
