package com.dhcc.xml.per.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: GuarRltRepymtInfSgmt<br/>
 * Description:个人担保账户记录账户在保责任信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月28日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "AcctStatus", "LoanAmt", "RepayPrd", "FiveCate",
		"FiveCateAdjDate", "RiEx", "CompAdvFlag", "CloseDate" },namespace = "com.dhcc.xml.per.entity.guarantee")
// 指定序列成的xml节点顺序
public class GuarRltRepymtInfSgmt {
	/** 账户状态[1..1] */
	private String AcctStatus;
	/** 在保余额[1..1] */
	private String LoanAmt;
	/** 余额变化日期[1..1] */
	private String RepayPrd;
	/** 五级分类[1..1] */
	private String FiveCate;
	/** 五级分类认定日期[1..1] */
	private String FiveCateAdjDate;
	/** 风险敞口[1..1] */
	private String RiEx;
	/** 代偿（垫款）标识[1..1] */
	private String CompAdvFlag;
	/** 账户关闭日期[1..1] */
	private String CloseDate;

	public GuarRltRepymtInfSgmt() {
		super();
	}

	/**
	 * 获取 acctStatus
	 * 
	 * @return the acctStatus 账户状态[1..1]
	 */
	public String getAcctStatus() {
		return AcctStatus;
	}

	/**
	 * 设置 acctStatus
	 * 
	 * @param acctStatus
	 *            账户状态[1..1]
	 */
	public void setAcctStatus(String acctStatus) {
		AcctStatus = acctStatus;
	}

	/**
	 * 获取 loanAmt
	 * 
	 * @return the loanAmt 在保余额[1..1]
	 */
	public String getLoanAmt() {
		return LoanAmt;
	}

	/**
	 * 设置 loanAmt
	 * 
	 * @param loanAmt
	 *            在保余额[1..1]
	 */
	public void setLoanAmt(String loanAmt) {
		LoanAmt = loanAmt;
	}

	/**
	 * 获取 repayPrd
	 * 
	 * @return the repayPrd 余额变化日期[1..1]
	 */
	public String getRepayPrd() {
		return RepayPrd;
	}

	/**
	 * 设置 repayPrd
	 * 
	 * @param repayPrd
	 *            余额变化日期[1..1]
	 */
	public void setRepayPrd(String repayPrd) {
		RepayPrd = repayPrd;
	}

	/**
	 * 获取 fiveCate
	 * 
	 * @return the fiveCate 五级分类[1..1]
	 */
	public String getFiveCate() {
		return FiveCate;
	}

	/**
	 * 设置 fiveCate
	 * 
	 * @param fiveCate
	 *            五级分类[1..1]
	 */
	public void setFiveCate(String fiveCate) {
		FiveCate = fiveCate;
	}

	/**
	 * 获取 fiveCateAdjDate
	 * 
	 * @return the fiveCateAdjDate 五级分类认定日期[1..1]
	 */
	public String getFiveCateAdjDate() {
		return FiveCateAdjDate;
	}

	/**
	 * 设置 fiveCateAdjDate
	 * 
	 * @param fiveCateAdjDate
	 *            五级分类认定日期[1..1]
	 */
	public void setFiveCateAdjDate(String fiveCateAdjDate) {
		FiveCateAdjDate = fiveCateAdjDate;
	}

	/**
	 * 获取 riEx
	 * 
	 * @return the riEx 风险敞口[1..1]
	 */
	public String getRiEx() {
		return RiEx;
	}

	/**
	 * 设置 riEx
	 * 
	 * @param riEx
	 *            风险敞口[1..1]
	 */
	public void setRiEx(String riEx) {
		RiEx = riEx;
	}

	/**
	 * 获取 compAdvFlag
	 * 
	 * @return the compAdvFlag 代偿（垫款）标识[1..1]
	 */
	public String getCompAdvFlag() {
		return CompAdvFlag;
	}

	/**
	 * 设置 compAdvFlag
	 * 
	 * @param compAdvFlag
	 *            代偿（垫款）标识[1..1]
	 */
	public void setCompAdvFlag(String compAdvFlag) {
		CompAdvFlag = compAdvFlag;
	}

	/**
	 * 获取 closeDate
	 * 
	 * @return the closeDate 账户关闭日期[1..1]
	 */
	public String getCloseDate() {
		return CloseDate;
	}

	/**
	 * 设置 closeDate
	 * 
	 * @param closeDate
	 *            账户关闭日期[1..1]
	 */
	public void setCloseDate(String closeDate) {
		CloseDate = closeDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GuarRltRepymtInfSgmt [AcctStatus=" + AcctStatus + ", LoanAmt="
				+ LoanAmt + ", RepayPrd=" + RepayPrd + ", FiveCate=" + FiveCate
				+ ", FiveCateAdjDate=" + FiveCateAdjDate + ", RiEx=" + RiEx
				+ ", CompAdvFlag=" + CompAdvFlag + ", CloseDate=" + CloseDate
				+ "]";
	}
}
