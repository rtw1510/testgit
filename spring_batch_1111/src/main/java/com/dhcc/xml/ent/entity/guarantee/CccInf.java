package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: CccInf<br/>
 * Description:关联还款责任人信息 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "Ccc" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class CccInf {
	/**
	 *抵(质)押合同标识号[1..1]
	 */
	private String Ccc;

	public CccInf() {
		super();

	}

	/**
	 * 获取 ccc
	 * 
	 * @return the ccc 抵(质)押合同标识号[1..1]
	 */
	public String getCcc() {
		return Ccc;
	}

	/**
	 * 设置 ccc
	 * 
	 * @param ccc
	 *            抵(质)押合同标识号[1..1]
	 */
	public void setCcc(String ccc) {
		Ccc = ccc;
	}

	@Override
	public String toString() {
		return "CccInf [Ccc=" + Ccc + "]";
	}

}
