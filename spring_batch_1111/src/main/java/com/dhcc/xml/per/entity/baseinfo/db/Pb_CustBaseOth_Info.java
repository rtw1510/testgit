package com.dhcc.xml.per.entity.baseinfo.db;

/**
 * Title: Pb_CustBaseOth_Info<br/>
 * Description:个人基本信息其他标识表 <br/>
 *
 * @author ChenJingYuan
 * @date 2018-8-8
 */
public class Pb_CustBaseOth_Info {
	/**
	 * 姓名 [1..1]
	 */
	private String Alias;
	/**
	 * 证件类型 [1..1]
	 */
	private String OthIDType;
	/**
	 * 证件号码 [1..1]
	 */
	private String OthIDNum;


	/**
	 * 获取 alias
	 *
	 * @return the alias 姓名 [1..1]
	 */
	public String getAlias() {
		return Alias;
	}

	/**
	 * 设置 alias
	 *
	 * @param alias
	 *            姓名 [1..1]
	 */
	public void setAlias(String alias) {
		Alias = alias;
	}

	/**
	 * 获取 othIDType
	 *
	 * @return the othIDType 证件类型 [1..1]
	 */
	public String getOthIDType() {
		return OthIDType;
	}

	/**
	 * 设置 othIDType
	 *
	 * @param othIDType
	 *            证件类型 [1..1]
	 */
	public void setOthIDType(String othIDType) {
		OthIDType = othIDType;
	}

	/**
	 * 获取 othIDNum
	 *
	 * @return the othIDNum 证件号码 [1..1]
	 */
	public String getOthIDNum() {
		return OthIDNum;
	}

	/**
	 * 设置 othIDNum
	 *
	 * @param othIDNum
	 *            证件号码 [1..1]
	 */
	public void setOthIDNum(String othIDNum) {
		OthIDNum = othIDNum;
	}

	@Override
	public String toString() {
		return "Pb_CustBaseOth_Info{" +
				"Alias='" + Alias + '\'' +
				", OthIDType='" + OthIDType + '\'' +
				", OthIDNum='" + OthIDNum + '\'' +
				'}';
	}
}
