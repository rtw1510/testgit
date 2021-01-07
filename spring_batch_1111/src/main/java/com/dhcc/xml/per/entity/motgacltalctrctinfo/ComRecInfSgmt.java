/**  
 * Title: ComRecInfSgmt.java<br\> 
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
import java.util.List;

/**
 * Title: ComRecInfSgmt<br/>
 * Description:�֣��ʣ�Ѻ��ͬ��ͬծ������Ϣ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD) // �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "GrtdNm", "OtrRec" },namespace = "com.dhcc.xml.per.entity.motgacltalctrctinfo") // ָ�����гɵ�xml�ڵ�˳��
public class ComRecInfSgmt {
	/**
	 *��ͬծ���˸���[1..1]
	 */
	private String GrtdNm;
	/**
	 *��ծ������Ϣ [1..99]
	 */
	private List<OtrRec> OtrRec;

	public ComRecInfSgmt() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * ��ȡ grtdNm
	 * 
	 * @return the grtdNm ��ͬծ���˸���[1..1]
	 */
	public String getGrtdNm() {
		return GrtdNm;
	}

	/**
	 * ���� grtdNm
	 * 
	 * @param grtdNm
	 *            ��ͬծ���˸���[1..1]
	 */
	public void setGrtdNm(String grtdNm) {
		GrtdNm = grtdNm;
	}

	
	
	public List<OtrRec> getOtrRec() {
		return OtrRec;
	}

	public void setOtrRec(List<OtrRec> otrRec) {
		OtrRec = otrRec;
	}
}
