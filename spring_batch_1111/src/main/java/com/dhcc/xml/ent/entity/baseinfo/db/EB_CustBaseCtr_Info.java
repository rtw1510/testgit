package com.dhcc.xml.ent.entity.baseinfo.db;

/**
 * Title: EB_CustBaseCtr_Info<br/>
 * Description:ʵ�ʿ����˶�ӳ�����Ӧ���ֶ� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
public class EB_CustBaseCtr_Info {
	/**
	 *ʵ�ʿ�����������[1..1]
	 */
	private String ActuCotrlCertType;
	/**
	 * ʵ�ʿ���������[1..1]
	 */
	private String ActuCotrlName;
	/**
	 * ʵ�ʿ�������ݱ�ʶ����[1..1]
	 */
	private String ActuCotrlIDType;
	/**
	 * ʵ�ʿ�������ݱ�ʶ����[1..1]
	 */
	private String ActuCotrlIDNum;

	public EB_CustBaseCtr_Info() {
		super();
	}

	/**  
	 * ��ȡ actuCotrlCertType
	 * @return the actuCotrlCertType ʵ�ʿ�����������[1..1] 
	 */
	public String getActuCotrlCertType() {
		return ActuCotrlCertType;
	}

	/**  
	 * ���� actuCotrlCertType  
	 * @param actuCotrlCertType ʵ�ʿ�����������[1..1]  
	 */
	public void setActuCotrlCertType(String actuCotrlCertType) {
		ActuCotrlCertType = actuCotrlCertType;
	}

	/**  
	 * ��ȡ actuCotrlName
	 * @return the actuCotrlName ʵ�ʿ���������[1..1] 
	 */
	public String getActuCotrlName() {
		return ActuCotrlName;
	}

	/**  
	 * ���� actuCotrlName  
	 * @param actuCotrlName ʵ�ʿ���������[1..1]  
	 */
	public void setActuCotrlName(String actuCotrlName) {
		ActuCotrlName = actuCotrlName;
	}

	/**  
	 * ��ȡ actuCotrlIDType
	 * @return the actuCotrlIDType ʵ�ʿ�������ݱ�ʶ����[1..1] 
	 */
	public String getActuCotrlIDType() {
		return ActuCotrlIDType;
	}

	/**  
	 * ���� actuCotrlIDType  
	 * @param actuCotrlIDType ʵ�ʿ�������ݱ�ʶ����[1..1]  
	 */
	public void setActuCotrlIDType(String actuCotrlIDType) {
		ActuCotrlIDType = actuCotrlIDType;
	}

	/**  
	 * ��ȡ actuCotrlIDNum
	 * @return the actuCotrlIDNum ʵ�ʿ�������ݱ�ʶ����[1..1] 
	 */
	public String getActuCotrlIDNum() {
		return ActuCotrlIDNum;
	}

	/**  
	 * ���� actuCotrlIDNum  
	 * @param actuCotrlIDNum ʵ�ʿ�������ݱ�ʶ����[1..1]  
	 */
	public void setActuCotrlIDNum(String actuCotrlIDNum) {
		ActuCotrlIDNum = actuCotrlIDNum;
	}
}
