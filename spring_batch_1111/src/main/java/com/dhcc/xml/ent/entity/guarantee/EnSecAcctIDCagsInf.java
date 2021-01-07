package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnSecAcctIDCagsInf<br/>
 * Description:企业担保账户标识变更请求记录 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfRecType", "OdBnesCode", "NwBnesCode" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class EnSecAcctIDCagsInf {
	/**
	 *信息记录类型[1..1]
	 */
	private String InfRecType;
	/**
	 *原业务标识号[1..1]
	 */
	private String OdBnesCode;
	/**
	 *新业务标识号[1..1]
	 */
	private String NwBnesCode;

	public EnSecAcctIDCagsInf() {
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

	@Override
	public String toString() {
		return "EnSecAcctIDCagsInf [InfRecType=" + InfRecType + ", OdBnesCode="
				+ OdBnesCode + ", NwBnesCode=" + NwBnesCode + "]";
	}

}
