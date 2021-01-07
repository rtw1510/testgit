package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: OrigCreditorInfSgmt<br/>
 * Description: ���˽���˻���Ϣ��¼��ʼծȨ˵���� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InitCredName", "InitCredOrgNm", "OrigDbtCate",
		"InitRpySts" },namespace = "com.dhcc.xml.per.entity.loaninfo")
public class OrigCreditorInfSgmt {
	/** ��ʼծȨ������[1..1] */
	private String InitCredName;
	/** ��ʼծȨ�˻�������[1..1] */
	private String InitCredOrgNm;
	/** ԭծ������[1..1] */
	private String OrigDbtCate;
	/** ծȨת��ʱ�Ļ���״̬[1..1] */
	private String InitRpySts;

	public OrigCreditorInfSgmt() {
		super();
	}

	/**
	 * ��ȡ initCredName
	 * 
	 * @return the initCredName ��ʼծȨ������[1..1]
	 */
	public String getInitCredName() {
		return InitCredName;
	}

	/**
	 * ���� initCredName
	 * 
	 * @param initCredName
	 *            ��ʼծȨ������[1..1]
	 */
	public void setInitCredName(String initCredName) {
		InitCredName = initCredName;
	}

	/**
	 * ��ȡ initCredOrgNm
	 * 
	 * @return the initCredOrgNm ��ʼծȨ�˻�������[1..1]
	 */
	public String getInitCredOrgNm() {
		return InitCredOrgNm;
	}

	/**
	 * ���� initCredOrgNm
	 * 
	 * @param initCredOrgNm
	 *            ��ʼծȨ�˻�������[1..1]
	 */
	public void setInitCredOrgNm(String initCredOrgNm) {
		InitCredOrgNm = initCredOrgNm;
	}

	/**
	 * ��ȡ origDbtCate
	 * 
	 * @return the origDbtCate ԭծ������[1..1]
	 */
	public String getOrigDbtCate() {
		return OrigDbtCate;
	}

	/**
	 * ���� origDbtCate
	 * 
	 * @param origDbtCate
	 *            ԭծ������[1..1]
	 */
	public void setOrigDbtCate(String origDbtCate) {
		OrigDbtCate = origDbtCate;
	}

	/**
	 * ��ȡ initRpySts
	 * 
	 * @return the initRpySts ծȨת��ʱ�Ļ���״̬[1..1]
	 */
	public String getInitRpySts() {
		return InitRpySts;
	}

	/**
	 * ���� initRpySts
	 * 
	 * @param initRpySts
	 *            ծȨת��ʱ�Ļ���״̬[1..1]
	 */
	public void setInitRpySts(String initRpySts) {
		InitRpySts = initRpySts;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrigCreditorInfSgmt [InitCredName=" + InitCredName
				+ ", InitCredOrgNm=" + InitCredOrgNm + ", OrigDbtCate="
				+ OrigDbtCate + ", InitRpySts=" + InitRpySts + "]";
	}
}
