package com.dhcc.xml.ent.entity.guarantee;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: RltRepymtInfSgmt<br/>
 * Description:��ҵ�����˻���¼��ػ�����������Ϣ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "RltRepymtNm", "RltRepymtInf" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class RltRepymtInfSgmt {

	/**
	 *��ػ��������˸���[1..1]
	 */
	private String RltRepymtNm;
	/**
	 *����������������Ϣ[1..99]
	 */
	private List<RltRepymtInf> RltRepymtInf;

	public RltRepymtInfSgmt() {
		super();
	}

	/**
	 * ��ȡ rltRepymtNm
	 * 
	 * @return the rltRepymtNm ��ػ��������˸���[1..1]
	 */
	public String getRltRepymtNm() {
		return RltRepymtNm;
	}

	/**
	 * ���� rltRepymtNm
	 * 
	 * @param rltRepymtNm
	 *            ��ػ��������˸���[1..1]
	 */
	public void setRltRepymtNm(String rltRepymtNm) {
		RltRepymtNm = rltRepymtNm;
	}

	/**
	 * ��ȡ rltRepymtInf
	 * 
	 * @return the rltRepymtInf ����������������Ϣ[1..99]
	 */
	public List<RltRepymtInf> getRltRepymtInf() {
		return RltRepymtInf;
	}

	/**
	 * ���� rltRepymtInf
	 * 
	 * @param rltRepymtInf
	 *            ����������������Ϣ[1..99]
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
