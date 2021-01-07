/**  
 * Title: MotgaCltalCtrctInf.java<br\> 
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
 * Title: MotgaCltalCtrctInf<br/>
 * Description:�֣��ʣ�Ѻ��ͬ��Ϣ��¼Ԫ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "MotgaCltalCtrctBsSgmt", "MotgaCltalBsInfSgmt",
		"ComRecInfSgmt", "MotgaProptInfSgmt", "CltalInfSgmt" },namespace = "com.dhcc.xml.per.entity.motgacltalctrctinfo")
// ָ�����гɵ�xml�ڵ�˳��
public class MotgaCltalCtrctInf {

	/**
	 * ������ [1..1]
	 */
	private MotgaCltalCtrctBsSgmt MotgaCltalCtrctBsSgmt;
	/**
	 * ������Ϣ�� [1..1]
	 */
	private MotgaCltalBsInfSgmt MotgaCltalBsInfSgmt;
	/**
	 * ��ͬծ������Ϣ�� [0..1]
	 */
	private ComRecInfSgmt ComRecInfSgmt;
	/**
	 * ��Ѻ����Ϣ�� [0..1]
	 */
	private MotgaProptInfSgmt MotgaProptInfSgmt;
	/**
	 * ������Ϣ�� [0..1]
	 */
	private CltalInfSgmt CltalInfSgmt;

	public MotgaCltalCtrctInf() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * ��ȡ motgaCltalCtrctBsSgmt
	 * 
	 * @return the motgaCltalCtrctBsSgmt ������ [1..1]
	 */
	public MotgaCltalCtrctBsSgmt getMotgaCltalCtrctBsSgmt() {
		return MotgaCltalCtrctBsSgmt;
	}

	/**
	 * ���� motgaCltalCtrctBsSgmt
	 * 
	 * @param motgaCltalCtrctBsSgmt
	 *            ������ [1..1]
	 */
	public void setMotgaCltalCtrctBsSgmt(
			MotgaCltalCtrctBsSgmt motgaCltalCtrctBsSgmt) {
		MotgaCltalCtrctBsSgmt = motgaCltalCtrctBsSgmt;
	}

	/**
	 * ��ȡ motgaCltalBsInfSgmt
	 * 
	 * @return the motgaCltalBsInfSgmt ������Ϣ�� [1..1]
	 */
	public MotgaCltalBsInfSgmt getMotgaCltalBsInfSgmt() {
		return MotgaCltalBsInfSgmt;
	}

	/**
	 * ���� motgaCltalBsInfSgmt
	 * 
	 * @param motgaCltalBsInfSgmt
	 *            ������Ϣ�� [1..1]
	 */
	public void setMotgaCltalBsInfSgmt(MotgaCltalBsInfSgmt motgaCltalBsInfSgmt) {
		MotgaCltalBsInfSgmt = motgaCltalBsInfSgmt;
	}

	/**
	 * ��ȡ comRecInfSgmt
	 * 
	 * @return the comRecInfSgmt ��ͬծ������Ϣ�� [0..1]
	 */
	public ComRecInfSgmt getComRecInfSgmt() {
		return ComRecInfSgmt;
	}

	/**
	 * ���� comRecInfSgmt
	 * 
	 * @param comRecInfSgmt
	 *            ��ͬծ������Ϣ�� [0..1]
	 */
	public void setComRecInfSgmt(ComRecInfSgmt comRecInfSgmt) {
		ComRecInfSgmt = comRecInfSgmt;
	}

	/**
	 * ��ȡ motgaProptInfSgmt
	 * 
	 * @return the motgaProptInfSgmt ��Ѻ����Ϣ�� [0..1]
	 */
	public MotgaProptInfSgmt getMotgaProptInfSgmt() {
		return MotgaProptInfSgmt;
	}

	/**
	 * ���� motgaProptInfSgmt
	 * 
	 * @param motgaProptInfSgmt
	 *            ��Ѻ����Ϣ�� [0..1]
	 */
	public void setMotgaProptInfSgmt(MotgaProptInfSgmt motgaProptInfSgmt) {
		MotgaProptInfSgmt = motgaProptInfSgmt;
	}

	/**
	 * ��ȡ cltalInfSgmt
	 * 
	 * @return the cltalInfSgmt ������Ϣ�� [0..1]
	 */
	public CltalInfSgmt getCltalInfSgmt() {
		return CltalInfSgmt;
	}

	/**
	 * ���� cltalInfSgmt
	 * 
	 * @param cltalInfSgmt
	 *            ������Ϣ�� [0..1]
	 */
	public void setCltalInfSgmt(CltalInfSgmt cltalInfSgmt) {
		CltalInfSgmt = cltalInfSgmt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MotgaCltalCtrctInf [CltalInfSgmt=" + CltalInfSgmt
				+ ", ComRecInfSgmt=" + ComRecInfSgmt + ", MotgaCltalBsInfSgmt="
				+ MotgaCltalBsInfSgmt + ", MotgaCltalCtrctBsSgmt="
				+ MotgaCltalCtrctBsSgmt + ", MotgaProptInfSgmt="
				+ MotgaProptInfSgmt + "]";
	}

}
