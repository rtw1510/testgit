package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: GuarAcctCredSgmt<br/>
 * Description:��ҵ�����˻���¼���Ŷ����Ϣ��<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "Mcc" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class GuarAcctCredSgmt {

	/**
	 *����Э���ʶ��[1..1]
	 */
	private String Mcc;

	public GuarAcctCredSgmt() {
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
		return "GuarAcctCredSgmt [Mcc=" + Mcc + "]";
	}

}
