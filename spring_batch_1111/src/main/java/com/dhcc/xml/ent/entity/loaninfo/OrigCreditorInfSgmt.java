package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: OrigCreditorInfSgmt<br/>
 * Description:��ҵ����˻���Ϣ��¼���������Ϣ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��24��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "InitCredName", "InitCedOrgCode", "OrigDbtCate",
		"InitRpySts" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// ָ�����гɵ�xml�ڵ�˳��
public class OrigCreditorInfSgmt {
	/**
	 *��ʼծȨ������ [1..1]
	 */
	private String InitCredName;
	/**
	 *��ʼծȨ�˻������� [1..1]
	 */
	private String InitCedOrgCode;
	/**
	 *ԭծ������ [1..1]
	 */
	private String OrigDbtCate;
	/**
	 *ծȨת��ʱ�Ļ���״̬ [1..1]
	 */
	private String InitRpySts;

	public OrigCreditorInfSgmt() {
		super();
	}

	/**
	 * ��ȡ initCredName
	 * 
	 * @return the initCredName ��ʼծȨ������ [1..1]
	 */
	public String getInitCredName() {
		return InitCredName;
	}

	/**
	 * ���� initCredName
	 * 
	 * @param initCredName
	 *            ��ʼծȨ������ [1..1]
	 */
	public void setInitCredName(String initCredName) {
		InitCredName = initCredName;
	}

	/**
	 * ��ȡ initCedOrgCode
	 * 
	 * @return the initCedOrgCode ��ʼծȨ�˻������� [1..1]
	 */
	public String getInitCedOrgCode() {
		return InitCedOrgCode;
	}

	/**
	 * ���� initCedOrgCode
	 * 
	 * @param initCedOrgCode
	 *            ��ʼծȨ�˻������� [1..1]
	 */
	public void setInitCedOrgCode(String initCedOrgCode) {
		InitCedOrgCode = initCedOrgCode;
	}

	/**
	 * ��ȡ origDbtCate
	 * 
	 * @return the origDbtCate ԭծ������ [1..1]
	 */
	public String getOrigDbtCate() {
		return OrigDbtCate;
	}

	/**
	 * ���� origDbtCate
	 * 
	 * @param origDbtCate
	 *            ԭծ������ [1..1]
	 */
	public void setOrigDbtCate(String origDbtCate) {
		OrigDbtCate = origDbtCate;
	}

	/**
	 * ��ȡ initRpySts
	 * 
	 * @return the initRpySts ծȨת��ʱ�Ļ���״̬ [1..1]
	 */
	public String getInitRpySts() {
		return InitRpySts;
	}

	/**
	 * ���� initRpySts
	 * 
	 * @param initRpySts
	 *            ծȨת��ʱ�Ļ���״̬ [1..1]
	 */
	public void setInitRpySts(String initRpySts) {
		InitRpySts = initRpySts;
	}

	@Override
	public String toString() {
		return "OrigCreditorInfSgmt [InitCredName=" + InitCredName
				+ ", InitCedOrgCode=" + InitCedOrgCode + ", OrigDbtCate="
				+ OrigDbtCate + ", InitRpySts=" + InitRpySts + "]";
	}

}
