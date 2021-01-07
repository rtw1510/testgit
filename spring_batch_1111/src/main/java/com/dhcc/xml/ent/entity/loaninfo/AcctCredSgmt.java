package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: AcctCredSgmt<br/>
 * Description: ��ҵ����˻���Ϣ��¼���Ŷ����Ϣ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��24��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "Mcc" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// ָ�����гɵ�xml�ڵ�˳��
public class AcctCredSgmt {
	/**
	 *����Э���ʶ��[1..1]
	 */
	private String Mcc;

	public AcctCredSgmt() {
		super();
	}

	/**
	 * ��ȡ mcc
	 * 
	 * @return the mcc ����Э���ʶ��[1..1]
	 */
	public String getMcc() {
		return Mcc;
	}

	/**
	 * ���� mcc
	 * 
	 * @param mcc
	 *            ����Э���ʶ��[1..1]
	 */
	public void setMcc(String mcc) {
		Mcc = mcc;
	}

	@Override
	public String toString() {
		return "AcctCredSgmt [Mcc=" + Mcc + "]";
	}

}
