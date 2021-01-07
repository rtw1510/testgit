package com.dhcc.xml.ent.entity.finance.db;

/**
 * Title: InstitutionBalanceSheetSgmt<br/>
 * Description:���ݿ�ӳ�䣺������+��ҵ��λ�ʲ���ծ���<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */

public class EB_FinaInsBal_Info {
	/**
	 *�ϱ�״̬
	 */
	private String Rpt_Type;
	/**
	 *��Ϣ��¼����
	 */
	private String InfRecType;
	/**
	 *��ҵ����
	 */
	private String EntName;
	/**
	 *��ҵ��ݱ�ʶ����
	 */
	private String EntCertType;
	/**
	 *��ҵ��ݱ�ʶ����
	 */
	private String EntCertNum;
	/**
	 *��Ϣ��������
	 */
	private String RptDate;
	/**
	 *�������
	 */
	private String SheetYear;
	/**
	 *��������
	 */
	private String SheetType;
	/**
	 *��������ϸ��
	 */
	private String SheetTypeDivide;
	/**
	 *�������������
	 */
	private String AuditFirmName;
	/**
	 *�����Ա����
	 */
	private String AuditorName;
	/**
	 *���ʱ��
	 */
	private String AuditTime;
	/**
	 *�ͻ�����ά����������
	 */
	private String Cimoc;
	/**
	 *����ʱ��˵������
	 */
	private String RptDateCode;
	/**
	 *�����ʽ�
	 */
	private String CurrencyFunds;
	/**
	 *����Ͷ��
	 */
	private String ShortTermInvestments;
	/**
	 *����Ӧ�������
	 */
	private String AmountOfFinancialReturn;
	/**
	 *Ӧ��Ʊ��
	 */
	private String NotesReceivable;
	/**
	 *Ӧ���˿�
	 */
	private String AccountsReceivable;
	/**
	 *Ԥ���˿�
	 */
	private String Prepayments;
	/**
	 *����Ӧ�տ�
	 */
	private String OtherReceivables;
	/**
	 *���
	 */
	private String Inventories;
	/**
	 *���������ʲ�
	 */
	private String OtherCurrentAssets;
	/**
	 *�����ʲ��ϼ�
	 */
	private String TotalCurrentAssets;
	/**
	 *����Ͷ��
	 */
	private String LongTermInvestment;
	/**
	 *�̶��ʲ�
	 */
	private String FixedAssets;
	/**
	 *�̶��ʲ�ԭ��
	 */
	private String OriginalCostOfFixedAsset;
	/**
	 *�ۼ��۾�
	 */
	private String FixedAssetAccumulatedDepreciation;
	/**
	 *�ڽ�����
	 */
	private String ConstructionInProcess;
	/**
	 *�����ʲ�
	 */
	private String IntangibleAssets;
	/**
	 *�����ʲ�ԭ��
	 */
	private String OriginalPriceOfIntangibleAssets;
	/**
	 *�ۼ�̯��
	 */
	private String AccumulatedAmortization;
	/**
	 *�������ʲ�����
	 */
	private String AssetsToBeProcessedPendingTheProfit;
	/**
	 *�������ʲ��ϼ�
	 */
	private String TotalNonCurrentAssets;
	/**
	 *�ʲ��ܼ�
	 */
	private String TotalAssets;
	/**
	 *���ڽ��
	 */
	private String ShortTermBorrowings;
	/**
	 *Ӧ��˰��
	 */
	private String TaxPayable;
	/**
	 *Ӧ�ɹ����
	 */
	private String TreasuryPayable;
	/**
	 *Ӧ�ɲ���ר����
	 */
	private String PayableFinancialSpecialAccount;
	/**
	 *Ӧ��ְ��н��
	 */
	private String EmployeeBenefitsPayable;
	/**
	 *Ӧ��Ʊ��
	 */
	private String NotesPayable;
	/**
	 *Ӧ���˿�
	 */
	private String AccountsPayable;
	/**
	 *Ԥ���˿�
	 */
	private String ReceiptsInAdvance;
	/**
	 *����Ӧ����
	 */
	private String OtherPayables;
	/**
	 *����������ծ
	 */
	private String OtherCurrentLiabilities;
	/**
	 *������ծ�ϼ�
	 */
	private String TotalCurrentLiabilities;
	/**
	 *���ڽ��
	 */
	private String LongTermBorrowings;
	/**
	 *����Ӧ����
	 */
	private String LongTermPayables;
	/**
	 *��������ծ�ϼ�
	 */
	private String TotalNonCurrentLiabilities;
	/**
	 *��ծ�ϼ�
	 */
	private String TotalLiabilities;
	/**
	 *��ҵ����
	 */
	private String EnterpriseFund;
	/**
	 *�������ʲ�����
	 */
	private String NonCurrentAssetsFund;
	/**
	 *ר�û���
	 */
	private String SpecialPurposeFunds;
	/**
	 *����������ת
	 */
	private String FinancialAidCarriedOver;
	/**
	 *������������
	 */
	private String FinancialAidBalance;
	/**
	 *�ǲ���������ת
	 */
	private String NonFinancialAidCarriedOver;
	/**
	 *�ǲ�����������
	 */
	private String NonFinancialAidBalance;
	/**
	 *��ҵ����
	 */
	private String UndertakingsBalance;
	/**
	 *��Ӫ����
	 */
	private String OperatingBalance;
	/**
	 *���ʲ��ϼ�
	 */
	private String TotalNetAssets;
	/**
	 *��ծ�;��ʲ��ܼ�
	 */
	private String TotalLiabilitiesAndNetAssets;

	public EB_FinaInsBal_Info() {
		super();
	}

	/**
	 * ��ȡ rpt_Type
	 * 
	 * @return the rpt_Type �ϱ�״̬
	 */
	public String getRpt_Type() {
		return Rpt_Type;
	}

	/**
	 * ���� rpt_Type
	 * 
	 * @param rpt_Type
	 *            �ϱ�״̬
	 */
	public void setRpt_Type(String rptType) {
		Rpt_Type = rptType;
	}

	/**
	 * ��ȡ infRecType
	 * 
	 * @return the infRecType ��Ϣ��¼����
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * ���� infRecType
	 * 
	 * @param infRecType
	 *            ��Ϣ��¼����
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * ��ȡ entName
	 * 
	 * @return the entName ��ҵ����
	 */
	public String getEntName() {
		return EntName;
	}

	/**
	 * ���� entName
	 * 
	 * @param entName
	 *            ��ҵ����
	 */
	public void setEntName(String entName) {
		EntName = entName;
	}

	/**
	 * ��ȡ entCertType
	 * 
	 * @return the entCertType ��ҵ��ݱ�ʶ����
	 */
	public String getEntCertType() {
		return EntCertType;
	}

	/**
	 * ���� entCertType
	 * 
	 * @param entCertType
	 *            ��ҵ��ݱ�ʶ����
	 */
	public void setEntCertType(String entCertType) {
		EntCertType = entCertType;
	}

	/**
	 * ��ȡ entCertNum
	 * 
	 * @return the entCertNum ��ҵ��ݱ�ʶ����
	 */
	public String getEntCertNum() {
		return EntCertNum;
	}

	/**
	 * ���� entCertNum
	 * 
	 * @param entCertNum
	 *            ��ҵ��ݱ�ʶ����
	 */
	public void setEntCertNum(String entCertNum) {
		EntCertNum = entCertNum;
	}

	/**
	 * ��ȡ rptDate
	 * 
	 * @return the rptDate ��Ϣ��������
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * ���� rptDate
	 * 
	 * @param rptDate
	 *            ��Ϣ��������
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	/**
	 * ��ȡ sheetYear
	 * 
	 * @return the sheetYear �������
	 */
	public String getSheetYear() {
		return SheetYear;
	}

	/**
	 * ���� sheetYear
	 * 
	 * @param sheetYear
	 *            �������
	 */
	public void setSheetYear(String sheetYear) {
		SheetYear = sheetYear;
	}

	/**
	 * ��ȡ sheetType
	 * 
	 * @return the sheetType ��������
	 */
	public String getSheetType() {
		return SheetType;
	}

	/**
	 * ���� sheetType
	 * 
	 * @param sheetType
	 *            ��������
	 */
	public void setSheetType(String sheetType) {
		SheetType = sheetType;
	}

	/**
	 * ��ȡ sheetTypeDivide
	 * 
	 * @return the sheetTypeDivide ��������ϸ��
	 */
	public String getSheetTypeDivide() {
		return SheetTypeDivide;
	}

	/**
	 * ���� sheetTypeDivide
	 * 
	 * @param sheetTypeDivide
	 *            ��������ϸ��
	 */
	public void setSheetTypeDivide(String sheetTypeDivide) {
		SheetTypeDivide = sheetTypeDivide;
	}

	/**
	 * ��ȡ auditFirmName
	 * 
	 * @return the auditFirmName �������������
	 */
	public String getAuditFirmName() {
		return AuditFirmName;
	}

	/**
	 * ���� auditFirmName
	 * 
	 * @param auditFirmName
	 *            �������������
	 */
	public void setAuditFirmName(String auditFirmName) {
		AuditFirmName = auditFirmName;
	}

	/**
	 * ��ȡ auditorName
	 * 
	 * @return the auditorName �����Ա����
	 */
	public String getAuditorName() {
		return AuditorName;
	}

	/**
	 * ���� auditorName
	 * 
	 * @param auditorName
	 *            �����Ա����
	 */
	public void setAuditorName(String auditorName) {
		AuditorName = auditorName;
	}

	/**
	 * ��ȡ auditTime
	 * 
	 * @return the auditTime ���ʱ��
	 */
	public String getAuditTime() {
		return AuditTime;
	}

	/**
	 * ���� auditTime
	 * 
	 * @param auditTime
	 *            ���ʱ��
	 */
	public void setAuditTime(String auditTime) {
		AuditTime = auditTime;
	}

	/**
	 * ��ȡ cimoc
	 * 
	 * @return the cimoc �ͻ�����ά����������
	 */
	public String getCimoc() {
		return Cimoc;
	}

	/**
	 * ���� cimoc
	 * 
	 * @param cimoc
	 *            �ͻ�����ά����������
	 */
	public void setCimoc(String cimoc) {
		Cimoc = cimoc;
	}

	/**
	 * ��ȡ rptDateCode
	 * 
	 * @return the rptDateCode ����ʱ��˵������
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}

	/**
	 * ���� rptDateCode
	 * 
	 * @param rptDateCode
	 *            ����ʱ��˵������
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
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
	 * ��ȡ amountOfFinancialReturn
	 * 
	 * @return the amountOfFinancialReturn ����Ӧ�������
	 */
	public String getAmountOfFinancialReturn() {
		return AmountOfFinancialReturn;
	}

	/**
	 * ���� amountOfFinancialReturn
	 * 
	 * @param amountOfFinancialReturn
	 *            ����Ӧ�������
	 */
	public void setAmountOfFinancialReturn(String amountOfFinancialReturn) {
		AmountOfFinancialReturn = amountOfFinancialReturn;
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
	 * ��ȡ constructionInProcess
	 * 
	 * @return the constructionInProcess �ڽ�����
	 */
	public String getConstructionInProcess() {
		return ConstructionInProcess;
	}

	/**
	 * ���� constructionInProcess
	 * 
	 * @param constructionInProcess
	 *            �ڽ�����
	 */
	public void setConstructionInProcess(String constructionInProcess) {
		ConstructionInProcess = constructionInProcess;
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
	 * ��ȡ originalPriceOfIntangibleAssets
	 * 
	 * @return the originalPriceOfIntangibleAssets �����ʲ�ԭ��
	 */
	public String getOriginalPriceOfIntangibleAssets() {
		return OriginalPriceOfIntangibleAssets;
	}

	/**
	 * ���� originalPriceOfIntangibleAssets
	 * 
	 * @param originalPriceOfIntangibleAssets
	 *            �����ʲ�ԭ��
	 */
	public void setOriginalPriceOfIntangibleAssets(
			String originalPriceOfIntangibleAssets) {
		OriginalPriceOfIntangibleAssets = originalPriceOfIntangibleAssets;
	}

	/**
	 * ��ȡ accumulatedAmortization
	 * 
	 * @return the accumulatedAmortization �ۼ�̯��
	 */
	public String getAccumulatedAmortization() {
		return AccumulatedAmortization;
	}

	/**
	 * ���� accumulatedAmortization
	 * 
	 * @param accumulatedAmortization
	 *            �ۼ�̯��
	 */
	public void setAccumulatedAmortization(String accumulatedAmortization) {
		AccumulatedAmortization = accumulatedAmortization;
	}

	/**
	 * ��ȡ assetsToBeProcessedPendingTheProfit
	 * 
	 * @return the assetsToBeProcessedPendingTheProfit �������ʲ�����
	 */
	public String getAssetsToBeProcessedPendingTheProfit() {
		return AssetsToBeProcessedPendingTheProfit;
	}

	/**
	 * ���� assetsToBeProcessedPendingTheProfit
	 * 
	 * @param assetsToBeProcessedPendingTheProfit
	 *            �������ʲ�����
	 */
	public void setAssetsToBeProcessedPendingTheProfit(
			String assetsToBeProcessedPendingTheProfit) {
		AssetsToBeProcessedPendingTheProfit = assetsToBeProcessedPendingTheProfit;
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
	 * ��ȡ taxPayable
	 * 
	 * @return the taxPayable Ӧ��˰��
	 */
	public String getTaxPayable() {
		return TaxPayable;
	}

	/**
	 * ���� taxPayable
	 * 
	 * @param taxPayable
	 *            Ӧ��˰��
	 */
	public void setTaxPayable(String taxPayable) {
		TaxPayable = taxPayable;
	}

	/**
	 * ��ȡ treasuryPayable
	 * 
	 * @return the treasuryPayable Ӧ�ɹ����
	 */
	public String getTreasuryPayable() {
		return TreasuryPayable;
	}

	/**
	 * ���� treasuryPayable
	 * 
	 * @param treasuryPayable
	 *            Ӧ�ɹ����
	 */
	public void setTreasuryPayable(String treasuryPayable) {
		TreasuryPayable = treasuryPayable;
	}

	/**
	 * ��ȡ payableFinancialSpecialAccount
	 * 
	 * @return the payableFinancialSpecialAccount Ӧ�ɲ���ר����
	 */
	public String getPayableFinancialSpecialAccount() {
		return PayableFinancialSpecialAccount;
	}

	/**
	 * ���� payableFinancialSpecialAccount
	 * 
	 * @param payableFinancialSpecialAccount
	 *            Ӧ�ɲ���ר����
	 */
	public void setPayableFinancialSpecialAccount(
			String payableFinancialSpecialAccount) {
		PayableFinancialSpecialAccount = payableFinancialSpecialAccount;
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
	 * 
	 * @return the accountsPayable Ӧ���˿�
	 */
	public String getAccountsPayable() {
		return AccountsPayable;
	}

	/**
	 * ���� accountsPayable
	 * 
	 * @param accountsPayable
	 *            Ӧ���˿�
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
	 * ��ȡ enterpriseFund
	 * 
	 * @return the enterpriseFund ��ҵ����
	 */
	public String getEnterpriseFund() {
		return EnterpriseFund;
	}

	/**
	 * ���� enterpriseFund
	 * 
	 * @param enterpriseFund
	 *            ��ҵ����
	 */
	public void setEnterpriseFund(String enterpriseFund) {
		EnterpriseFund = enterpriseFund;
	}

	/**
	 * ��ȡ nonCurrentAssetsFund
	 * 
	 * @return the nonCurrentAssetsFund �������ʲ�����
	 */
	public String getNonCurrentAssetsFund() {
		return NonCurrentAssetsFund;
	}

	/**
	 * ���� nonCurrentAssetsFund
	 * 
	 * @param nonCurrentAssetsFund
	 *            �������ʲ�����
	 */
	public void setNonCurrentAssetsFund(String nonCurrentAssetsFund) {
		NonCurrentAssetsFund = nonCurrentAssetsFund;
	}

	/**
	 * ��ȡ specialPurposeFunds
	 * 
	 * @return the specialPurposeFunds ר�û���
	 */
	public String getSpecialPurposeFunds() {
		return SpecialPurposeFunds;
	}

	/**
	 * ���� specialPurposeFunds
	 * 
	 * @param specialPurposeFunds
	 *            ר�û���
	 */
	public void setSpecialPurposeFunds(String specialPurposeFunds) {
		SpecialPurposeFunds = specialPurposeFunds;
	}

	/**
	 * ��ȡ financialAidCarriedOver
	 * 
	 * @return the financialAidCarriedOver ����������ת
	 */
	public String getFinancialAidCarriedOver() {
		return FinancialAidCarriedOver;
	}

	/**
	 * ���� financialAidCarriedOver
	 * 
	 * @param financialAidCarriedOver
	 *            ����������ת
	 */
	public void setFinancialAidCarriedOver(String financialAidCarriedOver) {
		FinancialAidCarriedOver = financialAidCarriedOver;
	}

	/**
	 * ��ȡ financialAidBalance
	 * 
	 * @return the financialAidBalance ������������
	 */
	public String getFinancialAidBalance() {
		return FinancialAidBalance;
	}

	/**
	 * ���� financialAidBalance
	 * 
	 * @param financialAidBalance
	 *            ������������
	 */
	public void setFinancialAidBalance(String financialAidBalance) {
		FinancialAidBalance = financialAidBalance;
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
	 * ��ȡ nonFinancialAidBalance
	 * 
	 * @return the nonFinancialAidBalance �ǲ�����������
	 */
	public String getNonFinancialAidBalance() {
		return NonFinancialAidBalance;
	}

	/**
	 * ���� nonFinancialAidBalance
	 * 
	 * @param nonFinancialAidBalance
	 *            �ǲ�����������
	 */
	public void setNonFinancialAidBalance(String nonFinancialAidBalance) {
		NonFinancialAidBalance = nonFinancialAidBalance;
	}

	/**
	 * ��ȡ undertakingsBalance
	 * 
	 * @return the undertakingsBalance ��ҵ����
	 */
	public String getUndertakingsBalance() {
		return UndertakingsBalance;
	}

	/**
	 * ���� undertakingsBalance
	 * 
	 * @param undertakingsBalance
	 *            ��ҵ����
	 */
	public void setUndertakingsBalance(String undertakingsBalance) {
		UndertakingsBalance = undertakingsBalance;
	}

	/**
	 * ��ȡ operatingBalance
	 * 
	 * @return the operatingBalance ��Ӫ����
	 */
	public String getOperatingBalance() {
		return OperatingBalance;
	}

	/**
	 * ���� operatingBalance
	 * 
	 * @param operatingBalance
	 *            ��Ӫ����
	 */
	public void setOperatingBalance(String operatingBalance) {
		OperatingBalance = operatingBalance;
	}

	/**
	 * ��ȡ totalNetAssets
	 * 
	 * @return the totalNetAssets ���ʲ��ϼ�
	 */
	public String getTotalNetAssets() {
		return TotalNetAssets;
	}

	/**
	 * ���� totalNetAssets
	 * 
	 * @param totalNetAssets
	 *            ���ʲ��ϼ�
	 */
	public void setTotalNetAssets(String totalNetAssets) {
		TotalNetAssets = totalNetAssets;
	}

	/**
	 * ��ȡ totalLiabilitiesAndNetAssets
	 * 
	 * @return the totalLiabilitiesAndNetAssets ��ծ�;��ʲ��ܼ�
	 */
	public String getTotalLiabilitiesAndNetAssets() {
		return TotalLiabilitiesAndNetAssets;
	}

	/**
	 * ���� totalLiabilitiesAndNetAssets
	 * 
	 * @param totalLiabilitiesAndNetAssets
	 *            ��ծ�;��ʲ��ܼ�
	 */
	public void setTotalLiabilitiesAndNetAssets(
			String totalLiabilitiesAndNetAssets) {
		TotalLiabilitiesAndNetAssets = totalLiabilitiesAndNetAssets;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InstitutionBalanceSheetSgmt [AccountsPayable="
				+ AccountsPayable + ", AccountsReceivable="
				+ AccountsReceivable + ", AccumulatedAmortization="
				+ AccumulatedAmortization + ", AmountOfFinancialReturn="
				+ AmountOfFinancialReturn
				+ ", AssetsToBeProcessedPendingTheProfit="
				+ AssetsToBeProcessedPendingTheProfit + ", AuditFirmName="
				+ AuditFirmName + ", AuditTime=" + AuditTime + ", AuditorName="
				+ AuditorName + ", Cimoc=" + Cimoc + ", ConstructionInProcess="
				+ ConstructionInProcess + ", CurrencyFunds=" + CurrencyFunds
				+ ", EmployeeBenefitsPayable=" + EmployeeBenefitsPayable
				+ ", EntCertNum=" + EntCertNum + ", EntCertType=" + EntCertType
				+ ", EntName=" + EntName + ", EnterpriseFund=" + EnterpriseFund
				+ ", FinancialAidBalance=" + FinancialAidBalance
				+ ", FinancialAidCarriedOver=" + FinancialAidCarriedOver
				+ ", FixedAssetAccumulatedDepreciation="
				+ FixedAssetAccumulatedDepreciation + ", FixedAssets="
				+ FixedAssets + ", InfRecType=" + InfRecType
				+ ", IntangibleAssets=" + IntangibleAssets + ", Inventories="
				+ Inventories + ", LongTermBorrowings=" + LongTermBorrowings
				+ ", LongTermInvestment=" + LongTermInvestment
				+ ", LongTermPayables=" + LongTermPayables
				+ ", NonCurrentAssetsFund=" + NonCurrentAssetsFund
				+ ", NonFinancialAidBalance=" + NonFinancialAidBalance
				+ ", NonFinancialAidCarriedOver=" + NonFinancialAidCarriedOver
				+ ", NotesPayable=" + NotesPayable + ", NotesReceivable="
				+ NotesReceivable + ", OperatingBalance=" + OperatingBalance
				+ ", OriginalCostOfFixedAsset=" + OriginalCostOfFixedAsset
				+ ", OriginalPriceOfIntangibleAssets="
				+ OriginalPriceOfIntangibleAssets + ", OtherCurrentAssets="
				+ OtherCurrentAssets + ", OtherCurrentLiabilities="
				+ OtherCurrentLiabilities + ", OtherPayables=" + OtherPayables
				+ ", OtherReceivables=" + OtherReceivables
				+ ", PayableFinancialSpecialAccount="
				+ PayableFinancialSpecialAccount + ", Prepayments="
				+ Prepayments + ", ReceiptsInAdvance=" + ReceiptsInAdvance
				+ ", RptDate=" + RptDate + ", RptDateCode=" + RptDateCode
				+ ", Rpt_Type=" + Rpt_Type + ", SheetType=" + SheetType
				+ ", SheetTypeDivide=" + SheetTypeDivide + ", SheetYear="
				+ SheetYear + ", ShortTermBorrowings=" + ShortTermBorrowings
				+ ", ShortTermInvestments=" + ShortTermInvestments
				+ ", SpecialPurposeFunds=" + SpecialPurposeFunds
				+ ", TaxPayable=" + TaxPayable + ", TotalAssets=" + TotalAssets
				+ ", TotalCurrentAssets=" + TotalCurrentAssets
				+ ", TotalCurrentLiabilities=" + TotalCurrentLiabilities
				+ ", TotalLiabilities=" + TotalLiabilities
				+ ", TotalLiabilitiesAndNetAssets="
				+ TotalLiabilitiesAndNetAssets + ", TotalNetAssets="
				+ TotalNetAssets + ", TotalNonCurrentAssets="
				+ TotalNonCurrentAssets + ", TotalNonCurrentLiabilities="
				+ TotalNonCurrentLiabilities + ", TreasuryPayable="
				+ TreasuryPayable + ", UndertakingsBalance="
				+ UndertakingsBalance + "]";
	}
}
