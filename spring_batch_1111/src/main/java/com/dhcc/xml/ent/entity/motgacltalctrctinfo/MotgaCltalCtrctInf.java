/**  
 * Title: MotgaCltalCtrctInf.java<br\> 
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
 * Title: MotgaCltalCtrctInf<br/>
 * Description:抵（质）押合同信息记录元素 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "MotgaCltalCtrctBsSgmt", "MotgaCltalBsInfSgmt",
		"ComRecInfSgmt", "MotgaProptInfSgmt", "CltalInfSgmt" },namespace = "com.dhcc.xml.ent.entity.motgacltalctrctinfo")
// 指定序列成的xml节点顺序
public class MotgaCltalCtrctInf {

	/**
	 * 基础段 [1..1]
	 */
	private MotgaCltalCtrctBsSgmt MotgaCltalCtrctBsSgmt;
	/**
	 * 基本信息段 [1..1]
	 */
	private MotgaCltalBsInfSgmt MotgaCltalBsInfSgmt;
	/**
	 * 共同债务人信息段 [0..1]
	 */
	private com.dhcc.xml.ent.entity.motgacltalctrctinfo.ComRecInfSgmt ComRecInfSgmt;
	/**
	 * 抵押物信息段 [0..1]
	 */
	private MotgaProptInfSgmt MotgaProptInfSgmt;
	/**
	 * 质物信息段 [0..1]
	 */
	private CltalInfSgmt CltalInfSgmt;

	public MotgaCltalCtrctInf() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取 motgaCltalCtrctBsSgmt
	 * 
	 * @return the motgaCltalCtrctBsSgmt 基础段 [1..1]
	 */
	public MotgaCltalCtrctBsSgmt getMotgaCltalCtrctBsSgmt() {
		return MotgaCltalCtrctBsSgmt;
	}

	/**
	 * 设置 motgaCltalCtrctBsSgmt
	 * 
	 * @param motgaCltalCtrctBsSgmt
	 *            基础段 [1..1]
	 */
	public void setMotgaCltalCtrctBsSgmt(
			MotgaCltalCtrctBsSgmt motgaCltalCtrctBsSgmt) {
		MotgaCltalCtrctBsSgmt = motgaCltalCtrctBsSgmt;
	}

	/**
	 * 获取 motgaCltalBsInfSgmt
	 * 
	 * @return the motgaCltalBsInfSgmt 基本信息段 [1..1]
	 */
	public MotgaCltalBsInfSgmt getMotgaCltalBsInfSgmt() {
		return MotgaCltalBsInfSgmt;
	}

	/**
	 * 设置 motgaCltalBsInfSgmt
	 * 
	 * @param motgaCltalBsInfSgmt
	 *            基本信息段 [1..1]
	 */
	public void setMotgaCltalBsInfSgmt(MotgaCltalBsInfSgmt motgaCltalBsInfSgmt) {
		MotgaCltalBsInfSgmt = motgaCltalBsInfSgmt;
	}

	/**
	 * 获取 comRecInfSgmt
	 * 
	 * @return the comRecInfSgmt 共同债务人信息段 [0..1]
	 */
	public com.dhcc.xml.ent.entity.motgacltalctrctinfo.ComRecInfSgmt getComRecInfSgmt() {
		return ComRecInfSgmt;
	}

	/**
	 * 设置 comRecInfSgmt
	 * 
	 * @param comRecInfSgmt
	 *            共同债务人信息段 [0..1]
	 */
	public void setComRecInfSgmt(com.dhcc.xml.ent.entity.motgacltalctrctinfo.ComRecInfSgmt comRecInfSgmt) {
		ComRecInfSgmt = comRecInfSgmt;
	}

	/**
	 * 获取 motgaProptInfSgmt
	 * 
	 * @return the motgaProptInfSgmt 抵押物信息段 [0..1]
	 */
	public MotgaProptInfSgmt getMotgaProptInfSgmt() {
		return MotgaProptInfSgmt;
	}

	/**
	 * 设置 motgaProptInfSgmt
	 * 
	 * @param motgaProptInfSgmt
	 *            抵押物信息段 [0..1]
	 */
	public void setMotgaProptInfSgmt(MotgaProptInfSgmt motgaProptInfSgmt) {
		MotgaProptInfSgmt = motgaProptInfSgmt;
	}

	/**
	 * 获取 cltalInfSgmt
	 * 
	 * @return the cltalInfSgmt 质物信息段 [0..1]
	 */
	public CltalInfSgmt getCltalInfSgmt() {
		return CltalInfSgmt;
	}

	/**
	 * 设置 cltalInfSgmt
	 * 
	 * @param cltalInfSgmt
	 *            质物信息段 [0..1]
	 */
	public void setCltalInfSgmt(CltalInfSgmt cltalInfSgmt) {
		CltalInfSgmt = cltalInfSgmt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MotgaCltalCtrctInf [CltalInfSgmt=" + CltalInfSgmt
				+ ", ComRecInfSgmt=" + ComRecInfSgmt + ", MotgaCltalBsInfSgmt="
				+ MotgaCltalBsInfSgmt + ", MotgaCltalCtrctBsSgmt="
				+ MotgaCltalCtrctBsSgmt + ", MotgaProptInfSgmt="
				+ MotgaProptInfSgmt + "]";
	}

}
