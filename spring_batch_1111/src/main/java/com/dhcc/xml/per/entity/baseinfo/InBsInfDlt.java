package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InBsInfDlt<br/>
 * Description:个人基本信息整笔删除请求记录-114 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfRecType", "Name", "IDType", "IDNum", "InfSurcCode" },namespace = "com.dhcc.xml.per.entity.baseinfo")
public class InBsInfDlt {
	/** 信息记录类型[1..1] */
	private String InfRecType;
	/** 姓名[1..1] */
	private String Name;
	/** 证件类型[1..1] */
	private String IDType;
	/** 证件号码[1..1] */
	private String IDNum;
	/** 信息来源编码[1..1] */
	private String InfSurcCode;

	public InBsInfDlt() {
		super();
	}

	/**
	 * 获取 infRecType
	 * 
	 * @return the infRecType 信息记录类型[1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * 设置 infRecType
	 * 
	 * @param infRecType
	 *            信息记录类型[1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * 获取 name
	 * 
	 * @return the name 姓名[1..1]
	 */
	public String getName() {
		return Name;
	}

	/**
	 * 设置 name
	 * 
	 * @param name
	 *            姓名[1..1]
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * 获取 iDType
	 * 
	 * @return the iDType 证件类型[1..1]
	 */
	public String getIDType() {
		return IDType;
	}

	/**
	 * 设置 iDType
	 * 
	 * @param iDType
	 *            证件类型[1..1]
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}

	/**
	 * 获取 iDNum
	 * 
	 * @return the iDNum 证件号码[1..1]
	 */
	public String getIDNum() {
		return IDNum;
	}

	/**
	 * 设置 iDNum
	 * 
	 * @param iDNum
	 *            证件号码[1..1]
	 */
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}

	/**
	 * 获取 infSurcCode
	 * 
	 * @return the infSurcCode 信息来源编码[1..1]
	 */
	public String getInfSurcCode() {
		return InfSurcCode;
	}

	/**
	 * 设置 infSurcCode
	 * 
	 * @param infSurcCode
	 *            信息来源编码[1..1]
	 */
	public void setInfSurcCode(String infSurcCode) {
		InfSurcCode = infSurcCode;
	}

	@Override
	public String toString() {
		return "InBsInfDlt [InfRecType=" + InfRecType + ", Name=" + Name
				+ ", IDType=" + IDType + ", IDNum=" + IDNum + ", InfSurcCode="
				+ InfSurcCode + "]";
	}
}
