package com.dhcc.xml.per.batch.processor.credit;

import java.util.ArrayList;
import java.util.List;

import com.dhcc.xml.per.entity.PerDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;

import com.dhcc.xml.per.entity.credit.BsSgmt;
import com.dhcc.xml.per.entity.credit.CreditLimSgmt;
import com.dhcc.xml.per.entity.credit.CtrctBsSgmt;
import com.dhcc.xml.per.entity.credit.CtrctCertRel;
import com.dhcc.xml.per.entity.credit.CtrctCertRelSgmt;
import com.dhcc.xml.per.entity.credit.InCtrctMdfc;
import com.dhcc.xml.per.entity.credit.MdfcSgmt;
import com.dhcc.xml.per.entity.credit.PerCredit;
import com.dhcc.xml.per.entity.credit.db.Pb_AcctMdf_Info;
import com.dhcc.xml.per.entity.credit.db.Pb_LnctrctBase_Info;
import com.dhcc.xml.per.entity.credit.db.Pb_LnctrctRel_Info;
import com.dhcc.xml.util.CheckUtilPlus;
import com.dhcc.xml.util.CreateXML;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Title: BsSgmtProcessor<br/>
 * Description: 个人授信协议信息记录报文生成处理<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月25日
 */
@Component("InCtrctMdfcProcessor")
@StepScope
public class InCtrctMdfcProcessor implements ItemProcessor<Pb_AcctMdf_Info, Object> {

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
	 * @param pb_AcctMdf_Info
	 *            数据库映射的对象
	 */
	public Object process(Pb_AcctMdf_Info pb_AcctMdf_Info) throws Exception {
		System.out.println("=======================================PROCESS.START=========================================================");
		PerDocument perDocument;
		InCtrctMdfc inCtrctMdfc;
		BsSgmt bsSgmt;
		MdfcSgmt mdfcSgmt;

		/* 1、 基础段 */
		CtrctBsSgmt ctrctBsSgmt;
		/* 2、共同受信人信息段[0..1] */
		CtrctCertRelSgmt ctrctCertRelSgmt;
		/* 3、共同受信人信息段[0..1] */
		List<CtrctCertRel> liCtrctCertRel;
		CtrctCertRel ctrctCertRel;
		/* 3、额度信息段[1..1] */
		CreditLimSgmt creditLimSgmt;

		perDocument = new PerDocument();// 二代征信企业基本信息报文入口类
		inCtrctMdfc = new InCtrctMdfc();
		mdfcSgmt = new MdfcSgmt();
		bsSgmt = new BsSgmt();
		ctrctBsSgmt = new CtrctBsSgmt();
		ctrctCertRelSgmt = new CtrctCertRelSgmt();
		liCtrctCertRel = new ArrayList<CtrctCertRel>();
		creditLimSgmt = new CreditLimSgmt();

		bsSgmt.setInfRecType(pb_AcctMdf_Info.getInfRecType());
		bsSgmt.setMdfcSgmtCode(pb_AcctMdf_Info.getMdfcSgmtCode());
		bsSgmt.setModRecCode(pb_AcctMdf_Info.getModRecCode());
		bsSgmt.setRptDate(UpdateDate.updateDate(pb_AcctMdf_Info.getRptDate()));
		inCtrctMdfc.setBsSgmt(bsSgmt);

		if ("B".equals(pb_AcctMdf_Info.getMdfcSgmtCode())) {
			Pb_LnctrctBase_Info pb_LnctrctBase_Info = pb_AcctMdf_Info.getPb_LnctrctBase_Info();
			if (pb_LnctrctBase_Info != null && CheckUtilPlus.checkStr(pb_LnctrctBase_Info.getContractCode())) {
				ctrctBsSgmt.setContractCode(pb_LnctrctBase_Info.getContractCode());
				ctrctBsSgmt.setIDNum(pb_LnctrctBase_Info.getIDNum());
				ctrctBsSgmt.setIDType(pb_LnctrctBase_Info.getIDType());
				ctrctBsSgmt.setInfRecType(pb_LnctrctBase_Info.getInfRecType());
				ctrctBsSgmt.setMngmtOrgCode(pb_LnctrctBase_Info.getMngmtOrgCode());
				ctrctBsSgmt.setName(pb_LnctrctBase_Info.getName());
				ctrctBsSgmt.setRptDate(UpdateDate.updateDate(pb_LnctrctBase_Info.getRptDate()));
				ctrctBsSgmt.setRptDateCode(pb_LnctrctBase_Info.getRptDateCode());
				mdfcSgmt.setCtrctBsSgmt(ctrctBsSgmt);
			}
		}

		/* 2、共同受信人信息段 */
		if ("C".equals(pb_AcctMdf_Info.getMdfcSgmtCode())) {
			List<Pb_LnctrctRel_Info> Pb_LnctrctRel_Info_List = pb_AcctMdf_Info.getPb_LnctrctRel_Info_List();
			if (CheckUtilPlus.checkList(Pb_LnctrctRel_Info_List)) {
				for (Pb_LnctrctRel_Info pb_LnctrctRel_Info : Pb_LnctrctRel_Info_List) {
					if(CheckUtilPlus.checkStr(pb_LnctrctRel_Info.getCertRelIDNum())){
						ctrctCertRel = new CtrctCertRel();
						ctrctCertRel.setBrerType(pb_LnctrctRel_Info.getBrerType());
						if("2".equals(pb_LnctrctRel_Info.getBrerType())&&"30".equals(pb_LnctrctRel_Info.getCertRelIDType())) {
							ctrctCertRel.setCertRelIDNum(pb_LnctrctRel_Info.getCertRelIDNum() == null ? pb_LnctrctRel_Info.getCertRelIDNum() :
									pb_LnctrctRel_Info.getCertRelIDNum().replace("-",""));
						}else{
							ctrctCertRel.setCertRelIDNum(pb_LnctrctRel_Info.getCertRelIDNum());
						}
						ctrctCertRel.setCertRelIDType(pb_LnctrctRel_Info.getCertRelIDType());
						ctrctCertRel.setCertRelName(pb_LnctrctRel_Info.getCertRelName());
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

		/* 3、额度信息段 */
		if ("D".equals(pb_AcctMdf_Info.getMdfcSgmtCode())) {
			Pb_LnctrctBase_Info pb_LnctrctBase_Info = pb_AcctMdf_Info.getPb_LnctrctBase_Info();
			if (pb_LnctrctBase_Info != null&& CheckUtilPlus.checkStr(pb_LnctrctBase_Info.getConStatus())) {
				creditLimSgmt.setConEffDate(UpdateDate.updateDate(pb_LnctrctBase_Info.getConEffDate()));
				creditLimSgmt.setConExpDate(UpdateDate.updateDate(pb_LnctrctBase_Info.getConExpDate()));
				creditLimSgmt.setConStatus(pb_LnctrctBase_Info.getConStatus());
				creditLimSgmt.setCreditLim(pb_LnctrctBase_Info.getCreditLim());
				creditLimSgmt.setCreditLimType(pb_LnctrctBase_Info.getCreditLimType());
				creditLimSgmt.setCreditRest(pb_LnctrctBase_Info.getCreditRest());
				creditLimSgmt.setCreditRestCode(pb_LnctrctBase_Info.getCreditRestCode());
				creditLimSgmt.setCy(pb_LnctrctBase_Info.getCy());
				creditLimSgmt.setLimLoopFlg(pb_LnctrctBase_Info.getLimLoopFlg());
				mdfcSgmt.setCreditLimSgmt(creditLimSgmt);
			}
		}
		
		inCtrctMdfc.setMdfcSgmt(mdfcSgmt);
		perDocument.setInCtrctMdfc(inCtrctMdfc);
//		String reportXML = CreateXML.convertToXml(perCredit) + "\r\n";
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
