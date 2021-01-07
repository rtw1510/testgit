package com.dhcc.xml.per.batch.processor.guarantee;

import java.util.ArrayList;
import java.util.List;

import com.dhcc.xml.per.entity.PerDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;

import com.dhcc.xml.per.entity.guarantee.CccInf;
import com.dhcc.xml.per.entity.guarantee.GuarAcctBsInfSgmt;
import com.dhcc.xml.per.entity.guarantee.GuarAcctBsSgmt;
import com.dhcc.xml.per.entity.guarantee.GuarMotgaCltalCtrctInfSgmt;
import com.dhcc.xml.per.entity.guarantee.GuarRltRepymtInfSgmt;
import com.dhcc.xml.per.entity.guarantee.InSecAcctInf;
import com.dhcc.xml.per.entity.guarantee.PerGuarantee;
import com.dhcc.xml.per.entity.guarantee.RltRepymtInf;
import com.dhcc.xml.per.entity.guarantee.RltRepymtInfSgmt;
import com.dhcc.xml.per.entity.guarantee.db.Pb_LnsecAcctRel_Info;
import com.dhcc.xml.per.entity.guarantee.db.Pb_LnsecAcct_Info;
import com.dhcc.xml.per.entity.guarantee.db.Pb_Guacct_Info;
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
@Component("InSecAcctInfProcessor")
@StepScope
public class InSecAcctInfProcessor implements ItemProcessor<Pb_LnsecAcct_Info, Object> {

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
	 * @param pb_LnsecAcct_Info
	 *            数据库映射的对象
	 */
	public Object process(Pb_LnsecAcct_Info pb_LnsecAcct_Info) throws Exception {
		
//		System.out.println("=======================================PROCESS.START=========================================================");

		PerDocument perDocument;
		InSecAcctInf inSecAcctInf;
		GuarAcctBsSgmt guarAcctBsSgmt;
		GuarAcctBsInfSgmt guarAcctBsInfSgmt;
		GuarRltRepymtInfSgmt guarRltRepymtInfSgmt;
		RltRepymtInfSgmt rltRepymtInfSgmt;
		GuarMotgaCltalCtrctInfSgmt guarMotgaCltalCtrctInfSgmt;
		List<RltRepymtInf> liRltRepymtInf;
		RltRepymtInf rltRepymtInf;
		List<CccInf> liCccInf;
		CccInf cccInf;

		perDocument = new PerDocument();
		inSecAcctInf = new InSecAcctInf();
		guarAcctBsSgmt = new GuarAcctBsSgmt();
		guarAcctBsInfSgmt = new GuarAcctBsInfSgmt();
		guarRltRepymtInfSgmt = new GuarRltRepymtInfSgmt();
		rltRepymtInfSgmt = new RltRepymtInfSgmt();
		guarMotgaCltalCtrctInfSgmt = new GuarMotgaCltalCtrctInfSgmt();
		liRltRepymtInf = new ArrayList<RltRepymtInf>();
		liCccInf = new ArrayList<CccInf>();

		guarAcctBsSgmt.setAcctCode(pb_LnsecAcct_Info.getAcctCode());
		guarAcctBsSgmt.setAcctType(pb_LnsecAcct_Info.getAcctType());
		guarAcctBsSgmt.setIDNum(pb_LnsecAcct_Info.getIDNum());
		guarAcctBsSgmt.setIDType(pb_LnsecAcct_Info.getIDType());
		guarAcctBsSgmt.setInfRecType(pb_LnsecAcct_Info.getInfRecType());
		guarAcctBsSgmt.setMngmtOrgCode(pb_LnsecAcct_Info.getMngmtOrgCode());
		guarAcctBsSgmt.setName(pb_LnsecAcct_Info.getName());
		guarAcctBsSgmt.setRptDate(UpdateDate.updateDate(pb_LnsecAcct_Info.getRptDate()));
		guarAcctBsSgmt.setRptDateCode(pb_LnsecAcct_Info.getRptDateCode());
		inSecAcctInf.setGuarAcctBsSgmt(guarAcctBsSgmt);

		if ("1".equals(pb_LnsecAcct_Info.getLNSECACCTBASEINF_FLAG())&& CheckUtilPlus.checkStr(pb_LnsecAcct_Info.getBusiLines())) {
			guarAcctBsInfSgmt.setAcctCredLine(pb_LnsecAcct_Info.getAcctCredLine());
			guarAcctBsInfSgmt.setBusiDtilLines(pb_LnsecAcct_Info.getBusiDtilLines());
			guarAcctBsInfSgmt.setBusiLines(pb_LnsecAcct_Info.getBusiLines());
			guarAcctBsInfSgmt.setCtrctTxtCd(pb_LnsecAcct_Info.getCtrctTxtCd());
			guarAcctBsInfSgmt.setCy(pb_LnsecAcct_Info.getCy());
			guarAcctBsInfSgmt.setDueDate(UpdateDate.updateDate(pb_LnsecAcct_Info.getDueDate()));
			guarAcctBsInfSgmt.setGuarMode(pb_LnsecAcct_Info.getGuarMode());
			guarAcctBsInfSgmt.setOpenDate(UpdateDate.updateDate(pb_LnsecAcct_Info.getOpenDate()));
			guarAcctBsInfSgmt.setOthRepyGuarWay(pb_LnsecAcct_Info.getOthRepyGuarWay());
			guarAcctBsInfSgmt.setSecDep(pb_LnsecAcct_Info.getSecDep());
			inSecAcctInf.setGuarAcctBsInfSgmt(guarAcctBsInfSgmt);
		}

		if ("1".equals(pb_LnsecAcct_Info.getLNSECACCTAMT_FLAG())&& CheckUtilPlus.checkStr(pb_LnsecAcct_Info.getAcctStatus())) {
			guarRltRepymtInfSgmt.setAcctStatus(pb_LnsecAcct_Info.getAcctStatus());
			guarRltRepymtInfSgmt.setCloseDate(UpdateDate.updateDate(pb_LnsecAcct_Info.getCloseDate()));
			guarRltRepymtInfSgmt.setCompAdvFlag(pb_LnsecAcct_Info.getCompAdvFlag());
			guarRltRepymtInfSgmt.setFiveCate(pb_LnsecAcct_Info.getFiveCate());
			guarRltRepymtInfSgmt.setFiveCateAdjDate(UpdateDate.updateDate(pb_LnsecAcct_Info.getFiveCateAdjDate()));
			guarRltRepymtInfSgmt.setLoanAmt(pb_LnsecAcct_Info.getLoanAmt());
			guarRltRepymtInfSgmt.setRepayPrd(UpdateDate.updateDate(pb_LnsecAcct_Info.getRepayPrd()));
			guarRltRepymtInfSgmt.setRiEx(pb_LnsecAcct_Info.getRiEx());
			inSecAcctInf.setGuarRltRepymtInfSgmt(guarRltRepymtInfSgmt);
		}

		if ("1".equals(pb_LnsecAcct_Info.getLNSECACCTREL_FLAG())) {
			List<Pb_LnsecAcctRel_Info> Pb_LnsecAcctRel_Info_List = pb_LnsecAcct_Info.getPb_LnsecAcctRel_Info_List();
			if (CheckUtilPlus.checkList(Pb_LnsecAcctRel_Info_List)) {
				for (Pb_LnsecAcctRel_Info pb_LnsecAcctRel_Info : Pb_LnsecAcctRel_Info_List) {
					if (CheckUtilPlus.checkStr(pb_LnsecAcctRel_Info.getArlpCertNum())){
						rltRepymtInf = new RltRepymtInf();
						rltRepymtInf.setArlpAmt(pb_LnsecAcctRel_Info.getArlpAmt());
						if("2".equals(pb_LnsecAcctRel_Info.getInfoIDType())&&"30".equals(pb_LnsecAcctRel_Info.getArlpCertType())) {
							rltRepymtInf.setArlpCertNum(pb_LnsecAcctRel_Info.getArlpCertNum() == null ? pb_LnsecAcctRel_Info.getArlpCertNum() :
									pb_LnsecAcctRel_Info.getArlpCertNum().replace("-",""));
						}else{
							rltRepymtInf.setArlpCertNum(pb_LnsecAcctRel_Info.getArlpCertNum());
						}
						rltRepymtInf.setArlpCertType(pb_LnsecAcctRel_Info.getArlpCertType());
						rltRepymtInf.setArlpName(pb_LnsecAcctRel_Info.getArlpName());
						rltRepymtInf.setArlpType(pb_LnsecAcctRel_Info.getArlpType());
						rltRepymtInf.setInfoIDType(pb_LnsecAcctRel_Info.getInfoIDType());
						rltRepymtInf.setWartySign(pb_LnsecAcctRel_Info.getWartySign());
						rltRepymtInf.setMaxGuarMcc(pb_LnsecAcctRel_Info.getMaxGuarMcc());
						liRltRepymtInf.add(rltRepymtInf);
					}
				}
				if(CheckUtilPlus.checkList(liRltRepymtInf)){
					rltRepymtInfSgmt.setRltRepymtInf(liRltRepymtInf);
					rltRepymtInfSgmt.setRltRepymtNm(liRltRepymtInf.size() + "");
					inSecAcctInf.setRltRepymtInfSgmt(rltRepymtInfSgmt);
				}
			}
		}

		if ("1".equals(pb_LnsecAcct_Info.getLNSECACCTMOT_FLAG())) {
			List<Pb_Guacct_Info> Pb_Guacct_Info_List = pb_LnsecAcct_Info.getPb_Guacct_Info_List();
			if (CheckUtilPlus.checkList(Pb_Guacct_Info_List)) {
				for (Pb_Guacct_Info pb_Guacct_Info : Pb_Guacct_Info_List) {
					if(CheckUtilPlus.checkStr(pb_Guacct_Info.getCcCode())){
						cccInf = new CccInf();
						cccInf.setCcc(pb_Guacct_Info.getCcCode());
						liCccInf.add(cccInf);
					}
				}
				if(CheckUtilPlus.checkList(liCccInf)){
					guarMotgaCltalCtrctInfSgmt.setCccInf(liCccInf);
					guarMotgaCltalCtrctInfSgmt.setCcNm(liCccInf.size() + "");
					inSecAcctInf.setGuarMotgaCltalCtrctInfSgmt(guarMotgaCltalCtrctInfSgmt);
				}
			}
		}
		perDocument.setInSecAcctInf(inSecAcctInf);
//		String reportXML = CreateXML.convertToXml(perGuarantee) + "\r\n";
		
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
