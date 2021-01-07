package com.dhcc.xml.ent.entity.motgacltalctrctinfo.db;

/**  
  * Title: Eb_GuacctPle_Info<br/>  
  * Description:抵押物信息 <br/>  
  * @author ChenJingYuan  
  * @date 2020-4-3  
  */  
public class Eb_GuacctPle_Info {
	/**
	 *抵押物种类 [1..1]
	 */
	private String PleType;
	/**
	 *抵押物识别号类型 [1..1]
	 */
	private String MotgaProptIDType;
	/**
	 *抵押物唯一识别号 [1..1]
	 */
	private String PleCertID;
	/**
	 *抵押物位置所在地行政区划 [1..1]
	 */
	private String PleDistr;
	/**
	 *抵押物评估价值 [1..1]
	 */
	private String PleValue;
	/**
	 *币种 [1..1]
	 */
	private String PleCy;
	/**
	 *评估机构类型 [1..1]
	 */
	private String ValOrgType;
	/**
	 *抵押物评估日期 [1..1]
	 */
	private String ValDate;
	/**
	 *抵押人类型 [1..1]
	 */
	private String PledgorType;
	/**
	 *抵押人姓名 [1..1]
	 */
	private String PledgorName;
	/**
	 *抵押人身份标识类型 [1..1]
	 */
	private String PleorCertType;
	/**
	 *抵押人身份标识号码 [1..1]
	 */
	private String PleorCertNum;
	/**
	 *抵押物说明 [1..1]
	 */
	private String PleDesc;

	public Eb_GuacctPle_Info() {
		super();
	}
	public String getPleCy() {
		return PleCy;
	}
	public void setPleCy(String pleCy) {
		PleCy = pleCy;
	}
	public String getPleType() {
		return PleType;
	}
	public void setPleType(String pleType) {
		PleType = pleType;
	}
	/**  
	 * 获取 motgaProptIDType
	 * @return the motgaProptIDType 抵押物识别号类型 [1..1] 
	 */
	public String getMotgaProptIDType() {
		return MotgaProptIDType;
	}
	/**  
	 * 设置 motgaProptIDType  
	 * @param motgaProptIDType 抵押物识别号类型 [1..1]  
	 */
	public void setMotgaProptIDType(String motgaProptIDType) {
		MotgaProptIDType = motgaProptIDType;
	}
	public String getPleCertID() {
		return PleCertID;
	}
	public void setPleCertID(String pleCertID) {
		PleCertID = pleCertID;
	}
	public String getPleDistr() {
		return PleDistr;
	}
	public void setPleDistr(String pleDistr) {
		PleDistr = pleDistr;
	}
	public String getPleValue() {
		return PleValue;
	}
	public void setPleValue(String pleValue) {
		PleValue = pleValue;
	}
	public String getValOrgType() {
		return ValOrgType;
	}
	public void setValOrgType(String valOrgType) {
		ValOrgType = valOrgType;
	}
	public String getValDate() {
		return ValDate;
	}
	public void setValDate(String valDate) {
		ValDate = valDate;
	}
	public String getPledgorType() {
		return PledgorType;
	}
	public void setPledgorType(String pledgorType) {
		PledgorType = pledgorType;
	}
	public String getPledgorName() {
		return PledgorName;
	}
	public void setPledgorName(String pledgorName) {
		PledgorName = pledgorName;
	}
	public String getPleorCertType() {
		return PleorCertType;
	}
	public void setPleorCertType(String pleorCertType) {
		PleorCertType = pleorCertType;
	}
	public String getPleorCertNum() {
		return PleorCertNum;
	}
	public void setPleorCertNum(String pleorCertNum) {
		PleorCertNum = pleorCertNum;
	}
	public String getPleDesc() {
		return PleDesc;
	}
	public void setPleDesc(String pleDesc) {
		PleDesc = pleDesc;
	}
	
	
}
