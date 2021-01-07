package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: GuarRltRepymtInfSgmt<br/>
 * Description:��ҵ�����˻���¼�ڱ�������Ϣ��<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "AcctStatus", "LoanAmt", "RepayPrd", "FiveCate",
		"FiveCateAdjDate", "RiEx", "CompAdvFlag", "CloseDate" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class GuarRltRepymtInfSgmt {
	/**
	 *�˻�״̬[1..1]
	 */
	private String AcctStatus;
	/**
	 *�ڱ����[1..1]
	 */
	private String LoanAmt;
	/**
	 *���仯���� [1..1]
	 */
	private String RepayPrd;
	/**
	 *�弶����[1..1]
	 */
	private String FiveCate;
	/**
	 *�弶�����϶�����[1..1]
	 */
	private String FiveCateAdjDate;
	/**
	 *���ճ���[1..1]
	 */
	private String RiEx;
	/**
	 *����������ʶ[1..1]
	 */
	private String CompAdvFlag;
	/**
	 *�˻��ر�����[1..1]
	 */
	private String CloseDate;

	public GuarRltRepymtInfSgmt() {
		super();
	}

	/**
	 * ��ȡ acctStatus
	 * 
	 * @return the acctStatus �˻�״̬[1..1]
	 */
	public String getAcctStatus() {
		return AcctStatus;
	}

	/**
	 * ���� acctStatus
	 * 
	 * @param acctStatus
	 *            �˻�״̬[1..1]
	 */
	public void setAcctStatus(String acctStatus) {
		AcctStatus = acctStatus;
	}

	/**
	 * ��ȡ loanAmt
	 * 
	 * @return the loanAmt �ڱ����[1..1]
	 */
	public String getLoanAmt() {
		return LoanAmt;
	}

	/**
	 * ���� loanAmt
	 * 
	 * @param loanAmt
	 *            �ڱ����[1..1]
	 */
	public void setLoanAmt(String loanAmt) {
		LoanAmt = loanAmt;
	}

	/**
	 * ��ȡ repayPrd
	 * 
	 * @return the repayPrd ���仯���� [1..1]
	 */
	public String getRepayPrd() {
		return RepayPrd;
	}

	/**
	 * ���� repayPrd
	 * 
	 * @param repayPrd
	 *            ���仯���� [1..1]
	 */
	public void setRepayPrd(String repayPrd) {
		RepayPrd = repayPrd;
	}

	/**
	 * ��ȡ fiveCate
	 * 
	 * @return the fiveCate �弶����[1..1]
	 */
	public String getFiveCate() {
		return FiveCate;
	}

	/**
	 * ���� fiveCate
	 * 
	 * @param fiveCate
	 *            �弶����[1..1]
	 */
	public void setFiveCate(String fiveCate) {
		FiveCate = fiveCate;
	}

	/**
	 * ��ȡ fiveCateAdjDate
	 * 
	 * @return the fiveCateAdjDate �弶�����϶�����[1..1]
	 */
	public String getFiveCateAdjDate() {
		return FiveCateAdjDate;
	}

	/**
	 * ���� fiveCateAdjDate
	 * 
	 * @param fiveCateAdjDate
	 *            �弶�����϶�����[1..1]
	 */
	public void setFiveCateAdjDate(String fiveCateAdjDate) {
		FiveCateAdjDate = fiveCateAdjDate;
	}

	/**
	 * ��ȡ riEx
	 * 
	 * @return the riEx ���ճ���[1..1]
	 */
	public String getRiEx() {
		return RiEx;
	}

	/**
	 * ���� riEx
	 * 
	 * @param riEx
	 *            ���ճ���[1..1]
	 */
	public void setRiEx(String riEx) {
		RiEx = riEx;
	}

	/**
	 * ��ȡ compAdvFlag
	 * 
	 * @return the compAdvFlag ����������ʶ[1..1]
	 */
	public String getCompAdvFlag() {
		return CompAdvFlag;
	}

	/**
	 * ���� compAdvFlag
	 * 
	 * @param compAdvFlag
	 *            ����������ʶ[1..1]
	 */
	public void setCompAdvFlag(String compAdvFlag) {
		CompAdvFlag = compAdvFlag;
	}

	/**
	 * ��ȡ closeDate
	 * 
	 * @return the closeDate �˻��ر�����[1..1]
	 */
	public String getCloseDate() {
		return CloseDate;
	}

	/**
	 * ���� closeDate
	 * 
	 * @param closeDate
	 *            �˻��ر�����[1..1]
	 */
	public void setCloseDate(String closeDate) {
		CloseDate = closeDate;
	}

	@Override
	public String toString() {
		return "GuarRltRepymtInfSgmt [AcctStatus=" + AcctStatus + ", LoanAmt="
				+ LoanAmt + ", RepayPrd=" + RepayPrd + ", FiveCate=" + FiveCate
				+ ", FiveCateAdjDate=" + FiveCateAdjDate + ", RiEx=" + RiEx
				+ ", CompAdvFlag=" + CompAdvFlag + ", CloseDate=" + CloseDate
				+ "]";
	}

}
