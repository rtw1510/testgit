package com.dhcc.xml.per.entity.guarantee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: GuarAcctBsInfSgmt<br/>
 * Description: ���˵����˻���¼�˻�������Ϣ��<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��28��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// �������͸�Ϊ�ֶ�
@XmlType(propOrder = { "BusiLines", "BusiDtilLines", "OpenDate",
		"AcctCredLine", "Cy", "DueDate", "GuarMode", "OthRepyGuarWay",
		"SecDep", "CtrctTxtCd" },namespace = "com.dhcc.xml.per.entity.guarantee")
// ָ�����гɵ�xml�ڵ�˳��
public class GuarAcctBsInfSgmt {
	/** ����ҵ�����[1..1] */
	private String BusiLines;
	/** ����ҵ������ϸ��[1..1] */
	private String BusiDtilLines;
	/** ��������[1..1] */
	private String OpenDate;
	/** ���ö��[1..1] */
	private String AcctCredLine;
	/** ����[1..1] */
	private String Cy;
	/** ��������[1..1] */
	private String DueDate;
	/** ��������ʽ[1..1] */
	private String GuarMode;
	/** �������֤��ʽ[1..1] */
	private String OthRepyGuarWay;
	/** ��֤��ٷֱ�[1..1] */
	private String SecDep;
	/** ������ͬ�ı����[1..1] */
	private String CtrctTxtCd;
	public GuarAcctBsInfSgmt() {
		super();
	}
	/**  
	 * ��ȡ busiLines
	 * @return the busiLines ����ҵ�����[1..1] 
	 */
	public String getBusiLines() {
		return BusiLines;
	}
	/**  
	 * ���� busiLines  
	 * @param busiLines ����ҵ�����[1..1]  
	 */
	public void setBusiLines(String busiLines) {
		BusiLines = busiLines;
	}
	/**  
	 * ��ȡ busiDtilLines
	 * @return the busiDtilLines ����ҵ������ϸ��[1..1] 
	 */
	public String getBusiDtilLines() {
		return BusiDtilLines;
	}
	/**  
	 * ���� busiDtilLines  
	 * @param busiDtilLines ����ҵ������ϸ��[1..1]  
	 */
	public void setBusiDtilLines(String busiDtilLines) {
		BusiDtilLines = busiDtilLines;
	}
	/**  
	 * ��ȡ openDate
	 * @return the openDate ��������[1..1] 
	 */
	public String getOpenDate() {
		return OpenDate;
	}
	/**  
	 * ���� openDate  
	 * @param openDate ��������[1..1]  
	 */
	public void setOpenDate(String openDate) {
		OpenDate = openDate;
	}
	/**  
	 * ��ȡ acctCredLine
	 * @return the acctCredLine ���ö��[1..1] 
	 */
	public String getAcctCredLine() {
		return AcctCredLine;
	}
	/**  
	 * ���� acctCredLine  
	 * @param acctCredLine ���ö��[1..1]  
	 */
	public void setAcctCredLine(String acctCredLine) {
		AcctCredLine = acctCredLine;
	}
	/**  
	 * ��ȡ cy
	 * @return the cy ����[1..1] 
	 */
	public String getCy() {
		return Cy;
	}
	/**  
	 * ���� cy  
	 * @param cy ����[1..1]  
	 */
	public void setCy(String cy) {
		Cy = cy;
	}
	/**  
	 * ��ȡ dueDate
	 * @return the dueDate ��������[1..1] 
	 */
	public String getDueDate() {
		return DueDate;
	}
	/**  
	 * ���� dueDate  
	 * @param dueDate ��������[1..1]  
	 */
	public void setDueDate(String dueDate) {
		DueDate = dueDate;
	}
	/**  
	 * ��ȡ guarMode
	 * @return the guarMode ��������ʽ[1..1] 
	 */
	public String getGuarMode() {
		return GuarMode;
	}
	/**  
	 * ���� guarMode  
	 * @param guarMode ��������ʽ[1..1]  
	 */
	public void setGuarMode(String guarMode) {
		GuarMode = guarMode;
	}
	/**  
	 * ��ȡ othRepyGuarWay
	 * @return the othRepyGuarWay �������֤��ʽ[1..1] 
	 */
	public String getOthRepyGuarWay() {
		return OthRepyGuarWay;
	}
	/**  
	 * ���� othRepyGuarWay  
	 * @param othRepyGuarWay �������֤��ʽ[1..1]  
	 */
	public void setOthRepyGuarWay(String othRepyGuarWay) {
		OthRepyGuarWay = othRepyGuarWay;
	}
	/**  
	 * ��ȡ secDep
	 * @return the secDep ��֤��ٷֱ�[1..1] 
	 */
	public String getSecDep() {
		return SecDep;
	}
	/**  
	 * ���� secDep  
	 * @param secDep ��֤��ٷֱ�[1..1]  
	 */
	public void setSecDep(String secDep) {
		SecDep = secDep;
	}
	/**  
	 * ��ȡ ctrctTxtCd
	 * @return the ctrctTxtCd ������ͬ�ı����[1..1] 
	 */
	public String getCtrctTxtCd() {
		return CtrctTxtCd;
	}
	/**  
	 * ���� ctrctTxtCd  
	 * @param ctrctTxtCd ������ͬ�ı����[1..1]  
	 */
	public void setCtrctTxtCd(String ctrctTxtCd) {
		CtrctTxtCd = ctrctTxtCd;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GuarAcctBsInfSgmt [BusiLines=" + BusiLines + ", BusiDtilLines="
				+ BusiDtilLines + ", OpenDate=" + OpenDate + ", AcctCredLine="
				+ AcctCredLine + ", Cy=" + Cy + ", DueDate=" + DueDate
				+ ", GuarMode=" + GuarMode + ", OthRepyGuarWay="
				+ OthRepyGuarWay + ", SecDep=" + SecDep + ", CtrctTxtCd="
				+ CtrctTxtCd + "]";
	}
}
