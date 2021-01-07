package com.dhcc.xml.per.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: CreditLimSgmt<br/>
 * Description: <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "CreditLimType", "LimLoopFlg", "CreditLim", "Cy",
		"ConEffDate", "ConExpDate", "ConStatus" ,"CreditRest","CreditRestCode"},namespace = "com.dhcc.xml.per.entity.credit")
public class CreditLimSgmt {
	/** 授信额度类型[1..1] */
	private String CreditLimType;
	/** 额度循环标志[1..1] */
	private String LimLoopFlg;
	/** 授信额度[1..1] */
	private String CreditLim;
	/** 币种[1..1] */
	private String Cy;
	/** 额度生效日期[1..1] */
	private String ConEffDate;
	/** 额度到期日期[1..1] */
	private String ConExpDate;
	/** 额度状态[1..1] */
	private String ConStatus;
	/** 授信限额[0..1] */
	private String CreditRest;
	/** 授信限额编号[0..1] */
	private String CreditRestCode ;

	public CreditLimSgmt() {
		super();
	}

	/**
	 * 获取 creditLimType
	 * 
	 * @return the creditLimType 授信额度类型[1..1]
	 */
	public String getCreditLimType() {
		return CreditLimType;
	}

	/**
	 * 设置 creditLimType
	 * 
	 * @param creditLimType
	 *            授信额度类型[1..1]
	 */
	public void setCreditLimType(String creditLimType) {
		CreditLimType = creditLimType;
	}

	public String getCreditRest() {
		return CreditRest;
	}

	public void setCreditRest(String creditRest) {
		CreditRest = creditRest;
	}

	public String getCreditRestCode() {
		return CreditRestCode;
	}

	public void setCreditRestCode(String creditRestCode) {
		CreditRestCode = creditRestCode;
	}

	/**
	 * 获取 limLoopFlg
	 * 
	 * @return the limLoopFlg 额度循环标志[1..1]
	 */
	public String getLimLoopFlg() {
		return LimLoopFlg;
	}

	/**
	 * 设置 limLoopFlg
	 * 
	 * @param limLoopFlg
	 *            额度循环标志[1..1]
	 */
	public void setLimLoopFlg(String limLoopFlg) {
		LimLoopFlg = limLoopFlg;
	}

	/**
	 * 获取 creditLim
	 * 
	 * @return the creditLim 授信额度[1..1]
	 */
	public String getCreditLim() {
		return CreditLim;
	}

	/**
	 * 设置 creditLim
	 * 
	 * @param creditLim
	 *            授信额度[1..1]
	 */
	public void setCreditLim(String creditLim) {
		CreditLim = creditLim;
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
	 * 获取 conEffDate
	 * 
	 * @return the conEffDate 额度生效日期[1..1]
	 */
	public String getConEffDate() {
		return ConEffDate;
	}

	/**
	 * 设置 conEffDate
	 * 
	 * @param conEffDate
	 *            额度生效日期[1..1]
	 */
	public void setConEffDate(String conEffDate) {
		ConEffDate = conEffDate;
	}

	/**
	 * 获取 conExpDate
	 * 
	 * @return the conExpDate 额度到期日期[1..1]
	 */
	public String getConExpDate() {
		return ConExpDate;
	}

	/**
	 * 设置 conExpDate
	 * 
	 * @param conExpDate
	 *            额度到期日期[1..1]
	 */
	public void setConExpDate(String conExpDate) {
		ConExpDate = conExpDate;
	}

	/**
	 * 获取 conStatus
	 * 
	 * @return the conStatus 额度状态[1..1]
	 */
	public String getConStatus() {
		return ConStatus;
	}

	/**
	 * 设置 conStatus
	 * 
	 * @param conStatus
	 *            额度状态[1..1]
	 */
	public void setConStatus(String conStatus) {
		ConStatus = conStatus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CreditLimSgmt [CreditLimType=" + CreditLimType
				+ ", LimLoopFlg=" + LimLoopFlg + ", CreditLim=" + CreditLim
				+ ", Cy=" + Cy + ", ConEffDate=" + ConEffDate + ", ConExpDate="
				+ ConExpDate + ", ConStatus=" + ConStatus + "]";
	}
}
