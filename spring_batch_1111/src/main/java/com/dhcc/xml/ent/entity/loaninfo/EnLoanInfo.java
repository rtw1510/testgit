package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnLoanInfo<br/>
 * Description: ��ҵ���������Ϣ��װ�������<br/>
 * 1)��ҵ����˻���Ϣ��ؼ�¼ 2)��ҵ����Э����Ϣ��ؼ�¼ 3)��ҵ��߶֤��ͬ��Ϣ��ؼ�¼
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlRootElement(name = "Document")
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "EnAcctInf", "EnAcctInfIDCagsInf", "EnAcctInfMdfc", "EnAcctInfDel", "EnAcctInfEntDel" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// ָ�����гɵ�xml�ڵ�˳��
public class EnLoanInfo {
	/**
	 * ��ҵ����˻���Ϣ��¼[1..1]
	 */
	private EnAcctInf EnAcctInf;
	/**
	 * ��ҵ����˻���ʶ��������¼[1..1]
	 */
	private EnAcctInfIDCagsInf EnAcctInfIDCagsInf;
	/**
	 * ��ҵ����˻����������������¼[1..1]
	 */
	private com.dhcc.xml.ent.entity.loaninfo.EnAcctInfMdfc EnAcctInfMdfc;
	/**
	 * ��ҵ����˻�����ɾ���������¼[1..1]
	 */
	private EnAcctInfDel EnAcctInfDel;
	/**
	 * ��ҵ����˻�����ɾ���������¼[1..1]
	 */
	private com.dhcc.xml.ent.entity.loaninfo.EnAcctInfEntDel EnAcctInfEntDel;

	public EnLoanInfo() {
		super();
	}

	public EnAcctInf getEnAcctInf() {
		return EnAcctInf;
	}

	public void setEnAcctInf(EnAcctInf enAcctInf) {
		EnAcctInf = enAcctInf;
	}

	public EnAcctInfIDCagsInf getEnAcctInfIDCagsInf() {
		return EnAcctInfIDCagsInf;
	}

	public void setEnAcctInfIDCagsInf(EnAcctInfIDCagsInf enAcctInfIDCagsInf) {
		EnAcctInfIDCagsInf = enAcctInfIDCagsInf;
	}

	public com.dhcc.xml.ent.entity.loaninfo.EnAcctInfMdfc getEnAcctInfMdfc() {
		return EnAcctInfMdfc;
	}

	public void setEnAcctInfMdfc(com.dhcc.xml.ent.entity.loaninfo.EnAcctInfMdfc enAcctInfMdfc) {
		EnAcctInfMdfc = enAcctInfMdfc;
	}

	public EnAcctInfDel getEnAcctInfDel() {
		return EnAcctInfDel;
	}

	public void setEnAcctInfDel(EnAcctInfDel enAcctInfDel) {
		EnAcctInfDel = enAcctInfDel;
	}

	public com.dhcc.xml.ent.entity.loaninfo.EnAcctInfEntDel getEnAcctInfEntDel() {
		return EnAcctInfEntDel;
	}

	public void setEnAcctInfEntDel(com.dhcc.xml.ent.entity.loaninfo.EnAcctInfEntDel enAcctInfEntDel) {
		EnAcctInfEntDel = enAcctInfEntDel;
	}

}
