package com.dhcc.xml.ent.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.dhcc.xml.ent.entity.credit.EnCtrctInf;
import com.dhcc.xml.ent.entity.credit.EnCtrctInfDel;
import com.dhcc.xml.ent.entity.credit.EnCtrctInfEntDel;
import com.dhcc.xml.ent.entity.credit.EnCtrctInfIDCagsInf;
import com.dhcc.xml.ent.entity.credit.EnCtrctInfMdfc;

@XmlRootElement(name = "Document")
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "EnCtrctInf", "EnCtrctInfIDCagsInf", "EnCtrctInfMdfc", "EnCtrctInfDel", "EnCtrctInfEntDel" },namespace = "com.dhcc.xml.ent.entity.credit")
public class EnCredit {

	/**
	 * 企业授信协议信息记录[1..1]
	 */
	private EnCtrctInf EnCtrctInf;

	/**
	 * 企业授信协议标识变更请求记录[1..1]
	 */
	private EnCtrctInfIDCagsInf EnCtrctInfIDCagsInf;

	/**
	 * 企业授信协议按段更正请求类记录[1..1]
	 */
	private EnCtrctInfMdfc EnCtrctInfMdfc;

	/**
	 * 企业授信协议按段删除请求类记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.credit.EnCtrctInfDel EnCtrctInfDel;

	/**
	 * 企业授信协议整笔删除请求类记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.credit.EnCtrctInfEntDel EnCtrctInfEntDel;

	public EnCtrctInf getEnCtrctInf() {
		return EnCtrctInf;
	}

	public void setEnCtrctInf(EnCtrctInf enCtrctInf) {
		EnCtrctInf = enCtrctInf;
	}

	public EnCtrctInfIDCagsInf getEnCtrctInfIDCagsInf() {
		return EnCtrctInfIDCagsInf;
	}

	public void setEnCtrctInfIDCagsInf(EnCtrctInfIDCagsInf enCtrctInfIDCagsInf) {
		EnCtrctInfIDCagsInf = enCtrctInfIDCagsInf;
	}

	public EnCtrctInfMdfc getEnCtrctInfMdfc() {
		return EnCtrctInfMdfc;
	}

	public void setEnCtrctInfMdfc(EnCtrctInfMdfc enCtrctInfMdfc) {
		EnCtrctInfMdfc = enCtrctInfMdfc;
	}

	public com.dhcc.xml.ent.entity.credit.EnCtrctInfDel getEnCtrctInfDel() {
		return EnCtrctInfDel;
	}

	public void setEnCtrctInfDel(com.dhcc.xml.ent.entity.credit.EnCtrctInfDel enCtrctInfDel) {
		EnCtrctInfDel = enCtrctInfDel;
	}

	public com.dhcc.xml.ent.entity.credit.EnCtrctInfEntDel getEnCtrctInfEntDel() {
		return EnCtrctInfEntDel;
	}

	public void setEnCtrctInfEntDel(com.dhcc.xml.ent.entity.credit.EnCtrctInfEntDel enCtrctInfEntDel) {
		EnCtrctInfEntDel = enCtrctInfEntDel;
	}

}
