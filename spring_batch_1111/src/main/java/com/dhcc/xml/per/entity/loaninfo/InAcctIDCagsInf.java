package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InAcctIDCagsInf<br/>
 * Description: ���˽���˻���ʶ���<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfRecType", "OdBnesCode", "NwBnesCode" },namespace = "com.dhcc.xml.per.entity.loaninfo")
public class InAcctIDCagsInf {
	/**
	 * ��Ϣ��¼���� [1..1]
	 */
	private String InfRecType;
	/**
	 * ԭҵ���ʶ�� [1..1]
	 */
	private String OdBnesCode;
	/**
	 * ��ҵ���ʶ�� [1..1]
	 */
	private String NwBnesCode;
	public InAcctIDCagsInf() {
		super();
	}
	/**  
	 * ��ȡ infRecType
	 * @return the infRecType ��Ϣ��¼���� [1..1] 
	 */
	public String getInfRecType() {
		return InfRecType;
	}
	/**  
	 * ���� infRecType  
	 * @param infRecType ��Ϣ��¼���� [1..1]  
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}
	/**  
	 * ��ȡ odBnesCode
	 * @return the odBnesCode ԭҵ���ʶ�� [1..1] 
	 */
	public String getOdBnesCode() {
		return OdBnesCode;
	}
	/**  
	 * ���� odBnesCode  
	 * @param odBnesCode ԭҵ���ʶ�� [1..1]  
	 */
	public void setOdBnesCode(String odBnesCode) {
		OdBnesCode = odBnesCode;
	}
	/**  
	 * ��ȡ nwBnesCode
	 * @return the nwBnesCode ��ҵ���ʶ�� [1..1] 
	 */
	public String getNwBnesCode() {
		return NwBnesCode;
	}
	/**  
	 * ���� nwBnesCode  
	 * @param nwBnesCode ��ҵ���ʶ�� [1..1]  
	 */
	public void setNwBnesCode(String nwBnesCode) {
		NwBnesCode = nwBnesCode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InAcctIDCagsInf [InfRecType=" + InfRecType + ", OdBnesCode="
				+ OdBnesCode + ", NwBnesCode=" + NwBnesCode + "]";
	}
}
