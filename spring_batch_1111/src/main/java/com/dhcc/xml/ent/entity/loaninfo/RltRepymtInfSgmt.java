package com.dhcc.xml.ent.entity.loaninfo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: RltRepymtInfSgmt<br/>
 * Description:企业借贷账户信息记录相关还款责任人段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "RltRepymtNm", "RltRepymtInf" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// 指定序列成的xml节点顺序
public class RltRepymtInfSgmt {
	/**
	 *责任人个数 [1..1]
	 */
	private String RltRepymtNm;
	/**
	 *->关联还款责任人信息 [1..99]
	 */
	private List<com.dhcc.xml.ent.entity.loaninfo.RltRepymtInf> RltRepymtInf;

	public RltRepymtInfSgmt() {
		super();
	}

	/**
	 * 获取 rltRepymtNm
	 * 
	 * @return the rltRepymtNm 责任人个数 [1..1]
	 */
	public String getRltRepymtNm() {
		return RltRepymtNm;
	}

	/**
	 * 设置 rltRepymtNm
	 * 
	 * @param rltRepymtNm
	 *            责任人个数 [1..1]
	 */
	public void setRltRepymtNm(String rltRepymtNm) {
		RltRepymtNm = rltRepymtNm;
	}

	/**
	 * 获取 rltRepymtInf
	 * 
	 * @return the rltRepymtInf ->关联还款责任人信息 [1..99]
	 */
	public List<com.dhcc.xml.ent.entity.loaninfo.RltRepymtInf> getRltRepymtInf() {
		return RltRepymtInf;
	}

	/**
	 * 设置 rltRepymtInf
	 * 
	 * @param rltRepymtInf
	 *            ->关联还款责任人信息 [1..99]
	 */
	public void setRltRepymtInf(List<com.dhcc.xml.ent.entity.loaninfo.RltRepymtInf> rltRepymtInf) {
		RltRepymtInf = rltRepymtInf;
	}

	@Override
	public String toString() {
		return "RltRepymtInfSgmt [RltRepymtNm=" + RltRepymtNm
				+ ", RltRepymtInf=" + RltRepymtInf + "]";
	}

}
