package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnIcdnRltpInf<br/>
 * Description:企业间关联关系信息记录 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月25日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
//访问类型改为字段
@XmlType(propOrder = { "InfRecType", "EntName", "EntCertType", "EntCertNum","AssoEntName","AssoEntCertType","AssoEntCertNum","AssoType",
		"AssoSign","RptDate" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
//指定序列成的xml节点顺序
public class EnIcdnRltpInf {
	/**
	 *信息记录类型[1..1]
	 */
	private String InfRecType;
	/**
	 *A企业名称[1..1]
	 */
	private String EntName;
	/**
	 *A企业身份标识类型[1..1]
	 */
	private String EntCertType;
	/**
	 *A企业身份标识号码[1..1]
	 */
	private String EntCertNum;
	/**
	 *B企业名称[1..1]
	 */
	private String AssoEntName;
	/**
	 *B企业身份标识类型[1..1]
	 */
	private String AssoEntCertType;
	/**
	 *B企业身份标识号码[1..1]
	 */
	private String AssoEntCertNum;
	/**
	 *关联关系类型[1..1]
	 */
	private String AssoType;
	/**
	 *关联标志[1..1]
	 */
	private String AssoSign;
	/**
	 *信息报告日期[1..1]
	 */
	private String RptDate;

	public EnIcdnRltpInf() {
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
	 * 获取 entName
	 * 
	 * @return the entName A企业名称[1..1]
	 */
	public String getEntName() {
		return EntName;
	}

	/**
	 * 设置 entName
	 * 
	 * @param entName
	 *            A企业名称[1..1]
	 */
	public void setEntName(String entName) {
		EntName = entName;
	}

	/**
	 * 获取 entCertType
	 * 
	 * @return the entCertType A企业身份标识类型[1..1]
	 */
	public String getEntCertType() {
		return EntCertType;
	}

	/**
	 * 设置 entCertType
	 * 
	 * @param entCertType
	 *            A企业身份标识类型[1..1]
	 */
	public void setEntCertType(String entCertType) {
		EntCertType = entCertType;
	}

	/**
	 * 获取 entCertNum
	 * 
	 * @return the entCertNum A企业身份标识号码[1..1]
	 */
	public String getEntCertNum() {
		return EntCertNum;
	}

	/**
	 * 设置 entCertNum
	 * 
	 * @param entCertNum
	 *            A企业身份标识号码[1..1]
	 */
	public void setEntCertNum(String entCertNum) {
		EntCertNum = entCertNum;
	}

	/**
	 * 获取 assoEntName
	 * 
	 * @return the assoEntName B企业名称[1..1]
	 */
	public String getAssoEntName() {
		return AssoEntName;
	}

	/**
	 * 设置 assoEntName
	 * 
	 * @param assoEntName
	 *            B企业名称[1..1]
	 */
	public void setAssoEntName(String assoEntName) {
		AssoEntName = assoEntName;
	}

	/**
	 * 获取 assoEntCertType
	 * 
	 * @return the assoEntCertType B企业身份标识类型[1..1]
	 */
	public String getAssoEntCertType() {
		return AssoEntCertType;
	}

	/**
	 * 设置 assoEntCertType
	 * 
	 * @param assoEntCertType
	 *            B企业身份标识类型[1..1]
	 */
	public void setAssoEntCertType(String assoEntCertType) {
		AssoEntCertType = assoEntCertType;
	}

	/**
	 * 获取 assoEntCertNum
	 * 
	 * @return the assoEntCertNum B企业身份标识号码[1..1]
	 */
	public String getAssoEntCertNum() {
		return AssoEntCertNum;
	}

	/**
	 * 设置 assoEntCertNum
	 * 
	 * @param assoEntCertNum
	 *            B企业身份标识号码[1..1]
	 */
	public void setAssoEntCertNum(String assoEntCertNum) {
		AssoEntCertNum = assoEntCertNum;
	}

	/**
	 * 获取 assoType
	 * 
	 * @return the assoType 关联关系类型[1..1]
	 */
	public String getAssoType() {
		return AssoType;
	}

	/**
	 * 设置 assoType
	 * 
	 * @param assoType
	 *            关联关系类型[1..1]
	 */
	public void setAssoType(String assoType) {
		AssoType = assoType;
	}

	/**
	 * 获取 assoSign
	 * 
	 * @return the assoSign 关联标志[1..1]
	 */
	public String getAssoSign() {
		return AssoSign;
	}

	/**
	 * 设置 assoSign
	 * 
	 * @param assoSign
	 *            关联标志[1..1]
	 */
	public void setAssoSign(String assoSign) {
		AssoSign = assoSign;
	}

	/**
	 * 获取 rptDate
	 * 
	 * @return the rptDate 信息报告日期[1..1]
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * 设置 rptDate
	 * 
	 * @param rptDate
	 *            信息报告日期[1..1]
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	@Override
	public String toString() {
		return "EnIcdnRltpInf [InfRecType=" + InfRecType + ", EntName="
				+ EntName + ", EntCertType=" + EntCertType + ", EntCertNum="
				+ EntCertNum + ", AssoEntName=" + AssoEntName
				+ ", AssoEntCertType=" + AssoEntCertType + ", AssoEntCertNum="
				+ AssoEntCertNum + ", AssoType=" + AssoType + ", AssoSign="
				+ AssoSign + ", RptDate=" + RptDate + "]";
	}

}
