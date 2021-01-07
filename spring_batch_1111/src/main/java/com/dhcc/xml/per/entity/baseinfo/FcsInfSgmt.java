package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: FcsInfSgmt<br/>
 * Description:���˻�����Ϣ��¼-�����ſ���Ԫ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "Sex", "DOB", "Nation", "HouseAdd", "HhDist",
		"CellPhone", "Email", "FcsInfoUpDate" },namespace = "com.dhcc.xml.per.entity.baseinfo")
public class FcsInfSgmt{
	/** �Ա�[1..1] */
	private String Sex;
	/** ��������[1..1] */
	private String DOB;
	/** ����[1..1] */
	private String Nation;
	/** ������ַ[1..1] */
	private String HouseAdd;
	/** �������ڵ���������[1..1] */
	private String HhDist;
	/** �ֻ�����[1..1] */
	private String CellPhone;
	/** ��������[1..1] */
	private String Email;
	/** ��Ϣ��������[1..1] */
	private String FcsInfoUpDate;

	public FcsInfSgmt() {
	}

	/**
	 * ��ȡ sex
	 * 
	 * @return the sex �Ա�[1..1]
	 */
	public String getSex() {
		return Sex;
	}

	/**
	 * ���� sex
	 * 
	 * @param sex
	 *            �Ա�[1..1]
	 */
	public void setSex(String sex) {
		Sex = sex;
	}

	/**
	 * ��ȡ dOB
	 * 
	 * @return the dOB ��������[1..1]
	 */
	public String getDOB() {
		return DOB;
	}

	/**
	 * ���� dOB
	 * 
	 * @param dOB
	 *            ��������[1..1]
	 */
	public void setDOB(String dOB) {
		DOB = dOB;
	}

	/**
	 * ��ȡ nation
	 * 
	 * @return the nation ����[1..1]
	 */
	public String getNation() {
		return Nation;
	}

	/**
	 * ���� nation
	 * 
	 * @param nation
	 *            ����[1..1]
	 */
	public void setNation(String nation) {
		Nation = nation;
	}

	/**
	 * ��ȡ houseAdd
	 * 
	 * @return the houseAdd ������ַ[1..1]
	 */
	public String getHouseAdd() {
		return HouseAdd;
	}

	/**
	 * ���� houseAdd
	 * 
	 * @param houseAdd
	 *            ������ַ[1..1]
	 */
	public void setHouseAdd(String houseAdd) {
		HouseAdd = houseAdd;
	}

	/**
	 * ��ȡ hhDist
	 * 
	 * @return the hhDist �������ڵ���������[1..1]
	 */
	public String getHhDist() {
		return HhDist;
	}

	/**
	 * ���� hhDist
	 * 
	 * @param hhDist
	 *            �������ڵ���������[1..1]
	 */
	public void setHhDist(String hhDist) {
		HhDist = hhDist;
	}

	/**
	 * ��ȡ cellPhone
	 * 
	 * @return the cellPhone �ֻ�����[1..1]
	 */
	public String getCellPhone() {
		return CellPhone;
	}

	/**
	 * ���� cellPhone
	 * 
	 * @param cellPhone
	 *            �ֻ�����[1..1]
	 */
	public void setCellPhone(String cellPhone) {
		CellPhone = cellPhone;
	}

	/**
	 * ��ȡ email
	 * 
	 * @return the email ��������[1..1]
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * ���� email
	 * 
	 * @param email
	 *            ��������[1..1]
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * ��ȡ fcsInfoUpDate
	 * 
	 * @return the fcsInfoUpDate ��Ϣ��������[1..1]
	 */
	public String getFcsInfoUpDate() {
		return FcsInfoUpDate;
	}

	/**
	 * ���� fcsInfoUpDate
	 * 
	 * @param fcsInfoUpDate
	 *            ��Ϣ��������[1..1]
	 */
	public void setFcsInfoUpDate(String fcsInfoUpDate) {
		FcsInfoUpDate = fcsInfoUpDate;
	}

	@Override
	public String toString() {
		return "FcsInfSgmt [Sex=" + Sex + ", DOB=" + DOB + ", Nation=" + Nation
				+ ", HouseAdd=" + HouseAdd + ", HhDist=" + HhDist
				+ ", CellPhone=" + CellPhone + ", Email=" + Email
				+ ", FcsInfoUpDate=" + FcsInfoUpDate + "]";
	}
}
