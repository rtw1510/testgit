package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "ResiStatus", "ResiAddr", "ResiPc", "ResiDist",
		"HomeTel", "ResiInfoUpDate" },namespace = "com.dhcc.xml.per.entity.baseinfo")
public class RedncInfSgmt{
	/** ��ס״��[1..1] */
	private String ResiStatus;
	/** ��ס����ϸ��ַ[1..1] */
	private String ResiAddr;
	/** ��ס���ʱ�[1..1] */
	private String ResiPc;
	/** ��ס����������[1..1] */
	private String ResiDist;
	/** סլ�绰[1..1] */
	private String HomeTel;
	/** ��Ϣ��������[1..1] */
	private String ResiInfoUpDate;

	public RedncInfSgmt() {
		super();
	}

	/**
	 * ��ȡ resiStatus
	 * 
	 * @return the resiStatus ��ס״��[1..1]
	 */
	public String getResiStatus() {
		return ResiStatus;
	}

	/**
	 * ���� resiStatus
	 * 
	 * @param resiStatus
	 *            ��ס״��[1..1]
	 */
	public void setResiStatus(String resiStatus) {
		ResiStatus = resiStatus;
	}

	/**
	 * ��ȡ resiAddr
	 * 
	 * @return the resiAddr ��ס����ϸ��ַ[1..1]
	 */
	public String getResiAddr() {
		return ResiAddr;
	}

	/**
	 * ���� resiAddr
	 * 
	 * @param resiAddr
	 *            ��ס����ϸ��ַ[1..1]
	 */
	public void setResiAddr(String resiAddr) {
		ResiAddr = resiAddr;
	}

	/**
	 * ��ȡ resiPc
	 * 
	 * @return the resiPc ��ס���ʱ�[1..1]
	 */
	public String getResiPc() {
		return ResiPc;
	}

	/**
	 * ���� resiPc
	 * 
	 * @param resiPc
	 *            ��ס���ʱ�[1..1]
	 */
	public void setResiPc(String resiPc) {
		ResiPc = resiPc;
	}

	/**
	 * ��ȡ resiDist
	 * 
	 * @return the resiDist ��ס����������[1..1]
	 */
	public String getResiDist() {
		return ResiDist;
	}

	/**
	 * ���� resiDist
	 * 
	 * @param resiDist
	 *            ��ס����������[1..1]
	 */
	public void setResiDist(String resiDist) {
		ResiDist = resiDist;
	}

	/**
	 * ��ȡ homeTel
	 * 
	 * @return the homeTel סլ�绰[1..1]
	 */
	public String getHomeTel() {
		return HomeTel;
	}

	/**
	 * ���� homeTel
	 * 
	 * @param homeTel
	 *            סլ�绰[1..1]
	 */
	public void setHomeTel(String homeTel) {
		HomeTel = homeTel;
	}

	/**
	 * ��ȡ resiInfoUpDate
	 * 
	 * @return the resiInfoUpDate ��Ϣ��������[1..1]
	 */
	public String getResiInfoUpDate() {
		return ResiInfoUpDate;
	}

	/**
	 * ���� resiInfoUpDate
	 * 
	 * @param resiInfoUpDate
	 *            ��Ϣ��������[1..1]
	 */
	public void setResiInfoUpDate(String resiInfoUpDate) {
		ResiInfoUpDate = resiInfoUpDate;
	}

	@Override
	public String toString() {
		return "RedncInfSgmt [ResiStatus=" + ResiStatus + ", ResiAddr="
				+ ResiAddr + ", ResiPc=" + ResiPc + ", ResiDist=" + ResiDist
				+ ", HomeTel=" + HomeTel + ", ResiInfoUpDate=" + ResiInfoUpDate
				+ "]";
	}
}
