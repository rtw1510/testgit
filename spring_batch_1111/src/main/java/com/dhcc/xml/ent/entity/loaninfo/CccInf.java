package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: CccInf<br/>
 * Description: 企业借贷账户信息记录抵质押合同信息<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "Ccc" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// 指定序列成的xml节点顺序
public class CccInf {
	/**
	 *抵(质)押合同标识码 [1..1]
	 */
	private String Ccc;

	public CccInf() {
		super();
	}

	/**
	 * 获取 ccc
	 * 
	 * @return the ccc 抵(质)押合同标识码 [1..1]
	 */
	public String getCcc() {
		return Ccc;
	}

	/**
	 * 设置 ccc
	 * 
	 * @param ccc
	 *            抵(质)押合同标识码 [1..1]
	 */
	public void setCcc(String ccc) {
		Ccc = ccc;
	}

	@Override
	public String toString() {
		return "CccInf [Ccc=" + Ccc + "]";
	}
}
