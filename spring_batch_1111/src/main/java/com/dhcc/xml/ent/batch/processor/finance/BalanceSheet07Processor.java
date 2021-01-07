package com.dhcc.xml.ent.batch.processor.finance;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.finance.BalanceSheet;
import com.dhcc.xml.ent.entity.finance.BalanceSheetBsSgmt;
import com.dhcc.xml.ent.entity.finance.BalanceSheet2007Sgmt;
import com.dhcc.xml.ent.entity.finance.EnFinance;
import com.dhcc.xml.ent.entity.finance.db.EB_FinaBal07_Info;
import com.dhcc.xml.util.CreateXML;

/**  
  * Title: BalanceSheet07Processor<br/>  
  * Description:企业资产负债表信息记录处理类 2007版 报文处理  <br/>  
  * @author ChenJingYuan  
  * @date 2018-7-19  
  */  
@Component("BalanceSheet2007SgmtProcessor")
@StepScope
public class BalanceSheet07Processor implements ItemProcessor<EB_FinaBal07_Info, Object> {


	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
	
    public Object process(EB_FinaBal07_Info eb_FinaBal07_Info) throws Exception {
		EntDocument entDocument;
     	BalanceSheet balanceSheet;
     	BalanceSheetBsSgmt balanceSheetBsSgmt;
     	BalanceSheet2007Sgmt balanceSheet2007Sgmt;
		entDocument = new EntDocument();
    	balanceSheet = new BalanceSheet();
    	balanceSheetBsSgmt=new BalanceSheetBsSgmt();
    	balanceSheet2007Sgmt=new BalanceSheet2007Sgmt();
    	
		/*1、基础段*/
		balanceSheetBsSgmt.setAuditFirmName(eb_FinaBal07_Info.getAuditFirmName());
		balanceSheetBsSgmt.setAuditorName(eb_FinaBal07_Info.getAuditorName());
		balanceSheetBsSgmt.setAuditTime(UpdateDate.updateDate(eb_FinaBal07_Info.getAuditTime()));
		balanceSheetBsSgmt.setCimoc(eb_FinaBal07_Info.getCimoc());
		if("30".equals(eb_FinaBal07_Info.getEntCertType())) {
			balanceSheetBsSgmt.setEntCertNum(eb_FinaBal07_Info.getEntCertNum() == null ? eb_FinaBal07_Info.getEntCertNum() :
					eb_FinaBal07_Info.getEntCertNum().replace("-",""));
		}else{
			balanceSheetBsSgmt.setEntCertNum(eb_FinaBal07_Info.getEntCertNum());
		}
		balanceSheetBsSgmt.setEntCertType(eb_FinaBal07_Info.getEntCertType());
		balanceSheetBsSgmt.setEntName(eb_FinaBal07_Info.getEntName());
		balanceSheetBsSgmt.setInfRecType(eb_FinaBal07_Info.getInfRecType());
		balanceSheetBsSgmt.setRptDate(UpdateDate.updateDate(eb_FinaBal07_Info.getRptDate()));
		balanceSheetBsSgmt.setRptDateCode(eb_FinaBal07_Info.getRptDateCode());
		balanceSheetBsSgmt.setSheetType(eb_FinaBal07_Info.getSheetType());
		balanceSheetBsSgmt.setSheetTypeDivide(eb_FinaBal07_Info.getSheetTypeDivide());
		balanceSheetBsSgmt.setSheetYear(eb_FinaBal07_Info.getSheetYear());
		
		/*2、企业资产负债表信息记录 2007*/
		balanceSheet2007Sgmt.setAccountsPayable(eb_FinaBal07_Info.getAccountsPayable());
		balanceSheet2007Sgmt.setAccountsReceivable(eb_FinaBal07_Info.getAccountsReceivable());
		balanceSheet2007Sgmt.setBondsPayables(eb_FinaBal07_Info.getBondsPayables());
		balanceSheet2007Sgmt.setCapitalrRserve(eb_FinaBal07_Info.getCapitalrRserve());
		balanceSheet2007Sgmt.setConstructionInProgress(eb_FinaBal07_Info.getConstructionInProgress());
		balanceSheet2007Sgmt.setConstructionMaterials(eb_FinaBal07_Info.getConstructionMaterials());
		balanceSheet2007Sgmt.setCurrencyFunds(eb_FinaBal07_Info.getCurrencyFunds());
		balanceSheet2007Sgmt.setCurrentPortionOfLongTermLiabilities(eb_FinaBal07_Info.getCurrentPortionOfLongTermLiabilities());
		balanceSheet2007Sgmt.setCurrentPortionOfNonCurrentAssets(eb_FinaBal07_Info.getCurrentPortionOfNonCurrentAssets());
		balanceSheet2007Sgmt.setDeferredTaxAssets(eb_FinaBal07_Info.getDeferredTaxAssets());
		balanceSheet2007Sgmt.setDeferredTaxLiabilities(eb_FinaBal07_Info.getDeferredTaxLiabilities());
		balanceSheet2007Sgmt.setDevelopmentDisbursements(eb_FinaBal07_Info.getDevelopmentDisbursements());
		balanceSheet2007Sgmt.setDividendsPayable(eb_FinaBal07_Info.getDividendsPayable());
		balanceSheet2007Sgmt.setDividendsReceivable(eb_FinaBal07_Info.getDividendsReceivable());
		balanceSheet2007Sgmt.setEmployeeBenefitsPayable(eb_FinaBal07_Info.getEmployeeBenefitsPayable());
		balanceSheet2007Sgmt.setFinancialAssetsAvailableForSale(eb_FinaBal07_Info.getFinancialAssetsAvailableForSale());
		balanceSheet2007Sgmt.setFinancialAssetsHeldForTrading(eb_FinaBal07_Info.getFinancialAssetsHeldForTrading());
		balanceSheet2007Sgmt.setFinancialLiabilitiesHeldForTrading(eb_FinaBal07_Info.getFinancialLiabilitiesHeldForTrading());
		balanceSheet2007Sgmt.setFixedAssets(eb_FinaBal07_Info.getFixedAssets());
		balanceSheet2007Sgmt.setFixedAssetsPendingForDisposal(eb_FinaBal07_Info.getFixedAssetsPendingForDisposal());
		balanceSheet2007Sgmt.setGoodwill(eb_FinaBal07_Info.getGoodwill());
		balanceSheet2007Sgmt.setGrantsPayable(eb_FinaBal07_Info.getGrantsPayable());
		balanceSheet2007Sgmt.setHeldToMaturityInvestments(eb_FinaBal07_Info.getHeldToMaturityInvestments());
		balanceSheet2007Sgmt.setIntangibleAssets(eb_FinaBal07_Info.getIntangibleAssets());
		balanceSheet2007Sgmt.setInterestPayable(eb_FinaBal07_Info.getInterestPayable());
		balanceSheet2007Sgmt.setInterestReceivable(eb_FinaBal07_Info.getInterestReceivable());
		balanceSheet2007Sgmt.setInventories(eb_FinaBal07_Info.getInventories());
		balanceSheet2007Sgmt.setInvestmentProperties(eb_FinaBal07_Info.getInvestmentProperties());
		balanceSheet2007Sgmt.setLessTreasuryStocks(eb_FinaBal07_Info.getLessTreasuryStocks());
		balanceSheet2007Sgmt.setLongTermBorrowings(eb_FinaBal07_Info.getLongTermBorrowings());
		balanceSheet2007Sgmt.setLongTermDeferredExpenses(eb_FinaBal07_Info.getLongTermDeferredExpenses());
		balanceSheet2007Sgmt.setLongTermEquityInvestment(eb_FinaBal07_Info.getLongTermEquityInvestment());
		balanceSheet2007Sgmt.setLongTermPayables(eb_FinaBal07_Info.getLongTermPayables());
		balanceSheet2007Sgmt.setLongTermReceivables(eb_FinaBal07_Info.getLongTermReceivables());
		balanceSheet2007Sgmt.setNonCurrentBiologicalAssets(eb_FinaBal07_Info.getNonCurrentBiologicalAssets());
		balanceSheet2007Sgmt.setNotesPayable(eb_FinaBal07_Info.getNotesPayable());
		balanceSheet2007Sgmt.setNotesReceivable(eb_FinaBal07_Info.getNotesReceivable());
		balanceSheet2007Sgmt.setOilAndGasAssets(eb_FinaBal07_Info.getOilAndGasAssets());
		balanceSheet2007Sgmt.setOtherCurrentAssets(eb_FinaBal07_Info.getOtherCurrentAssets());
		balanceSheet2007Sgmt.setOtherCurrentLiabilities(eb_FinaBal07_Info.getOtherCurrentLiabilities());
		balanceSheet2007Sgmt.setOtherNonCurrentAssets(eb_FinaBal07_Info.getOtherNonCurrentAssets());
		balanceSheet2007Sgmt.setOtherNonCurrentLiabilities(eb_FinaBal07_Info.getOtherNonCurrentLiabilities());
		balanceSheet2007Sgmt.setOtherPayables(eb_FinaBal07_Info.getOtherPayables());
		balanceSheet2007Sgmt.setOtherReceivables(eb_FinaBal07_Info.getOtherReceivables());
		balanceSheet2007Sgmt.setPaidInCapitalOrShareCapital(eb_FinaBal07_Info.getPaidInCapitalOrShareCapital());
		balanceSheet2007Sgmt.setPrepayments(eb_FinaBal07_Info.getPrepayments());
		balanceSheet2007Sgmt.setProvisions(eb_FinaBal07_Info.getProvisions());
		balanceSheet2007Sgmt.setReceiptsInAdvance(eb_FinaBal07_Info.getReceiptsInAdvance());
		balanceSheet2007Sgmt.setShortTermBorrowings(eb_FinaBal07_Info.getShortTermBorrowings());
		balanceSheet2007Sgmt.setSurplusReserve(eb_FinaBal07_Info.getSurplusReserve());
		balanceSheet2007Sgmt.setTaxsPayable(eb_FinaBal07_Info.getTaxsPayable());
		balanceSheet2007Sgmt.setTotalAssets(eb_FinaBal07_Info.getTotalAssets());
		balanceSheet2007Sgmt.setTotalCurrentAssets(eb_FinaBal07_Info.getTotalCurrentAssets());
		balanceSheet2007Sgmt.setTotalCurrentLiabilities(eb_FinaBal07_Info.getTotalCurrentLiabilities());
		balanceSheet2007Sgmt.setTotalEquity(eb_FinaBal07_Info.getTotalEquity());
		balanceSheet2007Sgmt.setTotalEquityAndLiabilities(eb_FinaBal07_Info.getTotalEquityAndLiabilities());
		balanceSheet2007Sgmt.setTotalLiabilities(eb_FinaBal07_Info.getTotalLiabilities());
		balanceSheet2007Sgmt.setTotalNonCurrentAssets(eb_FinaBal07_Info.getTotalNonCurrentAssets());
		balanceSheet2007Sgmt.setTotalNonCurrentLiabilities(eb_FinaBal07_Info.getTotalNonCurrentLiabilities());
		balanceSheet2007Sgmt.setUnappropriatedProfit(eb_FinaBal07_Info.getUnappropriatedProfit());
		
		
		balanceSheet.setBalanceSheetBsSgmt(balanceSheetBsSgmt);
		balanceSheet.setBalanceSheet2007Sgmt(balanceSheet2007Sgmt);
		entDocument.setBalanceSheet(balanceSheet);
		
//		String reportXML = CreateXML.convertToXml(enFinance) + "\r\n";
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
