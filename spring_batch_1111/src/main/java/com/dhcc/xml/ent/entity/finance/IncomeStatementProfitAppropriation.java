package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: IncomeStatementProfitAppropriation<br/>
 * Description:企业利润及利润分配表信息记录<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "IncomeStatementProfitAppropriationBsSgmt",
		"IncomeStatementProfitAppropriation2002Sgmt",
		"IncomeStatementProfitAppropriation2007Sgmt" },namespace = "com.dhcc.xml.ent.entity.finance")
public class IncomeStatementProfitAppropriation {
	/**
	 *基础段[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationBsSgmt IncomeStatementProfitAppropriationBsSgmt;
	/**
	 *2002版利润及利润分配表段[0..1]
	 */
	private com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation2002Sgmt IncomeStatementProfitAppropriation2002Sgmt;
	/**
	 *2007版利润及利润分配表段[0..1]
	 */
	private com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation2007Sgmt IncomeStatementProfitAppropriation2007Sgmt;

	public IncomeStatementProfitAppropriation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**  
	 * 获取 incomeStatementProfitAppropriationBsSgmt
	 * @return the incomeStatementProfitAppropriationBsSgmt 基础段[1..1] 
	 */
	public com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationBsSgmt getIncomeStatementProfitAppropriationBsSgmt() {
		return IncomeStatementProfitAppropriationBsSgmt;
	}

	/**  
	 * 设置 incomeStatementProfitAppropriationBsSgmt  
	 * @param incomeStatementProfitAppropriationBsSgmt 基础段[1..1]  
	 */
	public void setIncomeStatementProfitAppropriationBsSgmt(
			com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationBsSgmt incomeStatementProfitAppropriationBsSgmt) {
		IncomeStatementProfitAppropriationBsSgmt = incomeStatementProfitAppropriationBsSgmt;
	}

	/**  
	 * 获取 incomeStatementProfitAppropriation2002Sgmt
	 * @return the incomeStatementProfitAppropriation2002Sgmt 2002版利润及利润分配表段[0..1] 
	 */
	public com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation2002Sgmt getIncomeStatementProfitAppropriation2002Sgmt() {
		return IncomeStatementProfitAppropriation2002Sgmt;
	}

	/**  
	 * 设置 incomeStatementProfitAppropriation2002Sgmt  
	 * @param incomeStatementProfitAppropriation2002Sgmt 2002版利润及利润分配表段[0..1]  
	 */
	public void setIncomeStatementProfitAppropriation2002Sgmt(
			com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation2002Sgmt incomeStatementProfitAppropriation2002Sgmt) {
		IncomeStatementProfitAppropriation2002Sgmt = incomeStatementProfitAppropriation2002Sgmt;
	}

	/**  
	 * 获取 incomeStatementProfitAppropriation2007Sgmt
	 * @return the incomeStatementProfitAppropriation2007Sgmt 2007版利润及利润分配表段[0..1] 
	 */
	public com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation2007Sgmt getIncomeStatementProfitAppropriation2007Sgmt() {
		return IncomeStatementProfitAppropriation2007Sgmt;
	}

	/**  
	 * 设置 incomeStatementProfitAppropriation2007Sgmt  
	 * @param incomeStatementProfitAppropriation2007Sgmt 2007版利润及利润分配表段[0..1]  
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
