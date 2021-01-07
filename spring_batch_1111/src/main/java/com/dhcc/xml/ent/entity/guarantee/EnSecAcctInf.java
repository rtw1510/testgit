package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EnSecAcctInf<br/>
 * Description:企业担保账户记录 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "GuarAcctBsSgmt", "GuarAcctBsInfSgmt",
		"RltRepymtInfSgmt", "GuarMotgaCltalCtrctInfSgmt", "GuarAcctCredSgmt",
		"GuarRltRepymtInfSgmt" },namespace = "com.dhcc.xml.ent.entity.guarantee")
public class EnSecAcctInf {

	/**
	 *企业担保账户基础段[1..1]
	 */
	private GuarAcctBsSgmt GuarAcctBsSgmt;
	/**
	 *企业担保账户基本信息段[0..1]
	 */
	private GuarAcctBsInfSgmt GuarAcctBsInfSgmt;
	/**
	 *企业担保账户相关还款责任人信息段[0..1]
	 */
	private com.dhcc.xml.ent.entity.guarantee.RltRepymtInfSgmt RltRepymtInfSgmt;
	/**
	 *企业担保账户抵质押物信息段[0..1]
	 */
	private GuarMotgaCltalCtrctInfSgmt GuarMotgaCltalCtrctInfSgmt;
	/**
	 *企业担保账户授信额度信息段[0..1]
	 */
	private GuarAcctCredSgmt GuarAcctCredSgmt;
	/**
	 *企业担保账户在保责任信息段[0..1]
	 */
	private GuarRltRepymtInfSgmt GuarRltRepymtInfSgmt;

	public EnSecAcctInf() {
		super();
	}

	/**
	 * 获取 guarAcctBsSgmt
	 * 
	 * @return the guarAcctBsSgmt 企业担保账户基础段[1..1]
	 */
	public GuarAcctBsSgmt getGuarAcctBsSgmt() {
		return GuarAcctBsSgmt;
	}

	/**
	 * 设置 guarAcctBsSgmt
	 * 
	 * @param guarAcctBsSgmt
	 *            企业担保账户基础段[1..1]
	 */
	public void setGuarAcctBsSgmt(GuarAcctBsSgmt guarAcctBsSgmt) {
		GuarAcctBsSgmt = guarAcctBsSgmt;
	}

	/**
	 * 获取 guarAcctBsInfSgmt
	 * 
	 * @return the guarAcctBsInfSgmt 企业担保账户基本信息段[0..1]
	 */
	public GuarAcctBsInfSgmt getGuarAcctBsInfSgmt() {
		return GuarAcctBsInfSgmt;
	}

	/**
	 * 设置 guarAcctBsInfSgmt
	 * 
	 * @param guarAcctBsInfSgmt
	 *            企业担保账户基本信息段[0..1]
	 */
	public void setGuarAcctBsInfSgmt(GuarAcctBsInfSgmt guarAcctBsInfSgmt) {
		GuarAcctBsInfSgmt = guarAcctBsInfSgmt;
	}

	/**
	 * 获取 rltRepymtInfSgmt
	 * 
	 * @return the rltRepymtInfSgmt 企业担保账户相关还款责任人信息段[0..1]
	 */
	public com.dhcc.xml.ent.entity.guarantee.RltRepymtInfSgmt getRltRepymtInfSgmt() {
		return RltRepymtInfSgmt;
	}

	/**
	 * 设置 rltRepymtInfSgmt
	 * 
	 * @param rltRepymtInfSgmt
	 *            企业担保账户相关还款责任人信息段[0..1]
	 */
	public void setRltRepymtInfSgmt(com.dhcc.xml.ent.entity.guarantee.RltRepymtInfSgmt rltRepymtInfSgmt) {
		RltRepymtInfSgmt = rltRepymtInfSgmt;
	}

	/**
	 * 获取 guarMotgaCltalCtrctInfSgmt
	 * 
	 * @return the guarMotgaCltalCtrctInfSgmt 企业担保账户抵质押物信息段[0..1]
	 */
	public GuarMotgaCltalCtrctInfSgmt getGuarMotgaCltalCtrctInfSgmt() {
		return GuarMotgaCltalCtrctInfSgmt;
	}

	/**
	 * 设置 guarMotgaCltalCtrctInfSgmt
	 * 
	 * @param guarMotgaCltalCtrctInfSgmt
	 *            企业担保账户抵质押物信息段[0..1]
	 */
	public void setGuarMotgaCltalCtrctInfSgmt(
			GuarMotgaCltalCtrctInfSgmt guarMotgaCltalCtrctInfSgmt) {
		GuarMotgaCltalCtrctInfSgmt = guarMotgaCltalCtrctInfSgmt;
	}

	/**
	 * 获取 guarAcctCredSgmt
	 * 
	 * @return the guarAcctCredSgmt 企业担保账户授信额度信息段[0..1]
	 */
	public GuarAcctCredSgmt getGuarAcctCredSgmt() {
		return GuarAcctCredSgmt;
	}

	/**
	 * 设置 guarAcctCredSgmt
	 * 
	 * @param guarAcctCredSgmt
	 *            企业担保账户授信额度信息段[0..1]
	 */
	public void setGuarAcctCredSgmt(GuarAcctCredSgmt guarAcctCredSgmt) {
		GuarAcctCredSgmt = guarAcctCredSgmt;
	}

	/**
	 * 获取 guarRltRepymtInfSgmt
	 * 
	 * @return the guarRltRepymtInfSgmt 企业担保账户在保责任信息段[0..1]
	 */
	public GuarRltRepymtInfSgmt getGuarRltRepymtInfSgmt() {
		return GuarRltRepymtInfSgmt;
	}

	/**
	 * 设置 guarRltRepymtInfSgmt
	 * 
	 * @param guarRltRepymtInfSgmt
	 *            企业担保账户在保责任信息段[0..1]
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
