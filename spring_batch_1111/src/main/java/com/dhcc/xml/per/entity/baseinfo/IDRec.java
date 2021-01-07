package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: IDRec<br/>
 * Description: ���˻�����Ϣ��¼����֤����Ϣ<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "Alias", "OthIDType", "OthIDNum" },namespace = "com.dhcc.xml.per.entity.baseinfo")
public class IDRec {
	/**
	 * ���� [1..1]
	 */
	private String Alias;
	/**
	 * ֤������ [1..1]
	 */
	private String OthIDType;
	/**
	 * ֤������ [1..1]
	 */
	private String OthIDNum;

	public IDRec() {
		super();
	}

	/**
	 * ��ȡ alias
	 * 
	 * @return the alias ���� [1..1]
	 */
	public String getAlias() {
		return Alias;
	}

	/**
	 * ���� alias
	 * 
	 * @param alias
	 *            ���� [1..1]
	 */
	public void setAlias(String alias) {
		Alias = alias;
	}

	/**
	 * ��ȡ othIDType
	 * 
	 * @return the othIDType ֤������ [1..1]
	 */
	public String getOthIDType() {
		return OthIDType;
	}

	/**
	 * ���� othIDType
	 * 
	 * @param othIDType
	 *            ֤������ [1..1]
	 */
	public void setOthIDType(String othIDType) {
		OthIDType = othIDType;
	}

	/**
	 * ��ȡ othIDNum
	 * 
	 * @return the othIDNum ֤������ [1..1]
	 */
	public String getOthIDNum() {
		return OthIDNum;
	}

	/**
	 * ���� othIDNum
	 * 
	 * @param othIDNum
	 *            ֤������ [1..1]
	 */
	public void setOthIDNum(String othIDNum) {
		OthIDNum = othIDNum;
	}

	@Override
	public String toString() {
		return "IDRec [Alias=" + Alias + ", OthIDType=" + OthIDType
				+ ", OthIDNum=" + OthIDNum + "]";
	}

}
