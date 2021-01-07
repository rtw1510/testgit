package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnAcctInf<br/>
 * Description:��ҵ����˻���Ϣ��¼��Ϣ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��24��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "AcctBsSgmt", "AcctBsInfSgmt", "RltRepymtInfSgmt",
		"MotgaCltalCtrctInfSgmt", "AcctCredSgmt", "OrigCreditorInfSgmt",
		"ActLbltyInfSgmt", "AcctSpecTrstDspnSgmt" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// ָ�����гɵ�xml�ڵ�˳��
public class EnAcctInf {
	/**
	 *������[1..1]
	 */
	private AcctBsSgmt AcctBsSgmt;
	/**
	 *������Ϣ��[0..1]
	 */
	private AcctBsInfSgmt AcctBsInfSgmt;
	/**
	 *��ػ��������˶�[0..1]		EB_CORPACCRLT_INFO
	 */
	private RltRepymtInfSgmt RltRepymtInfSgmt;
	/**
	 *����Ѻ����Ϣ��[0..1]		û��
	 */
	private MotgaCltalCtrctInfSgmt MotgaCltalCtrctInfSgmt;
	/**
	 *���Ŷ����Ϣ��[0..1]
	 */
	private AcctCredSgmt AcctCredSgmt;
	/**
	 *��ʼծȨ˵����[0..1]
	 */
	private com.dhcc.xml.ent.entity.loaninfo.OrigCreditorInfSgmt OrigCreditorInfSgmt;
	/**
	 *���������Ϣ��[1..1]       EB_CORPACCRETU_INFO
	 */
	private ActLbltyInfSgmt ActLbltyInfSgmt;
	/**
	 *�ض�����˵����[0..1]		EB_CORPACCSPEC_INFO
	 */
	private AcctSpecTrstDspnSgmt AcctSpecTrstDspnSgmt;

	public EnAcctInf() {
		super();
	}

	/**
	 * ��ȡ acctBsSgmt
	 * 
	 * @return the acctBsSgmt ������[1..1]
	 */
	public AcctBsSgmt getAcctBsSgmt() {
		return AcctBsSgmt;
	}

	/**
	 * ���� acctBsSgmt
	 * 
	 * @param acctBsSgmt
	 *            ������[1..1]
	 */
	public void setAcctBsSgmt(AcctBsSgmt acctBsSgmt) {
		AcctBsSgmt = acctBsSgmt;
	}

	/**
	 * ��ȡ acctBsInfSgmt
	 * 
	 * @return the acctBsInfSgmt ������Ϣ��[0..1]
	 */
	public AcctBsInfSgmt getAcctBsInfSgmt() {
		return AcctBsInfSgmt;
	}

	/**
	 * ���� acctBsInfSgmt
	 * 
	 * @param acctBsInfSgmt
	 *            ������Ϣ��[0..1]
	 */
	public void setAcctBsInfSgmt(AcctBsInfSgmt acctBsInfSgmt) {
		AcctBsInfSgmt = acctBsInfSgmt;
	}

	/**
	 * ��ȡ rltRepymtInfSgmt
	 * 
	 * @return the rltRepymtInfSgmt ��ػ��������˶�[0..1]
	 */
	public RltRepymtInfSgmt getRltRepymtInfSgmt() {
		return RltRepymtInfSgmt;
	}

	/**
	 * ���� rltRepymtInfSgmt
	 * 
	 * @param rltRepymtInfSgmt
	 *            ��ػ��������˶�[0..1]
	 */
	public void setRltRepymtInfSgmt(RltRepymtInfSgmt rltRepymtInfSgmt) {
		RltRepymtInfSgmt = rltRepymtInfSgmt;
	}

	/**
	 * ��ȡ motgaCltalCtrctInfSgmt
	 * 
	 * @return the motgaCltalCtrctInfSgmt ����Ѻ����Ϣ��[0..1]
	 */
	public MotgaCltalCtrctInfSgmt getMotgaCltalCtrctInfSgmt() {
		return MotgaCltalCtrctInfSgmt;
	}

	/**
	 * ���� motgaCltalCtrctInfSgmt
	 * 
	 * @param motgaCltalCtrctInfSgmt
	 *            ����Ѻ����Ϣ��[0..1]
	 */
	public void setMotgaCltalCtrctInfSgmt(
			MotgaCltalCtrctInfSgmt motgaCltalCtrctInfSgmt) {
		MotgaCltalCtrctInfSgmt = motgaCltalCtrctInfSgmt;
	}

	/**
	 * ��ȡ acctCredSgmt
	 * 
	 * @return the acctCredSgmt ���Ŷ����Ϣ��[0..1]
	 */
	public AcctCredSgmt getAcctCredSgmt() {
		return AcctCredSgmt;
	}

	/**
	 * ���� acctCredSgmt
	 * 
	 * @param acctCredSgmt
	 *            ���Ŷ����Ϣ��[0..1]
	 */
	public void setAcctCredSgmt(AcctCredSgmt acctCredSgmt) {
		AcctCredSgmt = acctCredSgmt;
	}

	/**
	 * ��ȡ origCreditorInfSgmt
	 * 
	 * @return the origCreditorInfSgmt ��ʼծȨ˵����[0..1]
	 */
	public com.dhcc.xml.ent.entity.loaninfo.OrigCreditorInfSgmt getOrigCreditorInfSgmt() {
		return OrigCreditorInfSgmt;
	}

	/**
	 * ���� origCreditorInfSgmt
	 * 
	 * @param origCreditorInfSgmt
	 *            ��ʼծȨ˵����[0..1]
	 */
	public void setOrigCreditorInfSgmt(com.dhcc.xml.ent.entity.loaninfo.OrigCreditorInfSgmt origCreditorInfSgmt) {
		OrigCreditorInfSgmt = origCreditorInfSgmt;
	}

	/**
	 * ��ȡ actLbltyInfSgmt
	 * 
	 * @return the actLbltyInfSgmt ���������Ϣ��[1..1]
	 */
	public ActLbltyInfSgmt getActLbltyInfSgmt() {
		return ActLbltyInfSgmt;
	}

	/**
	 * ���� actLbltyInfSgmt
	 * 
	 * @param actLbltyInfSgmt
	 *            ���������Ϣ��[1..1]
	 */
	public void setActLbltyInfSgmt(ActLbltyInfSgmt actLbltyInfSgmt) {
		ActLbltyInfSgmt = actLbltyInfSgmt;
	}

	/**
	 * ��ȡ acctSpecTrstDspnSgmt
	 * 
	 * @return the acctSpecTrstDspnSgmt �ض�����˵����[0..1]
	 */
	public AcctSpecTrstDspnSgmt getAcctSpecTrstDspnSgmt() {
		return AcctSpecTrstDspnSgmt;
	}

	/**
	 * ���� acctSpecTrstDspnSgmt
	 * 
	 * @param acctSpecTrstDspnSgmt
	 *            �ض�����˵����[0..1]
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
