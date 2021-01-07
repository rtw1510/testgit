/**  
 * Title: MotgaCltalBsInfSgmt.java<br\> 
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
 * Title: MotgaCltalBsInfSgmt<br/>
 * Description:抵（质）押合同基本信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD) // 访问类型改为字段
@XmlType(propOrder = { "GuarType", "CcAmt","Cy","CcValDate","CcExpDate","MaxGuar","CcStatus" },namespace = "com.dhcc.xml.ent.entity.motgacltalctrctinfo") // 指定序列成的xml节点顺序
public class MotgaCltalBsInfSgmt {
	/**
	 *合同类型 [1..1]
	 */
	private String GuarType;
	/**
	 *担保金额 [1..1]
	 */
	private String CcAmt;
	/**
	 * 币种 [1..1]
	 */
	private String Cy;
	/**
	 *抵（质）押合同生效日期 [1..1]
	 */
	private String CcValDate;
	/**
	 *抵（质）押合同到期日期 [1..1]
	 */
	private String CcExpDate;
	/**
	 *最高额担保标志 [1..1]
	 */
	private String MaxGuar;
	/**
	 *抵（质）押合同状态 [1..1]
	 */
	private String CcStatus;

	public MotgaCltalBsInfSgmt() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取 guarType
	 * 
	 * @return the guarType 合同类型 [1..1]
	 */
	public String getGuarType() {
		return GuarType;
	}

	/**
	 * 设置 guarType
	 * 
	 * @param guarType
	 *            合同类型 [1..1]
	 */
	public void setGuarType(String guarType) {
		GuarType = guarType;
	}

	/**
	 * 获取 ccAmt
	 * 
	 * @return the ccAmt 担保金额 [1..1]
	 */
	public String getCcAmt() {
		return CcAmt;
	}

	/**
	 * 设置 ccAmt
	 * 
	 * @param ccAmt
	 *            担保金额 [1..1]
	 */
	public void setCcAmt(String ccAmt) {
		CcAmt = ccAmt;
	}

	/**
	 * 获取 cy
	 * 
	 * @return the cy 币种 [1..1]
	 */
	public String getCy() {
		return Cy;
	}

	/**
	 * 设置 cy
	 * 
	 * @param cy
	 *            币种 [1..1]
	 */
	public void setCy(String cy) {
		Cy = cy;
	}

	/**
	 * 获取 ccValDate
	 * 
	 * @return the ccValDate 抵（质）押合同生效日期 [1..1]
	 */
	public String getCcValDate() {
		return CcValDate;
	}

	/**
	 * 设置 ccValDate
	 * 
	 * @param ccValDate
	 *            抵（质）押合同生效日期 [1..1]
	 */
	public void setCcValDate(String ccValDate) {
		CcValDate = ccValDate;
	}

	/**
	 * 获取 ccExpDate
	 * 
	 * @return the ccExpDate 抵（质）押合同到期日期 [1..1]
	 */
	public String getCcExpDate() {
		return CcExpDate;
	}

	/**
	 * 设置 ccExpDate
	 * 
	 * @param ccExpDate
	 *            抵（质）押合同到期日期 [1..1]
	 */
	public void setCcExpDate(String ccExpDate) {
		CcExpDate = ccExpDate;
	}

	/**
	 * 获取 maxGuar
	 * 
	 * @return the maxGuar 最高额担保标志 [1..1]
	 */
	public String getMaxGuar() {
		return MaxGuar;
	}

	/**
	 * 设置 maxGuar
	 * 
	 * @param maxGuar
	 *            最高额担保标志 [1..1]
	 */
	public void setMaxGuar(String maxGuar) {
		MaxGuar = maxGuar;
	}

	/**
	 * 获取 ccStatus
	 * 
	 * @return the ccStatus 抵（质）押合同状态 [1..1]
	 */
	public String getCcStatus() {
		return CcStatus;
	}

	/**
	 * 设置 ccStatus
	 * 
	 * @param ccStatus
	 *            抵（质）押合同状态 [1..1]
	 */
	public void setCcStatus(String ccStatus) {
		CcStatus = ccStatus;
	}

	@Override
	public String toString() {
		return "MotgaCltalBsInfSgmt [CcAmt=" + CcAmt + ", CcExpDate="
				+ CcExpDate + ", CcStatus=" + CcStatus + ", CcValDate="
				+ CcValDate + ", Cy=" + Cy + ", GuarType=" + GuarType
				+ ", MaxGuar=" + MaxGuar + "]";
	}

}
