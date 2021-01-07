package com.dhcc.xml.ent.entity.finance.db;


/**
 * Title: IncomeStatementProfitAppropriation2007Sgmt<br/>
 * Description:���ݿ�ӳ�䣺������+2007���������������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
public class EB_FinaPro07_Info {
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
	 *Ӫҵ����
	 */
	private String RevenueOfSales; 
	/**
	 *Ӫҵ�ɱ�
	 */
	private String CostOfSales; 
	/**
	 *Ӫҵ˰�𼰸���
	 */
	private String BusinessAndOtherTaxes; 
	/**
	 *���۷���
	 */
	private String SellingExpenses; 
	/**
	 *�������
	 */
	private String GeneralAndAdministrativeExpenses; 
	/**
	 *�������
	 */
	private String FinancialExpense; 
	/**
	 *�ʲ���ֵ��ʧ
	 */
	private String ImpairmentLossOfAssets; 
	/**
	 *���ʼ�ֵ�䶯������
	 */
	private String ProfitOrLossArisingFromChangesInFairValue; 
	/**
	 *Ͷ�ʾ�����
	 */
	private String InvestmentIncome; 
	/**
	 *����Ӫ��ҵ�ͺ�Ӫ��ҵ��Ͷ������
	 */
	private String InvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise; 
	/**
	 *Ӫҵ����
	 */
	private String OperatingProfits; 
	/**
	 *Ӫҵ������
	 */
	private String NonOperatingIncome; 
	/**
	 *Ӫҵ��֧��
	 */
	private String NonOperatingExpenses; 
	/**
	 *�������ʲ���ʧ�����У��������ʲ�������ʧ��
	 */
	private String NonCurrentAssets; 
	/**
	 *�����ܶ�
	 */
	private String ProfitBeforeTax; 
	/**
	 *����˰����
	 */
	private String IncomeTaxExpense; 
	/**
	 *������
	 */
	private String NetProfit; 
	/**
	 *����ÿ������
	 */
	private String BasicEarningsPerShare; 
	/**
	 *ϡ��ÿ������
	 */
	private String DilutedEarningsPerShare; 

	public EB_FinaPro07_Info() {
		super();
	}

	/**  
	 * ��ȡ infRecType
	 * @return the infRecType ��Ϣ��¼���� 
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**  
	 * ���� infRecType  
	 * @param infRecType ��Ϣ��¼����  
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**  
	 * ��ȡ entName
	 * @return the entName ��ҵ���� 
	 */
	public String getEntName() {
		return EntName;
	}

	/**  
	 * ���� entName  
	 * @param entName ��ҵ����  
	 */
	public void setEntName(String entName) {
		EntName = entName;
	}

	/**  
	 * ��ȡ entCertType
	 * @return the entCertType ��ҵ��ݱ�ʶ���� 
	 */
	public String getEntCertType() {
		return EntCertType;
	}

	/**  
	 * ���� entCertType  
	 * @param entCertType ��ҵ��ݱ�ʶ����  
	 */
	public void setEntCertType(String entCertType) {
		EntCertType = entCertType;
	}

	/**  
	 * ��ȡ entCertNum
	 * @return the entCertNum ��ҵ��ݱ�ʶ���� 
	 */
	public String getEntCertNum() {
		return EntCertNum;
	}

	/**  
	 * ���� entCertNum  
	 * @param entCertNum ��ҵ��ݱ�ʶ����  
	 */
	public void setEntCertNum(String entCertNum) {
		EntCertNum = entCertNum;
	}

	/**  
	 * ��ȡ rptDate
	 * @return the rptDate ��Ϣ�������� 
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**  
	 * ���� rptDate  
	 * @param rptDate ��Ϣ��������  
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	/**  
	 * ��ȡ sheetYear
	 * @return the sheetYear ������� 
	 */
	public String getSheetYear() {
		return SheetYear;
	}

	/**  
	 * ���� sheetYear  
	 * @param sheetYear �������  
	 */
	public void setSheetYear(String sheetYear) {
		SheetYear = sheetYear;
	}

	/**  
	 * ��ȡ sheetType
	 * @return the sheetType �������� 
	 */
	public String getSheetType() {
		return SheetType;
	}

	/**  
	 * ���� sheetType  
	 * @param sheetType ��������  
	 */
	public void setSheetType(String sheetType) {
		SheetType = sheetType;
	}

	/**  
	 * ��ȡ sheetTypeDivide
	 * @return the sheetTypeDivide ��������ϸ�� 
	 */
	public String getSheetTypeDivide() {
		return SheetTypeDivide;
	}

	/**  
	 * ���� sheetTypeDivide  
	 * @param sheetTypeDivide ��������ϸ��  
	 */
	public void setSheetTypeDivide(String sheetTypeDivide) {
		SheetTypeDivide = sheetTypeDivide;
	}

	/**  
	 * ��ȡ auditFirmName
	 * @return the auditFirmName ������������� 
	 */
	public String getAuditFirmName() {
		return AuditFirmName;
	}

	/**  
	 * ���� auditFirmName  
	 * @param auditFirmName �������������  
	 */
	public void setAuditFirmName(String auditFirmName) {
		AuditFirmName = auditFirmName;
	}

	/**  
	 * ��ȡ auditorName
	 * @return the auditorName �����Ա���� 
	 */
	public String getAuditorName() {
		return AuditorName;
	}

	/**  
	 * ���� auditorName  
	 * @param auditorName �����Ա����  
	 */
	public void setAuditorName(String auditorName) {
		AuditorName = auditorName;
	}

	/**  
	 * ��ȡ auditTime
	 * @return the auditTime ���ʱ�� 
	 */
	public String getAuditTime() {
		return AuditTime;
	}

	/**  
	 * ���� auditTime  
	 * @param auditTime ���ʱ��  
	 */
	public void setAuditTime(String auditTime) {
		AuditTime = auditTime;
	}

	/**  
	 * ��ȡ cimoc
	 * @return the cimoc �ͻ�����ά���������� 
	 */
	public String getCimoc() {
		return Cimoc;
	}

	/**  
	 * ���� cimoc  
	 * @param cimoc �ͻ�����ά����������  
	 */
	public void setCimoc(String cimoc) {
		Cimoc = cimoc;
	}

	/**  
	 * ��ȡ rptDateCode
	 * @return the rptDateCode ����ʱ��˵������ 
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}

	/**  
	 * ���� rptDateCode  
	 * @param rptDateCode ����ʱ��˵������  
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}

	/**  
	 * ��ȡ revenueOfSales
	 * @return the revenueOfSales Ӫҵ���� 
	 */
	public String getRevenueOfSales() {
		return RevenueOfSales;
	}

	/**  
	 * ���� revenueOfSales  
	 * @param revenueOfSales Ӫҵ����  
	 */
	public void setRevenueOfSales(String revenueOfSales) {
		RevenueOfSales = revenueOfSales;
	}

	/**  
	 * ��ȡ costOfSales
	 * @return the costOfSales Ӫҵ�ɱ� 
	 */
	public String getCostOfSales() {
		return CostOfSales;
	}

	/**  
	 * ���� costOfSales  
	 * @param costOfSales Ӫҵ�ɱ�  
	 */
	public void setCostOfSales(String costOfSales) {
		CostOfSales = costOfSales;
	}

	/**  
	 * ��ȡ businessAndOtherTaxes
	 * @return the businessAndOtherTaxes Ӫҵ˰�𼰸��� 
	 */
	public String getBusinessAndOtherTaxes() {
		return BusinessAndOtherTaxes;
	}

	/**  
	 * ���� businessAndOtherTaxes  
	 * @param businessAndOtherTaxes Ӫҵ˰�𼰸���  
	 */
	public void setBusinessAndOtherTaxes(String businessAndOtherTaxes) {
		BusinessAndOtherTaxes = businessAndOtherTaxes;
	}

	/**  
	 * ��ȡ sellingExpenses
	 * @return the sellingExpenses ���۷��� 
	 */
	public String getSellingExpenses() {
		return SellingExpenses;
	}

	/**  
	 * ���� sellingExpenses  
	 * @param sellingExpenses ���۷���  
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
	 * ��ȡ financialExpense
	 * @return the financialExpense ������� 
	 */
	public String getFinancialExpense() {
		return FinancialExpense;
	}

	/**  
	 * ���� financialExpense  
	 * @param financialExpense �������  
	 */
	public void setFinancialExpense(String financialExpense) {
		FinancialExpense = financialExpense;
	}

	/**  
	 * ��ȡ impairmentLossOfAssets
	 * @return the impairmentLossOfAssets �ʲ���ֵ��ʧ 
	 */
	public String getImpairmentLossOfAssets() {
		return ImpairmentLossOfAssets;
	}

	/**  
	 * ���� impairmentLossOfAssets  
	 * @param impairmentLossOfAssets �ʲ���ֵ��ʧ  
	 */
	public void setImpairmentLossOfAssets(String impairmentLossOfAssets) {
		ImpairmentLossOfAssets = impairmentLossOfAssets;
	}

	/**  
	 * ��ȡ profitOrLossArisingFromChangesInFairValue
	 * @return the profitOrLossArisingFromChangesInFairValue ���ʼ�ֵ�䶯������ 
	 */
	public String getProfitOrLossArisingFromChangesInFairValue() {
		return ProfitOrLossArisingFromChangesInFairValue;
	}

	/**  
	 * ���� profitOrLossArisingFromChangesInFairValue  
	 * @param profitOrLossArisingFromChangesInFairValue ���ʼ�ֵ�䶯������  
	 */
	public void setProfitOrLossArisingFromChangesInFairValue(
			String profitOrLossArisingFromChangesInFairValue) {
		ProfitOrLossArisingFromChangesInFairValue = profitOrLossArisingFromChangesInFairValue;
	}

	/**  
	 * ��ȡ investmentIncome
	 * @return the investmentIncome Ͷ�ʾ����� 
	 */
	public String getInvestmentIncome() {
		return InvestmentIncome;
	}

	/**  
	 * ���� investmentIncome  
	 * @param investmentIncome Ͷ�ʾ�����  
	 */
	public void setInvestmentIncome(String investmentIncome) {
		InvestmentIncome = investmentIncome;
	}

	/**  
	 * ��ȡ investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise
	 * @return the investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise ����Ӫ��ҵ�ͺ�Ӫ��ҵ��Ͷ������ 
	 */
	public String getInvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise() {
		return InvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise;
	}

	/**  
	 * ���� investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise  
	 * @param investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise ����Ӫ��ҵ�ͺ�Ӫ��ҵ��Ͷ������  
	 */
	public void setInvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise(
			String investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise) {
		InvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise = investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise;
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
	 * ��ȡ nonCurrentAssets
	 * @return the nonCurrentAssets �������ʲ���ʧ�����У��������ʲ�������ʧ�� 
	 */
	public String getNonCurrentAssets() {
		return NonCurrentAssets;
	}

	/**  
	 * ���� nonCurrentAssets  
	 * @param nonCurrentAssets �������ʲ���ʧ�����У��������ʲ�������ʧ��  
	 */
	public void setNonCurrentAssets(String nonCurrentAssets) {
		NonCurrentAssets = nonCurrentAssets;
	}

	/**  
	 * ��ȡ profitBeforeTax
	 * @return the profitBeforeTax �����ܶ� 
	 */
	public String getProfitBeforeTax() {
		return ProfitBeforeTax;
	}

	/**  
	 * ���� profitBeforeTax  
	 * @param profitBeforeTax �����ܶ�  
	 */
	public void setProfitBeforeTax(String profitBeforeTax) {
		ProfitBeforeTax = profitBeforeTax;
	}

	/**  
	 * ��ȡ incomeTaxExpense
	 * @return the incomeTaxExpense ����˰���� 
	 */
	public String getIncomeTaxExpense() {
		return IncomeTaxExpense;
	}

	/**  
	 * ���� incomeTaxExpense  
	 * @param incomeTaxExpense ����˰����  
	 */
	public void setIncomeTaxExpense(String incomeTaxExpense) {
		IncomeTaxExpense = incomeTaxExpense;
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
	 * ��ȡ basicEarningsPerShare
	 * @return the basicEarningsPerShare ����ÿ������ 
	 */
	public String getBasicEarningsPerShare() {
		return BasicEarningsPerShare;
	}

	/**  
	 * ���� basicEarningsPerShare  
	 * @param basicEarningsPerShare ����ÿ������  
	 */
	public void setBasicEarningsPerShare(String basicEarningsPerShare) {
		BasicEarningsPerShare = basicEarningsPerShare;
	}

	/**  
	 * ��ȡ dilutedEarningsPerShare
	 * @return the dilutedEarningsPerShare ϡ��ÿ������ 
	 */
	public String getDilutedEarningsPerShare() {
		return DilutedEarningsPerShare;
	}

	/**  
	 * ���� dilutedEarningsPerShare  
	 * @param dilutedEarningsPerShare ϡ��ÿ������  
	 */
	public void setDilutedEarningsPerShare(String dilutedEarningsPerShare) {
		DilutedEarningsPerShare = dilutedEarningsPerShare;
	}
}
