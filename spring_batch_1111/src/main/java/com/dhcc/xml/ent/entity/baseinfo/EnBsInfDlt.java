package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnBsInfDlt<br/>
 * Description:��ҵ������Ϣɾ�������¼ <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��25��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "InfRecType", "InfSurcCode", "EntName", "EntCertType",
		"EntCertNum" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
// ָ�����гɵ�xml�ڵ�˳��
public class EnBsInfDlt {
	/**
	 *��Ϣ��¼����[1..1]
	 */
	private String InfRecType;
	/**
	 *��Ϣ��Դ����[1..1]
	 */
	private String InfSurcCode;
	/**
	 *��ҵ����[1..1]
	 */
	private String EntName;
	/**
	 *��ҵ��ݱ�ʶ����[1..1]
	 */
	private String EntCertType;
	/**
	 *��ҵ��ݱ�ʶ����[1..1]
	 */
	private String EntCertNum;

	public EnBsInfDlt() {
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
	 * ��ȡ infSurcCode
	 * 
	 * @return the infSurcCode ��Ϣ��Դ����[1..1]
	 */
	public String getInfSurcCode() {
		return InfSurcCode;
	}

	/**
	 * ���� infSurcCode
	 * 
	 * @param infSurcCode
	 *            ��Ϣ��Դ����[1..1]
	 */
	public void setInfSurcCode(String infSurcCode) {
		InfSurcCode = infSurcCode;
	}

	/**
	 * ��ȡ entName
	 * 
	 * @return the entName ��ҵ����[1..1]
	 */
	public String getEntName() {
		return EntName;
	}

	/**
	 * ���� entName
	 * 
	 * @param entName
	 *            ��ҵ����[1..1]
	 */
	public void setEntName(String entName) {
		EntName = entName;
	}

	/**
	 * ��ȡ entCertType
	 * 
	 * @return the entCertType ��ҵ��ݱ�ʶ����[1..1]
	 */
	public String getEntCertType() {
		return EntCertType;
	}

	/**
	 * ���� entCertType
	 * 
	 * @param entCertType
	 *            ��ҵ��ݱ�ʶ����[1..1]
	 */
	public void setEntCertType(String entCertType) {
		EntCertType = entCertType;
	}

	/**
	 * ��ȡ entCertNum
	 * 
	 * @return the entCertNum ��ҵ��ݱ�ʶ����[1..1]
	 */
	public String getEntCertNum() {
		return EntCertNum;
	}

	/**
	 * ���� entCertNum
	 * 
	 * @param entCertNum
	 *            ��ҵ��ݱ�ʶ����[1..1]
	 */
	public void setEntCertNum(String entCertNum) {
		EntCertNum = entCertNum;
	}

	@Override
	public String toString() {
		return "EnBsInfDlt [InfRecType=" + InfRecType + ", InfSurcCode="
				+ InfSurcCode + ", EntName=" + EntName + ", EntCertType="
				+ EntCertType + ", EntCertNum=" + EntCertNum + "]";
	}

}
