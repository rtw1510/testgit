package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: IncomeStatementProfitAppropriation2007Sgmt<br/>
 * Description:2007���������������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
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
	 *Ӫҵ����
	 */
	@XmlElement
	private String RevenueOfSales; 
	/**
	 *Ӫҵ�ɱ�
	 */
	@XmlElement
	private String CostOfSales; 
	/**
	 *Ӫҵ˰�𼰸���
	 */
	@XmlElement
	private String BusinessAndOtherTaxes; 
	/**
	 *���۷���
	 */
	@XmlElement
	private String SellingExpenses; 
	/**
	 *�������
	 */
	@XmlElement
	private String GeneralAndAdministrativeExpenses; 
	/**
	 *�������
	 */
	@XmlElement
	private String FinancialExpense; 
	/**
	 *�ʲ���ֵ��ʧ
	 */
	@XmlElement
	private String ImpairmentLossOfAssets; 
	/**
	 *���ʼ�ֵ�䶯������
	 */
	@XmlElement
	private String ProfitOrLossArisingFromChangesInFairValue; 
	/**
	 *Ͷ�ʾ�����
	 */
	@XmlElement
	private String InvestmentIncome; 
	/**
	 *����Ӫ��ҵ�ͺ�Ӫ��ҵ��Ͷ������
	 */
	@XmlElement
	private String InvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise; 
	/**
	 *Ӫҵ����
	 */
	@XmlElement
	private String OperatingProfits; 
	/**
	 *Ӫҵ������
	 */
	@XmlElement
	private String NonOperatingIncome; 
	/**
	 *Ӫҵ��֧��
	 */
	@XmlElement
	private String NonOperatingExpenses; 
	/**
	 *�������ʲ���ʧ�����У��������ʲ�������ʧ��
	 */
	@XmlElement
	private String NonCurrentAssets; 
	/**
	 *�����ܶ�
	 */
	@XmlElement
	private String ProfitBeforeTax; 
	/**
	 *����˰����
	 */
	@XmlElement
	private String IncomeTaxExpense; 
	/**
	 *������
	 */
	@XmlElement
	private String NetProfit; 
	/**
	 *����ÿ������
	 */
	@XmlElement
	private String BasicEarningsPerShare; 
	/**
	 *ϡ��ÿ������
	 */
	@XmlElement
	private String DilutedEarningsPerShare; 

	public IncomeStatementProfitAppropriation2007Sgmt() {
		super();
	}

	/**
	 * ��ȡ revenueOfSales
	 * 
	 * @return the revenueOfSales Ӫҵ����
	 */
	public String getRevenueOfSales() {
		return RevenueOfSales;
	}

	/**
	 * ���� revenueOfSales
	 * 
	 * @param revenueOfSales
	 *            Ӫҵ����
	 */
	public void setRevenueOfSales(String revenueOfSales) {
		RevenueOfSales = revenueOfSales;
	}

	/**
	 * ��ȡ costOfSales
	 * 
	 * @return the costOfSales Ӫҵ�ɱ�
	 */
	public String getCostOfSales() {
		return CostOfSales;
	}

	/**
	 * ���� costOfSales
	 * 
	 * @param costOfSales
	 *            Ӫҵ�ɱ�
	 */
	public void setCostOfSales(String costOfSales) {
		CostOfSales = costOfSales;
	}

	/**
	 * ��ȡ businessAndOtherTaxes
	 * 
	 * @return the businessAndOtherTaxes Ӫҵ˰�𼰸���
	 */
	public String getBusinessAndOtherTaxes() {
		return BusinessAndOtherTaxes;
	}

	/**
	 * ���� businessAndOtherTaxes
	 * 
	 * @param businessAndOtherTaxes
	 *            Ӫҵ˰�𼰸���
	 */
	public void setBusinessAndOtherTaxes(String businessAndOtherTaxes) {
		BusinessAndOtherTaxes = businessAndOtherTaxes;
	}

	/**
	 * ��ȡ sellingExpenses
	 * 
	 * @return the sellingExpenses ���۷���
	 */
	public String getSellingExpenses() {
		return SellingExpenses;
	}

	/**
	 * ���� sellingExpenses
	 * 
	 * @param sellingExpenses
	 *            ���۷���
	 */
	public void setSellingExpenses(String sellingExpenses) {
		SellingExpenses = sellingExpenses;
	}

	/**
	 * ��ȡ generalAndAdministrativeExpenses
	 * 
	 * @return the generalAndAdministrativeExpenses �������
	 */
	public String getGeneralAndAdministrativeExpenses() {
		return GeneralAndAdministrativeExpenses;
	}

	/**
	 * ���� generalAndAdministrativeExpenses
	 * 
	 * @param generalAndAdministrativeExpenses
	 *            �������
	 */
	public void setGeneralAndAdministrativeExpenses(
			String generalAndAdministrativeExpenses) {
		GeneralAndAdministrativeExpenses = generalAndAdministrativeExpenses;
	}

	/**
	 * ��ȡ financialExpense
	 * 
	 * @return the financialExpense �������
	 */
	public String getFinancialExpense() {
		return FinancialExpense;
	}

	/**
	 * ���� financialExpense
	 * 
	 * @param financialExpense
	 *            �������
	 */
	public void setFinancialExpense(String financialExpense) {
		FinancialExpense = financialExpense;
	}

	/**
	 * ��ȡ impairmentLossOfAssets
	 * 
	 * @return the impairmentLossOfAssets �ʲ���ֵ��ʧ
	 */
	public String getImpairmentLossOfAssets() {
		return ImpairmentLossOfAssets;
	}

	/**
	 * ���� impairmentLossOfAssets
	 * 
	 * @param impairmentLossOfAssets
	 *            �ʲ���ֵ��ʧ
	 */
	public void setImpairmentLossOfAssets(String impairmentLossOfAssets) {
		ImpairmentLossOfAssets = impairmentLossOfAssets;
	}

	/**
	 * ��ȡ profitOrLossArisingFromChangesInFairValue
	 * 
	 * @return the profitOrLossArisingFromChangesInFairValue ���ʼ�ֵ�䶯������
	 */
	public String getProfitOrLossArisingFromChangesInFairValue() {
		return ProfitOrLossArisingFromChangesInFairValue;
	}

	/**
	 * ���� profitOrLossArisingFromChangesInFairValue
	 * 
	 * @param profitOrLossArisingFromChangesInFairValue
	 *            ���ʼ�ֵ�䶯������
	 */
	public void setProfitOrLossArisingFromChangesInFairValue(
			String profitOrLossArisingFromChangesInFairValue) {
		ProfitOrLossArisingFromChangesInFairValue = profitOrLossArisingFromChangesInFairValue;
	}

	/**
	 * ��ȡ investmentIncome
	 * 
	 * @return the investmentIncome Ͷ�ʾ�����
	 */
	public String getInvestmentIncome() {
		return InvestmentIncome;
	}

	/**
	 * ���� investmentIncome
	 * 
	 * @param investmentIncome
	 *            Ͷ�ʾ�����
	 */
	public void setInvestmentIncome(String investmentIncome) {
		InvestmentIncome = investmentIncome;
	}

	/**
	 * ��ȡ investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise
	 * 
	 * @return the
	 *         investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise
	 *         ����Ӫ��ҵ�ͺ�Ӫ��ҵ��Ͷ������
	 */
	public String getInvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise() {
		return InvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise;
	}

	/**
	 * ���� investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise
	 * 
	 * @param investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise
	 *            ����Ӫ��ҵ�ͺ�Ӫ��ҵ��Ͷ������
	 */
	public void setInvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise(
			String investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise) {
		InvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise = investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise;
	}

	/**
	 * ��ȡ operatingProfits
	 * 
	 * @return the operatingProfits Ӫҵ����
	 */
	public String getOperatingProfits() {
		return OperatingProfits;
	}

	/**
	 * ���� operatingProfits
	 * 
	 * @param operatingProfits
	 *            Ӫҵ����
	 */
	public void setOperatingProfits(String operatingProfits) {
		OperatingProfits = operatingProfits;
	}

	/**
	 * ��ȡ nonOperatingIncome
	 * 
	 * @return the nonOperatingIncome Ӫҵ������
	 */
	public String getNonOperatingIncome() {
		return NonOperatingIncome;
	}

	/**
	 * ���� nonOperatingIncome
	 * 
	 * @param nonOperatingIncome
	 *            Ӫҵ������
	 */
	public void setNonOperatingIncome(String nonOperatingIncome) {
		NonOperatingIncome = nonOperatingIncome;
	}

	/**
	 * ��ȡ nonOperatingExpenses
	 * 
	 * @return the nonOperatingExpenses Ӫҵ��֧��
	 */
	public String getNonOperatingExpenses() {
		return NonOperatingExpenses;
	}

	/**
	 * ���� nonOperatingExpenses
	 * 
	 * @param nonOperatingExpenses
	 *            Ӫҵ��֧��
	 */
	public void setNonOperatingExpenses(String nonOperatingExpenses) {
		NonOperatingExpenses = nonOperatingExpenses;
	}

	/**
	 * ��ȡ nonCurrentAssets
	 * 
	 * @return the nonCurrentAssets �������ʲ���ʧ�����У��������ʲ�������ʧ��
	 */
	public String getNonCurrentAssets() {
		return NonCurrentAssets;
	}

	/**
	 * ���� nonCurrentAssets
	 * 
	 * @param nonCurrentAssets
	 *            �������ʲ���ʧ�����У��������ʲ�������ʧ��
	 */
	public void setNonCurrentAssets(String nonCurrentAssets) {
		NonCurrentAssets = nonCurrentAssets;
	}

	/**
	 * ��ȡ profitBeforeTax
	 * 
	 * @return the profitBeforeTax �����ܶ�
	 */
	public String getProfitBeforeTax() {
		return ProfitBeforeTax;
	}

	/**
	 * ���� profitBeforeTax
	 * 
	 * @param profitBeforeTax
	 *            �����ܶ�
	 */
	public void setProfitBeforeTax(String profitBeforeTax) {
		ProfitBeforeTax = profitBeforeTax;
	}

	/**
	 * ��ȡ incomeTaxExpense
	 * 
	 * @return the incomeTaxExpense ����˰����
	 */
	public String getIncomeTaxExpense() {
		return IncomeTaxExpense;
	}

	/**
	 * ���� incomeTaxExpense
	 * 
	 * @param incomeTaxExpense
	 *            ����˰����
	 */
	public void setIncomeTaxExpense(String incomeTaxExpense) {
		IncomeTaxExpense = incomeTaxExpense;
	}

	/**
	 * ��ȡ netProfit
	 * 
	 * @return the netProfit ������
	 */
	public String getNetProfit() {
		return NetProfit;
	}

	/**
	 * ���� netProfit
	 * 
	 * @param netProfit
	 *            ������
	 */
	public void setNetProfit(String netProfit) {
		NetProfit = netProfit;
	}

	/**
	 * ��ȡ basicEarningsPerShare
	 * 
	 * @return the basicEarningsPerShare ����ÿ������
	 */
	public String getBasicEarningsPerShare() {
		return BasicEarningsPerShare;
	}

	/**
	 * ���� basicEarningsPerShare
	 * 
	 * @param basicEarningsPerShare
	 *            ����ÿ������
	 */
	public void setBasicEarningsPerShare(String basicEarningsPerShare) {
		BasicEarningsPerShare = basicEarningsPerShare;
	}

	/**
	 * ��ȡ dilutedEarningsPerShare
	 * 
	 * @return the dilutedEarningsPerShare ϡ��ÿ������
	 */
	public String getDilutedEarningsPerShare() {
		return DilutedEarningsPerShare;
	}

	/**
	 * ���� dilutedEarningsPerShare
	 * 
	 * @param dilutedEarningsPerShare
	 *            ϡ��ÿ������
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
