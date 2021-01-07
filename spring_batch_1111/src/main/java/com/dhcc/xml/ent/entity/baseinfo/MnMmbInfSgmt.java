package com.dhcc.xml.ent.entity.baseinfo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MnMmbInfSgmt<br/>
 * Description:主要组成人员段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月25日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "MmbNm", "MmbInf", "MnMmbInfoUpDate" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class MnMmbInfSgmt {
	/**
	 *主要组成人员个数[1..1]
	 */
	private String MmbNm;
	/**
	 *->组成人员信息[1..99]
	 */
	private List<com.dhcc.xml.ent.entity.baseinfo.MmbInf> MmbInf;
	/**
	 *信息更新日期[1..1]
	 */
	private String MnMmbInfoUpDate;

	public MnMmbInfSgmt() {
		super();
	}

	/**
	 * 获取 mmbNm
	 * 
	 * @return the mmbNm 主要组成人员个数[1..1]
	 */
	public String getMmbNm() {
		return MmbNm;
	}

	/**
	 * 设置 mmbNm
	 * 
	 * @param mmbNm
	 *            主要组成人员个数[1..1]
	 */
	public void setMmbNm(String mmbNm) {
		MmbNm = mmbNm;
	}

	/**
	 * 获取 mmbInf
	 * 
	 * @return the mmbInf ->组成人员信息[1..99]
	 */
	public List<com.dhcc.xml.ent.entity.baseinfo.MmbInf> getMmbInf() {
		return MmbInf;
	}

	/**
	 * 设置 mmbInf
	 * 
	 * @param mmbInf
	 *            ->组成人员信息[1..99]
	 */
	public void setMmbInf(List<com.dhcc.xml.ent.entity.baseinfo.MmbInf> mmbInf) {
		MmbInf = mmbInf;
	}

	/**
	 * 获取 mnMmbInfoUpDate
	 * 
	 * @return the mnMmbInfoUpDate 信息更新日期[1..1]
	 */
	public String getMnMmbInfoUpDate() {
		return MnMmbInfoUpDate;
	}

	/**
	 * 设置 mnMmbInfoUpDate
	 * 
	 * @param mnMmbInfoUpDate
	 *            信息更新日期[1..1]
	 */
	public void setMnMmbInfoUpDate(String mnMmbInfoUpDate) {
		MnMmbInfoUpDate = mnMmbInfoUpDate;
	}

	@Override
	public String toString() {
		return "MnMmbInfSgmt [MmbNm=" + MmbNm + ", MmbInf=" + MmbInf
				+ ", MnMmbInfoUpDate=" + MnMmbInfoUpDate + "]";
	}

}
