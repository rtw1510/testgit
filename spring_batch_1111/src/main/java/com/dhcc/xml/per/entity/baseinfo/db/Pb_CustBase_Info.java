package com.dhcc.xml.per.entity.baseinfo.db;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Title: Pb_CustBase_Info<br/>
 * Description:个人基本信息表 <br/>
 * 1）基础段<br/>
 * 2）基本概况段<br/>
 * 3）婚姻信息段<br/>
 * 4）教育信息段<br/>
 * 5）职业信息段<br/>
 * 6）居住地址段<br/>
 * 7）通讯地址段<br/>
 * 8）收入信息段<br/>
 * @author ChenJingYuan
 * @date 2018-7-25
 */
@XmlRootElement(name = "document")
public class Pb_CustBase_Info {
	/**
	 *主表的主键信息
	 */  
	private String Record_Id;
	/* 1、基础段 */
	/**
	 * 信息记录类型 [1..1]
	 */
	private String InfRecType;
	/**
	 * 信息来源编码 [1..1]
	 */
	private String InfSurcCode;
	/**
	 * 姓名 [1..1]
	 */
	private String Name;
	/**
	 * 证件类型 [1..1]
	 */
	private String IDType;
	/**
	 * 证件号码 [1..1]
	 */
	private String IDNum;
	/**
	 * 信息报告日期 [1..1]
	 */
	private String RptDate;
	/**
	 * 报告时点说明代码 [1..1]
	 */
	private String RptDateCode;
	/**
	 * 客户资料维护机构代码[1..1]
	 */
	private String Cimoc;
	/**
	 * 客户资料类型
	 */
	private String CustomerType;
	/* 2、 基本概况段 */
	/** 性别[1..1] */
	private String Sex;
	/** 出生日期[1..1] */
	private String DOB;
	/** 国籍[1..1] */
	private String Nation;
	/** 户籍地址[1..1] */
	private String HouseAdd;
	/** 户籍所在地行政区划[1..1] */
	private String HhDist;
	/** 手机号码[1..1] */
	private String CellPhone;
	/** 电子邮箱[1..1] */
	private String Email;
	/** 信息更新日期[1..1] */
	private String FcsInfoUpDate;
	/* 3、婚姻信息段 */
	/** 婚姻状况[1..1] */
	private String MariStatus;
	/** 配偶姓名[0..1] */
	private String SpoName;
	/** 配偶证件类型[0..1] */
	private String SpoIDType;
	/** 配偶证件号码[0..1] */
	private String SpoIDNum;
	/** 配偶联系电话[0..1] */
	private String SpoTel;
	/** 配偶工作单位[0..1] */
	private String SpsCmpyNm;
	/** 信息更新日期[1..1] */
	private String SpsInfoUpDate;

	/* 4、教育信息段 */
	/** 学历[1..1] */
	private String EduLevel;
	/** 学位[1..1] */
	private String AcaDegree;
	/** 信息更新日期[1..1] */
	private String EduInfoUpDate;
	/* 5、职业信息段 */
	/** 就业状况[1..1] */
	private String EmpStatus;
	/** 单位名称[0..1] */
	private String CpnName;
	/** 单位性质[0..1] */
	private String CpnType;
	/** 单位所属行业[0..1] */
	private String Industry;
	/** 单位详细地址[0..1] */
	private String CpnAddr;
	/** 单位所在地邮编[0..1] */
	private String CpnPc;
	/** 单位所在地行政区划[0..1] */
	private String CpnDist;
	/** 单位电话[0..1] */
	private String CpnTEL;
	/** 职业[0..1] */
	private String Occupation;
	/** 职务[0..1] */
	private String Title;
	/** 职称[0..1] */
	private String TechTitle;
	/** 本单位工作起始年份[0..1] */
	private String WorkStartDate;
	/** 信息更新日期[1..1] */
	private String OctpnInfoUpDate;
	/* 6、居住地址段 */
	/** 居住状况[1..1] */
	private String ResiStatus;
	/** 居住地详细地址[1..1] */
	private String ResiAddr;
	/** 居住地邮编[1..1] */
	private String ResiPc;
	/** 居住地行政区划[1..1] */
	private String ResiDist;
	/** 住宅电话[1..1] */
	private String HomeTel;
	/** 信息更新日期[1..1] */
	private String ResiInfoUpDate;
	/* 7、通讯地址段 */
	/** 通讯地址[1..1] */
	private String MailAddr;
	/** 通讯地邮编[1..1] */
	private String MailPc;
	/** 通讯地行政区划[1..1] */
	private String MailDist;
	/** 信息更新日期[1..1] */
	private String MlgInfoUpDate;
	/* 8、收入信息段 */
	/** 自报年收入[1..1] */
	private String AnnlInc;
	/** 纳税年收入[1..1] */
	private String TaxIncome;
	/** 信息更新日期[1..1] */
	private String IncInfoUpDate;
	/* 上报标识 */
	/** 其他标识段上报标志 */  
	private String CUSTBASEOTH_FLAG;
	/** 基本概况段上报标志 */  
	private String CUSTBASEINF_FLAG;
	/**	婚姻信息段上报标志 */  
	private String CUSTBASEMARI_FLAG;
	/**	教育信息段上报标志 */  
	private String CUSTBASEEDU_FLAG;
	/**	职业信息段上报标志 */  
	private String CUSTBASEJOB_FLAG;
	/**	居住地址段上报标志 */  
	private String CUSTBASEADD_FLAG;
	/**	通讯地址段上报标志 */  
	private String CUSTBASETEL_FLAG;
	/**	收入信息段上报标志 */  
	private String CUSTBASEMONEY_FLAG;
	/**其他信息段记录*/  
	private List<Pb_CustBaseOth_Info> Pb_CustBaseOth_Info_List;
	public Pb_CustBase_Info() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**  
	 * 获取 infRecType
	 * @return the infRecType 1、基础段   信息记录类 
	 */
	public String getInfRecType() {
		return InfRecType;
	}
	/**  
	 * 设置 infRecType  
	 * @param infRecType 1、基础段   信息记录类  
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}
	/**  
	 * 获取 infSurcCode
	 * @return the infSurcCode 信息来源编码 [1..1] 
	 */
	public String getInfSurcCode() {
		return InfSurcCode;
	}
	/**  
	 * 设置 infSurcCode  
	 * @param infSurcCode 信息来源编码 [1..1]  
	 */
	public void setInfSurcCode(String infSurcCode) {
		InfSurcCode = infSurcCode;
	}
	/**  
	 * 获取 name
	 * @return the name 姓名 [1..1] 
	 */
	public String getName() {
		return Name;
	}
	/**  
	 * 设置 name  
	 * @param name 姓名 [1..1]  
	 */
	public void setName(String name) {
		Name = name;
	}
	/**  
	 * 获取 iDType
	 * @return the iDType 证件类型 [1..1] 
	 */
	public String getIDType() {
		return IDType;
	}
	/**  
	 * 设置 iDType  
	 * @param iDType 证件类型 [1..1]  
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}
	/**  
	 * 获取 iDNum
	 * @return the iDNum 证件号码 [1..1] 
	 */
	public String getIDNum() {
		return IDNum;
	}
	/**  
	 * 设置 iDNum  
	 * @param iDNum 证件号码 [1..1]  
	 */
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}
	/**  
	 * 获取 rptDate
	 * @return the rptDate 信息报告日期 [1..1] 
	 */
	public String getRptDate() {
		return RptDate;
	}
	/**  
	 * 设置 rptDate  
	 * @param rptDate 信息报告日期 [1..1]  
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}
	/**  
	 * 获取 rptDateCode
	 * @return the rptDateCode 报告时点说明代码 [1..1] 
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}
	/**  
	 * 设置 rptDateCode  
	 * @param rptDateCode 报告时点说明代码 [1..1]  
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}
	/**  
	 * 获取 cimoc
	 * @return the cimoc 客户资料维护机构代码[1..1] 
	 */
	public String getCimoc() {
		return Cimoc;
	}
	/**  
	 * 设置 cimoc  
	 * @param cimoc 客户资料维护机构代码[1..1]  
	 */
	public void setCimoc(String cimoc) {
		Cimoc = cimoc;
	}
	/**  
	 * 获取 customerType
	 * @return the customerType 客户资料类型 
	 */
	public String getCustomerType() {
		return CustomerType;
	}
	/**  
	 * 设置 customerType  
	 * @param customerType 客户资料类型  
	 */
	public void setCustomerType(String customerType) {
		CustomerType = customerType;
	}
	/**  
	 * 获取 sex
	 * @return the sex 2、 基本概况段 
	 */
	public String getSex() {
		return Sex;
	}
	/**  
	 * 设置 sex  
	 * @param sex 2、 基本概况段  
	 */
	public void setSex(String sex) {
		Sex = sex;
	}
	/**  
	 * 获取 dOB
	 * @return the dOB 出生日期[1..1] 
	 */
	public String getDOB() {
		return DOB;
	}
	/**  
	 * 设置 dOB  
	 * @param dOB 出生日期[1..1]  
	 */
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	/**  
	 * 获取 nation
	 * @return the nation 国籍[1..1] 
	 */
	public String getNation() {
		return Nation;
	}
	/**  
	 * 设置 nation  
	 * @param nation 国籍[1..1]  
	 */
	public void setNation(String nation) {
		Nation = nation;
	}
	/**  
	 * 获取 houseAdd
	 * @return the houseAdd 户籍地址[1..1] 
	 */
	public String getHouseAdd() {
		return HouseAdd;
	}
	/**  
	 * 设置 houseAdd  
	 * @param houseAdd 户籍地址[1..1]  
	 */
	public void setHouseAdd(String houseAdd) {
		HouseAdd = houseAdd;
	}
	/**  
	 * 获取 hhDist
	 * @return the hhDist 户籍所在地行政区划[1..1] 
	 */
	public String getHhDist() {
		return HhDist;
	}
	/**  
	 * 设置 hhDist  
	 * @param hhDist 户籍所在地行政区划[1..1]  
	 */
	public void setHhDist(String hhDist) {
		HhDist = hhDist;
	}
	/**  
	 * 获取 cellPhone
	 * @return the cellPhone 手机号码[1..1] 
	 */
	public String getCellPhone() {
		return CellPhone;
	}
	/**  
	 * 设置 cellPhone  
	 * @param cellPhone 手机号码[1..1]  
	 */
	public void setCellPhone(String cellPhone) {
		CellPhone = cellPhone;
	}
	/**  
	 * 获取 email
	 * @return the email 电子邮箱[1..1] 
	 */
	public String getEmail() {
		return Email;
	}
	/**  
	 * 设置 email  
	 * @param email 电子邮箱[1..1]  
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**  
	 * 获取 fcsInfoUpDate
	 * @return the fcsInfoUpDate 信息更新日期[1..1] 
	 */
	public String getFcsInfoUpDate() {
		return FcsInfoUpDate;
	}
	/**  
	 * 设置 fcsInfoUpDate  
	 * @param fcsInfoUpDate 信息更新日期[1..1]  
	 */
	public void setFcsInfoUpDate(String fcsInfoUpDate) {
		FcsInfoUpDate = fcsInfoUpDate;
	}
	/**  
	 * 获取 mariStatus
	 * @return the mariStatus 3、婚姻信息段 
	 */
	public String getMariStatus() {
		return MariStatus;
	}
	/**  
	 * 设置 mariStatus  
	 * @param mariStatus 3、婚姻信息段  
	 */
	public void setMariStatus(String mariStatus) {
		MariStatus = mariStatus;
	}
	/**  
	 * 获取 spoName
	 * @return the spoName 配偶姓名[0..1] 
	 */
	public String getSpoName() {
		return SpoName;
	}
	/**  
	 * 设置 spoName  
	 * @param spoName 配偶姓名[0..1]  
	 */
	public void setSpoName(String spoName) {
		SpoName = spoName;
	}
	/**  
	 * 获取 spoIDType
	 * @return the spoIDType 配偶证件类型[0..1] 
	 */
	public String getSpoIDType() {
		return SpoIDType;
	}
	/**  
	 * 设置 spoIDType  
	 * @param spoIDType 配偶证件类型[0..1]  
	 */
	public void setSpoIDType(String spoIDType) {
		SpoIDType = spoIDType;
	}
	/**  
	 * 获取 spoIDNum
	 * @return the spoIDNum 配偶证件号码[0..1] 
	 */
	public String getSpoIDNum() {
		return SpoIDNum;
	}
	/**  
	 * 设置 spoIDNum  
	 * @param spoIDNum 配偶证件号码[0..1]  
	 */
	public void setSpoIDNum(String spoIDNum) {
		SpoIDNum = spoIDNum;
	}
	/**  
	 * 获取 spoTel
	 * @return the spoTel 配偶联系电话[0..1] 
	 */
	public String getSpoTel() {
		return SpoTel;
	}
	/**  
	 * 设置 spoTel  
	 * @param spoTel 配偶联系电话[0..1]  
	 */
	public void setSpoTel(String spoTel) {
		SpoTel = spoTel;
	}
	/**  
	 * 获取 spsCmpyNm
	 * @return the spsCmpyNm 配偶工作单位[0..1] 
	 */
	public String getSpsCmpyNm() {
		return SpsCmpyNm;
	}
	/**  
	 * 设置 spsCmpyNm  
	 * @param spsCmpyNm 配偶工作单位[0..1]  
	 */
	public void setSpsCmpyNm(String spsCmpyNm) {
		SpsCmpyNm = spsCmpyNm;
	}
	/**  
	 * 获取 spsInfoUpDate
	 * @return the spsInfoUpDate 信息更新日期[1..1] 
	 */
	public String getSpsInfoUpDate() {
		return SpsInfoUpDate;
	}
	/**  
	 * 设置 spsInfoUpDate  
	 * @param spsInfoUpDate 信息更新日期[1..1]  
	 */
	public void setSpsInfoUpDate(String spsInfoUpDate) {
		SpsInfoUpDate = spsInfoUpDate;
	}
	/**  
	 * 获取 eduLevel
	 * @return the eduLevel 4、教育信息段 
	 */
	public String getEduLevel() {
		return EduLevel;
	}
	/**  
	 * 设置 eduLevel  
	 * @param eduLevel 4、教育信息段  
	 */
	public void setEduLevel(String eduLevel) {
		EduLevel = eduLevel;
	}
	/**  
	 * 获取 acaDegree
	 * @return the acaDegree 学位[1..1] 
	 */
	public String getAcaDegree() {
		return AcaDegree;
	}
	/**  
	 * 设置 acaDegree  
	 * @param acaDegree 学位[1..1]  
	 */
	public void setAcaDegree(String acaDegree) {
		AcaDegree = acaDegree;
	}
	/**  
	 * 获取 eduInfoUpDate
	 * @return the eduInfoUpDate 信息更新日期[1..1] 
	 */
	public String getEduInfoUpDate() {
		return EduInfoUpDate;
	}
	/**  
	 * 设置 eduInfoUpDate  
	 * @param eduInfoUpDate 信息更新日期[1..1]  
	 */
	public void setEduInfoUpDate(String eduInfoUpDate) {
		EduInfoUpDate = eduInfoUpDate;
	}
	/**  
	 * 获取 empStatus
	 * @return the empStatus 5、职业信息段 
	 */
	public String getEmpStatus() {
		return EmpStatus;
	}
	/**  
	 * 设置 empStatus  
	 * @param empStatus 5、职业信息段  
	 */
	public void setEmpStatus(String empStatus) {
		EmpStatus = empStatus;
	}
	/**  
	 * 获取 cpnName
	 * @return the cpnName 单位名称[0..1] 
	 */
	public String getCpnName() {
		return CpnName;
	}
	/**  
	 * 设置 cpnName  
	 * @param cpnName 单位名称[0..1]  
	 */
	public void setCpnName(String cpnName) {
		CpnName = cpnName;
	}
	/**  
	 * 获取 cpnType
	 * @return the cpnType 单位性质[0..1] 
	 */
	public String getCpnType() {
		return CpnType;
	}
	/**  
	 * 设置 cpnType  
	 * @param cpnType 单位性质[0..1]  
	 */
	public void setCpnType(String cpnType) {
		CpnType = cpnType;
	}
	/**  
	 * 获取 industry
	 * @return the industry 单位所属行业[0..1] 
	 */
	public String getIndustry() {
		return Industry;
	}
	/**  
	 * 设置 industry  
	 * @param industry 单位所属行业[0..1]  
	 */
	public void setIndustry(String industry) {
		Industry = industry;
	}
	/**  
	 * 获取 cpnAddr
	 * @return the cpnAddr 单位详细地址[0..1] 
	 */
	public String getCpnAddr() {
		return CpnAddr;
	}
	/**  
	 * 设置 cpnAddr  
	 * @param cpnAddr 单位详细地址[0..1]  
	 */
	public void setCpnAddr(String cpnAddr) {
		CpnAddr = cpnAddr;
	}
	/**  
	 * 获取 cpnPc
	 * @return the cpnPc 单位所在地邮编[0..1] 
	 */
	public String getCpnPc() {
		return CpnPc;
	}
	/**  
	 * 设置 cpnPc  
	 * @param cpnPc 单位所在地邮编[0..1]  
	 */
	public void setCpnPc(String cpnPc) {
		CpnPc = cpnPc;
	}
	/**  
	 * 获取 cpnDist
	 * @return the cpnDist 单位所在地行政区划[0..1] 
	 */
	public String getCpnDist() {
		return CpnDist;
	}
	/**  
	 * 设置 cpnDist  
	 * @param cpnDist 单位所在地行政区划[0..1]  
	 */
	public void setCpnDist(String cpnDist) {
		CpnDist = cpnDist;
	}
	/**  
	 * 获取 cpnTEL
	 * @return the cpnTEL 单位电话[0..1] 
	 */
	public String getCpnTEL() {
		return CpnTEL;
	}
	/**  
	 * 设置 cpnTEL  
	 * @param cpnTEL 单位电话[0..1]  
	 */
	public void setCpnTEL(String cpnTEL) {
		CpnTEL = cpnTEL;
	}
	/**  
	 * 获取 occupation
	 * @return the occupation 职业[0..1] 
	 */
	public String getOccupation() {
		return Occupation;
	}
	/**  
	 * 设置 occupation  
	 * @param occupation 职业[0..1]  
	 */
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	/**  
	 * 获取 title
	 * @return the title 职务[0..1] 
	 */
	public String getTitle() {
		return Title;
	}
	/**  
	 * 设置 title  
	 * @param title 职务[0..1]  
	 */
	public void setTitle(String title) {
		Title = title;
	}
	/**  
	 * 获取 techTitle
	 * @return the techTitle 职称[0..1] 
	 */
	public String getTechTitle() {
		return TechTitle;
	}
	/**  
	 * 设置 techTitle  
	 * @param techTitle 职称[0..1]  
	 */
	public void setTechTitle(String techTitle) {
		TechTitle = techTitle;
	}
	/**  
	 * 获取 workStartDate
	 * @return the workStartDate 本单位工作起始年份[0..1] 
	 */
	public String getWorkStartDate() {
		return WorkStartDate;
	}
	/**  
	 * 设置 workStartDate  
	 * @param workStartDate 本单位工作起始年份[0..1]  
	 */
	public void setWorkStartDate(String workStartDate) {
		WorkStartDate = workStartDate;
	}
	/**  
	 * 获取 octpnInfoUpDate
	 * @return the octpnInfoUpDate 信息更新日期[1..1] 
	 */
	public String getOctpnInfoUpDate() {
		return OctpnInfoUpDate;
	}
	/**  
	 * 设置 octpnInfoUpDate  
	 * @param octpnInfoUpDate 信息更新日期[1..1]  
	 */
	public void setOctpnInfoUpDate(String octpnInfoUpDate) {
		OctpnInfoUpDate = octpnInfoUpDate;
	}
	/**  
	 * 获取 resiStatus
	 * @return the resiStatus 6、居住地址段 
	 */
	public String getResiStatus() {
		return ResiStatus;
	}
	/**  
	 * 设置 resiStatus  
	 * @param resiStatus 6、居住地址段  
	 */
	public void setResiStatus(String resiStatus) {
		ResiStatus = resiStatus;
	}
	/**  
	 * 获取 resiAddr
	 * @return the resiAddr 居住地详细地址[1..1] 
	 */
	public String getResiAddr() {
		return ResiAddr;
	}
	/**  
	 * 设置 resiAddr  
	 * @param resiAddr 居住地详细地址[1..1]  
	 */
	public void setResiAddr(String resiAddr) {
		ResiAddr = resiAddr;
	}
	/**  
	 * 获取 resiPc
	 * @return the resiPc 居住地邮编[1..1] 
	 */
	public String getResiPc() {
		return ResiPc;
	}
	/**  
	 * 设置 resiPc  
	 * @param resiPc 居住地邮编[1..1]  
	 */
	public void setResiPc(String resiPc) {
		ResiPc = resiPc;
	}
	/**  
	 * 获取 resiDist
	 * @return the resiDist 居住地行政区划[1..1] 
	 */
	public String getResiDist() {
		return ResiDist;
	}
	/**  
	 * 设置 resiDist  
	 * @param resiDist 居住地行政区划[1..1]  
	 */
	public void setResiDist(String resiDist) {
		ResiDist = resiDist;
	}
	/**  
	 * 获取 homeTel
	 * @return the homeTel 住宅电话[1..1] 
	 */
	public String getHomeTel() {
		return HomeTel;
	}
	/**  
	 * 设置 homeTel  
	 * @param homeTel 住宅电话[1..1]  
	 */
	public void setHomeTel(String homeTel) {
		HomeTel = homeTel;
	}
	/**  
	 * 获取 resiInfoUpDate
	 * @return the resiInfoUpDate 信息更新日期[1..1] 
	 */
	public String getResiInfoUpDate() {
		return ResiInfoUpDate;
	}
	/**  
	 * 设置 resiInfoUpDate  
	 * @param resiInfoUpDate 信息更新日期[1..1]  
	 */
	public void setResiInfoUpDate(String resiInfoUpDate) {
		ResiInfoUpDate = resiInfoUpDate;
	}
	/**  
	 * 获取 mailAddr
	 * @return the mailAddr 7、通讯地址段 
	 */
	public String getMailAddr() {
		return MailAddr;
	}
	/**  
	 * 设置 mailAddr  
	 * @param mailAddr 7、通讯地址段  
	 */
	public void setMailAddr(String mailAddr) {
		MailAddr = mailAddr;
	}
	/**  
	 * 获取 mailPc
	 * @return the mailPc 通讯地邮编[1..1] 
	 */
	public String getMailPc() {
		return MailPc;
	}
	/**  
	 * 设置 mailPc  
	 * @param mailPc 通讯地邮编[1..1]  
	 */
	public void setMailPc(String mailPc) {
		MailPc = mailPc;
	}
	/**  
	 * 获取 mailDist
	 * @return the mailDist 通讯地行政区划[1..1] 
	 */
	public String getMailDist() {
		return MailDist;
	}
	/**  
	 * 设置 mailDist  
	 * @param mailDist 通讯地行政区划[1..1]  
	 */
	public void setMailDist(String mailDist) {
		MailDist = mailDist;
	}
	/**  
	 * 获取 mlgInfoUpDate
	 * @return the mlgInfoUpDate 信息更新日期[1..1] 
	 */
	public String getMlgInfoUpDate() {
		return MlgInfoUpDate;
	}
	/**  
	 * 设置 mlgInfoUpDate  
	 * @param mlgInfoUpDate 信息更新日期[1..1]  
	 */
	public void setMlgInfoUpDate(String mlgInfoUpDate) {
		MlgInfoUpDate = mlgInfoUpDate;
	}
	/**  
	 * 获取 annlInc
	 * @return the annlInc 8、收入信息段 
	 */
	public String getAnnlInc() {
		return AnnlInc;
	}
	/**  
	 * 设置 annlInc  
	 * @param annlInc 8、收入信息段  
	 */
	public void setAnnlInc(String annlInc) {
		AnnlInc = annlInc;
	}
	/**  
	 * 获取 taxIncome
	 * @return the taxIncome 纳税年收入[1..1] 
	 */
	public String getTaxIncome() {
		return TaxIncome;
	}
	/**  
	 * 设置 taxIncome  
	 * @param taxIncome 纳税年收入[1..1]  
	 */
	public void setTaxIncome(String taxIncome) {
		TaxIncome = taxIncome;
	}
	/**  
	 * 获取 incInfoUpDate
	 * @return the incInfoUpDate 信息更新日期[1..1] 
	 */
	public String getIncInfoUpDate() {
		return IncInfoUpDate;
	}
	/**  
	 * 设置 incInfoUpDate  
	 * @param incInfoUpDate 信息更新日期[1..1]  
	 */
	public void setIncInfoUpDate(String incInfoUpDate) {
		IncInfoUpDate = incInfoUpDate;
	}
	/**  
	 * 获取 cUSTBASEOTH_FLAG
	 * @return the cUSTBASEOTH_FLAG 上报标识 
	 */
	public String getCUSTBASEOTH_FLAG() {
		return CUSTBASEOTH_FLAG;
	}
	/**  
	 * 设置 cUSTBASEOTH_FLAG  
	 * @param cUSTBASEOTH_FLAG 上报标识  
	 */
	public void setCUSTBASEOTH_FLAG(String cUSTBASEOTHFLAG) {
		CUSTBASEOTH_FLAG = cUSTBASEOTHFLAG;
	}
	/**  
	 * 获取 cUSTBASEINF_FLAG
	 * @return the cUSTBASEINF_FLAG 基本概况段上报标志 
	 */
	public String getCUSTBASEINF_FLAG() {
		return CUSTBASEINF_FLAG;
	}
	/**  
	 * 设置 cUSTBASEINF_FLAG  
	 * @param cUSTBASEINF_FLAG 基本概况段上报标志  
	 */
	public void setCUSTBASEINF_FLAG(String cUSTBASEINFFLAG) {
		CUSTBASEINF_FLAG = cUSTBASEINFFLAG;
	}
	/**  
	 * 获取 cUSTBASEMARI_FLAG
	 * @return the cUSTBASEMARI_FLAG 婚姻信息段上报标志 
	 */
	public String getCUSTBASEMARI_FLAG() {
		return CUSTBASEMARI_FLAG;
	}
	/**  
	 * 设置 cUSTBASEMARI_FLAG  
	 * @param cUSTBASEMARI_FLAG 婚姻信息段上报标志  
	 */
	public void setCUSTBASEMARI_FLAG(String cUSTBASEMARIFLAG) {
		CUSTBASEMARI_FLAG = cUSTBASEMARIFLAG;
	}
	/**  
	 * 获取 cUSTBASEEDU_FLAG
	 * @return the cUSTBASEEDU_FLAG 教育信息段上报标志 
	 */
	public String getCUSTBASEEDU_FLAG() {
		return CUSTBASEEDU_FLAG;
	}
	/**  
	 * 设置 cUSTBASEEDU_FLAG  
	 * @param cUSTBASEEDU_FLAG 教育信息段上报标志  
	 */
	public void setCUSTBASEEDU_FLAG(String cUSTBASEEDUFLAG) {
		CUSTBASEEDU_FLAG = cUSTBASEEDUFLAG;
	}
	/**  
	 * 获取 cUSTBASEJOB_FLAG
	 * @return the cUSTBASEJOB_FLAG 职业信息段上报标志 
	 */
	public String getCUSTBASEJOB_FLAG() {
		return CUSTBASEJOB_FLAG;
	}
	/**  
	 * 设置 cUSTBASEJOB_FLAG  
	 * @param cUSTBASEJOB_FLAG 职业信息段上报标志  
	 */
	public void setCUSTBASEJOB_FLAG(String cUSTBASEJOBFLAG) {
		CUSTBASEJOB_FLAG = cUSTBASEJOBFLAG;
	}
	/**  
	 * 获取 cUSTBASEADD_FLAG
	 * @return the cUSTBASEADD_FLAG 居住地址段上报标志 
	 */
	public String getCUSTBASEADD_FLAG() {
		return CUSTBASEADD_FLAG;
	}
	/**  
	 * 设置 cUSTBASEADD_FLAG  
	 * @param cUSTBASEADD_FLAG 居住地址段上报标志  
	 */
	public void setCUSTBASEADD_FLAG(String cUSTBASEADDFLAG) {
		CUSTBASEADD_FLAG = cUSTBASEADDFLAG;
	}
	/**  
	 * 获取 cUSTBASETEL_FLAG
	 * @return the cUSTBASETEL_FLAG 通讯地址段上报标志 
	 */
	public String getCUSTBASETEL_FLAG() {
		return CUSTBASETEL_FLAG;
	}
	/**  
	 * 设置 cUSTBASETEL_FLAG  
	 * @param cUSTBASETEL_FLAG 通讯地址段上报标志  
	 */
	public void setCUSTBASETEL_FLAG(String cUSTBASETELFLAG) {
		CUSTBASETEL_FLAG = cUSTBASETELFLAG;
	}
	/**  
	 * 获取 cUSTBASEMONEY_FLAG
	 * @return the cUSTBASEMONEY_FLAG 收入信息段上报标志 
	 */
	public String getCUSTBASEMONEY_FLAG() {
		return CUSTBASEMONEY_FLAG;
	}
	/**  
	 * 设置 cUSTBASEMONEY_FLAG  
	 * @param cUSTBASEMONEY_FLAG 收入信息段上报标志  
	 */
	public void setCUSTBASEMONEY_FLAG(String cUSTBASEMONEYFLAG) {
		CUSTBASEMONEY_FLAG = cUSTBASEMONEYFLAG;
	}
	/**  
	 * 获取 record_Id
	 * @return the record_Id 主表的主键信息 
	 */
	public String getRecord_Id() {
		return Record_Id;
	}
	/**  
	 * 设置 record_Id  
	 * @param record_Id 主表的主键信息  
	 */
	public void setRecord_Id(String recordId) {
		Record_Id = recordId;
	}
	public List<Pb_CustBaseOth_Info> getPb_CustBaseOth_Info_List() {
		return Pb_CustBaseOth_Info_List;
	}
	public void setPb_CustBaseOth_Info_List(
			List<Pb_CustBaseOth_Info> pb_CustBaseOth_Info_List) {
		Pb_CustBaseOth_Info_List = pb_CustBaseOth_Info_List;
	}
	/*@Override
	public String toString() {
		return "Pb_CustBase_Info{" +
				"Record_Id='" + Record_Id + '\'' +
				", InfRecType='" + InfRecType + '\'' +
				", InfSurcCode='" + InfSurcCode + '\'' +
				", Name='" + Name + '\'' +
				", IDType='" + IDType + '\'' +
				", IDNum='" + IDNum + '\'' +
				", RptDate='" + RptDate + '\'' +
				", RptDateCode='" + RptDateCode + '\'' +
				", Cimoc='" + Cimoc + '\'' +
				", CustomerType='" + CustomerType + '\'' +
				", Sex='" + Sex + '\'' +
				", DOB='" + DOB + '\'' +
				", Nation='" + Nation + '\'' +
				", HouseAdd='" + HouseAdd + '\'' +
				", HhDist='" + HhDist + '\'' +
				", CellPhone='" + CellPhone + '\'' +
				", Email='" + Email + '\'' +
				", FcsInfoUpDate='" + FcsInfoUpDate + '\'' +
				", MariStatus='" + MariStatus + '\'' +
				", SpoName='" + SpoName + '\'' +
				", SpoIDType='" + SpoIDType + '\'' +
				", SpoIDNum='" + SpoIDNum + '\'' +
				", SpoTel='" + SpoTel + '\'' +
				", SpsCmpyNm='" + SpsCmpyNm + '\'' +
				", SpsInfoUpDate='" + SpsInfoUpDate + '\'' +
				", EduLevel='" + EduLevel + '\'' +
				", AcaDegree='" + AcaDegree + '\'' +
				", EduInfoUpDate='" + EduInfoUpDate + '\'' +
				", EmpStatus='" + EmpStatus + '\'' +
				", CpnName='" + CpnName + '\'' +
				", CpnType='" + CpnType + '\'' +
				", Industry='" + Industry + '\'' +
				", CpnAddr='" + CpnAddr + '\'' +
				", CpnPc='" + CpnPc + '\'' +
				", CpnDist='" + CpnDist + '\'' +
				", CpnTEL='" + CpnTEL + '\'' +
				", Occupation='" + Occupation + '\'' +
				", Title='" + Title + '\'' +
				", TechTitle='" + TechTitle + '\'' +
				", WorkStartDate='" + WorkStartDate + '\'' +
				", OctpnInfoUpDate='" + OctpnInfoUpDate + '\'' +
				", ResiStatus='" + ResiStatus + '\'' +
				", ResiAddr='" + ResiAddr + '\'' +
				", ResiPc='" + ResiPc + '\'' +
				", ResiDist='" + ResiDist + '\'' +
				", HomeTel='" + HomeTel + '\'' +
				", ResiInfoUpDate='" + ResiInfoUpDate + '\'' +
				", MailAddr='" + MailAddr + '\'' +
				", MailPc='" + MailPc + '\'' +
				", MailDist='" + MailDist + '\'' +
				", MlgInfoUpDate='" + MlgInfoUpDate + '\'' +
				", AnnlInc='" + AnnlInc + '\'' +
				", TaxIncome='" + TaxIncome + '\'' +
				", IncInfoUpDate='" + IncInfoUpDate + '\'' +
				", CUSTBASEOTH_FLAG='" + CUSTBASEOTH_FLAG + '\'' +
				", CUSTBASEINF_FLAG='" + CUSTBASEINF_FLAG + '\'' +
				", CUSTBASEMARI_FLAG='" + CUSTBASEMARI_FLAG + '\'' +
				", CUSTBASEEDU_FLAG='" + CUSTBASEEDU_FLAG + '\'' +
				", CUSTBASEJOB_FLAG='" + CUSTBASEJOB_FLAG + '\'' +
				", CUSTBASEADD_FLAG='" + CUSTBASEADD_FLAG + '\'' +
				", CUSTBASETEL_FLAG='" + CUSTBASETEL_FLAG + '\'' +
				", CUSTBASEMONEY_FLAG='" + CUSTBASEMONEY_FLAG + '\'' +
				", Pb_CustBaseOth_Info_List=" + Pb_CustBaseOth_Info_List +
				'}';
	}*/
}
