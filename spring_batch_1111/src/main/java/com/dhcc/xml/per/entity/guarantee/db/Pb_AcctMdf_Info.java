package com.dhcc.xml.per.entity.guarantee.db;

import java.util.List;

/**
 * Title: Pb_AcctMdf_Info<br/>
 * Description: ���˵����˻����θ��������¼������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-8-8
 */
public class Pb_AcctMdf_Info {
	/**������Ϣ*/  
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
	/**���˵����˻���Ϣ��*/  
	private Pb_LnsecAcct_Info Pb_LnsecAcct_Info;
	/**��ػ��������˶�*/  
	private List<Pb_LnsecAcctRel_Info> Pb_LnsecAcctRel_Info_List;
	/**����Ѻ����Ϣ��*/  
	private List<Pb_Guacct_Info> Pb_Guacct_Info_List;

	public Pb_AcctMdf_Info() {
		super();
	}

	/**
	 * ��ȡ infRecType
	 * 
	 * @return the infRecType ��Ϣ��¼����[1..1]
	 */
	public String getInfRecType() {
		return InfRecType;
	}

	/**
	 * ���� infRecType
	 * 
	 * @param infRecType
	 *            ��Ϣ��¼����[1..1]
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}

	/**
	 * ��ȡ modRecCode
	 * 
	 * @return the modRecCode ������ҵ���ʶ[1..1]
	 */
	public String getModRecCode() {
		return ModRecCode;
	}

	/**
	 * ���� modRecCode
	 * 
	 * @param modRecCode
	 *            ������ҵ���ʶ[1..1]
	 */
	public void setModRecCode(String modRecCode) {
		ModRecCode = modRecCode;
	}

	/**
	 * ��ȡ rptDate
	 * 
	 * @return the rptDate ��Ϣ��������[1..1]
	 */
	public String getRptDate() {
		return RptDate;
	}

	/**
	 * ���� rptDate
	 * 
	 * @param rptDate
	 *            ��Ϣ��������[1..1]
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
	 * 
	 * @return the mdfcSgmtCode �������ζα�[1..1]
	 */
	public String getMdfcSgmtCode() {
		return MdfcSgmtCode;
	}

	/**
	 * ���� mdfcSgmtCode
	 * 
	 * @param mdfcSgmtCode
	 *            �������ζα�[1..1]
	 */
	public void setMdfcSgmtCode(String mdfcSgmtCode) {
		MdfcSgmtCode = mdfcSgmtCode;
	}

	/**  
	 * ��ȡ pb_LnsecAcct_Info
	 * @return the pb_LnsecAcct_Info ���˵����˻���Ϣ�� 
	 */
	public Pb_LnsecAcct_Info getPb_LnsecAcct_Info() {
		return Pb_LnsecAcct_Info;
	}

	/**  
	 * ���� pb_LnsecAcct_Info  
	 * @param pb_LnsecAcct_Info ���˵����˻���Ϣ��  
	 */
	public void setPb_LnsecAcct_Info(Pb_LnsecAcct_Info pb_LnsecAcct_Info) {
		Pb_LnsecAcct_Info = pb_LnsecAcct_Info;
	}

	/**  
	 * ��ȡ pb_LnsecAcctRel_Info_List
	 * @return the pb_LnsecAcctRel_Info_List ��ػ��������˶� 
	 */
	public List<Pb_LnsecAcctRel_Info> getPb_LnsecAcctRel_Info_List() {
		return Pb_LnsecAcctRel_Info_List;
	}

	/**  
	 * ���� pb_LnsecAcctRel_Info_List  
	 * @param pb_LnsecAcctRel_Info_List ��ػ��������˶�  
	 */
	public void setPb_LnsecAcctRel_Info_List(
			List<Pb_LnsecAcctRel_Info> pb_LnsecAcctRel_Info_List) {
		Pb_LnsecAcctRel_Info_List = pb_LnsecAcctRel_Info_List;
	}

	/**  
	 * ��ȡ pb_Guacct_Info_List
	 * @return the pb_Guacct_Info_List ����Ѻ����Ϣ�� 
	 */
	public List<Pb_Guacct_Info> getPb_Guacct_Info_List() {
		return Pb_Guacct_Info_List;
	}

	/**  
	 * ���� pb_Guacct_Info_List  
	 * @param pb_Guacct_Info_List ����Ѻ����Ϣ��  
	 */
	public void setPb_Guacct_Info_List(List<Pb_Guacct_Info> pb_Guacct_Info_List) {
		Pb_Guacct_Info_List = pb_Guacct_Info_List;
	}

	/**  
	 * ��ȡ record_Id
	 * @return the record_Id ������Ϣ 
	 */
	public String getRecord_Id() {
		return Record_Id;
	}

	/**  
	 * ���� record_Id  
	 * @param record_Id ������Ϣ  
	 */
	public void setRecord_Id(String record_Id) {
		Record_Id = record_Id;
	}
}
