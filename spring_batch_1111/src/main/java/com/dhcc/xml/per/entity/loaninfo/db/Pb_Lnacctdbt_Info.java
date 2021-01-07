package com.dhcc.xml.per.entity.loaninfo.db;

public class Pb_Lnacctdbt_Info {
	/** �˻�״̬ [1..1] */
	private String AcctStatus;
	/** ��� [1..1] */
	private String AcctBal;
	/** �弶���� [0..1] */
	private String FiveCate;
	/** �弶�����϶����� [0..1] */
	private String FiveCateAdjDate;
	/** ʣ�໹������ [0..1] */
	private String RemRepPrd;
	/** ��ǰ����״̬ [0..1] */
	private String RpyStatus;
	/** ��ǰ�������� [0..1] */
	private String OverdPrd;
	/** ��ǰ�����ܶ� [0..1] */
	private String TotOverd;
	/** ���һ��ʵ�ʻ����� [1..1] */
	private String LatRpyAmt;
	/** ���һ��ʵ�ʻ������� [1..1] */
	private String LatRpyDate;
	/** �˻��ر����� [1..1] */
	private String CloseDate;
	
	
	public Pb_Lnacctdbt_Info() {
		super();
	}
	public String getAcctStatus() {
		return AcctStatus;
	}
	public void setAcctStatus(String acctStatus) {
		AcctStatus = acctStatus;
	}
	public String getAcctBal() {
		return AcctBal;
	}
	public void setAcctBal(String acctBal) {
		AcctBal = acctBal;
	}
	public String getFiveCate() {
		return FiveCate;
	}
	public void setFiveCate(String fiveCate) {
		FiveCate = fiveCate;
	}
	public String getFiveCateAdjDate() {
		return FiveCateAdjDate;
	}
	public void setFiveCateAdjDate(String fiveCateAdjDate) {
		FiveCateAdjDate = fiveCateAdjDate;
	}
	public String getRemRepPrd() {
		return RemRepPrd;
	}
	public void setRemRepPrd(String remRepPrd) {
		RemRepPrd = remRepPrd;
	}
	public String getRpyStatus() {
		return RpyStatus;
	}
	public void setRpyStatus(String rpyStatus) {
		RpyStatus = rpyStatus;
	}
	public String getOverdPrd() {
		return OverdPrd;
	}
	public void setOverdPrd(String overdPrd) {
		OverdPrd = overdPrd;
	}
	public String getTotOverd() {
		return TotOverd;
	}
	public void setTotOverd(String totOverd) {
		TotOverd = totOverd;
	}
	public String getLatRpyAmt() {
		return LatRpyAmt;
	}
	public void setLatRpyAmt(String latRpyAmt) {
		LatRpyAmt = latRpyAmt;
	}
	public String getLatRpyDate() {
		return LatRpyDate;
	}
	public void setLatRpyDate(String latRpyDate) {
		LatRpyDate = latRpyDate;
	}
	public String getCloseDate() {
		return CloseDate;
	}
	public void setCloseDate(String closeDate) {
		CloseDate = closeDate;
	}
	
}
