package com.dhcc.xml.ent.entity.loaninfo.db;

/**  
  * Title: Pb_Guacct_Info<br/>  
  * Description: ���˽������Ѻ��Ϣ������<br/>  
  * @author ChenJingYuan  
  * @date 2018-11-30  
  */  
public class Eb_Guacct_Info {
	
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
