package com.dhcc.xml.parse.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Title: ErrInf<br/>
 * Description:反馈错误信息 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-8-1
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ErrInf {
	/**
	 *错误反馈代码
	 */
	private String FbCode;
	/**
	 *出错位置
	 */
	private String FbMsg;

	/**
	 * 获取 fbCode
	 * 
	 * @return the fbCode 错误反馈代码
	 */
	public String getFbCode() {
		return FbCode;
	}

	/**
	 * 设置 fbCode
	 * 
	 * @param fbCode
	 *            错误反馈代码
	 */
	public void setFbCode(String fbCode) {
		FbCode = fbCode;
	}

	/**
	 * 获取 fbMsg
	 * 
	 * @return the fbMsg 出错位置
	 */
	public String getFbMsg() {
		return FbMsg;
	}

	/**
	 * 设置 fbMsg
	 * 
	 * @param fbMsg
	 *            出错位置
	 */
	public void setFbMsg(String fbMsg) {
		FbMsg = fbMsg;
	}

	@Override
	public String toString() {
		return "ErrInf [FbCode=" + FbCode + ", FbMsg=" + FbMsg + "]";
	}
}
