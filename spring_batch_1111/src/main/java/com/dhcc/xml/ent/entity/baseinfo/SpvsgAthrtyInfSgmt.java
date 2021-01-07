package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: SpvsgAthrtyInfSgmt<br/>
 * Description: 上级机构段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月25日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "SupOrgType", "SupOrgName", "SupOrgCertType",
		"SupOrgCertNum", "SupOrgInfoUpDate" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class SpvsgAthrtyInfSgmt {
	/**
	 *上级机构类型[1..1]
	 */
	private String SupOrgType;
	/**
	 *上级机构名称[1..1]
	 */
	private String SupOrgName;
	/**
	 *上级机构身份标识类型[1..1]
	 */
	private String SupOrgCertType;
	/**
	 *上级机构身份标识码[1..1]
	 */
	private String SupOrgCertNum;
	/**
	 *信息更新日期[1..1]
	 */
	private String SupOrgInfoUpDate;

	public SpvsgAthrtyInfSgmt() {
		super();
	}

	/**
	 * 获取 supOrgType
	 * 
	 * @return the supOrgType 上级机构类型[1..1]
	 */
	public String getSupOrgType() {
		return SupOrgType;
	}

	/**
	 * 设置 supOrgType
	 * 
	 * @param supOrgType
	 *            上级机构类型[1..1]
	 */
	public void setSupOrgType(String supOrgType) {
		SupOrgType = supOrgType;
	}

	/**
	 * 获取 supOrgName
	 * 
	 * @return the supOrgName 上级机构名称[1..1]
	 */
	public String getSupOrgName() {
		return SupOrgName;
	}

	/**
	 * 设置 supOrgName
	 * 
	 * @param supOrgName
	 *            上级机构名称[1..1]
	 */
	public void setSupOrgName(String supOrgName) {
		SupOrgName = supOrgName;
	}

	/**
	 * 获取 supOrgCertType
	 * 
	 * @return the supOrgCertType 上级机构身份标识类型[1..1]
	 */
	public String getSupOrgCertType() {
		return SupOrgCertType;
	}

	/**
	 * 设置 supOrgCertType
	 * 
	 * @param supOrgCertType
	 *            上级机构身份标识类型[1..1]
	 */
	public void setSupOrgCertType(String supOrgCertType) {
		SupOrgCertType = supOrgCertType;
	}

	/**
	 * 获取 supOrgCertNum
	 * 
	 * @return the supOrgCertNum 上级机构身份标识码[1..1]
	 */
	public String getSupOrgCertNum() {
		return SupOrgCertNum;
	}

	/**
	 * 设置 supOrgCertNum
	 * 
	 * @param supOrgCertNum
	 *            上级机构身份标识码[1..1]
	 */
	public void setSupOrgCertNum(String supOrgCertNum) {
		SupOrgCertNum = supOrgCertNum;
	}

	/**
	 * 获取 supOrgInfoUpDate
	 * 
	 * @return the supOrgInfoUpDate 信息更新日期[1..1]
	 */
	public String getSupOrgInfoUpDate() {
		return SupOrgInfoUpDate;
	}

	/**
	 * 设置 supOrgInfoUpDate
	 * 
	 * @param supOrgInfoUpDate
	 *            信息更新日期[1..1]
	 */
	public void setSupOrgInfoUpDate(String supOrgInfoUpDate) {
		SupOrgInfoUpDate = supOrgInfoUpDate;
	}

	@Override
	public String toString() {
		return "SpvsgAthrtyInfSgmt [SupOrgType=" + SupOrgType + ", SupOrgName="
				+ SupOrgName + ", SupOrgCertType=" + SupOrgCertType
				+ ", SupOrgCertNum=" + SupOrgCertNum + ", SupOrgInfoUpDate="
				+ SupOrgInfoUpDate + "]";
	}

}
