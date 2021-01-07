package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: IncomeStatementProfitAppropriation2002Sgmt<br/>
 * Description:2002���������������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
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
// ָ�����гɵ�xml�ڵ�˳��
public class IncomeStatementProfitAppropriation2002Sgmt {
	/**
	 *��Ӫҵ������
	 */
	@XmlElement
	private String MainRevenuefRevenue;
	/**
	 *����Ӫҵ�������Ŀ�£����ڲ�Ʒ��������
	 */
	@XmlElement
	private String SalesIncomeOfExportGoodsProducts;
	/**
	 *����Ӫҵ�������Ŀ�£����ڲ�Ʒ��������
	 */
	@XmlElement
	private String SalesIncomeOfImportGoodsProducts;
	/**
	 *�����ۿ�������
	 */
	@XmlElement
	private String DiscountAndAllowance;
	/**
	 *��Ӫҵ�����뾻��
	 */
	@XmlElement
	private String NetAmountOfIncomeFromMainBusiness;
	/**
	 *��Ӫҵ��ɱ�
	 */
	@XmlElement
	private String MainOperatingCost;
	/**
	 *����Ӫҵ��ɱ���Ŀ�£����ڲ�Ʒ���۳ɱ�
	 */
	@XmlElement
	private String SalesIncomeOfExportProducts;
	/**
	 * ��Ӫҵ��˰�𼰸���
	 */
	@XmlElement
	private String PrincipleBusinessTaxAndExtraCharge;
	/**
	 *��Ӫ����
	 */
	@XmlElement
	private String OperationExpense;
	/**
	 *������ҵ��ɱ���
	 */
	@XmlElement
	private String OthersOperatingCost;
	/**
	 *��������
	 */
	@XmlElement
	private String DeferredIncome;
	/**
	 *������������
	 */
	@XmlElement
	private String IncomeFromSalesAgency;
	/**
	 *���������룩
	 */
	@XmlElement
	private String OtherOperatingIncome;
	/**
	 * ��Ӫҵ������
	 */
	@XmlElement
	private String PrincipleBusinessProfit;
	/**
	 *����ҵ������
	 */
	@XmlElement
	private String OtherBusinessProfit;
	/**
	 *Ӫҵ����
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
	private String FinancialExpenses;
	/**
	 *���������ã�
	 */
	@XmlElement
	private String OthersExpenses;
	/**
	 *Ӫҵ����
	 */
	@XmlElement
	private String OperatingProfits;
	/**
	 *Ͷ������
	 */
	@XmlElement
	private String InvestmentIncome;
	/**
	 *�ڻ�����
	 */
	@XmlElement
	private String FuturesIncome;
	/**
	 *��������
	 */
	@XmlElement
	private String AllowanceIncome;
	/**
	 *�����������Ŀ�£�����ǰ�������ҵ��������
	 */
	@XmlElement
	private String AllowanceIncomeBeforeAllowance;
	/**
	 *Ӫҵ������
	 */
	@XmlElement
	private String NonOperatingIncome;
	/**
	 *��Ӫҵ�������Ŀ�£����ù̶��ʲ�������
	 */
	@XmlElement
	private String NetGainOnDisposalOfFixedAssets;
	/**
	 *��Ӫҵ�������Ŀ�£��ǻ����Խ�������
	 */
	@XmlElement
	private String IncomeFromNonCurrencyTrade;
	/**
	 *��Ӫҵ�������Ŀ�£����������ʲ�����
	 */
	@XmlElement
	private String IncomeFromSalesOfIntangibleAssets;
	/**
	 *��Ӫҵ�������Ŀ�£��������
	 */
	@XmlElement
	private String IncomeFromPenalty;
	/**
	 *����������
	 */
	@XmlElement
	private String OthersIncome;
	/**
	 *��������Ŀ�£�����ǰ��Ⱥ������ʽ����ֲ�����
	 */
	@XmlElement
	private String CalculatingFromTheContentSalaryBefore;
	/**
	 *Ӫҵ��֧��
	 */
	@XmlElement
	private String NonOperatingExpenses;
	/**
	 *��Ӫҵ��֧����Ŀ�£����ù̶��ʲ�����ʧ
	 */
	@XmlElement
	private String LossFromDisposalOfFixedAssets;
	/**
	 *��Ӫҵ��֧����Ŀ�£�ծ��������ʧ
	 */
	@XmlElement
	private String ExchangeOfNonMonetaryAssetsLoss;
	/**
	 *��Ӫҵ��֧����Ŀ�£�����֧��
	 */
	@XmlElement
	private String LossOfLawsuits;
	/**
	 *��Ӫҵ��֧����Ŀ�£�����֧��
	 */
	@XmlElement
	private String PaymentForDonation;
	/**
	 * ����֧��
	 */
	@XmlElement
	private String OtherPayments;
	/**
	 *������֧������ת�ĺ������ʰ��ɽ���
	 */
	@XmlElement
	private String BalanceOfContentSalary;
	/**
	 *�����ܶ�
	 */
	@XmlElement
	private String TotalProfit;
	/**
	 *����˰
	 */
	@XmlElement
	private String Incometax;
	/**
	 *�����ɶ�����
	 */
	@XmlElement
	private String ImparimentLoss;
	/**
	 *δȷ�ϵ�Ͷ����ʧ
	 */
	@XmlElement
	private String UnrealizedInvestmentLosses;
	/**
	 *������
	 */
	@XmlElement
	private String NetProfit;
	/**
	 *���δ��������
	 */
	@XmlElement
	private String ProfitDistributionAtBeginningOfPeriod;
	/**
	 *ӯ�๫������
	 */
	@XmlElement
	private String CompensationOfSurplusReserve;
	/**
	 *������������
	 */
	@XmlElement
	private String OtherAdjustmentFactors;
	/**
	 *�ɹ����������
	 */
	@XmlElement
	private String ProfitAvailableForDistribution;
	/**
	 *�������õ�����
	 */
	@XmlElement
	private String ProfitReservedForASingleItem;
	/**
	 *���������ʱ�
	 */
	@XmlElement
	private String SupplementaryCurrentCapital;
	/**
	 * ��ȡ����ӯ�๫��
	 */
	@XmlElement
	private String AppropriationOfStatutorySurplusReserves;
	/**
	 *��ȡ���������
	 */
	@XmlElement
	private String AppropriationOfStatutoryWelfareFund;
	/**
	 *��ȡְ����������������
	 */
	@XmlElement
	private String AppropriationOfStaffIncentiveAndWelfareFund;
	/**
	 *��ȡ��������
	 */
	@XmlElement
	private String AppropriationOfReserveFund;
	/**
	 *��ȡ��ҵ��չ����
	 */
	@XmlElement
	private String AppropriationOfEnterpriseExpansionFund;
	/**
	 *����黹Ͷ��
	 */
	@XmlElement
	private String ProfitsCapitalizadOnReturnOfInvestment;
	/**
	 *���ɹ�����������Ŀ�£�����
	 */
	@XmlElement
	private String Others;
	/**
	 *�ɹ�Ͷ���߷��������
	 */
	@XmlElement
	private String ProfitAvailableForOwnersDistribution;
	/**
	 *Ӧ�����ȹɹ���
	 */
	@XmlElement
	private String PreferredStockDividendsPayable;
	/**
	 *��ȡ����ӯ�๫��
	 */
	@XmlElement
	private String WithdrawalOtherCommonAccumulationFund;
	/**
	 *Ӧ����ͨ�ɹ���
	 */
	@XmlElement
	private String PayableDividendsOfCommonStock;
	/**
	 *ת���ʱ�����ͨ�ɹ���
	 */
	@XmlElement
	private String TransferFromOrdinarySharesDividendToPaidInCapitalOrStock;

	/**
	 *���ɹ�Ͷ���߷���������Ŀ�£�����
	 */
	@XmlElement
	private String OthersForOwners;
	/**
	 *δ��������
	 */
	@XmlElement
	private String UnappropriatedProfit;
	/**
	 *��δ���������Ŀ�£�Ӧ���Ժ����˰ǰ�����ֲ��Ŀ���
	 */
	@XmlElement
	private String LossCompensatedBeforeTheTax;

	public IncomeStatementProfitAppropriation2002Sgmt() {
		super();
	}

	/**  
	 * ��ȡ mainRevenuefRevenue
	 * @return the mainRevenuefRevenue ��Ӫҵ������ 
	 */
	public String getMainRevenuefRevenue() {
		return MainRevenuefRevenue;
	}

	/**  
	 * ���� mainRevenuefRevenue  
	 * @param mainRevenuefRevenue ��Ӫҵ������  
	 */
	public void setMainRevenuefRevenue(String mainRevenuefRevenue) {
		MainRevenuefRevenue = mainRevenuefRevenue;
	}

	/**  
	 * ��ȡ salesIncomeOfExportGoodsProducts
	 * @return the salesIncomeOfExportGoodsProducts ����Ӫҵ�������Ŀ�£����ڲ�Ʒ�������� 
	 */
	public String getSalesIncomeOfExportGoodsProducts() {
		return SalesIncomeOfExportGoodsProducts;
	}

	/**  
	 * ���� salesIncomeOfExportGoodsProducts  
	 * @param salesIncomeOfExportGoodsProducts ����Ӫҵ�������Ŀ�£����ڲ�Ʒ��������  
	 */
	public void setSalesIncomeOfExportGoodsProducts(
			String salesIncomeOfExportGoodsProducts) {
		SalesIncomeOfExportGoodsProducts = salesIncomeOfExportGoodsProducts;
	}

	/**  
	 * ��ȡ salesIncomeOfImportGoodsProducts
	 * @return the salesIncomeOfImportGoodsProducts ����Ӫҵ�������Ŀ�£����ڲ�Ʒ�������� 
	 */
	public String getSalesIncomeOfImportGoodsProducts() {
		return SalesIncomeOfImportGoodsProducts;
	}

	/**  
	 * ���� salesIncomeOfImportGoodsProducts  
	 * @param salesIncomeOfImportGoodsProducts ����Ӫҵ�������Ŀ�£����ڲ�Ʒ��������  
	 */
	public void setSalesIncomeOfImportGoodsProducts(
			String salesIncomeOfImportGoodsProducts) {
		SalesIncomeOfImportGoodsProducts = salesIncomeOfImportGoodsProducts;
	}

	/**  
	 * ��ȡ discountAndAllowance
	 * @return the discountAndAllowance �����ۿ������� 
	 */
	public String getDiscountAndAllowance() {
		return DiscountAndAllowance;
	}

	/**  
	 * ���� discountAndAllowance  
	 * @param discountAndAllowance �����ۿ�������  
	 */
	public void setDiscountAndAllowance(String discountAndAllowance) {
		DiscountAndAllowance = discountAndAllowance;
	}

	/**  
	 * ��ȡ netAmountOfIncomeFromMainBusiness
	 * @return the netAmountOfIncomeFromMainBusiness ��Ӫҵ�����뾻�� 
	 */
	public String getNetAmountOfIncomeFromMainBusiness() {
		return NetAmountOfIncomeFromMainBusiness;
	}

	/**  
	 * ���� netAmountOfIncomeFromMainBusiness  
	 * @param netAmountOfIncomeFromMainBusiness ��Ӫҵ�����뾻��  
	 */
	public void setNetAmountOfIncomeFromMainBusiness(
			String netAmountOfIncomeFromMainBusiness) {
		NetAmountOfIncomeFromMainBusiness = netAmountOfIncomeFromMainBusiness;
	}

	/**  
	 * ��ȡ mainOperatingCost
	 * @return the mainOperatingCost ��Ӫҵ��ɱ� 
	 */
	public String getMainOperatingCost() {
		return MainOperatingCost;
	}

	/**  
	 * ���� mainOperatingCost  
	 * @param mainOperatingCost ��Ӫҵ��ɱ�  
	 */
	public void setMainOperatingCost(String mainOperatingCost) {
		MainOperatingCost = mainOperatingCost;
	}

	/**  
	 * ��ȡ salesIncomeOfExportProducts
	 * @return the salesIncomeOfExportProducts ����Ӫҵ��ɱ���Ŀ�£����ڲ�Ʒ���۳ɱ� 
	 */
	public String getSalesIncomeOfExportProducts() {
		return SalesIncomeOfExportProducts;
	}

	/**  
	 * ���� salesIncomeOfExportProducts  
	 * @param salesIncomeOfExportProducts ����Ӫҵ��ɱ���Ŀ�£����ڲ�Ʒ���۳ɱ�  
	 */
	public void setSalesIncomeOfExportProducts(String salesIncomeOfExportProducts) {
		SalesIncomeOfExportProducts = salesIncomeOfExportProducts;
	}

	/**  
	 * ��ȡ principleBusinessTaxAndExtraCharge
	 * @return the principleBusinessTaxAndExtraCharge ��Ӫҵ��˰�𼰸��� 
	 */
	public String getPrincipleBusinessTaxAndExtraCharge() {
		return PrincipleBusinessTaxAndExtraCharge;
	}

	/**  
	 * ���� principleBusinessTaxAndExtraCharge  
	 * @param principleBusinessTaxAndExtraCharge ��Ӫҵ��˰�𼰸���  
	 */
	public void setPrincipleBusinessTaxAndExtraCharge(
			String principleBusinessTaxAndExtraCharge) {
		PrincipleBusinessTaxAndExtraCharge = principleBusinessTaxAndExtraCharge;
	}

	/**  
	 * ��ȡ operationExpense
	 * @return the operationExpense ��Ӫ���� 
	 */
	public String getOperationExpense() {
		return OperationExpense;
	}

	/**  
	 * ���� operationExpense  
	 * @param operationExpense ��Ӫ����  
	 */
	public void setOperationExpense(String operationExpense) {
		OperationExpense = operationExpense;
	}

	/**  
	 * ��ȡ othersOperatingCost
	 * @return the othersOperatingCost ������ҵ��ɱ��� 
	 */
	public String getOthersOperatingCost() {
		return OthersOperatingCost;
	}

	/**  
	 * ���� othersOperatingCost  
	 * @param othersOperatingCost ������ҵ��ɱ���  
	 */
	public void setOthersOperatingCost(String othersOperatingCost) {
		OthersOperatingCost = othersOperatingCost;
	}

	/**  
	 * ��ȡ deferredIncome
	 * @return the deferredIncome �������� 
	 */
	public String getDeferredIncome() {
		return DeferredIncome;
	}

	/**  
	 * ���� deferredIncome  
	 * @param deferredIncome ��������  
	 */
	public void setDeferredIncome(String deferredIncome) {
		DeferredIncome = deferredIncome;
	}

	/**  
	 * ��ȡ incomeFromSalesAgency
	 * @return the incomeFromSalesAgency ������������ 
	 */
	public String getIncomeFromSalesAgency() {
		return IncomeFromSalesAgency;
	}

	/**  
	 * ���� incomeFromSalesAgency  
	 * @param incomeFromSalesAgency ������������  
	 */
	public void setIncomeFromSalesAgency(String incomeFromSalesAgency) {
		IncomeFromSalesAgency = incomeFromSalesAgency;
	}

	/**  
	 * ��ȡ otherOperatingIncome
	 * @return the otherOperatingIncome ���������룩 
	 */
	public String getOtherOperatingIncome() {
		return OtherOperatingIncome;
	}

	/**  
	 * ���� otherOperatingIncome  
	 * @param otherOperatingIncome ���������룩  
	 */
	public void setOtherOperatingIncome(String otherOperatingIncome) {
		OtherOperatingIncome = otherOperatingIncome;
	}

	/**  
	 * ��ȡ principleBusinessProfit
	 * @return the principleBusinessProfit ��Ӫҵ������ 
	 */
	public String getPrincipleBusinessProfit() {
		return PrincipleBusinessProfit;
	}

	/**  
	 * ���� principleBusinessProfit  
	 * @param principleBusinessProfit ��Ӫҵ������  
	 */
	public void setPrincipleBusinessProfit(String principleBusinessProfit) {
		PrincipleBusinessProfit = principleBusinessProfit;
	}

	/**  
	 * ��ȡ otherBusinessProfit
	 * @return the otherBusinessProfit ����ҵ������ 
	 */
	public String getOtherBusinessProfit() {
		return OtherBusinessProfit;
	}

	/**  
	 * ���� otherBusinessProfit  
	 * @param otherBusinessProfit ����ҵ������  
	 */
	public void setOtherBusinessProfit(String otherBusinessProfit) {
		OtherBusinessProfit = otherBusinessProfit;
	}

	/**  
	 * ��ȡ sellingExpenses
	 * @return the sellingExpenses Ӫҵ���� 
	 */
	public String getSellingExpenses() {
		return SellingExpenses;
	}

	/**  
	 * ���� sellingExpenses  
	 * @param sellingExpenses Ӫҵ����  
	 */
	public void setSellingExpenses(String sellingExpenses) {
		SellingExpenses = sellingExpenses;
	}

	/**  
	 * ��ȡ generalAndAdministrativeExpenses
	 * @return the generalAndAdministrativeExpenses ������� 
	 */
	public String getGeneralAndAdministrativeExpenses() {
		return GeneralAndAdministrativeExpenses;
	}

	/**  
	 * ���� generalAndAdministrativeExpenses  
	 * @param generalAndAdministrativeExpenses �������  
	 */
	public void setGeneralAndAdministrativeExpenses(
			String generalAndAdministrativeExpenses) {
		GeneralAndAdministrativeExpenses = generalAndAdministrativeExpenses;
	}

	/**  
	 * ��ȡ financialExpenses
	 * @return the financialExpenses ������� 
	 */
	public String getFinancialExpenses() {
		return FinancialExpenses;
	}

	/**  
	 * ���� financialExpenses  
	 * @param financialExpenses �������  
	 */
	public void setFinancialExpenses(String financialExpenses) {
		FinancialExpenses = financialExpenses;
	}

	/**  
	 * ��ȡ othersExpenses
	 * @return the othersExpenses ���������ã� 
	 */
	public String getOthersExpenses() {
		return OthersExpenses;
	}

	/**  
	 * ���� othersExpenses  
	 * @param othersExpenses ���������ã�  
	 */
	public void setOthersExpenses(String othersExpenses) {
		OthersExpenses = othersExpenses;
	}

	/**  
	 * ��ȡ operatingProfits
	 * @return the operatingProfits Ӫҵ���� 
	 */
	public String getOperatingProfits() {
		return OperatingProfits;
	}

	/**  
	 * ���� operatingProfits  
	 * @param operatingProfits Ӫҵ����  
	 */
	public void setOperatingProfits(String operatingProfits) {
		OperatingProfits = operatingProfits;
	}

	/**  
	 * ��ȡ investmentIncome
	 * @return the investmentIncome Ͷ������ 
	 */
	public String getInvestmentIncome() {
		return InvestmentIncome;
	}

	/**  
	 * ���� investmentIncome  
	 * @param investmentIncome Ͷ������  
	 */
	public void setInvestmentIncome(String investmentIncome) {
		InvestmentIncome = investmentIncome;
	}

	/**  
	 * ��ȡ futuresIncome
	 * @return the futuresIncome �ڻ����� 
	 */
	public String getFuturesIncome() {
		return FuturesIncome;
	}

	/**  
	 * ���� futuresIncome  
	 * @param futuresIncome �ڻ�����  
	 */
	public void setFuturesIncome(String futuresIncome) {
		FuturesIncome = futuresIncome;
	}

	/**  
	 * ��ȡ allowanceIncome
	 * @return the allowanceIncome �������� 
	 */
	public String getAllowanceIncome() {
		return AllowanceIncome;
	}

	/**  
	 * ���� allowanceIncome  
	 * @param allowanceIncome ��������  
	 */
	public void setAllowanceIncome(String allowanceIncome) {
		AllowanceIncome = allowanceIncome;
	}

	/**  
	 * ��ȡ allowanceIncomeBeforeAllowance
	 * @return the allowanceIncomeBeforeAllowance �����������Ŀ�£�����ǰ�������ҵ�������� 
	 */
	public String getAllowanceIncomeBeforeAllowance() {
		return AllowanceIncomeBeforeAllowance;
	}

	/**  
	 * ���� allowanceIncomeBeforeAllowance  
	 * @param allowanceIncomeBeforeAllowance �����������Ŀ�£�����ǰ�������ҵ��������  
	 */
	public void setAllowanceIncomeBeforeAllowance(
			String allowanceIncomeBeforeAllowance) {
		AllowanceIncomeBeforeAllowance = allowanceIncomeBeforeAllowance;
	}

	/**  
	 * ��ȡ nonOperatingIncome
	 * @return the nonOperatingIncome Ӫҵ������ 
	 */
	public String getNonOperatingIncome() {
		return NonOperatingIncome;
	}

	/**  
	 * ���� nonOperatingIncome  
	 * @param nonOperatingIncome Ӫҵ������  
	 */
	public void setNonOperatingIncome(String nonOperatingIncome) {
		NonOperatingIncome = nonOperatingIncome;
	}

	/**  
	 * ��ȡ netGainOnDisposalOfFixedAssets
	 * @return the netGainOnDisposalOfFixedAssets ��Ӫҵ�������Ŀ�£����ù̶��ʲ������� 
	 */
	public String getNetGainOnDisposalOfFixedAssets() {
		return NetGainOnDisposalOfFixedAssets;
	}

	/**  
	 * ���� netGainOnDisposalOfFixedAssets  
	 * @param netGainOnDisposalOfFixedAssets ��Ӫҵ�������Ŀ�£����ù̶��ʲ�������  
	 */
	public void setNetGainOnDisposalOfFixedAssets(
			String netGainOnDisposalOfFixedAssets) {
		NetGainOnDisposalOfFixedAssets = netGainOnDisposalOfFixedAssets;
	}

	/**  
	 * ��ȡ incomeFromNonCurrencyTrade
	 * @return the incomeFromNonCurrencyTrade ��Ӫҵ�������Ŀ�£��ǻ����Խ������� 
	 */
	public String getIncomeFromNonCurrencyTrade() {
		return IncomeFromNonCurrencyTrade;
	}

	/**  
	 * ���� incomeFromNonCurrencyTrade  
	 * @param incomeFromNonCurrencyTrade ��Ӫҵ�������Ŀ�£��ǻ����Խ�������  
	 */
	public void setIncomeFromNonCurrencyTrade(String incomeFromNonCurrencyTrade) {
		IncomeFromNonCurrencyTrade = incomeFromNonCurrencyTrade;
	}

	/**  
	 * ��ȡ incomeFromSalesOfIntangibleAssets
	 * @return the incomeFromSalesOfIntangibleAssets ��Ӫҵ�������Ŀ�£����������ʲ����� 
	 */
	public String getIncomeFromSalesOfIntangibleAssets() {
		return IncomeFromSalesOfIntangibleAssets;
	}

	/**  
	 * ���� incomeFromSalesOfIntangibleAssets  
	 * @param incomeFromSalesOfIntangibleAssets ��Ӫҵ�������Ŀ�£����������ʲ�����  
	 */
	public void setIncomeFromSalesOfIntangibleAssets(
			String incomeFromSalesOfIntangibleAssets) {
		IncomeFromSalesOfIntangibleAssets = incomeFromSalesOfIntangibleAssets;
	}

	/**  
	 * ��ȡ incomeFromPenalty
	 * @return the incomeFromPenalty ��Ӫҵ�������Ŀ�£�������� 
	 */
	public String getIncomeFromPenalty() {
		return IncomeFromPenalty;
	}

	/**  
	 * ���� incomeFromPenalty  
	 * @param incomeFromPenalty ��Ӫҵ�������Ŀ�£��������  
	 */
	public void setIncomeFromPenalty(String incomeFromPenalty) {
		IncomeFromPenalty = incomeFromPenalty;
	}

	/**  
	 * ��ȡ othersIncome
	 * @return the othersIncome ���������� 
	 */
	public String getOthersIncome() {
		return OthersIncome;
	}

	/**  
	 * ���� othersIncome  
	 * @param othersIncome ����������  
	 */
	public void setOthersIncome(String othersIncome) {
		OthersIncome = othersIncome;
	}

	/**  
	 * ��ȡ calculatingFromTheContentSalaryBefore
	 * @return the calculatingFromTheContentSalaryBefore ��������Ŀ�£�����ǰ��Ⱥ������ʽ����ֲ����� 
	 */
	public String getCalculatingFromTheContentSalaryBefore() {
		return CalculatingFromTheContentSalaryBefore;
	}

	/**  
	 * ���� calculatingFromTheContentSalaryBefore  
	 * @param calculatingFromTheContentSalaryBefore ��������Ŀ�£�����ǰ��Ⱥ������ʽ����ֲ�����  
	 */
	public void setCalculatingFromTheContentSalaryBefore(
			String calculatingFromTheContentSalaryBefore) {
		CalculatingFromTheContentSalaryBefore = calculatingFromTheContentSalaryBefore;
	}

	/**  
	 * ��ȡ nonOperatingExpenses
	 * @return the nonOperatingExpenses Ӫҵ��֧�� 
	 */
	public String getNonOperatingExpenses() {
		return NonOperatingExpenses;
	}

	/**  
	 * ���� nonOperatingExpenses  
	 * @param nonOperatingExpenses Ӫҵ��֧��  
	 */
	public void setNonOperatingExpenses(String nonOperatingExpenses) {
		NonOperatingExpenses = nonOperatingExpenses;
	}

	/**  
	 * ��ȡ lossFromDisposalOfFixedAssets
	 * @return the lossFromDisposalOfFixedAssets ��Ӫҵ��֧����Ŀ�£����ù̶��ʲ�����ʧ 
	 */
	public String getLossFromDisposalOfFixedAssets() {
		return LossFromDisposalOfFixedAssets;
	}

	/**  
	 * ���� lossFromDisposalOfFixedAssets  
	 * @param lossFromDisposalOfFixedAssets ��Ӫҵ��֧����Ŀ�£����ù̶��ʲ�����ʧ  
	 */
	public void setLossFromDisposalOfFixedAssets(
			String lossFromDisposalOfFixedAssets) {
		LossFromDisposalOfFixedAssets = lossFromDisposalOfFixedAssets;
	}

	/**  
	 * ��ȡ exchangeOfNonMonetaryAssetsLoss
	 * @return the exchangeOfNonMonetaryAssetsLoss ��Ӫҵ��֧����Ŀ�£�ծ��������ʧ 
	 */
	public String getExchangeOfNonMonetaryAssetsLoss() {
		return ExchangeOfNonMonetaryAssetsLoss;
	}

	/**  
	 * ���� exchangeOfNonMonetaryAssetsLoss  
	 * @param exchangeOfNonMonetaryAssetsLoss ��Ӫҵ��֧����Ŀ�£�ծ��������ʧ  
	 */
	public void setExchangeOfNonMonetaryAssetsLoss(
			String exchangeOfNonMonetaryAssetsLoss) {
		ExchangeOfNonMonetaryAssetsLoss = exchangeOfNonMonetaryAssetsLoss;
	}

	/**  
	 * ��ȡ lossOfLawsuits
	 * @return the lossOfLawsuits ��Ӫҵ��֧����Ŀ�£�����֧�� 
	 */
	public String getLossOfLawsuits() {
		return LossOfLawsuits;
	}

	/**  
	 * ���� lossOfLawsuits  
	 * @param lossOfLawsuits ��Ӫҵ��֧����Ŀ�£�����֧��  
	 */
	public void setLossOfLawsuits(String lossOfLawsuits) {
		LossOfLawsuits = lossOfLawsuits;
	}

	/**  
	 * ��ȡ paymentForDonation
	 * @return the paymentForDonation ��Ӫҵ��֧����Ŀ�£�����֧�� 
	 */
	public String getPaymentForDonation() {
		return PaymentForDonation;
	}

	/**  
	 * ���� paymentForDonation  
	 * @param paymentForDonation ��Ӫҵ��֧����Ŀ�£�����֧��  
	 */
	public void setPaymentForDonation(String paymentForDonation) {
		PaymentForDonation = paymentForDonation;
	}

	/**  
	 * ��ȡ otherPayments
	 * @return the otherPayments ����֧�� 
	 */
	public String getOtherPayments() {
		return OtherPayments;
	}

	/**  
	 * ���� otherPayments  
	 * @param otherPayments ����֧��  
	 */
	public void setOtherPayments(String otherPayments) {
		OtherPayments = otherPayments;
	}

	/**  
	 * ��ȡ balanceOfContentSalary
	 * @return the balanceOfContentSalary ������֧������ת�ĺ������ʰ��ɽ��� 
	 */
	public String getBalanceOfContentSalary() {
		return BalanceOfContentSalary;
	}

	/**  
	 * ���� balanceOfContentSalary  
	 * @param balanceOfContentSalary ������֧������ת�ĺ������ʰ��ɽ���  
	 */
	public void setBalanceOfContentSalary(String balanceOfContentSalary) {
		BalanceOfContentSalary = balanceOfContentSalary;
	}

	/**  
	 * ��ȡ totalProfit
	 * @return the totalProfit �����ܶ� 
	 */
	public String getTotalProfit() {
		return TotalProfit;
	}

	/**  
	 * ���� totalProfit  
	 * @param totalProfit �����ܶ�  
	 */
	public void setTotalProfit(String totalProfit) {
		TotalProfit = totalProfit;
	}

	/**  
	 * ��ȡ incometax
	 * @return the incometax ����˰ 
	 */
	public String getIncometax() {
		return Incometax;
	}

	/**  
	 * ���� incometax  
	 * @param incometax ����˰  
	 */
	public void setIncometax(String incometax) {
		Incometax = incometax;
	}

	/**  
	 * ��ȡ imparimentLoss
	 * @return the imparimentLoss �����ɶ����� 
	 */
	public String getImparimentLoss() {
		return ImparimentLoss;
	}

	/**  
	 * ���� imparimentLoss  
	 * @param imparimentLoss �����ɶ�����  
	 */
	public void setImparimentLoss(String imparimentLoss) {
		ImparimentLoss = imparimentLoss;
	}

	/**  
	 * ��ȡ unrealizedInvestmentLosses
	 * @return the unrealizedInvestmentLosses δȷ�ϵ�Ͷ����ʧ 
	 */
	public String getUnrealizedInvestmentLosses() {
		return UnrealizedInvestmentLosses;
	}

	/**  
	 * ���� unrealizedInvestmentLosses  
	 * @param unrealizedInvestmentLosses δȷ�ϵ�Ͷ����ʧ  
	 */
	public void setUnrealizedInvestmentLosses(String unrealizedInvestmentLosses) {
		UnrealizedInvestmentLosses = unrealizedInvestmentLosses;
	}

	/**  
	 * ��ȡ netProfit
	 * @return the netProfit ������ 
	 */
	public String getNetProfit() {
		return NetProfit;
	}

	/**  
	 * ���� netProfit  
	 * @param netProfit ������  
	 */
	public void setNetProfit(String netProfit) {
		NetProfit = netProfit;
	}

	/**  
	 * ��ȡ profitDistributionAtBeginningOfPeriod
	 * @return the profitDistributionAtBeginningOfPeriod ���δ�������� 
	 */
	public String getProfitDistributionAtBeginningOfPeriod() {
		return ProfitDistributionAtBeginningOfPeriod;
	}

	/**  
	 * ���� profitDistributionAtBeginningOfPeriod  
	 * @param profitDistributionAtBeginningOfPeriod ���δ��������  
	 */
	public void setProfitDistributionAtBeginningOfPeriod(
			String profitDistributionAtBeginningOfPeriod) {
		ProfitDistributionAtBeginningOfPeriod = profitDistributionAtBeginningOfPeriod;
	}

	/**  
	 * ��ȡ compensationOfSurplusReserve
	 * @return the compensationOfSurplusReserve ӯ�๫������ 
	 */
	public String getCompensationOfSurplusReserve() {
		return CompensationOfSurplusReserve;
	}

	/**  
	 * ���� compensationOfSurplusReserve  
	 * @param compensationOfSurplusReserve ӯ�๫������  
	 */
	public void setCompensationOfSurplusReserve(String compensationOfSurplusReserve) {
		CompensationOfSurplusReserve = compensationOfSurplusReserve;
	}

	/**  
	 * ��ȡ otherAdjustmentFactors
	 * @return the otherAdjustmentFactors ������������ 
	 */
	public String getOtherAdjustmentFactors() {
		return OtherAdjustmentFactors;
	}

	/**  
	 * ���� otherAdjustmentFactors  
	 * @param otherAdjustmentFactors ������������  
	 */
	public void setOtherAdjustmentFactors(String otherAdjustmentFactors) {
		OtherAdjustmentFactors = otherAdjustmentFactors;
	}

	/**  
	 * ��ȡ profitAvailableForDistribution
	 * @return the profitAvailableForDistribution �ɹ���������� 
	 */
	public String getProfitAvailableForDistribution() {
		return ProfitAvailableForDistribution;
	}

	/**  
	 * ���� profitAvailableForDistribution  
	 * @param profitAvailableForDistribution �ɹ����������  
	 */
	public void setProfitAvailableForDistribution(
			String profitAvailableForDistribution) {
		ProfitAvailableForDistribution = profitAvailableForDistribution;
	}

	/**  
	 * ��ȡ profitReservedForASingleItem
	 * @return the profitReservedForASingleItem �������õ����� 
	 */
	public String getProfitReservedForASingleItem() {
		return ProfitReservedForASingleItem;
	}

	/**  
	 * ���� profitReservedForASingleItem  
	 * @param profitReservedForASingleItem �������õ�����  
	 */
	public void setProfitReservedForASingleItem(String profitReservedForASingleItem) {
		ProfitReservedForASingleItem = profitReservedForASingleItem;
	}

	/**  
	 * ��ȡ supplementaryCurrentCapital
	 * @return the supplementaryCurrentCapital ���������ʱ� 
	 */
	public String getSupplementaryCurrentCapital() {
		return SupplementaryCurrentCapital;
	}

	/**  
	 * ���� supplementaryCurrentCapital  
	 * @param supplementaryCurrentCapital ���������ʱ�  
	 */
	public void setSupplementaryCurrentCapital(String supplementaryCurrentCapital) {
		SupplementaryCurrentCapital = supplementaryCurrentCapital;
	}

	/**  
	 * ��ȡ appropriationOfStatutorySurplusReserves
	 * @return the appropriationOfStatutorySurplusReserves ��ȡ����ӯ�๫�� 
	 */
	public String getAppropriationOfStatutorySurplusReserves() {
		return AppropriationOfStatutorySurplusReserves;
	}

	/**  
	 * ���� appropriationOfStatutorySurplusReserves  
	 * @param appropriationOfStatutorySurplusReserves ��ȡ����ӯ�๫��  
	 */
	public void setAppropriationOfStatutorySurplusReserves(
			String appropriationOfStatutorySurplusReserves) {
		AppropriationOfStatutorySurplusReserves = appropriationOfStatutorySurplusReserves;
	}

	/**  
	 * ��ȡ appropriationOfStatutoryWelfareFund
	 * @return the appropriationOfStatutoryWelfareFund ��ȡ��������� 
	 */
	public String getAppropriationOfStatutoryWelfareFund() {
		return AppropriationOfStatutoryWelfareFund;
	}

	/**  
	 * ���� appropriationOfStatutoryWelfareFund  
	 * @param appropriationOfStatutoryWelfareFund ��ȡ���������  
	 */
	public void setAppropriationOfStatutoryWelfareFund(
			String appropriationOfStatutoryWelfareFund) {
		AppropriationOfStatutoryWelfareFund = appropriationOfStatutoryWelfareFund;
	}

	/**  
	 * ��ȡ appropriationOfStaffIncentiveAndWelfareFund
	 * @return the appropriationOfStaffIncentiveAndWelfareFund ��ȡְ���������������� 
	 */
	public String getAppropriationOfStaffIncentiveAndWelfareFund() {
		return AppropriationOfStaffIncentiveAndWelfareFund;
	}

	/**  
	 * ���� appropriationOfStaffIncentiveAndWelfareFund  
	 * @param appropriationOfStaffIncentiveAndWelfareFund ��ȡְ����������������  
	 */
	public void setAppropriationOfStaffIncentiveAndWelfareFund(
			String appropriationOfStaffIncentiveAndWelfareFund) {
		AppropriationOfStaffIncentiveAndWelfareFund = appropriationOfStaffIncentiveAndWelfareFund;
	}

	/**  
	 * ��ȡ appropriationOfReserveFund
	 * @return the appropriationOfReserveFund ��ȡ�������� 
	 */
	public String getAppropriationOfReserveFund() {
		return AppropriationOfReserveFund;
	}

	/**  
	 * ���� appropriationOfReserveFund  
	 * @param appropriationOfReserveFund ��ȡ��������  
	 */
	public void setAppropriationOfReserveFund(String appropriationOfReserveFund) {
		AppropriationOfReserveFund = appropriationOfReserveFund;
	}

	/**  
	 * ��ȡ appropriationOfEnterpriseExpansionFund
	 * @return the appropriationOfEnterpriseExpansionFund ��ȡ��ҵ��չ���� 
	 */
	public String getAppropriationOfEnterpriseExpansionFund() {
		return AppropriationOfEnterpriseExpansionFund;
	}

	/**  
	 * ���� appropriationOfEnterpriseExpansionFund  
	 * @param appropriationOfEnterpriseExpansionFund ��ȡ��ҵ��չ����  
	 */
	public void setAppropriationOfEnterpriseExpansionFund(
			String appropriationOfEnterpriseExpansionFund) {
		AppropriationOfEnterpriseExpansionFund = appropriationOfEnterpriseExpansionFund;
	}

	/**  
	 * ��ȡ profitsCapitalizadOnReturnOfInvestment
	 * @return the profitsCapitalizadOnReturnOfInvestment ����黹Ͷ�� 
	 */
	public String getProfitsCapitalizadOnReturnOfInvestment() {
		return ProfitsCapitalizadOnReturnOfInvestment;
	}

	/**  
	 * ���� profitsCapitalizadOnReturnOfInvestment  
	 * @param profitsCapitalizadOnReturnOfInvestment ����黹Ͷ��  
	 */
	public void setProfitsCapitalizadOnReturnOfInvestment(
			String profitsCapitalizadOnReturnOfInvestment) {
		ProfitsCapitalizadOnReturnOfInvestment = profitsCapitalizadOnReturnOfInvestment;
	}

	/**  
	 * ��ȡ others
	 * @return the others ���ɹ�����������Ŀ�£����� 
	 */
	public String getOthers() {
		return Others;
	}

	/**  
	 * ���� others  
	 * @param others ���ɹ�����������Ŀ�£�����  
	 */
	public void setOthers(String others) {
		Others = others;
	}

	/**  
	 * ��ȡ profitAvailableForOwnersDistribution
	 * @return the profitAvailableForOwnersDistribution �ɹ�Ͷ���߷�������� 
	 */
	public String getProfitAvailableForOwnersDistribution() {
		return ProfitAvailableForOwnersDistribution;
	}

	/**  
	 * ���� profitAvailableForOwnersDistribution  
	 * @param profitAvailableForOwnersDistribution �ɹ�Ͷ���߷��������  
	 */
	public void setProfitAvailableForOwnersDistribution(
			String profitAvailableForOwnersDistribution) {
		ProfitAvailableForOwnersDistribution = profitAvailableForOwnersDistribution;
	}

	/**  
	 * ��ȡ preferredStockDividendsPayable
	 * @return the preferredStockDividendsPayable Ӧ�����ȹɹ��� 
	 */
	public String getPreferredStockDividendsPayable() {
		return PreferredStockDividendsPayable;
	}

	/**  
	 * ���� preferredStockDividendsPayable  
	 * @param preferredStockDividendsPayable Ӧ�����ȹɹ���  
	 */
	public void setPreferredStockDividendsPayable(
			String preferredStockDividendsPayable) {
		PreferredStockDividendsPayable = preferredStockDividendsPayable;
	}

	/**  
	 * ��ȡ withdrawalOtherCommonAccumulationFund
	 * @return the withdrawalOtherCommonAccumulationFund ��ȡ����ӯ�๫�� 
	 */
	public String getWithdrawalOtherCommonAccumulationFund() {
		return WithdrawalOtherCommonAccumulationFund;
	}

	/**  
	 * ���� withdrawalOtherCommonAccumulationFund  
	 * @param withdrawalOtherCommonAccumulationFund ��ȡ����ӯ�๫��  
	 */
	public void setWithdrawalOtherCommonAccumulationFund(
			String withdrawalOtherCommonAccumulationFund) {
		WithdrawalOtherCommonAccumulationFund = withdrawalOtherCommonAccumulationFund;
	}

	/**  
	 * ��ȡ payableDividendsOfCommonStock
	 * @return the payableDividendsOfCommonStock Ӧ����ͨ�ɹ��� 
	 */
	public String getPayableDividendsOfCommonStock() {
		return PayableDividendsOfCommonStock;
	}

	/**  
	 * ���� payableDividendsOfCommonStock  
	 * @param payableDividendsOfCommonStock Ӧ����ͨ�ɹ���  
	 */
	public void setPayableDividendsOfCommonStock(
			String payableDividendsOfCommonStock) {
		PayableDividendsOfCommonStock = payableDividendsOfCommonStock;
	}

	/**  
	 * ��ȡ transferFromOrdinarySharesDividendToPaidInCapitalOrStock
	 * @return the transferFromOrdinarySharesDividendToPaidInCapitalOrStock ת���ʱ�����ͨ�ɹ��� 
	 */
	public String getTransferFromOrdinarySharesDividendToPaidInCapitalOrStock() {
		return TransferFromOrdinarySharesDividendToPaidInCapitalOrStock;
	}

	/**  
	 * ���� transferFromOrdinarySharesDividendToPaidInCapitalOrStock  
	 * @param transferFromOrdinarySharesDividendToPaidInCapitalOrStock ת���ʱ�����ͨ�ɹ���  
	 */
	public void setTransferFromOrdinarySharesDividendToPaidInCapitalOrStock(
			String transferFromOrdinarySharesDividendToPaidInCapitalOrStock) {
		TransferFromOrdinarySharesDividendToPaidInCapitalOrStock = transferFromOrdinarySharesDividendToPaidInCapitalOrStock;
	}

	/**  
	 * ��ȡ othersForOwners
	 * @return the othersForOwners ���ɹ�Ͷ���߷���������Ŀ�£����� 
	 */
	public String getOthersForOwners() {
		return OthersForOwners;
	}

	/**  
	 * ���� othersForOwners  
	 * @param othersForOwners ���ɹ�Ͷ���߷���������Ŀ�£�����  
	 */
	public void setOthersForOwners(String othersForOwners) {
		OthersForOwners = othersForOwners;
	}

	/**  
	 * ��ȡ unappropriatedProfit
	 * @return the unappropriatedProfit δ�������� 
	 */
	public String getUnappropriatedProfit() {
		return UnappropriatedProfit;
	}

	/**  
	 * ���� unappropriatedProfit  
	 * @param unappropriatedProfit δ��������  
	 */
	public void setUnappropriatedProfit(String unappropriatedProfit) {
		UnappropriatedProfit = unappropriatedProfit;
	}

	/**  
	 * ��ȡ lossCompensatedBeforeTheTax
	 * @return the lossCompensatedBeforeTheTax ��δ���������Ŀ�£�Ӧ���Ժ����˰ǰ�����ֲ��Ŀ��� 
	 */
	public String getLossCompensatedBeforeTheTax() {
		return LossCompensatedBeforeTheTax;
	}

	/**  
	 * ���� lossCompensatedBeforeTheTax  
	 * @param lossCompensatedBeforeTheTax ��δ���������Ŀ�£�Ӧ���Ժ����˰ǰ�����ֲ��Ŀ���  
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
