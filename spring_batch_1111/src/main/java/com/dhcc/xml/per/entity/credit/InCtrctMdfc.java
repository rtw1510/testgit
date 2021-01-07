package com.dhcc.xml.per.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InCtrctMdfc<br/>
 * Description: 个人授信协议按段更正<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)//访问类型改为字段
@XmlType(propOrder = { "BsSgmt", "MdfcSgmt" },namespace = "com.dhcc.xml.per.entity.credit")// 字段展示先后顺序
public class InCtrctMdfc {
	/**
	 * 基础段
	 */
	private BsSgmt BsSgmt;
	/**
	 * 待更正的段
	 */
	private MdfcSgmt MdfcSgmt;

	public InCtrctMdfc() {
		super();
	}

	/**
	 * 获取 bsSgmt
	 * 
	 * @return the bsSgmt 基础段
	 */
	public BsSgmt getBsSgmt() {
		return BsSgmt;
	}

	/**
	 * 设置 bsSgmt
	 * 
	 * @param bsSgmt
	 *            基础段
	 */
	public void setBsSgmt(BsSgmt bsSgmt) {
		BsSgmt = bsSgmt;
	}


	/**  
	 * 获取 mdfcSgmt
	 * @return the mdfcSgmt 待更正的段 
	 */
	public MdfcSgmt getMdfcSgmt() {
		return MdfcSgmt;
	}

	/**  
	 * 设置 mdfcSgmt  
	 * @param mdfcSgmt 待更正的段  
	 */
	public void setMdfcSgmt(MdfcSgmt mdfcSgmt) {
		MdfcSgmt = mdfcSgmt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InCtrctMdfc [BsSgmt=" + BsSgmt + ", MdfcSgmt=" + MdfcSgmt + "]";
	}

}
