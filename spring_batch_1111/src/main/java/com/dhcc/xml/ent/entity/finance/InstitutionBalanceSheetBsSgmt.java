package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InstitutionBalanceSheetBsSgmt<br/>
 * Description:��ҵ��λ�ʲ���ծ����Ϣ��¼������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "InfRecType", "EntName", "EntCertType", "EntCertNum",
		"RptDate", "SheetYear", "SheetType", "SheetTypeDivide",
		"AuditFirmName", "AuditorName", "AuditTime", "Cimoc", "RptDateCode" },namespace = "com.dhcc.xml.ent.entity.finance")
// ָ�����гɵ�xml�ڵ�˳��
public class InstitutionBalanceSheetBsSgmt {
	/**
	 *��Ϣ��¼����
	 */
	private String InfRecType; 
	/**
	 *��ҵ����
	 */
	private String EntName; 
	/**
	 *��ҵ��ݱ�ʶ����
	 */
	private String EntCertType; 
	/**
	 *��ҵ��ݱ�ʶ����
	 */
	private String EntCertNum; 
	/**
	 *��Ϣ��������
	 */
	private String RptDate; 
	/**
	 *�������
	 */
	private String SheetYear; 
	/**
	 *��������
	 */
	private String SheetType; 
	/**
	 *��������ϸ��
	 */
	private String SheetTypeDivide; 
	/**
	 *�������������
	 */
	private String AuditFirmName; 
	/**
	 *�����Ա����
	 */
	private String AuditorName; 
	/**
	 *���ʱ��
	 */
	private String AuditTime; 
	/**
	 *�ͻ�����ά����������
	 */
	private String Cimoc; 
	/**
	 *����ʱ��˵������
	 */
	private String RptDateCode; 

	public InstitutionBalanceSheetBsSgmt() {
		super();
	}

	/**
	 * ��ȡ infRecType
	 * 
	 * @return the infRecType ��Ϣ��¼����
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * ���� infRecType
	 * 
	 * @param infRecType
	 *            ��Ϣ��¼����
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * ��ȡ entName
	 * 
	 * @return the entName ��ҵ����
	 */
	public String getEntName() {
		return EntName;
	}

	/**
	 * ���� entName
	 * 
	 * @param entName
	 *            ��ҵ����
	 */
	public void setEntName(String entName) {
		EntName = entName;
	}

	/**
	 * ��ȡ entCertType
	 * 
	 * @return the entCertType ��ҵ��ݱ�ʶ����
	 */
	public String getEntCertType() {
		return EntCertType;
	}

	/**
	 * ���� entCertType
	 * 
	 * @param entCertType
	 *            ��ҵ��ݱ�ʶ����
	 */
	public void setEntCertType(String entCertType) {
		EntCertType = entCertType;
	}

	/**
	 * ��ȡ entCertNum
	 * 
	 * @return the entCertNum ��ҵ��ݱ�ʶ����
	 */
	public String getEntCertNum() {
		return EntCertNum;
	}

	/**
	 * ���� entCertNum
	 * 
	 * @param entCertNum
	 *            ��ҵ��ݱ�ʶ����
	 */
	public void setEntCertNum(String entCertNum) {
		EntCertNum = entCertNum;
	}

	/**
	 * ��ȡ rptDate
	 * 
	 * @return the rptDate ��Ϣ��������
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * ���� rptDate
	 * 
	 * @param rptDate
	 *            ��Ϣ��������
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	/**
	 * ��ȡ sheetYear
	 * 
	 * @return the sheetYear �������
	 */
	public String getSheetYear() {
		return SheetYear;
	}

	/**
	 * ���� sheetYear
	 * 
	 * @param sheetYear
	 *            �������
	 */
	public void setSheetYear(String sheetYear) {
		SheetYear = sheetYear;
	}

	/**
	 * ��ȡ sheetType
	 * 
	 * @return the sheetType ��������
	 */
	public String getSheetType() {
		return SheetType;
	}

	/**
	 * ���� sheetType
	 * 
	 * @param sheetType
	 *            ��������
	 */
	public void setSheetType(String sheetType) {
		SheetType = sheetType;
	}

	/**
	 * ��ȡ sheetTypeDivide
	 * 
	 * @return the sheetTypeDivide ��������ϸ��
	 */
	public String getSheetTypeDivide() {
		return SheetTypeDivide;
	}

	/**
	 * ���� sheetTypeDivide
	 * 
	 * @param sheetTypeDivide
	 *            ��������ϸ��
	 */
	public void setSheetTypeDivide(String sheetTypeDivide) {
		SheetTypeDivide = sheetTypeDivide;
	}

	/**
	 * ��ȡ auditFirmName
	 * 
	 * @return the auditFirmName �������������
	 */
	public String getAuditFirmName() {
		return AuditFirmName;
	}

	/**
	 * ���� auditFirmName
	 * 
	 * @param auditFirmName
	 *            �������������
	 */
	public void setAuditFirmName(String auditFirmName) {
		AuditFirmName = auditFirmName;
	}

	/**
	 * ��ȡ auditorName
	 * 
	 * @return the auditorName �����Ա����
	 */
	public String getAuditorName() {
		return AuditorName;
	}

	/**
	 * ���� auditorName
	 * 
	 * @param auditorName
	 *            �����Ա����
	 */
	public void setAuditorName(String auditorName) {
		AuditorName = auditorName;
	}

	/**
	 * ��ȡ auditTime
	 * 
	 * @return the auditTime ���ʱ��
	 */
	public String getAuditTime() {
		return AuditTime;
	}

	/**
	 * ���� auditTime
	 * 
	 * @param auditTime
	 *            ���ʱ��
	 */
	public void setAuditTime(String auditTime) {
		AuditTime = auditTime;
	}

	/**
	 * ��ȡ cimoc
	 * 
	 * @return the cimoc �ͻ�����ά����������
	 */
	public String getCimoc() {
		return Cimoc;
	}

	/**
	 * ���� cimoc
	 * 
	 * @param cimoc
	 *            �ͻ�����ά����������
	 */
	public void setCimoc(String cimoc) {
		Cimoc = cimoc;
	}

	/**
	 * ��ȡ rptDateCode
	 * 
	 * @return the rptDateCode ����ʱ��˵������
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}

	/**
	 * ���� rptDateCode
	 * 
	 * @param rptDateCode
	 *            ����ʱ��˵������
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}

	@Override
	public String toString() {
		return "IncomeAndExpenseStatementBsSgmt [" + "InfRecType=" + InfRecType
				+ "EntName=" + EntName + "EntCertType=" + EntCertType
				+ "EntCertNum=" + EntCertNum + "RptDate=" + RptDate
				+ "SheetYear=" + SheetYear + "SheetType=" + SheetType
				+ "SheetTypeDivide=" + SheetTypeDivide + "AuditFirmName="
				+ AuditFirmName + "AuditorName=" + AuditorName + "AuditTime="
				+ AuditTime + "Cimoc=" + Cimoc + "RptDateCode" + RptDateCode
				+ "]";
	}
}
