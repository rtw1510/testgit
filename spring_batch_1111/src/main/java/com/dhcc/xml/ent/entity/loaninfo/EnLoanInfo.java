package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnLoanInfo<br/>
 * Description: 企业借贷交易信息组装报文入口<br/>
 * 1)企业借贷账户信息相关记录 2)企业授信协议信息相关记录 3)企业最高额保证合同信息相关记录
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlRootElement(name = "Document")
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "EnAcctInf", "EnAcctInfIDCagsInf", "EnAcctInfMdfc", "EnAcctInfDel", "EnAcctInfEntDel" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// 指定序列成的xml节点顺序
public class EnLoanInfo {
	/**
	 * 企业借贷账户信息记录[1..1]
	 */
	private EnAcctInf EnAcctInf;
	/**
	 * 企业借贷账户标识变更请求记录[1..1]
	 */
	private EnAcctInfIDCagsInf EnAcctInfIDCagsInf;
	/**
	 * 企业借贷账户更正按段请求类记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.loaninfo.EnAcctInfMdfc EnAcctInfMdfc;
	/**
	 * 企业借贷账户按段删除请求类记录[1..1]
	 */
	private EnAcctInfDel EnAcctInfDel;
	/**
	 * 企业借贷账户整笔删除请求类记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.loaninfo.EnAcctInfEntDel EnAcctInfEntDel;

	public EnLoanInfo() {
		super();
	}

	public EnAcctInf getEnAcctInf() {
		return EnAcctInf;
	}

	public void setEnAcctInf(EnAcctInf enAcctInf) {
		EnAcctInf = enAcctInf;
	}

	public EnAcctInfIDCagsInf getEnAcctInfIDCagsInf() {
		return EnAcctInfIDCagsInf;
	}

	public void setEnAcctInfIDCagsInf(EnAcctInfIDCagsInf enAcctInfIDCagsInf) {
		EnAcctInfIDCagsInf = enAcctInfIDCagsInf;
	}

	public com.dhcc.xml.ent.entity.loaninfo.EnAcctInfMdfc getEnAcctInfMdfc() {
		return EnAcctInfMdfc;
	}

	public void setEnAcctInfMdfc(com.dhcc.xml.ent.entity.loaninfo.EnAcctInfMdfc enAcctInfMdfc) {
		EnAcctInfMdfc = enAcctInfMdfc;
	}

	public EnAcctInfDel getEnAcctInfDel() {
		return EnAcctInfDel;
	}

	public void setEnAcctInfDel(EnAcctInfDel enAcctInfDel) {
		EnAcctInfDel = enAcctInfDel;
	}

	public com.dhcc.xml.ent.entity.loaninfo.EnAcctInfEntDel getEnAcctInfEntDel() {
		return EnAcctInfEntDel;
	}

	public void setEnAcctInfEntDel(com.dhcc.xml.ent.entity.loaninfo.EnAcctInfEntDel enAcctInfEntDel) {
		EnAcctInfEntDel = enAcctInfEntDel;
	}

}
