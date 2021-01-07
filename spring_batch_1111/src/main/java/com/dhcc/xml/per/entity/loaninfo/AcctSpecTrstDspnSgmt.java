package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Title: AcctSpecTrstDspnSgmt<br/>
 * Description:���⽻��˵���� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "CagOfTrdNm", "CagOfTrdInf"},namespace = "com.dhcc.xml.per.entity.loaninfo")
public class AcctSpecTrstDspnSgmt {
	/** ���׸���[1..1] */
	private String CagOfTrdNm;
	/** ��������Ϣ[1..99] */
	private List<CagOfTrdInf> CagOfTrdInf;
	

	public AcctSpecTrstDspnSgmt() {
		super();
	}

	/**
	 * ��ȡ cagOfTrdNm
	 * 
	 * @return the cagOfTrdNm ���׸���[1..1]
	 */
	public String getCagOfTrdNm() {
		return CagOfTrdNm;
	}

	/**
	 * ���� cagOfTrdNm
	 * 
	 * @param cagOfTrdNm
	 *            ���׸���[1..1]
	 */
	public void setCagOfTrdNm(String cagOfTrdNm) {
		CagOfTrdNm = cagOfTrdNm;
	}

	/**
	 * ��ȡ cagOfTrdInf
	 * 
	 * @return the cagOfTrdInf ��������Ϣ[1..99]
	 */
	public List<CagOfTrdInf> getCagOfTrdInf() {
		return CagOfTrdInf;
	}

	/**
	 * ���� cagOfTrdInf
	 * 
	 * @param cagOfTrdInf
	 *            ��������Ϣ[1..99]
	 */


	public void setCagOfTrdInf(List<CagOfTrdInf> cagOfTrdInf) {
		CagOfTrdInf = cagOfTrdInf;
	}
	
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AcctSpecTrstDspnSgmt [CagOfTrdNm=" + CagOfTrdNm
				+ ", CagOfTrdInf=" + CagOfTrdInf + "]";
	}



}
