package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MmbInf<br/>
 * Description: 企业基本信息记录其他证件信息<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月25日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "MmbAlias", "MmbIDType", "MmbIDNum", "MmbPstn" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class MmbInf {
	/**
	 * 组成人员姓名[1..1]
	 */
	private String MmbAlias;
	/**
	 * 组成人员证件类型[1..1]
	 */
	private String MmbIDType;
	/**
	 * 组成人员证件号码[1..1]
	 */
	private String MmbIDNum;
	/**
	 * 组成人员职位[1..1]
	 */
	private String MmbPstn;

	public MmbInf() {
		super();
	}

	/**
	 * 获取 mmbAlias
	 * 
	 * @return the mmbAlias 组成人员姓名[1..1]
	 */
	public String getMmbAlias() {
		return MmbAlias;
	}

	/**
	 * 设置 mmbAlias
	 * 
	 * @param mmbAlias
	 *            组成人员姓名[1..1]
	 */
	public void setMmbAlias(String mmbAlias) {
		MmbAlias = mmbAlias;
	}

	/**
	 * 获取 mmbIDType
	 * 
	 * @return the mmbIDType 组成人员证件类型[1..1]
	 */
	public String getMmbIDType() {
		return MmbIDType;
	}

	/**
	 * 设置 mmbIDType
	 * 
	 * @param mmbIDType
	 *            组成人员证件类型[1..1]
	 */
	public void setMmbIDType(String mmbIDType) {
		MmbIDType = mmbIDType;
	}

	/**
	 * 获取 mmbIDNum
	 * 
	 * @return the mmbIDNum 组成人员证件号码[1..1]
	 */
	public String getMmbIDNum() {
		return MmbIDNum;
	}

	/**
	 * 设置 mmbIDNum
	 * 
	 * @param mmbIDNum
	 *            组成人员证件号码[1..1]
	 */
	public void setMmbIDNum(String mmbIDNum) {
		MmbIDNum = mmbIDNum;
	}

	/**
	 * 获取 mmbPstn
	 * 
	 * @return the mmbPstn 组成人员职位[1..1]
	 */
	public String getMmbPstn() {
		return MmbPstn;
	}

	/**
	 * 设置 mmbPstn
	 * 
	 * @param mmbPstn
	 *            组成人员职位[1..1]
	 */
	public void setMmbPstn(String mmbPstn) {
		MmbPstn = mmbPstn;
	}

	@Override
	public String toString() {
		return "MmbInf [MmbAlias=" + MmbAlias + ", MmbIDType=" + MmbIDType
				+ ", MmbIDNum=" + MmbIDNum + ", MmbPstn=" + MmbPstn + "]";
	}

}
