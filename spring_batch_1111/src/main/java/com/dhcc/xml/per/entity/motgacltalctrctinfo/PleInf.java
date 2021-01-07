/**  
 * Title: PleInf.java<br\> 
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
 * Title: PleInf<br/>
 * Description: �֣��ʣ�Ѻ��ͬ��Ϣ��¼��Ѻ����ϢԪ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "PleType", "MotgaProptIDType", "PleCertID", "PleDistr",
		"PleValue","PleCy","ValOrgType", "ValDate", "PledgorType", "PledgorName", "PleorCertType",
		"PleorCertNum", "PleDesc" },namespace = "com.dhcc.xml.per.entity.motgacltalctrctinfo")
// ָ�����гɵ�xml�ڵ�˳��
public class PleInf {
	/**
	 *��Ѻ������ [1..1]
	 */
	private String PleType;
	/**
	 *��Ѻ��ʶ������� [1..1]
	 */
	private String MotgaProptIDType;
	/**
	 *��Ѻ��Ψһʶ��� [1..1]
	 */
	private String PleCertID;
	/**
	 *��Ѻ��λ�����ڵ��������� [1..1]
	 */
	private String PleDistr;
	/**
	 *��Ѻ��������ֵ [1..1]
	 */
	private String PleValue;
	/**
	 *���� [1..1]
	 */
	private String PleCy;
	/**
	 *������������ [1..1]
	 */
	private String ValOrgType;
	/**
	 *��Ѻ���������� [1..1]
	 */
	private String ValDate;
	/**
	 *��Ѻ������ [1..1]
	 */
	private String PledgorType;
	/**
	 *��Ѻ������ [1..1]
	 */
	private String PledgorName;
	/**
	 *��Ѻ����ݱ�ʶ���� [1..1]
	 */
	private String PleorCertType;
	/**
	 *��Ѻ����ݱ�ʶ���� [1..1]
	 */
	private String PleorCertNum;
	/**
	 *��Ѻ��˵�� [1..1]
	 */
	private String PleDesc;

	
	

	public PleInf() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**  
	 * ��ȡ pleCy
	 * @return the pleCy ���� [1..1] 
	 */
	public String getPleCy() {
		return PleCy;
	}


	/**  
	 * ���� pleCy  
	 * @param pleCy ���� [1..1]  
	 */
	public void setPleCy(String pleCy) {
		PleCy = pleCy;
	}


	/**
	 * ��ȡ pleType
	 * 
	 * @return the pleType ��Ѻ������ [1..1]
	 */
	public String getPleType() {
		return PleType;
	}

	/**
	 * ���� pleType
	 * 
	 * @param pleType
	 *            ��Ѻ������ [1..1]
	 */
	public void setPleType(String pleType) {
		PleType = pleType;
	}

	/**  
	 * ��ȡ motgaProptIDType
	 * @return the motgaProptIDType ��Ѻ��ʶ������� [1..1] 
	 */
	public String getMotgaProptIDType() {
		return MotgaProptIDType;
	}

	/**  
	 * ���� motgaProptIDType  
	 * @param motgaProptIDType ��Ѻ��ʶ������� [1..1]  
	 */
	public void setMotgaProptIDType(String motgaProptIDType) {
		MotgaProptIDType = motgaProptIDType;
	}


	/**
	 * ��ȡ pleCertID
	 * 
	 * @return the pleCertID ��Ѻ��Ψһʶ��� [1..1]
	 */
	public String getPleCertID() {
		return PleCertID;
	}

	/**
	 * ���� pleCertID
	 * 
	 * @param pleCertID
	 *            ��Ѻ��Ψһʶ��� [1..1]
	 */
	public void setPleCertID(String pleCertID) {
		PleCertID = pleCertID;
	}

	/**
	 * ��ȡ pleDistr
	 * 
	 * @return the pleDistr ��Ѻ��λ�����ڵ��������� [1..1]
	 */
	public String getPleDistr() {
		return PleDistr;
	}

	/**
	 * ���� pleDistr
	 * 
	 * @param pleDistr
	 *            ��Ѻ��λ�����ڵ��������� [1..1]
	 */
	public void setPleDistr(String pleDistr) {
		PleDistr = pleDistr;
	}

	/**
	 * ��ȡ pleValue
	 * 
	 * @return the pleValue ��Ѻ��������ֵ [1..1]
	 */
	public String getPleValue() {
		return PleValue;
	}

	/**
	 * ���� pleValue
	 * 
	 * @param pleValue
	 *            ��Ѻ��������ֵ [1..1]
	 */
	public void setPleValue(String pleValue) {
		PleValue = pleValue;
	}

	/**
	 * ��ȡ valOrgType
	 * 
	 * @return the valOrgType ������������ [1..1]
	 */
	public String getValOrgType() {
		return ValOrgType;
	}

	/**
	 * ���� valOrgType
	 * 
	 * @param valOrgType
	 *            ������������ [1..1]
	 */
	public void setValOrgType(String valOrgType) {
		ValOrgType = valOrgType;
	}

	/**
	 * ��ȡ valDate
	 * 
	 * @return the valDate ��Ѻ���������� [1..1]
	 */
	public String getValDate() {
		return ValDate;
	}

	/**
	 * ���� valDate
	 * 
	 * @param valDate
	 *            ��Ѻ���������� [1..1]
	 */
	public void setValDate(String valDate) {
		ValDate = valDate;
	}

	/**
	 * ��ȡ pledgorType
	 * 
	 * @return the pledgorType ��Ѻ������ [1..1]
	 */
	public String getPledgorType() {
		return PledgorType;
	}

	/**
	 * ���� pledgorType
	 * 
	 * @param pledgorType
	 *            ��Ѻ������ [1..1]
	 */
	public void setPledgorType(String pledgorType) {
		PledgorType = pledgorType;
	}

	/**
	 * ��ȡ pledgorName
	 * 
	 * @return the pledgorName ��Ѻ������ [1..1]
	 */
	public String getPledgorName() {
		return PledgorName;
	}

	/**
	 * ���� pledgorName
	 * 
	 * @param pledgorName
	 *            ��Ѻ������ [1..1]
	 */
	public void setPledgorName(String pledgorName) {
		PledgorName = pledgorName;
	}

	/**
	 * ��ȡ pleorCertType
	 * 
	 * @return the pleorCertType ��Ѻ����ݱ�ʶ���� [1..1]
	 */
	public String getPleorCertType() {
		return PleorCertType;
	}

	/**
	 * ���� pleorCertType
	 * 
	 * @param pleorCertType
	 *            ��Ѻ����ݱ�ʶ���� [1..1]
	 */
	public void setPleorCertType(String pleorCertType) {
		PleorCertType = pleorCertType;
	}

	/**
	 * ��ȡ pleorCertNum
	 * 
	 * @return the pleorCertNum ��Ѻ����ݱ�ʶ���� [1..1]
	 */
	public String getPleorCertNum() {
		return PleorCertNum;
	}

	/**
	 * ���� pleorCertNum
	 * 
	 * @param pleorCertNum
	 *            ��Ѻ����ݱ�ʶ���� [1..1]
	 */
	public void setPleorCertNum(String pleorCertNum) {
		PleorCertNum = pleorCertNum;
	}

	/**
	 * ��ȡ pleDesc
	 * 
	 * @return the pleDesc ��Ѻ��˵�� [1..1]
	 */
	public String getPleDesc() {
		return PleDesc;
	}

	/**
	 * ���� pleDesc
	 * 
	 * @param pleDesc
	 *            ��Ѻ��˵�� [1..1]
	 */
	public void setPleDesc(String pleDesc) {
		PleDesc = pleDesc;
	}
}
