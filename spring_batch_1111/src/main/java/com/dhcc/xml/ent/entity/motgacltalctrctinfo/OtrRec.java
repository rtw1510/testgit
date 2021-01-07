/**  
 * Title: OtrRec.java<br\> 
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
 * Title: OtrRec<br/>
 * Description: 抵（质）押合同信息记录债务人信息 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
//访问类型改为字段
@XmlType(propOrder = { "InfoIDType", "GuarName","GuarCertType","GuarCertNum" },namespace = "com.dhcc.xml.ent.entity.motgacltalctrctinfo")
//指定序列成的xml节点顺序
public class OtrRec {
	/**
	 *身份类别 [1..1]
	 */
	private String InfoIDType;
	/**
	 *共同债务人名称 [1..1]
	 */
	private String GuarName;
	/**
	 *共同债务人身份标识类型 [1..1]
	 */
	private String GuarCertType;
	/**
	 *共同债务人身份标识号码 [1..1]
	 */
	private String GuarCertNum;

	public OtrRec() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取 infoIDType
	 * 
	 * @return the infoIDType 身份类别 [1..1]
	 */
	public String getInfoIDType() {
		return InfoIDType;
	}

	/**
	 * 设置 infoIDType
	 * 
	 * @param infoIDType
	 *            身份类别 [1..1]
	 */
	public void setInfoIDType(String infoIDType) {
		InfoIDType = infoIDType;
	}

	/**
	 * 获取 guarName
	 * 
	 * @return the guarName 共同债务人名称 [1..1]
	 */
	public String getGuarName() {
		return GuarName;
	}

	/**
	 * 设置 guarName
	 * 
	 * @param guarName
	 *            共同债务人名称 [1..1]
	 */
	public void setGuarName(String guarName) {
		GuarName = guarName;
	}

	/**
	 * 获取 guarCertType
	 * 
	 * @return the guarCertType 共同债务人身份标识类型 [1..1]
	 */
	public String getGuarCertType() {
		return GuarCertType;
	}

	/**
	 * 设置 guarCertType
	 * 
	 * @param guarCertType
	 *            共同债务人身份标识类型 [1..1]
	 */
	public void setGuarCertType(String guarCertType) {
		GuarCertType = guarCertType;
	}

	/**
	 * 获取 guarCertNum
	 * 
	 * @return the guarCertNum 共同债务人身份标识号码 [1..1]
	 */
	public String getGuarCertNum() {
		return GuarCertNum;
	}

	/**
	 * 设置 guarCertNum
	 * 
	 * @param guarCertNum
	 *            共同债务人身份标识号码 [1..1]
	 */
	public void setGuarCertNum(String guarCertNum) {
		GuarCertNum = guarCertNum;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OtrRec [GuarCertNum=" + GuarCertNum + ", GuarCertType="
				+ GuarCertType + ", GuarName=" + GuarName + ", InfoIDType="
				+ InfoIDType + "]";
	}

}
