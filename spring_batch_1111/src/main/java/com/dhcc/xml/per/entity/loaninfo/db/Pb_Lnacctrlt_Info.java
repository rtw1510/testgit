package com.dhcc.xml.per.entity.loaninfo.db;

public class Pb_Lnacctrlt_Info {
	/** ������[1..1] */
	private String InfoIDType;
	/** ����������[1..1] */
	private String ArlpName;
	/** ��������ݱ�ʶ����[1..1] */
	private String ArlpCertType;
	/** ��������ݱ�ʶ����[1..1] */
	private String ArlpCertNum;
	/** ��������������[1..1] */
	private String ArlpType;
	/** �������ν��[1..1] */
	private String ArlpAmt;
	/** ������־[1..1] */
	private String WartySign;
	/** ��֤��ͬ���[1..1] */
	private String MaxGuarMcc;
	
	public Pb_Lnacctrlt_Info() {
		super();
	}
	public String getWartySign() {
		return WartySign;
	}
	public void setWartySign(String wartySign) {
		WartySign = wartySign;
	}
	public String getMaxGuarMcc() {
		return MaxGuarMcc;
	}
	public void setMaxGuarMcc(String maxGuarMcc) {
		MaxGuarMcc = maxGuarMcc;
	}
	public String getInfoIDType() {
		return InfoIDType;
	}
	public void setInfoIDType(String infoIDType) {
		InfoIDType = infoIDType;
	}
	public String getArlpName() {
		return ArlpName;
	}
	public void setArlpName(String arlpName) {
		ArlpName = arlpName;
	}
	public String getArlpCertType() {
		return ArlpCertType;
	}
	public void setArlpCertType(String arlpCertType) {
		ArlpCertType = arlpCertType;
	}
	public String getArlpCertNum() {
		return ArlpCertNum;
	}
	public void setArlpCertNum(String arlpCertNum) {
		ArlpCertNum = arlpCertNum;
	}
	public String getArlpType() {
		return ArlpType;
	}
	public void setArlpType(String arlpType) {
		ArlpType = arlpType;
	}
	public String getArlpAmt() {
		return ArlpAmt;
	}
	public void setArlpAmt(String arlpAmt) {
		ArlpAmt = arlpAmt;
	}
}
