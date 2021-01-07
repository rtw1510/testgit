package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnBasInfo<br/>
 * Description:企业基本信息记录 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月25日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "BsSgmt", "IDSgmt", "FcsInfSgmt", "MnMmbInfSgmt",
		"MnShaHodInfSgmt", "ActuCotrlInfSgmt", "SpvsgAthrtyInfSgmt",
		"CotaInfSgmt" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class EnBasInf {
	/**
	 *基础段[1..1]  
	 */
	private com.dhcc.xml.ent.entity.baseinfo.BsSgmt BsSgmt;
	/**
	 *其他标识段[0..1] 
	 */
	private IDSgmt IDSgmt;
	/**
	 *基本概况段[0..1]
	 */
	private FcsInfSgmt FcsInfSgmt;
	/**
	 *主要组成人员段[0..1] 
	 */
	private MnMmbInfSgmt MnMmbInfSgmt;
	/**
	 *注册资本及主要出资人段[0..1] 
	 */
	private MnShaHodInfSgmt MnShaHodInfSgmt;
	/**
	 *实际控制人段[0..1] 
	 */
	private ActuCotrlInfSgmt ActuCotrlInfSgmt;
	/**
	 *上级机构段[0..1] 
	 */
	private SpvsgAthrtyInfSgmt SpvsgAthrtyInfSgmt;
	/**
	 *联系方式段[0..1] 
	 */
	private CotaInfSgmt CotaInfSgmt;

	public EnBasInf() {
		super();
	}

	/**
	 * 获取 bsSgmt
	 * 
	 * @return the bsSgmt 基础段[1..1]
	 */
	public com.dhcc.xml.ent.entity.baseinfo.BsSgmt getBsSgmt() {
		return BsSgmt;
	}

	/**
	 * 设置 bsSgmt
	 * 
	 * @param bsSgmt
	 *            基础段[1..1]
	 */
	public void setBsSgmt(com.dhcc.xml.ent.entity.baseinfo.BsSgmt bsSgmt) {
		BsSgmt = bsSgmt;
	}

	/**
	 * 获取 iDSgmt
	 * 
	 * @return the iDSgmt 其他标识段[0..1]
	 */
	public IDSgmt getIDSgmt() {
		return IDSgmt;
	}

	/**
	 * 设置 iDSgmt
	 * 
	 * @param iDSgmt
	 *            其他标识段[0..1]
	 */
	public void setIDSgmt(IDSgmt iDSgmt) {
		IDSgmt = iDSgmt;
	}

	/**
	 * 获取 fcsInfSgmt
	 * 
	 * @return the fcsInfSgmt 基本概况段[0..1]
	 */
	public FcsInfSgmt getFcsInfSgmt() {
		return FcsInfSgmt;
	}

	/**
	 * 设置 fcsInfSgmt
	 * 
	 * @param fcsInfSgmt
	 *            基本概况段[0..1]
	 */
	public void setFcsInfSgmt(FcsInfSgmt fcsInfSgmt) {
		FcsInfSgmt = fcsInfSgmt;
	}

	/**
	 * 获取 mnMmbInfSgmt
	 * 
	 * @return the mnMmbInfSgmt 主要组成人员段[0..1]
	 */
	public MnMmbInfSgmt getMnMmbInfSgmt() {
		return MnMmbInfSgmt;
	}

	/**
	 * 设置 mnMmbInfSgmt
	 * 
	 * @param mnMmbInfSgmt
	 *            主要组成人员段[0..1]
	 */
	public void setMnMmbInfSgmt(MnMmbInfSgmt mnMmbInfSgmt) {
		MnMmbInfSgmt = mnMmbInfSgmt;
	}

	/**
	 * 获取 mnShaHodInfSgmt
	 * 
	 * @return the mnShaHodInfSgmt 注册资本及主要出资人段[0..1]
	 */
	public MnShaHodInfSgmt getMnShaHodInfSgmt() {
		return MnShaHodInfSgmt;
	}

	/**
	 * 设置 mnShaHodInfSgmt
	 * 
	 * @param mnShaHodInfSgmt
	 *            注册资本及主要出资人段[0..1]
	 */
	public void setMnShaHodInfSgmt(MnShaHodInfSgmt mnShaHodInfSgmt) {
		MnShaHodInfSgmt = mnShaHodInfSgmt;
	}

	/**
	 * 获取 actuCotrlInfSgmt
	 * 
	 * @return the actuCotrlInfSgmt 实际控制人段[0..1]
	 */
	public ActuCotrlInfSgmt getActuCotrlInfSgmt() {
		return ActuCotrlInfSgmt;
	}

	/**
	 * 设置 actuCotrlInfSgmt
	 * 
	 * @param actuCotrlInfSgmt
	 *            实际控制人段[0..1]
	 */
	public void setActuCotrlInfSgmt(ActuCotrlInfSgmt actuCotrlInfSgmt) {
		ActuCotrlInfSgmt = actuCotrlInfSgmt;
	}

	/**
	 * 获取 spvsgAthrtyInfSgmt
	 * 
	 * @return the spvsgAthrtyInfSgmt 上级机构段[0..1]
	 */
	public SpvsgAthrtyInfSgmt getSpvsgAthrtyInfSgmt() {
		return SpvsgAthrtyInfSgmt;
	}

	/**
	 * 设置 spvsgAthrtyInfSgmt
	 * 
	 * @param spvsgAthrtyInfSgmt
	 *            上级机构段[0..1]
	 */
	public void setSpvsgAthrtyInfSgmt(SpvsgAthrtyInfSgmt spvsgAthrtyInfSgmt) {
		SpvsgAthrtyInfSgmt = spvsgAthrtyInfSgmt;
	}

	/**
	 * 获取 cotaInfSgmt
	 * 
	 * @return the cotaInfSgmt 联系方式段[0..1]
	 */
	public CotaInfSgmt getCotaInfSgmt() {
		return CotaInfSgmt;
	}

	/**
	 * 设置 cotaInfSgmt
	 * 
	 * @param cotaInfSgmt
	 *            联系方式段[0..1]
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
