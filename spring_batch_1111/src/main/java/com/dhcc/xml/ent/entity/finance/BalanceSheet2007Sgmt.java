package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: BalanceSheet2007Sgmt<br/>
 * Description:2007���ʲ���ծ���<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "CurrencyFunds", "FinancialAssetsHeldForTrading",
		"NotesReceivable", "AccountsReceivable", "Prepayments",
		"InterestReceivable", "DividendsReceivable", "OtherReceivables",
		"Inventories", "CurrentPortionOfNonCurrentAssets",
		"OtherCurrentAssets", "TotalCurrentAssets",
		"FinancialAssetsAvailableForSale", "HeldToMaturityInvestments",
		"LongTermEquityInvestment", "LongTermReceivables",
		"InvestmentProperties", "FixedAssets", "ConstructionInProgress",
		"ConstructionMaterials", "FixedAssetsPendingForDisposal",
		"NonCurrentBiologicalAssets", "OilAndGasAssets", "IntangibleAssets",
		"DevelopmentDisbursements", "Goodwill", "LongTermDeferredExpenses",
		"DeferredTaxAssets", "OtherNonCurrentAssets", "TotalNonCurrentAssets",
		"TotalAssets", "ShortTermBorrowings",
		"FinancialLiabilitiesHeldForTrading", "NotesPayable",
		"AccountsPayable", "ReceiptsInAdvance", "InterestPayable",
		"EmployeeBenefitsPayable", "TaxsPayable", "DividendsPayable",
		"OtherPayables", "CurrentPortionOfLongTermLiabilities",
		"OtherCurrentLiabilities", "TotalCurrentLiabilities",
		"LongTermBorrowings", "BondsPayables", "LongTermPayables",
		"GrantsPayable", "Provisions", "DeferredTaxLiabilities",
		"OtherNonCurrentLiabilities", "TotalNonCurrentLiabilities",
		"TotalLiabilities", "PaidInCapitalOrShareCapital", "CapitalrRserve",
		"LessTreasuryStocks", "SurplusReserve", "UnappropriatedProfit",
		"TotalEquity", "TotalEquityAndLiabilities" },namespace = "com.dhcc.xml.ent.entity.finance")
// ָ�����гɵ�xml�ڵ�˳��
public class BalanceSheet2007Sgmt {
	/**
	 *�����ʽ�
	 */
	@XmlElement
	private String CurrencyFunds;
	/**
	 *�����Խ����ʲ�
	 */
	@XmlElement
	private String FinancialAssetsHeldForTrading;
	/**
	 *Ӧ��Ʊ��
	 */
	@XmlElement
	private String NotesReceivable;
	/**
	 *Ӧ���˿�
	 */
	@XmlElement
	private String AccountsReceivable;
	/**
	 *Ԥ���˿�
	 */
	@XmlElement
	private String Prepayments;
	/**
	 *Ӧ����Ϣ
	 */
	@XmlElement
	private String InterestReceivable;
	/**
	 *Ӧ�չ���
	 */
	@XmlElement
	private String DividendsReceivable;
	/**
	 *����Ӧ�տ�
	 */
	@XmlElement
	private String OtherReceivables;
	/**
	 *���
	 */
	@XmlElement
	private String Inventories;
	/**
	 *һ���ڵ��ڵķ������ʲ�
	 */
	@XmlElement
	private String CurrentPortionOfNonCurrentAssets;
	/**
	 *���������ʲ�
	 */
	@XmlElement
	private String OtherCurrentAssets;
	/**
	 *�����ʲ��ϼ�
	 */
	@XmlElement
	private String TotalCurrentAssets;
	/**
	 *�ɹ����۵Ľ����ʲ�
	 */
	@XmlElement
	private String FinancialAssetsAvailableForSale;
	/**
	 *����������Ͷ��
	 */
	@XmlElement
	private String HeldToMaturityInvestments;
	/**
	 *���ڹ�ȨͶ��
	 */
	@XmlElement
	private String LongTermEquityInvestment;
	/**
	 *����Ӧ�տ�
	 */
	@XmlElement
	private String LongTermReceivables;
	/**
	 *Ͷ���Է��ز�
	 */
	@XmlElement
	private String InvestmentProperties;
	/**
	 *�̶��ʲ�
	 */
	@XmlElement
	private String FixedAssets;
	/**
	 *�ڽ�����
	 */
	@XmlElement
	private String ConstructionInProgress;
	/**
	 *��������
	 */
	@XmlElement
	private String ConstructionMaterials;
	/**
	 *�̶��ʲ�����
	 */
	@XmlElement
	private String FixedAssetsPendingForDisposal;
	/**
	 *�����������ʲ�
	 */
	@XmlElement
	private String NonCurrentBiologicalAssets;
	/**
	 *�����ʲ�
	 */
	@XmlElement
	private String OilAndGasAssets;
	/**
	 *�����ʲ�
	 */
	@XmlElement
	private String IntangibleAssets;
	/**
	 *����֧��
	 */
	@XmlElement
	private String DevelopmentDisbursements;
	/**
	 *����
	 */
	@XmlElement
	private String Goodwill;
	/**
	 *���ڴ�̯����
	 */
	@XmlElement
	private String LongTermDeferredExpenses;
	/**
	 *��������˰�ʲ�
	 */
	@XmlElement
	private String DeferredTaxAssets;
	/**
	 *�����������ʲ�
	 */
	@XmlElement
	private String OtherNonCurrentAssets;
	/**
	 *�������ʲ��ϼ�
	 */
	@XmlElement
	private String TotalNonCurrentAssets;
	/**
	 *�ʲ��ܼ�
	 */
	@XmlElement
	private String TotalAssets;
	/**
	 *���ڽ��
	 */
	@XmlElement
	private String ShortTermBorrowings;
	/**
	 *�����Խ��ڸ�ծ
	 */
	@XmlElement
	private String FinancialLiabilitiesHeldForTrading;
	/**
	 *Ӧ��Ʊ��
	 */
	@XmlElement
	private String NotesPayable;
	/**
	 *Ӧ���˿�
	 */
	@XmlElement
	private String AccountsPayable;
	/**
	 *Ԥ���˿�
	 */
	@XmlElement
	private String ReceiptsInAdvance;
	/**
	 *Ӧ����Ϣ
	 */
	@XmlElement
	private String InterestPayable;
	/**
	 *Ӧ��ְ��н��
	 */
	@XmlElement
	private String EmployeeBenefitsPayable;
	/**
	 *Ӧ��˰��
	 */
	@XmlElement
	private String TaxsPayable;
	/**
	 *Ӧ������
	 */
	@XmlElement
	private String DividendsPayable;
	/**
	 *����Ӧ����
	 */
	@XmlElement
	private String OtherPayables;
	/**
	 *һ���ڵ��ڵķ�������ծ
	 */
	@XmlElement
	private String CurrentPortionOfLongTermLiabilities;
	/**
	 *����������ծ
	 */
	@XmlElement
	private String OtherCurrentLiabilities;
	/**
	 *������ծ�ϼ�
	 */
	@XmlElement
	private String TotalCurrentLiabilities;
	/**
	 *���ڽ��
	 */
	@XmlElement
	private String LongTermBorrowings;
	/**
	 *Ӧ��ծȯ
	 */
	@XmlElement
	private String BondsPayables;
	/**
	 *����Ӧ����
	 */
	@XmlElement
	private String LongTermPayables;
	/**
	 *ר��Ӧ����
	 */
	@XmlElement
	private String GrantsPayable;
	/**
	 *Ԥ�Ƹ�ծ
	 */
	@XmlElement
	private String Provisions;
	/**
	 *��������˰��ծ
	 */
	@XmlElement
	private String DeferredTaxLiabilities;
	/**
	 *������������ծ
	 */
	@XmlElement
	private String OtherNonCurrentLiabilities;
	/**
	 *��������ծ�ϼ�
	 */
	@XmlElement
	private String TotalNonCurrentLiabilities;
	/**
	 *��ծ�ϼ�
	 */
	@XmlElement
	private String TotalLiabilities;
	/**
	 *ʵ���ʱ�����ɱ���
	 */
	@XmlElement
	private String PaidInCapitalOrShareCapital;
	/**
	 *�ʱ�����
	 */
	@XmlElement
	private String CapitalrRserve;
	/**
	 *��������
	 */
	@XmlElement
	private String LessTreasuryStocks;
	/**
	 *ӯ�๫��
	 */
	@XmlElement
	private String SurplusReserve;
	/**
	 *δ��������
	 */
	@XmlElement
	private String UnappropriatedProfit;
	/**
	 *������Ȩ��ϼ�
	 */
	@XmlElement
	private String TotalEquity;
	/**
	 *��ծ��������Ȩ��ϼ�
	 */
	@XmlElement
	private String TotalEquityAndLiabilities;

	public BalanceSheet2007Sgmt() {
		super();
	}

	/**
	 * ��ȡ currencyFunds
	 * 
	 * @return the currencyFunds �����ʽ�
	 */
	public String getCurrencyFunds() {
		return CurrencyFunds;
	}

	/**
	 * ���� currencyFunds
	 * 
	 * @param currencyFunds
	 *            �����ʽ�
	 */
	public void setCurrencyFunds(String currencyFunds) {
		CurrencyFunds = currencyFunds;
	}

	/**
	 * ��ȡ financialAssetsHeldForTrading
	 * 
	 * @return the financialAssetsHeldForTrading �����Խ����ʲ�
	 */
	public String getFinancialAssetsHeldForTrading() {
		return FinancialAssetsHeldForTrading;
	}

	/**
	 * ���� financialAssetsHeldForTrading
	 * 
	 * @param financialAssetsHeldForTrading
	 *            �����Խ����ʲ�
	 */
	public void setFinancialAssetsHeldForTrading(
			String financialAssetsHeldForTrading) {
		FinancialAssetsHeldForTrading = financialAssetsHeldForTrading;
	}

	/**
	 * ��ȡ notesReceivable
	 * 
	 * @return the notesReceivable Ӧ��Ʊ��
	 */
	public String getNotesReceivable() {
		return NotesReceivable;
	}

	/**
	 * ���� notesReceivable
	 * 
	 * @param notesReceivable
	 *            Ӧ��Ʊ��
	 */
	public void setNotesReceivable(String notesReceivable) {
		NotesReceivable = notesReceivable;
	}

	/**
	 * ��ȡ accountsReceivable
	 * 
	 * @return the accountsReceivable Ӧ���˿�
	 */
	public String getAccountsReceivable() {
		return AccountsReceivable;
	}

	/**
	 * ���� accountsReceivable
	 * 
	 * @param accountsReceivable
	 *            Ӧ���˿�
	 */
	public void setAccountsReceivable(String accountsReceivable) {
		AccountsReceivable = accountsReceivable;
	}

	/**
	 * ��ȡ prepayments
	 * 
	 * @return the prepayments Ԥ���˿�
	 */
	public String getPrepayments() {
		return Prepayments;
	}

	/**
	 * ���� prepayments
	 * 
	 * @param prepayments
	 *            Ԥ���˿�
	 */
	public void setPrepayments(String prepayments) {
		Prepayments = prepayments;
	}

	/**
	 * ��ȡ interestReceivable
	 * 
	 * @return the interestReceivable Ӧ����Ϣ
	 */
	public String getInterestReceivable() {
		return InterestReceivable;
	}

	/**
	 * ���� interestReceivable
	 * 
	 * @param interestReceivable
	 *            Ӧ����Ϣ
	 */
	public void setInterestReceivable(String interestReceivable) {
		InterestReceivable = interestReceivable;
	}

	/**
	 * ��ȡ dividendsReceivable
	 * 
	 * @return the dividendsReceivable Ӧ�չ���
	 */
	public String getDividendsReceivable() {
		return DividendsReceivable;
	}

	/**
	 * ���� dividendsReceivable
	 * 
	 * @param dividendsReceivable
	 *            Ӧ�չ���
	 */
	public void setDividendsReceivable(String dividendsReceivable) {
		DividendsReceivable = dividendsReceivable;
	}

	/**
	 * ��ȡ otherReceivables
	 * 
	 * @return the otherReceivables ����Ӧ�տ�
	 */
	public String getOtherReceivables() {
		return OtherReceivables;
	}

	/**
	 * ���� otherReceivables
	 * 
	 * @param otherReceivables
	 *            ����Ӧ�տ�
	 */
	public void setOtherReceivables(String otherReceivables) {
		OtherReceivables = otherReceivables;
	}

	/**
	 * ��ȡ inventories
	 * 
	 * @return the inventories ���
	 */
	public String getInventories() {
		return Inventories;
	}

	/**
	 * ���� inventories
	 * 
	 * @param inventories
	 *            ���
	 */
	public void setInventories(String inventories) {
		Inventories = inventories;
	}

	/**
	 * ��ȡ currentPortionOfNonCurrentAssets
	 * 
	 * @return the currentPortionOfNonCurrentAssets һ���ڵ��ڵķ������ʲ�
	 */
	public String getCurrentPortionOfNonCurrentAssets() {
		return CurrentPortionOfNonCurrentAssets;
	}

	/**
	 * ���� currentPortionOfNonCurrentAssets
	 * 
	 * @param currentPortionOfNonCurrentAssets
	 *            һ���ڵ��ڵķ������ʲ�
	 */
	public void setCurrentPortionOfNonCurrentAssets(
			String currentPortionOfNonCurrentAssets) {
		CurrentPortionOfNonCurrentAssets = currentPortionOfNonCurrentAssets;
	}

	/**
	 * ��ȡ otherCurrentAssets
	 * 
	 * @return the otherCurrentAssets ���������ʲ�
	 */
	public String getOtherCurrentAssets() {
		return OtherCurrentAssets;
	}

	/**
	 * ���� otherCurrentAssets
	 * 
	 * @param otherCurrentAssets
	 *            ���������ʲ�
	 */
	public void setOtherCurrentAssets(String otherCurrentAssets) {
		OtherCurrentAssets = otherCurrentAssets;
	}

	/**
	 * ��ȡ totalCurrentAssets
	 * 
	 * @return the totalCurrentAssets �����ʲ��ϼ�
	 */
	public String getTotalCurrentAssets() {
		return TotalCurrentAssets;
	}

	/**
	 * ���� totalCurrentAssets
	 * 
	 * @param totalCurrentAssets
	 *            �����ʲ��ϼ�
	 */
	public void setTotalCurrentAssets(String totalCurrentAssets) {
		TotalCurrentAssets = totalCurrentAssets;
	}

	/**
	 * ��ȡ financialAssetsAvailableForSale
	 * 
	 * @return the financialAssetsAvailableForSale �ɹ����۵Ľ����ʲ�
	 */
	public String getFinancialAssetsAvailableForSale() {
		return FinancialAssetsAvailableForSale;
	}

	/**
	 * ���� financialAssetsAvailableForSale
	 * 
	 * @param financialAssetsAvailableForSale
	 *            �ɹ����۵Ľ����ʲ�
	 */
	public void setFinancialAssetsAvailableForSale(
			String financialAssetsAvailableForSale) {
		FinancialAssetsAvailableForSale = financialAssetsAvailableForSale;
	}

	/**
	 * ��ȡ heldToMaturityInvestments
	 * 
	 * @return the heldToMaturityInvestments ����������Ͷ��
	 */
	public String getHeldToMaturityInvestments() {
		return HeldToMaturityInvestments;
	}

	/**
	 * ���� heldToMaturityInvestments
	 * 
	 * @param heldToMaturityInvestments
	 *            ����������Ͷ��
	 */
	public void setHeldToMaturityInvestments(String heldToMaturityInvestments) {
		HeldToMaturityInvestments = heldToMaturityInvestments;
	}

	/**
	 * ��ȡ longTermEquityInvestment
	 * 
	 * @return the longTermEquityInvestment ���ڹ�ȨͶ��
	 */
	public String getLongTermEquityInvestment() {
		return LongTermEquityInvestment;
	}

	/**
	 * ���� longTermEquityInvestment
	 * 
	 * @param longTermEquityInvestment
	 *            ���ڹ�ȨͶ��
	 */
	public void setLongTermEquityInvestment(String longTermEquityInvestment) {
		LongTermEquityInvestment = longTermEquityInvestment;
	}

	/**
	 * ��ȡ longTermReceivables
	 * 
	 * @return the longTermReceivables ����Ӧ�տ�
	 */
	public String getLongTermReceivables() {
		return LongTermReceivables;
	}

	/**
	 * ���� longTermReceivables
	 * 
	 * @param longTermReceivables
	 *            ����Ӧ�տ�
	 */
	public void setLongTermReceivables(String longTermReceivables) {
		LongTermReceivables = longTermReceivables;
	}

	/**
	 * ��ȡ investmentProperties
	 * 
	 * @return the investmentProperties Ͷ���Է��ز�
	 */
	public String getInvestmentProperties() {
		return InvestmentProperties;
	}

	/**
	 * ���� investmentProperties
	 * 
	 * @param investmentProperties
	 *            Ͷ���Է��ز�
	 */
	public void setInvestmentProperties(String investmentProperties) {
		InvestmentProperties = investmentProperties;
	}

	/**
	 * ��ȡ fixedAssets
	 * 
	 * @return the fixedAssets �̶��ʲ�
	 */
	public String getFixedAssets() {
		return FixedAssets;
	}

	/**
	 * ���� fixedAssets
	 * 
	 * @param fixedAssets
	 *            �̶��ʲ�
	 */
	public void setFixedAssets(String fixedAssets) {
		FixedAssets = fixedAssets;
	}

	/**
	 * ��ȡ constructionInProgress
	 * 
	 * @return the constructionInProgress �ڽ�����
	 */
	public String getConstructionInProgress() {
		return ConstructionInProgress;
	}

	/**
	 * ���� constructionInProgress
	 * 
	 * @param constructionInProgress
	 *            �ڽ�����
	 */
	public void setConstructionInProgress(String constructionInProgress) {
		ConstructionInProgress = constructionInProgress;
	}

	/**
	 * ��ȡ constructionMaterials
	 * 
	 * @return the constructionMaterials ��������
	 */
	public String getConstructionMaterials() {
		return ConstructionMaterials;
	}

	/**
	 * ���� constructionMaterials
	 * 
	 * @param constructionMaterials
	 *            ��������
	 */
	public void setConstructionMaterials(String constructionMaterials) {
		ConstructionMaterials = constructionMaterials;
	}

	/**
	 * ��ȡ fixedAssetsPendingForDisposal
	 * 
	 * @return the fixedAssetsPendingForDisposal �̶��ʲ�����
	 */
	public String getFixedAssetsPendingForDisposal() {
		return FixedAssetsPendingForDisposal;
	}

	/**
	 * ���� fixedAssetsPendingForDisposal
	 * 
	 * @param fixedAssetsPendingForDisposal
	 *            �̶��ʲ�����
	 */
	public void setFixedAssetsPendingForDisposal(
			String fixedAssetsPendingForDisposal) {
		FixedAssetsPendingForDisposal = fixedAssetsPendingForDisposal;
	}

	/**
	 * ��ȡ nonCurrentBiologicalAssets
	 * 
	 * @return the nonCurrentBiologicalAssets �����������ʲ�
	 */
	public String getNonCurrentBiologicalAssets() {
		return NonCurrentBiologicalAssets;
	}

	/**
	 * ���� nonCurrentBiologicalAssets
	 * 
	 * @param nonCurrentBiologicalAssets
	 *            �����������ʲ�
	 */
	public void setNonCurrentBiologicalAssets(String nonCurrentBiologicalAssets) {
		NonCurrentBiologicalAssets = nonCurrentBiologicalAssets;
	}

	/**
	 * ��ȡ oilAndGasAssets
	 * 
	 * @return the oilAndGasAssets �����ʲ�
	 */
	public String getOilAndGasAssets() {
		return OilAndGasAssets;
	}

	/**
	 * ���� oilAndGasAssets
	 * 
	 * @param oilAndGasAssets
	 *            �����ʲ�
	 */
	public void setOilAndGasAssets(String oilAndGasAssets) {
		OilAndGasAssets = oilAndGasAssets;
	}

	/**
	 * ��ȡ intangibleAssets
	 * 
	 * @return the intangibleAssets �����ʲ�
	 */
	public String getIntangibleAssets() {
		return IntangibleAssets;
	}

	/**
	 * ���� intangibleAssets
	 * 
	 * @param intangibleAssets
	 *            �����ʲ�
	 */
	public void setIntangibleAssets(String intangibleAssets) {
		IntangibleAssets = intangibleAssets;
	}

	/**
	 * ��ȡ developmentDisbursements
	 * 
	 * @return the developmentDisbursements ����֧��
	 */
	public String getDevelopmentDisbursements() {
		return DevelopmentDisbursements;
	}

	/**
	 * ���� developmentDisbursements
	 * 
	 * @param developmentDisbursements
	 *            ����֧��
	 */
	public void setDevelopmentDisbursements(String developmentDisbursements) {
		DevelopmentDisbursements = developmentDisbursements;
	}

	/**
	 * ��ȡ goodwill
	 * 
	 * @return the goodwill ����
	 */
	public String getGoodwill() {
		return Goodwill;
	}

	/**
	 * ���� goodwill
	 * 
	 * @param goodwill
	 *            ����
	 */
	public void setGoodwill(String goodwill) {
		Goodwill = goodwill;
	}

	/**
	 * ��ȡ longTermDeferredExpenses
	 * 
	 * @return the longTermDeferredExpenses ���ڴ�̯����
	 */
	public String getLongTermDeferredExpenses() {
		return LongTermDeferredExpenses;
	}

	/**
	 * ���� longTermDeferredExpenses
	 * 
	 * @param longTermDeferredExpenses
	 *            ���ڴ�̯����
	 */
	public void setLongTermDeferredExpenses(String longTermDeferredExpenses) {
		LongTermDeferredExpenses = longTermDeferredExpenses;
	}

	/**
	 * ��ȡ deferredTaxAssets
	 * 
	 * @return the deferredTaxAssets ��������˰�ʲ�
	 */
	public String getDeferredTaxAssets() {
		return DeferredTaxAssets;
	}

	/**
	 * ���� deferredTaxAssets
	 * 
	 * @param deferredTaxAssets
	 *            ��������˰�ʲ�
	 */
	public void setDeferredTaxAssets(String deferredTaxAssets) {
		DeferredTaxAssets = deferredTaxAssets;
	}

	/**
	 * ��ȡ otherNonCurrentAssets
	 * 
	 * @return the otherNonCurrentAssets �����������ʲ�
	 */
	public String getOtherNonCurrentAssets() {
		return OtherNonCurrentAssets;
	}

	/**
	 * ���� otherNonCurrentAssets
	 * 
	 * @param otherNonCurrentAssets
	 *            �����������ʲ�
	 */
	public void setOtherNonCurrentAssets(String otherNonCurrentAssets) {
		OtherNonCurrentAssets = otherNonCurrentAssets;
	}

	/**
	 * ��ȡ totalNonCurrentAssets
	 * 
	 * @return the totalNonCurrentAssets �������ʲ��ϼ�
	 */
	public String getTotalNonCurrentAssets() {
		return TotalNonCurrentAssets;
	}

	/**
	 * ���� totalNonCurrentAssets
	 * 
	 * @param totalNonCurrentAssets
	 *            �������ʲ��ϼ�
	 */
	public void setTotalNonCurrentAssets(String totalNonCurrentAssets) {
		TotalNonCurrentAssets = totalNonCurrentAssets;
	}

	/**
	 * ��ȡ totalAssets
	 * 
	 * @return the totalAssets �ʲ��ܼ�
	 */
	public String getTotalAssets() {
		return TotalAssets;
	}

	/**
	 * ���� totalAssets
	 * 
	 * @param totalAssets
	 *            �ʲ��ܼ�
	 */
	public void setTotalAssets(String totalAssets) {
		TotalAssets = totalAssets;
	}

	/**
	 * ��ȡ shortTermBorrowings
	 * 
	 * @return the shortTermBorrowings ���ڽ��
	 */
	public String getShortTermBorrowings() {
		return ShortTermBorrowings;
	}

	/**
	 * ���� shortTermBorrowings
	 * 
	 * @param shortTermBorrowings
	 *            ���ڽ��
	 */
	public void setShortTermBorrowings(String shortTermBorrowings) {
		ShortTermBorrowings = shortTermBorrowings;
	}

	/**
	 * ��ȡ financialLiabilitiesHeldForTrading
	 * 
	 * @return the financialLiabilitiesHeldForTrading �����Խ��ڸ�ծ
	 */
	public String getFinancialLiabilitiesHeldForTrading() {
		return FinancialLiabilitiesHeldForTrading;
	}

	/**
	 * ���� financialLiabilitiesHeldForTrading
	 * 
	 * @param financialLiabilitiesHeldForTrading
	 *            �����Խ��ڸ�ծ
	 */
	public void setFinancialLiabilitiesHeldForTrading(
			String financialLiabilitiesHeldForTrading) {
		FinancialLiabilitiesHeldForTrading = financialLiabilitiesHeldForTrading;
	}

	/**
	 * ��ȡ notesPayable
	 * 
	 * @return the notesPayable Ӧ��Ʊ��
	 */
	public String getNotesPayable() {
		return NotesPayable;
	}

	/**
	 * ���� notesPayable
	 * 
	 * @param notesPayable
	 *            Ӧ��Ʊ��
	 */
	public void setNotesPayable(String notesPayable) {
		NotesPayable = notesPayable;
	}



	/**  
	 * ��ȡ accountsPayable
	 * @return the accountsPayable Ӧ���˿� 
	 */
	public String getAccountsPayable() {
		return AccountsPayable;
	}

	/**  
	 * ���� accountsPayable  
	 * @param accountsPayable Ӧ���˿�  
	 */
	public void setAccountsPayable(String accountsPayable) {
		AccountsPayable = accountsPayable;
	}

	/**
	 * ��ȡ receiptsInAdvance
	 * 
	 * @return the receiptsInAdvance Ԥ���˿�
	 */
	public String getReceiptsInAdvance() {
		return ReceiptsInAdvance;
	}

	/**
	 * ���� receiptsInAdvance
	 * 
	 * @param receiptsInAdvance
	 *            Ԥ���˿�
	 */
	public void setReceiptsInAdvance(String receiptsInAdvance) {
		ReceiptsInAdvance = receiptsInAdvance;
	}

	/**
	 * ��ȡ interestPayable
	 * 
	 * @return the interestPayable Ӧ����Ϣ
	 */
	public String getInterestPayable() {
		return InterestPayable;
	}

	/**
	 * ���� interestPayable
	 * 
	 * @param interestPayable
	 *            Ӧ����Ϣ
	 */
	public void setInterestPayable(String interestPayable) {
		InterestPayable = interestPayable;
	}

	/**
	 * ��ȡ employeeBenefitsPayable
	 * 
	 * @return the employeeBenefitsPayable Ӧ��ְ��н��
	 */
	public String getEmployeeBenefitsPayable() {
		return EmployeeBenefitsPayable;
	}

	/**
	 * ���� employeeBenefitsPayable
	 * 
	 * @param employeeBenefitsPayable
	 *            Ӧ��ְ��н��
	 */
	public void setEmployeeBenefitsPayable(String employeeBenefitsPayable) {
		EmployeeBenefitsPayable = employeeBenefitsPayable;
	}

	/**
	 * ��ȡ taxsPayable
	 * 
	 * @return the taxsPayable Ӧ��˰��
	 */
	public String getTaxsPayable() {
		return TaxsPayable;
	}

	/**
	 * ���� taxsPayable
	 * 
	 * @param taxsPayable
	 *            Ӧ��˰��
	 */
	public void setTaxsPayable(String taxsPayable) {
		TaxsPayable = taxsPayable;
	}

	/**
	 * ��ȡ dividendsPayable
	 * 
	 * @return the dividendsPayable Ӧ������
	 */
	public String getDividendsPayable() {
		return DividendsPayable;
	}

	/**
	 * ���� dividendsPayable
	 * 
	 * @param dividendsPayable
	 *            Ӧ������
	 */
	public void setDividendsPayable(String dividendsPayable) {
		DividendsPayable = dividendsPayable;
	}

	/**
	 * ��ȡ otherPayables
	 * 
	 * @return the otherPayables ����Ӧ����
	 */
	public String getOtherPayables() {
		return OtherPayables;
	}

	/**
	 * ���� otherPayables
	 * 
	 * @param otherPayables
	 *            ����Ӧ����
	 */
	public void setOtherPayables(String otherPayables) {
		OtherPayables = otherPayables;
	}

	/**
	 * ��ȡ currentPortionOfLongTermLiabilities
	 * 
	 * @return the currentPortionOfLongTermLiabilities һ���ڵ��ڵķ�������ծ
	 */
	public String getCurrentPortionOfLongTermLiabilities() {
		return CurrentPortionOfLongTermLiabilities;
	}

	/**
	 * ���� currentPortionOfLongTermLiabilities
	 * 
	 * @param currentPortionOfLongTermLiabilities
	 *            һ���ڵ��ڵķ�������ծ
	 */
	public void setCurrentPortionOfLongTermLiabilities(
			String currentPortionOfLongTermLiabilities) {
		CurrentPortionOfLongTermLiabilities = currentPortionOfLongTermLiabilities;
	}

	/**
	 * ��ȡ otherCurrentLiabilities
	 * 
	 * @return the otherCurrentLiabilities ����������ծ
	 */
	public String getOtherCurrentLiabilities() {
		return OtherCurrentLiabilities;
	}

	/**
	 * ���� otherCurrentLiabilities
	 * 
	 * @param otherCurrentLiabilities
	 *            ����������ծ
	 */
	public void setOtherCurrentLiabilities(String otherCurrentLiabilities) {
		OtherCurrentLiabilities = otherCurrentLiabilities;
	}

	/**
	 * ��ȡ totalCurrentLiabilities
	 * 
	 * @return the totalCurrentLiabilities ������ծ�ϼ�
	 */
	public String getTotalCurrentLiabilities() {
		return TotalCurrentLiabilities;
	}

	/**
	 * ���� totalCurrentLiabilities
	 * 
	 * @param totalCurrentLiabilities
	 *            ������ծ�ϼ�
	 */
	public void setTotalCurrentLiabilities(String totalCurrentLiabilities) {
		TotalCurrentLiabilities = totalCurrentLiabilities;
	}

	/**
	 * ��ȡ longTermBorrowings
	 * 
	 * @return the longTermBorrowings ���ڽ��
	 */
	public String getLongTermBorrowings() {
		return LongTermBorrowings;
	}

	/**
	 * ���� longTermBorrowings
	 * 
	 * @param longTermBorrowings
	 *            ���ڽ��
	 */
	public void setLongTermBorrowings(String longTermBorrowings) {
		LongTermBorrowings = longTermBorrowings;
	}

	/**
	 * ��ȡ bondsPayables
	 * 
	 * @return the bondsPayables Ӧ��ծȯ
	 */
	public String getBondsPayables() {
		return BondsPayables;
	}

	/**
	 * ���� bondsPayables
	 * 
	 * @param bondsPayables
	 *            Ӧ��ծȯ
	 */
	public void setBondsPayables(String bondsPayables) {
		BondsPayables = bondsPayables;
	}

	/**
	 * ��ȡ longTermPayables
	 * 
	 * @return the longTermPayables ����Ӧ����
	 */
	public String getLongTermPayables() {
		return LongTermPayables;
	}

	/**
	 * ���� longTermPayables
	 * 
	 * @param longTermPayables
	 *            ����Ӧ����
	 */
	public void setLongTermPayables(String longTermPayables) {
		LongTermPayables = longTermPayables;
	}

	/**
	 * ��ȡ grantsPayable
	 * 
	 * @return the grantsPayable ר��Ӧ����
	 */
	public String getGrantsPayable() {
		return GrantsPayable;
	}

	/**
	 * ���� grantsPayable
	 * 
	 * @param grantsPayable
	 *            ר��Ӧ����
	 */
	public void setGrantsPayable(String grantsPayable) {
		GrantsPayable = grantsPayable;
	}

	/**
	 * ��ȡ provisions
	 * 
	 * @return the provisions Ԥ�Ƹ�ծ
	 */
	public String getProvisions() {
		return Provisions;
	}

	/**
	 * ���� provisions
	 * 
	 * @param provisions
	 *            Ԥ�Ƹ�ծ
	 */
	public void setProvisions(String provisions) {
		Provisions = provisions;
	}

	/**
	 * ��ȡ deferredTaxLiabilities
	 * 
	 * @return the deferredTaxLiabilities ��������˰��ծ
	 */
	public String getDeferredTaxLiabilities() {
		return DeferredTaxLiabilities;
	}

	/**
	 * ���� deferredTaxLiabilities
	 * 
	 * @param deferredTaxLiabilities
	 *            ��������˰��ծ
	 */
	public void setDeferredTaxLiabilities(String deferredTaxLiabilities) {
		DeferredTaxLiabilities = deferredTaxLiabilities;
	}

	/**
	 * ��ȡ otherNonCurrentLiabilities
	 * 
	 * @return the otherNonCurrentLiabilities ������������ծ
	 */
	public String getOtherNonCurrentLiabilities() {
		return OtherNonCurrentLiabilities;
	}

	/**
	 * ���� otherNonCurrentLiabilities
	 * 
	 * @param otherNonCurrentLiabilities
	 *            ������������ծ
	 */
	public void setOtherNonCurrentLiabilities(String otherNonCurrentLiabilities) {
		OtherNonCurrentLiabilities = otherNonCurrentLiabilities;
	}

	/**
	 * ��ȡ totalNonCurrentLiabilities
	 * 
	 * @return the totalNonCurrentLiabilities ��������ծ�ϼ�
	 */
	public String getTotalNonCurrentLiabilities() {
		return TotalNonCurrentLiabilities;
	}

	/**
	 * ���� totalNonCurrentLiabilities
	 * 
	 * @param totalNonCurrentLiabilities
	 *            ��������ծ�ϼ�
	 */
	public void setTotalNonCurrentLiabilities(String totalNonCurrentLiabilities) {
		TotalNonCurrentLiabilities = totalNonCurrentLiabilities;
	}

	/**
	 * ��ȡ totalLiabilities
	 * 
	 * @return the totalLiabilities ��ծ�ϼ�
	 */
	public String getTotalLiabilities() {
		return TotalLiabilities;
	}

	/**
	 * ���� totalLiabilities
	 * 
	 * @param totalLiabilities
	 *            ��ծ�ϼ�
	 */
	public void setTotalLiabilities(String totalLiabilities) {
		TotalLiabilities = totalLiabilities;
	}

	/**
	 * ��ȡ paidInCapitalOrShareCapital
	 * 
	 * @return the paidInCapitalOrShareCapital ʵ���ʱ�����ɱ���
	 */
	public String getPaidInCapitalOrShareCapital() {
		return PaidInCapitalOrShareCapital;
	}

	/**
	 * ���� paidInCapitalOrShareCapital
	 * 
	 * @param paidInCapitalOrShareCapital
	 *            ʵ���ʱ�����ɱ���
	 */
	public void setPaidInCapitalOrShareCapital(
			String paidInCapitalOrShareCapital) {
		PaidInCapitalOrShareCapital = paidInCapitalOrShareCapital;
	}

	/**
	 * ��ȡ capitalrRserve
	 * 
	 * @return the capitalrRserve �ʱ�����
	 */
	public String getCapitalrRserve() {
		return CapitalrRserve;
	}

	/**
	 * ���� capitalrRserve
	 * 
	 * @param capitalrRserve
	 *            �ʱ�����
	 */
	public void setCapitalrRserve(String capitalrRserve) {
		CapitalrRserve = capitalrRserve;
	}

	/**
	 * ��ȡ lessTreasuryStocks
	 * 
	 * @return the lessTreasuryStocks ��������
	 */
	public String getLessTreasuryStocks() {
		return LessTreasuryStocks;
	}

	/**
	 * ���� lessTreasuryStocks
	 * 
	 * @param lessTreasuryStocks
	 *            ��������
	 */
	public void setLessTreasuryStocks(String lessTreasuryStocks) {
		LessTreasuryStocks = lessTreasuryStocks;
	}

	/**
	 * ��ȡ surplusReserve
	 * 
	 * @return the surplusReserve ӯ�๫��
	 */
	public String getSurplusReserve() {
		return SurplusReserve;
	}

	/**
	 * ���� surplusReserve
	 * 
	 * @param surplusReserve
	 *            ӯ�๫��
	 */
	public void setSurplusReserve(String surplusReserve) {
		SurplusReserve = surplusReserve;
	}

	/**
	 * ��ȡ unappropriatedProfit
	 * 
	 * @return the unappropriatedProfit δ��������
	 */
	public String getUnappropriatedProfit() {
		return UnappropriatedProfit;
	}

	/**
	 * ���� unappropriatedProfit
	 * 
	 * @param unappropriatedProfit
	 *            δ��������
	 */
	public void setUnappropriatedProfit(String unappropriatedProfit) {
		UnappropriatedProfit = unappropriatedProfit;
	}

	/**
	 * ��ȡ totalEquity
	 * 
	 * @return the totalEquity ������Ȩ��ϼ�
	 */
	public String getTotalEquity() {
		return TotalEquity;
	}

	/**
	 * ���� totalEquity
	 * 
	 * @param totalEquity
	 *            ������Ȩ��ϼ�
	 */
	public void setTotalEquity(String totalEquity) {
		TotalEquity = totalEquity;
	}

	/**
	 * ��ȡ totalEquityAndLiabilities
	 * 
	 * @return the totalEquityAndLiabilities ��ծ��������Ȩ��ϼ�
	 */
	public String getTotalEquityAndLiabilities() {
		return TotalEquityAndLiabilities;
	}

	/**
	 * ���� totalEquityAndLiabilities
	 * 
	 * @param totalEquityAndLiabilities
	 *            ��ծ��������Ȩ��ϼ�
	 */
	public void setTotalEquityAndLiabilities(String totalEquityAndLiabilities) {
		TotalEquityAndLiabilities = totalEquityAndLiabilities;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BalanceSheet2007Sgmt [AccountsPayable=" + AccountsPayable
				+ ", AccountsReceivable=" + AccountsReceivable
				+ ", BondsPayables=" + BondsPayables + ", CapitalrRserve="
				+ CapitalrRserve + ", ConstructionInProgress="
				+ ConstructionInProgress + ", ConstructionMaterials="
				+ ConstructionMaterials + ", CurrencyFunds=" + CurrencyFunds
				+ ", CurrentPortionOfLongTermLiabilities="
				+ CurrentPortionOfLongTermLiabilities
				+ ", CurrentPortionOfNonCurrentAssets="
				+ CurrentPortionOfNonCurrentAssets + ", DeferredTaxAssets="
				+ DeferredTaxAssets + ", DeferredTaxLiabilities="
				+ DeferredTaxLiabilities + ", DevelopmentDisbursements="
				+ DevelopmentDisbursements + ", DividendsPayable="
				+ DividendsPayable + ", DividendsReceivable="
				+ DividendsReceivable + ", EmployeeBenefitsPayable="
				+ EmployeeBenefitsPayable
				+ ", FinancialAssetsAvailableForSale="
				+ FinancialAssetsAvailableForSale
				+ ", FinancialAssetsHeldForTrading="
				+ FinancialAssetsHeldForTrading
				+ ", FinancialLiabilitiesHeldForTrading="
				+ FinancialLiabilitiesHeldForTrading + ", FixedAssets="
				+ FixedAssets + ", FixedAssetsPendingForDisposal="
				+ FixedAssetsPendingForDisposal + ", Goodwill=" + Goodwill
				+ ", GrantsPayable=" + GrantsPayable
				+ ", HeldToMaturityInvestments=" + HeldToMaturityInvestments
				+ ", IntangibleAssets=" + IntangibleAssets
				+ ", InterestPayable=" + InterestPayable
				+ ", InterestReceivable=" + InterestReceivable
				+ ", Inventories=" + Inventories + ", InvestmentProperties="
				+ InvestmentProperties + ", LessTreasuryStocks="
				+ LessTreasuryStocks + ", LongTermBorrowings="
				+ LongTermBorrowings + ", LongTermDeferredExpenses="
				+ LongTermDeferredExpenses + ", LongTermEquityInvestment="
				+ LongTermEquityInvestment + ", LongTermPayables="
				+ LongTermPayables + ", LongTermReceivables="
				+ LongTermReceivables + ", NonCurrentBiologicalAssets="
				+ NonCurrentBiologicalAssets + ", NotesPayable=" + NotesPayable
				+ ", NotesReceivable=" + NotesReceivable + ", OilAndGasAssets="
				+ OilAndGasAssets + ", OtherCurrentAssets="
				+ OtherCurrentAssets + ", OtherCurrentLiabilities="
				+ OtherCurrentLiabilities + ", OtherNonCurrentAssets="
				+ OtherNonCurrentAssets + ", OtherNonCurrentLiabilities="
				+ OtherNonCurrentLiabilities + ", OtherPayables="
				+ OtherPayables + ", OtherReceivables=" + OtherReceivables
				+ ", PaidInCapitalOrShareCapital="
				+ PaidInCapitalOrShareCapital + ", Prepayments=" + Prepayments
				+ ", Provisions=" + Provisions + ", ReceiptsInAdvance="
				+ ReceiptsInAdvance + ", ShortTermBorrowings="
				+ ShortTermBorrowings + ", SurplusReserve=" + SurplusReserve
				+ ", TaxsPayable=" + TaxsPayable + ", TotalAssets="
				+ TotalAssets + ", TotalCurrentAssets=" + TotalCurrentAssets
				+ ", TotalCurrentLiabilities=" + TotalCurrentLiabilities
				+ ", TotalEquity=" + TotalEquity
				+ ", TotalEquityAndLiabilities=" + TotalEquityAndLiabilities
				+ ", TotalLiabilities=" + TotalLiabilities
				+ ", TotalNonCurrentAssets=" + TotalNonCurrentAssets
				+ ", TotalNonCurrentLiabilities=" + TotalNonCurrentLiabilities
				+ ", UnappropriatedProfit=" + UnappropriatedProfit + "]";
	}
}
