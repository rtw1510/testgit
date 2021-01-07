/**  
 * Title: ImpInf.java<br\> 
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
 * Title: ImpInf<br/>
 * Description: <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "ImpType", "ImpVal", "ImpCy", "Ippc", "PawnName", "PawnCertType",
		"PawnCertNum" },namespace = "com.dhcc.xml.ent.entity.motgacltalctrctinfo")
// 指定序列成的xml节点顺序
public class ImpInf {
	/**
	 *质物种类 [1..1]
	 */
	private String ImpType;
	/**
	 *质物价值 [1..1]
	 */
	private String ImpVal;
	/**
	 *币种 [1..1]
	 */
	private String ImpCy;
	/**
	 *出质人类型 [1..1]
	 */
	private String Ippc;
	/**
	 *出质人名称 [1..1]
	 */
	private String PawnName;
	/**
	 *出质人身份标识类型 [1..1]
	 */
	private String PawnCertType;
	/**
	 *出质人身份标识号码 [1..1]
	 */
	private String PawnCertNum;

	public ImpInf() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取 impCy
	 * 
	 * @return the impCy 币种 [1..1]
	 */
	public String getImpCy() {
		return ImpCy;
	}

	/**
	 * 设置 impCy
	 * 
	 * @param impCy
	 *            币种 [1..1]
	 */
	public void setImpCy(String impCy) {
		ImpCy = impCy;
	}

	/**
	 * 获取 impType
	 * 
	 * @return the impType 质物种类 [1..1]
	 */
	public String getImpType() {
		return ImpType;
	}

	/**
	 * 设置 impType
	 * 
	 * @param impType
	 *            质物种类 [1..1]
	 */
	public void setImpType(String impType) {
		ImpType = impType;
	}

	/**
	 * 获取 impVal
	 * 
	 * @return the impVal 质物价值 [1..1]
	 */
	public String getImpVal() {
		return ImpVal;
	}

	/**
	 * 设置 impVal
	 * 
	 * @param impVal
	 *            质物价值 [1..1]
	 */
	public void setImpVal(String impVal) {
		ImpVal = impVal;
	}

	/**
	 * 获取 ippc
	 * 
	 * @return the ippc 出质人类型 [1..1]
	 */
	public String getIppc() {
		return Ippc;
	}

	/**
	 * 设置 ippc
	 * 
	 * @param ippc
	 *            出质人类型 [1..1]
	 */
	public void setIppc(String ippc) {
		Ippc = ippc;
	}

	/**
	 * 获取 pawnName
	 * 
	 * @return the pawnName 出质人名称 [1..1]
	 */
	public String getPawnName() {
		return PawnName;
	}

	/**
	 * 设置 pawnName
	 * 
	 * @param pawnName
	 *            出质人名称 [1..1]
	 */
	public void setPawnName(String pawnName) {
		PawnName = pawnName;
	}

	/**
	 * 获取 pawnCertType
	 * 
	 * @return the pawnCertType 出质人身份标识类型 [1..1]
	 */
	public String getPawnCertType() {
		return PawnCertType;
	}

	/**
	 * 设置 pawnCertType
	 * 
	 * @param pawnCertType
	 *            出质人身份标识类型 [1..1]
	 */
	public void setPawnCertType(String pawnCertType) {
		PawnCertType = pawnCertType;
	}

	/**
	 * 获取 pawnCertNum
	 * 
	 * @return the pawnCertNum 出质人身份标识号码 [1..1]
	 */
	public String getPawnCertNum() {
		return PawnCertNum;
	}

	/**
	 * 设置 pawnCertNum
	 * 
	 * @param pawnCertNum
	 *            出质人身份标识号码 [1..1]
	 */
	public void setPawnCertNum(String pawnCertNum) {
		PawnCertNum = pawnCertNum;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ImpInf [ImpCy=" + ImpCy + ", ImpType=" + ImpType + ", ImpVal="
				+ ImpVal + ", Ippc=" + Ippc + ", PawnCertNum=" + PawnCertNum
				+ ", PawnCertType=" + PawnCertType + ", PawnName=" + PawnName
				+ "]";
	}
}
