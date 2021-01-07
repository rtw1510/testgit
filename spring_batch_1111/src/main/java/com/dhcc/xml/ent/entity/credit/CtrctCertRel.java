package com.dhcc.xml.ent.entity.credit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: CtrctCertRel<br/>
 * Description:��ҵ����Э����Ϣ��¼��ͬ��������Ϣ <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��24��
 */
@XmlAccessorType(value = XmlAccessType.FIELD) // �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "BrerType", "CertRelName", "CertRelIDType", "CertRelIDNum" },namespace = "com.dhcc.xml.ent.entity.credit")// ָ�����гɵ�xml�ڵ�˳��
public class CtrctCertRel {
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

	public CtrctCertRel() {
		super();
	}

	/**  
	 * ��ȡ brerType
	 * @return the brerType ��ͬ������������ [1..1] 
	 */
	public String getBrerType() {
		return BrerType;
	}

	/**  
	 * ���� brerType  
	 * @param brerType ��ͬ������������ [1..1]  
	 */
	public void setBrerType(String brerType) {
		BrerType = brerType;
	}

	/**  
	 * ��ȡ certRelName
	 * @return the certRelName ��ͬ���������� [1..1] 
	 */
	public String getCertRelName() {
		return CertRelName;
	}

	/**  
	 * ���� certRelName  
	 * @param certRelName ��ͬ���������� [1..1]  
	 */
	public void setCertRelName(String certRelName) {
		CertRelName = certRelName;
	}

	/**  
	 * ��ȡ certRelIDType
	 * @return the certRelIDType ��ͬ��������ݱ�ʶ���� [1..1] 
	 */
	public String getCertRelIDType() {
		return CertRelIDType;
	}

	/**  
	 * ���� certRelIDType  
	 * @param certRelIDType ��ͬ��������ݱ�ʶ���� [1..1]  
	 */
	public void setCertRelIDType(String certRelIDType) {
		CertRelIDType = certRelIDType;
	}

	/**  
	 * ��ȡ certRelIDNum
	 * @return the certRelIDNum ��ͬ��������ݱ�ʶ���� [1..1] 
	 */
	public String getCertRelIDNum() {
		return CertRelIDNum;
	}

	/**  
	 * ���� certRelIDNum  
	 * @param certRelIDNum ��ͬ��������ݱ�ʶ���� [1..1]  
	 */
	public void setCertRelIDNum(String certRelIDNum) {
		CertRelIDNum = certRelIDNum;
	}

	@Override
	public String toString() {
		return "CtrctCertRel [BrerType=" + BrerType + ", CertRelName=" + CertRelName + ", CertRelIDType="
				+ CertRelIDType + ", CertRelIDNum=" + CertRelIDNum + "]";
	}

}
