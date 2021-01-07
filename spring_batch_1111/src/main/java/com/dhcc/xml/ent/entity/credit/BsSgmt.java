package com.dhcc.xml.ent.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: BsSgmt<br/>
 * Description: ��ҵ����˻����������¼������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��24��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "InfRecType","ModRecCode","RptDate","AcctType","MdfcSgmtCode" },namespace = "com.dhcc.xml.ent.entity.credit")
// ָ�����гɵ�xml�ڵ�˳��
public class BsSgmt {
	/**
	 *��Ϣ��¼���� [1..1]
	 */
	private String InfRecType;
	/**
	 *������ҵ���ʶ [1..1]
	 */
	private String ModRecCode;
	/**
	 *��Ϣ�������� [1..1]
	 */
	private String RptDate;
	/**
	 *�˻�����
	 */
	private String AcctType;
	/**
	 *�������ζα� [1..1]
	 */
	private String MdfcSgmtCode;

	public BsSgmt() {
		super();
	}

	/**
	 * ��ȡ infRecType
	 * 
	 * @return the infRecType ��Ϣ��¼���� [1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * ���� infRecType
	 * 
	 * @param infRecType
	 *            ��Ϣ��¼���� [1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * ��ȡ modRecCode
	 * 
	 * @return the modRecCode ������ҵ���ʶ [1..1]
	 */
	public String getModRecCode() {
		return ModRecCode;
	}

	/**
	 * ���� modRecCode
	 * 
	 * @param modRecCode
	 *            ������ҵ���ʶ [1..1]
	 */
	public void setModRecCode(String modRecCode) {
		ModRecCode = modRecCode;
	}

	/**
	 * ��ȡ rptDate
	 * 
	 * @return the rptDate ��Ϣ�������� [1..1]
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * ���� rptDate
	 * 
	 * @param rptDate
	 *            ��Ϣ�������� [1..1]
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	/**
	 * ��ȡ acctType
	 * 
	 * @return the acctType �˻�����
	 */
	public String getAcctType() {
		return AcctType;
	}

	/**
	 * ���� acctType
	 * 
	 * @param acctType
	 *            �˻�����
	 */
	public void setAcctType(String acctType) {
		AcctType = acctType;
	}

	/**
	 * ��ȡ mdfcSgmtCode
	 * 
	 * @return the mdfcSgmtCode �������ζα� [1..1]
	 */
	public String getMdfcSgmtCode() {
		return MdfcSgmtCode;
	}

	/**
	 * ���� mdfcSgmtCode
	 * 
	 * @param mdfcSgmtCode
	 *            �������ζα� [1..1]
	 */
	public void setMdfcSgmtCode(String mdfcSgmtCode) {
		MdfcSgmtCode = mdfcSgmtCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BsSgmt [AcctType=" + AcctType + ", InfRecType=" + InfRecType
				+ ", MdfcSgmtCode=" + MdfcSgmtCode + ", ModRecCode="
				+ ModRecCode + ", RptDate=" + RptDate + "]";
	}
}
