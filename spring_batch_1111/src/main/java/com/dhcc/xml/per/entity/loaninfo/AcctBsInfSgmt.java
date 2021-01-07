package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: AcctBsInfSgmt<br/>
 * Description:基本信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "BusiLines", "BusiDtlLines", "OpenDate", "Cy",
		"AcctCredLine", "LoanAmt", "Flag", "DueDate", "RepayMode",
		"RepayFreqcy", "RepayPrd", "ApplyBusiDist", "GuarMode",
		"OthRepyGuarWay", "AssetTrandFlag", "FundSou", "LoanForm","CreditID",
		"LoanConCode", "FirstHouLoanFlag"},namespace = "com.dhcc.xml.per.entity.loaninfo")
public class AcctBsInfSgmt {
	/** 借贷业务大类[1..1] */
	private String BusiLines;
	/** 借贷业务种类细分[1..1] */
	private String BusiDtlLines;
	/** 开户日期[1..1] */
	private String OpenDate;
	/** 币种[1..1] */
	private String Cy;
	/** 信用额度[0..1] */
	private String AcctCredLine;
	/** 借款金额[0..1] */
	private String LoanAmt;
	/** 分次放款标志[0..1] */
	private String Flag;
	/** 到期日期[0..1] */
	private String DueDate;
	/** 还款方式[0..1] */
	private String RepayMode;
	/** 还款频率[0..1] */
	private String RepayFreqcy;
	/** 还款期数[0..1] */
	private String RepayPrd;
	/** 业务申请地行政区划代码[0..1] */
	private String ApplyBusiDist;
	/** 担保方式[0..1] */
	private String GuarMode;
	/** 其他还款保证方式[0..1] */
	private String OthRepyGuarWay;
	/** 资产转让标志[0..1] */
	private String AssetTrandFlag;
	/** 资金来源[0..1] */
	private String FundSou;
	/** 贷款发放形式[0..1] */
	private String LoanForm;
	/** 卡片标识号[0..1] */
	private String CreditID;
	/** 贷款合同编号[0..1] */
	private String LoanConCode;
	/** 是否为首套住房贷款[0..1] */
	private String FirstHouLoanFlag;

	public AcctBsInfSgmt() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取 busiLines
	 * 
	 * @return the busiLines 借贷业务大类[1..1]
	 */
	public String getBusiLines() {
		return BusiLines;
	}

	/**
	 * 设置 busiLines
	 * 
	 * @param busiLines
	 *            借贷业务大类[1..1]
	 */
	public void setBusiLines(String busiLines) {
		BusiLines = busiLines;
	}

	/**
	 * 获取 busiDtlLines
	 * 
	 * @return the busiDtlLines 借贷业务种类细分[1..1]
	 */
	public String getBusiDtlLines() {
		return BusiDtlLines;
	}

	/**
	 * 设置 busiDtlLines
	 * 
	 * @param busiDtlLines
	 *            借贷业务种类细分[1..1]
	 */
	public void setBusiDtlLines(String busiDtlLines) {
		BusiDtlLines = busiDtlLines;
	}

	/**
	 * 获取 openDate
	 * 
	 * @return the openDate 开户日期[1..1]
	 */
	public String getOpenDate() {
		return OpenDate;
	}

	/**
	 * 设置 openDate
	 * 
	 * @param openDate
	 *            开户日期[1..1]
	 */
	public void setOpenDate(String openDate) {
		OpenDate = openDate;
	}

	/**
	 * 获取 cy
	 * 
	 * @return the cy 币种[1..1]
	 */
	public String getCy() {
		return Cy;
	}

	/**
	 * 设置 cy
	 * 
	 * @param cy
	 *            币种[1..1]
	 */
	public void setCy(String cy) {
		Cy = cy;
	}

	/**
	 * 获取 acctCredLine
	 * 
	 * @return the acctCredLine 信用额度[0..1]
	 */
	public String getAcctCredLine() {
		return AcctCredLine;
	}

	/**
	 * 设置 acctCredLine
	 * 
	 * @param acctCredLine
	 *            信用额度[0..1]
	 */
	public void setAcctCredLine(String acctCredLine) {
		AcctCredLine = acctCredLine;
	}

	/**
	 * 获取 loanAmt
	 * 
	 * @return the loanAmt 借款金额[0..1]
	 */
	public String getLoanAmt() {
		return LoanAmt;
	}

	/**
	 * 设置 loanAmt
	 * 
	 * @param loanAmt
	 *            借款金额[0..1]
	 */
	public void setLoanAmt(String loanAmt) {
		LoanAmt = loanAmt;
	}

	/**
	 * 获取 flag
	 * 
	 * @return the flag 分次放款标志[0..1]
	 */
	public String getFlag() {
		return Flag;
	}

	/**
	 * 设置 flag
	 * 
	 * @param flag
	 *            分次放款标志[0..1]
	 */
	public void setFlag(String flag) {
		Flag = flag;
	}

	/**
	 * 获取 dueDate
	 * 
	 * @return the dueDate 到期日期[0..1]
	 */
	public String getDueDate() {
		return DueDate;
	}

	/**
	 * 设置 dueDate
	 * 
	 * @param dueDate
	 *            到期日期[0..1]
	 */
	public void setDueDate(String dueDate) {
		DueDate = dueDate;
	}

	/**
	 * 获取 repayMode
	 * 
	 * @return the repayMode 还款方式[0..1]
	 */
	public String getRepayMode() {
		return RepayMode;
	}

	/**
	 * 设置 repayMode
	 * 
	 * @param repayMode
	 *            还款方式[0..1]
	 */
	public void setRepayMode(String repayMode) {
		RepayMode = repayMode;
	}

	/**
	 * 获取 repayFreqcy
	 * 
	 * @return the repayFreqcy 还款频率[0..1]
	 */
	public String getRepayFreqcy() {
		return RepayFreqcy;
	}

	/**
	 * 设置 repayFreqcy
	 * 
	 * @param repayFreqcy
	 *            还款频率[0..1]
	 */
	public void setRepayFreqcy(String repayFreqcy) {
		RepayFreqcy = repayFreqcy;
	}

	/**
	 * 获取 repayPrd
	 * 
	 * @return the repayPrd 还款期数[0..1]
	 */
	public String getRepayPrd() {
		return RepayPrd;
	}

	/**
	 * 设置 repayPrd
	 * 
	 * @param repayPrd
	 *            还款期数[0..1]
	 */
	public void setRepayPrd(String repayPrd) {
		RepayPrd = repayPrd;
	}

	/**
	 * 获取 applyBusiDist
	 * 
	 * @return the applyBusiDist 业务申请地行政区划代码[0..1]
	 */
	public String getApplyBusiDist() {
		return ApplyBusiDist;
	}

	/**
	 * 设置 applyBusiDist
	 * 
	 * @param applyBusiDist
	 *            业务申请地行政区划代码[0..1]
	 */
	public void setApplyBusiDist(String applyBusiDist) {
		ApplyBusiDist = applyBusiDist;
	}

	/**
	 * 获取 guarMode
	 * 
	 * @return the guarMode 担保方式[0..1]
	 */
	public String getGuarMode() {
		return GuarMode;
	}

	/**
	 * 设置 guarMode
	 * 
	 * @param guarMode
	 *            担保方式[0..1]
	 */
	public void setGuarMode(String guarMode) {
		GuarMode = guarMode;
	}

	/**
	 * 获取 othRepyGuarWay
	 * 
	 * @return the othRepyGuarWay 其他还款保证方式[0..1]
	 */
	public String getOthRepyGuarWay() {
		return OthRepyGuarWay;
	}

	/**
	 * 设置 othRepyGuarWay
	 * 
	 * @param othRepyGuarWay
	 *            其他还款保证方式[0..1]
	 */
	public void setOthRepyGuarWay(String othRepyGuarWay) {
		OthRepyGuarWay = othRepyGuarWay;
	}

	/**
	 * 获取 assetTrandFlag
	 * 
	 * @return the assetTrandFlag 资产转让标志[0..1]
	 */
	public String getAssetTrandFlag() {
		return AssetTrandFlag;
	}

	/**
	 * 设置 assetTrandFlag
	 * 
	 * @param assetTrandFlag
	 *            资产转让标志[0..1]
	 */
	public void setAssetTrandFlag(String assetTrandFlag) {
		AssetTrandFlag = assetTrandFlag;
	}

	/**
	 * 获取 fundSou
	 * 
	 * @return the fundSou 资金来源[0..1]
	 */
	public String getFundSou() {
		return FundSou;
	}

	/**
	 * 设置 fundSou
	 * 
	 * @param fundSou
	 *            资金来源[0..1]
	 */
	public void setFundSou(String fundSou) {
		FundSou = fundSou;
	}

	/**
	 * 获取 creditID
	 * 
	 * @return the creditID 卡片标识号[0..1]
	 */
	public String getCreditID() {
		return CreditID;
	}

	/**
	 * 设置 creditID
	 * 
	 * @param creditID
	 *            卡片标识号[0..1]
	 */
	public void setCreditID(String creditID) {
		CreditID = creditID;
	}

	/**
	 * 获取 loanForm
	 * 
	 * @return the loanForm 贷款发放形式[0..1]
	 */
	public String getLoanForm() {
		return LoanForm;
	}

	/**
	 * 设置 loanForm
	 * 
	 * @param loanForm
	 *            贷款发放形式[0..1]
	 */
	public void setLoanForm(String loanForm) {
		LoanForm = loanForm;
	}

	/**  
	 * 获取 loanConCode
	 * @return the loanConCode 贷款合同编号[0..1] 
	 */
	public String getLoanConCode() {
		return LoanConCode;
	}

	/**  
	 * 设置 loanConCode  
	 * @param loanConCode 贷款合同编号[0..1]  
	 */
	public void setLoanConCode(String loanConCode) {
		LoanConCode = loanConCode;
	}

	/**  
	 * 获取 firstHouLoanFlag
	 * @return the firstHouLoanFlag 是否为首套住房贷款[0..1] 
	 */
	public String getFirstHouLoanFlag() {
		return FirstHouLoanFlag;
	}

	/**  
	 * 设置 firstHouLoanFlag  
	 * @param firstHouLoanFlag 是否为首套住房贷款[0..1]  
	 */
	public void setFirstHouLoanFlag(String firstHouLoanFlag) {
		FirstHouLoanFlag = firstHouLoanFlag;
	}

}
