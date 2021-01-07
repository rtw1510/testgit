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
import com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation2002Sgmt;
import com.dhcc.xml.ent.entity.finance.db.EB_FinaPro02_Info;
import com.dhcc.xml.util.CreateXML;

/**
 * 处理类。
 */

/**  
  * Title: IncomeStatementProfitAppropriation02Processor<br/>  
  * Description: 企业利润及利润分配表2002 报文生成<br/>  
  * @author ChenJingYuan  
  * @date 2018-7-19  
  */  
@Component("IncomeStatementProfitAppropriation2002SgmtProcessor")
@StepScope
public class IncomeStatementProfitAppropriation02Processor implements ItemProcessor<EB_FinaPro02_Info, Object> {
	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
    public Object process(EB_FinaPro02_Info eb_FinaPro02_Info) throws Exception {
		EntDocument entDocument;
    	IncomeStatementProfitAppropriation incomeStatementProfitAppropriation;
    	IncomeStatementProfitAppropriationBsSgmt incomeStatementProfitAppropriationBsSgmt;
    	IncomeStatementProfitAppropriation2002Sgmt incomeStatementProfitAppropriation2002Sgmt;
		entDocument = new EntDocument();
    	incomeStatementProfitAppropriation=new IncomeStatementProfitAppropriation();
    	incomeStatementProfitAppropriationBsSgmt=new IncomeStatementProfitAppropriationBsSgmt();
    	incomeStatementProfitAppropriation2002Sgmt=new IncomeStatementProfitAppropriation2002Sgmt();
		/*基础段*/
    	incomeStatementProfitAppropriationBsSgmt.setAuditFirmName(eb_FinaPro02_Info.getAuditFirmName());
    	incomeStatementProfitAppropriationBsSgmt.setAuditorName(eb_FinaPro02_Info.getAuditorName());
    	incomeStatementProfitAppropriationBsSgmt.setAuditTime(UpdateDate.updateDate(eb_FinaPro02_Info.getAuditTime()));
    	incomeStatementProfitAppropriationBsSgmt.setCimoc(eb_FinaPro02_Info.getCimoc());
		if("30".equals(eb_FinaPro02_Info.getEntCertType())) {
			incomeStatementProfitAppropriationBsSgmt.setEntCertNum(eb_FinaPro02_Info.getEntCertNum() == null ? eb_FinaPro02_Info.getEntCertNum() :
					eb_FinaPro02_Info.getEntCertNum().replace("-",""));
		}else{
			incomeStatementProfitAppropriationBsSgmt.setEntCertNum(eb_FinaPro02_Info.getEntCertNum());
		}
    	incomeStatementProfitAppropriationBsSgmt.setEntCertType(eb_FinaPro02_Info.getEntCertType());
    	incomeStatementProfitAppropriationBsSgmt.setEntName(eb_FinaPro02_Info.getEntName());
    	incomeStatementProfitAppropriationBsSgmt.setInfRecType(eb_FinaPro02_Info.getInfRecType());
    	incomeStatementProfitAppropriationBsSgmt.setRptDate(UpdateDate.updateDate(eb_FinaPro02_Info.getRptDate()));
    	incomeStatementProfitAppropriationBsSgmt.setRptDateCode(eb_FinaPro02_Info.getRptDateCode());
    	incomeStatementProfitAppropriationBsSgmt.setSheetType(eb_FinaPro02_Info.getSheetType());
    	incomeStatementProfitAppropriationBsSgmt.setSheetTypeDivide(eb_FinaPro02_Info.getSheetTypeDivide());
    	incomeStatementProfitAppropriationBsSgmt.setSheetYear(eb_FinaPro02_Info.getSheetYear());
    	
		/*企业利润及利润分配2002版*/
		incomeStatementProfitAppropriation2002Sgmt.setAllowanceIncome(eb_FinaPro02_Info.getAllowanceIncome());
		incomeStatementProfitAppropriation2002Sgmt.setAllowanceIncomeBeforeAllowance(eb_FinaPro02_Info.getAllowanceIncomeBeforeAllowance());
		incomeStatementProfitAppropriation2002Sgmt.setAppropriationOfEnterpriseExpansionFund(eb_FinaPro02_Info.getAppropriationOfEnterpriseExpansionFund());
		incomeStatementProfitAppropriation2002Sgmt.setAppropriationOfReserveFund(eb_FinaPro02_Info.getAppropriationOfReserveFund());
		incomeStatementProfitAppropriation2002Sgmt.setAppropriationOfStaffIncentiveAndWelfareFund(eb_FinaPro02_Info.getAppropriationOfStaffIncentiveAndWelfareFund());
		incomeStatementProfitAppropriation2002Sgmt.setAppropriationOfStatutorySurplusReserves(eb_FinaPro02_Info.getAppropriationOfStatutorySurplusReserves());
		incomeStatementProfitAppropriation2002Sgmt.setAppropriationOfStatutoryWelfareFund(eb_FinaPro02_Info.getAppropriationOfStatutoryWelfareFund());
		incomeStatementProfitAppropriation2002Sgmt.setBalanceOfContentSalary(eb_FinaPro02_Info.getBalanceOfContentSalary());
		incomeStatementProfitAppropriation2002Sgmt.setCalculatingFromTheContentSalaryBefore(eb_FinaPro02_Info.getCalculatingFromTheContentSalaryBefore());
		incomeStatementProfitAppropriation2002Sgmt.setCompensationOfSurplusReserve(eb_FinaPro02_Info.getCompensationOfSurplusReserve());
		incomeStatementProfitAppropriation2002Sgmt.setDeferredIncome(eb_FinaPro02_Info.getDeferredIncome());
		incomeStatementProfitAppropriation2002Sgmt.setDiscountAndAllowance(eb_FinaPro02_Info.getDiscountAndAllowance());
		incomeStatementProfitAppropriation2002Sgmt.setExchangeOfNonMonetaryAssetsLoss(eb_FinaPro02_Info.getExchangeOfNonMonetaryAssetsLoss());
		incomeStatementProfitAppropriation2002Sgmt.setFinancialExpenses(eb_FinaPro02_Info.getFinancialExpenses());
		incomeStatementProfitAppropriation2002Sgmt.setFuturesIncome(eb_FinaPro02_Info.getFuturesIncome());
		incomeStatementProfitAppropriation2002Sgmt.setGeneralAndAdministrativeExpenses(eb_FinaPro02_Info.getGeneralAndAdministrativeExpenses());
		incomeStatementProfitAppropriation2002Sgmt.setImparimentLoss(eb_FinaPro02_Info.getImparimentLoss());
		incomeStatementProfitAppropriation2002Sgmt.setIncomeFromNonCurrencyTrade(eb_FinaPro02_Info.getIncomeFromNonCurrencyTrade());
		incomeStatementProfitAppropriation2002Sgmt.setIncomeFromPenalty(eb_FinaPro02_Info.getIncomeFromPenalty());
		incomeStatementProfitAppropriation2002Sgmt.setIncomeFromSalesAgency(eb_FinaPro02_Info.getIncomeFromSalesAgency());
		incomeStatementProfitAppropriation2002Sgmt.setIncomeFromSalesOfIntangibleAssets(eb_FinaPro02_Info.getIncomeFromSalesOfIntangibleAssets());
		incomeStatementProfitAppropriation2002Sgmt.setIncometax(eb_FinaPro02_Info.getIncometax());
		incomeStatementProfitAppropriation2002Sgmt.setInvestmentIncome(eb_FinaPro02_Info.getInvestmentIncome());
		incomeStatementProfitAppropriation2002Sgmt.setLossCompensatedBeforeTheTax(eb_FinaPro02_Info.getLossCompensatedBeforeTheTax());
		incomeStatementProfitAppropriation2002Sgmt.setLossFromDisposalOfFixedAssets(eb_FinaPro02_Info.getLossFromDisposalOfFixedAssets());
		incomeStatementProfitAppropriation2002Sgmt.setLossOfLawsuits(eb_FinaPro02_Info.getLossOfLawsuits());
		incomeStatementProfitAppropriation2002Sgmt.setMainOperatingCost(eb_FinaPro02_Info.getMainOperatingCost());
		incomeStatementProfitAppropriation2002Sgmt.setMainRevenuefRevenue(eb_FinaPro02_Info.getMainRevenuefRevenue());
		incomeStatementProfitAppropriation2002Sgmt.setNetAmountOfIncomeFromMainBusiness(eb_FinaPro02_Info.getNetAmountOfIncomeFromMainBusiness());
		incomeStatementProfitAppropriation2002Sgmt.setNetGainOnDisposalOfFixedAssets(eb_FinaPro02_Info.getNetGainOnDisposalOfFixedAssets());
		incomeStatementProfitAppropriation2002Sgmt.setNetProfit(eb_FinaPro02_Info.getNetProfit());
		incomeStatementProfitAppropriation2002Sgmt.setNonOperatingExpenses(eb_FinaPro02_Info.getNonOperatingExpenses());
		incomeStatementProfitAppropriation2002Sgmt.setNonOperatingIncome(eb_FinaPro02_Info.getNonOperatingIncome());
		incomeStatementProfitAppropriation2002Sgmt.setOperatingProfits(eb_FinaPro02_Info.getOperatingProfits());
		incomeStatementProfitAppropriation2002Sgmt.setOperationExpense(eb_FinaPro02_Info.getOperationExpense());
		incomeStatementProfitAppropriation2002Sgmt.setOtherAdjustmentFactors(eb_FinaPro02_Info.getOtherAdjustmentFactors());
		incomeStatementProfitAppropriation2002Sgmt.setOtherBusinessProfit(eb_FinaPro02_Info.getOtherBusinessProfit());
		incomeStatementProfitAppropriation2002Sgmt.setOtherOperatingIncome(eb_FinaPro02_Info.getOtherOperatingIncome());
		incomeStatementProfitAppropriation2002Sgmt.setOtherPayments(eb_FinaPro02_Info.getOtherPayments());
		incomeStatementProfitAppropriation2002Sgmt.setOthers(eb_FinaPro02_Info.getOthers());
		incomeStatementProfitAppropriation2002Sgmt.setOthersExpenses(eb_FinaPro02_Info.getOthersExpenses());
		incomeStatementProfitAppropriation2002Sgmt.setOthersForOwners(eb_FinaPro02_Info.getOthersForOwners());
		incomeStatementProfitAppropriation2002Sgmt.setOthersIncome(eb_FinaPro02_Info.getOthersIncome());
		incomeStatementProfitAppropriation2002Sgmt.setOthersOperatingCost(eb_FinaPro02_Info.getOthersOperatingCost());
		incomeStatementProfitAppropriation2002Sgmt.setPayableDividendsOfCommonStock(eb_FinaPro02_Info.getPayableDividendsOfCommonStock());
		incomeStatementProfitAppropriation2002Sgmt.setPaymentForDonation(eb_FinaPro02_Info.getPaymentForDonation());
		incomeStatementProfitAppropriation2002Sgmt.setPreferredStockDividendsPayable(eb_FinaPro02_Info.getPreferredStockDividendsPayable());
		incomeStatementProfitAppropriation2002Sgmt.setPrincipleBusinessProfit(eb_FinaPro02_Info.getPrincipleBusinessProfit());
		incomeStatementProfitAppropriation2002Sgmt.setPrincipleBusinessTaxAndExtraCharge(eb_FinaPro02_Info.getPrincipleBusinessTaxAndExtraCharge());
		incomeStatementProfitAppropriation2002Sgmt.setProfitAvailableForDistribution(eb_FinaPro02_Info.getProfitAvailableForDistribution());
		incomeStatementProfitAppropriation2002Sgmt.setProfitAvailableForOwnersDistribution(eb_FinaPro02_Info.getProfitAvailableForOwnersDistribution());
		incomeStatementProfitAppropriation2002Sgmt.setProfitDistributionAtBeginningOfPeriod(eb_FinaPro02_Info.getProfitDistributionAtBeginningOfPeriod());
		incomeStatementProfitAppropriation2002Sgmt.setProfitReservedForASingleItem(eb_FinaPro02_Info.getProfitReservedForASingleItem());
		incomeStatementProfitAppropriation2002Sgmt.setProfitsCapitalizadOnReturnOfInvestment(eb_FinaPro02_Info.getProfitsCapitalizadOnReturnOfInvestment());
		incomeStatementProfitAppropriation2002Sgmt.setSalesIncomeOfExportGoodsProducts(eb_FinaPro02_Info.getSalesIncomeOfExportGoodsProducts());
		incomeStatementProfitAppropriation2002Sgmt.setSalesIncomeOfExportProducts(eb_FinaPro02_Info.getSalesIncomeOfExportProducts());
		incomeStatementProfitAppropriation2002Sgmt.setSalesIncomeOfImportGoodsProducts(eb_FinaPro02_Info.getSalesIncomeOfImportGoodsProducts());
		incomeStatementProfitAppropriation2002Sgmt.setSellingExpenses(eb_FinaPro02_Info.getSellingExpenses());
		incomeStatementProfitAppropriation2002Sgmt.setSupplementaryCurrentCapital(eb_FinaPro02_Info.getSupplementaryCurrentCapital());
		incomeStatementProfitAppropriation2002Sgmt.setTotalProfit(eb_FinaPro02_Info.getTotalProfit());
		incomeStatementProfitAppropriation2002Sgmt.setTransferFromOrdinarySharesDividendToPaidInCapitalOrStock(eb_FinaPro02_Info.getTransferFromOrdinarySharesDividendToPaidInCapitalOrStock());
		incomeStatementProfitAppropriation2002Sgmt.setUnappropriatedProfit(eb_FinaPro02_Info.getUnappropriatedProfit());
		incomeStatementProfitAppropriation2002Sgmt.setUnrealizedInvestmentLosses(eb_FinaPro02_Info.getUnrealizedInvestmentLosses());
		incomeStatementProfitAppropriation2002Sgmt.setWithdrawalOtherCommonAccumulationFund(eb_FinaPro02_Info.getWithdrawalOtherCommonAccumulationFund());

		incomeStatementProfitAppropriation.setIncomeStatementProfitAppropriationBsSgmt(incomeStatementProfitAppropriationBsSgmt);
    	incomeStatementProfitAppropriation.setIncomeStatementProfitAppropriation2002Sgmt(incomeStatementProfitAppropriation2002Sgmt);
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
