package com.dhcc.xml.ent.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnCtrctInfIDCagsInf<br/>
 * Description:��ҵ����Э����Ϣ��ʶ��������¼ <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��24��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "InfRecType", "OdBnesCode", "NwBnesCode" },namespace = "com.dhcc.xml.ent.entity.credit")
// ָ�����гɵ�xml�ڵ�˳��
public class EnCtrctInfIDCagsInf {
	/**
	 *��Ϣ��¼����[1..1]
	 */
	private String InfRecType;
	/**
	 *ԭҵ���ʶ����[1..1]
	 */
	private String OdBnesCode;
	/**
	 *��ҵ���ʶ����[1..1]
	 */
	private String NwBnesCode;

	public EnCtrctInfIDCagsInf() {
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
	 * ��ȡ odBnesCode
	 * 
	 * @return the odBnesCode ԭҵ���ʶ����[1..1]
	 */
	public String getOdBnesCode() {
		return OdBnesCode;
	}

	/**
	 * ���� odBnesCode
	 * 
	 * @param odBnesCode
	 *            ԭҵ���ʶ����[1..1]
	 */
	public void setOdBnesCode(String odBnesCode) {
		OdBnesCode = odBnesCode;
	}

	/**
	 * ��ȡ nwBnesCode
	 * 
	 * @return the nwBnesCode ��ҵ���ʶ����[1..1]
	 */
	public String getNwBnesCode() {
		return NwBnesCode;
	}

	/**
	 * ���� nwBnesCode
	 * 
	 * @param nwBnesCode
	 *            ��ҵ���ʶ����[1..1]
	 */
	public void setNwBnesCode(String nwBnesCode) {
		NwBnesCode = nwBnesCode;
	}

	@Override
	public String toString() {
		return "EnCtrctInfIDCagsInf [InfRecType=" + InfRecType
				+ ", OdBnesCode=" + OdBnesCode + ", NwBnesCode=" + NwBnesCode
				+ "]";
	}

}
