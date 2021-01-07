package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: OrigCreditorInfSgmt<br/>
 * Description:企业借贷账户信息记录还款表现信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "InitCredName", "InitCedOrgCode", "OrigDbtCate",
		"InitRpySts" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// 指定序列成的xml节点顺序
public class OrigCreditorInfSgmt {
	/**
	 *初始债权人名称 [1..1]
	 */
	private String InitCredName;
	/**
	 *初始债权人机构代码 [1..1]
	 */
	private String InitCedOrgCode;
	/**
	 *原债务种类 [1..1]
	 */
	private String OrigDbtCate;
	/**
	 *债权转移时的还款状态 [1..1]
	 */
	private String InitRpySts;

	public OrigCreditorInfSgmt() {
		super();
	}

	/**
	 * 获取 initCredName
	 * 
	 * @return the initCredName 初始债权人名称 [1..1]
	 */
	public String getInitCredName() {
		return InitCredName;
	}

	/**
	 * 设置 initCredName
	 * 
	 * @param initCredName
	 *            初始债权人名称 [1..1]
	 */
	public void setInitCredName(String initCredName) {
		InitCredName = initCredName;
	}

	/**
	 * 获取 initCedOrgCode
	 * 
	 * @return the initCedOrgCode 初始债权人机构代码 [1..1]
	 */
	public String getInitCedOrgCode() {
		return InitCedOrgCode;
	}

	/**
	 * 设置 initCedOrgCode
	 * 
	 * @param initCedOrgCode
	 *            初始债权人机构代码 [1..1]
	 */
	public void setInitCedOrgCode(String initCedOrgCode) {
		InitCedOrgCode = initCedOrgCode;
	}

	/**
	 * 获取 origDbtCate
	 * 
	 * @return the origDbtCate 原债务种类 [1..1]
	 */
	public String getOrigDbtCate() {
		return OrigDbtCate;
	}

	/**
	 * 设置 origDbtCate
	 * 
	 * @param origDbtCate
	 *            原债务种类 [1..1]
	 */
	public void setOrigDbtCate(String origDbtCate) {
		OrigDbtCate = origDbtCate;
	}

	/**
	 * 获取 initRpySts
	 * 
	 * @return the initRpySts 债权转移时的还款状态 [1..1]
	 */
	public String getInitRpySts() {
		return InitRpySts;
	}

	/**
	 * 设置 initRpySts
	 * 
	 * @param initRpySts
	 *            债权转移时的还款状态 [1..1]
	 */
	public void setInitRpySts(String initRpySts) {
		InitRpySts = initRpySts;
	}

	@Override
	public String toString() {
		return "OrigCreditorInfSgmt [InitCredName=" + InitCredName
				+ ", InitCedOrgCode=" + InitCedOrgCode + ", OrigDbtCate="
				+ OrigDbtCate + ", InitRpySts=" + InitRpySts + "]";
	}

}
