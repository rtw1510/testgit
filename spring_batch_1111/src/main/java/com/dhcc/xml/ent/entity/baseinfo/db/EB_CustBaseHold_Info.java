package com.dhcc.xml.ent.entity.baseinfo.db;

/**
 * Title: EB_CustBaseHold_Info<br/>
 * Description: ��ҵ������Ϣע���ʱ�����Ҫ�����˱�<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
public class EB_CustBaseHold_Info {
	/**
	 * ����������[0..1]
	 */
	private String SharHodType;
	/**
	 * ������������[0..1]
	 */
	private String SharHodCertType;
	/**
	 * ����������[0..1]
	 */
	private String SharHodName;
	 /**
	 *��������ݱ�ʶ����[0..1]
	 */  
	private String SharHodIDType;
	/**
	 * ��������ݱ�ʶ����[0..1]
	 */
	private String SharHodIDNum;
	/**
	 * ���ʱ���[0..1]
	 */
	private String InvRatio;

	public EB_CustBaseHold_Info() {
		super();
	}

	/**  
	 * ��ȡ sharHodType
	 * @return the sharHodType ����������[0..1] 
	 */
	public String getSharHodType() {
		return SharHodType;
	}

	/**  
	 * ���� sharHodType  
	 * @param sharHodType ����������[0..1]  
	 */
	public void setSharHodType(String sharHodType) {
		SharHodType = sharHodType;
	}

	/**  
	 * ��ȡ sharHodCertType
	 * @return the sharHodCertType ������������[0..1] 
	 */
	public String getSharHodCertType() {
		return SharHodCertType;
	}

	/**  
	 * ���� sharHodCertType  
	 * @param sharHodCertType ������������[0..1]  
	 */
	public void setSharHodCertType(String sharHodCertType) {
		SharHodCertType = sharHodCertType;
	}

	/**  
	 * ��ȡ sharHodName
	 * @return the sharHodName ����������[0..1] 
	 */
	public String getSharHodName() {
		return SharHodName;
	}

	/**  
	 * ���� sharHodName  
	 * @param sharHodName ����������[0..1]  
	 */
	public void setSharHodName(String sharHodName) {
		SharHodName = sharHodName;
	}

	/**  
	 * ��ȡ sharHodIDType
	 * @return the sharHodIDType ��������ݱ�ʶ����[0..1] 
	 */
	public String getSharHodIDType() {
		return SharHodIDType;
	}

	/**  
	 * ���� sharHodIDType  
	 * @param sharHodIDType ��������ݱ�ʶ����[0..1]  
	 */
	public void setSharHodIDType(String sharHodIDType) {
		SharHodIDType = sharHodIDType;
	}

	/**  
	 * ��ȡ sharHodIDNum
	 * @return the sharHodIDNum ��������ݱ�ʶ����[0..1] 
	 */
	public String getSharHodIDNum() {
		return SharHodIDNum;
	}

	/**  
	 * ���� sharHodIDNum  
	 * @param sharHodIDNum ��������ݱ�ʶ����[0..1]  
	 */
	public void setSharHodIDNum(String sharHodIDNum) {
		SharHodIDNum = sharHodIDNum;
	}

	/**  
	 * ��ȡ invRatio
	 * @return the invRatio ���ʱ���[0..1] 
	 */
	public String getInvRatio() {
		return InvRatio;
	}

	/**  
	 * ���� invRatio  
	 * @param invRatio ���ʱ���[0..1]  
	 */
	public void setInvRatio(String invRatio) {
		InvRatio = invRatio;
	}

}
