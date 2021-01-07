package com.dhcc.xml.ent.entity.loaninfo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: AcctSpecTrstDspnSgmt<br/>
 * Description:企业借贷账户信息记录特定交易说明段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "CagOfTrdNm", "CagOfTrdInf" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// 指定序列成的xml节点顺序
public class AcctSpecTrstDspnSgmt {
	/**
	 *交易个数[1..1]
	 */
	private String CagOfTrdNm;
	/**
	 *->交易信息[1..99]
	 */
	private List<com.dhcc.xml.ent.entity.loaninfo.CagOfTrdInf> CagOfTrdInf;

	public AcctSpecTrstDspnSgmt() {
		super();
	}

	/**
	 * 获取 cagOfTrdNm
	 * 
	 * @return the cagOfTrdNm 交易个数[1..1]
	 */
	public String getCagOfTrdNm() {
		return CagOfTrdNm;
	}

	/**
	 * 设置 cagOfTrdNm
	 * 
	 * @param cagOfTrdNm
	 *            交易个数[1..1]
	 */
	public void setCagOfTrdNm(String cagOfTrdNm) {
		CagOfTrdNm = cagOfTrdNm;
	}

	/**
	 * 获取 cagOfTrdInf
	 * 
	 * @return the cagOfTrdInf ->交易信息[1..99]
	 */
	public List<com.dhcc.xml.ent.entity.loaninfo.CagOfTrdInf> getCagOfTrdInf() {
		return CagOfTrdInf;
	}

	/**
	 * 设置 cagOfTrdInf
	 * 
	 * @param cagOfTrdInf
	 *            ->交易信息[1..99]
	 */
	public void setCagOfTrdInf(List<com.dhcc.xml.ent.entity.loaninfo.CagOfTrdInf> cagOfTrdInf) {
		CagOfTrdInf = cagOfTrdInf;
	}

	@Override
	public String toString() {
		return "AcctSpecTrstDspnSgmt [CagOfTrdNm=" + CagOfTrdNm
				+ ", CagOfTrdInf=" + CagOfTrdInf + "]";
	}

}
