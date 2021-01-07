package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: AcctCredSgmt<br/>
 * Description: 企业借贷账户信息记录授信额度信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "Mcc" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// 指定序列成的xml节点顺序
public class AcctCredSgmt {
	/**
	 *授信协议标识码[1..1]
	 */
	private String Mcc;

	public AcctCredSgmt() {
		super();
	}

	/**
	 * 获取 mcc
	 * 
	 * @return the mcc 授信协议标识码[1..1]
	 */
	public String getMcc() {
		return Mcc;
	}

	/**
	 * 设置 mcc
	 * 
	 * @param mcc
	 *            授信协议标识码[1..1]
	 */
	public void setMcc(String mcc) {
		Mcc = mcc;
	}

	@Override
	public String toString() {
		return "AcctCredSgmt [Mcc=" + Mcc + "]";
	}

}
