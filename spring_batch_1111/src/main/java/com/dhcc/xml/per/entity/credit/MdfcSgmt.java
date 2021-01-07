package com.dhcc.xml.per.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MdfcSgmt<br/>
 * Description: 待更正段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "CtrctBsSgmt", "CtrctCertRelSgmt", "CreditLimSgmt" },namespace = "com.dhcc.xml.per.entity.credit")
// 字段展示先后顺序
public class MdfcSgmt {

	/** 基础段[1..1] */
	private CtrctBsSgmt CtrctBsSgmt;
	/** 共同受信人信息段[0..1] */
	private CtrctCertRelSgmt CtrctCertRelSgmt;
	/** 额度信息段[1..1] */
	private CreditLimSgmt CreditLimSgmt;

	public MdfcSgmt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CtrctBsSgmt getCtrctBsSgmt() {
		return CtrctBsSgmt;
	}

	public void setCtrctBsSgmt(CtrctBsSgmt ctrctBsSgmt) {
		CtrctBsSgmt = ctrctBsSgmt;
	}

	public CtrctCertRelSgmt getCtrctCertRelSgmt() {
		return CtrctCertRelSgmt;
	}

	public void setCtrctCertRelSgmt(CtrctCertRelSgmt ctrctCertRelSgmt) {
		CtrctCertRelSgmt = ctrctCertRelSgmt;
	}

	public CreditLimSgmt getCreditLimSgmt() {
		return CreditLimSgmt;
	}

	public void setCreditLimSgmt(CreditLimSgmt creditLimSgmt) {
		CreditLimSgmt = creditLimSgmt;
	}

}
