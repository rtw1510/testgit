package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: IncInfSgmt<br/>
 * Description: 个人基本信息记录-收入信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "AnnlInc", "TaxIncome", "IncInfoUpDate" },namespace = "com.dhcc.xml.per.entity.baseinfo")
public class IncInfSgmt {
	/** 自报年收入[1..1] */
	private String AnnlInc;
	/** 纳税年收入[1..1] */
	private String TaxIncome;
	/** 信息更新日期[1..1] */
	private String IncInfoUpDate;

	public IncInfSgmt() {
		super();
	}

	/**
	 * 获取 annlInc
	 * 
	 * @return the annlInc 自报年收入[1..1]
	 */
	public String getAnnlInc() {
		return AnnlInc;
	}

	/**
	 * 设置 annlInc
	 * 
	 * @param annlInc
	 *            自报年收入[1..1]
	 */
	public void setAnnlInc(String annlInc) {
		AnnlInc = annlInc;
	}

	/**
	 * 获取 taxIncome
	 * 
	 * @return the taxIncome 纳税年收入[1..1]
	 */
	public String getTaxIncome() {
		return TaxIncome;
	}

	/**
	 * 设置 taxIncome
	 * 
	 * @param taxIncome
	 *            纳税年收入[1..1]
	 */
	public void setTaxIncome(String taxIncome) {
		TaxIncome = taxIncome;
	}

	/**
	 * 获取 incInfoUpDate
	 * 
	 * @return the incInfoUpDate 信息更新日期[1..1]
	 */
	public String getIncInfoUpDate() {
		return IncInfoUpDate;
	}

	/**
	 * 设置 incInfoUpDate
	 * 
	 * @param incInfoUpDate
	 *            信息更新日期[1..1]
	 */
	public void setIncInfoUpDate(String incInfoUpDate) {
		IncInfoUpDate = incInfoUpDate;
	}

	@Override
	public String toString() {
		return "IncInfSgmt [AnnlInc=" + AnnlInc + ", TaxIncome=" + TaxIncome
				+ ", IncInfoUpDate=" + IncInfoUpDate + "]";
	}
}
