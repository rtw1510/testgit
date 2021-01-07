package com.dhcc.xml.per.entity.motgacltalctrctinfo.db;

import java.util.List;

/**  
  * Title: Pb_Guacct_Info<br/>  
  * Description: 抵质押合同信息<br/>  
  * @author ChenJingYuan  
  * @date 2020-4-3  
  */  
public class Pb_Guacct_Info {
	/**
	 *主表的主键信息
	 */  
	private String Record_Id;
	/**
	 *信息记录类型 [1..1]
	 */
	private String InfRecType;
	/**
	 *（质）押合同标识码 [1..1]
	 */
	private String CcCode;
	/**
	 *信息报告日期 [1..1]
	 */
	private String RptDate;
	/**
	 *报告时点说明代码 [1..1]
	 */
	private String RptDateCode;
	/**
	 *债务人身份类别 [1..1]
	 */
	private String InfoIDType;
	/**
	 *债务人姓名 [1..1]
	 */
	private String Name;
	/**
	 *务人身份标识类型 [1..1]
	 */
	private String CertType;
	/**
	 *务人身份标识号码 [1..1]
	 */
	private String CertNum;
	/**
	 *业务管理机构代码 [1..1]
	 */
	private String MngmtOrgCode;
	/**
	 *合同类型 [1..1]
	 */
	private String GuarType;
	/**
	 *担保金额 [1..1]
	 */
	private String CcAmt;
	/**
	 * 币种 [1..1]
	 */
	private String Cy;
	/**
	 *抵（质）押合同生效日期 [1..1]
	 */
	private String CcValDate;
	/**
	 *抵（质）押合同到期日期 [1..1]
	 */
	private String CcExpDate;
	/**
	 *最高额担保标志 [1..1]
	 */
	private String MaxGuar;
	/**
	 *抵（质）押合同状态 [1..1]
	 */
	private String CcStatus;
	
	/**基本信息段*/  
	private String GUACCTBASEINFO_FLAG;
	/**其他债务人信息段*/  
	private String GUACCTRLT_FLAG;
	/**抵押物信息段*/  
	private String GUACCTPLE_FLAG;
	/**质物信息段*/  
	private String GUACCTIMP_FLAG;
	
	/**其他债务人信息段*/  
	private List<Pb_GuacctRlt_Info> Pb_GuacctRlt_Info_List;
	/**抵押物信息*/  
	private List<Pb_GuacctPle_Info> Pb_GuacctPle_Info_List;
	/**抵质押合同质物信息段表缓存*/  
	private List<Pb_GuacctImp_Info> Pb_GuacctImp_Info_List;
	
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
	public String getInfRecType() {
		return InfRecType;
	}
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}
	public String getCcCode() {
		return CcCode;
	}
	public void setCcCode(String ccCode) {
		CcCode = ccCode;
	}
	public String getRptDate() {
		return RptDate;
	}
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}
	public String getRptDateCode() {
		return RptDateCode;
	}
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}
	public String getInfoIDType() {
		return InfoIDType;
	}
	public void setInfoIDType(String infoIDType) {
		InfoIDType = infoIDType;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCertType() {
		return CertType;
	}
	public void setCertType(String certType) {
		CertType = certType;
	}
	public String getCertNum() {
		return CertNum;
	}
	public void setCertNum(String certNum) {
		CertNum = certNum;
	}
	public String getMngmtOrgCode() {
		return MngmtOrgCode;
	}
	public void setMngmtOrgCode(String mngmtOrgCode) {
		MngmtOrgCode = mngmtOrgCode;
	}
	public String getGuarType() {
		return GuarType;
	}
	public void setGuarType(String guarType) {
		GuarType = guarType;
	}
	public String getCcAmt() {
		return CcAmt;
	}
	public void setCcAmt(String ccAmt) {
		CcAmt = ccAmt;
	}
	public String getCy() {
		return Cy;
	}
	public void setCy(String cy) {
		Cy = cy;
	}
	public String getCcValDate() {
		return CcValDate;
	}
	public void setCcValDate(String ccValDate) {
		CcValDate = ccValDate;
	}
	public String getCcExpDate() {
		return CcExpDate;
	}
	public void setCcExpDate(String ccExpDate) {
		CcExpDate = ccExpDate;
	}
	public String getMaxGuar() {
		return MaxGuar;
	}
	public void setMaxGuar(String maxGuar) {
		MaxGuar = maxGuar;
	}
	public String getCcStatus() {
		return CcStatus;
	}
	public void setCcStatus(String ccStatus) {
		CcStatus = ccStatus;
	}
	public String getGUACCTBASEINFO_FLAG() {
		return GUACCTBASEINFO_FLAG;
	}
	public void setGUACCTBASEINFO_FLAG(String gUACCTBASEINFO_FLAG) {
		GUACCTBASEINFO_FLAG = gUACCTBASEINFO_FLAG;
	}
	public String getGUACCTRLT_FLAG() {
		return GUACCTRLT_FLAG;
	}
	public void setGUACCTRLT_FLAG(String gUACCTRLT_FLAG) {
		GUACCTRLT_FLAG = gUACCTRLT_FLAG;
	}
	public String getGUACCTPLE_FLAG() {
		return GUACCTPLE_FLAG;
	}
	public void setGUACCTPLE_FLAG(String gUACCTPLE_FLAG) {
		GUACCTPLE_FLAG = gUACCTPLE_FLAG;
	}
	public String getGUACCTIMP_FLAG() {
		return GUACCTIMP_FLAG;
	}
	public void setGUACCTIMP_FLAG(String gUACCTIMP_FLAG) {
		GUACCTIMP_FLAG = gUACCTIMP_FLAG;
	}
	/**  
	 * 获取 pb_GuacctRlt_Info_List
	 * @return the pb_GuacctRlt_Info_List 其他债务人信息段 
	 */
	public List<Pb_GuacctRlt_Info> getPb_GuacctRlt_Info_List() {
		return Pb_GuacctRlt_Info_List;
	}
	/**  
	 * 设置 pb_GuacctRlt_Info_List  
	 * @param pb_GuacctRlt_Info_List 其他债务人信息段  
	 */
	public void setPb_GuacctRlt_Info_List(
			List<Pb_GuacctRlt_Info> pb_GuacctRlt_Info_List) {
		Pb_GuacctRlt_Info_List = pb_GuacctRlt_Info_List;
	}
	/**  
	 * 获取 pb_GuacctPle_Info_List
	 * @return the pb_GuacctPle_Info_List 抵押物信息 
	 */
	public List<Pb_GuacctPle_Info> getPb_GuacctPle_Info_List() {
		return Pb_GuacctPle_Info_List;
	}
	/**  
	 * 设置 pb_GuacctPle_Info_List  
	 * @param pb_GuacctPle_Info_List 抵押物信息  
	 */
	public void setPb_GuacctPle_Info_List(
			List<Pb_GuacctPle_Info> pb_GuacctPle_Info_List) {
		Pb_GuacctPle_Info_List = pb_GuacctPle_Info_List;
	}
	/**  
	 * 获取 pb_GuacctImp_Info_List
	 * @return the pb_GuacctImp_Info_List 抵质押合同质物信息段表缓存 
	 */
	public List<Pb_GuacctImp_Info> getPb_GuacctImp_Info_List() {
		return Pb_GuacctImp_Info_List;
	}
	/**  
	 * 设置 pb_GuacctImp_Info_List  
	 * @param pb_GuacctImp_Info_List 抵质押合同质物信息段表缓存  
	 */
	public void setPb_GuacctImp_Info_List(
			List<Pb_GuacctImp_Info> pb_GuacctImp_Info_List) {
		Pb_GuacctImp_Info_List = pb_GuacctImp_Info_List;
	}
}
