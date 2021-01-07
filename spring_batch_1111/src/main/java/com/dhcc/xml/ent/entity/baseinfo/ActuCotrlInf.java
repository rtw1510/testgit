package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: ActuCotrlInf<br/>
 * Description:实际控制人信息 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月25日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "ActuCotrlCertType", "ActuCotrlName", "ActuCotrlIDType",
		"ActuCotrlIDNum" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class ActuCotrlInf {
	/**
	 *实际控制人身份类别[1..1]
	 */
	private String ActuCotrlCertType;
	/**
	 * 实际控制人名称[1..1]
	 */
	private String ActuCotrlName;
	/**
	 * 实际控制人身份标识类型[1..1]
	 */
	private String ActuCotrlIDType;
	/**
	 * 实际控制人身份标识号码[1..1]
	 */
	private String ActuCotrlIDNum;

	public ActuCotrlInf() {
		super();
	}

	/**
	 * 获取 actuCotrlCertType
	 * 
	 * @return the actuCotrlCertType 实际控制人身份类别[1..1]
	 */
	public String getActuCotrlCertType() {
		return ActuCotrlCertType;
	}

	/**
	 * 设置 actuCotrlCertType
	 * 
	 * @param actuCotrlCertType
	 *            实际控制人身份类别[1..1]
	 */
	public void setActuCotrlCertType(String actuCotrlCertType) {
		ActuCotrlCertType = actuCotrlCertType;
	}

	/**
	 * 获取 actuCotrlName
	 * 
	 * @return the actuCotrlName 实际控制人名称[1..1]
	 */
	public String getActuCotrlName() {
		return ActuCotrlName;
	}

	/**
	 * 设置 actuCotrlName
	 * 
	 * @param actuCotrlName
	 *            实际控制人名称[1..1]
	 */
	public void setActuCotrlName(String actuCotrlName) {
		ActuCotrlName = actuCotrlName;
	}

	/**
	 * 获取 actuCotrlIDType
	 * 
	 * @return the actuCotrlIDType 实际控制人身份标识类型[1..1]
	 */
	public String getActuCotrlIDType() {
		return ActuCotrlIDType;
	}

	/**
	 * 设置 actuCotrlIDType
	 * 
	 * @param actuCotrlIDType
	 *            实际控制人身份标识类型[1..1]
	 */
	public void setActuCotrlIDType(String actuCotrlIDType) {
		ActuCotrlIDType = actuCotrlIDType;
	}

	/**
	 * 获取 actuCotrlIDNum
	 * 
	 * @return the actuCotrlIDNum 实际控制人身份标识号码[1..1]
	 */
	public String getActuCotrlIDNum() {
		return ActuCotrlIDNum;
	}

	/**
	 * 设置 actuCotrlIDNum
	 * 
	 * @param actuCotrlIDNum
	 *            实际控制人身份标识号码[1..1]
	 */
	public void setActuCotrlIDNum(String actuCotrlIDNum) {
		ActuCotrlIDNum = actuCotrlIDNum;
	}

	@Override
	public String toString() {
		return "ActuCotrlInf [ActuCotrlCertType=" + ActuCotrlCertType
				+ ", ActuCotrlIDNum=" + ActuCotrlIDNum + ", ActuCotrlIDType="
				+ ActuCotrlIDType + ", ActuCotrlName=" + ActuCotrlName + "]";
	}

}
