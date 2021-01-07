package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: AcctBsInfSgmt<br/>
 * Description:��ҵ����˻���Ϣ��¼������Ϣ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��24��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "BusiLines", "BusiDtlLines", "OpenDate", "Cy",
		"AcctCredLine", "LoanAmt", "Flag", "DueDate", "RepayMode",
		"RepayFreqcy", "ApplyBusiDist", "GuarMode", "OthRepyGuarWay",
		"LoanTimeLimCat", "LoaFrm", "ActInvest", "FundSou", "AssetTrandFlag" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// ָ�����гɵ�xml�ڵ�˳��
public class AcctBsInfSgmt {
	/**
	 *���ҵ����� [1..1]
	 */
	private String BusiLines;
	/**
	 *���ҵ������ϸ�� [1..1]
	 */
	private String BusiDtlLines;
	/**
	 *�������� [1..1]
	 */
	private String OpenDate;
	/**
	 *���� [1..1]
	 */
	private String Cy;
	/**
	 *���ö�� [0..1]
	 */
	private String AcctCredLine;
	/**
	 *����� [0..1]
	 */
	private String LoanAmt;
	/**
	 *�ִηſ��־ [0..1]
	 */
	private String Flag;
	/**
	 *�������� [0..1]
	 */
	private String DueDate;
	/**
	 *���ʽ [0..1]
	 */
	private String RepayMode;
	/**
	 *����Ƶ�� [0..1]
	 */
	private String RepayFreqcy;
	/**
	 *ҵ������������������� [0..1]
	 */
	private String ApplyBusiDist;
	/**
	 *������ʽ [0..1]
	 */
	private String GuarMode;
	/**
	 *�������֤��ʽ [0..1]
	 */
	private String OthRepyGuarWay;
	/**
	 *������޷��� [0..1]
	 */
	private String LoanTimeLimCat;
	/**
	 *�������ʽ [0..1]
	 */
	private String LoaFrm;
	/**
	 *����ʵ��Ͷ�� [0..1]
	 */
	private String ActInvest;
	/**
	 *ҵ��Ӫ���� [0..1]
	 */
	private String FundSou;
	/**
	 *�ʲ�ת�ñ�־ [0..1]
	 */
	private String AssetTrandFlag;

	public AcctBsInfSgmt() {
		super();
	}

	/**
	 * ��ȡ busiLines
	 * 
	 * @return the busiLines ���ҵ����� [1..1]
	 */
	public String getBusiLines() {
		return BusiLines;
	}

	/**
	 * ���� busiLines
	 * 
	 * @param busiLines
	 *            ���ҵ����� [1..1]
	 */
	public void setBusiLines(String busiLines) {
		BusiLines = busiLines;
	}

	/**
	 * ��ȡ busiDtlLines
	 * 
	 * @return the busiDtlLines ���ҵ������ϸ�� [1..1]
	 */
	public String getBusiDtlLines() {
		return BusiDtlLines;
	}

	/**
	 * ���� busiDtlLines
	 * 
	 * @param busiDtlLines
	 *            ���ҵ������ϸ�� [1..1]
	 */
	public void setBusiDtlLines(String busiDtlLines) {
		BusiDtlLines = busiDtlLines;
	}

	/**
	 * ��ȡ openDate
	 * 
	 * @return the openDate �������� [1..1]
	 */
	public String getOpenDate() {
		return OpenDate;
	}

	/**
	 * ���� openDate
	 * 
	 * @param openDate
	 *            �������� [1..1]
	 */
	public void setOpenDate(String openDate) {
		OpenDate = openDate;
	}

	/**
	 * ��ȡ cy
	 * 
	 * @return the cy ���� [1..1]
	 */
	public String getCy() {
		return Cy;
	}

	/**
	 * ���� cy
	 * 
	 * @param cy
	 *            ���� [1..1]
	 */
	public void setCy(String cy) {
		Cy = cy;
	}

	/**
	 * ��ȡ acctCredLine
	 * 
	 * @return the acctCredLine ���ö�� [0..1]
	 */
	public String getAcctCredLine() {
		return AcctCredLine;
	}

	/**
	 * ���� acctCredLine
	 * 
	 * @param acctCredLine
	 *            ���ö�� [0..1]
	 */
	public void setAcctCredLine(String acctCredLine) {
		AcctCredLine = acctCredLine;
	}

	/**
	 * ��ȡ loanAmt
	 * 
	 * @return the loanAmt ����� [0..1]
	 */
	public String getLoanAmt() {
		return LoanAmt;
	}

	/**
	 * ���� loanAmt
	 * 
	 * @param loanAmt
	 *            ����� [0..1]
	 */
	public void setLoanAmt(String loanAmt) {
		LoanAmt = loanAmt;
	}

	/**
	 * ��ȡ flag
	 * 
	 * @return the flag �ִηſ��־ [0..1]
	 */
	public String getFlag() {
		return Flag;
	}

	/**
	 * ���� flag
	 * 
	 * @param flag
	 *            �ִηſ��־ [0..1]
	 */
	public void setFlag(String flag) {
		Flag = flag;
	}

	/**
	 * ��ȡ dueDate
	 * 
	 * @return the dueDate �������� [0..1]
	 */
	public String getDueDate() {
		return DueDate;
	}

	/**
	 * ���� dueDate
	 * 
	 * @param dueDate
	 *            �������� [0..1]
	 */
	public void setDueDate(String dueDate) {
		DueDate = dueDate;
	}

	/**
	 * ��ȡ repayMode
	 * 
	 * @return the repayMode ���ʽ [0..1]
	 */
	public String getRepayMode() {
		return RepayMode;
	}

	/**
	 * ���� repayMode
	 * 
	 * @param repayMode
	 *            ���ʽ [0..1]
	 */
	public void setRepayMode(String repayMode) {
		RepayMode = repayMode;
	}

	/**
	 * ��ȡ repayFreqcy
	 * 
	 * @return the repayFreqcy ����Ƶ�� [0..1]
	 */
	public String getRepayFreqcy() {
		return RepayFreqcy;
	}

	/**
	 * ���� repayFreqcy
	 * 
	 * @param repayFreqcy
	 *            ����Ƶ�� [0..1]
	 */
	public void setRepayFreqcy(String repayFreqcy) {
		RepayFreqcy = repayFreqcy;
	}

	/**
	 * ��ȡ applyBusiDist
	 * 
	 * @return the applyBusiDist ҵ������������������� [0..1]
	 */
	public String getApplyBusiDist() {
		return ApplyBusiDist;
	}

	/**
	 * ���� applyBusiDist
	 * 
	 * @param applyBusiDist
	 *            ҵ������������������� [0..1]
	 */
	public void setApplyBusiDist(String applyBusiDist) {
		ApplyBusiDist = applyBusiDist;
	}

	/**
	 * ��ȡ guarMode
	 * 
	 * @return the guarMode ������ʽ [0..1]
	 */
	public String getGuarMode() {
		return GuarMode;
	}

	/**
	 * ���� guarMode
	 * 
	 * @param guarMode
	 *            ������ʽ [0..1]
	 */
	public void setGuarMode(String guarMode) {
		GuarMode = guarMode;
	}

	/**
	 * ��ȡ othRepyGuarWay
	 * 
	 * @return the othRepyGuarWay �������֤��ʽ [0..1]
	 */
	public String getOthRepyGuarWay() {
		return OthRepyGuarWay;
	}

	/**
	 * ���� othRepyGuarWay
	 * 
	 * @param othRepyGuarWay
	 *            �������֤��ʽ [0..1]
	 */
	public void setOthRepyGuarWay(String othRepyGuarWay) {
		OthRepyGuarWay = othRepyGuarWay;
	}

	/**
	 * ��ȡ loanTimeLimCat
	 * 
	 * @return the loanTimeLimCat ������޷��� [0..1]
	 */
	public String getLoanTimeLimCat() {
		return LoanTimeLimCat;
	}

	/**
	 * ���� loanTimeLimCat
	 * 
	 * @param loanTimeLimCat
	 *            ������޷��� [0..1]
	 */
	public void setLoanTimeLimCat(String loanTimeLimCat) {
		LoanTimeLimCat = loanTimeLimCat;
	}

	/**
	 * ��ȡ loaFrm
	 * 
	 * @return the loaFrm �������ʽ [0..1]
	 */
	public String getLoaFrm() {
		return LoaFrm;
	}

	/**
	 * ���� loaFrm
	 * 
	 * @param loaFrm
	 *            �������ʽ [0..1]
	 */
	public void setLoaFrm(String loaFrm) {
		LoaFrm = loaFrm;
	}

	/**
	 * ��ȡ actInvest
	 * 
	 * @return the actInvest ����ʵ��Ͷ�� [0..1]
	 */
	public String getActInvest() {
		return ActInvest;
	}

	/**
	 * ���� actInvest
	 * 
	 * @param actInvest
	 *            ����ʵ��Ͷ�� [0..1]
	 */
	public void setActInvest(String actInvest) {
		ActInvest = actInvest;
	}

	/**
	 * ��ȡ fundSou
	 * 
	 * @return the fundSou ҵ��Ӫ���� [0..1]
	 */
	public String getFundSou() {
		return FundSou;
	}

	/**
	 * ���� fundSou
	 * 
	 * @param fundSou
	 *            ҵ��Ӫ���� [0..1]
	 */
	public void setFundSou(String fundSou) {
		FundSou = fundSou;
	}

	/**
	 * ��ȡ assetTrandFlag
	 * 
	 * @return the assetTrandFlag �ʲ�ת�ñ�־ [0..1]
	 */
	public String getAssetTrandFlag() {
		return AssetTrandFlag;
	}

	/**
	 * ���� assetTrandFlag
	 * 
	 * @param assetTrandFlag
	 *            �ʲ�ת�ñ�־ [0..1]
	 */
	public void setAssetTrandFlag(String assetTrandFlag) {
		AssetTrandFlag = assetTrandFlag;
	}

	@Override
	public String toString() {
		return "AcctBsInfSgmt [BusiLines=" + BusiLines + ", BusiDtlLines="
				+ BusiDtlLines + ", OpenDate=" + OpenDate + ", Cy=" + Cy
				+ ", AcctCredLine=" + AcctCredLine + ", LoanAmt=" + LoanAmt
				+ ", Flag=" + Flag + ", DueDate=" + DueDate + ", RepayMode="
				+ RepayMode + ", RepayFreqcy=" + RepayFreqcy
				+ ", ApplyBusiDist=" + ApplyBusiDist + ", GuarMode=" + GuarMode
				+ ", OthRepyGuarWay=" + OthRepyGuarWay + ", LoanTimeLimCat="
				+ LoanTimeLimCat + ", LoaFrm=" + LoaFrm + ", ActInvest="
				+ ActInvest + ", FundSou=" + FundSou + ", AssetTrandFlag="
				+ AssetTrandFlag + "]";
	}

}
