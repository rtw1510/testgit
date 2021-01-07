package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: BsSgmt<br/>
 * Description:企业担保账户更正请求记录基础段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfRecType", "ModRecCode", "RptDate","AcctType","MdfcSgmtCode" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class BsSgmt {

	/**
	 *信息记录类型[1..1]
	 */
	private String InfRecType;
	/**
	 *待更正业务标识[1..1]
	 */
	private String ModRecCode;
	/**
	 *信息报告日期[1..1]
	 */
	private String RptDate;
	/**
	 *账户类型
	 */  
	private String AcctType;
	/**
	 *待更正段段标[1..1]
	 */
	private String MdfcSgmtCode;

	public BsSgmt() {
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
	 * 获取 modRecCode
	 * 
	 * @return the modRecCode 待更正业务标识[1..1]
	 */
	public String getModRecCode() {
		return ModRecCode;
	}

	/**
	 * 设置 modRecCode
	 * 
	 * @param modRecCode
	 *            待更正业务标识[1..1]
	 */
	public void setModRecCode(String modRecCode) {
		ModRecCode = modRecCode;
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

	/**
	 * 获取 mdfcSgmtCode
	 * 
	 * @return the mdfcSgmtCode 待更正段段标[1..1]
	 */
	public String getMdfcSgmtCode() {
		return MdfcSgmtCode;
	}

	/**
	 * 设置 mdfcSgmtCode
	 * 
	 * @param mdfcSgmtCode
	 *            待更正段段标[1..1]
	 */
	public void setMdfcSgmtCode(String mdfcSgmtCode) {
		MdfcSgmtCode = mdfcSgmtCode;
	}

	/**  
	 * 获取 acctType
	 * @return the acctType 账户类型 
	 */
	public String getAcctType() {
		return AcctType;
	}

	/**  
	 * 设置 acctType  
	 * @param acctType 账户类型  
	 */
	public void setAcctType(String acctType) {
		AcctType = acctType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BsSgmt [AcctType=" + AcctType + ", InfRecType=" + InfRecType
				+ ", MdfcSgmtCode=" + MdfcSgmtCode + ", ModRecCode="
				+ ModRecCode + ", RptDate=" + RptDate + "]";
	}
}
