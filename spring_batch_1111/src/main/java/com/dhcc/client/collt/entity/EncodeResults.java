package com.dhcc.client.collt.entity;

import java.io.Serializable;

/**  
  * Title: EncodeResults<br/>  
  * Description:��ѹ����ʵ����<br/>  
  * @author ChenJingYuan  
  * @date 2019-2-19  
  */  
public class EncodeResults implements Serializable {
	private static final long serialVersionUID = 1L;
	/**���ܴ�����ļ�����*/  
	private String sm4Filename;
	/**���ܴ���״̬*/  
	private String sm4Status;
	/**���ܴ������ԭ��*/  
	private String sm4ErrorMsg;
	/**���ܴ�������ɵ�ѹ���ļ��洢·��*/  
	private String sm4ZipFilePath;
	
	/**��ѹ������ļ�����*/  
	private String zipFilename;
	/**��ѹ����״̬*/  
	private String zipStatus;
	/**��ѹ�������ԭ��*/  
	private String zipErrorMsg;
	/**��ѹ��������ɵ�ѹ���ļ��洢·��*/  
	private String zipTxtFilePath;
	public EncodeResults() {
		super();
	}
	/**  
	 * ��ȡ sm4Filename
	 * @return the sm4Filename ���ܴ�����ļ����� 
	 */
	public String getSm4Filename() {
		return sm4Filename;
	}
	/**  
	 * ���� sm4Filename  
	 * @param sm4Filename ���ܴ�����ļ�����  
	 */
	public void setSm4Filename(String sm4Filename) {
		this.sm4Filename = sm4Filename;
	}
	/**  
	 * ��ȡ sm4Status
	 * @return the sm4Status ���ܴ���״̬ 
	 */
	public String getSm4Status() {
		return sm4Status;
	}
	/**  
	 * ���� sm4Status  
	 * @param sm4Status ���ܴ���״̬  
	 */
	public void setSm4Status(String sm4Status) {
		this.sm4Status = sm4Status;
	}
	/**  
	 * ��ȡ sm4ErrorMsg
	 * @return the sm4ErrorMsg ���ܴ������ԭ�� 
	 */
	public String getSm4ErrorMsg() {
		return sm4ErrorMsg;
	}
	/**  
	 * ���� sm4ErrorMsg  
	 * @param sm4ErrorMsg ���ܴ������ԭ��  
	 */
	public void setSm4ErrorMsg(String sm4ErrorMsg) {
		this.sm4ErrorMsg = sm4ErrorMsg;
	}
	/**  
	 * ��ȡ sm4ZipFilePath
	 * @return the sm4ZipFilePath ���ܴ�������ɵ�ѹ���ļ��洢·�� 
	 */
	public String getSm4ZipFilePath() {
		return sm4ZipFilePath;
	}
	/**  
	 * ���� sm4ZipFilePath  
	 * @param sm4ZipFilePath ���ܴ�������ɵ�ѹ���ļ��洢·��  
	 */
	public void setSm4ZipFilePath(String sm4ZipFilePath) {
		this.sm4ZipFilePath = sm4ZipFilePath;
	}
	/**  
	 * ��ȡ zipFilename
	 * @return the zipFilename ��ѹ������ļ����� 
	 */
	public String getZipFilename() {
		return zipFilename;
	}
	/**  
	 * ���� zipFilename  
	 * @param zipFilename ��ѹ������ļ�����  
	 */
	public void setZipFilename(String zipFilename) {
		this.zipFilename = zipFilename;
	}
	/**  
	 * ��ȡ zipStatus
	 * @return the zipStatus ��ѹ����״̬ 
	 */
	public String getZipStatus() {
		return zipStatus;
	}
	/**  
	 * ���� zipStatus  
	 * @param zipStatus ��ѹ����״̬  
	 */
	public void setZipStatus(String zipStatus) {
		this.zipStatus = zipStatus;
	}
	/**  
	 * ��ȡ zipErrorMsg
	 * @return the zipErrorMsg ��ѹ�������ԭ�� 
	 */
	public String getZipErrorMsg() {
		return zipErrorMsg;
	}
	/**  
	 * ���� zipErrorMsg  
	 * @param zipErrorMsg ��ѹ�������ԭ��  
	 */
	public void setZipErrorMsg(String zipErrorMsg) {
		this.zipErrorMsg = zipErrorMsg;
	}
	/**  
	 * ��ȡ zipTxtFilePath
	 * @return the zipTxtFilePath ��ѹ��������ɵ�ѹ���ļ��洢·�� 
	 */
	public String getZipTxtFilePath() {
		return zipTxtFilePath;
	}
	/**  
	 * ���� zipTxtFilePath  
	 * @param zipTxtFilePath ��ѹ��������ɵ�ѹ���ļ��洢·��  
	 */
	public void setZipTxtFilePath(String zipTxtFilePath) {
		this.zipTxtFilePath = zipTxtFilePath;
	}
}
