package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MdfcSgmt<br/>
 * Description: (1)企业借贷账户待更正段
 * ,任选基础段、基本信息段、相关还款责任人段、抵质押品信息段、授信额度信息段、初始债权说明段、还款表现信息段、约定还款信息段、特定交易说明段，
 * 其中一段内容填入即可。 (2)企业授信协议待更正段,任选基础段、共同受信人信息段、额度信息段其中一段内容填入即可。
 * (3)企业最高额保证合同待更正段,任选基础段、联保人信息段、保证额度信息段其中一段内容填入即可。<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD) // 访问类型改为字段
@XmlType(propOrder = { "AcctBsSgmt", "AcctBsInfSgmt", "RltRepymtInfSgmt", "MotgaCltalCtrctInfSgmt", "AcctCredSgmt",
		"OrigCreditorInfSgmt", "ActLbltyInfSgmt", "AcctSpecTrstDspnSgmt" },namespace = "com.dhcc.xml.ent.entity.loaninfo")// 指定序列成的xml节点顺序
public class MdfcSgmt {
	/* 第一类：企业借贷账户信息记录信息段 */
	/**
	 *基础段[1..1]
	 */  
	private com.dhcc.xml.ent.entity.loaninfo.AcctBsSgmt AcctBsSgmt;
	/**
	 *基本信息段[0..1]
	 */  
	private AcctBsInfSgmt AcctBsInfSgmt; 
	/**
	 *相关还款责任人段[0..1]
	 */  
	private RltRepymtInfSgmt RltRepymtInfSgmt; 
	/**
	 *抵质押物信息段[0..1]
	 */  
	private com.dhcc.xml.ent.entity.loaninfo.MotgaCltalCtrctInfSgmt MotgaCltalCtrctInfSgmt;
	/**
	 *授信额度信息段[0..1]
	 */  
	private com.dhcc.xml.ent.entity.loaninfo.AcctCredSgmt AcctCredSgmt;
	/**
	 *初始债权说明段[0..1]
	 */  
	private com.dhcc.xml.ent.entity.loaninfo.OrigCreditorInfSgmt OrigCreditorInfSgmt;
	/**
	 *还款表现信息段[1..1]
	 */  
	private ActLbltyInfSgmt ActLbltyInfSgmt; 
	/**
	 *特定交易说明段[0..1]
	 */  
	private AcctSpecTrstDspnSgmt AcctSpecTrstDspnSgmt; 

	public MdfcSgmt() {
		super();
	}

	public com.dhcc.xml.ent.entity.loaninfo.AcctBsSgmt getAcctBsSgmt() {
		return AcctBsSgmt;
	}

	public void setAcctBsSgmt(com.dhcc.xml.ent.entity.loaninfo.AcctBsSgmt acctBsSgmt) {
		AcctBsSgmt = acctBsSgmt;
	}

	public AcctBsInfSgmt getAcctBsInfSgmt() {
		return AcctBsInfSgmt;
	}

	public void setAcctBsInfSgmt(AcctBsInfSgmt acctBsInfSgmt) {
		AcctBsInfSgmt = acctBsInfSgmt;
	}

	public RltRepymtInfSgmt getRltRepymtInfSgmt() {
		return RltRepymtInfSgmt;
	}

	public void setRltRepymtInfSgmt(RltRepymtInfSgmt rltRepymtInfSgmt) {
		RltRepymtInfSgmt = rltRepymtInfSgmt;
	}

	public com.dhcc.xml.ent.entity.loaninfo.MotgaCltalCtrctInfSgmt getMotgaCltalCtrctInfSgmt() {
		return MotgaCltalCtrctInfSgmt;
	}

	public void setMotgaCltalCtrctInfSgmt(com.dhcc.xml.ent.entity.loaninfo.MotgaCltalCtrctInfSgmt motgaCltalCtrctInfSgmt) {
		MotgaCltalCtrctInfSgmt = motgaCltalCtrctInfSgmt;
	}

	public com.dhcc.xml.ent.entity.loaninfo.AcctCredSgmt getAcctCredSgmt() {
		return AcctCredSgmt;
	}

	public void setAcctCredSgmt(com.dhcc.xml.ent.entity.loaninfo.AcctCredSgmt acctCredSgmt) {
		AcctCredSgmt = acctCredSgmt;
	}

	public com.dhcc.xml.ent.entity.loaninfo.OrigCreditorInfSgmt getOrigCreditorInfSgmt() {
		return OrigCreditorInfSgmt;
	}

	public void setOrigCreditorInfSgmt(com.dhcc.xml.ent.entity.loaninfo.OrigCreditorInfSgmt origCreditorInfSgmt) {
		OrigCreditorInfSgmt = origCreditorInfSgmt;
	}

	public ActLbltyInfSgmt getActLbltyInfSgmt() {
		return ActLbltyInfSgmt;
	}

	public void setActLbltyInfSgmt(ActLbltyInfSgmt actLbltyInfSgmt) {
		ActLbltyInfSgmt = actLbltyInfSgmt;
	}

	public AcctSpecTrstDspnSgmt getAcctSpecTrstDspnSgmt() {
		return AcctSpecTrstDspnSgmt;
	}

	public void setAcctSpecTrstDspnSgmt(AcctSpecTrstDspnSgmt acctSpecTrstDspnSgmt) {
		AcctSpecTrstDspnSgmt = acctSpecTrstDspnSgmt;
	}

}
