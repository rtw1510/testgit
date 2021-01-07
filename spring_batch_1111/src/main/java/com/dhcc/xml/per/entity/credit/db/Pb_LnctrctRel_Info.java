package com.dhcc.xml.per.entity.credit.db;

/**  
  * Title: Pb_LnctrctRel_Info<br/>  
  * Description:个人征信授信协议共同授信人信息表 <br/>  
  * @author ChenJingYuan  
  * @date 2018-11-16  
  */  
public class Pb_LnctrctRel_Info {
	/**
	 * 共同受信人身份类别 [1..1]
	 */
	private String BrerType;
	/**
	 * 共同受信人名称 [1..1]
	 */
	private String CertRelName;
	/**
	 * 共同受信人身份标识类型 [1..1]
	 */
	private String CertRelIDType;
	/**
	 * 共同受信人身份标识号码 [1..1]
	 */
	private String CertRelIDNum;
	
	public Pb_LnctrctRel_Info() {
		super();
	}

	public String getBrerType() {
		return BrerType;
	}

	public void setBrerType(String brerType) {
		BrerType = brerType;
	}

	public String getCertRelName() {
		return CertRelName;
	}

	public void setCertRelName(String certRelName) {
		CertRelName = certRelName;
	}

	public String getCertRelIDType() {
		return CertRelIDType;
	}

	public void setCertRelIDType(String certRelIDType) {
		CertRelIDType = certRelIDType;
	}

	public String getCertRelIDNum() {
		return CertRelIDNum;
	}

	public void setCertRelIDNum(String certRelIDNum) {
		CertRelIDNum = certRelIDNum;
	}
}
