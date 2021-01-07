package com.dhcc.xml.per.entity.motgacltalctrctinfo.db;

/**  
  * Title: Pb_GuacctImp_Info<br/>  
  * Description: ����Ѻ��ͬ������Ϣ�α���<br/>  
  * @author ChenJingYuan  
  * @date 2018-8-11  
  */  
public class Pb_GuacctImp_Info {
	/**
	 *�������� [1..1]
	 */
	private String ImpType;
	/**
	 *�����ֵ [1..1]
	 */
	private String ImpVal;
	/**
	 *���� [1..1]
	 */
	private String ImpCy;
	/**
	 *���������� [1..1]
	 */
	private String Ippc;
	/**
	 *���������� [1..1]
	 */
	private String PawnName;
	/**
	 *��������ݱ�ʶ���� [1..1]
	 */
	private String PawnCertType;
	/**
	 *��������ݱ�ʶ���� [1..1]
	 */
	private String PawnCertNum;
	
	public String getImpCy() {
		return ImpCy;
	}
	public void setImpCy(String impCy) {
		ImpCy = impCy;
	}
	public String getImpType() {
		return ImpType;
	}
	public void setImpType(String impType) {
		ImpType = impType;
	}
	public String getImpVal() {
		return ImpVal;
	}
	public void setImpVal(String impVal) {
		ImpVal = impVal;
	}
	public String getIppc() {
		return Ippc;
	}
	public void setIppc(String ippc) {
		Ippc = ippc;
	}
	public String getPawnName() {
		return PawnName;
	}
	public void setPawnName(String pawnName) {
		PawnName = pawnName;
	}
	public String getPawnCertType() {
		return PawnCertType;
	}
	public void setPawnCertType(String pawnCertType) {
		PawnCertType = pawnCertType;
	}
	public String getPawnCertNum() {
		return PawnCertNum;
	}
	public void setPawnCertNum(String pawnCertNum) {
		PawnCertNum = pawnCertNum;
	}
}
