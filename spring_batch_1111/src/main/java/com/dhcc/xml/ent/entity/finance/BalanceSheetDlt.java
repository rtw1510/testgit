package com.dhcc.xml.ent.entity.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: BalanceSheetDlt<br/>
 * Description:��ҵ�ʲ���ծ������ɾ�������¼������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfRecType", "EntName", "EntCertType", "EntCertNum","SheetYear", "SheetType", "SheetTypeDivide" },namespace = "com.dhcc.xml.ent.entity.finance")
// ָ�����гɵ�xml�ڵ�˳��
public class BalanceSheetDlt {
	/**
	 *��Ϣ��¼����
	 */
	private String InfRecType;
	/**
	 *��ҵ����
	 */
	private String EntName;
	/**
	 *��ҵ��ݱ�ʶ����
	 */
	private String EntCertType;
	/**
	 *��ҵ��ݱ�ʶ����
	 */
	private String EntCertNum;
	/**
	 *�������
	 */
	private String SheetYear;
	/**
	 *��������
	 */
	private String SheetType;
	/**
	 *��������ϸ��
	 */
	private String SheetTypeDivide;

	public BalanceSheetDlt() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * ��ȡ infRecType
	 * 
	 * @return the infRecType ��Ϣ��¼����
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * ���� infRecType
	 * 
	 * @param infRecType
	 *            ��Ϣ��¼����
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * ��ȡ entName
	 * 
	 * @return the entName ��ҵ����
	 */
	public String getEntName() {
		return EntName;
	}

	/**
	 * ���� entName
	 * 
	 * @param entName
	 *            ��ҵ����
	 */
	public void setEntName(String entName) {
		EntName = entName;
	}

	/**
	 * ��ȡ entCertType
	 * 
	 * @return the entCertType ��ҵ��ݱ�ʶ����
	 */
	public String getEntCertType() {
		return EntCertType;
	}

	/**
	 * ���� entCertType
	 * 
	 * @param entCertType
	 *            ��ҵ��ݱ�ʶ����
	 */
	public void setEntCertType(String entCertType) {
		EntCertType = entCertType;
	}

	/**
	 * ��ȡ entCertNum
	 * 
	 * @return the entCertNum ��ҵ��ݱ�ʶ����
	 */
	public String getEntCertNum() {
		return EntCertNum;
	}

	/**
	 * ���� entCertNum
	 * 
	 * @param entCertNum
	 *            ��ҵ��ݱ�ʶ����
	 */
	public void setEntCertNum(String entCertNum) {
		EntCertNum = entCertNum;
	}

	/**
	 * ��ȡ sheetYear
	 * 
	 * @return the sheetYear �������
	 */
	public String getSheetYear() {
		return SheetYear;
	}

	/**
	 * ���� sheetYear
	 * 
	 * @param sheetYear
	 *            �������
	 */
	public void setSheetYear(String sheetYear) {
		SheetYear = sheetYear;
	}

	/**
	 * ��ȡ sheetType
	 * 
	 * @return the sheetType ��������
	 */
	public String getSheetType() {
		return SheetType;
	}

	/**
	 * ���� sheetType
	 * 
	 * @param sheetType
	 *            ��������
	 */
	public void setSheetType(String sheetType) {
		SheetType = sheetType;
	}

	/**
	 * ��ȡ sheetTypeDivide
	 * 
	 * @return the sheetTypeDivide ��������ϸ��
	 */
	public String getSheetTypeDivide() {
		return SheetTypeDivide;
	}

	/**
	 * ���� sheetTypeDivide
	 * 
	 * @param sheetTypeDivide
	 *            ��������ϸ��
	 */
	public void setSheetTypeDivide(String sheetTypeDivide) {
		SheetTypeDivide = sheetTypeDivide;
	}

	@Override
	public String toString() {
		return "BalanceSheetDlt [" + "InfRecType =" + InfRecType + "EntName ="
				+ EntName + "EntCertType =" + EntCertType + "EntCertNum ="
				+ EntCertNum + "SheetYear ="
				+ SheetYear + "SheetType =" + SheetType + "SheetTypeDivide"
				+ SheetTypeDivide + "]";
	}

}
