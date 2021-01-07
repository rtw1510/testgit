package com.dhcc.xml.per.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MdfcSgmt<br/>
 * Description: <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月28日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "GuarAcctBsSgmt", "GuarAcctBsInfSgmt",
		"GuarRltRepymtInfSgmt", "RltRepymtInfSgmt",
		"GuarMotgaCltalCtrctInfSgmt" },namespace = "com.dhcc.xml.per.entity.guarantee")
// 指定序列成的xml节点顺序
public class MdfcSgmt {
	/** 基础段 [1..1] */
	private GuarAcctBsSgmt GuarAcctBsSgmt;
	/** 基本信息段 [0..1] */
	private GuarAcctBsInfSgmt GuarAcctBsInfSgmt;
	/** 在保责任信息段 [0..1] */
	private GuarRltRepymtInfSgmt GuarRltRepymtInfSgmt;
	/** 相关还款责任人段[0..1] */
	private RltRepymtInfSgmt RltRepymtInfSgmt;
	/** 抵质押物信息段 [0..1] */
	private GuarMotgaCltalCtrctInfSgmt GuarMotgaCltalCtrctInfSgmt;

	public MdfcSgmt() {
		super();
	}

	/**
	 * 获取 guarAcctBsSgmt
	 * 
	 * @return the guarAcctBsSgmt 基础段 [1..1]
	 */
	public GuarAcctBsSgmt getGuarAcctBsSgmt() {
		return GuarAcctBsSgmt;
	}

	/**
	 * 设置 guarAcctBsSgmt
	 * 
	 * @param guarAcctBsSgmt
	 *            基础段 [1..1]
	 */
	public void setGuarAcctBsSgmt(GuarAcctBsSgmt guarAcctBsSgmt) {
		GuarAcctBsSgmt = guarAcctBsSgmt;
	}

	/**
	 * 获取 guarAcctBsInfSgmt
	 * 
	 * @return the guarAcctBsInfSgmt 基本信息段 [0..1]
	 */
	public GuarAcctBsInfSgmt getGuarAcctBsInfSgmt() {
		return GuarAcctBsInfSgmt;
	}

	/**
	 * 设置 guarAcctBsInfSgmt
	 * 
	 * @param guarAcctBsInfSgmt
	 *            基本信息段 [0..1]
	 */
	public void setGuarAcctBsInfSgmt(GuarAcctBsInfSgmt guarAcctBsInfSgmt) {
		GuarAcctBsInfSgmt = guarAcctBsInfSgmt;
	}

	/**
	 * 获取 guarRltRepymtInfSgmt
	 * 
	 * @return the guarRltRepymtInfSgmt 在保责任信息段 [0..1]
	 */
	public GuarRltRepymtInfSgmt getGuarRltRepymtInfSgmt() {
		return GuarRltRepymtInfSgmt;
	}

	/**
	 * 设置 guarRltRepymtInfSgmt
	 * 
	 * @param guarRltRepymtInfSgmt
	 *            在保责任信息段 [0..1]
	 */
	public void setGuarRltRepymtInfSgmt(
			GuarRltRepymtInfSgmt guarRltRepymtInfSgmt) {
		GuarRltRepymtInfSgmt = guarRltRepymtInfSgmt;
	}

	/**
	 * 获取 rltRepymtInfSgmt
	 * 
	 * @return the rltRepymtInfSgmt 相关还款责任人段[0..1]
	 */
	public RltRepymtInfSgmt getRltRepymtInfSgmt() {
		return RltRepymtInfSgmt;
	}

	/**
	 * 设置 rltRepymtInfSgmt
	 * 
	 * @param rltRepymtInfSgmt
	 *            相关还款责任人段[0..1]
	 */
	public void setRltRepymtInfSgmt(RltRepymtInfSgmt rltRepymtInfSgmt) {
		RltRepymtInfSgmt = rltRepymtInfSgmt;
	}

	/**
	 * 获取 guarMotgaCltalCtrctInfSgmt
	 * 
	 * @return the guarMotgaCltalCtrctInfSgmt 抵质押物信息段 [0..1]
	 */
	public GuarMotgaCltalCtrctInfSgmt getGuarMotgaCltalCtrctInfSgmt() {
		return GuarMotgaCltalCtrctInfSgmt;
	}

	/**
	 * 设置 guarMotgaCltalCtrctInfSgmt
	 * 
	 * @param guarMotgaCltalCtrctInfSgmt
	 *            抵质押物信息段 [0..1]
	 */
	public void setGuarMotgaCltalCtrctInfSgmt(
			GuarMotgaCltalCtrctInfSgmt guarMotgaCltalCtrctInfSgmt) {
		GuarMotgaCltalCtrctInfSgmt = guarMotgaCltalCtrctInfSgmt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MdfcSgmt [GuarAcctBsSgmt=" + GuarAcctBsSgmt
				+ ", GuarAcctBsInfSgmt=" + GuarAcctBsInfSgmt
				+ ", GuarRltRepymtInfSgmt=" + GuarRltRepymtInfSgmt
				+ ", RltRepymtInfSgmt=" + RltRepymtInfSgmt
				+ ", GuarMotgaCltalCtrctInfSgmt=" + GuarMotgaCltalCtrctInfSgmt
				+ "]";
	}

}
