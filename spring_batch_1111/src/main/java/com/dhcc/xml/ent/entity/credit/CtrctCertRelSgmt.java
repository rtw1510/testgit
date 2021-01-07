package com.dhcc.xml.ent.entity.credit;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: CtrctCertRelSgmt<br/>
 * Description:企业授信协议信息记录共同受信人信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "BrerNm", "CtrctCertRel" },namespace = "com.dhcc.xml.ent.entity.credit")
// 指定序列成的xml节点顺序
public class CtrctCertRelSgmt {
	/**
	 *共同受信人个数[1..1]
	 */
	private String BrerNm;
	/**
	 *->受信人信息[1..99]
	 */
	private List<CtrctCertRel> CtrctCertRel;

	public CtrctCertRelSgmt() {
		super();
	}

	/**
	 * 获取 brerNm
	 * 
	 * @return the brerNm 共同受信人个数[1..1]
	 */
	public String getBrerNm() {
		return BrerNm;
	}

	/**
	 * 设置 brerNm
	 * 
	 * @param brerNm
	 *            共同受信人个数[1..1]
	 */
	public void setBrerNm(String brerNm) {
		BrerNm = brerNm;
	}

	/**
	 * 获取 ctrctCertRel
	 * 
	 * @return the ctrctCertRel ->受信人信息[1..99]
	 */
	public List<CtrctCertRel> getCtrctCertRel() {
		return CtrctCertRel;
	}

	/**
	 * 设置 ctrctCertRel
	 * 
	 * @param ctrctCertRel
	 *            ->受信人信息[1..99]
	 */
	public void setCtrctCertRel(List<CtrctCertRel> ctrctCertRel) {
		CtrctCertRel = ctrctCertRel;
	}

	@Override
	public String toString() {
		return "CtrctCertRelSgmt [BrerNm=" + BrerNm + ", CtrctCertRel="
				+ CtrctCertRel + "]";
	}

}
