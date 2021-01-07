package com.dhcc.xml.ent.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnCtrctInfMdfc<br/>
 * Description:企业授信协议更正请求记录信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "BsSgmt", "MdfcSgmt" },namespace = "com.dhcc.xml.ent.entity.credit")
// 指定序列成的xml节点顺序
public class EnCtrctInfMdfc {
	/**
	 *基础段[1..1]
	 */
	private BsSgmt BsSgmt;
	/**
	 *待更正的段[1..1]
	 */
	private MdfcSgmt MdfcSgmt;

	public EnCtrctInfMdfc() {
		super();
	}

	public BsSgmt getBsSgmt() {
		return BsSgmt;
	}

	public void setBsSgmt(BsSgmt bsSgmt) {
		BsSgmt = bsSgmt;
	}

	public MdfcSgmt getMdfcSgmt() {
		return MdfcSgmt;
	}

	public void setMdfcSgmt(MdfcSgmt mdfcSgmt) {
		MdfcSgmt = mdfcSgmt;
	}


}
