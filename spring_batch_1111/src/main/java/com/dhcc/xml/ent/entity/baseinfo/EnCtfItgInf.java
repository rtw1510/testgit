package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnCtfItgInf<br/>
 * Description: 企业身份标识整合信息记录<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月25日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
//访问类型改为字段
@XmlType(propOrder = { "InfRecType", "EntName", "EntCertType", "EntCertNum",
		"OthEntCertType","OthEntCertNum","CertAssFlg","RptDate" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
//指定序列成的xml节点顺序
public class EnCtfItgInf {
	/**
	 *信息记录类型[1..1]
	 */
	private String InfRecType;
	/**
	 * 企业名称[1..1]
	 */
	private String EntName;
	/**
	 *企业身份标识类型[1..1]
	 */
	private String EntCertType;
	/**
	 *企业身份标识号码[1..1]
	 */
	private String EntCertNum;
	/**
	 *企业其他身份标识类型[1..1]
	 */
	private String OthEntCertType;
	/**
	 *企业其他身份标识号码[1..1]
	 */
	private String OthEntCertNum;
	/**
	 *身份标识关联标志[1..1]
	 */
	private String CertAssFlg;
	/**
	 *信息报告日期[1..1]
	 */
	private String RptDate;

	public EnCtfItgInf() {
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
	 * @return the entName 企业名称[1..1]
	 */
	public String getEntName() {
		return EntName;
	}

	/**
	 * 设置 entName
	 * 
	 * @param entName
	 *            企业名称[1..1]
	 */
	public void setEntName(String entName) {
		EntName = entName;
	}

	/**
	 * 获取 entCertType
	 * 
	 * @return the entCertType 企业身份标识类型[1..1]
	 */
	public String getEntCertType() {
		return EntCertType;
	}

	/**
	 * 设置 entCertType
	 * 
	 * @param entCertType
	 *            企业身份标识类型[1..1]
	 */
	public void setEntCertType(String entCertType) {
		EntCertType = entCertType;
	}

	/**
	 * 获取 entCertNum
	 * 
	 * @return the entCertNum 企业身份标识号码[1..1]
	 */
	public String getEntCertNum() {
		return EntCertNum;
	}

	/**
	 * 设置 entCertNum
	 * 
	 * @param entCertNum
	 *            企业身份标识号码[1..1]
	 */
	public void setEntCertNum(String entCertNum) {
		EntCertNum = entCertNum;
	}

	/**
	 * 获取 othEntCertType
	 * 
	 * @return the othEntCertType 企业其他身份标识类型[1..1]
	 */
	public String getOthEntCertType() {
		return OthEntCertType;
	}

	/**
	 * 设置 othEntCertType
	 * 
	 * @param othEntCertType
	 *            企业其他身份标识类型[1..1]
	 */
	public void setOthEntCertType(String othEntCertType) {
		OthEntCertType = othEntCertType;
	}

	/**
	 * 获取 othEntCertNum
	 * 
	 * @return the othEntCertNum 企业其他身份标识号码[1..1]
	 */
	public String getOthEntCertNum() {
		return OthEntCertNum;
	}

	/**
	 * 设置 othEntCertNum
	 * 
	 * @param othEntCertNum
	 *            企业其他身份标识号码[1..1]
	 */
	public void setOthEntCertNum(String othEntCertNum) {
		OthEntCertNum = othEntCertNum;
	}

	/**
	 * 获取 certAssFlg
	 * 
	 * @return the certAssFlg 身份标识关联标志[1..1]
	 */
	public String getCertAssFlg() {
		return CertAssFlg;
	}

	/**
	 * 设置 certAssFlg
	 * 
	 * @param certAssFlg
	 *            身份标识关联标志[1..1]
	 */
	public void setCertAssFlg(String certAssFlg) {
		CertAssFlg = certAssFlg;
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
		return "EnCtfItgInf [InfRecType=" + InfRecType + ", EntName=" + EntName
				+ ", EntCertType=" + EntCertType + ", EntCertNum=" + EntCertNum
				+ ", OthEntCertType=" + OthEntCertType + ", OthEntCertNum="
				+ OthEntCertNum + ", CertAssFlg=" + CertAssFlg + ", RptDate="
				+ RptDate + "]";
	}

}
