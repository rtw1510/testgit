package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnAcctInfIDCagsInf<br/>
 * Description:企业借贷账户信息标识变更请求记录 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "InfRecType", "OdBnesCode", "NwBnesCode" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// 指定序列成的xml节点顺序
public class EnAcctInfIDCagsInf {
	/**
	 *信息记录类型[1..1]
	 */
	private String InfRecType;
	/**
	 *原业务标识号码[1..1]
	 */
	private String OdBnesCode;
	/**
	 *新业务标识号码[1..1]
	 */
	private String NwBnesCode;

	public EnAcctInfIDCagsInf() {
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
	 * @return the odBnesCode 原业务标识号码[1..1]
	 */
	public String getOdBnesCode() {
		return OdBnesCode;
	}

	/**
	 * 设置 odBnesCode
	 * 
	 * @param odBnesCode
	 *            原业务标识号码[1..1]
	 */
	public void setOdBnesCode(String odBnesCode) {
		OdBnesCode = odBnesCode;
	}

	/**
	 * 获取 nwBnesCode
	 * 
	 * @return the nwBnesCode 新业务标识号码[1..1]
	 */
	public String getNwBnesCode() {
		return NwBnesCode;
	}

	/**
	 * 设置 nwBnesCode
	 * 
	 * @param nwBnesCode
	 *            新业务标识号码[1..1]
	 */
	public void setNwBnesCode(String nwBnesCode) {
		NwBnesCode = nwBnesCode;
	}

	@Override
	public String toString() {
		return "EnAcctInfIDCagsInf [InfRecType=" + InfRecType + ", OdBnesCode="
				+ OdBnesCode + ", NwBnesCode=" + NwBnesCode + "]";
	}

}
