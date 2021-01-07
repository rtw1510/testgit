package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: IncomeAndExpenseStatementSgmt<br/>
 * Description:事业单位收入支出表段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "CurrentFinancialSubsidyCarriedOverBalance",
		"FinancialSubsidyRevenue",
		"UndertakingsExpenditureFinancialSubsidyExpenditure",
		"CurrentUndertakingsCarriedOverBalance", "UndertakingsClassRevenue",
		"UndertakingsRevenue", "SuperiorSubsidyRevenue",
		"RevenueTurnedOverBySubsidiaryUnit", "OtherRevenue", "DonationIncome",
		"UndertakingsClassExpenditure",
		"UndertakingsExpenditureNonFinancialSubsidyExpenditure",
		"PaymentToTheHigherAuthority", "GrantToTheAuxiliaryOrganization",
		"OtherExpenditure", "CurrentOperatingBalance", "OperatingRevenue",
		"OperatingExpenditure",
		"OperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss",
		"NonFinancialSubsidyCarriedOverBalanceThisYear",
		"NonFinancialAidCarriedOver", "NonFinancialAidBalanceThisYear",
		"EnterpriseIncomeTaxPayable", "SpecialFundsToExtract",
		"PublicFundTurnedInto" },namespace = "com.dhcc.xml.ent.entity.finance")
// 指定序列成的xml节点顺序
public class IncomeAndExpenseStatementSgmt {
	/**
	 *本期财政补助结转结余
	 */
	@XmlElement
	private String CurrentFinancialSubsidyCarriedOverBalance;
	/**
	 *财政补助收入
	 */
	@XmlElement
	private String FinancialSubsidyRevenue;
	/**
	 *事业支出（财政补助支出）
	 */
	@XmlElement
	private String UndertakingsExpenditureFinancialSubsidyExpenditure;
	/**
	 *本期事业结转结余
	 */
	@XmlElement
	private String CurrentUndertakingsCarriedOverBalance;
	/**
	 *事业类收入
	 */
	@XmlElement
	private String UndertakingsClassRevenue;
	/**
	 *事业收入
	 */
	@XmlElement
	private String UndertakingsRevenue;
	/**
	 *上级补助收入
	 */
	@XmlElement
	private String SuperiorSubsidyRevenue;
	/**
	 *附属单位上缴收入
	 */
	@XmlElement
	private String RevenueTurnedOverBySubsidiaryUnit;
	/**
	 *其他收入
	 */
	@XmlElement
	private String OtherRevenue;
	/**
	 *（其他收入科目下）捐赠收入
	 */
	@XmlElement
	private String DonationIncome;
	/**
	 *事业类支出
	 */
	@XmlElement
	private String UndertakingsClassExpenditure;
	/**
	 *事业支出（非财政补助支出）
	 */
	@XmlElement
	private String UndertakingsExpenditureNonFinancialSubsidyExpenditure;
	/**
	 *上缴上级支出
	 */
	@XmlElement
	private String PaymentToTheHigherAuthority;
	/**
	 *对附属单位补助支出
	 */
	@XmlElement
	private String GrantToTheAuxiliaryOrganization;
	/**
	 *其他支出
	 */
	@XmlElement
	private String OtherExpenditure;
	/**
	 *本期经营结余
	 */
	@XmlElement
	private String CurrentOperatingBalance;
	/**
	 *经营收入
	 */
	@XmlElement
	private String OperatingRevenue;
	/**
	 *经营支出
	 */
	@XmlElement
	private String OperatingExpenditure;
	/**
	 *弥补以前年度亏损后的经营结余
	 */
	@XmlElement
	private String OperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss;
	/**
	 *本年非财政补助结转结余
	 */
	@XmlElement
	private String NonFinancialSubsidyCarriedOverBalanceThisYear;
	/**
	 *非财政补助结转
	 */
	@XmlElement
	private String NonFinancialAidCarriedOver;
	/**
	 *本年非财政补助结余
	 */
	@XmlElement
	private String NonFinancialAidBalanceThisYear;
	/**
	 *应缴企业所得税
	 */
	@XmlElement
	private String EnterpriseIncomeTaxPayable;
	/**
	 *提取专用基金
	 */
	@XmlElement
	private String SpecialFundsToExtract;
	/**
	 *转入事业基金
	 */
	@XmlElement
	private String PublicFundTurnedInto;

	public IncomeAndExpenseStatementSgmt() {
		super();
	}

	/**
	 * 获取 currentFinancialSubsidyCarriedOverBalance
	 * 
	 * @return the currentFinancialSubsidyCarriedOverBalance 本期财政补助结转结余
	 */
	public String getCurrentFinancialSubsidyCarriedOverBalance() {
		return CurrentFinancialSubsidyCarriedOverBalance;
	}

	/**
	 * 设置 currentFinancialSubsidyCarriedOverBalance
	 * 
	 * @param currentFinancialSubsidyCarriedOverBalance
	 *            本期财政补助结转结余
	 */
	public void setCurrentFinancialSubsidyCarriedOverBalance(
			String currentFinancialSubsidyCarriedOverBalance) {
		CurrentFinancialSubsidyCarriedOverBalance = currentFinancialSubsidyCarriedOverBalance;
	}

	/**
	 * 获取 financialSubsidyRevenue
	 * 
	 * @return the financialSubsidyRevenue 财政补助收入
	 */
	public String getFinancialSubsidyRevenue() {
		return FinancialSubsidyRevenue;
	}

	/**
	 * 设置 financialSubsidyRevenue
	 * 
	 * @param financialSubsidyRevenue
	 *            财政补助收入
	 */
	public void setFinancialSubsidyRevenue(String financialSubsidyRevenue) {
		FinancialSubsidyRevenue = financialSubsidyRevenue;
	}

	/**
	 * 获取 undertakingsExpenditureFinancialSubsidyExpenditure
	 * 
	 * @return the undertakingsExpenditureFinancialSubsidyExpenditure
	 *         事业支出（财政补助支出）
	 */
	public String getUndertakingsExpenditureFinancialSubsidyExpenditure() {
		return UndertakingsExpenditureFinancialSubsidyExpenditure;
	}

	/**
	 * 设置 undertakingsExpenditureFinancialSubsidyExpenditure
	 * 
	 * @param undertakingsExpenditureFinancialSubsidyExpenditure
	 *            事业支出（财政补助支出）
	 */
	public void setUndertakingsExpenditureFinancialSubsidyExpenditure(
			String undertakingsExpenditureFinancialSubsidyExpenditure) {
		UndertakingsExpenditureFinancialSubsidyExpenditure = undertakingsExpenditureFinancialSubsidyExpenditure;
	}

	/**
	 * 获取 currentUndertakingsCarriedOverBalance
	 * 
	 * @return the currentUndertakingsCarriedOverBalance 本期事业结转结余
	 */
	public String getCurrentUndertakingsCarriedOverBalance() {
		return CurrentUndertakingsCarriedOverBalance;
	}

	/**
	 * 设置 currentUndertakingsCarriedOverBalance
	 * 
	 * @param currentUndertakingsCarriedOverBalance
	 *            本期事业结转结余
	 */
	public void setCurrentUndertakingsCarriedOverBalance(
			String currentUndertakingsCarriedOverBalance) {
		CurrentUndertakingsCarriedOverBalance = currentUndertakingsCarriedOverBalance;
	}

	/**
	 * 获取 undertakingsClassRevenue
	 * 
	 * @return the undertakingsClassRevenue 事业类收入
	 */
	public String getUndertakingsClassRevenue() {
		return UndertakingsClassRevenue;
	}

	/**
	 * 设置 undertakingsClassRevenue
	 * 
	 * @param undertakingsClassRevenue
	 *            事业类收入
	 */
	public void setUndertakingsClassRevenue(String undertakingsClassRevenue) {
		UndertakingsClassRevenue = undertakingsClassRevenue;
	}

	/**
	 * 获取 undertakingsRevenue
	 * 
	 * @return the undertakingsRevenue 事业收入
	 */
	public String getUndertakingsRevenue() {
		return UndertakingsRevenue;
	}

	/**
	 * 设置 undertakingsRevenue
	 * 
	 * @param undertakingsRevenue
	 *            事业收入
	 */
	public void setUndertakingsRevenue(String undertakingsRevenue) {
		UndertakingsRevenue = undertakingsRevenue;
	}

	/**
	 * 获取 superiorSubsidyRevenue
	 * 
	 * @return the superiorSubsidyRevenue 上级补助收入
	 */
	public String getSuperiorSubsidyRevenue() {
		return SuperiorSubsidyRevenue;
	}

	/**
	 * 设置 superiorSubsidyRevenue
	 * 
	 * @param superiorSubsidyRevenue
	 *            上级补助收入
	 */
	public void setSuperiorSubsidyRevenue(String superiorSubsidyRevenue) {
		SuperiorSubsidyRevenue = superiorSubsidyRevenue;
	}

	/**
	 * 获取 revenueTurnedOverBySubsidiaryUnit
	 * 
	 * @return the revenueTurnedOverBySubsidiaryUnit 附属单位上缴收入
	 */
	public String getRevenueTurnedOverBySubsidiaryUnit() {
		return RevenueTurnedOverBySubsidiaryUnit;
	}

	/**
	 * 设置 revenueTurnedOverBySubsidiaryUnit
	 * 
	 * @param revenueTurnedOverBySubsidiaryUnit
	 *            附属单位上缴收入
	 */
	public void setRevenueTurnedOverBySubsidiaryUnit(
			String revenueTurnedOverBySubsidiaryUnit) {
		RevenueTurnedOverBySubsidiaryUnit = revenueTurnedOverBySubsidiaryUnit;
	}

	/**
	 * 获取 otherRevenue
	 * 
	 * @return the otherRevenue 其他收入
	 */
	public String getOtherRevenue() {
		return OtherRevenue;
	}

	/**
	 * 设置 otherRevenue
	 * 
	 * @param otherRevenue
	 *            其他收入
	 */
	public void setOtherRevenue(String otherRevenue) {
		OtherRevenue = otherRevenue;
	}

	/**
	 * 获取 donationIncome
	 * 
	 * @return the donationIncome （其他收入科目下）捐赠收入
	 */
	public String getDonationIncome() {
		return DonationIncome;
	}

	/**
	 * 设置 donationIncome
	 * 
	 * @param donationIncome
	 *            （其他收入科目下）捐赠收入
	 */
	public void setDonationIncome(String donationIncome) {
		DonationIncome = donationIncome;
	}

	/**
	 * 获取 undertakingsClassExpenditure
	 * 
	 * @return the undertakingsClassExpenditure 事业类支出
	 */
	public String getUndertakingsClassExpenditure() {
		return UndertakingsClassExpenditure;
	}

	/**
	 * 设置 undertakingsClassExpenditure
	 * 
	 * @param undertakingsClassExpenditure
	 *            事业类支出
	 */
	public void setUndertakingsClassExpenditure(
			String undertakingsClassExpenditure) {
		UndertakingsClassExpenditure = undertakingsClassExpenditure;
	}

	/**
	 * 获取 undertakingsExpenditureNonFinancialSubsidyExpenditure
	 * 
	 * @return the undertakingsExpenditureNonFinancialSubsidyExpenditure
	 *         事业支出（非财政补助支出）
	 */
	public String getUndertakingsExpenditureNonFinancialSubsidyExpenditure() {
		return UndertakingsExpenditureNonFinancialSubsidyExpenditure;
	}

	/**
	 * 设置 undertakingsExpenditureNonFinancialSubsidyExpenditure
	 * 
	 * @param undertakingsExpenditureNonFinancialSubsidyExpenditure
	 *            事业支出（非财政补助支出）
	 */
	public void setUndertakingsExpenditureNonFinancialSubsidyExpenditure(
			String undertakingsExpenditureNonFinancialSubsidyExpenditure) {
		UndertakingsExpenditureNonFinancialSubsidyExpenditure = undertakingsExpenditureNonFinancialSubsidyExpenditure;
	}

	/**
	 * 获取 paymentToTheHigherAuthority
	 * 
	 * @return the paymentToTheHigherAuthority 上缴上级支出
	 */
	public String getPaymentToTheHigherAuthority() {
		return PaymentToTheHigherAuthority;
	}

	/**
	 * 设置 paymentToTheHigherAuthority
	 * 
	 * @param paymentToTheHigherAuthority
	 *            上缴上级支出
	 */
	public void setPaymentToTheHigherAuthority(
			String paymentToTheHigherAuthority) {
		PaymentToTheHigherAuthority = paymentToTheHigherAuthority;
	}

	/**
	 * 获取 grantToTheAuxiliaryOrganization
	 * 
	 * @return the grantToTheAuxiliaryOrganization 对附属单位补助支出
	 */
	public String getGrantToTheAuxiliaryOrganization() {
		return GrantToTheAuxiliaryOrganization;
	}

	/**
	 * 设置 grantToTheAuxiliaryOrganization
	 * 
	 * @param grantToTheAuxiliaryOrganization
	 *            对附属单位补助支出
	 */
	public void setGrantToTheAuxiliaryOrganization(
			String grantToTheAuxiliaryOrganization) {
		GrantToTheAuxiliaryOrganization = grantToTheAuxiliaryOrganization;
	}

	/**
	 * 获取 otherExpenditure
	 * 
	 * @return the otherExpenditure 其他支出
	 */
	public String getOtherExpenditure() {
		return OtherExpenditure;
	}

	/**
	 * 设置 otherExpenditure
	 * 
	 * @param otherExpenditure
	 *            其他支出
	 */
	public void setOtherExpenditure(String otherExpenditure) {
		OtherExpenditure = otherExpenditure;
	}

	/**
	 * 获取 currentOperatingBalance
	 * 
	 * @return the currentOperatingBalance 本期经营结余
	 */
	public String getCurrentOperatingBalance() {
		return CurrentOperatingBalance;
	}

	/**
	 * 设置 currentOperatingBalance
	 * 
	 * @param currentOperatingBalance
	 *            本期经营结余
	 */
	public void setCurrentOperatingBalance(String currentOperatingBalance) {
		CurrentOperatingBalance = currentOperatingBalance;
	}

	/**
	 * 获取 operatingRevenue
	 * 
	 * @return the operatingRevenue 经营收入
	 */
	public String getOperatingRevenue() {
		return OperatingRevenue;
	}

	/**
	 * 设置 operatingRevenue
	 * 
	 * @param operatingRevenue
	 *            经营收入
	 */
	public void setOperatingRevenue(String operatingRevenue) {
		OperatingRevenue = operatingRevenue;
	}

	/**
	 * 获取 operatingExpenditure
	 * 
	 * @return the operatingExpenditure 经营支出
	 */
	public String getOperatingExpenditure() {
		return OperatingExpenditure;
	}

	/**
	 * 设置 operatingExpenditure
	 * 
	 * @param operatingExpenditure
	 *            经营支出
	 */
	public void setOperatingExpenditure(String operatingExpenditure) {
		OperatingExpenditure = operatingExpenditure;
	}

	/**
	 * 获取 operatingBalanceMadeUpForOfThePreviousYearsOperatingLoss
	 * 
	 * @return the operatingBalanceMadeUpForOfThePreviousYearsOperatingLoss
	 *         弥补以前年度亏损后的经营结余
	 */
	public String getOperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss() {
		return OperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss;
	}

	/**
	 * 设置 operatingBalanceMadeUpForOfThePreviousYearsOperatingLoss
	 * 
	 * @param operatingBalanceMadeUpForOfThePreviousYearsOperatingLoss
	 *            弥补以前年度亏损后的经营结余
	 */
	public void setOperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss(
			String operatingBalanceMadeUpForOfThePreviousYearsOperatingLoss) {
		OperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss = operatingBalanceMadeUpForOfThePreviousYearsOperatingLoss;
	}

	/**
	 * 获取 nonFinancialSubsidyCarriedOverBalanceThisYear
	 * 
	 * @return the nonFinancialSubsidyCarriedOverBalanceThisYear 本年非财政补助结转结余
	 */
	public String getNonFinancialSubsidyCarriedOverBalanceThisYear() {
		return NonFinancialSubsidyCarriedOverBalanceThisYear;
	}

	/**
	 * 设置 nonFinancialSubsidyCarriedOverBalanceThisYear
	 * 
	 * @param nonFinancialSubsidyCarriedOverBalanceThisYear
	 *            本年非财政补助结转结余
	 */
	public void setNonFinancialSubsidyCarriedOverBalanceThisYear(
			String nonFinancialSubsidyCarriedOverBalanceThisYear) {
		NonFinancialSubsidyCarriedOverBalanceThisYear = nonFinancialSubsidyCarriedOverBalanceThisYear;
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
	 * 获取 nonFinancialAidBalanceThisYear
	 * 
	 * @return the nonFinancialAidBalanceThisYear 本年非财政补助结余
	 */
	public String getNonFinancialAidBalanceThisYear() {
		return NonFinancialAidBalanceThisYear;
	}

	/**
	 * 设置 nonFinancialAidBalanceThisYear
	 * 
	 * @param nonFinancialAidBalanceThisYear
	 *            本年非财政补助结余
	 */
	public void setNonFinancialAidBalanceThisYear(
			String nonFinancialAidBalanceThisYear) {
		NonFinancialAidBalanceThisYear = nonFinancialAidBalanceThisYear;
	}

	/**
	 * 获取 enterpriseIncomeTaxPayable
	 * 
	 * @return the enterpriseIncomeTaxPayable 应缴企业所得税
	 */
	public String getEnterpriseIncomeTaxPayable() {
		return EnterpriseIncomeTaxPayable;
	}

	/**
	 * 设置 enterpriseIncomeTaxPayable
	 * 
	 * @param enterpriseIncomeTaxPayable
	 *            应缴企业所得税
	 */
	public void setEnterpriseIncomeTaxPayable(String enterpriseIncomeTaxPayable) {
		EnterpriseIncomeTaxPayable = enterpriseIncomeTaxPayable;
	}

	/**
	 * 获取 specialFundsToExtract
	 * 
	 * @return the specialFundsToExtract 提取专用基金
	 */
	public String getSpecialFundsToExtract() {
		return SpecialFundsToExtract;
	}

	/**
	 * 设置 specialFundsToExtract
	 * 
	 * @param specialFundsToExtract
	 *            提取专用基金
	 */
	public void setSpecialFundsToExtract(String specialFundsToExtract) {
		SpecialFundsToExtract = specialFundsToExtract;
	}

	/**
	 * 获取 publicFundTurnedInto
	 * 
	 * @return the publicFundTurnedInto 转入事业基金
	 */
	public String getPublicFundTurnedInto() {
		return PublicFundTurnedInto;
	}

	/**
	 * 设置 publicFundTurnedInto
	 * 
	 * @param publicFundTurnedInto
	 *            转入事业基金
	 */
	public void setPublicFundTurnedInto(String publicFundTurnedInto) {
		PublicFundTurnedInto = publicFundTurnedInto;
	}

	@Override
	public String toString() {
		return "CurrentFinancialSubsidyCarriedOverBalance ["
				+ "CurrentFinancialSubsidyCarriedOverBalance="
				+ CurrentFinancialSubsidyCarriedOverBalance
				+ "FinancialSubsidyRevenue="
				+ FinancialSubsidyRevenue
				+ "UndertakingsExpenditureFinancialSubsidyExpenditure="
				+ UndertakingsExpenditureFinancialSubsidyExpenditure
				+ "CurrentUndertakingsCarriedOverBalance="
				+ CurrentUndertakingsCarriedOverBalance
				+ "UndertakingsClassRevenue="
				+ UndertakingsClassRevenue
				+ "UndertakingsRevenue="
				+ UndertakingsRevenue
				+ "SuperiorSubsidyRevenue="
				+ SuperiorSubsidyRevenue
				+ "RevenueTurnedOverBySubsidiaryUnit ="
				+ RevenueTurnedOverBySubsidiaryUnit
				+ "OtherRevenue="
				+ OtherRevenue
				+ "DonationIncome="
				+ DonationIncome
				+ "UndertakingsClassExpenditure="
				+ UndertakingsClassExpenditure
				+ "UndertakingsExpenditureNonFinancialSubsidyExpenditure="
				+ UndertakingsExpenditureNonFinancialSubsidyExpenditure
				+ "PaymentToTheHigherAuthority="
				+ PaymentToTheHigherAuthority
				+ "GrantToTheAuxiliaryOrganization="
				+ GrantToTheAuxiliaryOrganization
				+ "OtherExpenditure="
				+ OtherExpenditure
				+ "CurrentOperatingBalance="
				+ CurrentOperatingBalance
				+ "OperatingRevenue="
				+ OperatingRevenue
				+ "OperatingExpenditure="
				+ OperatingExpenditure
				+ "OperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss="
				+ OperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss
				+ "NonFinancialSubsidyCarriedOverBalanceThisYear="
				+ NonFinancialSubsidyCarriedOverBalanceThisYear
				+ "NonFinancialAidCarriedOver="
				+ NonFinancialAidCarriedOver
				+ "NonFinancialAidBalanceThisYear="
				+ NonFinancialAidBalanceThisYear
				+ "EnterpriseIncomeTaxPayable="
				+ EnterpriseIncomeTaxPayable
				+ "SpecialFundsToExtract="
				+ SpecialFundsToExtract
				+ "PublicFundTurnedInto" + PublicFundTurnedInto + "]";
	}
}
