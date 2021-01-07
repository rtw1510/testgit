package com.dhcc.xml.ent.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: CagOfTrdInf<br/>
 * Description:企业借贷账户信息记录交易信 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "ChanTranType", "TranDate", "TranAmt", "DueTranMon",
		"DetInfo" },namespace = "com.dhcc.xml.ent.entity.loaninfo")
// 指定序列成的xml节点顺序
public class CagOfTrdInf {
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

	public CagOfTrdInf() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "CagOfTrdInf [ChanTranType=" + ChanTranType + ", TranDate="
				+ TranDate + ", TranAmt=" + TranAmt + ", DueTranMon="
				+ DueTranMon + ", DetInfo=" + DetInfo + "]";
	}

}
