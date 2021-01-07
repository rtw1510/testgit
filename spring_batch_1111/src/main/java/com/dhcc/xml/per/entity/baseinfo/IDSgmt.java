package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Title: IDSgmt<br/>
 * Description:������ʶ�� [0..1] <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "IDNm", "IDRec", "IDInfoUpDate" },namespace = "com.dhcc.xml.per.entity.baseinfo")
public class IDSgmt {
	/**
	 * ������ʶ���� [1..1]
	 */
	private String IDNm;
	/**
	 * ������֤����Ϣ [1..9]
	 */
	private List<IDRec> IDRec;
	/**
	 * ��Ϣ�������� [1..1]
	 */
	private String IDInfoUpDate;

	public IDSgmt() {
		super();
	}

	/**
	 * ��ȡ iDNm
	 * 
	 * @return the iDNm ������ʶ���� [1..1]
	 */
	public String getIDNm() {
		return IDNm;
	}

	/**
	 * ���� iDNm
	 * 
	 * @param iDNm
	 *            ������ʶ���� [1..1]
	 */
	public void setIDNm(String iDNm) {
		IDNm = iDNm;
	}

	/**
	 * ��ȡ iDRec
	 * 
	 * @return the iDRec ������֤����Ϣ [1..9]
	 */
	public List<IDRec> getIDRec() {
		return IDRec;
	}

	/**
	 * ���� iDRec
	 * 
	 * @param iDRec
	 *            ������֤����Ϣ [1..9]
	 */
	public void setIDRec(List<IDRec> iDRec) {
		IDRec = iDRec;
	}

	/**
	 * ��ȡ infoUpDate
	 * 
	 * @return the infoUpDate ��Ϣ�������� [1..1]
	 */
	public String getIDInfoUpDate() {
		return IDInfoUpDate;
	}

	public void setIDInfoUpDate(String iDInfoUpDate) {
		IDInfoUpDate = iDInfoUpDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IDSgmt [IDNm=" + IDNm + ", IDRec=" + IDRec + ", InfoUpDate="
				+ IDInfoUpDate + "]";
	}

	
}
