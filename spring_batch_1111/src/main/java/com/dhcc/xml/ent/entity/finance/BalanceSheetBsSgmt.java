package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: BalanceSheetBsSgmt<br/>
 * Description: ��ҵ�ʲ���ծ����Ϣ��¼������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfRecType", "EntName", "EntCertType", "EntCertNum",
		"RptDate", "SheetYear", "SheetType", "SheetTypeDivide",
		"AuditFirmName", "AuditorName", "AuditTime", "Cimoc", "RptDateCode" },namespace = "com.dhcc.xml.ent.entity.finance")
public class BalanceSheetBsSgmt {
	/**
	 *��Ϣ��¼����[1..1]
	 */
	private String InfRecType;
	/**
	 *��ҵ����[1..1]
	 */
	private String EntName;
	/**
	 *��ҵ��ݱ�ʶ����[1..1]
	 */
	private String EntCertType;
	/**
	 *��ҵ��ݱ�ʶ����1..1]
	 */
	private String EntCertNum;
	/**
	 *��Ϣ��������[1..1]
	 */
	private String RptDate;
	/**
	 *�������[1..1]
	 */
	private String SheetYear;
	/**
	 *��������[1..1]
	 */
	private String SheetType;
	/**
	 *��������ϸ��[1..1]
	 */
	private String SheetTypeDivide;
	/**
	 *�������������[1..1]
	 */
	private String AuditFirmName;
	/**
	 *�����Ա����[1..1]
	 */
	private String AuditorName;
	/**
	 *���ʱ��[1..1]
	 */
	private String AuditTime;
	/**
	 *�ͻ�����ά����������[1..1]
	 */
	private String Cimoc;
	/**
	 *����ʱ��˵������[1..1]
	 */
	private String RptDateCode;

	public BalanceSheetBsSgmt() {
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
	 * @return the entCertNum ��ҵ��ݱ�ʶ����1..1]
	 */
	public String getEntCertNum() {
		return EntCertNum;
	}

	/**
	 * ���� entCertNum
	 * 
	 * @param entCertNum
	 *            ��ҵ��ݱ�ʶ����1..1]
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
	 * ��ȡ sheetYear
	 * 
	 * @return the sheetYear �������[1..1]
	 */
	public String getSheetYear() {
		return SheetYear;
	}

	/**
	 * ���� sheetYear
	 * 
	 * @param sheetYear
	 *            �������[1..1]
	 */
	public void setSheetYear(String sheetYear) {
		SheetYear = sheetYear;
	}

	/**
	 * ��ȡ sheetType
	 * 
	 * @return the sheetType ��������[1..1]
	 */
	public String getSheetType() {
		return SheetType;
	}

	/**
	 * ���� sheetType
	 * 
	 * @param sheetType
	 *            ��������[1..1]
	 */
	public void setSheetType(String sheetType) {
		SheetType = sheetType;
	}

	/**
	 * ��ȡ sheetTypeDivide
	 * 
	 * @return the sheetTypeDivide ��������ϸ��[1..1]
	 */
	public String getSheetTypeDivide() {
		return SheetTypeDivide;
	}

	/**
	 * ���� sheetTypeDivide
	 * 
	 * @param sheetTypeDivide
	 *            ��������ϸ��[1..1]
	 */
	public void setSheetTypeDivide(String sheetTypeDivide) {
		SheetTypeDivide = sheetTypeDivide;
	}

	/**
	 * ��ȡ auditFirmName
	 * 
	 * @return the auditFirmName �������������[1..1]
	 */
	public String getAuditFirmName() {
		return AuditFirmName;
	}

	/**
	 * ���� auditFirmName
	 * 
	 * @param auditFirmName
	 *            �������������[1..1]
	 */
	public void setAuditFirmName(String auditFirmName) {
		AuditFirmName = auditFirmName;
	}

	/**
	 * ��ȡ auditorName
	 * 
	 * @return the auditorName �����Ա����[1..1]
	 */
	public String getAuditorName() {
		return AuditorName;
	}

	/**
	 * ���� auditorName
	 * 
	 * @param auditorName
	 *            �����Ա����[1..1]
	 */
	public void setAuditorName(String auditorName) {
		AuditorName = auditorName;
	}

	/**
	 * ��ȡ auditTime
	 * 
	 * @return the auditTime ���ʱ��[1..1]
	 */
	public String getAuditTime() {
		return AuditTime;
	}

	/**
	 * ���� auditTime
	 * 
	 * @param auditTime
	 *            ���ʱ��[1..1]
	 */
	public void setAuditTime(String auditTime) {
		AuditTime = auditTime;
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

	@Override
	public String toString() {
		return "BalanceSheetBsSgmt [InfRecType=" + InfRecType + ", EntName="
				+ EntName + ", EntCertType=" + EntCertType + ", EntCertNum="
				+ EntCertNum + ", RptDate=" + RptDate + ", SheetYear="
				+ SheetYear + ", SheetType=" + SheetType + ", SheetTypeDivide="
				+ SheetTypeDivide + ", AuditFirmName=" + AuditFirmName
				+ ", AuditorName=" + AuditorName + ", AuditTime=" + AuditTime
				+ ", Cimoc=" + Cimoc + ", RptDateCode=" + RptDateCode + "]";
	}

}
