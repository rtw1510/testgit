package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: BsSgmt<br/>
 * Description:��ҵ������Ϣ��¼������ <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��25��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfRecType", "EntName", "EntCertType", "EntCertNum",
		"RptDate", "InfSurcCode", "Cimoc", "CustomerType", "EtpSts", "OrgType","RptDateCode" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class BsSgmt {

	/**
	 * ��Ϣ��¼����[1..1]
	 */
	private String InfRecType;
	/**
	 * ��ҵ����[1..1]
	 */
	private String EntName;
	/**
	 * ��ҵ��ݱ�ʶ����[1..1]
	 */
	private String EntCertType;
	/**
	 * ��ҵ��ݱ�ʶ����[1..1]
	 */
	private String EntCertNum;
	/**
	 * ��Ϣ��������[1..1]
	 */
	private String RptDate;
	/**
	 * ��Ϣ��Դ����[1..1]
	 */
	private String InfSurcCode;
	/**
	 * �ͻ�����ά����������[1..1]
	 */
	private String Cimoc;
	/**
	 * �ͻ���������[1..1]
	 */
	private String CustomerType;
	/**
	 * ����״̬[1..1]
	 */
	private String EtpSts;
	/**
	 * ��֯��������[1..1]
	 */
	private String OrgType;
	
	
	private String RptDateCode;
	

	public BsSgmt() {
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

	/**
	 * ��ȡ rptDate
	 * 
	 * @return the rptDate ��Ϣ��������[1..1]
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * ���� rptDate
	 * 
	 * @param rptDate
	 *            ��Ϣ��������[1..1]
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
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
	 * ��ȡ cimoc
	 * 
	 * @return the cimoc �ͻ�����ά����������[1..1]
	 */
	public String getCimoc() {
		return Cimoc;
	}

	/**
	 * ���� cimoc
	 * 
	 * @param cimoc
	 *            �ͻ�����ά����������[1..1]
	 */
	public void setCimoc(String cimoc) {
		Cimoc = cimoc;
	}

	/**
	 * ��ȡ customerType
	 * 
	 * @return the customerType �ͻ���������[1..1]
	 */
	public String getCustomerType() {
		return CustomerType;
	}

	/**
	 * ���� customerType
	 * 
	 * @param customerType
	 *            �ͻ���������[1..1]
	 */
	public void setCustomerType(String customerType) {
		CustomerType = customerType;
	}

	/**
	 * ��ȡ etpSts
	 * 
	 * @return the etpSts ����״̬[1..1]
	 */
	public String getEtpSts() {
		return EtpSts;
	}

	/**
	 * ���� etpSts
	 * 
	 * @param etpSts
	 *            ����״̬[1..1]
	 */
	public void setEtpSts(String etpSts) {
		EtpSts = etpSts;
	}

	/**
	 * ��ȡ orgType
	 * 
	 * @return the orgType ��֯��������[1..1]
	 */
	public String getOrgType() {
		return OrgType;
	}

	/**
	 * ���� orgType
	 * 
	 * @param orgType
	 *            ��֯��������[1..1]
	 */
	public void setOrgType(String orgType) {
		OrgType = orgType;
	}
	
	
	

	public String getRptDateCode() {
		return RptDateCode;
	}

	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BsSgmt [InfRecType=" + InfRecType + ", EntName=" + EntName
				+ ", EntCertType=" + EntCertType + ", EntCertNum=" + EntCertNum
				+ ", RptDate=" + RptDate + ", InfSurcCode=" + InfSurcCode
				+ ", Cimoc=" + Cimoc + ", CustomerType=" + CustomerType
				+ ", EtpSts=" + EtpSts + ", OrgType=" + OrgType + "]";
	}

}
