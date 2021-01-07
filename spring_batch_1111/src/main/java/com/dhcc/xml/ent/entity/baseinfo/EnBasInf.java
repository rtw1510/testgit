package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnBasInfo<br/>
 * Description:��ҵ������Ϣ��¼ <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��25��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "BsSgmt", "IDSgmt", "FcsInfSgmt", "MnMmbInfSgmt",
		"MnShaHodInfSgmt", "ActuCotrlInfSgmt", "SpvsgAthrtyInfSgmt",
		"CotaInfSgmt" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class EnBasInf {
	/**
	 *������[1..1]  
	 */
	private com.dhcc.xml.ent.entity.baseinfo.BsSgmt BsSgmt;
	/**
	 *������ʶ��[0..1] 
	 */
	private IDSgmt IDSgmt;
	/**
	 *�����ſ���[0..1]
	 */
	private FcsInfSgmt FcsInfSgmt;
	/**
	 *��Ҫ�����Ա��[0..1] 
	 */
	private MnMmbInfSgmt MnMmbInfSgmt;
	/**
	 *ע���ʱ�����Ҫ�����˶�[0..1] 
	 */
	private MnShaHodInfSgmt MnShaHodInfSgmt;
	/**
	 *ʵ�ʿ����˶�[0..1] 
	 */
	private ActuCotrlInfSgmt ActuCotrlInfSgmt;
	/**
	 *�ϼ�������[0..1] 
	 */
	private SpvsgAthrtyInfSgmt SpvsgAthrtyInfSgmt;
	/**
	 *��ϵ��ʽ��[0..1] 
	 */
	private CotaInfSgmt CotaInfSgmt;

	public EnBasInf() {
		super();
	}

	/**
	 * ��ȡ bsSgmt
	 * 
	 * @return the bsSgmt ������[1..1]
	 */
	public com.dhcc.xml.ent.entity.baseinfo.BsSgmt getBsSgmt() {
		return BsSgmt;
	}

	/**
	 * ���� bsSgmt
	 * 
	 * @param bsSgmt
	 *            ������[1..1]
	 */
	public void setBsSgmt(com.dhcc.xml.ent.entity.baseinfo.BsSgmt bsSgmt) {
		BsSgmt = bsSgmt;
	}

	/**
	 * ��ȡ iDSgmt
	 * 
	 * @return the iDSgmt ������ʶ��[0..1]
	 */
	public IDSgmt getIDSgmt() {
		return IDSgmt;
	}

	/**
	 * ���� iDSgmt
	 * 
	 * @param iDSgmt
	 *            ������ʶ��[0..1]
	 */
	public void setIDSgmt(IDSgmt iDSgmt) {
		IDSgmt = iDSgmt;
	}

	/**
	 * ��ȡ fcsInfSgmt
	 * 
	 * @return the fcsInfSgmt �����ſ���[0..1]
	 */
	public FcsInfSgmt getFcsInfSgmt() {
		return FcsInfSgmt;
	}

	/**
	 * ���� fcsInfSgmt
	 * 
	 * @param fcsInfSgmt
	 *            �����ſ���[0..1]
	 */
	public void setFcsInfSgmt(FcsInfSgmt fcsInfSgmt) {
		FcsInfSgmt = fcsInfSgmt;
	}

	/**
	 * ��ȡ mnMmbInfSgmt
	 * 
	 * @return the mnMmbInfSgmt ��Ҫ�����Ա��[0..1]
	 */
	public MnMmbInfSgmt getMnMmbInfSgmt() {
		return MnMmbInfSgmt;
	}

	/**
	 * ���� mnMmbInfSgmt
	 * 
	 * @param mnMmbInfSgmt
	 *            ��Ҫ�����Ա��[0..1]
	 */
	public void setMnMmbInfSgmt(MnMmbInfSgmt mnMmbInfSgmt) {
		MnMmbInfSgmt = mnMmbInfSgmt;
	}

	/**
	 * ��ȡ mnShaHodInfSgmt
	 * 
	 * @return the mnShaHodInfSgmt ע���ʱ�����Ҫ�����˶�[0..1]
	 */
	public MnShaHodInfSgmt getMnShaHodInfSgmt() {
		return MnShaHodInfSgmt;
	}

	/**
	 * ���� mnShaHodInfSgmt
	 * 
	 * @param mnShaHodInfSgmt
	 *            ע���ʱ�����Ҫ�����˶�[0..1]
	 */
	public void setMnShaHodInfSgmt(MnShaHodInfSgmt mnShaHodInfSgmt) {
		MnShaHodInfSgmt = mnShaHodInfSgmt;
	}

	/**
	 * ��ȡ actuCotrlInfSgmt
	 * 
	 * @return the actuCotrlInfSgmt ʵ�ʿ����˶�[0..1]
	 */
	public ActuCotrlInfSgmt getActuCotrlInfSgmt() {
		return ActuCotrlInfSgmt;
	}

	/**
	 * ���� actuCotrlInfSgmt
	 * 
	 * @param actuCotrlInfSgmt
	 *            ʵ�ʿ����˶�[0..1]
	 */
	public void setActuCotrlInfSgmt(ActuCotrlInfSgmt actuCotrlInfSgmt) {
		ActuCotrlInfSgmt = actuCotrlInfSgmt;
	}

	/**
	 * ��ȡ spvsgAthrtyInfSgmt
	 * 
	 * @return the spvsgAthrtyInfSgmt �ϼ�������[0..1]
	 */
	public SpvsgAthrtyInfSgmt getSpvsgAthrtyInfSgmt() {
		return SpvsgAthrtyInfSgmt;
	}

	/**
	 * ���� spvsgAthrtyInfSgmt
	 * 
	 * @param spvsgAthrtyInfSgmt
	 *            �ϼ�������[0..1]
	 */
	public void setSpvsgAthrtyInfSgmt(SpvsgAthrtyInfSgmt spvsgAthrtyInfSgmt) {
		SpvsgAthrtyInfSgmt = spvsgAthrtyInfSgmt;
	}

	/**
	 * ��ȡ cotaInfSgmt
	 * 
	 * @return the cotaInfSgmt ��ϵ��ʽ��[0..1]
	 */
	public CotaInfSgmt getCotaInfSgmt() {
		return CotaInfSgmt;
	}

	/**
	 * ���� cotaInfSgmt
	 * 
	 * @param cotaInfSgmt
	 *            ��ϵ��ʽ��[0..1]
	 */
	public void setCotaInfSgmt(CotaInfSgmt cotaInfSgmt) {
		CotaInfSgmt = cotaInfSgmt;
	}

	@Override
	public String toString() {
		return "EnBasInf [BsSgmt=" + BsSgmt + ", IDSgmt=" + IDSgmt
				+ ", FcsInfSgmt=" + FcsInfSgmt + ", MnMmbInfSgmt="
				+ MnMmbInfSgmt + ", MnShaHodInfSgmt=" + MnShaHodInfSgmt
				+ ", ActuCotrlInfSgmt=" + ActuCotrlInfSgmt
				+ ", SpvsgAthrtyInfSgmt=" + SpvsgAthrtyInfSgmt
				+ ", CotaInfSgmt=" + CotaInfSgmt + "]";
	}

}
