package com.dhcc.xml.per.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Title: RltRepymtInfSgmt<br/>
 * Description: ���˵����˻���¼�˻���ػ��������˶�<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��28��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "RltRepymtNm", "RltRepymtInf" },namespace = "com.dhcc.xml.per.entity.guarantee")
// ָ�����гɵ�xml�ڵ�˳��
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
	 * @return the rltRepymtNm �����˸���
	 */
	public String getRltRepymtNm() {
		return RltRepymtNm;
	}

	/**
	 * ���� rltRepymtNm
	 * 
	 * @param rltRepymtNm
	 *            �����˸���
	 */
	public void setRltRepymtNm(String rltRepymtNm) {
		RltRepymtNm = rltRepymtNm;
	}

	/**
	 * ��ȡ rltRepymtInf
	 * 
	 * @return the rltRepymtInf ����ػ�����������Ϣ
	 */
	public List<RltRepymtInf> getRltRepymtInf() {
		return RltRepymtInf;
	}

	/**
	 * ���� rltRepymtInf
	 * 
	 * @param rltRepymtInf
	 *            ����ػ�����������Ϣ
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
		return "RltRepymtInfSgmt [RltRepymtNm=" + RltRepymtNm + "]";
	}
}
