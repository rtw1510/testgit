package com.dhcc.xml.ent.batch.processor.finance;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.finance.EnFinance;
import com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheet;
import com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetBsSgmt;
import com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetSgmt;
import com.dhcc.xml.ent.entity.finance.db.EB_FinaInsBal_Info;
import com.dhcc.xml.util.CreateXML;

/**  
  * Title: InstitutionBalanceSheetProcessor<br/>  
  * Description: 事业单位资产负债表信息报文<br/>  
  * @author ChenJingYuan  
  * @date 2018-7-19  
  */  
@Component("InstitutionBalanceSheetSgmtProcessor")
@StepScope
public class InstitutionBalanceSheetProcessor implements ItemProcessor<EB_FinaInsBal_Info, Object> {


	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
	public Object process(EB_FinaInsBal_Info eb_FinaInsBal_Info) throws Exception {
		EntDocument entDocument;
		InstitutionBalanceSheet institutionBalanceSheet;
		InstitutionBalanceSheetBsSgmt institutionBalanceSheetBsSgmt;
		InstitutionBalanceSheetSgmt institutionBalanceSheetSgmt;
		entDocument = new EntDocument();
		institutionBalanceSheet = new InstitutionBalanceSheet();
		institutionBalanceSheetBsSgmt=new InstitutionBalanceSheetBsSgmt();
		institutionBalanceSheetSgmt=new InstitutionBalanceSheetSgmt();
    	/*基础段*/
    	institutionBalanceSheetBsSgmt.setAuditFirmName(eb_FinaInsBal_Info.getAuditFirmName());
		institutionBalanceSheetBsSgmt.setAuditorName(eb_FinaInsBal_Info.getAuditorName());
		institutionBalanceSheetBsSgmt.setAuditTime(UpdateDate.updateDate(eb_FinaInsBal_Info.getAuditTime()));
		institutionBalanceSheetBsSgmt.setCimoc(eb_FinaInsBal_Info.getCimoc());
		if("30".equals(eb_FinaInsBal_Info.getEntCertType())) {
			institutionBalanceSheetBsSgmt.setEntCertNum(eb_FinaInsBal_Info.getEntCertNum() == null ? eb_FinaInsBal_Info.getEntCertNum() :
					eb_FinaInsBal_Info.getEntCertNum().replace("-",""));
		}else{
			institutionBalanceSheetBsSgmt.setEntCertNum(eb_FinaInsBal_Info.getEntCertNum());
		}
		institutionBalanceSheetBsSgmt.setEntCertType(eb_FinaInsBal_Info.getEntCertType());
		institutionBalanceSheetBsSgmt.setEntName(eb_FinaInsBal_Info.getEntName());
		institutionBalanceSheetBsSgmt.setInfRecType(eb_FinaInsBal_Info.getInfRecType());
		institutionBalanceSheetBsSgmt.setRptDate(UpdateDate.updateDate(eb_FinaInsBal_Info.getRptDate()));
		institutionBalanceSheetBsSgmt.setRptDateCode(eb_FinaInsBal_Info.getRptDateCode());
		institutionBalanceSheetBsSgmt.setSheetType(eb_FinaInsBal_Info.getSheetType());
		institutionBalanceSheetBsSgmt.setSheetTypeDivide(eb_FinaInsBal_Info.getSheetTypeDivide());
		institutionBalanceSheetBsSgmt.setSheetYear(eb_FinaInsBal_Info.getSheetYear());
    	
    	/*事业单位资产负债表段*/
    	
		institutionBalanceSheetSgmt.setAccountsPayable(eb_FinaInsBal_Info.getAccountsPayable());
		institutionBalanceSheetSgmt.setAccountsReceivable(eb_FinaInsBal_Info.getAccountsReceivable());
		institutionBalanceSheetSgmt.setAccumulatedAmortization(eb_FinaInsBal_Info.getAccumulatedAmortization());
		institutionBalanceSheetSgmt.setAmountOfFinancialReturn(eb_FinaInsBal_Info.getAmountOfFinancialReturn());
		institutionBalanceSheetSgmt.setAssetsToBeProcessedPendingTheProfit(eb_FinaInsBal_Info.getAssetsToBeProcessedPendingTheProfit());
		institutionBalanceSheetSgmt.setConstructionInProcess(eb_FinaInsBal_Info.getConstructionInProcess());
		institutionBalanceSheetSgmt.setCurrencyFunds(eb_FinaInsBal_Info.getCurrencyFunds());
		institutionBalanceSheetSgmt.setEmployeeBenefitsPayable(eb_FinaInsBal_Info.getEmployeeBenefitsPayable());
		institutionBalanceSheetSgmt.setEnterpriseFund(eb_FinaInsBal_Info.getEnterpriseFund());
		institutionBalanceSheetSgmt.setFinancialAidBalance(eb_FinaInsBal_Info.getFinancialAidBalance());
		institutionBalanceSheetSgmt.setFinancialAidCarriedOver(eb_FinaInsBal_Info.getFinancialAidCarriedOver());
		institutionBalanceSheetSgmt.setFixedAssetAccumulatedDepreciation(eb_FinaInsBal_Info.getFixedAssetAccumulatedDepreciation());
		institutionBalanceSheetSgmt.setFixedAssets(eb_FinaInsBal_Info.getFixedAssets());
		institutionBalanceSheetSgmt.setIntangibleAssets(eb_FinaInsBal_Info.getIntangibleAssets());
		institutionBalanceSheetSgmt.setInventories(eb_FinaInsBal_Info.getInventories());
		institutionBalanceSheetSgmt.setLongTermBorrowings(eb_FinaInsBal_Info.getLongTermBorrowings());
		institutionBalanceSheetSgmt.setLongTermInvestment(eb_FinaInsBal_Info.getLongTermInvestment());
		institutionBalanceSheetSgmt.setLongTermPayables(eb_FinaInsBal_Info.getLongTermPayables());
		institutionBalanceSheetSgmt.setNonCurrentAssetsFund(eb_FinaInsBal_Info.getNonCurrentAssetsFund());
		institutionBalanceSheetSgmt.setNonFinancialAidBalance(eb_FinaInsBal_Info.getNonFinancialAidBalance());
		institutionBalanceSheetSgmt.setNonFinancialAidCarriedOver(eb_FinaInsBal_Info.getNonFinancialAidCarriedOver());
		institutionBalanceSheetSgmt.setNotesPayable(eb_FinaInsBal_Info.getNotesPayable());
		institutionBalanceSheetSgmt.setNotesReceivable(eb_FinaInsBal_Info.getNotesReceivable());
		institutionBalanceSheetSgmt.setOperatingBalance(eb_FinaInsBal_Info.getOperatingBalance());
		institutionBalanceSheetSgmt.setOriginalCostOfFixedAsset(eb_FinaInsBal_Info.getOriginalCostOfFixedAsset());
		institutionBalanceSheetSgmt.setOriginalPriceOfIntangibleAssets(eb_FinaInsBal_Info.getOriginalPriceOfIntangibleAssets());
		institutionBalanceSheetSgmt.setOtherCurrentAssets(eb_FinaInsBal_Info.getOtherCurrentAssets());
		institutionBalanceSheetSgmt.setOtherCurrentLiabilities(eb_FinaInsBal_Info.getOtherCurrentLiabilities());
		institutionBalanceSheetSgmt.setOtherPayables(eb_FinaInsBal_Info.getOtherPayables());
		institutionBalanceSheetSgmt.setOtherReceivables(eb_FinaInsBal_Info.getOtherReceivables());
		institutionBalanceSheetSgmt.setPayableFinancialSpecialAccount(eb_FinaInsBal_Info.getPayableFinancialSpecialAccount());
		institutionBalanceSheetSgmt.setPrepayments(eb_FinaInsBal_Info.getPrepayments());
		institutionBalanceSheetSgmt.setReceiptsInAdvance(eb_FinaInsBal_Info.getReceiptsInAdvance());
		institutionBalanceSheetSgmt.setShortTermBorrowings(eb_FinaInsBal_Info.getShortTermBorrowings());
		institutionBalanceSheetSgmt.setShortTermInvestments(eb_FinaInsBal_Info.getShortTermInvestments());
		institutionBalanceSheetSgmt.setSpecialPurposeFunds(eb_FinaInsBal_Info.getSpecialPurposeFunds());
		institutionBalanceSheetSgmt.setTaxPayable(eb_FinaInsBal_Info.getTaxPayable());
		institutionBalanceSheetSgmt.setTotalAssets(eb_FinaInsBal_Info.getTotalAssets());
		institutionBalanceSheetSgmt.setTotalCurrentAssets(eb_FinaInsBal_Info.getTotalCurrentAssets());
		institutionBalanceSheetSgmt.setTotalCurrentLiabilities(eb_FinaInsBal_Info.getTotalCurrentLiabilities());
		institutionBalanceSheetSgmt.setTotalLiabilitiesAndNetAssets(eb_FinaInsBal_Info.getTotalLiabilities());
		institutionBalanceSheetSgmt.setTotalNetAssets(eb_FinaInsBal_Info.getTotalNetAssets());
		institutionBalanceSheetSgmt.setTotalNonCurrentAssets(eb_FinaInsBal_Info.getTotalNonCurrentAssets());
		institutionBalanceSheetSgmt.setTotalNonCurrentLiabilities(eb_FinaInsBal_Info.getTotalNonCurrentLiabilities());
		institutionBalanceSheetSgmt.setTreasuryPayable(eb_FinaInsBal_Info.getTreasuryPayable());
		institutionBalanceSheetSgmt.setUndertakingsBalance(eb_FinaInsBal_Info.getUndertakingsBalance());
    	
    	
    	institutionBalanceSheet.setInstitutionBalanceSheetBsSgmt(institutionBalanceSheetBsSgmt);
    	institutionBalanceSheet.setInstitutionBalanceSheetSgmt(institutionBalanceSheetSgmt);
		entDocument.setInstitutionBalanceSheet(institutionBalanceSheet);
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
