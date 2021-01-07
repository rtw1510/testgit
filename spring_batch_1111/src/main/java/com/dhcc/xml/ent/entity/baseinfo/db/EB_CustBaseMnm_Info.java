package com.dhcc.xml.ent.entity.baseinfo.db;

/**
 * Title: EB_CustBaseMnm_Info<br/>
 * Description: 企业基本信息主要组成人员表<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
public class EB_CustBaseMnm_Info {
	/**
	 * 组成人员姓名[1..1]
	 */
	private String MmbAlias;
	/**
	 * 组成人员证件类型[1..1]
	 */
	private String MmbIDType;
	/**
	 * 组成人员证件号码[1..1]
	 */
	private String MmbIDNum;
	/**
	 * 组成人员职位[1..1]
	 */
	private String MmbPstn;

	public EB_CustBaseMnm_Info() {
		super();
	}

	/**
	 * 获取 mmbAlias
	 * 
	 * @return the mmbAlias 组成人员姓名[1..1]
	 */
	public String getMmbAlias() {
		return MmbAlias;
	}

	/**
	 * 设置 mmbAlias
	 * 
	 * @param mmbAlias
	 *            组成人员姓名[1..1]
	 */
	public void setMmbAlias(String mmbAlias) {
		MmbAlias = mmbAlias;
	}

	/**
	 * 获取 mmbIDType
	 * 
	 * @return the mmbIDType 组成人员证件类型[1..1]
	 */
	public String getMmbIDType() {
		return MmbIDType;
	}

	/**
	 * 设置 mmbIDType
	 * 
	 * @param mmbIDType
	 *            组成人员证件类型[1..1]
	 */
	public void setMmbIDType(String mmbIDType) {
		MmbIDType = mmbIDType;
	}

	/**
	 * 获取 mmbIDNum
	 * 
	 * @return the mmbIDNum 组成人员证件号码[1..1]
	 */
	public String getMmbIDNum() {
		return MmbIDNum;
	}

	/**
	 * 设置 mmbIDNum
	 * 
	 * @param mmbIDNum
	 *            组成人员证件号码[1..1]
	 */
	public void setMmbIDNum(String mmbIDNum) {
		MmbIDNum = mmbIDNum;
	}

	/**
	 * 获取 mmbPstn
	 * 
	 * @return the mmbPstn 组成人员职位[1..1]
	 */
	public String getMmbPstn() {
		return MmbPstn;
	}

	/**
	 * 设置 mmbPstn
	 * 
	 * @param mmbPstn
	 *            组成人员职位[1..1]
	 */
	public void setMmbPstn(String mmbPstn) {
		MmbPstn = mmbPstn;
	}
}
