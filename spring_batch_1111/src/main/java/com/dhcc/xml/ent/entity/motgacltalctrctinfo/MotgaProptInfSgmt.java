/**  
 * Title: MotgaProptInfSgmt.java<br\> 
 * Description: <br\> 
 * Copyright: Copyright (c) 2018<br\> 
 * Company: DHCC<br\>  
 * @author ChenJingYuan  
 * @date 2018-2-26  
 */
package com.dhcc.xml.ent.entity.motgacltalctrctinfo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MotgaProptInfSgmt<br/>
 * Description: �֣��ʣ�Ѻ��ͬ��Ϣ��¼��Ѻ����Ϣ��<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "PleNm", "PleInf" },namespace = "com.dhcc.xml.ent.entity.motgacltalctrctinfo")
// ָ�����гɵ�xml�ڵ�˳��
public class MotgaProptInfSgmt {
	/**
	 *��Ѻ�����[1..1]
	 */
	private String PleNm;
	/**
	 *����Ѻ����Ϣ [1..99]
	 */
	private List<com.dhcc.xml.ent.entity.motgacltalctrctinfo.PleInf> PleInf;

	public MotgaProptInfSgmt() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * ��ȡ pleNm
	 * 
	 * @return the pleNm ��Ѻ�����[1..1]
	 */
	public String getPleNm() {
		return PleNm;
	}

	/**
	 * ���� pleNm
	 * 
	 * @param pleNm
	 *            ��Ѻ�����[1..1]
	 */
	public void setPleNm(String pleNm) {
		PleNm = pleNm;
	}


	public List<com.dhcc.xml.ent.entity.motgacltalctrctinfo.PleInf> getPleInf() {
		return PleInf;
	}

	public void setPleInf(List<com.dhcc.xml.ent.entity.motgacltalctrctinfo.PleInf> pleInf) {
		PleInf = pleInf;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MotgaProptInfSgmt [PleInf=" + PleInf + ", PleNm=" + PleNm + "]";
	}

}
