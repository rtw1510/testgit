package com.dhcc.xml.ent.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnBaseInfo<br/>
 * Description:����������ҵ������Ϣ��������� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��25��
 */
@XmlRootElement(name = "Document")
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "EnBasInf", "EnCtfItgInf", "EnIcdnRltpInf", "EnBsInfDlt" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
// ָ�����гɵ�xml�ڵ�˳��
public class EnBaseInfo {
	/**
	 *��ҵ������Ϣ��¼[1..1]
	 */
	private EnBasInf EnBasInf;
	/**
	 *��ҵ��ݱ�ʶ������Ϣ��¼[1..1]
	 */
	private EnCtfItgInf EnCtfItgInf;
	/**
	 *��ҵ�������ϵ��Ϣ��¼[1..1]
	 */
	private com.dhcc.xml.ent.entity.baseinfo.EnIcdnRltpInf EnIcdnRltpInf;
	/**
	 *��ҵ������Ϣɾ�������¼[1..1]
	 */
	private com.dhcc.xml.ent.entity.baseinfo.EnBsInfDlt EnBsInfDlt;

	public EnBaseInfo() {
		super();
	}

	/**  
	 * ��ȡ enBasInf
	 * @return the enBasInf ��ҵ������Ϣ��¼[1..1] 
	 */
	public EnBasInf getEnBasInf() {
		return EnBasInf;
	}

	/**  
	 * ���� enBasInf  
	 * @param enBasInf ��ҵ������Ϣ��¼[1..1]  
	 */
	public void setEnBasInf(EnBasInf enBasInf) {
		EnBasInf = enBasInf;
	}



	/**
	 * ��ȡ enCtfItgInf
	 * 
	 * @return the enCtfItgInf ��ҵ��ݱ�ʶ������Ϣ��¼[1..1]
	 */
	public EnCtfItgInf getEnCtfItgInf() {
		return EnCtfItgInf;
	}

	/**
	 * ���� enCtfItgInf
	 * 
	 * @param enCtfItgInf
	 *            ��ҵ��ݱ�ʶ������Ϣ��¼[1..1]
	 */
	public void setEnCtfItgInf(EnCtfItgInf enCtfItgInf) {
		EnCtfItgInf = enCtfItgInf;
	}

	/**
	 * ��ȡ enIcdnRltpInf
	 * 
	 * @return the enIcdnRltpInf ��ҵ�������ϵ��Ϣ��¼[1..1]
	 */
	public com.dhcc.xml.ent.entity.baseinfo.EnIcdnRltpInf getEnIcdnRltpInf() {
		return EnIcdnRltpInf;
	}

	/**
	 * ���� enIcdnRltpInf
	 * 
	 * @param enIcdnRltpInf
	 *            ��ҵ�������ϵ��Ϣ��¼[1..1]
	 */
	public void setEnIcdnRltpInf(com.dhcc.xml.ent.entity.baseinfo.EnIcdnRltpInf enIcdnRltpInf) {
		EnIcdnRltpInf = enIcdnRltpInf;
	}

	/**
	 * ��ȡ enBsInfDlt
	 * 
	 * @return the enBsInfDlt ��ҵ������Ϣɾ�������¼[1..1]
	 */
	public com.dhcc.xml.ent.entity.baseinfo.EnBsInfDlt getEnBsInfDlt() {
		return EnBsInfDlt;
	}

	/**
	 * ���� enBsInfDlt
	 * 
	 * @param enBsInfDlt
	 *            ��ҵ������Ϣɾ�������¼[1..1]
	 */
	public void setEnBsInfDlt(com.dhcc.xml.ent.entity.baseinfo.EnBsInfDlt enBsInfDlt) {
		EnBsInfDlt = enBsInfDlt;
	}

}
