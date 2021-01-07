package com.dhcc.xml.ent.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnCtrctInfDel<br/>
 * Description:企业授信协议按段删除请求记录<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "InfRecType", "DelRecCode", "DelSgmtCode",
		"DelStartDate", "DelEndDate" },namespace = "com.dhcc.xml.ent.entity.credit")
// 指定序列成的xml节点顺序
public class EnCtrctInfDel {
	/**
	 *信息记录类型 [1..1]
	 */
	private String InfRecType;
	/**
	 *待删除业务标识[1..1]
	 */
	private String DelRecCode;
	/**
	 *待删除段段标 [1..1]
	 */
	private String DelSgmtCode;
	/**
	 *待删除起始日期[1..1]
	 */
	private String DelStartDate;
	/**
	 *待删除结束日期[1..1]
	 */
	private String DelEndDate;

	public EnCtrctInfDel() {
		super();
	}

	/**
	 * 获取 infRecType
	 * 
	 * @return the infRecType 信息记录类型 [1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * 设置 infRecType
	 * 
	 * @param infRecType
	 *            信息记录类型 [1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * 获取 delRecCode
	 * 
	 * @return the delRecCode 待删除业务标识[1..1]
	 */
	public String getDelRecCode() {
		return DelRecCode;
	}

	/**
	 * 设置 delRecCode
	 * 
	 * @param delRecCode
	 *            待删除业务标识[1..1]
	 */
	public void setDelRecCode(String delRecCode) {
		DelRecCode = delRecCode;
	}

	/**
	 * 获取 delSgmtCode
	 * 
	 * @return the delSgmtCode 待删除段段标 [1..1]
	 */
	public String getDelSgmtCode() {
		return DelSgmtCode;
	}

	/**
	 * 设置 delSgmtCode
	 * 
	 * @param delSgmtCode
	 *            待删除段段标 [1..1]
	 */
	public void setDelSgmtCode(String delSgmtCode) {
		DelSgmtCode = delSgmtCode;
	}

	/**
	 * 获取 delStartDate
	 * 
	 * @return the delStartDate 待删除起始日期[1..1]
	 */
	public String getDelStartDate() {
		return DelStartDate;
	}

	/**
	 * 设置 delStartDate
	 * 
	 * @param delStartDate
	 *            待删除起始日期[1..1]
	 */
	public void setDelStartDate(String delStartDate) {
		DelStartDate = delStartDate;
	}

	/**
	 * 获取 delEndDate
	 * 
	 * @return the delEndDate 待删除结束日期[1..1]
	 */
	public String getDelEndDate() {
		return DelEndDate;
	}

	/**
	 * 设置 delEndDate
	 * 
	 * @param delEndDate
	 *            待删除结束日期[1..1]
	 */
	public void setDelEndDate(String delEndDate) {
		DelEndDate = delEndDate;
	}

	@Override
	public String toString() {
		return "EnCtrctInfDel [InfRecType=" + InfRecType + ", DelRecCode="
				+ DelRecCode + ", DelSgmtCode=" + DelSgmtCode
				+ ", DelStartDate=" + DelStartDate + ", DelEndDate="
				+ DelEndDate + "]";
	}
}
