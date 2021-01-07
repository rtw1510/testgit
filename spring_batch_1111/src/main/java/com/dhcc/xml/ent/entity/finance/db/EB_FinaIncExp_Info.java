package com.dhcc.xml.ent.entity.finance.db;

/**
 * Title: IncomeAndExpenseStatementSgmt<br/>
 * Description:数据库映射：基础段+事业单位收入支出表段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
public class EB_FinaIncExp_Info {
	/**
	 *上报状态
	 */
	private String Rpt_Type;
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
	 *本期财政补助结转结余
	 */
	private String CurrentFinancialSubsidyCarriedOverBalance;
	/**
	 *财政补助收入
	 */
	private String FinancialSubsidyRevenue;
	/**
	 *事业支出（财政补助支出）
	 */
	private String UndertakingsExpenditureFinancialSubsidyExpenditure;
	/**
	 *本期事业结转结余
	 */
	private String CurrentUndertakingsCarriedOverBalance;
	/**
	 *事业类收入
	 */
	private String UndertakingsClassRevenue;
	/**
	 *事业收入
	 */
	private String UndertakingsRevenue;
	/**
	 *上级补助收入
	 */
	private String SuperiorSubsidyRevenue;
	/**
	 *附属单位上缴收入
	 */
	private String RevenueTurnedOverBySubsidiaryUnit;
	/**
	 *其他收入
	 */
	private String OtherRevenue;
	/**
	 *（其他收入科目下）捐赠收入
	 */
	private String DonationIncome;
	/**
	 *事业类支出
	 */
	private String UndertakingsClassExpenditure;
	/**
	 *事业支出（非财政补助支出）
	 */
	private String UndertakingsExpenditureNonFinancialSubsidyExpenditure;
	/**
	 *上缴上级支出
	 */
	private String PaymentToTheHigherAuthority;
	/**
	 *对附属单位补助支出
	 */
	private String GrantToTheAuxiliaryOrganization;
	/**
	 *其他支出
	 */
	private String OtherExpenditure;
	/**
	 *本期经营结余
	 */
	private String CurrentOperatingBalance;
	/**
	 *经营收入
	 */
	private String OperatingRevenue;
	/**
	 *经营支出
	 */
	private String OperatingExpenditure;
	/**
	 *弥补以前年度亏损后的经营结余
	 */
	private String OperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss;
	/**
	 *本年非财政补助结转结余
	 */
	private String NonFinancialSubsidyCarriedOverBalanceThisYear;
	/**
	 *非财政补助结转
	 */
	private String NonFinancialAidCarriedOver;
	/**
	 *本年非财政补助结余
	 */
	private String NonFinancialAidBalanceThisYear;
	/**
	 *应缴企业所得税
	 */
	private String EnterpriseIncomeTaxPayable;
	/**
	 *提取专用基金
	 */
	private String SpecialFundsToExtract;
	/**
	 *转入事业基金
	 */
	private String PublicFundTurnedInto;

	public EB_FinaIncExp_Info() {
		super();
	}

	/**
	 * 获取 rpt_Type
	 * 
	 * @return the rpt_Type 上报状态
	 */
	public String getRpt_Type() {
		return Rpt_Type;
	}

	/**
	 * 设置 rpt_Type
	 * 
	 * @param rpt_Type
	 *            上报状态
	 */
	public void setRpt_Type(String rptType) {
		Rpt_Type = rptType;
	}

	/**
	 * 获取 infRecType
	 * 
	 * @return the infRecType 信息记录类型
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * 设置 infRecType
	 * 
	 * @param infRecType
	 *            信息记录类型
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * 获取 entName
	 * 
	 * @return the entName 企业名称
	 */
	public String getEntName() {
		return EntName;
	}

	/**
	 * 设置 entName
	 * 
	 * @param entName
	 *            企业名称
	 */
	public void setEntName(String entName) {
		EntName = entName;
	}

	/**
	 * 获取 entCertType
	 * 
	 * @return the entCertType 企业身份标识类型
	 */
	public String getEntCertType() {
		return EntCertType;
	}

	/**
	 * 设置 entCertType
	 * 
	 * @param entCertType
	 *            企业身份标识类型
	 */
	public void setEntCertType(String entCertType) {
		EntCertType = entCertType;
	}

	/**
	 * 获取 entCertNum
	 * 
	 * @return the entCertNum 企业身份标识号码
	 */
	public String getEntCertNum() {
		return EntCertNum;
	}

	/**
	 * 设置 entCertNum
	 * 
	 * @param entCertNum
	 *            企业身份标识号码
	 */
	public void setEntCertNum(String entCertNum) {
		EntCertNum = entCertNum;
	}

	/**
	 * 获取 rptDate
	 * 
	 * @return the rptDate 信息报告日期
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * 设置 rptDate
	 * 
	 * @param rptDate
	 *            信息报告日期
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	/**
	 * 获取 sheetYear
	 * 
	 * @return the sheetYear 报表年份
	 */
	public String getSheetYear() {
		return SheetYear;
	}

	/**
	 * 设置 sheetYear
	 * 
	 * @param sheetYear
	 *            报表年份
	 */
	public void setSheetYear(String sheetYear) {
		SheetYear = sheetYear;
	}

	/**
	 * 获取 sheetType
	 * 
	 * @return the sheetType 报表类型
	 */
	public String getSheetType() {
		return SheetType;
	}

	/**
	 * 设置 sheetType
	 * 
	 * @param sheetType
	 *            报表类型
	 */
	public void setSheetType(String sheetType) {
		SheetType = sheetType;
	}

	/**
	 * 获取 sheetTypeDivide
	 * 
	 * @return the sheetTypeDivide 报表类型细分
	 */
	public String getSheetTypeDivide() {
		return SheetTypeDivide;
	}

	/**
	 * 设置 sheetTypeDivide
	 * 
	 * @param sheetTypeDivide
	 *            报表类型细分
	 */
	public void setSheetTypeDivide(String sheetTypeDivide) {
		SheetTypeDivide = sheetTypeDivide;
	}

	/**
	 * 获取 auditFirmName
	 * 
	 * @return the auditFirmName 审计事务所名称
	 */
	public String getAuditFirmName() {
		return AuditFirmName;
	}

	/**
	 * 设置 auditFirmName
	 * 
	 * @param auditFirmName
	 *            审计事务所名称
	 */
	public void setAuditFirmName(String auditFirmName) {
		AuditFirmName = auditFirmName;
	}

	/**
	 * 获取 auditorName
	 * 
	 * @return the auditorName 审计人员名称
	 */
	public String getAuditorName() {
		return AuditorName;
	}

	/**
	 * 设置 auditorName
	 * 
	 * @param auditorName
	 *            审计人员名称
	 */
	public void setAuditorName(String auditorName) {
		AuditorName = auditorName;
	}

	/**
	 * 获取 auditTime
	 * 
	 * @return the auditTime 审计时间
	 */
	public String getAuditTime() {
		return AuditTime;
	}

	/**
	 * 设置 auditTime
	 * 
	 * @param auditTime
	 *            审计时间
	 */
	public void setAuditTime(String auditTime) {
		AuditTime = auditTime;
	}

	/**
	 * 获取 cimoc
	 * 
	 * @return the cimoc 客户资料维护机构代码
	 */
	public String getCimoc() {
		return Cimoc;
	}

	/**
	 * 设置 cimoc
	 * 
	 * @param cimoc
	 *            客户资料维护机构代码
	 */
	public void setCimoc(String cimoc) {
		Cimoc = cimoc;
	}

	/**
	 * 获取 rptDateCode
	 * 
	 * @return the rptDateCode 报告时点说明代码
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}

	/**
	 * 设置 rptDateCode
	 * 
	 * @param rptDateCode
	 *            报告时点说明代码
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IncomeAndExpenseStatementSgmt [AuditFirmName=" + AuditFirmName
				+ ", AuditTime=" + AuditTime + ", AuditorName=" + AuditorName
				+ ", Cimoc=" + Cimoc
				+ ", CurrentFinancialSubsidyCarriedOverBalance="
				+ CurrentFinancialSubsidyCarriedOverBalance
				+ ", CurrentOperatingBalance=" + CurrentOperatingBalance
				+ ", CurrentUndertakingsCarriedOverBalance="
				+ CurrentUndertakingsCarriedOverBalance + ", DonationIncome="
				+ DonationIncome + ", EntCertNum=" + EntCertNum
				+ ", EntCertType=" + EntCertType + ", EntName=" + EntName
				+ ", EnterpriseIncomeTaxPayable=" + EnterpriseIncomeTaxPayable
				+ ", FinancialSubsidyRevenue=" + FinancialSubsidyRevenue
				+ ", GrantToTheAuxiliaryOrganization="
				+ GrantToTheAuxiliaryOrganization + ", InfRecType="
				+ InfRecType + ", NonFinancialAidBalanceThisYear="
				+ NonFinancialAidBalanceThisYear
				+ ", NonFinancialAidCarriedOver=" + NonFinancialAidCarriedOver
				+ ", NonFinancialSubsidyCarriedOverBalanceThisYear="
				+ NonFinancialSubsidyCarriedOverBalanceThisYear
				+ ", OperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss="
				+ OperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss
				+ ", OperatingExpenditure=" + OperatingExpenditure
				+ ", OperatingRevenue=" + OperatingRevenue
				+ ", OtherExpenditure=" + OtherExpenditure + ", OtherRevenue="
				+ OtherRevenue + ", PaymentToTheHigherAuthority="
				+ PaymentToTheHigherAuthority + ", PublicFundTurnedInto="
				+ PublicFundTurnedInto + ", RevenueTurnedOverBySubsidiaryUnit="
				+ RevenueTurnedOverBySubsidiaryUnit + ", RptDate=" + RptDate
				+ ", RptDateCode=" + RptDateCode + ", Rpt_Type=" + Rpt_Type
				+ ", SheetType=" + SheetType + ", SheetTypeDivide="
				+ SheetTypeDivide + ", SheetYear=" + SheetYear
				+ ", SpecialFundsToExtract=" + SpecialFundsToExtract
				+ ", SuperiorSubsidyRevenue=" + SuperiorSubsidyRevenue
				+ ", UndertakingsClassExpenditure="
				+ UndertakingsClassExpenditure + ", UndertakingsClassRevenue="
				+ UndertakingsClassRevenue
				+ ", UndertakingsExpenditureFinancialSubsidyExpenditure="
				+ UndertakingsExpenditureFinancialSubsidyExpenditure
				+ ", UndertakingsExpenditureNonFinancialSubsidyExpenditure="
				+ UndertakingsExpenditureNonFinancialSubsidyExpenditure
				+ ", UndertakingsRevenue=" + UndertakingsRevenue + "]";
	}

}
