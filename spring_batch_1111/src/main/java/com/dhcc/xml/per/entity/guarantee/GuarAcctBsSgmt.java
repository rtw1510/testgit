package com.dhcc.xml.per.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: GuarAcctBsSgmt<br/>
 * Description: ���˵����˻���Ϣ��¼������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��28��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "InfRecType", "AcctType", "AcctCode", "RptDate",
		"RptDateCode", "Name", "IDType", "IDNum", "MngmtOrgCode" },namespace = "com.dhcc.xml.per.entity.guarantee")
// ָ�����гɵ�xml�ڵ�˳��
public class GuarAcctBsSgmt {
	/** ��Ϣ��¼����[1..1] */
	private String InfRecType;
	/** �˻�����[1..1] */
	private String AcctType;
	/** �˻���ʶ��[1..1] */
	private String AcctCode;
	/** ��Ϣ��������[1..1] */
	private String RptDate;
	/** ����ʱ��˵������[1..1] */
	private String RptDateCode;
	/** ծ��������[1..1] */
	private String Name;
	/** ծ����֤������[1..1] */
	private String IDType;
	/** ծ����֤������[1..1] */
	private String IDNum;
	/** ҵ������������[1..1] */
	private String MngmtOrgCode;

	public GuarAcctBsSgmt() {
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
	 * ��ȡ acctType
	 * 
	 * @return the acctType �˻�����[1..1]
	 */
	public String getAcctType() {
		return AcctType;
	}

	/**
	 * ���� acctType
	 * 
	 * @param acctType
	 *            �˻�����[1..1]
	 */
	public void setAcctType(String acctType) {
		AcctType = acctType;
	}

	/**
	 * ��ȡ acctCode
	 * 
	 * @return the acctCode �˻���ʶ��[1..1]
	 */
	public String getAcctCode() {
		return AcctCode;
	}

	/**
	 * ���� acctCode
	 * 
	 * @param acctCode
	 *            �˻���ʶ��[1..1]
	 */
	public void setAcctCode(String acctCode) {
		AcctCode = acctCode;
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
	 * ��ȡ rptDateCode
	 * 
	 * @return the rptDateCode ����ʱ��˵������[1..1]
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}

	/**
	 * ���� rptDateCode
	 * 
	 * @param rptDateCode
	 *            ����ʱ��˵������[1..1]
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}

	/**
	 * ��ȡ name
	 * 
	 * @return the name ծ��������[1..1]
	 */
	public String getName() {
		return Name;
	}

	/**
	 * ���� name
	 * 
	 * @param name
	 *            ծ��������[1..1]
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * ��ȡ iDType
	 * 
	 * @return the iDType ծ����֤������[1..1]
	 */
	public String getIDType() {
		return IDType;
	}

	/**
	 * ���� iDType
	 * 
	 * @param iDType
	 *            ծ����֤������[1..1]
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}

	/**
	 * ��ȡ iDNum
	 * 
	 * @return the iDNum ծ����֤������[1..1]
	 */
	public String getIDNum() {
		return IDNum;
	}

	/**
	 * ���� iDNum
	 * 
	 * @param iDNum
	 *            ծ����֤������[1..1]
	 */
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}

	/**
	 * ��ȡ mngmtOrgCode
	 * 
	 * @return the mngmtOrgCode ҵ������������[1..1]
	 */
	public String getMngmtOrgCode() {
		return MngmtOrgCode;
	}

	/**
	 * ���� mngmtOrgCode
	 * 
	 * @param mngmtOrgCode
	 *            ҵ������������[1..1]
	 */
	public void setMngmtOrgCode(String mngmtOrgCode) {
		MngmtOrgCode = mngmtOrgCode;
	}

	@Override
	public String toString() {
		return "GuarAcctBsSgmt [InfRecType=" + InfRecType + ", AcctType="
				+ AcctType + ", AcctCode=" + AcctCode + ", RptDate=" + RptDate
				+ ", RptDateCode=" + RptDateCode + ", Name=" + Name
				+ ", IDType=" + IDType + ", IDNum=" + IDNum + ", MngmtOrgCode="
				+ MngmtOrgCode + "]";
	}
}
