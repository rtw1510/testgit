package com.dhcc.xml.per.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Title: GuarMotgaCltalCtrctInfSgmt<br/>
 * Description:���˵����˻���¼����Ѻ����Ϣ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��28��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "CcNm", "CccInf" },namespace = "com.dhcc.xml.per.entity.guarantee")
// ָ�����гɵ�xml�ڵ�˳��
public class GuarMotgaCltalCtrctInfSgmt {
	/**
	 * ����Ѻ��ͬ����
	 */
	private String CcNm;
	/**
	 * ������Ѻ����Ϣ
	 */
	private List<CccInf> CccInf;

	public GuarMotgaCltalCtrctInfSgmt() {
		super();
	}

	/**
	 * ��ȡ ccNm
	 * 
	 * @return the ccNm ����Ѻ��ͬ����
	 */
	public String getCcNm() {
		return CcNm;
	}

	/**
	 * ���� ccNm
	 * 
	 * @param ccNm
	 *            ����Ѻ��ͬ����
	 */
	public void setCcNm(String ccNm) {
		CcNm = ccNm;
	}

	/**
	 * ��ȡ cccInf
	 * 
	 * @return the cccInf ������Ѻ����Ϣ
	 */
	public List<CccInf> getCccInf() {
		return CccInf;
	}

	/**
	 * ���� cccInf
	 * 
	 * @param cccInf
	 *            ������Ѻ����Ϣ
	 */
	public void setCccInf(List<CccInf> cccInf) {
		CccInf = cccInf;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GuarMotgaCltalCtrctInfSgmt [CcNm=" + CcNm + ", CccInf="
				+ CccInf + "]";
	}
}
