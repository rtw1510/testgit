/**  
 * Title: EnMotgaCltalCtrctInfo.java<br\> 
 * Description: <br\> 
 * Copyright: Copyright (c) 2018<br\> 
 * Company: DHCC<br\>  
 * @author ChenJingYuan  
 * @date 2018-2-26  
 */
package com.dhcc.xml.ent.entity.motgacltalctrctinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnMotgaCltalCtrctInfo<br/>
 * Description: 抵（质）押合同信息报文入口<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlRootElement(name = "Document")
@XmlAccessorType(value = XmlAccessType.FIELD) // 访问类型改为字段
@XmlType(propOrder = { "MotgaCltalCtrctInf", "MoCIDCagsInf","MoCEntDel" },namespace = "com.dhcc.xml.ent.entity.motgacltalctrctinfo") // 指定序列成的xml节点顺序
public class EnMotgaCltalCtrctInfo {
	/**
	 *抵（质）押合同信息记录
	 */
	private com.dhcc.xml.ent.entity.motgacltalctrctinfo.MotgaCltalCtrctInf MotgaCltalCtrctInf;
	/**
	 *抵（质）押合同标识变更请求记录
	 */
	private com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCIDCagsInf MoCIDCagsInf;
	/**
	 *抵（质）押合同整笔删除请求记录
	 */
	private com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCEntDel MoCEntDel;

	public EnMotgaCltalCtrctInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取 motgaCltalCtrctInf
	 * 
	 * @return the motgaCltalCtrctInf 抵（质）押合同信息记录
	 */
	public com.dhcc.xml.ent.entity.motgacltalctrctinfo.MotgaCltalCtrctInf getMotgaCltalCtrctInf() {
		return MotgaCltalCtrctInf;
	}

	/**
	 * 设置 motgaCltalCtrctInf
	 * 
	 * @param motgaCltalCtrctInf
	 *            抵（质）押合同信息记录
	 */
	public void setMotgaCltalCtrctInf(com.dhcc.xml.ent.entity.motgacltalctrctinfo.MotgaCltalCtrctInf motgaCltalCtrctInf) {
		MotgaCltalCtrctInf = motgaCltalCtrctInf;
	}

	/**
	 * 获取 moCIDCagsInf
	 * 
	 * @return the moCIDCagsInf 抵（质）押合同标识变更请求记录
	 */
	public com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCIDCagsInf getMoCIDCagsInf() {
		return MoCIDCagsInf;
	}

	/**
	 * 设置 moCIDCagsInf
	 * 
	 * @param moCIDCagsInf
	 *            抵（质）押合同标识变更请求记录
	 */
	public void setMoCIDCagsInf(com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCIDCagsInf moCIDCagsInf) {
		MoCIDCagsInf = moCIDCagsInf;
	}

	/**
	 * 获取 moCEntDel
	 * 
	 * @return the moCEntDel 抵（质）押合同整笔删除请求记录
	 */
	public com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCEntDel getMoCEntDel() {
		return MoCEntDel;
	}

	/**
	 * 设置 moCEntDel
	 * 
	 * @param moCEntDel
	 *            抵（质）押合同整笔删除请求记录
	 */
	public void setMoCEntDel(com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCEntDel moCEntDel) {
		MoCEntDel = moCEntDel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EnMotgaCltalCtrctInfo [MoCEntDel=" + MoCEntDel
				+ ", MoCIDCagsInf=" + MoCIDCagsInf + ", MotgaCltalCtrctInf="
				+ MotgaCltalCtrctInf + "]";
	}

}
