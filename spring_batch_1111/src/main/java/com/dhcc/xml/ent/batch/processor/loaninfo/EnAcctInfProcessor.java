package com.dhcc.xml.ent.batch.processor.loaninfo;

import java.util.ArrayList;
import java.util.List;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.loaninfo.AcctBsInfSgmt;
import com.dhcc.xml.ent.entity.loaninfo.AcctBsSgmt;
import com.dhcc.xml.ent.entity.loaninfo.AcctCredSgmt;
import com.dhcc.xml.ent.entity.loaninfo.AcctSpecTrstDspnSgmt;
import com.dhcc.xml.ent.entity.loaninfo.ActLbltyInfSgmt;
import com.dhcc.xml.ent.entity.loaninfo.CagOfTrdInf;
import com.dhcc.xml.ent.entity.loaninfo.CccInf;
import com.dhcc.xml.ent.entity.loaninfo.EnAcctInf;
import com.dhcc.xml.ent.entity.loaninfo.EnLoanInfo;
import com.dhcc.xml.ent.entity.loaninfo.MotgaCltalCtrctInfSgmt;
import com.dhcc.xml.ent.entity.loaninfo.OrigCreditorInfSgmt;
import com.dhcc.xml.ent.entity.loaninfo.RltRepymtInf;
import com.dhcc.xml.ent.entity.loaninfo.RltRepymtInfSgmt;
import com.dhcc.xml.ent.entity.loaninfo.db.Eb_CorpAccRetu_Info;
import com.dhcc.xml.ent.entity.loaninfo.db.Eb_CorpAccRlt_Info;
import com.dhcc.xml.ent.entity.loaninfo.db.Eb_CorpAccSpec_Info;
import com.dhcc.xml.ent.entity.loaninfo.db.Eb_CorpAcct_Info;
import com.dhcc.xml.ent.entity.loaninfo.db.Eb_Guacct_Info;
import com.dhcc.xml.util.CheckUtilPlus;
import com.dhcc.xml.util.CreateXML;

/**
 * Title: BsSgmtProcessor<br/>
 * Description: 企业基本信息记录报文生成处理<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月25日
 */
@Component("EnAcctInfProcessor")
@StepScope
public class EnAcctInfProcessor implements ItemProcessor<Eb_CorpAcct_Info, Object> {

	private String fileName;
	/** 生成报文路径 */
	private String filePath;
	/** 线程名称*/
	private String threadName;
	/**
	 * 处理Reader读取的Item对象
	 * 
	 * @param eb_CorpAcct_Info
	 *            数据库映射的对象
	 */
	public Object process(Eb_CorpAcct_Info eb_CorpAcct_Info) throws Exception {
		EntDocument entDocument;
		EnAcctInf enAcctInf;
		AcctBsSgmt acctBsSgmt;
		AcctBsInfSgmt acctBsInfSgmt;
		RltRepymtInfSgmt rltRepymtInfSgmt;
		MotgaCltalCtrctInfSgmt motgaCltalCtrctInfSgmt;
		List<CccInf> liCccInf;
		CccInf cccInf;
		AcctCredSgmt acctCredSgmt;
		OrigCreditorInfSgmt origCreditorInfSgmt;
		ActLbltyInfSgmt actLbltyInfSgmt;
		AcctSpecTrstDspnSgmt acctSpecTrstDspnSgmt;
		List<RltRepymtInf> liRltRepymtInf;
		RltRepymtInf rltRepymtInf;
		List<CagOfTrdInf> liCagOfTrdInf;
		CagOfTrdInf cagOfTrdInf;

		entDocument = new EntDocument();
		enAcctInf = new EnAcctInf();
		acctBsSgmt = new AcctBsSgmt();
		acctBsInfSgmt = new AcctBsInfSgmt();
		rltRepymtInfSgmt = new RltRepymtInfSgmt();
		motgaCltalCtrctInfSgmt = new MotgaCltalCtrctInfSgmt();
		liCccInf = new ArrayList<CccInf>();
		acctCredSgmt = new AcctCredSgmt();
		origCreditorInfSgmt = new OrigCreditorInfSgmt();
		actLbltyInfSgmt = new ActLbltyInfSgmt();
		acctSpecTrstDspnSgmt = new AcctSpecTrstDspnSgmt();
		liRltRepymtInf = new ArrayList<RltRepymtInf>();
		liCagOfTrdInf = new ArrayList<CagOfTrdInf>();
		//基础段
		acctBsSgmt.setAcctCode(eb_CorpAcct_Info.getAcctCode());
		acctBsSgmt.setAcctType(eb_CorpAcct_Info.getAcctType());
		if("30".equals(eb_CorpAcct_Info.getIDType())) {
			acctBsSgmt.setIDNum(eb_CorpAcct_Info.getIDNum() == null ? eb_CorpAcct_Info.getIDNum() :
					eb_CorpAcct_Info.getIDNum().replace("-",""));
		}else{
			acctBsSgmt.setIDNum(eb_CorpAcct_Info.getIDNum());
		}
		acctBsSgmt.setIDType(eb_CorpAcct_Info.getIDType());
		acctBsSgmt.setInfRecType(eb_CorpAcct_Info.getInfRecType());
		acctBsSgmt.setMngmtOrgCode(eb_CorpAcct_Info.getMngmtOrgCode());
		acctBsSgmt.setName(eb_CorpAcct_Info.getName());
		acctBsSgmt.setRptDate(UpdateDate.updateDate(eb_CorpAcct_Info.getRptDate()));
		acctBsSgmt.setRptDateCode(eb_CorpAcct_Info.getRptDateCode());
		enAcctInf.setAcctBsSgmt(acctBsSgmt);
	
		//账户基本信息段
		if ("1".equals(eb_CorpAcct_Info.getCORPBASEINFO_FLAG())&& CheckUtilPlus.checkStr(eb_CorpAcct_Info.getBusiLines())) {
			if ("R1".equals(eb_CorpAcct_Info.getAcctType())){
				acctBsInfSgmt.setAcctCredLine(eb_CorpAcct_Info.getAcctCredLine());
			}
			if (!"C1".equals(eb_CorpAcct_Info.getAcctType())) {
				acctBsInfSgmt.setApplyBusiDist(eb_CorpAcct_Info.getApplyBusiDist());//业务申请地行政区划代码,适用于除 C1 以外的其他账户。
				acctBsInfSgmt.setGuarMode(eb_CorpAcct_Info.getGuarMode());//担保方式,适用于除 C1 以外的其他账户。
				acctBsInfSgmt.setOthRepyGuarWay(eb_CorpAcct_Info.getOthRepyGuarWay());//其他还款保证方式，适用于除 C1 以外的其他账户。
				acctBsInfSgmt.setLoaFrm(eb_CorpAcct_Info.getLoaFrm());//贷款发放形式，适用于除 C1 以外的其他账户。
				acctBsInfSgmt.setFundSou(eb_CorpAcct_Info.getFundSou());//业务经营类型，适用于除 C1 以外的其他账户。
			}

			acctBsInfSgmt.setBusiDtlLines(eb_CorpAcct_Info.getBusiDtlLines());
			acctBsInfSgmt.setBusiLines(eb_CorpAcct_Info.getBusiLines());
			acctBsInfSgmt.setCy(eb_CorpAcct_Info.getCy());
			if ("D1".equals(eb_CorpAcct_Info.getAcctType())||"D2".equals(eb_CorpAcct_Info.getAcctType())
					||"R1".equals(eb_CorpAcct_Info.getAcctType())||"R4".equals(eb_CorpAcct_Info.getAcctType())){
				acctBsInfSgmt.setDueDate(UpdateDate.updateDate(eb_CorpAcct_Info.getDueDate()));//到期日期,适用于D1/D2/R1/R4 类账户。
			}
			if ("D1".equals(eb_CorpAcct_Info.getAcctType())){
				acctBsInfSgmt.setFlag(eb_CorpAcct_Info.getFlag());//分次放款标志,仅适用于 D1 账户
			}
			if ("D1".equals(eb_CorpAcct_Info.getAcctType())||"D2".equals(eb_CorpAcct_Info.getAcctType())
					||"R4".equals(eb_CorpAcct_Info.getAcctType())||"C1".equals(eb_CorpAcct_Info.getAcctType())){//适用于 D1/D2/R4/C1 类账户
				acctBsInfSgmt.setLoanAmt(eb_CorpAcct_Info.getLoanAmt());
			}
			if ("D1".equals(eb_CorpAcct_Info.getAcctType())||"R4".equals(eb_CorpAcct_Info.getAcctType())) {
				acctBsInfSgmt.setLoanTimeLimCat(eb_CorpAcct_Info.getLoanTimeLimCat());//借款期限分类，适用于 D1/R4 类账户。
			}
			acctBsInfSgmt.setOpenDate(UpdateDate.updateDate(eb_CorpAcct_Info.getOpenDate()));
			if ("D1".equals(eb_CorpAcct_Info.getAcctType())||"R1".equals(eb_CorpAcct_Info.getAcctType())
					||"R4".equals(eb_CorpAcct_Info.getAcctType())) {
				acctBsInfSgmt.setAssetTrandFlag(eb_CorpAcct_Info.getAssetTrandFlag());//资产转让标志，适用于 D1/R1/R4 类账户。
				acctBsInfSgmt.setActInvest(eb_CorpAcct_Info.getActInvest());//贷款实际投向，适用于 D1/R1/R4 类账户。
				acctBsInfSgmt.setRepayFreqcy(eb_CorpAcct_Info.getRepayFreqcy());//还款频率,适用于 D1/R1/R4 类账户。
				acctBsInfSgmt.setRepayMode(eb_CorpAcct_Info.getRepayMode());//还款方式,适用于 D1/R1/R4 类账户。
			}
			enAcctInf.setAcctBsInfSgmt(acctBsInfSgmt);
		}
		//相关还款责任人段
		if ("1".equals(eb_CorpAcct_Info.getCORPRLT_FLAG())) {
			List<Eb_CorpAccRlt_Info> Eb_CorpAccRlt_Info_List = eb_CorpAcct_Info.getEb_CorpAccRlt_Info_List();
			if (CheckUtilPlus.checkList(Eb_CorpAccRlt_Info_List)) {
				for (Eb_CorpAccRlt_Info eb_CorpAccRlt_Info : Eb_CorpAccRlt_Info_List) {
					if(CheckUtilPlus.checkStr(eb_CorpAccRlt_Info.getArlpCertNum())){
						rltRepymtInf = new RltRepymtInf();
						rltRepymtInf.setArlpAmt(eb_CorpAccRlt_Info.getArlpAmt());
						if("2".equals(eb_CorpAccRlt_Info.getArlpIDType())&&"30".equals(eb_CorpAccRlt_Info.getArlpCertType())) {
							acctBsSgmt.setIDNum(eb_CorpAccRlt_Info.getArlpCertNum() == null ? eb_CorpAccRlt_Info.getArlpCertNum() :
									eb_CorpAccRlt_Info.getArlpCertNum().replace("-",""));
						}else{
							rltRepymtInf.setArlpCertNum(eb_CorpAccRlt_Info.getArlpCertNum());
						}
						rltRepymtInf.setArlpCertType(eb_CorpAccRlt_Info.getArlpCertType());
						rltRepymtInf.setArlpIDType(eb_CorpAccRlt_Info.getArlpIDType());
						rltRepymtInf.setArlpName(eb_CorpAccRlt_Info.getArlpName());
						rltRepymtInf.setArlpType(eb_CorpAccRlt_Info.getArlpType());
						rltRepymtInf.setMaxGuarMcc(eb_CorpAccRlt_Info.getMaxGuarMcc());
						rltRepymtInf.setWartySign(eb_CorpAccRlt_Info.getWartySign());
						liRltRepymtInf.add(rltRepymtInf);
					}
				}
				if(CheckUtilPlus.checkList(liRltRepymtInf)){
					rltRepymtInfSgmt.setRltRepymtInf(liRltRepymtInf);
					rltRepymtInfSgmt.setRltRepymtNm(liRltRepymtInf.size() + "");
					enAcctInf.setRltRepymtInfSgmt(rltRepymtInfSgmt);
				}
			}
		}
		//抵质押物信息段
		if ("1".equals(eb_CorpAcct_Info.getCORPCCC_FLAG())) {
			List<Eb_Guacct_Info> Eb_Guacct_Info_List = eb_CorpAcct_Info.getEb_Guacct_Info_List();
			if (CheckUtilPlus.checkList(Eb_Guacct_Info_List)) {
				for (Eb_Guacct_Info eb_Guacct_Info : Eb_Guacct_Info_List) {
					if(CheckUtilPlus.checkStr(eb_Guacct_Info.getCcCode())){
						cccInf = new CccInf();
						cccInf.setCcc(eb_Guacct_Info.getCcCode());
						liCccInf.add(cccInf);
					}
				}
				if(CheckUtilPlus.checkList(liCccInf)){
					motgaCltalCtrctInfSgmt.setCccInf(liCccInf);
					motgaCltalCtrctInfSgmt.setCcNm(liCccInf.size() + "");
					enAcctInf.setMotgaCltalCtrctInfSgmt(motgaCltalCtrctInfSgmt);
				}
			}
		}
		//授信额度信息段
		if ("1".equals(eb_CorpAcct_Info.getCORPMCC_FLAG())&& CheckUtilPlus.checkStr(eb_CorpAcct_Info.getMcc())) {
			acctCredSgmt.setMcc(eb_CorpAcct_Info.getMcc());
			enAcctInf.setAcctCredSgmt(acctCredSgmt);
		}
		//初始债权说明段
		if ("1".equals(eb_CorpAcct_Info.getCORPCRED_FLAG())&& CheckUtilPlus.checkStr(eb_CorpAcct_Info.getInitCredName())) {
			origCreditorInfSgmt.setInitCedOrgCode(eb_CorpAcct_Info.getInitCedOrgCode());
			origCreditorInfSgmt.setInitCredName(eb_CorpAcct_Info.getInitCredName());
			origCreditorInfSgmt.setInitRpySts(eb_CorpAcct_Info.getInitRpySts());
			origCreditorInfSgmt.setOrigDbtCate(eb_CorpAcct_Info.getOrigDbtCate());
			enAcctInf.setOrigCreditorInfSgmt(origCreditorInfSgmt);
		}
		//还款表现信息段
		if ("1".equals(eb_CorpAcct_Info.getCORPACCRETU_FLAG())) {
			Eb_CorpAccRetu_Info eb_CorpAccRetu_Info = eb_CorpAcct_Info.getEb_CorpAccRetu_Info();
			if (eb_CorpAccRetu_Info != null&& CheckUtilPlus.checkStr(eb_CorpAccRetu_Info.getAcctStatus())) {
				actLbltyInfSgmt.setAcctBal(eb_CorpAccRetu_Info.getAcctBal());
				actLbltyInfSgmt.setAcctStatus(eb_CorpAccRetu_Info.getAcctStatus());
				actLbltyInfSgmt.setBalChgDate(UpdateDate.updateDate(eb_CorpAccRetu_Info.getBalChgDate()));
				actLbltyInfSgmt.setCloseDate(UpdateDate.updateDate(eb_CorpAccRetu_Info.getCloseDate()));
				actLbltyInfSgmt.setFiveCate(eb_CorpAccRetu_Info.getFiveCate());
				actLbltyInfSgmt.setFiveCateAdjDate(UpdateDate.updateDate(eb_CorpAccRetu_Info.getFiveCateAdjDate()));
				actLbltyInfSgmt.setLatRpyAmt(eb_CorpAccRetu_Info.getLatRpyAmt());
				actLbltyInfSgmt.setLatRpyPrincAmt(eb_CorpAccRetu_Info.getLatRpyPrincAmt());
				actLbltyInfSgmt.setLatRpyDate(UpdateDate.updateDate(eb_CorpAccRetu_Info.getLatRpyDate()));
				if ("R1".equals(eb_CorpAcct_Info.getAcctType())) {
					actLbltyInfSgmt.setPymtPrd(eb_CorpAccRetu_Info.getPymtPrd());//剩余还款月数,仅适用于 R1 账户。
				}
				actLbltyInfSgmt.setRpmtType(eb_CorpAccRetu_Info.getRpmtType());
				if (!"C1".equals(eb_CorpAcct_Info.getAcctType())) {
					actLbltyInfSgmt.setLatAgrrRpyAmt(eb_CorpAccRetu_Info.getLatAgrrRpyAmt());//最近一次约定还款金额,适用于除 C1 以外的其他账户。
					actLbltyInfSgmt.setLatAgrrRpyDate(UpdateDate.updateDate(eb_CorpAccRetu_Info.getLatAgrrRpyDate()));//最近一次约定还款日,适用于除 C1 以外的其他账户。
					actLbltyInfSgmt.setNxtAgrrRpyDate(UpdateDate.updateDate(eb_CorpAccRetu_Info.getNxtAgrrRpyDate()));//下一次约定还款日,适用于除 C1 以外的其他账户。
					actLbltyInfSgmt.setTotOverd(eb_CorpAccRetu_Info.getTotOverd());//当前逾期总额,适用于除 C1 以外的其他账户。
					actLbltyInfSgmt.setOverdDy(eb_CorpAccRetu_Info.getOverdDy());//当前逾期天数,适用于除 C1 以外的其他账户。
					actLbltyInfSgmt.setOverdPrinc(eb_CorpAccRetu_Info.getOverdPrinc());//当前逾期本金,适用于除 C1 以外的其他账户。
				}
				enAcctInf.setActLbltyInfSgmt(actLbltyInfSgmt);
			}
		}
		//特定交易说明段
		if ("1".equals(eb_CorpAcct_Info.getCORPACCSPEC_FLAG())) {
			List<Eb_CorpAccSpec_Info> Eb_CorpAccSpec_Info_List = eb_CorpAcct_Info.getEb_CorpAccSpec_Info_List();
			if (CheckUtilPlus.checkList(Eb_CorpAccSpec_Info_List)) {
				for (Eb_CorpAccSpec_Info eb_CorpAccSpec_Info : Eb_CorpAccSpec_Info_List) {
					if(CheckUtilPlus.checkStr(eb_CorpAccSpec_Info.getChanTranType())){
						cagOfTrdInf = new CagOfTrdInf();
						cagOfTrdInf.setChanTranType(eb_CorpAccSpec_Info.getChanTranType());
						cagOfTrdInf.setDetInfo(eb_CorpAccSpec_Info.getDetInfo());
						cagOfTrdInf.setDueTranMon(eb_CorpAccSpec_Info.getDueTranMon());
						cagOfTrdInf.setTranAmt(eb_CorpAccSpec_Info.getTranAmt());
						cagOfTrdInf.setTranDate(UpdateDate.updateDate(eb_CorpAccSpec_Info.getTranDate()));
						liCagOfTrdInf.add(cagOfTrdInf);
					}
				}
				if (CheckUtilPlus.checkList(liCagOfTrdInf)) {
					acctSpecTrstDspnSgmt.setCagOfTrdInf(liCagOfTrdInf);
					acctSpecTrstDspnSgmt.setCagOfTrdNm(liCagOfTrdInf.size() + "");
					enAcctInf.setAcctSpecTrstDspnSgmt(acctSpecTrstDspnSgmt);
				}
			}
		}
		entDocument.setEnAcctInf(enAcctInf);
//		String reportXML = CreateXML.convertToXml(enLoanInfo) + "\r\n";
//		System.out.println("=======================================PROCESS.END=========================================================");
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
