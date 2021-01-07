package com.dhcc.xml.ent.entity;

import com.dhcc.xml.ent.entity.baseinfo.EnBasInf;
import com.dhcc.xml.ent.entity.baseinfo.EnBsInfDlt;
import com.dhcc.xml.ent.entity.baseinfo.EnCtfItgInf;
import com.dhcc.xml.ent.entity.baseinfo.EnIcdnRltpInf;

import com.dhcc.xml.ent.entity.credit.EnCtrctInf;
import com.dhcc.xml.ent.entity.credit.EnCtrctInfDel;
import com.dhcc.xml.ent.entity.credit.EnCtrctInfEntDel;
import com.dhcc.xml.ent.entity.credit.EnCtrctInfIDCagsInf;
import com.dhcc.xml.ent.entity.credit.EnCtrctInfMdfc;
import com.dhcc.xml.ent.entity.finance.BalanceSheet;
import com.dhcc.xml.ent.entity.finance.BalanceSheetDlt;
import com.dhcc.xml.ent.entity.finance.CashFlows;
import com.dhcc.xml.ent.entity.finance.CashFlowsDlt;
import com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatement;
import com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementDlt;
import com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation;
import com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationDlt;
import com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheet;
import com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetDlt;
import com.dhcc.xml.ent.entity.guarantee.EnSecAcctDel;
import com.dhcc.xml.ent.entity.guarantee.EnSecAcctEntDel;
import com.dhcc.xml.ent.entity.guarantee.EnSecAcctIDCagsInf;
import com.dhcc.xml.ent.entity.guarantee.EnSecAcctInf;
import com.dhcc.xml.ent.entity.guarantee.EnSecAcctMdfc;
import com.dhcc.xml.ent.entity.loaninfo.EnAcctInf;
import com.dhcc.xml.ent.entity.loaninfo.EnAcctInfDel;
import com.dhcc.xml.ent.entity.loaninfo.EnAcctInfEntDel;
import com.dhcc.xml.ent.entity.loaninfo.EnAcctInfIDCagsInf;
import com.dhcc.xml.ent.entity.loaninfo.EnAcctInfMdfc;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCEntDel;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCIDCagsInf;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.MotgaCltalCtrctInf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * TODO企业报文生成总入口类
 *
 * @Author chenjingyuan
 * @date 2020/11/13 9:33
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = { "EnBasInf", "EnCtfItgInf", "EnIcdnRltpInf",
        "EnBsInfDlt", "EnAcctInf", "EnAcctInfIDCagsInf","EnAcctInfMdfc", "EnAcctInfDel", "EnAcctInfEntDel",
        "EnCtrctInf", "EnCtrctInfIDCagsInf", "EnCtrctInfMdfc","EnCtrctInfDel","EnCtrctInfEntDel","EnSecAcctInf",
        "EnSecAcctIDCagsInf","EnSecAcctMdfc","EnSecAcctDel","EnSecAcctEntDel","MotgaCltalCtrctInf"
        ,"MoCIDCagsInf","MoCEntDel","BalanceSheet","IncomeStatementProfitAppropriation",
        "CashFlows","InstitutionBalanceSheet","IncomeAndExpenseStatement",
        "BalanceSheetDlt","IncomeStatementProfitAppropriationDlt","CashFlowsDlt",
        "InstitutionBalanceSheetDlt","IncomeAndExpenseStatementDlt"},namespace = "com.dhcc.xml.ent.entity")
public class EntDocument{
    /**
     *企业基本信息记录[1..1]
     */
    private com.dhcc.xml.ent.entity.baseinfo.EnBasInf EnBasInf;
    /**
     *企业身份标识整合信息记录[1..1]
     */
    private com.dhcc.xml.ent.entity.baseinfo.EnCtfItgInf EnCtfItgInf;
    /**
     *企业间关联关系信息记录[1..1]
     */
    private com.dhcc.xml.ent.entity.baseinfo.EnIcdnRltpInf EnIcdnRltpInf;
    /**
     *企业基本信息删除请求记录[1..1]
     */
    private com.dhcc.xml.ent.entity.baseinfo.EnBsInfDlt EnBsInfDlt;
    /**
     * 企业借贷账户信息记录[1..1]
     */
    private com.dhcc.xml.ent.entity.loaninfo.EnAcctInf EnAcctInf;
    /**
     * 企业借贷账户标识变更请求记录[1..1]
     */
    private com.dhcc.xml.ent.entity.loaninfo.EnAcctInfIDCagsInf EnAcctInfIDCagsInf;
    /**
     * 企业借贷账户更正按段请求类记录[1..1]
     */
    private com.dhcc.xml.ent.entity.loaninfo.EnAcctInfMdfc EnAcctInfMdfc;
    /**
     * 企业借贷账户按段删除请求类记录[1..1]
     */
    private EnAcctInfDel EnAcctInfDel;
    /**
     * 企业借贷账户整笔删除请求类记录[1..1]
     */
    private com.dhcc.xml.ent.entity.loaninfo.EnAcctInfEntDel EnAcctInfEntDel;
    /**
     * 企业授信协议信息记录[1..1]
     */
    private com.dhcc.xml.ent.entity.credit.EnCtrctInf EnCtrctInf;

    /**
     * 企业授信协议标识变更请求记录[1..1]
     */
    private com.dhcc.xml.ent.entity.credit.EnCtrctInfIDCagsInf EnCtrctInfIDCagsInf;

    /**
     * 企业授信协议按段更正请求类记录[1..1]
     */
    private com.dhcc.xml.ent.entity.credit.EnCtrctInfMdfc EnCtrctInfMdfc;

    /**
     * 企业授信协议按段删除请求类记录[1..1]
     */
    private com.dhcc.xml.ent.entity.credit.EnCtrctInfDel EnCtrctInfDel;

    /**
     * 企业授信协议整笔删除请求类记录[1..1]
     */
    private com.dhcc.xml.ent.entity.credit.EnCtrctInfEntDel EnCtrctInfEntDel;
    /**
     *企业担保账户信息记录[1..1]
     */
    private com.dhcc.xml.ent.entity.guarantee.EnSecAcctInf EnSecAcctInf;
    /**
     *企业担保账户标识变更请求记录[1..1]
     */
    private com.dhcc.xml.ent.entity.guarantee.EnSecAcctIDCagsInf EnSecAcctIDCagsInf;
    /**
     *企业担保账户按段更正请求记录[1..1]
     */
    private com.dhcc.xml.ent.entity.guarantee.EnSecAcctMdfc EnSecAcctMdfc;
    /**
     *企业担保账户按段删除请求记录[1..1]
     */
    private com.dhcc.xml.ent.entity.guarantee.EnSecAcctDel EnSecAcctDel;
    /**
     *企业担保账户整笔删除请求记录[1..1]
     */
    private com.dhcc.xml.ent.entity.guarantee.EnSecAcctEntDel EnSecAcctEntDel;
    /**
     *抵（质）押合同信息记录
     */
    private com.dhcc.xml.ent.entity.motgacltalctrctinfo.MotgaCltalCtrctInf MotgaCltalCtrctInf;
    /**
     *抵（质）押合同标识变更请求记录
     */
    private com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCIDCagsInf MoCIDCagsInf;
    /**
     *抵（质）押合同整笔删除请求记录
     */
    private com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCEntDel MoCEntDel;
    /**
     *企业资产负债表信息记录[1..1]
     */
    private com.dhcc.xml.ent.entity.finance.BalanceSheet BalanceSheet;
    /**
     *企业利润及利润分配表信息记录[1..1]
     */
    private IncomeStatementProfitAppropriation IncomeStatementProfitAppropriation;
    /**
     *企业现金流量表信息记录[1..1]
     */
    private com.dhcc.xml.ent.entity.finance.CashFlows CashFlows;
    /**
     *事业单位资产负债表信息记录[1..1]
     */
    private InstitutionBalanceSheet InstitutionBalanceSheet;
    /**
     *事业单位收入支出表信息记录[1..1]
     */
    private com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatement IncomeAndExpenseStatement;
    /**
     *企业资产负债表整笔删除请求记录[1..1]
     */
    private com.dhcc.xml.ent.entity.finance.BalanceSheetDlt BalanceSheetDlt;
    /**
     *企业利润及利润分配表整笔删除请求记录[1..1]
     */
    private com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationDlt IncomeStatementProfitAppropriationDlt;
    /**
     *企业现金流量表整笔删除请求记录[1..1]
     */
    private com.dhcc.xml.ent.entity.finance.CashFlowsDlt CashFlowsDlt;
    /**
     *事业单位资产负债表整笔删除请求记录[1..1]
     */
    private com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetDlt InstitutionBalanceSheetDlt;
    /**
     *事业单位收入支出表整笔删除请求记录[1..1]
     */
    private com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementDlt IncomeAndExpenseStatementDlt;

    public EntDocument() {
    }

    public com.dhcc.xml.ent.entity.baseinfo.EnBasInf getEnBasInf() {
        return EnBasInf;
    }

    public void setEnBasInf(com.dhcc.xml.ent.entity.baseinfo.EnBasInf enBasInf) {
        EnBasInf = enBasInf;
    }

    public com.dhcc.xml.ent.entity.baseinfo.EnCtfItgInf getEnCtfItgInf() {
        return EnCtfItgInf;
    }

    public void setEnCtfItgInf(com.dhcc.xml.ent.entity.baseinfo.EnCtfItgInf enCtfItgInf) {
        EnCtfItgInf = enCtfItgInf;
    }

    public com.dhcc.xml.ent.entity.baseinfo.EnIcdnRltpInf getEnIcdnRltpInf() {
        return EnIcdnRltpInf;
    }

    public void setEnIcdnRltpInf(com.dhcc.xml.ent.entity.baseinfo.EnIcdnRltpInf enIcdnRltpInf) {
        EnIcdnRltpInf = enIcdnRltpInf;
    }

    public com.dhcc.xml.ent.entity.baseinfo.EnBsInfDlt getEnBsInfDlt() {
        return EnBsInfDlt;
    }

    public void setEnBsInfDlt(com.dhcc.xml.ent.entity.baseinfo.EnBsInfDlt enBsInfDlt) {
        EnBsInfDlt = enBsInfDlt;
    }

    public com.dhcc.xml.ent.entity.loaninfo.EnAcctInf getEnAcctInf() {
        return EnAcctInf;
    }

    public void setEnAcctInf(com.dhcc.xml.ent.entity.loaninfo.EnAcctInf enAcctInf) {
        EnAcctInf = enAcctInf;
    }

    public com.dhcc.xml.ent.entity.loaninfo.EnAcctInfIDCagsInf getEnAcctInfIDCagsInf() {
        return EnAcctInfIDCagsInf;
    }

    public void setEnAcctInfIDCagsInf(com.dhcc.xml.ent.entity.loaninfo.EnAcctInfIDCagsInf enAcctInfIDCagsInf) {
        EnAcctInfIDCagsInf = enAcctInfIDCagsInf;
    }

    public com.dhcc.xml.ent.entity.loaninfo.EnAcctInfMdfc getEnAcctInfMdfc() {
        return EnAcctInfMdfc;
    }

    public void setEnAcctInfMdfc(com.dhcc.xml.ent.entity.loaninfo.EnAcctInfMdfc enAcctInfMdfc) {
        EnAcctInfMdfc = enAcctInfMdfc;
    }

    public EnAcctInfDel getEnAcctInfDel() {
        return EnAcctInfDel;
    }

    public void setEnAcctInfDel(EnAcctInfDel enAcctInfDel) {
        EnAcctInfDel = enAcctInfDel;
    }

    public com.dhcc.xml.ent.entity.loaninfo.EnAcctInfEntDel getEnAcctInfEntDel() {
        return EnAcctInfEntDel;
    }

    public void setEnAcctInfEntDel(com.dhcc.xml.ent.entity.loaninfo.EnAcctInfEntDel enAcctInfEntDel) {
        EnAcctInfEntDel = enAcctInfEntDel;
    }

    public com.dhcc.xml.ent.entity.credit.EnCtrctInf getEnCtrctInf() {
        return EnCtrctInf;
    }

    public void setEnCtrctInf(com.dhcc.xml.ent.entity.credit.EnCtrctInf enCtrctInf) {
        EnCtrctInf = enCtrctInf;
    }

    public com.dhcc.xml.ent.entity.credit.EnCtrctInfIDCagsInf getEnCtrctInfIDCagsInf() {
        return EnCtrctInfIDCagsInf;
    }

    public void setEnCtrctInfIDCagsInf(com.dhcc.xml.ent.entity.credit.EnCtrctInfIDCagsInf enCtrctInfIDCagsInf) {
        EnCtrctInfIDCagsInf = enCtrctInfIDCagsInf;
    }

    public com.dhcc.xml.ent.entity.credit.EnCtrctInfMdfc getEnCtrctInfMdfc() {
        return EnCtrctInfMdfc;
    }

    public void setEnCtrctInfMdfc(com.dhcc.xml.ent.entity.credit.EnCtrctInfMdfc enCtrctInfMdfc) {
        EnCtrctInfMdfc = enCtrctInfMdfc;
    }

    public com.dhcc.xml.ent.entity.credit.EnCtrctInfDel getEnCtrctInfDel() {
        return EnCtrctInfDel;
    }

    public void setEnCtrctInfDel(com.dhcc.xml.ent.entity.credit.EnCtrctInfDel enCtrctInfDel) {
        EnCtrctInfDel = enCtrctInfDel;
    }

    public com.dhcc.xml.ent.entity.credit.EnCtrctInfEntDel getEnCtrctInfEntDel() {
        return EnCtrctInfEntDel;
    }

    public void setEnCtrctInfEntDel(com.dhcc.xml.ent.entity.credit.EnCtrctInfEntDel enCtrctInfEntDel) {
        EnCtrctInfEntDel = enCtrctInfEntDel;
    }

    public com.dhcc.xml.ent.entity.guarantee.EnSecAcctInf getEnSecAcctInf() {
        return EnSecAcctInf;
    }

    public void setEnSecAcctInf(com.dhcc.xml.ent.entity.guarantee.EnSecAcctInf enSecAcctInf) {
        EnSecAcctInf = enSecAcctInf;
    }

    public com.dhcc.xml.ent.entity.guarantee.EnSecAcctIDCagsInf getEnSecAcctIDCagsInf() {
        return EnSecAcctIDCagsInf;
    }

    public void setEnSecAcctIDCagsInf(com.dhcc.xml.ent.entity.guarantee.EnSecAcctIDCagsInf enSecAcctIDCagsInf) {
        EnSecAcctIDCagsInf = enSecAcctIDCagsInf;
    }

    public com.dhcc.xml.ent.entity.guarantee.EnSecAcctMdfc getEnSecAcctMdfc() {
        return EnSecAcctMdfc;
    }

    public void setEnSecAcctMdfc(com.dhcc.xml.ent.entity.guarantee.EnSecAcctMdfc enSecAcctMdfc) {
        EnSecAcctMdfc = enSecAcctMdfc;
    }

    public com.dhcc.xml.ent.entity.guarantee.EnSecAcctDel getEnSecAcctDel() {
        return EnSecAcctDel;
    }

    public void setEnSecAcctDel(com.dhcc.xml.ent.entity.guarantee.EnSecAcctDel enSecAcctDel) {
        EnSecAcctDel = enSecAcctDel;
    }

    public com.dhcc.xml.ent.entity.guarantee.EnSecAcctEntDel getEnSecAcctEntDel() {
        return EnSecAcctEntDel;
    }

    public void setEnSecAcctEntDel(com.dhcc.xml.ent.entity.guarantee.EnSecAcctEntDel enSecAcctEntDel) {
        EnSecAcctEntDel = enSecAcctEntDel;
    }

    public com.dhcc.xml.ent.entity.motgacltalctrctinfo.MotgaCltalCtrctInf getMotgaCltalCtrctInf() {
        return MotgaCltalCtrctInf;
    }

    public void setMotgaCltalCtrctInf(com.dhcc.xml.ent.entity.motgacltalctrctinfo.MotgaCltalCtrctInf motgaCltalCtrctInf) {
        MotgaCltalCtrctInf = motgaCltalCtrctInf;
    }

    public com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCIDCagsInf getMoCIDCagsInf() {
        return MoCIDCagsInf;
    }

    public void setMoCIDCagsInf(com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCIDCagsInf moCIDCagsInf) {
        MoCIDCagsInf = moCIDCagsInf;
    }

    public com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCEntDel getMoCEntDel() {
        return MoCEntDel;
    }

    public void setMoCEntDel(com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCEntDel moCEntDel) {
        MoCEntDel = moCEntDel;
    }

    public com.dhcc.xml.ent.entity.finance.BalanceSheet getBalanceSheet() {
        return BalanceSheet;
    }

    public void setBalanceSheet(com.dhcc.xml.ent.entity.finance.BalanceSheet balanceSheet) {
        BalanceSheet = balanceSheet;
    }

    public IncomeStatementProfitAppropriation getIncomeStatementProfitAppropriation() {
        return IncomeStatementProfitAppropriation;
    }

    public void setIncomeStatementProfitAppropriation(IncomeStatementProfitAppropriation incomeStatementProfitAppropriation) {
        IncomeStatementProfitAppropriation = incomeStatementProfitAppropriation;
    }

    public com.dhcc.xml.ent.entity.finance.CashFlows getCashFlows() {
        return CashFlows;
    }

    public void setCashFlows(com.dhcc.xml.ent.entity.finance.CashFlows cashFlows) {
        CashFlows = cashFlows;
    }

    public InstitutionBalanceSheet getInstitutionBalanceSheet() {
        return InstitutionBalanceSheet;
    }

    public void setInstitutionBalanceSheet(InstitutionBalanceSheet institutionBalanceSheet) {
        InstitutionBalanceSheet = institutionBalanceSheet;
    }

    public com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatement getIncomeAndExpenseStatement() {
        return IncomeAndExpenseStatement;
    }

    public void setIncomeAndExpenseStatement(com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatement incomeAndExpenseStatement) {
        IncomeAndExpenseStatement = incomeAndExpenseStatement;
    }

    public com.dhcc.xml.ent.entity.finance.BalanceSheetDlt getBalanceSheetDlt() {
        return BalanceSheetDlt;
    }

    public void setBalanceSheetDlt(com.dhcc.xml.ent.entity.finance.BalanceSheetDlt balanceSheetDlt) {
        BalanceSheetDlt = balanceSheetDlt;
    }

    public com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationDlt getIncomeStatementProfitAppropriationDlt() {
        return IncomeStatementProfitAppropriationDlt;
    }

    public void setIncomeStatementProfitAppropriationDlt(com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationDlt incomeStatementProfitAppropriationDlt) {
        IncomeStatementProfitAppropriationDlt = incomeStatementProfitAppropriationDlt;
    }

    public com.dhcc.xml.ent.entity.finance.CashFlowsDlt getCashFlowsDlt() {
        return CashFlowsDlt;
    }

    public void setCashFlowsDlt(com.dhcc.xml.ent.entity.finance.CashFlowsDlt cashFlowsDlt) {
        CashFlowsDlt = cashFlowsDlt;
    }

    public com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetDlt getInstitutionBalanceSheetDlt() {
        return InstitutionBalanceSheetDlt;
    }

    public void setInstitutionBalanceSheetDlt(com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetDlt institutionBalanceSheetDlt) {
        InstitutionBalanceSheetDlt = institutionBalanceSheetDlt;
    }

    public com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementDlt getIncomeAndExpenseStatementDlt() {
        return IncomeAndExpenseStatementDlt;
    }

    public void setIncomeAndExpenseStatementDlt(com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementDlt incomeAndExpenseStatementDlt) {
        IncomeAndExpenseStatementDlt = incomeAndExpenseStatementDlt;
    }
}
