package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MdfcSgmt<br/>
 * Description: ��������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "AcctBsSgmt", "AcctBsInfSgmt", "RltRepymtInfSgmt",
		"MotgaCltalCtrctInfSgmt", "AcctCredSgmt", "OrigCreditorInfSgmt",
		"AcctMthlyBlgInfSgmt", "SpecPrdSgmt", "AcctDbtInfSgmt",
		"AcctSpecTrstDspnSgmt" },namespace = "com.dhcc.xml.per.entity.loaninfo")
// �ֶ�չʾ�Ⱥ�˳��
public class MdfcSgmt {
	/** ������[1..1] */
	private AcctBsSgmt AcctBsSgmt;
	/** ������Ϣ��[0..1] */
	private AcctBsInfSgmt AcctBsInfSgmt;
	/** ��ػ��������˶�[0..1] */
	private RltRepymtInfSgmt RltRepymtInfSgmt;
	/** ����Ѻ����Ϣ��[0..1] */
	private MotgaCltalCtrctInfSgmt MotgaCltalCtrctInfSgmt;
	/** ���Ŷ����Ϣ��[0..1] */
	private AcctCredSgmt AcctCredSgmt;
	/** ��ʼծȨ˵����[0..1] */
	private OrigCreditorInfSgmt OrigCreditorInfSgmt;
	/** �¶ȱ�����Ϣ��[0..1] */
	private AcctMthlyBlgInfSgmt AcctMthlyBlgInfSgmt;
	/** ���ר�������Ϣ��[0..1] */
	private SpecPrdSgmt SpecPrdSgmt;
	/** ���¶ȱ�����Ϣ��[0..1] */
	private AcctDbtInfSgmt AcctDbtInfSgmt;
	/** ���⽻��˵����[0..1] */
	private AcctSpecTrstDspnSgmt AcctSpecTrstDspnSgmt;

	public MdfcSgmt() {
		super();
		// TODO Auto-generated constructor stub
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
	public void setMotgaCltalCtrctInfSgmt(MotgaCltalCtrctInfSgmt motgaCltalCtrctInfSgmt) {
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
	public OrigCreditorInfSgmt getOrigCreditorInfSgmt() {
		return OrigCreditorInfSgmt;
	}

	/**
	 * ���� origCreditorInfSgmt
	 * 
	 * @param origCreditorInfSgmt
	 *            ��ʼծȨ˵����[0..1]
	 */
	public void setOrigCreditorInfSgmt(OrigCreditorInfSgmt origCreditorInfSgmt) {
		OrigCreditorInfSgmt = origCreditorInfSgmt;
	}

	/**
	 * ��ȡ acctMthlyBlgInfSgmt
	 * 
	 * @return the acctMthlyBlgInfSgmt �¶ȱ�����Ϣ��[0..1]
	 */
	public AcctMthlyBlgInfSgmt getAcctMthlyBlgInfSgmt() {
		return AcctMthlyBlgInfSgmt;
	}

	/**
	 * ���� acctMthlyBlgInfSgmt
	 * 
	 * @param acctMthlyBlgInfSgmt
	 *            �¶ȱ�����Ϣ��[0..1]
	 */
	public void setAcctMthlyBlgInfSgmt(AcctMthlyBlgInfSgmt acctMthlyBlgInfSgmt) {
		AcctMthlyBlgInfSgmt = acctMthlyBlgInfSgmt;
	}

	/**
	 * ��ȡ specPrdSgmt
	 * 
	 * @return the specPrdSgmt ���ר�������Ϣ��[0..1]
	 */
	public SpecPrdSgmt getSpecPrdSgmt() {
		return SpecPrdSgmt;
	}

	/**
	 * ���� specPrdSgmt
	 * 
	 * @param specPrdSgmt
	 *            ���ר�������Ϣ��[0..1]
	 */
	public void setSpecPrdSgmt(SpecPrdSgmt specPrdSgmt) {
		SpecPrdSgmt = specPrdSgmt;
	}

	/**
	 * ��ȡ acctDbtInfSgmt
	 * 
	 * @return the acctDbtInfSgmt ���¶ȱ�����Ϣ��[0..1]
	 */
	public AcctDbtInfSgmt getAcctDbtInfSgmt() {
		return AcctDbtInfSgmt;
	}

	/**
	 * ���� acctDbtInfSgmt
	 * 
	 * @param acctDbtInfSgmt
	 *            ���¶ȱ�����Ϣ��[0..1]
	 */
	public void setAcctDbtInfSgmt(AcctDbtInfSgmt acctDbtInfSgmt) {
		AcctDbtInfSgmt = acctDbtInfSgmt;
	}

	/**
	 * ��ȡ acctSpecTrstDspnSgmt
	 * 
	 * @return the acctSpecTrstDspnSgmt ���⽻��˵����[0..1]
	 */
	public AcctSpecTrstDspnSgmt getAcctSpecTrstDspnSgmt() {
		return AcctSpecTrstDspnSgmt;
	}

	/**
	 * ���� acctSpecTrstDspnSgmt
	 * 
	 * @param acctSpecTrstDspnSgmt
	 *            ���⽻��˵����[0..1]
	 */
	public void setAcctSpecTrstDspnSgmt(AcctSpecTrstDspnSgmt acctSpecTrstDspnSgmt) {
		AcctSpecTrstDspnSgmt = acctSpecTrstDspnSgmt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MdfcSgmt [AcctBsSgmt=" + AcctBsSgmt + ", AcctBsInfSgmt=" + AcctBsInfSgmt + ", RltRepymtInfSgmt=" + RltRepymtInfSgmt + ", MotgaCltalCtrctInfSgmt=" + MotgaCltalCtrctInfSgmt + ", AcctCredSgmt=" + AcctCredSgmt + ", OrigCreditorInfSgmt=" + OrigCreditorInfSgmt + ", AcctMthlyBlgInfSgmt=" + AcctMthlyBlgInfSgmt + ", SpecPrdSgmt=" + SpecPrdSgmt + ", AcctDbtInfSgmt=" + AcctDbtInfSgmt + ", AcctSpecTrstDspnSgmt=" + AcctSpecTrstDspnSgmt + "]";
	}
}
