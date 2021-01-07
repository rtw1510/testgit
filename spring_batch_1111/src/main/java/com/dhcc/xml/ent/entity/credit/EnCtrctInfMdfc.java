package com.dhcc.xml.ent.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnCtrctInfMdfc<br/>
 * Description:��ҵ����Э����������¼��Ϣ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��24��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "BsSgmt", "MdfcSgmt" },namespace = "com.dhcc.xml.ent.entity.credit")
// ָ�����гɵ�xml�ڵ�˳��
public class EnCtrctInfMdfc {
	/**
	 *������[1..1]
	 */
	private BsSgmt BsSgmt;
	/**
	 *�������Ķ�[1..1]
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
