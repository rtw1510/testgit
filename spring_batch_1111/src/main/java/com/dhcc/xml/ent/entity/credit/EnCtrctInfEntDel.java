package com.dhcc.xml.ent.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnCtrctInfEntDel<br/>
 * Description:企业授信协议整笔删除请求类记录 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月24日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "InfRecType", "DelRecCode" },namespace = "com.dhcc.xml.ent.entity.credit")
// 指定序列成的xml节点顺序
public class EnCtrctInfEntDel {
	/**
	 *信息记录类型 [1..1]
	 */
	private String InfRecType;
	/**
	 *待删除业务标识 [1..1]
	 */
	private String DelRecCode;

	public EnCtrctInfEntDel() {
		super();
	}

	/**
	 * 获取 infRecType
	 * 
	 * @return the infRecType 信息记录类型 [1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * 设置 infRecType
	 * 
	 * @param infRecType
	 *            信息记录类型 [1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * 获取 delRecCode
	 * 
	 * @return the delRecCode 待删除业务标识 [1..1]
	 */
	public String getDelRecCode() {
		return DelRecCode;
	}

	/**
	 * 设置 delRecCode
	 * 
	 * @param delRecCode
	 *            待删除业务标识 [1..1]
	 */
	public void setDelRecCode(String delRecCode) {
		DelRecCode = delRecCode;
	}

	@Override
	public String toString() {
		return "EnCtrctInfEntDel [InfRecType=" + InfRecType + ", DelRecCode="
				+ DelRecCode + "]";
	}

}
