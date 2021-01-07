package com.dhcc.xml.ent.entity.baseinfo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MnShaHodInfSgmt<br/>
 * Description:ע���ʱ�����Ҫ�����˶� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��25��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "RegCapCurrency", "RegCap", "MnSharHodNm", "SharHodInf",
		"MnShaHodInfoUpDate" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class MnShaHodInfSgmt {
	/**
	 *ע���ʱ�����[1..1]
	 */
	private String RegCapCurrency;
	/**
	 *ע���ʱ�[1..1]
	 */
	private String RegCap;
	/**
	 *��Ҫ�����˸���[1..1]
	 */
	private String MnSharHodNm;
	/**
	 *->��������Ϣ[0..99]
	 */
	private List<SharHodInf> SharHodInf;
	/**
	 *��Ϣ��������[1..1]
	 */
	private String MnShaHodInfoUpDate;

	public MnShaHodInfSgmt() {
		super();
	}

	/**
	 * ��ȡ regCapCurrency
	 * 
	 * @return the regCapCurrency ע���ʱ�����[1..1]
	 */
	public String getRegCapCurrency() {
		return RegCapCurrency;
	}

	/**
	 * ���� regCapCurrency
	 * 
	 * @param regCapCurrency
	 *            ע���ʱ�����[1..1]
	 */
	public void setRegCapCurrency(String regCapCurrency) {
		RegCapCurrency = regCapCurrency;
	}

	/**
	 * ��ȡ regCap
	 * 
	 * @return the regCap ע���ʱ�[1..1]
	 */
	public String getRegCap() {
		return RegCap;
	}

	/**
	 * ���� regCap
	 * 
	 * @param regCap
	 *            ע���ʱ�[1..1]
	 */
	public void setRegCap(String regCap) {
		RegCap = regCap;
	}

	/**
	 * ��ȡ mnSharHodNm
	 * 
	 * @return the mnSharHodNm ��Ҫ�����˸���[1..1]
	 */
	public String getMnSharHodNm() {
		return MnSharHodNm;
	}

	/**
	 * ���� mnSharHodNm
	 * 
	 * @param mnSharHodNm
	 *            ��Ҫ�����˸���[1..1]
	 */
	public void setMnSharHodNm(String mnSharHodNm) {
		MnSharHodNm = mnSharHodNm;
	}

	/**
	 * ��ȡ sharHodInf
	 * 
	 * @return the sharHodInf ->��������Ϣ[0..99]
	 */
	public List<SharHodInf> getSharHodInf() {
		return SharHodInf;
	}

	/**
	 * ���� sharHodInf
	 * 
	 * @param sharHodInf
	 *            ->��������Ϣ[0..99]
	 */
	public void setSharHodInf(List<SharHodInf> sharHodInf) {
		SharHodInf = sharHodInf;
	}

	/**
	 * ��ȡ mnShaHodInfoUpDate
	 * 
	 * @return the mnShaHodInfoUpDate ��Ϣ��������[1..1]
	 */
	public String getMnShaHodInfoUpDate() {
		return MnShaHodInfoUpDate;
	}

	/**
	 * ���� mnShaHodInfoUpDate
	 * 
	 * @param mnShaHodInfoUpDate
	 *            ��Ϣ��������[1..1]
	 */
	public void setMnShaHodInfoUpDate(String mnShaHodInfoUpDate) {
		MnShaHodInfoUpDate = mnShaHodInfoUpDate;
	}

	@Override
	public String toString() {
		return "MnShaHodInfSgmt [RegCapCurrency=" + RegCapCurrency
				+ ", RegCap=" + RegCap + ", MnSharHodNm=" + MnSharHodNm
				+ ", SharHodInf=" + SharHodInf + ", MnShaHodInfoUpDate="
				+ MnShaHodInfoUpDate + "]";
	}

}
