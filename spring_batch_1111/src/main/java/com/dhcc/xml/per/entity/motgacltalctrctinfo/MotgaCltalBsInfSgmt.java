/**  
 * Title: MotgaCltalBsInfSgmt.java<br\> 
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
 * Title: MotgaCltalBsInfSgmt<br/>
 * Description:�֣��ʣ�Ѻ��ͬ������Ϣ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD) // �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "GuarType", "CcAmt","Cy","CcValDate","CcExpDate",
		"MaxGuar","CcStatus" },namespace = "com.dhcc.xml.per.entity.motgacltalctrctinfo") // ָ�����гɵ�xml�ڵ�˳��
public class MotgaCltalBsInfSgmt {
	/**
	 *��ͬ���� [1..1]
	 */
	private String GuarType;
	/**
	 *������� [1..1]
	 */
	private String CcAmt;
	/**
	 * ���� [1..1]
	 */
	private String Cy;
	/**
	 *�֣��ʣ�Ѻ��ͬ��Ч���� [1..1]
	 */
	private String CcValDate;
	/**
	 *�֣��ʣ�Ѻ��ͬ�������� [1..1]
	 */
	private String CcExpDate;
	/**
	 *��߶����־ [1..1]
	 */
	private String MaxGuar;
	/**
	 *�֣��ʣ�Ѻ��ͬ״̬ [1..1]
	 */
	private String CcStatus;

	public MotgaCltalBsInfSgmt() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * ��ȡ guarType
	 * 
	 * @return the guarType ��ͬ���� [1..1]
	 */
	public String getGuarType() {
		return GuarType;
	}

	/**
	 * ���� guarType
	 * 
	 * @param guarType
	 *            ��ͬ���� [1..1]
	 */
	public void setGuarType(String guarType) {
		GuarType = guarType;
	}

	/**
	 * ��ȡ ccAmt
	 * 
	 * @return the ccAmt ������� [1..1]
	 */
	public String getCcAmt() {
		return CcAmt;
	}

	/**
	 * ���� ccAmt
	 * 
	 * @param ccAmt
	 *            ������� [1..1]
	 */
	public void setCcAmt(String ccAmt) {
		CcAmt = ccAmt;
	}

	/**
	 * ��ȡ cy
	 * 
	 * @return the cy ���� [1..1]
	 */
	public String getCy() {
		return Cy;
	}

	/**
	 * ���� cy
	 * 
	 * @param cy
	 *            ���� [1..1]
	 */
	public void setCy(String cy) {
		Cy = cy;
	}

	/**
	 * ��ȡ ccValDate
	 * 
	 * @return the ccValDate �֣��ʣ�Ѻ��ͬ��Ч���� [1..1]
	 */
	public String getCcValDate() {
		return CcValDate;
	}

	/**
	 * ���� ccValDate
	 * 
	 * @param ccValDate
	 *            �֣��ʣ�Ѻ��ͬ��Ч���� [1..1]
	 */
	public void setCcValDate(String ccValDate) {
		CcValDate = ccValDate;
	}

	/**
	 * ��ȡ ccExpDate
	 * 
	 * @return the ccExpDate �֣��ʣ�Ѻ��ͬ�������� [1..1]
	 */
	public String getCcExpDate() {
		return CcExpDate;
	}

	/**
	 * ���� ccExpDate
	 * 
	 * @param ccExpDate
	 *            �֣��ʣ�Ѻ��ͬ�������� [1..1]
	 */
	public void setCcExpDate(String ccExpDate) {
		CcExpDate = ccExpDate;
	}

	/**
	 * ��ȡ maxGuar
	 * 
	 * @return the maxGuar ��߶����־ [1..1]
	 */
	public String getMaxGuar() {
		return MaxGuar;
	}

	/**
	 * ���� maxGuar
	 * 
	 * @param maxGuar
	 *            ��߶����־ [1..1]
	 */
	public void setMaxGuar(String maxGuar) {
		MaxGuar = maxGuar;
	}

	/**
	 * ��ȡ ccStatus
	 * 
	 * @return the ccStatus �֣��ʣ�Ѻ��ͬ״̬ [1..1]
	 */
	public String getCcStatus() {
		return CcStatus;
	}

	/**
	 * ���� ccStatus
	 * 
	 * @param ccStatus
	 *            �֣��ʣ�Ѻ��ͬ״̬ [1..1]
	 */
	public void setCcStatus(String ccStatus) {
		CcStatus = ccStatus;
	}

	@Override
	public String toString() {
		return "MotgaCltalBsInfSgmt [CcAmt=" + CcAmt + ", CcExpDate="
				+ CcExpDate + ", CcStatus=" + CcStatus + ", CcValDate="
				+ CcValDate + ", Cy=" + Cy + ", GuarType=" + GuarType
				+ ", MaxGuar=" + MaxGuar + "]";
	}

}
