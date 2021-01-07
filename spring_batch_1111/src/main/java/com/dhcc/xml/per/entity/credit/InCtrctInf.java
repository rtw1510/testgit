package com.dhcc.xml.per.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InCtrctInf<br/>
 * Description:个人授信协议信息记录信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "CtrctBsSgmt", "CtrctCertRelSgmt", "CreditLimSgmt" },namespace = "com.dhcc.xml.per.entity.credit")
public class InCtrctInf {
	/** 基础段[1..1] */
	private CtrctBsSgmt CtrctBsSgmt;
	/** 共同受信人信息段[0..1] */
	private CtrctCertRelSgmt CtrctCertRelSgmt;
	/** 额度信息段[1..1] */
	private CreditLimSgmt CreditLimSgmt;

	public InCtrctInf() {
		super();
	}

	/**
	 * 获取 ctrctBsSgmt
	 * 
	 * @return the ctrctBsSgmt 基础段[1..1]
	 */
	public CtrctBsSgmt getCtrctBsSgmt() {
		return CtrctBsSgmt;
	}

	/**
	 * 设置 ctrctBsSgmt
	 * 
	 * @param ctrctBsSgmt
	 *            基础段[1..1]
	 */
	public void setCtrctBsSgmt(CtrctBsSgmt ctrctBsSgmt) {
		CtrctBsSgmt = ctrctBsSgmt;
	}

	/**
	 * 获取 ctrctCertRelSgmt
	 * 
	 * @return the ctrctCertRelSgmt 共同受信人信息段[0..1]
	 */
	public CtrctCertRelSgmt getCtrctCertRelSgmt() {
		return CtrctCertRelSgmt;
	}

	/**
	 * 设置 ctrctCertRelSgmt
	 * 
	 * @param ctrctCertRelSgmt
	 *            共同受信人信息段[0..1]
	 */
	public void setCtrctCertRelSgmt(CtrctCertRelSgmt ctrctCertRelSgmt) {
		CtrctCertRelSgmt = ctrctCertRelSgmt;
	}

	/**
	 * 获取 creditLimSgmt
	 * 
	 * @return the creditLimSgmt 额度信息段[1..1]
	 */
	public CreditLimSgmt getCreditLimSgmt() {
		return CreditLimSgmt;
	}

	/**
	 * 设置 creditLimSgmt
	 * 
	 * @param creditLimSgmt
	 *            额度信息段[1..1]
	 */
	public void setCreditLimSgmt(CreditLimSgmt creditLimSgmt) {
		CreditLimSgmt = creditLimSgmt;
	}

	@Override
	public String toString() {
		return "InCtrctInf [CtrctBsSgmt=" + CtrctBsSgmt + ", CtrctCertRelSgmt="
				+ CtrctCertRelSgmt + ", CreditLimSgmt=" + CreditLimSgmt + "]";
	}

}
