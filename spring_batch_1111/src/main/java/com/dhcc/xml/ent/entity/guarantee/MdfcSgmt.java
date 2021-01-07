package com.dhcc.xml.ent.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: MdfcSgmt<br/>
 * Description:
 * (1)企业担保账户待更正段，任选基础段、账户基本信息段、在保责任信息段、相关还款责任人信息段、抵质押品信息段，其中一段内容填入即可。
 * 
 * @author ChenJingYuan
 * @date 2018年1月26日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "GuarAcctBsSgmt", "GuarAcctBsInfSgmt",
		"GuarRltRepymtInfSgmt", "RltRepymtInfSgmt",
		"GuarMotgaCltalCtrctInfSgmt","GuarAcctCredSgmt"},namespace = "com.dhcc.xml.ent.entity.guarantee")
public class MdfcSgmt {

	/**
	 *企业担保账户记录基础段
	 */
	private GuarAcctBsSgmt GuarAcctBsSgmt;
	/**
	 *企业担保账户记录账户基本信息段
	 */
	private GuarAcctBsInfSgmt GuarAcctBsInfSgmt;
	/**
	 *企业担保账户记录在保责任信息段
	 */
	private GuarRltRepymtInfSgmt GuarRltRepymtInfSgmt;
	/**
	 *企业担保账户记录相关还款责任人信息段
	 */
	private com.dhcc.xml.ent.entity.guarantee.RltRepymtInfSgmt RltRepymtInfSgmt;
	/**
	 *企业担保账户记录抵质押物信息段
	 */
	private GuarMotgaCltalCtrctInfSgmt GuarMotgaCltalCtrctInfSgmt;
	/**企业担保账户记录授信额度信息段*/  
	private GuarAcctCredSgmt GuarAcctCredSgmt;

	public MdfcSgmt() {
		super();
	}

	/**
	 * 获取 guarAcctBsSgmt
	 * 
	 * @return the guarAcctBsSgmt 企业担保账户记录基础段
	 */
	public GuarAcctBsSgmt getGuarAcctBsSgmt() {
		return GuarAcctBsSgmt;
	}

	/**
	 * 设置 guarAcctBsSgmt
	 * 
	 * @param guarAcctBsSgmt
	 *            企业担保账户记录基础段
	 */
	public void setGuarAcctBsSgmt(GuarAcctBsSgmt guarAcctBsSgmt) {
		GuarAcctBsSgmt = guarAcctBsSgmt;
	}

	/**
	 * 获取 guarAcctBsInfSgmt
	 * 
	 * @return the guarAcctBsInfSgmt 企业担保账户记录账户基本信息段
	 */
	public GuarAcctBsInfSgmt getGuarAcctBsInfSgmt() {
		return GuarAcctBsInfSgmt;
	}

	/**
	 * 设置 guarAcctBsInfSgmt
	 * 
	 * @param guarAcctBsInfSgmt
	 *            企业担保账户记录账户基本信息段
	 */
	public void setGuarAcctBsInfSgmt(GuarAcctBsInfSgmt guarAcctBsInfSgmt) {
		GuarAcctBsInfSgmt = guarAcctBsInfSgmt;
	}

	/**
	 * 获取 guarRltRepymtInfSgmt
	 * 
	 * @return the guarRltRepymtInfSgmt 企业担保账户记录在保责任信息段
	 */
	public GuarRltRepymtInfSgmt getGuarRltRepymtInfSgmt() {
		return GuarRltRepymtInfSgmt;
	}

	/**
	 * 设置 guarRltRepymtInfSgmt
	 * 
	 * @param guarRltRepymtInfSgmt
	 *            企业担保账户记录在保责任信息段
	 */
	public void setGuarRltRepymtInfSgmt(
			GuarRltRepymtInfSgmt guarRltRepymtInfSgmt) {
		GuarRltRepymtInfSgmt = guarRltRepymtInfSgmt;
	}

	/**
	 * 获取 rltRepymtInfSgmt
	 * 
	 * @return the rltRepymtInfSgmt 企业担保账户记录相关还款责任人信息段
	 */
	public com.dhcc.xml.ent.entity.guarantee.RltRepymtInfSgmt getRltRepymtInfSgmt() {
		return RltRepymtInfSgmt;
	}

	/**
	 * 设置 rltRepymtInfSgmt
	 * 
	 * @param rltRepymtInfSgmt
	 *            企业担保账户记录相关还款责任人信息段
	 */
	public void setRltRepymtInfSgmt(com.dhcc.xml.ent.entity.guarantee.RltRepymtInfSgmt rltRepymtInfSgmt) {
		RltRepymtInfSgmt = rltRepymtInfSgmt;
	}

	/**
	 * 获取 guarMotgaCltalCtrctInfSgmt
	 * 
	 * @return the guarMotgaCltalCtrctInfSgmt 企业担保账户记录抵质押物信息段
	 */
	public GuarMotgaCltalCtrctInfSgmt getGuarMotgaCltalCtrctInfSgmt() {
		return GuarMotgaCltalCtrctInfSgmt;
	}

	/**
	 * 设置 guarMotgaCltalCtrctInfSgmt
	 * 
	 * @param guarMotgaCltalCtrctInfSgmt
	 *            企业担保账户记录抵质押物信息段
	 */
	public void setGuarMotgaCltalCtrctInfSgmt(
			GuarMotgaCltalCtrctInfSgmt guarMotgaCltalCtrctInfSgmt) {
		GuarMotgaCltalCtrctInfSgmt = guarMotgaCltalCtrctInfSgmt;
	}

	/**  
	 * 获取 guarAcctCredSgmt
	 * @return the guarAcctCredSgmt 企业担保账户记录授信额度信息段 
	 */
	public GuarAcctCredSgmt getGuarAcctCredSgmt() {
		return GuarAcctCredSgmt;
	}

	/**  
	 * 设置 guarAcctCredSgmt  
	 * @param guarAcctCredSgmt 企业担保账户记录授信额度信息段  
	 */
	public void setGuarAcctCredSgmt(GuarAcctCredSgmt guarAcctCredSgmt) {
		GuarAcctCredSgmt = guarAcctCredSgmt;
	}
}
