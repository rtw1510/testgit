/**  
 * Title: EnMotgaCltalCtrctInfo.java<br\> 
 * Description: <br\> 
 * Copyright: Copyright (c) 2018<br\> 
 * Company: DHCC<br\>  
 * @author ChenJingYuan  
 * @date 2018-2-26  
 */
package com.dhcc.xml.per.entity.motgacltalctrctinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: PerMotgaCltalCtrctInfo<br/>
 * Description: �֣��ʣ�Ѻ��ͬ��Ϣ�������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlRootElement(name = "Document")
@XmlAccessorType(value = XmlAccessType.FIELD) // �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "MotgaCltalCtrctInf", "MoCIDCagsInf","MoCEntDel" },namespace = "com.dhcc.xml.per.entity.motgacltalctrctinfo") // ָ�����гɵ�xml�ڵ�˳��
public class PerMotgaCltalCtrctInfo {
	/**
	 *�֣��ʣ�Ѻ��ͬ��Ϣ��¼
	 */
	private MotgaCltalCtrctInf MotgaCltalCtrctInf;
	/**
	 *�֣��ʣ�Ѻ��ͬ��ʶ��������¼
	 */
	private MoCIDCagsInf MoCIDCagsInf;
	/**
	 *�֣��ʣ�Ѻ��ͬ����ɾ�������¼
	 */
	private MoCEntDel MoCEntDel;

	public PerMotgaCltalCtrctInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * ��ȡ motgaCltalCtrctInf
	 * 
	 * @return the motgaCltalCtrctInf �֣��ʣ�Ѻ��ͬ��Ϣ��¼
	 */
	public MotgaCltalCtrctInf getMotgaCltalCtrctInf() {
		return MotgaCltalCtrctInf;
	}

	/**
	 * ���� motgaCltalCtrctInf
	 * 
	 * @param motgaCltalCtrctInf
	 *            �֣��ʣ�Ѻ��ͬ��Ϣ��¼
	 */
	public void setMotgaCltalCtrctInf(MotgaCltalCtrctInf motgaCltalCtrctInf) {
		MotgaCltalCtrctInf = motgaCltalCtrctInf;
	}

	/**
	 * ��ȡ moCIDCagsInf
	 * 
	 * @return the moCIDCagsInf �֣��ʣ�Ѻ��ͬ��ʶ��������¼
	 */
	public MoCIDCagsInf getMoCIDCagsInf() {
		return MoCIDCagsInf;
	}

	/**
	 * ���� moCIDCagsInf
	 * 
	 * @param moCIDCagsInf
	 *            �֣��ʣ�Ѻ��ͬ��ʶ��������¼
	 */
	public void setMoCIDCagsInf(MoCIDCagsInf moCIDCagsInf) {
		MoCIDCagsInf = moCIDCagsInf;
	}

	/**
	 * ��ȡ moCEntDel
	 * 
	 * @return the moCEntDel �֣��ʣ�Ѻ��ͬ����ɾ�������¼
	 */
	public MoCEntDel getMoCEntDel() {
		return MoCEntDel;
	}

	/**
	 * ���� moCEntDel
	 * 
	 * @param moCEntDel
	 *            �֣��ʣ�Ѻ��ͬ����ɾ�������¼
	 */
	public void setMoCEntDel(MoCEntDel moCEntDel) {
		MoCEntDel = moCEntDel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EnMotgaCltalCtrctInfo [MoCEntDel=" + MoCEntDel
				+ ", MoCIDCagsInf=" + MoCIDCagsInf + ", MotgaCltalCtrctInf="
				+ MotgaCltalCtrctInf + "]";
	}

}
