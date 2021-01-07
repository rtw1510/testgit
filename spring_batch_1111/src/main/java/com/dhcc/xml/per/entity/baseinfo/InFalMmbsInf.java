package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: InFalMmbsInf<br/>
 * Description: ????????????-120 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018??3??27??
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "InfRecType", "Name", "IDType", "IDNum", "FamMemName",
		"FamMemCertType", "FamMemCertNum", "FamRel", "FamRelaAssFlag",
		"InfSurcCode", "RptDate" },namespace = "com.dhcc.xml.per.entity.baseinfo")
public class InFalMmbsInf {
	/** ?????????? [1..1] */
	private String InfRecType;
	/** A ???? [1..1] */
	private String Name;
	/** A ??????? [1..1] */
	private String IDType;
	/** A ??????? [1..1] */
	private String IDNum;
	/** B ???? [1..1] */
	private String FamMemName;
	/** B ??????? [1..1] */
	private String FamMemCertType;
	/** B ??????? [1..1] */
	private String FamMemCertNum;
	/** ?????? [1..1] */
	private String FamRel;
	/** ????????งน??? [1..1] */
	private String FamRelaAssFlag;
	/** ?????????? [1..1] */
	private String InfSurcCode;
	/** ??????????? [1..1] */
	private String RptDate;

	public InFalMmbsInf() {
		super();
	}

	/**
	 * ??? infRecType
	 * 
	 * @return the infRecType ?????????? [1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * ???? infRecType
	 * 
	 * @param infRecType
	 *            ?????????? [1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * ??? name
	 * 
	 * @return the name A ???? [1..1]
	 */
	public String getName() {
		return Name;
	}

	/**
	 * ???? name
	 * 
	 * @param name
	 *            A ???? [1..1]
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * ??? iDType
	 * 
	 * @return the iDType A ??????? [1..1]
	 */
	public String getIDType() {
		return IDType;
	}

	/**
	 * ???? iDType
	 * 
	 * @param iDType
	 *            A ??????? [1..1]
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}

	/**
	 * ??? iDNum
	 * 
	 * @return the iDNum A ??????? [1..1]
	 */
	public String getIDNum() {
		return IDNum;
	}

	/**
	 * ???? iDNum
	 * 
	 * @param iDNum
	 *            A ??????? [1..1]
	 */
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}

	/**
	 * ??? famMemName
	 * 
	 * @return the famMemName B ???? [1..1]
	 */
	public String getFamMemName() {
		return FamMemName;
	}

	/**
	 * ???? famMemName
	 * 
	 * @param famMemName
	 *            B ???? [1..1]
	 */
	public void setFamMemName(String famMemName) {
		FamMemName = famMemName;
	}

	/**
	 * ??? famMemCertType
	 * 
	 * @return the famMemCertType B ??????? [1..1]
	 */
	public String getFamMemCertType() {
		return FamMemCertType;
	}

	/**
	 * ???? famMemCertType
	 * 
	 * @param famMemCertType
	 *            B ??????? [1..1]
	 */
	public void setFamMemCertType(String famMemCertType) {
		FamMemCertType = famMemCertType;
	}

	/**
	 * ??? famMemCertNum
	 * 
	 * @return the famMemCertNum B ??????? [1..1]
	 */
	public String getFamMemCertNum() {
		return FamMemCertNum;
	}

	/**
	 * ???? famMemCertNum
	 * 
	 * @param famMemCertNum
	 *            B ??????? [1..1]
	 */
	public void setFamMemCertNum(String famMemCertNum) {
		FamMemCertNum = famMemCertNum;
	}

	/**
	 * ??? famRel
	 * 
	 * @return the famRel ?????? [1..1]
	 */
	public String getFamRel() {
		return FamRel;
	}

	/**
	 * ???? famRel
	 * 
	 * @param famRel
	 *            ?????? [1..1]
	 */
	public void setFamRel(String famRel) {
		FamRel = famRel;
	}

	/**
	 * ??? famRelaAssFlag
	 * 
	 * @return the famRelaAssFlag ????????งน??? [1..1]
	 */
	public String getFamRelaAssFlag() {
		return FamRelaAssFlag;
	}

	/**
	 * ???? famRelaAssFlag
	 * 
	 * @param famRelaAssFlag
	 *            ????????งน??? [1..1]
	 */
	public void setFamRelaAssFlag(String famRelaAssFlag) {
		FamRelaAssFlag = famRelaAssFlag;
	}

	/**
	 * ??? infSurcCode
	 * 
	 * @return the infSurcCode ?????????? [1..1]
	 */
	public String getInfSurcCode() {
		return InfSurcCode;
	}

	/**
	 * ???? infSurcCode
	 * 
	 * @param infSurcCode
	 *            ?????????? [1..1]
	 */
	public void setInfSurcCode(String infSurcCode) {
		InfSurcCode = infSurcCode;
	}

	/**
	 * ??? rptDate
	 * 
	 * @return the rptDate ??????????? [1..1]
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * ???? rptDate
	 * 
	 * @param rptDate
	 *            ??????????? [1..1]
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InFalMmbsInf [InfRecType=" + InfRecType + ", Name=" + Name
				+ ", IDType=" + IDType + ", IDNum=" + IDNum + ", FamMemName="
				+ FamMemName + ", FamMemCertType=" + FamMemCertType
				+ ", FamMemCertNum=" + FamMemCertNum + ", FamRel=" + FamRel
				+ ", FamRelaAssFlag=" + FamRelaAssFlag + ", InfSurcCode="
				+ InfSurcCode + ", RptDate=" + RptDate + "]";
	}
}
