package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Title: MotgaCltalCtrctInfSgmt<br/>
 * Description: ���˽���˻���Ϣ��¼����Ѻ����Ϣ��<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "CcNm", "CccInf" },namespace = "com.dhcc.xml.per.entity.loaninfo")
public class MotgaCltalCtrctInfSgmt {
	/**
	 * ����Ѻ��ͬ����
	 */
	private String CcNm;
	/**
	 * ���֣��ʣ�Ѻ��ͬ��Ϣ
	 */
	private List<CccInf> CccInf;

	public MotgaCltalCtrctInfSgmt() {
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
	 * @return the cccInf ���֣��ʣ�Ѻ��ͬ��Ϣ
	 */
	public List<CccInf> getCccInf() {
		return CccInf;
	}

	/**
	 * ���� cccInf
	 * 
	 * @param cccInf
	 *            ���֣��ʣ�Ѻ��ͬ��Ϣ
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
		return "MotgaCltalCtrctInfSgmt [CcNm=" + CcNm + ", CccInf=" + CccInf
				+ "]";
	}

}
