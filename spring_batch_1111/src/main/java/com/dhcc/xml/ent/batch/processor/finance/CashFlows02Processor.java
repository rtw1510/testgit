package com.dhcc.xml.ent.batch.processor.finance;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.finance.CashFlows;
import com.dhcc.xml.ent.entity.finance.CashFlowsBsSgmt;
import com.dhcc.xml.ent.entity.finance.CashFlows2002Sgmt;
import com.dhcc.xml.ent.entity.finance.EnFinance;
import com.dhcc.xml.ent.entity.finance.db.EB_FinaCsh02_Info;
import com.dhcc.xml.util.CreateXML;


/**  
  * Title: CashFlows02Processor<br/>  
  * Description: 企业现金流量表2002版整笔删除请求记录报文处理<br/>  
  * @author ChenJingYuan  
  * @date 2018-7-24  
  */  
@Component("CashFlows2002SgmtProcessor")
@StepScope
public class CashFlows02Processor implements ItemProcessor<EB_FinaCsh02_Info, Object> {
    /**
     * 内容处理。
     * 
     */
	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
    public Object process(EB_FinaCsh02_Info eb_FinaCsh02_Info) throws Exception {
		EntDocument entDocument;
    	CashFlows cashFlows;
    	CashFlowsBsSgmt cashFlowsBsSgmt;
    	CashFlows2002Sgmt cashFlows2002Sgmt;
		entDocument = new EntDocument();
    	cashFlows=new CashFlows();
    	cashFlowsBsSgmt=new CashFlowsBsSgmt();
    	cashFlows2002Sgmt=new CashFlows2002Sgmt();
    	
		/*基础段*/
    	cashFlowsBsSgmt.setAuditFirmName(eb_FinaCsh02_Info.getAuditFirmName());
		cashFlowsBsSgmt.setAuditorName(eb_FinaCsh02_Info.getAuditorName());
		cashFlowsBsSgmt.setAuditTime(UpdateDate.updateDate(eb_FinaCsh02_Info.getAuditTime()));
		cashFlowsBsSgmt.setCimoc(eb_FinaCsh02_Info.getCimoc());
		if("30".equals(eb_FinaCsh02_Info.getEntCertType())) {
			cashFlowsBsSgmt.setEntCertNum(eb_FinaCsh02_Info.getEntCertNum() == null ? eb_FinaCsh02_Info.getEntCertNum() :
					eb_FinaCsh02_Info.getEntCertNum().replace("-",""));
		}else{
			cashFlowsBsSgmt.setEntCertNum(eb_FinaCsh02_Info.getEntCertNum());
		}
		cashFlowsBsSgmt.setEntCertType(eb_FinaCsh02_Info.getEntCertType());
		cashFlowsBsSgmt.setEntName(eb_FinaCsh02_Info.getEntName());
		cashFlowsBsSgmt.setInfRecType(eb_FinaCsh02_Info.getInfRecType());
		cashFlowsBsSgmt.setRptDate(UpdateDate.updateDate(eb_FinaCsh02_Info.getRptDate()));
		cashFlowsBsSgmt.setRptDateCode(eb_FinaCsh02_Info.getRptDateCode());
		cashFlowsBsSgmt.setSheetType(eb_FinaCsh02_Info.getSheetType());
		cashFlowsBsSgmt.setSheetTypeDivide(eb_FinaCsh02_Info.getSheetTypeDivide());
		cashFlowsBsSgmt.setSheetYear(eb_FinaCsh02_Info.getSheetYear());
		
		/*02段*/
		cashFlows2002Sgmt.setAdditionOfAccuedExpense(eb_FinaCsh02_Info.getAdditionOfAccuedExpense());
		cashFlows2002Sgmt.setAmortisationOfIntangibleAssets(eb_FinaCsh02_Info.getAmortisationOfIntangibleAssets());
		cashFlows2002Sgmt.setCashAtTheBeginningOfThePeriod(eb_FinaCsh02_Info.getCashAtTheBeginningOfThePeriod());
		cashFlows2002Sgmt.setCashAtTheEndOfPeriod(eb_FinaCsh02_Info.getCashAtTheEndOfPeriod());
		cashFlows2002Sgmt.setCashEquivalentsAtTheEndOfThePeriod(eb_FinaCsh02_Info.getCashEquivalentsAtTheEndOfThePeriod());
		cashFlows2002Sgmt.setCashFromBorrowings(eb_FinaCsh02_Info.getCashFromBorrowings());
		cashFlows2002Sgmt.setCashPaidForGoodsAndServices(eb_FinaCsh02_Info.getCashPaidForGoodsAndServices());
		cashFlows2002Sgmt.setCashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents(eb_FinaCsh02_Info.getCashPaidToAcquireFixedAssetsIntangibleAssetsAndOtherLongTermAssents());
		cashFlows2002Sgmt.setCashPaidToAndOnBehalfOfEmployees(eb_FinaCsh02_Info.getCashPaidToAndOnBehalfOfEmployees());
		cashFlows2002Sgmt.setCashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses(eb_FinaCsh02_Info.getCashPaymentsForDistributionOfDividendsOrProfitAndInterestExpenses());
		cashFlows2002Sgmt.setCashPaymentsForInvestments(eb_FinaCsh02_Info.getCashPaymentsForInvestments());
		cashFlows2002Sgmt.setCashPaymentsRelatedToOtherFinancingActivities(eb_FinaCsh02_Info.getCashPaymentsRelatedToOtherFinancingActivities());
		cashFlows2002Sgmt.setCashPaymentsRelatedToOtherInvestingActivities(eb_FinaCsh02_Info.getCashPaymentsRelatedToOtherInvestingActivities());
		cashFlows2002Sgmt.setCashReceivedFromInvestors(eb_FinaCsh02_Info.getCashReceivedFromInvestors());
		cashFlows2002Sgmt.setCashReceivedFromOnvestments(eb_FinaCsh02_Info.getCashReceivedFromOnvestments());
		cashFlows2002Sgmt.setCashReceivedFromReturnOfInvestment(eb_FinaCsh02_Info.getCashReceivedFromReturnOfInvestment());
		cashFlows2002Sgmt.setCashReceivedFromSalesOfGoodsOrRendingOfServices(eb_FinaCsh02_Info.getCashReceivedFromSalesOfGoodsOrRendingOfServices());
		cashFlows2002Sgmt.setCashReceivedRelatingToOtherInvestingActivities(eb_FinaCsh02_Info.getCashReceivedRelatingToOtherInvestingActivities());
		cashFlows2002Sgmt.setCashRepaymentsForDebts(eb_FinaCsh02_Info.getCashRepaymentsForDebts());
		cashFlows2002Sgmt.setCashRquivalentsAtTheBeginningOfThePeriod(eb_FinaCsh02_Info.getCashRquivalentsAtTheBeginningOfThePeriod());
		cashFlows2002Sgmt.setDebtsTransferToCapital(eb_FinaCsh02_Info.getDebtsTransferToCapital());
		cashFlows2002Sgmt.setDecreaseInInventories(eb_FinaCsh02_Info.getDecreaseInInventories());
		cashFlows2002Sgmt.setDecreaseInOperatingReceivables(eb_FinaCsh02_Info.getDecreaseInOperatingReceivables());
		cashFlows2002Sgmt.setDecreaseOfDefferedExpenses(eb_FinaCsh02_Info.getDecreaseOfDefferedExpenses());
		cashFlows2002Sgmt.setDeferredTaxCredit(eb_FinaCsh02_Info.getDeferredTaxCredit());
		cashFlows2002Sgmt.setDepreciationOfFixedAssets(eb_FinaCsh02_Info.getDepreciationOfFixedAssets());
		cashFlows2002Sgmt.setEffectOfExchangRateChangesOnCash(eb_FinaCsh02_Info.getEffectOfExchangRateChangesOnCash());
		cashFlows2002Sgmt.setFinanceExpense(eb_FinaCsh02_Info.getFinanceExpense());
		cashFlows2002Sgmt.setFinancingRentToTheFixedAsset(eb_FinaCsh02_Info.getFinancingRentToTheFixedAsset());
		cashFlows2002Sgmt.setIncreaseInOperatingReceivables(eb_FinaCsh02_Info.getIncreaseInOperatingReceivables());
		cashFlows2002Sgmt.setLongTermDeferredExpensesAmortization(eb_FinaCsh02_Info.getLongTermDeferredExpensesAmortization());
		cashFlows2002Sgmt.setLossesArsingFromInvestment(eb_FinaCsh02_Info.getLossesArsingFromInvestment());
		cashFlows2002Sgmt.setLossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets(eb_FinaCsh02_Info.getLossesOnDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets());
		cashFlows2002Sgmt.setLossesOnScrappingOfFixedAssets(eb_FinaCsh02_Info.getLossesOnScrappingOfFixedAssets());
		cashFlows2002Sgmt.setNetCashFlowsFromFinancingActivities(eb_FinaCsh02_Info.getNetCashFlowsFromFinancingActivities());
		cashFlows2002Sgmt.setNetCashFlowsFromInvestingActivities(eb_FinaCsh02_Info.getNetCashFlowsFromInvestingActivities());
		cashFlows2002Sgmt.setNetCashFlowsFromOperatingActivities(eb_FinaCsh02_Info.getNetCashFlowsFromOperatingActivities());
		cashFlows2002Sgmt.setNetCashFlowsFromOperatingActivitiesMi(eb_FinaCsh02_Info.getNetCashFlowsFromOperatingActivitiesMi());
		cashFlows2002Sgmt.setNetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets(eb_FinaCsh02_Info.getNetCashReceivedFromDisposalOfFixedAssetsIntangibleAssetsAndOtherLongTermAssets());
		cashFlows2002Sgmt.setNetIncreaseInCashAndCashEquivalents(eb_FinaCsh02_Info.getNetIncreaseInCashAndCashEquivalents());
		cashFlows2002Sgmt.setNetIncreaseInCashAndCashEquivalentsMi(eb_FinaCsh02_Info.getNetIncreaseInCashAndCashEquivalentsMi());
		cashFlows2002Sgmt.setNetProfit(eb_FinaCsh02_Info.getNetProfit());
		cashFlows2002Sgmt.setNonCashOthers(eb_FinaCsh02_Info.getNonCashOthers());
		cashFlows2002Sgmt.setOneYearDueConvertibleBonds(eb_FinaCsh02_Info.getOneYearDueConvertibleBonds());
		cashFlows2002Sgmt.setOthers(eb_FinaCsh02_Info.getOthers());
		cashFlows2002Sgmt.setOtherCashPaymentsFromOperatingActivities(eb_FinaCsh02_Info.getOtherCashPaymentsFromOperatingActivities());
		cashFlows2002Sgmt.setOtherCashReceivedRelatingToFinancingActivities(eb_FinaCsh02_Info.getOtherCashReceivedRelatingToFinancingActivities());
		cashFlows2002Sgmt.setOtherCashReceivedRelatingToOperatingActivities(eb_FinaCsh02_Info.getOtherCashReceivedRelatingToOperatingActivities());
		cashFlows2002Sgmt.setPaymentsOfAllTypesOfTaxes(eb_FinaCsh02_Info.getPaymentsOfAllTypesOfTaxes());
		cashFlows2002Sgmt.setProvisionForAssets(eb_FinaCsh02_Info.getProvisionForAssets());
		cashFlows2002Sgmt.setTaxRefunds(eb_FinaCsh02_Info.getTaxRefunds());
		cashFlows2002Sgmt.setTotalCashInflowsFromFinancingActivities(eb_FinaCsh02_Info.getTotalCashInflowsFromFinancingActivities());
		cashFlows2002Sgmt.setTotalCashInflowsFromInvestingActivities(eb_FinaCsh02_Info.getTotalCashInflowsFromInvestingActivities());
		cashFlows2002Sgmt.setTotalCashInflowsFromOperatingActivities(eb_FinaCsh02_Info.getTotalCashInflowsFromOperatingActivities());
		cashFlows2002Sgmt.setTotalCashOutflowsFromFinancingActivities(eb_FinaCsh02_Info.getTotalCashOutflowsFromFinancingActivities());
		cashFlows2002Sgmt.setTotalCashOutflowsFromInvestingActivities(eb_FinaCsh02_Info.getTotalCashOutflowsFromInvestingActivities());
		cashFlows2002Sgmt.setTotalCashOutflowsFromOperatingActivities(eb_FinaCsh02_Info.getTotalCashOutflowsFromOperatingActivities());
    	
    	cashFlows.setCashFlowsBsSgmt(cashFlowsBsSgmt);
    	cashFlows.setCashFlows2002Sgmt(cashFlows2002Sgmt);
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
