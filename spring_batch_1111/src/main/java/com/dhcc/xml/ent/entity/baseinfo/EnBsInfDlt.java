package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnBsInfDlt<br/>
 * Description:企业基本信息删除请求记录 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月25日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "InfRecType", "InfSurcCode", "EntName", "EntCertType",
		"EntCertNum" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
// 指定序列成的xml节点顺序
public class EnBsInfDlt {
	/**
	 *信息记录类型[1..1]
	 */
	private String InfRecType;
	/**
	 *信息来源编码[1..1]
	 */
	private String InfSurcCode;
	/**
	 *企业名称[1..1]
	 */
	private String EntName;
	/**
	 *企业身份标识类型[1..1]
	 */
	private String EntCertType;
	/**
	 *企业身份标识号码[1..1]
	 */
	private String EntCertNum;

	public EnBsInfDlt() {
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

	@Override
	public String toString() {
		return "EnBsInfDlt [InfRecType=" + InfRecType + ", InfSurcCode="
				+ InfSurcCode + ", EntName=" + EntName + ", EntCertType="
				+ EntCertType + ", EntCertNum=" + EntCertNum + "]";
	}

}
