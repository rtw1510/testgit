/**  
 * Title: MotgaProptInfSgmt.java<br\> 
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
 * Title: MotgaProptInfSgmt<br/>
 * Description: 抵（质）押合同信息记录抵押物信息段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "PleNm", "PleInf" },namespace = "com.dhcc.xml.ent.entity.motgacltalctrctinfo")
// 指定序列成的xml节点顺序
public class MotgaProptInfSgmt {
	/**
	 *抵押物个数[1..1]
	 */
	private String PleNm;
	/**
	 *→抵押物信息 [1..99]
	 */
	private List<com.dhcc.xml.ent.entity.motgacltalctrctinfo.PleInf> PleInf;

	public MotgaProptInfSgmt() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取 pleNm
	 * 
	 * @return the pleNm 抵押物个数[1..1]
	 */
	public String getPleNm() {
		return PleNm;
	}

	/**
	 * 设置 pleNm
	 * 
	 * @param pleNm
	 *            抵押物个数[1..1]
	 */
	public void setPleNm(String pleNm) {
		PleNm = pleNm;
	}


	public List<com.dhcc.xml.ent.entity.motgacltalctrctinfo.PleInf> getPleInf() {
		return PleInf;
	}

	public void setPleInf(List<com.dhcc.xml.ent.entity.motgacltalctrctinfo.PleInf> pleInf) {
		PleInf = pleInf;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MotgaProptInfSgmt [PleInf=" + PleInf + ", PleNm=" + PleNm + "]";
	}

}
