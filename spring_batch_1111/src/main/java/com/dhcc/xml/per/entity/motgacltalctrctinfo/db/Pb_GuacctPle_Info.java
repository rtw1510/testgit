package com.dhcc.xml.per.entity.motgacltalctrctinfo.db;

/**  
  * Title: Pb_GuacctPle_Info<br/>  
  * Description:��Ѻ����Ϣ <br/>  
  * @author ChenJingYuan  
  * @date 2020-4-3  
  */  
public class Pb_GuacctPle_Info {
	/**
	 *��Ѻ������ [1..1]
	 */
	private String PleType;
	/**
	 *��Ѻ��ʶ������� [1..1]
	 */
	private String MotgaProptIDType;
	/**
	 *��Ѻ��Ψһʶ��� [1..1]
	 */
	private String PleCertID;
	/**
	 *��Ѻ��λ�����ڵ��������� [1..1]
	 */
	private String PleDistr;
	/**
	 *��Ѻ��������ֵ [1..1]
	 */
	private String PleValue;
	/**
	 *���� [1..1]
	 */
	private String PleCy;
	/**
	 *������������ [1..1]
	 */
	private String ValOrgType;
	/**
	 *��Ѻ���������� [1..1]
	 */
	private String ValDate;
	/**
	 *��Ѻ������ [1..1]
	 */
	private String PledgorType;
	/**
	 *��Ѻ������ [1..1]
	 */
	private String PledgorName;
	/**
	 *��Ѻ����ݱ�ʶ���� [1..1]
	 */
	private String PleorCertType;
	/**
	 *��Ѻ����ݱ�ʶ���� [1..1]
	 */
	private String PleorCertNum;
	/**
	 *��Ѻ��˵�� [1..1]
	 */
	private String PleDesc;

	public Pb_GuacctPle_Info() {
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
	 * ��ȡ motgaProptIDType
	 * @return the motgaProptIDType ��Ѻ��ʶ������� [1..1] 
	 */
	public String getMotgaProptIDType() {
		return MotgaProptIDType;
	}
	/**  
	 * ���� motgaProptIDType  
	 * @param motgaProptIDType ��Ѻ��ʶ������� [1..1]  
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
