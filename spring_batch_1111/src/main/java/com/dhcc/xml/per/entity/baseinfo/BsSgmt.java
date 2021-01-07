package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: BsSgmt<br/>
 * Description: 基础段 [1..1]<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfRecType", "InfSurcCode", "Name", "IDType", "IDNum",
		"RptDate", "RptDateCode", "Cimoc", "CustomerType" },namespace = "com.dhcc.xml.per.entity.baseinfo")
public class BsSgmt {
	/**
	 * 信息记录类型 [1..1]
	 */
	private String InfRecType;
	/**
	 * 信息来源编码 [1..1]
	 */
	private String InfSurcCode;
	/**
	 * 姓名 [1..1]
	 */
	private String Name;
	/**
	 * 证件类型 [1..1]
	 */
	private String IDType;
	/**
	 * 证件号码 [1..1]
	 */
	private String IDNum;
	/**
	 * 信息报告日期 [1..1]
	 */
	private String RptDate;
	/**
	 * 报告时点说明代码 [1..1]
	 */
	private String RptDateCode;
	/**
	 * 客户资料维护机构代码[1..1]
	 */
	private String Cimoc;
	/**
	 * 客户资料类型
	 */
	private String CustomerType;

	public BsSgmt() {
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

	/**
	 * 获取 rptDateCode
	 * 
	 * @return the rptDateCode 报告时点说明代码 [1..1]
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}

	/**
	 * 设置 rptDateCode
	 * 
	 * @param rptDateCode
	 *            报告时点说明代码 [1..1]
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}

	/**
	 * 获取 cimoc
	 * 
	 * @return the cimoc 客户资料维护机构代码[1..1]
	 */
	public String getCimoc() {
		return Cimoc;
	}

	/**
	 * 设置 cimoc
	 * 
	 * @param cimoc
	 *            客户资料维护机构代码[1..1]
	 */
	public void setCimoc(String cimoc) {
		Cimoc = cimoc;
	}

	/**
	 * 获取 customerType
	 * 
	 * @return the customerType 客户资料类型
	 */
	public String getCustomerType() {
		return CustomerType;
	}

	/**
	 * 设置 customerType
	 * 
	 * @param customerType
	 *            客户资料类型
	 */
	public void setCustomerType(String customerType) {
		CustomerType = customerType;
	}

	@Override
	public String toString() {
		return "BsSgmt [InfRecType=" + InfRecType + ", InfSurcCode="
				+ InfSurcCode + ", Name=" + Name + ", IDType=" + IDType
				+ ", IDNum=" + IDNum + ", RptDate=" + RptDate
				+ ", RptDateCode=" + RptDateCode + ", Cimoc=" + Cimoc
				+ ", CustomerType=" + CustomerType + "]";
	}


}
