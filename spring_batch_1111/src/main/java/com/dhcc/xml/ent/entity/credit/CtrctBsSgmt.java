package com.dhcc.xml.ent.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: CtrctBsSgmt<br/>
 * Description:企业授信协议信息记录基础段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "InfRecType", "ContractCode", "RptDate", "RptDateCode",
		"Name", "IDType", "IDNum", "MngmtOrgCode" },namespace = "com.dhcc.xml.ent.entity.credit")
// 指定序列成的xml节点顺序
public class CtrctBsSgmt {
	/**
	 *信息记录类型 [1..1]
	 */
	private String InfRecType;
	/**
	 *授信协议标识码 [1..1]
	 */
	private String ContractCode;
	/**
	 *信息报告日期 [1..1]
	 */
	private String RptDate;
	/**
	 *报告时点说明代码 [1..1]
	 */
	private String RptDateCode;
	/**
	 *受信人名称 [1..1]
	 */
	private String Name;
	/**
	 *受信人身份标识类型 [1..1]
	 */
	private String IDType;
	/**
	 *受信人身份标识证件号码 [1..1]
	 */
	private String IDNum;
	/**
	 *业务管理机构代码 [1..1]
	 */
	private String MngmtOrgCode;

	public CtrctBsSgmt() {
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
	 * 获取 contractCode
	 * 
	 * @return the contractCode 授信协议标识码 [1..1]
	 */
	public String getContractCode() {
		return ContractCode;
	}

	/**
	 * 设置 contractCode
	 * 
	 * @param contractCode
	 *            授信协议标识码 [1..1]
	 */
	public void setContractCode(String contractCode) {
		ContractCode = contractCode;
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
	 * @return the name 受信人名称 [1..1]
	 */
	public String getName() {
		return Name;
	}

	/**
	 * 设置 name
	 * 
	 * @param name
	 *            受信人名称 [1..1]
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * 获取 iDType
	 * 
	 * @return the iDType 受信人身份标识类型 [1..1]
	 */
	public String getIDType() {
		return IDType;
	}

	/**
	 * 设置 iDType
	 * 
	 * @param iDType
	 *            受信人身份标识类型 [1..1]
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}

	/**
	 * 获取 iDNum
	 * 
	 * @return the iDNum 受信人身份标识证件号码 [1..1]
	 */
	public String getIDNum() {
		return IDNum;
	}

	/**
	 * 设置 iDNum
	 * 
	 * @param iDNum
	 *            受信人身份标识证件号码 [1..1]
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
		return "CtrctBsSgmt [InfRecType=" + InfRecType + ", ContractCode="
				+ ContractCode + ", RptDate=" + RptDate + ", RptDateCode="
				+ RptDateCode + ", Name=" + Name + ", IDType=" + IDType
				+ ", IDNum=" + IDNum + ", MngmtOrgCode=" + MngmtOrgCode + "]";
	}

}
