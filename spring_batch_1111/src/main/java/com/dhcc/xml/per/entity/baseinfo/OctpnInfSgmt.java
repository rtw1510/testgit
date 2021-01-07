package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: OctpnInfSgmt<br/>
 * Description: ���˻�����Ϣ��¼-ְҵ��Ϣ�� <br/>
 *
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = {"EmpStatus", "CpnName", "CpnType", "Industry",
        "CpnAddr", "CpnPc", "CpnDist", "CpnTEL", "Occupation", "Title",
        "TechTitle", "WorkStartDate", "OctpnInfoUpDate"},namespace = "com.dhcc.xml.per.entity.baseinfo")
public class OctpnInfSgmt{
    /**
     * ��ҵ״��[1..1]
     */
    private String EmpStatus;
    /**
     * ��λ����[0..1]
     */
    private String CpnName;
    /**
     * ��λ����[0..1]
     */
    private String CpnType;
    /**
     * ��λ������ҵ[0..1]
     */
    private String Industry;
    /**
     * ��λ��ϸ��ַ[0..1]
     */
    private String CpnAddr;
    /**
     * ��λ���ڵ��ʱ�[0..1]
     */
    private String CpnPc;
    /**
     * ��λ���ڵ���������[0..1]
     */
    private String CpnDist;
    /**
     * ��λ�绰[0..1]
     */
    private String CpnTEL;
    /**
     * ְҵ[0..1]
     */
    private String Occupation;
    /**
     * ְ��[0..1]
     */
    private String Title;
    /**
     * ְ��[0..1]
     */
    private String TechTitle;
    /**
     * ����λ������ʼ���[0..1]
     */
    private String WorkStartDate;
    /**
     * ��Ϣ��������[1..1]
     */
    private String OctpnInfoUpDate;

    public OctpnInfSgmt() {
        super();
    }

    /**
     * ��ȡ empStatus
     *
     * @return the empStatus ��ҵ״��[1..1]
     */
    public String getEmpStatus() {
        return EmpStatus;
    }

    /**
     * ���� empStatus
     *
     * @param empStatus ��ҵ״��[1..1]
     */
    public void setEmpStatus(String empStatus) {
        EmpStatus = empStatus;
    }

    /**
     * ��ȡ cpnName
     *
     * @return the cpnName ��λ����[0..1]
     */
    public String getCpnName() {
        return CpnName;
    }

    /**
     * ���� cpnName
     *
     * @param cpnName ��λ����[0..1]
     */
    public void setCpnName(String cpnName) {
        CpnName = cpnName;
    }

    /**
     * ��ȡ cpnType
     *
     * @return the cpnType ��λ����[0..1]
     */
    public String getCpnType() {
        return CpnType;
    }

    /**
     * ���� cpnType
     *
     * @param cpnType ��λ����[0..1]
     */
    public void setCpnType(String cpnType) {
        CpnType = cpnType;
    }

    /**
     * ��ȡ industry
     *
     * @return the industry ��λ������ҵ[0..1]
     */
    public String getIndustry() {
        return Industry;
    }

    /**
     * ���� industry
     *
     * @param industry ��λ������ҵ[0..1]
     */
    public void setIndustry(String industry) {
        Industry = industry;
    }

    /**
     * ��ȡ cpnAddr
     *
     * @return the cpnAddr ��λ��ϸ��ַ[0..1]
     */
    public String getCpnAddr() {
        return CpnAddr;
    }

    /**
     * ���� cpnAddr
     *
     * @param cpnAddr ��λ��ϸ��ַ[0..1]
     */
    public void setCpnAddr(String cpnAddr) {
        CpnAddr = cpnAddr;
    }

    /**
     * ��ȡ cpnPc
     *
     * @return the cpnPc ��λ���ڵ��ʱ�[0..1]
     */
    public String getCpnPc() {
        return CpnPc;
    }

    /**
     * ���� cpnPc
     *
     * @param cpnPc ��λ���ڵ��ʱ�[0..1]
     */
    public void setCpnPc(String cpnPc) {
        CpnPc = cpnPc;
    }

    /**
     * ��ȡ cpnDist
     *
     * @return the cpnDist ��λ���ڵ���������[0..1]
     */
    public String getCpnDist() {
        return CpnDist;
    }

    /**
     * ���� cpnDist
     *
     * @param cpnDist ��λ���ڵ���������[0..1]
     */
    public void setCpnDist(String cpnDist) {
        CpnDist = cpnDist;
    }

    /**
     * ��ȡ cpnTEL
     *
     * @return the cpnTEL ��λ�绰[0..1]
     */
    public String getCpnTEL() {
        return CpnTEL;
    }

    /**
     * ���� cpnTEL
     *
     * @param cpnTEL ��λ�绰[0..1]
     */
    public void setCpnTEL(String cpnTEL) {
        CpnTEL = cpnTEL;
    }

    /**
     * ��ȡ occupation
     *
     * @return the occupation ְҵ[0..1]
     */
    public String getOccupation() {
        return Occupation;
    }

    /**
     * ���� occupation
     *
     * @param occupation ְҵ[0..1]
     */
    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    /**
     * ��ȡ title
     *
     * @return the title ְ��[0..1]
     */
    public String getTitle() {
        return Title;
    }

    /**
     * ���� title
     *
     * @param title ְ��[0..1]
     */
    public void setTitle(String title) {
        Title = title;
    }

    /**
     * ��ȡ techTitle
     *
     * @return the techTitle ְ��[0..1]
     */
    public String getTechTitle() {
        return TechTitle;
    }

    /**
     * ���� techTitle
     *
     * @param techTitle ְ��[0..1]
     */
    public void setTechTitle(String techTitle) {
        TechTitle = techTitle;
    }

    /**
     * ��ȡ workStartDate
     *
     * @return the workStartDate ����λ������ʼ���[0..1]
     */
    public String getWorkStartDate() {
        return WorkStartDate;
    }

    /**
     * ���� workStartDate
     *
     * @param workStartDate ����λ������ʼ���[0..1]
     */
    public void setWorkStartDate(String workStartDate) {
        WorkStartDate = workStartDate;
    }

    /**
     * ��ȡ octpnInfoUpDate
     *
     * @return the octpnInfoUpDate ��Ϣ��������[1..1]
     */
    public String getOctpnInfoUpDate() {
        return OctpnInfoUpDate;
    }

    /**
     * ���� octpnInfoUpDate
     *
     * @param octpnInfoUpDate ��Ϣ��������[1..1]
     */
    public void setOctpnInfoUpDate(String octpnInfoUpDate) {
        OctpnInfoUpDate = octpnInfoUpDate;
    }

    @Override
    public String toString() {
        return "OctpnInfSgmt [EmpStatus=" + EmpStatus + ", CpnName=" + CpnName
                + ", CpnType=" + CpnType + ", Industry=" + Industry
                + ", CpnAddr=" + CpnAddr + ", CpnPc=" + CpnPc + ", CpnDist="
                + CpnDist + ", CpnTEL=" + CpnTEL + ", Occupation=" + Occupation
                + ", Title=" + Title + ", TechTitle=" + TechTitle
                + ", WorkStartDate=" + WorkStartDate + ", OctpnInfoUpDate="
                + OctpnInfoUpDate + "]";
    }
}
