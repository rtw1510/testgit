package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MdfcSgmt<br/>
 * Description: (1)��ҵ����˻���������
 * ,��ѡ�����Ρ�������Ϣ�Ρ���ػ��������˶Ρ�����ѺƷ��Ϣ�Ρ����Ŷ����Ϣ�Ρ���ʼծȨ˵���Ρ����������Ϣ�Ρ�Լ��������Ϣ�Ρ��ض�����˵���Σ�
 * ����һ���������뼴�ɡ� (2)��ҵ����Э���������,��ѡ�����Ρ���ͬ��������Ϣ�Ρ������Ϣ������һ���������뼴�ɡ�
 * (3)��ҵ��߶֤��ͬ��������,��ѡ�����Ρ���������Ϣ�Ρ���֤�����Ϣ������һ���������뼴�ɡ�<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��24��
 */
@XmlAccessorType(value = XmlAccessType.FIELD) // �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "AcctBsSgmt", "AcctBsInfSgmt", "RltRepymtInfSgmt", "MotgaCltalCtrctInfSgmt", "AcctCredSgmt",
		"OrigCreditorInfSgmt", "ActLbltyInfSgmt", "AcctSpecTrstDspnSgmt" },namespace = "com.dhcc.xml.ent.entity.loaninfo")// ָ�����гɵ�xml�ڵ�˳��
public class MdfcSgmt {
	/* ��һ�ࣺ��ҵ����˻���Ϣ��¼��Ϣ�� */
	/**
	 *������[1..1]
	 */  
	private com.dhcc.xml.ent.entity.loaninfo.AcctBsSgmt AcctBsSgmt;
	/**
	 *������Ϣ��[0..1]
	 */  
	private AcctBsInfSgmt AcctBsInfSgmt; 
	/**
	 *��ػ��������˶�[0..1]
	 */  
	private RltRepymtInfSgmt RltRepymtInfSgmt; 
	/**
	 *����Ѻ����Ϣ��[0..1]
	 */  
	private com.dhcc.xml.ent.entity.loaninfo.MotgaCltalCtrctInfSgmt MotgaCltalCtrctInfSgmt;
	/**
	 *���Ŷ����Ϣ��[0..1]
	 */  
	private com.dhcc.xml.ent.entity.loaninfo.AcctCredSgmt AcctCredSgmt;
	/**
	 *��ʼծȨ˵����[0..1]
	 */  
	private com.dhcc.xml.ent.entity.loaninfo.OrigCreditorInfSgmt OrigCreditorInfSgmt;
	/**
	 *���������Ϣ��[1..1]
	 */  
	private ActLbltyInfSgmt ActLbltyInfSgmt; 
	/**
	 *�ض�����˵����[0..1]
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
