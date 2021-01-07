package com.dhcc.xml.ent.entity.loaninfo.db;

/**  
  * Title: Pb_Guacct_Info<br/>  
  * Description: 个人借贷抵质押信息关联表<br/>  
  * @author ChenJingYuan  
  * @date 2018-11-30  
  */  
public class Eb_Guacct_Info {
	
	/**
	 *（质）押合同标识码 [1..1]
	 */
	private String CcCode;

	/**  
	 * 获取 ccCode
	 * @return the ccCode （质）押合同标识码 [1..1] 
	 */
	public String getCcCode() {
		return CcCode;
	}

	/**  
	 * 设置 ccCode  
	 * @param ccCode （质）押合同标识码 [1..1]  
	 */
	public void setCcCode(String ccCode) {
		CcCode = ccCode;
	}
	
}
