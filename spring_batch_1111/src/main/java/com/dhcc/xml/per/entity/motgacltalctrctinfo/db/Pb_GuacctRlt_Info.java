package com.dhcc.xml.per.entity.motgacltalctrctinfo.db;

/**  
  * Title: Pb_GuacctRlt_Info<br/>  
  * Description: ����ծ������Ϣ��<br/>  
  * @author ChenJingYuan  
  * @date 2020-4-3  
  */  
public class Pb_GuacctRlt_Info {
	/**
	 *������ [1..1]
	 */
	private String InfoIDType;
	/**
	 *��ͬծ�������� [1..1]
	 */
	private String GuarName;
	/**
	 *��ͬծ������ݱ�ʶ���� [1..1]
	 */
	private String GuarCertType;
	/**
	 *��ͬծ������ݱ�ʶ���� [1..1]
	 */
	private String GuarCertNum;
	
	public String getInfoIDType() {
		return InfoIDType;
	}
	public void setInfoIDType(String infoIDType) {
		InfoIDType = infoIDType;
	}
	public String getGuarName() {
		return GuarName;
	}
	public void setGuarName(String guarName) {
		GuarName = guarName;
	}
	public String getGuarCertType() {
		return GuarCertType;
	}
	public void setGuarCertType(String guarCertType) {
		GuarCertType = guarCertType;
	}
	public String getGuarCertNum() {
		return GuarCertNum;
	}
	public void setGuarCertNum(String guarCertNum) {
		GuarCertNum = guarCertNum;
	}
	
	
}
