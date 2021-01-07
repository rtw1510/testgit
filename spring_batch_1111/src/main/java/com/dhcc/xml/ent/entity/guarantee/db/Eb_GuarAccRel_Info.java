package com.dhcc.xml.ent.entity.guarantee.db;

/**  
  * Title: Eb_GuarAccRel_Info<br/>  
  * Description:企业担保账户记录相关还款责任人<br/>  
  * @author ChenJingYuan  
  * @date 2020-4-18  
  */  
public class Eb_GuarAccRel_Info {
	/**
	 *身份类别[1..1]
	 */
	private String InfoIDType;
	/**
	 *相关还款责任人名称[1..1]
	 */
	private String ArlpName;
	/**
	 *相关还款责任人身份标识类型[1..1]
	 */
	private String ArlpCertType;
	/**
	 *相关还款责任人身份标识号码[1..1]
	 */
	private String ArlpCertNum;
	/**
	 *还款责任人类型[1..1]
	 */
	private String ArlpType;
	/**
	 *还款责任金额[1..1]
	 */
	private String ArlpAmt;
	/**联保标志*/  
	private String WartySign;
	/**保证合同编号*/  
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
	 * 获取 wartySign
	 * @return the wartySign 联保标志 
	 */
	public String getWartySign() {
		return WartySign;
	}
	/**  
	 * 设置 wartySign  
	 * @param wartySign 联保标志  
	 */
	public void setWartySign(String wartySign) {
		WartySign = wartySign;
	}
	/**  
	 * 获取 maxGuarMcc
	 * @return the maxGuarMcc 保证合同编号 
	 */
	public String getMaxGuarMcc() {
		return MaxGuarMcc;
	}
	/**  
	 * 设置 maxGuarMcc  
	 * @param maxGuarMcc 保证合同编号  
	 */
	public void setMaxGuarMcc(String maxGuarMcc) {
		MaxGuarMcc = maxGuarMcc;
	}
}
