package com.dhcc.xml.per.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InSecAcctIDCagsInf<br/>
 * Description: 个人担保账户标识变更请求记录<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月28日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "InfRecType", "OdBnesCode", "NwBnesCode" },namespace = "com.dhcc.xml.per.entity.guarantee")
// 指定序列成的xml节点顺序
public class InSecAcctIDCagsInf {
	/**
	 * 信息记录类型[1..1]
	 */
	private String InfRecType;
	/**
	 * 原业务标识号[1..1]
	 */
	private String OdBnesCode;
	/**
	 * 新业务标识号[1..1]
	 */
	private String NwBnesCode;

	public InSecAcctIDCagsInf() {
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
	 * 获取 odBnesCode
	 * 
	 * @return the odBnesCode 原业务标识号[1..1]
	 */
	public String getOdBnesCode() {
		return OdBnesCode;
	}

	/**
	 * 设置 odBnesCode
	 * 
	 * @param odBnesCode
	 *            原业务标识号[1..1]
	 */
	public void setOdBnesCode(String odBnesCode) {
		OdBnesCode = odBnesCode;
	}

	/**
	 * 获取 nwBnesCode
	 * 
	 * @return the nwBnesCode 新业务标识号[1..1]
	 */
	public String getNwBnesCode() {
		return NwBnesCode;
	}

	/**
	 * 设置 nwBnesCode
	 * 
	 * @param nwBnesCode
	 *            新业务标识号[1..1]
	 */
	public void setNwBnesCode(String nwBnesCode) {
		NwBnesCode = nwBnesCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InSecAcctIDCagsInf [InfRecType=" + InfRecType + ", OdBnesCode="
				+ OdBnesCode + ", NwBnesCode=" + NwBnesCode + "]";
	}
}
