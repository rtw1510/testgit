/**  
 * Title: CltalInfSgmt.java<br\> 
 * Description: <br\> 
 * Copyright: Copyright (c) 2018<br\> 
 * Company: DHCC<br\>  
 * @author ChenJingYuan  
 * @date 2018-2-26  
 */
package com.dhcc.xml.ent.entity.motgacltalctrctinfo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: CltalInfSgmt<br/>
 * Description:抵（质）押合同信息记录质物信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD) // 访问类型改为字段
@XmlType(propOrder = { "ImpNm", "ImpInf" },namespace = "com.dhcc.xml.ent.entity.motgacltalctrctinfo")// 指定序列成的xml节点顺序
public class CltalInfSgmt {

	/**
	 *质物种类个数 [1..1]
	 */
	private String ImpNm;
	/**
	 *→质物信息 [1..99]
	 */
	private List<com.dhcc.xml.ent.entity.motgacltalctrctinfo.ImpInf> ImpInf;

	public CltalInfSgmt() {
		super();
	}

	/**
	 * 获取 impNm
	 * 
	 * @return the impNm 质物种类个数 [1..1]
	 */
	public String getImpNm() {
		return ImpNm;
	}

	/**
	 * 设置 impNm
	 * 
	 * @param impNm
	 *            质物种类个数 [1..1]
	 */
	public void setImpNm(String impNm) {
		ImpNm = impNm;
	}



	public List<com.dhcc.xml.ent.entity.motgacltalctrctinfo.ImpInf> getImpInf() {
		return ImpInf;
	}

	public void setImpInf(List<com.dhcc.xml.ent.entity.motgacltalctrctinfo.ImpInf> impInf) {
		ImpInf = impInf;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CltalInfSgmt [ImpInf=" + ImpInf + ", ImpNm=" + ImpNm + "]";
	}

}
