package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: IncomeStatementProfitAppropriation<br/>
 * Description:��ҵ��������������Ϣ��¼<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "IncomeStatementProfitAppropriationBsSgmt",
		"IncomeStatementProfitAppropriation2002Sgmt",
		"IncomeStatementProfitAppropriation2007Sgmt" },namespace = "com.dhcc.xml.ent.entity.finance")
public class IncomeStatementProfitAppropriation {
	/**
	 *������[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationBsSgmt IncomeStatementProfitAppropriationBsSgmt;
	/**
	 *2002���������������[0..1]
	 */
	private com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation2002Sgmt IncomeStatementProfitAppropriation2002Sgmt;
	/**
	 *2007���������������[0..1]
	 */
	private com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation2007Sgmt IncomeStatementProfitAppropriation2007Sgmt;

	public IncomeStatementProfitAppropriation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**  
	 * ��ȡ incomeStatementProfitAppropriationBsSgmt
	 * @return the incomeStatementProfitAppropriationBsSgmt ������[1..1] 
	 */
	public com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationBsSgmt getIncomeStatementProfitAppropriationBsSgmt() {
		return IncomeStatementProfitAppropriationBsSgmt;
	}

	/**  
	 * ���� incomeStatementProfitAppropriationBsSgmt  
	 * @param incomeStatementProfitAppropriationBsSgmt ������[1..1]  
	 */
	public void setIncomeStatementProfitAppropriationBsSgmt(
			com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationBsSgmt incomeStatementProfitAppropriationBsSgmt) {
		IncomeStatementProfitAppropriationBsSgmt = incomeStatementProfitAppropriationBsSgmt;
	}

	/**  
	 * ��ȡ incomeStatementProfitAppropriation2002Sgmt
	 * @return the incomeStatementProfitAppropriation2002Sgmt 2002���������������[0..1] 
	 */
	public com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation2002Sgmt getIncomeStatementProfitAppropriation2002Sgmt() {
		return IncomeStatementProfitAppropriation2002Sgmt;
	}

	/**  
	 * ���� incomeStatementProfitAppropriation2002Sgmt  
	 * @param incomeStatementProfitAppropriation2002Sgmt 2002���������������[0..1]  
	 */
	public void setIncomeStatementProfitAppropriation2002Sgmt(
			com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation2002Sgmt incomeStatementProfitAppropriation2002Sgmt) {
		IncomeStatementProfitAppropriation2002Sgmt = incomeStatementProfitAppropriation2002Sgmt;
	}

	/**  
	 * ��ȡ incomeStatementProfitAppropriation2007Sgmt
	 * @return the incomeStatementProfitAppropriation2007Sgmt 2007���������������[0..1] 
	 */
	public com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation2007Sgmt getIncomeStatementProfitAppropriation2007Sgmt() {
		return IncomeStatementProfitAppropriation2007Sgmt;
	}

	/**  
	 * ���� incomeStatementProfitAppropriation2007Sgmt  
	 * @param incomeStatementProfitAppropriation2007Sgmt 2007���������������[0..1]  
	 */
	public void setIncomeStatementProfitAppropriation2007Sgmt(
			com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation2007Sgmt incomeStatementProfitAppropriation2007Sgmt) {
		IncomeStatementProfitAppropriation2007Sgmt = incomeStatementProfitAppropriation2007Sgmt;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IncomeStatementProfitAppropriation [IncomeStatementProfitAppropriation2002Sgmt="
				+ IncomeStatementProfitAppropriation2002Sgmt
				+ ", IncomeStatementProfitAppropriation2007Sgmt="
				+ IncomeStatementProfitAppropriation2007Sgmt
				+ ", IncomeStatementProfitAppropriationBsSgmt="
				+ IncomeStatementProfitAppropriationBsSgmt + "]";
	}
}
