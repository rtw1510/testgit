package com.dhcc.xml.per.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Title: CtrctCertRelSgmt<br/>
 * Description:共同受信人信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "BrerNm", "CtrctCertRel" },namespace = "com.dhcc.xml.per.entity.credit")
public class CtrctCertRelSgmt {
	/**
	 * 共同受信人个数 [1..1]
	 */
	private String BrerNm;
	/**
	 * →受信人信息 [1..99]
	 */
	private List<CtrctCertRel> CtrctCertRel;

	public CtrctCertRelSgmt() {
		super();
	}

	/**
	 * 获取 brerNm
	 * 
	 * @return the brerNm 共同受信人个数 [1..1]
	 */
	public String getBrerNm() {
		return BrerNm;
	}

	/**
	 * 设置 brerNm
	 * 
	 * @param brerNm
	 *            共同受信人个数 [1..1]
	 */
	public void setBrerNm(String brerNm) {
		BrerNm = brerNm;
	}

	/**
	 * 获取 ctrctCertRel
	 * 
	 * @return the ctrctCertRel →受信人信息 [1..99]
	 */
	public List<CtrctCertRel> getCtrctCertRel() {
		return CtrctCertRel;
	}

	/**
	 * 设置 ctrctCertRel
	 * 
	 * @param ctrctCertRel
	 *            →受信人信息 [1..99]
	 */
	public void setCtrctCertRel(List<CtrctCertRel> ctrctCertRel) {
		CtrctCertRel = ctrctCertRel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CtrctCertRelSgmt [BrerNm=" + BrerNm + ", CtrctCertRel="
				+ CtrctCertRel + "]";
	}
}
