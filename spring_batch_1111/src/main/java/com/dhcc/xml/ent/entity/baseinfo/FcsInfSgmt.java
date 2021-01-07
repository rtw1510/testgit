package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: FcsInfSgmt<br/>
 * Description:基本概况信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月25日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "Nationality", "RegAdd", "AdmDivOfReg", "EstablishDate",
		"BizEndDate", "BizRange", "EcoIndusCate", "EcoType", "EntScale",
		"FcsInfoUpDate" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class FcsInfSgmt {
	/**
	 * 国别代码[1..1]
	 */
	private String Nationality;
	/**
	 * 登记地址[1..1]
	 */
	private String RegAdd;
	/**
	 * 登记地行政区划代码[1..1]
	 */
	private String AdmDivOfReg;
	/**
	 * 成立日期[1..1]
	 */
	private String EstablishDate;
	/**
	 * 营业许可证到期日[1..1]
	 */
	private String BizEndDate;
	/**
	 * 业务范围[1..1]
	 */
	private String BizRange;
	/**
	 * 行业分类代码[1..1]
	 */
	private String EcoIndusCate;
	/**
	 * 经济类型代码[1..1]
	 */
	private String EcoType;
	/**
	 * 企业规模[1..1]
	 */
	private String EntScale;
	/**
	 * 信息更新日期[1..1]
	 */
	private String FcsInfoUpDate;
	/**
	 * 客户号
	 */
	//private String Cust_No;

	public FcsInfSgmt() {
		super();
	}

	/**
	 * 获取 nationality
	 * 
	 * @return the nationality 国别代码[1..1]
	 */
	public String getNationality() {
		return Nationality;
	}

	/**
	 * 设置 nationality
	 * 
	 * @param nationality
	 *            国别代码[1..1]
	 */
	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	/**
	 * 获取 regAdd
	 * 
	 * @return the regAdd 登记地址[1..1]
	 */
	public String getRegAdd() {
		return RegAdd;
	}

	/**
	 * 设置 regAdd
	 * 
	 * @param regAdd
	 *            登记地址[1..1]
	 */
	public void setRegAdd(String regAdd) {
		RegAdd = regAdd;
	}

	/**
	 * 获取 admDivOfReg
	 * 
	 * @return the admDivOfReg 登记地行政区划代码[1..1]
	 */
	public String getAdmDivOfReg() {
		return AdmDivOfReg;
	}

	/**
	 * 设置 admDivOfReg
	 * 
	 * @param admDivOfReg
	 *            登记地行政区划代码[1..1]
	 */
	public void setAdmDivOfReg(String admDivOfReg) {
		AdmDivOfReg = admDivOfReg;
	}

	/**
	 * 获取 establishDate
	 * 
	 * @return the establishDate 成立日期[1..1]
	 */
	public String getEstablishDate() {
		return EstablishDate;
	}

	/**
	 * 设置 establishDate
	 * 
	 * @param establishDate
	 *            成立日期[1..1]
	 */
	public void setEstablishDate(String establishDate) {
		EstablishDate = establishDate;
	}

	/**
	 * 获取 bizEndDate
	 * 
	 * @return the bizEndDate 营业许可证到期日[1..1]
	 */
	public String getBizEndDate() {
		return BizEndDate;
	}

	/**
	 * 设置 bizEndDate
	 * 
	 * @param bizEndDate
	 *            营业许可证到期日[1..1]
	 */
	public void setBizEndDate(String bizEndDate) {
		BizEndDate = bizEndDate;
	}

	/**
	 * 获取 bizRange
	 * 
	 * @return the bizRange 业务范围[1..1]
	 */
	public String getBizRange() {
		return BizRange;
	}

	/**
	 * 设置 bizRange
	 * 
	 * @param bizRange
	 *            业务范围[1..1]
	 */
	public void setBizRange(String bizRange) {
		BizRange = bizRange;
	}

	/**
	 * 获取 ecoIndusCate
	 * 
	 * @return the ecoIndusCate 行业分类代码[1..1]
	 */
	public String getEcoIndusCate() {
		return EcoIndusCate;
	}

	/**
	 * 设置 ecoIndusCate
	 * 
	 * @param ecoIndusCate
	 *            行业分类代码[1..1]
	 */
	public void setEcoIndusCate(String ecoIndusCate) {
		EcoIndusCate = ecoIndusCate;
	}

	/**
	 * 获取 ecoType
	 * 
	 * @return the ecoType 经济类型代码[1..1]
	 */
	public String getEcoType() {
		return EcoType;
	}

	/**
	 * 设置 ecoType
	 * 
	 * @param ecoType
	 *            经济类型代码[1..1]
	 */
	public void setEcoType(String ecoType) {
		EcoType = ecoType;
	}

	/**
	 * 获取 entScale
	 * 
	 * @return the entScale 企业规模[1..1]
	 */
	public String getEntScale() {
		return EntScale;
	}

	/**
	 * 设置 entScale
	 * 
	 * @param entScale
	 *            企业规模[1..1]
	 */
	public void setEntScale(String entScale) {
		EntScale = entScale;
	}

	/**
	 * 获取 fcsInfoUpDate
	 * 
	 * @return the fcsInfoUpDate 信息更新日期[1..1]
	 */
	public String getFcsInfoUpDate() {
		return FcsInfoUpDate;
	}

	/**
	 * 设置 fcsInfoUpDate
	 * 
	 * @param fcsInfoUpDate
	 *            信息更新日期[1..1]
	 */
	public void setFcsInfoUpDate(String fcsInfoUpDate) {
		FcsInfoUpDate = fcsInfoUpDate;
	}

	
	@Override
	public String toString() {
		return "FcsInfSgmt [Nationality=" + Nationality + ", RegAdd=" + RegAdd
				+ ", AdmDivOfReg=" + AdmDivOfReg + ", EstablishDate="
				+ EstablishDate + ", BizEndDate=" + BizEndDate + ", BizRange="
				+ BizRange + ", EcoIndusCate=" + EcoIndusCate + ", EcoType="
				+ EcoType + ", EntScale=" + EntScale + ", FcsInfoUpDate="
				+ FcsInfoUpDate + "]";
	}

}
