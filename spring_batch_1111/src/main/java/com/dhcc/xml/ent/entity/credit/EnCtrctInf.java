package com.dhcc.xml.ent.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnCtrctInf<br/>
 * Description:��ҵ����Э����Ϣ��¼��Ϣ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��24��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "CtrctBsSgmt", "CtrctCertRelSgmt", "CreditLimSgmt" },namespace = "com.dhcc.xml.ent.entity.credit")
// ָ�����гɵ�xml�ڵ�˳��
public class EnCtrctInf {
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

	public EnCtrctInf() {
		super();
	}

	/**
	 * ��ȡ ctrctBsSgmt
	 * 
	 * @return the ctrctBsSgmt ������ [1..1]
	 */
	public CtrctBsSgmt getCtrctBsSgmt() {
		return CtrctBsSgmt;
	}

	/**
	 * ���� ctrctBsSgmt
	 * 
	 * @param ctrctBsSgmt
	 *            ������ [1..1]
	 */
	public void setCtrctBsSgmt(CtrctBsSgmt ctrctBsSgmt) {
		CtrctBsSgmt = ctrctBsSgmt;
	}

	/**
	 * ��ȡ ctrctCertRelSgmt
	 * 
	 * @return the ctrctCertRelSgmt ��ͬ��������Ϣ�� [0..1]
	 */
	public com.dhcc.xml.ent.entity.credit.CtrctCertRelSgmt getCtrctCertRelSgmt() {
		return CtrctCertRelSgmt;
	}

	/**
	 * ���� ctrctCertRelSgmt
	 * 
	 * @param ctrctCertRelSgmt
	 *            ��ͬ��������Ϣ�� [0..1]
	 */
	public void setCtrctCertRelSgmt(com.dhcc.xml.ent.entity.credit.CtrctCertRelSgmt ctrctCertRelSgmt) {
		CtrctCertRelSgmt = ctrctCertRelSgmt;
	}

	/**
	 * ��ȡ creditLimSgmt
	 * 
	 * @return the creditLimSgmt �����Ϣ�� [1..1]
	 */
	public CreditLimSgmt getCreditLimSgmt() {
		return CreditLimSgmt;
	}

	/**
	 * ���� creditLimSgmt
	 * 
	 * @param creditLimSgmt
	 *            �����Ϣ�� [1..1]
	 */
	public void setCreditLimSgmt(CreditLimSgmt creditLimSgmt) {
		CreditLimSgmt = creditLimSgmt;
	}

	@Override
	public String toString() {
		return "EnCtrctInf [CtrctBsSgmt=" + CtrctBsSgmt + ", CtrctCertRelSgmt="
				+ CtrctCertRelSgmt + ", CreditLimSgmt=" + CreditLimSgmt + "]";
	}

}
