package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: IncomeAndExpenseStatementSgmt<br/>
 * Description:��ҵ��λ����֧�����<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
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
// ָ�����гɵ�xml�ڵ�˳��
public class IncomeAndExpenseStatementSgmt {
	/**
	 *���ڲ���������ת����
	 */
	@XmlElement
	private String CurrentFinancialSubsidyCarriedOverBalance;
	/**
	 *������������
	 */
	@XmlElement
	private String FinancialSubsidyRevenue;
	/**
	 *��ҵ֧������������֧����
	 */
	@XmlElement
	private String UndertakingsExpenditureFinancialSubsidyExpenditure;
	/**
	 *������ҵ��ת����
	 */
	@XmlElement
	private String CurrentUndertakingsCarriedOverBalance;
	/**
	 *��ҵ������
	 */
	@XmlElement
	private String UndertakingsClassRevenue;
	/**
	 *��ҵ����
	 */
	@XmlElement
	private String UndertakingsRevenue;
	/**
	 *�ϼ���������
	 */
	@XmlElement
	private String SuperiorSubsidyRevenue;
	/**
	 *������λ�Ͻ�����
	 */
	@XmlElement
	private String RevenueTurnedOverBySubsidiaryUnit;
	/**
	 *��������
	 */
	@XmlElement
	private String OtherRevenue;
	/**
	 *�����������Ŀ�£���������
	 */
	@XmlElement
	private String DonationIncome;
	/**
	 *��ҵ��֧��
	 */
	@XmlElement
	private String UndertakingsClassExpenditure;
	/**
	 *��ҵ֧�����ǲ�������֧����
	 */
	@XmlElement
	private String UndertakingsExpenditureNonFinancialSubsidyExpenditure;
	/**
	 *�Ͻ��ϼ�֧��
	 */
	@XmlElement
	private String PaymentToTheHigherAuthority;
	/**
	 *�Ը�����λ����֧��
	 */
	@XmlElement
	private String GrantToTheAuxiliaryOrganization;
	/**
	 *����֧��
	 */
	@XmlElement
	private String OtherExpenditure;
	/**
	 *���ھ�Ӫ����
	 */
	@XmlElement
	private String CurrentOperatingBalance;
	/**
	 *��Ӫ����
	 */
	@XmlElement
	private String OperatingRevenue;
	/**
	 *��Ӫ֧��
	 */
	@XmlElement
	private String OperatingExpenditure;
	/**
	 *�ֲ���ǰ��ȿ����ľ�Ӫ����
	 */
	@XmlElement
	private String OperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss;
	/**
	 *����ǲ���������ת����
	 */
	@XmlElement
	private String NonFinancialSubsidyCarriedOverBalanceThisYear;
	/**
	 *�ǲ���������ת
	 */
	@XmlElement
	private String NonFinancialAidCarriedOver;
	/**
	 *����ǲ�����������
	 */
	@XmlElement
	private String NonFinancialAidBalanceThisYear;
	/**
	 *Ӧ����ҵ����˰
	 */
	@XmlElement
	private String EnterpriseIncomeTaxPayable;
	/**
	 *��ȡר�û���
	 */
	@XmlElement
	private String SpecialFundsToExtract;
	/**
	 *ת����ҵ����
	 */
	@XmlElement
	private String PublicFundTurnedInto;

	public IncomeAndExpenseStatementSgmt() {
		super();
	}

	/**
	 * ��ȡ currentFinancialSubsidyCarriedOverBalance
	 * 
	 * @return the currentFinancialSubsidyCarriedOverBalance ���ڲ���������ת����
	 */
	public String getCurrentFinancialSubsidyCarriedOverBalance() {
		return CurrentFinancialSubsidyCarriedOverBalance;
	}

	/**
	 * ���� currentFinancialSubsidyCarriedOverBalance
	 * 
	 * @param currentFinancialSubsidyCarriedOverBalance
	 *            ���ڲ���������ת����
	 */
	public void setCurrentFinancialSubsidyCarriedOverBalance(
			String currentFinancialSubsidyCarriedOverBalance) {
		CurrentFinancialSubsidyCarriedOverBalance = currentFinancialSubsidyCarriedOverBalance;
	}

	/**
	 * ��ȡ financialSubsidyRevenue
	 * 
	 * @return the financialSubsidyRevenue ������������
	 */
	public String getFinancialSubsidyRevenue() {
		return FinancialSubsidyRevenue;
	}

	/**
	 * ���� financialSubsidyRevenue
	 * 
	 * @param financialSubsidyRevenue
	 *            ������������
	 */
	public void setFinancialSubsidyRevenue(String financialSubsidyRevenue) {
		FinancialSubsidyRevenue = financialSubsidyRevenue;
	}

	/**
	 * ��ȡ undertakingsExpenditureFinancialSubsidyExpenditure
	 * 
	 * @return the undertakingsExpenditureFinancialSubsidyExpenditure
	 *         ��ҵ֧������������֧����
	 */
	public String getUndertakingsExpenditureFinancialSubsidyExpenditure() {
		return UndertakingsExpenditureFinancialSubsidyExpenditure;
	}

	/**
	 * ���� undertakingsExpenditureFinancialSubsidyExpenditure
	 * 
	 * @param undertakingsExpenditureFinancialSubsidyExpenditure
	 *            ��ҵ֧������������֧����
	 */
	public void setUndertakingsExpenditureFinancialSubsidyExpenditure(
			String undertakingsExpenditureFinancialSubsidyExpenditure) {
		UndertakingsExpenditureFinancialSubsidyExpenditure = undertakingsExpenditureFinancialSubsidyExpenditure;
	}

	/**
	 * ��ȡ currentUndertakingsCarriedOverBalance
	 * 
	 * @return the currentUndertakingsCarriedOverBalance ������ҵ��ת����
	 */
	public String getCurrentUndertakingsCarriedOverBalance() {
		return CurrentUndertakingsCarriedOverBalance;
	}

	/**
	 * ���� currentUndertakingsCarriedOverBalance
	 * 
	 * @param currentUndertakingsCarriedOverBalance
	 *            ������ҵ��ת����
	 */
	public void setCurrentUndertakingsCarriedOverBalance(
			String currentUndertakingsCarriedOverBalance) {
		CurrentUndertakingsCarriedOverBalance = currentUndertakingsCarriedOverBalance;
	}

	/**
	 * ��ȡ undertakingsClassRevenue
	 * 
	 * @return the undertakingsClassRevenue ��ҵ������
	 */
	public String getUndertakingsClassRevenue() {
		return UndertakingsClassRevenue;
	}

	/**
	 * ���� undertakingsClassRevenue
	 * 
	 * @param undertakingsClassRevenue
	 *            ��ҵ������
	 */
	public void setUndertakingsClassRevenue(String undertakingsClassRevenue) {
		UndertakingsClassRevenue = undertakingsClassRevenue;
	}

	/**
	 * ��ȡ undertakingsRevenue
	 * 
	 * @return the undertakingsRevenue ��ҵ����
	 */
	public String getUndertakingsRevenue() {
		return UndertakingsRevenue;
	}

	/**
	 * ���� undertakingsRevenue
	 * 
	 * @param undertakingsRevenue
	 *            ��ҵ����
	 */
	public void setUndertakingsRevenue(String undertakingsRevenue) {
		UndertakingsRevenue = undertakingsRevenue;
	}

	/**
	 * ��ȡ superiorSubsidyRevenue
	 * 
	 * @return the superiorSubsidyRevenue �ϼ���������
	 */
	public String getSuperiorSubsidyRevenue() {
		return SuperiorSubsidyRevenue;
	}

	/**
	 * ���� superiorSubsidyRevenue
	 * 
	 * @param superiorSubsidyRevenue
	 *            �ϼ���������
	 */
	public void setSuperiorSubsidyRevenue(String superiorSubsidyRevenue) {
		SuperiorSubsidyRevenue = superiorSubsidyRevenue;
	}

	/**
	 * ��ȡ revenueTurnedOverBySubsidiaryUnit
	 * 
	 * @return the revenueTurnedOverBySubsidiaryUnit ������λ�Ͻ�����
	 */
	public String getRevenueTurnedOverBySubsidiaryUnit() {
		return RevenueTurnedOverBySubsidiaryUnit;
	}

	/**
	 * ���� revenueTurnedOverBySubsidiaryUnit
	 * 
	 * @param revenueTurnedOverBySubsidiaryUnit
	 *            ������λ�Ͻ�����
	 */
	public void setRevenueTurnedOverBySubsidiaryUnit(
			String revenueTurnedOverBySubsidiaryUnit) {
		RevenueTurnedOverBySubsidiaryUnit = revenueTurnedOverBySubsidiaryUnit;
	}

	/**
	 * ��ȡ otherRevenue
	 * 
	 * @return the otherRevenue ��������
	 */
	public String getOtherRevenue() {
		return OtherRevenue;
	}

	/**
	 * ���� otherRevenue
	 * 
	 * @param otherRevenue
	 *            ��������
	 */
	public void setOtherRevenue(String otherRevenue) {
		OtherRevenue = otherRevenue;
	}

	/**
	 * ��ȡ donationIncome
	 * 
	 * @return the donationIncome �����������Ŀ�£���������
	 */
	public String getDonationIncome() {
		return DonationIncome;
	}

	/**
	 * ���� donationIncome
	 * 
	 * @param donationIncome
	 *            �����������Ŀ�£���������
	 */
	public void setDonationIncome(String donationIncome) {
		DonationIncome = donationIncome;
	}

	/**
	 * ��ȡ undertakingsClassExpenditure
	 * 
	 * @return the undertakingsClassExpenditure ��ҵ��֧��
	 */
	public String getUndertakingsClassExpenditure() {
		return UndertakingsClassExpenditure;
	}

	/**
	 * ���� undertakingsClassExpenditure
	 * 
	 * @param undertakingsClassExpenditure
	 *            ��ҵ��֧��
	 */
	public void setUndertakingsClassExpenditure(
			String undertakingsClassExpenditure) {
		UndertakingsClassExpenditure = undertakingsClassExpenditure;
	}

	/**
	 * ��ȡ undertakingsExpenditureNonFinancialSubsidyExpenditure
	 * 
	 * @return the undertakingsExpenditureNonFinancialSubsidyExpenditure
	 *         ��ҵ֧�����ǲ�������֧����
	 */
	public String getUndertakingsExpenditureNonFinancialSubsidyExpenditure() {
		return UndertakingsExpenditureNonFinancialSubsidyExpenditure;
	}

	/**
	 * ���� undertakingsExpenditureNonFinancialSubsidyExpenditure
	 * 
	 * @param undertakingsExpenditureNonFinancialSubsidyExpenditure
	 *            ��ҵ֧�����ǲ�������֧����
	 */
	public void setUndertakingsExpenditureNonFinancialSubsidyExpenditure(
			String undertakingsExpenditureNonFinancialSubsidyExpenditure) {
		UndertakingsExpenditureNonFinancialSubsidyExpenditure = undertakingsExpenditureNonFinancialSubsidyExpenditure;
	}

	/**
	 * ��ȡ paymentToTheHigherAuthority
	 * 
	 * @return the paymentToTheHigherAuthority �Ͻ��ϼ�֧��
	 */
	public String getPaymentToTheHigherAuthority() {
		return PaymentToTheHigherAuthority;
	}

	/**
	 * ���� paymentToTheHigherAuthority
	 * 
	 * @param paymentToTheHigherAuthority
	 *            �Ͻ��ϼ�֧��
	 */
	public void setPaymentToTheHigherAuthority(
			String paymentToTheHigherAuthority) {
		PaymentToTheHigherAuthority = paymentToTheHigherAuthority;
	}

	/**
	 * ��ȡ grantToTheAuxiliaryOrganization
	 * 
	 * @return the grantToTheAuxiliaryOrganization �Ը�����λ����֧��
	 */
	public String getGrantToTheAuxiliaryOrganization() {
		return GrantToTheAuxiliaryOrganization;
	}

	/**
	 * ���� grantToTheAuxiliaryOrganization
	 * 
	 * @param grantToTheAuxiliaryOrganization
	 *            �Ը�����λ����֧��
	 */
	public void setGrantToTheAuxiliaryOrganization(
			String grantToTheAuxiliaryOrganization) {
		GrantToTheAuxiliaryOrganization = grantToTheAuxiliaryOrganization;
	}

	/**
	 * ��ȡ otherExpenditure
	 * 
	 * @return the otherExpenditure ����֧��
	 */
	public String getOtherExpenditure() {
		return OtherExpenditure;
	}

	/**
	 * ���� otherExpenditure
	 * 
	 * @param otherExpenditure
	 *            ����֧��
	 */
	public void setOtherExpenditure(String otherExpenditure) {
		OtherExpenditure = otherExpenditure;
	}

	/**
	 * ��ȡ currentOperatingBalance
	 * 
	 * @return the currentOperatingBalance ���ھ�Ӫ����
	 */
	public String getCurrentOperatingBalance() {
		return CurrentOperatingBalance;
	}

	/**
	 * ���� currentOperatingBalance
	 * 
	 * @param currentOperatingBalance
	 *            ���ھ�Ӫ����
	 */
	public void setCurrentOperatingBalance(String currentOperatingBalance) {
		CurrentOperatingBalance = currentOperatingBalance;
	}

	/**
	 * ��ȡ operatingRevenue
	 * 
	 * @return the operatingRevenue ��Ӫ����
	 */
	public String getOperatingRevenue() {
		return OperatingRevenue;
	}

	/**
	 * ���� operatingRevenue
	 * 
	 * @param operatingRevenue
	 *            ��Ӫ����
	 */
	public void setOperatingRevenue(String operatingRevenue) {
		OperatingRevenue = operatingRevenue;
	}

	/**
	 * ��ȡ operatingExpenditure
	 * 
	 * @return the operatingExpenditure ��Ӫ֧��
	 */
	public String getOperatingExpenditure() {
		return OperatingExpenditure;
	}

	/**
	 * ���� operatingExpenditure
	 * 
	 * @param operatingExpenditure
	 *            ��Ӫ֧��
	 */
	public void setOperatingExpenditure(String operatingExpenditure) {
		OperatingExpenditure = operatingExpenditure;
	}

	/**
	 * ��ȡ operatingBalanceMadeUpForOfThePreviousYearsOperatingLoss
	 * 
	 * @return the operatingBalanceMadeUpForOfThePreviousYearsOperatingLoss
	 *         �ֲ���ǰ��ȿ����ľ�Ӫ����
	 */
	public String getOperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss() {
		return OperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss;
	}

	/**
	 * ���� operatingBalanceMadeUpForOfThePreviousYearsOperatingLoss
	 * 
	 * @param operatingBalanceMadeUpForOfThePreviousYearsOperatingLoss
	 *            �ֲ���ǰ��ȿ����ľ�Ӫ����
	 */
	public void setOperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss(
			String operatingBalanceMadeUpForOfThePreviousYearsOperatingLoss) {
		OperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss = operatingBalanceMadeUpForOfThePreviousYearsOperatingLoss;
	}

	/**
	 * ��ȡ nonFinancialSubsidyCarriedOverBalanceThisYear
	 * 
	 * @return the nonFinancialSubsidyCarriedOverBalanceThisYear ����ǲ���������ת����
	 */
	public String getNonFinancialSubsidyCarriedOverBalanceThisYear() {
		return NonFinancialSubsidyCarriedOverBalanceThisYear;
	}

	/**
	 * ���� nonFinancialSubsidyCarriedOverBalanceThisYear
	 * 
	 * @param nonFinancialSubsidyCarriedOverBalanceThisYear
	 *            ����ǲ���������ת����
	 */
	public void setNonFinancialSubsidyCarriedOverBalanceThisYear(
			String nonFinancialSubsidyCarriedOverBalanceThisYear) {
		NonFinancialSubsidyCarriedOverBalanceThisYear = nonFinancialSubsidyCarriedOverBalanceThisYear;
	}

	/**
	 * ��ȡ nonFinancialAidCarriedOver
	 * 
	 * @return the nonFinancialAidCarriedOver �ǲ���������ת
	 */
	public String getNonFinancialAidCarriedOver() {
		return NonFinancialAidCarriedOver;
	}

	/**
	 * ���� nonFinancialAidCarriedOver
	 * 
	 * @param nonFinancialAidCarriedOver
	 *            �ǲ���������ת
	 */
	public void setNonFinancialAidCarriedOver(String nonFinancialAidCarriedOver) {
		NonFinancialAidCarriedOver = nonFinancialAidCarriedOver;
	}

	/**
	 * ��ȡ nonFinancialAidBalanceThisYear
	 * 
	 * @return the nonFinancialAidBalanceThisYear ����ǲ�����������
	 */
	public String getNonFinancialAidBalanceThisYear() {
		return NonFinancialAidBalanceThisYear;
	}

	/**
	 * ���� nonFinancialAidBalanceThisYear
	 * 
	 * @param nonFinancialAidBalanceThisYear
	 *            ����ǲ�����������
	 */
	public void setNonFinancialAidBalanceThisYear(
			String nonFinancialAidBalanceThisYear) {
		NonFinancialAidBalanceThisYear = nonFinancialAidBalanceThisYear;
	}

	/**
	 * ��ȡ enterpriseIncomeTaxPayable
	 * 
	 * @return the enterpriseIncomeTaxPayable Ӧ����ҵ����˰
	 */
	public String getEnterpriseIncomeTaxPayable() {
		return EnterpriseIncomeTaxPayable;
	}

	/**
	 * ���� enterpriseIncomeTaxPayable
	 * 
	 * @param enterpriseIncomeTaxPayable
	 *            Ӧ����ҵ����˰
	 */
	public void setEnterpriseIncomeTaxPayable(String enterpriseIncomeTaxPayable) {
		EnterpriseIncomeTaxPayable = enterpriseIncomeTaxPayable;
	}

	/**
	 * ��ȡ specialFundsToExtract
	 * 
	 * @return the specialFundsToExtract ��ȡר�û���
	 */
	public String getSpecialFundsToExtract() {
		return SpecialFundsToExtract;
	}

	/**
	 * ���� specialFundsToExtract
	 * 
	 * @param specialFundsToExtract
	 *            ��ȡר�û���
	 */
	public void setSpecialFundsToExtract(String specialFundsToExtract) {
		SpecialFundsToExtract = specialFundsToExtract;
	}

	/**
	 * ��ȡ publicFundTurnedInto
	 * 
	 * @return the publicFundTurnedInto ת����ҵ����
	 */
	public String getPublicFundTurnedInto() {
		return PublicFundTurnedInto;
	}

	/**
	 * ���� publicFundTurnedInto
	 * 
	 * @param publicFundTurnedInto
	 *            ת����ҵ����
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
