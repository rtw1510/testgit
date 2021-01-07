package com.dhcc.xml.validation;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.per.entity.PerDocument;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.pbccrc.archive.collect.messagetools.validators.IValidator;
import org.pbccrc.archive.collect.messagetools.validators.ValidatorContext;
import org.pbccrc.archive.constant.EntConstants;
import org.pbccrc.archive.feedback.Feedback;
import org.pbccrc.collectclient.api.reportfile.CcConstants;
import org.pbccrc.collectclient.api.reportfile.ValidatorFactory;
import org.pbccrc.collectclient.api.reportfile.VldContextUtil;
import org.pbccrc.collectclient.api.reportfile.validator.BaseValidator;
import org.pbccrc.collectclient.api.reportfile.validator.CertconfNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.ContractAlertValidator;
import org.pbccrc.collectclient.api.reportfile.validator.ContractCodeChangeValidator;
import org.pbccrc.collectclient.api.reportfile.validator.ContractDelAllValidator;
import org.pbccrc.collectclient.api.reportfile.validator.ContractDelPartValidator;
import org.pbccrc.collectclient.api.reportfile.validator.ContractNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.DcacctAlterValidator;
import org.pbccrc.collectclient.api.reportfile.validator.DcacctCodeChangeValidator;
import org.pbccrc.collectclient.api.reportfile.validator.DcacctDelAllValidator;
import org.pbccrc.collectclient.api.reportfile.validator.DcacctDelPartValidator;
import org.pbccrc.collectclient.api.reportfile.validator.DcacctNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.DcacctSpecialEvtValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntCertConfNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntCollateralCodeChangeValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntCollateralDelValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntCollateralNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntContractAlterValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntContractCodeChangeValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntContractDelAllValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntContractDelPartValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntContractNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntDcacctAlterValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntDcacctCodeChangeValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntDcacctDelAllValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntDcacctDelPartValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntDcacctNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntGuacctAlterValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntGuacctCodeChangeValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntGuacctDelAllValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntGuacctDelPartValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntGuacctNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntHgucontractAlterValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntHgucontractCodeChangeValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntHgucontractDelAllValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntHgucontractDelPartValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntHgucontractNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntIdentifyDelValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntIdentifyNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntRelNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntReportEalDeleteValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntReportEalNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntReportEepapdDeleteValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntReportEepapdNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntReportGpiaalDeleteValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntReportGpiaalNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntReportGpiiDeleteValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntReportGpiiNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntReportVoecfDeleteValidator;
import org.pbccrc.collectclient.api.reportfile.validator.EntReportVoecfNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.FamRelNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.GuacctAlterValidator;
import org.pbccrc.collectclient.api.reportfile.validator.GuacctCodeChangeValidator;
import org.pbccrc.collectclient.api.reportfile.validator.GuacctDelAllValidator;
import org.pbccrc.collectclient.api.reportfile.validator.GuacctDelPartValidator;
import org.pbccrc.collectclient.api.reportfile.validator.GuacctNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.IdEfctInfDelValidator;
import org.pbccrc.collectclient.api.reportfile.validator.IdEfctInfNormalValidator;
import org.pbccrc.collectclient.api.reportfile.validator.IdentifyDelValidator;
import org.pbccrc.collectclient.api.reportfile.validator.IdentifyNormalValidator;

import com.dhcc.xml.ent.entity.baseinfo.EnBasInf;
import com.dhcc.xml.ent.entity.baseinfo.EnBaseInfo;
import com.dhcc.xml.ent.entity.baseinfo.EnBsInfDlt;
import com.dhcc.xml.ent.entity.baseinfo.EnCtfItgInf;
import com.dhcc.xml.ent.entity.baseinfo.EnIcdnRltpInf;
import com.dhcc.xml.ent.entity.credit.EnCredit;
import com.dhcc.xml.ent.entity.credit.EnCtrctInf;
import com.dhcc.xml.ent.entity.credit.EnCtrctInfDel;
import com.dhcc.xml.ent.entity.credit.EnCtrctInfEntDel;
import com.dhcc.xml.ent.entity.credit.EnCtrctInfIDCagsInf;
import com.dhcc.xml.ent.entity.credit.EnCtrctInfMdfc;
import com.dhcc.xml.ent.entity.finance.BalanceSheet;
import com.dhcc.xml.ent.entity.finance.BalanceSheetDlt;
import com.dhcc.xml.ent.entity.finance.CashFlows;
import com.dhcc.xml.ent.entity.finance.CashFlowsDlt;
import com.dhcc.xml.ent.entity.finance.EnFinance;
import com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatement;
import com.dhcc.xml.ent.entity.finance.IncomeAndExpenseStatementDlt;
import com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriation;
import com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationDlt;
import com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheet;
import com.dhcc.xml.ent.entity.finance.InstitutionBalanceSheetDlt;
import com.dhcc.xml.ent.entity.guarantee.EnGuarantee;
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
import com.dhcc.xml.ent.entity.loaninfo.EnLoanInfo;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.EnMotgaCltalCtrctInfo;
import com.dhcc.xml.parse.entity.V_ERROR_INFO;
import com.dhcc.xml.per.entity.baseinfo.BsSgmt;
import com.dhcc.xml.per.entity.baseinfo.InBasInf;
import com.dhcc.xml.per.entity.baseinfo.InBsInfDlt;
import com.dhcc.xml.per.entity.baseinfo.InCtfItgInf;
import com.dhcc.xml.per.entity.baseinfo.InFalMmbsInf;
import com.dhcc.xml.per.entity.baseinfo.InIDEfctInf;
import com.dhcc.xml.per.entity.baseinfo.InIDEfctInfDlt;
import com.dhcc.xml.per.entity.baseinfo.PerBaseInfo;
import com.dhcc.xml.per.entity.credit.InCtrctDel;
import com.dhcc.xml.per.entity.credit.InCtrctEntDel;
import com.dhcc.xml.per.entity.credit.InCtrctIDCagsInf;
import com.dhcc.xml.per.entity.credit.InCtrctInf;
import com.dhcc.xml.per.entity.credit.InCtrctMdfc;
import com.dhcc.xml.per.entity.credit.PerCredit;
import com.dhcc.xml.per.entity.guarantee.InSecAcctDel;
import com.dhcc.xml.per.entity.guarantee.InSecAcctEntDel;
import com.dhcc.xml.per.entity.guarantee.InSecAcctIDCagsInf;
import com.dhcc.xml.per.entity.guarantee.InSecAcctInf;
import com.dhcc.xml.per.entity.guarantee.InSecAcctMdfc;
import com.dhcc.xml.per.entity.guarantee.PerGuarantee;
import com.dhcc.xml.per.entity.loaninfo.AcctBsSgmt;
import com.dhcc.xml.per.entity.loaninfo.InAcctDel;
import com.dhcc.xml.per.entity.loaninfo.InAcctEntDel;
import com.dhcc.xml.per.entity.loaninfo.InAcctIDCagsInf;
import com.dhcc.xml.per.entity.loaninfo.InAcctInf;
import com.dhcc.xml.per.entity.loaninfo.InAcctMdfc;
import com.dhcc.xml.per.entity.loaninfo.InSpcEvtDscInf;
import com.dhcc.xml.per.entity.loaninfo.PerLoanInfo;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.MoCEntDel;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.MoCIDCagsInf;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.MotgaCltalCtrctInf;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.PerMotgaCltalCtrctInfo;
import com.dhcc.xml.util.CreateXML;

public  class ValidateCollectUtils {
	public static BaseValidator validator110;

	public static BaseValidator validator114;

	public static BaseValidator validator120;

	public static BaseValidator validator130;

	public static BaseValidator validator134;

	public static BaseValidator validator140;

	public static BaseValidator validator210;

	public static BaseValidator validator211;

	public static BaseValidator validator212;

	public static BaseValidator validator213;

	public static BaseValidator validator214;

	public static BaseValidator validator215;

	public static BaseValidator validator222;

	public static BaseValidator validator221;

	public static BaseValidator validator224;

	public static BaseValidator validator223;

	public static BaseValidator validator220;

	public static BaseValidator validator230;

	public static BaseValidator validator231;

	public static BaseValidator validator232;

	public static BaseValidator validator233;

	public static BaseValidator validator234;

	public static BaseValidator validator510;

	public static BaseValidator validator511;

	public static BaseValidator validator514;

	public static BaseValidator validator310;

	public static BaseValidator validator314;

	public static BaseValidator validator340;

	public static BaseValidator validator350;

	public static BaseValidator validator410;

	public static BaseValidator validator411;

	public static BaseValidator validator412;

	public static BaseValidator validator413;

	public static BaseValidator validator414;

	public static BaseValidator validator420;

	public static BaseValidator validator421;

	public static BaseValidator validator422;

	public static BaseValidator validator423;

	public static BaseValidator validator424;

	public static BaseValidator validator520;

	public static BaseValidator validator521;

	public static BaseValidator validator522;

	public static BaseValidator validator523;

	public static BaseValidator validator524;

	public static BaseValidator validator440;

	public static BaseValidator validator441;

	public static BaseValidator validator442;

	public static BaseValidator validator443;

	public static BaseValidator validator444;

	public static BaseValidator validator610;

	public static BaseValidator validator614;

	public static BaseValidator validator620;

	public static BaseValidator validator624;

	public static BaseValidator validator630;

	public static BaseValidator validator634;

	public static BaseValidator validator640;

	public static BaseValidator validator644;

	public static BaseValidator validator650;

	public static BaseValidator validator654;
	private static InputStream is = null;
	private static Workbook wb = null;
	
	static{
		if (is == null) {
		      is = ValidateCollectUtils.class.getResourceAsStream("/code-msg-transfer/FeedbackInfo.xlsx");
		      if (is == null)
		        try {
		          throw new IOException("File not found!");
		        }
		        catch (IOException e) {
		          e.printStackTrace();
		        }
		      try
		      {
		        wb = new XSSFWorkbook(is);
		      }
		      catch (IOException e) {
		    	  
		        e.printStackTrace();
		      }
		}
	}
	public static BaseValidator getBaseValidator(int recTypeId) {
		switch (recTypeId) {
		case 110:
			if (validator110 == null)
				return ValidatorFactory.getInstance(IdentifyNormalValidator.validatorId);
			else
				return validator110;
		case 114:
			if (validator114 == null)
				return ValidatorFactory.getInstance(IdentifyDelValidator.validatorId);
			else
				return validator114;
		case 120:
			if (validator120 == null)
				return ValidatorFactory.getInstance(FamRelNormalValidator.validatorId);
			else
				return validator120;
		case 130:
			if (validator130 == null)
				return ValidatorFactory.getInstance(IdEfctInfNormalValidator.validatorId);
			else
				return validator130;
		case 134:
			if (validator134 == null)
				return ValidatorFactory.getInstance(IdEfctInfDelValidator.validatorId);
			else
				return validator134;
		case 140:
			if (validator140 == null)
				return ValidatorFactory.getInstance(CertconfNormalValidator.validatorId);
			else
				return validator140;
		case 210:
			if (validator210 == null)
				return ValidatorFactory.getInstance(DcacctNormalValidator.validatorId);
			else
				return validator210;
		case 211:
			if (validator211 == null)
				return ValidatorFactory.getInstance(DcacctCodeChangeValidator.validatorId);
			else
				return validator211;
		case 212:
			if (validator212 == null)
				return ValidatorFactory.getInstance(DcacctAlterValidator.validatorId);
			else
				return validator212;
		case 213:
			if (validator213 == null)
				return ValidatorFactory.getInstance(DcacctDelPartValidator.validatorId);
			else
				return validator213;
		case 214:
			if (validator214 == null)
				return ValidatorFactory.getInstance(DcacctDelAllValidator.validatorId);
			else
				return validator214;
		case 215:
			if (validator215 == null)
				return ValidatorFactory.getInstance(DcacctSpecialEvtValidator.validatorId);
			else
				return validator215;
		case 222:
			if (validator222 == null)
				return ValidatorFactory.getInstance(ContractAlertValidator.validatorId);
			else
				return validator222;
		case 221:
			if (validator221 == null)
				return ValidatorFactory.getInstance(ContractCodeChangeValidator.validatorId);
			else
				return validator221;
		case 224:
			if (validator224 == null)
				return ValidatorFactory.getInstance(ContractDelAllValidator.validatorId);
			else
				return validator224;
		case 223:
			if (validator223 == null)
				return ValidatorFactory.getInstance(ContractDelPartValidator.validatorId);
			else
				return validator223;
		case 220:
			if (validator220 == null)
				return ValidatorFactory.getInstance(ContractNormalValidator.validatorId);
			else
				return validator220;
		case 230:
			if (validator230 == null)
				return ValidatorFactory.getInstance(GuacctNormalValidator.validatorId);
			else
				return validator230;
		case 231:
			if (validator231 == null)
				return ValidatorFactory.getInstance(GuacctCodeChangeValidator.validatorId);
			else
				return validator231;
		case 232:
			if (validator232 == null)
				return ValidatorFactory.getInstance(GuacctAlterValidator.validatorId);
			else
				return validator232;
		case 233:
			if (validator233 == null)
				return ValidatorFactory.getInstance(GuacctDelPartValidator.validatorId);
			else
				return validator233;
		case 234:
			if (validator234 == null)
				return ValidatorFactory.getInstance(GuacctDelAllValidator.validatorId);
			else
				return validator234;
		case 510:
			if (validator510 == null)
				return ValidatorFactory.getInstance(EntCollateralNormalValidator.validatorId);
			else
				return validator510;
		case 511:
			if (validator511 == null)
				return ValidatorFactory.getInstance(EntCollateralCodeChangeValidator.validatorId);
			else
				return validator511;
		case 514:
			if (validator514 == null)
				return ValidatorFactory.getInstance(EntCollateralDelValidator.validatorId);
			else
				return validator514;
		case 310:
			if (validator310 == null)
				return ValidatorFactory.getInstance(EntIdentifyNormalValidator.validatorId);
			else
				return validator310;
		case 314:
			if (validator314 == null)
				return ValidatorFactory.getInstance(EntIdentifyDelValidator.validatorId);
			else
				return validator314;
		case 340:
			if (validator340 == null)
				return ValidatorFactory.getInstance(EntCertConfNormalValidator.validatorId);
			else
				return validator340;
		case 350:
			if (validator350 == null)
				return ValidatorFactory.getInstance(EntRelNormalValidator.validatorId);
			else
				return validator350;
		case 410:
			if (validator410 == null)
				return ValidatorFactory.getInstance(EntDcacctNormalValidator.validatorId);
			else
				return validator410;
		case 411:
			if (validator411 == null)
				return ValidatorFactory.getInstance(EntDcacctCodeChangeValidator.validatorId);
			else
				return validator411;
		case 412:
			if (validator412 == null)
				return ValidatorFactory.getInstance(EntDcacctAlterValidator.validatorId);
			else
				return validator412;
		case 413:
			if (validator413 == null)
				return ValidatorFactory.getInstance(EntDcacctDelPartValidator.validatorId);
			else
				return validator413;
		case 414:
			if (validator414 == null)
				return ValidatorFactory.getInstance(EntDcacctDelAllValidator.validatorId);
			else
				return validator414;
		case 420:
			if (validator420 == null)
				return ValidatorFactory.getInstance(EntContractNormalValidator.validatorId);
			else
				return validator420;
		case 421:
			if (validator421 == null)
				return ValidatorFactory.getInstance(EntContractCodeChangeValidator.validatorId);
			else
				return validator421;
		case 422:
			if (validator422 == null)
				return ValidatorFactory.getInstance(EntContractAlterValidator.validatorId);
			else
				return validator422;
		case 423:
			if (validator423 == null)
				return ValidatorFactory.getInstance(EntContractDelPartValidator.validatorId);
			else
				return validator423;
		case 424:
			if (validator424 == null)
				return ValidatorFactory.getInstance(EntContractDelAllValidator.validatorId);
			else
				return validator424;
		case 520:
			if (validator520 == null)
				return ValidatorFactory.getInstance(EntHgucontractNormalValidator.validatorId);
			else
				return validator520;
		case 521:
			if (validator521 == null)
				return ValidatorFactory.getInstance(EntHgucontractCodeChangeValidator.validatorId);
			else
				return validator521;
		case 522:
			if (validator522 == null)
				return ValidatorFactory.getInstance(EntHgucontractAlterValidator.validatorId);
			else
				return validator522;
		case 523:
			if (validator523 == null)
				return ValidatorFactory.getInstance(EntHgucontractDelPartValidator.validatorId);
			else
				return validator523;
		case 524:
			if (validator524 == null)
				return ValidatorFactory.getInstance(EntHgucontractDelAllValidator.validatorId);
			else
				return validator524;
		case 440:
			if (validator440 == null)
				return ValidatorFactory.getInstance(EntGuacctNormalValidator.validatorId);
			else
				return validator440;
		case 441:
			if (validator441 == null)
				return ValidatorFactory.getInstance(EntGuacctCodeChangeValidator.validatorId);
			else
				return validator441;
		case 442:
			if (validator442 == null)
				return ValidatorFactory.getInstance(EntGuacctAlterValidator.validatorId);
			else
				return validator442;
		case 443:
			if (validator443 == null)
				return ValidatorFactory.getInstance(EntGuacctDelPartValidator.validatorId);
			else
				return validator443;
		case 444:
			if (validator444 == null)
				return ValidatorFactory.getInstance(EntGuacctDelAllValidator.validatorId);
			else
				return validator444;
		case 610:
			if (validator610 == null)
				return ValidatorFactory.getInstance(EntReportEalNormalValidator.validatorId);
			else
				return validator610;
		case 614:
			if (validator614 == null)
				return ValidatorFactory.getInstance(EntReportEalDeleteValidator.validatorId);
			else
				return validator614;
		case 620:
			if (validator620 == null)
				return ValidatorFactory.getInstance(EntReportEepapdNormalValidator.validatorId);
			else
				return validator620;
		case 624:
			if (validator624 == null)
				return ValidatorFactory.getInstance(EntReportEepapdDeleteValidator.validatorId);
			else
				return validator624;
		case 630:
			if (validator630 == null)
				return ValidatorFactory.getInstance(EntReportVoecfNormalValidator.validatorId);
			else
				return validator630;
		case 634:
			if (validator634 == null)
				return ValidatorFactory.getInstance(EntReportVoecfDeleteValidator.validatorId);
			else
				return validator634;
		case 640:
			if (validator640 == null)
				return ValidatorFactory.getInstance(EntReportGpiaalNormalValidator.validatorId);
			else
				return validator640;
		case 644:
			if (validator644 == null)
				return ValidatorFactory.getInstance(EntReportGpiaalDeleteValidator.validatorId);
			else
				return validator644;
		case 650:
			if (validator650 == null)
				return ValidatorFactory.getInstance(EntReportGpiiNormalValidator.validatorId);
			else
				return validator650;
		case 654:
			if (validator654 == null)
				return ValidatorFactory.getInstance(EntReportGpiiDeleteValidator.validatorId);
			else
				return validator654;
		}

		return null;
	}

	//根据返回码返回中文错误
	public static String getMsg(String code, String tag,String tagName, String recTypeId, String value)
	{
		if (wb == null) {
			if(value==null||"".equals(value)) {
				return "【" + tagName +  "】" + code;
			}else{
				return "【" + tagName + ":" + value + "】" + code;
			}
		}
		int sheetSize = wb.getNumberOfSheets();
		for (int i = 0; i < sheetSize; i++) {
			Sheet sheet = wb.getSheetAt(i);
			String curSheetName = recTypeId2SheetName(recTypeId);
			if ((curSheetName == null) || ("".equals(curSheetName)) ||
					(curSheetName.equals(sheet.getSheetName())))
			{
				int rowSize = sheet.getLastRowNum();
				for (int j = 0; j <= rowSize; j++) {
					Row row = sheet.getRow(j);
					if (row != null)
					{
						Cell cell0 = row.getCell(0);
						if (cell0 != null)
						{
							String codeString = cell0.getStringCellValue();
							Cell cell1 = row.getCell(1);
							String tagString = cell1 == null ? "" : cell1.getStringCellValue();
							if ((codeString != null) && (codeString.equalsIgnoreCase(code))) {
								String compareString = tag.length() > tagString.length() ? tag.substring(0, tagString.length()) : tag;

								if ((tagString != null) && ((tagString.equalsIgnoreCase(compareString)) || (tagString.equals("")))) {
									Cell cell3 = row.getCell(3);
									if (cell3 != null) {
										String msgString = row.getCell(3).getStringCellValue();
										if ((msgString != null) && (msgString.length() > 0)) {
											if ((tag != null) && (tag.length() > 0)) {
												if(value==null||"".equals(value)) {
													msgString = "【"+tagName + "】" + msgString;
												}else{
													msgString = "【"+tagName + ":" + value + "】" + msgString;
												}

											}
											return msgString;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if(value==null||"".equals(value)) {
			return "【" + tagName + "】"+ code;
		}else{
			return "【" + tagName + ":" + value + "】"+ code;
		}
	}

	  public void close() {
	    if (this.is != null) {
	      try {
	        this.is.close();
	      }
	      catch (IOException e) {
	        e.printStackTrace();
	      }
	    }
	    this.is = null;
	  }

	  public static String recTypeId2SheetName(String recTypeId) {
	    String sheetName = "";
	    if (("110".equals(recTypeId)) || ("114".equals(recTypeId)) || ("120".equals(recTypeId)) || ("130".equals(recTypeId)) || 
	      ("134"
	      .equals(recTypeId)) || 
	      ("140".equals(recTypeId)))
	      sheetName = "GeRenJiBenXinXi";
	    else if (("210".equals(recTypeId)) || ("211".equals(recTypeId)) || ("212".equals(recTypeId)) || 
	      ("213"
	      .equals(recTypeId)) || 
	      ("214".equals(recTypeId)) || ("215".equals(recTypeId)) || 
	      ("220"
	      .equals(recTypeId)) || 
	      ("221".equals(recTypeId)) || ("222".equals(recTypeId)) || 
	      ("223"
	      .equals(recTypeId)) || 
	      ("224".equals(recTypeId)))
	      sheetName = "GeRenJieDaiJiaoYi";
	    else if (("230".equals(recTypeId)) || ("231".equals(recTypeId)) || ("232".equals(recTypeId)) || 
	      ("233"
	      .equals(recTypeId)) || 
	      ("234".equals(recTypeId)))
	      sheetName = "GeRenDanBaoJiaoYi";
	    else if (("510".equals(recTypeId)) || ("511".equals(recTypeId)) || ("514".equals(recTypeId)))
	      sheetName = "DiYaXinXi";
	    else if (("310".equals(recTypeId)) || ("314".equals(recTypeId)) || ("340".equals(recTypeId)) || 
	      ("350"
	      .equals(recTypeId)))
	    {
	      sheetName = "QiYeJiBenXinXi";
	    } else if (("410".equals(recTypeId)) || ("411".equals(recTypeId)) || ("412".equals(recTypeId)) || 
	      ("413"
	      .equals(recTypeId)) || 
	      ("414".equals(recTypeId)) || ("420".equals(recTypeId)) || 
	      ("421"
	      .equals(recTypeId)) || 
	      ("422".equals(recTypeId)) || ("423".equals(recTypeId)) || 
	      ("424"
	      .equals(recTypeId)) || 
	      ("430".equals(recTypeId)) || ("431".equals(recTypeId)) || 
	      ("432"
	      .equals(recTypeId)) || 
	      ("433".equals(recTypeId)) || ("434".equals(recTypeId)))
	      sheetName = "QiYeJieDaiJiaoYi";
	    else if (("440".equals(recTypeId)) || ("441".equals(recTypeId)) || ("442".equals(recTypeId)) || 
	      ("443"
	      .equals(recTypeId)) || 
	      ("444".equals(recTypeId)) || ("420".equals(recTypeId)) || 
	      ("421"
	      .equals(recTypeId)) || 
	      ("422".equals(recTypeId)) || ("423".equals(recTypeId)) || 
	      ("424"
	      .equals(recTypeId)))
	    {
	      sheetName = "QiYeDanBaoJiaoYi";
	    } else if (("610".equals(recTypeId)) || ("620".equals(recTypeId)) || ("630".equals(recTypeId)) || 
	      ("640"
	      .equals(recTypeId)) || 
	      ("650".equals(recTypeId)) || ("614".equals(recTypeId)) || 
	      ("624"
	      .equals(recTypeId)) || 
	      ("634".equals(recTypeId)) || ("644".equals(recTypeId)) || 
	      ("654"
	      .equals(recTypeId)))
	    {
	      sheetName = "QiYeCaiWuBaoBiao";
	    }
	    else sheetName = "";

	    return sheetName;
	  }

	/**
	 * 反馈报文：根据反馈报文内容提取错误数据支持
	 * @param infRecType
	 * @param reported_XML
	 * @param v_error_info
	 */
	  public static void getFb_keys(String infRecType,String reported_XML,V_ERROR_INFO v_error_info) {
		  String Fb_keys = "";//各类型数据主键信息
		  String Fb_keys_desc = "";//主键信息详情描述
		  String Rpt_date = "";//原数据的报送日期
		  if(infRecType.charAt(0)=='1'){//个人基本信息相关记录
				//1、反馈报文整体解析
				PerBaseInfo perBaseInfo=(PerBaseInfo) CreateXML.xmlStrToObject(PerBaseInfo.class, reported_XML);
//				System.out.println(perBaseInfo.toString());
				//2、对象错误数据分解处理
				if("110".equals(infRecType)){//个人基本信息记录
					//标识项信息：（姓名+）证件类型+证件号码+信息来源编码+信息报告日期
					InBasInf inBasInf = perBaseInfo.getInBasInf();
					BsSgmt bsSgmt=inBasInf.getBsSgmt();
					Fb_keys = bsSgmt.getName()+"|@|"+bsSgmt.getIDType()+"|@|"+bsSgmt.getIDNum()+
					"|@|"+bsSgmt.getInfSurcCode();//+"|@|"+bsSgmt.getRptDate();
					
					Fb_keys_desc = "姓名:"+bsSgmt.getName()+"|@|证件类型:"+bsSgmt.getIDType()+"|@|证件号码:"+bsSgmt.getIDNum()+
					"|@|信息来源编码:"+bsSgmt.getInfSurcCode()+"|@|信息报告日期:"+bsSgmt.getRptDate();
					
					Rpt_date = bsSgmt.getRptDate();
				}else if("114".equals(infRecType)){//个人基本信息整笔删除请求记录
					//标识项信息：（姓名+）证件类型+证件号码+信息来源编码
					InBsInfDlt inBsInfDlt = perBaseInfo.getInBsInfDlt();
					Fb_keys = inBsInfDlt.getName()+"|@|"+inBsInfDlt.getIDType()+"|@|"+inBsInfDlt.getIDNum()+"|@|"+inBsInfDlt.getInfSurcCode();
					Fb_keys_desc="姓名:"+inBsInfDlt.getName()+"|@|证件类型:"+inBsInfDlt.getIDType()+"|@|证件号码:"+inBsInfDlt.getIDNum()+"|@|信息来源编码:"+inBsInfDlt.getInfSurcCode();
				}else if ("120".equals(infRecType)){//家族关系信息记录
					//标识项信息：（A姓名+）A证件类型+A证件号码+（B姓名+）B证件类型+B证件号码+信息来源编码+信息报告日期
					InFalMmbsInf inFalMmbsInf = perBaseInfo.getInFalMmbsInf();
					Fb_keys=inFalMmbsInf.getName()+"|@|"+inFalMmbsInf.getIDType()+"|@|"+inFalMmbsInf.getIDNum()+
					"|@|"+inFalMmbsInf.getFamMemName()+"|@|"+inFalMmbsInf.getFamMemCertType()+
					"|@|"+inFalMmbsInf.getFamMemCertNum()+"|@|"+inFalMmbsInf.getInfSurcCode();//+"|@|"+inFalMmbsInf.getRptDate();
					
					Fb_keys_desc="A姓名:"+inFalMmbsInf.getName()+"|@|A证件类型:"+inFalMmbsInf.getIDType()+"|@|A证件号码:"+inFalMmbsInf.getIDNum()+
					"|@|B姓名:"+inFalMmbsInf.getFamMemName()+"|@|B证件类型:"+inFalMmbsInf.getFamMemCertType()+
					"|@|B证件号码:"+inFalMmbsInf.getFamMemCertNum()+"|@|信息来源编码:"+inFalMmbsInf.getInfSurcCode()+
					"|@|信息报告日期:"+inFalMmbsInf.getRptDate();
					Rpt_date = inFalMmbsInf.getRptDate();
				}else if ("130".equals(infRecType)){//个人证件有效期信息记录
					//标识项信息：（姓名+）证件类型+证件号码+信息来源编码+信息报告日期
					InIDEfctInf inIDEfctInf = perBaseInfo.getInIDEfctInf();
					Fb_keys=inIDEfctInf.getName()+"|@|"+inIDEfctInf.getIDType()+
					"|@|"+inIDEfctInf.getIDNum()+"|@|"+inIDEfctInf.getInfSurcCode();//+"|@|"+inIDEfctInf.getRptDate();
					
					Fb_keys_desc="姓名:"+inIDEfctInf.getName()+"|@|证件类型:"+inIDEfctInf.getIDType()+
					"|@|证件号码:"+inIDEfctInf.getIDNum()+"|@|信息来源编码："+inIDEfctInf.getInfSurcCode()+
					"|@|信息报告日期："+inIDEfctInf.getRptDate();
					Rpt_date = inIDEfctInf.getRptDate();
				}else if ("134".equals(infRecType)){//个人证件有效期信息整笔删除请求记录
					//标识项信息：（姓名+）证件类型+证件号码+信息来源编码
					InIDEfctInfDlt inIDEfctInfDlt=perBaseInfo.getInIDEfctInfDlt();
					Fb_keys=inIDEfctInfDlt.getName()+"|@|"+inIDEfctInfDlt.getIDType()+"|@|"+inIDEfctInfDlt.getIDNum()+"|@|"+inIDEfctInfDlt.getInfSurcCode();
					Fb_keys_desc="证件类型:"+inIDEfctInfDlt.getIDType()+"|@|证件号码:"+inIDEfctInfDlt.getIDNum()+"|@|信息来源编码:"+inIDEfctInfDlt.getInfSurcCode();
				}else if ("140".equals(infRecType)){//个人证件整合信息记录
					//标识项信息：（姓名+）证件类型+证件号码+（其他姓名+）其他证件类型+其他证件号码+信息来源编码+信息报告日期
					InCtfItgInf inCtfItgInf = perBaseInfo.getInCtfItgInf();
					Fb_keys=inCtfItgInf.getName()+"|@|"+inCtfItgInf.getIDType()+"|@|"+inCtfItgInf.getIDNum()+
					"|@|"+inCtfItgInf.getOthName()+"|@|"+inCtfItgInf.getOthIDType()+"|@|"+inCtfItgInf.getOthIDNum()+
					"|@|"+inCtfItgInf.getInfSurcCode();//+"|@|"+inCtfItgInf.getRptDate();
					
					Fb_keys_desc="姓名:"+inCtfItgInf.getName()+"|@|证件类型:"+inCtfItgInf.getIDType()+"|@|证件号码:"+inCtfItgInf.getIDNum()+
					"|@|其他姓名:"+inCtfItgInf.getOthName()+"|@|其他证件类型:"+inCtfItgInf.getOthIDType()+"|@|其他证件号码:"+inCtfItgInf.getOthIDNum()+
					"|@|信息来源编码:"+inCtfItgInf.getInfSurcCode()+"|@|信息报告日期:"+inCtfItgInf.getRptDate();
					Rpt_date = inCtfItgInf.getRptDate();
				}
			}else if("21".equals(infRecType.substring(0, 2))){//个人借贷信息相关记录
				//1、反馈报文整体解析
				PerLoanInfo perLoanInfo=(PerLoanInfo) CreateXML.xmlStrToObject(PerLoanInfo.class, reported_XML);
//				System.out.println(perLoanInfo.toString());
				//2、对象错误数据分解处理
				if("210".equals(infRecType)){//个人借贷账户信息记录
					//标识项信息：账户标识码+信息报告日期
					InAcctInf inAcctInf=perLoanInfo.getInAcctInf();
					AcctBsSgmt acctBsSgmt=inAcctInf.getAcctBsSgmt();
					Fb_keys=acctBsSgmt.getAcctCode();//+"|@|"+acctBsSgmt.getRptDate();
					Fb_keys_desc="账户标识码:"+acctBsSgmt.getAcctCode()+"|@|信息报告日期："+acctBsSgmt.getRptDate();
					Rpt_date = acctBsSgmt.getRptDate();
				}else if ("211".equals(infRecType)){//个人借贷账户标识变更请求记录
					//标识项信息：老账户标识码+新账户标识码
					InAcctIDCagsInf inAcctIDCagsInf= perLoanInfo.getInAcctIDCagsInf();
					Fb_keys=inAcctIDCagsInf.getOdBnesCode()+"|@|"+inAcctIDCagsInf.getNwBnesCode();
					Fb_keys_desc="老账户标识码:"+inAcctIDCagsInf.getOdBnesCode()+"|@|新账户标识码:"+inAcctIDCagsInf.getNwBnesCode();
				}else if ("212".equals(infRecType)){//个人借贷账户按段更正请求记录
					//标识项信息：待更正业务标识码+账户类型+待更正段段标 +信息报告日期
					InAcctMdfc inAcctMdfc = perLoanInfo.getInAcctMdfc();
					Fb_keys=inAcctMdfc.getBsSgmt().getModRecCode()+"|@|"+inAcctMdfc.getBsSgmt().getAcctType()+
					"|@|"+inAcctMdfc.getBsSgmt().getMdfcSgmtCode();//+"|@|"+inAcctMdfc.getBsSgmt().getRptDate();
					Fb_keys_desc="待更正业务标识码:"+inAcctMdfc.getBsSgmt().getModRecCode()+"|@|账户类型:"+inAcctMdfc.getBsSgmt().getAcctType()+
					"|@|待更正段段标"+inAcctMdfc.getBsSgmt().getMdfcSgmtCode()+"|@|信息报告日期"+inAcctMdfc.getBsSgmt().getRptDate();
					Rpt_date = inAcctMdfc.getBsSgmt().getRptDate();
				}else if ("213".equals(infRecType)){//个人借贷账户按段删除请求记录
					//标识项信息：待删除业务标识码+待删除段段标+待删除起始日期+待删除结束日期
					InAcctDel InAcctDel =(InAcctDel)perLoanInfo.getInAcctDel();
					Fb_keys = InAcctDel.getDelRecCode()+"|@|"+InAcctDel.getDelSgmtCode()+"|@|"+InAcctDel.getDelStartDate()+"|@|"+InAcctDel.getDelEndDate();
					Fb_keys_desc= "待删除业务标识码:"+InAcctDel.getDelRecCode()+"|@|待删除段段标:"+InAcctDel.getDelSgmtCode()+"|@|待删除起始日期:"+InAcctDel.getDelStartDate()+"|@|待删除结束日期:"+InAcctDel.getDelEndDate();
				}else if ("214".equals(infRecType)){//个人借贷账户整笔删除请求记录
					//标识项信息：待删除业务标识码
					InAcctEntDel InAcctEntDel=(InAcctEntDel)perLoanInfo.getInAcctEntDel();
					Fb_keys = InAcctEntDel.getDelRecCode();
					Fb_keys_desc="待删除业务标识码:" + InAcctEntDel.getDelRecCode();
				}else if ("215".equals(infRecType)){//个人借贷账户特殊事件说明记录
					//标识项信息：账户标识码+事件类型+发生月份+生效标志+信息报告日期
					InSpcEvtDscInf inSpcEvtDscInf=(InSpcEvtDscInf)perLoanInfo.getInSpcEvtDscInf();
					Fb_keys = inSpcEvtDscInf.getAcctCode()+"|@|"+inSpcEvtDscInf.getOpetnType()+
					"|@|"+inSpcEvtDscInf.getMonth()+"|@|"+inSpcEvtDscInf.getFlag();//+"|@|"+inSpcEvtDscInf.getRptDate();
					Fb_keys_desc = "账户标识码:"+inSpcEvtDscInf.getAcctCode()+"|@|事件类型:"+inSpcEvtDscInf.getOpetnType()+
					"|@|发生月份:"+inSpcEvtDscInf.getMonth()+"|@|生效标志:"+inSpcEvtDscInf.getFlag()+
					"|@|信息报告日期:"+inSpcEvtDscInf.getRptDate();
					Rpt_date = inSpcEvtDscInf.getRptDate();
				}
			}else if("22".equals(infRecType.substring(0, 2))){//个人授信协议信息相关记录
				//1、反馈报文整体解析
				PerCredit perCredit=(PerCredit) CreateXML.xmlStrToObject(PerCredit.class, reported_XML);
				//2、对象错误数据分解处理
				if("220".equals(infRecType)){//个人授信协议信息记录
					//标识项信息：授信协议标识码+信息报告日期
					InCtrctInf inCtrctInf=perCredit.getInCtrctInf();
					Fb_keys = inCtrctInf.getCtrctBsSgmt().getContractCode();//+"|@|"+inCtrctInf.getCtrctBsSgmt().getRptDate();
					Fb_keys_desc = "授信协议标识码:"+inCtrctInf.getCtrctBsSgmt().getContractCode()+"|@|信息报告日期:"+inCtrctInf.getCtrctBsSgmt().getRptDate();
					Rpt_date = inCtrctInf.getCtrctBsSgmt().getRptDate();
				}else if("221".equals(infRecType)){//个人授信协议标识变更请求记录
					//标识项信息：原业务标识码+新业务标识码
					InCtrctIDCagsInf inCtrctIDCagsInf=perCredit.getInCtrctIDCagsInf();
					Fb_keys =inCtrctIDCagsInf.getOdBnesCode()+"|@|"+inCtrctIDCagsInf.getNwBnesCode();
					Fb_keys_desc ="原业务标识码:"+inCtrctIDCagsInf.getOdBnesCode()+"|@|新业务标识码:"+inCtrctIDCagsInf.getNwBnesCode();
				}else if("222".equals(infRecType)){//个人授信协议按段更正请求记录
					//标识项信息：待更正业务标识码+待更正段段标 +信息报告日期
					InCtrctMdfc inCtrctMdfc=perCredit.getInCtrctMdfc();
					Fb_keys = inCtrctMdfc.getBsSgmt().getModRecCode()+"|@|"+inCtrctMdfc.getBsSgmt().getMdfcSgmtCode();//+"|@|"+inCtrctMdfc.getBsSgmt().getRptDate();
					Fb_keys_desc="待更正业务标识码:"+inCtrctMdfc.getBsSgmt().getModRecCode()+"|@|待更正段段标:"+inCtrctMdfc.getBsSgmt().getMdfcSgmtCode()+
					"|@|信息报告日期:"+inCtrctMdfc.getBsSgmt().getRptDate();
					Rpt_date = inCtrctMdfc.getBsSgmt().getRptDate();
				}else if("223".equals(infRecType)){//个人授信协议按段删除请求记录
					//标识项信息：待删除业务标识码+待删除段段标+待删除起始日期+待删除结束日期
					InCtrctDel inCtrctDel=perCredit.getInCtrctDel();
					Fb_keys = inCtrctDel.getDelRecCode()+"|@|"+inCtrctDel.getDelSgmtCode()+
					"|@|"+inCtrctDel.getDelStartDate()+"|@|"+inCtrctDel.getDelEndDate();
					Fb_keys_desc="待删除业务标识码:"+inCtrctDel.getDelRecCode()+"|@|待删除段段标:"+inCtrctDel.getDelSgmtCode()+
					"|@|待删除起始日期:"+inCtrctDel.getDelStartDate()+"|@|待删除结束日期:"+inCtrctDel.getDelEndDate();
				}else if("224".equals(infRecType)){//个人授信协议整笔删除请求记录
					//标识项信息：待删除业务标识码
					InCtrctEntDel inCtrctEntDel=perCredit.getInCtrctEntDel();
					Fb_keys = inCtrctEntDel.getDelRecCode();
					Fb_keys_desc="待删除业务标识码:"+inCtrctEntDel.getDelRecCode();
				}
			}else if("23".equals(infRecType.substring(0, 2))){//个人担保账户信息相关记录
				//1、反馈报文整体解析
				PerGuarantee PerGuarantee=(PerGuarantee) CreateXML.xmlStrToObject(PerGuarantee.class, reported_XML);
//				System.out.println(PerGuarantee.toString());
				//2、对象错误数据分解处理
				if("230".equals(infRecType)){//个人担保账户信息记录
					//标识项信息：账户标识码+信息报告日期
					InSecAcctInf inSecAcctInf=PerGuarantee.getInSecAcctInf();
					Fb_keys = inSecAcctInf.getGuarAcctBsSgmt().getAcctCode();//+"|@|"+inSecAcctInf.getGuarAcctBsSgmt().getRptDate();
					Fb_keys_desc="账户标识码:"+inSecAcctInf.getGuarAcctBsSgmt().getAcctCode()+"|@|信息报告日期:"+inSecAcctInf.getGuarAcctBsSgmt().getRptDate();
					Rpt_date = inSecAcctInf.getGuarAcctBsSgmt().getRptDate();
				}else if("231".equals(infRecType)){//个人担保账户标识变更请求记录
					//标识项信息：原业务标识码+新业务标识码
					InSecAcctIDCagsInf inSecAcctIDCagsInf=PerGuarantee.getInSecAcctIDCagsInf();
					Fb_keys = inSecAcctIDCagsInf.getOdBnesCode()+"|@|"+inSecAcctIDCagsInf.getNwBnesCode();
					Fb_keys_desc="原业务标识码:"+inSecAcctIDCagsInf.getOdBnesCode()+"|@|新业务标识码:"+inSecAcctIDCagsInf.getNwBnesCode();
				}else if("232".equals(infRecType)){//个人担保账户按段更正请求记录
					//标识项信息：待更正业务标识码+账户类型+待更正段段标 +信息报告日期
					InSecAcctMdfc inSecAcctMdfc = PerGuarantee.getInSecAcctMdfc();
					Fb_keys = inSecAcctMdfc.getBsSgmt().getModRecCode()+
					"|@|"+inSecAcctMdfc.getBsSgmt().getMdfcSgmtCode()+
					"|@|"+inSecAcctMdfc.getBsSgmt().getAcctType();
					//+"|@|"+inSecAcctMdfc.getBsSgmt().getRptDate();
					Fb_keys_desc="待更正业务标识码:"+inSecAcctMdfc.getBsSgmt().getModRecCode()+
					"|@|账户类型:"+inSecAcctMdfc.getBsSgmt().getAcctType()+
					"|@|待更正段段标:"+inSecAcctMdfc.getBsSgmt().getMdfcSgmtCode()+
					"|@|信息报告日期:"+inSecAcctMdfc.getBsSgmt().getRptDate();
					Rpt_date = inSecAcctMdfc.getBsSgmt().getRptDate();
				}else if("233".equals(infRecType)){//个人担保账户按段删除请求记录
					//标识项信息：待删除业务标识码+待删除段段标+待删除起始日期+待删除结束日期
					InSecAcctDel inSecAcctDel = PerGuarantee.getInSecAcctDel();
					Fb_keys = inSecAcctDel.getDelRecCode()+"|@|"+inSecAcctDel.getDelSgmtCode()+
					"|@|"+inSecAcctDel.getDelStartDate()+"|@|"+inSecAcctDel.getDelEndDate();
					Fb_keys_desc="待删除业务标识码:"+inSecAcctDel.getDelRecCode()+"|@|待删除段段标:"+inSecAcctDel.getDelSgmtCode()+
					"|@|待删除起始日期:"+inSecAcctDel.getDelStartDate()+"|@|待删除结束日期:"+inSecAcctDel.getDelEndDate();
				}else if("234".equals(infRecType)){//个人担保账户整笔删除请求记录
					//标识项信息：待删除业务标识码
					InSecAcctEntDel inSecAcctEntDel = PerGuarantee.getInSecAcctEntDel();
					Fb_keys = inSecAcctEntDel.getDelRecCode();
					Fb_keys_desc="待删除业务标识码:"+inSecAcctEntDel.getDelRecCode();
				}
			}else if(infRecType.charAt(0)=='3'){//企业基本信息相关记录
				//1、反馈报文整体解析
				EnBaseInfo  enBaseInfo=(EnBaseInfo) CreateXML.xmlStrToObject(EnBaseInfo.class, reported_XML);
				//2、对象错误数据分解处理
				if("310".equals(infRecType)){//企业基本信息记录 
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+信息来源编码+信息报告日期
					EnBasInf enBasInf=enBaseInfo.getEnBasInf();
					Fb_keys = enBasInf.getBsSgmt().getEntName()+"|@|"+enBasInf.getBsSgmt().getEntCertType()+
					"|@|"+enBasInf.getBsSgmt().getEntCertNum()+"|@|"+enBasInf.getBsSgmt().getInfSurcCode();//+"|@|"+enBasInfo.getBsSgmt().getRptDate();
					Fb_keys_desc = "企业名称:"+enBasInf.getBsSgmt().getEntName()+"|@|企业身份标识类型:"+enBasInf.getBsSgmt().getEntCertType()+
					"|@|企业身份标识号码:"+enBasInf.getBsSgmt().getEntCertNum()+"|@|信息来源编码:"+enBasInf.getBsSgmt().getInfSurcCode()+
					"|@|信息报告日期:"+enBasInf.getBsSgmt().getRptDate();
					Rpt_date = enBasInf.getBsSgmt().getRptDate();
				}else if("314".equals(infRecType)){//企业基本信息整笔删除请求记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+信息来源编码
					EnBsInfDlt enBsInfDlt=enBaseInfo.getEnBsInfDlt();
					Fb_keys =enBsInfDlt.getEntName()+"|@|"+enBsInfDlt.getEntCertType()+"|@|"+enBsInfDlt.getEntCertNum()+
					"|@|"+enBsInfDlt.getInfSurcCode();
					Fb_keys_desc = "企业名称:"+enBsInfDlt.getEntName()+"|@|企业身份标识类型:"+enBsInfDlt.getEntCertType()+
					"|@|企业身份标识号码:"+enBsInfDlt.getEntCertNum()+"|@|信息来源编码:"+enBsInfDlt.getInfSurcCode();
				}else if("340".equals(infRecType)){//企业身份标识整合信息记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+企业其他身份标识类型+企业其他身份标识号码+信息报告日期
					EnCtfItgInf enCtfItgInf=enBaseInfo.getEnCtfItgInf();
					Fb_keys = enCtfItgInf.getEntName()+"|@|"+enCtfItgInf.getEntCertType()+
					"|@|"+enCtfItgInf.getEntCertNum()+"|@|"+enCtfItgInf.getOthEntCertType()+
					"|@|"+enCtfItgInf.getOthEntCertNum();//+"|@|"+enCtfItgInf.getRptDate();
					Fb_keys_desc = "企业名称:"+enCtfItgInf.getEntName()+"|@|企业身份标识类型:"+enCtfItgInf.getEntCertType()+
					"|@|企业身份标识号码:"+enCtfItgInf.getEntCertNum()+"|@|企业其他身份标识类型:"+enCtfItgInf.getOthEntCertType()+
					"|@|企业其他身份标识号码:"+enCtfItgInf.getOthEntCertNum()+"|@|信息报告日期:"+enCtfItgInf.getRptDate();
					Rpt_date = enCtfItgInf.getRptDate();
				}else if("350".equals(infRecType)){//企业间关联关系信息记录
					//标识项信息：（A企业名称+）A企业身份标识类型+A企业身份标识号码+（B企业名称+）B企业身份标识类型+B企业身份标识号码+信息报告日期
					EnIcdnRltpInf enIcdnRltpInf=enBaseInfo.getEnIcdnRltpInf();
					Fb_keys =enIcdnRltpInf.getEntName()+"|@|"+enIcdnRltpInf.getEntCertType()+
					"|@|"+enIcdnRltpInf.getEntCertNum()+"|@|"+enIcdnRltpInf.getAssoEntName()+
					"|@|"+enIcdnRltpInf.getAssoEntCertType()+"|@|"+enIcdnRltpInf.getAssoEntCertNum();//+"|@|"+enIcdnRltpInf.getRptDate();
					Fb_keys_desc="A企业名称:"+enIcdnRltpInf.getEntName()+"|@|A企业身份标识类型:"+enIcdnRltpInf.getEntCertType()+
					"|@|A企业身份标识号码："+enIcdnRltpInf.getEntCertNum()+"|@|B企业名称："+enIcdnRltpInf.getAssoEntName()+
					"|@|B企业身份标识类型："+enIcdnRltpInf.getAssoEntCertType()+"|@|B企业身份标识号码："+enIcdnRltpInf.getAssoEntCertNum()+
					"|@|信息报告日期："+enIcdnRltpInf.getRptDate();
					Rpt_date = enIcdnRltpInf.getRptDate();
				}
			}else if("41".equals(infRecType.substring(0, 2))){//企业借贷交易信息相关记录
				//1、反馈报文整体解析
				EnLoanInfo enLoanInfo=(EnLoanInfo) CreateXML.xmlStrToObject(EnLoanInfo.class, reported_XML);
//				System.out.println(enLoanInfo.toString());
				//2、对象错误数据分解处理
				if("410".equals(infRecType)){//企业借贷账户记录
					//标识项信息：账户标识码+信息报告日期
					EnAcctInf enAcctInf =enLoanInfo.getEnAcctInf();
					Fb_keys = enAcctInf.getAcctBsSgmt().getAcctCode();//+"|@|"+enAcctInf.getAcctBsSgmt().getRptDate();
					Fb_keys_desc="账户标识码:"+enAcctInf.getAcctBsSgmt().getAcctCode()+"|@|信息报告日期:"+enAcctInf.getAcctBsSgmt().getRptDate();
					Rpt_date = enAcctInf.getAcctBsSgmt().getRptDate();
				}else if("411".equals(infRecType)){//企业借贷账户标识变更请求记录
					//标识项信息：原业务账户标识号码+新业务账户标识号码
					EnAcctInfIDCagsInf enAcctInfIDCagsInf = enLoanInfo.getEnAcctInfIDCagsInf();
					Fb_keys =enAcctInfIDCagsInf.getOdBnesCode()+"|@|"+enAcctInfIDCagsInf.getNwBnesCode();
					Fb_keys_desc = "原业务账户标识号码:"+enAcctInfIDCagsInf.getOdBnesCode()+"|@|新业务账户标识号码:"+enAcctInfIDCagsInf.getNwBnesCode();
				}else if("412".equals(infRecType)){//企业借贷账户更正请求记录
					//标识项信息：待更正业务标识码+账户类型+待更正段段标 +信息报告日期
					EnAcctInfMdfc enAcctInfMdfc = enLoanInfo.getEnAcctInfMdfc();
					Fb_keys =enAcctInfMdfc.getBsSgmt().getModRecCode()+"|@|"+enAcctInfMdfc.getBsSgmt().getAcctType()+
					"|@|"+enAcctInfMdfc.getBsSgmt().getMdfcSgmtCode();//+"|@|"+enAcctInfMdfc.getBsSgmt().getRptDate();
					Fb_keys_desc = "待更正业务标识码:"+enAcctInfMdfc.getBsSgmt().getModRecCode()+"|@|账户类型:"+enAcctInfMdfc.getBsSgmt().getAcctType()+
					"|@|待更正段段标:"+enAcctInfMdfc.getBsSgmt().getMdfcSgmtCode()+"|@|信息报告日期:"+enAcctInfMdfc.getBsSgmt().getRptDate();
					Rpt_date = enAcctInfMdfc.getBsSgmt().getRptDate();
				}else if("413".equals(infRecType)){//企业借贷账户按段删除请求记录
					//标识项信息：待删除业务标识码+待删除段段标+待删除起始日期+待删除结束日期
					EnAcctInfDel enAcctInfDel = enLoanInfo.getEnAcctInfDel();
					Fb_keys = enAcctInfDel.getDelRecCode()+"|@|"+enAcctInfDel.getDelSgmtCode()+
					"|@|"+enAcctInfDel.getDelStartDate()+"|@|"+enAcctInfDel.getDelEndDate();
					Fb_keys_desc="待删除业务标识码:"+enAcctInfDel.getDelRecCode()+"|@|待删除段段标:"+enAcctInfDel.getDelSgmtCode()+
					"|@|待删除起始日期:"+enAcctInfDel.getDelStartDate()+"|@|待删除结束日期:"+enAcctInfDel.getDelEndDate();
				}else if("414".equals(infRecType)){//企业借贷账户整笔删除请求记录
					//标识项信息：待删除业务标识
					EnAcctInfEntDel enAcctInfEntDel=enLoanInfo.getEnAcctInfEntDel();
					Fb_keys =enAcctInfEntDel.getDelRecCode();
					Fb_keys_desc = "待删除业务标识:"+enAcctInfEntDel.getDelRecCode();
				}
			}else if("42".equals(infRecType.substring(0, 2))){//授信协议信息相关记录
				//1、反馈报文整体解析
				EnCredit enCredit=(EnCredit) CreateXML.xmlStrToObject(EnCredit.class, reported_XML);
//				System.out.println(enCredit.toString());
				//2、对象错误数据分解处理
				if("420".equals(infRecType)){//企业授信协议信息记录
					//标识项信息:授信协议标识码+信息报告日期
					EnCtrctInf enCtrctInf=enCredit.getEnCtrctInf();
					Fb_keys = enCtrctInf.getCtrctBsSgmt().getContractCode();//+"|@|"+enCtrctInf.getCtrctBsSgmt().getRptDate();
					Fb_keys_desc = "授信协议标识码:"+enCtrctInf.getCtrctBsSgmt().getContractCode()+"|@|信息报告日期:"+enCtrctInf.getCtrctBsSgmt().getRptDate();
					Rpt_date = enCtrctInf.getCtrctBsSgmt().getRptDate();
				}else if("421".equals(infRecType)){//企业授信协议标识变更请求记录
					//标识项信息:原业务账户标识号码+新业务账户标识号码
					EnCtrctInfIDCagsInf enCtrctInfIDCagsInf=enCredit.getEnCtrctInfIDCagsInf();
					Fb_keys =enCtrctInfIDCagsInf.getOdBnesCode()+"|@|"+enCtrctInfIDCagsInf.getNwBnesCode();
					Fb_keys_desc = "原业务账户标识号码:"+enCtrctInfIDCagsInf.getOdBnesCode()+"|@|新业务账户标识号码:"+enCtrctInfIDCagsInf.getNwBnesCode();
				}else if("422".equals(infRecType)){//企业授信协议按段更正请求记录
					//标识项信息:待更正业务标识码+账户类型+待更正段段标 +信息报告日期
					EnCtrctInfMdfc enCtrctInfMdfc = enCredit.getEnCtrctInfMdfc();
					Fb_keys =enCtrctInfMdfc.getBsSgmt().getModRecCode()+"|@|"+enCtrctInfMdfc.getBsSgmt().getAcctType()+
					"|@|"+enCtrctInfMdfc.getBsSgmt().getMdfcSgmtCode();//+"|@|"+enCtrctInfMdfc.getBsSgmt().getRptDate();
					Fb_keys_desc = "待更正业务标识码:"+enCtrctInfMdfc.getBsSgmt().getModRecCode()+"|@|账户类型:"+enCtrctInfMdfc.getBsSgmt().getAcctType()+
					"|@|待更正段段标:"+enCtrctInfMdfc.getBsSgmt().getMdfcSgmtCode()+"|@|信息报告日期:"+enCtrctInfMdfc.getBsSgmt().getRptDate();
					Rpt_date = enCtrctInfMdfc.getBsSgmt().getRptDate();
				}else if("423".equals(infRecType)){//企业授信协议按段删除请求记录
					//标识项信息:待删除业务标识码+待删除段段标+待删除起始日期+待删除结束日期
					EnCtrctInfDel enCtrctInfDel=enCredit.getEnCtrctInfDel();
					Fb_keys =enCtrctInfDel.getDelRecCode()+"|@|"+enCtrctInfDel.getDelSgmtCode()+
					"|@|"+enCtrctInfDel.getDelStartDate()+"|@|"+enCtrctInfDel.getDelEndDate();
					Fb_keys_desc = "待删除业务标识码:"+enCtrctInfDel.getDelRecCode()+"|@|待删除段段标:"+enCtrctInfDel.getDelSgmtCode()+
					"|@|待删除起始日期:"+enCtrctInfDel.getDelStartDate()+"|@|待删除结束日期:"+enCtrctInfDel.getDelEndDate();
				}else if("424".equals(infRecType)){//企业授信协议整笔删除请求记录
					//标识项信息:待删除业务标识
					EnCtrctInfEntDel enCtrctInfEntDel=enCredit.getEnCtrctInfEntDel();
					Fb_keys = enCtrctInfEntDel.getDelRecCode();
					Fb_keys_desc = "待删除业务标识:"+enCtrctInfEntDel.getDelRecCode();
				}

			}else if("44".equals(infRecType.substring(0, 2))){//企业担保交易信息相关记录
				//1、反馈报文整体解析
				EnGuarantee enGuarantee=(EnGuarantee) CreateXML.xmlStrToObject(EnGuarantee.class, reported_XML);
//				System.out.println(enGuarantee.toString());
				//2、对象错误数据分解处理
				if("440".equals(infRecType)){//企业担保账户信息记录
					//标识项信息:账户标识码+信息报告日期
					EnSecAcctInf enSecAcctInf=enGuarantee.getEnSecAcctInf();
					Fb_keys = enSecAcctInf.getGuarAcctBsSgmt().getAcctCode();//+"|@|"+enSecAcctInf.getGuarAcctBsSgmt().getRptDate();
					Fb_keys_desc = "账户标识码:"+enSecAcctInf.getGuarAcctBsSgmt().getAcctCode()+"|@|信息报告日期:"+enSecAcctInf.getGuarAcctBsSgmt().getRptDate();
					Rpt_date = enSecAcctInf.getGuarAcctBsSgmt().getRptDate();
				}else if("441".equals(infRecType)){//企业担保账户标识变更请求记录
					//标识项信息:原业务账户标识号码+新业务账户标识号码
					EnSecAcctIDCagsInf enSecAcctIDCagsInf=enGuarantee.getEnSecAcctIDCagsInf();
					Fb_keys = enSecAcctIDCagsInf.getOdBnesCode()+"|@|"+enSecAcctIDCagsInf.getNwBnesCode();
					Fb_keys_desc = "原业务账户标识号码:"+enSecAcctIDCagsInf.getOdBnesCode()+"|@|新业务账户标识号码:"+enSecAcctIDCagsInf.getNwBnesCode();
				}else if("442".equals(infRecType)){//企业担保账户按段更正请求记录
					//标识项信息:待更正业务标识码+账户类型+待更正段段标 +信息报告日期
					EnSecAcctMdfc enSecAcctMdfc=enGuarantee.getEnSecAcctMdfc();
					Fb_keys = enSecAcctMdfc.getBsSgmt().getModRecCode()+"|@|"+enSecAcctMdfc.getBsSgmt().getAcctType()+
					"|@|"+enSecAcctMdfc.getBsSgmt().getMdfcSgmtCode();//+"|@|"+enSecAcctMdfc.getBsSgmt().getRptDate();
					Fb_keys_desc = "待更正业务标识码:"+enSecAcctMdfc.getBsSgmt().getModRecCode()+"|@|账户类型:"+enSecAcctMdfc.getBsSgmt().getAcctType()+
					"|@|待更正段段标:"+enSecAcctMdfc.getBsSgmt().getMdfcSgmtCode()+"|@|信息报告日期:"+enSecAcctMdfc.getBsSgmt().getRptDate();
					Rpt_date = enSecAcctMdfc.getBsSgmt().getRptDate();
				}else if("443".equals(infRecType)){//企业担保账户按段删除请求记录
					//标识项信息:待删除业务标识码+待删除段段标+待删除起始日期+待删除结束日期
					EnSecAcctDel enSecAcctDel = enGuarantee.getEnSecAcctDel();
					Fb_keys = enSecAcctDel.getDelRecCode()+"|@|"+enSecAcctDel.getDelSgmtCode()+
					"|@|"+enSecAcctDel.getDelStartDate()+"|@|"+enSecAcctDel.getDelEndDate();
					Fb_keys_desc = "待删除业务标识码:"+enSecAcctDel.getDelRecCode()+"|@|待删除段段标:"+enSecAcctDel.getDelSgmtCode()+
					"|@|待删除起始日期:"+enSecAcctDel.getDelStartDate()+"|@|待删除结束日期:"+enSecAcctDel.getDelEndDate();
				}else if("444".equals(infRecType)){//企业担保账户整笔删除请求记录
					//标识项信息:待删除业务标识
					EnSecAcctEntDel enSecAcctEntDel=enGuarantee.getEnSecAcctEntDel();
					Fb_keys = enSecAcctEntDel.getDelRecCode();
					Fb_keys_desc = "待删除业务标识:"+enSecAcctEntDel.getDelRecCode();
				}
			}else if("51".equals(infRecType.substring(0, 2))){//抵（质）押物信息相关记录
				if("1".equals(v_error_info.getCri_type())){//个人抵质押解析
					//1、反馈报文整体解析
					PerMotgaCltalCtrctInfo perMotgaCltalCtrctInfo=(PerMotgaCltalCtrctInfo) CreateXML.xmlStrToObject(PerMotgaCltalCtrctInfo.class, reported_XML);
//					System.out.println(perMotgaCltalCtrctInfo.toString());
					//2、对象错误数据分解处理
					if("510".equals(infRecType)){//抵（质）押合同信息记录
						//标识项信息：抵（质）押合同标识码+信息报告日期
						com.dhcc.xml.per.entity.motgacltalctrctinfo.MotgaCltalCtrctInf motgaCltalCtrctInf = perMotgaCltalCtrctInfo.getMotgaCltalCtrctInf();
						Fb_keys = motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getCcCode();//+"|@|"+motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getRptDate();
						Fb_keys_desc = "抵（质）押合同标识码:"+motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getCcCode()+"|@|信息报告日期:"+motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getRptDate();
						Rpt_date = motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getRptDate();
					}else if("511".equals(infRecType)){//抵（质）押合同标识变更请求记录
						//标识项信息：原业务标识码+新业务标识码
						com.dhcc.xml.per.entity.motgacltalctrctinfo.MoCIDCagsInf moCIDCagsInf=perMotgaCltalCtrctInfo.getMoCIDCagsInf();
						Fb_keys = moCIDCagsInf.getOdBnesCode()+"|@|"+moCIDCagsInf.getNwBnesCode();
						Fb_keys_desc = "原业务标识码:"+moCIDCagsInf.getOdBnesCode()+"|@|新业务标识码:"+moCIDCagsInf.getNwBnesCode();
					}else if("514".equals(infRecType)){//抵（质）押合同整笔删除请求记录
						//标识项信息：待删除业务标识码
						com.dhcc.xml.per.entity.motgacltalctrctinfo.MoCEntDel moCEntDel=perMotgaCltalCtrctInfo.getMoCEntDel();
						Fb_keys = moCEntDel.getDelRecCode();
						Fb_keys_desc = "待删除业务标识码:"+moCEntDel.getDelRecCode();
					}
				}else{//企业个人抵质押解析
					//1、反馈报文整体解析
					EnMotgaCltalCtrctInfo enMotgaCltalCtrctInfo=(EnMotgaCltalCtrctInfo) CreateXML.xmlStrToObject(EnMotgaCltalCtrctInfo.class, reported_XML);
//					System.out.println(enMotgaCltalCtrctInfo.toString());
					//2、对象错误数据分解处理
					if("510".equals(infRecType)){//抵（质）押合同信息记录
						//标识项信息：抵（质）押合同标识码+信息报告日期
						com.dhcc.xml.ent.entity.motgacltalctrctinfo.MotgaCltalCtrctInf motgaCltalCtrctInf=enMotgaCltalCtrctInfo.getMotgaCltalCtrctInf();
						Fb_keys = motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getCcCode();//+"|@|"+motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getRptDate();
						Fb_keys_desc = "抵（质）押合同标识码:"+motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getCcCode()+"|@|信息报告日期:"+motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getRptDate();
						Rpt_date = motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getRptDate();
					}else if("511".equals(infRecType)){//抵（质）押合同标识变更请求记录
						//标识项信息：原业务标识码+新业务标识码
						com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCIDCagsInf moCIDCagsInf=enMotgaCltalCtrctInfo.getMoCIDCagsInf();
						Fb_keys = moCIDCagsInf.getOdBnesCode()+"|@|"+moCIDCagsInf.getNwBnesCode();
						Fb_keys_desc = "原业务标识码:"+moCIDCagsInf.getOdBnesCode()+"|@|新业务标识码:"+moCIDCagsInf.getNwBnesCode();
					}else if("514".equals(infRecType)){//抵（质）押合同整笔删除请求记录
						//标识项信息：待删除业务标识码
						com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCEntDel moCEntDel=enMotgaCltalCtrctInfo.getMoCEntDel();
						Fb_keys = moCEntDel.getDelRecCode();
						Fb_keys_desc = "待删除业务标识码:"+moCEntDel.getDelRecCode();
					}
				}
			}else if(infRecType.charAt(0)=='6'){//企业财务信息相关记录
				//1、反馈报文整体解析
				EnFinance enFinance=(EnFinance) CreateXML.xmlStrToObject(EnFinance.class, reported_XML);
//				System.out.println(enFinance.toString());
				//2、对象错误数据分解处理
				if("610".equals(infRecType)){//企业资产负债表信息记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分+信息报告日期
					BalanceSheet balanceSheet=enFinance.getBalanceSheet();
					Fb_keys =balanceSheet.getBalanceSheetBsSgmt().getEntName()+"|@|"+balanceSheet.getBalanceSheetBsSgmt().getEntCertType()+"|@|"+
					balanceSheet.getBalanceSheetBsSgmt().getEntCertNum()+"|@|"+balanceSheet.getBalanceSheetBsSgmt().getSheetYear()+"|@|"+
					balanceSheet.getBalanceSheetBsSgmt().getSheetType()+"|@|"+balanceSheet.getBalanceSheetBsSgmt().getSheetTypeDivide();//+"|@|"+ balanceSheet.getBalanceSheetBsSgmt().getRptDate();
					
					Fb_keys_desc="企业名称:"+balanceSheet.getBalanceSheetBsSgmt().getEntName()+"|@|企业身份标识类型："+balanceSheet.getBalanceSheetBsSgmt().getEntCertType()+"|@|企业身份标识号码："+
					balanceSheet.getBalanceSheetBsSgmt().getEntCertNum()+"|@|报表年份："+balanceSheet.getBalanceSheetBsSgmt().getSheetYear()+"|@|报表类型："+
					balanceSheet.getBalanceSheetBsSgmt().getSheetType()+"|@|报表类型细分："+balanceSheet.getBalanceSheetBsSgmt().getSheetTypeDivide();//+"|@|信息报告日期："+balanceSheet.getBalanceSheetBsSgmt().getRptDate();
					Rpt_date = balanceSheet.getBalanceSheetBsSgmt().getRptDate();
				}else if("620".equals(infRecType)){//企业利润及利润分配表信息记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分+信息报告日期
					IncomeStatementProfitAppropriation incomeStatementProfitAppropriation =enFinance.getIncomeStatementProfitAppropriation();
					Fb_keys =incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getEntName()+"|@|"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getEntCertType()+"|@|"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getEntCertNum()+"|@|"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getSheetYear()+"|@|"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getSheetType()+"|@|"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getSheetTypeDivide();//+"|@|"+incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getRptDate();
					
					Fb_keys_desc ="企业名称:"+incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getEntName()+"|@|企业身份标识类型:"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getEntCertType()+"|@|企业身份标识号码:"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getEntCertNum()+"|@|报表年份:"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getSheetYear()+"|@|报表类型:"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getSheetType()+"|@|报表类型细分:"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getSheetTypeDivide()+"|@|信息报告日期:"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getRptDate();
					Rpt_date = incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getRptDate();
				}else if("630".equals(infRecType)){//企业现金流量表信息记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分+信息报告日期
					CashFlows cashFlows=enFinance.getCashFlows();
					Fb_keys = cashFlows.getCashFlowsBsSgmt().getEntName()+"|@|"+cashFlows.getCashFlowsBsSgmt().getEntCertType()+"|@|"+
					cashFlows.getCashFlowsBsSgmt().getEntCertNum()+"|@|"+cashFlows.getCashFlowsBsSgmt().getSheetYear()+"|@|"+
					cashFlows.getCashFlowsBsSgmt().getSheetType()+"|@|"+cashFlows.getCashFlowsBsSgmt().getSheetTypeDivide();//+"|@|"+cashFlows.getCashFlowsBsSgmt().getRptDate();
					
					Fb_keys_desc = "企业名称:"+cashFlows.getCashFlowsBsSgmt().getEntName()+"|@|企业身份标识类型:"+cashFlows.getCashFlowsBsSgmt().getEntCertType()+"|@|企业身份标识号码:"+
					cashFlows.getCashFlowsBsSgmt().getEntCertNum()+"|@|报表年份:"+cashFlows.getCashFlowsBsSgmt().getSheetYear()+"|@|报表类型:"+
					cashFlows.getCashFlowsBsSgmt().getSheetType()+"|@|报表类型细分:"+cashFlows.getCashFlowsBsSgmt().getSheetTypeDivide()+"|@|信息报告日期:"+
					cashFlows.getCashFlowsBsSgmt().getRptDate();
					Rpt_date = cashFlows.getCashFlowsBsSgmt().getRptDate();
				}else if("640".equals(infRecType)){//事业单位资产负债表信息记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分+信息报告日期
					InstitutionBalanceSheet institutionBalanceSheet = enFinance.getInstitutionBalanceSheet();
					Fb_keys = institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getEntName()+"|@|"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getEntCertType()+"|@|"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getEntCertNum()+"|@|"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getSheetYear()+"|@|"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getSheetType()+"|@|"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getSheetTypeDivide();//+"|@|"+institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getRptDate();
					
					Fb_keys_desc = "企业名称:"+institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getEntName()+"|@|企业身份标识类型:"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getEntCertType()+"|@|企业身份标识号码:"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getEntCertNum()+"|@|报表年份:"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getSheetYear()+"|@|报表类型:"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getSheetType()+"|@|报表类型细分:"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getSheetTypeDivide()+"|@|信息报告日期:"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getRptDate();
					Rpt_date = institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getRptDate();
				}else if("650".equals(infRecType)){//事业单位收入支出表信息记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分+信息报告日期
					IncomeAndExpenseStatement incomeAndExpenseStatement = enFinance.getIncomeAndExpenseStatement();
					Fb_keys = incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getEntName()+"|@|"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getEntCertType()+"|@|"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getEntCertNum()+"|@|"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getSheetYear()+"|@|"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getSheetType()+"|@|"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getSheetTypeDivide();//+"|@|"+incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getRptDate();
					
					Fb_keys_desc = "企业名称:"+incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getEntName()+"|@|企业身份标识类型:"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getEntCertType()+"|@|企业身份标识号码:"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getEntCertNum()+"|@|报表年份:"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getSheetYear()+"|@|报表类型:"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getSheetType()+"|@|报表类型细分:"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getSheetTypeDivide()+"|@|信息报告日期:"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getRptDate();
					Rpt_date = incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getRptDate();
				}else if("614".equals(infRecType)){//企业资产负债表整笔删除请求记录
					BalanceSheetDlt balanceSheetDlt=enFinance.getBalanceSheetDlt();
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分
					Fb_keys = balanceSheetDlt.getEntName()+"|@|"+balanceSheetDlt.getEntCertType()+"|@|"+balanceSheetDlt.getEntCertNum()+"|@|"+
					balanceSheetDlt.getSheetYear()+"|@|"+balanceSheetDlt.getSheetType()+"|@|"+balanceSheetDlt.getSheetTypeDivide();
					
					Fb_keys_desc="企业名称:"+balanceSheetDlt.getEntName()+"|@|企业身份标识类型:"+balanceSheetDlt.getEntCertType()+"|@|企业身份标识号码:"+balanceSheetDlt.getEntCertNum()+"|@|报表年份:"+
					balanceSheetDlt.getSheetYear()+"|@|报表类型:"+balanceSheetDlt.getSheetType()+"|@|报表类型细分:"+balanceSheetDlt.getSheetTypeDivide();
				}else if("624".equals(infRecType)){//企业利润及利润分配表整笔删除请求记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分
					IncomeStatementProfitAppropriationDlt incomeStatementProfitAppropriationDlt=enFinance.getIncomeStatementProfitAppropriationDlt();
					Fb_keys = incomeStatementProfitAppropriationDlt.getEntName()+"|@|"+incomeStatementProfitAppropriationDlt.getEntCertType()+"|@|"+
					incomeStatementProfitAppropriationDlt.getEntCertNum()+"|@|"+incomeStatementProfitAppropriationDlt.getSheetYear()+"|@|"+
					incomeStatementProfitAppropriationDlt.getSheetType()+"|@|"+incomeStatementProfitAppropriationDlt.getSheetTypeDivide();
					
					Fb_keys_desc = "企业名称:"+incomeStatementProfitAppropriationDlt.getEntName()+"|@|企业身份标识类型:"+incomeStatementProfitAppropriationDlt.getEntCertType()+"|@|企业身份标识号码:"+
					incomeStatementProfitAppropriationDlt.getEntCertNum()+"|@|报表年份:"+incomeStatementProfitAppropriationDlt.getSheetYear()+"|@|报表类型:"+
					incomeStatementProfitAppropriationDlt.getSheetType()+"|@|报表类型细分:"+incomeStatementProfitAppropriationDlt.getSheetTypeDivide();
				}else if("634".equals(infRecType)){//企业现金流量表整笔删除请求记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分
					CashFlowsDlt cashFlowsDlt=enFinance.getCashFlowsDlt();
					Fb_keys =cashFlowsDlt.getEntName()+"|@|"+cashFlowsDlt.getEntCertType()+"|@|"+cashFlowsDlt.getEntCertNum()+"|@|"+
					cashFlowsDlt.getSheetYear()+"|@|"+cashFlowsDlt.getSheetType()+"|@|"+cashFlowsDlt.getSheetTypeDivide();
					
					Fb_keys_desc="企业名称:"+cashFlowsDlt.getEntName()+"|@|企业身份标识类型:"+cashFlowsDlt.getEntCertType()+"|@|企业身份标识号码:"+cashFlowsDlt.getEntCertNum()+"|@|报表年份:"+
					cashFlowsDlt.getSheetYear()+"|@|报表类型:"+cashFlowsDlt.getSheetType()+"|@|报表类型细分:"+cashFlowsDlt.getSheetTypeDivide();
				}else if("644".equals(infRecType)){//事业单位资产负债表整笔删除请求记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分
					InstitutionBalanceSheetDlt institutionBalanceSheetDlt=enFinance.getInstitutionBalanceSheetDlt();
					Fb_keys =institutionBalanceSheetDlt.getEntName()+"|@|"+institutionBalanceSheetDlt.getEntCertType()+"|@|"+
					institutionBalanceSheetDlt.getEntCertNum()+"|@|"+institutionBalanceSheetDlt.getSheetYear()+"|@|"+
					institutionBalanceSheetDlt.getSheetType()+"|@|"+institutionBalanceSheetDlt.getSheetTypeDivide();

					Fb_keys_desc="企业名称:"+institutionBalanceSheetDlt.getEntName()+"|@|企业身份标识类型:"+institutionBalanceSheetDlt.getEntCertType()+"|@|企业身份标识号码:"+
					institutionBalanceSheetDlt.getEntCertNum()+"|@|报表年份:"+institutionBalanceSheetDlt.getSheetYear()+"|@|报表类型:"+
					institutionBalanceSheetDlt.getSheetType()+"|@|报表类型细分:"+institutionBalanceSheetDlt.getSheetTypeDivide();
				}else if("654".equals(infRecType)){//事业单位收入支出表整笔删除请求记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分
					IncomeAndExpenseStatementDlt incomeAndExpenseStatementDlt=enFinance.getIncomeAndExpenseStatementDlt();
					Fb_keys = incomeAndExpenseStatementDlt.getEntName()+"|@|"+incomeAndExpenseStatementDlt.getEntCertType()+"|@|"+
					incomeAndExpenseStatementDlt.getEntCertNum()+"|@|"+incomeAndExpenseStatementDlt.getSheetYear()+"|@|"+
					incomeAndExpenseStatementDlt.getSheetType()+"|@|"+incomeAndExpenseStatementDlt.getSheetTypeDivide();
					
					Fb_keys_desc= "企业名称:"+incomeAndExpenseStatementDlt.getEntName()+"|@|企业身份标识类型:"+incomeAndExpenseStatementDlt.getEntCertType()+"|@|企业身份标识号码:"+
					incomeAndExpenseStatementDlt.getEntCertNum()+"|@|报表年份:"+incomeAndExpenseStatementDlt.getSheetYear()+"|@|报表类型:"+
					incomeAndExpenseStatementDlt.getSheetType()+"|@|报表类型细分:"+incomeAndExpenseStatementDlt.getSheetTypeDivide();
				}
			}
//			v_error_info.setFile_name(gen_file_name);
			v_error_info.setRecord_id(Fb_keys);
			v_error_info.setErr_keys(Fb_keys);
			v_error_info.setErr_keys_desc(Fb_keys_desc);
			v_error_info.setRpt_date(Rpt_date);
	  }

	/**
	 * 校验错误：根据对象提取校验错误信息
	 * @param infRecType
	 * @param object
	 * @param v_error_info
	 */
	public static void getFb_keys(String infRecType,Object object,V_ERROR_INFO v_error_info) {
		  String Fb_keys = "";//各类型数据主键信息
		  String Fb_keys_desc = "";//主键信息详情描述
		  String Rpt_date = "";//原数据的报送日期
		  if(infRecType.charAt(0)=='1'){//个人基本信息相关记录
				//1、反馈报文整体解析
				PerDocument perDocument=(PerDocument) object;
//				System.out.println(perBaseInfo.toString());
				//2、对象错误数据分解处理
				if("110".equals(infRecType)){//个人基本信息记录
					//标识项信息：（姓名+）证件类型+证件号码+信息来源编码+信息报告日期
					InBasInf inBasInf = perDocument.getInBasInf();
					BsSgmt bsSgmt=inBasInf.getBsSgmt();
					Fb_keys = bsSgmt.getName()+"|@|"+bsSgmt.getIDType()+"|@|"+bsSgmt.getIDNum()+
					"|@|"+bsSgmt.getInfSurcCode();//+"|@|"+bsSgmt.getRptDate();
					
					Fb_keys_desc = "姓名:"+bsSgmt.getName()+"|@|证件类型:"+bsSgmt.getIDType()+"|@|证件号码:"+bsSgmt.getIDNum()+
					"|@|信息来源编码:"+bsSgmt.getInfSurcCode()+"|@|信息报告日期:"+bsSgmt.getRptDate();
					
					Rpt_date = bsSgmt.getRptDate();
				}else if("114".equals(infRecType)){//个人基本信息整笔删除请求记录
					//标识项信息：（姓名+）证件类型+证件号码+信息来源编码
					InBsInfDlt inBsInfDlt = perDocument.getInBsInfDlt();
					Fb_keys = inBsInfDlt.getName()+"|@|"+inBsInfDlt.getIDType()+"|@|"+inBsInfDlt.getIDNum()+"|@|"+inBsInfDlt.getInfSurcCode();
					Fb_keys_desc="姓名:"+inBsInfDlt.getName()+"|@|证件类型:"+inBsInfDlt.getIDType()+"|@|证件号码:"+inBsInfDlt.getIDNum()+"|@|信息来源编码:"+inBsInfDlt.getInfSurcCode();
				}else if ("120".equals(infRecType)){//家族关系信息记录
					//标识项信息：（A姓名+）A证件类型+A证件号码+（B姓名+）B证件类型+B证件号码+信息来源编码+信息报告日期
					InFalMmbsInf inFalMmbsInf = perDocument.getInFalMmbsInf();
					Fb_keys=inFalMmbsInf.getName()+"|@|"+inFalMmbsInf.getIDType()+"|@|"+inFalMmbsInf.getIDNum()+
					"|@|"+inFalMmbsInf.getFamMemName()+"|@|"+inFalMmbsInf.getFamMemCertType()+
					"|@|"+inFalMmbsInf.getFamMemCertNum()+"|@|"+inFalMmbsInf.getInfSurcCode();//+"|@|"+inFalMmbsInf.getRptDate();
					
					Fb_keys_desc="A姓名:"+inFalMmbsInf.getName()+"|@|A证件类型:"+inFalMmbsInf.getIDType()+"|@|A证件号码:"+inFalMmbsInf.getIDNum()+
					"|@|B姓名:"+inFalMmbsInf.getFamMemName()+"|@|B证件类型:"+inFalMmbsInf.getFamMemCertType()+
					"|@|B证件号码:"+inFalMmbsInf.getFamMemCertNum()+"|@|信息来源编码:"+inFalMmbsInf.getInfSurcCode()+
					"|@|信息报告日期:"+inFalMmbsInf.getRptDate();
					Rpt_date = inFalMmbsInf.getRptDate();
				}else if ("130".equals(infRecType)){//个人证件有效期信息记录
					//标识项信息：（姓名+）证件类型+证件号码+信息来源编码+信息报告日期
					InIDEfctInf inIDEfctInf = perDocument.getInIDEfctInf();
					Fb_keys=inIDEfctInf.getName()+"|@|"+inIDEfctInf.getIDType()+
					"|@|"+inIDEfctInf.getIDNum()+"|@|"+inIDEfctInf.getInfSurcCode();//+"|@|"+inIDEfctInf.getRptDate();
					
					Fb_keys_desc="姓名:"+inIDEfctInf.getName()+"|@|证件类型:"+inIDEfctInf.getIDType()+
					"|@|证件号码:"+inIDEfctInf.getIDNum()+"|@|信息来源编码："+inIDEfctInf.getInfSurcCode()+
					"|@|信息报告日期："+inIDEfctInf.getRptDate();
					Rpt_date = inIDEfctInf.getRptDate();
				}else if ("134".equals(infRecType)){//个人证件有效期信息整笔删除请求记录
					//标识项信息：（姓名+）证件类型+证件号码+信息来源编码
					InIDEfctInfDlt inIDEfctInfDlt=perDocument.getInIDEfctInfDlt();
					Fb_keys=inIDEfctInfDlt.getName()+"|@|"+inIDEfctInfDlt.getIDType()+"|@|"+inIDEfctInfDlt.getIDNum()+"|@|"+inIDEfctInfDlt.getInfSurcCode();
					Fb_keys_desc="证件类型:"+inIDEfctInfDlt.getIDType()+"|@|证件号码:"+inIDEfctInfDlt.getIDNum()+"|@|信息来源编码:"+inIDEfctInfDlt.getInfSurcCode();
				}else if ("140".equals(infRecType)){//个人证件整合信息记录
					//标识项信息：（姓名+）证件类型+证件号码+（其他姓名+）其他证件类型+其他证件号码+信息来源编码+信息报告日期
					InCtfItgInf inCtfItgInf = perDocument.getInCtfItgInf();
					Fb_keys=inCtfItgInf.getName()+"|@|"+inCtfItgInf.getIDType()+"|@|"+inCtfItgInf.getIDNum()+
					"|@|"+inCtfItgInf.getOthName()+"|@|"+inCtfItgInf.getOthIDType()+"|@|"+inCtfItgInf.getOthIDNum()+
					"|@|"+inCtfItgInf.getInfSurcCode();//+"|@|"+inCtfItgInf.getRptDate();
					
					Fb_keys_desc="姓名:"+inCtfItgInf.getName()+"|@|证件类型:"+inCtfItgInf.getIDType()+"|@|证件号码:"+inCtfItgInf.getIDNum()+
					"|@|其他姓名:"+inCtfItgInf.getOthName()+"|@|其他证件类型:"+inCtfItgInf.getOthIDType()+"|@|其他证件号码:"+inCtfItgInf.getOthIDNum()+
					"|@|信息来源编码:"+inCtfItgInf.getInfSurcCode()+"|@|信息报告日期:"+inCtfItgInf.getRptDate();
					Rpt_date = inCtfItgInf.getRptDate();
				}
			}else if("21".equals(infRecType.substring(0, 2))){//个人借贷信息相关记录
				//1、反馈报文整体解析
			    PerDocument perDocument=(PerDocument) object;
//				System.out.println(perLoanInfo.toString());
				//2、对象错误数据分解处理
				if("210".equals(infRecType)){//个人借贷账户信息记录
					//标识项信息：账户标识码+信息报告日期
					InAcctInf inAcctInf=perDocument.getInAcctInf();
					AcctBsSgmt acctBsSgmt=inAcctInf.getAcctBsSgmt();
					Fb_keys=acctBsSgmt.getAcctCode();//+"|@|"+acctBsSgmt.getRptDate();
					Fb_keys_desc="账户标识码:"+acctBsSgmt.getAcctCode()+"|@|信息报告日期："+acctBsSgmt.getRptDate();
					Rpt_date = acctBsSgmt.getRptDate();
				}else if ("211".equals(infRecType)){//个人借贷账户标识变更请求记录
					//标识项信息：老账户标识码+新账户标识码
					InAcctIDCagsInf inAcctIDCagsInf= perDocument.getInAcctIDCagsInf();
					Fb_keys=inAcctIDCagsInf.getOdBnesCode()+"|@|"+inAcctIDCagsInf.getNwBnesCode();
					Fb_keys_desc="老账户标识码:"+inAcctIDCagsInf.getOdBnesCode()+"|@|新账户标识码:"+inAcctIDCagsInf.getNwBnesCode();
				}else if ("212".equals(infRecType)){//个人借贷账户按段更正请求记录
					//标识项信息：待更正业务标识码+账户类型+待更正段段标 +信息报告日期
					InAcctMdfc inAcctMdfc = perDocument.getInAcctMdfc();
					Fb_keys=inAcctMdfc.getBsSgmt().getModRecCode()+"|@|"+inAcctMdfc.getBsSgmt().getAcctType()+
					"|@|"+inAcctMdfc.getBsSgmt().getMdfcSgmtCode();//+"|@|"+inAcctMdfc.getBsSgmt().getRptDate();
					Fb_keys_desc="待更正业务标识码:"+inAcctMdfc.getBsSgmt().getModRecCode()+"|@|账户类型:"+inAcctMdfc.getBsSgmt().getAcctType()+
					"|@|待更正段段标"+inAcctMdfc.getBsSgmt().getMdfcSgmtCode()+"|@|信息报告日期"+inAcctMdfc.getBsSgmt().getRptDate();
					Rpt_date = inAcctMdfc.getBsSgmt().getRptDate();
				}else if ("213".equals(infRecType)){//个人借贷账户按段删除请求记录
					//标识项信息：待删除业务标识码+待删除段段标+待删除起始日期+待删除结束日期
					InAcctDel InAcctDel =(InAcctDel)perDocument.getInAcctDel();
					Fb_keys = InAcctDel.getDelRecCode()+"|@|"+InAcctDel.getDelSgmtCode()+"|@|"+InAcctDel.getDelStartDate()+"|@|"+InAcctDel.getDelEndDate();
					Fb_keys_desc= "待删除业务标识码:"+InAcctDel.getDelRecCode()+"|@|待删除段段标:"+InAcctDel.getDelSgmtCode()+"|@|待删除起始日期:"+InAcctDel.getDelStartDate()+"|@|待删除结束日期:"+InAcctDel.getDelEndDate();
				}else if ("214".equals(infRecType)){//个人借贷账户整笔删除请求记录
					//标识项信息：待删除业务标识码
					InAcctEntDel InAcctEntDel=(InAcctEntDel)perDocument.getInAcctEntDel();
					Fb_keys = InAcctEntDel.getDelRecCode();
					Fb_keys_desc="待删除业务标识码:" + InAcctEntDel.getDelRecCode();
				}else if ("215".equals(infRecType)){//个人借贷账户特殊事件说明记录
					//标识项信息：账户标识码+事件类型+发生月份+生效标志+信息报告日期
					InSpcEvtDscInf inSpcEvtDscInf=(InSpcEvtDscInf)perDocument.getInSpcEvtDscInf();
					Fb_keys = inSpcEvtDscInf.getAcctCode()+"|@|"+inSpcEvtDscInf.getOpetnType()+
					"|@|"+inSpcEvtDscInf.getMonth()+"|@|"+inSpcEvtDscInf.getFlag();//+"|@|"+inSpcEvtDscInf.getRptDate();
					Fb_keys_desc = "账户标识码:"+inSpcEvtDscInf.getAcctCode()+"|@|事件类型:"+inSpcEvtDscInf.getOpetnType()+
					"|@|发生月份:"+inSpcEvtDscInf.getMonth()+"|@|生效标志:"+inSpcEvtDscInf.getFlag()+
					"|@|信息报告日期:"+inSpcEvtDscInf.getRptDate();
					Rpt_date = inSpcEvtDscInf.getRptDate();
				}
			}else if("22".equals(infRecType.substring(0, 2))){//个人授信协议信息相关记录
				//1、反馈报文整体解析
			  	PerDocument perDocument=(PerDocument) object;
				//2、对象错误数据分解处理
				if("220".equals(infRecType)){//个人授信协议信息记录
					//标识项信息：授信协议标识码+信息报告日期
					InCtrctInf inCtrctInf=perDocument.getInCtrctInf();
					Fb_keys = inCtrctInf.getCtrctBsSgmt().getContractCode();//+"|@|"+inCtrctInf.getCtrctBsSgmt().getRptDate();
					Fb_keys_desc = "授信协议标识码:"+inCtrctInf.getCtrctBsSgmt().getContractCode()+"|@|信息报告日期:"+inCtrctInf.getCtrctBsSgmt().getRptDate();
					Rpt_date = inCtrctInf.getCtrctBsSgmt().getRptDate();
				}else if("221".equals(infRecType)){//个人授信协议标识变更请求记录
					//标识项信息：原业务标识码+新业务标识码
					InCtrctIDCagsInf inCtrctIDCagsInf=perDocument.getInCtrctIDCagsInf();
					Fb_keys =inCtrctIDCagsInf.getOdBnesCode()+"|@|"+inCtrctIDCagsInf.getNwBnesCode();
					Fb_keys_desc ="原业务标识码:"+inCtrctIDCagsInf.getOdBnesCode()+"|@|新业务标识码:"+inCtrctIDCagsInf.getNwBnesCode();
				}else if("222".equals(infRecType)){//个人授信协议按段更正请求记录
					//标识项信息：待更正业务标识码+待更正段段标 +信息报告日期
					InCtrctMdfc inCtrctMdfc=perDocument.getInCtrctMdfc();
					Fb_keys = inCtrctMdfc.getBsSgmt().getModRecCode()+"|@|"+inCtrctMdfc.getBsSgmt().getMdfcSgmtCode();//+"|@|"+inCtrctMdfc.getBsSgmt().getRptDate();
					Fb_keys_desc="待更正业务标识码:"+inCtrctMdfc.getBsSgmt().getModRecCode()+"|@|待更正段段标:"+inCtrctMdfc.getBsSgmt().getMdfcSgmtCode()+
					"|@|信息报告日期:"+inCtrctMdfc.getBsSgmt().getRptDate();
					Rpt_date = inCtrctMdfc.getBsSgmt().getRptDate();
				}else if("223".equals(infRecType)){//个人授信协议按段删除请求记录
					//标识项信息：待删除业务标识码+待删除段段标+待删除起始日期+待删除结束日期
					InCtrctDel inCtrctDel=perDocument.getInCtrctDel();
					Fb_keys = inCtrctDel.getDelRecCode()+"|@|"+inCtrctDel.getDelSgmtCode()+
					"|@|"+inCtrctDel.getDelStartDate()+"|@|"+inCtrctDel.getDelEndDate();
					Fb_keys_desc="待删除业务标识码:"+inCtrctDel.getDelRecCode()+"|@|待删除段段标:"+inCtrctDel.getDelSgmtCode()+
					"|@|待删除起始日期:"+inCtrctDel.getDelStartDate()+"|@|待删除结束日期:"+inCtrctDel.getDelEndDate();
				}else if("224".equals(infRecType)){//个人授信协议整笔删除请求记录
					//标识项信息：待删除业务标识码
					InCtrctEntDel inCtrctEntDel=perDocument.getInCtrctEntDel();
					Fb_keys = inCtrctEntDel.getDelRecCode();
					Fb_keys_desc="待删除业务标识码:"+inCtrctEntDel.getDelRecCode();
				}
			}else if("23".equals(infRecType.substring(0, 2))){//个人担保账户信息相关记录
				//1、反馈报文整体解析
			  	PerDocument perDocument=(PerDocument) object;
//				System.out.println(PerGuarantee.toString());
				//2、对象错误数据分解处理
				if("230".equals(infRecType)){//个人担保账户信息记录
					//标识项信息：账户标识码+信息报告日期
					InSecAcctInf inSecAcctInf=perDocument.getInSecAcctInf();
					Fb_keys = inSecAcctInf.getGuarAcctBsSgmt().getAcctCode();//+"|@|"+inSecAcctInf.getGuarAcctBsSgmt().getRptDate();
					Fb_keys_desc="账户标识码:"+inSecAcctInf.getGuarAcctBsSgmt().getAcctCode()+"|@|信息报告日期:"+inSecAcctInf.getGuarAcctBsSgmt().getRptDate();
					Rpt_date = inSecAcctInf.getGuarAcctBsSgmt().getRptDate();
				}else if("231".equals(infRecType)){//个人担保账户标识变更请求记录
					//标识项信息：原业务标识码+新业务标识码
					InSecAcctIDCagsInf inSecAcctIDCagsInf=perDocument.getInSecAcctIDCagsInf();
					Fb_keys = inSecAcctIDCagsInf.getOdBnesCode()+"|@|"+inSecAcctIDCagsInf.getNwBnesCode();
					Fb_keys_desc="原业务标识码:"+inSecAcctIDCagsInf.getOdBnesCode()+"|@|新业务标识码:"+inSecAcctIDCagsInf.getNwBnesCode();
				}else if("232".equals(infRecType)){//个人担保账户按段更正请求记录
					//标识项信息：待更正业务标识码+账户类型+待更正段段标 +信息报告日期
					InSecAcctMdfc inSecAcctMdfc = perDocument.getInSecAcctMdfc();
					Fb_keys = inSecAcctMdfc.getBsSgmt().getModRecCode()+
					"|@|"+inSecAcctMdfc.getBsSgmt().getMdfcSgmtCode()+
					"|@|"+inSecAcctMdfc.getBsSgmt().getAcctType();
					//+"|@|"+inSecAcctMdfc.getBsSgmt().getRptDate();
					Fb_keys_desc="待更正业务标识码:"+inSecAcctMdfc.getBsSgmt().getModRecCode()+
					"|@|账户类型:"+inSecAcctMdfc.getBsSgmt().getAcctType()+
					"|@|待更正段段标:"+inSecAcctMdfc.getBsSgmt().getMdfcSgmtCode()+
					"|@|信息报告日期:"+inSecAcctMdfc.getBsSgmt().getRptDate();
					Rpt_date = inSecAcctMdfc.getBsSgmt().getRptDate();
				}else if("233".equals(infRecType)){//个人担保账户按段删除请求记录
					//标识项信息：待删除业务标识码+待删除段段标+待删除起始日期+待删除结束日期
					InSecAcctDel inSecAcctDel = perDocument.getInSecAcctDel();
					Fb_keys = inSecAcctDel.getDelRecCode()+"|@|"+inSecAcctDel.getDelSgmtCode()+
					"|@|"+inSecAcctDel.getDelStartDate()+"|@|"+inSecAcctDel.getDelEndDate();
					Fb_keys_desc="待删除业务标识码:"+inSecAcctDel.getDelRecCode()+"|@|待删除段段标:"+inSecAcctDel.getDelSgmtCode()+
					"|@|待删除起始日期:"+inSecAcctDel.getDelStartDate()+"|@|待删除结束日期:"+inSecAcctDel.getDelEndDate();
				}else if("234".equals(infRecType)){//个人担保账户整笔删除请求记录
					//标识项信息：待删除业务标识码
					InSecAcctEntDel inSecAcctEntDel = perDocument.getInSecAcctEntDel();
					Fb_keys = inSecAcctEntDel.getDelRecCode();
					Fb_keys_desc="待删除业务标识码:"+inSecAcctEntDel.getDelRecCode();
				}
			}else if(infRecType.charAt(0)=='3'){//企业基本信息相关记录
				//1、反馈报文整体解析
			  	EntDocument entDocument=(EntDocument) object;
//				EnBaseInfo  enBaseInfo=(EnBaseInfo)object;
				//2、对象错误数据分解处理
				if("310".equals(infRecType)){//企业基本信息记录 
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+信息来源编码+信息报告日期
					EnBasInf enBasInf=entDocument.getEnBasInf();
					Fb_keys = enBasInf.getBsSgmt().getEntName()+"|@|"+enBasInf.getBsSgmt().getEntCertType()+
					"|@|"+enBasInf.getBsSgmt().getEntCertNum()+"|@|"+enBasInf.getBsSgmt().getInfSurcCode();//+"|@|"+enBasInfo.getBsSgmt().getRptDate();
					Fb_keys_desc = "企业名称:"+enBasInf.getBsSgmt().getEntName()+"|@|企业身份标识类型:"+enBasInf.getBsSgmt().getEntCertType()+
					"|@|企业身份标识号码:"+enBasInf.getBsSgmt().getEntCertNum()+"|@|信息来源编码:"+enBasInf.getBsSgmt().getInfSurcCode()+
					"|@|信息报告日期:"+enBasInf.getBsSgmt().getRptDate();
					Rpt_date = enBasInf.getBsSgmt().getRptDate();
				}else if("314".equals(infRecType)){//企业基本信息整笔删除请求记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+信息来源编码
					EnBsInfDlt enBsInfDlt=entDocument.getEnBsInfDlt();
					Fb_keys =enBsInfDlt.getEntName()+"|@|"+enBsInfDlt.getEntCertType()+"|@|"+enBsInfDlt.getEntCertNum()+
					"|@|"+enBsInfDlt.getInfSurcCode();
					Fb_keys_desc = "企业名称:"+enBsInfDlt.getEntName()+"|@|企业身份标识类型:"+enBsInfDlt.getEntCertType()+
					"|@|企业身份标识号码:"+enBsInfDlt.getEntCertNum()+"|@|信息来源编码:"+enBsInfDlt.getInfSurcCode();
				}else if("340".equals(infRecType)){//企业身份标识整合信息记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+企业其他身份标识类型+企业其他身份标识号码+信息报告日期
					EnCtfItgInf enCtfItgInf=entDocument.getEnCtfItgInf();
					Fb_keys = enCtfItgInf.getEntName()+"|@|"+enCtfItgInf.getEntCertType()+
					"|@|"+enCtfItgInf.getEntCertNum()+"|@|"+enCtfItgInf.getOthEntCertType()+
					"|@|"+enCtfItgInf.getOthEntCertNum();//+"|@|"+enCtfItgInf.getRptDate();
					Fb_keys_desc = "企业名称:"+enCtfItgInf.getEntName()+"|@|企业身份标识类型:"+enCtfItgInf.getEntCertType()+
					"|@|企业身份标识号码:"+enCtfItgInf.getEntCertNum()+"|@|企业其他身份标识类型:"+enCtfItgInf.getOthEntCertType()+
					"|@|企业其他身份标识号码:"+enCtfItgInf.getOthEntCertNum()+"|@|信息报告日期:"+enCtfItgInf.getRptDate();
					Rpt_date = enCtfItgInf.getRptDate();
				}else if("350".equals(infRecType)){//企业间关联关系信息记录
					//标识项信息：（A企业名称+）A企业身份标识类型+A企业身份标识号码+（B企业名称+）B企业身份标识类型+B企业身份标识号码+信息报告日期
					EnIcdnRltpInf enIcdnRltpInf=entDocument.getEnIcdnRltpInf();
					Fb_keys =enIcdnRltpInf.getEntName()+"|@|"+enIcdnRltpInf.getEntCertType()+
					"|@|"+enIcdnRltpInf.getEntCertNum()+"|@|"+enIcdnRltpInf.getAssoEntName()+
					"|@|"+enIcdnRltpInf.getAssoEntCertType()+"|@|"+enIcdnRltpInf.getAssoEntCertNum();//+"|@|"+enIcdnRltpInf.getRptDate();
					Fb_keys_desc="A企业名称:"+enIcdnRltpInf.getEntName()+"|@|A企业身份标识类型:"+enIcdnRltpInf.getEntCertType()+
					"|@|A企业身份标识号码："+enIcdnRltpInf.getEntCertNum()+"|@|B企业名称："+enIcdnRltpInf.getAssoEntName()+
					"|@|B企业身份标识类型："+enIcdnRltpInf.getAssoEntCertType()+"|@|B企业身份标识号码："+enIcdnRltpInf.getAssoEntCertNum()+
					"|@|信息报告日期："+enIcdnRltpInf.getRptDate();
					Rpt_date = enIcdnRltpInf.getRptDate();
				}
			}else if("41".equals(infRecType.substring(0, 2))){//企业借贷交易信息相关记录
				//1、反馈报文整体解析
			  	EntDocument entDocument=(EntDocument) object;
//				EnLoanInfo enLoanInfo=(EnLoanInfo)object;
//				System.out.println(enLoanInfo.toString());
				//2、对象错误数据分解处理
				if("410".equals(infRecType)){//企业借贷账户记录
					//标识项信息：账户标识码+信息报告日期
					EnAcctInf enAcctInf =entDocument.getEnAcctInf();
					Fb_keys = enAcctInf.getAcctBsSgmt().getAcctCode();//+"|@|"+enAcctInf.getAcctBsSgmt().getRptDate();
					Fb_keys_desc="账户标识码:"+enAcctInf.getAcctBsSgmt().getAcctCode()+"|@|信息报告日期:"+enAcctInf.getAcctBsSgmt().getRptDate();
					Rpt_date = enAcctInf.getAcctBsSgmt().getRptDate();
				}else if("411".equals(infRecType)){//企业借贷账户标识变更请求记录
					//标识项信息：原业务账户标识号码+新业务账户标识号码
					EnAcctInfIDCagsInf enAcctInfIDCagsInf = entDocument.getEnAcctInfIDCagsInf();
					Fb_keys =enAcctInfIDCagsInf.getOdBnesCode()+"|@|"+enAcctInfIDCagsInf.getNwBnesCode();
					Fb_keys_desc = "原业务账户标识号码:"+enAcctInfIDCagsInf.getOdBnesCode()+"|@|新业务账户标识号码:"+enAcctInfIDCagsInf.getNwBnesCode();
				}else if("412".equals(infRecType)){//企业借贷账户更正请求记录
					//标识项信息：待更正业务标识码+账户类型+待更正段段标 +信息报告日期
					EnAcctInfMdfc enAcctInfMdfc = entDocument.getEnAcctInfMdfc();
					Fb_keys =enAcctInfMdfc.getBsSgmt().getModRecCode()+"|@|"+enAcctInfMdfc.getBsSgmt().getAcctType()+
					"|@|"+enAcctInfMdfc.getBsSgmt().getMdfcSgmtCode();//+"|@|"+enAcctInfMdfc.getBsSgmt().getRptDate();
					Fb_keys_desc = "待更正业务标识码:"+enAcctInfMdfc.getBsSgmt().getModRecCode()+"|@|账户类型:"+enAcctInfMdfc.getBsSgmt().getAcctType()+
					"|@|待更正段段标:"+enAcctInfMdfc.getBsSgmt().getMdfcSgmtCode()+"|@|信息报告日期:"+enAcctInfMdfc.getBsSgmt().getRptDate();
					Rpt_date = enAcctInfMdfc.getBsSgmt().getRptDate();
				}else if("413".equals(infRecType)){//企业借贷账户按段删除请求记录
					//标识项信息：待删除业务标识码+待删除段段标+待删除起始日期+待删除结束日期
					EnAcctInfDel enAcctInfDel = entDocument.getEnAcctInfDel();
					Fb_keys = enAcctInfDel.getDelRecCode()+"|@|"+enAcctInfDel.getDelSgmtCode()+
					"|@|"+enAcctInfDel.getDelStartDate()+"|@|"+enAcctInfDel.getDelEndDate();
					Fb_keys_desc="待删除业务标识码:"+enAcctInfDel.getDelRecCode()+"|@|待删除段段标:"+enAcctInfDel.getDelSgmtCode()+
					"|@|待删除起始日期:"+enAcctInfDel.getDelStartDate()+"|@|待删除结束日期:"+enAcctInfDel.getDelEndDate();
				}else if("414".equals(infRecType)){//企业借贷账户整笔删除请求记录
					//标识项信息：待删除业务标识
					EnAcctInfEntDel enAcctInfEntDel=entDocument.getEnAcctInfEntDel();
					Fb_keys =enAcctInfEntDel.getDelRecCode();
					Fb_keys_desc = "待删除业务标识:"+enAcctInfEntDel.getDelRecCode();
				}
			}else if("42".equals(infRecType.substring(0, 2))){//授信协议信息相关记录
				//1、反馈报文整体解析
			  	EntDocument entDocument=(EntDocument) object;
//				EnCredit enCredit=(EnCredit)object;
//				System.out.println(enCredit.toString());
				//2、对象错误数据分解处理
				if("420".equals(infRecType)){//企业授信协议信息记录
					//标识项信息:授信协议标识码+信息报告日期
					EnCtrctInf enCtrctInf=entDocument.getEnCtrctInf();
					Fb_keys = enCtrctInf.getCtrctBsSgmt().getContractCode();//+"|@|"+enCtrctInf.getCtrctBsSgmt().getRptDate();
					Fb_keys_desc = "授信协议标识码:"+enCtrctInf.getCtrctBsSgmt().getContractCode()+"|@|信息报告日期:"+enCtrctInf.getCtrctBsSgmt().getRptDate();
					Rpt_date = enCtrctInf.getCtrctBsSgmt().getRptDate();
				}else if("421".equals(infRecType)){//企业授信协议标识变更请求记录
					//标识项信息:原业务账户标识号码+新业务账户标识号码
					EnCtrctInfIDCagsInf enCtrctInfIDCagsInf=entDocument.getEnCtrctInfIDCagsInf();
					Fb_keys =enCtrctInfIDCagsInf.getOdBnesCode()+"|@|"+enCtrctInfIDCagsInf.getNwBnesCode();
					Fb_keys_desc = "原业务账户标识号码:"+enCtrctInfIDCagsInf.getOdBnesCode()+"|@|新业务账户标识号码:"+enCtrctInfIDCagsInf.getNwBnesCode();
				}else if("422".equals(infRecType)){//企业授信协议按段更正请求记录
					//标识项信息:待更正业务标识码+账户类型+待更正段段标 +信息报告日期
					EnCtrctInfMdfc enCtrctInfMdfc = entDocument.getEnCtrctInfMdfc();
					Fb_keys =enCtrctInfMdfc.getBsSgmt().getModRecCode()+"|@|"+enCtrctInfMdfc.getBsSgmt().getAcctType()+
					"|@|"+enCtrctInfMdfc.getBsSgmt().getMdfcSgmtCode();//+"|@|"+enCtrctInfMdfc.getBsSgmt().getRptDate();
					Fb_keys_desc = "待更正业务标识码:"+enCtrctInfMdfc.getBsSgmt().getModRecCode()+"|@|账户类型:"+enCtrctInfMdfc.getBsSgmt().getAcctType()+
					"|@|待更正段段标:"+enCtrctInfMdfc.getBsSgmt().getMdfcSgmtCode()+"|@|信息报告日期:"+enCtrctInfMdfc.getBsSgmt().getRptDate();
					Rpt_date = enCtrctInfMdfc.getBsSgmt().getRptDate();
				}else if("423".equals(infRecType)){//企业授信协议按段删除请求记录
					//标识项信息:待删除业务标识码+待删除段段标+待删除起始日期+待删除结束日期
					EnCtrctInfDel enCtrctInfDel=entDocument.getEnCtrctInfDel();
					Fb_keys =enCtrctInfDel.getDelRecCode()+"|@|"+enCtrctInfDel.getDelSgmtCode()+
					"|@|"+enCtrctInfDel.getDelStartDate()+"|@|"+enCtrctInfDel.getDelEndDate();
					Fb_keys_desc = "待删除业务标识码:"+enCtrctInfDel.getDelRecCode()+"|@|待删除段段标:"+enCtrctInfDel.getDelSgmtCode()+
					"|@|待删除起始日期:"+enCtrctInfDel.getDelStartDate()+"|@|待删除结束日期:"+enCtrctInfDel.getDelEndDate();
				}else if("424".equals(infRecType)){//企业授信协议整笔删除请求记录
					//标识项信息:待删除业务标识
					EnCtrctInfEntDel enCtrctInfEntDel=entDocument.getEnCtrctInfEntDel();
					Fb_keys = enCtrctInfEntDel.getDelRecCode();
					Fb_keys_desc = "待删除业务标识:"+enCtrctInfEntDel.getDelRecCode();
				}

			}else if("44".equals(infRecType.substring(0, 2))){//企业担保交易信息相关记录
				//1、反馈报文整体解析
			  	EntDocument entDocument=(EntDocument) object;
//				EnGuarantee enGuarantee=(EnGuarantee)object;
//				System.out.println(enGuarantee.toString());
				//2、对象错误数据分解处理
				if("440".equals(infRecType)){//企业担保账户信息记录
					//标识项信息:账户标识码+信息报告日期
					EnSecAcctInf enSecAcctInf=entDocument.getEnSecAcctInf();
					Fb_keys = enSecAcctInf.getGuarAcctBsSgmt().getAcctCode();//+"|@|"+enSecAcctInf.getGuarAcctBsSgmt().getRptDate();
					Fb_keys_desc = "账户标识码:"+enSecAcctInf.getGuarAcctBsSgmt().getAcctCode()+"|@|信息报告日期:"+enSecAcctInf.getGuarAcctBsSgmt().getRptDate();
					Rpt_date = enSecAcctInf.getGuarAcctBsSgmt().getRptDate();
				}else if("441".equals(infRecType)){//企业担保账户标识变更请求记录
					//标识项信息:原业务账户标识号码+新业务账户标识号码
					EnSecAcctIDCagsInf enSecAcctIDCagsInf=entDocument.getEnSecAcctIDCagsInf();
					Fb_keys = enSecAcctIDCagsInf.getOdBnesCode()+"|@|"+enSecAcctIDCagsInf.getNwBnesCode();
					Fb_keys_desc = "原业务账户标识号码:"+enSecAcctIDCagsInf.getOdBnesCode()+"|@|新业务账户标识号码:"+enSecAcctIDCagsInf.getNwBnesCode();
				}else if("442".equals(infRecType)){//企业担保账户按段更正请求记录
					//标识项信息:待更正业务标识码+账户类型+待更正段段标 +信息报告日期
					EnSecAcctMdfc enSecAcctMdfc=entDocument.getEnSecAcctMdfc();
					Fb_keys = enSecAcctMdfc.getBsSgmt().getModRecCode()+"|@|"+enSecAcctMdfc.getBsSgmt().getAcctType()+
					"|@|"+enSecAcctMdfc.getBsSgmt().getMdfcSgmtCode();//+"|@|"+enSecAcctMdfc.getBsSgmt().getRptDate();
					Fb_keys_desc = "待更正业务标识码:"+enSecAcctMdfc.getBsSgmt().getModRecCode()+"|@|账户类型:"+enSecAcctMdfc.getBsSgmt().getAcctType()+
					"|@|待更正段段标:"+enSecAcctMdfc.getBsSgmt().getMdfcSgmtCode()+"|@|信息报告日期:"+enSecAcctMdfc.getBsSgmt().getRptDate();
					Rpt_date = enSecAcctMdfc.getBsSgmt().getRptDate();
				}else if("443".equals(infRecType)){//企业担保账户按段删除请求记录
					//标识项信息:待删除业务标识码+待删除段段标+待删除起始日期+待删除结束日期
					EnSecAcctDel enSecAcctDel = entDocument.getEnSecAcctDel();
					Fb_keys = enSecAcctDel.getDelRecCode()+"|@|"+enSecAcctDel.getDelSgmtCode()+
					"|@|"+enSecAcctDel.getDelStartDate()+"|@|"+enSecAcctDel.getDelEndDate();
					Fb_keys_desc = "待删除业务标识码:"+enSecAcctDel.getDelRecCode()+"|@|待删除段段标:"+enSecAcctDel.getDelSgmtCode()+
					"|@|待删除起始日期:"+enSecAcctDel.getDelStartDate()+"|@|待删除结束日期:"+enSecAcctDel.getDelEndDate();
				}else if("444".equals(infRecType)){//企业担保账户整笔删除请求记录
					//标识项信息:待删除业务标识
					EnSecAcctEntDel enSecAcctEntDel=entDocument.getEnSecAcctEntDel();
					Fb_keys = enSecAcctEntDel.getDelRecCode();
					Fb_keys_desc = "待删除业务标识:"+enSecAcctEntDel.getDelRecCode();
				}
			}else if("51".equals(infRecType.substring(0, 2))){//抵（质）押物信息相关记录
				if("1".equals(v_error_info.getCri_type())){//个人抵质押解析
					//1、反馈报文整体解析
					PerDocument perDocument=(PerDocument) object;
//					PerMotgaCltalCtrctInfo perMotgaCltalCtrctInfo=(PerMotgaCltalCtrctInfo)object;
//					System.out.println(perMotgaCltalCtrctInfo.toString());
					//2、对象错误数据分解处理
					if("510".equals(infRecType)){//抵（质）押合同信息记录
						//标识项信息：抵（质）押合同标识码+信息报告日期
						com.dhcc.xml.per.entity.motgacltalctrctinfo.MotgaCltalCtrctInf motgaCltalCtrctInf = perDocument.getMotgaCltalCtrctInf();
						Fb_keys = motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getCcCode();//+"|@|"+motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getRptDate();
						Fb_keys_desc = "抵（质）押合同标识码:"+motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getCcCode()+"|@|信息报告日期:"+motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getRptDate();
						Rpt_date = motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getRptDate();
					}else if("511".equals(infRecType)){//抵（质）押合同标识变更请求记录
						//标识项信息：原业务标识码+新业务标识码
						com.dhcc.xml.per.entity.motgacltalctrctinfo.MoCIDCagsInf moCIDCagsInf=perDocument.getMoCIDCagsInf();
						Fb_keys = moCIDCagsInf.getOdBnesCode()+"|@|"+moCIDCagsInf.getNwBnesCode();
						Fb_keys_desc = "原业务标识码:"+moCIDCagsInf.getOdBnesCode()+"|@|新业务标识码:"+moCIDCagsInf.getNwBnesCode();
					}else if("514".equals(infRecType)){//抵（质）押合同整笔删除请求记录
						//标识项信息：待删除业务标识码
						com.dhcc.xml.per.entity.motgacltalctrctinfo.MoCEntDel moCEntDel=perDocument.getMoCEntDel();
						Fb_keys = moCEntDel.getDelRecCode();
						Fb_keys_desc = "待删除业务标识码:"+moCEntDel.getDelRecCode();
					}
				}else{//企业抵质押解析
					//1、反馈报文整体解析
					EntDocument entDocument=(EntDocument) object;
//					System.out.println(enMotgaCltalCtrctInfo.toString());
					//2、对象错误数据分解处理
					if("510".equals(infRecType)){//抵（质）押合同信息记录
						//标识项信息：抵（质）押合同标识码+信息报告日期
						com.dhcc.xml.ent.entity.motgacltalctrctinfo.MotgaCltalCtrctInf motgaCltalCtrctInf=entDocument.getMotgaCltalCtrctInf();
						Fb_keys = motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getCcCode();//+"|@|"+motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getRptDate();
						Fb_keys_desc = "抵（质）押合同标识码:"+motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getCcCode()+"|@|信息报告日期:"+motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getRptDate();
						Rpt_date = motgaCltalCtrctInf.getMotgaCltalCtrctBsSgmt().getRptDate();
					}else if("511".equals(infRecType)){//抵（质）押合同标识变更请求记录
						//标识项信息：原业务标识码+新业务标识码
						com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCIDCagsInf moCIDCagsInf=entDocument.getMoCIDCagsInf();
						Fb_keys = moCIDCagsInf.getOdBnesCode()+"|@|"+moCIDCagsInf.getNwBnesCode();
						Fb_keys_desc = "原业务标识码:"+moCIDCagsInf.getOdBnesCode()+"|@|新业务标识码:"+moCIDCagsInf.getNwBnesCode();
					}else if("514".equals(infRecType)){//抵（质）押合同整笔删除请求记录
						//标识项信息：待删除业务标识码
						com.dhcc.xml.ent.entity.motgacltalctrctinfo.MoCEntDel moCEntDel=entDocument.getMoCEntDel();
						Fb_keys = moCEntDel.getDelRecCode();
						Fb_keys_desc = "待删除业务标识码:"+moCEntDel.getDelRecCode();
					}
				}
			}else if(infRecType.charAt(0)=='6'){//企业财务信息相关记录
				//1、反馈报文整体解析
			  	EntDocument entDocument=(EntDocument) object;
//				System.out.println(enFinance.toString());
				//2、对象错误数据分解处理
				if("610".equals(infRecType)){//企业资产负债表信息记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分+信息报告日期
					BalanceSheet balanceSheet=entDocument.getBalanceSheet();
					Fb_keys =balanceSheet.getBalanceSheetBsSgmt().getEntName()+"|@|"+balanceSheet.getBalanceSheetBsSgmt().getEntCertType()+"|@|"+
					balanceSheet.getBalanceSheetBsSgmt().getEntCertNum()+"|@|"+balanceSheet.getBalanceSheetBsSgmt().getSheetYear()+"|@|"+
					balanceSheet.getBalanceSheetBsSgmt().getSheetType()+"|@|"+balanceSheet.getBalanceSheetBsSgmt().getSheetTypeDivide();//+"|@|"+ balanceSheet.getBalanceSheetBsSgmt().getRptDate();
					
					Fb_keys_desc="企业名称:"+balanceSheet.getBalanceSheetBsSgmt().getEntName()+"|@|企业身份标识类型："+balanceSheet.getBalanceSheetBsSgmt().getEntCertType()+"|@|企业身份标识号码："+
					balanceSheet.getBalanceSheetBsSgmt().getEntCertNum()+"|@|报表年份："+balanceSheet.getBalanceSheetBsSgmt().getSheetYear()+"|@|报表类型："+
					balanceSheet.getBalanceSheetBsSgmt().getSheetType()+"|@|报表类型细分："+balanceSheet.getBalanceSheetBsSgmt().getSheetTypeDivide();//+"|@|信息报告日期："+balanceSheet.getBalanceSheetBsSgmt().getRptDate();
					Rpt_date = balanceSheet.getBalanceSheetBsSgmt().getRptDate();
				}else if("620".equals(infRecType)){//企业利润及利润分配表信息记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分+信息报告日期
					IncomeStatementProfitAppropriation incomeStatementProfitAppropriation =entDocument.getIncomeStatementProfitAppropriation();
					Fb_keys =incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getEntName()+"|@|"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getEntCertType()+"|@|"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getEntCertNum()+"|@|"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getSheetYear()+"|@|"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getSheetType()+"|@|"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getSheetTypeDivide();//+"|@|"+incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getRptDate();
					
					Fb_keys_desc ="企业名称:"+incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getEntName()+"|@|企业身份标识类型:"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getEntCertType()+"|@|企业身份标识号码:"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getEntCertNum()+"|@|报表年份:"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getSheetYear()+"|@|报表类型:"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getSheetType()+"|@|报表类型细分:"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getSheetTypeDivide()+"|@|信息报告日期:"+
					incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getRptDate();
					Rpt_date = incomeStatementProfitAppropriation.getIncomeStatementProfitAppropriationBsSgmt().getRptDate();
				}else if("630".equals(infRecType)){//企业现金流量表信息记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分+信息报告日期
					CashFlows cashFlows=entDocument.getCashFlows();
					Fb_keys = cashFlows.getCashFlowsBsSgmt().getEntName()+"|@|"+cashFlows.getCashFlowsBsSgmt().getEntCertType()+"|@|"+
					cashFlows.getCashFlowsBsSgmt().getEntCertNum()+"|@|"+cashFlows.getCashFlowsBsSgmt().getSheetYear()+"|@|"+
					cashFlows.getCashFlowsBsSgmt().getSheetType()+"|@|"+cashFlows.getCashFlowsBsSgmt().getSheetTypeDivide();//+"|@|"+cashFlows.getCashFlowsBsSgmt().getRptDate();
					
					Fb_keys_desc = "企业名称:"+cashFlows.getCashFlowsBsSgmt().getEntName()+"|@|企业身份标识类型:"+cashFlows.getCashFlowsBsSgmt().getEntCertType()+"|@|企业身份标识号码:"+
					cashFlows.getCashFlowsBsSgmt().getEntCertNum()+"|@|报表年份:"+cashFlows.getCashFlowsBsSgmt().getSheetYear()+"|@|报表类型:"+
					cashFlows.getCashFlowsBsSgmt().getSheetType()+"|@|报表类型细分:"+cashFlows.getCashFlowsBsSgmt().getSheetTypeDivide()+"|@|信息报告日期:"+
					cashFlows.getCashFlowsBsSgmt().getRptDate();
					Rpt_date = cashFlows.getCashFlowsBsSgmt().getRptDate();
				}else if("640".equals(infRecType)){//事业单位资产负债表信息记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分+信息报告日期
					InstitutionBalanceSheet institutionBalanceSheet = entDocument.getInstitutionBalanceSheet();
					Fb_keys = institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getEntName()+"|@|"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getEntCertType()+"|@|"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getEntCertNum()+"|@|"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getSheetYear()+"|@|"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getSheetType()+"|@|"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getSheetTypeDivide();//+"|@|"+institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getRptDate();
					
					Fb_keys_desc = "企业名称:"+institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getEntName()+"|@|企业身份标识类型:"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getEntCertType()+"|@|企业身份标识号码:"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getEntCertNum()+"|@|报表年份:"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getSheetYear()+"|@|报表类型:"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getSheetType()+"|@|报表类型细分:"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getSheetTypeDivide()+"|@|信息报告日期:"+
					institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getRptDate();
					Rpt_date = institutionBalanceSheet.getInstitutionBalanceSheetBsSgmt().getRptDate();
				}else if("650".equals(infRecType)){//事业单位收入支出表信息记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分+信息报告日期
					IncomeAndExpenseStatement incomeAndExpenseStatement = entDocument.getIncomeAndExpenseStatement();
					Fb_keys = incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getEntName()+"|@|"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getEntCertType()+"|@|"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getEntCertNum()+"|@|"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getSheetYear()+"|@|"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getSheetType()+"|@|"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getSheetTypeDivide();//+"|@|"+incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getRptDate();
					
					Fb_keys_desc = "企业名称:"+incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getEntName()+"|@|企业身份标识类型:"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getEntCertType()+"|@|企业身份标识号码:"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getEntCertNum()+"|@|报表年份:"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getSheetYear()+"|@|报表类型:"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getSheetType()+"|@|报表类型细分:"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getSheetTypeDivide()+"|@|信息报告日期:"+
					incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getRptDate();
					Rpt_date = incomeAndExpenseStatement.getIncomeAndExpenseStatementBsSgmt().getRptDate();
				}else if("614".equals(infRecType)){//企业资产负债表整笔删除请求记录
					BalanceSheetDlt balanceSheetDlt=entDocument.getBalanceSheetDlt();
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分
					Fb_keys = balanceSheetDlt.getEntName()+"|@|"+balanceSheetDlt.getEntCertType()+"|@|"+balanceSheetDlt.getEntCertNum()+"|@|"+
					balanceSheetDlt.getSheetYear()+"|@|"+balanceSheetDlt.getSheetType()+"|@|"+balanceSheetDlt.getSheetTypeDivide();
					
					Fb_keys_desc="企业名称:"+balanceSheetDlt.getEntName()+"|@|企业身份标识类型:"+balanceSheetDlt.getEntCertType()+"|@|企业身份标识号码:"+balanceSheetDlt.getEntCertNum()+"|@|报表年份:"+
					balanceSheetDlt.getSheetYear()+"|@|报表类型:"+balanceSheetDlt.getSheetType()+"|@|报表类型细分:"+balanceSheetDlt.getSheetTypeDivide();
				}else if("624".equals(infRecType)){//企业利润及利润分配表整笔删除请求记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分
					IncomeStatementProfitAppropriationDlt incomeStatementProfitAppropriationDlt=entDocument.getIncomeStatementProfitAppropriationDlt();
					Fb_keys = incomeStatementProfitAppropriationDlt.getEntName()+"|@|"+incomeStatementProfitAppropriationDlt.getEntCertType()+"|@|"+
					incomeStatementProfitAppropriationDlt.getEntCertNum()+"|@|"+incomeStatementProfitAppropriationDlt.getSheetYear()+"|@|"+
					incomeStatementProfitAppropriationDlt.getSheetType()+"|@|"+incomeStatementProfitAppropriationDlt.getSheetTypeDivide();
					
					Fb_keys_desc = "企业名称:"+incomeStatementProfitAppropriationDlt.getEntName()+"|@|企业身份标识类型:"+incomeStatementProfitAppropriationDlt.getEntCertType()+"|@|企业身份标识号码:"+
					incomeStatementProfitAppropriationDlt.getEntCertNum()+"|@|报表年份:"+incomeStatementProfitAppropriationDlt.getSheetYear()+"|@|报表类型:"+
					incomeStatementProfitAppropriationDlt.getSheetType()+"|@|报表类型细分:"+incomeStatementProfitAppropriationDlt.getSheetTypeDivide();
				}else if("634".equals(infRecType)){//企业现金流量表整笔删除请求记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分
					CashFlowsDlt cashFlowsDlt=entDocument.getCashFlowsDlt();
					Fb_keys =cashFlowsDlt.getEntName()+"|@|"+cashFlowsDlt.getEntCertType()+"|@|"+cashFlowsDlt.getEntCertNum()+"|@|"+
					cashFlowsDlt.getSheetYear()+"|@|"+cashFlowsDlt.getSheetType()+"|@|"+cashFlowsDlt.getSheetTypeDivide();
					
					Fb_keys_desc="企业名称:"+cashFlowsDlt.getEntName()+"|@|企业身份标识类型:"+cashFlowsDlt.getEntCertType()+"|@|企业身份标识号码:"+cashFlowsDlt.getEntCertNum()+"|@|报表年份:"+
					cashFlowsDlt.getSheetYear()+"|@|报表类型:"+cashFlowsDlt.getSheetType()+"|@|报表类型细分:"+cashFlowsDlt.getSheetTypeDivide();
				}else if("644".equals(infRecType)){//事业单位资产负债表整笔删除请求记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分
					InstitutionBalanceSheetDlt institutionBalanceSheetDlt=entDocument.getInstitutionBalanceSheetDlt();
					Fb_keys =institutionBalanceSheetDlt.getEntName()+"|@|"+institutionBalanceSheetDlt.getEntCertType()+"|@|"+
					institutionBalanceSheetDlt.getEntCertNum()+"|@|"+institutionBalanceSheetDlt.getSheetYear()+"|@|"+
					institutionBalanceSheetDlt.getSheetType()+"|@|"+institutionBalanceSheetDlt.getSheetTypeDivide();

					Fb_keys_desc="企业名称:"+institutionBalanceSheetDlt.getEntName()+"|@|企业身份标识类型:"+institutionBalanceSheetDlt.getEntCertType()+"|@|企业身份标识号码:"+
					institutionBalanceSheetDlt.getEntCertNum()+"|@|报表年份:"+institutionBalanceSheetDlt.getSheetYear()+"|@|报表类型:"+
					institutionBalanceSheetDlt.getSheetType()+"|@|报表类型细分:"+institutionBalanceSheetDlt.getSheetTypeDivide();
				}else if("654".equals(infRecType)){//事业单位收入支出表整笔删除请求记录
					//标识项信息：（企业名称+）企业身份标识类型+企业身份标识号码+报表年份+报表类型+报表类型细分
					IncomeAndExpenseStatementDlt incomeAndExpenseStatementDlt=entDocument.getIncomeAndExpenseStatementDlt();
					Fb_keys = incomeAndExpenseStatementDlt.getEntName()+"|@|"+incomeAndExpenseStatementDlt.getEntCertType()+"|@|"+
					incomeAndExpenseStatementDlt.getEntCertNum()+"|@|"+incomeAndExpenseStatementDlt.getSheetYear()+"|@|"+
					incomeAndExpenseStatementDlt.getSheetType()+"|@|"+incomeAndExpenseStatementDlt.getSheetTypeDivide();
					
					Fb_keys_desc= "企业名称:"+incomeAndExpenseStatementDlt.getEntName()+"|@|企业身份标识类型:"+incomeAndExpenseStatementDlt.getEntCertType()+"|@|企业身份标识号码:"+
					incomeAndExpenseStatementDlt.getEntCertNum()+"|@|报表年份:"+incomeAndExpenseStatementDlt.getSheetYear()+"|@|报表类型:"+
					incomeAndExpenseStatementDlt.getSheetType()+"|@|报表类型细分:"+incomeAndExpenseStatementDlt.getSheetTypeDivide();
				}
			}
//			v_error_info.setFile_name(gen_file_name);
			v_error_info.setRecord_id(Fb_keys);
			v_error_info.setErr_keys(Fb_keys);
			v_error_info.setErr_keys_desc(Fb_keys_desc);
			v_error_info.setRpt_date(Rpt_date);
	  }
	  /*
	  public static IValidator<Feedback, InBasInf> iValidator110;

	  public static IValidator<Feedback, InBsInfDlt> iValidator114;

	  public static IValidator<Feedback, InFalMmbsInf> iValidator120;

	  public static IValidator<Feedback, InIDEfctInf> iValidator130;

	  public static IValidator<Feedback, InIDEfctInfDlt> iValidator134;

	  public static IValidator<Feedback, InCtfItgInf> iValidator140;

	  public static IValidator<Feedback, InAcctInf> iValidator210;

	  public static IValidator<Feedback, InAcctIDCagsInf> iValidator211;

	  public static IValidator<Feedback, InAcctMdfc> iValidator212;

	  public static IValidator<Feedback, InAcctDel> iValidator213;

	  public static IValidator<Feedback, InAcctEntDel> iValidator214;

	  public static IValidator<Feedback, InSpcEvtDscInf> iValidator215;

	  public static IValidator<Feedback, InCtrctMdfc> iValidator222;

	  public static IValidator<Feedback, InCtrctIDCagsInf> iValidator221;

	  public static IValidator<Feedback, InCtrctEntDel> iValidator224;

	  public static IValidator<Feedback, InCtrctDel> iValidator223;

	  public static IValidator<Feedback, InCtrctInf> iValidator220;

	  public static IValidator<Feedback, InSecAcctInf> iValidator230;

	  public static IValidator<Feedback, InSecAcctIDCagsInf> iValidator231;

	  public static IValidator<Feedback, InSecAcctMdfc> iValidator232;

	  public static IValidator<Feedback, InSecAcctDel> iValidator233;

	  public static IValidator<Feedback, InSecAcctEntDel> iValidator234;

	  public static IValidator<Feedback, MotgaCltalCtrctInf> iValidator510;

	  public static IValidator<Feedback, MoCIDCagsInf> iValidator511;

	  public static IValidator<Feedback, MoCEntDel> iValidator514;

	  public static IValidator<Feedback, EnBasInf> iValidator310;

	  public static IValidator<Feedback, EnBsInfDlt> iValidator314;

	  public static IValidator<Feedback, EnCtfItgInf> iValidator340;

	  public static IValidator<Feedback, EnIcdnRltpInf> iValidator350;

	  public static IValidator<Feedback, EnAcctInf> iValidator410;

	  public static IValidator<Feedback, EnAcctInfIDCagsInf> iValidator411;

	  public static IValidator<Feedback, EnAcctInfMdfc> iValidator412;

	  public static IValidator<Feedback, EnAcctInfDel> iValidator413;

	  public static IValidator<Feedback, EnAcctInfEntDel> iValidator414;

	  public static IValidator<Feedback, EnCtrctInf> iValidator420;

	  public static IValidator<Feedback, EnCtrctInfIDCagsInf> iValidator421;

	  public static IValidator<Feedback, EnCtrctInfMdfc> iValidator422;

	  public static IValidator<Feedback, EnCtrctInfDel> iValidator423;

	  public static IValidator<Feedback, EnCtrctInfEntDel> iValidator424;

	  public static IValidator<Feedback, InBasInf> iValidator520;

	  public static IValidator<Feedback, InBasInf> iValidator521;

	  public static IValidator<Feedback, InBasInf> iValidator522;

	  public static IValidator<Feedback, InBasInf> iValidator523;

	  public static IValidator<Feedback, InBasInf> iValidator524;

	  public static IValidator<Feedback, EnSecAcctInf> iValidator440;

	  public static IValidator<Feedback, EnSecAcctIDCagsInf> iValidator441;

	  public static IValidator<Feedback, EnSecAcctMdfc> iValidator442;

	  public static IValidator<Feedback, EnSecAcctDel> iValidator443;

	  public static IValidator<Feedback, EnSecAcctEntDel> iValidator444;

	  public static IValidator<Feedback, BalanceSheet> iValidator610;

	  public static IValidator<Feedback, BalanceSheetDlt> iValidator614;

	  public static IValidator<Feedback, IncomeStatementProfitAppropriation> iValidator620;

	  public static IValidator<Feedback, IncomeStatementProfitAppropriationDlt> iValidator624;

	  public static IValidator<Feedback, CashFlows> iValidator630;

	  public static IValidator<Feedback, CashFlowsDlt> iValidator634;

	  public static IValidator<Feedback, InstitutionBalanceSheet> iValidator640;

	  public static IValidator<Feedback, InstitutionBalanceSheetDlt> iValidator644;

	  public static IValidator<Feedback, IncomeAndExpenseStatement> iValidator650;

	  public static IValidator<Feedback, IncomeAndExpenseStatementDlt> iValidator654;
	 public static List<Feedback> getIValidator(int recTypeId,Object record) {
		    List<Feedback> lineFeedback = new ArrayList<Feedback>();
			switch (recTypeId) {

		    case 110:
		      if (iValidator110 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator110 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078832.0.010", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InBasInf) record).preHandle();
		          lineFeedback = iValidator110.validate((InBasInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 114:
		      if (iValidator114 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator114 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078842.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InBsInfDlt) record).preHandle();
		          lineFeedback = iValidator114.validate((InBsInfDlt)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 120:
		      if (iValidator120 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator120 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078852.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InFalMmbsInf) record).preHandle();
		          lineFeedback = iValidator120.validate((InFalMmbsInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 130:
		      if (iValidator130 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator130 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078862.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InIDEfctInf) record).preHandle();
		          lineFeedback = iValidator130.validate((InIDEfctInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 134:
		      if (iValidator134 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator134 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078872.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InIDEfctInfDlt) record).preHandle();
		          lineFeedback = iValidator134.validate((InIDEfctInfDlt)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 140:
		      if (iValidator140 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator140 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078882.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InCtfItgInf) record).preHandle();
		          lineFeedback = iValidator140.validate((InCtfItgInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 210:
		      if (iValidator210 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator210 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078892.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InAcctInf) record).preHandle();
		          lineFeedback = iValidator210.validate((InAcctInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 211:
		      if (iValidator211 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator211 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078902.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InAcctIDCagsInf) record).preHandle();
		          lineFeedback = iValidator211.validate((InAcctIDCagsInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 212:
		      if (iValidator212 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator212 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078912.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InAcctMdfc) record).preHandle();
		          lineFeedback = iValidator212.validate((InAcctMdfc)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 213:
		      if (iValidator213 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator213 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078922.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InAcctDel) record).preHandle();
		          lineFeedback = iValidator213.validate((InAcctDel)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 214:
		      if (iValidator214 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator214 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078932.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InAcctEntDel) record).preHandle();
		          lineFeedback = iValidator214.validate((InAcctEntDel)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 215:
		      if (iValidator215 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator215 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078942.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InSpcEvtDscInf) record).preHandle();
		          lineFeedback = iValidator215.validate((InSpcEvtDscInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 222:
		      if (iValidator222 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator222 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078972.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InCtrctMdfc) record).preHandle();
		          lineFeedback = iValidator222.validate((InCtrctMdfc)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 221:
		      if (iValidator221 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator221 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078962.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InCtrctIDCagsInf) record).preHandle();
		          lineFeedback = iValidator221.validate((InCtrctIDCagsInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 224:
		      if (iValidator224 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator224 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078992.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InCtrctEntDel) record).preHandle();
		          lineFeedback = iValidator224.validate((InCtrctEntDel)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 223:
		      if (iValidator223 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator223 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078982.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InCtrctDel) record).preHandle();
		          lineFeedback = iValidator223.validate((InCtrctDel)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 220:
		      if (iValidator220 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator220 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30078952.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InCtrctInf) record).preHandle();
		          lineFeedback = iValidator220.validate((InCtrctInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 230:
		      if (iValidator230 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator230 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30079002.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InSecAcctInf) record).preHandle();
		          lineFeedback = iValidator230.validate((InSecAcctInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 231:
		      if (iValidator231 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator231 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30079012.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InSecAcctIDCagsInf) record).preHandle();
		          lineFeedback = iValidator231.validate((InSecAcctIDCagsInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 232:
		      if (iValidator232 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator232 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30079022.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InSecAcctMdfc) record).preHandle();
		          lineFeedback = iValidator232.validate((InSecAcctMdfc)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 233:
		      if (iValidator233 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator233 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30079032.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InSecAcctDel) record).preHandle();
		          lineFeedback = iValidator233.validate((InSecAcctDel)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 234:
		      if (iValidator234 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator234 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30079042.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((InSecAcctEntDel) record).preHandle();
		          lineFeedback = iValidator234.validate((InSecAcctEntDel)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 510:
		      if (iValidator510 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator510 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30079052.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((MotgaCltalCtrctInf) record).preHandle();
		          lineFeedback = iValidator510.validate((MotgaCltalCtrctInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 511:
		      if (iValidator511 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator511 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30079062.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((MoCIDCagsInf) record).preHandle();
		          lineFeedback = iValidator511.validate((MoCIDCagsInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 514:
		      if (iValidator514 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator514 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator("30079072.0.0", 
		                   Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
		                   vldContext);
		        }
		        try {
		          ((MoCEntDel) record).preHandle();
		          lineFeedback = iValidator514.validate((MoCEntDel)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 310:
		      if (iValidator310 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator310 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_LEGAL_CUSTOMER_NORMAL + "2.0.0" + "10", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnBasInf) record).preHandle();
		          lineFeedback = iValidator310.validate((EnBasInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 314:
		      if (iValidator314 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator314 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_LEGAL_CUSTOMER_DEL + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnBsInfDlt) record).preHandle();
		          lineFeedback = iValidator314.validate((EnBsInfDlt)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 340:
		      if (iValidator340 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator340 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_LEGAL_CERTCONF_NORMAL + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnCtfItgInf) record).preHandle();
		          lineFeedback = iValidator340.validate((EnCtfItgInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 350:
		      if (iValidator350 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator350 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_LEGAL_ORGRELATION_NORMAL + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnIcdnRltpInf) record).preHandle();
		          lineFeedback = iValidator350.validate((EnIcdnRltpInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 410:
		      if (iValidator410 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator410 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_ENT_ACCOUNT_NORMAL + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnAcctInf) record).preHandle();
		          lineFeedback = iValidator410.validate((EnAcctInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 411:
		      if (iValidator411 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator411 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_ENT_ACCOUNT_CODE_CHANGE + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnAcctInfIDCagsInf) record).preHandle();
		          lineFeedback = iValidator411.validate((EnAcctInfIDCagsInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 412:
		      if (iValidator412 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator412 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_ENT_ACCOUNT_ALTER + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnAcctInfMdfc) record).preHandle();
		          lineFeedback = iValidator412.validate((EnAcctInfMdfc)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 413:
		      if (iValidator413 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator413 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_ENT_ACCOUNT_DELETE_PART + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnAcctInfDel) record).preHandle();
		          lineFeedback = iValidator413.validate((EnAcctInfDel)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 414:
		      if (iValidator414 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator414 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_ENT_ACCOUNT_DELETE_ALL + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnAcctInfEntDel) record).preHandle();
		          lineFeedback = iValidator414.validate((EnAcctInfEntDel)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 420:
		      if (iValidator420 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator420 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_LEGAL_CONTRACT_NORMAL + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnCtrctInf) record).preHandle();
		          lineFeedback = iValidator420.validate((EnCtrctInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 421:
		      if (iValidator421 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator421 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_LEGAL_CONTRACT_CODE_CHANGE + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnCtrctInfIDCagsInf) record).preHandle();
		          lineFeedback = iValidator421.validate((EnCtrctInfIDCagsInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 422:
		      if (iValidator422 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator422 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_LEGAL_CONTRACT_ALTER + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnCtrctInfMdfc) record).preHandle();
		          lineFeedback = iValidator422.validate((EnCtrctInfMdfc)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 423:
		      if (iValidator423 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator423 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_LEGAL_CONTRACT_DEL_PART + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnCtrctInfDel) record).preHandle();
		          lineFeedback = iValidator423.validate((EnCtrctInfDel)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 424:
		      if (iValidator424 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator424 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_LEGAL_CONTRACT_DEL + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnCtrctInfEntDel) record).preHandle();
		          lineFeedback = iValidator424.validate((EnCtrctInfEntDel)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 520:
		      if (iValidator520 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator520 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(String.valueOf(3007922L) + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((InBasInf) record).preHandle();
		          lineFeedback = iValidator520.validate((InBasInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 521:
		      if (iValidator521 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator521 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(String.valueOf(3007923L) + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((InBasInf) record).preHandle();
		          lineFeedback = iValidator521.validate((InBasInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 522:
		      if (iValidator522 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator522 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(String.valueOf(3007924L) + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((InBasInf) record).preHandle();
		          lineFeedback = iValidator522.validate((InBasInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 523:
		      if (iValidator523 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator523 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(String.valueOf(3007925L) + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((InBasInf) record).preHandle();
		          lineFeedback = iValidator523.validate((InBasInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 524:
		      if (iValidator524 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator524 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(String.valueOf(3007926L) + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((InBasInf) record).preHandle();
		          lineFeedback = iValidator524.validate((InBasInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 440:
		      if (iValidator440 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator440 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_ENT_GUACCT_NORMAL + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnSecAcctInf) record).preHandle();
		          lineFeedback = iValidator440.validate((EnSecAcctInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 441:
		      if (iValidator441 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator441 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_ENT_GUACCT_CODE_CHANGE + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnSecAcctIDCagsInf) record).preHandle();
		          lineFeedback = iValidator441.validate((EnSecAcctIDCagsInf)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 442:
		      if (iValidator442 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator442 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_ENT_GUACCT_ALTER + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnSecAcctMdfc) record).preHandle();
		          lineFeedback = iValidator442.validate((EnSecAcctMdfc)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 443:
		      if (iValidator443 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator443 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_ENT_GUACCT_DELPART + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnSecAcctDel) record).preHandle();
		          lineFeedback = iValidator443.validate((EnSecAcctDel)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 444:
		      if (iValidator444 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator444 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(EntConstants.FILE_TYPE_ID_ENT_GUACCT_DELALL + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((EnSecAcctEntDel) record).preHandle();
		          lineFeedback = iValidator444.validate((EnSecAcctEntDel)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 610:
		      if (iValidator610 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator610 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(String.valueOf(EntConstants.FILE_TYPE_ID_LEGAL_RPT_EAL_NORMAL) + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((BalanceSheet) record).preHandle();
		          lineFeedback = iValidator610.validate((BalanceSheet)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 614:
		      if (iValidator614 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator614 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(String.valueOf(EntConstants.FILE_TYPE_ID_LEGAL_RPT_EAL_DELETE_ALL) + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((BalanceSheetDlt) record).preHandle();
		          lineFeedback = iValidator614.validate((BalanceSheetDlt)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 620:
		      if (iValidator620 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator620 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(String.valueOf(EntConstants.FILE_TYPE_ID_LEGAL_RPT_EEPAPD_NORMAL) + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((IncomeStatementProfitAppropriation) record).preHandle();
		          lineFeedback = iValidator620.validate((IncomeStatementProfitAppropriation)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 624:
		      if (iValidator624 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator624 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(String.valueOf(EntConstants.FILE_TYPE_ID_LEGAL_RPT_EEPAPD_DELETE_ALL) + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((IncomeStatementProfitAppropriationDlt) record).preHandle();
		          lineFeedback = iValidator624.validate((IncomeStatementProfitAppropriationDlt)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 630:
		      if (iValidator630 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator630 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(String.valueOf(EntConstants.FILE_TYPE_ID_LEGAL_RPT_VOECF_NORMAL) + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((CashFlows) record).preHandle();
		          lineFeedback = iValidator630.validate((CashFlows)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 634:
		      if (iValidator634 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator634 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(String.valueOf(EntConstants.FILE_TYPE_ID_LEGAL_RPT_VOECF_DELETE_ALL) + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((CashFlowsDlt) record).preHandle();
		          lineFeedback = iValidator634.validate((CashFlowsDlt)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 640:
		      if (iValidator640 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator640 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(String.valueOf(EntConstants.FILE_TYPE_ID_LEGAL_RPT_GPIAAL_NORMAL) + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((InstitutionBalanceSheet) record).preHandle();
		          lineFeedback = iValidator640.validate((InstitutionBalanceSheet)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 644:
		      if (iValidator644 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator644 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(String.valueOf(EntConstants.FILE_TYPE_ID_LEGAL_RPT_GPIAAL_DELETE_ALL) + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((InstitutionBalanceSheetDlt) record).preHandle();
		          lineFeedback = iValidator644.validate((InstitutionBalanceSheetDlt)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 650:
		      if (iValidator650 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator650 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(String.valueOf(EntConstants.FILE_TYPE_ID_LEGAL_RPT_GPII_NORMAL) + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((IncomeAndExpenseStatement) record).preHandle();
		          lineFeedback = iValidator650.validate((IncomeAndExpenseStatement)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    case 654:
		      if (iValidator654 == null){
		          ValidatorContext vldContext = null;
		          String versionCode = "2.0.0";
		          long cltFileTypeId = 0L;
		          Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
		          cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(recTypeId))).longValue();
		            vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		            vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		            vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		            vldContext.addAttribute("REC_TYPE", recTypeId+"");//信息记录类型
		            vldContext.addAttribute("FINAN_ID_ROOT", "1");
		            vldContext.addAttribute("FINAN_ID", "1");
		            iValidator654 = org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory.getValidator(String.valueOf(EntConstants.FILE_TYPE_ID_LEGAL_RPT_GPII_DELETE_ALL) + "2.0.0", Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), vldContext);
		        }
		        try {
		          ((IncomeAndExpenseStatementDlt) record).preHandle();
		          lineFeedback = iValidator654.validate((IncomeAndExpenseStatementDlt)record);
		        } catch (Exception e) {
		            lineFeedback.add(new Feedback("ABR000", "0000"));
		            e.printStackTrace();
		        }
		        return lineFeedback;
		    
			}
			return null;
	  }
	  
	  public static List<Feedback> getFeedback(String recTypeId,Object object){
		  List<Feedback> lineFeedback = null;
			 if("1".equals(recTypeId.substring(0, 1))){//个人基本信息相关记录
				 PerBaseInfo perBaseInfo=(PerBaseInfo)object;
				if("110".equals(recTypeId)){//个人基本信息记录
					InBasInf record = perBaseInfo.getInBasInf();
					lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
				}else if("114".equals(recTypeId)){//个人基本信息整笔删除请求记录
					InBsInfDlt record = perBaseInfo.getInBsInfDlt();
					lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
				}else if ("120".equals(recTypeId)){//家族关系信息记录
					InFalMmbsInf record = perBaseInfo.getInFalMmbsInf();
					lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
				}else if ("130".equals(recTypeId)){//个人证件有效期信息记录
					InIDEfctInf record = perBaseInfo.getInIDEfctInf();
					lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
				}else if ("134".equals(recTypeId)){//个人证件有效期信息整笔删除请求记录
					InIDEfctInfDlt record=perBaseInfo.getInIDEfctInfDlt();
					lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
				}else if ("140".equals(recTypeId)){//个人证件整合信息记录
					InCtfItgInf record = perBaseInfo.getInCtfItgInf();
					lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
				}
			 }else if("21".equals(recTypeId.substring(0, 2))){//个人借贷信息相关记录
					PerLoanInfo perLoanInfo=(PerLoanInfo)object;
					if("210".equals(recTypeId)){//个人借贷账户信息记录
						InAcctInf record=perLoanInfo.getInAcctInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if ("211".equals(recTypeId)){//个人借贷账户标识变更请求记录
						InAcctIDCagsInf record= perLoanInfo.getInAcctIDCagsInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if ("212".equals(recTypeId)){//个人借贷账户按段更正请求记录
						InAcctMdfc record = perLoanInfo.getInAcctMdfc();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if ("213".equals(recTypeId)){//个人借贷账户按段删除请求记录
						InAcctDel record =(InAcctDel)perLoanInfo.getInAcctDel();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if ("214".equals(recTypeId)){//个人借贷账户整笔删除请求记录
						InAcctEntDel record=(InAcctEntDel)perLoanInfo.getInAcctEntDel();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if ("215".equals(recTypeId)){//个人借贷账户特殊事件说明记录
						InSpcEvtDscInf record=(InSpcEvtDscInf)perLoanInfo.getInSpcEvtDscInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}
			 }else if("22".equals(recTypeId.substring(0, 2))){//个人授信协议信息相关记录
					PerCredit perCredit=(PerCredit)object;
					if("220".equals(recTypeId)){//个人授信协议信息记录
						InCtrctInf record=perCredit.getInCtrctInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("221".equals(recTypeId)){//个人授信协议标识变更请求记录
						InCtrctIDCagsInf record=perCredit.getInCtrctIDCagsInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("222".equals(recTypeId)){//个人授信协议按段更正请求记录
						InCtrctMdfc record=perCredit.getInCtrctMdfc();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("223".equals(recTypeId)){//个人授信协议按段删除请求记录
						InCtrctDel record=perCredit.getInCtrctDel();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("224".equals(recTypeId)){//个人授信协议整笔删除请求记录
						InCtrctEntDel record=perCredit.getInCtrctEntDel();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}
				}else if("23".equals(recTypeId.substring(0, 2))){//个人担保账户信息相关记录
					PerGuarantee perGuarantee=(PerGuarantee)object;
					if("230".equals(recTypeId)){//个人担保账户信息记录
						InSecAcctInf record=perGuarantee.getInSecAcctInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("231".equals(recTypeId)){//个人担保账户标识变更请求记录
						InSecAcctIDCagsInf record=perGuarantee.getInSecAcctIDCagsInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("232".equals(recTypeId)){//个人担保账户按段更正请求记录
						InSecAcctMdfc record = perGuarantee.getInSecAcctMdfc();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("233".equals(recTypeId)){//个人担保账户按段删除请求记录
						InSecAcctDel record = perGuarantee.getInSecAcctDel();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("234".equals(recTypeId)){//个人担保账户整笔删除请求记录
						InSecAcctEntDel record = perGuarantee.getInSecAcctEntDel();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}
				}else if("3".equals(recTypeId.substring(0, 1))){//企业基本信息相关记录
					EnBaseInfo enBaseInfo=(EnBaseInfo)object;
					if("310".equals(recTypeId)){//企业基本信息记录 
						EnBasInf record=enBaseInfo.getEnBasInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("314".equals(recTypeId)){//企业基本信息整笔删除请求记录
						EnBsInfDlt record=enBaseInfo.getEnBsInfDlt();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("340".equals(recTypeId)){//企业身份标识整合信息记录
						EnCtfItgInf record=enBaseInfo.getEnCtfItgInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("350".equals(recTypeId)){//企业间关联关系信息记录
						EnIcdnRltpInf record=enBaseInfo.getEnIcdnRltpInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}
				}else if("41".equals(recTypeId.substring(0, 2))){//企业借贷交易信息相关记录
					EnLoanInfo enLoanInfo=(EnLoanInfo)object;
					if("410".equals(recTypeId)){//企业借贷账户记录
						EnAcctInf record =enLoanInfo.getEnAcctInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("411".equals(recTypeId)){//企业借贷账户标识变更请求记录
						EnAcctInfIDCagsInf record = enLoanInfo.getEnAcctInfIDCagsInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("412".equals(recTypeId)){//企业借贷账户更正请求记录
						EnAcctInfMdfc record = enLoanInfo.getEnAcctInfMdfc();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("413".equals(recTypeId)){//企业借贷账户按段删除请求记录
						EnAcctInfDel record = enLoanInfo.getEnAcctInfDel();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("414".equals(recTypeId)){//企业借贷账户整笔删除请求记录
						EnAcctInfEntDel record=enLoanInfo.getEnAcctInfEntDel();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}
				}else if("42".equals(recTypeId.substring(0, 2))){//授信协议信息相关记录
					EnCredit enCredit=(EnCredit)object;
					if("420".equals(recTypeId)){//企业授信协议信息记录
						EnCtrctInf record=enCredit.getEnCtrctInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("421".equals(recTypeId)){//企业授信协议标识变更请求记录
						EnCtrctInfIDCagsInf record=enCredit.getEnCtrctInfIDCagsInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("422".equals(recTypeId)){//企业授信协议按段更正请求记录
						EnCtrctInfMdfc record = enCredit.getEnCtrctInfMdfc();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("423".equals(recTypeId)){//企业授信协议按段删除请求记录
						EnCtrctInfDel record=enCredit.getEnCtrctInfDel();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("424".equals(recTypeId)){//企业授信协议整笔删除请求记录
						EnCtrctInfEntDel record=enCredit.getEnCtrctInfEntDel();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}
				}else if("44".equals(recTypeId.substring(0, 2))){//企业担保交易信息相关记录
					EnGuarantee enGuarantee=(EnGuarantee)object;
					if("440".equals(recTypeId)){//企业担保账户信息记录
						EnSecAcctInf record=enGuarantee.getEnSecAcctInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("441".equals(recTypeId)){//企业担保账户标识变更请求记录
						EnSecAcctIDCagsInf record=enGuarantee.getEnSecAcctIDCagsInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("442".equals(recTypeId)){//企业担保账户按段更正请求记录
						EnSecAcctMdfc record=enGuarantee.getEnSecAcctMdfc();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("443".equals(recTypeId)){//企业担保账户按段删除请求记录
						EnSecAcctDel record = enGuarantee.getEnSecAcctDel();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("444".equals(recTypeId)){//企业担保账户整笔删除请求记录
						EnSecAcctEntDel record=enGuarantee.getEnSecAcctEntDel();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}
				}else if("51".equals(recTypeId.substring(0, 2))){//抵（质）押物信息相关记录
					PerMotgaCltalCtrctInfo perMotgaCltalCtrctInfo=(PerMotgaCltalCtrctInfo)object;
					if("510".equals(recTypeId)){//抵（质）押合同信息记录
						com.dhcc.xml.per.entity.motgacltalctrctinfo.MotgaCltalCtrctInf record = perMotgaCltalCtrctInfo.getMotgaCltalCtrctInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("511".equals(recTypeId)){//抵（质）押合同标识变更请求记录
						com.dhcc.xml.per.entity.motgacltalctrctinfo.MoCIDCagsInf record=perMotgaCltalCtrctInfo.getMoCIDCagsInf();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("514".equals(recTypeId)){//抵（质）押合同整笔删除请求记录
						com.dhcc.xml.per.entity.motgacltalctrctinfo.MoCEntDel record=perMotgaCltalCtrctInfo.getMoCEntDel();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}
				}else if("6".equals(recTypeId.substring(0, 1))){//企业财务信息相关记录
					EnFinance enFinance=(EnFinance)object;
					if("610".equals(recTypeId)){//企业资产负债表信息记录
						BalanceSheet record=enFinance.getBalanceSheet();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("620".equals(recTypeId)){//企业利润及利润分配表信息记录
						IncomeStatementProfitAppropriation record =enFinance.getIncomeStatementProfitAppropriation();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("630".equals(recTypeId)){//企业现金流量表信息记录
						CashFlows record=enFinance.getCashFlows();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("640".equals(recTypeId)){//事业单位资产负债表信息记录
						InstitutionBalanceSheet record = enFinance.getInstitutionBalanceSheet();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("650".equals(recTypeId)){//事业单位收入支出表信息记录
						IncomeAndExpenseStatement record = enFinance.getIncomeAndExpenseStatement();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("614".equals(recTypeId)){//企业资产负债表整笔删除请求记录
						BalanceSheetDlt record=enFinance.getBalanceSheetDlt();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("624".equals(recTypeId)){//企业利润及利润分配表整笔删除请求记录
						IncomeStatementProfitAppropriationDlt record=enFinance.getIncomeStatementProfitAppropriationDlt();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("634".equals(recTypeId)){//企业现金流量表整笔删除请求记录
						CashFlowsDlt record=enFinance.getCashFlowsDlt();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("644".equals(recTypeId)){//事业单位资产负债表整笔删除请求记录
						InstitutionBalanceSheetDlt record=enFinance.getInstitutionBalanceSheetDlt();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}else if("654".equals(recTypeId)){//事业单位收入支出表整笔删除请求记录
						IncomeAndExpenseStatementDlt record=enFinance.getIncomeAndExpenseStatementDlt();
						lineFeedback=ValidateCollectUtils.getIValidator(Integer.parseInt(recTypeId),record);
					}
				}
			return lineFeedback;
	  }
	  */
}
