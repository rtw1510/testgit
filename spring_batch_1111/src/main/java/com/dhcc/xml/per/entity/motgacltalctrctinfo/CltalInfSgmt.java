/**  
 * Title: CltalInfSgmt.java<br\> 
 * Description: <br\> 
 * Copyright: Copyright (c) 2018<br\> 
 * Company: DHCC<br\>  
 * @author ChenJingYuan  
 * @date 2018-2-26  
 */
package com.dhcc.xml.per.entity.motgacltalctrctinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Title: CltalInfSgmt<br/>
 * Description:�֣��ʣ�Ѻ��ͬ��Ϣ��¼������Ϣ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD) // �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "ImpNm", "ImpInf" },namespace = "com.dhcc.xml.per.entity.motgacltalctrctinfo")// ָ�����гɵ�xml�ڵ�˳��
public class CltalInfSgmt {

	/**
	 *����������� [1..1]
	 */
	private String ImpNm;
	/**
	 *��������Ϣ [1..99]
	 */
	private List<ImpInf> ImpInf;

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



	public List<ImpInf> getImpInf() {
		return ImpInf;
	}

	public void setImpInf(List<ImpInf> impInf) {
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
