package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: CccInf<br/>
 * Description: ��ҵ����˻���Ϣ��¼����Ѻ��ͬ��Ϣ<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��24��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "Ccc" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// ָ�����гɵ�xml�ڵ�˳��
public class CccInf {
	/**
	 *��(��)Ѻ��ͬ��ʶ�� [1..1]
	 */
	private String Ccc;

	public CccInf() {
		super();
	}

	/**
	 * ��ȡ ccc
	 * 
	 * @return the ccc ��(��)Ѻ��ͬ��ʶ�� [1..1]
	 */
	public String getCcc() {
		return Ccc;
	}

	/**
	 * ���� ccc
	 * 
	 * @param ccc
	 *            ��(��)Ѻ��ͬ��ʶ�� [1..1]
	 */
	public void setCcc(String ccc) {
		Ccc = ccc;
	}

	@Override
	public String toString() {
		return "CccInf [Ccc=" + Ccc + "]";
	}
}
