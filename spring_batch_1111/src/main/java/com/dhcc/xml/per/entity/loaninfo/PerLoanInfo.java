package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnLoanInfo<br/>
 * Description:���˽����Ϣ��װ������� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlRootElement(name = "Document")
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "InAcctInf", "InAcctIDCagsInf", "InSpcEvtDscInf",
		"InAcctMdfc", "InAcctDel", "InAcctEntDel" },namespace = "com.dhcc.xml.per.entity.loaninfo")
// ָ�����гɵ�xml�ڵ�˳��
public class PerLoanInfo {
	/**
	 * ���˽���˻���¼210
	 */
	private InAcctInf InAcctInf;

	/**
	 * ���˽���˻���ʶ��������¼211
	 */
	private InAcctIDCagsInf InAcctIDCagsInf;

	/**
	 * ���˽���˻������¼�˵����¼215
	 */
	private InSpcEvtDscInf InSpcEvtDscInf;
	/**
	 * ���˽���˻����θ��������¼212
	 */
	private InAcctMdfc InAcctMdfc;

	/**
	 * ���˽���˻�����ɾ�������¼213
	 */
	private InAcctDel InAcctDel;

	/**
	 * ���˽���˻�����ɾ�������¼214
	 */
	private InAcctEntDel InAcctEntDel;

	public PerLoanInfo() {
		super();
	}

	public InAcctInf getInAcctInf() {
		return InAcctInf;
	}

	public void setInAcctInf(InAcctInf inAcctInf) {
		InAcctInf = inAcctInf;
	}

	public InAcctIDCagsInf getInAcctIDCagsInf() {
		return InAcctIDCagsInf;
	}

	public void setInAcctIDCagsInf(InAcctIDCagsInf inAcctIDCagsInf) {
		InAcctIDCagsInf = inAcctIDCagsInf;
	}

	public InSpcEvtDscInf getInSpcEvtDscInf() {
		return InSpcEvtDscInf;
	}

	public void setInSpcEvtDscInf(InSpcEvtDscInf inSpcEvtDscInf) {
		InSpcEvtDscInf = inSpcEvtDscInf;
	}

	public InAcctMdfc getInAcctMdfc() {
		return InAcctMdfc;
	}

	public void setInAcctMdfc(InAcctMdfc inAcctMdfc) {
		InAcctMdfc = inAcctMdfc;
	}

	public InAcctDel getInAcctDel() {
		return InAcctDel;
	}

	public void setInAcctDel(InAcctDel inAcctDel) {
		InAcctDel = inAcctDel;
	}

	public InAcctEntDel getInAcctEntDel() {
		return InAcctEntDel;
	}

	public void setInAcctEntDel(InAcctEntDel inAcctEntDel) {
		InAcctEntDel = inAcctEntDel;
	}

}
