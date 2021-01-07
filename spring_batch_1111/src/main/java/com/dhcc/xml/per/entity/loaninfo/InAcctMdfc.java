package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InAcctMdfc<br/>
 * Description: 个人借贷账户按段更正请求记录信息段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "BsSgmt", "MdfcSgmt" },namespace = "com.dhcc.xml.per.entity.loaninfo")
// 指定序列成的xml节点顺序
public class InAcctMdfc {
	/**
	 * 基础段
	 */
	private BsSgmt BsSgmt;
	/**
	 * 待更正的段
	 */
	private MdfcSgmt MdfcSgmt;

	public InAcctMdfc() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取 bsSgmt
	 * 
	 * @return the bsSgmt 基础段
	 */
	public BsSgmt getBsSgmt() {
		return BsSgmt;
	}

	/**
	 * 设置 bsSgmt
	 * 
	 * @param bsSgmt
	 *            基础段
	 */
	public void setBsSgmt(BsSgmt bsSgmt) {
		BsSgmt = bsSgmt;
	}

	/**
	 * 获取 mdfcSgmt
	 * 
	 * @return the mdfcSgmt 待更正的段
	 */
	public MdfcSgmt getMdfcSgmt() {
		return MdfcSgmt;
	}

	/**
	 * 设置 mdfcSgmt
	 * 
	 * @param mdfcSgmt
	 *            待更正的段
	 */
	public void setMdfcSgmt(MdfcSgmt mdfcSgmt) {
		MdfcSgmt = mdfcSgmt;
	}

	@Override
	public String toString() {
		return "InAcctMdfc [BsSgmt=" + BsSgmt + ", MdfcSgmt=" + MdfcSgmt + "]";
	}
}
