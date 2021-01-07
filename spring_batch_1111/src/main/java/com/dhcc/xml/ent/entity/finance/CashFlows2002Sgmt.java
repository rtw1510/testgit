package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

//NetCashFlowsFromOperatingA 此表没建 重复与 NetCashFlowsFromOperatingActivities

/**
 * Title: CashFlows2002Sgmt<br/>
 * Description:企业现金流量表整笔删除请求记录数据项<br/>
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
		"CashReceivedRelatingToOtherInvestingActivities",
		"TotalCashInflowsFromInvestingActivities",
		"CashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents",
		"CashPaymentsForInvestments",
		"CashPaymentsRelatedToOtherInvestingActivities",
		"TotalCashOutflowsFromInvestingActivities",
		"NetCashFlowsFromInvestingActivities", "CashReceivedFromInvestors",
		"CashFromBorrowings", "OtherCashReceivedRelatingToFinancingActivities",
		"TotalCashInflowsFromFinancingActivities", "CashRepaymentsForDebts",
		"CashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses",
		"CashPaymentsRelatedToOtherFinancingActivities",
		"TotalCashOutflowsFromFinancingActivities",
		"NetCashFlowsFromFinancingActivities",
		"EffectOfExchangRateChangesOnCash",
		"NetIncreaseInCashAndCashEquivalents", "NetProfit",
		"ProvisionForAssets", "DepreciationOfFixedAssets",
		"AmortisationOfIntangibleAssets",
		"LongTermDeferredExpensesAmortization", "DecreaseOfDefferedExpenses",
		"AdditionOfAccuedExpense",
		"LossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets",
		"LossesOnScrappingOfFixedAssets", "FinanceExpense",
		"LossesArsingFromInvestment", "DeferredTaxCredit",
		"DecreaseInInventories", "DecreaseInOperatingReceivables",
		"IncreaseInOperatingReceivables", "Others",
		"NetCashFlowsFromOperatingActivitiesMi", "DebtsTransferToCapital",
		"OneYearDueConvertibleBonds", "FinancingRentToTheFixedAsset",
		"NonCashOthers", "CashAtTheEndOfPeriod",
		"CashAtTheBeginningOfThePeriod", "CashEquivalentsAtTheEndOfThePeriod",
		"CashRquivalentsAtTheBeginningOfThePeriod",
		"NetIncreaseInCashAndCashEquivalentsMi" },namespace = "com.dhcc.xml.ent.entity.finance")
public class CashFlows2002Sgmt {

	/**
	 * 销售商品和提供劳务收到的现金
	 */
	@XmlElement
	private String CashReceivedFromSalesOfGoodsOrRendingOfServices;
	/**
	 * 收到的税费返还
	 */
	@XmlElement
	private String TaxRefunds;
	/**
	 * 收到的其他与经营活动有关的现金
	 */
	@XmlElement
	private String OtherCashReceivedRelatingToOperatingActivities;
	/**
	 * 经营活动现金流入小计
	 */
	@XmlElement
	private String TotalCashInflowsFromOperatingActivities;
	/**
	 * 购买商品、接受劳务支付的现金
	 */
	@XmlElement
	private String CashPaidForGoodsAndServices;
	/**
	 * 支付给职工以及为职工支付的现金
	 */
	@XmlElement
	private String CashPaidToAndOnBehalfOfEmployees;
	/**
	 * 支付的各项税费
	 */
	@XmlElement
	private String PaymentsOfAllTypesOfTaxes;
	/**
	 * 支付的其他与经营活动有关的现金
	 */
	@XmlElement
	private String OtherCashPaymentsFromOperatingActivities;
	/**
	 * 经营活动现金流出小计
	 */
	@XmlElement
	private String TotalCashOutflowsFromOperatingActivities;
	/**
	 * 经营活动产生的现金流量净额
	 */
	@XmlElement
	private String NetCashFlowsFromOperatingActivities;
	/**
	 * 收回投资所收到的现金
	 */
	@XmlElement
	private String CashReceivedFromReturnOfInvestment;
	/**
	 * 取得投资收益所收到的现金
	 */
	@XmlElement
	private String CashReceivedFromOnvestments;
	/**
	 * 处置固定资产无形资产和其他长期资产所收回的现金净额
	 */
	@XmlElement
	private String NetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	/**
	 * 收到的其他与投资活动有关的现金
	 */
	@XmlElement
	private String CashReceivedRelatingToOtherInvestingActivities;
	/**
	 * 投资活动现金流入小计
	 */
	@XmlElement
	private String TotalCashInflowsFromInvestingActivities;
	/**
	 * 购建固定资产无形资产和其他长期资产所支付的现金
	 */
	@XmlElement
	private String CashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents;
	/**
	 * 投资所支付的现金
	 */
	@XmlElement
	private String CashPaymentsForInvestments;
	/**
	 * 支付的其他与投资活动有关的现金
	 */
	@XmlElement
	private String CashPaymentsRelatedToOtherInvestingActivities;
	/**
	 * 投资活动现金流出小计
	 */
	@XmlElement
	private String TotalCashOutflowsFromInvestingActivities;
	/**
	 * 投资活动产生的现金流量净额
	 */
	@XmlElement
	private String NetCashFlowsFromInvestingActivities;
	/**
	 * 吸收投资所收到的现金
	 */
	@XmlElement
	private String CashReceivedFromInvestors;
	/**
	 * 借款所收到的现金
	 */
	@XmlElement
	private String CashFromBorrowings;
	/**
	 * 收到的其他与筹资活动有关的现金
	 */
	@XmlElement
	private String OtherCashReceivedRelatingToFinancingActivities;
	/**
	 * 筹资活动现金流入小计
	 */
	@XmlElement
	private String TotalCashInflowsFromFinancingActivities;
	/**
	 * 偿还债务所支付的现金
	 */
	@XmlElement
	private String CashRepaymentsForDebts;
	/**
	 * 分配股利、利润或偿付利息所支付的现金
	 */
	@XmlElement
	private String CashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses;
	/**
	 * 支付的其他与筹资活动有关的现金
	 */
	@XmlElement
	private String CashPaymentsRelatedToOtherFinancingActivities;
	/**
	 * 筹资活动现金流出小计
	 */
	@XmlElement
	private String TotalCashOutflowsFromFinancingActivities;
	/**
	 * 筹集活动产生的现金流量净额
	 */
	@XmlElement
	private String NetCashFlowsFromFinancingActivities;
	/**
	 * 汇率变动对现金的影响
	 */
	@XmlElement
	private String EffectOfExchangRateChangesOnCash;
	/**
	 * 现金及现金等价物净增加额
	 */
	@XmlElement
	private String NetIncreaseInCashAndCashEquivalents;
	/**
	 * 净利润
	 */
	@XmlElement
	private String NetProfit;
	/**
	 * 计提的资产减值准备
	 */
	@XmlElement
	private String ProvisionForAssets;
	/**
	 * 固定资产拆旧
	 */
	@XmlElement
	private String DepreciationOfFixedAssets;
	/**
	 * 无形资产摊销
	 */
	@XmlElement
	private String AmortisationOfIntangibleAssets;
	/**
	 * 长期待摊费用摊销
	 */
	@XmlElement
	private String LongTermDeferredExpensesAmortization;
	/**
	 * 待摊费用减少
	 */
	@XmlElement
	private String DecreaseOfDefferedExpenses;
	/**
	 * 预提费用增加
	 */
	@XmlElement
	private String AdditionOfAccuedExpense;
	/**
	 * 处置固定资产无形资产和其他长期资产的损失
	 */
	@XmlElement
	private String LossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	/**
	 * 固定资产报废损失
	 */
	@XmlElement
	private String LossesOnScrappingOfFixedAssets;
	/**
	 * 财务费用
	 */
	@XmlElement
	private String FinanceExpense;
	/**
	 * 投资损失
	 */
	@XmlElement
	private String LossesArsingFromInvestment;
	/**
	 * 递延税款贷项
	 */
	@XmlElement
	private String DeferredTaxCredit;
	/**
	 * 存货的减少
	 */
	@XmlElement
	private String DecreaseInInventories;
	/**
	 * 经营性应收项目的减少
	 */
	@XmlElement
	private String DecreaseInOperatingReceivables;
	/**
	 * 经营性应付项目的增加
	 */
	@XmlElement
	private String IncreaseInOperatingReceivables;
	/**
	 * （净利润调节为经营活动现金流量科目下）其他
	 */
	@XmlElement
	private String Others;
	/**
	 * 经营活动产生的现金流量净额
	 */
	@XmlElement
	private String NetCashFlowsFromOperatingActivitiesMi;
	/**
	 * 债务转为资本
	 */
	@XmlElement
	private String DebtsTransferToCapital;
	/**
	 * 一年内到期的可转换公司债券
	 */
	@XmlElement
	private String OneYearDueConvertibleBonds;
	/**
	 * 融资租入固定资产
	 */
	@XmlElement
	private String FinancingRentToTheFixedAsset;
	/**
	 * （不涉及现金收支的投资和筹资活动科目下）其他
	 */
	@XmlElement
	private String NonCashOthers;
	/**
	 * 现金的期末余额
	 */
	@XmlElement
	private String CashAtTheEndOfPeriod;
	/**
	 * 现金的期初余额
	 */
	@XmlElement
	private String CashAtTheBeginningOfThePeriod;
	/**
	 * 现金等价物的期末余额
	 */
	@XmlElement
	private String CashEquivalentsAtTheEndOfThePeriod;
	/**
	 * 现金等价物的期初余额
	 */
	@XmlElement
	private String CashRquivalentsAtTheBeginningOfThePeriod;
	/**
	 * 现金及现金等价物净增加额
	 */
	@XmlElement
	private String NetIncreaseInCashAndCashEquivalentsMi;

	public CashFlows2002Sgmt() {
		super();
	}

	/**
	 * 获取 cashReceivedFromSalesOfGoodsOrRendingOfServices
	 * 
	 * @return the cashReceivedFromSalesOfGoodsOrRendingOfServices
	 *         销售商品和提供劳务收到的现金
	 */
	public String getCashReceivedFromSalesOfGoodsOrRendingOfServices() {
		return CashReceivedFromSalesOfGoodsOrRendingOfServices;
	}

	/**
	 * 设置 cashReceivedFromSalesOfGoodsOrRendingOfServices
	 * 
	 * @param cashReceivedFromSalesOfGoodsOrRendingOfServices
	 *            销售商品和提供劳务收到的现金
	 */
	public void setCashReceivedFromSalesOfGoodsOrRendingOfServices(
			String cashReceivedFromSalesOfGoodsOrRendingOfServices) {
		CashReceivedFromSalesOfGoodsOrRendingOfServices = cashReceivedFromSalesOfGoodsOrRendingOfServices;
	}

	/**
	 * 获取 taxRefunds
	 * 
	 * @return the taxRefunds 收到的税费返还
	 */
	public String getTaxRefunds() {
		return TaxRefunds;
	}

	/**
	 * 设置 taxRefunds
	 * 
	 * @param taxRefunds
	 *            收到的税费返还
	 */
	public void setTaxRefunds(String taxRefunds) {
		TaxRefunds = taxRefunds;
	}

	/**
	 * 获取 otherCashReceivedRelatingToOperatingActivities
	 * 
	 * @return the otherCashReceivedRelatingToOperatingActivities
	 *         收到的其他与经营活动有关的现金
	 */
	public String getOtherCashReceivedRelatingToOperatingActivities() {
		return OtherCashReceivedRelatingToOperatingActivities;
	}

	/**
	 * 设置 otherCashReceivedRelatingToOperatingActivities
	 * 
	 * @param otherCashReceivedRelatingToOperatingActivities
	 *            收到的其他与经营活动有关的现金
	 */
	public void setOtherCashReceivedRelatingToOperatingActivities(
			String otherCashReceivedRelatingToOperatingActivities) {
		OtherCashReceivedRelatingToOperatingActivities = otherCashReceivedRelatingToOperatingActivities;
	}

	/**
	 * 获取 totalCashInflowsFromOperatingActivities
	 * 
	 * @return the totalCashInflowsFromOperatingActivities 经营活动现金流入小计
	 */
	public String getTotalCashInflowsFromOperatingActivities() {
		return TotalCashInflowsFromOperatingActivities;
	}

	/**
	 * 设置 totalCashInflowsFromOperatingActivities
	 * 
	 * @param totalCashInflowsFromOperatingActivities
	 *            经营活动现金流入小计
	 */
	public void setTotalCashInflowsFromOperatingActivities(
			String totalCashInflowsFromOperatingActivities) {
		TotalCashInflowsFromOperatingActivities = totalCashInflowsFromOperatingActivities;
	}

	/**
	 * 获取 cashPaidForGoodsAndServices
	 * 
	 * @return the cashPaidForGoodsAndServices 购买商品、接受劳务支付的现金
	 */
	public String getCashPaidForGoodsAndServices() {
		return CashPaidForGoodsAndServices;
	}

	/**
	 * 设置 cashPaidForGoodsAndServices
	 * 
	 * @param cashPaidForGoodsAndServices
	 *            购买商品、接受劳务支付的现金
	 */
	public void setCashPaidForGoodsAndServices(
			String cashPaidForGoodsAndServices) {
		CashPaidForGoodsAndServices = cashPaidForGoodsAndServices;
	}

	/**
	 * 获取 cashPaidToAndOnBehalfOfEmployees
	 * 
	 * @return the cashPaidToAndOnBehalfOfEmployees 支付给职工以及为职工支付的现金
	 */
	public String getCashPaidToAndOnBehalfOfEmployees() {
		return CashPaidToAndOnBehalfOfEmployees;
	}

	/**
	 * 设置 cashPaidToAndOnBehalfOfEmployees
	 * 
	 * @param cashPaidToAndOnBehalfOfEmployees
	 *            支付给职工以及为职工支付的现金
	 */
	public void setCashPaidToAndOnBehalfOfEmployees(
			String cashPaidToAndOnBehalfOfEmployees) {
		CashPaidToAndOnBehalfOfEmployees = cashPaidToAndOnBehalfOfEmployees;
	}

	/**
	 * 获取 paymentsOfAllTypesOfTaxes
	 * 
	 * @return the paymentsOfAllTypesOfTaxes 支付的各项税费
	 */
	public String getPaymentsOfAllTypesOfTaxes() {
		return PaymentsOfAllTypesOfTaxes;
	}

	/**
	 * 设置 paymentsOfAllTypesOfTaxes
	 * 
	 * @param paymentsOfAllTypesOfTaxes
	 *            支付的各项税费
	 */
	public void setPaymentsOfAllTypesOfTaxes(String paymentsOfAllTypesOfTaxes) {
		PaymentsOfAllTypesOfTaxes = paymentsOfAllTypesOfTaxes;
	}

	/**
	 * 获取 otherCashPaymentsFromOperatingActivities
	 * 
	 * @return the otherCashPaymentsFromOperatingActivities 支付的其他与经营活动有关的现金
	 */
	public String getOtherCashPaymentsFromOperatingActivities() {
		return OtherCashPaymentsFromOperatingActivities;
	}

	/**
	 * 设置 otherCashPaymentsFromOperatingActivities
	 * 
	 * @param otherCashPaymentsFromOperatingActivities
	 *            支付的其他与经营活动有关的现金
	 */
	public void setOtherCashPaymentsFromOperatingActivities(
			String otherCashPaymentsFromOperatingActivities) {
		OtherCashPaymentsFromOperatingActivities = otherCashPaymentsFromOperatingActivities;
	}

	/**
	 * 获取 totalCashOutflowsFromOperatingActivities
	 * 
	 * @return the totalCashOutflowsFromOperatingActivities 经营活动现金流出小计
	 */
	public String getTotalCashOutflowsFromOperatingActivities() {
		return TotalCashOutflowsFromOperatingActivities;
	}

	/**
	 * 设置 totalCashOutflowsFromOperatingActivities
	 * 
	 * @param totalCashOutflowsFromOperatingActivities
	 *            经营活动现金流出小计
	 */
	public void setTotalCashOutflowsFromOperatingActivities(
			String totalCashOutflowsFromOperatingActivities) {
		TotalCashOutflowsFromOperatingActivities = totalCashOutflowsFromOperatingActivities;
	}

	/**
	 * 获取 netCashFlowsFromOperatingActivities
	 * 
	 * @return the netCashFlowsFromOperatingActivities 经营活动产生的现金流量净额
	 */
	public String getNetCashFlowsFromOperatingActivities() {
		return NetCashFlowsFromOperatingActivities;
	}

	/**
	 * 设置 netCashFlowsFromOperatingActivities
	 * 
	 * @param netCashFlowsFromOperatingActivities
	 *            经营活动产生的现金流量净额
	 */
	public void setNetCashFlowsFromOperatingActivities(
			String netCashFlowsFromOperatingActivities) {
		NetCashFlowsFromOperatingActivities = netCashFlowsFromOperatingActivities;
	}

	/**
	 * 获取 cashReceivedFromReturnOfInvestment
	 * 
	 * @return the cashReceivedFromReturnOfInvestment 收回投资所收到的现金
	 */
	public String getCashReceivedFromReturnOfInvestment() {
		return CashReceivedFromReturnOfInvestment;
	}

	/**
	 * 设置 cashReceivedFromReturnOfInvestment
	 * 
	 * @param cashReceivedFromReturnOfInvestment
	 *            收回投资所收到的现金
	 */
	public void setCashReceivedFromReturnOfInvestment(
			String cashReceivedFromReturnOfInvestment) {
		CashReceivedFromReturnOfInvestment = cashReceivedFromReturnOfInvestment;
	}

	/**
	 * 获取 cashReceivedFromOnvestments
	 * 
	 * @return the cashReceivedFromOnvestments 取得投资收益所收到的现金
	 */
	public String getCashReceivedFromOnvestments() {
		return CashReceivedFromOnvestments;
	}

	/**
	 * 设置 cashReceivedFromOnvestments
	 * 
	 * @param cashReceivedFromOnvestments
	 *            取得投资收益所收到的现金
	 */
	public void setCashReceivedFromOnvestments(
			String cashReceivedFromOnvestments) {
		CashReceivedFromOnvestments = cashReceivedFromOnvestments;
	}

	/**
	 * 获取
	 * netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 * 
	 * @return the
	 *         netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 *         处置固定资产无形资产和其他长期资产所收回的现金净额
	 */
	public String getNetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets() {
		return NetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	}

	/**
	 * 设置
	 * netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 * 
	 * @param netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 *            处置固定资产无形资产和其他长期资产所收回的现金净额
	 */
	public void setNetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets(
			String netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets) {
		NetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets = netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	}

	/**
	 * 获取 cashReceivedRelatingToOtherInvestingActivities
	 * 
	 * @return the cashReceivedRelatingToOtherInvestingActivities
	 *         收到的其他与投资活动有关的现金
	 */
	public String getCashReceivedRelatingToOtherInvestingActivities() {
		return CashReceivedRelatingToOtherInvestingActivities;
	}

	/**
	 * 设置 cashReceivedRelatingToOtherInvestingActivities
	 * 
	 * @param cashReceivedRelatingToOtherInvestingActivities
	 *            收到的其他与投资活动有关的现金
	 */
	public void setCashReceivedRelatingToOtherInvestingActivities(
			String cashReceivedRelatingToOtherInvestingActivities) {
		CashReceivedRelatingToOtherInvestingActivities = cashReceivedRelatingToOtherInvestingActivities;
	}

	/**
	 * 获取 totalCashInflowsFromInvestingActivities
	 * 
	 * @return the totalCashInflowsFromInvestingActivities 投资活动现金流入小计
	 */
	public String getTotalCashInflowsFromInvestingActivities() {
		return TotalCashInflowsFromInvestingActivities;
	}

	/**
	 * 设置 totalCashInflowsFromInvestingActivities
	 * 
	 * @param totalCashInflowsFromInvestingActivities
	 *            投资活动现金流入小计
	 */
	public void setTotalCashInflowsFromInvestingActivities(
			String totalCashInflowsFromInvestingActivities) {
		TotalCashInflowsFromInvestingActivities = totalCashInflowsFromInvestingActivities;
	}

	/**
	 * 获取 cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents
	 * 
	 * @return the
	 *         cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents
	 *         购建固定资产无形资产和其他长期资产所支付的现金
	 */
	public String getCashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents() {
		return CashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents;
	}

	/**
	 * 设置 cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents
	 * 
	 * @param cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents
	 *            购建固定资产无形资产和其他长期资产所支付的现金
	 */
	public void setCashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents(
			String cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents) {
		CashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents = cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents;
	}

	/**
	 * 获取 cashPaymentsForInvestments
	 * 
	 * @return the cashPaymentsForInvestments 投资所支付的现金
	 */
	public String getCashPaymentsForInvestments() {
		return CashPaymentsForInvestments;
	}

	/**
	 * 设置 cashPaymentsForInvestments
	 * 
	 * @param cashPaymentsForInvestments
	 *            投资所支付的现金
	 */
	public void setCashPaymentsForInvestments(String cashPaymentsForInvestments) {
		CashPaymentsForInvestments = cashPaymentsForInvestments;
	}

	/**
	 * 获取 cashPaymentsRelatedToOtherInvestingActivities
	 * 
	 * @return the cashPaymentsRelatedToOtherInvestingActivities 支付的其他与投资活动有关的现金
	 */
	public String getCashPaymentsRelatedToOtherInvestingActivities() {
		return CashPaymentsRelatedToOtherInvestingActivities;
	}

	/**
	 * 设置 cashPaymentsRelatedToOtherInvestingActivities
	 * 
	 * @param cashPaymentsRelatedToOtherInvestingActivities
	 *            支付的其他与投资活动有关的现金
	 */
	public void setCashPaymentsRelatedToOtherInvestingActivities(
			String cashPaymentsRelatedToOtherInvestingActivities) {
		CashPaymentsRelatedToOtherInvestingActivities = cashPaymentsRelatedToOtherInvestingActivities;
	}

	/**
	 * 获取 totalCashOutflowsFromInvestingActivities
	 * 
	 * @return the totalCashOutflowsFromInvestingActivities 投资活动现金流出小计
	 */
	public String getTotalCashOutflowsFromInvestingActivities() {
		return TotalCashOutflowsFromInvestingActivities;
	}

	/**
	 * 设置 totalCashOutflowsFromInvestingActivities
	 * 
	 * @param totalCashOutflowsFromInvestingActivities
	 *            投资活动现金流出小计
	 */
	public void setTotalCashOutflowsFromInvestingActivities(
			String totalCashOutflowsFromInvestingActivities) {
		TotalCashOutflowsFromInvestingActivities = totalCashOutflowsFromInvestingActivities;
	}

	/**
	 * 获取 netCashFlowsFromInvestingActivities
	 * 
	 * @return the netCashFlowsFromInvestingActivities 投资活动产生的现金流量净额
	 */
	public String getNetCashFlowsFromInvestingActivities() {
		return NetCashFlowsFromInvestingActivities;
	}

	/**
	 * 设置 netCashFlowsFromInvestingActivities
	 * 
	 * @param netCashFlowsFromInvestingActivities
	 *            投资活动产生的现金流量净额
	 */
	public void setNetCashFlowsFromInvestingActivities(
			String netCashFlowsFromInvestingActivities) {
		NetCashFlowsFromInvestingActivities = netCashFlowsFromInvestingActivities;
	}

	/**
	 * 获取 cashReceivedFromInvestors
	 * 
	 * @return the cashReceivedFromInvestors 吸收投资所收到的现金
	 */
	public String getCashReceivedFromInvestors() {
		return CashReceivedFromInvestors;
	}

	/**
	 * 设置 cashReceivedFromInvestors
	 * 
	 * @param cashReceivedFromInvestors
	 *            吸收投资所收到的现金
	 */
	public void setCashReceivedFromInvestors(String cashReceivedFromInvestors) {
		CashReceivedFromInvestors = cashReceivedFromInvestors;
	}

	/**
	 * 获取 cashFromBorrowings
	 * 
	 * @return the cashFromBorrowings 借款所收到的现金
	 */
	public String getCashFromBorrowings() {
		return CashFromBorrowings;
	}

	/**
	 * 设置 cashFromBorrowings
	 * 
	 * @param cashFromBorrowings
	 *            借款所收到的现金
	 */
	public void setCashFromBorrowings(String cashFromBorrowings) {
		CashFromBorrowings = cashFromBorrowings;
	}

	/**
	 * 获取 otherCashReceivedRelatingToFinancingActivities
	 * 
	 * @return the otherCashReceivedRelatingToFinancingActivities
	 *         收到的其他与筹资活动有关的现金
	 */
	public String getOtherCashReceivedRelatingToFinancingActivities() {
		return OtherCashReceivedRelatingToFinancingActivities;
	}

	/**
	 * 设置 otherCashReceivedRelatingToFinancingActivities
	 * 
	 * @param otherCashReceivedRelatingToFinancingActivities
	 *            收到的其他与筹资活动有关的现金
	 */
	public void setOtherCashReceivedRelatingToFinancingActivities(
			String otherCashReceivedRelatingToFinancingActivities) {
		OtherCashReceivedRelatingToFinancingActivities = otherCashReceivedRelatingToFinancingActivities;
	}

	/**
	 * 获取 totalCashInflowsFromFinancingActivities
	 * 
	 * @return the totalCashInflowsFromFinancingActivities 筹资活动现金流入小计
	 */
	public String getTotalCashInflowsFromFinancingActivities() {
		return TotalCashInflowsFromFinancingActivities;
	}

	/**
	 * 设置 totalCashInflowsFromFinancingActivities
	 * 
	 * @param totalCashInflowsFromFinancingActivities
	 *            筹资活动现金流入小计
	 */
	public void setTotalCashInflowsFromFinancingActivities(
			String totalCashInflowsFromFinancingActivities) {
		TotalCashInflowsFromFinancingActivities = totalCashInflowsFromFinancingActivities;
	}

	/**
	 * 获取 cashRepaymentsForDebts
	 * 
	 * @return the cashRepaymentsForDebts 偿还债务所支付的现金
	 */
	public String getCashRepaymentsForDebts() {
		return CashRepaymentsForDebts;
	}

	/**
	 * 设置 cashRepaymentsForDebts
	 * 
	 * @param cashRepaymentsForDebts
	 *            偿还债务所支付的现金
	 */
	public void setCashRepaymentsForDebts(String cashRepaymentsForDebts) {
		CashRepaymentsForDebts = cashRepaymentsForDebts;
	}

	/**
	 * 获取 cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses
	 * 
	 * @return the
	 *         cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses
	 *         分配股利、利润或偿付利息所支付的现金
	 */
	public String getCashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses() {
		return CashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses;
	}

	/**
	 * 设置 cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses
	 * 
	 * @param cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses
	 *            分配股利、利润或偿付利息所支付的现金
	 */
	public void setCashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses(
			String cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses) {
		CashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses = cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses;
	}

	/**
	 * 获取 cashPaymentsRelatedToOtherFinancingActivities
	 * 
	 * @return the cashPaymentsRelatedToOtherFinancingActivities 支付的其他与筹资活动有关的现金
	 */
	public String getCashPaymentsRelatedToOtherFinancingActivities() {
		return CashPaymentsRelatedToOtherFinancingActivities;
	}

	/**
	 * 设置 cashPaymentsRelatedToOtherFinancingActivities
	 * 
	 * @param cashPaymentsRelatedToOtherFinancingActivities
	 *            支付的其他与筹资活动有关的现金
	 */
	public void setCashPaymentsRelatedToOtherFinancingActivities(
			String cashPaymentsRelatedToOtherFinancingActivities) {
		CashPaymentsRelatedToOtherFinancingActivities = cashPaymentsRelatedToOtherFinancingActivities;
	}

	/**
	 * 获取 totalCashOutflowsFromFinancingActivities
	 * 
	 * @return the totalCashOutflowsFromFinancingActivities 筹资活动现金流出小计
	 */
	public String getTotalCashOutflowsFromFinancingActivities() {
		return TotalCashOutflowsFromFinancingActivities;
	}

	/**
	 * 设置 totalCashOutflowsFromFinancingActivities
	 * 
	 * @param totalCashOutflowsFromFinancingActivities
	 *            筹资活动现金流出小计
	 */
	public void setTotalCashOutflowsFromFinancingActivities(
			String totalCashOutflowsFromFinancingActivities) {
		TotalCashOutflowsFromFinancingActivities = totalCashOutflowsFromFinancingActivities;
	}

	/**
	 * 获取 netCashFlowsFromFinancingActivities
	 * 
	 * @return the netCashFlowsFromFinancingActivities 筹集活动产生的现金流量净额
	 */
	public String getNetCashFlowsFromFinancingActivities() {
		return NetCashFlowsFromFinancingActivities;
	}

	/**
	 * 设置 netCashFlowsFromFinancingActivities
	 * 
	 * @param netCashFlowsFromFinancingActivities
	 *            筹集活动产生的现金流量净额
	 */
	public void setNetCashFlowsFromFinancingActivities(
			String netCashFlowsFromFinancingActivities) {
		NetCashFlowsFromFinancingActivities = netCashFlowsFromFinancingActivities;
	}

	/**
	 * 获取 effectOfExchangRateChangesOnCash
	 * 
	 * @return the effectOfExchangRateChangesOnCash 汇率变动对现金的影响
	 */
	public String getEffectOfExchangRateChangesOnCash() {
		return EffectOfExchangRateChangesOnCash;
	}

	/**
	 * 设置 effectOfExchangRateChangesOnCash
	 * 
	 * @param effectOfExchangRateChangesOnCash
	 *            汇率变动对现金的影响
	 */
	public void setEffectOfExchangRateChangesOnCash(
			String effectOfExchangRateChangesOnCash) {
		EffectOfExchangRateChangesOnCash = effectOfExchangRateChangesOnCash;
	}

	/**
	 * 获取 netIncreaseInCashAndCashEquivalents
	 * 
	 * @return the netIncreaseInCashAndCashEquivalents 现金及现金等价物净增加额
	 */
	public String getNetIncreaseInCashAndCashEquivalents() {
		return NetIncreaseInCashAndCashEquivalents;
	}

	/**
	 * 设置 netIncreaseInCashAndCashEquivalents
	 * 
	 * @param netIncreaseInCashAndCashEquivalents
	 *            现金及现金等价物净增加额
	 */
	public void setNetIncreaseInCashAndCashEquivalents(
			String netIncreaseInCashAndCashEquivalents) {
		NetIncreaseInCashAndCashEquivalents = netIncreaseInCashAndCashEquivalents;
	}

	/**
	 * 获取 netProfit
	 * 
	 * @return the netProfit 净利润
	 */
	public String getNetProfit() {
		return NetProfit;
	}

	/**
	 * 设置 netProfit
	 * 
	 * @param netProfit
	 *            净利润
	 */
	public void setNetProfit(String netProfit) {
		NetProfit = netProfit;
	}

	/**
	 * 获取 provisionForAssets
	 * 
	 * @return the provisionForAssets 计提的资产减值准备
	 */
	public String getProvisionForAssets() {
		return ProvisionForAssets;
	}

	/**
	 * 设置 provisionForAssets
	 * 
	 * @param provisionForAssets
	 *            计提的资产减值准备
	 */
	public void setProvisionForAssets(String provisionForAssets) {
		ProvisionForAssets = provisionForAssets;
	}

	/**
	 * 获取 depreciationOfFixedAssets
	 * 
	 * @return the depreciationOfFixedAssets 固定资产拆旧
	 */
	public String getDepreciationOfFixedAssets() {
		return DepreciationOfFixedAssets;
	}

	/**
	 * 设置 depreciationOfFixedAssets
	 * 
	 * @param depreciationOfFixedAssets
	 *            固定资产拆旧
	 */
	public void setDepreciationOfFixedAssets(String depreciationOfFixedAssets) {
		DepreciationOfFixedAssets = depreciationOfFixedAssets;
	}

	/**
	 * 获取 amortisationOfIntangibleAssets
	 * 
	 * @return the amortisationOfIntangibleAssets 无形资产摊销
	 */
	public String getAmortisationOfIntangibleAssets() {
		return AmortisationOfIntangibleAssets;
	}

	/**
	 * 设置 amortisationOfIntangibleAssets
	 * 
	 * @param amortisationOfIntangibleAssets
	 *            无形资产摊销
	 */
	public void setAmortisationOfIntangibleAssets(
			String amortisationOfIntangibleAssets) {
		AmortisationOfIntangibleAssets = amortisationOfIntangibleAssets;
	}

	/**
	 * 获取 longTermDeferredExpensesAmortization
	 * 
	 * @return the longTermDeferredExpensesAmortization 长期待摊费用摊销
	 */
	public String getLongTermDeferredExpensesAmortization() {
		return LongTermDeferredExpensesAmortization;
	}

	/**
	 * 设置 longTermDeferredExpensesAmortization
	 * 
	 * @param longTermDeferredExpensesAmortization
	 *            长期待摊费用摊销
	 */
	public void setLongTermDeferredExpensesAmortization(
			String longTermDeferredExpensesAmortization) {
		LongTermDeferredExpensesAmortization = longTermDeferredExpensesAmortization;
	}

	/**
	 * 获取 decreaseOfDefferedExpenses
	 * 
	 * @return the decreaseOfDefferedExpenses 待摊费用减少
	 */
	public String getDecreaseOfDefferedExpenses() {
		return DecreaseOfDefferedExpenses;
	}

	/**
	 * 设置 decreaseOfDefferedExpenses
	 * 
	 * @param decreaseOfDefferedExpenses
	 *            待摊费用减少
	 */
	public void setDecreaseOfDefferedExpenses(String decreaseOfDefferedExpenses) {
		DecreaseOfDefferedExpenses = decreaseOfDefferedExpenses;
	}

	/**
	 * 获取 additionOfAccuedExpense
	 * 
	 * @return the additionOfAccuedExpense 预提费用增加
	 */
	public String getAdditionOfAccuedExpense() {
		return AdditionOfAccuedExpense;
	}

	/**
	 * 设置 additionOfAccuedExpense
	 * 
	 * @param additionOfAccuedExpense
	 *            预提费用增加
	 */
	public void setAdditionOfAccuedExpense(String additionOfAccuedExpense) {
		AdditionOfAccuedExpense = additionOfAccuedExpense;
	}

	/**
	 * 获取 lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 * 
	 * @return the
	 *         lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 *         处置固定资产无形资产和其他长期资产的损失
	 */
	public String getLossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets() {
		return LossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	}

	/**
	 * 设置 lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 * 
	 * @param lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 *            处置固定资产无形资产和其他长期资产的损失
	 */
	public void setLossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets(
			String lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets) {
		LossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets = lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	}

	/**
	 * 获取 lossesOnScrappingOfFixedAssets
	 * 
	 * @return the lossesOnScrappingOfFixedAssets 固定资产报废损失
	 */
	public String getLossesOnScrappingOfFixedAssets() {
		return LossesOnScrappingOfFixedAssets;
	}

	/**
	 * 设置 lossesOnScrappingOfFixedAssets
	 * 
	 * @param lossesOnScrappingOfFixedAssets
	 *            固定资产报废损失
	 */
	public void setLossesOnScrappingOfFixedAssets(
			String lossesOnScrappingOfFixedAssets) {
		LossesOnScrappingOfFixedAssets = lossesOnScrappingOfFixedAssets;
	}

	/**
	 * 获取 financeExpense
	 * 
	 * @return the financeExpense 财务费用
	 */
	public String getFinanceExpense() {
		return FinanceExpense;
	}

	/**
	 * 设置 financeExpense
	 * 
	 * @param financeExpense
	 *            财务费用
	 */
	public void setFinanceExpense(String financeExpense) {
		FinanceExpense = financeExpense;
	}

	/**
	 * 获取 lossesArsingFromInvestment
	 * 
	 * @return the lossesArsingFromInvestment 投资损失
	 */
	public String getLossesArsingFromInvestment() {
		return LossesArsingFromInvestment;
	}

	/**
	 * 设置 lossesArsingFromInvestment
	 * 
	 * @param lossesArsingFromInvestment
	 *            投资损失
	 */
	public void setLossesArsingFromInvestment(String lossesArsingFromInvestment) {
		LossesArsingFromInvestment = lossesArsingFromInvestment;
	}

	/**
	 * 获取 deferredTaxCredit
	 * 
	 * @return the deferredTaxCredit 递延税款贷项
	 */
	public String getDeferredTaxCredit() {
		return DeferredTaxCredit;
	}

	/**
	 * 设置 deferredTaxCredit
	 * 
	 * @param deferredTaxCredit
	 *            递延税款贷项
	 */
	public void setDeferredTaxCredit(String deferredTaxCredit) {
		DeferredTaxCredit = deferredTaxCredit;
	}

	/**
	 * 获取 decreaseInInventories
	 * 
	 * @return the decreaseInInventories 存货的减少
	 */
	public String getDecreaseInInventories() {
		return DecreaseInInventories;
	}

	/**
	 * 设置 decreaseInInventories
	 * 
	 * @param decreaseInInventories
	 *            存货的减少
	 */
	public void setDecreaseInInventories(String decreaseInInventories) {
		DecreaseInInventories = decreaseInInventories;
	}

	/**
	 * 获取 decreaseInOperatingReceivables
	 * 
	 * @return the decreaseInOperatingReceivables 经营性应收项目的减少
	 */
	public String getDecreaseInOperatingReceivables() {
		return DecreaseInOperatingReceivables;
	}

	/**
	 * 设置 decreaseInOperatingReceivables
	 * 
	 * @param decreaseInOperatingReceivables
	 *            经营性应收项目的减少
	 */
	public void setDecreaseInOperatingReceivables(
			String decreaseInOperatingReceivables) {
		DecreaseInOperatingReceivables = decreaseInOperatingReceivables;
	}

	/**
	 * 获取 increaseInOperatingReceivables
	 * 
	 * @return the increaseInOperatingReceivables 经营性应付项目的增加
	 */
	public String getIncreaseInOperatingReceivables() {
		return IncreaseInOperatingReceivables;
	}

	/**
	 * 设置 increaseInOperatingReceivables
	 * 
	 * @param increaseInOperatingReceivables
	 *            经营性应付项目的增加
	 */
	public void setIncreaseInOperatingReceivables(
			String increaseInOperatingReceivables) {
		IncreaseInOperatingReceivables = increaseInOperatingReceivables;
	}

	/**
	 * 获取 others
	 * 
	 * @return the others （净利润调节为经营活动现金流量科目下）其他
	 */
	public String getOthers() {
		return Others;
	}

	/**
	 * 设置 others
	 * 
	 * @param others
	 *            （净利润调节为经营活动现金流量科目下）其他
	 */
	public void setOthers(String others) {
		Others = others;
	}

	/**
	 * 获取 netCashFlowsFromOperatingActivitiesMi
	 * 
	 * @return the netCashFlowsFromOperatingActivitiesMi 经营活动产生的现金流量净额
	 */
	public String getNetCashFlowsFromOperatingActivitiesMi() {
		return NetCashFlowsFromOperatingActivitiesMi;
	}

	/**
	 * 设置 netCashFlowsFromOperatingActivitiesMi
	 * 
	 * @param netCashFlowsFromOperatingActivitiesMi
	 *            经营活动产生的现金流量净额
	 */
	public void setNetCashFlowsFromOperatingActivitiesMi(
			String netCashFlowsFromOperatingActivitiesMi) {
		NetCashFlowsFromOperatingActivitiesMi = netCashFlowsFromOperatingActivitiesMi;
	}

	/**
	 * 获取 debtsTransferToCapital
	 * 
	 * @return the debtsTransferToCapital 债务转为资本
	 */
	public String getDebtsTransferToCapital() {
		return DebtsTransferToCapital;
	}

	/**
	 * 设置 debtsTransferToCapital
	 * 
	 * @param debtsTransferToCapital
	 *            债务转为资本
	 */
	public void setDebtsTransferToCapital(String debtsTransferToCapital) {
		DebtsTransferToCapital = debtsTransferToCapital;
	}

	/**
	 * 获取 oneYearDueConvertibleBonds
	 * 
	 * @return the oneYearDueConvertibleBonds 一年内到期的可转换公司债券
	 */
	public String getOneYearDueConvertibleBonds() {
		return OneYearDueConvertibleBonds;
	}

	/**
	 * 设置 oneYearDueConvertibleBonds
	 * 
	 * @param oneYearDueConvertibleBonds
	 *            一年内到期的可转换公司债券
	 */
	public void setOneYearDueConvertibleBonds(String oneYearDueConvertibleBonds) {
		OneYearDueConvertibleBonds = oneYearDueConvertibleBonds;
	}

	/**
	 * 获取 financingRentToTheFixedAsset
	 * 
	 * @return the financingRentToTheFixedAsset 融资租入固定资产
	 */
	public String getFinancingRentToTheFixedAsset() {
		return FinancingRentToTheFixedAsset;
	}

	/**
	 * 设置 financingRentToTheFixedAsset
	 * 
	 * @param financingRentToTheFixedAsset
	 *            融资租入固定资产
	 */
	public void setFinancingRentToTheFixedAsset(
			String financingRentToTheFixedAsset) {
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
	 * 
	 * @return the cashAtTheEndOfPeriod 现金的期末余额
	 */
	public String getCashAtTheEndOfPeriod() {
		return CashAtTheEndOfPeriod;
	}

	/**
	 * 设置 cashAtTheEndOfPeriod
	 * 
	 * @param cashAtTheEndOfPeriod
	 *            现金的期末余额
	 */
	public void setCashAtTheEndOfPeriod(String cashAtTheEndOfPeriod) {
		CashAtTheEndOfPeriod = cashAtTheEndOfPeriod;
	}

	/**
	 * 获取 cashAtTheBeginningOfThePeriod
	 * 
	 * @return the cashAtTheBeginningOfThePeriod 现金的期初余额
	 */
	public String getCashAtTheBeginningOfThePeriod() {
		return CashAtTheBeginningOfThePeriod;
	}

	/**
	 * 设置 cashAtTheBeginningOfThePeriod
	 * 
	 * @param cashAtTheBeginningOfThePeriod
	 *            现金的期初余额
	 */
	public void setCashAtTheBeginningOfThePeriod(
			String cashAtTheBeginningOfThePeriod) {
		CashAtTheBeginningOfThePeriod = cashAtTheBeginningOfThePeriod;
	}

	/**
	 * 获取 cashEquivalentsAtTheEndOfThePeriod
	 * 
	 * @return the cashEquivalentsAtTheEndOfThePeriod 现金等价物的期末余额
	 */
	public String getCashEquivalentsAtTheEndOfThePeriod() {
		return CashEquivalentsAtTheEndOfThePeriod;
	}

	/**
	 * 设置 cashEquivalentsAtTheEndOfThePeriod
	 * 
	 * @param cashEquivalentsAtTheEndOfThePeriod
	 *            现金等价物的期末余额
	 */
	public void setCashEquivalentsAtTheEndOfThePeriod(
			String cashEquivalentsAtTheEndOfThePeriod) {
		CashEquivalentsAtTheEndOfThePeriod = cashEquivalentsAtTheEndOfThePeriod;
	}

	/**
	 * 获取 cashRquivalentsAtTheBeginningOfThePeriod
	 * 
	 * @return the cashRquivalentsAtTheBeginningOfThePeriod 现金等价物的期初余额
	 */
	public String getCashRquivalentsAtTheBeginningOfThePeriod() {
		return CashRquivalentsAtTheBeginningOfThePeriod;
	}

	/**
	 * 设置 cashRquivalentsAtTheBeginningOfThePeriod
	 * 
	 * @param cashRquivalentsAtTheBeginningOfThePeriod
	 *            现金等价物的期初余额
	 */
	public void setCashRquivalentsAtTheBeginningOfThePeriod(
			String cashRquivalentsAtTheBeginningOfThePeriod) {
		CashRquivalentsAtTheBeginningOfThePeriod = cashRquivalentsAtTheBeginningOfThePeriod;
	}

	/**
	 * 获取 netIncreaseInCashAndCashEquivalentsMi
	 * 
	 * @return the netIncreaseInCashAndCashEquivalentsMi 现金及现金等价物净增加额
	 */
	public String getNetIncreaseInCashAndCashEquivalentsMi() {
		return NetIncreaseInCashAndCashEquivalentsMi;
	}

	/**
	 * 设置 netIncreaseInCashAndCashEquivalentsMi
	 * 
	 * @param netIncreaseInCashAndCashEquivalentsMi
	 *            现金及现金等价物净增加额
	 */
	public void setNetIncreaseInCashAndCashEquivalentsMi(
			String netIncreaseInCashAndCashEquivalentsMi) {
		NetIncreaseInCashAndCashEquivalentsMi = netIncreaseInCashAndCashEquivalentsMi;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CashFlows2002Sgmt [AdditionOfAccuedExpense="
				+ AdditionOfAccuedExpense
				+ ", AmortisationOfIntangibleAssets="
				+ AmortisationOfIntangibleAssets
				+ ", CashAtTheBeginningOfThePeriod="
				+ CashAtTheBeginningOfThePeriod
				+ ", CashAtTheEndOfPeriod="
				+ CashAtTheEndOfPeriod
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
				+ ", CashRquivalentsAtTheBeginningOfThePeriod="
				+ CashRquivalentsAtTheBeginningOfThePeriod
				+ ", DebtsTransferToCapital="
				+ DebtsTransferToCapital
				+ ", DecreaseInInventories="
				+ DecreaseInInventories
				+ ", DecreaseInOperatingReceivables="
				+ DecreaseInOperatingReceivables
				+ ", DecreaseOfDefferedExpenses="
				+ DecreaseOfDefferedExpenses
				+ ", DeferredTaxCredit="
				+ DeferredTaxCredit
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
				+ ", LongTermDeferredExpensesAmortization="
				+ LongTermDeferredExpensesAmortization
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
				+ PaymentsOfAllTypesOfTaxes + ", ProvisionForAssets="
				+ ProvisionForAssets + ", TaxRefunds=" + TaxRefunds
				+ ", TotalCashInflowsFromFinancingActivities="
				+ TotalCashInflowsFromFinancingActivities
				+ ", TotalCashInflowsFromInvestingActivities="
				+ TotalCashInflowsFromInvestingActivities
				+ ", TotalCashInflowsFromOperatingActivities="
				+ TotalCashInflowsFromOperatingActivities
				+ ", TotalCashOutflowsFromFinancingActivities="
				+ TotalCashOutflowsFromFinancingActivities
				+ ", TotalCashOutflowsFromInvestingActivities="
				+ TotalCashOutflowsFromInvestingActivities
				+ ", TotalCashOutflowsFromOperatingActivities="
				+ TotalCashOutflowsFromOperatingActivities + "]";
	}
}
