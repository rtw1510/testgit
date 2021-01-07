package com.dhcc.xml.per.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Document")
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "InCtrctInf", "InCtrctIDCagsInf", "InCtrctMdfc",
		"InCtrctDel", "InCtrctEntDel" },namespace = "com.dhcc.xml.per.entity.credit")
// 指定序列成的xml节点顺序
public class PerCredit {
	/**
	 * 个人授信协议信息记录220
	 */
	private InCtrctInf InCtrctInf;
	/**
	 * 个人授信协议标识变更请求记录221
	 */
	private InCtrctIDCagsInf InCtrctIDCagsInf;
	/**
	 * 个人授信协议按段更正请求记录222
	 */
	private InCtrctMdfc InCtrctMdfc;
	/**
	 * 个人授信协议按段删除请求记录223
	 */
	private InCtrctDel InCtrctDel;
	/**
	 * 个人授信协议整笔删除请求记录224
	 */
	private InCtrctEntDel InCtrctEntDel;

	public PerCredit() {
		super();
	}

	public InCtrctInf getInCtrctInf() {
		return InCtrctInf;
	}

	public void setInCtrctInf(InCtrctInf inCtrctInf) {
		InCtrctInf = inCtrctInf;
	}

	public InCtrctIDCagsInf getInCtrctIDCagsInf() {
		return InCtrctIDCagsInf;
	}

	public void setInCtrctIDCagsInf(InCtrctIDCagsInf inCtrctIDCagsInf) {
		InCtrctIDCagsInf = inCtrctIDCagsInf;
	}

	public InCtrctMdfc getInCtrctMdfc() {
		return InCtrctMdfc;
	}

	public void setInCtrctMdfc(InCtrctMdfc inCtrctMdfc) {
		InCtrctMdfc = inCtrctMdfc;
	}

	public InCtrctDel getInCtrctDel() {
		return InCtrctDel;
	}

	public void setInCtrctDel(InCtrctDel inCtrctDel) {
		InCtrctDel = inCtrctDel;
	}

	public InCtrctEntDel getInCtrctEntDel() {
		return InCtrctEntDel;
	}

	public void setInCtrctEntDel(InCtrctEntDel inCtrctEntDel) {
		InCtrctEntDel = inCtrctEntDel;
	}
	
}
