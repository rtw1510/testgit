package com.dhcc.core.cache.entity;

/**
 * Author: HuLin
 * Date: 2020/11/5 11:48
 */
public class SRInfo {
    private String infrectype;
    private String infrectype_desc;
    private String xml_tag;
    private String xml_tag_name;
    private String xml_tag_desc;
    private String tag_lev;
    private String tag_sts;
    private String up_one;
    private String up_two;
    private String data_type;
    private String display;
    private String isnull;
    private String seq;
    private String other_desc;


    public String getIsnull() {
        return isnull;
    }

    public void setIsnull(String isnull) {
        this.isnull = isnull;
    }

    public String getInfrectype() {
        return infrectype;
    }

    public void setInfrectype(String infrectype) {
        this.infrectype = infrectype;
    }

    public String getInfrectype_desc() {
        return infrectype_desc;
    }

    public void setInfrectype_desc(String infrectype_desc) {
        this.infrectype_desc = infrectype_desc;
    }

    public String getXml_tag() {
        return xml_tag;
    }

    public void setXml_tag(String xml_tag) {
        this.xml_tag = xml_tag;
    }

    public String getXml_tag_name() {
        return xml_tag_name;
    }

    public void setXml_tag_name(String xml_tag_name) {
        this.xml_tag_name = xml_tag_name;
    }

    public String getXml_tag_desc() {
        return xml_tag_desc;
    }

    public void setXml_tag_desc(String xml_tag_desc) {
        this.xml_tag_desc = xml_tag_desc;
    }

    public String getTag_lev() {
        return tag_lev;
    }

    public void setTag_lev(String tag_lev) {
        this.tag_lev = tag_lev;
    }

    public String getTag_sts() {
        return tag_sts;
    }

    public void setTag_sts(String tag_sts) {
        this.tag_sts = tag_sts;
    }

    public String getUp_one() {
        return up_one;
    }

    public void setUp_one(String up_one) {
        this.up_one = up_one;
    }

    public String getUp_two() {
        return up_two;
    }

    public void setUp_two(String up_two) {
        this.up_two = up_two;
    }

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }


    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getOther_desc() {
        return other_desc;
    }

    public void setOther_desc(String other_desc) {
        this.other_desc = other_desc;
    }

    @Override
    public String toString() {
        return "SRInfo{" +
                "infrectype='" + infrectype + '\'' +
                ", infrectype_desc='" + infrectype_desc + '\'' +
                ", xml_tag='" + xml_tag + '\'' +
                ", xml_tag_name='" + xml_tag_name + '\'' +
                ", xml_tag_desc='" + xml_tag_desc + '\'' +
                ", tag_lev='" + tag_lev + '\'' +
                ", tag_sts='" + tag_sts + '\'' +
                ", up_one='" + up_one + '\'' +
                ", up_two='" + up_two + '\'' +
                ", data_type='" + data_type + '\'' +
                ", display='" + display + '\'' +
                ", isnull='" + isnull + '\'' +
                ", seq='" + seq + '\'' +
                ", other_desc='" + other_desc + '\'' +
                '}';
    }
}
