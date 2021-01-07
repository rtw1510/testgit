package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: AcctCredSgmt<br/>
 * Description: 授信额度信息段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "Mcc" },namespace = "com.dhcc.xml.per.entity.loaninfo")
public class AcctCredSgmt {
	/**
	 * 授信协议标识码
	 */
	private String Mcc;

	public AcctCredSgmt() {
		super();
	}

	/**
	 * 获取 mcc
	 * 
	 * @return the mcc 授信协议标识码
	 */
	public String getMcc() {
		return Mcc;
	}

	/**
	 * 设置 mcc
	 * 
	 * @param mcc
	 *            授信协议标识码
	 */
	public void setMcc(String mcc) {
		Mcc = mcc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AcctCredSgmt [Mcc=" + Mcc + "]";
	}
}
