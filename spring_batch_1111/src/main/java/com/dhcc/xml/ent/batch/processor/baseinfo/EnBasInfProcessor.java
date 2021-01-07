package com.dhcc.xml.ent.batch.processor.baseinfo;

import java.util.ArrayList;
import java.util.List;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.baseinfo.ActuCotrlInf;
import com.dhcc.xml.ent.entity.baseinfo.ActuCotrlInfSgmt;
import com.dhcc.xml.ent.entity.baseinfo.BsSgmt;
import com.dhcc.xml.ent.entity.baseinfo.CotaInfSgmt;
import com.dhcc.xml.ent.entity.baseinfo.EnBasInf;
import com.dhcc.xml.ent.entity.baseinfo.EnBaseInfo;
import com.dhcc.xml.ent.entity.baseinfo.FcsInfSgmt;
import com.dhcc.xml.ent.entity.baseinfo.IDRec;
import com.dhcc.xml.ent.entity.baseinfo.IDSgmt;
import com.dhcc.xml.ent.entity.baseinfo.MmbInf;
import com.dhcc.xml.ent.entity.baseinfo.MnMmbInfSgmt;
import com.dhcc.xml.ent.entity.baseinfo.MnShaHodInfSgmt;
import com.dhcc.xml.ent.entity.baseinfo.SharHodInf;
import com.dhcc.xml.ent.entity.baseinfo.SpvsgAthrtyInfSgmt;
import com.dhcc.xml.ent.entity.baseinfo.db.EB_CustBaseCtr_Info;
import com.dhcc.xml.ent.entity.baseinfo.db.EB_CustBaseHold_Info;
import com.dhcc.xml.ent.entity.baseinfo.db.EB_CustBaseMnm_Info;
import com.dhcc.xml.ent.entity.baseinfo.db.EB_CustBaseOth_Info;
import com.dhcc.xml.ent.entity.baseinfo.db.EB_CustBase_Info;
import com.dhcc.xml.util.CheckUtilPlus;
import com.dhcc.xml.util.CreateXML;

/**
 * Title: BsSgmtProcessor<br/>
 * Description: 企业基本信息记录报文生成处理<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月25日
 */
@Component("EnBasInfProcessor")
@StepScope
public class EnBasInfProcessor implements ItemProcessor<EB_CustBase_Info, Object> {


	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
	
	public Object process(EB_CustBase_Info eb_CustBase_Info) throws Exception {

		EntDocument entDocument;
		EnBasInf enBasInf;
		/*1、BsSgmt基础段信息 */
		BsSgmt bsSgmt;
		/*2、其他标识段 */
		IDSgmt iDSgmt;
		List<IDRec> liIDRec;
		IDRec iDRec;
		/*3、FcsInfSgmt基本概况段*/
		FcsInfSgmt fcsInfSgmt;
		/*4、MnMmbInfSgmt主要组成人员段*/
		MnMmbInfSgmt mnMmbInfSgmt;
		List<MmbInf> liMmbInf;
		MmbInf mmbInf;
		/*5、MnShaHodInfSgmt注册资本及主要出资人段*/
		MnShaHodInfSgmt mnShaHodInfSgmt;
		List<SharHodInf> liSharHodInf;
		SharHodInf sharHodInf;
		/*6、ActuCotrlInfSgmt实际控制人段*/
		ActuCotrlInfSgmt actuCotrlInfSgmt;
		List<ActuCotrlInf> liactuCotrlInf;
		ActuCotrlInf actuCotrlInf;
		/*7、SpvsgAthrtyInfSgmt上级机构段*/
		SpvsgAthrtyInfSgmt spvsgAthrtyInfSgmt;
		/*8、CotaInfSgmt联系方式段*/
		CotaInfSgmt cotaInfSgmt;

		entDocument = new EntDocument();//二代征信企业基本信息报文入口类
		enBasInf = new EnBasInf();//企业基本信息记录
		bsSgmt=new BsSgmt();//企业基本信息记录<基础段>
		iDSgmt = new IDSgmt();//其他标识段
		liIDRec = new ArrayList<IDRec>();//其他标识信息
		fcsInfSgmt = new FcsInfSgmt();//基本概况段
		mnMmbInfSgmt = new MnMmbInfSgmt();//主要组成人员段
		liMmbInf = new ArrayList<MmbInf>();//其他证件信息
		mnShaHodInfSgmt = new MnShaHodInfSgmt();//注册资本及主要出资人段
		liSharHodInf = new ArrayList<SharHodInf>();//出资人信息
		actuCotrlInfSgmt = new ActuCotrlInfSgmt();//实际控制人段
		liactuCotrlInf=new ArrayList<ActuCotrlInf>();// 实际控制人段
		spvsgAthrtyInfSgmt = new SpvsgAthrtyInfSgmt();//上级机构段
		cotaInfSgmt = new CotaInfSgmt();//联系方式段
		
		/*1、BsSgmt基础段信息 */
		bsSgmt.setRptDateCode(eb_CustBase_Info.getRptDateCode());
		if("30".equals(eb_CustBase_Info.getEntCertType())) {
			bsSgmt.setEntCertNum(eb_CustBase_Info.getEntCertNum() == null ? eb_CustBase_Info.getEntCertNum() :
					eb_CustBase_Info.getEntCertNum().replace("-",""));
		}else{
			bsSgmt.setEntCertNum(eb_CustBase_Info.getEntCertNum());
		}
		bsSgmt.setInfRecType(eb_CustBase_Info.getInfRecType());
		bsSgmt.setEntName(eb_CustBase_Info.getEntName());
		bsSgmt.setEntCertType(eb_CustBase_Info.getEntCertType());
		bsSgmt.setRptDate(UpdateDate.updateDate(eb_CustBase_Info.getRptDate()));
		bsSgmt.setInfSurcCode(eb_CustBase_Info.getInfSurcCode());
		bsSgmt.setCimoc(eb_CustBase_Info.getCimoc());
		bsSgmt.setCustomerType(eb_CustBase_Info.getCustomerType());
		bsSgmt.setEtpSts(eb_CustBase_Info.getEtpSts());
		bsSgmt.setOrgType(eb_CustBase_Info.getOrgType());
		enBasInf.setBsSgmt(bsSgmt);//企业基本信息记录基础段
		/*2、其他标识段 */
		if("1".equals(eb_CustBase_Info.getCustBaseoth_Flag())){
			List<EB_CustBaseOth_Info> eb_CustBaseOth_Info_List =eb_CustBase_Info.getEB_CustBaseOth_Info_List();
			if(CheckUtilPlus.checkList(eb_CustBaseOth_Info_List)){
				for(EB_CustBaseOth_Info eb_CustBaseOth_Info:eb_CustBaseOth_Info_List){
					if(CheckUtilPlus.checkStr(eb_CustBaseOth_Info.getOthEntCertType())){
						iDRec=new IDRec();//其他标识信息（子）
						iDRec.setOthEntCertType(eb_CustBaseOth_Info.getOthEntCertType());
						if("30".equals(eb_CustBaseOth_Info.getOthEntCertType())) {
							iDRec.setOthEntCertNum(eb_CustBaseOth_Info.getOthEntCertNum() == null ? eb_CustBaseOth_Info.getOthEntCertNum() :
									eb_CustBaseOth_Info.getOthEntCertNum().replace("-",""));
						}else{
							iDRec.setOthEntCertNum(eb_CustBaseOth_Info.getOthEntCertNum());
						}
						liIDRec.add(iDRec);
					}
				}
				if(CheckUtilPlus.checkList(liIDRec)){
					iDSgmt.setIDRec(liIDRec);//其他标识信息[1..99]
					iDSgmt.setIDNm(liIDRec.size()+"");//int转String
					iDSgmt.setIDInfoUpDate(UpdateDate.updateDate(eb_CustBase_Info.getRptDate()));//更新日期取主表上报日期
					enBasInf.setIDSgmt(iDSgmt);
				}
			}
		}
		/*3、FcsInfSgmt基本概况段*/
		if("1".equals(eb_CustBase_Info.getCustBaseinf_Flag())&& CheckUtilPlus.checkStr(eb_CustBase_Info.getNationality())){
			fcsInfSgmt.setNationality(eb_CustBase_Info.getNationality());
			fcsInfSgmt.setRegAdd(eb_CustBase_Info.getRegAdd());
			fcsInfSgmt.setAdmDivOfReg(eb_CustBase_Info.getAdmDivOfReg());
			fcsInfSgmt.setEstablishDate(UpdateDate.updateDate(eb_CustBase_Info.getEstablishDate()));
			fcsInfSgmt.setBizEndDate(UpdateDate.updateDate(eb_CustBase_Info.getBizEndDate()));
			fcsInfSgmt.setBizRange(eb_CustBase_Info.getBizRange());
			fcsInfSgmt.setEcoIndusCate(eb_CustBase_Info.getEcoIndusCate());
			fcsInfSgmt.setEcoType(eb_CustBase_Info.getEcoType());
			fcsInfSgmt.setEntScale(eb_CustBase_Info.getEntScale());
			fcsInfSgmt.setFcsInfoUpDate(UpdateDate.updateDate(eb_CustBase_Info.getFcsInfoUpDate()));
			enBasInf.setFcsInfSgmt(fcsInfSgmt);
		}
		/*4、MnMmbInfSgmt主要组成人员段*/
		if("1".equals(eb_CustBase_Info.getCustBasemnm_Flag())){
			List<EB_CustBaseMnm_Info> eb_CustBaseMnm_Info_List=eb_CustBase_Info.getEB_CustBaseMnm_Info_List();
			if(CheckUtilPlus.checkList(eb_CustBaseMnm_Info_List)){
				for(EB_CustBaseMnm_Info eb_CustBaseMnm_Info:eb_CustBaseMnm_Info_List){
					if(CheckUtilPlus.checkStr(eb_CustBaseMnm_Info.getMmbIDNum())){
						mmbInf=new MmbInf();
						mmbInf.setMmbAlias(eb_CustBaseMnm_Info.getMmbAlias());
						mmbInf.setMmbIDType(eb_CustBaseMnm_Info.getMmbIDType());
						mmbInf.setMmbIDNum(eb_CustBaseMnm_Info.getMmbIDNum());
						mmbInf.setMmbPstn(eb_CustBaseMnm_Info.getMmbPstn());
						liMmbInf.add(mmbInf);
					}
				}
				if(CheckUtilPlus.checkList(liMmbInf)){
					mnMmbInfSgmt.setMmbNm(liMmbInf.size()+"");
					mnMmbInfSgmt.setMmbInf(liMmbInf);
					mnMmbInfSgmt.setMnMmbInfoUpDate(UpdateDate.updateDate(eb_CustBase_Info.getRptDate()));
					enBasInf.setMnMmbInfSgmt(mnMmbInfSgmt);
				}
			}
		}
		/*5、MnShaHodInfSgmt注册资本及主要出资人段*/
		if("1".equals(eb_CustBase_Info.getCustBasehold_Flag())){
			List<EB_CustBaseHold_Info> eb_CustBaseHold_Info_List=eb_CustBase_Info.getEB_CustBaseHold_Info_List();
			if(CheckUtilPlus.checkList(eb_CustBaseHold_Info_List)){
				for(EB_CustBaseHold_Info eb_CustBaseHold_Info:eb_CustBaseHold_Info_List){
					if(CheckUtilPlus.checkStr(eb_CustBaseHold_Info.getSharHodIDNum())){
						sharHodInf=new SharHodInf();
						sharHodInf.setSharHodType(eb_CustBaseHold_Info.getSharHodType());
						sharHodInf.setSharHodCertType(eb_CustBaseHold_Info.getSharHodCertType());
						sharHodInf.setSharHodIDType(eb_CustBaseHold_Info.getSharHodIDType());
						if("2".equals(eb_CustBaseHold_Info.getSharHodCertType())&&"30".equals(eb_CustBaseHold_Info.getSharHodIDType())) {
							sharHodInf.setSharHodIDNum(eb_CustBaseHold_Info.getSharHodIDNum() == null ? eb_CustBaseHold_Info.getSharHodIDNum() :
									eb_CustBaseHold_Info.getSharHodIDNum().replace("-",""));
						}else{
							sharHodInf.setSharHodIDNum(eb_CustBaseHold_Info.getSharHodIDNum());
						}
						sharHodInf.setSharHodName(eb_CustBaseHold_Info.getSharHodName());
						sharHodInf.setInvRatio(eb_CustBaseHold_Info.getInvRatio());
						liSharHodInf.add(sharHodInf);
					}
				}
				if(CheckUtilPlus.checkList(liSharHodInf)){
					mnShaHodInfSgmt.setRegCapCurrency(eb_CustBase_Info.getRegCapCurrency());
					mnShaHodInfSgmt.setRegCap(eb_CustBase_Info.getRegCap());
					mnShaHodInfSgmt.setMnSharHodNm(liSharHodInf.size()+"");
					mnShaHodInfSgmt.setSharHodInf(liSharHodInf);
					mnShaHodInfSgmt.setMnShaHodInfoUpDate(UpdateDate.updateDate(eb_CustBase_Info.getRptDate()));
					enBasInf.setMnShaHodInfSgmt(mnShaHodInfSgmt);
				}
			}
		}
		/*6、ActuCotrlInfSgmt实际控制人段*/
		if("1".equals(eb_CustBase_Info.getCustBasectr_Flag())){
			List<EB_CustBaseCtr_Info> eb_CustBaseCtr_Info_List=eb_CustBase_Info.getEB_CustBaseCtr_Info_List();
			 if(CheckUtilPlus.checkList(eb_CustBaseCtr_Info_List)){
				 for(EB_CustBaseCtr_Info eb_CustBaseCtr_Info:eb_CustBaseCtr_Info_List){
					 if(CheckUtilPlus.checkStr(eb_CustBaseCtr_Info.getActuCotrlIDNum())){
						 actuCotrlInf=new ActuCotrlInf();
						 actuCotrlInf.setActuCotrlCertType(eb_CustBaseCtr_Info.getActuCotrlCertType());
						 actuCotrlInf.setActuCotrlIDType(eb_CustBaseCtr_Info.getActuCotrlIDType());
						 actuCotrlInf.setActuCotrlName(eb_CustBaseCtr_Info.getActuCotrlName());
						 if("2".equals(eb_CustBaseCtr_Info.getActuCotrlCertType())&&"30".equals(eb_CustBaseCtr_Info.getActuCotrlIDType())) {
							 actuCotrlInf.setActuCotrlIDNum(eb_CustBaseCtr_Info.getActuCotrlIDNum() == null ? eb_CustBaseCtr_Info.getActuCotrlIDNum() :
									 eb_CustBaseCtr_Info.getActuCotrlIDNum().replace("-",""));
						 }else{
							 actuCotrlInf.setActuCotrlIDNum(eb_CustBaseCtr_Info.getActuCotrlIDNum());
						 }
						 liactuCotrlInf.add(actuCotrlInf);
					 }
				 }
				 if(CheckUtilPlus.checkList(liactuCotrlInf)){
					 actuCotrlInfSgmt.setActuCotrlNm(liactuCotrlInf.size()+"");
					 actuCotrlInfSgmt.setActuCotrlInf(liactuCotrlInf);
					 actuCotrlInfSgmt.setActuCotrlInfoUpDate(UpdateDate.updateDate(eb_CustBase_Info.getRptDate()));
					 enBasInf.setActuCotrlInfSgmt(actuCotrlInfSgmt);
				 }
			 }
		}
		/*7、SpvsgAthrtyInfSgmt上级机构段*/
		if("1".equals(eb_CustBase_Info.getCustBaseup_Flag())&& CheckUtilPlus.checkStr(eb_CustBase_Info.getOrgType())){
			spvsgAthrtyInfSgmt.setSupOrgType(eb_CustBase_Info.getSupOrgType());
			spvsgAthrtyInfSgmt.setSupOrgName(eb_CustBase_Info.getSupOrgCertType());
			spvsgAthrtyInfSgmt.setSupOrgCertType(eb_CustBase_Info.getSupOrgCertType());
			if("30".equals(eb_CustBase_Info.getSupOrgCertType())) {
				spvsgAthrtyInfSgmt.setSupOrgCertNum(eb_CustBase_Info.getSupOrgCertNum() == null ? eb_CustBase_Info.getSupOrgCertNum() :
						eb_CustBase_Info.getSupOrgCertNum().replace("-",""));
			}else{
				spvsgAthrtyInfSgmt.setSupOrgCertNum(eb_CustBase_Info.getSupOrgCertNum());
			}
			spvsgAthrtyInfSgmt.setSupOrgInfoUpDate(UpdateDate.updateDate(eb_CustBase_Info.getSupOrgInfoUpDate()));
			enBasInf.setSpvsgAthrtyInfSgmt(spvsgAthrtyInfSgmt);
		}
		/*8、CotaInfSgmt联系方式段*/
		if("1".equals(eb_CustBase_Info.getCustBasecont_Flag())&& CheckUtilPlus.checkStr(eb_CustBase_Info.getCotaInfoUpDate())){
			cotaInfSgmt.setConAddDistrictCode(eb_CustBase_Info.getConAddDistrictCode());
			cotaInfSgmt.setConAdd(eb_CustBase_Info.getConAdd());
			cotaInfSgmt.setConPhone(eb_CustBase_Info.getConPhone());
			cotaInfSgmt.setFinConPhone(eb_CustBase_Info.getFinConPhone());
			cotaInfSgmt.setCotaInfoUpDate(UpdateDate.updateDate(eb_CustBase_Info.getCotaInfoUpDate()));
			enBasInf.setCotaInfSgmt(cotaInfSgmt);
		}
		entDocument.setEnBasInf(enBasInf);
//		String reportXML=CreateXML.convertToXml(enBaseInfo) + "\r\n";
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
