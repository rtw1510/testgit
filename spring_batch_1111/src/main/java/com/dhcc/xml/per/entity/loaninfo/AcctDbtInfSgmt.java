package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: AcctDbtInfSgmt<br/>
 * Description:非月度表现信息段[0..1] <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "AcctStatus", "AcctBal", "FiveCate", "FiveCateAdjDate",
		"RemRepPrd", "RpyStatus", "OverdPrd", "TotOverd", "LatRpyAmt",
		"LatRpyDate", "CloseDate" },namespace = "com.dhcc.xml.per.entity.loaninfo")
public class AcctDbtInfSgmt {
	/** 账户状态 [1..1] */
	private String AcctStatus;
	/** 余额 [1..1] */
	private String AcctBal;
	/** 五级分类 [0..1] */
	private String FiveCate;
	/** 五级分类认定日期 [0..1] */
	private String FiveCateAdjDate;
	/** 剩余还款期数 [0..1] */
	private String RemRepPrd;
	/** 当前还款状态 [0..1] */
	private String RpyStatus;
	/** 当前逾期期数 [0..1] */
	private String OverdPrd;
	/** 当前逾期总额 [0..1] */
	private String TotOverd;
	/** 最近一次实际还款金额 [1..1] */
	private String LatRpyAmt;
	/** 最近一次实际还款日期 [1..1] */
	private String LatRpyDate;
	/** 账户关闭日期 [1..1] */
	private String CloseDate;
	public AcctDbtInfSgmt() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**  
	 * 获取 acctStatus
	 * @return the acctStatus 账户状态 [1..1] 
	 */
	public String getAcctStatus() {
		return AcctStatus;
	}
	/**  
	 * 设置 acctStatus  
	 * @param acctStatus 账户状态 [1..1]  
	 */
	public void setAcctStatus(String acctStatus) {
		AcctStatus = acctStatus;
	}
	/**  
	 * 获取 acctBal
	 * @return the acctBal 余额 [1..1] 
	 */
	public String getAcctBal() {
		return AcctBal;
	}
	/**  
	 * 设置 acctBal  
	 * @param acctBal 余额 [1..1]  
	 */
	public void setAcctBal(String acctBal) {
		AcctBal = acctBal;
	}
	/**  
	 * 获取 fiveCate
	 * @return the fiveCate 五级分类 [0..1] 
	 */
	public String getFiveCate() {
		return FiveCate;
	}
	/**  
	 * 设置 fiveCate  
	 * @param fiveCate 五级分类 [0..1]  
	 */
	public void setFiveCate(String fiveCate) {
		FiveCate = fiveCate;
	}
	/**  
	 * 获取 fiveCateAdjDate
	 * @return the fiveCateAdjDate 五级分类认定日期 [0..1] 
	 */
	public String getFiveCateAdjDate() {
		return FiveCateAdjDate;
	}
	/**  
	 * 设置 fiveCateAdjDate  
	 * @param fiveCateAdjDate 五级分类认定日期 [0..1]  
	 */
	public void setFiveCateAdjDate(String fiveCateAdjDate) {
		FiveCateAdjDate = fiveCateAdjDate;
	}
	/**  
	 * 获取 remRepPrd
	 * @return the remRepPrd 剩余还款期数 [0..1] 
	 */
	public String getRemRepPrd() {
		return RemRepPrd;
	}
	/**  
	 * 设置 remRepPrd  
	 * @param remRepPrd 剩余还款期数 [0..1]  
	 */
	public void setRemRepPrd(String remRepPrd) {
		RemRepPrd = remRepPrd;
	}
	/**  
	 * 获取 rpyStatus
	 * @return the rpyStatus 当前还款状态 [0..1] 
	 */
	public String getRpyStatus() {
		return RpyStatus;
	}
	/**  
	 * 设置 rpyStatus  
	 * @param rpyStatus 当前还款状态 [0..1]  
	 */
	public void setRpyStatus(String rpyStatus) {
		RpyStatus = rpyStatus;
	}
	/**  
	 * 获取 overdPrd
	 * @return the overdPrd 当前逾期期数 [0..1] 
	 */
	public String getOverdPrd() {
		return OverdPrd;
	}
	/**  
	 * 设置 overdPrd  
	 * @param overdPrd 当前逾期期数 [0..1]  
	 */
	public void setOverdPrd(String overdPrd) {
		OverdPrd = overdPrd;
	}
	/**  
	 * 获取 totOverd
	 * @return the totOverd 当前逾期总额 [0..1] 
	 */
	public String getTotOverd() {
		return TotOverd;
	}
	/**  
	 * 设置 totOverd  
	 * @param totOverd 当前逾期总额 [0..1]  
	 */
	public void setTotOverd(String totOverd) {
		TotOverd = totOverd;
	}
	/**  
	 * 获取 latRpyAmt
	 * @return the latRpyAmt 最近一次实际还款金额 [1..1] 
	 */
	public String getLatRpyAmt() {
		return LatRpyAmt;
	}
	/**  
	 * 设置 latRpyAmt  
	 * @param latRpyAmt 最近一次实际还款金额 [1..1]  
	 */
	public void setLatRpyAmt(String latRpyAmt) {
		LatRpyAmt = latRpyAmt;
	}
	/**  
	 * 获取 latRpyDate
	 * @return the latRpyDate 最近一次实际还款日期 [1..1] 
	 */
	public String getLatRpyDate() {
		return LatRpyDate;
	}
	/**  
	 * 设置 latRpyDate  
	 * @param latRpyDate 最近一次实际还款日期 [1..1]  
	 */
	public void setLatRpyDate(String latRpyDate) {
		LatRpyDate = latRpyDate;
	}
	/**  
	 * 获取 closeDate
	 * @return the closeDate 账户关闭日期 [1..1] 
	 */
	public String getCloseDate() {
		return CloseDate;
	}
	/**  
	 * 设置 closeDate  
	 * @param closeDate 账户关闭日期 [1..1]  
	 */
	public void setCloseDate(String closeDate) {
		CloseDate = closeDate;
	}
	@Override
	public String toString() {
		return "AcctDbtInfSgmt [AcctStatus=" + AcctStatus + ", AcctBal="
				+ AcctBal + ", FiveCate=" + FiveCate + ", FiveCateAdjDate="
				+ FiveCateAdjDate + ", RemRepPrd=" + RemRepPrd + ", RpyStatus="
				+ RpyStatus + ", OverdPrd=" + OverdPrd + ", TotOverd="
				+ TotOverd + ", LatRpyAmt=" + LatRpyAmt + ", LatRpyDate="
				+ LatRpyDate + ", CloseDate=" + CloseDate + "]";
	}

}
