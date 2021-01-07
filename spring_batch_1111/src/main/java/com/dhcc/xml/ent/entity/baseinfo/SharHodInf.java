package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: SharHodInf<br/>
 * Description:????????? <br/>
 * 
 * @author ChenJingYuan
 * @date 2018??1??25??
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "SharHodType", "SharHodCertType", "SharHodName",
		"SharHodIDType", "SharHodIDNum", "InvRatio" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class SharHodInf {
	/**
	 *??????????[0..1]
	 */
	private String SharHodType;
	/**
	 *????????????[0..1]
	 */
	private String SharHodCertType;
	/**
	 *??????????[0..1]
	 */
	private String SharHodName;
	/**
	 *???????????????[0..1]
	 */
	private String SharHodIDType;
	/**
	 *???????????????[0..1]
	 */
	private String SharHodIDNum;
	/**
	 *???????[0..1]
	 */
	private String InvRatio;

	public SharHodInf() {
		super();
	}

	/**
	 * ??? sharHodType
	 * 
	 * @return the sharHodType ??????????[0..1]
	 */
	public String getSharHodType() {
		return SharHodType;
	}

	/**
	 * ???? sharHodType
	 * 
	 * @param sharHodType
	 *            ??????????[0..1]
	 */
	public void setSharHodType(String sharHodType) {
		SharHodType = sharHodType;
	}

	/**
	 * ??? sharHodCertType
	 * 
	 * @return the sharHodCertType ????????????[0..1]
	 */
	public String getSharHodCertType() {
		return SharHodCertType;
	}

	/**
	 * ???? sharHodCertType
	 * 
	 * @param sharHodCertType
	 *            ????????????[0..1]
	 */
	public void setSharHodCertType(String sharHodCertType) {
		SharHodCertType = sharHodCertType;
	}

	/**
	 * ??? sharHodName
	 * 
	 * @return the sharHodName ??????????[0..1]
	 */
	public String getSharHodName() {
		return SharHodName;
	}

	/**
	 * ???? sharHodName
	 * 
	 * @param sharHodName
	 *            ??????????[0..1]
	 */
	public void setSharHodName(String sharHodName) {
		SharHodName = sharHodName;
	}

	/**
	 * ??? sharHodIDType
	 * 
	 * @return the sharHodIDType ???????????????[0..1]
	 */
	public String getSharHodIDType() {
		return SharHodIDType;
	}

	/**
	 * ???? sharHodIDType
	 * 
	 * @param sharHodIDType
	 *            ???????????????[0..1]
	 */
	public void setSharHodIDType(String sharHodIDType) {
		SharHodIDType = sharHodIDType;
	}

	/**
	 * ??? sharHodIDNum
	 * 
	 * @return the sharHodIDNum ???????????????[0..1]
	 */
	public String getSharHodIDNum() {
		return SharHodIDNum;
	}

	/**
	 * ???? sharHodIDNum
	 * 
	 * @param sharHodIDNum
	 *            ???????????????[0..1]
	 */
	public void setSharHodIDNum(String sharHodIDNum) {
		SharHodIDNum = sharHodIDNum;
	}

	/**
	 * ??? invRatio
	 * 
	 * @return the invRatio ???????[0..1]
	 */
	public String getInvRatio() {
		return InvRatio;
	}

	/**
	 * ???? invRatio
	 * 
	 * @param invRatio
	 *            ???????[0..1]
	 */
	public void setInvRatio(String invRatio) {
		InvRatio = invRatio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SharHodInf [InvRatio=" + InvRatio + ", SharHodCertType="
				+ SharHodCertType + ", SharHodIDNum=" + SharHodIDNum
				+ ", SharHodIDType=" + SharHodIDType + ", SharHodName="
				+ SharHodName + ", SharHodType=" + SharHodType + "]";
	}
}
