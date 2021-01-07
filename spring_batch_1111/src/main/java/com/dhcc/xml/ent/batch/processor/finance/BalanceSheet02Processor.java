package com.dhcc.xml.ent.batch.processor.finance;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.finance.BalanceSheet;
import com.dhcc.xml.ent.entity.finance.BalanceSheetBsSgmt;
import com.dhcc.xml.ent.entity.finance.BalanceSheet2002Sgmt;
import com.dhcc.xml.ent.entity.finance.EnFinance;
import com.dhcc.xml.ent.entity.finance.db.EB_FinaBal02_Info;
import com.dhcc.xml.util.CreateXML;

/**  
  * Title: BalanceSheet02Processor<br/>  
  * Description: 企业资产负债表信息记录处理类 2002版  报文处理 <br/>  
  * @author ChenJingYuan  
  * @date 2018-7-19  
  */  
@Component("BalanceSheet2002SgmtProcessor")
@StepScope
public class BalanceSheet02Processor implements
        ItemProcessor<EB_FinaBal02_Info, Object> {

	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
	
	
	
	public Object process(EB_FinaBal02_Info eb_FinaBal02_Info) throws Exception {
		EntDocument entDocument;
		BalanceSheet balanceSheet;
		BalanceSheetBsSgmt balanceSheetBsSgmt;
		BalanceSheet2002Sgmt balanceSheet2002Sgmt;
		entDocument = new EntDocument();
		balanceSheet = new BalanceSheet();
		balanceSheetBsSgmt=new BalanceSheetBsSgmt();
		balanceSheet2002Sgmt=new BalanceSheet2002Sgmt();
		/*基础段*/
		balanceSheetBsSgmt.setAuditFirmName(eb_FinaBal02_Info.getAuditFirmName());
		balanceSheetBsSgmt.setAuditorName(eb_FinaBal02_Info.getAuditorName());
		balanceSheetBsSgmt.setAuditTime(UpdateDate.updateDate(eb_FinaBal02_Info.getAuditTime()));
		balanceSheetBsSgmt.setCimoc(eb_FinaBal02_Info.getCimoc());
		if("30".equals(eb_FinaBal02_Info.getEntCertType())) {
			balanceSheetBsSgmt.setEntCertNum(eb_FinaBal02_Info.getEntCertNum() == null ? eb_FinaBal02_Info.getEntCertNum() :
					eb_FinaBal02_Info.getEntCertNum().replace("-",""));
		}else{
			balanceSheetBsSgmt.setEntCertNum(eb_FinaBal02_Info.getEntCertNum());
		}
		balanceSheetBsSgmt.setEntCertType(eb_FinaBal02_Info.getEntCertType());
		balanceSheetBsSgmt.setEntName(eb_FinaBal02_Info.getEntName());
		balanceSheetBsSgmt.setInfRecType(eb_FinaBal02_Info.getInfRecType());
		balanceSheetBsSgmt.setRptDate(UpdateDate.updateDate(eb_FinaBal02_Info.getRptDate()));
		balanceSheetBsSgmt.setRptDateCode(eb_FinaBal02_Info.getRptDateCode());
		balanceSheetBsSgmt.setSheetType(eb_FinaBal02_Info.getSheetType());
		balanceSheetBsSgmt.setSheetTypeDivide(eb_FinaBal02_Info.getSheetTypeDivide());
		balanceSheetBsSgmt.setSheetYear(eb_FinaBal02_Info.getSheetYear());
		
		
		/*企业资产负债表信息记录处理类2002版*/

		balanceSheet2002Sgmt.setAccountsPayable(eb_FinaBal02_Info.getAccountsPayable());
		balanceSheet2002Sgmt.setAccountsReceivable(eb_FinaBal02_Info.getAccountsReceivable());
		balanceSheet2002Sgmt.setAllowanceReceivable(eb_FinaBal02_Info.getAllowanceReceivable());
		balanceSheet2002Sgmt.setAmongItSpeciallyApprovedReservingMaterials(eb_FinaBal02_Info.getAmongItSpeciallyApprovedReservingMaterials());
		balanceSheet2002Sgmt.setBondsPayable(eb_FinaBal02_Info.getBondsPayable());
		balanceSheet2002Sgmt.setCapitalrRserve(eb_FinaBal02_Info.getCapitalrRserve());
		balanceSheet2002Sgmt.setCollectiveCapital(eb_FinaBal02_Info.getCollectiveCapital());
		balanceSheet2002Sgmt.setCollectiveLegalPersonsCapital(eb_FinaBal02_Info.getCollectiveLegalPersonsCapital());
		balanceSheet2002Sgmt.setConstructionInProgress(eb_FinaBal02_Info.getConstructionInProgress());
		balanceSheet2002Sgmt.setConstructionMaterials(eb_FinaBal02_Info.getConstructionMaterials());
		balanceSheet2002Sgmt.setCurrencyFunds(eb_FinaBal02_Info.getCurrencyFunds());
		balanceSheet2002Sgmt.setDeferredAssets(eb_FinaBal02_Info.getDeferredAssets());
		balanceSheet2002Sgmt.setDeferredAssetsDebits(eb_FinaBal02_Info.getDeferredAssetsDebits());
		balanceSheet2002Sgmt.setDeferredExpenses(eb_FinaBal02_Info.getDeferredExpenses());
		balanceSheet2002Sgmt.setDeferredTaxationCredit(eb_FinaBal02_Info.getDeferredTaxationCredit());
		balanceSheet2002Sgmt.setDifferenceOnTranslationOfForeignCurrencyFinancialStatements(eb_FinaBal02_Info.getDifferenceOnTranslationOfForeignCurrencyFinancialStatements());
		balanceSheet2002Sgmt.setDividendsReceivable(eb_FinaBal02_Info.getDividendsReceivable());
		balanceSheet2002Sgmt.setEmployeeBenefits(eb_FinaBal02_Info.getEmployeeBenefits());
		balanceSheet2002Sgmt.setExportDrawbackReceivable(eb_FinaBal02_Info.getExportDrawbackReceivable());
		balanceSheet2002Sgmt.setFinishedProducts(eb_FinaBal02_Info.getFinishedProducts());
		balanceSheet2002Sgmt.setFixedAssetAccumulatedDepreciation(eb_FinaBal02_Info.getFixedAssetAccumulatedDepreciation());
		balanceSheet2002Sgmt.setFixedAssetsNetValue(eb_FinaBal02_Info.getFixedAssetsNetValue());
		balanceSheet2002Sgmt.setFixedAssetsPendingForDisposal(eb_FinaBal02_Info.getFixedAssetsPendingForDisposal());
		balanceSheet2002Sgmt.setForeignBusinessmensCapital(eb_FinaBal02_Info.getForeignBusinessmensCapital());
		balanceSheet2002Sgmt.setFutureGuarantee(eb_FinaBal02_Info.getFutureGuarantee());
		balanceSheet2002Sgmt.setGrantsPayable(eb_FinaBal02_Info.getGrantsPayable());
		balanceSheet2002Sgmt.setImprovementExpenditureOfFixedAssets(eb_FinaBal02_Info.getImprovementExpenditureOfFixedAssets());
		balanceSheet2002Sgmt.setIncludingFixedAssetsRepair(eb_FinaBal02_Info.getIncludingFixedAssetsRepair());
		balanceSheet2002Sgmt.setIncomePayable(eb_FinaBal02_Info.getIncomePayable());
		balanceSheet2002Sgmt.setIncorporatingPriceDifference(eb_FinaBal02_Info.getIncorporatingPriceDifference());
		balanceSheet2002Sgmt.setIntangibleAssets(eb_FinaBal02_Info.getIntangibleAssets());
		balanceSheet2002Sgmt.setInterestReceivable(eb_FinaBal02_Info.getInterestReceivable());
		balanceSheet2002Sgmt.setInventories(eb_FinaBal02_Info.getInventories());
		balanceSheet2002Sgmt.setLandUseRights(eb_FinaBal02_Info.getLandUseRights());
		balanceSheet2002Sgmt.setLegalPersonsCapital(eb_FinaBal02_Info.getLegalPersonsCapital());
		balanceSheet2002Sgmt.setLongTermBorrowings(eb_FinaBal02_Info.getLongTermBorrowings());
		balanceSheet2002Sgmt.setLongTermDebentureInvestmentFallingDueInAYear(eb_FinaBal02_Info.getLongTermDebentureInvestmentFallingDueInAYear());
		balanceSheet2002Sgmt.setLongTermEquityInvestment(eb_FinaBal02_Info.getLongTermEquityInvestment());
		balanceSheet2002Sgmt.setLongTermInvestment(eb_FinaBal02_Info.getLongTermInvestment());
		balanceSheet2002Sgmt.setLongTermLiabilitiesDueWithinOneYear(eb_FinaBal02_Info.getLongTermLiabilitiesDueWithinOneYear());
		balanceSheet2002Sgmt.setLongTermPayables(eb_FinaBal02_Info.getLongTermPayables());
		balanceSheet2002Sgmt.setLongTermSecuritiesInvestment(eb_FinaBal02_Info.getLongTermSecuritiesInvestment());
		balanceSheet2002Sgmt.setMinorityInterest(eb_FinaBal02_Info.getMinorityInterest());
		balanceSheet2002Sgmt.setNationalCapital(eb_FinaBal02_Info.getNationalCapital());
		balanceSheet2002Sgmt.setNetValueOfFixedAssets(eb_FinaBal02_Info.getNetValueOfFixedAssets());
		balanceSheet2002Sgmt.setNotesPayable(eb_FinaBal02_Info.getNotesPayable());
		balanceSheet2002Sgmt.setNotesReceivable(eb_FinaBal02_Info.getNotesReceivable());
		balanceSheet2002Sgmt.setOriginalCostOfFixedAsset(eb_FinaBal02_Info.getOriginalCostOfFixedAsset());
		balanceSheet2002Sgmt.setOtherCurrentAssets(eb_FinaBal02_Info.getOtherCurrentAssets());
		balanceSheet2002Sgmt.setOtherCurrentLiabilities(eb_FinaBal02_Info.getOtherCurrentLiabilities());
		balanceSheet2002Sgmt.setOtherLongTermAssets(eb_FinaBal02_Info.getOtherLongTermAssets());
		balanceSheet2002Sgmt.setOtherLongTermLiabilities(eb_FinaBal02_Info.getOtherLongTermLiabilities());
		balanceSheet2002Sgmt.setOtherPayable(eb_FinaBal02_Info.getOtherPayable());
		balanceSheet2002Sgmt.setOtherPayableToGovernment(eb_FinaBal02_Info.getOtherPayableToGovernment());
		balanceSheet2002Sgmt.setOtherReceivables(eb_FinaBal02_Info.getOtherReceivables());
		balanceSheet2002Sgmt.setPaidInCapital(eb_FinaBal02_Info.getPaidInCapital());
		balanceSheet2002Sgmt.setPersonalCapital(eb_FinaBal02_Info.getPersonalCapital());
		balanceSheet2002Sgmt.setPrepayments(eb_FinaBal02_Info.getPrepayments());
		balanceSheet2002Sgmt.setProvisionForExpenses(eb_FinaBal02_Info.getProvisionForExpenses());
		balanceSheet2002Sgmt.setProvisionForImpairmentOfFixedAssets(eb_FinaBal02_Info.getProvisionForImpairmentOfFixedAssets());
		balanceSheet2002Sgmt.setProvisions(eb_FinaBal02_Info.getProvisions());
		balanceSheet2002Sgmt.setPublicWelfareFund(eb_FinaBal02_Info.getPublicWelfareFund());
		balanceSheet2002Sgmt.setRawMaterials(eb_FinaBal02_Info.getRawMaterials());
		balanceSheet2002Sgmt.setReceiptsInAdvance(eb_FinaBal02_Info.getReceiptsInAdvance());
		balanceSheet2002Sgmt.setShortTermBorrowings(eb_FinaBal02_Info.getShortTermBorrowings());
		balanceSheet2002Sgmt.setShortTermInvestments(eb_FinaBal02_Info.getShortTermInvestments());
		balanceSheet2002Sgmt.setSpecialReserveFund(eb_FinaBal02_Info.getSpecialReserveFund());
		balanceSheet2002Sgmt.setStateOwnedLegalPersonsCapital(eb_FinaBal02_Info.getStateOwnedLegalPersonsCapital());
		balanceSheet2002Sgmt.setStatutorySurplusReserve(eb_FinaBal02_Info.getStatutorySurplusReserve());
		balanceSheet2002Sgmt.setSupplermentaryCurrentCapital(eb_FinaBal02_Info.getSupplermentaryCurrentCapital());
		balanceSheet2002Sgmt.setSurplusReserve(eb_FinaBal02_Info.getSurplusReserve());
		balanceSheet2002Sgmt.setWagesOrSalariesPayables(eb_FinaBal02_Info.getWagesOrSalariesPayables());
		balanceSheet2002Sgmt.setUnsettledGLOnFixedAssets(eb_FinaBal02_Info.getUnsettledGLOnFixedAssets());
		balanceSheet2002Sgmt.setUnsettledGLOnCurrentAssets(eb_FinaBal02_Info.getUnsettledGLOnCurrentAssets());
		balanceSheet2002Sgmt.setUnappropriatedProfit(eb_FinaBal02_Info.getUnappropriatedProfit());
		balanceSheet2002Sgmt.setUnaffirmedInvestmentLoss(eb_FinaBal02_Info.getUnaffirmedInvestmentLoss());
		balanceSheet2002Sgmt.setTotalAssets(eb_FinaBal02_Info.getTotalAssets());
		balanceSheet2002Sgmt.setTotalLongTermLiabilities(eb_FinaBal02_Info.getTotalLongTermLiabilities());
		balanceSheet2002Sgmt.setTotalLongTermInvestment(eb_FinaBal02_Info.getTotalLongTermInvestment());
		balanceSheet2002Sgmt.setTotalLiabilities(eb_FinaBal02_Info.getTotalLiabilities());
		balanceSheet2002Sgmt.setTotalIntangibleAssetsAndOtherAssets(eb_FinaBal02_Info.getTotalIntangibleAssetsAndOtherAssets());
		balanceSheet2002Sgmt.setTotalFixedAssets(eb_FinaBal02_Info.getTotalFixedAssets());
		balanceSheet2002Sgmt.setTotalEquityAndLiabilities(eb_FinaBal02_Info.getTotalEquityAndLiabilities());
		balanceSheet2002Sgmt.setTotalEquity(eb_FinaBal02_Info.getTotalEquity());
		balanceSheet2002Sgmt.setTotalCurrentLiabilities(eb_FinaBal02_Info.getTotalCurrentLiabilities());
		balanceSheet2002Sgmt.setTotalCurrentAssets(eb_FinaBal02_Info.getTotalCurrentAssets());
		balanceSheet2002Sgmt.setTaxesPayable(eb_FinaBal02_Info.getTaxesPayable());

		
		balanceSheet.setBalanceSheetBsSgmt(balanceSheetBsSgmt);
		balanceSheet.setBalanceSheet2002Sgmt(balanceSheet2002Sgmt);
		entDocument.setBalanceSheet(balanceSheet);

//		String reportXML=CreateXML.convertToXml(enFinance) + "\r\n";
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
