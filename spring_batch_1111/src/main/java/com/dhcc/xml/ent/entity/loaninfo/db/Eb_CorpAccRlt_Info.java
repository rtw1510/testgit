package com.dhcc.xml.ent.entity.loaninfo.db;

/**
 * Title: Eb_CorpAccRlt_Info<br/>
 * Description: ��ҵ����˻��������������<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-7-25
 */
public class Eb_CorpAccRlt_Info {
	/**
	 *�˻���ʶ����
	 */
	private String AcctCode;
	/**
	 *������ [1..1]
	 */
	private String ArlpIDType; 
	/**
	 *���������� [1..1]
	 */
	private String ArlpName; 
	/**
	 *��������ݱ�ʶ���� [1..1]
	 */
	private String ArlpCertType; 
	/**
	 *��������ݱ�ʶ���� [1..1]
	 */
	private String ArlpCertNum; 
	/**
	 *�������������� [1..1]
	 */
	private String ArlpType; 
	/**
	 *�������ν�� [1..1]
	 */
	private String ArlpAmt; 
	/**
	 *������־ [1..1]
	 */
	private String WartySign; 
	/**
	 *��߶֤��ͬ��ʶ�� [1..1]
	 */
	private String MaxGuarMcc;
	public Eb_CorpAccRlt_Info() {
		super();
	}
	/**  
	 * ��ȡ acctCode
	 * @return the acctCode �˻���ʶ���� 
	 */
	public String getAcctCode() {
		return AcctCode;
	}
	/**  
	 * ���� acctCode  
	 * @param acctCode �˻���ʶ����  
	 */
	public void setAcctCode(String acctCode) {
		AcctCode = acctCode;
	}
	/**  
	 * ��ȡ arlpIDType
	 * @return the arlpIDType ������ [1..1] 
	 */
	public String getArlpIDType() {
		return ArlpIDType;
	}
	/**  
	 * ���� arlpIDType  
	 * @param arlpIDType ������ [1..1]  
	 */
	public void setArlpIDType(String arlpIDType) {
		ArlpIDType = arlpIDType;
	}
	/**  
	 * ��ȡ arlpName
	 * @return the arlpName ���������� [1..1] 
	 */
	public String getArlpName() {
		return ArlpName;
	}
	/**  
	 * ���� arlpName  
	 * @param arlpName ���������� [1..1]  
	 */
	public void setArlpName(String arlpName) {
		ArlpName = arlpName;
	}
	/**  
	 * ��ȡ arlpCertType
	 * @return the arlpCertType ��������ݱ�ʶ���� [1..1] 
	 */
	public String getArlpCertType() {
		return ArlpCertType;
	}
	/**  
	 * ���� arlpCertType  
	 * @param arlpCertType ��������ݱ�ʶ���� [1..1]  
	 */
	public void setArlpCertType(String arlpCertType) {
		ArlpCertType = arlpCertType;
	}
	/**  
	 * ��ȡ arlpCertNum
	 * @return the arlpCertNum ��������ݱ�ʶ���� [1..1] 
	 */
	public String getArlpCertNum() {
		return ArlpCertNum;
	}
	/**  
	 * ���� arlpCertNum  
	 * @param arlpCertNum ��������ݱ�ʶ���� [1..1]  
	 */
	public void setArlpCertNum(String arlpCertNum) {
		ArlpCertNum = arlpCertNum;
	}
	/**  
	 * ��ȡ arlpType
	 * @return the arlpType �������������� [1..1] 
	 */
	public String getArlpType() {
		return ArlpType;
	}
	/**  
	 * ���� arlpType  
	 * @param arlpType �������������� [1..1]  
	 */
	public void setArlpType(String arlpType) {
		ArlpType = arlpType;
	}
	/**  
	 * ��ȡ arlpAmt
	 * @return the arlpAmt �������ν�� [1..1] 
	 */
	public String getArlpAmt() {
		return ArlpAmt;
	}
	/**  
	 * ���� arlpAmt  
	 * @param arlpAmt �������ν�� [1..1]  
	 */
	public void setArlpAmt(String arlpAmt) {
		ArlpAmt = arlpAmt;
	}
	/**  
	 * ��ȡ wartySign
	 * @return the wartySign ������־ [1..1] 
	 */
	public String getWartySign() {
		return WartySign;
	}
	/**  
	 * ���� wartySign  
	 * @param wartySign ������־ [1..1]  
	 */
	public void setWartySign(String wartySign) {
		WartySign = wartySign;
	}
	/**  
	 * ��ȡ maxGuarMcc
	 * @return the maxGuarMcc ��߶֤��ͬ��ʶ�� [1..1] 
	 */
	public String getMaxGuarMcc() {
		return MaxGuarMcc;
	}
	/**  
	 * ���� maxGuarMcc  
	 * @param maxGuarMcc ��߶֤��ͬ��ʶ�� [1..1]  
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
