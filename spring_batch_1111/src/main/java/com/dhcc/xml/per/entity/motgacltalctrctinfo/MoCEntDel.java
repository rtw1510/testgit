/**  
 * Title: MoCEntDel.java<br\> 
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
 * Title: MoCEntDel<br/>
 * Description:�֣��ʣ�Ѻ��ͬ����ɾ�������¼ <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD) // �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "InfRecType", "DelRecCode" },namespace = "com.dhcc.xml.per.entity.motgacltalctrctinfo") // ָ�����гɵ�xml�ڵ�˳��
public class MoCEntDel {
	/**
	 *��Ϣ��¼����[1..1]
	 */
	private String InfRecType;
	/**
	 *��ɾ��ҵ���ʶ��[1..1]
	 */
	private String DelRecCode;

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
	 * ��ȡ delRecCode
	 * 
	 * @return the delRecCode ��ɾ��ҵ���ʶ��[1..1]
	 */
	public String getDelRecCode() {
		return DelRecCode;
	}

	/**
	 * ���� delRecCode
	 * 
	 * @param delRecCode
	 *            ��ɾ��ҵ���ʶ��[1..1]
	 */
	public void setDelRecCode(String delRecCode) {
		DelRecCode = delRecCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MoCEntDel [DelRecCode=" + DelRecCode + ", InfRecType="
				+ InfRecType + "]";
	}

}
