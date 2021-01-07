/**  
 * Title: CltalInfSgmt.java<br\> 
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
 * Title: CltalInfSgmt<br/>
 * Description:�֣��ʣ�Ѻ��ͬ��Ϣ��¼������Ϣ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD) // �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "ImpNm", "ImpInf" },namespace = "com.dhcc.xml.ent.entity.motgacltalctrctinfo")// ָ�����гɵ�xml�ڵ�˳��
public class CltalInfSgmt {

	/**
	 *����������� [1..1]
	 */
	private String ImpNm;
	/**
	 *��������Ϣ [1..99]
	 */
	private List<com.dhcc.xml.ent.entity.motgacltalctrctinfo.ImpInf> ImpInf;

	public CltalInfSgmt() {
		super();
	}

	/**
	 * ��ȡ impNm
	 * 
	 * @return the impNm ����������� [1..1]
	 */
	public String getImpNm() {
		return ImpNm;
	}

	/**
	 * ���� impNm
	 * 
	 * @param impNm
	 *            ����������� [1..1]
	 */
	public void setImpNm(String impNm) {
		ImpNm = impNm;
	}



	public List<com.dhcc.xml.ent.entity.motgacltalctrctinfo.ImpInf> getImpInf() {
		return ImpInf;
	}

	public void setImpInf(List<com.dhcc.xml.ent.entity.motgacltalctrctinfo.ImpInf> impInf) {
		ImpInf = impInf;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CltalInfSgmt [ImpInf=" + ImpInf + ", ImpNm=" + ImpNm + "]";
	}

}
