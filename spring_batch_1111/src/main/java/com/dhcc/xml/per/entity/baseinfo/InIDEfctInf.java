package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InIDEfctInf<br/>
 * Description: 个人证件有效期信息记录-130<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfRecType", "Name", "IDType", "IDNum", "InfSurcCode",
		"IDEfctDate", "IDDueDate", "IDOrgName", "IDDist", "Cimoc", "RptDate" },namespace = "com.dhcc.xml.per.entity.baseinfo")
public class InIDEfctInf {
	/** 信息记录类型 [1..1] */
	private String InfRecType;
	/** 姓名 [1..1] */
	private String Name;
	/** 证件类型 [1..1] */
	private String IDType;
	/** 证件号码 [1..1] */
	private String IDNum;
	/** 信息来源编码 [1..1] */
	private String InfSurcCode;
	/** 证件有效期起始日期 [1..1] */
	private String IDEfctDate;
	/** 证件有效期终止日期 [1..1] */
	private String IDDueDate;
	/** 证件签发机关名称 [1..1] */
	private String IDOrgName;
	/** 证件签发机关所在地行政区划 [1..1] */
	private String IDDist;
	/** 客户资料维护机构代码 [1..1] */
	private String Cimoc;
	/** 信息报告日期 [1..1] */
	private String RptDate;

	public InIDEfctInf() {
		super();
	}

	/**
	 * 获取 infRecType
	 * 
	 * @return the infRecType 信息记录类型 [1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * 设置 infRecType
	 * 
	 * @param infRecType
	 *            信息记录类型 [1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * 获取 name
	 * 
	 * @return the name 姓名 [1..1]
	 */
	public String getName() {
		return Name;
	}

	/**
	 * 设置 name
	 * 
	 * @param name
	 *            姓名 [1..1]
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * 获取 iDType
	 * 
	 * @return the iDType 证件类型 [1..1]
	 */
	public String getIDType() {
		return IDType;
	}

	/**
	 * 设置 iDType
	 * 
	 * @param iDType
	 *            证件类型 [1..1]
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}

	/**
	 * 获取 iDNum
	 * 
	 * @return the iDNum 证件号码 [1..1]
	 */
	public String getIDNum() {
		return IDNum;
	}

	/**
	 * 设置 iDNum
	 * 
	 * @param iDNum
	 *            证件号码 [1..1]
	 */
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}

	/**
	 * 获取 infSurcCode
	 * 
	 * @return the infSurcCode 信息来源编码 [1..1]
	 */
	public String getInfSurcCode() {
		return InfSurcCode;
	}

	/**
	 * 设置 infSurcCode
	 * 
	 * @param infSurcCode
	 *            信息来源编码 [1..1]
	 */
	public void setInfSurcCode(String infSurcCode) {
		InfSurcCode = infSurcCode;
	}

	/**
	 * 获取 iDEfctDate
	 * 
	 * @return the iDEfctDate 证件有效期起始日期 [1..1]
	 */
	public String getIDEfctDate() {
		return IDEfctDate;
	}

	/**
	 * 设置 iDEfctDate
	 * 
	 * @param iDEfctDate
	 *            证件有效期起始日期 [1..1]
	 */
	public void setIDEfctDate(String iDEfctDate) {
		IDEfctDate = iDEfctDate;
	}

	/**
	 * 获取 iDDueDate
	 * 
	 * @return the iDDueDate 证件有效期终止日期 [1..1]
	 */
	public String getIDDueDate() {
		return IDDueDate;
	}

	/**
	 * 设置 iDDueDate
	 * 
	 * @param iDDueDate
	 *            证件有效期终止日期 [1..1]
	 */
	public void setIDDueDate(String iDDueDate) {
		IDDueDate = iDDueDate;
	}

	/**
	 * 获取 iDOrgName
	 * 
	 * @return the iDOrgName 证件签发机关名称 [1..1]
	 */
	public String getIDOrgName() {
		return IDOrgName;
	}

	/**
	 * 设置 iDOrgName
	 * 
	 * @param iDOrgName
	 *            证件签发机关名称 [1..1]
	 */
	public void setIDOrgName(String iDOrgName) {
		IDOrgName = iDOrgName;
	}

	/**
	 * 获取 iDDist
	 * 
	 * @return the iDDist 证件签发机关所在地行政区划 [1..1]
	 */
	public String getIDDist() {
		return IDDist;
	}

	/**
	 * 设置 iDDist
	 * 
	 * @param iDDist
	 *            证件签发机关所在地行政区划 [1..1]
	 */
	public void setIDDist(String iDDist) {
		IDDist = iDDist;
	}

	/**
	 * 获取 cimoc
	 * 
	 * @return the cimoc 客户资料维护机构代码 [1..1]
	 */
	public String getCimoc() {
		return Cimoc;
	}

	/**
	 * 设置 cimoc
	 * 
	 * @param cimoc
	 *            客户资料维护机构代码 [1..1]
	 */
	public void setCimoc(String cimoc) {
		Cimoc = cimoc;
	}

	/**
	 * 获取 rptDate
	 * 
	 * @return the rptDate 信息报告日期 [1..1]
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * 设置 rptDate
	 * 
	 * @param rptDate
	 *            信息报告日期 [1..1]
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	@Override
	public String toString() {
		return "InIDEfctInf [InfRecType=" + InfRecType + ", Name=" + Name
				+ ", IDType=" + IDType + ", IDNum=" + IDNum + ", InfSurcCode="
				+ InfSurcCode + ", IDEfctDate=" + IDEfctDate + ", IDDueDate="
				+ IDDueDate + ", IDOrgName=" + IDOrgName + ", IDDist=" + IDDist
				+ ", Cimoc=" + Cimoc + ", RptDate=" + RptDate + "]";
	}

}
