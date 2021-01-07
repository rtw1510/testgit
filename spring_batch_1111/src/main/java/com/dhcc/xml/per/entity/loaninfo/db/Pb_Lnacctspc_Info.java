package com.dhcc.xml.per.entity.loaninfo.db;

public class Pb_Lnacctspc_Info {
	/** ��������[1..1] */
	private String ChanTranType;
	/** ��������[1..1] */
	private String TranDate;
	/** ���׽��[1..1] */
	private String TranAmt;
	/** �������ڱ������[1..1] */
	private String DueTranMon;
	/** ������ϸ��Ϣ[1..1] */
	private String DetInfo;
	
	public Pb_Lnacctspc_Info() {
		super();
	}
	public String getChanTranType() {
		return ChanTranType;
	}
	public void setChanTranType(String chanTranType) {
		ChanTranType = chanTranType;
	}
	public String getTranDate() {
		return TranDate;
	}
	public void setTranDate(String tranDate) {
		TranDate = tranDate;
	}
	public String getTranAmt() {
		return TranAmt;
	}
	public void setTranAmt(String tranAmt) {
		TranAmt = tranAmt;
	}
	public String getDueTranMon() {
		return DueTranMon;
	}
	public void setDueTranMon(String dueTranMon) {
		DueTranMon = dueTranMon;
	}
	public String getDetInfo() {
		return DetInfo;
	}
	public void setDetInfo(String detInfo) {
		DetInfo = detInfo;
	}
}
