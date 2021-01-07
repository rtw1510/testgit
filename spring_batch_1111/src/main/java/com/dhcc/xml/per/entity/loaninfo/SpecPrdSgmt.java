package com.dhcc.xml.per.entity.loaninfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: SpecPrdSgmt<br/>
 * Description:���˽���˻���Ϣ��¼���ר�������Ϣ�� <br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "SpecLine", "SpecEfctDate", "SpecEndDate", "UsedInstAmt" },namespace = "com.dhcc.xml.per.entity.loaninfo")
public class SpecPrdSgmt {
	/** ���ר����ڶ�� [1..1] */
	private String SpecLine;
	/** ���ڶ����Ч���� [1..1] */
	private String SpecEfctDate;
	/** ���ڶ�ȵ������� [1..1] */
	private String SpecEndDate;
	/** ���÷��ڽ�� [1..1] */
	private String UsedInstAmt;
	public SpecPrdSgmt() {
		super();
	}
	/**  
	 * ��ȡ specLine
	 * @return the specLine ���ר����ڶ�� [1..1] 
	 */
	public String getSpecLine() {
		return SpecLine;
	}
	/**  
	 * ���� specLine  
	 * @param specLine ���ר����ڶ�� [1..1]  
	 */
	public void setSpecLine(String specLine) {
		SpecLine = specLine;
	}
	/**  
	 * ��ȡ specEfctDate
	 * @return the specEfctDate ���ڶ����Ч���� [1..1] 
	 */
	public String getSpecEfctDate() {
		return SpecEfctDate;
	}
	/**  
	 * ���� specEfctDate  
	 * @param specEfctDate ���ڶ����Ч���� [1..1]  
	 */
	public void setSpecEfctDate(String specEfctDate) {
		SpecEfctDate = specEfctDate;
	}
	/**  
	 * ��ȡ specEndDate
	 * @return the specEndDate ���ڶ�ȵ������� [1..1] 
	 */
	public String getSpecEndDate() {
		return SpecEndDate;
	}
	/**  
	 * ���� specEndDate  
	 * @param specEndDate ���ڶ�ȵ������� [1..1]  
	 */
	public void setSpecEndDate(String specEndDate) {
		SpecEndDate = specEndDate;
	}
	/**  
	 * ��ȡ usedInstAmt
	 * @return the usedInstAmt ���÷��ڽ�� [1..1] 
	 */
	public String getUsedInstAmt() {
		return UsedInstAmt;
	}
	/**  
	 * ���� usedInstAmt  
	 * @param usedInstAmt ���÷��ڽ�� [1..1]  
	 */
	public void setUsedInstAmt(String usedInstAmt) {
		UsedInstAmt = usedInstAmt;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SpecPrdSgmt [SpecLine=" + SpecLine + ", SpecEfctDate="
				+ SpecEfctDate + ", SpecEndDate=" + SpecEndDate
				+ ", UsedInstAmt=" + UsedInstAmt + "]";
	}
}
