package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: CashFlows<br/>
 * Description:企业现金流量表信息记录<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "CashFlowsBsSgmt", "CashFlows2002Sgmt",
		"CashFlows2007Sgmt" },namespace = "com.dhcc.xml.ent.entity.finance")
// 指定序列成的xml节点顺序
public class CashFlows {

	/**
	 *基础段[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.CashFlowsBsSgmt CashFlowsBsSgmt;
	/**
	 *2002版现金流量表段[0..1]
	 */
	private CashFlows2002Sgmt CashFlows2002Sgmt;
	/**
	 *2007版现金流量表段[0..1]
	 */
	private CashFlows2007Sgmt CashFlows2007Sgmt;

	public CashFlows() {
		super();
	}

	/**
	 * 获取 cashFlowsBsSgmt
	 * 
	 * @return the cashFlowsBsSgmt 基础段[1..1]
	 */
	public com.dhcc.xml.ent.entity.finance.CashFlowsBsSgmt getCashFlowsBsSgmt() {
		return CashFlowsBsSgmt;
	}

	/**
	 * 设置 cashFlowsBsSgmt
	 * 
	 * @param cashFlowsBsSgmt
	 *            基础段[1..1]
	 */
	public void setCashFlowsBsSgmt(com.dhcc.xml.ent.entity.finance.CashFlowsBsSgmt cashFlowsBsSgmt) {
		CashFlowsBsSgmt = cashFlowsBsSgmt;
	}

	/**
	 * 获取 cashFlows2002Sgmt
	 * 
	 * @return the cashFlows2002Sgmt 2002版现金流量表段[0..1]
	 */
	public CashFlows2002Sgmt getCashFlows2002Sgmt() {
		return CashFlows2002Sgmt;
	}

	/**
	 * 设置 cashFlows2002Sgmt
	 * 
	 * @param cashFlows2002Sgmt
	 *            2002版现金流量表段[0..1]
	 */
	public void setCashFlows2002Sgmt(CashFlows2002Sgmt cashFlows2002Sgmt) {
		CashFlows2002Sgmt = cashFlows2002Sgmt;
	}

	/**
	 * 获取 cashFlows2007Sgmt
	 * 
	 * @return the cashFlows2007Sgmt 2007版现金流量表段[0..1]
	 */
	public CashFlows2007Sgmt getCashFlows2007Sgmt() {
		return CashFlows2007Sgmt;
	}

	/**
	 * 设置 cashFlows2007Sgmt
	 * 
	 * @param cashFlows2007Sgmt
	 *            2007版现金流量表段[0..1]
	 */
	public void setCashFlows2007Sgmt(CashFlows2007Sgmt cashFlows2007Sgmt) {
		CashFlows2007Sgmt = cashFlows2007Sgmt;
	}

	@Override
	public String toString() {
		return "CashFlows [CashFlowsBsSgmt=" + CashFlowsBsSgmt
				+ ", CashFlows2002Sgmt=" + CashFlows2002Sgmt
				+ ", CashFlows2007Sgmt=" + CashFlows2007Sgmt + "]";
	}

}
