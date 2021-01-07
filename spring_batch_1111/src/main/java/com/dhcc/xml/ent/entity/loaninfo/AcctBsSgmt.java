package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: AcctBsSgmt<br/>
 * Description:企业借贷账户信息记录基础段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "InfRecType", "AcctType", "AcctCode", "RptDate",
		"RptDateCode", "Name", "IDType", "IDNum", "MngmtOrgCode" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// 指定序列成的xml节点顺序
public class AcctBsSgmt {
	/**
	 *信息记录类型 [1..1]
	 */
	private String InfRecType;
	/**
	 *账户类型 [1..1]
	 */
	private String AcctType;
	/**
	 *账户标识码 [1..1]
	 */
	private String AcctCode;
	/**
	 *信息报告日期 [1..1]
	 */
	private String RptDate;
	/**
	 *报告时点说明代码 [1..1]
	 */
	private String RptDateCode;
	/**
	 *借款人名称 [1..1]
	 */
	private String Name;
	/**
	 *借款人身份标识类型 [1..1]
	 */
	private String IDType;
	/**
	 *借款人身份标识号码 [1..1]
	 */
	private String IDNum;
	/**
	 *业务管理机构代码 [1..1]
	 */
	private String MngmtOrgCode;

	public AcctBsSgmt() {
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
	 * 获取 acctType
	 * 
	 * @return the acctType 账户类型 [1..1]
	 */
	public String getAcctType() {
		return AcctType;
	}

	/**
	 * 设置 acctType
	 * 
	 * @param acctType
	 *            账户类型 [1..1]
	 */
	public void setAcctType(String acctType) {
		AcctType = acctType;
	}

	/**
	 * 获取 acctCode
	 * 
	 * @return the acctCode 账户标识码 [1..1]
	 */
	public String getAcctCode() {
		return AcctCode;
	}

	/**
	 * 设置 acctCode
	 * 
	 * @param acctCode
	 *            账户标识码 [1..1]
	 */
	public void setAcctCode(String acctCode) {
		AcctCode = acctCode;
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
	 * 获取 name
	 * 
	 * @return the name 借款人名称 [1..1]
	 */
	public String getName() {
		return Name;
	}

	/**
	 * 设置 name
	 * 
	 * @param name
	 *            借款人名称 [1..1]
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * 获取 iDType
	 * 
	 * @return the iDType 借款人身份标识类型 [1..1]
	 */
	public String getIDType() {
		return IDType;
	}

	/**
	 * 设置 iDType
	 * 
	 * @param iDType
	 *            借款人身份标识类型 [1..1]
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}

	/**
	 * 获取 iDNum
	 * 
	 * @return the iDNum 借款人身份标识号码 [1..1]
	 */
	public String getIDNum() {
		return IDNum;
	}

	/**
	 * 设置 iDNum
	 * 
	 * @param iDNum
	 *            借款人身份标识号码 [1..1]
	 */
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
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

	@Override
	public String toString() {
		return "AcctBsSgmt [InfRecType=" + InfRecType + ", AcctType="
				+ AcctType + ", AcctCode=" + AcctCode + ", RptDate=" + RptDate
				+ ", RptDateCode=" + RptDateCode + ", Name=" + Name
				+ ", IDType=" + IDType + ", IDNum=" + IDNum + ", MngmtOrgCode="
				+ MngmtOrgCode + "]";
	}

}
