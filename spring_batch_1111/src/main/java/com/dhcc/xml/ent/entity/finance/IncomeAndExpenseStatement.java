package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: IncomeAndExpenseStatement<br/>
 * Description:事业单位收入支出表信息记录 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "IncomeAndExpenseStatementBsSgmt",
		"IncomeAndExpenseStatementSgmt" },namespace = "com.dhcc.xml.ent.entity.finance")
// 指定序列成的xml节点顺序
public class IncomeAndExpenseStatement {

	/**
	 *基础段[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementBsSgmt IncomeAndExpenseStatementBsSgmt;
	/**
	 *事业单位收入支出表段[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementSgmt IncomeAndExpenseStatementSgmt;

	public IncomeAndExpenseStatement() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取 incomeAndExpenseStatementBsSgmt
	 * 
	 * @return the incomeAndExpenseStatementBsSgmt 基础段[1..1]
	 */
	public com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementBsSgmt getIncomeAndExpenseStatementBsSgmt() {
		return IncomeAndExpenseStatementBsSgmt;
	}

	/**
	 * 设置 incomeAndExpenseStatementBsSgmt
	 * 
	 * @param incomeAndExpenseStatementBsSgmt
	 *            基础段[1..1]
	 */
	public void setIncomeAndExpenseStatementBsSgmt(
			com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementBsSgmt incomeAndExpenseStatementBsSgmt) {
		IncomeAndExpenseStatementBsSgmt = incomeAndExpenseStatementBsSgmt;
	}

	/**
	 * 获取 incomeAndExpenseStatementSgmt
	 * 
	 * @return the incomeAndExpenseStatementSgmt 事业单位收入支出表段[1..1]
	 */
	public com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementSgmt getIncomeAndExpenseStatementSgmt() {
		return IncomeAndExpenseStatementSgmt;
	}

	/**
	 * 设置 incomeAndExpenseStatementSgmt
	 * 
	 * @param incomeAndExpenseStatementSgmt
	 *            事业单位收入支出表段[1..1]
	 */
	public void setIncomeAndExpenseStatementSgmt(
			com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementSgmt incomeAndExpenseStatementSgmt) {
		IncomeAndExpenseStatementSgmt = incomeAndExpenseStatementSgmt;
	}

	@Override
	public String toString() {
		return "InstitutionBalanceSheet [IncomeAndExpenseStatementBsSgmt="
				+ IncomeAndExpenseStatementBsSgmt
				+ ", IncomeAndExpenseStatementSgmt="
				+ IncomeAndExpenseStatementSgmt + "]";
	}

}
