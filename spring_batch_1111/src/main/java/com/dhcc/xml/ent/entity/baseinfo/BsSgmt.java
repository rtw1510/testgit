package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: BsSgmt<br/>
 * Description:企业基本信息记录基础段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月25日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfRecType", "EntName", "EntCertType", "EntCertNum",
		"RptDate", "InfSurcCode", "Cimoc", "CustomerType", "EtpSts", "OrgType","RptDateCode" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class BsSgmt {

	/**
	 * 信息记录类型[1..1]
	 */
	private String InfRecType;
	/**
	 * 企业名称[1..1]
	 */
	private String EntName;
	/**
	 * 企业身份标识类型[1..1]
	 */
	private String EntCertType;
	/**
	 * 企业身份标识号码[1..1]
	 */
	private String EntCertNum;
	/**
	 * 信息报告日期[1..1]
	 */
	private String RptDate;
	/**
	 * 信息来源编码[1..1]
	 */
	private String InfSurcCode;
	/**
	 * 客户资料维护机构代码[1..1]
	 */
	private String Cimoc;
	/**
	 * 客户资料类型[1..1]
	 */
	private String CustomerType;
	/**
	 * 存续状态[1..1]
	 */
	private String EtpSts;
	/**
	 * 组织机构类型[1..1]
	 */
	private String OrgType;
	
	
	private String RptDateCode;
	

	public BsSgmt() {
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
	 * 获取 entName
	 * 
	 * @return the entName 企业名称[1..1]
	 */
	public String getEntName() {
		return EntName;
	}

	/**
	 * 设置 entName
	 * 
	 * @param entName
	 *            企业名称[1..1]
	 */
	public void setEntName(String entName) {
		EntName = entName;
	}

	/**
	 * 获取 entCertType
	 * 
	 * @return the entCertType 企业身份标识类型[1..1]
	 */
	public String getEntCertType() {
		return EntCertType;
	}

	/**
	 * 设置 entCertType
	 * 
	 * @param entCertType
	 *            企业身份标识类型[1..1]
	 */
	public void setEntCertType(String entCertType) {
		EntCertType = entCertType;
	}

	/**
	 * 获取 entCertNum
	 * 
	 * @return the entCertNum 企业身份标识号码[1..1]
	 */
	public String getEntCertNum() {
		return EntCertNum;
	}

	/**
	 * 设置 entCertNum
	 * 
	 * @param entCertNum
	 *            企业身份标识号码[1..1]
	 */
	public void setEntCertNum(String entCertNum) {
		EntCertNum = entCertNum;
	}

	/**
	 * 获取 rptDate
	 * 
	 * @return the rptDate 信息报告日期[1..1]
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * 设置 rptDate
	 * 
	 * @param rptDate
	 *            信息报告日期[1..1]
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
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
	 * @return the customerType 客户资料类型[1..1]
	 */
	public String getCustomerType() {
		return CustomerType;
	}

	/**
	 * 设置 customerType
	 * 
	 * @param customerType
	 *            客户资料类型[1..1]
	 */
	public void setCustomerType(String customerType) {
		CustomerType = customerType;
	}

	/**
	 * 获取 etpSts
	 * 
	 * @return the etpSts 存续状态[1..1]
	 */
	public String getEtpSts() {
		return EtpSts;
	}

	/**
	 * 设置 etpSts
	 * 
	 * @param etpSts
	 *            存续状态[1..1]
	 */
	public void setEtpSts(String etpSts) {
		EtpSts = etpSts;
	}

	/**
	 * 获取 orgType
	 * 
	 * @return the orgType 组织机构类型[1..1]
	 */
	public String getOrgType() {
		return OrgType;
	}

	/**
	 * 设置 orgType
	 * 
	 * @param orgType
	 *            组织机构类型[1..1]
	 */
	public void setOrgType(String orgType) {
		OrgType = orgType;
	}
	
	
	

	public String getRptDateCode() {
		return RptDateCode;
	}

	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BsSgmt [InfRecType=" + InfRecType + ", EntName=" + EntName
				+ ", EntCertType=" + EntCertType + ", EntCertNum=" + EntCertNum
				+ ", RptDate=" + RptDate + ", InfSurcCode=" + InfSurcCode
				+ ", Cimoc=" + Cimoc + ", CustomerType=" + CustomerType
				+ ", EtpSts=" + EtpSts + ", OrgType=" + OrgType + "]";
	}

}
