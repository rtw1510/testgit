package com.dhcc.xml.per.entity.baseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: EduInfSgmt<br/>
 * Description: ���˻�����Ϣ��¼-������Ϣ�� <br/>
 *
 * @author ChenJingYuan
 * @date 2018��3��27��
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = {"EduLevel", "AcaDegree", "EduInfoUpDate"},namespace = "com.dhcc.xml.per.entity.baseinfo")
public class EduInfSgmt{
    /**
     * ѧ��[1..1]
     */
    private String EduLevel;
    /**
     * ѧλ[1..1]
     */
    private String AcaDegree;
    /**
     * ��Ϣ��������[1..1]
     */
    private String EduInfoUpDate;

    public EduInfSgmt() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * ��ȡ eduLevel
     *
     * @return the eduLevel ѧ��[1..1]
     */
    public String getEduLevel() {
        return EduLevel;
    }

    /**
     * ���� eduLevel
     *
     * @param eduLevel ѧ��[1..1]
     */
    public void setEduLevel(String eduLevel) {
        EduLevel = eduLevel;
    }

    /**
     * ��ȡ acaDegree
     *
     * @return the acaDegree ѧλ[1..1]
     */
    public String getAcaDegree() {
        return AcaDegree;
    }

    /**
     * ���� acaDegree
     *
     * @param acaDegree ѧλ[1..1]
     */
    public void setAcaDegree(String acaDegree) {
        AcaDegree = acaDegree;
    }

    /**
     * ��ȡ eduInfoUpDate
     *
     * @return the eduInfoUpDate ��Ϣ��������[1..1]
     */
    public String getEduInfoUpDate() {
        return EduInfoUpDate;
    }

    /**
     * ���� eduInfoUpDate
     *
     * @param eduInfoUpDate ��Ϣ��������[1..1]
     */
    public void setEduInfoUpDate(String eduInfoUpDate) {
        EduInfoUpDate = eduInfoUpDate;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "EduInfSgmt [EduLevel=" + EduLevel + ", AcaDegree=" + AcaDegree
                + ", EduInfoUpDate=" + EduInfoUpDate + "]";
    }
}
