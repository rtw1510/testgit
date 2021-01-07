package com.dhcc.client.collt.entity;

import java.io.Serializable;

/**  
  * Title: CollectResults<br/>  
  * Description: <br/>  
  * @author ChenJingYuan  
  * @date 2019-2-18  
  */  
public class VerifyResults implements Serializable {
	private static final long serialVersionUID = 1L;
	/**格式化校验的文件名*/  
	private String verifyFileName;
	/**格式化校验处理状态*/  
	private String verifyStatus;
	/**格式化校验总记录数*/  
	private int verifyTotalCount;
	/**格式化校验正确记录数*/  
	private int verifyRightCount;
	/**格式化校验错误记录数*/  
	private int verifyWrongCount;
	/**格式化校验返回路径*/  
	private String verifyFeedbackFilePath;
	
	/**加压处理的文件名称*/  
	private String gzipFileName;
	/**加压处理状态*/  
	private String gzipStatus;
	/**加压处理错误原因*/  
	private String gzipErrorMsg;
	/**加压后生成的存储路径*/  
	private String gzipFilePath;
	
	/**加密处理的文件名称*/  
	private String sm4EncFlename;
	/**加密处理的状态*/  
	private String sm4EncStatus;
	/**加密处理错误原因*/  
	private String sm4EncErrorMsg;
	/**加密处理后生成的 enc 文件存储路径*/  
	private String sm4EncFilePath;
	public VerifyResults() {
		super();
	}
	/**  
	 * 获取 verifyFileName
	 * @return the verifyFileName 格式化校验的文件名 
	 */
	public String getVerifyFileName() {
		return verifyFileName;
	}
	/**  
	 * 设置 verifyFileName  
	 * @param verifyFileName 格式化校验的文件名  
	 */
	public void setVerifyFileName(String verifyFileName) {
		this.verifyFileName = verifyFileName;
	}
	/**  
	 * 获取 verifyStatus
	 * @return the verifyStatus 格式化校验处理状态 
	 */
	public String getVerifyStatus() {
		return verifyStatus;
	}
	/**  
	 * 设置 verifyStatus  
	 * @param verifyStatus 格式化校验处理状态  
	 */
	public void setVerifyStatus(String verifyStatus) {
		this.verifyStatus = verifyStatus;
	}
	/**  
	 * 获取 verifyTotalCount
	 * @return the verifyTotalCount 格式化校验总记录数 
	 */
	public int getVerifyTotalCount() {
		return verifyTotalCount;
	}
	/**  
	 * 设置 verifyTotalCount  
	 * @param verifyTotalCount 格式化校验总记录数  
	 */
	public void setVerifyTotalCount(int verifyTotalCount) {
		this.verifyTotalCount = verifyTotalCount;
	}
	/**  
	 * 获取 verifyRightCount
	 * @return the verifyRightCount 格式化校验正确记录数 
	 */
	public int getVerifyRightCount() {
		return verifyRightCount;
	}
	/**  
	 * 设置 verifyRightCount  
	 * @param verifyRightCount 格式化校验正确记录数  
	 */
	public void setVerifyRightCount(int verifyRightCount) {
		this.verifyRightCount = verifyRightCount;
	}
	/**  
	 * 获取 verifyWrongCount
	 * @return the verifyWrongCount 格式化校验错误记录数 
	 */
	public int getVerifyWrongCount() {
		return verifyWrongCount;
	}
	/**  
	 * 设置 verifyWrongCount  
	 * @param verifyWrongCount 格式化校验错误记录数  
	 */
	public void setVerifyWrongCount(int verifyWrongCount) {
		this.verifyWrongCount = verifyWrongCount;
	}
	/**  
	 * 获取 verifyFeedbackFilePath
	 * @return the verifyFeedbackFilePath 格式化校验返回路径 
	 */
	public String getVerifyFeedbackFilePath() {
		return verifyFeedbackFilePath;
	}
	/**  
	 * 设置 verifyFeedbackFilePath  
	 * @param verifyFeedbackFilePath 格式化校验返回路径  
	 */
	public void setVerifyFeedbackFilePath(String verifyFeedbackFilePath) {
		this.verifyFeedbackFilePath = verifyFeedbackFilePath;
	}
	/**  
	 * 获取 gzipFileName
	 * @return the gzipFileName 加压处理的文件名称 
	 */
	public String getGzipFileName() {
		return gzipFileName;
	}
	/**  
	 * 设置 gzipFileName  
	 * @param gzipFileName 加压处理的文件名称  
	 */
	public void setGzipFileName(String gzipFileName) {
		this.gzipFileName = gzipFileName;
	}
	/**  
	 * 获取 gzipStatus
	 * @return the gzipStatus 加压处理状态 
	 */
	public String getGzipStatus() {
		return gzipStatus;
	}
	/**  
	 * 设置 gzipStatus  
	 * @param gzipStatus 加压处理状态  
	 */
	public void setGzipStatus(String gzipStatus) {
		this.gzipStatus = gzipStatus;
	}
	/**  
	 * 获取 gzipErrorMsg
	 * @return the gzipErrorMsg 加压处理错误原因 
	 */
	public String getGzipErrorMsg() {
		return gzipErrorMsg;
	}
	/**  
	 * 设置 gzipErrorMsg  
	 * @param gzipErrorMsg 加压处理错误原因  
	 */
	public void setGzipErrorMsg(String gzipErrorMsg) {
		this.gzipErrorMsg = gzipErrorMsg;
	}
	/**  
	 * 获取 gzipFilePath
	 * @return the gzipFilePath 加压后生成的存储路径 
	 */
	public String getGzipFilePath() {
		return gzipFilePath;
	}
	/**  
	 * 设置 gzipFilePath  
	 * @param gzipFilePath 加压后生成的存储路径  
	 */
	public void setGzipFilePath(String gzipFilePath) {
		this.gzipFilePath = gzipFilePath;
	}
	/**  
	 * 获取 sm4EncFlename
	 * @return the sm4EncFlename 加密处理的文件名称 
	 */
	public String getSm4EncFlename() {
		return sm4EncFlename;
	}
	/**  
	 * 设置 sm4EncFlename  
	 * @param sm4EncFlename 加密处理的文件名称  
	 */
	public void setSm4EncFlename(String sm4EncFlename) {
		this.sm4EncFlename = sm4EncFlename;
	}
	/**  
	 * 获取 sm4EncStatus
	 * @return the sm4EncStatus 加密处理的状态 
	 */
	public String getSm4EncStatus() {
		return sm4EncStatus;
	}
	/**  
	 * 设置 sm4EncStatus  
	 * @param sm4EncStatus 加密处理的状态  
	 */
	public void setSm4EncStatus(String sm4EncStatus) {
		this.sm4EncStatus = sm4EncStatus;
	}
	/**  
	 * 获取 sm4EncErrorMsg
	 * @return the sm4EncErrorMsg 加密处理错误原因 
	 */
	public String getSm4EncErrorMsg() {
		return sm4EncErrorMsg;
	}
	/**  
	 * 设置 sm4EncErrorMsg  
	 * @param sm4EncErrorMsg 加密处理错误原因  
	 */
	public void setSm4EncErrorMsg(String sm4EncErrorMsg) {
		this.sm4EncErrorMsg = sm4EncErrorMsg;
	}
	/**  
	 * 获取 sm4EncFilePath
	 * @return the sm4EncFilePath 加密处理后生成的 enc 文件存储路径 
	 */
	public String getSm4EncFilePath() {
		return sm4EncFilePath;
	}
	/**  
	 * 设置 sm4EncFilePath  
	 * @param sm4EncFilePath 加密处理后生成的 enc 文件存储路径  
	 */
	public void setSm4EncFilePath(String sm4EncFilePath) {
		this.sm4EncFilePath = sm4EncFilePath;
	}
}
