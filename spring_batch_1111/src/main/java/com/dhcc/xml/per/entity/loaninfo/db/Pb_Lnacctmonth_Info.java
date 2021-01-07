package com.dhcc.xml.per.entity.loaninfo.db;

public class Pb_Lnacctmonth_Info {
	/* 1���¶ȱ�����Ϣ�� */
	/** �·�[1..1] */
	private String Month;
	/** ����/Ӧ������[1..1] */
	private String SettDate;
	/** �˻�״̬[1..1] */
	private String AcctStatus;
	/** ���[1..1] */
	private String AcctBal;
	/** �����˵����[0..1] */
	private String PridAcctBal;
	/** ��ʹ�ö��[0..1] */
	private String UsedAmt;
	/** δ�����Ĵ��ר��������[0..1] */
	private String NotIsuBal;
	/** ʣ�໹������[0..1] */
	private String RemRepPrd;
	/** �弶����[1..1] */
	private String FiveCate;
	/** �弶�����϶�����[1..1] */
	private String FiveCateAdjDate;
	/** ��ǰ����״̬[1..1] */
	private String RpyStatus;
	/** ʵ�ʻ���ٷֱ�[0..1] */
	private String RpyPrct;
	/** ��ǰ��������[0..1] */
	private String OverdPrd;
	/** ��ǰ�����ܶ�[0..1] */
	private String TotOverd;
	/** ��ǰ���ڱ���[0..1] */
	private String OverdPrinc;
	/** ����31-60��δ�黹����[0..1] */
	private String Oved31_60Princ;
	/** ����61-90��δ�黹����[0..1] */
	private String Oved61_90Princ;
	/** ����91-180��δ�黹����[0..1] */
	private String Oved91_180Princ;
	/** ����180������δ�黹����[0..1] */
	private String OvedPrinc180;
	/** ͸֧180������δ�����[0..1] */
	private String OvedrawBaOve180;
	/** ����Ӧ������[0..1] */
	private String CurRpyAmt;
	/** ����ʵ�ʻ�����[0..1] */
	private String ActRpyAmt;
	/** ���һ��ʵ�ʻ�������[1..1] */
	private String LatRpyDate;
	/** �˻��ر�����[1..1] */
	private String CloseDate;
	/* 2�����ר�������Ϣ�� */
	/** ���ר����ڶ�� [1..1] */
	private String SpecLine;
	/** ���ڶ����Ч���� [1..1] */
	private String SpecEfctDate;
	/** ���ڶ�ȵ������� [1..1] */
	private String SpecEndDate;
	/** ���÷��ڽ�� [1..1] */
	private String UsedInstAmt;
	
	public Pb_Lnacctmonth_Info() {
		super();
	}
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	public String getSettDate() {
		return SettDate;
	}
	public void setSettDate(String settDate) {
		SettDate = settDate;
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
	public String getPridAcctBal() {
		return PridAcctBal;
	}
	public void setPridAcctBal(String pridAcctBal) {
		PridAcctBal = pridAcctBal;
	}
	public String getUsedAmt() {
		return UsedAmt;
	}
	public void setUsedAmt(String usedAmt) {
		UsedAmt = usedAmt;
	}
	public String getNotIsuBal() {
		return NotIsuBal;
	}
	public void setNotIsuBal(String notIsuBal) {
		NotIsuBal = notIsuBal;
	}
	public String getRemRepPrd() {
		return RemRepPrd;
	}
	public void setRemRepPrd(String remRepPrd) {
		RemRepPrd = remRepPrd;
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
	public String getRpyStatus() {
		return RpyStatus;
	}
	public void setRpyStatus(String rpyStatus) {
		RpyStatus = rpyStatus;
	}
	public String getRpyPrct() {
		return RpyPrct;
	}
	public void setRpyPrct(String rpyPrct) {
		RpyPrct = rpyPrct;
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
	public String getOverdPrinc() {
		return OverdPrinc;
	}
	public void setOverdPrinc(String overdPrinc) {
		OverdPrinc = overdPrinc;
	}
	public String getOved31_60Princ() {
		return Oved31_60Princ;
	}
	public void setOved31_60Princ(String oved31_60Princ) {
		Oved31_60Princ = oved31_60Princ;
	}
	public String getOved61_90Princ() {
		return Oved61_90Princ;
	}
	public void setOved61_90Princ(String oved61_90Princ) {
		Oved61_90Princ = oved61_90Princ;
	}
	public String getOved91_180Princ() {
		return Oved91_180Princ;
	}
	public void setOved91_180Princ(String oved91_180Princ) {
		Oved91_180Princ = oved91_180Princ;
	}
	public String getOvedPrinc180() {
		return OvedPrinc180;
	}
	public void setOvedPrinc180(String ovedPrinc180) {
		OvedPrinc180 = ovedPrinc180;
	}
	public String getOvedrawBaOve180() {
		return OvedrawBaOve180;
	}
	public void setOvedrawBaOve180(String ovedrawBaOve180) {
		OvedrawBaOve180 = ovedrawBaOve180;
	}
	public String getCurRpyAmt() {
		return CurRpyAmt;
	}
	public void setCurRpyAmt(String curRpyAmt) {
		CurRpyAmt = curRpyAmt;
	}
	public String getActRpyAmt() {
		return ActRpyAmt;
	}
	public void setActRpyAmt(String actRpyAmt) {
		ActRpyAmt = actRpyAmt;
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
	public String getSpecLine() {
		return SpecLine;
	}
	public void setSpecLine(String specLine) {
		SpecLine = specLine;
	}
	public String getSpecEfctDate() {
		return SpecEfctDate;
	}
	public void setSpecEfctDate(String specEfctDate) {
		SpecEfctDate = specEfctDate;
	}
	public String getSpecEndDate() {
		return SpecEndDate;
	}
	public void setSpecEndDate(String specEndDate) {
		SpecEndDate = specEndDate;
	}
	public String getUsedInstAmt() {
		return UsedInstAmt;
	}
	public void setUsedInstAmt(String usedInstAmt) {
		UsedInstAmt = usedInstAmt;
	}
	
}
