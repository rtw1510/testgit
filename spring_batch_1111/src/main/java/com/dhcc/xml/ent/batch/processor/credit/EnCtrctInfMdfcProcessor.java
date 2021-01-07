package com.dhcc.xml.ent.batch.processor.credit;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.credit.BsSgmt;
import com.dhcc.xml.ent.entity.credit.CreditLimSgmt;
import com.dhcc.xml.ent.entity.credit.CtrctBsSgmt;
import com.dhcc.xml.ent.entity.credit.CtrctCertRel;
import com.dhcc.xml.ent.entity.credit.CtrctCertRelSgmt;
import com.dhcc.xml.ent.entity.credit.EnCredit;
import com.dhcc.xml.ent.entity.credit.EnCtrctInfMdfc;
import com.dhcc.xml.ent.entity.credit.MdfcSgmt;
import com.dhcc.xml.ent.entity.credit.db.Eb_AcctMdf_Info;
import com.dhcc.xml.ent.entity.credit.db.Eb_CorpCtrRel_Info;
import com.dhcc.xml.ent.entity.credit.db.Eb_CorpCtr_Info;
import com.dhcc.xml.util.CheckUtilPlus;
import com.dhcc.xml.util.CreateXML;

/**
 * Title: BsSgmtProcessor<br/>
 * Description: 企业基本信息记录报文生成处理<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月25日
 */
@Component("EnCtrctInfMdfcProcessor")
@StepScope
public class EnCtrctInfMdfcProcessor implements ItemProcessor<Eb_AcctMdf_Info, Object> {

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
	 * @param eb_AcctMdf_Info
	 *            数据库映射的对象
	 */
	public Object process(Eb_AcctMdf_Info eb_AcctMdf_Info) throws Exception {
		EntDocument entDocument;
		EnCtrctInfMdfc enCtrctInfMdfc;
		BsSgmt bsSgmt;
		MdfcSgmt mdfcSgmt;
		CtrctBsSgmt ctrctBsSgmt;
		CtrctCertRelSgmt ctrctCertRelSgmt;
		CreditLimSgmt creditLimSgmt;
		List<CtrctCertRel> liCtrctCertRel;
		CtrctCertRel ctrctCertRel;

		entDocument = new EntDocument();
		enCtrctInfMdfc = new EnCtrctInfMdfc();
		bsSgmt = new BsSgmt();
		mdfcSgmt = new MdfcSgmt();
		ctrctBsSgmt = new CtrctBsSgmt();
		ctrctCertRelSgmt = new CtrctCertRelSgmt();
		creditLimSgmt = new CreditLimSgmt();
		liCtrctCertRel = new ArrayList<CtrctCertRel>();

		bsSgmt.setInfRecType(eb_AcctMdf_Info.getInfRecType());
		bsSgmt.setMdfcSgmtCode(eb_AcctMdf_Info.getMdfcSgmtCode());
		bsSgmt.setModRecCode(eb_AcctMdf_Info.getModRecCode());
		bsSgmt.setRptDate(eb_AcctMdf_Info.getRptDate());
		enCtrctInfMdfc.setBsSgmt(bsSgmt);

		if ("B".equals(eb_AcctMdf_Info.getMdfcSgmtCode())) {
			Eb_CorpCtr_Info eb_CorpCtr_Info = eb_AcctMdf_Info.getEb_CorpCtr_Info();
			if (eb_CorpCtr_Info != null&& CheckUtilPlus.checkStr(eb_CorpCtr_Info.getContractCode())) {
				ctrctBsSgmt.setContractCode(eb_CorpCtr_Info.getContractCode());
				if("30".equals(eb_CorpCtr_Info.getIDType())) {
					ctrctBsSgmt.setIDNum(eb_CorpCtr_Info.getIDNum() == null ? eb_CorpCtr_Info.getIDNum() :
							eb_CorpCtr_Info.getIDNum().replace("-",""));
				}else{
					ctrctBsSgmt.setIDNum(eb_CorpCtr_Info.getIDNum());
				}
				ctrctBsSgmt.setIDType(eb_CorpCtr_Info.getIDType());
				ctrctBsSgmt.setInfRecType(eb_CorpCtr_Info.getInfRecType());
				ctrctBsSgmt.setMngmtOrgCode(eb_CorpCtr_Info.getMngmtOrgCode());
				ctrctBsSgmt.setName(eb_CorpCtr_Info.getName());
				ctrctBsSgmt.setRptDate(UpdateDate.updateDate(eb_CorpCtr_Info.getRptDate()));
				ctrctBsSgmt.setRptDateCode(eb_CorpCtr_Info.getRptDateCode());
				mdfcSgmt.setCtrctBsSgmt(ctrctBsSgmt);
			}
		}

		if ("C".equals(eb_AcctMdf_Info.getMdfcSgmtCode())) {
			List<Eb_CorpCtrRel_Info> Eb_CorpCtrRel_Info_List = eb_AcctMdf_Info.getEb_CorpCtrRel_Info_List();
			if (CheckUtilPlus.checkList(Eb_CorpCtrRel_Info_List)) {
				for (Eb_CorpCtrRel_Info eb_CorpCtrRel_Info : Eb_CorpCtrRel_Info_List) {
					if (CheckUtilPlus.checkStr(eb_CorpCtrRel_Info.getCertRelIDNum())) {
						ctrctCertRel=new CtrctCertRel();
						ctrctCertRel.setBrerType(eb_CorpCtrRel_Info.getBrerType());
						if("2".equals(eb_CorpCtrRel_Info.getBrerType())&&"30".equals(eb_CorpCtrRel_Info.getCertRelIDType())) {
							ctrctCertRel.setCertRelIDNum(eb_CorpCtrRel_Info.getCertRelIDNum() == null ? eb_CorpCtrRel_Info.getCertRelIDNum() :
									eb_CorpCtrRel_Info.getCertRelIDNum().replace("-",""));
						}else{
							ctrctCertRel.setCertRelIDNum(eb_CorpCtrRel_Info.getCertRelIDNum());
						}
						ctrctCertRel.setCertRelIDType(eb_CorpCtrRel_Info.getCertRelIDType());
						ctrctCertRel.setCertRelName(eb_CorpCtrRel_Info.getCertRelName());
						liCtrctCertRel.add(ctrctCertRel);
					}
				}
				if (CheckUtilPlus.checkList(liCtrctCertRel)) {
					ctrctCertRelSgmt.setBrerNm(liCtrctCertRel.size() + "");
					ctrctCertRelSgmt.setCtrctCertRel(liCtrctCertRel);
					mdfcSgmt.setCtrctCertRelSgmt(ctrctCertRelSgmt);
				}
			}
		}

		if ("D".equals(eb_AcctMdf_Info.getMdfcSgmtCode())) {
			Eb_CorpCtr_Info eb_CorpCtr_Info = eb_AcctMdf_Info.getEb_CorpCtr_Info();
			if (eb_CorpCtr_Info != null&& CheckUtilPlus.checkStr(eb_CorpCtr_Info.getConStatus())) {
				creditLimSgmt.setConEffDate(eb_CorpCtr_Info.getConEffDate());
				creditLimSgmt.setConExpDate(eb_CorpCtr_Info.getConExpDate());
				creditLimSgmt.setConStatus(eb_CorpCtr_Info.getConStatus());
				creditLimSgmt.setCreditLim(eb_CorpCtr_Info.getCreditLim());
				creditLimSgmt.setCreditLimType(eb_CorpCtr_Info.getCreditLimType());
				creditLimSgmt.setCreditRest(eb_CorpCtr_Info.getCreditRest());
				creditLimSgmt.setCreditRestCode(eb_CorpCtr_Info.getCreditRestCode());
				creditLimSgmt.setCy(eb_CorpCtr_Info.getCy());
				creditLimSgmt.setLimLoopFlg(eb_CorpCtr_Info.getLimLoopFlg());
				mdfcSgmt.setCreditLimSgmt(creditLimSgmt);
			}
		}

		enCtrctInfMdfc.setMdfcSgmt(mdfcSgmt);
		entDocument.setEnCtrctInfMdfc(enCtrctInfMdfc);
//		String reportXML = CreateXML.convertToXml(enCredit) + "\r\n";
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
