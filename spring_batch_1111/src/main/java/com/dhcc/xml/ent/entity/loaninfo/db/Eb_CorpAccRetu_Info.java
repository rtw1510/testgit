package com.dhcc.xml.ent.entity.loaninfo.db;

/**
 * Title: Eb_CorpAccRetu_Info<br/>
 * Description:��ҵ����˻����������Ϣ��ӳ���ֶ� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-7-25
 */
public class Eb_CorpAccRetu_Info {
	/**
	 *�˻�״̬ [1..1]
	 */
	private String AcctStatus;
	/**
	 *��� [1..1]
	 */
	private String AcctBal;
	/**
	 *���仯���� [1..1]
	 */
	private String BalChgDate;
	/**
	 *�弶���� [1..1]
	 */
	private String FiveCate;
	/**
	 *�弶�����϶����� [1..1]
	 */
	private String FiveCateAdjDate;
	/**
	 *ʣ�໹������ [0..1]
	 */
	private String PymtPrd;
	/**
	 *��ǰ�����ܶ� [0..1]
	 */
	private String TotOverd;
	/**
	 *��ǰ���ڱ��� [0..1]
	 */
	private String OverdPrinc;
	/**
	 *��ǰ�������� [0..1]
	 */
	private String OverdDy;
	/**
	 *���һ��ʵ�ʻ������� [0..1]
	 */
	private String LatRpyDate;
	/**
	 *���һ��ʵ�ʻ����� [1..1]
	 */
	private String LatRpyAmt;
	/**
	 *���һ��ʵ�ʹ黹����
	 */
	private String LatRpyPrincAmt;
	/**
	 *������ʽ [1..1]
	 */
	private String RpmtType;
	/**
	 *���һ��Լ�������� [1..1]
	 */
	private String LatAgrrRpyDate;
	/**
	 *���һ��Լ�������� [1..1]
	 */
	private String LatAgrrRpyAmt;
	/**
	 *��һ��Լ���������� [1..1]
	 */
	private String NxtAgrrRpyDate;
	/**
	 *�˻��ر����� [1..1]
	 */
	private String CloseDate;
	/**
	 *�˻���ʶ��
	 */
	private String AcctCode;

	public Eb_CorpAccRetu_Info() {
		super();
	}

	/**
	 * ��ȡ acctStatus
	 * 
	 * @return the acctStatus �˻�״̬ [1..1]
	 */
	public String getAcctStatus() {
		return AcctStatus;
	}

	/**
	 * ���� acctStatus
	 * 
	 * @param acctStatus
	 *            �˻�״̬ [1..1]
	 */
	public void setAcctStatus(String acctStatus) {
		AcctStatus = acctStatus;
	}

	/**
	 * ��ȡ acctBal
	 * 
	 * @return the acctBal ��� [1..1]
	 */
	public String getAcctBal() {
		return AcctBal;
	}

	/**
	 * ���� acctBal
	 * 
	 * @param acctBal
	 *            ��� [1..1]
	 */
	public void setAcctBal(String acctBal) {
		AcctBal = acctBal;
	}

	/**
	 * ��ȡ balChgDate
	 * 
	 * @return the balChgDate ���仯���� [1..1]
	 */
	public String getBalChgDate() {
		return BalChgDate;
	}

	/**
	 * ���� balChgDate
	 * 
	 * @param balChgDate
	 *            ���仯���� [1..1]
	 */
	public void setBalChgDate(String balChgDate) {
		BalChgDate = balChgDate;
	}

	/**
	 * ��ȡ fiveCate
	 * 
	 * @return the fiveCate �弶���� [1..1]
	 */
	public String getFiveCate() {
		return FiveCate;
	}

	/**
	 * ���� fiveCate
	 * 
	 * @param fiveCate
	 *            �弶���� [1..1]
	 */
	public void setFiveCate(String fiveCate) {
		FiveCate = fiveCate;
	}

	/**
	 * ��ȡ fiveCateAdjDate
	 * 
	 * @return the fiveCateAdjDate �弶�����϶����� [1..1]
	 */
	public String getFiveCateAdjDate() {
		return FiveCateAdjDate;
	}

	/**
	 * ���� fiveCateAdjDate
	 * 
	 * @param fiveCateAdjDate
	 *            �弶�����϶����� [1..1]
	 */
	public void setFiveCateAdjDate(String fiveCateAdjDate) {
		FiveCateAdjDate = fiveCateAdjDate;
	}

	/**
	 * ��ȡ pymtPrd
	 * 
	 * @return the pymtPrd ʣ�໹������ [0..1]
	 */
	public String getPymtPrd() {
		return PymtPrd;
	}

	/**
	 * ���� pymtPrd
	 * 
	 * @param pymtPrd
	 *            ʣ�໹������ [0..1]
	 */
	public void setPymtPrd(String pymtPrd) {
		PymtPrd = pymtPrd;
	}

	/**
	 * ��ȡ totOverd
	 * 
	 * @return the totOverd ��ǰ�����ܶ� [0..1]
	 */
	public String getTotOverd() {
		return TotOverd;
	}

	/**
	 * ���� totOverd
	 * 
	 * @param totOverd
	 *            ��ǰ�����ܶ� [0..1]
	 */
	public void setTotOverd(String totOverd) {
		TotOverd = totOverd;
	}

	/**
	 * ��ȡ overdPrinc
	 * 
	 * @return the overdPrinc ��ǰ���ڱ��� [0..1]
	 */
	public String getOverdPrinc() {
		return OverdPrinc;
	}

	/**
	 * ���� overdPrinc
	 * 
	 * @param overdPrinc
	 *            ��ǰ���ڱ��� [0..1]
	 */
	public void setOverdPrinc(String overdPrinc) {
		OverdPrinc = overdPrinc;
	}

	/**
	 * ��ȡ overdDy
	 * 
	 * @return the overdDy ��ǰ�������� [0..1]
	 */
	public String getOverdDy() {
		return OverdDy;
	}

	/**
	 * ���� overdDy
	 * 
	 * @param overdDy
	 *            ��ǰ�������� [0..1]
	 */
	public void setOverdDy(String overdDy) {
		OverdDy = overdDy;
	}

	/**
	 * ��ȡ latRpyDate
	 * 
	 * @return the latRpyDate ���һ��ʵ�ʻ������� [0..1]
	 */
	public String getLatRpyDate() {
		return LatRpyDate;
	}

	/**
	 * ���� latRpyDate
	 * 
	 * @param latRpyDate
	 *            ���һ��ʵ�ʻ������� [0..1]
	 */
	public void setLatRpyDate(String latRpyDate) {
		LatRpyDate = latRpyDate;
	}

	/**
	 * ��ȡ latRpyAmt
	 * 
	 * @return the latRpyAmt ���һ��ʵ�ʻ����� [1..1]
	 */
	public String getLatRpyAmt() {
		return LatRpyAmt;
	}

	/**
	 * ���� latRpyAmt
	 * 
	 * @param latRpyAmt
	 *            ���һ��ʵ�ʻ����� [1..1]
	 */
	public void setLatRpyAmt(String latRpyAmt) {
		LatRpyAmt = latRpyAmt;
	}

	/**
	 * ��ȡ latRpyPrincAmt
	 * 
	 * @return the latRpyPrincAmt ���һ��ʵ�ʹ黹����
	 */
	public String getLatRpyPrincAmt() {
		return LatRpyPrincAmt;
	}

	/**
	 * ���� latRpyPrincAmt
	 * 
	 * @param latRpyPrincAmt
	 *            ���һ��ʵ�ʹ黹����
	 */
	public void setLatRpyPrincAmt(String latRpyPrincAmt) {
		LatRpyPrincAmt = latRpyPrincAmt;
	}

	/**
	 * ��ȡ rpmtType
	 * 
	 * @return the rpmtType ������ʽ [1..1]
	 */
	public String getRpmtType() {
		return RpmtType;
	}

	/**
	 * ���� rpmtType
	 * 
	 * @param rpmtType
	 *            ������ʽ [1..1]
	 */
	public void setRpmtType(String rpmtType) {
		RpmtType = rpmtType;
	}

	/**
	 * ��ȡ latAgrrRpyDate
	 * 
	 * @return the latAgrrRpyDate ���һ��Լ�������� [1..1]
	 */
	public String getLatAgrrRpyDate() {
		return LatAgrrRpyDate;
	}

	/**
	 * ���� latAgrrRpyDate
	 * 
	 * @param latAgrrRpyDate
	 *            ���һ��Լ�������� [1..1]
	 */
	public void setLatAgrrRpyDate(String latAgrrRpyDate) {
		LatAgrrRpyDate = latAgrrRpyDate;
	}

	/**
	 * ��ȡ latAgrrRpyAmt
	 * 
	 * @return the latAgrrRpyAmt ���һ��Լ�������� [1..1]
	 */
	public String getLatAgrrRpyAmt() {
		return LatAgrrRpyAmt;
	}

	/**
	 * ���� latAgrrRpyAmt
	 * 
	 * @param latAgrrRpyAmt
	 *            ���һ��Լ�������� [1..1]
	 */
	public void setLatAgrrRpyAmt(String latAgrrRpyAmt) {
		LatAgrrRpyAmt = latAgrrRpyAmt;
	}

	/**
	 * ��ȡ nxtAgrrRpyDate
	 * 
	 * @return the nxtAgrrRpyDate ��һ��Լ���������� [1..1]
	 */
	public String getNxtAgrrRpyDate() {
		return NxtAgrrRpyDate;
	}

	/**
	 * ���� nxtAgrrRpyDate
	 * 
	 * @param nxtAgrrRpyDate
	 *            ��һ��Լ���������� [1..1]
	 */
	public void setNxtAgrrRpyDate(String nxtAgrrRpyDate) {
		NxtAgrrRpyDate = nxtAgrrRpyDate;
	}

	/**
	 * ��ȡ closeDate
	 * 
	 * @return the closeDate �˻��ر����� [1..1]
	 */
	public String getCloseDate() {
		return CloseDate;
	}

	/**
	 * ���� closeDate
	 * 
	 * @param closeDate
	 *            �˻��ر����� [1..1]
	 */
	public void setCloseDate(String closeDate) {
		CloseDate = closeDate;
	}

	/**
	 * ��ȡ acctCode
	 * 
	 * @return the acctCode �˻���ʶ��
	 */
	public String getAcctCode() {
		return AcctCode;
	}

	/**
	 * ���� acctCode
	 * 
	 * @param acctCode
	 *            �˻���ʶ��
	 */
	public void setAcctCode(String acctCode) {
		AcctCode = acctCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Eb_CorpAccRetu_Info [AcctBal=" + AcctBal + ", AcctCode="
				+ AcctCode + ", AcctStatus=" + AcctStatus + ", BalChgDate="
				+ BalChgDate + ", CloseDate=" + CloseDate + ", FiveCate="
				+ FiveCate + ", FiveCateAdjDate=" + FiveCateAdjDate
				+ ", LatAgrrRpyAmt=" + LatAgrrRpyAmt + ", LatAgrrRpyDate="
				+ LatAgrrRpyDate + ", LatRpyAmt=" + LatRpyAmt + ", LatRpyDate="
				+ LatRpyDate + ", LatRpyPrincAmt=" + LatRpyPrincAmt
				+ ", NxtAgrrRpyDate=" + NxtAgrrRpyDate + ", OverdDy=" + OverdDy
				+ ", OverdPrinc=" + OverdPrinc + ", PymtPrd=" + PymtPrd
				+ ", RpmtType=" + RpmtType + ", TotOverd=" + TotOverd + "]";
	}
}
