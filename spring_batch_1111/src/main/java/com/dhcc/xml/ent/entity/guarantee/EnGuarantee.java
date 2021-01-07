package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnGuarantee<br/>
 * Description:企业担保交易信息 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlRootElement(name = "Document")
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "EnSecAcctInf", "EnSecAcctIDCagsInf", "EnSecAcctMdfc",
		"EnSecAcctDel", "EnSecAcctEntDel"},namespace = "com.dhcc.xml.ent.entity.guarantee")
// 指定序列成的xml节点顺序
public class EnGuarantee {
	/**
	 *企业担保账户信息记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.guarantee.EnSecAcctInf EnSecAcctInf;
	/**
	 *企业担保账户标识变更请求记录[1..1]
	 */
	private EnSecAcctIDCagsInf EnSecAcctIDCagsInf;
	/**
	 *企业担保账户按段更正请求记录[1..1]
	 */
	private EnSecAcctMdfc EnSecAcctMdfc;
	/**
	 *企业担保账户按段删除请求记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.guarantee.EnSecAcctDel EnSecAcctDel;
	/**
	 *企业担保账户整笔删除请求记录[1..1]
	 */
	private com.dhcc.xml.ent.entity.guarantee.EnSecAcctEntDel EnSecAcctEntDel;

	public EnGuarantee() {
		super();
	}

	/**  
	 * 获取 enSecAcctInf
	 * @return the enSecAcctInf 企业担保账户信息记录[1..1] 
	 */
	public com.dhcc.xml.ent.entity.guarantee.EnSecAcctInf getEnSecAcctInf() {
		return EnSecAcctInf;
	}

	/**  
	 * 设置 enSecAcctInf  
	 * @param enSecAcctInf 企业担保账户信息记录[1..1]  
	 */
	public void setEnSecAcctInf(com.dhcc.xml.ent.entity.guarantee.EnSecAcctInf enSecAcctInf) {
		EnSecAcctInf = enSecAcctInf;
	}

	/**  
	 * 获取 enSecAcctIDCagsInf
	 * @return the enSecAcctIDCagsInf 企业担保账户标识变更请求记录[1..1] 
	 */
	public EnSecAcctIDCagsInf getEnSecAcctIDCagsInf() {
		return EnSecAcctIDCagsInf;
	}

	/**  
	 * 设置 enSecAcctIDCagsInf  
	 * @param enSecAcctIDCagsInf 企业担保账户标识变更请求记录[1..1]  
	 */
	public void setEnSecAcctIDCagsInf(EnSecAcctIDCagsInf enSecAcctIDCagsInf) {
		EnSecAcctIDCagsInf = enSecAcctIDCagsInf;
	}

	/**  
	 * 获取 enSecAcctMdfc
	 * @return the enSecAcctMdfc 企业担保账户按段更正请求记录[1..1] 
	 */
	public EnSecAcctMdfc getEnSecAcctMdfc() {
		return EnSecAcctMdfc;
	}

	/**  
	 * 设置 enSecAcctMdfc  
	 * @param enSecAcctMdfc 企业担保账户按段更正请求记录[1..1]  
	 */
	public void setEnSecAcctMdfc(EnSecAcctMdfc enSecAcctMdfc) {
		EnSecAcctMdfc = enSecAcctMdfc;
	}

	/**  
	 * 获取 enSecAcctDel
	 * @return the enSecAcctDel 企业担保账户按段删除请求记录[1..1] 
	 */
	public com.dhcc.xml.ent.entity.guarantee.EnSecAcctDel getEnSecAcctDel() {
		return EnSecAcctDel;
	}

	/**  
	 * 设置 enSecAcctDel  
	 * @param enSecAcctDel 企业担保账户按段删除请求记录[1..1]  
	 */
	public void setEnSecAcctDel(com.dhcc.xml.ent.entity.guarantee.EnSecAcctDel enSecAcctDel) {
		EnSecAcctDel = enSecAcctDel;
	}

	/**  
	 * 获取 enSecAcctEntDel
	 * @return the enSecAcctEntDel 企业担保账户整笔删除请求记录[1..1] 
	 */
	public com.dhcc.xml.ent.entity.guarantee.EnSecAcctEntDel getEnSecAcctEntDel() {
		return EnSecAcctEntDel;
	}

	/**  
	 * 设置 enSecAcctEntDel  
	 * @param enSecAcctEntDel 企业担保账户整笔删除请求记录[1..1]  
	 */
	public void setEnSecAcctEntDel(com.dhcc.xml.ent.entity.guarantee.EnSecAcctEntDel enSecAcctEntDel) {
		EnSecAcctEntDel = enSecAcctEntDel;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EnGuarantee [EnSecAcctDel=" + EnSecAcctDel
				+ ", EnSecAcctEntDel=" + EnSecAcctEntDel
				+ ", EnSecAcctIDCagsInf=" + EnSecAcctIDCagsInf
				+ ", EnSecAcctInf=" + EnSecAcctInf + ", EnSecAcctMdfc="
				+ EnSecAcctMdfc + "]";
	}

}
