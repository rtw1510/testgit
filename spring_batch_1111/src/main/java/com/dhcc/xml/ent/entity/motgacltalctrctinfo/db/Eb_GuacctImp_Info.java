package com.dhcc.xml.ent.entity.motgacltalctrctinfo.db;

/**  
  * Title: Eb_GuacctImp_Info<br/>  
  * Description: 抵质押合同质物信息段表缓存<br/>  
  * @author ChenJingYuan  
  * @date 2018-8-11  
  */  
public class Eb_GuacctImp_Info {
	/**
	 *质物种类 [1..1]
	 */
	private String ImpType;
	/**
	 *质物价值 [1..1]
	 */
	private String ImpVal;
	/**
	 *币种 [1..1]
	 */
	private String ImpCy;
	/**
	 *出质人类型 [1..1]
	 */
	private String Ippc;
	/**
	 *出质人名称 [1..1]
	 */
	private String PawnName;
	/**
	 *出质人身份标识类型 [1..1]
	 */
	private String PawnCertType;
	/**
	 *出质人身份标识号码 [1..1]
	 */
	private String PawnCertNum;
	
	public String getImpCy() {
		return ImpCy;
	}
	public void setImpCy(String impCy) {
		ImpCy = impCy;
	}
	public String getImpType() {
		return ImpType;
	}
	public void setImpType(String impType) {
		ImpType = impType;
	}
	public String getImpVal() {
		return ImpVal;
	}
	public void setImpVal(String impVal) {
		ImpVal = impVal;
	}
	public String getIppc() {
		return Ippc;
	}
	public void setIppc(String ippc) {
		Ippc = ippc;
	}
	public String getPawnName() {
		return PawnName;
	}
	public void setPawnName(String pawnName) {
		PawnName = pawnName;
	}
	public String getPawnCertType() {
		return PawnCertType;
	}
	public void setPawnCertType(String pawnCertType) {
		PawnCertType = pawnCertType;
	}
	public String getPawnCertNum() {
		return PawnCertNum;
	}
	public void setPawnCertNum(String pawnCertNum) {
		PawnCertNum = pawnCertNum;
	}
}
