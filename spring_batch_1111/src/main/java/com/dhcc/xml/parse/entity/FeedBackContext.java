package com.dhcc.xml.parse.entity;

/**
 * Title: FeedBackContent<br/>
 * Description:Spring Batch批量处理反馈报文文件每行为一个字段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-8-1
 */
public class FeedBackContext {
	/**
	 *返回报文每行的内容
	 */
	private String lineContent;

	public FeedBackContext(String lineContent) {
		this.lineContent = lineContent;
	}

	/**
	 * 获取 lineContent
	 * 
	 * @return the lineContent 返回报文每行的内容
	 */
	public String getLineContent() {
		return lineContent;
	}

	/**
	 * 设置 lineContent
	 * 
	 * @param lineContent
	 *            返回报文每行的内容
	 */
	public void setLineContent(String lineContent) {
		this.lineContent = lineContent;
	}

}
