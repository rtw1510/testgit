package com.dhcc.xml.ent.entity.finance.db;


/**
 * Title: IncomeStatementProfitAppropriation2007Sgmt<br/>
 * Description:数据库映射：基础段+2007版利润及利润分配表段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
public class EB_FinaPro07_Info {
	/**
	 *信息记录类型
	 */
	private String InfRecType;
	/**
	 *企业名称
	 */
	private String EntName;
	/**
	 *企业身份标识类型
	 */
	private String EntCertType;
	/**
	 *企业身份标识号码
	 */
	private String EntCertNum;
	/**
	 *信息报告日期
	 */
	private String RptDate;
	/**
	 *报表年份
	 */
	private String SheetYear;
	/**
	 *报表类型
	 */
	private String SheetType;
	/**
	 *报表类型细分
	 */
	private String SheetTypeDivide;
	/**
	 *审计事务所名称
	 */
	private String AuditFirmName;
	/**
	 *审计人员名称
	 */
	private String AuditorName;
	/**
	 *审计时间
	 */
	private String AuditTime;
	/**
	 *客户资料维护机构代码
	 */
	private String Cimoc;
	/**
	 *报告时点说明代码
	 */
	private String RptDateCode;
	/**
	 *营业收入
	 */
	private String RevenueOfSales; 
	/**
	 *营业成本
	 */
	private String CostOfSales; 
	/**
	 *营业税金及附加
	 */
	private String BusinessAndOtherTaxes; 
	/**
	 *销售费用
	 */
	private String SellingExpenses; 
	/**
	 *管理费用
	 */
	private String GeneralAndAdministrativeExpenses; 
	/**
	 *财务费用
	 */
	private String FinancialExpense; 
	/**
	 *资产减值损失
	 */
	private String ImpairmentLossOfAssets; 
	/**
	 *公允价值变动净收益
	 */
	private String ProfitOrLossArisingFromChangesInFairValue; 
	/**
	 *投资净收益
	 */
	private String InvestmentIncome; 
	/**
	 *对联营企业和合营企业的投资收益
	 */
	private String InvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise; 
	/**
	 *营业利润
	 */
	private String OperatingProfits; 
	/**
	 *营业外收入
	 */
	private String NonOperatingIncome; 
	/**
	 *营业外支出
	 */
	private String NonOperatingExpenses; 
	/**
	 *非流动资产损失（其中：非流动资产处置损失）
	 */
	private String NonCurrentAssets; 
	/**
	 *利润总额
	 */
	private String ProfitBeforeTax; 
	/**
	 *所得税费用
	 */
	private String IncomeTaxExpense; 
	/**
	 *净利润
	 */
	private String NetProfit; 
	/**
	 *基本每股收益
	 */
	private String BasicEarningsPerShare; 
	/**
	 *稀释每股收益
	 */
	private String DilutedEarningsPerShare; 

	public EB_FinaPro07_Info() {
		super();
	}

	/**  
	 * 获取 infRecType
	 * @return the infRecType 信息记录类型 
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**  
	 * 设置 infRecType  
	 * @param infRecType 信息记录类型  
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**  
	 * 获取 entName
	 * @return the entName 企业名称 
	 */
	public String getEntName() {
		return EntName;
	}

	/**  
	 * 设置 entName  
	 * @param entName 企业名称  
	 */
	public void setEntName(String entName) {
		EntName = entName;
	}

	/**  
	 * 获取 entCertType
	 * @return the entCertType 企业身份标识类型 
	 */
	public String getEntCertType() {
		return EntCertType;
	}

	/**  
	 * 设置 entCertType  
	 * @param entCertType 企业身份标识类型  
	 */
	public void setEntCertType(String entCertType) {
		EntCertType = entCertType;
	}

	/**  
	 * 获取 entCertNum
	 * @return the entCertNum 企业身份标识号码 
	 */
	public String getEntCertNum() {
		return EntCertNum;
	}

	/**  
	 * 设置 entCertNum  
	 * @param entCertNum 企业身份标识号码  
	 */
	public void setEntCertNum(String entCertNum) {
		EntCertNum = entCertNum;
	}

	/**  
	 * 获取 rptDate
	 * @return the rptDate 信息报告日期 
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**  
	 * 设置 rptDate  
	 * @param rptDate 信息报告日期  
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	/**  
	 * 获取 sheetYear
	 * @return the sheetYear 报表年份 
	 */
	public String getSheetYear() {
		return SheetYear;
	}

	/**  
	 * 设置 sheetYear  
	 * @param sheetYear 报表年份  
	 */
	public void setSheetYear(String sheetYear) {
		SheetYear = sheetYear;
	}

	/**  
	 * 获取 sheetType
	 * @return the sheetType 报表类型 
	 */
	public String getSheetType() {
		return SheetType;
	}

	/**  
	 * 设置 sheetType  
	 * @param sheetType 报表类型  
	 */
	public void setSheetType(String sheetType) {
		SheetType = sheetType;
	}

	/**  
	 * 获取 sheetTypeDivide
	 * @return the sheetTypeDivide 报表类型细分 
	 */
	public String getSheetTypeDivide() {
		return SheetTypeDivide;
	}

	/**  
	 * 设置 sheetTypeDivide  
	 * @param sheetTypeDivide 报表类型细分  
	 */
	public void setSheetTypeDivide(String sheetTypeDivide) {
		SheetTypeDivide = sheetTypeDivide;
	}

	/**  
	 * 获取 auditFirmName
	 * @return the auditFirmName 审计事务所名称 
	 */
	public String getAuditFirmName() {
		return AuditFirmName;
	}

	/**  
	 * 设置 auditFirmName  
	 * @param auditFirmName 审计事务所名称  
	 */
	public void setAuditFirmName(String auditFirmName) {
		AuditFirmName = auditFirmName;
	}

	/**  
	 * 获取 auditorName
	 * @return the auditorName 审计人员名称 
	 */
	public String getAuditorName() {
		return AuditorName;
	}

	/**  
	 * 设置 auditorName  
	 * @param auditorName 审计人员名称  
	 */
	public void setAuditorName(String auditorName) {
		AuditorName = auditorName;
	}

	/**  
	 * 获取 auditTime
	 * @return the auditTime 审计时间 
	 */
	public String getAuditTime() {
		return AuditTime;
	}

	/**  
	 * 设置 auditTime  
	 * @param auditTime 审计时间  
	 */
	public void setAuditTime(String auditTime) {
		AuditTime = auditTime;
	}

	/**  
	 * 获取 cimoc
	 * @return the cimoc 客户资料维护机构代码 
	 */
	public String getCimoc() {
		return Cimoc;
	}

	/**  
	 * 设置 cimoc  
	 * @param cimoc 客户资料维护机构代码  
	 */
	public void setCimoc(String cimoc) {
		Cimoc = cimoc;
	}

	/**  
	 * 获取 rptDateCode
	 * @return the rptDateCode 报告时点说明代码 
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}

	/**  
	 * 设置 rptDateCode  
	 * @param rptDateCode 报告时点说明代码  
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}

	/**  
	 * 获取 revenueOfSales
	 * @return the revenueOfSales 营业收入 
	 */
	public String getRevenueOfSales() {
		return RevenueOfSales;
	}

	/**  
	 * 设置 revenueOfSales  
	 * @param revenueOfSales 营业收入  
	 */
	public void setRevenueOfSales(String revenueOfSales) {
		RevenueOfSales = revenueOfSales;
	}

	/**  
	 * 获取 costOfSales
	 * @return the costOfSales 营业成本 
	 */
	public String getCostOfSales() {
		return CostOfSales;
	}

	/**  
	 * 设置 costOfSales  
	 * @param costOfSales 营业成本  
	 */
	public void setCostOfSales(String costOfSales) {
		CostOfSales = costOfSales;
	}

	/**  
	 * 获取 businessAndOtherTaxes
	 * @return the businessAndOtherTaxes 营业税金及附加 
	 */
	public String getBusinessAndOtherTaxes() {
		return BusinessAndOtherTaxes;
	}

	/**  
	 * 设置 businessAndOtherTaxes  
	 * @param businessAndOtherTaxes 营业税金及附加  
	 */
	public void setBusinessAndOtherTaxes(String businessAndOtherTaxes) {
		BusinessAndOtherTaxes = businessAndOtherTaxes;
	}

	/**  
	 * 获取 sellingExpenses
	 * @return the sellingExpenses 销售费用 
	 */
	public String getSellingExpenses() {
		return SellingExpenses;
	}

	/**  
	 * 设置 sellingExpenses  
	 * @param sellingExpenses 销售费用  
	 */
	public void setSellingExpenses(String sellingExpenses) {
		SellingExpenses = sellingExpenses;
	}

	/**  
	 * 获取 generalAndAdministrativeExpenses
	 * @return the generalAndAdministrativeExpenses 管理费用 
	 */
	public String getGeneralAndAdministrativeExpenses() {
		return GeneralAndAdministrativeExpenses;
	}

	/**  
	 * 设置 generalAndAdministrativeExpenses  
	 * @param generalAndAdministrativeExpenses 管理费用  
	 */
	public void setGeneralAndAdministrativeExpenses(
			String generalAndAdministrativeExpenses) {
		GeneralAndAdministrativeExpenses = generalAndAdministrativeExpenses;
	}

	/**  
	 * 获取 financialExpense
	 * @return the financialExpense 财务费用 
	 */
	public String getFinancialExpense() {
		return FinancialExpense;
	}

	/**  
	 * 设置 financialExpense  
	 * @param financialExpense 财务费用  
	 */
	public void setFinancialExpense(String financialExpense) {
		FinancialExpense = financialExpense;
	}

	/**  
	 * 获取 impairmentLossOfAssets
	 * @return the impairmentLossOfAssets 资产减值损失 
	 */
	public String getImpairmentLossOfAssets() {
		return ImpairmentLossOfAssets;
	}

	/**  
	 * 设置 impairmentLossOfAssets  
	 * @param impairmentLossOfAssets 资产减值损失  
	 */
	public void setImpairmentLossOfAssets(String impairmentLossOfAssets) {
		ImpairmentLossOfAssets = impairmentLossOfAssets;
	}

	/**  
	 * 获取 profitOrLossArisingFromChangesInFairValue
	 * @return the profitOrLossArisingFromChangesInFairValue 公允价值变动净收益 
	 */
	public String getProfitOrLossArisingFromChangesInFairValue() {
		return ProfitOrLossArisingFromChangesInFairValue;
	}

	/**  
	 * 设置 profitOrLossArisingFromChangesInFairValue  
	 * @param profitOrLossArisingFromChangesInFairValue 公允价值变动净收益  
	 */
	public void setProfitOrLossArisingFromChangesInFairValue(
			String profitOrLossArisingFromChangesInFairValue) {
		ProfitOrLossArisingFromChangesInFairValue = profitOrLossArisingFromChangesInFairValue;
	}

	/**  
	 * 获取 investmentIncome
	 * @return the investmentIncome 投资净收益 
	 */
	public String getInvestmentIncome() {
		return InvestmentIncome;
	}

	/**  
	 * 设置 investmentIncome  
	 * @param investmentIncome 投资净收益  
	 */
	public void setInvestmentIncome(String investmentIncome) {
		InvestmentIncome = investmentIncome;
	}

	/**  
	 * 获取 investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise
	 * @return the investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise 对联营企业和合营企业的投资收益 
	 */
	public String getInvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise() {
		return InvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise;
	}

	/**  
	 * 设置 investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise  
	 * @param investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise 对联营企业和合营企业的投资收益  
	 */
	public void setInvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise(
			String investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise) {
		InvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise = investmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise;
	}

	/**  
	 * 获取 operatingProfits
	 * @return the operatingProfits 营业利润 
	 */
	public String getOperatingProfits() {
		return OperatingProfits;
	}

	/**  
	 * 设置 operatingProfits  
	 * @param operatingProfits 营业利润  
	 */
	public void setOperatingProfits(String operatingProfits) {
		OperatingProfits = operatingProfits;
	}

	/**  
	 * 获取 nonOperatingIncome
	 * @return the nonOperatingIncome 营业外收入 
	 */
	public String getNonOperatingIncome() {
		return NonOperatingIncome;
	}

	/**  
	 * 设置 nonOperatingIncome  
	 * @param nonOperatingIncome 营业外收入  
	 */
	public void setNonOperatingIncome(String nonOperatingIncome) {
		NonOperatingIncome = nonOperatingIncome;
	}

	/**  
	 * 获取 nonOperatingExpenses
	 * @return the nonOperatingExpenses 营业外支出 
	 */
	public String getNonOperatingExpenses() {
		return NonOperatingExpenses;
	}

	/**  
	 * 设置 nonOperatingExpenses  
	 * @param nonOperatingExpenses 营业外支出  
	 */
	public void setNonOperatingExpenses(String nonOperatingExpenses) {
		NonOperatingExpenses = nonOperatingExpenses;
	}

	/**  
	 * 获取 nonCurrentAssets
	 * @return the nonCurrentAssets 非流动资产损失（其中：非流动资产处置损失） 
	 */
	public String getNonCurrentAssets() {
		return NonCurrentAssets;
	}

	/**  
	 * 设置 nonCurrentAssets  
	 * @param nonCurrentAssets 非流动资产损失（其中：非流动资产处置损失）  
	 */
	public void setNonCurrentAssets(String nonCurrentAssets) {
		NonCurrentAssets = nonCurrentAssets;
	}

	/**  
	 * 获取 profitBeforeTax
	 * @return the profitBeforeTax 利润总额 
	 */
	public String getProfitBeforeTax() {
		return ProfitBeforeTax;
	}

	/**  
	 * 设置 profitBeforeTax  
	 * @param profitBeforeTax 利润总额  
	 */
	public void setProfitBeforeTax(String profitBeforeTax) {
		ProfitBeforeTax = profitBeforeTax;
	}

	/**  
	 * 获取 incomeTaxExpense
	 * @return the incomeTaxExpense 所得税费用 
	 */
	public String getIncomeTaxExpense() {
		return IncomeTaxExpense;
	}

	/**  
	 * 设置 incomeTaxExpense  
	 * @param incomeTaxExpense 所得税费用  
	 */
	public void setIncomeTaxExpense(String incomeTaxExpense) {
		IncomeTaxExpense = incomeTaxExpense;
	}

	/**  
	 * 获取 netProfit
	 * @return the netProfit 净利润 
	 */
	public String getNetProfit() {
		return NetProfit;
	}

	/**  
	 * 设置 netProfit  
	 * @param netProfit 净利润  
	 */
	public void setNetProfit(String netProfit) {
		NetProfit = netProfit;
	}

	/**  
	 * 获取 basicEarningsPerShare
	 * @return the basicEarningsPerShare 基本每股收益 
	 */
	public String getBasicEarningsPerShare() {
		return BasicEarningsPerShare;
	}

	/**  
	 * 设置 basicEarningsPerShare  
	 * @param basicEarningsPerShare 基本每股收益  
	 */
	public void setBasicEarningsPerShare(String basicEarningsPerShare) {
		BasicEarningsPerShare = basicEarningsPerShare;
	}

	/**  
	 * 获取 dilutedEarningsPerShare
	 * @return the dilutedEarningsPerShare 稀释每股收益 
	 */
	public String getDilutedEarningsPerShare() {
		return DilutedEarningsPerShare;
	}

	/**  
	 * 设置 dilutedEarningsPerShare  
	 * @param dilutedEarningsPerShare 稀释每股收益  
	 */
	public void setDilutedEarningsPerShare(String dilutedEarningsPerShare) {
		DilutedEarningsPerShare = dilutedEarningsPerShare;
	}
}
