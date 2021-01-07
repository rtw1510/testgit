package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Title: RltRepymtInfSgmt<br/>
 * Description: ��ػ��������˶�<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "RltRepymtNm", "RltRepymtInf" },namespace = "com.dhcc.xml.per.entity.loaninfo")
public class RltRepymtInfSgmt {
	/**
	 * �����˸���
	 */
	private String RltRepymtNm;
	/**
	 * ����ػ�����������Ϣ
	 */
	private List<RltRepymtInf> RltRepymtInf;

	public RltRepymtInfSgmt() {
		super();
	}

	/**
	 * ��ȡ rltRepymtNm
	 * 
	 * @return the rltRepymtNm #{bare_field_comment}
	 */
	public String getRltRepymtNm() {
		return RltRepymtNm;
	}

	/**
	 * ���� rltRepymtNm
	 * 
	 * @param rltRepymtNm
	 *            #{bare_field_comment}
	 */
	public void setRltRepymtNm(String rltRepymtNm) {
		RltRepymtNm = rltRepymtNm;
	}

	/**
	 * ��ȡ rltRepymtInf
	 * 
	 * @return the rltRepymtInf #{bare_field_comment}
	 */
	public List<RltRepymtInf> getRltRepymtInf() {
		return RltRepymtInf;
	}

	/**
	 * ���� rltRepymtInf
	 * 
	 * @param rltRepymtInf
	 *            #{bare_field_comment}
	 */
	public void setRltRepymtInf(List<RltRepymtInf> rltRepymtInf) {
		RltRepymtInf = rltRepymtInf;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RltRepymtInfSgmt [RltRepymtNm=" + RltRepymtNm
				+ ", RltRepymtInf=" + RltRepymtInf + "]";
	}
}
