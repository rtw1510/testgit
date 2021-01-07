package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InstitutionBalanceSheetBsSgmt<br/>
 * Description:事业单位资产负债表信息记录基础段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "InfRecType", "EntName", "EntCertType", "EntCertNum",
		"RptDate", "SheetYear", "SheetType", "SheetTypeDivide",
		"AuditFirmName", "AuditorName", "AuditTime", "Cimoc", "RptDateCode" },namespace = "com.dhcc.xml.ent.entity.finance")
// 指定序列成的xml节点顺序
public class InstitutionBalanceSheetBsSgmt {
	/**
	 *信息记录类型
	 */
	private String InfRecType; 
	/**
	 *企业名称
	 */
	private String EntName; 
	/**
	 *企业身份标识类型
	 */
	private String EntCertType; 
	/**
	 *企业身份标识号码
	 */
	private String EntCertNum; 
	/**
	 *信息报告日期
	 */
	private String RptDate; 
	/**
	 *报表年份
	 */
	private String SheetYear; 
	/**
	 *报表类型
	 */
	private String SheetType; 
	/**
	 *报表类型细分
	 */
	private String SheetTypeDivide; 
	/**
	 *审计事务所名称
	 */
	private String AuditFirmName; 
	/**
	 *审计人员名称
	 */
	private String AuditorName; 
	/**
	 *审计时间
	 */
	private String AuditTime; 
	/**
	 *客户资料维护机构代码
	 */
	private String Cimoc; 
	/**
	 *报告时点说明代码
	 */
	private String RptDateCode; 

	public InstitutionBalanceSheetBsSgmt() {
		super();
	}

	/**
	 * 获取 infRecType
	 * 
	 * @return the infRecType 信息记录类型
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * 设置 infRecType
	 * 
	 * @param infRecType
	 *            信息记录类型
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * 获取 entName
	 * 
	 * @return the entName 企业名称
	 */
	public String getEntName() {
		return EntName;
	}

	/**
	 * 设置 entName
	 * 
	 * @param entName
	 *            企业名称
	 */
	public void setEntName(String entName) {
		EntName = entName;
	}

	/**
	 * 获取 entCertType
	 * 
	 * @return the entCertType 企业身份标识类型
	 */
	public String getEntCertType() {
		return EntCertType;
	}

	/**
	 * 设置 entCertType
	 * 
	 * @param entCertType
	 *            企业身份标识类型
	 */
	public void setEntCertType(String entCertType) {
		EntCertType = entCertType;
	}

	/**
	 * 获取 entCertNum
	 * 
	 * @return the entCertNum 企业身份标识号码
	 */
	public String getEntCertNum() {
		return EntCertNum;
	}

	/**
	 * 设置 entCertNum
	 * 
	 * @param entCertNum
	 *            企业身份标识号码
	 */
	public void setEntCertNum(String entCertNum) {
		EntCertNum = entCertNum;
	}

	/**
	 * 获取 rptDate
	 * 
	 * @return the rptDate 信息报告日期
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * 设置 rptDate
	 * 
	 * @param rptDate
	 *            信息报告日期
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	/**
	 * 获取 sheetYear
	 * 
	 * @return the sheetYear 报表年份
	 */
	public String getSheetYear() {
		return SheetYear;
	}

	/**
	 * 设置 sheetYear
	 * 
	 * @param sheetYear
	 *            报表年份
	 */
	public void setSheetYear(String sheetYear) {
		SheetYear = sheetYear;
	}

	/**
	 * 获取 sheetType
	 * 
	 * @return the sheetType 报表类型
	 */
	public String getSheetType() {
		return SheetType;
	}

	/**
	 * 设置 sheetType
	 * 
	 * @param sheetType
	 *            报表类型
	 */
	public void setSheetType(String sheetType) {
		SheetType = sheetType;
	}

	/**
	 * 获取 sheetTypeDivide
	 * 
	 * @return the sheetTypeDivide 报表类型细分
	 */
	public String getSheetTypeDivide() {
		return SheetTypeDivide;
	}

	/**
	 * 设置 sheetTypeDivide
	 * 
	 * @param sheetTypeDivide
	 *            报表类型细分
	 */
	public void setSheetTypeDivide(String sheetTypeDivide) {
		SheetTypeDivide = sheetTypeDivide;
	}

	/**
	 * 获取 auditFirmName
	 * 
	 * @return the auditFirmName 审计事务所名称
	 */
	public String getAuditFirmName() {
		return AuditFirmName;
	}

	/**
	 * 设置 auditFirmName
	 * 
	 * @param auditFirmName
	 *            审计事务所名称
	 */
	public void setAuditFirmName(String auditFirmName) {
		AuditFirmName = auditFirmName;
	}

	/**
	 * 获取 auditorName
	 * 
	 * @return the auditorName 审计人员名称
	 */
	public String getAuditorName() {
		return AuditorName;
	}

	/**
	 * 设置 auditorName
	 * 
	 * @param auditorName
	 *            审计人员名称
	 */
	public void setAuditorName(String auditorName) {
		AuditorName = auditorName;
	}

	/**
	 * 获取 auditTime
	 * 
	 * @return the auditTime 审计时间
	 */
	public String getAuditTime() {
		return AuditTime;
	}

	/**
	 * 设置 auditTime
	 * 
	 * @param auditTime
	 *            审计时间
	 */
	public void setAuditTime(String auditTime) {
		AuditTime = auditTime;
	}

	/**
	 * 获取 cimoc
	 * 
	 * @return the cimoc 客户资料维护机构代码
	 */
	public String getCimoc() {
		return Cimoc;
	}

	/**
	 * 设置 cimoc
	 * 
	 * @param cimoc
	 *            客户资料维护机构代码
	 */
	public void setCimoc(String cimoc) {
		Cimoc = cimoc;
	}

	/**
	 * 获取 rptDateCode
	 * 
	 * @return the rptDateCode 报告时点说明代码
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}

	/**
	 * 设置 rptDateCode
	 * 
	 * @param rptDateCode
	 *            报告时点说明代码
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
