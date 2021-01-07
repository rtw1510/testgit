package com.dhcc.xml.ent.batch.processor.guarantee;

import java.util.ArrayList;
import java.util.List;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.guarantee.BsSgmt;
import com.dhcc.xml.ent.entity.guarantee.CccInf;
import com.dhcc.xml.ent.entity.guarantee.EnGuarantee;
import com.dhcc.xml.ent.entity.guarantee.EnSecAcctMdfc;
import com.dhcc.xml.ent.entity.guarantee.GuarAcctBsInfSgmt;
import com.dhcc.xml.ent.entity.guarantee.GuarAcctBsSgmt;
import com.dhcc.xml.ent.entity.guarantee.GuarAcctCredSgmt;
import com.dhcc.xml.ent.entity.guarantee.GuarMotgaCltalCtrctInfSgmt;
import com.dhcc.xml.ent.entity.guarantee.GuarRltRepymtInfSgmt;
import com.dhcc.xml.ent.entity.guarantee.MdfcSgmt;
import com.dhcc.xml.ent.entity.guarantee.RltRepymtInf;
import com.dhcc.xml.ent.entity.guarantee.RltRepymtInfSgmt;
import com.dhcc.xml.ent.entity.guarantee.db.Eb_AcctMdf_Info;
import com.dhcc.xml.ent.entity.guarantee.db.Eb_Guacct_Info;
import com.dhcc.xml.ent.entity.guarantee.db.Eb_GuarAccRel_Info;
import com.dhcc.xml.ent.entity.guarantee.db.Eb_GuarAcc_Info;
import com.dhcc.xml.util.CheckUtilPlus;
import com.dhcc.xml.util.CreateXML;

/**
 * Title: BsSgmtProcessor<br/>
 * Description: 企业基本信息记录报文生成处理<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月25日
 */
@Component("EnSecAcctMdfcProcessor")
@StepScope
public class EnSecAcctMdfcProcessor implements ItemProcessor<Eb_AcctMdf_Info, Object> {

	/** 生成报文名*/
	private String fileName;
	/** 生成报文路径 */
	private String filePath;
	/** 线程名称*/
	private String threadName;

	/**
	 * 处理Reader读取的Item对象
	 * 
	 * @param eb_AcctMdf_Info
	 *            数据库映射的对象
	 */
	public Object process(Eb_AcctMdf_Info eb_AcctMdf_Info) throws Exception {
		EntDocument entDocument;
		EnSecAcctMdfc enSecAcctMdfc;
		BsSgmt bsSgmt;
		MdfcSgmt mdfcSgmt;
		GuarAcctBsSgmt guarAcctBsSgmt;
		GuarAcctBsInfSgmt guarAcctBsInfSgmt;
		GuarRltRepymtInfSgmt guarRltRepymtInfSgmt;
		RltRepymtInfSgmt rltRepymtInfSgmt;
		GuarMotgaCltalCtrctInfSgmt guarMotgaCltalCtrctInfSgmt;
		GuarAcctCredSgmt guarAcctCredSgmt;
		List<RltRepymtInf> liRltRepymtInf;
		RltRepymtInf rltRepymtInf;
		List<CccInf> liCccInf;
		CccInf cccInf;

		entDocument = new EntDocument();
		enSecAcctMdfc = new EnSecAcctMdfc();
		bsSgmt = new BsSgmt();
		mdfcSgmt = new MdfcSgmt();
		guarAcctBsSgmt = new GuarAcctBsSgmt();
		guarAcctBsInfSgmt = new GuarAcctBsInfSgmt();
		guarRltRepymtInfSgmt = new GuarRltRepymtInfSgmt();
		rltRepymtInfSgmt = new RltRepymtInfSgmt();
		guarMotgaCltalCtrctInfSgmt = new GuarMotgaCltalCtrctInfSgmt();
		guarAcctCredSgmt = new GuarAcctCredSgmt();
		liRltRepymtInf = new ArrayList<RltRepymtInf>();
		liCccInf = new ArrayList<CccInf>();

		bsSgmt.setInfRecType(eb_AcctMdf_Info.getInfRecType());
		bsSgmt.setModRecCode(eb_AcctMdf_Info.getModRecCode());
		bsSgmt.setRptDate(UpdateDate.updateDate(eb_AcctMdf_Info.getRptDate()));
		bsSgmt.setAcctType(eb_AcctMdf_Info.getAcctType());
		bsSgmt.setMdfcSgmtCode(eb_AcctMdf_Info.getMdfcSgmtCode());
		enSecAcctMdfc.setBsSgmt(bsSgmt);

		if ("B".equals(eb_AcctMdf_Info.getMdfcSgmtCode())) {
			Eb_GuarAcc_Info eb_GuarAcc_Info = eb_AcctMdf_Info.getEb_GuarAcc_Info();
			if (eb_GuarAcc_Info != null&& CheckUtilPlus.checkStr(eb_GuarAcc_Info.getAcctCode())) {
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
				mdfcSgmt.setGuarAcctBsSgmt(guarAcctBsSgmt);
			}
		}

		if ("C".equals(eb_AcctMdf_Info.getMdfcSgmtCode())) {
			Eb_GuarAcc_Info eb_GuarAcc_Info = eb_AcctMdf_Info.getEb_GuarAcc_Info();
			if (eb_GuarAcc_Info != null&& CheckUtilPlus.checkStr(eb_GuarAcc_Info.getBusiLines())) {
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
				mdfcSgmt.setGuarAcctBsInfSgmt(guarAcctBsInfSgmt);
			}
		}
		
		if ("D".equals(eb_AcctMdf_Info.getMdfcSgmtCode())) {
			Eb_GuarAcc_Info eb_GuarAcc_Info = eb_AcctMdf_Info.getEb_GuarAcc_Info();
			if (eb_GuarAcc_Info != null&& CheckUtilPlus.checkStr(eb_GuarAcc_Info.getAcctStatus())) {
				guarRltRepymtInfSgmt.setAcctStatus(eb_GuarAcc_Info.getAcctStatus());
				guarRltRepymtInfSgmt.setCloseDate(UpdateDate.updateDate(eb_GuarAcc_Info.getCloseDate()));
				guarRltRepymtInfSgmt.setCompAdvFlag(eb_GuarAcc_Info.getCompAdvFlag());
				guarRltRepymtInfSgmt.setFiveCate(eb_GuarAcc_Info.getFiveCate());
				guarRltRepymtInfSgmt.setFiveCateAdjDate(UpdateDate.updateDate(eb_GuarAcc_Info.getFiveCateAdjDate()));
				guarRltRepymtInfSgmt.setLoanAmt(eb_GuarAcc_Info.getLoanAmt());
				guarRltRepymtInfSgmt.setRepayPrd(UpdateDate.updateDate(eb_GuarAcc_Info.getRepayPrd()));
				guarRltRepymtInfSgmt.setRiEx(eb_GuarAcc_Info.getRiEx());
				mdfcSgmt.setGuarRltRepymtInfSgmt(guarRltRepymtInfSgmt);
			}
		}
		
		if ("E".equals(eb_AcctMdf_Info.getMdfcSgmtCode())) {
			List<Eb_GuarAccRel_Info> Eb_GuarAccRel_Info_List = eb_AcctMdf_Info.getEb_GuarAccRel_Info_List();
			if (CheckUtilPlus.checkList(Eb_GuarAccRel_Info_List)) {
				for (Eb_GuarAccRel_Info eb_GuarAccRel_Info : Eb_GuarAccRel_Info_List) {
					if (CheckUtilPlus.checkStr(eb_GuarAccRel_Info.getArlpCertNum())) {
						rltRepymtInf = new RltRepymtInf();
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
						liRltRepymtInf.add(rltRepymtInf);
					}
				}
				if (CheckUtilPlus.checkList(Eb_GuarAccRel_Info_List)) {
					rltRepymtInfSgmt.setRltRepymtInf(liRltRepymtInf);
					rltRepymtInfSgmt.setRltRepymtNm(liRltRepymtInf.size() + "");
					mdfcSgmt.setRltRepymtInfSgmt(rltRepymtInfSgmt);
				}
			}
		}
		
		if ("F".equals(eb_AcctMdf_Info.getMdfcSgmtCode())) {
			List<Eb_Guacct_Info> Eb_Guacct_Info_List = eb_AcctMdf_Info.getEb_Guacct_Info_List();
			if (CheckUtilPlus.checkList(Eb_Guacct_Info_List)) {
				for (Eb_Guacct_Info eb_Guacct_Info : Eb_Guacct_Info_List) {
					if (CheckUtilPlus.checkStr(eb_Guacct_Info.getCcCode())) {
						cccInf = new CccInf();
						cccInf.setCcc(eb_Guacct_Info.getCcCode());
						liCccInf.add(cccInf);
					}
				}
				if (CheckUtilPlus.checkList(liCccInf)) {
					guarMotgaCltalCtrctInfSgmt.setCccInf(liCccInf);
					guarMotgaCltalCtrctInfSgmt.setCcNm(liCccInf.size() + "");
					mdfcSgmt.setGuarMotgaCltalCtrctInfSgmt(guarMotgaCltalCtrctInfSgmt);
				}
			}
		}
		if ("G".equals(eb_AcctMdf_Info.getMdfcSgmtCode())) {
			Eb_GuarAcc_Info eb_GuarAcc_Info = eb_AcctMdf_Info.getEb_GuarAcc_Info();
			if (eb_GuarAcc_Info != null&& CheckUtilPlus.checkStr(eb_GuarAcc_Info.getMcc())) {
				guarAcctCredSgmt.setMcc(eb_GuarAcc_Info.getMcc());
				mdfcSgmt.setGuarAcctCredSgmt(guarAcctCredSgmt);
			}
		}
		enSecAcctMdfc.setMdfcSgmt(mdfcSgmt);
		entDocument.setEnSecAcctMdfc(enSecAcctMdfc);
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
