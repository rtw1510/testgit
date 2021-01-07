package com.dhcc.xml.ent.batch.processor.finance;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.finance.CashFlows;
import com.dhcc.xml.ent.entity.finance.CashFlowsBsSgmt;
import com.dhcc.xml.ent.entity.finance.CashFlows2007Sgmt;
import com.dhcc.xml.ent.entity.finance.EnFinance;
import com.dhcc.xml.ent.entity.finance.db.EB_FinaCsh07_Info;
import com.dhcc.xml.util.CreateXML;

/**  
 * Title: CashFlows07Processor<br/>  
 * Description: 企业现金流量表2007版整笔删除请求记录报文处理<br/>  
 * @author ChenJingYuan  
 * @date 2018-7-24  
 */ 
@Component("CashFlows2007SgmtProcessor")
@StepScope
public class CashFlows07Processor implements ItemProcessor<EB_FinaCsh07_Info, Object> {
	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
    public Object process(EB_FinaCsh07_Info eb_FinaCsh07_Info) throws Exception {
		EntDocument entDocument;
    	CashFlows cashFlows;
    	CashFlowsBsSgmt cashFlowsBsSgmt;
    	CashFlows2007Sgmt cashFlows2007Sgmt;
		entDocument = new EntDocument();
    	cashFlows = new CashFlows();
    	cashFlowsBsSgmt=new CashFlowsBsSgmt();
    	cashFlows2007Sgmt=new CashFlows2007Sgmt();
		/*基础段*/
    	cashFlowsBsSgmt.setAuditFirmName(eb_FinaCsh07_Info.getAuditFirmName());
		cashFlowsBsSgmt.setAuditorName(eb_FinaCsh07_Info.getAuditorName());
		cashFlowsBsSgmt.setAuditTime(UpdateDate.updateDate(eb_FinaCsh07_Info.getAuditTime()));
		cashFlowsBsSgmt.setCimoc(eb_FinaCsh07_Info.getCimoc());
		if("30".equals(eb_FinaCsh07_Info.getEntCertType())) {
			cashFlowsBsSgmt.setEntCertNum(eb_FinaCsh07_Info.getEntCertNum() == null ? eb_FinaCsh07_Info.getEntCertNum() :
					eb_FinaCsh07_Info.getEntCertNum().replace("-",""));
		}else{
			cashFlowsBsSgmt.setEntCertNum(eb_FinaCsh07_Info.getEntCertNum());
		}
		cashFlowsBsSgmt.setEntCertType(eb_FinaCsh07_Info.getEntCertType());
		cashFlowsBsSgmt.setEntName(eb_FinaCsh07_Info.getEntName());
		cashFlowsBsSgmt.setInfRecType(eb_FinaCsh07_Info.getInfRecType());
		cashFlowsBsSgmt.setRptDate(UpdateDate.updateDate(eb_FinaCsh07_Info.getRptDate()));
		cashFlowsBsSgmt.setRptDateCode(eb_FinaCsh07_Info.getRptDateCode());
		cashFlowsBsSgmt.setSheetType(eb_FinaCsh07_Info.getSheetType());
		cashFlowsBsSgmt.setSheetTypeDivide(eb_FinaCsh07_Info.getSheetTypeDivide());
		cashFlowsBsSgmt.setSheetYear(eb_FinaCsh07_Info.getSheetYear());
	
		/*07段*/

		cashFlows2007Sgmt.setAdditionOfAccuedExpense(eb_FinaCsh07_Info.getAdditionOfAccuedExpense());
		cashFlows2007Sgmt.setAmortisationOfIntangibleAssets(eb_FinaCsh07_Info.getAmortisationOfIntangibleAssets());
		cashFlows2007Sgmt.setAmortisationOfLongTermDefferedExpenses(eb_FinaCsh07_Info.getAmortisationOfLongTermDefferedExpenses());
		cashFlows2007Sgmt.setCashAtTheBeginningOfThePeriod(eb_FinaCsh07_Info.getCashAtTheBeginningOfThePeriod());
		cashFlows2007Sgmt.setCashAtTheEndOfPeriod(eb_FinaCsh07_Info.getCashAtTheEndOfPeriod());
		cashFlows2007Sgmt.setCashEquivalentsAtTheBeginningOfThePeriod(eb_FinaCsh07_Info.getCashEquivalentsAtTheBeginningOfThePeriod());
		cashFlows2007Sgmt.setCashEquivalentsAtTheEndOfThePeriod(eb_FinaCsh07_Info.getCashEquivalentsAtTheEndOfThePeriod());
		cashFlows2007Sgmt.setCashFromBorrowings(eb_FinaCsh07_Info.getCashFromBorrowings());
		cashFlows2007Sgmt.setCashPaidForGoodsAndServices(eb_FinaCsh07_Info.getCashPaidForGoodsAndServices());
		cashFlows2007Sgmt.setCashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents(eb_FinaCsh07_Info.getCashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents());
		cashFlows2007Sgmt.setCashPaidToAndOnBehalfOfEmployees(eb_FinaCsh07_Info.getCashPaidToAndOnBehalfOfEmployees());
		cashFlows2007Sgmt.setCashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses(eb_FinaCsh07_Info.getCashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses());
		cashFlows2007Sgmt.setCashPaymentsForInvestments(eb_FinaCsh07_Info.getCashPaymentsForInvestments());
		cashFlows2007Sgmt.setCashPaymentsRelatedToOtherFinancingActivities(eb_FinaCsh07_Info.getCashPaymentsRelatedToOtherFinancingActivities());
		cashFlows2007Sgmt.setCashPaymentsRelatedToOtherInvestingActivities(eb_FinaCsh07_Info.getCashPaymentsRelatedToOtherInvestingActivities());
		cashFlows2007Sgmt.setCashReceivedFromInvestors(eb_FinaCsh07_Info.getCashReceivedFromInvestors());
		cashFlows2007Sgmt.setCashReceivedFromOnvestments(eb_FinaCsh07_Info.getCashReceivedFromOnvestments());
		cashFlows2007Sgmt.setCashReceivedFromReturnOfInvestment(eb_FinaCsh07_Info.getCashReceivedFromReturnOfInvestment());
		cashFlows2007Sgmt.setCashReceivedFromSalesOfGoodsOrRendingOfServices(eb_FinaCsh07_Info.getCashReceivedFromSalesOfGoodsOrRendingOfServices());
		cashFlows2007Sgmt.setCashReceivedRelatingToOtherInvestingActivities(eb_FinaCsh07_Info.getCashReceivedRelatingToOtherInvestingActivities());
		cashFlows2007Sgmt.setCashRepaymentsForDebts(eb_FinaCsh07_Info.getCashRepaymentsForDebts());
		cashFlows2007Sgmt.setDebtsTransferToCapital(eb_FinaCsh07_Info.getDebtsTransferToCapital());
		cashFlows2007Sgmt.setDecreaseInInventories(eb_FinaCsh07_Info.getDecreaseInInventories());
		cashFlows2007Sgmt.setDecreaseInOperatingReceivables(eb_FinaCsh07_Info.getDecreaseInOperatingReceivables());
		cashFlows2007Sgmt.setDecreaseOfDefferedExpenses(eb_FinaCsh07_Info.getDecreaseOfDefferedExpenses());
		cashFlows2007Sgmt.setDeferredIncomeTaxAssets(eb_FinaCsh07_Info.getDeferredIncomeTaxAssets());
		cashFlows2007Sgmt.setDeferredIncomeTaxLiabilities(eb_FinaCsh07_Info.getDeferredIncomeTaxLiabilities());
		cashFlows2007Sgmt.setDepreciationOfFixedAssets(eb_FinaCsh07_Info.getDepreciationOfFixedAssets());
		cashFlows2007Sgmt.setEffectOfExchangRateChangesOnCash(eb_FinaCsh07_Info.getEffectOfExchangRateChangesOnCash());
		cashFlows2007Sgmt.setFinanceExpense(eb_FinaCsh07_Info.getFinanceExpense());
		cashFlows2007Sgmt.setFinancingRentToTheFixedAsset(eb_FinaCsh07_Info.getFinancingRentToTheFixedAsset());
		cashFlows2007Sgmt.setIncreaseInOperatingReceivables(eb_FinaCsh07_Info.getIncreaseInOperatingReceivables());
		cashFlows2007Sgmt.setInitialCashAndCashEquivalentsBalance(eb_FinaCsh07_Info.getInitialCashAndCashEquivalentsBalance());
		cashFlows2007Sgmt.setLossesArsingFromInvestment(eb_FinaCsh07_Info.getLossesArsingFromInvestment());
		cashFlows2007Sgmt.setLossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets(eb_FinaCsh07_Info.getLossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets());
		cashFlows2007Sgmt.setLossesOnScrappingOfFixedAssets(eb_FinaCsh07_Info.getLossesOnScrappingOfFixedAssets());
		cashFlows2007Sgmt.setNetCashFlowsFromFinancingActivities(eb_FinaCsh07_Info.getNetCashFlowsFromFinancingActivities());
		cashFlows2007Sgmt.setNetCashFlowsFromInvestingActivities(eb_FinaCsh07_Info.getNetCashFlowsFromInvestingActivities());
		cashFlows2007Sgmt.setNetCashFlowsFromOperatingActivities(eb_FinaCsh07_Info.getNetCashFlowsFromOperatingActivities());
		cashFlows2007Sgmt.setNetCashFlowsFromOperatingActivitiesMi(eb_FinaCsh07_Info.getNetCashFlowsFromOperatingActivitiesMi());
		cashFlows2007Sgmt.setNetCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities(eb_FinaCsh07_Info.getNetCashInflowsOfDisposalOfSubsidiariesAndOtherBusinessEntities());
		cashFlows2007Sgmt.setNetCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits(eb_FinaCsh07_Info.getNetCashOutflowsOfProcurementOfSubsidiariesAndOtherBusinessUnits());
		cashFlows2007Sgmt.setNetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets(eb_FinaCsh07_Info.getNetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets());
		cashFlows2007Sgmt.setNetIncreaseInCashAndCashEquivalents(eb_FinaCsh07_Info.getNetIncreaseInCashAndCashEquivalents());
		cashFlows2007Sgmt.setNetProfit(eb_FinaCsh07_Info.getNetProfit());
		cashFlows2007Sgmt.setNetIncreaseInCashAndCashEquivalentsMi(eb_FinaCsh07_Info.getNetIncreaseInCashAndCashEquivalentsMi());
		cashFlows2007Sgmt.setNonCashOthers(eb_FinaCsh07_Info.getNonCashOthers());
		cashFlows2007Sgmt.setOneYearDueConvertibleBonds(eb_FinaCsh07_Info.getOneYearDueConvertibleBonds());
		cashFlows2007Sgmt.setOtherCashPaymentsFromOperatingActivities(eb_FinaCsh07_Info.getOtherCashPaymentsFromOperatingActivities());
		cashFlows2007Sgmt.setOtherCashReceivedRelatingToFinancingActivities(eb_FinaCsh07_Info.getOtherCashReceivedRelatingToFinancingActivities());
		cashFlows2007Sgmt.setOtherCashReceivedRelatingToOperatingActivities(eb_FinaCsh07_Info.getOtherCashReceivedRelatingToOperatingActivities());
		cashFlows2007Sgmt.setOthers(eb_FinaCsh07_Info.getOthers());
		cashFlows2007Sgmt.setPaymentsOfAllTypesOfTaxes(eb_FinaCsh07_Info.getPaymentsOfAllTypesOfTaxes());
		cashFlows2007Sgmt.setProfitOrLossFromChangesInFairValue(eb_FinaCsh07_Info.getProfitOrLossFromChangesInFairValue());
		cashFlows2007Sgmt.setProvisionForAssetImpairment(eb_FinaCsh07_Info.getProvisionForAssetImpairment());
		cashFlows2007Sgmt.setSubTotalOfCashOutflows(eb_FinaCsh07_Info.getSubTotalOfCashOutflows());
		cashFlows2007Sgmt.setTaxRefunds(eb_FinaCsh07_Info.getTaxRefunds());
		cashFlows2007Sgmt.setTheFinalCashAndCashEquivalentsBalance(eb_FinaCsh07_Info.getTheFinalCashAndCashEquivalentsBalance());
		cashFlows2007Sgmt.setTotalCashInflowsFromFinancingActivities(eb_FinaCsh07_Info.getTotalCashInflowsFromFinancingActivities());
		cashFlows2007Sgmt.setTotalCashInflowsFromInvestingActivities(eb_FinaCsh07_Info.getTotalCashInflowsFromInvestingActivities());
		cashFlows2007Sgmt.setTotalCashInflowsFromOperatingActivities(eb_FinaCsh07_Info.getTotalCashInflowsFromOperatingActivities());
		cashFlows2007Sgmt.setTotalCashOutflowsFromFinancingActivities(eb_FinaCsh07_Info.getTotalCashOutflowsFromFinancingActivities());
		cashFlows2007Sgmt.setTotalCashOutflowsFromOperatingActivities(eb_FinaCsh07_Info.getTotalCashOutflowsFromOperatingActivities());
		
    	cashFlows.setCashFlowsBsSgmt(cashFlowsBsSgmt);
    	cashFlows.setCashFlows2007Sgmt(cashFlows2007Sgmt);
		entDocument.setCashFlows(cashFlows);
//    	String reportXML=CreateXML.convertToXml(enFinance) + "\r\n";
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
