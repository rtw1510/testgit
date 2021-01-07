package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: AcctMthlyBlgInfSgmt<br/>
 * Description: �¶ȱ�����Ϣ��<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "Month", "SettDate", "AcctStatus", "AcctBal",
		"PridAcctBal", "UsedAmt", "NotIsuBal", "RemRepPrd", "FiveCate",
		"FiveCateAdjDate", "RpyStatus", "RpyPrct", "OverdPrd", "TotOverd",
		"OverdPrinc", "Oved31_60Princ", "Oved61_90Princ", "Oved91_180Princ",
		"OvedPrinc180", "OvedrawBaOve180", "CurRpyAmt", "ActRpyAmt",
		"LatRpyDate", "CloseDate" },namespace = "com.dhcc.xml.per.entity.loaninfo")
public class AcctMthlyBlgInfSgmt {
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
	public AcctMthlyBlgInfSgmt() {
		super();
	}
	/**  
	 * ��ȡ month
	 * @return the month �·�[1..1] 
	 */
	public String getMonth() {
		return Month;
	}
	/**  
	 * ���� month  
	 * @param month �·�[1..1]  
	 */
	public void setMonth(String month) {
		Month = month;
	}
	/**  
	 * ��ȡ settDate
	 * @return the settDate ����Ӧ������[1..1] 
	 */
	public String getSettDate() {
		return SettDate;
	}
	/**  
	 * ���� settDate  
	 * @param settDate ����Ӧ������[1..1]  
	 */
	public void setSettDate(String settDate) {
		SettDate = settDate;
	}
	/**  
	 * ��ȡ acctStatus
	 * @return the acctStatus �˻�״̬[1..1] 
	 */
	public String getAcctStatus() {
		return AcctStatus;
	}
	/**  
	 * ���� acctStatus  
	 * @param acctStatus �˻�״̬[1..1]  
	 */
	public void setAcctStatus(String acctStatus) {
		AcctStatus = acctStatus;
	}
	/**  
	 * ��ȡ acctBal
	 * @return the acctBal ���[1..1] 
	 */
	public String getAcctBal() {
		return AcctBal;
	}
	/**  
	 * ���� acctBal  
	 * @param acctBal ���[1..1]  
	 */
	public void setAcctBal(String acctBal) {
		AcctBal = acctBal;
	}
	/**  
	 * ��ȡ pridAcctBal
	 * @return the pridAcctBal �����˵����[0..1] 
	 */
	public String getPridAcctBal() {
		return PridAcctBal;
	}
	/**  
	 * ���� pridAcctBal  
	 * @param pridAcctBal �����˵����[0..1]  
	 */
	public void setPridAcctBal(String pridAcctBal) {
		PridAcctBal = pridAcctBal;
	}
	/**  
	 * ��ȡ usedAmt
	 * @return the usedAmt ��ʹ�ö��[0..1] 
	 */
	public String getUsedAmt() {
		return UsedAmt;
	}
	/**  
	 * ���� usedAmt  
	 * @param usedAmt ��ʹ�ö��[0..1]  
	 */
	public void setUsedAmt(String usedAmt) {
		UsedAmt = usedAmt;
	}
	/**  
	 * ��ȡ notIsuBal
	 * @return the notIsuBal δ�����Ĵ��ר��������[0..1] 
	 */
	public String getNotIsuBal() {
		return NotIsuBal;
	}
	/**  
	 * ���� notIsuBal  
	 * @param notIsuBal δ�����Ĵ��ר��������[0..1]  
	 */
	public void setNotIsuBal(String notIsuBal) {
		NotIsuBal = notIsuBal;
	}
	/**  
	 * ��ȡ remRepPrd
	 * @return the remRepPrd ʣ�໹������[0..1] 
	 */
	public String getRemRepPrd() {
		return RemRepPrd;
	}
	/**  
	 * ���� remRepPrd  
	 * @param remRepPrd ʣ�໹������[0..1]  
	 */
	public void setRemRepPrd(String remRepPrd) {
		RemRepPrd = remRepPrd;
	}
	/**  
	 * ��ȡ fiveCate
	 * @return the fiveCate �弶����[1..1] 
	 */
	public String getFiveCate() {
		return FiveCate;
	}
	/**  
	 * ���� fiveCate  
	 * @param fiveCate �弶����[1..1]  
	 */
	public void setFiveCate(String fiveCate) {
		FiveCate = fiveCate;
	}
	/**  
	 * ��ȡ fiveCateAdjDate
	 * @return the fiveCateAdjDate �弶�����϶�����[1..1] 
	 */
	public String getFiveCateAdjDate() {
		return FiveCateAdjDate;
	}
	/**  
	 * ���� fiveCateAdjDate  
	 * @param fiveCateAdjDate �弶�����϶�����[1..1]  
	 */
	public void setFiveCateAdjDate(String fiveCateAdjDate) {
		FiveCateAdjDate = fiveCateAdjDate;
	}
	/**  
	 * ��ȡ rpyStatus
	 * @return the rpyStatus ��ǰ����״̬[1..1] 
	 */
	public String getRpyStatus() {
		return RpyStatus;
	}
	/**  
	 * ���� rpyStatus  
	 * @param rpyStatus ��ǰ����״̬[1..1]  
	 */
	public void setRpyStatus(String rpyStatus) {
		RpyStatus = rpyStatus;
	}
	/**  
	 * ��ȡ rpyPrct
	 * @return the rpyPrct ʵ�ʻ���ٷֱ�[0..1] 
	 */
	public String getRpyPrct() {
		return RpyPrct;
	}
	/**  
	 * ���� rpyPrct  
	 * @param rpyPrct ʵ�ʻ���ٷֱ�[0..1]  
	 */
	public void setRpyPrct(String rpyPrct) {
		RpyPrct = rpyPrct;
	}
	/**  
	 * ��ȡ overdPrd
	 * @return the overdPrd ��ǰ��������[0..1] 
	 */
	public String getOverdPrd() {
		return OverdPrd;
	}
	/**  
	 * ���� overdPrd  
	 * @param overdPrd ��ǰ��������[0..1]  
	 */
	public void setOverdPrd(String overdPrd) {
		OverdPrd = overdPrd;
	}
	/**  
	 * ��ȡ totOverd
	 * @return the totOverd ��ǰ�����ܶ�[0..1] 
	 */
	public String getTotOverd() {
		return TotOverd;
	}
	/**  
	 * ���� totOverd  
	 * @param totOverd ��ǰ�����ܶ�[0..1]  
	 */
	public void setTotOverd(String totOverd) {
		TotOverd = totOverd;
	}
	/**  
	 * ��ȡ overdPrinc
	 * @return the overdPrinc ��ǰ���ڱ���[0..1] 
	 */
	public String getOverdPrinc() {
		return OverdPrinc;
	}
	/**  
	 * ���� overdPrinc  
	 * @param overdPrinc ��ǰ���ڱ���[0..1]  
	 */
	public void setOverdPrinc(String overdPrinc) {
		OverdPrinc = overdPrinc;
	}
	/**  
	 * ��ȡ oved31_60Princ
	 * @return the oved31_60Princ ����31-60��δ�黹����[0..1] 
	 */
	public String getOved31_60Princ() {
		return Oved31_60Princ;
	}
	/**  
	 * ���� oved31_60Princ  
	 * @param oved31_60Princ ����31-60��δ�黹����[0..1]  
	 */
	public void setOved31_60Princ(String oved31_60Princ) {
		Oved31_60Princ = oved31_60Princ;
	}
	/**  
	 * ��ȡ oved61_90Princ
	 * @return the oved61_90Princ ����61-90��δ�黹����[0..1] 
	 */
	public String getOved61_90Princ() {
		return Oved61_90Princ;
	}
	/**  
	 * ���� oved61_90Princ  
	 * @param oved61_90Princ ����61-90��δ�黹����[0..1]  
	 */
	public void setOved61_90Princ(String oved61_90Princ) {
		Oved61_90Princ = oved61_90Princ;
	}
	/**  
	 * ��ȡ oved91_180Princ
	 * @return the oved91_180Princ ����91-180��δ�黹����[0..1] 
	 */
	public String getOved91_180Princ() {
		return Oved91_180Princ;
	}
	/**  
	 * ���� oved91_180Princ  
	 * @param oved91_180Princ ����91-180��δ�黹����[0..1]  
	 */
	public void setOved91_180Princ(String oved91_180Princ) {
		Oved91_180Princ = oved91_180Princ;
	}
	/**  
	 * ��ȡ ovedPrinc180
	 * @return the ovedPrinc180 ����180������δ�黹����[0..1] 
	 */
	public String getOvedPrinc180() {
		return OvedPrinc180;
	}
	/**  
	 * ���� ovedPrinc180  
	 * @param ovedPrinc180 ����180������δ�黹����[0..1]  
	 */
	public void setOvedPrinc180(String ovedPrinc180) {
		OvedPrinc180 = ovedPrinc180;
	}
	/**  
	 * ��ȡ ovedrawBaOve180
	 * @return the ovedrawBaOve180 ͸֧180������δ�����[0..1] 
	 */
	public String getOvedrawBaOve180() {
		return OvedrawBaOve180;
	}
	/**  
	 * ���� ovedrawBaOve180  
	 * @param ovedrawBaOve180 ͸֧180������δ�����[0..1]  
	 */
	public void setOvedrawBaOve180(String ovedrawBaOve180) {
		OvedrawBaOve180 = ovedrawBaOve180;
	}
	/**  
	 * ��ȡ curRpyAmt
	 * @return the curRpyAmt ����Ӧ������[0..1] 
	 */
	public String getCurRpyAmt() {
		return CurRpyAmt;
	}
	/**  
	 * ���� curRpyAmt  
	 * @param curRpyAmt ����Ӧ������[0..1]  
	 */
	public void setCurRpyAmt(String curRpyAmt) {
		CurRpyAmt = curRpyAmt;
	}
	/**  
	 * ��ȡ actRpyAmt
	 * @return the actRpyAmt ����ʵ�ʻ�����[0..1] 
	 */
	public String getActRpyAmt() {
		return ActRpyAmt;
	}
	/**  
	 * ���� actRpyAmt  
	 * @param actRpyAmt ����ʵ�ʻ�����[0..1]  
	 */
	public void setActRpyAmt(String actRpyAmt) {
		ActRpyAmt = actRpyAmt;
	}
	/**  
	 * ��ȡ latRpyDate
	 * @return the latRpyDate ���һ��ʵ�ʻ�������[1..1] 
	 */
	public String getLatRpyDate() {
		return LatRpyDate;
	}
	/**  
	 * ���� latRpyDate  
	 * @param latRpyDate ���һ��ʵ�ʻ�������[1..1]  
	 */
	public void setLatRpyDate(String latRpyDate) {
		LatRpyDate = latRpyDate;
	}
	/**  
	 * ��ȡ closeDate
	 * @return the closeDate �˻��ر�����[1..1] 
	 */
	public String getCloseDate() {
		return CloseDate;
	}
	/**  
	 * ���� closeDate  
	 * @param closeDate �˻��ر�����[1..1]  
	 */
	public void setCloseDate(String closeDate) {
		CloseDate = closeDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AcctMthlyBlgInfSgmt [Month=" + Month + ", SettDate=" + SettDate
				+ ", AcctStatus=" + AcctStatus + ", AcctBal=" + AcctBal
				+ ", PridAcctBal=" + PridAcctBal + ", UsedAmt=" + UsedAmt
				+ ", NotIsuBal=" + NotIsuBal + ", RemRepPrd=" + RemRepPrd
				+ ", FiveCate=" + FiveCate + ", FiveCateAdjDate="
				+ FiveCateAdjDate + ", RpyStatus=" + RpyStatus + ", RpyPrct="
				+ RpyPrct + ", OverdPrd=" + OverdPrd + ", TotOverd=" + TotOverd
				+ ", OverdPrinc=" + OverdPrinc + ", Oved31_60Princ="
				+ Oved31_60Princ + ", Oved61_90Princ=" + Oved61_90Princ
				+ ", Oved91_180Princ=" + Oved91_180Princ + ", OvedPrinc180="
				+ OvedPrinc180 + ", OvedrawBaOve180=" + OvedrawBaOve180
				+ ", CurRpyAmt=" + CurRpyAmt + ", ActRpyAmt=" + ActRpyAmt
				+ ", LatRpyDate=" + LatRpyDate + ", CloseDate=" + CloseDate
				+ "]";
	}
}
