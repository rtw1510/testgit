package com.dhcc.client.collt.entity;

import java.io.Serializable;

/**  
  * Title: EncodeResults<br/>  
  * Description:加压解密实体类<br/>  
  * @author ChenJingYuan  
  * @date 2019-2-19  
  */  
public class EncodeResults implements Serializable {
	private static final long serialVersionUID = 1L;
	/**解密处理的文件名称*/  
	private String sm4Filename;
	/**解密处理状态*/  
	private String sm4Status;
	/**解密处理错误原因*/  
	private String sm4ErrorMsg;
	/**解密处理后生成的压缩文件存储路径*/  
	private String sm4ZipFilePath;
	
	/**解压处理的文件名称*/  
	private String zipFilename;
	/**解压处理状态*/  
	private String zipStatus;
	/**解压处理错误原因*/  
	private String zipErrorMsg;
	/**解压处理后生成的压缩文件存储路径*/  
	private String zipTxtFilePath;
	public EncodeResults() {
		super();
	}
	/**  
	 * 获取 sm4Filename
	 * @return the sm4Filename 解密处理的文件名称 
	 */
	public String getSm4Filename() {
		return sm4Filename;
	}
	/**  
	 * 设置 sm4Filename  
	 * @param sm4Filename 解密处理的文件名称  
	 */
	public void setSm4Filename(String sm4Filename) {
		this.sm4Filename = sm4Filename;
	}
	/**  
	 * 获取 sm4Status
	 * @return the sm4Status 解密处理状态 
	 */
	public String getSm4Status() {
		return sm4Status;
	}
	/**  
	 * 设置 sm4Status  
	 * @param sm4Status 解密处理状态  
	 */
	public void setSm4Status(String sm4Status) {
		this.sm4Status = sm4Status;
	}
	/**  
	 * 获取 sm4ErrorMsg
	 * @return the sm4ErrorMsg 解密处理错误原因 
	 */
	public String getSm4ErrorMsg() {
		return sm4ErrorMsg;
	}
	/**  
	 * 设置 sm4ErrorMsg  
	 * @param sm4ErrorMsg 解密处理错误原因  
	 */
	public void setSm4ErrorMsg(String sm4ErrorMsg) {
		this.sm4ErrorMsg = sm4ErrorMsg;
	}
	/**  
	 * 获取 sm4ZipFilePath
	 * @return the sm4ZipFilePath 解密处理后生成的压缩文件存储路径 
	 */
	public String getSm4ZipFilePath() {
		return sm4ZipFilePath;
	}
	/**  
	 * 设置 sm4ZipFilePath  
	 * @param sm4ZipFilePath 解密处理后生成的压缩文件存储路径  
	 */
	public void setSm4ZipFilePath(String sm4ZipFilePath) {
		this.sm4ZipFilePath = sm4ZipFilePath;
	}
	/**  
	 * 获取 zipFilename
	 * @return the zipFilename 解压处理的文件名称 
	 */
	public String getZipFilename() {
		return zipFilename;
	}
	/**  
	 * 设置 zipFilename  
	 * @param zipFilename 解压处理的文件名称  
	 */
	public void setZipFilename(String zipFilename) {
		this.zipFilename = zipFilename;
	}
	/**  
	 * 获取 zipStatus
	 * @return the zipStatus 解压处理状态 
	 */
	public String getZipStatus() {
		return zipStatus;
	}
	/**  
	 * 设置 zipStatus  
	 * @param zipStatus 解压处理状态  
	 */
	public void setZipStatus(String zipStatus) {
		this.zipStatus = zipStatus;
	}
	/**  
	 * 获取 zipErrorMsg
	 * @return the zipErrorMsg 解压处理错误原因 
	 */
	public String getZipErrorMsg() {
		return zipErrorMsg;
	}
	/**  
	 * 设置 zipErrorMsg  
	 * @param zipErrorMsg 解压处理错误原因  
	 */
	public void setZipErrorMsg(String zipErrorMsg) {
		this.zipErrorMsg = zipErrorMsg;
	}
	/**  
	 * 获取 zipTxtFilePath
	 * @return the zipTxtFilePath 解压处理后生成的压缩文件存储路径 
	 */
	public String getZipTxtFilePath() {
		return zipTxtFilePath;
	}
	/**  
	 * 设置 zipTxtFilePath  
	 * @param zipTxtFilePath 解压处理后生成的压缩文件存储路径  
	 */
	public void setZipTxtFilePath(String zipTxtFilePath) {
		this.zipTxtFilePath = zipTxtFilePath;
	}
}
