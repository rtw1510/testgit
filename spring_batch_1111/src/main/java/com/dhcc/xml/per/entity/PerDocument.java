package com.dhcc.xml.per.entity;



import com.dhcc.xml.per.entity.baseinfo.*;
import com.dhcc.xml.per.entity.credit.*;
import com.dhcc.xml.per.entity.guarantee.*;
import com.dhcc.xml.per.entity.loaninfo.*;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.MoCEntDel;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.MoCIDCagsInf;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.MotgaCltalCtrctInf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * TODO个人报文生成总入口类
 *
 * @Author chenjingyuan
 * @date 2020/11/13 9:33
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "InBasInf", "InFalMmbsInf", "InIDEfctInf",
        "InCtfItgInf", "InBsInfDlt", "InIDEfctInfDlt","InAcctInf", "InAcctIDCagsInf", "InSpcEvtDscInf",
        "InAcctMdfc", "InAcctDel", "InAcctEntDel","InCtrctInf","InCtrctIDCagsInf","InCtrctMdfc",
        "InCtrctDel","InCtrctEntDel","InSecAcctInf","InSecAcctIDCagsInf","InSecAcctMdfc"
        ,"InSecAcctDel","InSecAcctEntDel","MotgaCltalCtrctInf","MoCIDCagsInf","MoCEntDel"},namespace = "com.dhcc.xml.per.entity")
public class PerDocument {
    /**
     * 个人基本信息记录-110
     */
    private com.dhcc.xml.per.entity.baseinfo.InBasInf InBasInf;
    /**
     * 家族关系信息记录-120
     */
    private com.dhcc.xml.per.entity.baseinfo.InFalMmbsInf InFalMmbsInf;
    /**
     * 个人证件有效期信息记录-130
     */
    private com.dhcc.xml.per.entity.baseinfo.InIDEfctInf InIDEfctInf;
    /**
     * 个人证件整合信息记录-140
     */
    private com.dhcc.xml.per.entity.baseinfo.InCtfItgInf InCtfItgInf;
    /**
     * 个人基本信息整笔删除请求记录-114
     */
    private com.dhcc.xml.per.entity.baseinfo.InBsInfDlt InBsInfDlt;
    /**
     * 个人证件有效期整笔删除请求记录-134
     */
    private InIDEfctInfDlt InIDEfctInfDlt;

    /**
     * 个人借贷账户记录210
     */
    private InAcctInf InAcctInf;

    /**
     * 个人借贷账户标识变更请求记录211
     */
    private InAcctIDCagsInf InAcctIDCagsInf;

    /**
     * 个人借贷账户特殊事件说明记录215
     */
    private InSpcEvtDscInf InSpcEvtDscInf;
    /**
     * 个人借贷账户按段更正请求记录212
     */
    private InAcctMdfc InAcctMdfc;

    /**
     * 个人借贷账户按段删除请求记录213
     */
    private InAcctDel InAcctDel;

    /**
     * 个人借贷账户整笔删除请求记录214
     */
    private InAcctEntDel InAcctEntDel;

    /**
     * 个人授信协议信息记录220
     */
    private InCtrctInf InCtrctInf;
    /**
     * 个人授信协议标识变更请求记录221
     */
    private InCtrctIDCagsInf InCtrctIDCagsInf;
    /**
     * 个人授信协议按段更正请求记录222
     */
    private InCtrctMdfc InCtrctMdfc;
    /**
     * 个人授信协议按段删除请求记录223
     */
    private InCtrctDel InCtrctDel;
    /**
     * 个人授信协议整笔删除请求记录224
     */
    private InCtrctEntDel InCtrctEntDel;

    /** 个人担保账户信息记录[1..1] */
    private InSecAcctInf InSecAcctInf;


    /** 个人担保账户标识变更请求记录[1..1] */
    private InSecAcctIDCagsInf InSecAcctIDCagsInf;


    /** 个人担保账户按段更正请求记录[1..1] */
    private InSecAcctMdfc InSecAcctMdfc;


    /** 个人担保账户按段删除请求记录[1..1] */
    private InSecAcctDel InSecAcctDel;


    /** 个人担保账户整笔删除请求记录[1..1] */
    private InSecAcctEntDel InSecAcctEntDel;
    /**
     *抵（质）押合同信息记录
     */
    private MotgaCltalCtrctInf MotgaCltalCtrctInf;
    /**
     *抵（质）押合同标识变更请求记录
     */
    private MoCIDCagsInf MoCIDCagsInf;
    /**
     *抵（质）押合同整笔删除请求记录
     */
    private MoCEntDel MoCEntDel;

    public PerDocument() {
    }

    public InBasInf getInBasInf() {
        return InBasInf;
    }

    public void setInBasInf(InBasInf inBasInf) {
        InBasInf = inBasInf;
    }

    public InFalMmbsInf getInFalMmbsInf() {
        return InFalMmbsInf;
    }

    public void setInFalMmbsInf(InFalMmbsInf inFalMmbsInf) {
        InFalMmbsInf = inFalMmbsInf;
    }

    public InIDEfctInf getInIDEfctInf() {
        return InIDEfctInf;
    }

    public void setInIDEfctInf(InIDEfctInf inIDEfctInf) {
        InIDEfctInf = inIDEfctInf;
    }

    public InCtfItgInf getInCtfItgInf() {
        return InCtfItgInf;
    }

    public void setInCtfItgInf(InCtfItgInf inCtfItgInf) {
        InCtfItgInf = inCtfItgInf;
    }

    public InBsInfDlt getInBsInfDlt() {
        return InBsInfDlt;
    }

    public void setInBsInfDlt(InBsInfDlt inBsInfDlt) {
        InBsInfDlt = inBsInfDlt;
    }

    public InIDEfctInfDlt getInIDEfctInfDlt() {
        return InIDEfctInfDlt;
    }

    public void setInIDEfctInfDlt(InIDEfctInfDlt inIDEfctInfDlt) {
        InIDEfctInfDlt = inIDEfctInfDlt;
    }

    public InAcctInf getInAcctInf() {
        return InAcctInf;
    }

    public void setInAcctInf(InAcctInf inAcctInf) {
        InAcctInf = inAcctInf;
    }

    public InAcctIDCagsInf getInAcctIDCagsInf() {
        return InAcctIDCagsInf;
    }

    public void setInAcctIDCagsInf(InAcctIDCagsInf inAcctIDCagsInf) {
        InAcctIDCagsInf = inAcctIDCagsInf;
    }

    public InSpcEvtDscInf getInSpcEvtDscInf() {
        return InSpcEvtDscInf;
    }

    public void setInSpcEvtDscInf(InSpcEvtDscInf inSpcEvtDscInf) {
        InSpcEvtDscInf = inSpcEvtDscInf;
    }

    public InAcctMdfc getInAcctMdfc() {
        return InAcctMdfc;
    }

    public void setInAcctMdfc(InAcctMdfc inAcctMdfc) {
        InAcctMdfc = inAcctMdfc;
    }

    public InAcctDel getInAcctDel() {
        return InAcctDel;
    }

    public void setInAcctDel(InAcctDel inAcctDel) {
        InAcctDel = inAcctDel;
    }

    public InAcctEntDel getInAcctEntDel() {
        return InAcctEntDel;
    }

    public void setInAcctEntDel(InAcctEntDel inAcctEntDel) {
        InAcctEntDel = inAcctEntDel;
    }

    public InCtrctInf getInCtrctInf() {
        return InCtrctInf;
    }

    public void setInCtrctInf(InCtrctInf inCtrctInf) {
        InCtrctInf = inCtrctInf;
    }

    public InCtrctIDCagsInf getInCtrctIDCagsInf() {
        return InCtrctIDCagsInf;
    }

    public void setInCtrctIDCagsInf(InCtrctIDCagsInf inCtrctIDCagsInf) {
        InCtrctIDCagsInf = inCtrctIDCagsInf;
    }

    public InCtrctMdfc getInCtrctMdfc() {
        return InCtrctMdfc;
    }

    public void setInCtrctMdfc(InCtrctMdfc inCtrctMdfc) {
        InCtrctMdfc = inCtrctMdfc;
    }

    public InCtrctDel getInCtrctDel() {
        return InCtrctDel;
    }

    public void setInCtrctDel(InCtrctDel inCtrctDel) {
        InCtrctDel = inCtrctDel;
    }

    public InCtrctEntDel getInCtrctEntDel() {
        return InCtrctEntDel;
    }

    public void setInCtrctEntDel(InCtrctEntDel inCtrctEntDel) {
        InCtrctEntDel = inCtrctEntDel;
    }

    public InSecAcctInf getInSecAcctInf() {
        return InSecAcctInf;
    }

    public void setInSecAcctInf(InSecAcctInf inSecAcctInf) {
        InSecAcctInf = inSecAcctInf;
    }

    public InSecAcctIDCagsInf getInSecAcctIDCagsInf() {
        return InSecAcctIDCagsInf;
    }

    public void setInSecAcctIDCagsInf(InSecAcctIDCagsInf inSecAcctIDCagsInf) {
        InSecAcctIDCagsInf = inSecAcctIDCagsInf;
    }

    public InSecAcctMdfc getInSecAcctMdfc() {
        return InSecAcctMdfc;
    }

    public void setInSecAcctMdfc(InSecAcctMdfc inSecAcctMdfc) {
        InSecAcctMdfc = inSecAcctMdfc;
    }

    public InSecAcctDel getInSecAcctDel() {
        return InSecAcctDel;
    }

    public void setInSecAcctDel(InSecAcctDel inSecAcctDel) {
        InSecAcctDel = inSecAcctDel;
    }

    public InSecAcctEntDel getInSecAcctEntDel() {
        return InSecAcctEntDel;
    }

    public void setInSecAcctEntDel(InSecAcctEntDel inSecAcctEntDel) {
        InSecAcctEntDel = inSecAcctEntDel;
    }

    public MotgaCltalCtrctInf getMotgaCltalCtrctInf() {
        return MotgaCltalCtrctInf;
    }

    public void setMotgaCltalCtrctInf(MotgaCltalCtrctInf motgaCltalCtrctInf) {
        MotgaCltalCtrctInf = motgaCltalCtrctInf;
    }

    public MoCIDCagsInf getMoCIDCagsInf() {
        return MoCIDCagsInf;
    }

    public void setMoCIDCagsInf(MoCIDCagsInf moCIDCagsInf) {
        MoCIDCagsInf = moCIDCagsInf;
    }

    public MoCEntDel getMoCEntDel() {
        return MoCEntDel;
    }

    public void setMoCEntDel(MoCEntDel moCEntDel) {
        MoCEntDel = moCEntDel;
    }
}
