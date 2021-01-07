package com.dhcc.xml.parse.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;

/**
 * Title: FbInf<br/>
 * Description: 反馈信息记录<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-8-1
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
public class FbInf {
	/**
	 *出错记录标识
	 */
	private String ErrRecId;
	/**
	 *反馈错误数
	 */
	private String FbErrNum;
	/**
	 *反馈错误信息
	 */
	private List<com.dhcc.xml.parse.entity.ErrInf> ErrInf;
	/**
	 *出错信息记录
	 */
	private String ErrRec;

	/**
	 * 获取 errRecId
	 * 
	 * @return the errRecId 出错记录标识
	 */
	public String getErrRecId() {
		return ErrRecId;
	}

	/**
	 * 设置 errRecId
	 * 
	 * @param errRecId
	 *            出错记录标识
	 */
	public void setErrRecId(String errRecId) {
		ErrRecId = errRecId;
	}

	/**
	 * 获取 fbErrNum
	 * 
	 * @return the fbErrNum 反馈错误数
	 */
	public String getFbErrNum() {
		return FbErrNum;
	}

	/**
	 * 设置 fbErrNum
	 * 
	 * @param fbErrNum
	 *            反馈错误数
	 */
	public void setFbErrNum(String fbErrNum) {
		FbErrNum = fbErrNum;
	}

	/**
	 * 获取 errInf
	 * 
	 * @return the errInf 反馈错误信息
	 */
	public List<com.dhcc.xml.parse.entity.ErrInf> getErrInf() {
		return ErrInf;
	}

	/**
	 * 设置 errInf
	 * 
	 * @param errInf
	 *            反馈错误信息
	 */
	public void setErrInf(List<com.dhcc.xml.parse.entity.ErrInf> errInf) {
		ErrInf = errInf;
	}

	/**
	 * 获取 errRec
	 * 
	 * @return the errRec 出错信息记录
	 */
	public String getErrRec() {
		return ErrRec;
	}

	/**
	 * 设置 errRec
	 * 
	 * @param errRec
	 *            出错信息记录
	 */
	public void setErrRec(String errRec) {
		ErrRec = errRec;
	}

	@Override
	public String toString() {
		return "FbInf [ErrInf=" + ErrInf + ", ErrRec=" + ErrRec + ", ErrRecId="
				+ ErrRecId + ", FbErrNum=" + FbErrNum + "]";
	}
}
