package com.dhcc.xml.ent.entity.guarantee;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: GuarMotgaCltalCtrctInfSgmt<br/>
 * Description:企业担保账户记录抵质押物信息段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "CcNm", "CccInf" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class GuarMotgaCltalCtrctInfSgmt {

	/**
	 *抵质押合同个数[1..1]
	 */
	private String CcNm;
	/**
	 *关联还款责任人信息[1..99]
	 */
	private List<CccInf> CccInf;

	public GuarMotgaCltalCtrctInfSgmt() {
		super();

	}

	/**
	 * 获取 ccNm
	 * 
	 * @return the ccNm 抵质押合同个数[1..1]
	 */
	public String getCcNm() {
		return CcNm;
	}

	/**
	 * 设置 ccNm
	 * 
	 * @param ccNm
	 *            抵质押合同个数[1..1]
	 */
	public void setCcNm(String ccNm) {
		CcNm = ccNm;
	}

	/**
	 * 获取 cccInf
	 * 
	 * @return the cccInf 关联还款责任人信息[1..99]
	 */
	public List<CccInf> getCccInf() {
		return CccInf;
	}

	/**
	 * 设置 cccInf
	 * 
	 * @param cccInf
	 *            关联还款责任人信息[1..99]
	 */
	public void setCccInf(List<CccInf> cccInf) {
		CccInf = cccInf;
	}

	@Override
	public String toString() {
		return "GuarMotgaCltalCtrctInfSgmt [CcNm=" + CcNm + ", CccInf="
				+ CccInf + "]";
	}

}
