package com.dhcc.xml.ent.entity.loaninfo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MotgaCltalCtrctInfSgmt<br/>
 * Description:企业借贷账户信息记录抵质押物信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "CcNm", "CccInf" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// 指定序列成的xml节点顺序
public class MotgaCltalCtrctInfSgmt {
	/**
	 * 抵质押合同个数 [1..1]
	 */
	private String CcNm;
	/**
	 *->抵质押合同信息 [1..99]
	 */
	private List<CccInf> CccInf;

	public MotgaCltalCtrctInfSgmt() {
		super();
	}

	/**
	 * 获取 ccNm
	 * 
	 * @return the ccNm 抵质押合同个数 [1..1]
	 */
	public String getCcNm() {
		return CcNm;
	}

	/**
	 * 设置 ccNm
	 * 
	 * @param ccNm
	 *            抵质押合同个数 [1..1]
	 */
	public void setCcNm(String ccNm) {
		CcNm = ccNm;
	}

	/**
	 * 获取 cccInf
	 * 
	 * @return the cccInf ->抵质押合同信息 [1..99]
	 */
	public List<CccInf> getCccInf() {
		return CccInf;
	}

	/**
	 * 设置 cccInf
	 * 
	 * @param cccInf
	 *            ->抵质押合同信息 [1..99]
	 */
	public void setCccInf(List<CccInf> cccInf) {
		CccInf = cccInf;
	}

	@Override
	public String toString() {
		return "MotgaCltalCtrctInfSgmt [CcNm=" + CcNm + ", CccInf=" + CccInf
				+ "]";
	}

}
