package com.dhcc.xml.ent.entity.baseinfo.db;

/**
 * Title: EB_CustBaseHold_Info<br/>
 * Description: 企业基本信息注册资本及主要出资人表<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月27日
 */
public class EB_CustBaseHold_Info {
	/**
	 * 出资人类型[0..1]
	 */
	private String SharHodType;
	/**
	 * 出资人身份类别[0..1]
	 */
	private String SharHodCertType;
	/**
	 * 出资人名称[0..1]
	 */
	private String SharHodName;
	 /**
	 *出资人身份标识类型[0..1]
	 */  
	private String SharHodIDType;
	/**
	 * 出资人身份标识号码[0..1]
	 */
	private String SharHodIDNum;
	/**
	 * 出资比例[0..1]
	 */
	private String InvRatio;

	public EB_CustBaseHold_Info() {
		super();
	}

	/**  
	 * 获取 sharHodType
	 * @return the sharHodType 出资人类型[0..1] 
	 */
	public String getSharHodType() {
		return SharHodType;
	}

	/**  
	 * 设置 sharHodType  
	 * @param sharHodType 出资人类型[0..1]  
	 */
	public void setSharHodType(String sharHodType) {
		SharHodType = sharHodType;
	}

	/**  
	 * 获取 sharHodCertType
	 * @return the sharHodCertType 出资人身份类别[0..1] 
	 */
	public String getSharHodCertType() {
		return SharHodCertType;
	}

	/**  
	 * 设置 sharHodCertType  
	 * @param sharHodCertType 出资人身份类别[0..1]  
	 */
	public void setSharHodCertType(String sharHodCertType) {
		SharHodCertType = sharHodCertType;
	}

	/**  
	 * 获取 sharHodName
	 * @return the sharHodName 出资人名称[0..1] 
	 */
	public String getSharHodName() {
		return SharHodName;
	}

	/**  
	 * 设置 sharHodName  
	 * @param sharHodName 出资人名称[0..1]  
	 */
	public void setSharHodName(String sharHodName) {
		SharHodName = sharHodName;
	}

	/**  
	 * 获取 sharHodIDType
	 * @return the sharHodIDType 出资人身份标识类型[0..1] 
	 */
	public String getSharHodIDType() {
		return SharHodIDType;
	}

	/**  
	 * 设置 sharHodIDType  
	 * @param sharHodIDType 出资人身份标识类型[0..1]  
	 */
	public void setSharHodIDType(String sharHodIDType) {
		SharHodIDType = sharHodIDType;
	}

	/**  
	 * 获取 sharHodIDNum
	 * @return the sharHodIDNum 出资人身份标识号码[0..1] 
	 */
	public String getSharHodIDNum() {
		return SharHodIDNum;
	}

	/**  
	 * 设置 sharHodIDNum  
	 * @param sharHodIDNum 出资人身份标识号码[0..1]  
	 */
	public void setSharHodIDNum(String sharHodIDNum) {
		SharHodIDNum = sharHodIDNum;
	}

	/**  
	 * 获取 invRatio
	 * @return the invRatio 出资比例[0..1] 
	 */
	public String getInvRatio() {
		return InvRatio;
	}

	/**  
	 * 设置 invRatio  
	 * @param invRatio 出资比例[0..1]  
	 */
	public void setInvRatio(String invRatio) {
		InvRatio = invRatio;
	}

}
