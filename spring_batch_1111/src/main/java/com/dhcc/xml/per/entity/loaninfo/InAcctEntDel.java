package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InAcctEntDel<br/>
 * Description: ���˽���˻�����ɾ������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "InfRecType", "DelRecCode" },namespace = "com.dhcc.xml.per.entity.loaninfo")
// �ֶ�չʾ�Ⱥ�˳��
public class InAcctEntDel {
	/**
	 * ��Ϣ��¼���� [1..1]
	 */
	private String InfRecType;
	/**
	 * ��ɾ��ҵ���ʶ�� [1..1]
	 */
	private String DelRecCode;

	public InAcctEntDel() {
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
	 * @return the delRecCode ��ɾ��ҵ���ʶ�� [1..1]
	 */
	public String getDelRecCode() {
		return DelRecCode;
	}

	/**
	 * ���� delRecCode
	 * 
	 * @param delRecCode
	 *            ��ɾ��ҵ���ʶ�� [1..1]
	 */
	public void setDelRecCode(String delRecCode) {
		DelRecCode = delRecCode;
	}

	@Override
	public String toString() {
		return "InAcctEntDel [InfRecType=" + InfRecType + ", DelRecCode="
				+ DelRecCode + "]";
	}
}
