package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: GuarAcctBsInfSgmt<br/>
 * Description: 企业担保账户记录账户基本信息段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "BusiLines", "BusiDtilLines", "OpenDate", "GuarAmt",
		"Cy", "DueDate", "GuarMode", "OthRepyGuarWay", "SecDep", "CtrctTxtCode" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class GuarAcctBsInfSgmt {

	/**
	 *担保业务大类[1..1]
	 */
	private String BusiLines;
	/**
	 *担保业务种类细分1..1]
	 */
	private String BusiDtilLines;
	/**
	 *开户日期[1..1]
	 */
	private String OpenDate;
	/**
	 *担保金额[1..1]
	 */
	private String GuarAmt;
	/**
	 *币种[1..1]
	 */
	private String Cy;
	/**
	 *到期日期[1..1]
	 */
	private String DueDate;
	/**
	 *反担保方式[1..1]
	 */
	private String GuarMode;
	/**
	 *其他还款保证方式[1..1]
	 */
	private String OthRepyGuarWay;
	/**
	 *保证金百分比[1..1]
	 */
	private String SecDep;
	/**
	 *担保合同文本编号[1..1]
	 */
	private String CtrctTxtCode;

	public GuarAcctBsInfSgmt() {
		super();

	}

	/**
	 * 获取 busiLines
	 * 
	 * @return the busiLines 担保业务大类[1..1]
	 */
	public String getBusiLines() {
		return BusiLines;
	}

	/**
	 * 设置 busiLines
	 * 
	 * @param busiLines
	 *            担保业务大类[1..1]
	 */
	public void setBusiLines(String busiLines) {
		BusiLines = busiLines;
	}

	/**
	 * 获取 busiDtilLines
	 * 
	 * @return the busiDtilLines 担保业务种类细分1..1]
	 */
	public String getBusiDtilLines() {
		return BusiDtilLines;
	}

	/**
	 * 设置 busiDtilLines
	 * 
	 * @param busiDtilLines
	 *            担保业务种类细分1..1]
	 */
	public void setBusiDtilLines(String busiDtilLines) {
		BusiDtilLines = busiDtilLines;
	}

	/**
	 * 获取 openDate
	 * 
	 * @return the openDate 开户日期[1..1]
	 */
	public String getOpenDate() {
		return OpenDate;
	}

	/**
	 * 设置 openDate
	 * 
	 * @param openDate
	 *            开户日期[1..1]
	 */
	public void setOpenDate(String openDate) {
		OpenDate = openDate;
	}

	/**
	 * 获取 guarAmt
	 * 
	 * @return the guarAmt 担保金额[1..1]
	 */
	public String getGuarAmt() {
		return GuarAmt;
	}

	/**
	 * 设置 guarAmt
	 * 
	 * @param guarAmt
	 *            担保金额[1..1]
	 */
	public void setGuarAmt(String guarAmt) {
		GuarAmt = guarAmt;
	}

	/**
	 * 获取 cy
	 * 
	 * @return the cy 币种[1..1]
	 */
	public String getCy() {
		return Cy;
	}

	/**
	 * 设置 cy
	 * 
	 * @param cy
	 *            币种[1..1]
	 */
	public void setCy(String cy) {
		Cy = cy;
	}

	/**
	 * 获取 dueDate
	 * 
	 * @return the dueDate 到期日期[1..1]
	 */
	public String getDueDate() {
		return DueDate;
	}

	/**
	 * 设置 dueDate
	 * 
	 * @param dueDate
	 *            到期日期[1..1]
	 */
	public void setDueDate(String dueDate) {
		DueDate = dueDate;
	}

	/**
	 * 获取 guarMode
	 * 
	 * @return the guarMode 反担保方式[1..1]
	 */
	public String getGuarMode() {
		return GuarMode;
	}

	/**
	 * 设置 guarMode
	 * 
	 * @param guarMode
	 *            反担保方式[1..1]
	 */
	public void setGuarMode(String guarMode) {
		GuarMode = guarMode;
	}

	/**
	 * 获取 othRepyGuarWay
	 * 
	 * @return the othRepyGuarWay 其他还款保证方式[1..1]
	 */
	public String getOthRepyGuarWay() {
		return OthRepyGuarWay;
	}

	/**
	 * 设置 othRepyGuarWay
	 * 
	 * @param othRepyGuarWay
	 *            其他还款保证方式[1..1]
	 */
	public void setOthRepyGuarWay(String othRepyGuarWay) {
		OthRepyGuarWay = othRepyGuarWay;
	}

	/**
	 * 获取 secDep
	 * 
	 * @return the secDep 保证金百分比[1..1]
	 */
	public String getSecDep() {
		return SecDep;
	}

	/**
	 * 设置 secDep
	 * 
	 * @param secDep
	 *            保证金百分比[1..1]
	 */
	public void setSecDep(String secDep) {
		SecDep = secDep;
	}

	/**
	 * 获取 ctrctTxtCode
	 * 
	 * @return the ctrctTxtCode 担保合同文本编号[1..1]
	 */
	public String getCtrctTxtCode() {
		return CtrctTxtCode;
	}

	/**
	 * 设置 ctrctTxtCode
	 * 
	 * @param ctrctTxtCode
	 *            担保合同文本编号[1..1]
	 */
	public void setCtrctTxtCode(String ctrctTxtCode) {
		CtrctTxtCode = ctrctTxtCode;
	}

	@Override
	public String toString() {
		return "GuarAcctBsInfSgmt [BusiLines=" + BusiLines + ", BusiDtilLines="
				+ BusiDtilLines + ", OpenDate=" + OpenDate + ", GuarAmt="
				+ GuarAmt + ", Cy=" + Cy + ", DueDate=" + DueDate
				+ ", GuarMode=" + GuarMode + ", OthRepyGuarWay="
				+ OthRepyGuarWay + ", SecDep=" + SecDep + ", CtrctTxtCode="
				+ CtrctTxtCode + "]";
	}

}
