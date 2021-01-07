package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: AcctSpecTrstDspnSgmt<br/>
 * Description:������Ϣ˵���� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "ChanTranType", "TranDate", "TranAmt", "DueTranMon",
		"DetInfo"},namespace = "com.dhcc.xml.per.entity.loaninfo")
public class CagOfTrdInf {
	/** ��������[1..1] */
	private String ChanTranType;
	/** ��������[1..1] */
	private String TranDate;
	/** ���׽��[1..1] */
	private String TranAmt;
	/** �������ڱ������[1..1] */
	private String DueTranMon;
	/** ������ϸ��Ϣ[1..1] */
	private String DetInfo;
	
	
	public CagOfTrdInf() {
		super();
	}


	/**  
	 * ��ȡ chanTranType
	 * @return the chanTranType ��������[1..1] 
	 */
	public String getChanTranType() {
		return ChanTranType;
	}


	/**  
	 * ���� chanTranType  
	 * @param chanTranType ��������[1..1]  
	 */
	public void setChanTranType(String chanTranType) {
		ChanTranType = chanTranType;
	}


	/**  
	 * ��ȡ tranDate
	 * @return the tranDate ��������[1..1] 
	 */
	public String getTranDate() {
		return TranDate;
	}


	/**  
	 * ���� tranDate  
	 * @param tranDate ��������[1..1]  
	 */
	public void setTranDate(String tranDate) {
		TranDate = tranDate;
	}


	/**  
	 * ��ȡ tranAmt
	 * @return the tranAmt ���׽��[1..1] 
	 */
	public String getTranAmt() {
		return TranAmt;
	}


	/**  
	 * ���� tranAmt  
	 * @param tranAmt ���׽��[1..1]  
	 */
	public void setTranAmt(String tranAmt) {
		TranAmt = tranAmt;
	}


	/**  
	 * ��ȡ dueTranMon
	 * @return the dueTranMon �������ڱ������[1..1] 
	 */
	public String getDueTranMon() {
		return DueTranMon;
	}


	/**  
	 * ���� dueTranMon  
	 * @param dueTranMon �������ڱ������[1..1]  
	 */
	public void setDueTranMon(String dueTranMon) {
		DueTranMon = dueTranMon;
	}


	/**  
	 * ��ȡ detInfo
	 * @return the detInfo ������ϸ��Ϣ[1..1] 
	 */
	public String getDetInfo() {
		return DetInfo;
	}


	/**  
	 * ���� detInfo  
	 * @param detInfo ������ϸ��Ϣ[1..1]  
	 */
	public void setDetInfo(String detInfo) {
		DetInfo = detInfo;
	}

}
