package com.dhcc.xml.per.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: RltRepymtInf<br/>
 * Description: ���˵����˻���¼����������������Ϣ<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��28��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "InfoIDType", "ArlpName", "ArlpCertType", "ArlpCertNum",
		"ArlpType","ArlpAmt","WartySign","MaxGuarMcc" },namespace = "com.dhcc.xml.per.entity.guarantee")
// ָ�����гɵ�xml�ڵ�˳��
public class RltRepymtInf {
	/** ������[1..1] */
	private String InfoIDType;
	/** ����������[1..1] */
	private String ArlpName;
	/** ��������ݱ�ʶ����[1..1] */
	private String ArlpCertType;
	/** ��������ݱ�ʶ����[1..1] */
	private String ArlpCertNum;
	/** ��������������[1..1] */
	private String ArlpType;
	/** �������ν��[1..1] */
	private String ArlpAmt;
	/** ������־[1..1]*/  
	private String WartySign;
	/** ��֤��ͬ���[1..1]*/  
	private String MaxGuarMcc;

	public RltRepymtInf() {
		super();
	}

	/**
	 * ��ȡ infoIDType
	 * 
	 * @return the infoIDType ������[1..1]
	 */
	public String getInfoIDType() {
		return InfoIDType;
	}

	/**
	 * ���� infoIDType
	 * 
	 * @param infoIDType
	 *            ������[1..1]
	 */
	public void setInfoIDType(String infoIDType) {
		InfoIDType = infoIDType;
	}

	/**
	 * ��ȡ arlpName
	 * 
	 * @return the arlpName ����������[1..1]
	 */
	public String getArlpName() {
		return ArlpName;
	}

	/**
	 * ���� arlpName
	 * 
	 * @param arlpName
	 *            ����������[1..1]
	 */
	public void setArlpName(String arlpName) {
		ArlpName = arlpName;
	}

	/**
	 * ��ȡ arlpCertType
	 * 
	 * @return the arlpCertType ��������ݱ�ʶ����[1..1]
	 */
	public String getArlpCertType() {
		return ArlpCertType;
	}

	/**
	 * ���� arlpCertType
	 * 
	 * @param arlpCertType
	 *            ��������ݱ�ʶ����[1..1]
	 */
	public void setArlpCertType(String arlpCertType) {
		ArlpCertType = arlpCertType;
	}

	/**
	 * ��ȡ arlpCertNum
	 * 
	 * @return the arlpCertNum ��������ݱ�ʶ����[1..1]
	 */
	public String getArlpCertNum() {
		return ArlpCertNum;
	}

	/**
	 * ���� arlpCertNum
	 * 
	 * @param arlpCertNum
	 *            ��������ݱ�ʶ����[1..1]
	 */
	public void setArlpCertNum(String arlpCertNum) {
		ArlpCertNum = arlpCertNum;
	}

	/**
	 * ��ȡ arlpType
	 * 
	 * @return the arlpType ��������������[1..1]
	 */
	public String getArlpType() {
		return ArlpType;
	}

	/**
	 * ���� arlpType
	 * 
	 * @param arlpType
	 *            ��������������[1..1]
	 */
	public void setArlpType(String arlpType) {
		ArlpType = arlpType;
	}

	/**
	 * ��ȡ arlpAmt
	 * 
	 * @return the arlpAmt �������ν��[1..1]
	 */
	public String getArlpAmt() {
		return ArlpAmt;
	}

	/**
	 * ���� arlpAmt
	 * 
	 * @param arlpAmt
	 *            �������ν��[1..1]
	 */
	public void setArlpAmt(String arlpAmt) {
		ArlpAmt = arlpAmt;
	}

	/**  
	 * ��ȡ wartySign
	 * @return the wartySign ������־[1..1] 
	 */
	public String getWartySign() {
		return WartySign;
	}

	/**  
	 * ���� wartySign  
	 * @param wartySign ������־[1..1]  
	 */
	public void setWartySign(String wartySign) {
		WartySign = wartySign;
	}

	/**  
	 * ��ȡ maxGuarMcc
	 * @return the maxGuarMcc ��֤��ͬ���[1..1] 
	 */
	public String getMaxGuarMcc() {
		return MaxGuarMcc;
	}

	/**  
	 * ���� maxGuarMcc  
	 * @param maxGuarMcc ��֤��ͬ���[1..1]  
	 */
	public void setMaxGuarMcc(String maxGuarMcc) {
		MaxGuarMcc = maxGuarMcc;
	}
}
