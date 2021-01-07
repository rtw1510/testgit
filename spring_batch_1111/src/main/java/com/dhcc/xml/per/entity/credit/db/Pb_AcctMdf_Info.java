package com.dhcc.xml.per.entity.credit.db;

import java.util.List;

/**  
  * Title: Eb_AcctMdf_Info<br/>  
  * Description: 个人业务账户按段更正请求记录基础段<br/>  
  * @author ChenJingYuan  
  * @date 2018-8-8  
  */  
public class Pb_AcctMdf_Info {
	/**主键信息*/  
	private String Record_Id;
	/**信息记录类型[1..1]*/
	private String InfRecType;
	/**待更正业务标识[1..1]*/
	private String ModRecCode;
	/**信息报告日期[1..1]*/
	private String RptDate;
	/**待更正段段标[1..1]*/
	private String MdfcSgmtCode;
	/**个人征信授信协议基本信息表*/  
	private Pb_LnctrctBase_Info Pb_LnctrctBase_Info;
	/**个人征信授信协议共同授信人信息表 */  
	private List<Pb_LnctrctRel_Info> Pb_LnctrctRel_Info_List;
	public Pb_AcctMdf_Info() {
		super();
	}
	/**  
	 * 获取 record_Id
	 * @return the record_Id 主键信息 
	 */
	public String getRecord_Id() {
		return Record_Id;
	}

	/**  
	 * 设置 record_Id  
	 * @param record_Id 主键信息  
	 */
	public void setRecord_Id(String record_Id) {
		Record_Id = record_Id;
	}

	/**  
	 * 获取 infRecType
	 * @return the infRecType 信息记录类型[1..1] 
	 */
	public String getInfRecType() {
		return InfRecType;
	}
	/**  
	 * 设置 infRecType  
	 * @param infRecType 信息记录类型[1..1]  
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}
	/**  
	 * 获取 modRecCode
	 * @return the modRecCode 待更正业务标识[1..1] 
	 */
	public String getModRecCode() {
		return ModRecCode;
	}
	/**  
	 * 设置 modRecCode  
	 * @param modRecCode 待更正业务标识[1..1]  
	 */
	public void setModRecCode(String modRecCode) {
		ModRecCode = modRecCode;
	}
	/**  
	 * 获取 rptDate
	 * @return the rptDate 信息报告日期[1..1] 
	 */
	public String getRptDate() {
		return RptDate;
	}
	/**  
	 * 设置 rptDate  
	 * @param rptDate 信息报告日期[1..1]  
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}
	/**  
	 * 获取 mdfcSgmtCode
	 * @return the mdfcSgmtCode 待更正段段标[1..1] 
	 */
	public String getMdfcSgmtCode() {
		return MdfcSgmtCode;
	}
	/**  
	 * 设置 mdfcSgmtCode  
	 * @param mdfcSgmtCode 待更正段段标[1..1]  
	 */
	public void setMdfcSgmtCode(String mdfcSgmtCode) {
		MdfcSgmtCode = mdfcSgmtCode;
	}
	/**  
	 * 获取 pb_LnctrctBase_Info
	 * @return the pb_LnctrctBase_Info 个人征信授信协议基本信息表 
	 */
	public Pb_LnctrctBase_Info getPb_LnctrctBase_Info() {
		return Pb_LnctrctBase_Info;
	}
	/**  
	 * 设置 pb_LnctrctBase_Info  
	 * @param pb_LnctrctBase_Info 个人征信授信协议基本信息表  
	 */
	public void setPb_LnctrctBase_Info(Pb_LnctrctBase_Info pb_LnctrctBase_Info) {
		Pb_LnctrctBase_Info = pb_LnctrctBase_Info;
	}
	/**  
	 * 获取 pb_LnctrctRel_Info_List
	 * @return the pb_LnctrctRel_Info_List 个人征信授信协议共同授信人信息表 
	 */
	public List<Pb_LnctrctRel_Info> getPb_LnctrctRel_Info_List() {
		return Pb_LnctrctRel_Info_List;
	}
	/**  
	 * 设置 pb_LnctrctRel_Info_List  
	 * @param pb_LnctrctRel_Info_List 个人征信授信协议共同授信人信息表  
	 */
	public void setPb_LnctrctRel_Info_List(
			List<Pb_LnctrctRel_Info> pb_LnctrctRel_Info_List) {
		Pb_LnctrctRel_Info_List = pb_LnctrctRel_Info_List;
	}
}
