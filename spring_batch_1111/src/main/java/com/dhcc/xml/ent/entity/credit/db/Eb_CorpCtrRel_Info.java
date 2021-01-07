package com.dhcc.xml.ent.entity.credit.db;

/**
 * Title: Eb_CorpCtrRel_Info<br/>
 * Description:企业授信协议共同授信人信息段数据表映射 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-7-25
 */
public class Eb_CorpCtrRel_Info {
	/**
	 *共同受信人身份类别 [1..1]
	 */
	private String BrerType;
	/**
	 *共同受信人名称 [1..1]
	 */
	private String CertRelName;
	/**
	 *共同受信人身份标识类型 [1..1]
	 */
	private String CertRelIDType;
	/**
	 *共同受信人身份标识号码 [1..1]
	 */
	private String CertRelIDNum;

	public Eb_CorpCtrRel_Info() {
		super();
	}

	/**
	 * 获取 brerType
	 * 
	 * @return the brerType 共同受信人身份类别 [1..1]
	 */
	public String getBrerType() {
		return BrerType;
	}

	/**
	 * 设置 brerType
	 * 
	 * @param brerType
	 *            共同受信人身份类别 [1..1]
	 */
	public void setBrerType(String brerType) {
		BrerType = brerType;
	}

	/**
	 * 获取 certRelName
	 * 
	 * @return the certRelName 共同受信人名称 [1..1]
	 */
	public String getCertRelName() {
		return CertRelName;
	}

	/**
	 * 设置 certRelName
	 * 
	 * @param certRelName
	 *            共同受信人名称 [1..1]
	 */
	public void setCertRelName(String certRelName) {
		CertRelName = certRelName;
	}

	/**
	 * 获取 certRelIDType
	 * 
	 * @return the certRelIDType 共同受信人身份标识类型 [1..1]
	 */
	public String getCertRelIDType() {
		return CertRelIDType;
	}

	/**
	 * 设置 certRelIDType
	 * 
	 * @param certRelIDType
	 *            共同受信人身份标识类型 [1..1]
	 */
	public void setCertRelIDType(String certRelIDType) {
		CertRelIDType = certRelIDType;
	}

	/**
	 * 获取 certRelIDNum
	 * 
	 * @return the certRelIDNum 共同受信人身份标识号码 [1..1]
	 */
	public String getCertRelIDNum() {
		return CertRelIDNum;
	}

	/**
	 * 设置 certRelIDNum
	 * 
	 * @param certRelIDNum
	 *            共同受信人身份标识号码 [1..1]
	 */
	public void setCertRelIDNum(String certRelIDNum) {
		CertRelIDNum = certRelIDNum;
	}
}
