package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnGuarantee<br/>
 * Description:��ҵ����������Ϣ <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlRootElement(name = "Document")
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "EnSecAcctInf", "EnSecAcctIDCagsInf", "EnSecAcctMdfc",
		"EnSecAcctDel", "EnSecAcctEntDel"},namespace = "com.dhcc.xml.ent.entity.guarantee")
// ָ�����гɵ�xml�ڵ�˳��
public class EnGuarantee {
	/**
	 *��ҵ�����˻���Ϣ��¼[1..1]
	 */
	private com.dhcc.xml.ent.entity.guarantee.EnSecAcctInf EnSecAcctInf;
	/**
	 *��ҵ�����˻���ʶ��������¼[1..1]
	 */
	private EnSecAcctIDCagsInf EnSecAcctIDCagsInf;
	/**
	 *��ҵ�����˻����θ��������¼[1..1]
	 */
	private EnSecAcctMdfc EnSecAcctMdfc;
	/**
	 *��ҵ�����˻�����ɾ�������¼[1..1]
	 */
	private com.dhcc.xml.ent.entity.guarantee.EnSecAcctDel EnSecAcctDel;
	/**
	 *��ҵ�����˻�����ɾ�������¼[1..1]
	 */
	private com.dhcc.xml.ent.entity.guarantee.EnSecAcctEntDel EnSecAcctEntDel;

	public EnGuarantee() {
		super();
	}

	/**  
	 * ��ȡ enSecAcctInf
	 * @return the enSecAcctInf ��ҵ�����˻���Ϣ��¼[1..1] 
	 */
	public com.dhcc.xml.ent.entity.guarantee.EnSecAcctInf getEnSecAcctInf() {
		return EnSecAcctInf;
	}

	/**  
	 * ���� enSecAcctInf  
	 * @param enSecAcctInf ��ҵ�����˻���Ϣ��¼[1..1]  
	 */
	public void setEnSecAcctInf(com.dhcc.xml.ent.entity.guarantee.EnSecAcctInf enSecAcctInf) {
		EnSecAcctInf = enSecAcctInf;
	}

	/**  
	 * ��ȡ enSecAcctIDCagsInf
	 * @return the enSecAcctIDCagsInf ��ҵ�����˻���ʶ��������¼[1..1] 
	 */
	public EnSecAcctIDCagsInf getEnSecAcctIDCagsInf() {
		return EnSecAcctIDCagsInf;
	}

	/**  
	 * ���� enSecAcctIDCagsInf  
	 * @param enSecAcctIDCagsInf ��ҵ�����˻���ʶ��������¼[1..1]  
	 */
	public void setEnSecAcctIDCagsInf(EnSecAcctIDCagsInf enSecAcctIDCagsInf) {
		EnSecAcctIDCagsInf = enSecAcctIDCagsInf;
	}

	/**  
	 * ��ȡ enSecAcctMdfc
	 * @return the enSecAcctMdfc ��ҵ�����˻����θ��������¼[1..1] 
	 */
	public EnSecAcctMdfc getEnSecAcctMdfc() {
		return EnSecAcctMdfc;
	}

	/**  
	 * ���� enSecAcctMdfc  
	 * @param enSecAcctMdfc ��ҵ�����˻����θ��������¼[1..1]  
	 */
	public void setEnSecAcctMdfc(EnSecAcctMdfc enSecAcctMdfc) {
		EnSecAcctMdfc = enSecAcctMdfc;
	}

	/**  
	 * ��ȡ enSecAcctDel
	 * @return the enSecAcctDel ��ҵ�����˻�����ɾ�������¼[1..1] 
	 */
	public com.dhcc.xml.ent.entity.guarantee.EnSecAcctDel getEnSecAcctDel() {
		return EnSecAcctDel;
	}

	/**  
	 * ���� enSecAcctDel  
	 * @param enSecAcctDel ��ҵ�����˻�����ɾ�������¼[1..1]  
	 */
	public void setEnSecAcctDel(com.dhcc.xml.ent.entity.guarantee.EnSecAcctDel enSecAcctDel) {
		EnSecAcctDel = enSecAcctDel;
	}

	/**  
	 * ��ȡ enSecAcctEntDel
	 * @return the enSecAcctEntDel ��ҵ�����˻�����ɾ�������¼[1..1] 
	 */
	public com.dhcc.xml.ent.entity.guarantee.EnSecAcctEntDel getEnSecAcctEntDel() {
		return EnSecAcctEntDel;
	}

	/**  
	 * ���� enSecAcctEntDel  
	 * @param enSecAcctEntDel ��ҵ�����˻�����ɾ�������¼[1..1]  
	 */
	public void setEnSecAcctEntDel(com.dhcc.xml.ent.entity.guarantee.EnSecAcctEntDel enSecAcctEntDel) {
		EnSecAcctEntDel = enSecAcctEntDel;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EnGuarantee [EnSecAcctDel=" + EnSecAcctDel
				+ ", EnSecAcctEntDel=" + EnSecAcctEntDel
				+ ", EnSecAcctIDCagsInf=" + EnSecAcctIDCagsInf
				+ ", EnSecAcctInf=" + EnSecAcctInf + ", EnSecAcctMdfc="
				+ EnSecAcctMdfc + "]";
	}

}
