package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: BalanceSheet2002Sgmt<br/>
 * Description:2002���ʲ���ծ���<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "CurrencyFunds", "ShortTermInvestments",
		"NotesReceivable", "DividendsReceivable", "InterestReceivable",
		"AccountsReceivable", "OtherReceivables", "Prepayments",
		"FutureGuarantee", "AllowanceReceivable", "ExportDrawbackReceivable",
		"Inventories", "RawMaterials", "FinishedProducts", "DeferredExpenses",
		"UnsettledGLOnCurrentAssets",
		"LongTermDebentureInvestmentFallingDueInAYear", "OtherCurrentAssets",
		"TotalCurrentAssets", "LongTermInvestment", "LongTermEquityInvestment",
		"LongTermSecuritiesInvestment", "IncorporatingPriceDifference",
		"TotalLongTermInvestment", "OriginalCostOfFixedAsset",
		"FixedAssetAccumulatedDepreciation", "FixedAssetsNetValue",
		"ProvisionForImpairmentOfFixedAssets", "NetValueOfFixedAssets",
		"FixedAssetsPendingForDisposal", "ConstructionMaterials",
		"ConstructionInProgress", "UnsettledGLOnFixedAssets",
		"TotalFixedAssets", "IntangibleAssets", "LandUseRights",
		"DeferredAssets", "IncludingFixedAssetsRepair",
		"ImprovementExpenditureOfFixedAssets", "OtherLongTermAssets",
		"AmongItSpeciallyApprovedReservingMaterials",
		"TotalIntangibleAssetsAndOtherAssets", "DeferredAssetsDebits",
		"TotalAssets", "ShortTermBorrowings", "NotesPayable",
		"AccountsPayable", "ReceiptsInAdvance", "WagesOrSalariesPayables",
		"EmployeeBenefits", "IncomePayable", "TaxesPayable",
		"OtherPayableToGovernment", "OtherPayable", "ProvisionForExpenses",
		"Provisions", "LongTermLiabilitiesDueWithinOneYear",
		"OtherCurrentLiabilities", "TotalCurrentLiabilities",
		"LongTermBorrowings", "BondsPayable", "LongTermPayables",
		"GrantsPayable", "OtherLongTermLiabilities", "SpecialReserveFund",
		"TotalLongTermLiabilities", "DeferredTaxationCredit",
		"TotalLiabilities", "MinorityInterest", "PaidInCapital",
		"NationalCapital", "CollectiveCapital", "LegalPersonsCapital",
		"StateOwnedLegalPersonsCapital", "CollectiveLegalPersonsCapital",
		"PersonalCapital", "ForeignBusinessmensCapital", "CapitalrRserve",
		"SurplusReserve", "StatutorySurplusReserve", "PublicWelfareFund",
		"SupplermentaryCurrentCapital", "UnaffirmedInvestmentLoss",
		"UnappropriatedProfit",
		"DifferenceOnTranslationOfForeignCurrencyFinancialStatements",
		"TotalEquity", "TotalEquityAndLiabilities" },namespace = "com.dhcc.xml.ent.entity.finance")
public class BalanceSheet2002Sgmt {
	/**
	 *�����ʽ�
	 */
	@XmlElement
	private String CurrencyFunds;  
	/**
	 *����Ͷ��
	 */
	@XmlElement
	private String ShortTermInvestments;  
	/**
	 *Ӧ��Ʊ��
	 */
	@XmlElement
	private String NotesReceivable;  
	/**
	 *Ӧ�չ���
	 */
	@XmlElement
	private String DividendsReceivable;  
	/**
	 *Ӧ����Ϣ
	 */
	@XmlElement
	private String InterestReceivable;  
	/**
	 *Ӧ���˿�
	 */
	@XmlElement
	private String AccountsReceivable;  
	/**
	 *����Ӧ�տ�
	 */
	@XmlElement
	private String OtherReceivables;  
	/**
	 *Ԥ���˿�
	 */
	@XmlElement
	private String Prepayments;  
	/**
	 *�ڻ���֤��
	 */
	@XmlElement
	private String FutureGuarantee;  
	/**
	 *Ӧ�ղ�����
	 */
	@XmlElement
	private String AllowanceReceivable;  
	/**
	 *Ӧ�ճ�����˰
	 */
	@XmlElement
	private String ExportDrawbackReceivable;  
	/**
	 *���
	 */
	@XmlElement
	private String Inventories;  
	/**
	 *���ԭ����
	 */
	@XmlElement
	private String RawMaterials;  
	/**
	 *�������Ʒ
	 */
	@XmlElement
	private String FinishedProducts;  
	/**
	 *��̯����
	 */
	@XmlElement
	private String DeferredExpenses;  
	/**
	 *�����������ʲ�����ʧ
	 */
	@XmlElement
	private String UnsettledGLOnCurrentAssets;  
	/**
	 *һ���ڵ��ڵĳ���ծȨͶ��
	 */
	@XmlElement
	private String LongTermDebentureInvestmentFallingDueInAYear;  
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
	 *����Ͷ��
	 */
	@XmlElement
	private String LongTermInvestment;  
	/**
	 *���ڹ�ȨͶ��
	 */
	@XmlElement
	private String LongTermEquityInvestment;  
	/**
	 *����ծȨͶ��
	 */
	@XmlElement
	private String LongTermSecuritiesInvestment;  
	/**
	 *�ϲ��۲�
	 */
	@XmlElement
	private String IncorporatingPriceDifference;  
	/**
	 *����Ͷ�ʺϼ�
	 */
	@XmlElement
	private String TotalLongTermInvestment;  
	/**
	 *�̶��ʲ�ԭ��
	 */
	@XmlElement
	private String OriginalCostOfFixedAsset;  
	/**
	 *�ۼ��۾�
	 */
	@XmlElement
	private String FixedAssetAccumulatedDepreciation;  
	/**
	 *�̶��ʲ���ֵ
	 */
	@XmlElement
	private String FixedAssetsNetValue;  
	/**
	 *�̶��ʲ�ֵ��ֵ׼��
	 */
	@XmlElement
	private String ProvisionForImpairmentOfFixedAssets;  
	/**
	 *�̶��ʲ�����
	 */
	@XmlElement
	private String NetValueOfFixedAssets;  
	/**
	 *�̶��ʲ�����
	 */
	@XmlElement
	private String FixedAssetsPendingForDisposal;  
	/**
	 *��������
	 */
	@XmlElement
	private String ConstructionMaterials;  
	/**
	 *�ڽ�����
	 */
	@XmlElement
	private String ConstructionInProgress;  
	/**
	 *������̶��ʲ�����ʧ
	 */
	@XmlElement
	private String UnsettledGLOnFixedAssets;  
	/**
	 *�̶��ʲ��ϼ�
	 */
	@XmlElement
	private String TotalFixedAssets;  
	/**
	 *�����ʲ�
	 */
	@XmlElement
	private String IntangibleAssets;  
	/**
	 *�������ʲ���Ŀ�£�����ʹ��Ȩ
	 */
	@XmlElement
	private String LandUseRights;  
	/**
	 *�����ʲ�
	 */
	@XmlElement
	private String DeferredAssets;  
	/**
	 *�������ʲ���Ŀ�£��̶��ʲ�����
	 */
	@XmlElement
	private String IncludingFixedAssetsRepair;  
	/**
	 *�������ʲ���Ŀ�£��̶��ʲ�����֧��
	 */
	@XmlElement
	private String ImprovementExpenditureOfFixedAssets;  
	/**
	 *���������ʲ�
	 */
	@XmlElement
	private String OtherLongTermAssets;  
	/**
	 *�����������ʲ���Ŀ�£���׼��������
	 */
	@XmlElement
	private String AmongItSpeciallyApprovedReservingMaterials;  
	/**
	 *���μ������ʲ��ϼ�
	 */
	@XmlElement
	private String TotalIntangibleAssetsAndOtherAssets;  
	/**
	 *����˰�����
	 */
	@XmlElement
	private String DeferredAssetsDebits;  
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
	 *Ӧ������
	 */
	@XmlElement
	private String WagesOrSalariesPayables;  
	/**
	 *Ӧ��������
	 */
	@XmlElement
	private String EmployeeBenefits;  
	/**
	 *Ӧ������
	 */
	@XmlElement
	private String IncomePayable;  
	/**
	 *Ӧ��˰��
	 */
	@XmlElement
	private String TaxesPayable;  
	/**
	 *����Ӧ����
	 */
	@XmlElement
	private String OtherPayableToGovernment;  
	/**
	 *����Ӧ����
	 */
	@XmlElement
	private String OtherPayable;  
	/**
	 *Ԥ�����
	 */
	@XmlElement
	private String ProvisionForExpenses;  
	/**
	 *Ԥ�Ƹ�ծ
	 */
	@XmlElement
	private String Provisions;  
	/**
	 *һ���ڵ��ڵĳ��ڸ�ծ
	 */
	@XmlElement
	private String LongTermLiabilitiesDueWithinOneYear;  
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
	private String BondsPayable;  
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
	 *�������ڸ�ծ
	 */
	@XmlElement
	private String OtherLongTermLiabilities;  
	/**
	 *���������ڸ�ծ��Ŀ�£���׼��������
	 */
	@XmlElement
	private String SpecialReserveFund;  
	/**
	 *���ڸ�ծ�ϼ�
	 */
	@XmlElement
	private String TotalLongTermLiabilities;  
	/**
	 *����˰�����
	 */
	@XmlElement
	private String DeferredTaxationCredit;  
	/**
	 *��ծ�ϼ�
	 */
	@XmlElement
	private String TotalLiabilities;  
	/**
	 *�����ɶ�Ȩ��
	 */
	@XmlElement
	private String MinorityInterest;  
	/**
	 *ʵ���ʱ�
	 */
	@XmlElement
	private String PaidInCapital;  
	/**
	 *�����ʱ�
	 */
	@XmlElement
	private String NationalCapital;  
	/**
	 *�����ʱ�
	 */
	@XmlElement
	private String CollectiveCapital;  
	/**
	 *�����ʱ�
	 */
	@XmlElement
	private String LegalPersonsCapital;  
	/**
	 *�������ʱ���Ŀ�£����з����ʱ�
	 */
	@XmlElement
	private String StateOwnedLegalPersonsCapital;  
	/**
	 *�������ʱ���Ŀ�£����巨���ʱ�
	 */
	@XmlElement
	private String CollectiveLegalPersonsCapital;  
	/**
	 *�����ʱ�
	 */
	@XmlElement
	private String PersonalCapital;  
	/**
	 *�����ʱ�
	 */
	@XmlElement
	private String ForeignBusinessmensCapital;  
	/**
	 *�ʱ�����
	 */
	@XmlElement
	private String CapitalrRserve;  
	/**
	 *ӯ�๫��
	 */
	@XmlElement
	private String SurplusReserve;  
	/**
	 *��ӯ�๫����Ŀ�£�����ӯ�๫��
	 */
	@XmlElement
	private String StatutorySurplusReserve;  
	/**
	 *��ӯ�๫����Ŀ�£������
	 */
	@XmlElement
	private String PublicWelfareFund;  
	/**
	 *��ӯ�๫����Ŀ�£����������ʱ�
	 */
	@XmlElement
	private String SupplermentaryCurrentCapital;  
	/**
	 *δȷ�ϵ�Ͷ����ʧ
	 */
	@XmlElement
	private String UnaffirmedInvestmentLoss;  
	/**
	 *δ��������
	 */
	@XmlElement
	private String UnappropriatedProfit;  
	/**
	 *��ұ���������
	 */
	@XmlElement
	private String DifferenceOnTranslationOfForeignCurrencyFinancialStatements;  
	/**
	 *������Ȩ��ϼ�
	 */
	@XmlElement
	private String TotalEquity;  
	/**
	 *��ծ��������Ȩ���ܼ�
	 */
	@XmlElement
	private String TotalEquityAndLiabilities;  

	public BalanceSheet2002Sgmt() {
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
	 * ��ȡ shortTermInvestments
	 * 
	 * @return the shortTermInvestments ����Ͷ��
	 */
	public String getShortTermInvestments() {
		return ShortTermInvestments;
	}

	/**
	 * ���� shortTermInvestments
	 * 
	 * @param shortTermInvestments
	 *            ����Ͷ��
	 */
	public void setShortTermInvestments(String shortTermInvestments) {
		ShortTermInvestments = shortTermInvestments;
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
	 * ��ȡ futureGuarantee
	 * 
	 * @return the futureGuarantee �ڻ���֤��
	 */
	public String getFutureGuarantee() {
		return FutureGuarantee;
	}

	/**
	 * ���� futureGuarantee
	 * 
	 * @param futureGuarantee
	 *            �ڻ���֤��
	 */
	public void setFutureGuarantee(String futureGuarantee) {
		FutureGuarantee = futureGuarantee;
	}

	/**
	 * ��ȡ allowanceReceivable
	 * 
	 * @return the allowanceReceivable Ӧ�ղ�����
	 */
	public String getAllowanceReceivable() {
		return AllowanceReceivable;
	}

	/**
	 * ���� allowanceReceivable
	 * 
	 * @param allowanceReceivable
	 *            Ӧ�ղ�����
	 */
	public void setAllowanceReceivable(String allowanceReceivable) {
		AllowanceReceivable = allowanceReceivable;
	}

	/**
	 * ��ȡ exportDrawbackReceivable
	 * 
	 * @return the exportDrawbackReceivable Ӧ�ճ�����˰
	 */
	public String getExportDrawbackReceivable() {
		return ExportDrawbackReceivable;
	}

	/**
	 * ���� exportDrawbackReceivable
	 * 
	 * @param exportDrawbackReceivable
	 *            Ӧ�ճ�����˰
	 */
	public void setExportDrawbackReceivable(String exportDrawbackReceivable) {
		ExportDrawbackReceivable = exportDrawbackReceivable;
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
	 * ��ȡ rawMaterials
	 * 
	 * @return the rawMaterials ���ԭ����
	 */
	public String getRawMaterials() {
		return RawMaterials;
	}

	/**
	 * ���� rawMaterials
	 * 
	 * @param rawMaterials
	 *            ���ԭ����
	 */
	public void setRawMaterials(String rawMaterials) {
		RawMaterials = rawMaterials;
	}

	/**
	 * ��ȡ finishedProducts
	 * 
	 * @return the finishedProducts �������Ʒ
	 */
	public String getFinishedProducts() {
		return FinishedProducts;
	}

	/**
	 * ���� finishedProducts
	 * 
	 * @param finishedProducts
	 *            �������Ʒ
	 */
	public void setFinishedProducts(String finishedProducts) {
		FinishedProducts = finishedProducts;
	}

	/**
	 * ��ȡ deferredExpenses
	 * 
	 * @return the deferredExpenses ��̯����
	 */
	public String getDeferredExpenses() {
		return DeferredExpenses;
	}

	/**
	 * ���� deferredExpenses
	 * 
	 * @param deferredExpenses
	 *            ��̯����
	 */
	public void setDeferredExpenses(String deferredExpenses) {
		DeferredExpenses = deferredExpenses;
	}

	/**
	 * ��ȡ unsettledGLOnCurrentAssets
	 * 
	 * @return the unsettledGLOnCurrentAssets �����������ʲ�����ʧ
	 */
	public String getUnsettledGLOnCurrentAssets() {
		return UnsettledGLOnCurrentAssets;
	}

	/**
	 * ���� unsettledGLOnCurrentAssets
	 * 
	 * @param unsettledGLOnCurrentAssets
	 *            �����������ʲ�����ʧ
	 */
	public void setUnsettledGLOnCurrentAssets(String unsettledGLOnCurrentAssets) {
		UnsettledGLOnCurrentAssets = unsettledGLOnCurrentAssets;
	}

	/**
	 * ��ȡ longTermDebentureInvestmentFallingDueInAYear
	 * 
	 * @return the longTermDebentureInvestmentFallingDueInAYear һ���ڵ��ڵĳ���ծȨͶ��
	 */
	public String getLongTermDebentureInvestmentFallingDueInAYear() {
		return LongTermDebentureInvestmentFallingDueInAYear;
	}

	/**
	 * ���� longTermDebentureInvestmentFallingDueInAYear
	 * 
	 * @param longTermDebentureInvestmentFallingDueInAYear
	 *            һ���ڵ��ڵĳ���ծȨͶ��
	 */
	public void setLongTermDebentureInvestmentFallingDueInAYear(
			String longTermDebentureInvestmentFallingDueInAYear) {
		LongTermDebentureInvestmentFallingDueInAYear = longTermDebentureInvestmentFallingDueInAYear;
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
	 * ��ȡ longTermInvestment
	 * 
	 * @return the longTermInvestment ����Ͷ��
	 */
	public String getLongTermInvestment() {
		return LongTermInvestment;
	}

	/**
	 * ���� longTermInvestment
	 * 
	 * @param longTermInvestment
	 *            ����Ͷ��
	 */
	public void setLongTermInvestment(String longTermInvestment) {
		LongTermInvestment = longTermInvestment;
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
	 * ��ȡ longTermSecuritiesInvestment
	 * 
	 * @return the longTermSecuritiesInvestment ����ծȨͶ��
	 */
	public String getLongTermSecuritiesInvestment() {
		return LongTermSecuritiesInvestment;
	}

	/**
	 * ���� longTermSecuritiesInvestment
	 * 
	 * @param longTermSecuritiesInvestment
	 *            ����ծȨͶ��
	 */
	public void setLongTermSecuritiesInvestment(
			String longTermSecuritiesInvestment) {
		LongTermSecuritiesInvestment = longTermSecuritiesInvestment;
	}

	/**
	 * ��ȡ incorporatingPriceDifference
	 * 
	 * @return the incorporatingPriceDifference �ϲ��۲�
	 */
	public String getIncorporatingPriceDifference() {
		return IncorporatingPriceDifference;
	}

	/**
	 * ���� incorporatingPriceDifference
	 * 
	 * @param incorporatingPriceDifference
	 *            �ϲ��۲�
	 */
	public void setIncorporatingPriceDifference(
			String incorporatingPriceDifference) {
		IncorporatingPriceDifference = incorporatingPriceDifference;
	}

	/**
	 * ��ȡ totalLongTermInvestment
	 * 
	 * @return the totalLongTermInvestment ����Ͷ�ʺϼ�
	 */
	public String getTotalLongTermInvestment() {
		return TotalLongTermInvestment;
	}

	/**
	 * ���� totalLongTermInvestment
	 * 
	 * @param totalLongTermInvestment
	 *            ����Ͷ�ʺϼ�
	 */
	public void setTotalLongTermInvestment(String totalLongTermInvestment) {
		TotalLongTermInvestment = totalLongTermInvestment;
	}

	/**
	 * ��ȡ originalCostOfFixedAsset
	 * 
	 * @return the originalCostOfFixedAsset �̶��ʲ�ԭ��
	 */
	public String getOriginalCostOfFixedAsset() {
		return OriginalCostOfFixedAsset;
	}

	/**
	 * ���� originalCostOfFixedAsset
	 * 
	 * @param originalCostOfFixedAsset
	 *            �̶��ʲ�ԭ��
	 */
	public void setOriginalCostOfFixedAsset(String originalCostOfFixedAsset) {
		OriginalCostOfFixedAsset = originalCostOfFixedAsset;
	}

	/**
	 * ��ȡ fixedAssetAccumulatedDepreciation
	 * 
	 * @return the fixedAssetAccumulatedDepreciation �ۼ��۾�
	 */
	public String getFixedAssetAccumulatedDepreciation() {
		return FixedAssetAccumulatedDepreciation;
	}

	/**
	 * ���� fixedAssetAccumulatedDepreciation
	 * 
	 * @param fixedAssetAccumulatedDepreciation
	 *            �ۼ��۾�
	 */
	public void setFixedAssetAccumulatedDepreciation(
			String fixedAssetAccumulatedDepreciation) {
		FixedAssetAccumulatedDepreciation = fixedAssetAccumulatedDepreciation;
	}

	/**
	 * ��ȡ fixedAssetsNetValue
	 * 
	 * @return the fixedAssetsNetValue �̶��ʲ���ֵ
	 */
	public String getFixedAssetsNetValue() {
		return FixedAssetsNetValue;
	}

	/**
	 * ���� fixedAssetsNetValue
	 * 
	 * @param fixedAssetsNetValue
	 *            �̶��ʲ���ֵ
	 */
	public void setFixedAssetsNetValue(String fixedAssetsNetValue) {
		FixedAssetsNetValue = fixedAssetsNetValue;
	}

	/**
	 * ��ȡ provisionForImpairmentOfFixedAssets
	 * 
	 * @return the provisionForImpairmentOfFixedAssets �̶��ʲ�ֵ��ֵ׼��
	 */
	public String getProvisionForImpairmentOfFixedAssets() {
		return ProvisionForImpairmentOfFixedAssets;
	}

	/**
	 * ���� provisionForImpairmentOfFixedAssets
	 * 
	 * @param provisionForImpairmentOfFixedAssets
	 *            �̶��ʲ�ֵ��ֵ׼��
	 */
	public void setProvisionForImpairmentOfFixedAssets(
			String provisionForImpairmentOfFixedAssets) {
		ProvisionForImpairmentOfFixedAssets = provisionForImpairmentOfFixedAssets;
	}

	/**
	 * ��ȡ netValueOfFixedAssets
	 * 
	 * @return the netValueOfFixedAssets �̶��ʲ�����
	 */
	public String getNetValueOfFixedAssets() {
		return NetValueOfFixedAssets;
	}

	/**
	 * ���� netValueOfFixedAssets
	 * 
	 * @param netValueOfFixedAssets
	 *            �̶��ʲ�����
	 */
	public void setNetValueOfFixedAssets(String netValueOfFixedAssets) {
		NetValueOfFixedAssets = netValueOfFixedAssets;
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
	 * ��ȡ unsettledGLOnFixedAssets
	 * 
	 * @return the unsettledGLOnFixedAssets ������̶��ʲ�����ʧ
	 */
	public String getUnsettledGLOnFixedAssets() {
		return UnsettledGLOnFixedAssets;
	}

	/**
	 * ���� unsettledGLOnFixedAssets
	 * 
	 * @param unsettledGLOnFixedAssets
	 *            ������̶��ʲ�����ʧ
	 */
	public void setUnsettledGLOnFixedAssets(String unsettledGLOnFixedAssets) {
		UnsettledGLOnFixedAssets = unsettledGLOnFixedAssets;
	}

	/**
	 * ��ȡ totalFixedAssets
	 * 
	 * @return the totalFixedAssets �̶��ʲ��ϼ�
	 */
	public String getTotalFixedAssets() {
		return TotalFixedAssets;
	}

	/**
	 * ���� totalFixedAssets
	 * 
	 * @param totalFixedAssets
	 *            �̶��ʲ��ϼ�
	 */
	public void setTotalFixedAssets(String totalFixedAssets) {
		TotalFixedAssets = totalFixedAssets;
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
	 * ��ȡ landUseRights
	 * 
	 * @return the landUseRights �������ʲ���Ŀ�£�����ʹ��Ȩ
	 */
	public String getLandUseRights() {
		return LandUseRights;
	}

	/**
	 * ���� landUseRights
	 * 
	 * @param landUseRights
	 *            �������ʲ���Ŀ�£�����ʹ��Ȩ
	 */
	public void setLandUseRights(String landUseRights) {
		LandUseRights = landUseRights;
	}

	/**
	 * ��ȡ deferredAssets
	 * 
	 * @return the deferredAssets �����ʲ�
	 */
	public String getDeferredAssets() {
		return DeferredAssets;
	}

	/**
	 * ���� deferredAssets
	 * 
	 * @param deferredAssets
	 *            �����ʲ�
	 */
	public void setDeferredAssets(String deferredAssets) {
		DeferredAssets = deferredAssets;
	}

	/**
	 * ��ȡ includingFixedAssetsRepair
	 * 
	 * @return the includingFixedAssetsRepair �������ʲ���Ŀ�£��̶��ʲ�����
	 */
	public String getIncludingFixedAssetsRepair() {
		return IncludingFixedAssetsRepair;
	}

	/**
	 * ���� includingFixedAssetsRepair
	 * 
	 * @param includingFixedAssetsRepair
	 *            �������ʲ���Ŀ�£��̶��ʲ�����
	 */
	public void setIncludingFixedAssetsRepair(String includingFixedAssetsRepair) {
		IncludingFixedAssetsRepair = includingFixedAssetsRepair;
	}

	/**
	 * ��ȡ improvementExpenditureOfFixedAssets
	 * 
	 * @return the improvementExpenditureOfFixedAssets �������ʲ���Ŀ�£��̶��ʲ�����֧��
	 */
	public String getImprovementExpenditureOfFixedAssets() {
		return ImprovementExpenditureOfFixedAssets;
	}

	/**
	 * ���� improvementExpenditureOfFixedAssets
	 * 
	 * @param improvementExpenditureOfFixedAssets
	 *            �������ʲ���Ŀ�£��̶��ʲ�����֧��
	 */
	public void setImprovementExpenditureOfFixedAssets(
			String improvementExpenditureOfFixedAssets) {
		ImprovementExpenditureOfFixedAssets = improvementExpenditureOfFixedAssets;
	}

	/**
	 * ��ȡ otherLongTermAssets
	 * 
	 * @return the otherLongTermAssets ���������ʲ�
	 */
	public String getOtherLongTermAssets() {
		return OtherLongTermAssets;
	}

	/**
	 * ���� otherLongTermAssets
	 * 
	 * @param otherLongTermAssets
	 *            ���������ʲ�
	 */
	public void setOtherLongTermAssets(String otherLongTermAssets) {
		OtherLongTermAssets = otherLongTermAssets;
	}

	/**
	 * ��ȡ amongItSpeciallyApprovedReservingMaterials
	 * 
	 * @return the amongItSpeciallyApprovedReservingMaterials �����������ʲ���Ŀ�£���׼��������
	 */
	public String getAmongItSpeciallyApprovedReservingMaterials() {
		return AmongItSpeciallyApprovedReservingMaterials;
	}

	/**
	 * ���� amongItSpeciallyApprovedReservingMaterials
	 * 
	 * @param amongItSpeciallyApprovedReservingMaterials
	 *            �����������ʲ���Ŀ�£���׼��������
	 */
	public void setAmongItSpeciallyApprovedReservingMaterials(
			String amongItSpeciallyApprovedReservingMaterials) {
		AmongItSpeciallyApprovedReservingMaterials = amongItSpeciallyApprovedReservingMaterials;
	}

	/**
	 * ��ȡ totalIntangibleAssetsAndOtherAssets
	 * 
	 * @return the totalIntangibleAssetsAndOtherAssets ���μ������ʲ��ϼ�
	 */
	public String getTotalIntangibleAssetsAndOtherAssets() {
		return TotalIntangibleAssetsAndOtherAssets;
	}

	/**
	 * ���� totalIntangibleAssetsAndOtherAssets
	 * 
	 * @param totalIntangibleAssetsAndOtherAssets
	 *            ���μ������ʲ��ϼ�
	 */
	public void setTotalIntangibleAssetsAndOtherAssets(
			String totalIntangibleAssetsAndOtherAssets) {
		TotalIntangibleAssetsAndOtherAssets = totalIntangibleAssetsAndOtherAssets;
	}

	/**
	 * ��ȡ deferredAssetsDebits
	 * 
	 * @return the deferredAssetsDebits ����˰�����
	 */
	public String getDeferredAssetsDebits() {
		return DeferredAssetsDebits;
	}

	/**
	 * ���� deferredAssetsDebits
	 * 
	 * @param deferredAssetsDebits
	 *            ����˰�����
	 */
	public void setDeferredAssetsDebits(String deferredAssetsDebits) {
		DeferredAssetsDebits = deferredAssetsDebits;
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
	 * ��ȡ wagesOrSalariesPayables
	 * 
	 * @return the wagesOrSalariesPayables Ӧ������
	 */
	public String getWagesOrSalariesPayables() {
		return WagesOrSalariesPayables;
	}

	/**
	 * ���� wagesOrSalariesPayables
	 * 
	 * @param wagesOrSalariesPayables
	 *            Ӧ������
	 */
	public void setWagesOrSalariesPayables(String wagesOrSalariesPayables) {
		WagesOrSalariesPayables = wagesOrSalariesPayables;
	}

	/**
	 * ��ȡ employeeBenefits
	 * 
	 * @return the employeeBenefits Ӧ��������
	 */
	public String getEmployeeBenefits() {
		return EmployeeBenefits;
	}

	/**
	 * ���� employeeBenefits
	 * 
	 * @param employeeBenefits
	 *            Ӧ��������
	 */
	public void setEmployeeBenefits(String employeeBenefits) {
		EmployeeBenefits = employeeBenefits;
	}

	/**  
	 * ��ȡ incomePayable
	 * @return the incomePayable Ӧ������ 
	 */
	public String getIncomePayable() {
		return IncomePayable;
	}

	/**  
	 * ���� incomePayable  
	 * @param incomePayable Ӧ������  
	 */
	public void setIncomePayable(String incomePayable) {
		IncomePayable = incomePayable;
	}

	/**
	 * ��ȡ taxesPayable
	 * 
	 * @return the taxesPayable Ӧ��˰��
	 */
	public String getTaxesPayable() {
		return TaxesPayable;
	}

	/**
	 * ���� taxesPayable
	 * 
	 * @param taxesPayable
	 *            Ӧ��˰��
	 */
	public void setTaxesPayable(String taxesPayable) {
		TaxesPayable = taxesPayable;
	}

	/**
	 * ��ȡ otherPayableToGovernment
	 * 
	 * @return the otherPayableToGovernment ����Ӧ����
	 */
	public String getOtherPayableToGovernment() {
		return OtherPayableToGovernment;
	}

	/**
	 * ���� otherPayableToGovernment
	 * 
	 * @param otherPayableToGovernment
	 *            ����Ӧ����
	 */
	public void setOtherPayableToGovernment(String otherPayableToGovernment) {
		OtherPayableToGovernment = otherPayableToGovernment;
	}

	/**
	 * ��ȡ otherPayable
	 * 
	 * @return the otherPayable ����Ӧ����
	 */
	public String getOtherPayable() {
		return OtherPayable;
	}

	/**
	 * ���� otherPayable
	 * 
	 * @param otherPayable
	 *            ����Ӧ����
	 */
	public void setOtherPayable(String otherPayable) {
		OtherPayable = otherPayable;
	}

	/**
	 * ��ȡ provisionForExpenses
	 * 
	 * @return the provisionForExpenses Ԥ�����
	 */
	public String getProvisionForExpenses() {
		return ProvisionForExpenses;
	}

	/**
	 * ���� provisionForExpenses
	 * 
	 * @param provisionForExpenses
	 *            Ԥ�����
	 */
	public void setProvisionForExpenses(String provisionForExpenses) {
		ProvisionForExpenses = provisionForExpenses;
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
	 * ��ȡ longTermLiabilitiesDueWithinOneYear
	 * 
	 * @return the longTermLiabilitiesDueWithinOneYear һ���ڵ��ڵĳ��ڸ�ծ
	 */
	public String getLongTermLiabilitiesDueWithinOneYear() {
		return LongTermLiabilitiesDueWithinOneYear;
	}

	/**
	 * ���� longTermLiabilitiesDueWithinOneYear
	 * 
	 * @param longTermLiabilitiesDueWithinOneYear
	 *            һ���ڵ��ڵĳ��ڸ�ծ
	 */
	public void setLongTermLiabilitiesDueWithinOneYear(
			String longTermLiabilitiesDueWithinOneYear) {
		LongTermLiabilitiesDueWithinOneYear = longTermLiabilitiesDueWithinOneYear;
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
	 * ��ȡ bondsPayable
	 * 
	 * @return the bondsPayable Ӧ��ծȯ
	 */
	public String getBondsPayable() {
		return BondsPayable;
	}

	/**
	 * ���� bondsPayable
	 * 
	 * @param bondsPayable
	 *            Ӧ��ծȯ
	 */
	public void setBondsPayable(String bondsPayable) {
		BondsPayable = bondsPayable;
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
	 * ��ȡ otherLongTermLiabilities
	 * 
	 * @return the otherLongTermLiabilities �������ڸ�ծ
	 */
	public String getOtherLongTermLiabilities() {
		return OtherLongTermLiabilities;
	}

	/**
	 * ���� otherLongTermLiabilities
	 * 
	 * @param otherLongTermLiabilities
	 *            �������ڸ�ծ
	 */
	public void setOtherLongTermLiabilities(String otherLongTermLiabilities) {
		OtherLongTermLiabilities = otherLongTermLiabilities;
	}

	/**
	 * ��ȡ specialReserveFund
	 * 
	 * @return the specialReserveFund ���������ڸ�ծ��Ŀ�£���׼��������
	 */
	public String getSpecialReserveFund() {
		return SpecialReserveFund;
	}

	/**
	 * ���� specialReserveFund
	 * 
	 * @param specialReserveFund
	 *            ���������ڸ�ծ��Ŀ�£���׼��������
	 */
	public void setSpecialReserveFund(String specialReserveFund) {
		SpecialReserveFund = specialReserveFund;
	}

	/**
	 * ��ȡ totalLongTermLiabilities
	 * 
	 * @return the totalLongTermLiabilities ���ڸ�ծ�ϼ�
	 */
	public String getTotalLongTermLiabilities() {
		return TotalLongTermLiabilities;
	}

	/**
	 * ���� totalLongTermLiabilities
	 * 
	 * @param totalLongTermLiabilities
	 *            ���ڸ�ծ�ϼ�
	 */
	public void setTotalLongTermLiabilities(String totalLongTermLiabilities) {
		TotalLongTermLiabilities = totalLongTermLiabilities;
	}

	/**
	 * ��ȡ deferredTaxationCredit
	 * 
	 * @return the deferredTaxationCredit ����˰�����
	 */
	public String getDeferredTaxationCredit() {
		return DeferredTaxationCredit;
	}

	/**
	 * ���� deferredTaxationCredit
	 * 
	 * @param deferredTaxationCredit
	 *            ����˰�����
	 */
	public void setDeferredTaxationCredit(String deferredTaxationCredit) {
		DeferredTaxationCredit = deferredTaxationCredit;
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
	 * ��ȡ minorityInterest
	 * 
	 * @return the minorityInterest �����ɶ�Ȩ��
	 */
	public String getMinorityInterest() {
		return MinorityInterest;
	}

	/**
	 * ���� minorityInterest
	 * 
	 * @param minorityInterest
	 *            �����ɶ�Ȩ��
	 */
	public void setMinorityInterest(String minorityInterest) {
		MinorityInterest = minorityInterest;
	}

	/**
	 * ��ȡ paidInCapital
	 * 
	 * @return the paidInCapital ʵ���ʱ�
	 */
	public String getPaidInCapital() {
		return PaidInCapital;
	}

	/**
	 * ���� paidInCapital
	 * 
	 * @param paidInCapital
	 *            ʵ���ʱ�
	 */
	public void setPaidInCapital(String paidInCapital) {
		PaidInCapital = paidInCapital;
	}

	/**
	 * ��ȡ nationalCapital
	 * 
	 * @return the nationalCapital �����ʱ�
	 */
	public String getNationalCapital() {
		return NationalCapital;
	}

	/**
	 * ���� nationalCapital
	 * 
	 * @param nationalCapital
	 *            �����ʱ�
	 */
	public void setNationalCapital(String nationalCapital) {
		NationalCapital = nationalCapital;
	}

	/**
	 * ��ȡ collectiveCapital
	 * 
	 * @return the collectiveCapital �����ʱ�
	 */
	public String getCollectiveCapital() {
		return CollectiveCapital;
	}

	/**
	 * ���� collectiveCapital
	 * 
	 * @param collectiveCapital
	 *            �����ʱ�
	 */
	public void setCollectiveCapital(String collectiveCapital) {
		CollectiveCapital = collectiveCapital;
	}

	/**
	 * ��ȡ legalPersonsCapital
	 * 
	 * @return the legalPersonsCapital �����ʱ�
	 */
	public String getLegalPersonsCapital() {
		return LegalPersonsCapital;
	}

	/**
	 * ���� legalPersonsCapital
	 * 
	 * @param legalPersonsCapital
	 *            �����ʱ�
	 */
	public void setLegalPersonsCapital(String legalPersonsCapital) {
		LegalPersonsCapital = legalPersonsCapital;
	}

	/**
	 * ��ȡ stateOwnedLegalPersonsCapital
	 * 
	 * @return the stateOwnedLegalPersonsCapital �������ʱ���Ŀ�£����з����ʱ�
	 */
	public String getStateOwnedLegalPersonsCapital() {
		return StateOwnedLegalPersonsCapital;
	}

	/**
	 * ���� stateOwnedLegalPersonsCapital
	 * 
	 * @param stateOwnedLegalPersonsCapital
	 *            �������ʱ���Ŀ�£����з����ʱ�
	 */
	public void setStateOwnedLegalPersonsCapital(
			String stateOwnedLegalPersonsCapital) {
		StateOwnedLegalPersonsCapital = stateOwnedLegalPersonsCapital;
	}

	/**
	 * ��ȡ collectiveLegalPersonsCapital
	 * 
	 * @return the collectiveLegalPersonsCapital �������ʱ���Ŀ�£����巨���ʱ�
	 */
	public String getCollectiveLegalPersonsCapital() {
		return CollectiveLegalPersonsCapital;
	}

	/**
	 * ���� collectiveLegalPersonsCapital
	 * 
	 * @param collectiveLegalPersonsCapital
	 *            �������ʱ���Ŀ�£����巨���ʱ�
	 */
	public void setCollectiveLegalPersonsCapital(
			String collectiveLegalPersonsCapital) {
		CollectiveLegalPersonsCapital = collectiveLegalPersonsCapital;
	}

	/**
	 * ��ȡ personalCapital
	 * 
	 * @return the personalCapital �����ʱ�
	 */
	public String getPersonalCapital() {
		return PersonalCapital;
	}

	/**
	 * ���� personalCapital
	 * 
	 * @param personalCapital
	 *            �����ʱ�
	 */
	public void setPersonalCapital(String personalCapital) {
		PersonalCapital = personalCapital;
	}

	/**
	 * ��ȡ foreignBusinessmensCapital
	 * 
	 * @return the foreignBusinessmensCapital �����ʱ�
	 */
	public String getForeignBusinessmensCapital() {
		return ForeignBusinessmensCapital;
	}

	/**
	 * ���� foreignBusinessmensCapital
	 * 
	 * @param foreignBusinessmensCapital
	 *            �����ʱ�
	 */
	public void setForeignBusinessmensCapital(String foreignBusinessmensCapital) {
		ForeignBusinessmensCapital = foreignBusinessmensCapital;
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
	 * ��ȡ statutorySurplusReserve
	 * 
	 * @return the statutorySurplusReserve ��ӯ�๫����Ŀ�£�����ӯ�๫��
	 */
	public String getStatutorySurplusReserve() {
		return StatutorySurplusReserve;
	}

	/**
	 * ���� statutorySurplusReserve
	 * 
	 * @param statutorySurplusReserve
	 *            ��ӯ�๫����Ŀ�£�����ӯ�๫��
	 */
	public void setStatutorySurplusReserve(String statutorySurplusReserve) {
		StatutorySurplusReserve = statutorySurplusReserve;
	}

	/**
	 * ��ȡ publicWelfareFund
	 * 
	 * @return the publicWelfareFund ��ӯ�๫����Ŀ�£������
	 */
	public String getPublicWelfareFund() {
		return PublicWelfareFund;
	}

	/**
	 * ���� publicWelfareFund
	 * 
	 * @param publicWelfareFund
	 *            ��ӯ�๫����Ŀ�£������
	 */
	public void setPublicWelfareFund(String publicWelfareFund) {
		PublicWelfareFund = publicWelfareFund;
	}

	/**
	 * ��ȡ supplermentaryCurrentCapital
	 * 
	 * @return the supplermentaryCurrentCapital ��ӯ�๫����Ŀ�£����������ʱ�
	 */
	public String getSupplermentaryCurrentCapital() {
		return SupplermentaryCurrentCapital;
	}

	/**
	 * ���� supplermentaryCurrentCapital
	 * 
	 * @param supplermentaryCurrentCapital
	 *            ��ӯ�๫����Ŀ�£����������ʱ�
	 */
	public void setSupplermentaryCurrentCapital(
			String supplermentaryCurrentCapital) {
		SupplermentaryCurrentCapital = supplermentaryCurrentCapital;
	}

	/**
	 * ��ȡ unaffirmedInvestmentLoss
	 * 
	 * @return the unaffirmedInvestmentLoss δȷ�ϵ�Ͷ����ʧ
	 */
	public String getUnaffirmedInvestmentLoss() {
		return UnaffirmedInvestmentLoss;
	}

	/**
	 * ���� unaffirmedInvestmentLoss
	 * 
	 * @param unaffirmedInvestmentLoss
	 *            δȷ�ϵ�Ͷ����ʧ
	 */
	public void setUnaffirmedInvestmentLoss(String unaffirmedInvestmentLoss) {
		UnaffirmedInvestmentLoss = unaffirmedInvestmentLoss;
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
	 * ��ȡ differenceOnTranslationOfForeignCurrencyFinancialStatements
	 * 
	 * @return the differenceOnTranslationOfForeignCurrencyFinancialStatements
	 *         ��ұ���������
	 */
	public String getDifferenceOnTranslationOfForeignCurrencyFinancialStatements() {
		return DifferenceOnTranslationOfForeignCurrencyFinancialStatements;
	}

	/**
	 * ���� differenceOnTranslationOfForeignCurrencyFinancialStatements
	 * 
	 * @param differenceOnTranslationOfForeignCurrencyFinancialStatements
	 *            ��ұ���������
	 */
	public void setDifferenceOnTranslationOfForeignCurrencyFinancialStatements(
			String differenceOnTranslationOfForeignCurrencyFinancialStatements) {
		DifferenceOnTranslationOfForeignCurrencyFinancialStatements = differenceOnTranslationOfForeignCurrencyFinancialStatements;
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
	 * @return the totalEquityAndLiabilities ��ծ��������Ȩ���ܼ�
	 */
	public String getTotalEquityAndLiabilities() {
		return TotalEquityAndLiabilities;
	}

	/**
	 * ���� totalEquityAndLiabilities
	 * 
	 * @param totalEquityAndLiabilities
	 *            ��ծ��������Ȩ���ܼ�
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
		return "BalanceSheet2002Sgmt [AccountsPayable="
				+ AccountsPayable
				+ ", AccountsReceivable="
				+ AccountsReceivable
				+ ", AllowanceReceivable="
				+ AllowanceReceivable
				+ ", AmongItSpeciallyApprovedReservingMaterials="
				+ AmongItSpeciallyApprovedReservingMaterials
				+ ", BondsPayable="
				+ BondsPayable
				+ ", CapitalrRserve="
				+ CapitalrRserve
				+ ", CollectiveCapital="
				+ CollectiveCapital
				+ ", CollectiveLegalPersonsCapital="
				+ CollectiveLegalPersonsCapital
				+ ", ConstructionInProgress="
				+ ConstructionInProgress
				+ ", ConstructionMaterials="
				+ ConstructionMaterials
				+ ", CurrencyFunds="
				+ CurrencyFunds
				+ ", DeferredAssets="
				+ DeferredAssets
				+ ", DeferredAssetsDebits="
				+ DeferredAssetsDebits
				+ ", DeferredExpenses="
				+ DeferredExpenses
				+ ", DeferredTaxationCredit="
				+ DeferredTaxationCredit
				+ ", DifferenceOnTranslationOfForeignCurrencyFinancialStatements="
				+ DifferenceOnTranslationOfForeignCurrencyFinancialStatements
				+ ", DividendsReceivable=" + DividendsReceivable
				+ ", EmployeeBenefits=" + EmployeeBenefits
				+ ", ExportDrawbackReceivable=" + ExportDrawbackReceivable
				+ ", FinishedProducts=" + FinishedProducts
				+ ", FixedAssetAccumulatedDepreciation="
				+ FixedAssetAccumulatedDepreciation + ", FixedAssetsNetValue="
				+ FixedAssetsNetValue + ", FixedAssetsPendingForDisposal="
				+ FixedAssetsPendingForDisposal
				+ ", ForeignBusinessmensCapital=" + ForeignBusinessmensCapital
				+ ", FutureGuarantee=" + FutureGuarantee + ", GrantsPayable="
				+ GrantsPayable + ", ImprovementExpenditureOfFixedAssets="
				+ ImprovementExpenditureOfFixedAssets
				+ ", IncludingFixedAssetsRepair=" + IncludingFixedAssetsRepair
				+ ", IncomePayable=" + IncomePayable
				+ ", IncorporatingPriceDifference="
				+ IncorporatingPriceDifference + ", IntangibleAssets="
				+ IntangibleAssets + ", InterestReceivable="
				+ InterestReceivable + ", Inventories=" + Inventories
				+ ", LandUseRights=" + LandUseRights + ", LegalPersonsCapital="
				+ LegalPersonsCapital + ", LongTermBorrowings="
				+ LongTermBorrowings
				+ ", LongTermDebentureInvestmentFallingDueInAYear="
				+ LongTermDebentureInvestmentFallingDueInAYear
				+ ", LongTermEquityInvestment=" + LongTermEquityInvestment
				+ ", LongTermInvestment=" + LongTermInvestment
				+ ", LongTermLiabilitiesDueWithinOneYear="
				+ LongTermLiabilitiesDueWithinOneYear + ", LongTermPayables="
				+ LongTermPayables + ", LongTermSecuritiesInvestment="
				+ LongTermSecuritiesInvestment + ", MinorityInterest="
				+ MinorityInterest + ", NationalCapital=" + NationalCapital
				+ ", NetValueOfFixedAssets=" + NetValueOfFixedAssets
				+ ", NotesPayable=" + NotesPayable + ", NotesReceivable="
				+ NotesReceivable + ", OriginalCostOfFixedAsset="
				+ OriginalCostOfFixedAsset + ", OtherCurrentAssets="
				+ OtherCurrentAssets + ", OtherCurrentLiabilities="
				+ OtherCurrentLiabilities + ", OtherLongTermAssets="
				+ OtherLongTermAssets + ", OtherLongTermLiabilities="
				+ OtherLongTermLiabilities + ", OtherPayable=" + OtherPayable
				+ ", OtherPayableToGovernment=" + OtherPayableToGovernment
				+ ", OtherReceivables=" + OtherReceivables + ", PaidInCapital="
				+ PaidInCapital + ", PersonalCapital=" + PersonalCapital
				+ ", Prepayments=" + Prepayments + ", ProvisionForExpenses="
				+ ProvisionForExpenses
				+ ", ProvisionForImpairmentOfFixedAssets="
				+ ProvisionForImpairmentOfFixedAssets + ", Provisions="
				+ Provisions + ", PublicWelfareFund=" + PublicWelfareFund
				+ ", RawMaterials=" + RawMaterials + ", ReceiptsInAdvance="
				+ ReceiptsInAdvance + ", ShortTermBorrowings="
				+ ShortTermBorrowings + ", ShortTermInvestments="
				+ ShortTermInvestments + ", SpecialReserveFund="
				+ SpecialReserveFund + ", StateOwnedLegalPersonsCapital="
				+ StateOwnedLegalPersonsCapital + ", StatutorySurplusReserve="
				+ StatutorySurplusReserve + ", SupplermentaryCurrentCapital="
				+ SupplermentaryCurrentCapital + ", SurplusReserve="
				+ SurplusReserve + ", TaxesPayable=" + TaxesPayable
				+ ", TotalAssets=" + TotalAssets + ", TotalCurrentAssets="
				+ TotalCurrentAssets + ", TotalCurrentLiabilities="
				+ TotalCurrentLiabilities + ", TotalEquity=" + TotalEquity
				+ ", TotalEquityAndLiabilities=" + TotalEquityAndLiabilities
				+ ", TotalFixedAssets=" + TotalFixedAssets
				+ ", TotalIntangibleAssetsAndOtherAssets="
				+ TotalIntangibleAssetsAndOtherAssets + ", TotalLiabilities="
				+ TotalLiabilities + ", TotalLongTermInvestment="
				+ TotalLongTermInvestment + ", TotalLongTermLiabilities="
				+ TotalLongTermLiabilities + ", UnaffirmedInvestmentLoss="
				+ UnaffirmedInvestmentLoss + ", UnappropriatedProfit="
				+ UnappropriatedProfit + ", UnsettledGLOnCurrentAssets="
				+ UnsettledGLOnCurrentAssets + ", UnsettledGLOnFixedAssets="
				+ UnsettledGLOnFixedAssets + ", WagesOrSalariesPayables="
				+ WagesOrSalariesPayables + "]";
	}
}
