package com.dhcc.xml.ent.entity.loaninfo.db;

/**
 * Title: Eb_CorpAccSpec_Info<br/>
 * Description:企业借贷账户信息记录特定交易说明段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-7-25
 */
public class Eb_CorpAccSpec_Info {
	/**
	 *账户标识码
	 */
	private String AcctCode;
	/**
	 *交易类型 [1..1]
	 */
	private String ChanTranType;
	/**
	 *交易日期 [1..1]
	 */
	private String TranDate;
	/**
	 *交易金额 [1..1]
	 */
	private String TranAmt;
	/**
	 *到期日期变更月数 [1..1]
	 */
	private String DueTranMon;
	/**
	 *交易明细信息 [1..1]
	 */
	private String DetInfo;

	public Eb_CorpAccSpec_Info() {
		super();
	}

	/**
	 * 获取 acctCode
	 * 
	 * @return the acctCode 账户标识码
	 */
	public String getAcctCode() {
		return AcctCode;
	}

	/**
	 * 设置 acctCode
	 * 
	 * @param acctCode
	 *            账户标识码
	 */
	public void setAcctCode(String acctCode) {
		AcctCode = acctCode;
	}

	/**
	 * 获取 chanTranType
	 * 
	 * @return the chanTranType 交易类型 [1..1]
	 */
	public String getChanTranType() {
		return ChanTranType;
	}

	/**
	 * 设置 chanTranType
	 * 
	 * @param chanTranType
	 *            交易类型 [1..1]
	 */
	public void setChanTranType(String chanTranType) {
		ChanTranType = chanTranType;
	}

	/**
	 * 获取 tranDate
	 * 
	 * @return the tranDate 交易日期 [1..1]
	 */
	public String getTranDate() {
		return TranDate;
	}

	/**
	 * 设置 tranDate
	 * 
	 * @param tranDate
	 *            交易日期 [1..1]
	 */
	public void setTranDate(String tranDate) {
		TranDate = tranDate;
	}

	/**
	 * 获取 tranAmt
	 * 
	 * @return the tranAmt 交易金额 [1..1]
	 */
	public String getTranAmt() {
		return TranAmt;
	}

	/**
	 * 设置 tranAmt
	 * 
	 * @param tranAmt
	 *            交易金额 [1..1]
	 */
	public void setTranAmt(String tranAmt) {
		TranAmt = tranAmt;
	}

	/**
	 * 获取 dueTranMon
	 * 
	 * @return the dueTranMon 到期日期变更月数 [1..1]
	 */
	public String getDueTranMon() {
		return DueTranMon;
	}

	/**
	 * 设置 dueTranMon
	 * 
	 * @param dueTranMon
	 *            到期日期变更月数 [1..1]
	 */
	public void setDueTranMon(String dueTranMon) {
		DueTranMon = dueTranMon;
	}

	/**
	 * 获取 detInfo
	 * 
	 * @return the detInfo 交易明细信息 [1..1]
	 */
	public String getDetInfo() {
		return DetInfo;
	}

	/**
	 * 设置 detInfo
	 * 
	 * @param detInfo
	 *            交易明细信息 [1..1]
	 */
	public void setDetInfo(String detInfo) {
		DetInfo = detInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Eb_CorpAccSpec_Info [AcctCode=" + AcctCode + ", ChanTranType="
				+ ChanTranType + ", DetInfo=" + DetInfo + ", DueTranMon="
				+ DueTranMon + ", TranAmt=" + TranAmt + ", TranDate="
				+ TranDate + "]";
	}
}
