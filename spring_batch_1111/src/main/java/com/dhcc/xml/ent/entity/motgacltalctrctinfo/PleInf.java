/**  
 * Title: PleInf.java<br\> 
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
 * Title: PleInf<br/>
 * Description: 抵（质）押合同信息记录抵押物信息元素 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "PleType", "MotgaProptIDType", "PleCertID", "PleDistr",
		"PleValue","PleCy","ValOrgType", "ValDate", "PledgorType", "PledgorName", "PleorCertType",
		"PleorCertNum", "PleDesc" },namespace = "com.dhcc.xml.ent.entity.motgacltalctrctinfo")
// 指定序列成的xml节点顺序
public class PleInf {
	/**
	 *抵押物种类 [1..1]
	 */
	private String PleType;
	/**
	 *抵押物识别号类型 [1..1]
	 */
	private String MotgaProptIDType;
	/**
	 *抵押物唯一识别号 [1..1]
	 */
	private String PleCertID;
	/**
	 *抵押物位置所在地行政区划 [1..1]
	 */
	private String PleDistr;
	/**
	 *抵押物评估价值 [1..1]
	 */
	private String PleValue;
	/**
	 *币种 [1..1]
	 */
	private String PleCy;
	/**
	 *评估机构类型 [1..1]
	 */
	private String ValOrgType;
	/**
	 *抵押物评估日期 [1..1]
	 */
	private String ValDate;
	/**
	 *抵押人类型 [1..1]
	 */
	private String PledgorType;
	/**
	 *抵押人姓名 [1..1]
	 */
	private String PledgorName;
	/**
	 *抵押人身份标识类型 [1..1]
	 */
	private String PleorCertType;
	/**
	 *抵押人身份标识号码 [1..1]
	 */
	private String PleorCertNum;
	/**
	 *抵押物说明 [1..1]
	 */
	private String PleDesc;

	
	

	public PleInf() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**  
	 * 获取 pleCy
	 * @return the pleCy 币种 [1..1] 
	 */
	public String getPleCy() {
		return PleCy;
	}


	/**  
	 * 设置 pleCy  
	 * @param pleCy 币种 [1..1]  
	 */
	public void setPleCy(String pleCy) {
		PleCy = pleCy;
	}


	/**
	 * 获取 pleType
	 * 
	 * @return the pleType 抵押物种类 [1..1]
	 */
	public String getPleType() {
		return PleType;
	}

	/**
	 * 设置 pleType
	 * 
	 * @param pleType
	 *            抵押物种类 [1..1]
	 */
	public void setPleType(String pleType) {
		PleType = pleType;
	}

	/**  
	 * 获取 motgaProptIDType
	 * @return the motgaProptIDType 抵押物识别号类型 [1..1] 
	 */
	public String getMotgaProptIDType() {
		return MotgaProptIDType;
	}


	/**  
	 * 设置 motgaProptIDType  
	 * @param motgaProptIDType 抵押物识别号类型 [1..1]  
	 */
	public void setMotgaProptIDType(String motgaProptIDType) {
		MotgaProptIDType = motgaProptIDType;
	}


	/**
	 * 获取 pleCertID
	 * 
	 * @return the pleCertID 抵押物唯一识别号 [1..1]
	 */
	public String getPleCertID() {
		return PleCertID;
	}

	/**
	 * 设置 pleCertID
	 * 
	 * @param pleCertID
	 *            抵押物唯一识别号 [1..1]
	 */
	public void setPleCertID(String pleCertID) {
		PleCertID = pleCertID;
	}

	/**
	 * 获取 pleDistr
	 * 
	 * @return the pleDistr 抵押物位置所在地行政区划 [1..1]
	 */
	public String getPleDistr() {
		return PleDistr;
	}

	/**
	 * 设置 pleDistr
	 * 
	 * @param pleDistr
	 *            抵押物位置所在地行政区划 [1..1]
	 */
	public void setPleDistr(String pleDistr) {
		PleDistr = pleDistr;
	}

	/**
	 * 获取 pleValue
	 * 
	 * @return the pleValue 抵押物评估价值 [1..1]
	 */
	public String getPleValue() {
		return PleValue;
	}

	/**
	 * 设置 pleValue
	 * 
	 * @param pleValue
	 *            抵押物评估价值 [1..1]
	 */
	public void setPleValue(String pleValue) {
		PleValue = pleValue;
	}

	/**
	 * 获取 valOrgType
	 * 
	 * @return the valOrgType 评估机构类型 [1..1]
	 */
	public String getValOrgType() {
		return ValOrgType;
	}

	/**
	 * 设置 valOrgType
	 * 
	 * @param valOrgType
	 *            评估机构类型 [1..1]
	 */
	public void setValOrgType(String valOrgType) {
		ValOrgType = valOrgType;
	}

	/**
	 * 获取 valDate
	 * 
	 * @return the valDate 抵押物评估日期 [1..1]
	 */
	public String getValDate() {
		return ValDate;
	}

	/**
	 * 设置 valDate
	 * 
	 * @param valDate
	 *            抵押物评估日期 [1..1]
	 */
	public void setValDate(String valDate) {
		ValDate = valDate;
	}

	/**
	 * 获取 pledgorType
	 * 
	 * @return the pledgorType 抵押人类型 [1..1]
	 */
	public String getPledgorType() {
		return PledgorType;
	}

	/**
	 * 设置 pledgorType
	 * 
	 * @param pledgorType
	 *            抵押人类型 [1..1]
	 */
	public void setPledgorType(String pledgorType) {
		PledgorType = pledgorType;
	}

	/**
	 * 获取 pledgorName
	 * 
	 * @return the pledgorName 抵押人姓名 [1..1]
	 */
	public String getPledgorName() {
		return PledgorName;
	}

	/**
	 * 设置 pledgorName
	 * 
	 * @param pledgorName
	 *            抵押人姓名 [1..1]
	 */
	public void setPledgorName(String pledgorName) {
		PledgorName = pledgorName;
	}

	/**
	 * 获取 pleorCertType
	 * 
	 * @return the pleorCertType 抵押人身份标识类型 [1..1]
	 */
	public String getPleorCertType() {
		return PleorCertType;
	}

	/**
	 * 设置 pleorCertType
	 * 
	 * @param pleorCertType
	 *            抵押人身份标识类型 [1..1]
	 */
	public void setPleorCertType(String pleorCertType) {
		PleorCertType = pleorCertType;
	}

	/**
	 * 获取 pleorCertNum
	 * 
	 * @return the pleorCertNum 抵押人身份标识号码 [1..1]
	 */
	public String getPleorCertNum() {
		return PleorCertNum;
	}

	/**
	 * 设置 pleorCertNum
	 * 
	 * @param pleorCertNum
	 *            抵押人身份标识号码 [1..1]
	 */
	public void setPleorCertNum(String pleorCertNum) {
		PleorCertNum = pleorCertNum;
	}

	/**
	 * 获取 pleDesc
	 * 
	 * @return the pleDesc 抵押物说明 [1..1]
	 */
	public String getPleDesc() {
		return PleDesc;
	}

	/**
	 * 设置 pleDesc
	 * 
	 * @param pleDesc
	 *            抵押物说明 [1..1]
	 */
	public void setPleDesc(String pleDesc) {
		PleDesc = pleDesc;
	}

}
