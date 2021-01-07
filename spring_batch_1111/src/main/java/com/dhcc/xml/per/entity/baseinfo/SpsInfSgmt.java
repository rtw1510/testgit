package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: SpsInfSgmt<br/>
 * Description: ���˻�����Ϣ��¼-������Ϣ��Ԫ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "MariStatus", "SpoName", "SpoIDType", "SpoIDNum",
		"SpoTel", "SpsCmpyNm", "SpsInfoUpDate" },namespace = "com.dhcc.xml.per.entity.baseinfo")
public class SpsInfSgmt{
	/** ����״��[1..1] */
	private String MariStatus;
	/** ��ż����[0..1] */
	private String SpoName;
	/** ��ż֤������[0..1] */
	private String SpoIDType;
	/** ��ż֤������[0..1] */
	private String SpoIDNum;
	/** ��ż��ϵ�绰[0..1] */
	private String SpoTel;
	/** ��ż������λ[0..1] */
	private String SpsCmpyNm;
	/** ��Ϣ��������[1..1] */
	private String SpsInfoUpDate;

	public SpsInfSgmt() {
		super();
	}

	/**
	 * ��ȡ mariStatus
	 * 
	 * @return the mariStatus ����״��[1..1]
	 */
	public String getMariStatus() {
		return MariStatus;
	}

	/**
	 * ���� mariStatus
	 * 
	 * @param mariStatus
	 *            ����״��[1..1]
	 */
	public void setMariStatus(String mariStatus) {
		MariStatus = mariStatus;
	}

	/**
	 * ��ȡ spoName
	 * 
	 * @return the spoName ��ż����[0..1]
	 */
	public String getSpoName() {
		return SpoName;
	}

	/**
	 * ���� spoName
	 * 
	 * @param spoName
	 *            ��ż����[0..1]
	 */
	public void setSpoName(String spoName) {
		SpoName = spoName;
	}

	/**
	 * ��ȡ spoIDType
	 * 
	 * @return the spoIDType ��ż֤������[0..1]
	 */
	public String getSpoIDType() {
		return SpoIDType;
	}

	/**
	 * ���� spoIDType
	 * 
	 * @param spoIDType
	 *            ��ż֤������[0..1]
	 */
	public void setSpoIDType(String spoIDType) {
		SpoIDType = spoIDType;
	}

	/**
	 * ��ȡ spoIDNum
	 * 
	 * @return the spoIDNum ��ż֤������[0..1]
	 */
	public String getSpoIDNum() {
		return SpoIDNum;
	}

	/**
	 * ���� spoIDNum
	 * 
	 * @param spoIDNum
	 *            ��ż֤������[0..1]
	 */
	public void setSpoIDNum(String spoIDNum) {
		SpoIDNum = spoIDNum;
	}

	/**
	 * ��ȡ spoTel
	 * 
	 * @return the spoTel ��ż��ϵ�绰[0..1]
	 */
	public String getSpoTel() {
		return SpoTel;
	}

	/**
	 * ���� spoTel
	 * 
	 * @param spoTel
	 *            ��ż��ϵ�绰[0..1]
	 */
	public void setSpoTel(String spoTel) {
		SpoTel = spoTel;
	}

	/**
	 * ��ȡ spsCmpyNm
	 * 
	 * @return the spsCmpyNm ��ż������λ[0..1]
	 */
	public String getSpsCmpyNm() {
		return SpsCmpyNm;
	}

	/**
	 * ���� spsCmpyNm
	 * 
	 * @param spsCmpyNm
	 *            ��ż������λ[0..1]
	 */
	public void setSpsCmpyNm(String spsCmpyNm) {
		SpsCmpyNm = spsCmpyNm;
	}

	/**
	 * ��ȡ spsInfoUpDate
	 * 
	 * @return the spsInfoUpDate ��Ϣ��������[1..1]
	 */
	public String getSpsInfoUpDate() {
		return SpsInfoUpDate;
	}

	/**
	 * ���� spsInfoUpDate
	 * 
	 * @param spsInfoUpDate
	 *            ��Ϣ��������[1..1]
	 */
	public void setSpsInfoUpDate(String spsInfoUpDate) {
		SpsInfoUpDate = spsInfoUpDate;
	}

	@Override
	public String toString() {
		return "SpsInfSgmt [MariStatus=" + MariStatus + ", SpoName=" + SpoName
				+ ", SpoIDType=" + SpoIDType + ", SpoIDNum=" + SpoIDNum
				+ ", SpoTel=" + SpoTel + ", SpsCmpyNm=" + SpsCmpyNm
				+ ", SpsInfoUpDate=" + SpsInfoUpDate + "]";
	}

}
