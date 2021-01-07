package com.dhcc.xml.parse.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**  
  * Title: ParseContext<br/>  
  * Description: 反馈报文加载的根节点<br/>  
  * @author ChenJingYuan  
  * @date 2018-8-1  
  */  
@XmlRootElement(name = "Document")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ParseContext {
	/**
	 *反馈信息记录
	 */  
	private FbInf FbInf;

	/**  
	 * 获取 fbInf
	 * @return the fbInf 反馈信息记录 
	 */
	public FbInf getFbInf() {
		return FbInf;
	}

	/**  
	 * 设置 fbInf  
	 * @param fbInf 反馈信息记录  
	 */
	public void setFbInf(FbInf fbInf) {
		FbInf = fbInf;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ParseContext [FbInf=" + FbInf + "]";
	}
}
