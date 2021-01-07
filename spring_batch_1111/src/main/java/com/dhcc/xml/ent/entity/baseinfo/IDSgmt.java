package com.dhcc.xml.ent.entity.baseinfo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: IDSgmt<br/>
 * Description:其他标识段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月25日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "IDNm", "IDRec", "IDInfoUpDate" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class IDSgmt {
	/**
	 *其他标识个数[1..1]
	 */
	private String IDNm;
	/**
	 *其他标识信息[1..99]
	 */
	private List<com.dhcc.xml.ent.entity.baseinfo.IDRec> IDRec;
	/**
	 *信息更新日期[1..1]
	 */
	private String IDInfoUpDate;

	public IDSgmt() {
		super();
	}

	/**
	 * 获取 iDNm
	 * 
	 * @return the iDNm 其他标识个数[1..1]
	 */
	public String getIDNm() {
		return IDNm;
	}

	/**
	 * 设置 iDNm
	 * 
	 * @param iDNm
	 *            其他标识个数[1..1]
	 */
	public void setIDNm(String iDNm) {
		IDNm = iDNm;
	}

	/**
	 * 获取 iDRec
	 * 
	 * @return the iDRec 其他标识信息[1..99]
	 */
	public List<com.dhcc.xml.ent.entity.baseinfo.IDRec> getIDRec() {
		return IDRec;
	}

	/**
	 * 设置 iDRec
	 * 
	 * @param iDRec
	 *            其他标识信息[1..99]
	 */
	public void setIDRec(List<com.dhcc.xml.ent.entity.baseinfo.IDRec> iDRec) {
		IDRec = iDRec;
	}

	/**
	 * 获取 iDInfoUpDate
	 * 
	 * @return the iDInfoUpDate 信息更新日期[1..1]
	 */
	public String getIDInfoUpDate() {
		return IDInfoUpDate;
	}

	/**
	 * 设置 iDInfoUpDate
	 * 
	 * @param iDInfoUpDate
	 *            信息更新日期[1..1]
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
