package com.dhcc.xml.per.entity.loaninfo.db;

import java.util.List;

/**  
  * Title: Eb_AcctMdf_Info<br/>  
  * Description: ���˽�����θ��������¼������<br/>  
  * @author ChenJingYuan  
  * @date 2018-8-8  
  */  
public class Pb_AcctMdf_Info {
	/**������Ϣ*/  
	private String Record_Id;
	/**��Ϣ��¼����[1..1]*/
	private String InfRecType;
	/**������ҵ���ʶ[1..1]*/
	private String ModRecCode;
	/**��Ϣ��������[1..1]*/
	private String RptDate;
	/**�˻�����*/  
	private String AcctType;
	/**�������ζα�[1..1]*/
	private String MdfcSgmtCode;
	/**����˻���Ϣ��*/  
	private Pb_Lnacct_Info Pb_Lnacct_Info;
	/**��ػ��������˶�*/
	private List<Pb_Lnacctrlt_Info> Pb_Lnacctrlt_Info_List;
	/**�¶ȱ�����Ϣ��*/
	private Pb_Lnacctmonth_Info Pb_Lnacctmonth_Info;
	/**���¶ȱ�����Ϣ��*/
	private Pb_Lnacctdbt_Info Pb_Lnacctdbt_Info;
	/**���⽻��˵����*/
	private List<Pb_Lnacctspc_Info> Pb_Lnacctspc_Info_List;
	/**����Ѻ����Ϣ��*/  
	private List<Pb_Guacct_Info> Pb_Guacct_Info_List;
	public Pb_AcctMdf_Info() {
		super();
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
	 * ��ȡ pb_Lnacct_Info
	 * @return the pb_Lnacct_Info ����˻���Ϣ�� 
	 */
	public Pb_Lnacct_Info getPb_Lnacct_Info() {
		return Pb_Lnacct_Info;
	}
	/**  
	 * ���� pb_Lnacct_Info  
	 * @param pb_Lnacct_Info ����˻���Ϣ��  
	 */
	public void setPb_Lnacct_Info(Pb_Lnacct_Info pb_Lnacct_Info) {
		Pb_Lnacct_Info = pb_Lnacct_Info;
	}
	/**  
	 * ��ȡ pb_Lnacctrlt_Info_List
	 * @return the pb_Lnacctrlt_Info_List ��ػ��������˶� 
	 */
	public List<Pb_Lnacctrlt_Info> getPb_Lnacctrlt_Info_List() {
		return Pb_Lnacctrlt_Info_List;
	}
	/**  
	 * ���� pb_Lnacctrlt_Info_List  
	 * @param pb_Lnacctrlt_Info_List ��ػ��������˶�  
	 */
	public void setPb_Lnacctrlt_Info_List(
			List<Pb_Lnacctrlt_Info> pb_Lnacctrlt_Info_List) {
		Pb_Lnacctrlt_Info_List = pb_Lnacctrlt_Info_List;
	}
	
	/**  
	 * ��ȡ pb_Lnacctmonth_Info
	 * @return the pb_Lnacctmonth_Info �¶ȱ�����Ϣ�� 
	 */
	public Pb_Lnacctmonth_Info getPb_Lnacctmonth_Info() {
		return Pb_Lnacctmonth_Info;
	}
	/**  
	 * ���� pb_Lnacctmonth_Info  
	 * @param pb_Lnacctmonth_Info �¶ȱ�����Ϣ��  
	 */
	public void setPb_Lnacctmonth_Info(Pb_Lnacctmonth_Info pb_Lnacctmonth_Info) {
		Pb_Lnacctmonth_Info = pb_Lnacctmonth_Info;
	}
	/**  
	 * ��ȡ pb_Lnacctdbt_Info
	 * @return the pb_Lnacctdbt_Info ���¶ȱ�����Ϣ�� 
	 */
	public Pb_Lnacctdbt_Info getPb_Lnacctdbt_Info() {
		return Pb_Lnacctdbt_Info;
	}
	/**  
	 * ���� pb_Lnacctdbt_Info  
	 * @param pb_Lnacctdbt_Info ���¶ȱ�����Ϣ��  
	 */
	public void setPb_Lnacctdbt_Info(Pb_Lnacctdbt_Info pb_Lnacctdbt_Info) {
		Pb_Lnacctdbt_Info = pb_Lnacctdbt_Info;
	}
	/**  
	 * ��ȡ pb_Lnacctspc_Info_List
	 * @return the pb_Lnacctspc_Info_List ���⽻��˵���� 
	 */
	public List<Pb_Lnacctspc_Info> getPb_Lnacctspc_Info_List() {
		return Pb_Lnacctspc_Info_List;
	}
	/**  
	 * ���� pb_Lnacctspc_Info_List  
	 * @param pb_Lnacctspc_Info_List ���⽻��˵����  
	 */
	public void setPb_Lnacctspc_Info_List(
			List<Pb_Lnacctspc_Info> pb_Lnacctspc_Info_List) {
		Pb_Lnacctspc_Info_List = pb_Lnacctspc_Info_List;
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
}
