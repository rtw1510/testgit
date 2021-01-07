package com.dhcc.xml.ent.entity.loaninfo.db;

/**
 * Title: Eb_CorpAccSpec_Info<br/>
 * Description:��ҵ����˻���Ϣ��¼�ض�����˵���� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-7-25
 */
public class Eb_CorpAccSpec_Info {
	/**
	 *�˻���ʶ��
	 */
	private String AcctCode;
	/**
	 *�������� [1..1]
	 */
	private String ChanTranType;
	/**
	 *�������� [1..1]
	 */
	private String TranDate;
	/**
	 *���׽�� [1..1]
	 */
	private String TranAmt;
	/**
	 *�������ڱ������ [1..1]
	 */
	private String DueTranMon;
	/**
	 *������ϸ��Ϣ [1..1]
	 */
	private String DetInfo;

	public Eb_CorpAccSpec_Info() {
		super();
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

	/**
	 * ��ȡ chanTranType
	 * 
	 * @return the chanTranType �������� [1..1]
	 */
	public String getChanTranType() {
		return ChanTranType;
	}

	/**
	 * ���� chanTranType
	 * 
	 * @param chanTranType
	 *            �������� [1..1]
	 */
	public void setChanTranType(String chanTranType) {
		ChanTranType = chanTranType;
	}

	/**
	 * ��ȡ tranDate
	 * 
	 * @return the tranDate �������� [1..1]
	 */
	public String getTranDate() {
		return TranDate;
	}

	/**
	 * ���� tranDate
	 * 
	 * @param tranDate
	 *            �������� [1..1]
	 */
	public void setTranDate(String tranDate) {
		TranDate = tranDate;
	}

	/**
	 * ��ȡ tranAmt
	 * 
	 * @return the tranAmt ���׽�� [1..1]
	 */
	public String getTranAmt() {
		return TranAmt;
	}

	/**
	 * ���� tranAmt
	 * 
	 * @param tranAmt
	 *            ���׽�� [1..1]
	 */
	public void setTranAmt(String tranAmt) {
		TranAmt = tranAmt;
	}

	/**
	 * ��ȡ dueTranMon
	 * 
	 * @return the dueTranMon �������ڱ������ [1..1]
	 */
	public String getDueTranMon() {
		return DueTranMon;
	}

	/**
	 * ���� dueTranMon
	 * 
	 * @param dueTranMon
	 *            �������ڱ������ [1..1]
	 */
	public void setDueTranMon(String dueTranMon) {
		DueTranMon = dueTranMon;
	}

	/**
	 * ��ȡ detInfo
	 * 
	 * @return the detInfo ������ϸ��Ϣ [1..1]
	 */
	public String getDetInfo() {
		return DetInfo;
	}

	/**
	 * ���� detInfo
	 * 
	 * @param detInfo
	 *            ������ϸ��Ϣ [1..1]
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
