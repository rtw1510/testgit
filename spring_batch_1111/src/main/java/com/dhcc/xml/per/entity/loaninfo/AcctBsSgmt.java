package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: AcctBsSgmt<br/>
 * Description: ���˽���˻���Ϣ��¼������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfRecType", "AcctType", "AcctCode", "RptDate",
		"RptDateCode", "Name", "IDType", "IDNum", "MngmtOrgCode" },namespace = "com.dhcc.xml.per.entity.loaninfo")
public class AcctBsSgmt {
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
	/** ���������[1..1] */
	private String Name;
	/** �����֤������[1..1] */
	private String IDType;
	/** �����֤������[1..1] */
	private String IDNum;
	/** ҵ������������[1..1] */
	private String MngmtOrgCode;
	public AcctBsSgmt() {
		super();
	}
	/**  
	 * ��ȡ infRecType
	 * @return the infRecType ��Ϣ��¼����[1..1] 
	 */
	public String getInfRecType() {
		return InfRecType;
	}
	/**  
	 * ���� infRecType  
	 * @param infRecType ��Ϣ��¼����[1..1]  
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}
	/**  
	 * ��ȡ acctType
	 * @return the acctType �˻�����[1..1] 
	 */
	public String getAcctType() {
		return AcctType;
	}
	/**  
	 * ���� acctType  
	 * @param acctType �˻�����[1..1]  
	 */
	public void setAcctType(String acctType) {
		AcctType = acctType;
	}
	/**  
	 * ��ȡ acctCode
	 * @return the acctCode �˻���ʶ��[1..1] 
	 */
	public String getAcctCode() {
		return AcctCode;
	}
	/**  
	 * ���� acctCode  
	 * @param acctCode �˻���ʶ��[1..1]  
	 */
	public void setAcctCode(String acctCode) {
		AcctCode = acctCode;
	}
	/**  
	 * ��ȡ rptDate
	 * @return the rptDate ��Ϣ��������[1..1] 
	 */
	public String getRptDate() {
		return RptDate;
	}
	/**  
	 * ���� rptDate  
	 * @param rptDate ��Ϣ��������[1..1]  
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}
	/**  
	 * ��ȡ rptDateCode
	 * @return the rptDateCode ����ʱ��˵������[1..1] 
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}
	/**  
	 * ���� rptDateCode  
	 * @param rptDateCode ����ʱ��˵������[1..1]  
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}
	/**  
	 * ��ȡ name
	 * @return the name ���������[1..1] 
	 */
	public String getName() {
		return Name;
	}
	/**  
	 * ���� name  
	 * @param name ���������[1..1]  
	 */
	public void setName(String name) {
		Name = name;
	}
	/**  
	 * ��ȡ iDType
	 * @return the iDType �����֤������[1..1] 
	 */
	public String getIDType() {
		return IDType;
	}
	/**  
	 * ���� iDType  
	 * @param iDType �����֤������[1..1]  
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}
	/**  
	 * ��ȡ iDNum
	 * @return the iDNum �����֤������[1..1] 
	 */
	public String getIDNum() {
		return IDNum;
	}
	/**  
	 * ���� iDNum  
	 * @param iDNum �����֤������[1..1]  
	 */
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}
	/**  
	 * ��ȡ mngmtOrgCode
	 * @return the mngmtOrgCode ҵ������������[1..1] 
	 */
	public String getMngmtOrgCode() {
		return MngmtOrgCode;
	}
	/**  
	 * ���� mngmtOrgCode  
	 * @param mngmtOrgCode ҵ������������[1..1]  
	 */
	public void setMngmtOrgCode(String mngmtOrgCode) {
		MngmtOrgCode = mngmtOrgCode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AcctBsSgmt [InfRecType=" + InfRecType + ", AcctType="
				+ AcctType + ", AcctCode=" + AcctCode + ", RptDate=" + RptDate
				+ ", RptDateCode=" + RptDateCode + ", Name=" + Name
				+ ", IDType=" + IDType + ", IDNum=" + IDNum + ", MngmtOrgCode="
				+ MngmtOrgCode + "]";
	}
}
