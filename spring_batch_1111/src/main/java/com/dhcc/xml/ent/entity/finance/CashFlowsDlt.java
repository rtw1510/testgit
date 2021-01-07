package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: CashFlowsDlt<br/>
 * Description:企业现金流量表整笔删除请求记录数据项<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfRecType", "EntName", "EntCertType", "EntCertNum", "SheetYear", "SheetType", "SheetTypeDivide" },namespace = "com.dhcc.xml.ent.entity.finance")
// 指定序列成的xml节点顺序
public class CashFlowsDlt {
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

	public CashFlowsDlt() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "CashFlowsDlt [" + "InfRecType=" + InfRecType + "EntName="
				+ EntName + "EntCertType=" + EntCertType + "EntCertNum="
				+ EntCertNum + "SheetYear=" + SheetYear
				+ "SheetType=" + SheetType + "SheetTypeDivide"
				+ SheetTypeDivide + "]";
	}

}
