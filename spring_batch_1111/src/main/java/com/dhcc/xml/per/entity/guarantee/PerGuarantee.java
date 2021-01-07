package com.dhcc.xml.per.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: PerGuarantee<br/>
 * Description:个人担保交易信息 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlRootElement(name = "Document")
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "InSecAcctInf", "InSecAcctIDCagsInf", "InSecAcctMdfc",
		"InSecAcctDel", "InSecAcctEntDel" },namespace = "com.dhcc.xml.per.entity.guarantee")
// 指定序列成的xml节点顺序
public class PerGuarantee {
	
	
	/** 个人担保账户信息记录[1..1] */
	private InSecAcctInf InSecAcctInf;
	
	
	/** 个人担保账户标识变更请求记录[1..1] */
	private InSecAcctIDCagsInf InSecAcctIDCagsInf;
	
	
	/** 个人担保账户按段更正请求记录[1..1] */
	private InSecAcctMdfc InSecAcctMdfc;
	
	
	/** 个人担保账户按段删除请求记录[1..1] */
	private InSecAcctDel InSecAcctDel;
	
	
	/** 个人担保账户整笔删除请求记录[1..1] */
	private InSecAcctEntDel InSecAcctEntDel;

	public PerGuarantee() {
		super();
	}

	/**
	 * 获取 inSecAcctInf
	 * 
	 * @return the inSecAcctInf 个人担保账户信息记录[1..1]
	 */
	public InSecAcctInf getInSecAcctInf() {
		return InSecAcctInf;
	}

	/**
	 * 设置 inSecAcctInf
	 * 
	 * @param inSecAcctInf
	 *            个人担保账户信息记录[1..1]
	 */
	public void setInSecAcctInf(InSecAcctInf inSecAcctInf) {
		InSecAcctInf = inSecAcctInf;
	}

	/**
	 * 获取 inSecAcctIDCagsInf
	 * 
	 * @return the inSecAcctIDCagsInf 个人担保账户标识变更请求记录[1..1]
	 */
	public InSecAcctIDCagsInf getInSecAcctIDCagsInf() {
		return InSecAcctIDCagsInf;
	}

	/**
	 * 设置 inSecAcctIDCagsInf
	 * 
	 * @param inSecAcctIDCagsInf
	 *            个人担保账户标识变更请求记录[1..1]
	 */
	public void setInSecAcctIDCagsInf(InSecAcctIDCagsInf inSecAcctIDCagsInf) {
		InSecAcctIDCagsInf = inSecAcctIDCagsInf;
	}

	/**
	 * 获取 inSecAcctMdfc
	 * 
	 * @return the inSecAcctMdfc 个人担保账户按段更正请求记录[1..1]
	 */
	public InSecAcctMdfc getInSecAcctMdfc() {
		return InSecAcctMdfc;
	}

	/**
	 * 设置 inSecAcctMdfc
	 * 
	 * @param inSecAcctMdfc
	 *            个人担保账户按段更正请求记录[1..1]
	 */
	public void setInSecAcctMdfc(InSecAcctMdfc inSecAcctMdfc) {
		InSecAcctMdfc = inSecAcctMdfc;
	}

	/**
	 * 获取 inSecAcctDel
	 * 
	 * @return the inSecAcctDel 个人担保账户按段删除请求记录[1..1]
	 */
	public InSecAcctDel getInSecAcctDel() {
		return InSecAcctDel;
	}

	/**
	 * 设置 inSecAcctDel
	 * 
	 * @param inSecAcctDel
	 *            个人担保账户按段删除请求记录[1..1]
	 */
	public void setInSecAcctDel(InSecAcctDel inSecAcctDel) {
		InSecAcctDel = inSecAcctDel;
	}

	/**
	 * 获取 inSecAcctEntDel
	 * 
	 * @return the inSecAcctEntDel 个人担保账户整笔删除请求记录[1..1]
	 */
	public InSecAcctEntDel getInSecAcctEntDel() {
		return InSecAcctEntDel;
	}

	/**
	 * 设置 inSecAcctEntDel
	 * 
	 * @param inSecAcctEntDel
	 *            个人担保账户整笔删除请求记录[1..1]
	 */
	public void setInSecAcctEntDel(InSecAcctEntDel inSecAcctEntDel) {
		InSecAcctEntDel = inSecAcctEntDel;
	}

	@Override
	public String toString() {
		return "PerGuarantee [InSecAcctInf=" + InSecAcctInf
				+ ", InSecAcctIDCagsInf=" + InSecAcctIDCagsInf
				+ ", InSecAcctMdfc=" + InSecAcctMdfc + ", InSecAcctDel="
				+ InSecAcctDel + ", InSecAcctEntDel=" + InSecAcctEntDel + "]";
	}
}
