package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MdfcSgmt<br/>
 * Description:
 * (1)��ҵ�����˻��������Σ���ѡ�����Ρ��˻�������Ϣ�Ρ��ڱ�������Ϣ�Ρ���ػ�����������Ϣ�Ρ�����ѺƷ��Ϣ�Σ�����һ���������뼴�ɡ�
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "GuarAcctBsSgmt", "GuarAcctBsInfSgmt",
		"GuarRltRepymtInfSgmt", "RltRepymtInfSgmt",
		"GuarMotgaCltalCtrctInfSgmt","GuarAcctCredSgmt"},namespace = "com.dhcc.xml.ent.entity.guarantee")
public class MdfcSgmt {

	/**
	 *��ҵ�����˻���¼������
	 */
	private GuarAcctBsSgmt GuarAcctBsSgmt;
	/**
	 *��ҵ�����˻���¼�˻�������Ϣ��
	 */
	private GuarAcctBsInfSgmt GuarAcctBsInfSgmt;
	/**
	 *��ҵ�����˻���¼�ڱ�������Ϣ��
	 */
	private GuarRltRepymtInfSgmt GuarRltRepymtInfSgmt;
	/**
	 *��ҵ�����˻���¼��ػ�����������Ϣ��
	 */
	private com.dhcc.xml.ent.entity.guarantee.RltRepymtInfSgmt RltRepymtInfSgmt;
	/**
	 *��ҵ�����˻���¼����Ѻ����Ϣ��
	 */
	private GuarMotgaCltalCtrctInfSgmt GuarMotgaCltalCtrctInfSgmt;
	/**��ҵ�����˻���¼���Ŷ����Ϣ��*/  
	private GuarAcctCredSgmt GuarAcctCredSgmt;

	public MdfcSgmt() {
		super();
	}

	/**
	 * ��ȡ guarAcctBsSgmt
	 * 
	 * @return the guarAcctBsSgmt ��ҵ�����˻���¼������
	 */
	public GuarAcctBsSgmt getGuarAcctBsSgmt() {
		return GuarAcctBsSgmt;
	}

	/**
	 * ���� guarAcctBsSgmt
	 * 
	 * @param guarAcctBsSgmt
	 *            ��ҵ�����˻���¼������
	 */
	public void setGuarAcctBsSgmt(GuarAcctBsSgmt guarAcctBsSgmt) {
		GuarAcctBsSgmt = guarAcctBsSgmt;
	}

	/**
	 * ��ȡ guarAcctBsInfSgmt
	 * 
	 * @return the guarAcctBsInfSgmt ��ҵ�����˻���¼�˻�������Ϣ��
	 */
	public GuarAcctBsInfSgmt getGuarAcctBsInfSgmt() {
		return GuarAcctBsInfSgmt;
	}

	/**
	 * ���� guarAcctBsInfSgmt
	 * 
	 * @param guarAcctBsInfSgmt
	 *            ��ҵ�����˻���¼�˻�������Ϣ��
	 */
	public void setGuarAcctBsInfSgmt(GuarAcctBsInfSgmt guarAcctBsInfSgmt) {
		GuarAcctBsInfSgmt = guarAcctBsInfSgmt;
	}

	/**
	 * ��ȡ guarRltRepymtInfSgmt
	 * 
	 * @return the guarRltRepymtInfSgmt ��ҵ�����˻���¼�ڱ�������Ϣ��
	 */
	public GuarRltRepymtInfSgmt getGuarRltRepymtInfSgmt() {
		return GuarRltRepymtInfSgmt;
	}

	/**
	 * ���� guarRltRepymtInfSgmt
	 * 
	 * @param guarRltRepymtInfSgmt
	 *            ��ҵ�����˻���¼�ڱ�������Ϣ��
	 */
	public void setGuarRltRepymtInfSgmt(
			GuarRltRepymtInfSgmt guarRltRepymtInfSgmt) {
		GuarRltRepymtInfSgmt = guarRltRepymtInfSgmt;
	}

	/**
	 * ��ȡ rltRepymtInfSgmt
	 * 
	 * @return the rltRepymtInfSgmt ��ҵ�����˻���¼��ػ�����������Ϣ��
	 */
	public com.dhcc.xml.ent.entity.guarantee.RltRepymtInfSgmt getRltRepymtInfSgmt() {
		return RltRepymtInfSgmt;
	}

	/**
	 * ���� rltRepymtInfSgmt
	 * 
	 * @param rltRepymtInfSgmt
	 *            ��ҵ�����˻���¼��ػ�����������Ϣ��
	 */
	public void setRltRepymtInfSgmt(com.dhcc.xml.ent.entity.guarantee.RltRepymtInfSgmt rltRepymtInfSgmt) {
		RltRepymtInfSgmt = rltRepymtInfSgmt;
	}

	/**
	 * ��ȡ guarMotgaCltalCtrctInfSgmt
	 * 
	 * @return the guarMotgaCltalCtrctInfSgmt ��ҵ�����˻���¼����Ѻ����Ϣ��
	 */
	public GuarMotgaCltalCtrctInfSgmt getGuarMotgaCltalCtrctInfSgmt() {
		return GuarMotgaCltalCtrctInfSgmt;
	}

	/**
	 * ���� guarMotgaCltalCtrctInfSgmt
	 * 
	 * @param guarMotgaCltalCtrctInfSgmt
	 *            ��ҵ�����˻���¼����Ѻ����Ϣ��
	 */
	public void setGuarMotgaCltalCtrctInfSgmt(
			GuarMotgaCltalCtrctInfSgmt guarMotgaCltalCtrctInfSgmt) {
		GuarMotgaCltalCtrctInfSgmt = guarMotgaCltalCtrctInfSgmt;
	}

	/**  
	 * ��ȡ guarAcctCredSgmt
	 * @return the guarAcctCredSgmt ��ҵ�����˻���¼���Ŷ����Ϣ�� 
	 */
	public GuarAcctCredSgmt getGuarAcctCredSgmt() {
		return GuarAcctCredSgmt;
	}

	/**  
	 * ���� guarAcctCredSgmt  
	 * @param guarAcctCredSgmt ��ҵ�����˻���¼���Ŷ����Ϣ��  
	 */
	public void setGuarAcctCredSgmt(GuarAcctCredSgmt guarAcctCredSgmt) {
		GuarAcctCredSgmt = guarAcctCredSgmt;
	}
}
