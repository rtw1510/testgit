package com.dhcc.xml.per.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: CccInf<br/>
 * Description: ���˵����˻���¼����Ѻ����Ϣ<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��28��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "Ccc" },namespace = "com.dhcc.xml.per.entity.guarantee")
// ָ�����гɵ�xml�ڵ�˳��
public class CccInf {
	/**
	 * �֣��ʣ�Ѻ��ͬ��ʶ��
	 */
	private String Ccc;

	public CccInf() {
		super();
	}

	/**
	 * ��ȡ ccc
	 * 
	 * @return the ccc �֣��ʣ�Ѻ��ͬ��ʶ��
	 */
	public String getCcc() {
		return Ccc;
	}

	/**
	 * ���� ccc
	 * 
	 * @param ccc
	 *            �֣��ʣ�Ѻ��ͬ��ʶ��
	 */
	public void setCcc(String ccc) {
		Ccc = ccc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CccInf [Ccc=" + Ccc + "]";
	}
}
