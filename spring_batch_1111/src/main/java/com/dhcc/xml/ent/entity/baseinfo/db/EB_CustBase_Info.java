package com.dhcc.xml.ent.entity.baseinfo.db;

import java.util.List;

/**
 * Title: EB_CUSTBASE<br/>
 * Description: 数据库映射表<基本信息> 包含： 
 * 1、基础段BsSgmt 
 * 2、基本概况信息段 
 * 3、注册资本及主要出资人段 
 * 4、上级机构段
 * 5、联系方式段<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月25日
 */
public class EB_CustBase_Info {
	/**
	 *主表的主键信息
	 */  
	private String Record_Id;
	/* 1、基础段基础段 */
	/**
	 * 信息记录类型[1..1]
	 */
	private String InfRecType;
	/**
	 * 企业名称[1..1]
	 */
	private String EntName;
	/**
	 * 企业身份标识类型[1..1]
	 */
	private String EntCertType;
	/**
	 * 企业身份标识号码[1..1]
	 */
	private String EntCertNum;
	/**
	 * 信息报告日期[1..1]
	 */
	private String RptDate;
	/**
	 * 信息来源编码[1..1]
	 */
	private String InfSurcCode;
	/**
	 * 客户资料维护机构代码[1..1]
	 */
	private String Cimoc;
	/**
	 * 客户资料类型[1..1]
	 */
	private String CustomerType;
	/**
	 * 存续状态[1..1]
	 */
	private String EtpSts;
	/**
	 * 组织机构类型[1..1]
	 */
	private String RptDateCode;
	/**
	 *组织机构类型
	 */
	private String OrgType;
	

	/* 2、基本概况信息段 */
	/**
	 * 国别代码[1..1]
	 */
	private String Nationality;
	/**
	 * 登记地址[1..1]
	 */
	private String RegAdd;
	/**
	 * 登记地行政区划代码[1..1]
	 */
	private String AdmDivOfReg;
	/**
	 * 成立日期[1..1]
	 */
	private String EstablishDate;
	/**
	 * 营业许可证到期日[1..1]
	 */
	private String BizEndDate;
	/**
	 * 业务范围[1..1]
	 */
	private String BizRange;
	/**
	 * 行业分类代码[1..1]
	 */
	private String EcoIndusCate;
	/**
	 * 经济类型代码[1..1]
	 */
	private String EcoType;
	/**
	 * 企业规模[1..1]
	 */
	private String EntScale;
	/**
	 * 信息更新日期[1..1]
	 */
	private String FcsInfoUpDate;
	/* 3、注册资本及主要出资人段[0..1] */
	/**
	 * 注册资本币种[1..1]
	 */
	private String RegCapCurrency;
	/**
	 * 注册资本[1..1]
	 */
	private String RegCap;
	/* 4、上级机构段[0..1] */
	/**
	 * 上级机构类型[1..1]
	 */
	private String SupOrgType;
	/**
	 * 上级机构名称[1..1]
	 */
	private String SupOrgName;
	/**
	 * 上级机构身份标识类型[1..1]
	 */
	private String SupOrgCertType;
	/**
	 * 上级机构身份标识码[1..1]
	 */
	private String SupOrgCertNum;
	/**
	 * 信息更新日期[1..1]
	 */
	private String SupOrgInfoUpDate;
	/* 5、联系方式段 */
	/**
	 * 联系地址行政区划代码[1..1]
	 */
	private String ConAddDistrictCode;
	/**
	 * 联系地址[0..1]
	 */
	private String ConAdd;
	/**
	 * 联系电话[0..1]
	 */
	private String ConPhone;
	/**
	 * 财务部门联系电话[0..1]
	 */
	private String FinConPhone;
	/**
	 * 信息更新日期[1..1]
	 */
	private String CotaInfoUpDate;
	
	/**
	 * 客户其他表示段上报标志
	 */
	private String CustBaseoth_Flag;
	/**
	 * 客户概况信息段上报标志
	 */
	private String CustBaseinf_Flag;
	/**
	 * 客户组成人员上报标志
	 */
	private String CustBasemnm_Flag;
	/**
	 * 客户注册资本及出资人上报标志
	 */
	private String CustBasehold_Flag;
	/**
	 * 客户实际控制人段上报标志
	 */
	private String CustBasectr_Flag;
	/**
	 * 客户上级机构段上报标志
	 */
	private String CustBaseup_Flag;
	/**
	 * 客户联系方式段上报标志
	 */
	private String CustBasecont_Flag;
	
	/**其他标识段*/  
	private List<EB_CustBaseOth_Info> EB_CustBaseOth_Info_List;
	/**主要组成人员段*/  
	private List<EB_CustBaseMnm_Info> EB_CustBaseMnm_Info_List;
	/**注册资本及主要出资人段*/  
	private List<EB_CustBaseHold_Info> EB_CustBaseHold_Info_List;
	/**实际控制人段*/  
	private List<EB_CustBaseCtr_Info> EB_CustBaseCtr_Info_List;
	
	public EB_CustBase_Info() {
		super();
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
	public void setRecord_Id(String record_Id) {
		Record_Id = record_Id;
	}
	/**
	 * 获取 infRecType
	 * 
	 * @return the infRecType 1、基础段基础段 信息记
	 */
	public String getInfRecType() {
		return InfRecType;
	}
	/**
	 * 设置 infRecType
	 * 
	 * @param infRecType
	 *            1、基础段基础段 信息记
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}
	/**
	 * 获取 entName
	 * 
	 * @return the entName 企业名称[1..1]
	 */
	public String getEntName() {
		return EntName;
	}
	/**
	 * 设置 entName
	 * 
	 * @param entName
	 *            企业名称[1..1]
	 */
	public void setEntName(String entName) {
		EntName = entName;
	}
	/**
	 * 获取 entCertType
	 * 
	 * @return the entCertType 企业身份标识类型[1..1]
	 */
	public String getEntCertType() {
		return EntCertType;
	}
	/**
	 * 设置 entCertType
	 * 
	 * @param entCertType
	 *            企业身份标识类型[1..1]
	 */
	public void setEntCertType(String entCertType) {
		EntCertType = entCertType;
	}
	/**
	 * 获取 entCertNum
	 * 
	 * @return the entCertNum 企业身份标识号码[1..1]
	 */
	public String getEntCertNum() {
		return EntCertNum;
	}
	/**
	 * 设置 entCertNum
	 * 
	 * @param entCertNum
	 *            企业身份标识号码[1..1]
	 */
	public void setEntCertNum(String entCertNum) {
		EntCertNum = entCertNum;
	}
	/**
	 * 获取 rptDate
	 * 
	 * @return the rptDate 信息报告日期[1..1]
	 */
	public String getRptDate() {
		return RptDate;
	}
	/**
	 * 设置 rptDate
	 * 
	 * @param rptDate
	 *            信息报告日期[1..1]
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}
	/**
	 * 获取 infSurcCode
	 * 
	 * @return the infSurcCode 信息来源编码[1..1]
	 */
	public String getInfSurcCode() {
		return InfSurcCode;
	}
	/**
	 * 设置 infSurcCode
	 * 
	 * @param infSurcCode
	 *            信息来源编码[1..1]
	 */
	public void setInfSurcCode(String infSurcCode) {
		InfSurcCode = infSurcCode;
	}

	/**
	 * 获取 cimoc
	 * 
	 * @return the cimoc 客户资料维护机构代码[1..1]
	 */
	public String getCimoc() {
		return Cimoc;
	}
	/**
	 * 设置 cimoc
	 * 
	 * @param cimoc
	 *            客户资料维护机构代码[1..1]
	 */
	public void setCimoc(String cimoc) {
		Cimoc = cimoc;
	}
	/**
	 * 获取 customerType
	 * 
	 * @return the customerType 客户资料类型[1..1]
	 */
	public String getCustomerType() {
		return CustomerType;
	}
	/**
	 * 设置 customerType
	 * 
	 * @param customerType
	 *            客户资料类型[1..1]
	 */
	public void setCustomerType(String customerType) {
		CustomerType = customerType;
	}
	/**
	 * 获取 etpSts
	 * 
	 * @return the etpSts 存续状态[1..1]
	 */
	public String getEtpSts() {
		return EtpSts;
	}
	/**
	 * 设置 etpSts
	 * 
	 * @param etpSts
	 *            存续状态[1..1]
	 */
	public void setEtpSts(String etpSts) {
		EtpSts = etpSts;
	}
	/**
	 * 获取 orgType
	 * 
	 * @return the orgType 组织机构类型[1..1]
	 */
	public String getOrgType() {
		return OrgType;
	}
	/**
	 * 设置 orgType
	 * 
	 * @param orgType
	 *            组织机构类型[1..1]
	 */
	public void setOrgType(String orgType) {
		OrgType = orgType;
	}
	/**
	 * 获取 custBaseoth_Flag
	 * 
	 * @return the custBaseoth_Flag 客户其他表示段上报标志
	 */
	public String getCustBaseoth_Flag() {
		return CustBaseoth_Flag;
	}
	/**
	 * 设置 custBaseoth_Flag
	 * 
	 * @param custBaseoth_Flag
	 *            客户其他表示段上报标志
	 */
	public void setCustBaseoth_Flag(String custBaseoth_Flag) {
		CustBaseoth_Flag = custBaseoth_Flag;
	}
	/**
	 * 获取 custBaseinf_Flag
	 * 
	 * @return the custBaseinf_Flag 客户概况信息段上报标志
	 */
	public String getCustBaseinf_Flag() {
		return CustBaseinf_Flag;
	}
	/**
	 * 设置 custBaseinf_Flag
	 * 
	 * @param custBaseinf_Flag
	 *            客户概况信息段上报标志
	 */
	public void setCustBaseinf_Flag(String custBaseinf_Flag) {
		CustBaseinf_Flag = custBaseinf_Flag;
	}
	/**
	 * 获取 custBasemnm_Flag
	 * 
	 * @return the custBasemnm_Flag 客户组成人员上报标志
	 */
	public String getCustBasemnm_Flag() {
		return CustBasemnm_Flag;
	}
	/**
	 * 设置 custBasemnm_Flag
	 * 
	 * @param custBasemnm_Flag
	 *            客户组成人员上报标志
	 */
	public void setCustBasemnm_Flag(String custBasemnm_Flag) {
		CustBasemnm_Flag = custBasemnm_Flag;
	}
	/**
	 * 获取 custBasehold_Flag
	 * 
	 * @return the custBasehold_Flag 客户注册资本及出资人上报标志
	 */
	public String getCustBasehold_Flag() {
		return CustBasehold_Flag;
	}
	/**
	 * 设置 custBasehold_Flag
	 * 
	 * @param custBasehold_Flag
	 *            客户注册资本及出资人上报标志
	 */
	public void setCustBasehold_Flag(String custBasehold_Flag) {
		CustBasehold_Flag = custBasehold_Flag;
	}
	/**
	 * 获取 custBasectr_Flag
	 * 
	 * @return the custBasectr_Flag 客户实际控制人段上报标志
	 */
	public String getCustBasectr_Flag() {
		return CustBasectr_Flag;
	}
	/**
	 * 设置 custBasectr_Flag
	 * 
	 * @param custBasectr_Flag
	 *            客户实际控制人段上报标志
	 */
	public void setCustBasectr_Flag(String custBasectr_Flag) {
		CustBasectr_Flag = custBasectr_Flag;
	}
	/**
	 * 获取 custBaseup_Flag
	 * 
	 * @return the custBaseup_Flag 客户上级机构段上报标志
	 */
	public String getCustBaseup_Flag() {
		return CustBaseup_Flag;
	}
	/**
	 * 设置 custBaseup_Flag
	 * 
	 * @param custBaseup_Flag
	 *            客户上级机构段上报标志
	 */
	public void setCustBaseup_Flag(String custBaseup_Flag) {
		CustBaseup_Flag = custBaseup_Flag;
	}
	/**
	 * 获取 custBasecont_Flag
	 * 
	 * @return the custBasecont_Flag 客户联系方式段上报标志
	 */
	public String getCustBasecont_Flag() {
		return CustBasecont_Flag;
	}
	/**
	 * 设置 custBasecont_Flag
	 * 
	 * @param custBasecont_Flag
	 *            客户联系方式段上报标志
	 */
	public void setCustBasecont_Flag(String custBasecont_Flag) {
		CustBasecont_Flag = custBasecont_Flag;
	}
	/**
	 * 获取 nationality
	 * 
	 * @return the nationality 2、基本概况信息段
	 */
	public String getNationality() {
		return Nationality;
	}
	/**
	 * 设置 nationality
	 * 
	 * @param nationality
	 *            2、基本概况信息段
	 */
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	/**
	 * 获取 regAdd
	 * 
	 * @return the regAdd 登记地址[1..1]
	 */
	public String getRegAdd() {
		return RegAdd;
	}
	/**
	 * 设置 regAdd
	 * 
	 * @param regAdd
	 *            登记地址[1..1]
	 */
	public void setRegAdd(String regAdd) {
		RegAdd = regAdd;
	}
	/**
	 * 获取 admDivOfReg
	 * 
	 * @return the admDivOfReg 登记地行政区划代码[1..1]
	 */
	public String getAdmDivOfReg() {
		return AdmDivOfReg;
	}
	/**
	 * 设置 admDivOfReg
	 * 
	 * @param admDivOfReg
	 *            登记地行政区划代码[1..1]
	 */
	public void setAdmDivOfReg(String admDivOfReg) {
		AdmDivOfReg = admDivOfReg;
	}
	/**
	 * 获取 establishDate
	 * 
	 * @return the establishDate 成立日期[1..1]
	 */
	public String getEstablishDate() {
		return EstablishDate;
	}

	/**
	 * 设置 establishDate
	 * 
	 * @param establishDate
	 *            成立日期[1..1]
	 */
	public void setEstablishDate(String establishDate) {
		EstablishDate = establishDate;
	}

	/**
	 * 获取 bizEndDate
	 * 
	 * @return the bizEndDate 营业许可证到期日[1..1]
	 */
	public String getBizEndDate() {
		return BizEndDate;
	}

	/**
	 * 设置 bizEndDate
	 * 
	 * @param bizEndDate
	 *            营业许可证到期日[1..1]
	 */
	public void setBizEndDate(String bizEndDate) {
		BizEndDate = bizEndDate;
	}

	/**
	 * 获取 bizRange
	 * 
	 * @return the bizRange 业务范围[1..1]
	 */
	public String getBizRange() {
		return BizRange;
	}

	/**
	 * 设置 bizRange
	 * 
	 * @param bizRange
	 *            业务范围[1..1]
	 */
	public void setBizRange(String bizRange) {
		BizRange = bizRange;
	}

	/**
	 * 获取 ecoIndusCate
	 * 
	 * @return the ecoIndusCate 行业分类代码[1..1]
	 */
	public String getEcoIndusCate() {
		return EcoIndusCate;
	}

	/**
	 * 设置 ecoIndusCate
	 * 
	 * @param ecoIndusCate
	 *            行业分类代码[1..1]
	 */
	public void setEcoIndusCate(String ecoIndusCate) {
		EcoIndusCate = ecoIndusCate;
	}

	/**
	 * 获取 ecoType
	 * 
	 * @return the ecoType 经济类型代码[1..1]
	 */
	public String getEcoType() {
		return EcoType;
	}

	/**
	 * 设置 ecoType
	 * 
	 * @param ecoType
	 *            经济类型代码[1..1]
	 */
	public void setEcoType(String ecoType) {
		EcoType = ecoType;
	}

	/**
	 * 获取 entScale
	 * 
	 * @return the entScale 企业规模[1..1]
	 */
	public String getEntScale() {
		return EntScale;
	}

	/**
	 * 设置 entScale
	 * 
	 * @param entScale
	 *            企业规模[1..1]
	 */
	public void setEntScale(String entScale) {
		EntScale = entScale;
	}

	/**
	 * 获取 fcsInfoUpDate
	 * 
	 * @return the fcsInfoUpDate 信息更新日期[1..1]
	 */
	public String getFcsInfoUpDate() {
		return FcsInfoUpDate;
	}

	/**
	 * 设置 fcsInfoUpDate
	 * 
	 * @param fcsInfoUpDate
	 *            信息更新日期[1..1]
	 */
	public void setFcsInfoUpDate(String fcsInfoUpDate) {
		FcsInfoUpDate = fcsInfoUpDate;
	}

	/**
	 * 获取 regCapCurrency
	 * 
	 * @return the regCapCurrency 3、注册资本及主要出资人段[0..1]
	 */
	public String getRegCapCurrency() {
		return RegCapCurrency;
	}

	/**
	 * 设置 regCapCurrency
	 * 
	 * @param regCapCurrency
	 *            3、注册资本及主要出资人段[0..1]
	 */
	public void setRegCapCurrency(String regCapCurrency) {
		RegCapCurrency = regCapCurrency;
	}

	/**
	 * 获取 regCap
	 * 
	 * @return the regCap 注册资本[1..1]
	 */
	public String getRegCap() {
		return RegCap;
	}

	/**
	 * 设置 regCap
	 * 
	 * @param regCap
	 *            注册资本[1..1]
	 */
	public void setRegCap(String regCap) {
		RegCap = regCap;
	}

	/**
	 * 获取 supOrgType
	 * 
	 * @return the supOrgType 4、上级机构段[0..1]
	 */
	public String getSupOrgType() {
		return SupOrgType;
	}

	/**
	 * 设置 supOrgType
	 * 
	 * @param supOrgType
	 *            4、上级机构段[0..1]
	 */
	public void setSupOrgType(String supOrgType) {
		SupOrgType = supOrgType;
	}

	/**
	 * 获取 supOrgName
	 * 
	 * @return the supOrgName 上级机构名称[1..1]
	 */
	public String getSupOrgName() {
		return SupOrgName;
	}

	/**
	 * 设置 supOrgName
	 * 
	 * @param supOrgName
	 *            上级机构名称[1..1]
	 */
	public void setSupOrgName(String supOrgName) {
		SupOrgName = supOrgName;
	}

	/**
	 * 获取 supOrgCertType
	 * 
	 * @return the supOrgCertType 上级机构身份标识类型[1..1]
	 */
	public String getSupOrgCertType() {
		return SupOrgCertType;
	}

	/**
	 * 设置 supOrgCertType
	 * 
	 * @param supOrgCertType
	 *            上级机构身份标识类型[1..1]
	 */
	public void setSupOrgCertType(String supOrgCertType) {
		SupOrgCertType = supOrgCertType;
	}

	/**
	 * 获取 supOrgCertNum
	 * 
	 * @return the supOrgCertNum 上级机构身份标识码[1..1]
	 */
	public String getSupOrgCertNum() {
		return SupOrgCertNum;
	}

	/**
	 * 设置 supOrgCertNum
	 * 
	 * @param supOrgCertNum
	 *            上级机构身份标识码[1..1]
	 */
	public void setSupOrgCertNum(String supOrgCertNum) {
		SupOrgCertNum = supOrgCertNum;
	}

	/**
	 * 获取 supOrgInfoUpDate
	 * 
	 * @return the supOrgInfoUpDate 信息更新日期[1..1]
	 */
	public String getSupOrgInfoUpDate() {
		return SupOrgInfoUpDate;
	}

	/**
	 * 设置 supOrgInfoUpDate
	 * 
	 * @param supOrgInfoUpDate
	 *            信息更新日期[1..1]
	 */
	public void setSupOrgInfoUpDate(String supOrgInfoUpDate) {
		SupOrgInfoUpDate = supOrgInfoUpDate;
	}

	/**
	 * 获取 conAddDistrictCode
	 * 
	 * @return the conAddDistrictCode 5、联系方式段 联系地址行政区划
	 */
	public String getConAddDistrictCode() {
		return ConAddDistrictCode;
	}

	/**
	 * 设置 conAddDistrictCode
	 * 
	 * @param conAddDistrictCode
	 *            5、联系方式段 联系地址行政区划
	 */
	public void setConAddDistrictCode(String conAddDistrictCode) {
		ConAddDistrictCode = conAddDistrictCode;
	}

	/**
	 * 获取 conAdd
	 * 
	 * @return the conAdd 联系地址[0..1]
	 */
	public String getConAdd() {
		return ConAdd;
	}

	/**
	 * 设置 conAdd
	 * 
	 * @param conAdd
	 *            联系地址[0..1]
	 */
	public void setConAdd(String conAdd) {
		ConAdd = conAdd;
	}

	/**
	 * 获取 conPhone
	 * 
	 * @return the conPhone 联系电话[0..1]
	 */
	public String getConPhone() {
		return ConPhone;
	}

	/**
	 * 设置 conPhone
	 * 
	 * @param conPhone
	 *            联系电话[0..1]
	 */
	public void setConPhone(String conPhone) {
		ConPhone = conPhone;
	}

	/**
	 * 获取 finConPhone
	 * 
	 * @return the finConPhone 财务部门联系电话[0..1]
	 */
	public String getFinConPhone() {
		return FinConPhone;
	}

	/**
	 * 设置 finConPhone
	 * 
	 * @param finConPhone
	 *            财务部门联系电话[0..1]
	 */
	public void setFinConPhone(String finConPhone) {
		FinConPhone = finConPhone;
	}

	/**
	 * 获取 cotaInfoUpDate
	 * 
	 * @return the cotaInfoUpDate 信息更新日期[1..1]
	 */
	public String getCotaInfoUpDate() {
		return CotaInfoUpDate;
	}

	/**
	 * 设置 cotaInfoUpDate
	 * 
	 * @param cotaInfoUpDate
	 *            信息更新日期[1..1]
	 */
	public void setCotaInfoUpDate(String cotaInfoUpDate) {
		CotaInfoUpDate = cotaInfoUpDate;
	}

	public String getRptDateCode() {
		return RptDateCode;
	}

	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}
	/**  
	 * 获取 eB_CustBaseOth_Info_List
	 * @return the eB_CustBaseOth_Info_List 其他标识段 
	 */
	public List<EB_CustBaseOth_Info> getEB_CustBaseOth_Info_List() {
		return EB_CustBaseOth_Info_List;
	}
	/**  
	 * 设置 eB_CustBaseOth_Info_List  
	 * @param eB_CustBaseOth_Info_List 其他标识段  
	 */
	public void setEB_CustBaseOth_Info_List(
			List<EB_CustBaseOth_Info> eB_CustBaseOth_Info_List) {
		EB_CustBaseOth_Info_List = eB_CustBaseOth_Info_List;
	}
	/**  
	 * 获取 eB_CustBaseMnm_Info_List
	 * @return the eB_CustBaseMnm_Info_List 主要组成人员段 
	 */
	public List<EB_CustBaseMnm_Info> getEB_CustBaseMnm_Info_List() {
		return EB_CustBaseMnm_Info_List;
	}
	/**  
	 * 设置 eB_CustBaseMnm_Info_List  
	 * @param eB_CustBaseMnm_Info_List 主要组成人员段  
	 */
	public void setEB_CustBaseMnm_Info_List(
			List<EB_CustBaseMnm_Info> eB_CustBaseMnm_Info_List) {
		EB_CustBaseMnm_Info_List = eB_CustBaseMnm_Info_List;
	}
	/**  
	 * 获取 eB_CustBaseHold_Info_List
	 * @return the eB_CustBaseHold_Info_List 注册资本及主要出资人段 
	 */
	public List<EB_CustBaseHold_Info> getEB_CustBaseHold_Info_List() {
		return EB_CustBaseHold_Info_List;
	}
	/**  
	 * 设置 eB_CustBaseHold_Info_List  
	 * @param eB_CustBaseHold_Info_List 注册资本及主要出资人段  
	 */
	public void setEB_CustBaseHold_Info_List(
			List<EB_CustBaseHold_Info> eB_CustBaseHold_Info_List) {
		EB_CustBaseHold_Info_List = eB_CustBaseHold_Info_List;
	}
	/**  
	 * 获取 eB_CustBaseCtr_Info_List
	 * @return the eB_CustBaseCtr_Info_List 实际控制人段 
	 */
	public List<EB_CustBaseCtr_Info> getEB_CustBaseCtr_Info_List() {
		return EB_CustBaseCtr_Info_List;
	}
	/**  
	 * 设置 eB_CustBaseCtr_Info_List  
	 * @param eB_CustBaseCtr_Info_List 实际控制人段  
	 */
	public void setEB_CustBaseCtr_Info_List(
			List<EB_CustBaseCtr_Info> eB_CustBaseCtr_Info_List) {
		EB_CustBaseCtr_Info_List = eB_CustBaseCtr_Info_List;
	}
	
}
