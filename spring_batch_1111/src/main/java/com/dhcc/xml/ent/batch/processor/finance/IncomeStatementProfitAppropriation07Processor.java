package com.dhcc.xml.ent.batch.processor.finance;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.finance.EnFinance;
import com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation;
import com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationBsSgmt;
import com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation2007Sgmt;
import com.dhcc.xml.ent.entity.finance.db.EB_FinaPro07_Info;
import com.dhcc.xml.util.CreateXML;

/**
 * 处理类。
 */						
@Component("IncomeStatementProfitAppropriation2007SgmtProcessor")
@StepScope
public class IncomeStatementProfitAppropriation07Processor implements ItemProcessor<EB_FinaPro07_Info, Object> {

	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
    public Object process(EB_FinaPro07_Info eb_FinaPro07_Info) throws Exception {
		EntDocument entDocument;
    	IncomeStatementProfitAppropriation incomeStatementProfitAppropriation;
    	IncomeStatementProfitAppropriationBsSgmt incomeStatementProfitAppropriationBsSgmt;
    	IncomeStatementProfitAppropriation2007Sgmt incomeStatementProfitAppropriation2007Sgmt;
		entDocument = new EntDocument();
    	incomeStatementProfitAppropriation=new IncomeStatementProfitAppropriation();
    	incomeStatementProfitAppropriationBsSgmt=new IncomeStatementProfitAppropriationBsSgmt();
    	incomeStatementProfitAppropriation2007Sgmt=new IncomeStatementProfitAppropriation2007Sgmt();
    	/*基础段*/
    	
    	incomeStatementProfitAppropriationBsSgmt.setAuditFirmName(eb_FinaPro07_Info.getAuditFirmName());
		incomeStatementProfitAppropriationBsSgmt.setAuditorName(eb_FinaPro07_Info.getAuditorName());
		incomeStatementProfitAppropriationBsSgmt.setAuditTime(UpdateDate.updateDate(eb_FinaPro07_Info.getAuditTime()));
		incomeStatementProfitAppropriationBsSgmt.setCimoc(eb_FinaPro07_Info.getCimoc());
		if("30".equals(eb_FinaPro07_Info.getEntCertType())) {
			incomeStatementProfitAppropriationBsSgmt.setEntCertNum(eb_FinaPro07_Info.getEntCertNum() == null ? eb_FinaPro07_Info.getEntCertNum() :
					eb_FinaPro07_Info.getEntCertNum().replace("-",""));
		}else{
			incomeStatementProfitAppropriationBsSgmt.setEntCertNum(eb_FinaPro07_Info.getEntCertNum());
		}
		incomeStatementProfitAppropriationBsSgmt.setEntCertType(eb_FinaPro07_Info.getEntCertType());
		incomeStatementProfitAppropriationBsSgmt.setEntName(eb_FinaPro07_Info.getEntName());
		incomeStatementProfitAppropriationBsSgmt.setInfRecType(eb_FinaPro07_Info.getInfRecType());
		incomeStatementProfitAppropriationBsSgmt.setRptDate(UpdateDate.updateDate(eb_FinaPro07_Info.getRptDate()));
		incomeStatementProfitAppropriationBsSgmt.setRptDateCode(eb_FinaPro07_Info.getRptDateCode());
		incomeStatementProfitAppropriationBsSgmt.setSheetType(eb_FinaPro07_Info.getSheetType());
		incomeStatementProfitAppropriationBsSgmt.setSheetTypeDivide(eb_FinaPro07_Info.getSheetTypeDivide());
		incomeStatementProfitAppropriationBsSgmt.setSheetYear(eb_FinaPro07_Info.getSheetYear());
    	
		/*07段*/	
		incomeStatementProfitAppropriation2007Sgmt.setBasicEarningsPerShare(eb_FinaPro07_Info.getBasicEarningsPerShare());
		incomeStatementProfitAppropriation2007Sgmt.setBusinessAndOtherTaxes(eb_FinaPro07_Info.getBusinessAndOtherTaxes());
		incomeStatementProfitAppropriation2007Sgmt.setCostOfSales(eb_FinaPro07_Info.getCostOfSales());
		incomeStatementProfitAppropriation2007Sgmt.setDilutedEarningsPerShare(eb_FinaPro07_Info.getDilutedEarningsPerShare());
		incomeStatementProfitAppropriation2007Sgmt.setFinancialExpense(eb_FinaPro07_Info.getFinancialExpense());
		incomeStatementProfitAppropriation2007Sgmt.setGeneralAndAdministrativeExpenses(eb_FinaPro07_Info.getGeneralAndAdministrativeExpenses());
		incomeStatementProfitAppropriation2007Sgmt.setImpairmentLossOfAssets(eb_FinaPro07_Info.getImpairmentLossOfAssets());
		incomeStatementProfitAppropriation2007Sgmt.setIncomeTaxExpense(eb_FinaPro07_Info.getIncomeTaxExpense());
		incomeStatementProfitAppropriation2007Sgmt.setInvestmentIncome(eb_FinaPro07_Info.getInvestmentIncome());
		incomeStatementProfitAppropriation2007Sgmt.setInvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise(eb_FinaPro07_Info.getInvestmentIncomeFromAffiliatedBusinessAndCooperativeEnterprise());
		incomeStatementProfitAppropriation2007Sgmt.setNetProfit(eb_FinaPro07_Info.getNetProfit());
		incomeStatementProfitAppropriation2007Sgmt.setNonCurrentAssets(eb_FinaPro07_Info.getNonCurrentAssets());
		incomeStatementProfitAppropriation2007Sgmt.setNonOperatingExpenses(eb_FinaPro07_Info.getNonOperatingExpenses());
		incomeStatementProfitAppropriation2007Sgmt.setNonOperatingIncome(eb_FinaPro07_Info.getNonOperatingIncome());
		incomeStatementProfitAppropriation2007Sgmt.setOperatingProfits(eb_FinaPro07_Info.getOperatingProfits());
		incomeStatementProfitAppropriation2007Sgmt.setProfitBeforeTax(eb_FinaPro07_Info.getProfitBeforeTax());
		incomeStatementProfitAppropriation2007Sgmt.setProfitOrLossArisingFromChangesInFairValue(eb_FinaPro07_Info.getProfitOrLossArisingFromChangesInFairValue());
		incomeStatementProfitAppropriation2007Sgmt.setRevenueOfSales(eb_FinaPro07_Info.getRevenueOfSales());
		incomeStatementProfitAppropriation2007Sgmt.setSellingExpenses(eb_FinaPro07_Info.getSellingExpenses());

    	incomeStatementProfitAppropriation.setIncomeStatementProfitAppropriationBsSgmt(incomeStatementProfitAppropriationBsSgmt);
    	incomeStatementProfitAppropriation.setIncomeStatementProfitAppropriation2007Sgmt(incomeStatementProfitAppropriation2007Sgmt);
		entDocument.setIncomeStatementProfitAppropriation(incomeStatementProfitAppropriation);
//    	String reportXML = CreateXML.convertToXml(enFinance) + "\r\n";
		return entDocument;
    }
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getThreadName() {
		return threadName;
	}
	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}
    
}
