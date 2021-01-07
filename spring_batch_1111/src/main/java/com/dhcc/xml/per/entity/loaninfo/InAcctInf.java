package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**  
  * Title: InAcctInf<br/>  
  * Description: 个人借贷账户信息记录-信息段<br/>  
  * @author ChenJingYuan  
  * @date 2018年3月27日  
  */  
@XmlAccessorType(value = XmlAccessType.FIELD)   
@XmlType(propOrder = { "AcctBsSgmt","AcctBsInfSgmt","RltRepymtInfSgmt",
		"MotgaCltalCtrctInfSgmt","AcctCredSgmt","OrigCreditorInfSgmt",
		"AcctMthlyBlgInfSgmt","SpecPrdSgmt","AcctDbtInfSgmt",
		"AcctSpecTrstDspnSgmt"},namespace = "com.dhcc.xml.per.entity.loaninfo")
public class InAcctInf {
	/** 基础段[1..1] */     
	private AcctBsSgmt AcctBsSgmt;
	/** 基本信息段[0..1] */  
	private AcctBsInfSgmt AcctBsInfSgmt;
	/** 相关还款责任人段[0..1] */   
	private RltRepymtInfSgmt RltRepymtInfSgmt;
	/** 抵质押物信息段[0..1] */     
	private MotgaCltalCtrctInfSgmt MotgaCltalCtrctInfSgmt;
	/** 授信额度信息段[0..1] */     
	private AcctCredSgmt AcctCredSgmt;
	/** 初始债权说明段[0..1] */    
	private OrigCreditorInfSgmt OrigCreditorInfSgmt;
	/** 月度表现信息段[0..1] */		
	private AcctMthlyBlgInfSgmt AcctMthlyBlgInfSgmt;
	/** 大额专项分期信息段[0..1] */	
	private SpecPrdSgmt SpecPrdSgmt;
	/** 非月度表现信息段[0..1] */		
	private AcctDbtInfSgmt AcctDbtInfSgmt;
	/** 特殊交易说明段[0..1] */		
	private AcctSpecTrstDspnSgmt AcctSpecTrstDspnSgmt;
	public InAcctInf() {
		super();
	}
	/**  
	 * 获取 acctBsSgmt
	 * @return the acctBsSgmt 基础段[1..1] 
	 */
	public AcctBsSgmt getAcctBsSgmt() {
		return AcctBsSgmt;
	}
	/**  
	 * 设置 acctBsSgmt  
	 * @param acctBsSgmt 基础段[1..1]  
	 */
	public void setAcctBsSgmt(AcctBsSgmt acctBsSgmt) {
		AcctBsSgmt = acctBsSgmt;
	}
	/**  
	 * 获取 acctBsInfSgmt
	 * @return the acctBsInfSgmt 基本信息段[0..1] 
	 */
	public AcctBsInfSgmt getAcctBsInfSgmt() {
		return AcctBsInfSgmt;
	}
	/**  
	 * 设置 acctBsInfSgmt  
	 * @param acctBsInfSgmt 基本信息段[0..1]  
	 */
	public void setAcctBsInfSgmt(AcctBsInfSgmt acctBsInfSgmt) {
		AcctBsInfSgmt = acctBsInfSgmt;
	}
	/**  
	 * 获取 rltRepymtInfSgmt
	 * @return the rltRepymtInfSgmt 相关还款责任人段[0..1] 
	 */
	public RltRepymtInfSgmt getRltRepymtInfSgmt() {
		return RltRepymtInfSgmt;
	}
	/**  
	 * 设置 rltRepymtInfSgmt  
	 * @param rltRepymtInfSgmt 相关还款责任人段[0..1]  
	 */
	public void setRltRepymtInfSgmt(RltRepymtInfSgmt rltRepymtInfSgmt) {
		RltRepymtInfSgmt = rltRepymtInfSgmt;
	}
	/**  
	 * 获取 motgaCltalCtrctInfSgmt
	 * @return the motgaCltalCtrctInfSgmt 抵质押物信息段[0..1] 
	 */
	public MotgaCltalCtrctInfSgmt getMotgaCltalCtrctInfSgmt() {
		return MotgaCltalCtrctInfSgmt;
	}
	/**  
	 * 设置 motgaCltalCtrctInfSgmt  
	 * @param motgaCltalCtrctInfSgmt 抵质押物信息段[0..1]  
	 */
	public void setMotgaCltalCtrctInfSgmt(
			MotgaCltalCtrctInfSgmt motgaCltalCtrctInfSgmt) {
		MotgaCltalCtrctInfSgmt = motgaCltalCtrctInfSgmt;
	}
	/**  
	 * 获取 acctCredSgmt
	 * @return the acctCredSgmt 授信额度信息段[0..1] 
	 */
	public AcctCredSgmt getAcctCredSgmt() {
		return AcctCredSgmt;
	}
	/**  
	 * 设置 acctCredSgmt  
	 * @param acctCredSgmt 授信额度信息段[0..1]  
	 */
	public void setAcctCredSgmt(AcctCredSgmt acctCredSgmt) {
		AcctCredSgmt = acctCredSgmt;
	}
	/**  
	 * 获取 origCreditorInfSgmt
	 * @return the origCreditorInfSgmt 初始债权说明段[0..1] 
	 */
	public OrigCreditorInfSgmt getOrigCreditorInfSgmt() {
		return OrigCreditorInfSgmt;
	}
	/**  
	 * 设置 origCreditorInfSgmt  
	 * @param origCreditorInfSgmt 初始债权说明段[0..1]  
	 */
	public void setOrigCreditorInfSgmt(OrigCreditorInfSgmt origCreditorInfSgmt) {
		OrigCreditorInfSgmt = origCreditorInfSgmt;
	}
	/**  
	 * 获取 acctMthlyBlgInfSgmt
	 * @return the acctMthlyBlgInfSgmt 月度表现信息段[0..1] 
	 */
	public AcctMthlyBlgInfSgmt getAcctMthlyBlgInfSgmt() {
		return AcctMthlyBlgInfSgmt;
	}
	/**  
	 * 设置 acctMthlyBlgInfSgmt  
	 * @param acctMthlyBlgInfSgmt 月度表现信息段[0..1]  
	 */
	public void setAcctMthlyBlgInfSgmt(AcctMthlyBlgInfSgmt acctMthlyBlgInfSgmt) {
		AcctMthlyBlgInfSgmt = acctMthlyBlgInfSgmt;
	}
	/**  
	 * 获取 specPrdSgmt
	 * @return the specPrdSgmt 大额专项分期信息段[0..1] 
	 */
	public SpecPrdSgmt getSpecPrdSgmt() {
		return SpecPrdSgmt;
	}
	/**  
	 * 设置 specPrdSgmt  
	 * @param specPrdSgmt 大额专项分期信息段[0..1]  
	 */
	public void setSpecPrdSgmt(SpecPrdSgmt specPrdSgmt) {
		SpecPrdSgmt = specPrdSgmt;
	}
	/**  
	 * 获取 acctDbtInfSgmt
	 * @return the acctDbtInfSgmt 非月度表现信息段[0..1] 
	 */
	public AcctDbtInfSgmt getAcctDbtInfSgmt() {
		return AcctDbtInfSgmt;
	}
	/**  
	 * 设置 acctDbtInfSgmt  
	 * @param acctDbtInfSgmt 非月度表现信息段[0..1]  
	 */
	public void setAcctDbtInfSgmt(AcctDbtInfSgmt acctDbtInfSgmt) {
		AcctDbtInfSgmt = acctDbtInfSgmt;
	}
	/**  
	 * 获取 acctSpecTrstDspnSgmt
	 * @return the acctSpecTrstDspnSgmt 特殊交易说明段[0..1] 
	 */
	public AcctSpecTrstDspnSgmt getAcctSpecTrstDspnSgmt() {
		return AcctSpecTrstDspnSgmt;
	}
	/**  
	 * 设置 acctSpecTrstDspnSgmt  
	 * @param acctSpecTrstDspnSgmt 特殊交易说明段[0..1]  
	 */
	public void setAcctSpecTrstDspnSgmt(AcctSpecTrstDspnSgmt acctSpecTrstDspnSgmt) {
		AcctSpecTrstDspnSgmt = acctSpecTrstDspnSgmt;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InAcctInf [AcctBsSgmt=" + AcctBsSgmt + ", AcctBsInfSgmt="
				+ AcctBsInfSgmt + ", RltRepymtInfSgmt=" + RltRepymtInfSgmt
				+ ", MotgaCltalCtrctInfSgmt=" + MotgaCltalCtrctInfSgmt
				+ ", AcctCredSgmt=" + AcctCredSgmt + ", OrigCreditorInfSgmt="
				+ OrigCreditorInfSgmt + ", AcctMthlyBlgInfSgmt="
				+ AcctMthlyBlgInfSgmt + ", SpecPrdSgmt=" + SpecPrdSgmt
				+ ", AcctDbtInfSgmt=" + AcctDbtInfSgmt
				+ ", AcctSpecTrstDspnSgmt=" + AcctSpecTrstDspnSgmt + "]";
	}
}
