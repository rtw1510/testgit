package com.dhcc.xml.ent.entity.guarantee;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: RltRepymtInfSgmt<br/>
 * Description:企业担保账户记录相关还款责任人信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "RltRepymtNm", "RltRepymtInf" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class RltRepymtInfSgmt {

	/**
	 *相关还款责任人个数[1..1]
	 */
	private String RltRepymtNm;
	/**
	 *关联还款责任人信息[1..99]
	 */
	private List<RltRepymtInf> RltRepymtInf;

	public RltRepymtInfSgmt() {
		super();
	}

	/**
	 * 获取 rltRepymtNm
	 * 
	 * @return the rltRepymtNm 相关还款责任人个数[1..1]
	 */
	public String getRltRepymtNm() {
		return RltRepymtNm;
	}

	/**
	 * 设置 rltRepymtNm
	 * 
	 * @param rltRepymtNm
	 *            相关还款责任人个数[1..1]
	 */
	public void setRltRepymtNm(String rltRepymtNm) {
		RltRepymtNm = rltRepymtNm;
	}

	/**
	 * 获取 rltRepymtInf
	 * 
	 * @return the rltRepymtInf 关联还款责任人信息[1..99]
	 */
	public List<RltRepymtInf> getRltRepymtInf() {
		return RltRepymtInf;
	}

	/**
	 * 设置 rltRepymtInf
	 * 
	 * @param rltRepymtInf
	 *            关联还款责任人信息[1..99]
	 */
	public void setRltRepymtInf(List<RltRepymtInf> rltRepymtInf) {
		RltRepymtInf = rltRepymtInf;
	}

	@Override
	public String toString() {
		return "RltRepymtInfSgmt [RltRepymtNm=" + RltRepymtNm
				+ ", RltRepymtInf=" + RltRepymtInf + "]";
	}

}
