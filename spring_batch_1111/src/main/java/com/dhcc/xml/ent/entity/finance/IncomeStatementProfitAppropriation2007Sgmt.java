package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: IncomeStatementProfitAppropriation2007Sgmt<br/>
 * Description:2007版利润及利润分配表段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = {
		"RevenueOfSales", "CostOfSales",
		"BusinessAndOtherTaxes", "SellingExpenses",
		"GeneralAndAdministrativeExpenses", "FinancialExpense",
		"ImpairmentLossOfAssets", "ProfitOrLossArisingFromChangesInFairValue",
		"InvestmentIncome",
		"InvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise",
		"OperatingProfits", "NonOperatingIncome", "NonOperatingExpenses",
		"NonCurrentAssets", "ProfitBeforeTax", "IncomeTaxExpense", "NetProfit",
		"BasicEarningsPerShare", "DilutedEarningsPerShare" },namespace = "com.dhcc.xml.ent.entity.finance")
public class IncomeStatementProfitAppropriation2007Sgmt {
	/**
	 *营业收入
	 */
	@XmlElement
	private String RevenueOfSales; 
	/**
	 *营业成本
	 */
	@XmlElement
	private String CostOfSales; 
	/**
	 *营业税金及附加
	 */
	@XmlElement
	private String BusinessAndOtherTaxes; 
	/**
	 *销售费用
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
	private String FinancialExpense; 
	/**
	 *资产减值损失
	 */
	@XmlElement
	private String ImpairmentLossOfAssets; 
	/**
	 *公允价值变动净收益
	 */
	@XmlElement
	private String ProfitOrLossArisingFromChangesInFairValue; 
	/**
	 *投资净收益
	 */
	@XmlElement
	private String InvestmentIncome; 
	/**
	 *对联营企业和合营企业的投资收益
	 */
	@XmlElement
	private String InvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise; 
	/**
	 *营业利润
	 */
	@XmlElement
	private String OperatingProfits; 
	/**
	 *营业外收入
	 */
	@XmlElement
	private String NonOperatingIncome; 
	/**
	 *营业外支出
	 */
	@XmlElement
	private String NonOperatingExpenses; 
	/**
	 *非流动资产损失（其中：非流动资产处置损失）
	 */
	@XmlElement
	private String NonCurrentAssets; 
	/**
	 *利润总额
	 */
	@XmlElement
	private String ProfitBeforeTax; 
	/**
	 *所得税费用
	 */
	@XmlElement
	private String IncomeTaxExpense; 
	/**
	 *净利润
	 */
	@XmlElement
	private String NetProfit; 
	/**
	 *基本每股收益
	 */
	@XmlElement
	private String BasicEarningsPerShare; 
	/**
	 *稀释每股收益
	 */
	@XmlElement
	private String DilutedEarningsPerShare; 

	public IncomeStatementProfitAppropriation2007Sgmt() {
		super();
	}

	/**
	 * 获取 revenueOfSales
	 * 
	 * @return the revenueOfSales 营业收入
	 */
	public String getRevenueOfSales() {
		return RevenueOfSales;
	}

	/**
	 * 设置 revenueOfSales
	 * 
	 * @param revenueOfSales
	 *            营业收入
	 */
	public void setRevenueOfSales(String revenueOfSales) {
		RevenueOfSales = revenueOfSales;
	}

	/**
	 * 获取 costOfSales
	 * 
	 * @return the costOfSales 营业成本
	 */
	public String getCostOfSales() {
		return CostOfSales;
	}

	/**
	 * 设置 costOfSales
	 * 
	 * @param costOfSales
	 *            营业成本
	 */
	public void setCostOfSales(String costOfSales) {
		CostOfSales = costOfSales;
	}

	/**
	 * 获取 businessAndOtherTaxes
	 * 
	 * @return the businessAndOtherTaxes 营业税金及附加
	 */
	public String getBusinessAndOtherTaxes() {
		return BusinessAndOtherTaxes;
	}

	/**
	 * 设置 businessAndOtherTaxes
	 * 
	 * @param businessAndOtherTaxes
	 *            营业税金及附加
	 */
	public void setBusinessAndOtherTaxes(String businessAndOtherTaxes) {
		BusinessAndOtherTaxes = businessAndOtherTaxes;
	}

	/**
	 * 获取 sellingExpenses
	 * 
	 * @return the sellingExpenses 销售费用
	 */
	public String getSellingExpenses() {
		return SellingExpenses;
	}

	/**
	 * 设置 sellingExpenses
	 * 
	 * @param sellingExpenses
	 *            销售费用
	 */
	public void setSellingExpenses(String sellingExpenses) {
		SellingExpenses = sellingExpenses;
	}

	/**
	 * 获取 generalAndAdministrativeExpenses
	 * 
	 * @return the generalAndAdministrativeExpenses 管理费用
	 */
	public String getGeneralAndAdministrativeExpenses() {
		return GeneralAndAdministrativeExpenses;
	}

	/**
	 * 设置 generalAndAdministrativeExpenses
	 * 
	 * @param generalAndAdministrativeExpenses
	 *            管理费用
	 */
	public void setGeneralAndAdministrativeExpenses(
			String generalAndAdministrativeExpenses) {
		GeneralAndAdministrativeExpenses = generalAndAdministrativeExpenses;
	}

	/**
	 * 获取 financialExpense
	 * 
	 * @return the financialExpense 财务费用
	 */
	public String getFinancialExpense() {
		return FinancialExpense;
	}

	/**
	 * 设置 financialExpense
	 * 
	 * @param financialExpense
	 *            财务费用
	 */
	public void setFinancialExpense(String financialExpense) {
		FinancialExpense = financialExpense;
	}

	/**
	 * 获取 impairmentLossOfAssets
	 * 
	 * @return the impairmentLossOfAssets 资产减值损失
	 */
	public String getImpairmentLossOfAssets() {
		return ImpairmentLossOfAssets;
	}

	/**
	 * 设置 impairmentLossOfAssets
	 * 
	 * @param impairmentLossOfAssets
	 *            资产减值损失
	 */
	public void setImpairmentLossOfAssets(String impairmentLossOfAssets) {
		ImpairmentLossOfAssets = impairmentLossOfAssets;
	}

	/**
	 * 获取 profitOrLossArisingFromChangesInFairValue
	 * 
	 * @return the profitOrLossArisingFromChangesInFairValue 公允价值变动净收益
	 */
	public String getProfitOrLossArisingFromChangesInFairValue() {
		return ProfitOrLossArisingFromChangesInFairValue;
	}

	/**
	 * 设置 profitOrLossArisingFromChangesInFairValue
	 * 
	 * @param profitOrLossArisingFromChangesInFairValue
	 *            公允价值变动净收益
	 */
	public void setProfitOrLossArisingFromChangesInFairValue(
			String profitOrLossArisingFromChangesInFairValue) {
		ProfitOrLossArisingFromChangesInFairValue = profitOrLossArisingFromChangesInFairValue;
	}

	/**
	 * 获取 investmentIncome
	 * 
	 * @return the investmentIncome 投资净收益
	 */
	public String getInvestmentIncome() {
		return InvestmentIncome;
	}

	/**
	 * 设置 investmentIncome
	 * 
	 * @param investmentIncome
	 *            投资净收益
	 */
	public void setInvestmentIncome(String investmentIncome) {
		InvestmentIncome = investmentIncome;
	}

	/**
	 * 获取 investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise
	 * 
	 * @return the
	 *         investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise
	 *         对联营企业和合营企业的投资收益
	 */
	public String getInvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise() {
		return InvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise;
	}

	/**
	 * 设置 investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise
	 * 
	 * @param investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise
	 *            对联营企业和合营企业的投资收益
	 */
	public void setInvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise(
			String investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise) {
		InvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise = investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise;
	}

	/**
	 * 获取 operatingProfits
	 * 
	 * @return the operatingProfits 营业利润
	 */
	public String getOperatingProfits() {
		return OperatingProfits;
	}

	/**
	 * 设置 operatingProfits
	 * 
	 * @param operatingProfits
	 *            营业利润
	 */
	public void setOperatingProfits(String operatingProfits) {
		OperatingProfits = operatingProfits;
	}

	/**
	 * 获取 nonOperatingIncome
	 * 
	 * @return the nonOperatingIncome 营业外收入
	 */
	public String getNonOperatingIncome() {
		return NonOperatingIncome;
	}

	/**
	 * 设置 nonOperatingIncome
	 * 
	 * @param nonOperatingIncome
	 *            营业外收入
	 */
	public void setNonOperatingIncome(String nonOperatingIncome) {
		NonOperatingIncome = nonOperatingIncome;
	}

	/**
	 * 获取 nonOperatingExpenses
	 * 
	 * @return the nonOperatingExpenses 营业外支出
	 */
	public String getNonOperatingExpenses() {
		return NonOperatingExpenses;
	}

	/**
	 * 设置 nonOperatingExpenses
	 * 
	 * @param nonOperatingExpenses
	 *            营业外支出
	 */
	public void setNonOperatingExpenses(String nonOperatingExpenses) {
		NonOperatingExpenses = nonOperatingExpenses;
	}

	/**
	 * 获取 nonCurrentAssets
	 * 
	 * @return the nonCurrentAssets 非流动资产损失（其中：非流动资产处置损失）
	 */
	public String getNonCurrentAssets() {
		return NonCurrentAssets;
	}

	/**
	 * 设置 nonCurrentAssets
	 * 
	 * @param nonCurrentAssets
	 *            非流动资产损失（其中：非流动资产处置损失）
	 */
	public void setNonCurrentAssets(String nonCurrentAssets) {
		NonCurrentAssets = nonCurrentAssets;
	}

	/**
	 * 获取 profitBeforeTax
	 * 
	 * @return the profitBeforeTax 利润总额
	 */
	public String getProfitBeforeTax() {
		return ProfitBeforeTax;
	}

	/**
	 * 设置 profitBeforeTax
	 * 
	 * @param profitBeforeTax
	 *            利润总额
	 */
	public void setProfitBeforeTax(String profitBeforeTax) {
		ProfitBeforeTax = profitBeforeTax;
	}

	/**
	 * 获取 incomeTaxExpense
	 * 
	 * @return the incomeTaxExpense 所得税费用
	 */
	public String getIncomeTaxExpense() {
		return IncomeTaxExpense;
	}

	/**
	 * 设置 incomeTaxExpense
	 * 
	 * @param incomeTaxExpense
	 *            所得税费用
	 */
	public void setIncomeTaxExpense(String incomeTaxExpense) {
		IncomeTaxExpense = incomeTaxExpense;
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
	 * 获取 basicEarningsPerShare
	 * 
	 * @return the basicEarningsPerShare 基本每股收益
	 */
	public String getBasicEarningsPerShare() {
		return BasicEarningsPerShare;
	}

	/**
	 * 设置 basicEarningsPerShare
	 * 
	 * @param basicEarningsPerShare
	 *            基本每股收益
	 */
	public void setBasicEarningsPerShare(String basicEarningsPerShare) {
		BasicEarningsPerShare = basicEarningsPerShare;
	}

	/**
	 * 获取 dilutedEarningsPerShare
	 * 
	 * @return the dilutedEarningsPerShare 稀释每股收益
	 */
	public String getDilutedEarningsPerShare() {
		return DilutedEarningsPerShare;
	}

	/**
	 * 设置 dilutedEarningsPerShare
	 * 
	 * @param dilutedEarningsPerShare
	 *            稀释每股收益
	 */
	public void setDilutedEarningsPerShare(String dilutedEarningsPerShare) {
		DilutedEarningsPerShare = dilutedEarningsPerShare;
	}
	@Override
	public String toString() {
		return "IncomeStatementProfitAppropriationSgmt2007 ["
				+ "RevenueOfSales="
				+ RevenueOfSales
				+ "CostOfSales="
				+ CostOfSales
				+ "BusinessAndOtherTaxes="
				+ BusinessAndOtherTaxes
				+ "SellingExpenses="
				+ SellingExpenses
				+ "GeneralAndAdministrativeExpenses="
				+ GeneralAndAdministrativeExpenses
				+ "FinancialExpense="
				+ FinancialExpense
				+ "ImpairmentLossOfAssets="
				+ ImpairmentLossOfAssets
				+ "ProfitOrLossArisingFromChangesInFairValue="
				+ ProfitOrLossArisingFromChangesInFairValue
				+ "InvestmentIncome="
				+ InvestmentIncome
				+ "InvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise="
				+ InvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise
				+ "OperatingProfits="
				+ OperatingProfits
				+ "NonOperatingIncome="
				+ NonOperatingIncome
				+ "NonOperating Expenses="
				+ NonOperatingExpenses
				+ "NonCurrentAssets="
				+ NonCurrentAssets
				+ "ProfitBeforeTax="
				+ ProfitBeforeTax
				+ "IncomeTaxExpense="
				+ IncomeTaxExpense
				+ "NetProfit="
				+ NetProfit
				+ "BasicEarningsPerShare="
				+ BasicEarningsPerShare
				+ "DilutedEarningsPerShare"
				+ DilutedEarningsPerShare + "]";
	}
}
