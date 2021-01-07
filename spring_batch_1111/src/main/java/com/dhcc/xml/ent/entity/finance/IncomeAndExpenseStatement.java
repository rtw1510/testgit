package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: IncomeAndExpenseStatement<br/>
 * Description:��ҵ��λ����֧������Ϣ��¼ <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "IncomeAndExpenseStatementBsSgmt",
		"IncomeAndExpenseStatementSgmt" },namespace = "com.dhcc.xml.ent.entity.finance")
// ָ�����гɵ�xml�ڵ�˳��
public class IncomeAndExpenseStatement {

	/**
	 *������[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementBsSgmt IncomeAndExpenseStatementBsSgmt;
	/**
	 *��ҵ��λ����֧�����[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementSgmt IncomeAndExpenseStatementSgmt;

	public IncomeAndExpenseStatement() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * ��ȡ incomeAndExpenseStatementBsSgmt
	 * 
	 * @return the incomeAndExpenseStatementBsSgmt ������[1..1]
	 */
	public com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementBsSgmt getIncomeAndExpenseStatementBsSgmt() {
		return IncomeAndExpenseStatementBsSgmt;
	}

	/**
	 * ���� incomeAndExpenseStatementBsSgmt
	 * 
	 * @param incomeAndExpenseStatementBsSgmt
	 *            ������[1..1]
	 */
	public void setIncomeAndExpenseStatementBsSgmt(
			com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementBsSgmt incomeAndExpenseStatementBsSgmt) {
		IncomeAndExpenseStatementBsSgmt = incomeAndExpenseStatementBsSgmt;
	}

	/**
	 * ��ȡ incomeAndExpenseStatementSgmt
	 * 
	 * @return the incomeAndExpenseStatementSgmt ��ҵ��λ����֧�����[1..1]
	 */
	public com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementSgmt getIncomeAndExpenseStatementSgmt() {
		return IncomeAndExpenseStatementSgmt;
	}

	/**
	 * ���� incomeAndExpenseStatementSgmt
	 * 
	 * @param incomeAndExpenseStatementSgmt
	 *            ��ҵ��λ����֧�����[1..1]
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
