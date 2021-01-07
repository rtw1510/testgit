package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnFinance<br/>
 * Description:企业财务报表信息<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlRootElement(name = "Document")
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "BalanceSheet", "IncomeStatementProfitAppropriation",
		"CashFlows", "InstitutionBalanceSheet", "IncomeAndExpenseStatement",
		"BalanceSheetDlt", "IncomeStatementProfitAppropriationDlt",
		"CashFlowsDlt", "InstitutionBalanceSheetDlt",
		"IncomeAndExpenseStatementDlt" },namespace = "com.dhcc.xml.ent.entity.finance")
// 指定序列成的xml节点顺序
public class EnFinance {

	/**
	 *企业资产负债表信息记录[1..1]
	 */
	private BalanceSheet BalanceSheet;
	/**
	 *企业利润及利润分配表信息记录[1..1]
	 */
	private IncomeStatementProfitAppropriation IncomeStatementProfitAppropriation;
	/**
	 *企业现金流量表信息记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.CashFlows CashFlows;
	/**
	 *事业单位资产负债表信息记录[1..1]
	 */
	private InstitutionBalanceSheet InstitutionBalanceSheet;
	/**
	 *事业单位收入支出表信息记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatement IncomeAndExpenseStatement;
	/**
	 *企业资产负债表整笔删除请求记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.BalanceSheetDlt BalanceSheetDlt;
	/**
	 *企业利润及利润分配表整笔删除请求记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationDlt IncomeStatementProfitAppropriationDlt;
	/**
	 *企业现金流量表整笔删除请求记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.CashFlowsDlt CashFlowsDlt;
	/**
	 *事业单位资产负债表整笔删除请求记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetDlt InstitutionBalanceSheetDlt;
	/**
	 *事业单位收入支出表整笔删除请求记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementDlt IncomeAndExpenseStatementDlt;

	public EnFinance() {
		super();
	}

	/**
	 * 获取 balanceSheet
	 * 
	 * @return the balanceSheet 企业资产负债表信息记录[1..1]
	 */
	public BalanceSheet getBalanceSheet() {
		return BalanceSheet;
	}

	/**
	 * 设置 balanceSheet
	 * 
	 * @param balanceSheet
	 *            企业资产负债表信息记录[1..1]
	 */
	public void setBalanceSheet(BalanceSheet balanceSheet) {
		BalanceSheet = balanceSheet;
	}

	/**
	 * 获取 incomeStatementProfitAppropriation
	 * 
	 * @return the incomeStatementProfitAppropriation 企业利润及利润分配表信息记录[1..1]
	 */
	public IncomeStatementProfitAppropriation getIncomeStatementProfitAppropriation() {
		return IncomeStatementProfitAppropriation;
	}

	/**
	 * 设置 incomeStatementProfitAppropriation
	 * 
	 * @param incomeStatementProfitAppropriation
	 *            企业利润及利润分配表信息记录[1..1]
	 */
	public void setIncomeStatementProfitAppropriation(
			IncomeStatementProfitAppropriation incomeStatementProfitAppropriation) {
		IncomeStatementProfitAppropriation = incomeStatementProfitAppropriation;
	}

	/**
	 * 获取 cashFlows
	 * 
	 * @return the cashFlows 企业现金流量表信息记录[1..1]
	 */
	public com.dhcc.xml.ent.entity.finance.CashFlows getCashFlows() {
		return CashFlows;
	}

	/**
	 * 设置 cashFlows
	 * 
	 * @param cashFlows
	 *            企业现金流量表信息记录[1..1]
	 */
	public void setCashFlows(com.dhcc.xml.ent.entity.finance.CashFlows cashFlows) {
		CashFlows = cashFlows;
	}

	/**
	 * 获取 institutionBalanceSheet
	 * 
	 * @return the institutionBalanceSheet 事业单位资产负债表信息记录[1..1]
	 */
	public InstitutionBalanceSheet getInstitutionBalanceSheet() {
		return InstitutionBalanceSheet;
	}

	/**
	 * 设置 institutionBalanceSheet
	 * 
	 * @param institutionBalanceSheet
	 *            事业单位资产负债表信息记录[1..1]
	 */
	public void setInstitutionBalanceSheet(
			InstitutionBalanceSheet institutionBalanceSheet) {
		InstitutionBalanceSheet = institutionBalanceSheet;
	}

	/**
	 * 获取 incomeAndExpenseStatement
	 * 
	 * @return the incomeAndExpenseStatement 事业单位收入支出表信息记录[1..1]
	 */
	public com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatement getIncomeAndExpenseStatement() {
		return IncomeAndExpenseStatement;
	}

	/**
	 * 设置 incomeAndExpenseStatement
	 * 
	 * @param incomeAndExpenseStatement
	 *            事业单位收入支出表信息记录[1..1]
	 */
	public void setIncomeAndExpenseStatement(
			com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatement incomeAndExpenseStatement) {
		IncomeAndExpenseStatement = incomeAndExpenseStatement;
	}

	/**
	 * 获取 balanceSheetDlt
	 * 
	 * @return the balanceSheetDlt 企业资产负债表整笔删除请求记录[1..1]
	 */
	public com.dhcc.xml.ent.entity.finance.BalanceSheetDlt getBalanceSheetDlt() {
		return BalanceSheetDlt;
	}

	/**
	 * 设置 balanceSheetDlt
	 * 
	 * @param balanceSheetDlt
	 *            企业资产负债表整笔删除请求记录[1..1]
	 */
	public void setBalanceSheetDlt(com.dhcc.xml.ent.entity.finance.BalanceSheetDlt balanceSheetDlt) {
		BalanceSheetDlt = balanceSheetDlt;
	}

	/**
	 * 获取 incomeStatementProfitAppropriationDlt
	 * 
	 * @return the incomeStatementProfitAppropriationDlt
	 *         企业利润及利润分配表整笔删除请求记录[1..1]
	 */
	public com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationDlt getIncomeStatementProfitAppropriationDlt() {
		return IncomeStatementProfitAppropriationDlt;
	}

	/**
	 * 设置 incomeStatementProfitAppropriationDlt
	 * 
	 * @param incomeStatementProfitAppropriationDlt
	 *            企业利润及利润分配表整笔删除请求记录[1..1]
	 */
	public void setIncomeStatementProfitAppropriationDlt(
			com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationDlt incomeStatementProfitAppropriationDlt) {
		IncomeStatementProfitAppropriationDlt = incomeStatementProfitAppropriationDlt;
	}

	/**
	 * 获取 cashFlowsDlt
	 * 
	 * @return the cashFlowsDlt 企业现金流量表整笔删除请求记录[1..1]
	 */
	public com.dhcc.xml.ent.entity.finance.CashFlowsDlt getCashFlowsDlt() {
		return CashFlowsDlt;
	}

	/**
	 * 设置 cashFlowsDlt
	 * 
	 * @param cashFlowsDlt
	 *            企业现金流量表整笔删除请求记录[1..1]
	 */
	public void setCashFlowsDlt(com.dhcc.xml.ent.entity.finance.CashFlowsDlt cashFlowsDlt) {
		CashFlowsDlt = cashFlowsDlt;
	}

	/**
	 * 获取 institutionBalanceSheetDlt
	 * 
	 * @return the institutionBalanceSheetDlt 事业单位资产负债表整笔删除请求记录[1..1]
	 */
	public com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetDlt getInstitutionBalanceSheetDlt() {
		return InstitutionBalanceSheetDlt;
	}

	/**
	 * 设置 institutionBalanceSheetDlt
	 * 
	 * @param institutionBalanceSheetDlt
	 *            事业单位资产负债表整笔删除请求记录[1..1]
	 */
	public void setInstitutionBalanceSheetDlt(
			com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetDlt institutionBalanceSheetDlt) {
		InstitutionBalanceSheetDlt = institutionBalanceSheetDlt;
	}

	/**
	 * 获取 incomeAndExpenseStatementDlt
	 * 
	 * @return the incomeAndExpenseStatementDlt 事业单位收入支出表整笔删除请求记录[1..1]
	 */
	public com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementDlt getIncomeAndExpenseStatementDlt() {
		return IncomeAndExpenseStatementDlt;
	}

	/**
	 * 设置 incomeAndExpenseStatementDlt
	 * 
	 * @param incomeAndExpenseStatementDlt
	 *            事业单位收入支出表整笔删除请求记录[1..1]
	 */
	public void setIncomeAndExpenseStatementDlt(
			com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementDlt incomeAndExpenseStatementDlt) {
		IncomeAndExpenseStatementDlt = incomeAndExpenseStatementDlt;
	}

	@Override
	public String toString() {
		return "EnFinance [BalanceSheet=" + BalanceSheet
				+ ", IncomeStatementProfitAppropriation="
				+ IncomeStatementProfitAppropriation + ", CashFlows="
				+ CashFlows + ", InstitutionBalanceSheet="
				+ InstitutionBalanceSheet + ", IncomeAndExpenseStatement="
				+ IncomeAndExpenseStatement + ", BalanceSheetDlt="
				+ BalanceSheetDlt + ", IncomeStatementProfitAppropriationDlt="
				+ IncomeStatementProfitAppropriationDlt + ", CashFlowsDlt="
				+ CashFlowsDlt + ", InstitutionBalanceSheetDlt="
				+ InstitutionBalanceSheetDlt
				+ ", IncomeAndExpenseStatementDlt="
				+ IncomeAndExpenseStatementDlt + "]";
	}

}
