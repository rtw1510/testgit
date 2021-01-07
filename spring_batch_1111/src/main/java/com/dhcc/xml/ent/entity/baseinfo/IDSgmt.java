package com.dhcc.xml.ent.entity.baseinfo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: IDSgmt<br/>
 * Description:������ʶ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��25��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "IDNm", "IDRec", "IDInfoUpDate" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class IDSgmt {
	/**
	 *������ʶ����[1..1]
	 */
	private String IDNm;
	/**
	 *������ʶ��Ϣ[1..99]
	 */
	private List<com.dhcc.xml.ent.entity.baseinfo.IDRec> IDRec;
	/**
	 *��Ϣ��������[1..1]
	 */
	private String IDInfoUpDate;

	public IDSgmt() {
		super();
	}

	/**
	 * ��ȡ iDNm
	 * 
	 * @return the iDNm ������ʶ����[1..1]
	 */
	public String getIDNm() {
		return IDNm;
	}

	/**
	 * ���� iDNm
	 * 
	 * @param iDNm
	 *            ������ʶ����[1..1]
	 */
	public void setIDNm(String iDNm) {
		IDNm = iDNm;
	}

	/**
	 * ��ȡ iDRec
	 * 
	 * @return the iDRec ������ʶ��Ϣ[1..99]
	 */
	public List<com.dhcc.xml.ent.entity.baseinfo.IDRec> getIDRec() {
		return IDRec;
	}

	/**
	 * ���� iDRec
	 * 
	 * @param iDRec
	 *            ������ʶ��Ϣ[1..99]
	 */
	public void setIDRec(List<com.dhcc.xml.ent.entity.baseinfo.IDRec> iDRec) {
		IDRec = iDRec;
	}

	/**
	 * ��ȡ iDInfoUpDate
	 * 
	 * @return the iDInfoUpDate ��Ϣ��������[1..1]
	 */
	public String getIDInfoUpDate() {
		return IDInfoUpDate;
	}

	/**
	 * ���� iDInfoUpDate
	 * 
	 * @param iDInfoUpDate
	 *            ��Ϣ��������[1..1]
	 */
	public void setIDInfoUpDate(String iDInfoUpDate) {
		IDInfoUpDate = iDInfoUpDate;
	}

	@Override
	public String toString() {
		return "IDSgmt [IDNm=" + IDNm + ", IDRec=" + IDRec + ", IDInfoUpDate="
				+ IDInfoUpDate + "]";
	}

}
