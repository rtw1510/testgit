package com.dhcc.xml.ent.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: CreditLimSgmt<br/>
 * Description:???????Э????????????????<br/>
 * 
 * @author ChenJingYuan
 * @date 2018??1??24??
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// ?????????????
@XmlType(propOrder = { "CreditLimType", "LimLoopFlg", "CreditLim", "Cy",
		"ConEffDate", "ConExpDate", "ConStatus","CreditRest","CreditRestCode" },namespace = "com.dhcc.xml.ent.entity.credit")
// ??????г??xml??????
public class CreditLimSgmt {
	/**
	 *?????????? [1..1]
	 */
	private String CreditLimType;
	/**
	 *????????? [1..1]
	 */
	private String LimLoopFlg;
	/**
	 *?????? [1..1]
	 */
	private String CreditLim;
	/**
	 *???? [1..1]
	 */
	private String Cy;
	/**
	 *?????Ч???? [1..1]
	 */
	private String ConEffDate;
	/**
	 *?????????? [1..1]
	 */
	private String ConExpDate;
	/**
	 *????? [1..1]
	 */
	private String ConStatus;
	/** ???????[0..1] */
	private String CreditRest;
	/** ?????????[0..1] */
	private String CreditRestCode ;

	public CreditLimSgmt() {
		super();
	}

	/**
	 * ??? creditLimType
	 * 
	 * @return the creditLimType ?????????? [1..1]
	 */
	public String getCreditLimType() {
		return CreditLimType;
	}

	/**
	 * ???? creditLimType
	 * 
	 * @param creditLimType
	 *            ?????????? [1..1]
	 */
	public void setCreditLimType(String creditLimType) {
		CreditLimType = creditLimType;
	}

	/**
	 * ??? limLoopFlg
	 * 
	 * @return the limLoopFlg ????????? [1..1]
	 */
	public String getLimLoopFlg() {
		return LimLoopFlg;
	}

	/**
	 * ???? limLoopFlg
	 * 
	 * @param limLoopFlg
	 *            ????????? [1..1]
	 */
	public void setLimLoopFlg(String limLoopFlg) {
		LimLoopFlg = limLoopFlg;
	}

	/**
	 * ??? creditLim
	 * 
	 * @return the creditLim ?????? [1..1]
	 */
	public String getCreditLim() {
		return CreditLim;
	}

	/**
	 * ???? creditLim
	 * 
	 * @param creditLim
	 *            ?????? [1..1]
	 */
	public void setCreditLim(String creditLim) {
		CreditLim = creditLim;
	}

	/**
	 * ??? cy
	 * 
	 * @return the cy ???? [1..1]
	 */
	public String getCy() {
		return Cy;
	}

	/**
	 * ???? cy
	 * 
	 * @param cy
	 *            ???? [1..1]
	 */
	public void setCy(String cy) {
		Cy = cy;
	}

	/**
	 * ??? conEffDate
	 * 
	 * @return the conEffDate ?????Ч???? [1..1]
	 */
	public String getConEffDate() {
		return ConEffDate;
	}

	/**
	 * ???? conEffDate
	 * 
	 * @param conEffDate
	 *            ?????Ч???? [1..1]
	 */
	public void setConEffDate(String conEffDate) {
		ConEffDate = conEffDate;
	}

	/**
	 * ??? conExpDate
	 * 
	 * @return the conExpDate ?????????? [1..1]
	 */
	public String getConExpDate() {
		return ConExpDate;
	}

	/**
	 * ???? conExpDate
	 * 
	 * @param conExpDate
	 *            ?????????? [1..1]
	 */
	public void setConExpDate(String conExpDate) {
		ConExpDate = conExpDate;
	}

	/**
	 * ??? conStatus
	 * 
	 * @return the conStatus ????? [1..1]
	 */
	public String getConStatus() {
		return ConStatus;
	}

	/**
	 * ???? conStatus
	 * 
	 * @param conStatus
	 *            ????? [1..1]
	 */
	public void setConStatus(String conStatus) {
		ConStatus = conStatus;
	}

	/**  
	 * ??? creditRest
	 * @return the creditRest ???????[0..1] 
	 */
	public String getCreditRest() {
		return CreditRest;
	}

	/**  
	 * ???? creditRest  
	 * @param creditRest ???????[0..1]  
	 */
	public void setCreditRest(String creditRest) {
		CreditRest = creditRest;
	}

	/**  
	 * ??? creditRestCode
	 * @return the creditRestCode ?????????[0..1] 
	 */
	public String getCreditRestCode() {
		return CreditRestCode;
	}

	/**  
	 * ???? creditRestCode  
	 * @param creditRestCode ?????????[0..1]  
	 */
	public void setCreditRestCode(String creditRestCode) {
		CreditRestCode = creditRestCode;
	}

}
