package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnSecAcctInf<br/>
 * Description:��ҵ�����˻���¼ <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��1��26��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "GuarAcctBsSgmt", "GuarAcctBsInfSgmt",
		"RltRepymtInfSgmt", "GuarMotgaCltalCtrctInfSgmt", "GuarAcctCredSgmt",
		"GuarRltRepymtInfSgmt" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class EnSecAcctInf {

	/**
	 *��ҵ�����˻�������[1..1]
	 */
	private GuarAcctBsSgmt GuarAcctBsSgmt;
	/**
	 *��ҵ�����˻�������Ϣ��[0..1]
	 */
	private GuarAcctBsInfSgmt GuarAcctBsInfSgmt;
	/**
	 *��ҵ�����˻���ػ�����������Ϣ��[0..1]
	 */
	private com.dhcc.xml.ent.entity.guarantee.RltRepymtInfSgmt RltRepymtInfSgmt;
	/**
	 *��ҵ�����˻�����Ѻ����Ϣ��[0..1]
	 */
	private GuarMotgaCltalCtrctInfSgmt GuarMotgaCltalCtrctInfSgmt;
	/**
	 *��ҵ�����˻����Ŷ����Ϣ��[0..1]
	 */
	private GuarAcctCredSgmt GuarAcctCredSgmt;
	/**
	 *��ҵ�����˻��ڱ�������Ϣ��[0..1]
	 */
	private GuarRltRepymtInfSgmt GuarRltRepymtInfSgmt;

	public EnSecAcctInf() {
		super();
	}

	/**
	 * ��ȡ guarAcctBsSgmt
	 * 
	 * @return the guarAcctBsSgmt ��ҵ�����˻�������[1..1]
	 */
	public GuarAcctBsSgmt getGuarAcctBsSgmt() {
		return GuarAcctBsSgmt;
	}

	/**
	 * ���� guarAcctBsSgmt
	 * 
	 * @param guarAcctBsSgmt
	 *            ��ҵ�����˻�������[1..1]
	 */
	public void setGuarAcctBsSgmt(GuarAcctBsSgmt guarAcctBsSgmt) {
		GuarAcctBsSgmt = guarAcctBsSgmt;
	}

	/**
	 * ��ȡ guarAcctBsInfSgmt
	 * 
	 * @return the guarAcctBsInfSgmt ��ҵ�����˻�������Ϣ��[0..1]
	 */
	public GuarAcctBsInfSgmt getGuarAcctBsInfSgmt() {
		return GuarAcctBsInfSgmt;
	}

	/**
	 * ���� guarAcctBsInfSgmt
	 * 
	 * @param guarAcctBsInfSgmt
	 *            ��ҵ�����˻�������Ϣ��[0..1]
	 */
	public void setGuarAcctBsInfSgmt(GuarAcctBsInfSgmt guarAcctBsInfSgmt) {
		GuarAcctBsInfSgmt = guarAcctBsInfSgmt;
	}

	/**
	 * ��ȡ rltRepymtInfSgmt
	 * 
	 * @return the rltRepymtInfSgmt ��ҵ�����˻���ػ�����������Ϣ��[0..1]
	 */
	public com.dhcc.xml.ent.entity.guarantee.RltRepymtInfSgmt getRltRepymtInfSgmt() {
		return RltRepymtInfSgmt;
	}

	/**
	 * ���� rltRepymtInfSgmt
	 * 
	 * @param rltRepymtInfSgmt
	 *            ��ҵ�����˻���ػ�����������Ϣ��[0..1]
	 */
	public void setRltRepymtInfSgmt(com.dhcc.xml.ent.entity.guarantee.RltRepymtInfSgmt rltRepymtInfSgmt) {
		RltRepymtInfSgmt = rltRepymtInfSgmt;
	}

	/**
	 * ��ȡ guarMotgaCltalCtrctInfSgmt
	 * 
	 * @return the guarMotgaCltalCtrctInfSgmt ��ҵ�����˻�����Ѻ����Ϣ��[0..1]
	 */
	public GuarMotgaCltalCtrctInfSgmt getGuarMotgaCltalCtrctInfSgmt() {
		return GuarMotgaCltalCtrctInfSgmt;
	}

	/**
	 * ���� guarMotgaCltalCtrctInfSgmt
	 * 
	 * @param guarMotgaCltalCtrctInfSgmt
	 *            ��ҵ�����˻�����Ѻ����Ϣ��[0..1]
	 */
	public void setGuarMotgaCltalCtrctInfSgmt(
			GuarMotgaCltalCtrctInfSgmt guarMotgaCltalCtrctInfSgmt) {
		GuarMotgaCltalCtrctInfSgmt = guarMotgaCltalCtrctInfSgmt;
	}

	/**
	 * ��ȡ guarAcctCredSgmt
	 * 
	 * @return the guarAcctCredSgmt ��ҵ�����˻����Ŷ����Ϣ��[0..1]
	 */
	public GuarAcctCredSgmt getGuarAcctCredSgmt() {
		return GuarAcctCredSgmt;
	}

	/**
	 * ���� guarAcctCredSgmt
	 * 
	 * @param guarAcctCredSgmt
	 *            ��ҵ�����˻����Ŷ����Ϣ��[0..1]
	 */
	public void setGuarAcctCredSgmt(GuarAcctCredSgmt guarAcctCredSgmt) {
		GuarAcctCredSgmt = guarAcctCredSgmt;
	}

	/**
	 * ��ȡ guarRltRepymtInfSgmt
	 * 
	 * @return the guarRltRepymtInfSgmt ��ҵ�����˻��ڱ�������Ϣ��[0..1]
	 */
	public GuarRltRepymtInfSgmt getGuarRltRepymtInfSgmt() {
		return GuarRltRepymtInfSgmt;
	}

	/**
	 * ���� guarRltRepymtInfSgmt
	 * 
	 * @param guarRltRepymtInfSgmt
	 *            ��ҵ�����˻��ڱ�������Ϣ��[0..1]
	 */
	public void setGuarRltRepymtInfSgmt(
			GuarRltRepymtInfSgmt guarRltRepymtInfSgmt) {
		GuarRltRepymtInfSgmt = guarRltRepymtInfSgmt;
	}

	@Override
	public String toString() {
		return "EnSecAcctInf [GuarAcctBsSgmt=" + GuarAcctBsSgmt
				+ ", GuarAcctBsInfSgmt=" + GuarAcctBsInfSgmt
				+ ", RltRepymtInfSgmt=" + RltRepymtInfSgmt
				+ ", GuarMotgaCltalCtrctInfSgmt=" + GuarMotgaCltalCtrctInfSgmt
				+ ", GuarAcctCredSgmt=" + GuarAcctCredSgmt
				+ ", GuarRltRepymtInfSgmt=" + GuarRltRepymtInfSgmt + "]";
	}

}
