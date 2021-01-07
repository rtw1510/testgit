package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnAcctInfMdfc<br/>
 * Description: 企业借贷账户更正请求类记录<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "BsSgmt", "MdfcSgmt" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// 指定序列成的xml节点顺序
public class EnAcctInfMdfc {
	/**
	 *基础段[1..1]
	 */
	private BsSgmt BsSgmt;
	/**
	 *待更正的段[1..1]
	 */
	private MdfcSgmt MdfcSgmt;

	public EnAcctInfMdfc() {
		super();
	}

	/**
	 * 获取 bsSgmt
	 * 
	 * @return the bsSgmt 基础段[1..1]
	 */
	public BsSgmt getBsSgmt() {
		return BsSgmt;
	}

	/**
	 * 设置 bsSgmt
	 * 
	 * @param bsSgmt
	 *            基础段[1..1]
	 */
	public void setBsSgmt(BsSgmt bsSgmt) {
		BsSgmt = bsSgmt;
	}

	/**
	 * 获取 mdfcSgmt
	 * 
	 * @return the mdfcSgmt 待更正的段[1..1]
	 */
	public MdfcSgmt getMdfcSgmt() {
		return MdfcSgmt;
	}

	/**
	 * 设置 mdfcSgmt
	 * 
	 * @param mdfcSgmt
	 *            待更正的段[1..1]
	 */
	public void setMdfcSgmt(MdfcSgmt mdfcSgmt) {
		MdfcSgmt = mdfcSgmt;
	}

	@Override
	public String toString() {
		return "EnAcctInfMdfc [BsSgmt=" + BsSgmt + ", MdfcSgmt=" + MdfcSgmt
				+ "]";
	}

}
