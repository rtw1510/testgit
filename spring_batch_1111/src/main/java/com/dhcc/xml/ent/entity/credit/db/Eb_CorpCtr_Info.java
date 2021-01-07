package com.dhcc.xml.ent.entity.credit.db;

import java.util.List;

/**  
  * Title: Eb_CorpCtr_Info<br/>  
  * Description: ��ҵ����Э�������Ϣ�����ݱ�ӳ��<br/>  
  * @author ChenJingYuan  
  * @date 2018-7-25  
  */  
public class Eb_CorpCtr_Info {
	/**
	 *�����������Ϣ
	 */  
	private String Record_Id;
	/**
	 * ��Ϣ��¼���� [1..1]
	 */
	private String InfRecType;
	/**
	 * ����Э���ʶ�� [1..1]
	 */
	private String ContractCode;
	/**
	 * ��Ϣ�������� [1..1]
	 */
	private String RptDate;
	/**
	 * ����ʱ��˵������ [1..1]
	 */
	private String RptDateCode;
	/**
	 * ���������� [1..1]
	 */
	private String Name;
	/**
	 * ��������ݱ�ʶ���� [1..1]
	 */
	private String IDType;
	/**
	 * ��������ݱ�ʶ֤������ [1..1]
	 */
	private String IDNum;
	/**
	 * ҵ������������ [1..1]
	 */
	private String MngmtOrgCode;
	/**
	 * ���Ŷ������ [1..1]
	 */
	private String CreditLimType;
	/**
	 * ���ѭ����־ [1..1]
	 */
	private String LimLoopFlg;
	/**
	 * ���Ŷ�� [1..1]
	 */
	private String CreditLim;
	/**
	 * ���� [1..1]
	 */
	private String Cy;
	/**
	 * �����Ч���� [1..1]
	 */
	private String ConEffDate;
	/**
	 * ��ȵ������� [1..1]
	 */
	private String ConExpDate;
	/**
	 * ���״̬ [1..1]
	 */
	private String ConStatus;
	/**�����޶�*/  
	private  String CreditRest;
	/**�����޶���*/  
	private String CreditRestCode;
	/**
	 *��ͬ��������Ϣ���ϱ���־
	 */  
	private String CORPCTRREL_FLAG;
	/**
	 *�����Ϣ���ϱ���־
	 */  
	private String CORPCTRLIM_FLAG;
	/** ��ҵ����Э�鹲ͬ��������Ϣ��*/  
	private List<Eb_CorpCtrRel_Info> Eb_CorpCtrRel_Info_List;
	
	public Eb_CorpCtr_Info() {
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
	 * ��ȡ cORPCTRREL_FLAG
	 * @return the cORPCTRREL_FLAG ��ͬ��������Ϣ���ϱ���־ 
	 */
	public String getCORPCTRREL_FLAG() {
		return CORPCTRREL_FLAG;
	}
	/**  
	 * ���� cORPCTRREL_FLAG  
	 * @param cORPCTRREL_FLAG ��ͬ��������Ϣ���ϱ���־  
	 */
	public void setCORPCTRREL_FLAG(String cORPCTRRELFLAG) {
		CORPCTRREL_FLAG = cORPCTRRELFLAG;
	}
	/**  
	 * ��ȡ cORPCTRLIM_FLAG
	 * @return the cORPCTRLIM_FLAG �����Ϣ���ϱ���־ 
	 */
	public String getCORPCTRLIM_FLAG() {
		return CORPCTRLIM_FLAG;
	}
	/**  
	 * ���� cORPCTRLIM_FLAG  
	 * @param cORPCTRLIM_FLAG �����Ϣ���ϱ���־  
	 */
	public void setCORPCTRLIM_FLAG(String cORPCTRLIMFLAG) {
		CORPCTRLIM_FLAG = cORPCTRLIMFLAG;
	}
	/**  
	 * ��ȡ infRecType
	 * @return the infRecType ��Ϣ��¼���� [1..1] 
	 */
	public String getInfRecType() {
		return InfRecType;
	}
	/**  
	 * ���� infRecType  
	 * @param infRecType ��Ϣ��¼���� [1..1]  
	 */
	public void setInfRecType(String infRecType) {
		InfRecType = infRecType;
	}
	/**  
	 * ��ȡ contractCode
	 * @return the contractCode ����Э���ʶ�� [1..1] 
	 */
	public String getContractCode() {
		return ContractCode;
	}
	/**  
	 * ���� contractCode  
	 * @param contractCode ����Э���ʶ�� [1..1]  
	 */
	public void setContractCode(String contractCode) {
		ContractCode = contractCode;
	}
	/**  
	 * ��ȡ rptDate
	 * @return the rptDate ��Ϣ�������� [1..1] 
	 */
	public String getRptDate() {
		return RptDate;
	}
	/**  
	 * ���� rptDate  
	 * @param rptDate ��Ϣ�������� [1..1]  
	 */
	public void setRptDate(String rptDate) {
		RptDate = rptDate;
	}
	/**  
	 * ��ȡ rptDateCode
	 * @return the rptDateCode ����ʱ��˵������ [1..1] 
	 */
	public String getRptDateCode() {
		return RptDateCode;
	}
	/**  
	 * ���� rptDateCode  
	 * @param rptDateCode ����ʱ��˵������ [1..1]  
	 */
	public void setRptDateCode(String rptDateCode) {
		RptDateCode = rptDateCode;
	}
	/**  
	 * ��ȡ name
	 * @return the name ���������� [1..1] 
	 */
	public String getName() {
		return Name;
	}
	/**  
	 * ���� name  
	 * @param name ���������� [1..1]  
	 */
	public void setName(String name) {
		Name = name;
	}
	/**  
	 * ��ȡ iDType
	 * @return the iDType ��������ݱ�ʶ���� [1..1] 
	 */
	public String getIDType() {
		return IDType;
	}
	/**  
	 * ���� iDType  
	 * @param iDType ��������ݱ�ʶ���� [1..1]  
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}
	/**  
	 * ��ȡ iDNum
	 * @return the iDNum ��������ݱ�ʶ֤������ [1..1] 
	 */
	public String getIDNum() {
		return IDNum;
	}
	/**  
	 * ���� iDNum  
	 * @param iDNum ��������ݱ�ʶ֤������ [1..1]  
	 */
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}
	/**  
	 * ��ȡ mngmtOrgCode
	 * @return the mngmtOrgCode ҵ������������ [1..1] 
	 */
	public String getMngmtOrgCode() {
		return MngmtOrgCode;
	}
	/**  
	 * ���� mngmtOrgCode  
	 * @param mngmtOrgCode ҵ������������ [1..1]  
	 */
	public void setMngmtOrgCode(String mngmtOrgCode) {
		MngmtOrgCode = mngmtOrgCode;
	}
	/**  
	 * ��ȡ creditLimType
	 * @return the creditLimType ���Ŷ������ [1..1] 
	 */
	public String getCreditLimType() {
		return CreditLimType;
	}
	/**  
	 * ���� creditLimType  
	 * @param creditLimType ���Ŷ������ [1..1]  
	 */
	public void setCreditLimType(String creditLimType) {
		CreditLimType = creditLimType;
	}
	/**  
	 * ��ȡ limLoopFlg
	 * @return the limLoopFlg ���ѭ����־ [1..1] 
	 */
	public String getLimLoopFlg() {
		return LimLoopFlg;
	}
	/**  
	 * ���� limLoopFlg  
	 * @param limLoopFlg ���ѭ����־ [1..1]  
	 */
	public void setLimLoopFlg(String limLoopFlg) {
		LimLoopFlg = limLoopFlg;
	}
	/**  
	 * ��ȡ creditLim
	 * @return the creditLim ���Ŷ�� [1..1] 
	 */
	public String getCreditLim() {
		return CreditLim;
	}
	/**  
	 * ���� creditLim  
	 * @param creditLim ���Ŷ�� [1..1]  
	 */
	public void setCreditLim(String creditLim) {
		CreditLim = creditLim;
	}
	/**  
	 * ��ȡ cy
	 * @return the cy ���� [1..1] 
	 */
	public String getCy() {
		return Cy;
	}
	/**  
	 * ���� cy  
	 * @param cy ���� [1..1]  
	 */
	public void setCy(String cy) {
		Cy = cy;
	}
	/**  
	 * ��ȡ conEffDate
	 * @return the conEffDate �����Ч���� [1..1] 
	 */
	public String getConEffDate() {
		return ConEffDate;
	}
	/**  
	 * ���� conEffDate  
	 * @param conEffDate �����Ч���� [1..1]  
	 */
	public void setConEffDate(String conEffDate) {
		ConEffDate = conEffDate;
	}
	/**  
	 * ��ȡ conExpDate
	 * @return the conExpDate ��ȵ������� [1..1] 
	 */
	public String getConExpDate() {
		return ConExpDate;
	}
	/**  
	 * ���� conExpDate  
	 * @param conExpDate ��ȵ������� [1..1]  
	 */
	public void setConExpDate(String conExpDate) {
		ConExpDate = conExpDate;
	}
	/**  
	 * ��ȡ conStatus
	 * @return the conStatus ���״̬ [1..1] 
	 */
	public String getConStatus() {
		return ConStatus;
	}
	/**  
	 * ���� conStatus  
	 * @param conStatus ���״̬ [1..1]  
	 */
	public void setConStatus(String conStatus) {
		ConStatus = conStatus;
	}
	/**  
	 * ��ȡ creditRest
	 * @return the creditRest �����޶� 
	 */
	public String getCreditRest() {
		return CreditRest;
	}
	/**  
	 * ���� creditRest  
	 * @param creditRest �����޶�  
	 */
	public void setCreditRest(String creditRest) {
		CreditRest = creditRest;
	}
	/**  
	 * ��ȡ creditRestCode
	 * @return the creditRestCode �����޶��� 
	 */
	public String getCreditRestCode() {
		return CreditRestCode;
	}
	/**  
	 * ���� creditRestCode  
	 * @param creditRestCode �����޶���  
	 */
	public void setCreditRestCode(String creditRestCode) {
		CreditRestCode = creditRestCode;
	}
	/**  
	 * ��ȡ eb_CorpCtrRel_Info_List
	 * @return the eb_CorpCtrRel_Info_List ��ҵ����Э�鹲ͬ��������Ϣ�� 
	 */
	public List<Eb_CorpCtrRel_Info> getEb_CorpCtrRel_Info_List() {
		return Eb_CorpCtrRel_Info_List;
	}
	/**  
	 * ���� eb_CorpCtrRel_Info_List  
	 * @param eb_CorpCtrRel_Info_List ��ҵ����Э�鹲ͬ��������Ϣ��  
	 */
	public void setEb_CorpCtrRel_Info_List(
			List<Eb_CorpCtrRel_Info> eb_CorpCtrRel_Info_List) {
		Eb_CorpCtrRel_Info_List = eb_CorpCtrRel_Info_List;
	}
}
