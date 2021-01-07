package com.dhcc.xml.ent.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnCtrctInf<br/>
 * Description:企业授信协议信息记录信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "CtrctBsSgmt", "CtrctCertRelSgmt", "CreditLimSgmt" },namespace = "com.dhcc.xml.ent.entity.credit")
// 指定序列成的xml节点顺序
public class EnCtrctInf {
	/**
	 *基础段 [1..1]
	 */
	private CtrctBsSgmt CtrctBsSgmt;
	/**
	 *共同受信人信息段 [0..1]
	 */
	private com.dhcc.xml.ent.entity.credit.CtrctCertRelSgmt CtrctCertRelSgmt;
	/**
	 *额度信息段 [1..1]
	 */
	private CreditLimSgmt CreditLimSgmt;

	public EnCtrctInf() {
		super();
	}

	/**
	 * 获取 ctrctBsSgmt
	 * 
	 * @return the ctrctBsSgmt 基础段 [1..1]
	 */
	public CtrctBsSgmt getCtrctBsSgmt() {
		return CtrctBsSgmt;
	}

	/**
	 * 设置 ctrctBsSgmt
	 * 
	 * @param ctrctBsSgmt
	 *            基础段 [1..1]
	 */
	public void setCtrctBsSgmt(CtrctBsSgmt ctrctBsSgmt) {
		CtrctBsSgmt = ctrctBsSgmt;
	}

	/**
	 * 获取 ctrctCertRelSgmt
	 * 
	 * @return the ctrctCertRelSgmt 共同受信人信息段 [0..1]
	 */
	public com.dhcc.xml.ent.entity.credit.CtrctCertRelSgmt getCtrctCertRelSgmt() {
		return CtrctCertRelSgmt;
	}

	/**
	 * 设置 ctrctCertRelSgmt
	 * 
	 * @param ctrctCertRelSgmt
	 *            共同受信人信息段 [0..1]
	 */
	public void setCtrctCertRelSgmt(com.dhcc.xml.ent.entity.credit.CtrctCertRelSgmt ctrctCertRelSgmt) {
		CtrctCertRelSgmt = ctrctCertRelSgmt;
	}

	/**
	 * 获取 creditLimSgmt
	 * 
	 * @return the creditLimSgmt 额度信息段 [1..1]
	 */
	public CreditLimSgmt getCreditLimSgmt() {
		return CreditLimSgmt;
	}

	/**
	 * 设置 creditLimSgmt
	 * 
	 * @param creditLimSgmt
	 *            额度信息段 [1..1]
	 */
	public void setCreditLimSgmt(CreditLimSgmt creditLimSgmt) {
		CreditLimSgmt = creditLimSgmt;
	}

	@Override
	public String toString() {
		return "EnCtrctInf [CtrctBsSgmt=" + CtrctBsSgmt + ", CtrctCertRelSgmt="
				+ CtrctCertRelSgmt + ", CreditLimSgmt=" + CreditLimSgmt + "]";
	}

}
