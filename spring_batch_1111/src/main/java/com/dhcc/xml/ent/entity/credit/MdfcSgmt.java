package com.dhcc.xml.ent.entity.credit;

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
@XmlType(propOrder = { "CtrctBsSgmt", "CtrctCertRelSgmt","CreditLimSgmt" },namespace = "com.dhcc.xml.ent.entity.credit") // ָ�����гɵ�xml�ڵ�˳��
public class MdfcSgmt {
	/* �ڶ��ࣺ��ҵ����Э����Ϣ��¼��Ϣ�� */
	/**
	 *������ [1..1]
	 */  
	private CtrctBsSgmt CtrctBsSgmt; 
	/**
	 *��ͬ��������Ϣ�� [0..1]
	 */  
	private com.dhcc.xml.ent.entity.credit.CtrctCertRelSgmt CtrctCertRelSgmt;
	/**
	 *�����Ϣ�� [1..1]
	 */  
	private CreditLimSgmt CreditLimSgmt; 

	public MdfcSgmt() {
		super();
	}

	public CtrctBsSgmt getCtrctBsSgmt() {
		return CtrctBsSgmt;
	}

	public void setCtrctBsSgmt(CtrctBsSgmt ctrctBsSgmt) {
		CtrctBsSgmt = ctrctBsSgmt;
	}

	public com.dhcc.xml.ent.entity.credit.CtrctCertRelSgmt getCtrctCertRelSgmt() {
		return CtrctCertRelSgmt;
	}

	public void setCtrctCertRelSgmt(com.dhcc.xml.ent.entity.credit.CtrctCertRelSgmt ctrctCertRelSgmt) {
		CtrctCertRelSgmt = ctrctCertRelSgmt;
	}

	public CreditLimSgmt getCreditLimSgmt() {
		return CreditLimSgmt;
	}

	public void setCreditLimSgmt(CreditLimSgmt creditLimSgmt) {
		CreditLimSgmt = creditLimSgmt;
	}


}
