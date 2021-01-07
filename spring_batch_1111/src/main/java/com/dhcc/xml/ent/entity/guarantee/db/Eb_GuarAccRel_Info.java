package com.dhcc.xml.ent.entity.guarantee.db;

/**  
  * Title: Eb_GuarAccRel_Info<br/>  
  * Description:��ҵ�����˻���¼��ػ���������<br/>  
  * @author ChenJingYuan  
  * @date 2020-4-18  
  */  
public class Eb_GuarAccRel_Info {
	/**
	 *������[1..1]
	 */
	private String InfoIDType;
	/**
	 *��ػ�������������[1..1]
	 */
	private String ArlpName;
	/**
	 *��ػ�����������ݱ�ʶ����[1..1]
	 */
	private String ArlpCertType;
	/**
	 *��ػ�����������ݱ�ʶ����[1..1]
	 */
	private String ArlpCertNum;
	/**
	 *��������������[1..1]
	 */
	private String ArlpType;
	/**
	 *�������ν��[1..1]
	 */
	private String ArlpAmt;
	/**������־*/  
	private String WartySign;
	/**��֤��ͬ���*/  
	private String MaxGuarMcc;
	
	public Eb_GuarAccRel_Info() {
		super();
	}
	public String getInfoIDType() {
		return InfoIDType;
	}
	public void setInfoIDType(String infoIDType) {
		InfoIDType = infoIDType;
	}
	public String getArlpName() {
		return ArlpName;
	}
	public void setArlpName(String arlpName) {
		ArlpName = arlpName;
	}
	public String getArlpCertType() {
		return ArlpCertType;
	}
	public void setArlpCertType(String arlpCertType) {
		ArlpCertType = arlpCertType;
	}
	public String getArlpCertNum() {
		return ArlpCertNum;
	}
	public void setArlpCertNum(String arlpCertNum) {
		ArlpCertNum = arlpCertNum;
	}
	public String getArlpType() {
		return ArlpType;
	}
	public void setArlpType(String arlpType) {
		ArlpType = arlpType;
	}
	public String getArlpAmt() {
		return ArlpAmt;
	}
	public void setArlpAmt(String arlpAmt) {
		ArlpAmt = arlpAmt;
	}
	/**  
	 * ��ȡ wartySign
	 * @return the wartySign ������־ 
	 */
	public String getWartySign() {
		return WartySign;
	}
	/**  
	 * ���� wartySign  
	 * @param wartySign ������־  
	 */
	public void setWartySign(String wartySign) {
		WartySign = wartySign;
	}
	/**  
	 * ��ȡ maxGuarMcc
	 * @return the maxGuarMcc ��֤��ͬ��� 
	 */
	public String getMaxGuarMcc() {
		return MaxGuarMcc;
	}
	/**  
	 * ���� maxGuarMcc  
	 * @param maxGuarMcc ��֤��ͬ���  
	 */
	public void setMaxGuarMcc(String maxGuarMcc) {
		MaxGuarMcc = maxGuarMcc;
	}
}
