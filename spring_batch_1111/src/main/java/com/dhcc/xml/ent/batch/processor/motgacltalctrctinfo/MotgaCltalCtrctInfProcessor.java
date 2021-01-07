package com.dhcc.xml.ent.batch.processor.motgacltalctrctinfo;

import java.util.ArrayList;
import java.util.List;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.CltalInfSgmt;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.ComRecInfSgmt;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.EnMotgaCltalCtrctInfo;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.ImpInf;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.MotgaCltalBsInfSgmt;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.MotgaCltalCtrctBsSgmt;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.MotgaCltalCtrctInf;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.MotgaProptInfSgmt;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.OtrRec;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.PleInf;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.db.Eb_GuacctImp_Info;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.db.Eb_GuacctPle_Info;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.db.Eb_GuacctRlt_Info;
import com.dhcc.xml.ent.entity.motgacltalctrctinfo.db.Eb_Guacct_Info;
import com.dhcc.xml.util.CheckUtilPlus;
import com.dhcc.xml.util.CreateXML;
import org.springframework.stereotype.Component;

/**
 * Title: MotgaCltalCtrctInfProcessor<br/>
 * Description: 抵质押合同报文生成处理<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月25日
 */
@Component("EntMotgaCltalCtrctInfProcessor")
@StepScope
public class MotgaCltalCtrctInfProcessor implements ItemProcessor<Eb_Guacct_Info, Object> {

	/**
	 * 处理Reader读取的Item对象
	 * 
	 * @param eb_Guacct_Info
	 *            数据库映射的对象
	 */
	public Object process(Eb_Guacct_Info eb_Guacct_Info) throws Exception {
		EntDocument entDocument;
		MotgaCltalCtrctInf motgaCltalCtrctInf;
		MotgaCltalCtrctBsSgmt motgaCltalCtrctBsSgmt;
		MotgaCltalBsInfSgmt motgaCltalBsInfSgmt;
		ComRecInfSgmt comRecInfSgmt;
		MotgaProptInfSgmt motgaProptInfSgmt;
		CltalInfSgmt cltalInfSgmt;
		List<OtrRec> liOtrRec;
		OtrRec otrRec;
		List<PleInf> liPleInf;
		PleInf pleInf;
		List<ImpInf> liImpInf;
		ImpInf impInf;

		entDocument = new EntDocument();
		motgaCltalCtrctInf = new MotgaCltalCtrctInf();
		motgaCltalCtrctBsSgmt = new MotgaCltalCtrctBsSgmt();
		motgaCltalBsInfSgmt = new MotgaCltalBsInfSgmt();
		comRecInfSgmt = new ComRecInfSgmt();
		motgaProptInfSgmt = new MotgaProptInfSgmt();
		cltalInfSgmt = new CltalInfSgmt();
		liOtrRec = new ArrayList<OtrRec>();
		liPleInf = new ArrayList<PleInf>();
		liImpInf = new ArrayList<ImpInf>();

		motgaCltalCtrctBsSgmt.setCcCode(eb_Guacct_Info.getCcCode());
		if("2".equals(eb_Guacct_Info.getInfoIDType())&&"30".equals(eb_Guacct_Info.getCertType())) {
			motgaCltalCtrctBsSgmt.setCertNum(eb_Guacct_Info.getCertNum() == null ? eb_Guacct_Info.getCertNum() :
					eb_Guacct_Info.getCertNum().replace("-",""));
		}else{
			motgaCltalCtrctBsSgmt.setCertNum(eb_Guacct_Info.getCertNum());
		}
		motgaCltalCtrctBsSgmt.setCertType(eb_Guacct_Info.getCertType());
		motgaCltalCtrctBsSgmt.setInfoIDType(eb_Guacct_Info.getInfoIDType());
		motgaCltalCtrctBsSgmt.setInfRecType(eb_Guacct_Info.getInfRecType());
		motgaCltalCtrctBsSgmt.setMngmtOrgCode(eb_Guacct_Info.getMngmtOrgCode());
		motgaCltalCtrctBsSgmt.setName(eb_Guacct_Info.getName());
		motgaCltalCtrctBsSgmt.setRptDate(UpdateDate.updateDate(eb_Guacct_Info.getRptDate()));
		motgaCltalCtrctBsSgmt.setRptDateCode(eb_Guacct_Info.getRptDateCode());
		motgaCltalCtrctInf.setMotgaCltalCtrctBsSgmt(motgaCltalCtrctBsSgmt);

		if ("1".equals(eb_Guacct_Info.getGUACCTBASEINFO_FLAG())&& CheckUtilPlus.checkStr(eb_Guacct_Info.getGuarType())) {
			motgaCltalBsInfSgmt.setCcAmt(eb_Guacct_Info.getCcAmt());
			motgaCltalBsInfSgmt.setCcExpDate(UpdateDate.updateDate(eb_Guacct_Info.getCcExpDate()));
			motgaCltalBsInfSgmt.setCcStatus(eb_Guacct_Info.getCcStatus());
			motgaCltalBsInfSgmt.setCcValDate(UpdateDate.updateDate(eb_Guacct_Info.getCcValDate()));
			motgaCltalBsInfSgmt.setCy(eb_Guacct_Info.getCy());
			motgaCltalBsInfSgmt.setGuarType(eb_Guacct_Info.getGuarType());
			motgaCltalBsInfSgmt.setMaxGuar(eb_Guacct_Info.getMaxGuar());
			motgaCltalCtrctInf.setMotgaCltalBsInfSgmt(motgaCltalBsInfSgmt);
		}

		if ("1".equals(eb_Guacct_Info.getGUACCTRLT_FLAG())) {
			List<Eb_GuacctRlt_Info> Eb_GuacctRlt_Info_List = eb_Guacct_Info.getEb_GuacctRlt_Info_List();
			if (CheckUtilPlus.checkList(Eb_GuacctRlt_Info_List)) {
				for (Eb_GuacctRlt_Info eb_GuacctRlt_Info : Eb_GuacctRlt_Info_List) {
					if (CheckUtilPlus.checkStr(eb_GuacctRlt_Info.getGuarCertNum())) {
						otrRec = new OtrRec();
						if("2".equals(eb_GuacctRlt_Info.getInfoIDType())&&"30".equals(eb_GuacctRlt_Info.getGuarCertType())) {
							otrRec.setGuarCertNum(eb_GuacctRlt_Info.getGuarCertNum() == null ? eb_GuacctRlt_Info.getGuarCertNum() :
									eb_GuacctRlt_Info.getGuarCertNum().replace("-",""));
						}else{
							otrRec.setGuarCertNum(eb_GuacctRlt_Info.getGuarCertNum());
						}
						otrRec.setGuarCertType(eb_GuacctRlt_Info.getGuarCertType());
						otrRec.setGuarName(eb_GuacctRlt_Info.getGuarName());
						otrRec.setInfoIDType(eb_GuacctRlt_Info.getInfoIDType());
						liOtrRec.add(otrRec);
					}
				}
				if (CheckUtilPlus.checkList(Eb_GuacctRlt_Info_List)) {
					comRecInfSgmt.setGrtdNm(liOtrRec.size() + "");
					comRecInfSgmt.setOtrRec(liOtrRec);
					motgaCltalCtrctInf.setComRecInfSgmt(comRecInfSgmt);
				}
			}
		}
		
		if ("1".equals(eb_Guacct_Info.getGUACCTPLE_FLAG())) {
			List<Eb_GuacctPle_Info> Eb_GuacctPle_Info_List = eb_Guacct_Info.getEb_GuacctPle_Info_List();
			if (CheckUtilPlus.checkList(Eb_GuacctPle_Info_List)) {
				for (Eb_GuacctPle_Info eb_GuacctPle_Info : Eb_GuacctPle_Info_List) {
					if (CheckUtilPlus.checkStr(eb_GuacctPle_Info.getPleorCertNum())) {
						pleInf = new PleInf();
						pleInf.setMotgaProptIDType(eb_GuacctPle_Info.getMotgaProptIDType());
						pleInf.setPleCertID(eb_GuacctPle_Info.getPleCertID());
						pleInf.setPleDesc(eb_GuacctPle_Info.getPleDesc());
						pleInf.setPledgorName(eb_GuacctPle_Info.getPledgorName());
						pleInf.setPledgorType(eb_GuacctPle_Info.getPledgorType());
						pleInf.setPleDistr(eb_GuacctPle_Info.getPleDistr());
						pleInf.setPleorCertNum(eb_GuacctPle_Info.getPleorCertNum());
						pleInf.setPleorCertType(eb_GuacctPle_Info.getPleorCertType());
						pleInf.setPleType(eb_GuacctPle_Info.getPleType());
						pleInf.setPleValue(eb_GuacctPle_Info.getPleValue());
						pleInf.setValDate(UpdateDate.updateDate(eb_GuacctPle_Info.getValDate()));
						pleInf.setValOrgType(eb_GuacctPle_Info.getValOrgType());
						pleInf.setPleCy(eb_GuacctPle_Info.getPleCy());
						liPleInf.add(pleInf);
					}
				}
				if (CheckUtilPlus.checkList(liPleInf)) {
					motgaProptInfSgmt.setPleInf(liPleInf);
					motgaProptInfSgmt.setPleNm(liPleInf.size() + "");
					motgaCltalCtrctInf.setMotgaProptInfSgmt(motgaProptInfSgmt);
				}
			}
		}
		
		if ("1".equals(eb_Guacct_Info.getGUACCTIMP_FLAG())) {
			List<Eb_GuacctImp_Info> Eb_GuacctImp_Info_List = eb_Guacct_Info.getEb_GuacctImp_Info_List();
			if (CheckUtilPlus.checkList(Eb_GuacctImp_Info_List)) {
				for (Eb_GuacctImp_Info eb_GuacctImp_Info : Eb_GuacctImp_Info_List) {
					if (CheckUtilPlus.checkStr(eb_GuacctImp_Info.getPawnCertNum())) {
						impInf = new ImpInf();
						impInf.setImpType(eb_GuacctImp_Info.getImpType());
						impInf.setImpVal(eb_GuacctImp_Info.getImpVal());
						impInf.setIppc(eb_GuacctImp_Info.getIppc());
						impInf.setPawnCertNum(eb_GuacctImp_Info.getPawnCertNum());
						impInf.setPawnCertType(eb_GuacctImp_Info.getPawnCertType());
						impInf.setPawnName(eb_GuacctImp_Info.getPawnName());
						impInf.setImpCy(eb_GuacctImp_Info.getImpCy());
						liImpInf.add(impInf);
					}
				}
				if (CheckUtilPlus.checkList(liImpInf)) {
					cltalInfSgmt.setImpInf(liImpInf);
					cltalInfSgmt.setImpNm(liImpInf.size()+"");
					motgaCltalCtrctInf.setCltalInfSgmt(cltalInfSgmt);
				}
			}
		}

		entDocument.setMotgaCltalCtrctInf(motgaCltalCtrctInf);
//		String reportXML = CreateXML.convertToXml(enMotgaCltalCtrctInfo) + "\r\n";
		return entDocument;
	}
}
