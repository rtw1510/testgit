/**  
 * Title: ComRecInfSgmt.java<br\> 
 * Description: <br\> 
 * Copyright: Copyright (c) 2018<br\> 
 * Company: DHCC<br\>  
 * @author ChenJingYuan  
 * @date 2018-2-26  
 */
package com.dhcc.xml.ent.entity.motgacltalctrctinfo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: ComRecInfSgmt<br/>
 * Description:抵（质）押合同共同债务人信息段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-2-26
 */
@XmlAccessorType(value = XmlAccessType.FIELD) // 访问类型改为字段
@XmlType(propOrder = { "GrtdNm", "OtrRec" },namespace = "com.dhcc.xml.ent.entity.motgacltalctrctinfo") // 指定序列成的xml节点顺序
public class ComRecInfSgmt {
	/**
	 *共同债务人个数[1..1]
	 */
	private String GrtdNm;
	/**
	 *→债务人信息 [1..99]
	 */
	private List<OtrRec> OtrRec;

	public ComRecInfSgmt() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取 grtdNm
	 * 
	 * @return the grtdNm 共同债务人个数[1..1]
	 */
	public String getGrtdNm() {
		return GrtdNm;
	}

	/**
	 * 设置 grtdNm
	 * 
	 * @param grtdNm
	 *            共同债务人个数[1..1]
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ComRecInfSgmt [GrtdNm=" + GrtdNm + ", OtrRec=" + OtrRec + "]";
	}

}
