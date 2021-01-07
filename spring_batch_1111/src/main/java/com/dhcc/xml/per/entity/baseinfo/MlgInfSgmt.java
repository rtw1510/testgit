package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MlgInfSgmt<br/>
 * Description:个人基本信息记录-通讯地址信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "MailAddr", "MailPc", "MailDist", "MlgInfoUpDate" },namespace = "com.dhcc.xml.per.entity.baseinfo")
public class MlgInfSgmt{
	/** 通讯地址[1..1] */
	private String MailAddr;
	/** 通讯地邮编[1..1] */
	private String MailPc;
	/** 通讯地行政区划[1..1] */
	private String MailDist;
	/** 信息更新日期[1..1] */
	private String MlgInfoUpDate;

	public MlgInfSgmt() {
		super();
	}

	/**
	 * 获取 mailAddr
	 * 
	 * @return the mailAddr 通讯地址[1..1]
	 */
	public String getMailAddr() {
		return MailAddr;
	}

	/**
	 * 设置 mailAddr
	 * 
	 * @param mailAddr
	 *            通讯地址[1..1]
	 */
	public void setMailAddr(String mailAddr) {
		MailAddr = mailAddr;
	}

	/**
	 * 获取 mailPc
	 * 
	 * @return the mailPc 通讯地邮编[1..1]
	 */
	public String getMailPc() {
		return MailPc;
	}

	/**
	 * 设置 mailPc
	 * 
	 * @param mailPc
	 *            通讯地邮编[1..1]
	 */
	public void setMailPc(String mailPc) {
		MailPc = mailPc;
	}

	/**
	 * 获取 mailDist
	 * 
	 * @return the mailDist 通讯地行政区划[1..1]
	 */
	public String getMailDist() {
		return MailDist;
	}

	/**
	 * 设置 mailDist
	 * 
	 * @param mailDist
	 *            通讯地行政区划[1..1]
	 */
	public void setMailDist(String mailDist) {
		MailDist = mailDist;
	}

	/**
	 * 获取 mlgInfoUpDate
	 * 
	 * @return the mlgInfoUpDate 信息更新日期[1..1]
	 */
	public String getMlgInfoUpDate() {
		return MlgInfoUpDate;
	}

	/**
	 * 设置 mlgInfoUpDate
	 * 
	 * @param mlgInfoUpDate
	 *            信息更新日期[1..1]
	 */
	public void setMlgInfoUpDate(String mlgInfoUpDate) {
		MlgInfoUpDate = mlgInfoUpDate;
	}

	@Override
	public String toString() {
		return "MlgInfSgmt [MailAddr=" + MailAddr + ", MailPc=" + MailPc
				+ ", MailDist=" + MailDist + ", MlgInfoUpDate=" + MlgInfoUpDate
				+ "]";
	}
}
