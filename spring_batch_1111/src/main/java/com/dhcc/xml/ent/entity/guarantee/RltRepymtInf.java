package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: RltRepymtInf<br/>
 * Description:企业担保账户记录关联还款责任人信息元素 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfoIDType", "ArlpName", "ArlpCertType", "ArlpCertNum",
		"ArlpType", "ArlpAmt","WartySign","MaxGuarMcc" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class RltRepymtInf {
	/**
	 *身份类别[1..1]
	 */
	private String InfoIDType;
	/**
	 *相关还款责任人名称[1..1]
	 */
	private String ArlpName;
	/**
	 *相关还款责任人身份标识类型[1..1]
	 */
	private String ArlpCertType;
	/**
	 *相关还款责任人身份标识号码[1..1]
	 */
	private String ArlpCertNum;
	/**
	 *还款责任人类型[1..1]
	 */
	private String ArlpType;
	/**
	 *还款责任金额[1..1]
	 */
	private String ArlpAmt;
	/**联保标志*/  
	private String WartySign;
	/**保证合同编号*/  
	private String MaxGuarMcc;

	public RltRepymtInf() {
		super();
	}

	/**
	 * 获取 infoIDType
	 * 
	 * @return the infoIDType 身份类别[1..1]
	 */
	public String getInfoIDType() {
		return InfoIDType;
	}

	/**
	 * 设置 infoIDType
	 * 
	 * @param infoIDType
	 *            身份类别[1..1]
	 */
	public void setInfoIDType(String infoIDType) {
		InfoIDType = infoIDType;
	}

	/**
	 * 获取 arlpName
	 * 
	 * @return the arlpName 相关还款责任人名称[1..1]
	 */
	public String getArlpName() {
		return ArlpName;
	}

	/**
	 * 设置 arlpName
	 * 
	 * @param arlpName
	 *            相关还款责任人名称[1..1]
	 */
	public void setArlpName(String arlpName) {
		ArlpName = arlpName;
	}

	/**
	 * 获取 arlpCertType
	 * 
	 * @return the arlpCertType 相关还款责任人身份标识类型[1..1]
	 */
	public String getArlpCertType() {
		return ArlpCertType;
	}

	/**
	 * 设置 arlpCertType
	 * 
	 * @param arlpCertType
	 *            相关还款责任人身份标识类型[1..1]
	 */
	public void setArlpCertType(String arlpCertType) {
		ArlpCertType = arlpCertType;
	}

	/**
	 * 获取 arlpCertNum
	 * 
	 * @return the arlpCertNum 相关还款责任人身份标识号码[1..1]
	 */
	public String getArlpCertNum() {
		return ArlpCertNum;
	}

	/**
	 * 设置 arlpCertNum
	 * 
	 * @param arlpCertNum
	 *            相关还款责任人身份标识号码[1..1]
	 */
	public void setArlpCertNum(String arlpCertNum) {
		ArlpCertNum = arlpCertNum;
	}

	/**
	 * 获取 arlpType
	 * 
	 * @return the arlpType 还款责任人类型[1..1]
	 */
	public String getArlpType() {
		return ArlpType;
	}

	/**
	 * 设置 arlpType
	 * 
	 * @param arlpType
	 *            还款责任人类型[1..1]
	 */
	public void setArlpType(String arlpType) {
		ArlpType = arlpType;
	}

	/**
	 * 获取 arlpAmt
	 * 
	 * @return the arlpAmt 还款责任金额[1..1]
	 */
	public String getArlpAmt() {
		return ArlpAmt;
	}

	/**
	 * 设置 arlpAmt
	 * 
	 * @param arlpAmt
	 *            还款责任金额[1..1]
	 */
	public void setArlpAmt(String arlpAmt) {
		ArlpAmt = arlpAmt;
	}

	/**  
	 * 获取 wartySign
	 * @return the wartySign 联保标志 
	 */
	public String getWartySign() {
		return WartySign;
	}

	/**  
	 * 设置 wartySign  
	 * @param wartySign 联保标志  
	 */
	public void setWartySign(String wartySign) {
		WartySign = wartySign;
	}

	/**  
	 * 获取 maxGuarMcc
	 * @return the maxGuarMcc 保证合同编号 
	 */
	public String getMaxGuarMcc() {
		return MaxGuarMcc;
	}

	/**  
	 * 设置 maxGuarMcc  
	 * @param maxGuarMcc 保证合同编号  
	 */
	public void setMaxGuarMcc(String maxGuarMcc) {
		MaxGuarMcc = maxGuarMcc;
	}
}
