package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnBaseInfo<br/>
 * Description:二代征信企业基本信息报文入口类 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月25日
 */
@XmlRootElement(name = "Document")
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "EnBasInf", "EnCtfItgInf", "EnIcdnRltpInf", "EnBsInfDlt" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
// 指定序列成的xml节点顺序
public class EnBaseInfo {
	/**
	 *企业基本信息记录[1..1]
	 */
	private EnBasInf EnBasInf;
	/**
	 *企业身份标识整合信息记录[1..1]
	 */
	private EnCtfItgInf EnCtfItgInf;
	/**
	 *企业间关联关系信息记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.baseinfo.EnIcdnRltpInf EnIcdnRltpInf;
	/**
	 *企业基本信息删除请求记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.baseinfo.EnBsInfDlt EnBsInfDlt;

	public EnBaseInfo() {
		super();
	}

	/**  
	 * 获取 enBasInf
	 * @return the enBasInf 企业基本信息记录[1..1] 
	 */
	public EnBasInf getEnBasInf() {
		return EnBasInf;
	}

	/**  
	 * 设置 enBasInf  
	 * @param enBasInf 企业基本信息记录[1..1]  
	 */
	public void setEnBasInf(EnBasInf enBasInf) {
		EnBasInf = enBasInf;
	}



	/**
	 * 获取 enCtfItgInf
	 * 
	 * @return the enCtfItgInf 企业身份标识整合信息记录[1..1]
	 */
	public EnCtfItgInf getEnCtfItgInf() {
		return EnCtfItgInf;
	}

	/**
	 * 设置 enCtfItgInf
	 * 
	 * @param enCtfItgInf
	 *            企业身份标识整合信息记录[1..1]
	 */
	public void setEnCtfItgInf(EnCtfItgInf enCtfItgInf) {
		EnCtfItgInf = enCtfItgInf;
	}

	/**
	 * 获取 enIcdnRltpInf
	 * 
	 * @return the enIcdnRltpInf 企业间关联关系信息记录[1..1]
	 */
	public com.dhcc.xml.ent.entity.baseinfo.EnIcdnRltpInf getEnIcdnRltpInf() {
		return EnIcdnRltpInf;
	}

	/**
	 * 设置 enIcdnRltpInf
	 * 
	 * @param enIcdnRltpInf
	 *            企业间关联关系信息记录[1..1]
	 */
	public void setEnIcdnRltpInf(com.dhcc.xml.ent.entity.baseinfo.EnIcdnRltpInf enIcdnRltpInf) {
		EnIcdnRltpInf = enIcdnRltpInf;
	}

	/**
	 * 获取 enBsInfDlt
	 * 
	 * @return the enBsInfDlt 企业基本信息删除请求记录[1..1]
	 */
	public com.dhcc.xml.ent.entity.baseinfo.EnBsInfDlt getEnBsInfDlt() {
		return EnBsInfDlt;
	}

	/**
	 * 设置 enBsInfDlt
	 * 
	 * @param enBsInfDlt
	 *            企业基本信息删除请求记录[1..1]
	 */
	public void setEnBsInfDlt(com.dhcc.xml.ent.entity.baseinfo.EnBsInfDlt enBsInfDlt) {
		EnBsInfDlt = enBsInfDlt;
	}

}
