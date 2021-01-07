package com.dhcc.xml.per.entity.guarantee.db;

/**  
  * Title: Pb_Guacct_Info<br/>  
  * Description: ��Ѻ��Ϣ������<br/>  
  * @author ChenJingYuan  
  * @date 2018-11-30  
  */  
public class Pb_Guacct_Info {
	
	/**
	 *���ʣ�Ѻ��ͬ��ʶ�� [1..1]
	 */
	private String CcCode;

	/**  
	 * ��ȡ ccCode
	 * @return the ccCode ���ʣ�Ѻ��ͬ��ʶ�� [1..1] 
	 */
	public String getCcCode() {
		return CcCode;
	}

	/**  
	 * ���� ccCode  
	 * @param ccCode ���ʣ�Ѻ��ͬ��ʶ�� [1..1]  
	 */
	public void setCcCode(String ccCode) {
		CcCode = ccCode;
	}
	
}
