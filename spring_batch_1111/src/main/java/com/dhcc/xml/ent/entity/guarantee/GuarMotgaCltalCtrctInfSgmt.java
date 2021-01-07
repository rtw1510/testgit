package com.dhcc.xml.ent.entity.guarantee;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: GuarMotgaCltalCtrctInfSgmt<br/>
 * Description:��ҵ�����˻���¼����Ѻ����Ϣ��<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "CcNm", "CccInf" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class GuarMotgaCltalCtrctInfSgmt {

	/**
	 *����Ѻ��ͬ����[1..1]
	 */
	private String CcNm;
	/**
	 *����������������Ϣ[1..99]
	 */
	private List<CccInf> CccInf;

	public GuarMotgaCltalCtrctInfSgmt() {
		super();

	}

	/**
	 * ��ȡ ccNm
	 * 
	 * @return the ccNm ����Ѻ��ͬ����[1..1]
	 */
	public String getCcNm() {
		return CcNm;
	}

	/**
	 * ���� ccNm
	 * 
	 * @param ccNm
	 *            ����Ѻ��ͬ����[1..1]
	 */
	public void setCcNm(String ccNm) {
		CcNm = ccNm;
	}

	/**
	 * ��ȡ cccInf
	 * 
	 * @return the cccInf ����������������Ϣ[1..99]
	 */
	public List<CccInf> getCccInf() {
		return CccInf;
	}

	/**
	 * ���� cccInf
	 * 
	 * @param cccInf
	 *            ����������������Ϣ[1..99]
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
