package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: BalanceSheet<br/>
 * Description:企业资产负债表信息记录<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "BalanceSheetBsSgmt", "BalanceSheet2002Sgmt",
		"BalanceSheet2007Sgmt" },namespace = "com.dhcc.xml.ent.entity.finance")
public class BalanceSheet {
	/**
	 *基础段[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.BalanceSheetBsSgmt BalanceSheetBsSgmt;
	/**
	 *2002版资产负债表段[0..1]
	 */
	private com.dhcc.xml.ent.entity.finance.BalanceSheet2002Sgmt BalanceSheet2002Sgmt;
	/**
	 *2007版资产负债表段[0..1]
	 */
	private com.dhcc.xml.ent.entity.finance.BalanceSheet2007Sgmt BalanceSheet2007Sgmt;

	public BalanceSheet() {
		super();
	}

	/**
	 * 获取 balanceSheetBsSgmt
	 * 
	 * @return the balanceSheetBsSgmt 基础段[1..1]
	 */
	public com.dhcc.xml.ent.entity.finance.BalanceSheetBsSgmt getBalanceSheetBsSgmt() {
		return BalanceSheetBsSgmt;
	}

	/**
	 * 设置 balanceSheetBsSgmt
	 * 
	 * @param balanceSheetBsSgmt
	 *            基础段[1..1]
	 */
	public void setBalanceSheetBsSgmt(com.dhcc.xml.ent.entity.finance.BalanceSheetBsSgmt balanceSheetBsSgmt) {
		BalanceSheetBsSgmt = balanceSheetBsSgmt;
	}

	/**
	 * 获取 balanceSheet2002Sgmt
	 * 
	 * @return the balanceSheet2002Sgmt 2002版资产负债表段[0..1]
	 */
	public com.dhcc.xml.ent.entity.finance.BalanceSheet2002Sgmt getBalanceSheet2002Sgmt() {
		return BalanceSheet2002Sgmt;
	}

	/**
	 * 设置 balanceSheet2002Sgmt
	 * 
	 * @param balanceSheet2002Sgmt
	 *            2002版资产负债表段[0..1]
	 */
	public void setBalanceSheet2002Sgmt(
			com.dhcc.xml.ent.entity.finance.BalanceSheet2002Sgmt balanceSheet2002Sgmt) {
		BalanceSheet2002Sgmt = balanceSheet2002Sgmt;
	}

	/**
	 * 获取 balanceSheet2007Sgmt
	 * 
	 * @return the balanceSheet2007Sgmt 2007版资产负债表段[0..1]
	 */
	public com.dhcc.xml.ent.entity.finance.BalanceSheet2007Sgmt getBalanceSheet2007Sgmt() {
		return BalanceSheet2007Sgmt;
	}

	/**
	 * 设置 balanceSheet2007Sgmt
	 * 
	 * @param balanceSheet2007Sgmt
	 *            2007版资产负债表段[0..1]
	 */
	public void setBalanceSheet2007Sgmt(
			com.dhcc.xml.ent.entity.finance.BalanceSheet2007Sgmt balanceSheet2007Sgmt) {
		BalanceSheet2007Sgmt = balanceSheet2007Sgmt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BalanceSheet [BalanceSheet2002Sgmt=" + BalanceSheet2002Sgmt
				+ ", BalanceSheet2007Sgmt=" + BalanceSheet2007Sgmt
				+ ", BalanceSheetBsSgmt=" + BalanceSheetBsSgmt + "]";
	}

}
