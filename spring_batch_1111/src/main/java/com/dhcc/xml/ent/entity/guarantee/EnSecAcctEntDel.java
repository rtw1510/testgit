package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnSecAcctEntDel<br/>
 * Description:��ҵ�����˻�����ɾ�������¼ <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "InfRecType", "DelRecCode" },namespace = "com.dhcc.xml.ent.entity.guarantee")
// ָ�����гɵ�xml�ڵ�˳��
public class EnSecAcctEntDel {
	/**
	 *��Ϣ��¼���� [1..1]
	 */
	private String InfRecType;
	/**
	 *��ɾ��ҵ���ʶ [1..1]
	 */
	private String DelRecCode;

	public EnSecAcctEntDel() {
		super();
	}

	/**
	 * ��ȡ infRecType
	 * 
	 * @return the infRecType ��Ϣ��¼���� [1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * ���� infRecType
	 * 
	 * @param infRecType
	 *            ��Ϣ��¼���� [1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * ��ȡ delRecCode
	 * 
	 * @return the delRecCode ��ɾ��ҵ���ʶ [1..1]
	 */
	public String getDelRecCode() {
		return DelRecCode;
	}

	/**
	 * ���� delRecCode
	 * 
	 * @param delRecCode
	 *            ��ɾ��ҵ���ʶ [1..1]
	 */
	public void setDelRecCode(String delRecCode) {
		DelRecCode = delRecCode;
	}

	@Override
	public String toString() {
		return "EnSecAcctEntDel [InfRecType=" + InfRecType + ", DelRecCode="
				+ DelRecCode + "]";
	}

}
