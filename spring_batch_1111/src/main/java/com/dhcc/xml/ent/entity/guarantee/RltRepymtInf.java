package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: RltRepymtInf<br/>
 * Description:��ҵ�����˻���¼����������������ϢԪ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfoIDType", "ArlpName", "ArlpCertType", "ArlpCertNum",
		"ArlpType", "ArlpAmt","WartySign","MaxGuarMcc" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class RltRepymtInf {
	/**
	 *������[1..1]
	 */
	private String InfoIDType;
	/**
	 *��ػ�������������[1..1]
	 */
	private String ArlpName;
	/**
	 *��ػ�����������ݱ�ʶ����[1..1]
	 */
	private String ArlpCertType;
	/**
	 *��ػ�����������ݱ�ʶ����[1..1]
	 */
	private String ArlpCertNum;
	/**
	 *��������������[1..1]
	 */
	private String ArlpType;
	/**
	 *�������ν��[1..1]
	 */
	private String ArlpAmt;
	/**������־*/  
	private String WartySign;
	/**��֤��ͬ���*/  
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
	 * @return the arlpName ��ػ�������������[1..1]
	 */
	public String getArlpName() {
		return ArlpName;
	}

	/**
	 * ���� arlpName
	 * 
	 * @param arlpName
	 *            ��ػ�������������[1..1]
	 */
	public void setArlpName(String arlpName) {
		ArlpName = arlpName;
	}

	/**
	 * ��ȡ arlpCertType
	 * 
	 * @return the arlpCertType ��ػ�����������ݱ�ʶ����[1..1]
	 */
	public String getArlpCertType() {
		return ArlpCertType;
	}

	/**
	 * ���� arlpCertType
	 * 
	 * @param arlpCertType
	 *            ��ػ�����������ݱ�ʶ����[1..1]
	 */
	public void setArlpCertType(String arlpCertType) {
		ArlpCertType = arlpCertType;
	}

	/**
	 * ��ȡ arlpCertNum
	 * 
	 * @return the arlpCertNum ��ػ�����������ݱ�ʶ����[1..1]
	 */
	public String getArlpCertNum() {
		return ArlpCertNum;
	}

	/**
	 * ���� arlpCertNum
	 * 
	 * @param arlpCertNum
	 *            ��ػ�����������ݱ�ʶ����[1..1]
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
	 * @return the wartySign ������־ 
	 */
	public String getWartySign() {
		return WartySign;
	}

	/**  
	 * ���� wartySign  
	 * @param wartySign ������־  
	 */
	public void setWartySign(String wartySign) {
		WartySign = wartySign;
	}

	/**  
	 * ��ȡ maxGuarMcc
	 * @return the maxGuarMcc ��֤��ͬ��� 
	 */
	public String getMaxGuarMcc() {
		return MaxGuarMcc;
	}

	/**  
	 * ���� maxGuarMcc  
	 * @param maxGuarMcc ��֤��ͬ���  
	 */
	public void setMaxGuarMcc(String maxGuarMcc) {
		MaxGuarMcc = maxGuarMcc;
	}
}
