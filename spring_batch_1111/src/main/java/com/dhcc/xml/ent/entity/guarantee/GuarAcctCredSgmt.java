package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: GuarAcctCredSgmt<br/>
 * Description:企业担保账户记录授信额度信息段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "Mcc" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class GuarAcctCredSgmt {

	/**
	 *授信协议标识码[1..1]
	 */
	private String Mcc;

	public GuarAcctCredSgmt() {
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
		return "GuarAcctCredSgmt [Mcc=" + Mcc + "]";
	}

}
