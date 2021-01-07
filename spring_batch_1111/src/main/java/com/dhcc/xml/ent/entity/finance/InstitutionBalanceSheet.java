package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InstitutionBalanceSheet<br/>
 * Description:事业单位资产负债表信息记录<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "InstitutionBalanceSheetBsSgmt",
		"InstitutionBalanceSheetSgmt" },namespace = "com.dhcc.xml.ent.entity.finance")
// 指定序列成的xml节点顺序
public class InstitutionBalanceSheet {
	/**
	 *基础段[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetBsSgmt InstitutionBalanceSheetBsSgmt;
	/**
	 *事业单位资产负债表段[1..1]
	 */
	private com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetSgmt InstitutionBalanceSheetSgmt;

	public InstitutionBalanceSheet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取 institutionBalanceSheetBsSgmt
	 * 
	 * @return the institutionBalanceSheetBsSgmt 基础段[1..1]
	 */
	public com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetBsSgmt getInstitutionBalanceSheetBsSgmt() {
		return InstitutionBalanceSheetBsSgmt;
	}

	/**
	 * 设置 institutionBalanceSheetBsSgmt
	 * 
	 * @param institutionBalanceSheetBsSgmt
	 *            基础段[1..1]
	 */
	public void setInstitutionBalanceSheetBsSgmt(
			com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetBsSgmt institutionBalanceSheetBsSgmt) {
		InstitutionBalanceSheetBsSgmt = institutionBalanceSheetBsSgmt;
	}

	/**
	 * 获取 institutionBalanceSheetSgmt
	 * 
	 * @return the institutionBalanceSheetSgmt 事业单位资产负债表段[1..1]
	 */
	public com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetSgmt getInstitutionBalanceSheetSgmt() {
		return InstitutionBalanceSheetSgmt;
	}

	/**
	 * 设置 institutionBalanceSheetSgmt
	 * 
	 * @param institutionBalanceSheetSgmt
	 *            事业单位资产负债表段[1..1]
	 */
	public void setInstitutionBalanceSheetSgmt(
			com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetSgmt institutionBalanceSheetSgmt) {
		InstitutionBalanceSheetSgmt = institutionBalanceSheetSgmt;
	}

	@Override
	public String toString() {
		return "InstitutionBalanceSheet [InstitutionBalanceSheetBsSgmt="
				+ InstitutionBalanceSheetBsSgmt
				+ ", InstitutionBalanceSheetSgmt="
				+ InstitutionBalanceSheetSgmt + "]";
	}

}
