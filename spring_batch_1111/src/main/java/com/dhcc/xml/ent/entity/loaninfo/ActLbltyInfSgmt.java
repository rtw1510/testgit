package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: ActLbltyInfSgmt<br/>
 * Description: 企业借贷账户信息记录还款表现信息段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "AcctStatus", "AcctBal", "BalChgDate", "FiveCate",
		"FiveCateAdjDate", "PymtPrd", "TotOverd", "OverdPrinc", "OverdDy",
		"LatRpyDate", "LatRpyAmt","LatRpyPrincAmt", "RpmtType", "LatAgrrRpyDate",
		"LatAgrrRpyAmt", "NxtAgrrRpyDate", "CloseDate" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// 指定序列成的xml节点顺序
public class ActLbltyInfSgmt {
	/**
	 *账户状态 [1..1]
	 */
	private String AcctStatus;
	/**
	 *余额 [1..1]
	 */
	private String AcctBal;
	/**
	 *余额变化日期 [1..1]
	 */
	private String BalChgDate;
	/**
	 *五级分类 [1..1]
	 */
	private String FiveCate;
	/**
	 *五级分类认定日期 [1..1]
	 */
	private String FiveCateAdjDate;
	/**
	 *剩余还款月数 [0..1]
	 */
	private String PymtPrd;
	/**
	 *当前逾期总额 [0..1]
	 */
	private String TotOverd;
	/**
	 *当前逾期本金 [0..1]
	 */
	private String OverdPrinc;
	/**
	 *当前逾期天数 [0..1]
	 */
	private String OverdDy;
	/**
	 *最近一次实际还款日期 [0..1]
	 */
	private String LatRpyDate;
	/**
	 *最近一次实际还款金额 [1..1]
	 */
	private String LatRpyAmt;
	/**
	 *最近一次实际归还本金
	 */
	private String LatRpyPrincAmt;
	/**
	 *还款形式 [1..1]
	 */
	private String RpmtType;
	/**
	 *最近一次约定还款日 [1..1]
	 */
	private String LatAgrrRpyDate;
	/**
	 *最近一次约定还款金额 [1..1]
	 */
	private String LatAgrrRpyAmt;
	/**
	 *下一次约定还款日期 [1..1]
	 */
	private String NxtAgrrRpyDate;
	/**
	 *账户关闭日期 [1..1]
	 */
	private String CloseDate;

	public ActLbltyInfSgmt() {
		super();
	}

	/**
	 * 获取 acctStatus
	 * 
	 * @return the acctStatus 账户状态 [1..1]
	 */
	public String getAcctStatus() {
		return AcctStatus;
	}

	/**
	 * 设置 acctStatus
	 * 
	 * @param acctStatus
	 *            账户状态 [1..1]
	 */
	public void setAcctStatus(String acctStatus) {
		AcctStatus = acctStatus;
	}

	/**
	 * 获取 acctBal
	 * 
	 * @return the acctBal 余额 [1..1]
	 */
	public String getAcctBal() {
		return AcctBal;
	}

	/**
	 * 设置 acctBal
	 * 
	 * @param acctBal
	 *            余额 [1..1]
	 */
	public void setAcctBal(String acctBal) {
		AcctBal = acctBal;
	}

	/**
	 * 获取 balChgDate
	 * 
	 * @return the balChgDate 余额变化日期 [1..1]
	 */
	public String getBalChgDate() {
		return BalChgDate;
	}

	/**
	 * 设置 balChgDate
	 * 
	 * @param balChgDate
	 *            余额变化日期 [1..1]
	 */
	public void setBalChgDate(String balChgDate) {
		BalChgDate = balChgDate;
	}

	/**
	 * 获取 fiveCate
	 * 
	 * @return the fiveCate 五级分类 [1..1]
	 */
	public String getFiveCate() {
		return FiveCate;
	}

	/**
	 * 设置 fiveCate
	 * 
	 * @param fiveCate
	 *            五级分类 [1..1]
	 */
	public void setFiveCate(String fiveCate) {
		FiveCate = fiveCate;
	}

	/**
	 * 获取 fiveCateAdjDate
	 * 
	 * @return the fiveCateAdjDate 五级分类认定日期 [1..1]
	 */
	public String getFiveCateAdjDate() {
		return FiveCateAdjDate;
	}

	/**
	 * 设置 fiveCateAdjDate
	 * 
	 * @param fiveCateAdjDate
	 *            五级分类认定日期 [1..1]
	 */
	public void setFiveCateAdjDate(String fiveCateAdjDate) {
		FiveCateAdjDate = fiveCateAdjDate;
	}

	/**
	 * 获取 pymtPrd
	 * 
	 * @return the pymtPrd 剩余还款月数 [0..1]
	 */
	public String getPymtPrd() {
		return PymtPrd;
	}

	/**
	 * 设置 pymtPrd
	 * 
	 * @param pymtPrd
	 *            剩余还款月数 [0..1]
	 */
	public void setPymtPrd(String pymtPrd) {
		PymtPrd = pymtPrd;
	}

	/**
	 * 获取 totOverd
	 * 
	 * @return the totOverd 当前逾期总额 [0..1]
	 */
	public String getTotOverd() {
		return TotOverd;
	}

	/**
	 * 设置 totOverd
	 * 
	 * @param totOverd
	 *            当前逾期总额 [0..1]
	 */
	public void setTotOverd(String totOverd) {
		TotOverd = totOverd;
	}

	/**
	 * 获取 overdPrinc
	 * 
	 * @return the overdPrinc 当前逾期本金 [0..1]
	 */
	public String getOverdPrinc() {
		return OverdPrinc;
	}

	/**
	 * 设置 overdPrinc
	 * 
	 * @param overdPrinc
	 *            当前逾期本金 [0..1]
	 */
	public void setOverdPrinc(String overdPrinc) {
		OverdPrinc = overdPrinc;
	}

	/**
	 * 获取 overdDy
	 * 
	 * @return the overdDy 当前逾期天数 [0..1]
	 */
	public String getOverdDy() {
		return OverdDy;
	}

	/**
	 * 设置 overdDy
	 * 
	 * @param overdDy
	 *            当前逾期天数 [0..1]
	 */
	public void setOverdDy(String overdDy) {
		OverdDy = overdDy;
	}

	/**
	 * 获取 latRpyDate
	 * 
	 * @return the latRpyDate 最近一次实际还款日期 [0..1]
	 */
	public String getLatRpyDate() {
		return LatRpyDate;
	}

	/**
	 * 设置 latRpyDate
	 * 
	 * @param latRpyDate
	 *            最近一次实际还款日期 [0..1]
	 */
	public void setLatRpyDate(String latRpyDate) {
		LatRpyDate = latRpyDate;
	}

	/**
	 * 获取 latRpyAmt
	 * 
	 * @return the latRpyAmt 最近一次实际还款金额 [1..1]
	 */
	public String getLatRpyAmt() {
		return LatRpyAmt;
	}

	/**
	 * 设置 latRpyAmt
	 * 
	 * @param latRpyAmt
	 *            最近一次实际还款金额 [1..1]
	 */
	public void setLatRpyAmt(String latRpyAmt) {
		LatRpyAmt = latRpyAmt;
	}

	/**
	 * 获取 latRpyPrincAmt
	 * 
	 * @return the latRpyPrincAmt 最近一次实际归还本金
	 */
	public String getLatRpyPrincAmt() {
		return LatRpyPrincAmt;
	}

	/**
	 * 设置 latRpyPrincAmt
	 * 
	 * @param latRpyPrincAmt
	 *            最近一次实际归还本金
	 */
	public void setLatRpyPrincAmt(String latRpyPrincAmt) {
		LatRpyPrincAmt = latRpyPrincAmt;
	}

	/**
	 * 获取 rpmtType
	 * 
	 * @return the rpmtType 还款形式 [1..1]
	 */
	public String getRpmtType() {
		return RpmtType;
	}

	/**
	 * 设置 rpmtType
	 * 
	 * @param rpmtType
	 *            还款形式 [1..1]
	 */
	public void setRpmtType(String rpmtType) {
		RpmtType = rpmtType;
	}

	/**
	 * 获取 latAgrrRpyDate
	 * 
	 * @return the latAgrrRpyDate 最近一次约定还款日 [1..1]
	 */
	public String getLatAgrrRpyDate() {
		return LatAgrrRpyDate;
	}

	/**
	 * 设置 latAgrrRpyDate
	 * 
	 * @param latAgrrRpyDate
	 *            最近一次约定还款日 [1..1]
	 */
	public void setLatAgrrRpyDate(String latAgrrRpyDate) {
		LatAgrrRpyDate = latAgrrRpyDate;
	}

	/**
	 * 获取 latAgrrRpyAmt
	 * 
	 * @return the latAgrrRpyAmt 最近一次应还款金额 [1..1]
	 */
	public String getLatAgrrRpyAmt() {
		return LatAgrrRpyAmt;
	}

	/**
	 * 设置 latAgrrRpyAmt
	 * 
	 * @param latAgrrRpyAmt
	 *            最近一次应还款金额 [1..1]
	 */
	public void setLatAgrrRpyAmt(String latAgrrRpyAmt) {
		LatAgrrRpyAmt = latAgrrRpyAmt;
	}

	/**
	 * 获取 nxtAgrrRpyDate
	 * 
	 * @return the nxtAgrrRpyDate 下一次约定还款日期 [1..1]
	 */
	public String getNxtAgrrRpyDate() {
		return NxtAgrrRpyDate;
	}

	/**
	 * 设置 nxtAgrrRpyDate
	 * 
	 * @param nxtAgrrRpyDate
	 *            下一次约定还款日期 [1..1]
	 */
	public void setNxtAgrrRpyDate(String nxtAgrrRpyDate) {
		NxtAgrrRpyDate = nxtAgrrRpyDate;
	}

	/**
	 * 获取 closeDate
	 * 
	 * @return the closeDate 账户关闭日期 [1..1]
	 */
	public String getCloseDate() {
		return CloseDate;
	}

	/**
	 * 设置 closeDate
	 * 
	 * @param closeDate
	 *            账户关闭日期 [1..1]
	 */
	public void setCloseDate(String closeDate) {
		CloseDate = closeDate;
	}

	@Override
	public String toString() {
		return "ActLbltyInfSgmt [AcctStatus=" + AcctStatus + ", AcctBal="
				+ AcctBal + ", BalChgDate=" + BalChgDate + ", FiveCate="
				+ FiveCate + ", FiveCateAdjDate=" + FiveCateAdjDate
				+ ", PymtPrd=" + PymtPrd + ", TotOverd=" + TotOverd
				+ ", OverdPrinc=" + OverdPrinc + ", OverdDy=" + OverdDy
				+ ", LatRpyDate=" + LatRpyDate + ", LatRpyAmt=" + LatRpyAmt
				+ ", RpmtType=" + RpmtType + ", LatAgrrRpyDate="
				+ LatAgrrRpyDate + ", LatAgrrRpyAmt=" + LatAgrrRpyAmt
				+ ", NxtAgrrRpyDate=" + NxtAgrrRpyDate + ", CloseDate="
				+ CloseDate + "]";
	}

}
