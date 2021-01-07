package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InCtfItgInf<br/>
 * Description: 个人证件整合信息记录-140 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfRecType", "Name", "IDType", "IDNum", "OthName",
		"OthIDType", "OthIDNum", "OthAssFlg", "InfSurcCode", "RptDate" },namespace = "com.dhcc.xml.per.entity.baseinfo")
public class InCtfItgInf {
	/** 信息记录类型 [1..1] */
	private String InfRecType;
	/** 姓名 [1..1] */
	private String Name;
	/** 证件类型 [1..1] */
	private String IDType;
	/** 证件号码 [1..1] */
	private String IDNum;
	/** 其他姓名 [1..1] */
	private String OthName;
	/** 其他证件类型 [1..1] */
	private String OthIDType;
	/** 其他证件号码 [1..1] */
	private String OthIDNum;
	/** 证件关联关系有效标志 [1..1] */
	private String OthAssFlg;
	/** 信息来源编码 [1..1] */
	private String InfSurcCode;
	/** 信息报告日期 [1..1] */
	private String RptDate;

	public InCtfItgInf() {
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
	 * 获取 othName
	 * 
	 * @return the othName 其他姓名 [1..1]
	 */
	public String getOthName() {
		return OthName;
	}

	/**
	 * 设置 othName
	 * 
	 * @param othName
	 *            其他姓名 [1..1]
	 */
	public void setOthName(String othName) {
		OthName = othName;
	}

	/**
	 * 获取 othIDType
	 * 
	 * @return the othIDType 其他证件类型 [1..1]
	 */
	public String getOthIDType() {
		return OthIDType;
	}

	/**
	 * 设置 othIDType
	 * 
	 * @param othIDType
	 *            其他证件类型 [1..1]
	 */
	public void setOthIDType(String othIDType) {
		OthIDType = othIDType;
	}

	/**
	 * 获取 othIDNum
	 * 
	 * @return the othIDNum 其他证件号码 [1..1]
	 */
	public String getOthIDNum() {
		return OthIDNum;
	}

	/**
	 * 设置 othIDNum
	 * 
	 * @param othIDNum
	 *            其他证件号码 [1..1]
	 */
	public void setOthIDNum(String othIDNum) {
		OthIDNum = othIDNum;
	}

	/**
	 * 获取 othAssFlg
	 * 
	 * @return the othAssFlg 证件关联关系有效标志 [1..1]
	 */
	public String getOthAssFlg() {
		return OthAssFlg;
	}

	/**
	 * 设置 othAssFlg
	 * 
	 * @param othAssFlg
	 *            证件关联关系有效标志 [1..1]
	 */
	public void setOthAssFlg(String othAssFlg) {
		OthAssFlg = othAssFlg;
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
		return "InCtfItgInf [InfRecType=" + InfRecType + ", Name=" + Name
				+ ", IDType=" + IDType + ", IDNum=" + IDNum + ", OthName="
				+ OthName + ", OthIDType=" + OthIDType + ", OthIDNum="
				+ OthIDNum + ", OthAssFlg=" + OthAssFlg + ", InfSurcCode="
				+ InfSurcCode + ", RptDate=" + RptDate + "]";
	}

}
