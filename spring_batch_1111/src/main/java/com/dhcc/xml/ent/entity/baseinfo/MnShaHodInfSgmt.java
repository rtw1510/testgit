package com.dhcc.xml.ent.entity.baseinfo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MnShaHodInfSgmt<br/>
 * Description:注册资本及主要出资人段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月25日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "RegCapCurrency", "RegCap", "MnSharHodNm", "SharHodInf",
		"MnShaHodInfoUpDate" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class MnShaHodInfSgmt {
	/**
	 *注册资本币种[1..1]
	 */
	private String RegCapCurrency;
	/**
	 *注册资本[1..1]
	 */
	private String RegCap;
	/**
	 *主要出资人个数[1..1]
	 */
	private String MnSharHodNm;
	/**
	 *->出资人信息[0..99]
	 */
	private List<SharHodInf> SharHodInf;
	/**
	 *信息更新日期[1..1]
	 */
	private String MnShaHodInfoUpDate;

	public MnShaHodInfSgmt() {
		super();
	}

	/**
	 * 获取 regCapCurrency
	 * 
	 * @return the regCapCurrency 注册资本币种[1..1]
	 */
	public String getRegCapCurrency() {
		return RegCapCurrency;
	}

	/**
	 * 设置 regCapCurrency
	 * 
	 * @param regCapCurrency
	 *            注册资本币种[1..1]
	 */
	public void setRegCapCurrency(String regCapCurrency) {
		RegCapCurrency = regCapCurrency;
	}

	/**
	 * 获取 regCap
	 * 
	 * @return the regCap 注册资本[1..1]
	 */
	public String getRegCap() {
		return RegCap;
	}

	/**
	 * 设置 regCap
	 * 
	 * @param regCap
	 *            注册资本[1..1]
	 */
	public void setRegCap(String regCap) {
		RegCap = regCap;
	}

	/**
	 * 获取 mnSharHodNm
	 * 
	 * @return the mnSharHodNm 主要出资人个数[1..1]
	 */
	public String getMnSharHodNm() {
		return MnSharHodNm;
	}

	/**
	 * 设置 mnSharHodNm
	 * 
	 * @param mnSharHodNm
	 *            主要出资人个数[1..1]
	 */
	public void setMnSharHodNm(String mnSharHodNm) {
		MnSharHodNm = mnSharHodNm;
	}

	/**
	 * 获取 sharHodInf
	 * 
	 * @return the sharHodInf ->出资人信息[0..99]
	 */
	public List<SharHodInf> getSharHodInf() {
		return SharHodInf;
	}

	/**
	 * 设置 sharHodInf
	 * 
	 * @param sharHodInf
	 *            ->出资人信息[0..99]
	 */
	public void setSharHodInf(List<SharHodInf> sharHodInf) {
		SharHodInf = sharHodInf;
	}

	/**
	 * 获取 mnShaHodInfoUpDate
	 * 
	 * @return the mnShaHodInfoUpDate 信息更新日期[1..1]
	 */
	public String getMnShaHodInfoUpDate() {
		return MnShaHodInfoUpDate;
	}

	/**
	 * 设置 mnShaHodInfoUpDate
	 * 
	 * @param mnShaHodInfoUpDate
	 *            信息更新日期[1..1]
	 */
	public void setMnShaHodInfoUpDate(String mnShaHodInfoUpDate) {
		MnShaHodInfoUpDate = mnShaHodInfoUpDate;
	}

	@Override
	public String toString() {
		return "MnShaHodInfSgmt [RegCapCurrency=" + RegCapCurrency
				+ ", RegCap=" + RegCap + ", MnSharHodNm=" + MnSharHodNm
				+ ", SharHodInf=" + SharHodInf + ", MnShaHodInfoUpDate="
				+ MnShaHodInfoUpDate + "]";
	}

}
