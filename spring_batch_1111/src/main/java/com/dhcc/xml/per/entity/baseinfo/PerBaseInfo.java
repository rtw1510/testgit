package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: PerBaseInfo<br/>
 * Description: 二代征信个人基本信息报文入口类<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlRootElement(name = "Document")
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "InBasInf", "InFalMmbsInf", "InIDEfctInf",
		"InCtfItgInf", "InBsInfDlt", "InIDEfctInfDlt" },namespace = "com.dhcc.xml.per.entity.baseinfo")
// 指定序列成的xml节点顺序
public class PerBaseInfo {
	/**
	 * 个人基本信息记录-110
	 */
	private InBasInf InBasInf;
	/**
	 * 家族关系信息记录-120
	 */
	private InFalMmbsInf InFalMmbsInf;
	/**
	 * 个人证件有效期信息记录-130
	 */
	private InIDEfctInf InIDEfctInf;
	/**
	 * 个人证件整合信息记录-140
	 */
	private InCtfItgInf InCtfItgInf;
	/**
	 * 个人基本信息整笔删除请求记录-114
	 */
	private InBsInfDlt InBsInfDlt;
	/**
	 * 个人证件有效期整笔删除请求记录-134
	 */
	private InIDEfctInfDlt InIDEfctInfDlt;
	public PerBaseInfo() {
		super();
	}
	/**
	 * 获取 inBasInf
	 * @return the inBasInf 个人基本信息记录
	 */
	public InBasInf getInBasInf() {
		return InBasInf;
	}
	/**
	 * 设置 inBasInf
	 * @param inBasInf 个人基本信息记录
	 */
	public void setInBasInf(InBasInf inBasInf) {
		InBasInf = inBasInf;
	}
	/**
	 * 获取 inFalMmbsInf
	 * @return the inFalMmbsInf 家族关系信息记录
	 */
	public InFalMmbsInf getInFalMmbsInf() {
		return InFalMmbsInf;
	}
	/**
	 * 设置 inFalMmbsInf
	 * @param inFalMmbsInf 家族关系信息记录
	 */
	public void setInFalMmbsInf(InFalMmbsInf inFalMmbsInf) {
		InFalMmbsInf = inFalMmbsInf;
	}
	/**
	 * 获取 inIDEfctInf
	 * @return the inIDEfctInf 个人证件有效期信息记录
	 */
	public InIDEfctInf getInIDEfctInf() {
		return InIDEfctInf;
	}
	/**
	 * 设置 inIDEfctInf
	 * @param inIDEfctInf 个人证件有效期信息记录
	 */
	public void setInIDEfctInf(InIDEfctInf inIDEfctInf) {
		InIDEfctInf = inIDEfctInf;
	}
	/**
	 * 获取 inCtfItgInf
	 * @return the inCtfItgInf 个人证件整合信息记录
	 */
	public InCtfItgInf getInCtfItgInf() {
		return InCtfItgInf;
	}
	/**
	 * 设置 inCtfItgInf
	 * @param inCtfItgInf 个人证件整合信息记录
	 */
	public void setInCtfItgInf(InCtfItgInf inCtfItgInf) {
		InCtfItgInf = inCtfItgInf;
	}
	/**
	 * 获取 inBsInfDlt
	 * @return the inBsInfDlt 个人基本信息整笔删除请求记录
	 */
	public InBsInfDlt getInBsInfDlt() {
		return InBsInfDlt;
	}
	/**
	 * 设置 inBsInfDlt
	 * @param inBsInfDlt 个人基本信息整笔删除请求记录
	 */
	public void setInBsInfDlt(InBsInfDlt inBsInfDlt) {
		InBsInfDlt = inBsInfDlt;
	}
	/**
	 * 获取 inIDEfctInfDlt
	 * @return the inIDEfctInfDlt 个人证件有效期整笔删除请求记录
	 */
	public InIDEfctInfDlt getInIDEfctInfDlt() {
		return InIDEfctInfDlt;
	}
	/**
	 * 设置 inIDEfctInfDlt
	 * @param inIDEfctInfDlt 个人证件有效期整笔删除请求记录
	 */
	public void setInIDEfctInfDlt(InIDEfctInfDlt inIDEfctInfDlt) {
		InIDEfctInfDlt = inIDEfctInfDlt;
	}
	@Override
	public String toString() {
		return "PerBaseInfo [InBasInf=" + InBasInf + ", InFalMmbsInf="
				+ InFalMmbsInf + ", InIDEfctInf=" + InIDEfctInf
				+ ", InCtfItgInf=" + InCtfItgInf + ", InBsInfDlt=" + InBsInfDlt
				+ ", InIDEfctInfDlt=" + InIDEfctInfDlt + "]";
	}
}
