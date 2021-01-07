package com.dhcc.xml.per.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InSecAcctMdfc<br/>
 * Description: 个人担保账户按段更正请求记录<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月28日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "BsSgmt", "MdfcSgmt" },namespace = "com.dhcc.xml.per.entity.guarantee")
// 指定序列成的xml节点顺序
public class InSecAcctMdfc {
	/**
	 * 基础段[1..1]
	 */
	private BsSgmt BsSgmt;
	/**
	 * 待更正的段 [1..1]
	 */
	private MdfcSgmt MdfcSgmt;

	public InSecAcctMdfc() {
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
	 * @return the mdfcSgmt 待更正的段 [1..1]
	 */
	public MdfcSgmt getMdfcSgmt() {
		return MdfcSgmt;
	}

	/**
	 * 设置 mdfcSgmt
	 * 
	 * @param mdfcSgmt
	 *            待更正的段 [1..1]
	 */
	public void setMdfcSgmt(MdfcSgmt mdfcSgmt) {
		MdfcSgmt = mdfcSgmt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InSecAcctMdfc [BsSgmt=" + BsSgmt + ", MdfcSgmt=" + MdfcSgmt
				+ "]";
	}
}
