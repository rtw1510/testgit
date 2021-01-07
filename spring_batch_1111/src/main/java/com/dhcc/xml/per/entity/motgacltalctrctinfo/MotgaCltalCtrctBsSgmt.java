/**  
 * Title: MotgaCltalCtrctBsSgmt.java<br\> 
 * Description: <br\> 
 * Copyright: Copyright (c) 2018<br\> 
 * Company: DHCC<br\>  
 * @author ChenJingYuan  
 * @date 2018-2-26  
 */
package com.dhcc.xml.per.entity.motgacltalctrctinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MotgaCltalCtrctBsSgmt<br/>
 * Description:�֣��ʣ�Ѻ��ͬ������ <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD) // �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "InfRecType", "CcCode","RptDate","RptDateCode","InfoIDType",
		"Name","CertType","CertNum","MngmtOrgCode" },namespace = "com.dhcc.xml.per.entity.motgacltalctrctinfo") // ָ�����гɵ�xml�ڵ�˳��
public class MotgaCltalCtrctBsSgmt {
	/**
	 *��Ϣ��¼���� [1..1]
	 */
	private String InfRecType;
	/**
	 *���ʣ�Ѻ��ͬ��ʶ�� [1..1]
	 */
	private String CcCode;
	/**
	 *��Ϣ�������� [1..1]
	 */
	private String RptDate;
	/**
	 *����ʱ��˵������ [1..1]
	 */
	private String RptDateCode;
	/**
	 *ծ���������� [1..1]
	 */
	private String InfoIDType;
	/**
	 *ծ�������� [1..1]
	 */
	private String Name;
	/**
	 *������ݱ�ʶ���� [1..1]
	 */
	private String CertType;
	/**
	 *������ݱ�ʶ���� [1..1]
	 */
	private String CertNum;
	/**
	 *ҵ������������ [1..1]
	 */
	private String MngmtOrgCode;

	/**
	 * Title: MotgaCltalCtrctBsSgmt.java<br\>
	 * Description: TODO<br\>
	 */
	public MotgaCltalCtrctBsSgmt() {
		super();
	}

	/**
	 * ��ȡ infRecType
	 * 
	 * @return the infRecType ��Ϣ��¼���� [1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * ���� infRecType
	 * 
	 * @param infRecType
	 *            ��Ϣ��¼���� [1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * ��ȡ ccCode
	 * 
	 * @return the ccCode ���ʣ�Ѻ��ͬ��ʶ�� [1..1]
	 */
	public String getCcCode() {
		return CcCode;
	}

	/**
	 * ���� ccCode
	 * 
	 * @param ccCode
	 *            ���ʣ�Ѻ��ͬ��ʶ�� [1..1]
	 */
	public void setCcCode(String ccCode) {
		CcCode = ccCode;
	}

	/**
	 * ��ȡ rptDate
	 * 
	 * @return the rptDate ��Ϣ�������� [1..1]
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * ���� rptDate
	 * 
	 * @param rptDate
	 *            ��Ϣ�������� [1..1]
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	/**
	 * ��ȡ rptDateCode
	 * 
	 * @return the rptDateCode ����ʱ��˵������ [1..1]
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}

	/**
	 * ���� rptDateCode
	 * 
	 * @param rptDateCode
	 *            ����ʱ��˵������ [1..1]
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}

	/**
	 * ��ȡ infoIDType
	 * 
	 * @return the infoIDType ծ���������� [1..1]
	 */
	public String getInfoIDType() {
		return InfoIDType;
	}

	/**
	 * ���� infoIDType
	 * 
	 * @param infoIDType
	 *            ծ���������� [1..1]
	 */
	public void setInfoIDType(String infoIDType) {
		InfoIDType = infoIDType;
	}

	/**
	 * ��ȡ name
	 * 
	 * @return the name ծ�������� [1..1]
	 */
	public String getName() {
		return Name;
	}

	/**
	 * ���� name
	 * 
	 * @param name
	 *            ծ�������� [1..1]
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * ��ȡ certType
	 * 
	 * @return the certType ������ݱ�ʶ���� [1..1]
	 */
	public String getCertType() {
		return CertType;
	}

	/**
	 * ���� certType
	 * 
	 * @param certType
	 *            ������ݱ�ʶ���� [1..1]
	 */
	public void setCertType(String certType) {
		CertType = certType;
	}

	/**
	 * ��ȡ certNum
	 * 
	 * @return the certNum ������ݱ�ʶ���� [1..1]
	 */
	public String getCertNum() {
		return CertNum;
	}

	/**
	 * ���� certNum
	 * 
	 * @param certNum
	 *            ������ݱ�ʶ���� [1..1]
	 */
	public void setCertNum(String certNum) {
		CertNum = certNum;
	}

	/**
	 * ��ȡ mngmtOrgCode
	 * 
	 * @return the mngmtOrgCode ҵ������������ [1..1]
	 */
	public String getMngmtOrgCode() {
		return MngmtOrgCode;
	}

	/**
	 * ���� mngmtOrgCode
	 * 
	 * @param mngmtOrgCode
	 *            ҵ������������ [1..1]
	 */
	public void setMngmtOrgCode(String mngmtOrgCode) {
		MngmtOrgCode = mngmtOrgCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MotgaCltalCtrctBsSgmt [CcCode=" + CcCode + ", CertNum="
				+ CertNum + ", CertType=" + CertType + ", InfRecType="
				+ InfRecType + ", InfoIDType=" + InfoIDType + ", MngmtOrgCode="
				+ MngmtOrgCode + ", Name=" + Name + ", RptDate=" + RptDate
				+ ", RptDateCode=" + RptDateCode + "]";
	}

}
