package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: IDRec<br/>
 * Description:其他标识信息 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月25日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "OthEntCertType", "OthEntCertNum" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class IDRec {

	/**
	 * 企业身份标识类型[1..1]
	 */
	@XmlElement
	private String OthEntCertType;
	/**
	 * 企业身份标识号码[1..1]
	 */
	@XmlElement
	private String OthEntCertNum;
	/**
	 * 客户号
	 */
	//private String Cust_No;

	public IDRec() {
		super();
	}

	/**
	 * 获取 othEntCertType
	 * 
	 * @return the othEntCertType 企业身份标识类型[1..1]
	 */
	public String getOthEntCertType() {
		return OthEntCertType;
	}

	/**
	 * 设置 othEntCertType
	 * 
	 * @param othEntCertType
	 *            企业身份标识类型[1..1]
	 */
	public void setOthEntCertType(String othEntCertType) {
		OthEntCertType = othEntCertType;
	}

	/**
	 * 获取 othEntCertNum
	 * 
	 * @return the othEntCertNum 企业身份标识号码[1..1]
	 */
	public String getOthEntCertNum() {
		return OthEntCertNum;
	}

	/**
	 * 设置 othEntCertNum
	 * 
	 * @param othEntCertNum
	 *            企业身份标识号码[1..1]
	 */
	public void setOthEntCertNum(String othEntCertNum) {
		OthEntCertNum = othEntCertNum;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IDRec [OthEntCertType=" + OthEntCertType + ", OthEntCertNum="
				+ OthEntCertNum +"]";
	}

}
