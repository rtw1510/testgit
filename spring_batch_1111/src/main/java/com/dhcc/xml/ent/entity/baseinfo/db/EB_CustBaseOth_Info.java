package com.dhcc.xml.ent.entity.baseinfo.db;

/**
 * Title: EB_CustBaseOth_Info<br/>
 * Description:其他标识段映射的相应的表字段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
public class EB_CustBaseOth_Info {

	/**
	 * 企业身份标识类型[1..1]
	 */
	private String OthEntCertType;
	/**
	 * 企业身份标识号码[1..1]
	 */
	private String OthEntCertNum;

	/**
	 * 获取 othEntCertType
	 * 
	 * @return the othEntCertType 企业身份标识类型
	 */
	public String getOthEntCertType() {
		return OthEntCertType;
	}

	/**
	 * 设置 othEntCertType
	 * 
	 * @param othEntCertType
	 *            企业身份标识类型
	 */
	public void setOthEntCertType(String othEntCertType) {
		OthEntCertType = othEntCertType;
	}

	/**
	 * 获取 othEntCertNum
	 * 
	 * @return the othEntCertNum 企业身份标识号码[1..1]
	 */
	public String getOthEntCertNum() {
		return OthEntCertNum;
	}

	/**
	 * 设置 othEntCertNum
	 * 
	 * @param othEntCertNum
	 *            企业身份标识号码[1..1]
	 */
	public void setOthEntCertNum(String othEntCertNum) {
		OthEntCertNum = othEntCertNum;
	}
}
