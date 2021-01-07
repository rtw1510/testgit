package com.dhcc.xml.ent.entity.credit.db;

/**
 * Title: Eb_CorpCtrRel_Info<br/>
 * Description:��ҵ����Э�鹲ͬ��������Ϣ�����ݱ�ӳ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-7-25
 */
public class Eb_CorpCtrRel_Info {
	/**
	 *��ͬ������������ [1..1]
	 */
	private String BrerType;
	/**
	 *��ͬ���������� [1..1]
	 */
	private String CertRelName;
	/**
	 *��ͬ��������ݱ�ʶ���� [1..1]
	 */
	private String CertRelIDType;
	/**
	 *��ͬ��������ݱ�ʶ���� [1..1]
	 */
	private String CertRelIDNum;

	public Eb_CorpCtrRel_Info() {
		super();
	}

	/**
	 * ��ȡ brerType
	 * 
	 * @return the brerType ��ͬ������������ [1..1]
	 */
	public String getBrerType() {
		return BrerType;
	}

	/**
	 * ���� brerType
	 * 
	 * @param brerType
	 *            ��ͬ������������ [1..1]
	 */
	public void setBrerType(String brerType) {
		BrerType = brerType;
	}

	/**
	 * ��ȡ certRelName
	 * 
	 * @return the certRelName ��ͬ���������� [1..1]
	 */
	public String getCertRelName() {
		return CertRelName;
	}

	/**
	 * ���� certRelName
	 * 
	 * @param certRelName
	 *            ��ͬ���������� [1..1]
	 */
	public void setCertRelName(String certRelName) {
		CertRelName = certRelName;
	}

	/**
	 * ��ȡ certRelIDType
	 * 
	 * @return the certRelIDType ��ͬ��������ݱ�ʶ���� [1..1]
	 */
	public String getCertRelIDType() {
		return CertRelIDType;
	}

	/**
	 * ���� certRelIDType
	 * 
	 * @param certRelIDType
	 *            ��ͬ��������ݱ�ʶ���� [1..1]
	 */
	public void setCertRelIDType(String certRelIDType) {
		CertRelIDType = certRelIDType;
	}

	/**
	 * ��ȡ certRelIDNum
	 * 
	 * @return the certRelIDNum ��ͬ��������ݱ�ʶ���� [1..1]
	 */
	public String getCertRelIDNum() {
		return CertRelIDNum;
	}

	/**
	 * ���� certRelIDNum
	 * 
	 * @param certRelIDNum
	 *            ��ͬ��������ݱ�ʶ���� [1..1]
	 */
	public void setCertRelIDNum(String certRelIDNum) {
		CertRelIDNum = certRelIDNum;
	}
}
