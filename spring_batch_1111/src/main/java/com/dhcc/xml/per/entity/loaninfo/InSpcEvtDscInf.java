package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InSpcEvtDscInf<br/>
 * Description: ���˽���˻������¼�<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfRecType", "AcctCode", "OpetnType", "Month", "Flag",
		"RptDate" },namespace = "com.dhcc.xml.per.entity.loaninfo")
public class InSpcEvtDscInf {
	/** ��Ϣ��¼����[1..1] */
	private String InfRecType;
	/** �˻���ʶ��[1..1] */
	private String AcctCode;
	/** �¼�����[1..1] */
	private String OpetnType;
	/** �����·�[1..1] */
	private String Month;
	/** ��Ч��־[1..1] */
	private String Flag;
	/** ��Ϣ��������[1..1] */
	private String RptDate;

	public InSpcEvtDscInf() {
		super();
	}

	/**
	 * ��ȡ infRecType
	 * 
	 * @return the infRecType ��Ϣ��¼����[1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * ���� infRecType
	 * 
	 * @param infRecType
	 *            ��Ϣ��¼����[1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * ��ȡ acctCode
	 * 
	 * @return the acctCode �˻���ʶ��[1..1]
	 */
	public String getAcctCode() {
		return AcctCode;
	}

	/**
	 * ���� acctCode
	 * 
	 * @param acctCode
	 *            �˻���ʶ��[1..1]
	 */
	public void setAcctCode(String acctCode) {
		AcctCode = acctCode;
	}

	/**
	 * ��ȡ opetnType
	 * 
	 * @return the opetnType �¼�����[1..1]
	 */
	public String getOpetnType() {
		return OpetnType;
	}

	/**
	 * ���� opetnType
	 * 
	 * @param opetnType
	 *            �¼�����[1..1]
	 */
	public void setOpetnType(String opetnType) {
		OpetnType = opetnType;
	}

	/**
	 * ��ȡ month
	 * 
	 * @return the month �����·�[1..1]
	 */
	public String getMonth() {
		return Month;
	}

	/**
	 * ���� month
	 * 
	 * @param month
	 *            �����·�[1..1]
	 */
	public void setMonth(String month) {
		Month = month;
	}

	/**
	 * ��ȡ flag
	 * 
	 * @return the flag ��Ч��־[1..1]
	 */
	public String getFlag() {
		return Flag;
	}

	/**
	 * ���� flag
	 * 
	 * @param flag
	 *            ��Ч��־[1..1]
	 */
	public void setFlag(String flag) {
		Flag = flag;
	}

	/**
	 * ��ȡ rptDate
	 * 
	 * @return the rptDate ��Ϣ��������[1..1]
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * ���� rptDate
	 * 
	 * @param rptDate
	 *            ��Ϣ��������[1..1]
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InSpcEvtDscInf [InfRecType=" + InfRecType + ", AcctCode="
				+ AcctCode + ", OpetnType=" + OpetnType + ", Month=" + Month
				+ ", Flag=" + Flag + ", RptDate=" + RptDate + "]";
	}

}
