package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InAcctDel<br/>
 * Description: ���˽���˻�����ɾ������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "InfRecType", "DelRecCode","DelSgmtCode","DelStartDate",
		"DelEndDate" },namespace = "com.dhcc.xml.per.entity.loaninfo")
// �ֶ�չʾ�Ⱥ�˳��
public class InAcctDel {
	/** ��Ϣ��¼����[1..1] */
	private String InfRecType;
	/** ��ɾ��ҵ���ʶ��[1..1] */
	private String DelRecCode;
	/** ��ɾ���ζα�[1..1] */
	private String DelSgmtCode;
	/** ��ɾ����ʼ����[1..1] */
	private String DelStartDate;
	/** ��ɾ����������[1..1] */
	private String DelEndDate;

	public InAcctDel() {
		super();
	}

	/**
	 * ��ȡ infRecType
	 * 
	 * @return the infRecType ��Ϣ��¼����[1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * ���� infRecType
	 * 
	 * @param infRecType
	 *            ��Ϣ��¼����[1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * ��ȡ delRecCode
	 * 
	 * @return the delRecCode ��ɾ��ҵ���ʶ��[1..1]
	 */
	public String getDelRecCode() {
		return DelRecCode;
	}

	/**
	 * ���� delRecCode
	 * 
	 * @param delRecCode
	 *            ��ɾ��ҵ���ʶ��[1..1]
	 */
	public void setDelRecCode(String delRecCode) {
		DelRecCode = delRecCode;
	}

	/**
	 * ��ȡ delSgmtCode
	 * 
	 * @return the delSgmtCode ��ɾ���ζα�[1..1]
	 */
	public String getDelSgmtCode() {
		return DelSgmtCode;
	}

	/**
	 * ���� delSgmtCode
	 * 
	 * @param delSgmtCode
	 *            ��ɾ���ζα�[1..1]
	 */
	public void setDelSgmtCode(String delSgmtCode) {
		DelSgmtCode = delSgmtCode;
	}

	/**
	 * ��ȡ delStartDate
	 * 
	 * @return the delStartDate ��ɾ����ʼ����[1..1]
	 */
	public String getDelStartDate() {
		return DelStartDate;
	}

	/**
	 * ���� delStartDate
	 * 
	 * @param delStartDate
	 *            ��ɾ����ʼ����[1..1]
	 */
	public void setDelStartDate(String delStartDate) {
		DelStartDate = delStartDate;
	}

	/**
	 * ��ȡ delEndDate
	 * 
	 * @return the delEndDate ��ɾ����������[1..1]
	 */
	public String getDelEndDate() {
		return DelEndDate;
	}

	/**
	 * ���� delEndDate
	 * 
	 * @param delEndDate
	 *            ��ɾ����������[1..1]
	 */
	public void setDelEndDate(String delEndDate) {
		DelEndDate = delEndDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InAcctDel [InfRecType=" + InfRecType + ", DelRecCode="
				+ DelRecCode + ", DelSgmtCode=" + DelSgmtCode
				+ ", DelStartDate=" + DelStartDate + ", DelEndDate="
				+ DelEndDate + "]";
	}
}
