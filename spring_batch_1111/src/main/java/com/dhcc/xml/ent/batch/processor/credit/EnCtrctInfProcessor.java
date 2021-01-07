package com.dhcc.xml.ent.batch.processor.credit;

import java.util.ArrayList;
import java.util.List;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.credit.CreditLimSgmt;
import com.dhcc.xml.ent.entity.credit.CtrctBsSgmt;
import com.dhcc.xml.ent.entity.credit.CtrctCertRel;
import com.dhcc.xml.ent.entity.credit.CtrctCertRelSgmt;
import com.dhcc.xml.ent.entity.credit.EnCredit;
import com.dhcc.xml.ent.entity.credit.EnCtrctInf;
import com.dhcc.xml.ent.entity.credit.db.Eb_CorpCtrRel_Info;
import com.dhcc.xml.ent.entity.credit.db.Eb_CorpCtr_Info;
import com.dhcc.xml.util.CheckUtilPlus;
import com.dhcc.xml.util.CreateXML;

/**
 * Title: EnCtrctInfProcessor<br/>
 * Description: ��ҵ����Э�鱨�����ɴ���<br/>
 * 
 * @author ChenJingYuan
 * @date 2018��3��25��
 */
@Component("EnCtrctInfProcessor")
@StepScope
public class EnCtrctInfProcessor implements ItemProcessor<Eb_CorpCtr_Info, Object> {


	/** ���ɱ�����*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** ���ɱ���·�� */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** �߳�����*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;


	/**
	 * ����Reader��ȡ��Item����
	 * 
	 * @param eb_CorpCtr_Info
	 *            ���ݿ�ӳ��Ķ���
	 */
	public Object process(Eb_CorpCtr_Info eb_CorpCtr_Info) throws Exception {

		EntDocument entDocument;
		EnCtrctInf enCtrctInf;
		CtrctBsSgmt ctrctBsSgmt;
		CtrctCertRelSgmt ctrctCertRelSgmt;
		CreditLimSgmt creditLimSgmt;
		List<CtrctCertRel> liCtrctCertRel;
		CtrctCertRel ctrctCertRel;
		System.out.println("=======================================PROCESS.START=========================================================");
		entDocument = new EntDocument();
		enCtrctInf = new EnCtrctInf();
		ctrctBsSgmt = new CtrctBsSgmt();
		ctrctCertRelSgmt = new CtrctCertRelSgmt();
		creditLimSgmt = new CreditLimSgmt();
		liCtrctCertRel = new ArrayList<CtrctCertRel>();

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
		enCtrctInf.setCtrctBsSgmt(ctrctBsSgmt);
		//��ͬ��������Ϣ��
		if ("1".equals(eb_CorpCtr_Info.getCORPCTRREL_FLAG())) {
			List<Eb_CorpCtrRel_Info> Eb_CorpCtrRel_Info_List = eb_CorpCtr_Info.getEb_CorpCtrRel_Info_List();
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
					enCtrctInf.setCtrctCertRelSgmt(ctrctCertRelSgmt);
				}
			}
		}
		//�����Ϣ��
		if ("1".equals(eb_CorpCtr_Info.getCORPCTRLIM_FLAG())&& CheckUtilPlus.checkStr(eb_CorpCtr_Info.getConStatus())) {
			creditLimSgmt.setConEffDate(UpdateDate.updateDate(eb_CorpCtr_Info.getConEffDate()));
			creditLimSgmt.setConExpDate(UpdateDate.updateDate(eb_CorpCtr_Info.getConExpDate()));
			creditLimSgmt.setConStatus(eb_CorpCtr_Info.getConStatus());
			creditLimSgmt.setCreditLim(eb_CorpCtr_Info.getCreditLim());
			creditLimSgmt.setCreditLimType(eb_CorpCtr_Info.getCreditLimType());
			creditLimSgmt.setCreditRest(eb_CorpCtr_Info.getCreditRest());
			creditLimSgmt.setCreditRestCode(eb_CorpCtr_Info.getCreditRestCode());
			creditLimSgmt.setCy(eb_CorpCtr_Info.getCy());
			creditLimSgmt.setLimLoopFlg(eb_CorpCtr_Info.getLimLoopFlg());
			enCtrctInf.setCreditLimSgmt(creditLimSgmt);
		}

		entDocument.setEnCtrctInf(enCtrctInf);
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
