package com.dhcc.xml.per.batch.processor.loaninfo;

import java.util.ArrayList;
import java.util.List;

import com.dhcc.xml.per.entity.PerDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import com.dhcc.xml.per.entity.loaninfo.AcctBsInfSgmt;
import com.dhcc.xml.per.entity.loaninfo.AcctBsSgmt;
import com.dhcc.xml.per.entity.loaninfo.AcctCredSgmt;
import com.dhcc.xml.per.entity.loaninfo.AcctDbtInfSgmt;
import com.dhcc.xml.per.entity.loaninfo.AcctMthlyBlgInfSgmt;
import com.dhcc.xml.per.entity.loaninfo.AcctSpecTrstDspnSgmt;
import com.dhcc.xml.per.entity.loaninfo.CagOfTrdInf;
import com.dhcc.xml.per.entity.loaninfo.CccInf;
import com.dhcc.xml.per.entity.loaninfo.InAcctInf;
import com.dhcc.xml.per.entity.loaninfo.MotgaCltalCtrctInfSgmt;
import com.dhcc.xml.per.entity.loaninfo.OrigCreditorInfSgmt;
import com.dhcc.xml.per.entity.loaninfo.PerLoanInfo;
import com.dhcc.xml.per.entity.loaninfo.RltRepymtInf;
import com.dhcc.xml.per.entity.loaninfo.RltRepymtInfSgmt;
import com.dhcc.xml.per.entity.loaninfo.SpecPrdSgmt;
import com.dhcc.xml.per.entity.loaninfo.db.Pb_Lnacct_Info;
import com.dhcc.xml.per.entity.loaninfo.db.Pb_Lnacctdbt_Info;
import com.dhcc.xml.per.entity.loaninfo.db.Pb_Lnacctrlt_Info;
import com.dhcc.xml.per.entity.loaninfo.db.Pb_Lnacctspc_Info;
import com.dhcc.xml.per.entity.loaninfo.db.Pb_Lnacctmonth_Info;
import com.dhcc.xml.per.entity.loaninfo.db.Pb_Guacct_Info;
import com.dhcc.xml.util.CheckUtilPlus;
import com.dhcc.xml.util.CreateXML;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Title: BsSgmtProcessor<br/>
 * Description: 个人借贷信息记录报文生成处理<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月25日
 */
@Component("AcctBsSgmtProcessor")
@StepScope
public class AcctBsSgmtProcessor implements ItemProcessor<Pb_Lnacct_Info, Object> {

	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;

	/**
	 * 处理Reader读取的Item对象
	 * 
	 * @param pb_Lnacct_Info
	 *            数据库映射的对象
	 */
	public Object process(Pb_Lnacct_Info pb_Lnacct_Info) throws Exception {
//		System.out.println("=======================================PROCESS.START=========================================================");

		PerDocument perDocument;
		InAcctInf inAcctInf;
		
		/*1、AcctBsSgmt基础段信息 */
		AcctBsSgmt acctBsSgmt;
		/*2、基本信息段 */
		AcctBsInfSgmt acctBsInfSgmt;
		/*3、相关还款责任人段 */
		RltRepymtInfSgmt rltRepymtInfSgmt;
		List<RltRepymtInf> liRltRepymtInf;
		RltRepymtInf rltRepymtInf;
		/*4、抵质押物信息段 */
		MotgaCltalCtrctInfSgmt motgaCltalCtrctInfSgmt;
		List<CccInf> liCccInf;
		CccInf cccInf;
		/*5、 授信额度信息段 */
		AcctCredSgmt acctCredSgmt;
		/*6、初始债权说明段 */
		OrigCreditorInfSgmt origCreditorInfSgmt;
		/*7、月度表现信息段 */
		AcctMthlyBlgInfSgmt acctMthlyBlgInfSgmt;
		/*8、大额专项分期信息段 */
		SpecPrdSgmt specPrdSgmt;
		/*9、非月度表现信息段 */
		AcctDbtInfSgmt acctDbtInfSgmt;
		/*10、特殊交易说明段 */
		AcctSpecTrstDspnSgmt acctSpecTrstDspnSgmt;
		List<CagOfTrdInf> liCagOfTrdInf;
		CagOfTrdInf cagOfTrdInf;

		perDocument = new PerDocument();//二代征信企业基本信息报文入口类
		inAcctInf = new InAcctInf();
		acctBsSgmt = new AcctBsSgmt();
		acctBsInfSgmt = new AcctBsInfSgmt();
		rltRepymtInfSgmt = new RltRepymtInfSgmt();
		liRltRepymtInf = new ArrayList<RltRepymtInf>();
		motgaCltalCtrctInfSgmt = new MotgaCltalCtrctInfSgmt();
		liCccInf = new ArrayList<CccInf>();
		acctCredSgmt = new AcctCredSgmt();
		origCreditorInfSgmt = new OrigCreditorInfSgmt();
		acctMthlyBlgInfSgmt = new AcctMthlyBlgInfSgmt();
		specPrdSgmt = new SpecPrdSgmt();
		acctDbtInfSgmt = new AcctDbtInfSgmt();
		acctSpecTrstDspnSgmt = new AcctSpecTrstDspnSgmt();
		liCagOfTrdInf = new ArrayList<CagOfTrdInf>();

		/*1、AcctBsSgmt基础段信息 */
		acctBsSgmt.setAcctCode(pb_Lnacct_Info.getAcctCode());
		acctBsSgmt.setAcctType(pb_Lnacct_Info.getAcctType());
		acctBsSgmt.setIDNum(pb_Lnacct_Info.getIDNum());
		acctBsSgmt.setIDType(pb_Lnacct_Info.getIDType());
		acctBsSgmt.setInfRecType(pb_Lnacct_Info.getInfRecType());
		acctBsSgmt.setMngmtOrgCode(pb_Lnacct_Info.getMngmtOrgCode());
		acctBsSgmt.setName(pb_Lnacct_Info.getName());
		acctBsSgmt.setRptDate(UpdateDate.updateDate(pb_Lnacct_Info.getRptDate()));
		acctBsSgmt.setRptDateCode(pb_Lnacct_Info.getRptDateCode());
		inAcctInf.setAcctBsSgmt(acctBsSgmt);
		
		/*2、基本信息段*/
		if("1".equals(pb_Lnacct_Info.getLNACCTBASEINF_FLAG())&&"0".equals(pb_Lnacct_Info.getLNACCTDBT_FLAG())&& CheckUtilPlus.checkStr(pb_Lnacct_Info.getBusiLines())){
			if("R1".equals(pb_Lnacct_Info.getAcctType())||"R2".equals(pb_Lnacct_Info.getAcctType())||"R3".equals(pb_Lnacct_Info.getAcctType())) {
				acctBsInfSgmt.setAcctCredLine(pb_Lnacct_Info.getAcctCredLine());//信用额度
			}
			acctBsInfSgmt.setBusiDtlLines(pb_Lnacct_Info.getBusiDtlLines());
			acctBsInfSgmt.setBusiLines(pb_Lnacct_Info.getBusiLines());
			if("R2".equals(pb_Lnacct_Info.getAcctType())||"R3".equals(pb_Lnacct_Info.getAcctType())) {
				acctBsInfSgmt.setCreditID(pb_Lnacct_Info.getCreditID());//卡片标识号
			}
			acctBsInfSgmt.setCy(pb_Lnacct_Info.getCy());
			if("D1".equals(pb_Lnacct_Info.getAcctType())) {
				acctBsInfSgmt.setFlag(pb_Lnacct_Info.getFlag());//分次放款标志
			}
			if("D1".equals(pb_Lnacct_Info.getAcctType())||"R1".equals(pb_Lnacct_Info.getAcctType())||"R2".equals(pb_Lnacct_Info.getAcctType())||"R3".equals(pb_Lnacct_Info.getAcctType())||"R4".equals(pb_Lnacct_Info.getAcctType())) {
				acctBsInfSgmt.setApplyBusiDist(pb_Lnacct_Info.getApplyBusiDist());
				acctBsInfSgmt.setAssetTrandFlag(pb_Lnacct_Info.getAssetTrandFlag());
				acctBsInfSgmt.setDueDate(UpdateDate.updateDate(pb_Lnacct_Info.getDueDate()));//到期日
				acctBsInfSgmt.setGuarMode(pb_Lnacct_Info.getGuarMode());
				acctBsInfSgmt.setOthRepyGuarWay(pb_Lnacct_Info.getOthRepyGuarWay());
				acctBsInfSgmt.setFundSou(pb_Lnacct_Info.getFundSou());//业务经营类型
				acctBsInfSgmt.setLoanForm(pb_Lnacct_Info.getLoanForm());
			}
			if("D1".equals(pb_Lnacct_Info.getAcctType())&&"11".equals(pb_Lnacct_Info.getBusiDtlLines())) {
				acctBsInfSgmt.setLoanConCode(pb_Lnacct_Info.getLoanConCode());
				acctBsInfSgmt.setFirstHouLoanFlag(pb_Lnacct_Info.getFirstHouLoanFlag());
			}
			if("D1".equals(pb_Lnacct_Info.getAcctType())||"R4".equals(pb_Lnacct_Info.getAcctType())||"C1".equals(pb_Lnacct_Info.getAcctType())) {
				acctBsInfSgmt.setLoanAmt(pb_Lnacct_Info.getLoanAmt());//借款金额
			}
			acctBsInfSgmt.setOpenDate(UpdateDate.updateDate(pb_Lnacct_Info.getOpenDate()));
			if("D1".equals(pb_Lnacct_Info.getAcctType())||"R1".equals(pb_Lnacct_Info.getAcctType())||"R4".equals(pb_Lnacct_Info.getAcctType())) {
				acctBsInfSgmt.setRepayFreqcy(pb_Lnacct_Info.getRepayFreqcy());//还款频率
				acctBsInfSgmt.setRepayMode(pb_Lnacct_Info.getRepayMode());//还款方式
			}
			if("D1".equals(pb_Lnacct_Info.getAcctType())||"R4".equals(pb_Lnacct_Info.getAcctType())) {
				acctBsInfSgmt.setRepayPrd(pb_Lnacct_Info.getRepayPrd());//还款期数
			}
			inAcctInf.setAcctBsInfSgmt(acctBsInfSgmt);
		}
		
		/*3、相关还款责任人段基本概况段*/
		if("1".equals(pb_Lnacct_Info.getLNACCTRLT_FLAG())&&"0".equals(pb_Lnacct_Info.getLNACCTDBT_FLAG())){
			List<Pb_Lnacctrlt_Info> pb_Lnacctrlt_Info_List=pb_Lnacct_Info.getPb_Lnacctrlt_Info_List();
			if(CheckUtilPlus.checkList(pb_Lnacctrlt_Info_List)){
				for(Pb_Lnacctrlt_Info pb_Lnacctrlt_Info:pb_Lnacctrlt_Info_List){
					if(CheckUtilPlus.checkStr(pb_Lnacctrlt_Info.getArlpCertNum())){
						rltRepymtInf=new RltRepymtInf();
						rltRepymtInf.setArlpAmt(pb_Lnacctrlt_Info.getArlpAmt());
						if("2".equals(pb_Lnacctrlt_Info.getInfoIDType())&&"30".equals(pb_Lnacctrlt_Info.getArlpCertType())) {
							rltRepymtInf.setArlpCertNum(pb_Lnacctrlt_Info.getArlpCertNum()==null?pb_Lnacctrlt_Info.getArlpCertNum() :
									pb_Lnacctrlt_Info.getArlpCertNum().replace("-",""));
						}else{
							rltRepymtInf.setArlpCertNum(pb_Lnacctrlt_Info.getArlpCertNum());
						}
						rltRepymtInf.setArlpCertType(pb_Lnacctrlt_Info.getArlpCertType());
						rltRepymtInf.setArlpName(pb_Lnacctrlt_Info.getArlpName());
						rltRepymtInf.setArlpType(pb_Lnacctrlt_Info.getArlpType());
						rltRepymtInf.setInfoIDType(pb_Lnacctrlt_Info.getInfoIDType());
						rltRepymtInf.setWartySign(pb_Lnacctrlt_Info.getWartySign());
						rltRepymtInf.setMaxGuarMcc(pb_Lnacctrlt_Info.getMaxGuarMcc());
						liRltRepymtInf.add(rltRepymtInf);
					}
				}
				if(CheckUtilPlus.checkList(liRltRepymtInf)){
					rltRepymtInfSgmt.setRltRepymtNm(liRltRepymtInf.size()+"");
					rltRepymtInfSgmt.setRltRepymtInf(liRltRepymtInf);
					inAcctInf.setRltRepymtInfSgmt(rltRepymtInfSgmt);
				}
			}
		}
		
		/*4、抵质押物信息段*/
		if("1".equals(pb_Lnacct_Info.getLNACCTMOT_FLAG())&&"0".equals(pb_Lnacct_Info.getLNACCTDBT_FLAG())){
			List<Pb_Guacct_Info> Pb_Guacct_Info_List = pb_Lnacct_Info.getPb_Guacct_Info_List();
			if(CheckUtilPlus.checkList(Pb_Guacct_Info_List)){
				for(Pb_Guacct_Info pb_Guacct_Info:Pb_Guacct_Info_List){
					if(CheckUtilPlus.checkStr(pb_Guacct_Info.getCcCode())){
						cccInf=new CccInf();
						cccInf.setCcc(pb_Guacct_Info.getCcCode());
						liCccInf.add(cccInf);
					}
				}
				if(CheckUtilPlus.checkList(liCccInf)){
					motgaCltalCtrctInfSgmt.setCcNm(liCccInf.size()+"");
					motgaCltalCtrctInfSgmt.setCccInf(liCccInf);
					inAcctInf.setMotgaCltalCtrctInfSgmt(motgaCltalCtrctInfSgmt);
				}
			}
		}
		
		/*5、授信额度信息段*/
		if("1".equals(pb_Lnacct_Info.getLNACCTCCC_FLAG())&&"0".equals(pb_Lnacct_Info.getLNACCTDBT_FLAG())&& CheckUtilPlus.checkStr(pb_Lnacct_Info.getMcc())){
			acctCredSgmt.setMcc(pb_Lnacct_Info.getMcc());
			inAcctInf.setAcctCredSgmt(acctCredSgmt);
		}
		
		/*6、 初始债权说明段*/
		if("1".equals(pb_Lnacct_Info.getLNACCTCRED_FLAG())&&"0".equals(pb_Lnacct_Info.getLNACCTDBT_FLAG())&& CheckUtilPlus.checkStr(pb_Lnacct_Info.getInitCredName())){
			origCreditorInfSgmt.setInitCredName(pb_Lnacct_Info.getInitCredName());
			origCreditorInfSgmt.setInitCredOrgNm(pb_Lnacct_Info.getInitCredOrgNm());
			origCreditorInfSgmt.setInitRpySts(pb_Lnacct_Info.getInitRpySts());
			origCreditorInfSgmt.setOrigDbtCate(pb_Lnacct_Info.getOrigDbtCate());
			inAcctInf.setOrigCreditorInfSgmt(origCreditorInfSgmt);
		}
		
		/*7、月度表现信息段*/
		if("1".equals(pb_Lnacct_Info.getLNACCTMONTH_FLAG())&&!"1".equals(pb_Lnacct_Info.getLNACCTDBT_FLAG())){
			Pb_Lnacctmonth_Info pb_lnAcctmonth_Info=pb_Lnacct_Info.getPb_Lnacctmonth_Info();
			if(pb_lnAcctmonth_Info!=null&& CheckUtilPlus.checkStr(pb_lnAcctmonth_Info.getAcctStatus())){
				acctMthlyBlgInfSgmt.setAcctBal(pb_lnAcctmonth_Info.getAcctBal());
				acctMthlyBlgInfSgmt.setActRpyAmt(pb_lnAcctmonth_Info.getActRpyAmt());
				acctMthlyBlgInfSgmt.setCloseDate(UpdateDate.updateDate(pb_lnAcctmonth_Info.getCloseDate()));
				acctMthlyBlgInfSgmt.setFiveCate(pb_lnAcctmonth_Info.getFiveCate());
				acctMthlyBlgInfSgmt.setFiveCateAdjDate(UpdateDate.updateDate(pb_lnAcctmonth_Info.getFiveCateAdjDate()));
				acctMthlyBlgInfSgmt.setLatRpyDate(UpdateDate.updateDate(pb_lnAcctmonth_Info.getLatRpyDate()));
				acctMthlyBlgInfSgmt.setMonth(UpdateDate.updateMonth(pb_lnAcctmonth_Info.getMonth()));
				if("D1".equals(pb_Lnacct_Info.getAcctType())||"R1".equals(pb_Lnacct_Info.getAcctType())||"R4".equals(pb_Lnacct_Info.getAcctType())) {
					acctMthlyBlgInfSgmt.setOverdPrinc(pb_lnAcctmonth_Info.getOverdPrinc());
					acctMthlyBlgInfSgmt.setOved31_60Princ(pb_lnAcctmonth_Info.getOved31_60Princ());
					acctMthlyBlgInfSgmt.setOved61_90Princ(pb_lnAcctmonth_Info.getOved61_90Princ());
					acctMthlyBlgInfSgmt.setOved91_180Princ(pb_lnAcctmonth_Info.getOved91_180Princ());
					acctMthlyBlgInfSgmt.setOvedPrinc180(pb_lnAcctmonth_Info.getOvedPrinc180());
				}
				if("R3".equals(pb_Lnacct_Info.getAcctType())) {
					acctMthlyBlgInfSgmt.setOvedrawBaOve180(pb_lnAcctmonth_Info.getOvedrawBaOve180());
				}
				if("R2".equals(pb_Lnacct_Info.getAcctType())) {
					acctMthlyBlgInfSgmt.setPridAcctBal(pb_lnAcctmonth_Info.getPridAcctBal());
					acctMthlyBlgInfSgmt.setUsedAmt(pb_lnAcctmonth_Info.getUsedAmt());
					acctMthlyBlgInfSgmt.setNotIsuBal(pb_lnAcctmonth_Info.getNotIsuBal());
					acctMthlyBlgInfSgmt.setRpyPrct(pb_lnAcctmonth_Info.getRpyPrct());
				}
				if("D1".equals(pb_Lnacct_Info.getAcctType())||"R1".equals(pb_Lnacct_Info.getAcctType())||"R2".equals(pb_Lnacct_Info.getAcctType())||"R4".equals(pb_Lnacct_Info.getAcctType())) {
					acctMthlyBlgInfSgmt.setCurRpyAmt(pb_lnAcctmonth_Info.getCurRpyAmt());
					acctMthlyBlgInfSgmt.setRemRepPrd(pb_lnAcctmonth_Info.getRemRepPrd());
					acctMthlyBlgInfSgmt.setOverdPrd(pb_lnAcctmonth_Info.getOverdPrd());
					acctMthlyBlgInfSgmt.setTotOverd(pb_lnAcctmonth_Info.getTotOverd());
				}
				acctMthlyBlgInfSgmt.setRpyStatus(pb_lnAcctmonth_Info.getRpyStatus());
				acctMthlyBlgInfSgmt.setSettDate(UpdateDate.updateDate(pb_lnAcctmonth_Info.getSettDate()));
				acctMthlyBlgInfSgmt.setAcctStatus(pb_lnAcctmonth_Info.getAcctStatus());
				inAcctInf.setAcctMthlyBlgInfSgmt(acctMthlyBlgInfSgmt);
			}
		}
		
		/*8、大额专项分期信息段*/
		if("1".equals(pb_Lnacct_Info.getLNACCTBIG_FLAG())&&"0".equals(pb_Lnacct_Info.getLNACCTDBT_FLAG())){
			Pb_Lnacctmonth_Info pb_lnAcctmonth_Info=pb_Lnacct_Info.getPb_Lnacctmonth_Info();
			if(pb_lnAcctmonth_Info!=null&& CheckUtilPlus.checkStr(pb_lnAcctmonth_Info.getSpecLine())){
				specPrdSgmt.setSpecEfctDate(UpdateDate.updateDate(pb_lnAcctmonth_Info.getSpecEfctDate()));
				specPrdSgmt.setSpecEndDate(UpdateDate.updateDate(pb_lnAcctmonth_Info.getSpecEndDate()));
				specPrdSgmt.setSpecLine(pb_lnAcctmonth_Info.getSpecLine());
				specPrdSgmt.setUsedInstAmt(pb_lnAcctmonth_Info.getUsedInstAmt());
				inAcctInf.setSpecPrdSgmt(specPrdSgmt);
			}
		}
		
		/*9、非月度表现信息段*/
		if("1".equals(pb_Lnacct_Info.getLNACCTDBT_FLAG())&&!"1".equals(pb_Lnacct_Info.getLNACCTMONTH_FLAG())){
			Pb_Lnacctdbt_Info pb_Lnacctdbt_Info=pb_Lnacct_Info.getPb_Lnacctdbt_Info();
			if(pb_Lnacctdbt_Info!=null&& CheckUtilPlus.checkStr(pb_Lnacctdbt_Info.getAcctStatus())){
				acctDbtInfSgmt.setAcctBal(pb_Lnacctdbt_Info.getAcctBal());
				acctDbtInfSgmt.setAcctStatus(pb_Lnacctdbt_Info.getAcctStatus());
				acctDbtInfSgmt.setCloseDate(UpdateDate.updateDate(pb_Lnacctdbt_Info.getCloseDate()));
				if("D1".equals(pb_Lnacct_Info.getAcctType())||"R1".equals(pb_Lnacct_Info.getAcctType())||"R2".equals(pb_Lnacct_Info.getAcctType())||"R3".equals(pb_Lnacct_Info.getAcctType())||"R4".equals(pb_Lnacct_Info.getAcctType())) {
					acctDbtInfSgmt.setFiveCate(pb_Lnacctdbt_Info.getFiveCate());
					acctDbtInfSgmt.setFiveCateAdjDate(UpdateDate.updateDate(pb_Lnacctdbt_Info.getFiveCateAdjDate()));
					acctDbtInfSgmt.setRpyStatus(pb_Lnacctdbt_Info.getRpyStatus());
				}
				acctDbtInfSgmt.setLatRpyAmt(pb_Lnacctdbt_Info.getLatRpyAmt());
				acctDbtInfSgmt.setLatRpyDate(UpdateDate.updateDate(pb_Lnacctdbt_Info.getLatRpyDate()));
				if("D1".equals(pb_Lnacct_Info.getAcctType())||"R1".equals(pb_Lnacct_Info.getAcctType())||"R2".equals(pb_Lnacct_Info.getAcctType())||"R4".equals(pb_Lnacct_Info.getAcctType())) {
					acctDbtInfSgmt.setRemRepPrd(pb_Lnacctdbt_Info.getRemRepPrd());
					acctDbtInfSgmt.setOverdPrd(pb_Lnacctdbt_Info.getOverdPrd());
					acctDbtInfSgmt.setTotOverd(pb_Lnacctdbt_Info.getTotOverd());
				}
				inAcctInf.setAcctDbtInfSgmt(acctDbtInfSgmt);
			}
		}
		
		/*10、特殊交易说明段*/
		if("1".equals(pb_Lnacct_Info.getLNACCTSPC_FLAG())&&!"1".equals(pb_Lnacct_Info.getLNACCTDBT_FLAG())){
			List<Pb_Lnacctspc_Info> Pb_Lnacctspc_Info_List=pb_Lnacct_Info.getPb_Lnacctspc_Info_List();
			if(CheckUtilPlus.checkList(Pb_Lnacctspc_Info_List)){
				for(Pb_Lnacctspc_Info pb_Lnacctspc_Info:Pb_Lnacctspc_Info_List){
					if(CheckUtilPlus.checkStr(pb_Lnacctspc_Info.getChanTranType())){
						cagOfTrdInf=new CagOfTrdInf();
						cagOfTrdInf.setChanTranType(pb_Lnacctspc_Info.getChanTranType());
						cagOfTrdInf.setDetInfo(pb_Lnacctspc_Info.getDetInfo());
						cagOfTrdInf.setDueTranMon(pb_Lnacctspc_Info.getDueTranMon());
						cagOfTrdInf.setTranAmt(pb_Lnacctspc_Info.getTranAmt());
						cagOfTrdInf.setTranDate(UpdateDate.updateDate(pb_Lnacctspc_Info.getTranDate()));
						liCagOfTrdInf.add(cagOfTrdInf);
					}
				}
				if(CheckUtilPlus.checkList(liCagOfTrdInf)){
					acctSpecTrstDspnSgmt.setCagOfTrdInf(liCagOfTrdInf);
					acctSpecTrstDspnSgmt.setCagOfTrdNm(liCagOfTrdInf.size()+"");
					inAcctInf.setAcctSpecTrstDspnSgmt(acctSpecTrstDspnSgmt);
				}
			}
		}

		perDocument.setInAcctInf(inAcctInf);
//		String reportXML=CreateXML.convertToXml(perLoanInfo) + "\r\n";
//		System.out.println("=======================================PROCESS.END=========================================================");
		return perDocument;
	}

	public String getFileName() {
		return fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public String getThreadName() {
		return threadName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}
}
