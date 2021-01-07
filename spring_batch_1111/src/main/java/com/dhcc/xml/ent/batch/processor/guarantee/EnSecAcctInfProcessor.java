package com.dhcc.xml.ent.batch.processor.guarantee;

import java.util.ArrayList;
import java.util.List;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;

import com.dhcc.xml.ent.entity.guarantee.CccInf;
import com.dhcc.xml.ent.entity.guarantee.EnGuarantee;
import com.dhcc.xml.ent.entity.guarantee.EnSecAcctInf;
import com.dhcc.xml.ent.entity.guarantee.GuarAcctBsInfSgmt;
import com.dhcc.xml.ent.entity.guarantee.GuarAcctBsSgmt;
import com.dhcc.xml.ent.entity.guarantee.GuarAcctCredSgmt;
import com.dhcc.xml.ent.entity.guarantee.GuarMotgaCltalCtrctInfSgmt;
import com.dhcc.xml.ent.entity.guarantee.GuarRltRepymtInfSgmt;
import com.dhcc.xml.ent.entity.guarantee.RltRepymtInf;
import com.dhcc.xml.ent.entity.guarantee.RltRepymtInfSgmt;
import com.dhcc.xml.ent.entity.guarantee.db.Eb_Guacct_Info;
import com.dhcc.xml.ent.entity.guarantee.db.Eb_GuarAccRel_Info;
import com.dhcc.xml.ent.entity.guarantee.db.Eb_GuarAcc_Info;
import com.dhcc.xml.util.CheckUtilPlus;
import com.dhcc.xml.util.CreateXML;
import org.springframework.stereotype.Component;

/**
 * Title: BsSgmtProcessor<br/>
 * Description: 企业基本信息记录报文生成处理<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月25日
 */
@Component("EnSecAcctInfProcessor")
@StepScope
public class EnSecAcctInfProcessor implements ItemProcessor<Eb_GuarAcc_Info, Object> {

	
	/** 生成报文名*/
	private String fileName;
	/** 生成报文路径 */
	private String filePath;
	/** 线程名称*/
	private String threadName;
	/**
	 * 处理Reader读取的Item对象
	 * 
	 * @param eb_GuarAcc_Info
	 *            数据库映射的对象
	 */
	public Object process(Eb_GuarAcc_Info eb_GuarAcc_Info) throws Exception {
		EntDocument entDocument;
		EnSecAcctInf enSecAcctInf;
		GuarAcctBsSgmt guarAcctBsSgmt;
		GuarAcctBsInfSgmt guarAcctBsInfSgmt;
		RltRepymtInfSgmt rltRepymtInfSgmt;
		GuarMotgaCltalCtrctInfSgmt guarMotgaCltalCtrctInfSgmt;
		GuarAcctCredSgmt guarAcctCredSgmt;
		GuarRltRepymtInfSgmt guarRltRepymtInfSgmt;
		List<RltRepymtInf> liRltRepymtInf;
		RltRepymtInf rltRepymtInf;
		List<CccInf> liCccInf;
		CccInf cccInf;

		entDocument = new EntDocument();
		enSecAcctInf = new EnSecAcctInf();
		guarAcctBsSgmt = new GuarAcctBsSgmt();
		guarAcctBsInfSgmt = new GuarAcctBsInfSgmt();
		rltRepymtInfSgmt = new RltRepymtInfSgmt();
		guarMotgaCltalCtrctInfSgmt = new GuarMotgaCltalCtrctInfSgmt();
		guarAcctCredSgmt = new GuarAcctCredSgmt();
		guarRltRepymtInfSgmt = new GuarRltRepymtInfSgmt();
		liRltRepymtInf = new ArrayList<RltRepymtInf>();
		liCccInf = new ArrayList<CccInf>();
		//基础段
		guarAcctBsSgmt.setAcctCode(eb_GuarAcc_Info.getAcctCode());
		guarAcctBsSgmt.setAcctType(eb_GuarAcc_Info.getAcctType());
		if("30".equals(eb_GuarAcc_Info.getIDType())) {
			guarAcctBsSgmt.setIDNum(eb_GuarAcc_Info.getIDNum() == null ? eb_GuarAcc_Info.getIDNum() :
					eb_GuarAcc_Info.getIDNum().replace("-",""));
		}else{
			guarAcctBsSgmt.setIDNum(eb_GuarAcc_Info.getIDNum());
		}
		guarAcctBsSgmt.setIDType(eb_GuarAcc_Info.getIDType());
		guarAcctBsSgmt.setInfRecType(eb_GuarAcc_Info.getInfRecType());
		guarAcctBsSgmt.setMngmtOrgCode(eb_GuarAcc_Info.getMngmtOrgCode());
		guarAcctBsSgmt.setName(eb_GuarAcc_Info.getName());
		guarAcctBsSgmt.setRptDate(UpdateDate.updateDate(eb_GuarAcc_Info.getRptDate()));
		guarAcctBsSgmt.setRptDateCode(eb_GuarAcc_Info.getRptDateCode());
		enSecAcctInf.setGuarAcctBsSgmt(guarAcctBsSgmt);
		//账户基本信息段
		if ("1".equals(eb_GuarAcc_Info.getGUARACCBASEINF_FLAG())&& CheckUtilPlus.checkStr(eb_GuarAcc_Info.getBusiLines())) {
			guarAcctBsInfSgmt.setBusiDtilLines(eb_GuarAcc_Info.getBusiDtilLines());
			guarAcctBsInfSgmt.setBusiLines(eb_GuarAcc_Info.getBusiLines());
			guarAcctBsInfSgmt.setCtrctTxtCode(eb_GuarAcc_Info.getCtrctTxtCode());
			guarAcctBsInfSgmt.setCy(eb_GuarAcc_Info.getCy());
			guarAcctBsInfSgmt.setDueDate(UpdateDate.updateDate(eb_GuarAcc_Info.getDueDate()));
			guarAcctBsInfSgmt.setGuarAmt(eb_GuarAcc_Info.getGuarAmt());
			guarAcctBsInfSgmt.setGuarMode(eb_GuarAcc_Info.getGuarMode());
			guarAcctBsInfSgmt.setOpenDate(UpdateDate.updateDate(eb_GuarAcc_Info.getOpenDate()));
			guarAcctBsInfSgmt.setOthRepyGuarWay(eb_GuarAcc_Info.getOthRepyGuarWay());
			guarAcctBsInfSgmt.setSecDep(eb_GuarAcc_Info.getSecDep());
			enSecAcctInf.setGuarAcctBsInfSgmt(guarAcctBsInfSgmt);
		}
		//在保责任信息段
		if ("1".equals(eb_GuarAcc_Info.getGUARACCAMT_FLAG())&& CheckUtilPlus.checkStr(eb_GuarAcc_Info.getAcctStatus())) {
			guarRltRepymtInfSgmt.setAcctStatus(eb_GuarAcc_Info.getAcctStatus());
			guarRltRepymtInfSgmt.setCloseDate(UpdateDate.updateDate(eb_GuarAcc_Info.getCloseDate()));
			guarRltRepymtInfSgmt.setCompAdvFlag(eb_GuarAcc_Info.getCompAdvFlag());
			guarRltRepymtInfSgmt.setFiveCate(eb_GuarAcc_Info.getFiveCate());
			guarRltRepymtInfSgmt.setFiveCateAdjDate(UpdateDate.updateDate(eb_GuarAcc_Info.getFiveCateAdjDate()));
			guarRltRepymtInfSgmt.setLoanAmt(eb_GuarAcc_Info.getLoanAmt());
			guarRltRepymtInfSgmt.setRepayPrd(UpdateDate.updateDate(eb_GuarAcc_Info.getRepayPrd()));
			guarRltRepymtInfSgmt.setRiEx(eb_GuarAcc_Info.getRiEx());
			enSecAcctInf.setGuarRltRepymtInfSgmt(guarRltRepymtInfSgmt);
		}
		//相关还款责任人信息段
		if ("1".equals(eb_GuarAcc_Info.getGUARACCREL_FLAG())) {
			List<Eb_GuarAccRel_Info> Eb_GuarAccRel_Info_List = eb_GuarAcc_Info.getEb_GuarAccRel_Info_List();
			if (CheckUtilPlus.checkList(Eb_GuarAccRel_Info_List)) {
				for (Eb_GuarAccRel_Info eb_GuarAccRel_Info : Eb_GuarAccRel_Info_List) {
					if (CheckUtilPlus.checkStr(eb_GuarAccRel_Info.getArlpCertNum())) {
						rltRepymtInf=new RltRepymtInf();
						rltRepymtInf.setArlpAmt(eb_GuarAccRel_Info.getArlpAmt());
						if("2".equals(eb_GuarAccRel_Info.getInfoIDType())&&"30".equals(eb_GuarAccRel_Info.getArlpCertType())) {
							rltRepymtInf.setArlpCertNum(eb_GuarAccRel_Info.getArlpCertNum() == null ? eb_GuarAccRel_Info.getArlpCertNum() :
									eb_GuarAccRel_Info.getArlpCertNum().replace("-",""));
						}else{
							rltRepymtInf.setArlpCertNum(eb_GuarAccRel_Info.getArlpCertNum());
						}
						rltRepymtInf.setArlpCertType(eb_GuarAccRel_Info.getArlpCertType());
						rltRepymtInf.setArlpName(eb_GuarAccRel_Info.getArlpName());
						rltRepymtInf.setArlpType(eb_GuarAccRel_Info.getArlpType());
						rltRepymtInf.setInfoIDType(eb_GuarAccRel_Info.getInfoIDType());
						rltRepymtInf.setWartySign(eb_GuarAccRel_Info.getWartySign());
						rltRepymtInf.setMaxGuarMcc(eb_GuarAccRel_Info.getMaxGuarMcc());
						liRltRepymtInf.add(rltRepymtInf);
					}
				}
				if (CheckUtilPlus.checkList(liRltRepymtInf)) {
					rltRepymtInfSgmt.setRltRepymtInf(liRltRepymtInf);
					rltRepymtInfSgmt.setRltRepymtNm(liRltRepymtInf.size() + "");
					enSecAcctInf.setRltRepymtInfSgmt(rltRepymtInfSgmt);
				}
			}
		}
		//抵质押物信息段
		if ("1".equals(eb_GuarAcc_Info.getGUARACCMOT_FLAG())) {
			List<Eb_Guacct_Info> Eb_Guacct_Info_List = eb_GuarAcc_Info.getEb_Guacct_Info_List();
			if (CheckUtilPlus.checkList(Eb_Guacct_Info_List)) {
				for (Eb_Guacct_Info eb_Guacct_Info : Eb_Guacct_Info_List) {
					if (CheckUtilPlus.checkStr(eb_Guacct_Info.getCcCode())) {
						cccInf=new CccInf();
						cccInf.setCcc(eb_Guacct_Info.getCcCode());
						liCccInf.add(cccInf);
					}
				}
				if (CheckUtilPlus.checkList(liCccInf)) {
					guarMotgaCltalCtrctInfSgmt.setCccInf(liCccInf);
					guarMotgaCltalCtrctInfSgmt.setCcNm(liCccInf.size()+"");
					enSecAcctInf.setGuarMotgaCltalCtrctInfSgmt(guarMotgaCltalCtrctInfSgmt);
				}
			}
		}
		//授信额度信息段
		if ("1".equals(eb_GuarAcc_Info.getGUARACCMCC_FLAG())&& CheckUtilPlus.checkStr(eb_GuarAcc_Info.getMcc())) {
			guarAcctCredSgmt.setMcc(eb_GuarAcc_Info.getMcc());
			enSecAcctInf.setGuarAcctCredSgmt(guarAcctCredSgmt);
		}
		entDocument.setEnSecAcctInf(enSecAcctInf);
//		String reportXML = CreateXML.convertToXml(enGuarantee) + "\r\n";;
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
