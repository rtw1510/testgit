package com.dhcc.xml.ent.entity.motgacltalctrctinfo.db;

/**  
  * Title: Eb_GuacctRlt_Info<br/>  
  * Description: 其他债务人信息段<br/>  
  * @author ChenJingYuan  
  * @date 2020-4-3  
  */  
public class Eb_GuacctRlt_Info {
	/**
	 *身份类别 [1..1]
	 */
	private String InfoIDType;
	/**
	 *共同债务人名称 [1..1]
	 */
	private String GuarName;
	/**
	 *共同债务人身份标识类型 [1..1]
	 */
	private String GuarCertType;
	/**
	 *共同债务人身份标识号码 [1..1]
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
