package com.dhcc.xml.ent.entity.baseinfo.db;

/**
 * Title: EB_CustBaseOth_Info<br/>
 * Description:������ʶ��ӳ�����Ӧ�ı��ֶ� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
public class EB_CustBaseOth_Info {

	/**
	 * ��ҵ��ݱ�ʶ����[1..1]
	 */
	private String OthEntCertType;
	/**
	 * ��ҵ��ݱ�ʶ����[1..1]
	 */
	private String OthEntCertNum;

	/**
	 * ��ȡ othEntCertType
	 * 
	 * @return the othEntCertType ��ҵ��ݱ�ʶ����
	 */
	public String getOthEntCertType() {
		return OthEntCertType;
	}

	/**
	 * ���� othEntCertType
	 * 
	 * @param othEntCertType
	 *            ��ҵ��ݱ�ʶ����
	 */
	public void setOthEntCertType(String othEntCertType) {
		OthEntCertType = othEntCertType;
	}

	/**
	 * ��ȡ othEntCertNum
	 * 
	 * @return the othEntCertNum ��ҵ��ݱ�ʶ����[1..1]
	 */
	public String getOthEntCertNum() {
		return OthEntCertNum;
	}

	/**
	 * ���� othEntCertNum
	 * 
	 * @param othEntCertNum
	 *            ��ҵ��ݱ�ʶ����[1..1]
	 */
	public void setOthEntCertNum(String othEntCertNum) {
		OthEntCertNum = othEntCertNum;
	}
}
