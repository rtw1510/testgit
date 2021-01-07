package com.dhcc.xml.ent.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MdfcSgmt<br/>
 * Description: (1)企业借贷账户待更正段
 * ,任选基础段、基本信息段、相关还款责任人段、抵质押品信息段、授信额度信息段、初始债权说明段、还款表现信息段、约定还款信息段、特定交易说明段，
 * 其中一段内容填入即可。 (2)企业授信协议待更正段,任选基础段、共同受信人信息段、额度信息段其中一段内容填入即可。
 * (3)企业最高额保证合同待更正段,任选基础段、联保人信息段、保证额度信息段其中一段内容填入即可。<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD) // 访问类型改为字段
@XmlType(propOrder = { "CtrctBsSgmt", "CtrctCertRelSgmt","CreditLimSgmt" },namespace = "com.dhcc.xml.ent.entity.credit") // 指定序列成的xml节点顺序
public class MdfcSgmt {
	/* 第二类：企业授信协议信息记录信息段 */
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

	public MdfcSgmt() {
		super();
	}

	public CtrctBsSgmt getCtrctBsSgmt() {
		return CtrctBsSgmt;
	}

	public void setCtrctBsSgmt(CtrctBsSgmt ctrctBsSgmt) {
		CtrctBsSgmt = ctrctBsSgmt;
	}

	public com.dhcc.xml.ent.entity.credit.CtrctCertRelSgmt getCtrctCertRelSgmt() {
		return CtrctCertRelSgmt;
	}

	public void setCtrctCertRelSgmt(com.dhcc.xml.ent.entity.credit.CtrctCertRelSgmt ctrctCertRelSgmt) {
		CtrctCertRelSgmt = ctrctCertRelSgmt;
	}

	public CreditLimSgmt getCreditLimSgmt() {
		return CreditLimSgmt;
	}

	public void setCreditLimSgmt(CreditLimSgmt creditLimSgmt) {
		CreditLimSgmt = creditLimSgmt;
	}


}
