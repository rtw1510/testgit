package com.dhcc.xml.ent.batch.processor.finance;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.finance.EnFinance;
import com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatement;
import com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementBsSgmt;
import com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementSgmt;
import com.dhcc.xml.ent.entity.finance.db.EB_FinaIncExp_Info;
import com.dhcc.xml.util.CreateXML;

/**  
  * Title: IncomeAndExpenseStatementProcessor<br/>  
  * Description: 事业单位收入支出报文处理 <br/> 
  * @author ChenJingYuan  
  * @date 2018-7-19  
  */  
@Component("IncomeAndExpenseStatementSgmtProcessor")
@StepScope
public class IncomeAndExpenseStatementProcessor implements ItemProcessor<EB_FinaIncExp_Info, Object> {


	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
    public Object process(EB_FinaIncExp_Info eb_FinaIncExp_Info) throws Exception {
		EntDocument entDocument;
    	IncomeAndExpenseStatement incomeAndExpenseStatement;
    	IncomeAndExpenseStatementBsSgmt incomeAndExpenseStatementBsSgmt;
    	IncomeAndExpenseStatementSgmt incomeAndExpenseStatementSgmt;
		entDocument = new EntDocument();
    	incomeAndExpenseStatement = new IncomeAndExpenseStatement();
    	incomeAndExpenseStatementBsSgmt =new IncomeAndExpenseStatementBsSgmt();
    	incomeAndExpenseStatementSgmt=new IncomeAndExpenseStatementSgmt();
    	
    	/*基础段*/
    	incomeAndExpenseStatementBsSgmt.setAuditFirmName(eb_FinaIncExp_Info.getAuditFirmName());
		incomeAndExpenseStatementBsSgmt.setAuditorName(eb_FinaIncExp_Info.getAuditorName());
		incomeAndExpenseStatementBsSgmt.setAuditTime(UpdateDate.updateDate(eb_FinaIncExp_Info.getAuditTime()));
		incomeAndExpenseStatementBsSgmt.setCimoc(eb_FinaIncExp_Info.getCimoc());
		if("30".equals(eb_FinaIncExp_Info.getEntCertType())) {
			incomeAndExpenseStatementBsSgmt.setEntCertNum(eb_FinaIncExp_Info.getEntCertNum() == null ? eb_FinaIncExp_Info.getEntCertNum() :
					eb_FinaIncExp_Info.getEntCertNum().replace("-",""));
		}else{
			incomeAndExpenseStatementBsSgmt.setEntCertNum(eb_FinaIncExp_Info.getEntCertNum());
		}
		incomeAndExpenseStatementBsSgmt.setEntCertType(eb_FinaIncExp_Info.getEntCertType());
		incomeAndExpenseStatementBsSgmt.setEntName(eb_FinaIncExp_Info.getEntName());
		incomeAndExpenseStatementBsSgmt.setInfRecType(eb_FinaIncExp_Info.getInfRecType());
		incomeAndExpenseStatementBsSgmt.setRptDate(UpdateDate.updateDate(eb_FinaIncExp_Info.getRptDate()));
		incomeAndExpenseStatementBsSgmt.setRptDateCode(eb_FinaIncExp_Info.getRptDateCode());
		incomeAndExpenseStatementBsSgmt.setSheetType(eb_FinaIncExp_Info.getSheetType());
		incomeAndExpenseStatementBsSgmt.setSheetTypeDivide(eb_FinaIncExp_Info.getSheetTypeDivide());
		incomeAndExpenseStatementBsSgmt.setSheetYear(eb_FinaIncExp_Info.getSheetYear());
    	
    	/*事业单位收入支出表段*/
		incomeAndExpenseStatementSgmt.setCurrentFinancialSubsidyCarriedOverBalance(eb_FinaIncExp_Info.getCurrentFinancialSubsidyCarriedOverBalance());
		incomeAndExpenseStatementSgmt.setCurrentOperatingBalance(eb_FinaIncExp_Info.getCurrentOperatingBalance());
		incomeAndExpenseStatementSgmt.setCurrentUndertakingsCarriedOverBalance(eb_FinaIncExp_Info.getCurrentUndertakingsCarriedOverBalance());
		incomeAndExpenseStatementSgmt.setDonationIncome(eb_FinaIncExp_Info.getDonationIncome());
		incomeAndExpenseStatementSgmt.setEnterpriseIncomeTaxPayable(eb_FinaIncExp_Info.getEnterpriseIncomeTaxPayable());
		incomeAndExpenseStatementSgmt.setFinancialSubsidyRevenue(eb_FinaIncExp_Info.getFinancialSubsidyRevenue());
		incomeAndExpenseStatementSgmt.setGrantToTheAuxiliaryOrganization(eb_FinaIncExp_Info.getGrantToTheAuxiliaryOrganization());
		incomeAndExpenseStatementSgmt.setNonFinancialAidBalanceThisYear(eb_FinaIncExp_Info.getNonFinancialAidBalanceThisYear());
		incomeAndExpenseStatementSgmt.setNonFinancialAidCarriedOver(eb_FinaIncExp_Info.getNonFinancialAidCarriedOver());
		incomeAndExpenseStatementSgmt.setNonFinancialSubsidyCarriedOverBalanceThisYear(eb_FinaIncExp_Info.getNonFinancialSubsidyCarriedOverBalanceThisYear());
		incomeAndExpenseStatementSgmt.setOperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss(eb_FinaIncExp_Info.getOperatingBalanceMadeUpForOfThePreviousYearsOperatingLoss());
		incomeAndExpenseStatementSgmt.setOperatingExpenditure(eb_FinaIncExp_Info.getOperatingExpenditure());
		incomeAndExpenseStatementSgmt.setOperatingRevenue(eb_FinaIncExp_Info.getOperatingRevenue());
		incomeAndExpenseStatementSgmt.setOtherExpenditure(eb_FinaIncExp_Info.getOtherExpenditure());
		incomeAndExpenseStatementSgmt.setOtherRevenue(eb_FinaIncExp_Info.getOtherRevenue());
		incomeAndExpenseStatementSgmt.setPaymentToTheHigherAuthority(eb_FinaIncExp_Info.getPaymentToTheHigherAuthority());
		incomeAndExpenseStatementSgmt.setPublicFundTurnedInto(eb_FinaIncExp_Info.getPublicFundTurnedInto());
		incomeAndExpenseStatementSgmt.setRevenueTurnedOverBySubsidiaryUnit(eb_FinaIncExp_Info.getRevenueTurnedOverBySubsidiaryUnit());
		incomeAndExpenseStatementSgmt.setSpecialFundsToExtract(eb_FinaIncExp_Info.getSpecialFundsToExtract());
		incomeAndExpenseStatementSgmt.setSuperiorSubsidyRevenue(eb_FinaIncExp_Info.getSuperiorSubsidyRevenue());
		incomeAndExpenseStatementSgmt.setUndertakingsClassExpenditure(eb_FinaIncExp_Info.getUndertakingsClassExpenditure());
		incomeAndExpenseStatementSgmt.setUndertakingsClassRevenue(eb_FinaIncExp_Info.getUndertakingsClassRevenue());
		incomeAndExpenseStatementSgmt.setUndertakingsExpenditureFinancialSubsidyExpenditure(eb_FinaIncExp_Info.getUndertakingsExpenditureFinancialSubsidyExpenditure());
		incomeAndExpenseStatementSgmt.setUndertakingsExpenditureNonFinancialSubsidyExpenditure(eb_FinaIncExp_Info.getUndertakingsExpenditureNonFinancialSubsidyExpenditure());
		incomeAndExpenseStatementSgmt.setUndertakingsRevenue(eb_FinaIncExp_Info.getUndertakingsRevenue());
    	
    	incomeAndExpenseStatement.setIncomeAndExpenseStatementBsSgmt(incomeAndExpenseStatementBsSgmt);
    	incomeAndExpenseStatement.setIncomeAndExpenseStatementSgmt(incomeAndExpenseStatementSgmt);
		entDocument.setIncomeAndExpenseStatement(incomeAndExpenseStatement);
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
