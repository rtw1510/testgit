package com.dhcc.xml.ent.entity.loaninfo.db;

/**
 * Title: Eb_CorpAccRlt_Info<br/>
 * Description: 企业借贷账户还款相关责任人<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-7-25
 */
public class Eb_CorpAccRlt_Info {
	/**
	 *账户标识号码
	 */
	private String AcctCode;
	/**
	 *身份类别 [1..1]
	 */
	private String ArlpIDType; 
	/**
	 *责任人名称 [1..1]
	 */
	private String ArlpName; 
	/**
	 *责任人身份标识类型 [1..1]
	 */
	private String ArlpCertType; 
	/**
	 *责任人身份标识号码 [1..1]
	 */
	private String ArlpCertNum; 
	/**
	 *还款责任人类型 [1..1]
	 */
	private String ArlpType; 
	/**
	 *还款责任金额 [1..1]
	 */
	private String ArlpAmt; 
	/**
	 *联保标志 [1..1]
	 */
	private String WartySign; 
	/**
	 *最高额保证合同标识码 [1..1]
	 */
	private String MaxGuarMcc;
	public Eb_CorpAccRlt_Info() {
		super();
	}
	/**  
	 * 获取 acctCode
	 * @return the acctCode 账户标识号码 
	 */
	public String getAcctCode() {
		return AcctCode;
	}
	/**  
	 * 设置 acctCode  
	 * @param acctCode 账户标识号码  
	 */
	public void setAcctCode(String acctCode) {
		AcctCode = acctCode;
	}
	/**  
	 * 获取 arlpIDType
	 * @return the arlpIDType 身份类别 [1..1] 
	 */
	public String getArlpIDType() {
		return ArlpIDType;
	}
	/**  
	 * 设置 arlpIDType  
	 * @param arlpIDType 身份类别 [1..1]  
	 */
	public void setArlpIDType(String arlpIDType) {
		ArlpIDType = arlpIDType;
	}
	/**  
	 * 获取 arlpName
	 * @return the arlpName 责任人名称 [1..1] 
	 */
	public String getArlpName() {
		return ArlpName;
	}
	/**  
	 * 设置 arlpName  
	 * @param arlpName 责任人名称 [1..1]  
	 */
	public void setArlpName(String arlpName) {
		ArlpName = arlpName;
	}
	/**  
	 * 获取 arlpCertType
	 * @return the arlpCertType 责任人身份标识类型 [1..1] 
	 */
	public String getArlpCertType() {
		return ArlpCertType;
	}
	/**  
	 * 设置 arlpCertType  
	 * @param arlpCertType 责任人身份标识类型 [1..1]  
	 */
	public void setArlpCertType(String arlpCertType) {
		ArlpCertType = arlpCertType;
	}
	/**  
	 * 获取 arlpCertNum
	 * @return the arlpCertNum 责任人身份标识号码 [1..1] 
	 */
	public String getArlpCertNum() {
		return ArlpCertNum;
	}
	/**  
	 * 设置 arlpCertNum  
	 * @param arlpCertNum 责任人身份标识号码 [1..1]  
	 */
	public void setArlpCertNum(String arlpCertNum) {
		ArlpCertNum = arlpCertNum;
	}
	/**  
	 * 获取 arlpType
	 * @return the arlpType 还款责任人类型 [1..1] 
	 */
	public String getArlpType() {
		return ArlpType;
	}
	/**  
	 * 设置 arlpType  
	 * @param arlpType 还款责任人类型 [1..1]  
	 */
	public void setArlpType(String arlpType) {
		ArlpType = arlpType;
	}
	/**  
	 * 获取 arlpAmt
	 * @return the arlpAmt 还款责任金额 [1..1] 
	 */
	public String getArlpAmt() {
		return ArlpAmt;
	}
	/**  
	 * 设置 arlpAmt  
	 * @param arlpAmt 还款责任金额 [1..1]  
	 */
	public void setArlpAmt(String arlpAmt) {
		ArlpAmt = arlpAmt;
	}
	/**  
	 * 获取 wartySign
	 * @return the wartySign 联保标志 [1..1] 
	 */
	public String getWartySign() {
		return WartySign;
	}
	/**  
	 * 设置 wartySign  
	 * @param wartySign 联保标志 [1..1]  
	 */
	public void setWartySign(String wartySign) {
		WartySign = wartySign;
	}
	/**  
	 * 获取 maxGuarMcc
	 * @return the maxGuarMcc 最高额保证合同标识码 [1..1] 
	 */
	public String getMaxGuarMcc() {
		return MaxGuarMcc;
	}
	/**  
	 * 设置 maxGuarMcc  
	 * @param maxGuarMcc 最高额保证合同标识码 [1..1]  
	 */
	public void setMaxGuarMcc(String maxGuarMcc) {
		MaxGuarMcc = maxGuarMcc;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Eb_CorpAccRlt_Info [AcctCode=" + AcctCode + ", ArlpAmt="
				+ ArlpAmt + ", ArlpCertNum=" + ArlpCertNum + ", ArlpCertType="
				+ ArlpCertType + ", ArlpIDType=" + ArlpIDType + ", ArlpName="
				+ ArlpName + ", ArlpType=" + ArlpType + ", MaxGuarMcc="
				+ MaxGuarMcc + ", WartySign=" + WartySign + "]";
	} 
}
