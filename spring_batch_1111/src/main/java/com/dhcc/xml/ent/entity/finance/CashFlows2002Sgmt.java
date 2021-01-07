package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

//NetCashFlowsFromOperatingA �˱�û�� �ظ��� NetCashFlowsFromOperatingActivities

/**
 * Title: CashFlows2002Sgmt<br/>
 * Description:��ҵ�ֽ�����������ɾ�������¼������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
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
	 * ������Ʒ���ṩ�����յ����ֽ�
	 */
	@XmlElement
	private String CashReceivedFromSalesOfGoodsOrRendingOfServices;
	/**
	 * �յ���˰�ѷ���
	 */
	@XmlElement
	private String TaxRefunds;
	/**
	 * �յ��������뾭Ӫ��йص��ֽ�
	 */
	@XmlElement
	private String OtherCashReceivedRelatingToOperatingActivities;
	/**
	 * ��Ӫ��ֽ�����С��
	 */
	@XmlElement
	private String TotalCashInflowsFromOperatingActivities;
	/**
	 * ������Ʒ����������֧�����ֽ�
	 */
	@XmlElement
	private String CashPaidForGoodsAndServices;
	/**
	 * ֧����ְ���Լ�Ϊְ��֧�����ֽ�
	 */
	@XmlElement
	private String CashPaidToAndOnBehalfOfEmployees;
	/**
	 * ֧���ĸ���˰��
	 */
	@XmlElement
	private String PaymentsOfAllTypesOfTaxes;
	/**
	 * ֧���������뾭Ӫ��йص��ֽ�
	 */
	@XmlElement
	private String OtherCashPaymentsFromOperatingActivities;
	/**
	 * ��Ӫ��ֽ�����С��
	 */
	@XmlElement
	private String TotalCashOutflowsFromOperatingActivities;
	/**
	 * ��Ӫ��������ֽ���������
	 */
	@XmlElement
	private String NetCashFlowsFromOperatingActivities;
	/**
	 * �ջ�Ͷ�����յ����ֽ�
	 */
	@XmlElement
	private String CashReceivedFromReturnOfInvestment;
	/**
	 * ȡ��Ͷ���������յ����ֽ�
	 */
	@XmlElement
	private String CashReceivedFromOnvestments;
	/**
	 * ���ù̶��ʲ������ʲ������������ʲ����ջص��ֽ𾻶�
	 */
	@XmlElement
	private String NetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	/**
	 * �յ���������Ͷ�ʻ�йص��ֽ�
	 */
	@XmlElement
	private String CashReceivedRelatingToOtherInvestingActivities;
	/**
	 * Ͷ�ʻ�ֽ�����С��
	 */
	@XmlElement
	private String TotalCashInflowsFromInvestingActivities;
	/**
	 * �����̶��ʲ������ʲ������������ʲ���֧�����ֽ�
	 */
	@XmlElement
	private String CashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents;
	/**
	 * Ͷ����֧�����ֽ�
	 */
	@XmlElement
	private String CashPaymentsForInvestments;
	/**
	 * ֧����������Ͷ�ʻ�йص��ֽ�
	 */
	@XmlElement
	private String CashPaymentsRelatedToOtherInvestingActivities;
	/**
	 * Ͷ�ʻ�ֽ�����С��
	 */
	@XmlElement
	private String TotalCashOutflowsFromInvestingActivities;
	/**
	 * Ͷ�ʻ�������ֽ���������
	 */
	@XmlElement
	private String NetCashFlowsFromInvestingActivities;
	/**
	 * ����Ͷ�����յ����ֽ�
	 */
	@XmlElement
	private String CashReceivedFromInvestors;
	/**
	 * ������յ����ֽ�
	 */
	@XmlElement
	private String CashFromBorrowings;
	/**
	 * �յ�����������ʻ�йص��ֽ�
	 */
	@XmlElement
	private String OtherCashReceivedRelatingToFinancingActivities;
	/**
	 * ���ʻ�ֽ�����С��
	 */
	@XmlElement
	private String TotalCashInflowsFromFinancingActivities;
	/**
	 * ����ծ����֧�����ֽ�
	 */
	@XmlElement
	private String CashRepaymentsForDebts;
	/**
	 * �������������򳥸���Ϣ��֧�����ֽ�
	 */
	@XmlElement
	private String CashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses;
	/**
	 * ֧������������ʻ�йص��ֽ�
	 */
	@XmlElement
	private String CashPaymentsRelatedToOtherFinancingActivities;
	/**
	 * ���ʻ�ֽ�����С��
	 */
	@XmlElement
	private String TotalCashOutflowsFromFinancingActivities;
	/**
	 * �Ｏ��������ֽ���������
	 */
	@XmlElement
	private String NetCashFlowsFromFinancingActivities;
	/**
	 * ���ʱ䶯���ֽ��Ӱ��
	 */
	@XmlElement
	private String EffectOfExchangRateChangesOnCash;
	/**
	 * �ֽ��ֽ�ȼ��ﾻ���Ӷ�
	 */
	@XmlElement
	private String NetIncreaseInCashAndCashEquivalents;
	/**
	 * ������
	 */
	@XmlElement
	private String NetProfit;
	/**
	 * ������ʲ���ֵ׼��
	 */
	@XmlElement
	private String ProvisionForAssets;
	/**
	 * �̶��ʲ����
	 */
	@XmlElement
	private String DepreciationOfFixedAssets;
	/**
	 * �����ʲ�̯��
	 */
	@XmlElement
	private String AmortisationOfIntangibleAssets;
	/**
	 * ���ڴ�̯����̯��
	 */
	@XmlElement
	private String LongTermDeferredExpensesAmortization;
	/**
	 * ��̯���ü���
	 */
	@XmlElement
	private String DecreaseOfDefferedExpenses;
	/**
	 * Ԥ���������
	 */
	@XmlElement
	private String AdditionOfAccuedExpense;
	/**
	 * ���ù̶��ʲ������ʲ������������ʲ�����ʧ
	 */
	@XmlElement
	private String LossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	/**
	 * �̶��ʲ�������ʧ
	 */
	@XmlElement
	private String LossesOnScrappingOfFixedAssets;
	/**
	 * �������
	 */
	@XmlElement
	private String FinanceExpense;
	/**
	 * Ͷ����ʧ
	 */
	@XmlElement
	private String LossesArsingFromInvestment;
	/**
	 * ����˰�����
	 */
	@XmlElement
	private String DeferredTaxCredit;
	/**
	 * ����ļ���
	 */
	@XmlElement
	private String DecreaseInInventories;
	/**
	 * ��Ӫ��Ӧ����Ŀ�ļ���
	 */
	@XmlElement
	private String DecreaseInOperatingReceivables;
	/**
	 * ��Ӫ��Ӧ����Ŀ������
	 */
	@XmlElement
	private String IncreaseInOperatingReceivables;
	/**
	 * �����������Ϊ��Ӫ��ֽ�������Ŀ�£�����
	 */
	@XmlElement
	private String Others;
	/**
	 * ��Ӫ��������ֽ���������
	 */
	@XmlElement
	private String NetCashFlowsFromOperatingActivitiesMi;
	/**
	 * ծ��תΪ�ʱ�
	 */
	@XmlElement
	private String DebtsTransferToCapital;
	/**
	 * һ���ڵ��ڵĿ�ת����˾ծȯ
	 */
	@XmlElement
	private String OneYearDueConvertibleBonds;
	/**
	 * ��������̶��ʲ�
	 */
	@XmlElement
	private String FinancingRentToTheFixedAsset;
	/**
	 * �����漰�ֽ���֧��Ͷ�ʺͳ��ʻ��Ŀ�£�����
	 */
	@XmlElement
	private String NonCashOthers;
	/**
	 * �ֽ����ĩ���
	 */
	@XmlElement
	private String CashAtTheEndOfPeriod;
	/**
	 * �ֽ���ڳ����
	 */
	@XmlElement
	private String CashAtTheBeginningOfThePeriod;
	/**
	 * �ֽ�ȼ������ĩ���
	 */
	@XmlElement
	private String CashEquivalentsAtTheEndOfThePeriod;
	/**
	 * �ֽ�ȼ�����ڳ����
	 */
	@XmlElement
	private String CashRquivalentsAtTheBeginningOfThePeriod;
	/**
	 * �ֽ��ֽ�ȼ��ﾻ���Ӷ�
	 */
	@XmlElement
	private String NetIncreaseInCashAndCashEquivalentsMi;

	public CashFlows2002Sgmt() {
		super();
	}

	/**
	 * ��ȡ cashReceivedFromSalesOfGoodsOrRendingOfServices
	 * 
	 * @return the cashReceivedFromSalesOfGoodsOrRendingOfServices
	 *         ������Ʒ���ṩ�����յ����ֽ�
	 */
	public String getCashReceivedFromSalesOfGoodsOrRendingOfServices() {
		return CashReceivedFromSalesOfGoodsOrRendingOfServices;
	}

	/**
	 * ���� cashReceivedFromSalesOfGoodsOrRendingOfServices
	 * 
	 * @param cashReceivedFromSalesOfGoodsOrRendingOfServices
	 *            ������Ʒ���ṩ�����յ����ֽ�
	 */
	public void setCashReceivedFromSalesOfGoodsOrRendingOfServices(
			String cashReceivedFromSalesOfGoodsOrRendingOfServices) {
		CashReceivedFromSalesOfGoodsOrRendingOfServices = cashReceivedFromSalesOfGoodsOrRendingOfServices;
	}

	/**
	 * ��ȡ taxRefunds
	 * 
	 * @return the taxRefunds �յ���˰�ѷ���
	 */
	public String getTaxRefunds() {
		return TaxRefunds;
	}

	/**
	 * ���� taxRefunds
	 * 
	 * @param taxRefunds
	 *            �յ���˰�ѷ���
	 */
	public void setTaxRefunds(String taxRefunds) {
		TaxRefunds = taxRefunds;
	}

	/**
	 * ��ȡ otherCashReceivedRelatingToOperatingActivities
	 * 
	 * @return the otherCashReceivedRelatingToOperatingActivities
	 *         �յ��������뾭Ӫ��йص��ֽ�
	 */
	public String getOtherCashReceivedRelatingToOperatingActivities() {
		return OtherCashReceivedRelatingToOperatingActivities;
	}

	/**
	 * ���� otherCashReceivedRelatingToOperatingActivities
	 * 
	 * @param otherCashReceivedRelatingToOperatingActivities
	 *            �յ��������뾭Ӫ��йص��ֽ�
	 */
	public void setOtherCashReceivedRelatingToOperatingActivities(
			String otherCashReceivedRelatingToOperatingActivities) {
		OtherCashReceivedRelatingToOperatingActivities = otherCashReceivedRelatingToOperatingActivities;
	}

	/**
	 * ��ȡ totalCashInflowsFromOperatingActivities
	 * 
	 * @return the totalCashInflowsFromOperatingActivities ��Ӫ��ֽ�����С��
	 */
	public String getTotalCashInflowsFromOperatingActivities() {
		return TotalCashInflowsFromOperatingActivities;
	}

	/**
	 * ���� totalCashInflowsFromOperatingActivities
	 * 
	 * @param totalCashInflowsFromOperatingActivities
	 *            ��Ӫ��ֽ�����С��
	 */
	public void setTotalCashInflowsFromOperatingActivities(
			String totalCashInflowsFromOperatingActivities) {
		TotalCashInflowsFromOperatingActivities = totalCashInflowsFromOperatingActivities;
	}

	/**
	 * ��ȡ cashPaidForGoodsAndServices
	 * 
	 * @return the cashPaidForGoodsAndServices ������Ʒ����������֧�����ֽ�
	 */
	public String getCashPaidForGoodsAndServices() {
		return CashPaidForGoodsAndServices;
	}

	/**
	 * ���� cashPaidForGoodsAndServices
	 * 
	 * @param cashPaidForGoodsAndServices
	 *            ������Ʒ����������֧�����ֽ�
	 */
	public void setCashPaidForGoodsAndServices(
			String cashPaidForGoodsAndServices) {
		CashPaidForGoodsAndServices = cashPaidForGoodsAndServices;
	}

	/**
	 * ��ȡ cashPaidToAndOnBehalfOfEmployees
	 * 
	 * @return the cashPaidToAndOnBehalfOfEmployees ֧����ְ���Լ�Ϊְ��֧�����ֽ�
	 */
	public String getCashPaidToAndOnBehalfOfEmployees() {
		return CashPaidToAndOnBehalfOfEmployees;
	}

	/**
	 * ���� cashPaidToAndOnBehalfOfEmployees
	 * 
	 * @param cashPaidToAndOnBehalfOfEmployees
	 *            ֧����ְ���Լ�Ϊְ��֧�����ֽ�
	 */
	public void setCashPaidToAndOnBehalfOfEmployees(
			String cashPaidToAndOnBehalfOfEmployees) {
		CashPaidToAndOnBehalfOfEmployees = cashPaidToAndOnBehalfOfEmployees;
	}

	/**
	 * ��ȡ paymentsOfAllTypesOfTaxes
	 * 
	 * @return the paymentsOfAllTypesOfTaxes ֧���ĸ���˰��
	 */
	public String getPaymentsOfAllTypesOfTaxes() {
		return PaymentsOfAllTypesOfTaxes;
	}

	/**
	 * ���� paymentsOfAllTypesOfTaxes
	 * 
	 * @param paymentsOfAllTypesOfTaxes
	 *            ֧���ĸ���˰��
	 */
	public void setPaymentsOfAllTypesOfTaxes(String paymentsOfAllTypesOfTaxes) {
		PaymentsOfAllTypesOfTaxes = paymentsOfAllTypesOfTaxes;
	}

	/**
	 * ��ȡ otherCashPaymentsFromOperatingActivities
	 * 
	 * @return the otherCashPaymentsFromOperatingActivities ֧���������뾭Ӫ��йص��ֽ�
	 */
	public String getOtherCashPaymentsFromOperatingActivities() {
		return OtherCashPaymentsFromOperatingActivities;
	}

	/**
	 * ���� otherCashPaymentsFromOperatingActivities
	 * 
	 * @param otherCashPaymentsFromOperatingActivities
	 *            ֧���������뾭Ӫ��йص��ֽ�
	 */
	public void setOtherCashPaymentsFromOperatingActivities(
			String otherCashPaymentsFromOperatingActivities) {
		OtherCashPaymentsFromOperatingActivities = otherCashPaymentsFromOperatingActivities;
	}

	/**
	 * ��ȡ totalCashOutflowsFromOperatingActivities
	 * 
	 * @return the totalCashOutflowsFromOperatingActivities ��Ӫ��ֽ�����С��
	 */
	public String getTotalCashOutflowsFromOperatingActivities() {
		return TotalCashOutflowsFromOperatingActivities;
	}

	/**
	 * ���� totalCashOutflowsFromOperatingActivities
	 * 
	 * @param totalCashOutflowsFromOperatingActivities
	 *            ��Ӫ��ֽ�����С��
	 */
	public void setTotalCashOutflowsFromOperatingActivities(
			String totalCashOutflowsFromOperatingActivities) {
		TotalCashOutflowsFromOperatingActivities = totalCashOutflowsFromOperatingActivities;
	}

	/**
	 * ��ȡ netCashFlowsFromOperatingActivities
	 * 
	 * @return the netCashFlowsFromOperatingActivities ��Ӫ��������ֽ���������
	 */
	public String getNetCashFlowsFromOperatingActivities() {
		return NetCashFlowsFromOperatingActivities;
	}

	/**
	 * ���� netCashFlowsFromOperatingActivities
	 * 
	 * @param netCashFlowsFromOperatingActivities
	 *            ��Ӫ��������ֽ���������
	 */
	public void setNetCashFlowsFromOperatingActivities(
			String netCashFlowsFromOperatingActivities) {
		NetCashFlowsFromOperatingActivities = netCashFlowsFromOperatingActivities;
	}

	/**
	 * ��ȡ cashReceivedFromReturnOfInvestment
	 * 
	 * @return the cashReceivedFromReturnOfInvestment �ջ�Ͷ�����յ����ֽ�
	 */
	public String getCashReceivedFromReturnOfInvestment() {
		return CashReceivedFromReturnOfInvestment;
	}

	/**
	 * ���� cashReceivedFromReturnOfInvestment
	 * 
	 * @param cashReceivedFromReturnOfInvestment
	 *            �ջ�Ͷ�����յ����ֽ�
	 */
	public void setCashReceivedFromReturnOfInvestment(
			String cashReceivedFromReturnOfInvestment) {
		CashReceivedFromReturnOfInvestment = cashReceivedFromReturnOfInvestment;
	}

	/**
	 * ��ȡ cashReceivedFromOnvestments
	 * 
	 * @return the cashReceivedFromOnvestments ȡ��Ͷ���������յ����ֽ�
	 */
	public String getCashReceivedFromOnvestments() {
		return CashReceivedFromOnvestments;
	}

	/**
	 * ���� cashReceivedFromOnvestments
	 * 
	 * @param cashReceivedFromOnvestments
	 *            ȡ��Ͷ���������յ����ֽ�
	 */
	public void setCashReceivedFromOnvestments(
			String cashReceivedFromOnvestments) {
		CashReceivedFromOnvestments = cashReceivedFromOnvestments;
	}

	/**
	 * ��ȡ
	 * netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 * 
	 * @return the
	 *         netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 *         ���ù̶��ʲ������ʲ������������ʲ����ջص��ֽ𾻶�
	 */
	public String getNetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets() {
		return NetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	}

	/**
	 * ����
	 * netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 * 
	 * @param netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 *            ���ù̶��ʲ������ʲ������������ʲ����ջص��ֽ𾻶�
	 */
	public void setNetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets(
			String netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets) {
		NetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets = netCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	}

	/**
	 * ��ȡ cashReceivedRelatingToOtherInvestingActivities
	 * 
	 * @return the cashReceivedRelatingToOtherInvestingActivities
	 *         �յ���������Ͷ�ʻ�йص��ֽ�
	 */
	public String getCashReceivedRelatingToOtherInvestingActivities() {
		return CashReceivedRelatingToOtherInvestingActivities;
	}

	/**
	 * ���� cashReceivedRelatingToOtherInvestingActivities
	 * 
	 * @param cashReceivedRelatingToOtherInvestingActivities
	 *            �յ���������Ͷ�ʻ�йص��ֽ�
	 */
	public void setCashReceivedRelatingToOtherInvestingActivities(
			String cashReceivedRelatingToOtherInvestingActivities) {
		CashReceivedRelatingToOtherInvestingActivities = cashReceivedRelatingToOtherInvestingActivities;
	}

	/**
	 * ��ȡ totalCashInflowsFromInvestingActivities
	 * 
	 * @return the totalCashInflowsFromInvestingActivities Ͷ�ʻ�ֽ�����С��
	 */
	public String getTotalCashInflowsFromInvestingActivities() {
		return TotalCashInflowsFromInvestingActivities;
	}

	/**
	 * ���� totalCashInflowsFromInvestingActivities
	 * 
	 * @param totalCashInflowsFromInvestingActivities
	 *            Ͷ�ʻ�ֽ�����С��
	 */
	public void setTotalCashInflowsFromInvestingActivities(
			String totalCashInflowsFromInvestingActivities) {
		TotalCashInflowsFromInvestingActivities = totalCashInflowsFromInvestingActivities;
	}

	/**
	 * ��ȡ cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents
	 * 
	 * @return the
	 *         cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents
	 *         �����̶��ʲ������ʲ������������ʲ���֧�����ֽ�
	 */
	public String getCashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents() {
		return CashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents;
	}

	/**
	 * ���� cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents
	 * 
	 * @param cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents
	 *            �����̶��ʲ������ʲ������������ʲ���֧�����ֽ�
	 */
	public void setCashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents(
			String cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents) {
		CashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents = cashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents;
	}

	/**
	 * ��ȡ cashPaymentsForInvestments
	 * 
	 * @return the cashPaymentsForInvestments Ͷ����֧�����ֽ�
	 */
	public String getCashPaymentsForInvestments() {
		return CashPaymentsForInvestments;
	}

	/**
	 * ���� cashPaymentsForInvestments
	 * 
	 * @param cashPaymentsForInvestments
	 *            Ͷ����֧�����ֽ�
	 */
	public void setCashPaymentsForInvestments(String cashPaymentsForInvestments) {
		CashPaymentsForInvestments = cashPaymentsForInvestments;
	}

	/**
	 * ��ȡ cashPaymentsRelatedToOtherInvestingActivities
	 * 
	 * @return the cashPaymentsRelatedToOtherInvestingActivities ֧����������Ͷ�ʻ�йص��ֽ�
	 */
	public String getCashPaymentsRelatedToOtherInvestingActivities() {
		return CashPaymentsRelatedToOtherInvestingActivities;
	}

	/**
	 * ���� cashPaymentsRelatedToOtherInvestingActivities
	 * 
	 * @param cashPaymentsRelatedToOtherInvestingActivities
	 *            ֧����������Ͷ�ʻ�йص��ֽ�
	 */
	public void setCashPaymentsRelatedToOtherInvestingActivities(
			String cashPaymentsRelatedToOtherInvestingActivities) {
		CashPaymentsRelatedToOtherInvestingActivities = cashPaymentsRelatedToOtherInvestingActivities;
	}

	/**
	 * ��ȡ totalCashOutflowsFromInvestingActivities
	 * 
	 * @return the totalCashOutflowsFromInvestingActivities Ͷ�ʻ�ֽ�����С��
	 */
	public String getTotalCashOutflowsFromInvestingActivities() {
		return TotalCashOutflowsFromInvestingActivities;
	}

	/**
	 * ���� totalCashOutflowsFromInvestingActivities
	 * 
	 * @param totalCashOutflowsFromInvestingActivities
	 *            Ͷ�ʻ�ֽ�����С��
	 */
	public void setTotalCashOutflowsFromInvestingActivities(
			String totalCashOutflowsFromInvestingActivities) {
		TotalCashOutflowsFromInvestingActivities = totalCashOutflowsFromInvestingActivities;
	}

	/**
	 * ��ȡ netCashFlowsFromInvestingActivities
	 * 
	 * @return the netCashFlowsFromInvestingActivities Ͷ�ʻ�������ֽ���������
	 */
	public String getNetCashFlowsFromInvestingActivities() {
		return NetCashFlowsFromInvestingActivities;
	}

	/**
	 * ���� netCashFlowsFromInvestingActivities
	 * 
	 * @param netCashFlowsFromInvestingActivities
	 *            Ͷ�ʻ�������ֽ���������
	 */
	public void setNetCashFlowsFromInvestingActivities(
			String netCashFlowsFromInvestingActivities) {
		NetCashFlowsFromInvestingActivities = netCashFlowsFromInvestingActivities;
	}

	/**
	 * ��ȡ cashReceivedFromInvestors
	 * 
	 * @return the cashReceivedFromInvestors ����Ͷ�����յ����ֽ�
	 */
	public String getCashReceivedFromInvestors() {
		return CashReceivedFromInvestors;
	}

	/**
	 * ���� cashReceivedFromInvestors
	 * 
	 * @param cashReceivedFromInvestors
	 *            ����Ͷ�����յ����ֽ�
	 */
	public void setCashReceivedFromInvestors(String cashReceivedFromInvestors) {
		CashReceivedFromInvestors = cashReceivedFromInvestors;
	}

	/**
	 * ��ȡ cashFromBorrowings
	 * 
	 * @return the cashFromBorrowings ������յ����ֽ�
	 */
	public String getCashFromBorrowings() {
		return CashFromBorrowings;
	}

	/**
	 * ���� cashFromBorrowings
	 * 
	 * @param cashFromBorrowings
	 *            ������յ����ֽ�
	 */
	public void setCashFromBorrowings(String cashFromBorrowings) {
		CashFromBorrowings = cashFromBorrowings;
	}

	/**
	 * ��ȡ otherCashReceivedRelatingToFinancingActivities
	 * 
	 * @return the otherCashReceivedRelatingToFinancingActivities
	 *         �յ�����������ʻ�йص��ֽ�
	 */
	public String getOtherCashReceivedRelatingToFinancingActivities() {
		return OtherCashReceivedRelatingToFinancingActivities;
	}

	/**
	 * ���� otherCashReceivedRelatingToFinancingActivities
	 * 
	 * @param otherCashReceivedRelatingToFinancingActivities
	 *            �յ�����������ʻ�йص��ֽ�
	 */
	public void setOtherCashReceivedRelatingToFinancingActivities(
			String otherCashReceivedRelatingToFinancingActivities) {
		OtherCashReceivedRelatingToFinancingActivities = otherCashReceivedRelatingToFinancingActivities;
	}

	/**
	 * ��ȡ totalCashInflowsFromFinancingActivities
	 * 
	 * @return the totalCashInflowsFromFinancingActivities ���ʻ�ֽ�����С��
	 */
	public String getTotalCashInflowsFromFinancingActivities() {
		return TotalCashInflowsFromFinancingActivities;
	}

	/**
	 * ���� totalCashInflowsFromFinancingActivities
	 * 
	 * @param totalCashInflowsFromFinancingActivities
	 *            ���ʻ�ֽ�����С��
	 */
	public void setTotalCashInflowsFromFinancingActivities(
			String totalCashInflowsFromFinancingActivities) {
		TotalCashInflowsFromFinancingActivities = totalCashInflowsFromFinancingActivities;
	}

	/**
	 * ��ȡ cashRepaymentsForDebts
	 * 
	 * @return the cashRepaymentsForDebts ����ծ����֧�����ֽ�
	 */
	public String getCashRepaymentsForDebts() {
		return CashRepaymentsForDebts;
	}

	/**
	 * ���� cashRepaymentsForDebts
	 * 
	 * @param cashRepaymentsForDebts
	 *            ����ծ����֧�����ֽ�
	 */
	public void setCashRepaymentsForDebts(String cashRepaymentsForDebts) {
		CashRepaymentsForDebts = cashRepaymentsForDebts;
	}

	/**
	 * ��ȡ cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses
	 * 
	 * @return the
	 *         cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses
	 *         �������������򳥸���Ϣ��֧�����ֽ�
	 */
	public String getCashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses() {
		return CashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses;
	}

	/**
	 * ���� cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses
	 * 
	 * @param cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses
	 *            �������������򳥸���Ϣ��֧�����ֽ�
	 */
	public void setCashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses(
			String cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses) {
		CashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses = cashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses;
	}

	/**
	 * ��ȡ cashPaymentsRelatedToOtherFinancingActivities
	 * 
	 * @return the cashPaymentsRelatedToOtherFinancingActivities ֧������������ʻ�йص��ֽ�
	 */
	public String getCashPaymentsRelatedToOtherFinancingActivities() {
		return CashPaymentsRelatedToOtherFinancingActivities;
	}

	/**
	 * ���� cashPaymentsRelatedToOtherFinancingActivities
	 * 
	 * @param cashPaymentsRelatedToOtherFinancingActivities
	 *            ֧������������ʻ�йص��ֽ�
	 */
	public void setCashPaymentsRelatedToOtherFinancingActivities(
			String cashPaymentsRelatedToOtherFinancingActivities) {
		CashPaymentsRelatedToOtherFinancingActivities = cashPaymentsRelatedToOtherFinancingActivities;
	}

	/**
	 * ��ȡ totalCashOutflowsFromFinancingActivities
	 * 
	 * @return the totalCashOutflowsFromFinancingActivities ���ʻ�ֽ�����С��
	 */
	public String getTotalCashOutflowsFromFinancingActivities() {
		return TotalCashOutflowsFromFinancingActivities;
	}

	/**
	 * ���� totalCashOutflowsFromFinancingActivities
	 * 
	 * @param totalCashOutflowsFromFinancingActivities
	 *            ���ʻ�ֽ�����С��
	 */
	public void setTotalCashOutflowsFromFinancingActivities(
			String totalCashOutflowsFromFinancingActivities) {
		TotalCashOutflowsFromFinancingActivities = totalCashOutflowsFromFinancingActivities;
	}

	/**
	 * ��ȡ netCashFlowsFromFinancingActivities
	 * 
	 * @return the netCashFlowsFromFinancingActivities �Ｏ��������ֽ���������
	 */
	public String getNetCashFlowsFromFinancingActivities() {
		return NetCashFlowsFromFinancingActivities;
	}

	/**
	 * ���� netCashFlowsFromFinancingActivities
	 * 
	 * @param netCashFlowsFromFinancingActivities
	 *            �Ｏ��������ֽ���������
	 */
	public void setNetCashFlowsFromFinancingActivities(
			String netCashFlowsFromFinancingActivities) {
		NetCashFlowsFromFinancingActivities = netCashFlowsFromFinancingActivities;
	}

	/**
	 * ��ȡ effectOfExchangRateChangesOnCash
	 * 
	 * @return the effectOfExchangRateChangesOnCash ���ʱ䶯���ֽ��Ӱ��
	 */
	public String getEffectOfExchangRateChangesOnCash() {
		return EffectOfExchangRateChangesOnCash;
	}

	/**
	 * ���� effectOfExchangRateChangesOnCash
	 * 
	 * @param effectOfExchangRateChangesOnCash
	 *            ���ʱ䶯���ֽ��Ӱ��
	 */
	public void setEffectOfExchangRateChangesOnCash(
			String effectOfExchangRateChangesOnCash) {
		EffectOfExchangRateChangesOnCash = effectOfExchangRateChangesOnCash;
	}

	/**
	 * ��ȡ netIncreaseInCashAndCashEquivalents
	 * 
	 * @return the netIncreaseInCashAndCashEquivalents �ֽ��ֽ�ȼ��ﾻ���Ӷ�
	 */
	public String getNetIncreaseInCashAndCashEquivalents() {
		return NetIncreaseInCashAndCashEquivalents;
	}

	/**
	 * ���� netIncreaseInCashAndCashEquivalents
	 * 
	 * @param netIncreaseInCashAndCashEquivalents
	 *            �ֽ��ֽ�ȼ��ﾻ���Ӷ�
	 */
	public void setNetIncreaseInCashAndCashEquivalents(
			String netIncreaseInCashAndCashEquivalents) {
		NetIncreaseInCashAndCashEquivalents = netIncreaseInCashAndCashEquivalents;
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
	 * ��ȡ provisionForAssets
	 * 
	 * @return the provisionForAssets ������ʲ���ֵ׼��
	 */
	public String getProvisionForAssets() {
		return ProvisionForAssets;
	}

	/**
	 * ���� provisionForAssets
	 * 
	 * @param provisionForAssets
	 *            ������ʲ���ֵ׼��
	 */
	public void setProvisionForAssets(String provisionForAssets) {
		ProvisionForAssets = provisionForAssets;
	}

	/**
	 * ��ȡ depreciationOfFixedAssets
	 * 
	 * @return the depreciationOfFixedAssets �̶��ʲ����
	 */
	public String getDepreciationOfFixedAssets() {
		return DepreciationOfFixedAssets;
	}

	/**
	 * ���� depreciationOfFixedAssets
	 * 
	 * @param depreciationOfFixedAssets
	 *            �̶��ʲ����
	 */
	public void setDepreciationOfFixedAssets(String depreciationOfFixedAssets) {
		DepreciationOfFixedAssets = depreciationOfFixedAssets;
	}

	/**
	 * ��ȡ amortisationOfIntangibleAssets
	 * 
	 * @return the amortisationOfIntangibleAssets �����ʲ�̯��
	 */
	public String getAmortisationOfIntangibleAssets() {
		return AmortisationOfIntangibleAssets;
	}

	/**
	 * ���� amortisationOfIntangibleAssets
	 * 
	 * @param amortisationOfIntangibleAssets
	 *            �����ʲ�̯��
	 */
	public void setAmortisationOfIntangibleAssets(
			String amortisationOfIntangibleAssets) {
		AmortisationOfIntangibleAssets = amortisationOfIntangibleAssets;
	}

	/**
	 * ��ȡ longTermDeferredExpensesAmortization
	 * 
	 * @return the longTermDeferredExpensesAmortization ���ڴ�̯����̯��
	 */
	public String getLongTermDeferredExpensesAmortization() {
		return LongTermDeferredExpensesAmortization;
	}

	/**
	 * ���� longTermDeferredExpensesAmortization
	 * 
	 * @param longTermDeferredExpensesAmortization
	 *            ���ڴ�̯����̯��
	 */
	public void setLongTermDeferredExpensesAmortization(
			String longTermDeferredExpensesAmortization) {
		LongTermDeferredExpensesAmortization = longTermDeferredExpensesAmortization;
	}

	/**
	 * ��ȡ decreaseOfDefferedExpenses
	 * 
	 * @return the decreaseOfDefferedExpenses ��̯���ü���
	 */
	public String getDecreaseOfDefferedExpenses() {
		return DecreaseOfDefferedExpenses;
	}

	/**
	 * ���� decreaseOfDefferedExpenses
	 * 
	 * @param decreaseOfDefferedExpenses
	 *            ��̯���ü���
	 */
	public void setDecreaseOfDefferedExpenses(String decreaseOfDefferedExpenses) {
		DecreaseOfDefferedExpenses = decreaseOfDefferedExpenses;
	}

	/**
	 * ��ȡ additionOfAccuedExpense
	 * 
	 * @return the additionOfAccuedExpense Ԥ���������
	 */
	public String getAdditionOfAccuedExpense() {
		return AdditionOfAccuedExpense;
	}

	/**
	 * ���� additionOfAccuedExpense
	 * 
	 * @param additionOfAccuedExpense
	 *            Ԥ���������
	 */
	public void setAdditionOfAccuedExpense(String additionOfAccuedExpense) {
		AdditionOfAccuedExpense = additionOfAccuedExpense;
	}

	/**
	 * ��ȡ lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 * 
	 * @return the
	 *         lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 *         ���ù̶��ʲ������ʲ������������ʲ�����ʧ
	 */
	public String getLossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets() {
		return LossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	}

	/**
	 * ���� lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 * 
	 * @param lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets
	 *            ���ù̶��ʲ������ʲ������������ʲ�����ʧ
	 */
	public void setLossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets(
			String lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets) {
		LossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets = lossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets;
	}

	/**
	 * ��ȡ lossesOnScrappingOfFixedAssets
	 * 
	 * @return the lossesOnScrappingOfFixedAssets �̶��ʲ�������ʧ
	 */
	public String getLossesOnScrappingOfFixedAssets() {
		return LossesOnScrappingOfFixedAssets;
	}

	/**
	 * ���� lossesOnScrappingOfFixedAssets
	 * 
	 * @param lossesOnScrappingOfFixedAssets
	 *            �̶��ʲ�������ʧ
	 */
	public void setLossesOnScrappingOfFixedAssets(
			String lossesOnScrappingOfFixedAssets) {
		LossesOnScrappingOfFixedAssets = lossesOnScrappingOfFixedAssets;
	}

	/**
	 * ��ȡ financeExpense
	 * 
	 * @return the financeExpense �������
	 */
	public String getFinanceExpense() {
		return FinanceExpense;
	}

	/**
	 * ���� financeExpense
	 * 
	 * @param financeExpense
	 *            �������
	 */
	public void setFinanceExpense(String financeExpense) {
		FinanceExpense = financeExpense;
	}

	/**
	 * ��ȡ lossesArsingFromInvestment
	 * 
	 * @return the lossesArsingFromInvestment Ͷ����ʧ
	 */
	public String getLossesArsingFromInvestment() {
		return LossesArsingFromInvestment;
	}

	/**
	 * ���� lossesArsingFromInvestment
	 * 
	 * @param lossesArsingFromInvestment
	 *            Ͷ����ʧ
	 */
	public void setLossesArsingFromInvestment(String lossesArsingFromInvestment) {
		LossesArsingFromInvestment = lossesArsingFromInvestment;
	}

	/**
	 * ��ȡ deferredTaxCredit
	 * 
	 * @return the deferredTaxCredit ����˰�����
	 */
	public String getDeferredTaxCredit() {
		return DeferredTaxCredit;
	}

	/**
	 * ���� deferredTaxCredit
	 * 
	 * @param deferredTaxCredit
	 *            ����˰�����
	 */
	public void setDeferredTaxCredit(String deferredTaxCredit) {
		DeferredTaxCredit = deferredTaxCredit;
	}

	/**
	 * ��ȡ decreaseInInventories
	 * 
	 * @return the decreaseInInventories ����ļ���
	 */
	public String getDecreaseInInventories() {
		return DecreaseInInventories;
	}

	/**
	 * ���� decreaseInInventories
	 * 
	 * @param decreaseInInventories
	 *            ����ļ���
	 */
	public void setDecreaseInInventories(String decreaseInInventories) {
		DecreaseInInventories = decreaseInInventories;
	}

	/**
	 * ��ȡ decreaseInOperatingReceivables
	 * 
	 * @return the decreaseInOperatingReceivables ��Ӫ��Ӧ����Ŀ�ļ���
	 */
	public String getDecreaseInOperatingReceivables() {
		return DecreaseInOperatingReceivables;
	}

	/**
	 * ���� decreaseInOperatingReceivables
	 * 
	 * @param decreaseInOperatingReceivables
	 *            ��Ӫ��Ӧ����Ŀ�ļ���
	 */
	public void setDecreaseInOperatingReceivables(
			String decreaseInOperatingReceivables) {
		DecreaseInOperatingReceivables = decreaseInOperatingReceivables;
	}

	/**
	 * ��ȡ increaseInOperatingReceivables
	 * 
	 * @return the increaseInOperatingReceivables ��Ӫ��Ӧ����Ŀ������
	 */
	public String getIncreaseInOperatingReceivables() {
		return IncreaseInOperatingReceivables;
	}

	/**
	 * ���� increaseInOperatingReceivables
	 * 
	 * @param increaseInOperatingReceivables
	 *            ��Ӫ��Ӧ����Ŀ������
	 */
	public void setIncreaseInOperatingReceivables(
			String increaseInOperatingReceivables) {
		IncreaseInOperatingReceivables = increaseInOperatingReceivables;
	}

	/**
	 * ��ȡ others
	 * 
	 * @return the others �����������Ϊ��Ӫ��ֽ�������Ŀ�£�����
	 */
	public String getOthers() {
		return Others;
	}

	/**
	 * ���� others
	 * 
	 * @param others
	 *            �����������Ϊ��Ӫ��ֽ�������Ŀ�£�����
	 */
	public void setOthers(String others) {
		Others = others;
	}

	/**
	 * ��ȡ netCashFlowsFromOperatingActivitiesMi
	 * 
	 * @return the netCashFlowsFromOperatingActivitiesMi ��Ӫ��������ֽ���������
	 */
	public String getNetCashFlowsFromOperatingActivitiesMi() {
		return NetCashFlowsFromOperatingActivitiesMi;
	}

	/**
	 * ���� netCashFlowsFromOperatingActivitiesMi
	 * 
	 * @param netCashFlowsFromOperatingActivitiesMi
	 *            ��Ӫ��������ֽ���������
	 */
	public void setNetCashFlowsFromOperatingActivitiesMi(
			String netCashFlowsFromOperatingActivitiesMi) {
		NetCashFlowsFromOperatingActivitiesMi = netCashFlowsFromOperatingActivitiesMi;
	}

	/**
	 * ��ȡ debtsTransferToCapital
	 * 
	 * @return the debtsTransferToCapital ծ��תΪ�ʱ�
	 */
	public String getDebtsTransferToCapital() {
		return DebtsTransferToCapital;
	}

	/**
	 * ���� debtsTransferToCapital
	 * 
	 * @param debtsTransferToCapital
	 *            ծ��תΪ�ʱ�
	 */
	public void setDebtsTransferToCapital(String debtsTransferToCapital) {
		DebtsTransferToCapital = debtsTransferToCapital;
	}

	/**
	 * ��ȡ oneYearDueConvertibleBonds
	 * 
	 * @return the oneYearDueConvertibleBonds һ���ڵ��ڵĿ�ת����˾ծȯ
	 */
	public String getOneYearDueConvertibleBonds() {
		return OneYearDueConvertibleBonds;
	}

	/**
	 * ���� oneYearDueConvertibleBonds
	 * 
	 * @param oneYearDueConvertibleBonds
	 *            һ���ڵ��ڵĿ�ת����˾ծȯ
	 */
	public void setOneYearDueConvertibleBonds(String oneYearDueConvertibleBonds) {
		OneYearDueConvertibleBonds = oneYearDueConvertibleBonds;
	}

	/**
	 * ��ȡ financingRentToTheFixedAsset
	 * 
	 * @return the financingRentToTheFixedAsset ��������̶��ʲ�
	 */
	public String getFinancingRentToTheFixedAsset() {
		return FinancingRentToTheFixedAsset;
	}

	/**
	 * ���� financingRentToTheFixedAsset
	 * 
	 * @param financingRentToTheFixedAsset
	 *            ��������̶��ʲ�
	 */
	public void setFinancingRentToTheFixedAsset(
			String financingRentToTheFixedAsset) {
		FinancingRentToTheFixedAsset = financingRentToTheFixedAsset;
	}


	/**  
	 * ��ȡ nonCashOthers
	 * @return the nonCashOthers �����漰�ֽ���֧��Ͷ�ʺͳ��ʻ��Ŀ�£����� 
	 */
	public String getNonCashOthers() {
		return NonCashOthers;
	}

	/**  
	 * ���� nonCashOthers  
	 * @param nonCashOthers �����漰�ֽ���֧��Ͷ�ʺͳ��ʻ��Ŀ�£�����  
	 */
	public void setNonCashOthers(String nonCashOthers) {
		NonCashOthers = nonCashOthers;
	}

	/**
	 * ��ȡ cashAtTheEndOfPeriod
	 * 
	 * @return the cashAtTheEndOfPeriod �ֽ����ĩ���
	 */
	public String getCashAtTheEndOfPeriod() {
		return CashAtTheEndOfPeriod;
	}

	/**
	 * ���� cashAtTheEndOfPeriod
	 * 
	 * @param cashAtTheEndOfPeriod
	 *            �ֽ����ĩ���
	 */
	public void setCashAtTheEndOfPeriod(String cashAtTheEndOfPeriod) {
		CashAtTheEndOfPeriod = cashAtTheEndOfPeriod;
	}

	/**
	 * ��ȡ cashAtTheBeginningOfThePeriod
	 * 
	 * @return the cashAtTheBeginningOfThePeriod �ֽ���ڳ����
	 */
	public String getCashAtTheBeginningOfThePeriod() {
		return CashAtTheBeginningOfThePeriod;
	}

	/**
	 * ���� cashAtTheBeginningOfThePeriod
	 * 
	 * @param cashAtTheBeginningOfThePeriod
	 *            �ֽ���ڳ����
	 */
	public void setCashAtTheBeginningOfThePeriod(
			String cashAtTheBeginningOfThePeriod) {
		CashAtTheBeginningOfThePeriod = cashAtTheBeginningOfThePeriod;
	}

	/**
	 * ��ȡ cashEquivalentsAtTheEndOfThePeriod
	 * 
	 * @return the cashEquivalentsAtTheEndOfThePeriod �ֽ�ȼ������ĩ���
	 */
	public String getCashEquivalentsAtTheEndOfThePeriod() {
		return CashEquivalentsAtTheEndOfThePeriod;
	}

	/**
	 * ���� cashEquivalentsAtTheEndOfThePeriod
	 * 
	 * @param cashEquivalentsAtTheEndOfThePeriod
	 *            �ֽ�ȼ������ĩ���
	 */
	public void setCashEquivalentsAtTheEndOfThePeriod(
			String cashEquivalentsAtTheEndOfThePeriod) {
		CashEquivalentsAtTheEndOfThePeriod = cashEquivalentsAtTheEndOfThePeriod;
	}

	/**
	 * ��ȡ cashRquivalentsAtTheBeginningOfThePeriod
	 * 
	 * @return the cashRquivalentsAtTheBeginningOfThePeriod �ֽ�ȼ�����ڳ����
	 */
	public String getCashRquivalentsAtTheBeginningOfThePeriod() {
		return CashRquivalentsAtTheBeginningOfThePeriod;
	}

	/**
	 * ���� cashRquivalentsAtTheBeginningOfThePeriod
	 * 
	 * @param cashRquivalentsAtTheBeginningOfThePeriod
	 *            �ֽ�ȼ�����ڳ����
	 */
	public void setCashRquivalentsAtTheBeginningOfThePeriod(
			String cashRquivalentsAtTheBeginningOfThePeriod) {
		CashRquivalentsAtTheBeginningOfThePeriod = cashRquivalentsAtTheBeginningOfThePeriod;
	}

	/**
	 * ��ȡ netIncreaseInCashAndCashEquivalentsMi
	 * 
	 * @return the netIncreaseInCashAndCashEquivalentsMi �ֽ��ֽ�ȼ��ﾻ���Ӷ�
	 */
	public String getNetIncreaseInCashAndCashEquivalentsMi() {
		return NetIncreaseInCashAndCashEquivalentsMi;
	}

	/**
	 * ���� netIncreaseInCashAndCashEquivalentsMi
	 * 
	 * @param netIncreaseInCashAndCashEquivalentsMi
	 *            �ֽ��ֽ�ȼ��ﾻ���Ӷ�
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
