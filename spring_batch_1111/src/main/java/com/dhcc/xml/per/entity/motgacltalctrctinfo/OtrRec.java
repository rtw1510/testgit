/**  
 * Title: OtrRec.java<br\> 
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

/**
 * Title: OtrRec<br/>
 * Description: �֣��ʣ�Ѻ��ͬ��Ϣ��¼ծ������Ϣ <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
//�������͸�Ϊ�ֶ�
@XmlType(propOrder = { "InfoIDType", "GuarName","GuarCertType","GuarCertNum" },namespace = "com.dhcc.xml.per.entity.motgacltalctrctinfo")
//ָ�����гɵ�xml�ڵ�˳��
public class OtrRec {
	/**
	 *������ [1..1]
	 */
	private String InfoIDType;
	/**
	 *��ͬծ�������� [1..1]
	 */
	private String GuarName;
	/**
	 *��ͬծ������ݱ�ʶ���� [1..1]
	 */
	private String GuarCertType;
	/**
	 *��ͬծ������ݱ�ʶ���� [1..1]
	 */
	private String GuarCertNum;

	public OtrRec() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * ��ȡ infoIDType
	 * 
	 * @return the infoIDType ������ [1..1]
	 */
	public String getInfoIDType() {
		return InfoIDType;
	}

	/**
	 * ���� infoIDType
	 * 
	 * @param infoIDType
	 *            ������ [1..1]
	 */
	public void setInfoIDType(String infoIDType) {
		InfoIDType = infoIDType;
	}

	/**
	 * ��ȡ guarName
	 * 
	 * @return the guarName ��ͬծ�������� [1..1]
	 */
	public String getGuarName() {
		return GuarName;
	}

	/**
	 * ���� guarName
	 * 
	 * @param guarName
	 *            ��ͬծ�������� [1..1]
	 */
	public void setGuarName(String guarName) {
		GuarName = guarName;
	}

	/**
	 * ��ȡ guarCertType
	 * 
	 * @return the guarCertType ��ͬծ������ݱ�ʶ���� [1..1]
	 */
	public String getGuarCertType() {
		return GuarCertType;
	}

	/**
	 * ���� guarCertType
	 * 
	 * @param guarCertType
	 *            ��ͬծ������ݱ�ʶ���� [1..1]
	 */
	public void setGuarCertType(String guarCertType) {
		GuarCertType = guarCertType;
	}

	/**
	 * ��ȡ guarCertNum
	 * 
	 * @return the guarCertNum ��ͬծ������ݱ�ʶ���� [1..1]
	 */
	public String getGuarCertNum() {
		return GuarCertNum;
	}

	/**
	 * ���� guarCertNum
	 * 
	 * @param guarCertNum
	 *            ��ͬծ������ݱ�ʶ���� [1..1]
	 */
	public void setGuarCertNum(String guarCertNum) {
		GuarCertNum = guarCertNum;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OtrRec [GuarCertNum=" + GuarCertNum + ", GuarCertType="
				+ GuarCertType + ", GuarName=" + GuarName + ", InfoIDType="
				+ InfoIDType + "]";
	}

}
