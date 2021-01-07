/**  
 * Title: MoCIDCagsInf.java<br\> 
 * Description: <br\> 
 * Copyright: Copyright (c) 2018<br\> 
 * Company: DHCC<br\>  
 * @author ChenJingYuan  
 * @date 2018-2-26  
 */
package com.dhcc.xml.per.entity.motgacltalctrctinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MoCIDCagsInf<br/>
 * Description:�֣��ʣ�Ѻ��ͬ��ʶ��������¼ <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD) // �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "InfRecType", "OdBnesCode","NwBnesCode" },namespace = "com.dhcc.xml.per.entity.motgacltalctrctinfo") // ָ�����гɵ�xml�ڵ�˳��
public class MoCIDCagsInf {
	/**
	 *��Ϣ��¼���� [1..1]
	 */
	private String InfRecType;
	/**
	 *ԭҵ���ʶ�� [1..1]
	 */
	private String OdBnesCode;
	/**
	 *��ҵ���ʶ�� [1..1]
	 */
	private String NwBnesCode;

	public MoCIDCagsInf() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * ��ȡ infRecType
	 * 
	 * @return the infRecType ��Ϣ��¼���� [1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * ���� infRecType
	 * 
	 * @param infRecType
	 *            ��Ϣ��¼���� [1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * ��ȡ odBnesCode
	 * 
	 * @return the odBnesCode ԭҵ���ʶ�� [1..1]
	 */
	public String getOdBnesCode() {
		return OdBnesCode;
	}

	/**
	 * ���� odBnesCode
	 * 
	 * @param odBnesCode
	 *            ԭҵ���ʶ�� [1..1]
	 */
	public void setOdBnesCode(String odBnesCode) {
		OdBnesCode = odBnesCode;
	}

	/**
	 * ��ȡ nwBnesCode
	 * 
	 * @return the nwBnesCode ��ҵ���ʶ�� [1..1]
	 */
	public String getNwBnesCode() {
		return NwBnesCode;
	}

	/**
	 * ���� nwBnesCode
	 * 
	 * @param nwBnesCode
	 *            ��ҵ���ʶ�� [1..1]
	 */
	public void setNwBnesCode(String nwBnesCode) {
		NwBnesCode = nwBnesCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MoCIDCagsInf [InfRecType=" + InfRecType + ", NwBnesCode="
				+ NwBnesCode + ", OdBnesCode=" + OdBnesCode + "]";
	}

}
