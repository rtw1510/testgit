package com.dhcc.xml.ent.entity.credit.db;

import java.util.List;

/**  
  * Title: Eb_AcctMdf_Info<br/>  
  * Description: ��ҵ�����˻����θ��������¼������<br/>  
  * @author ChenJingYuan  
  * @date 2018-8-8  
  */  
public class Eb_AcctMdf_Info {
	/**
	 *�����������Ϣ
	 */  
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
	/**��ҵ����Э�������Ϣ�����ݱ�ӳ��*/  
	private com.dhcc.xml.ent.entity.credit.db.Eb_CorpCtr_Info Eb_CorpCtr_Info;
	/**��ҵ����Э�鹲ͬ��������Ϣ�����ݱ�ӳ��*/  
	private List<Eb_CorpCtrRel_Info> Eb_CorpCtrRel_Info_List;
	
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
	 * ��ȡ eb_CorpCtr_Info
	 * @return the eb_CorpCtr_Info ��ҵ����Э�������Ϣ�����ݱ�ӳ�� 
	 */
	public com.dhcc.xml.ent.entity.credit.db.Eb_CorpCtr_Info getEb_CorpCtr_Info() {
		return Eb_CorpCtr_Info;
	}

	/**  
	 * ���� eb_CorpCtr_Info  
	 * @param eb_CorpCtr_Info ��ҵ����Э�������Ϣ�����ݱ�ӳ��  
	 */
	public void setEb_CorpCtr_Info(com.dhcc.xml.ent.entity.credit.db.Eb_CorpCtr_Info eb_CorpCtr_Info) {
		Eb_CorpCtr_Info = eb_CorpCtr_Info;
	}

	/**  
	 * ��ȡ eb_CorpCtrRel_Info_List
	 * @return the eb_CorpCtrRel_Info_List ��ҵ����Э�鹲ͬ��������Ϣ�����ݱ�ӳ�� 
	 */
	public List<Eb_CorpCtrRel_Info> getEb_CorpCtrRel_Info_List() {
		return Eb_CorpCtrRel_Info_List;
	}

	/**  
	 * ���� eb_CorpCtrRel_Info_List  
	 * @param eb_CorpCtrRel_Info_List ��ҵ����Э�鹲ͬ��������Ϣ�����ݱ�ӳ��  
	 */
	public void setEb_CorpCtrRel_Info_List(
			List<Eb_CorpCtrRel_Info> eb_CorpCtrRel_Info_List) {
		Eb_CorpCtrRel_Info_List = eb_CorpCtrRel_Info_List;
	}
}
