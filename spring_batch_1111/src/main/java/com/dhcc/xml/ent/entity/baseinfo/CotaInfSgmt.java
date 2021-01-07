package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: CotaInfSgmt<br/>
 * Description:???????? <br/>
 * 
 * @author ChenJingYuan
 * @date 2018??1??25??
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "ConAddDistrictCode", "ConAdd", "ConPhone",
		"FinConPhone", "CotaInfoUpDate" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class CotaInfSgmt {
	/**
	 * ??????????????????[1..1]
	 */
	private String ConAddDistrictCode;
	/**
	 * ??????[0..1]
	 */
	private String ConAdd;
	/**
	 * ????绰[0..1]
	 */
	private String ConPhone;
	/**
	 * ??????????绰[0..1]
	 */
	private String FinConPhone;
	/**
	 * ???????????[1..1]
	 */
	private String CotaInfoUpDate;

	public CotaInfSgmt() {
		super();
	}

	/**
	 * ??? conAddDistrictCode
	 * 
	 * @return the conAddDistrictCode ??????????????????[1..1]
	 */
	public String getConAddDistrictCode() {
		return ConAddDistrictCode;
	}

	/**
	 * ???? conAddDistrictCode
	 * 
	 * @param conAddDistrictCode
	 *            ??????????????????[1..1]
	 */
	public void setConAddDistrictCode(String conAddDistrictCode) {
		ConAddDistrictCode = conAddDistrictCode;
	}

	/**
	 * ??? conAdd
	 * 
	 * @return the conAdd ??????[0..1]
	 */
	public String getConAdd() {
		return ConAdd;
	}

	/**
	 * ???? conAdd
	 * 
	 * @param conAdd
	 *            ??????[0..1]
	 */
	public void setConAdd(String conAdd) {
		ConAdd = conAdd;
	}

	/**
	 * ??? conPhone
	 * 
	 * @return the conPhone ????绰[0..1]
	 */
	public String getConPhone() {
		return ConPhone;
	}

	/**
	 * ???? conPhone
	 * 
	 * @param conPhone
	 *            ????绰[0..1]
	 */
	public void setConPhone(String conPhone) {
		ConPhone = conPhone;
	}

	/**
	 * ??? finConPhone
	 * 
	 * @return the finConPhone ??????????绰[0..1]
	 */
	public String getFinConPhone() {
		return FinConPhone;
	}

	/**
	 * ???? finConPhone
	 * 
	 * @param finConPhone
	 *            ??????????绰[0..1]
	 */
	public void setFinConPhone(String finConPhone) {
		FinConPhone = finConPhone;
	}

	/**
	 * ??? cotaInfoUpDate
	 * 
	 * @return the cotaInfoUpDate ???????????[1..1]
	 */
	public String getCotaInfoUpDate() {
		return CotaInfoUpDate;
	}

	/**
	 * ???? cotaInfoUpDate
	 * 
	 * @param cotaInfoUpDate
	 *            ???????????[1..1]
	 */
	public void setCotaInfoUpDate(String cotaInfoUpDate) {
		CotaInfoUpDate = cotaInfoUpDate;
	}

	@Override
	public String toString() {
		return "CotaInfSgmt [ConAddDistrictCode=" + ConAddDistrictCode
				+ ", ConAdd=" + ConAdd + ", ConPhone=" + ConPhone
				+ ", FinConPhone=" + FinConPhone + ", CotaInfoUpDate="
				+ CotaInfoUpDate + "]";
	}

}
