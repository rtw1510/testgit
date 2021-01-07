/**  
 * Title: ImpInf.java<br\> 
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
 * Title: ImpInf<br/>
 * Description: <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "ImpType", "ImpVal", "ImpCy", "Ippc", "PawnName", "PawnCertType",
		"PawnCertNum" },namespace = "com.dhcc.xml.per.entity.motgacltalctrctinfo")
// ָ�����гɵ�xml�ڵ�˳��
public class ImpInf {
	/**
	 *�������� [1..1]
	 */
	private String ImpType;
	/**
	 *�����ֵ [1..1]
	 */
	private String ImpVal;
	/**
	 *���� [1..1]
	 */
	private String ImpCy;
	/**
	 *���������� [1..1]
	 */
	private String Ippc;
	/**
	 *���������� [1..1]
	 */
	private String PawnName;
	/**
	 *��������ݱ�ʶ���� [1..1]
	 */
	private String PawnCertType;
	/**
	 *��������ݱ�ʶ���� [1..1]
	 */
	private String PawnCertNum;

	public ImpInf() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * ��ȡ impCy
	 * 
	 * @return the impCy ���� [1..1]
	 */
	public String getImpCy() {
		return ImpCy;
	}

	/**
	 * ���� impCy
	 * 
	 * @param impCy
	 *            ���� [1..1]
	 */
	public void setImpCy(String impCy) {
		ImpCy = impCy;
	}

	/**
	 * ��ȡ impType
	 * 
	 * @return the impType �������� [1..1]
	 */
	public String getImpType() {
		return ImpType;
	}

	/**
	 * ���� impType
	 * 
	 * @param impType
	 *            �������� [1..1]
	 */
	public void setImpType(String impType) {
		ImpType = impType;
	}

	/**
	 * ��ȡ impVal
	 * 
	 * @return the impVal �����ֵ [1..1]
	 */
	public String getImpVal() {
		return ImpVal;
	}

	/**
	 * ���� impVal
	 * 
	 * @param impVal
	 *            �����ֵ [1..1]
	 */
	public void setImpVal(String impVal) {
		ImpVal = impVal;
	}

	/**
	 * ��ȡ ippc
	 * 
	 * @return the ippc ���������� [1..1]
	 */
	public String getIppc() {
		return Ippc;
	}

	/**
	 * ���� ippc
	 * 
	 * @param ippc
	 *            ���������� [1..1]
	 */
	public void setIppc(String ippc) {
		Ippc = ippc;
	}

	/**
	 * ��ȡ pawnName
	 * 
	 * @return the pawnName ���������� [1..1]
	 */
	public String getPawnName() {
		return PawnName;
	}

	/**
	 * ���� pawnName
	 * 
	 * @param pawnName
	 *            ���������� [1..1]
	 */
	public void setPawnName(String pawnName) {
		PawnName = pawnName;
	}

	/**
	 * ��ȡ pawnCertType
	 * 
	 * @return the pawnCertType ��������ݱ�ʶ���� [1..1]
	 */
	public String getPawnCertType() {
		return PawnCertType;
	}

	/**
	 * ���� pawnCertType
	 * 
	 * @param pawnCertType
	 *            ��������ݱ�ʶ���� [1..1]
	 */
	public void setPawnCertType(String pawnCertType) {
		PawnCertType = pawnCertType;
	}

	/**
	 * ��ȡ pawnCertNum
	 * 
	 * @return the pawnCertNum ��������ݱ�ʶ���� [1..1]
	 */
	public String getPawnCertNum() {
		return PawnCertNum;
	}

	/**
	 * ���� pawnCertNum
	 * 
	 * @param pawnCertNum
	 *            ��������ݱ�ʶ���� [1..1]
	 */
	public void setPawnCertNum(String pawnCertNum) {
		PawnCertNum = pawnCertNum;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ImpInf [ImpCy=" + ImpCy + ", ImpType=" + ImpType + ", ImpVal="
				+ ImpVal + ", Ippc=" + Ippc + ", PawnCertNum=" + PawnCertNum
				+ ", PawnCertType=" + PawnCertType + ", PawnName=" + PawnName
				+ "]";
	}
}
