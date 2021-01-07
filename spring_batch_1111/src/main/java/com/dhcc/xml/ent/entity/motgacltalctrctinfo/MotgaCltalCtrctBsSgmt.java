/**  
 * Title: MotgaCltalCtrctBsSgmt.java<br\> 
 * Description: <br\> 
 * Copyright: Copyright (c) 2018<br\> 
 * Company: DHCC<br\>  
 * @author ChenJingYuan  
 * @date 2018-2-26  
 */
package com.dhcc.xml.ent.entity.motgacltalctrctinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MotgaCltalCtrctBsSgmt<br/>
 * Description:抵（质）押合同基础段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD) // 访问类型改为字段
@XmlType(propOrder = { "InfRecType", "CcCode","RptDate","RptDateCode","InfoIDType","Name","CertType","CertNum","MngmtOrgCode" },namespace = "com.dhcc.xml.ent.entity.motgacltalctrctinfo") // 指定序列成的xml节点顺序
public class MotgaCltalCtrctBsSgmt {
	/**
	 *信息记录类型 [1..1]
	 */
	private String InfRecType;
	/**
	 *（质）押合同标识码 [1..1]
	 */
	private String CcCode;
	/**
	 *信息报告日期 [1..1]
	 */
	private String RptDate;
	/**
	 *报告时点说明代码 [1..1]
	 */
	private String RptDateCode;
	/**
	 *债务人身份类别 [1..1]
	 */
	private String InfoIDType;
	/**
	 *债务人姓名 [1..1]
	 */
	private String Name;
	/**
	 *务人身份标识类型 [1..1]
	 */
	private String CertType;
	/**
	 *务人身份标识号码 [1..1]
	 */
	private String CertNum;
	/**
	 *业务管理机构代码 [1..1]
	 */
	private String MngmtOrgCode;

	/**
	 * Title: MotgaCltalCtrctBsSgmt.java<br\>
	 * Description: TODO<br\>
	 */
	public MotgaCltalCtrctBsSgmt() {
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
	 * 获取 ccCode
	 * 
	 * @return the ccCode （质）押合同标识码 [1..1]
	 */
	public String getCcCode() {
		return CcCode;
	}

	/**
	 * 设置 ccCode
	 * 
	 * @param ccCode
	 *            （质）押合同标识码 [1..1]
	 */
	public void setCcCode(String ccCode) {
		CcCode = ccCode;
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
	 * 获取 infoIDType
	 * 
	 * @return the infoIDType 债务人身份类别 [1..1]
	 */
	public String getInfoIDType() {
		return InfoIDType;
	}

	/**
	 * 设置 infoIDType
	 * 
	 * @param infoIDType
	 *            债务人身份类别 [1..1]
	 */
	public void setInfoIDType(String infoIDType) {
		InfoIDType = infoIDType;
	}

	/**
	 * 获取 name
	 * 
	 * @return the name 债务人姓名 [1..1]
	 */
	public String getName() {
		return Name;
	}

	/**
	 * 设置 name
	 * 
	 * @param name
	 *            债务人姓名 [1..1]
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * 获取 certType
	 * 
	 * @return the certType 务人身份标识类型 [1..1]
	 */
	public String getCertType() {
		return CertType;
	}

	/**
	 * 设置 certType
	 * 
	 * @param certType
	 *            务人身份标识类型 [1..1]
	 */
	public void setCertType(String certType) {
		CertType = certType;
	}

	/**
	 * 获取 certNum
	 * 
	 * @return the certNum 务人身份标识号码 [1..1]
	 */
	public String getCertNum() {
		return CertNum;
	}

	/**
	 * 设置 certNum
	 * 
	 * @param certNum
	 *            务人身份标识号码 [1..1]
	 */
	public void setCertNum(String certNum) {
		CertNum = certNum;
	}

	/**
	 * 获取 mngmtOrgCode
	 * 
	 * @return the mngmtOrgCode 业务管理机构代码 [1..1]
	 */
	public String getMngmtOrgCode() {
		return MngmtOrgCode;
	}

	/**
	 * 设置 mngmtOrgCode
	 * 
	 * @param mngmtOrgCode
	 *            业务管理机构代码 [1..1]
	 */
	public void setMngmtOrgCode(String mngmtOrgCode) {
		MngmtOrgCode = mngmtOrgCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MotgaCltalCtrctBsSgmt [CcCode=" + CcCode + ", CertNum="
				+ CertNum + ", CertType=" + CertType + ", InfRecType="
				+ InfRecType + ", InfoIDType=" + InfoIDType + ", MngmtOrgCode="
				+ MngmtOrgCode + ", Name=" + Name + ", RptDate=" + RptDate
				+ ", RptDateCode=" + RptDateCode + "]";
	}

}
