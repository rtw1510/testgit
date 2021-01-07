package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: AcctBsInfSgmt<br/>
 * Description:企业借贷账户信息记录基本信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "BusiLines", "BusiDtlLines", "OpenDate", "Cy",
		"AcctCredLine", "LoanAmt", "Flag", "DueDate", "RepayMode",
		"RepayFreqcy", "ApplyBusiDist", "GuarMode", "OthRepyGuarWay",
		"LoanTimeLimCat", "LoaFrm", "ActInvest", "FundSou", "AssetTrandFlag" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// 指定序列成的xml节点顺序
public class AcctBsInfSgmt {
	/**
	 *借贷业务大类 [1..1]
	 */
	private String BusiLines;
	/**
	 *借贷业务种类细分 [1..1]
	 */
	private String BusiDtlLines;
	/**
	 *开户日期 [1..1]
	 */
	private String OpenDate;
	/**
	 *币种 [1..1]
	 */
	private String Cy;
	/**
	 *信用额度 [0..1]
	 */
	private String AcctCredLine;
	/**
	 *借款金额 [0..1]
	 */
	private String LoanAmt;
	/**
	 *分次放款标志 [0..1]
	 */
	private String Flag;
	/**
	 *到期日期 [0..1]
	 */
	private String DueDate;
	/**
	 *还款方式 [0..1]
	 */
	private String RepayMode;
	/**
	 *还款频率 [0..1]
	 */
	private String RepayFreqcy;
	/**
	 *业务申请地行政区划代码 [0..1]
	 */
	private String ApplyBusiDist;
	/**
	 *担保方式 [0..1]
	 */
	private String GuarMode;
	/**
	 *其他还款保证方式 [0..1]
	 */
	private String OthRepyGuarWay;
	/**
	 *借款期限分类 [0..1]
	 */
	private String LoanTimeLimCat;
	/**
	 *贷款发放形式 [0..1]
	 */
	private String LoaFrm;
	/**
	 *贷款实际投向 [0..1]
	 */
	private String ActInvest;
	/**
	 *业务经营类型 [0..1]
	 */
	private String FundSou;
	/**
	 *资产转让标志 [0..1]
	 */
	private String AssetTrandFlag;

	public AcctBsInfSgmt() {
		super();
	}

	/**
	 * 获取 busiLines
	 * 
	 * @return the busiLines 借贷业务大类 [1..1]
	 */
	public String getBusiLines() {
		return BusiLines;
	}

	/**
	 * 设置 busiLines
	 * 
	 * @param busiLines
	 *            借贷业务大类 [1..1]
	 */
	public void setBusiLines(String busiLines) {
		BusiLines = busiLines;
	}

	/**
	 * 获取 busiDtlLines
	 * 
	 * @return the busiDtlLines 借贷业务种类细分 [1..1]
	 */
	public String getBusiDtlLines() {
		return BusiDtlLines;
	}

	/**
	 * 设置 busiDtlLines
	 * 
	 * @param busiDtlLines
	 *            借贷业务种类细分 [1..1]
	 */
	public void setBusiDtlLines(String busiDtlLines) {
		BusiDtlLines = busiDtlLines;
	}

	/**
	 * 获取 openDate
	 * 
	 * @return the openDate 开户日期 [1..1]
	 */
	public String getOpenDate() {
		return OpenDate;
	}

	/**
	 * 设置 openDate
	 * 
	 * @param openDate
	 *            开户日期 [1..1]
	 */
	public void setOpenDate(String openDate) {
		OpenDate = openDate;
	}

	/**
	 * 获取 cy
	 * 
	 * @return the cy 币种 [1..1]
	 */
	public String getCy() {
		return Cy;
	}

	/**
	 * 设置 cy
	 * 
	 * @param cy
	 *            币种 [1..1]
	 */
	public void setCy(String cy) {
		Cy = cy;
	}

	/**
	 * 获取 acctCredLine
	 * 
	 * @return the acctCredLine 信用额度 [0..1]
	 */
	public String getAcctCredLine() {
		return AcctCredLine;
	}

	/**
	 * 设置 acctCredLine
	 * 
	 * @param acctCredLine
	 *            信用额度 [0..1]
	 */
	public void setAcctCredLine(String acctCredLine) {
		AcctCredLine = acctCredLine;
	}

	/**
	 * 获取 loanAmt
	 * 
	 * @return the loanAmt 借款金额 [0..1]
	 */
	public String getLoanAmt() {
		return LoanAmt;
	}

	/**
	 * 设置 loanAmt
	 * 
	 * @param loanAmt
	 *            借款金额 [0..1]
	 */
	public void setLoanAmt(String loanAmt) {
		LoanAmt = loanAmt;
	}

	/**
	 * 获取 flag
	 * 
	 * @return the flag 分次放款标志 [0..1]
	 */
	public String getFlag() {
		return Flag;
	}

	/**
	 * 设置 flag
	 * 
	 * @param flag
	 *            分次放款标志 [0..1]
	 */
	public void setFlag(String flag) {
		Flag = flag;
	}

	/**
	 * 获取 dueDate
	 * 
	 * @return the dueDate 到期日期 [0..1]
	 */
	public String getDueDate() {
		return DueDate;
	}

	/**
	 * 设置 dueDate
	 * 
	 * @param dueDate
	 *            到期日期 [0..1]
	 */
	public void setDueDate(String dueDate) {
		DueDate = dueDate;
	}

	/**
	 * 获取 repayMode
	 * 
	 * @return the repayMode 还款方式 [0..1]
	 */
	public String getRepayMode() {
		return RepayMode;
	}

	/**
	 * 设置 repayMode
	 * 
	 * @param repayMode
	 *            还款方式 [0..1]
	 */
	public void setRepayMode(String repayMode) {
		RepayMode = repayMode;
	}

	/**
	 * 获取 repayFreqcy
	 * 
	 * @return the repayFreqcy 还款频率 [0..1]
	 */
	public String getRepayFreqcy() {
		return RepayFreqcy;
	}

	/**
	 * 设置 repayFreqcy
	 * 
	 * @param repayFreqcy
	 *            还款频率 [0..1]
	 */
	public void setRepayFreqcy(String repayFreqcy) {
		RepayFreqcy = repayFreqcy;
	}

	/**
	 * 获取 applyBusiDist
	 * 
	 * @return the applyBusiDist 业务申请地行政区划代码 [0..1]
	 */
	public String getApplyBusiDist() {
		return ApplyBusiDist;
	}

	/**
	 * 设置 applyBusiDist
	 * 
	 * @param applyBusiDist
	 *            业务申请地行政区划代码 [0..1]
	 */
	public void setApplyBusiDist(String applyBusiDist) {
		ApplyBusiDist = applyBusiDist;
	}

	/**
	 * 获取 guarMode
	 * 
	 * @return the guarMode 担保方式 [0..1]
	 */
	public String getGuarMode() {
		return GuarMode;
	}

	/**
	 * 设置 guarMode
	 * 
	 * @param guarMode
	 *            担保方式 [0..1]
	 */
	public void setGuarMode(String guarMode) {
		GuarMode = guarMode;
	}

	/**
	 * 获取 othRepyGuarWay
	 * 
	 * @return the othRepyGuarWay 其他还款保证方式 [0..1]
	 */
	public String getOthRepyGuarWay() {
		return OthRepyGuarWay;
	}

	/**
	 * 设置 othRepyGuarWay
	 * 
	 * @param othRepyGuarWay
	 *            其他还款保证方式 [0..1]
	 */
	public void setOthRepyGuarWay(String othRepyGuarWay) {
		OthRepyGuarWay = othRepyGuarWay;
	}

	/**
	 * 获取 loanTimeLimCat
	 * 
	 * @return the loanTimeLimCat 借款期限分类 [0..1]
	 */
	public String getLoanTimeLimCat() {
		return LoanTimeLimCat;
	}

	/**
	 * 设置 loanTimeLimCat
	 * 
	 * @param loanTimeLimCat
	 *            借款期限分类 [0..1]
	 */
	public void setLoanTimeLimCat(String loanTimeLimCat) {
		LoanTimeLimCat = loanTimeLimCat;
	}

	/**
	 * 获取 loaFrm
	 * 
	 * @return the loaFrm 贷款发放形式 [0..1]
	 */
	public String getLoaFrm() {
		return LoaFrm;
	}

	/**
	 * 设置 loaFrm
	 * 
	 * @param loaFrm
	 *            贷款发放形式 [0..1]
	 */
	public void setLoaFrm(String loaFrm) {
		LoaFrm = loaFrm;
	}

	/**
	 * 获取 actInvest
	 * 
	 * @return the actInvest 贷款实际投向 [0..1]
	 */
	public String getActInvest() {
		return ActInvest;
	}

	/**
	 * 设置 actInvest
	 * 
	 * @param actInvest
	 *            贷款实际投向 [0..1]
	 */
	public void setActInvest(String actInvest) {
		ActInvest = actInvest;
	}

	/**
	 * 获取 fundSou
	 * 
	 * @return the fundSou 业务经营类型 [0..1]
	 */
	public String getFundSou() {
		return FundSou;
	}

	/**
	 * 设置 fundSou
	 * 
	 * @param fundSou
	 *            业务经营类型 [0..1]
	 */
	public void setFundSou(String fundSou) {
		FundSou = fundSou;
	}

	/**
	 * 获取 assetTrandFlag
	 * 
	 * @return the assetTrandFlag 资产转让标志 [0..1]
	 */
	public String getAssetTrandFlag() {
		return AssetTrandFlag;
	}

	/**
	 * 设置 assetTrandFlag
	 * 
	 * @param assetTrandFlag
	 *            资产转让标志 [0..1]
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
