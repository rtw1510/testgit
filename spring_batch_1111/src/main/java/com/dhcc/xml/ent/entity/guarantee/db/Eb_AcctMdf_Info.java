package com.dhcc.xml.ent.entity.guarantee.db;

import java.util.List;

/**  
  * Title: Eb_AcctMdf_Info<br/>  
  * Description: ��ҵ�����˻����θ��������¼������<br/>  
  * @author ChenJingYuan  
  * @date 2018-8-8  
  */  
public class Eb_AcctMdf_Info {
	/**�����������Ϣ*/ 
	private String Record_Id;
	/**
	 *��Ϣ��¼����[1..1]
	 */
	private String InfRecType;
	/**
	 *������ҵ���ʶ[1..1]
	 */
	private String ModRecCode;
	/**
	 *��Ϣ��������[1..1]
	 */
	private String RptDate;
	/**
	 *�˻�����
	 */
	private String AcctType;
	/**
	 *�������ζα�[1..1]
	 */
	private String MdfcSgmtCode;
	/** ��ҵ�����˻���¼*/  
	private com.dhcc.xml.ent.entity.guarantee.db.Eb_GuarAcc_Info Eb_GuarAcc_Info;
	/**��ҵ�����˻���¼��ػ���������*/  
	private List<Eb_GuarAccRel_Info> Eb_GuarAccRel_Info_List;
	/** ����Ѻ��ͬ��Ϣ*/  
	private List<Eb_Guacct_Info> Eb_Guacct_Info_List;
	public Eb_AcctMdf_Info() {
		super();
	}
	/**  
	 * ��ȡ record_Id
	 * @return the record_Id �����������Ϣ 
	 */
	public String getRecord_Id() {
		return Record_Id;
	}

	/**  
	 * ���� record_Id  
	 * @param record_Id �����������Ϣ  
	 */
	public void setRecord_Id(String record_Id) {
		Record_Id = record_Id;
	}

	/**  
	 * ��ȡ infRecType
	 * @return the infRecType ��Ϣ��¼����[1..1] 
	 */
	public String getInfRecType() {
		return InfRecType;
	}
	/**  
	 * ���� infRecType  
	 * @param infRecType ��Ϣ��¼����[1..1]  
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}
	/**  
	 * ��ȡ modRecCode
	 * @return the modRecCode ������ҵ���ʶ[1..1] 
	 */
	public String getModRecCode() {
		return ModRecCode;
	}
	/**  
	 * ���� modRecCode  
	 * @param modRecCode ������ҵ���ʶ[1..1]  
	 */
	public void setModRecCode(String modRecCode) {
		ModRecCode = modRecCode;
	}
	/**  
	 * ��ȡ rptDate
	 * @return the rptDate ��Ϣ��������[1..1] 
	 */
	public String getRptDate() {
		return RptDate;
	}
	/**  
	 * ���� rptDate  
	 * @param rptDate ��Ϣ��������[1..1]  
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}
	/**  
	 * ��ȡ acctType
	 * @return the acctType �˻����� 
	 */
	public String getAcctType() {
		return AcctType;
	}
	/**  
	 * ���� acctType  
	 * @param acctType �˻�����  
	 */
	public void setAcctType(String acctType) {
		AcctType = acctType;
	}
	/**  
	 * ��ȡ mdfcSgmtCode
	 * @return the mdfcSgmtCode �������ζα�[1..1] 
	 */
	public String getMdfcSgmtCode() {
		return MdfcSgmtCode;
	}
	/**  
	 * ���� mdfcSgmtCode  
	 * @param mdfcSgmtCode �������ζα�[1..1]  
	 */
	public void setMdfcSgmtCode(String mdfcSgmtCode) {
		MdfcSgmtCode = mdfcSgmtCode;
	}
	/**  
	 * ��ȡ eb_GuarAcc_Info
	 * @return the eb_GuarAcc_Info ��ҵ�����˻���¼ 
	 */
	public com.dhcc.xml.ent.entity.guarantee.db.Eb_GuarAcc_Info getEb_GuarAcc_Info() {
		return Eb_GuarAcc_Info;
	}
	/**  
	 * ���� eb_GuarAcc_Info  
	 * @param eb_GuarAcc_Info ��ҵ�����˻���¼  
	 */
	public void setEb_GuarAcc_Info(com.dhcc.xml.ent.entity.guarantee.db.Eb_GuarAcc_Info eb_GuarAcc_Info) {
		Eb_GuarAcc_Info = eb_GuarAcc_Info;
	}
	/**  
	 * ��ȡ eb_GuarAccRel_Info_List
	 * @return the eb_GuarAccRel_Info_List ��ҵ�����˻���¼��ػ��������� 
	 */
	public List<Eb_GuarAccRel_Info> getEb_GuarAccRel_Info_List() {
		return Eb_GuarAccRel_Info_List;
	}
	/**  
	 * ���� eb_GuarAccRel_Info_List  
	 * @param eb_GuarAccRel_Info_List ��ҵ�����˻���¼��ػ���������  
	 */
	public void setEb_GuarAccRel_Info_List(
			List<Eb_GuarAccRel_Info> eb_GuarAccRel_Info_List) {
		Eb_GuarAccRel_Info_List = eb_GuarAccRel_Info_List;
	}
	/**  
	 * ��ȡ eb_Guacct_Info_List
	 * @return the eb_Guacct_Info_List ����Ѻ��ͬ��Ϣ 
	 */
	public List<Eb_Guacct_Info> getEb_Guacct_Info_List() {
		return Eb_Guacct_Info_List;
	}
	/**  
	 * ���� eb_Guacct_Info_List  
	 * @param eb_Guacct_Info_List ����Ѻ��ͬ��Ϣ  
	 */
	public void setEb_Guacct_Info_List(List<Eb_Guacct_Info> eb_Guacct_Info_List) {
		Eb_Guacct_Info_List = eb_Guacct_Info_List;
	}
}
