package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnAcctInf<br/>
 * Description:企业借贷账户信息记录信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "AcctBsSgmt", "AcctBsInfSgmt", "RltRepymtInfSgmt",
		"MotgaCltalCtrctInfSgmt", "AcctCredSgmt", "OrigCreditorInfSgmt",
		"ActLbltyInfSgmt", "AcctSpecTrstDspnSgmt" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// 指定序列成的xml节点顺序
public class EnAcctInf {
	/**
	 *基础段[1..1]
	 */
	private AcctBsSgmt AcctBsSgmt;
	/**
	 *基本信息段[0..1]
	 */
	private AcctBsInfSgmt AcctBsInfSgmt;
	/**
	 *相关还款责任人段[0..1]		EB_CORPACCRLT_INFO
	 */
	private RltRepymtInfSgmt RltRepymtInfSgmt;
	/**
	 *抵质押物信息段[0..1]		没有
	 */
	private MotgaCltalCtrctInfSgmt MotgaCltalCtrctInfSgmt;
	/**
	 *授信额度信息段[0..1]
	 */
	private AcctCredSgmt AcctCredSgmt;
	/**
	 *初始债权说明段[0..1]
	 */
	private com.dhcc.xml.ent.entity.loaninfo.OrigCreditorInfSgmt OrigCreditorInfSgmt;
	/**
	 *还款表现信息段[1..1]       EB_CORPACCRETU_INFO
	 */
	private ActLbltyInfSgmt ActLbltyInfSgmt;
	/**
	 *特定交易说明段[0..1]		EB_CORPACCSPEC_INFO
	 */
	private AcctSpecTrstDspnSgmt AcctSpecTrstDspnSgmt;

	public EnAcctInf() {
		super();
	}

	/**
	 * 获取 acctBsSgmt
	 * 
	 * @return the acctBsSgmt 基础段[1..1]
	 */
	public AcctBsSgmt getAcctBsSgmt() {
		return AcctBsSgmt;
	}

	/**
	 * 设置 acctBsSgmt
	 * 
	 * @param acctBsSgmt
	 *            基础段[1..1]
	 */
	public void setAcctBsSgmt(AcctBsSgmt acctBsSgmt) {
		AcctBsSgmt = acctBsSgmt;
	}

	/**
	 * 获取 acctBsInfSgmt
	 * 
	 * @return the acctBsInfSgmt 基本信息段[0..1]
	 */
	public AcctBsInfSgmt getAcctBsInfSgmt() {
		return AcctBsInfSgmt;
	}

	/**
	 * 设置 acctBsInfSgmt
	 * 
	 * @param acctBsInfSgmt
	 *            基本信息段[0..1]
	 */
	public void setAcctBsInfSgmt(AcctBsInfSgmt acctBsInfSgmt) {
		AcctBsInfSgmt = acctBsInfSgmt;
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
	 * 获取 motgaCltalCtrctInfSgmt
	 * 
	 * @return the motgaCltalCtrctInfSgmt 抵质押物信息段[0..1]
	 */
	public MotgaCltalCtrctInfSgmt getMotgaCltalCtrctInfSgmt() {
		return MotgaCltalCtrctInfSgmt;
	}

	/**
	 * 设置 motgaCltalCtrctInfSgmt
	 * 
	 * @param motgaCltalCtrctInfSgmt
	 *            抵质押物信息段[0..1]
	 */
	public void setMotgaCltalCtrctInfSgmt(
			MotgaCltalCtrctInfSgmt motgaCltalCtrctInfSgmt) {
		MotgaCltalCtrctInfSgmt = motgaCltalCtrctInfSgmt;
	}

	/**
	 * 获取 acctCredSgmt
	 * 
	 * @return the acctCredSgmt 授信额度信息段[0..1]
	 */
	public AcctCredSgmt getAcctCredSgmt() {
		return AcctCredSgmt;
	}

	/**
	 * 设置 acctCredSgmt
	 * 
	 * @param acctCredSgmt
	 *            授信额度信息段[0..1]
	 */
	public void setAcctCredSgmt(AcctCredSgmt acctCredSgmt) {
		AcctCredSgmt = acctCredSgmt;
	}

	/**
	 * 获取 origCreditorInfSgmt
	 * 
	 * @return the origCreditorInfSgmt 初始债权说明段[0..1]
	 */
	public com.dhcc.xml.ent.entity.loaninfo.OrigCreditorInfSgmt getOrigCreditorInfSgmt() {
		return OrigCreditorInfSgmt;
	}

	/**
	 * 设置 origCreditorInfSgmt
	 * 
	 * @param origCreditorInfSgmt
	 *            初始债权说明段[0..1]
	 */
	public void setOrigCreditorInfSgmt(com.dhcc.xml.ent.entity.loaninfo.OrigCreditorInfSgmt origCreditorInfSgmt) {
		OrigCreditorInfSgmt = origCreditorInfSgmt;
	}

	/**
	 * 获取 actLbltyInfSgmt
	 * 
	 * @return the actLbltyInfSgmt 还款表现信息段[1..1]
	 */
	public ActLbltyInfSgmt getActLbltyInfSgmt() {
		return ActLbltyInfSgmt;
	}

	/**
	 * 设置 actLbltyInfSgmt
	 * 
	 * @param actLbltyInfSgmt
	 *            还款表现信息段[1..1]
	 */
	public void setActLbltyInfSgmt(ActLbltyInfSgmt actLbltyInfSgmt) {
		ActLbltyInfSgmt = actLbltyInfSgmt;
	}

	/**
	 * 获取 acctSpecTrstDspnSgmt
	 * 
	 * @return the acctSpecTrstDspnSgmt 特定交易说明段[0..1]
	 */
	public AcctSpecTrstDspnSgmt getAcctSpecTrstDspnSgmt() {
		return AcctSpecTrstDspnSgmt;
	}

	/**
	 * 设置 acctSpecTrstDspnSgmt
	 * 
	 * @param acctSpecTrstDspnSgmt
	 *            特定交易说明段[0..1]
	 */
	public void setAcctSpecTrstDspnSgmt(
			AcctSpecTrstDspnSgmt acctSpecTrstDspnSgmt) {
		AcctSpecTrstDspnSgmt = acctSpecTrstDspnSgmt;
	}

	@Override
	public String toString() {
		return "EnAcctInf [AcctBsSgmt=" + AcctBsSgmt + ", AcctBsInfSgmt="
				+ AcctBsInfSgmt + ", RltRepymtInfSgmt=" + RltRepymtInfSgmt
				+ ", MotgaCltalCtrctInfSgmt=" + MotgaCltalCtrctInfSgmt
				+ ", AcctCredSgmt=" + AcctCredSgmt + ", OrigCreditorInfSgmt="
				+ OrigCreditorInfSgmt + ", ActLbltyInfSgmt=" + ActLbltyInfSgmt
				+ ", AcctSpecTrstDspnSgmt=" + AcctSpecTrstDspnSgmt + "]";
	}

}
