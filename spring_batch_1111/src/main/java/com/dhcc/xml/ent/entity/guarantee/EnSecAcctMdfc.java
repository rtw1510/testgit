package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnSecAcctMdfc<br/>
 * Description:企业担保账户更正请求记录信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "BsSgmt", "MdfcSgmt" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class EnSecAcctMdfc {

	/**
	 *企业担保账户基础段[1..1]
	 */
	private com.dhcc.xml.ent.entity.guarantee.BsSgmt BsSgmt;
	/**
	 *企业担保账户记录待更正的段[1..1]
	 */
	private com.dhcc.xml.ent.entity.guarantee.MdfcSgmt MdfcSgmt;

	public EnSecAcctMdfc() {
		super();
	}

	/**
	 * 获取 bsSgmt
	 * 
	 * @return the bsSgmt 企业担保账户基础段[1..1]
	 */
	public com.dhcc.xml.ent.entity.guarantee.BsSgmt getBsSgmt() {
		return BsSgmt;
	}

	/**
	 * 设置 bsSgmt
	 * 
	 * @param bsSgmt
	 *            企业担保账户基础段[1..1]
	 */
	public void setBsSgmt(com.dhcc.xml.ent.entity.guarantee.BsSgmt bsSgmt) {
		BsSgmt = bsSgmt;
	}

	/**
	 * 获取 mdfcSgmt
	 * 
	 * @return the mdfcSgmt 企业担保账户记录待更正的段[1..1]
	 */
	public com.dhcc.xml.ent.entity.guarantee.MdfcSgmt getMdfcSgmt() {
		return MdfcSgmt;
	}

	/**
	 * 设置 mdfcSgmt
	 * 
	 * @param mdfcSgmt
	 *            企业担保账户记录待更正的段[1..1]
	 */
	public void setMdfcSgmt(com.dhcc.xml.ent.entity.guarantee.MdfcSgmt mdfcSgmt) {
		MdfcSgmt = mdfcSgmt;
	}

	@Override
	public String toString() {
		return "EnSecAcctMdfc [BsSgmt=" + BsSgmt + ", MdfcSgmt=" + MdfcSgmt
				+ "]";
	}

}
