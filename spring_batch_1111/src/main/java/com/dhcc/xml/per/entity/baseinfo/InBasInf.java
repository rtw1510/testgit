package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InBasInf<br/>
 * Description:���˻�����Ϣ��¼-110 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "BsSgmt", "IDSgmt", "FcsInfSgmt", "SpsInfSgmt",
		"EduInfSgmt", "OctpnInfSgmt", "RedncInfSgmt", "MlgInfSgmt",
		"IncInfSgmt" },namespace = "com.dhcc.xml.per.entity.baseinfo")
public class InBasInf {
	/**
	 * ������ [1..1]
	 */
	private BsSgmt BsSgmt;
	/**
	 * ������ʶ�� [0..1]
	 */
	private IDSgmt IDSgmt;
	/**
	 * �����ſ��� [0..1]
	 */
	private FcsInfSgmt FcsInfSgmt;
	/**
	 * ������Ϣ�� [0..1]
	 */
	private SpsInfSgmt SpsInfSgmt;
	/**
	 * ������Ϣ�� [0..1]
	 */
	private EduInfSgmt EduInfSgmt;
	/**
	 * ְҵ��Ϣ�� [0..1]
	 */
	private OctpnInfSgmt OctpnInfSgmt;
	/**
	 * ��ס��ַ�� [0..1]
	 */
	private RedncInfSgmt RedncInfSgmt;
	/**
	 * ͨѶ��ַ�� [0..1]
	 */
	private MlgInfSgmt MlgInfSgmt;
	/**
	 * ������Ϣ�� [0..1]
	 */
	private IncInfSgmt IncInfSgmt;

	public InBasInf() {
		super();
	}

	/**
	 * ��ȡ bsSgmt
	 * 
	 * @return the bsSgmt ������ [1..1]
	 */
	public BsSgmt getBsSgmt() {
		return BsSgmt;
	}

	/**
	 * ���� bsSgmt
	 * 
	 * @param bsSgmt
	 *            ������ [1..1]
	 */
	public void setBsSgmt(BsSgmt bsSgmt) {
		BsSgmt = bsSgmt;
	}

	/**
	 * ��ȡ iDSgmt
	 * 
	 * @return the iDSgmt ������ʶ�� [0..1]
	 */
	public IDSgmt getIDSgmt() {
		return IDSgmt;
	}

	/**
	 * ���� iDSgmt
	 * 
	 * @param iDSgmt
	 *            ������ʶ�� [0..1]
	 */
	public void setIDSgmt(IDSgmt iDSgmt) {
		IDSgmt = iDSgmt;
	}

	/**
	 * ��ȡ fcsInfSgmt
	 * 
	 * @return the fcsInfSgmt �����ſ��� [0..1]
	 */
	public FcsInfSgmt getFcsInfSgmt() {
		return FcsInfSgmt;
	}

	/**
	 * ���� fcsInfSgmt
	 * 
	 * @param fcsInfSgmt
	 *            �����ſ��� [0..1]
	 */
	public void setFcsInfSgmt(FcsInfSgmt fcsInfSgmt) {
		FcsInfSgmt = fcsInfSgmt;
	}

	/**
	 * ��ȡ spsInfSgmt
	 * 
	 * @return the spsInfSgmt ������Ϣ�� [0..1]
	 */
	public SpsInfSgmt getSpsInfSgmt() {
		return SpsInfSgmt;
	}

	/**
	 * ���� spsInfSgmt
	 * 
	 * @param spsInfSgmt
	 *            ������Ϣ�� [0..1]
	 */
	public void setSpsInfSgmt(SpsInfSgmt spsInfSgmt) {
		SpsInfSgmt = spsInfSgmt;
	}

	/**
	 * ��ȡ eduInfSgmt
	 * 
	 * @return the eduInfSgmt ������Ϣ�� [0..1]
	 */
	public EduInfSgmt getEduInfSgmt() {
		return EduInfSgmt;
	}

	/**
	 * ���� eduInfSgmt
	 * 
	 * @param eduInfSgmt
	 *            ������Ϣ�� [0..1]
	 */
	public void setEduInfSgmt(EduInfSgmt eduInfSgmt) {
		EduInfSgmt = eduInfSgmt;
	}

	/**
	 * ��ȡ octpnInfSgmt
	 * 
	 * @return the octpnInfSgmt ְҵ��Ϣ�� [0..1]
	 */
	public OctpnInfSgmt getOctpnInfSgmt() {
		return OctpnInfSgmt;
	}

	/**
	 * ���� octpnInfSgmt
	 * 
	 * @param octpnInfSgmt
	 *            ְҵ��Ϣ�� [0..1]
	 */
	public void setOctpnInfSgmt(OctpnInfSgmt octpnInfSgmt) {
		OctpnInfSgmt = octpnInfSgmt;
	}

	/**
	 * ��ȡ redncInfSgmt
	 * 
	 * @return the redncInfSgmt ��ס��ַ�� [0..1]
	 */
	public RedncInfSgmt getRedncInfSgmt() {
		return RedncInfSgmt;
	}

	/**
	 * ���� redncInfSgmt
	 * 
	 * @param redncInfSgmt
	 *            ��ס��ַ�� [0..1]
	 */
	public void setRedncInfSgmt(RedncInfSgmt redncInfSgmt) {
		RedncInfSgmt = redncInfSgmt;
	}

	/**
	 * ��ȡ mlgInfSgmt
	 * 
	 * @return the mlgInfSgmt ͨѶ��ַ�� [0..1]
	 */
	public MlgInfSgmt getMlgInfSgmt() {
		return MlgInfSgmt;
	}

	/**
	 * ���� mlgInfSgmt
	 * 
	 * @param mlgInfSgmt
	 *            ͨѶ��ַ�� [0..1]
	 */
	public void setMlgInfSgmt(MlgInfSgmt mlgInfSgmt) {
		MlgInfSgmt = mlgInfSgmt;
	}

	/**
	 * ��ȡ incInfSgmt
	 * 
	 * @return the incInfSgmt ������Ϣ�� [0..1]
	 */
	public IncInfSgmt getIncInfSgmt() {
		return IncInfSgmt;
	}

	/**
	 * ���� incInfSgmt
	 * 
	 * @param incInfSgmt
	 *            ������Ϣ�� [0..1]
	 */
	public void setIncInfSgmt(IncInfSgmt incInfSgmt) {
		IncInfSgmt = incInfSgmt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "InBasInf [BsSgmt=" + BsSgmt + ", IDSgmt=" + IDSgmt
				+ ", FcsInfSgmt=" + FcsInfSgmt + ", SpsInfSgmt=" + SpsInfSgmt
				+ ", EduInfSgmt=" + EduInfSgmt + ", OctpnInfSgmt="
				+ OctpnInfSgmt + ", RedncInfSgmt=" + RedncInfSgmt
				+ ", MlgInfSgmt=" + MlgInfSgmt + ", IncInfSgmt=" + IncInfSgmt
				+ "]";
	}

}
