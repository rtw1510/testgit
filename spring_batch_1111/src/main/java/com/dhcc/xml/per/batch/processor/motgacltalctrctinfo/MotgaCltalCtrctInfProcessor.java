package com.dhcc.xml.per.batch.processor.motgacltalctrctinfo;

import java.util.ArrayList;
import java.util.List;

import com.dhcc.xml.per.entity.PerDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.item.ItemProcessor;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.CltalInfSgmt;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.ComRecInfSgmt;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.PerMotgaCltalCtrctInfo;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.ImpInf;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.MotgaCltalBsInfSgmt;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.MotgaCltalCtrctBsSgmt;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.MotgaCltalCtrctInf;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.MotgaProptInfSgmt;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.OtrRec;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.PleInf;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.db.Pb_GuacctImp_Info;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.db.Pb_GuacctPle_Info;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.db.Pb_GuacctRlt_Info;
import com.dhcc.xml.per.entity.motgacltalctrctinfo.db.Pb_Guacct_Info;
import com.dhcc.xml.util.CheckUtilPlus;
import com.dhcc.xml.util.CreateXML;
import org.springframework.stereotype.Component;

/**
 * Title: MotgaCltalCtrctInfProcessor<br/>
 * Description:抵质押合同报文生成处理<br/>
 * 
 * @author ChenJingYuan
 * @date 2018年3月25日
 */
@Component("PerMotgaCltalCtrctInf_Processor")
public class MotgaCltalCtrctInfProcessor implements ItemProcessor<Pb_Guacct_Info, Object> {

	/**
	 * 处理Reader读取的Item对象
	 * 
	 * @param pb_Guacct_Info
	 *            数据库映射的对象
	 */
	public Object process(Pb_Guacct_Info pb_Guacct_Info) throws Exception {
		PerDocument perDocument;
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

		perDocument = new PerDocument();
		motgaCltalCtrctInf = new MotgaCltalCtrctInf();
		motgaCltalCtrctBsSgmt = new MotgaCltalCtrctBsSgmt();
		motgaCltalBsInfSgmt = new MotgaCltalBsInfSgmt();
		comRecInfSgmt = new ComRecInfSgmt();
		motgaProptInfSgmt = new MotgaProptInfSgmt();
		cltalInfSgmt = new CltalInfSgmt();
		liOtrRec = new ArrayList<OtrRec>();
		liPleInf = new ArrayList<PleInf>();
		liImpInf = new ArrayList<ImpInf>();

		motgaCltalCtrctBsSgmt.setCcCode(pb_Guacct_Info.getCcCode());
		if("2".equals(pb_Guacct_Info.getInfoIDType())&&"30".equals(pb_Guacct_Info.getCertType())) {
			motgaCltalCtrctBsSgmt.setCertNum(pb_Guacct_Info.getCertNum() == null ? pb_Guacct_Info.getCertNum() :
					pb_Guacct_Info.getCertNum().replace("-",""));
		}else{
			motgaCltalCtrctBsSgmt.setCertNum(pb_Guacct_Info.getCertNum());
		}
		motgaCltalCtrctBsSgmt.setCertType(pb_Guacct_Info.getCertType());
		motgaCltalCtrctBsSgmt.setInfoIDType(pb_Guacct_Info.getInfoIDType());
		motgaCltalCtrctBsSgmt.setInfRecType(pb_Guacct_Info.getInfRecType());
		motgaCltalCtrctBsSgmt.setMngmtOrgCode(pb_Guacct_Info.getMngmtOrgCode());
		motgaCltalCtrctBsSgmt.setName(pb_Guacct_Info.getName());
		motgaCltalCtrctBsSgmt.setRptDate(UpdateDate.updateDate(pb_Guacct_Info.getRptDate()));
		motgaCltalCtrctBsSgmt.setRptDateCode(pb_Guacct_Info.getRptDateCode());
		motgaCltalCtrctInf.setMotgaCltalCtrctBsSgmt(motgaCltalCtrctBsSgmt);

		if ("1".equals(pb_Guacct_Info.getGUACCTBASEINFO_FLAG())&& CheckUtilPlus.checkStr(pb_Guacct_Info.getCcStatus())) {
			motgaCltalBsInfSgmt.setCcAmt(pb_Guacct_Info.getCcAmt());
			motgaCltalBsInfSgmt.setCcExpDate(UpdateDate.updateDate(pb_Guacct_Info.getCcExpDate()));
			motgaCltalBsInfSgmt.setCcStatus(pb_Guacct_Info.getCcStatus());
			motgaCltalBsInfSgmt.setCcValDate(UpdateDate.updateDate(pb_Guacct_Info.getCcValDate()));
			motgaCltalBsInfSgmt.setCy(pb_Guacct_Info.getCy());
			motgaCltalBsInfSgmt.setGuarType(pb_Guacct_Info.getGuarType());
			motgaCltalBsInfSgmt.setMaxGuar(pb_Guacct_Info.getMaxGuar());
			motgaCltalCtrctInf.setMotgaCltalBsInfSgmt(motgaCltalBsInfSgmt);
		}

		if ("1".equals(pb_Guacct_Info.getGUACCTRLT_FLAG())) {
			List<Pb_GuacctRlt_Info> Pb_GuacctRlt_Info_List = pb_Guacct_Info.getPb_GuacctRlt_Info_List();
			if (CheckUtilPlus.checkList(Pb_GuacctRlt_Info_List)) {
				for (Pb_GuacctRlt_Info pb_GuacctRlt_Info : Pb_GuacctRlt_Info_List) {
					if (CheckUtilPlus.checkStr(pb_GuacctRlt_Info.getGuarCertNum())){
						otrRec = new OtrRec();
						if("2".equals(pb_GuacctRlt_Info.getInfoIDType())&&"30".equals(pb_GuacctRlt_Info.getGuarCertType())) {
							otrRec.setGuarCertNum(pb_GuacctRlt_Info.getGuarCertNum() == null ? pb_GuacctRlt_Info.getGuarCertNum() :
									pb_GuacctRlt_Info.getGuarCertNum().replace("-",""));
						}else{
							otrRec.setGuarCertNum(pb_GuacctRlt_Info.getGuarCertNum());
						}
						otrRec.setGuarCertType(pb_GuacctRlt_Info.getGuarCertType());
						otrRec.setGuarName(pb_GuacctRlt_Info.getGuarName());
						otrRec.setInfoIDType(pb_GuacctRlt_Info.getInfoIDType());
						liOtrRec.add(otrRec);
					}
				}
				if(CheckUtilPlus.checkList(liOtrRec)){
					comRecInfSgmt.setGrtdNm(liOtrRec.size() + "");
					comRecInfSgmt.setOtrRec(liOtrRec);
					motgaCltalCtrctInf.setComRecInfSgmt(comRecInfSgmt);
				}
			}
		}
		
		if ("1".equals(pb_Guacct_Info.getGUACCTPLE_FLAG())) {
			List<Pb_GuacctPle_Info> Pb_GuacctPle_Info_List = pb_Guacct_Info.getPb_GuacctPle_Info_List();
			if (CheckUtilPlus.checkList(Pb_GuacctPle_Info_List)) {
				for (Pb_GuacctPle_Info pb_GuacctPle_Info : Pb_GuacctPle_Info_List) {
					if(CheckUtilPlus.checkStr(pb_GuacctPle_Info.getPleType())){
						pleInf = new PleInf();
						pleInf.setMotgaProptIDType(pb_GuacctPle_Info.getMotgaProptIDType());
						pleInf.setPleCertID(pb_GuacctPle_Info.getPleCertID());
						pleInf.setPleDesc(pb_GuacctPle_Info.getPleDesc());
						pleInf.setPledgorName(pb_GuacctPle_Info.getPledgorName());
						pleInf.setPledgorType(pb_GuacctPle_Info.getPledgorType());
						pleInf.setPleDistr(pb_GuacctPle_Info.getPleDistr());
						pleInf.setPleorCertNum(pb_GuacctPle_Info.getPleorCertNum());
						pleInf.setPleorCertType(pb_GuacctPle_Info.getPleorCertType());
						pleInf.setPleType(pb_GuacctPle_Info.getPleType());
						pleInf.setPleValue(pb_GuacctPle_Info.getPleValue());
						pleInf.setValDate(UpdateDate.updateDate(pb_GuacctPle_Info.getValDate()));
						pleInf.setValOrgType(pb_GuacctPle_Info.getValOrgType());
						pleInf.setPleCy(pb_GuacctPle_Info.getPleCy());
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
		
		if ("1".equals(pb_Guacct_Info.getGUACCTIMP_FLAG())) {
			List<Pb_GuacctImp_Info> Pb_GuacctImp_Info_List = pb_Guacct_Info.getPb_GuacctImp_Info_List();
			if (CheckUtilPlus.checkList(Pb_GuacctImp_Info_List)) {
				for (Pb_GuacctImp_Info pb_GuacctImp_Info : Pb_GuacctImp_Info_List) {
					if (CheckUtilPlus.checkStr(pb_GuacctImp_Info.getImpType())) {
						impInf = new ImpInf();
						impInf.setImpType(pb_GuacctImp_Info.getImpType());
						impInf.setImpVal(pb_GuacctImp_Info.getImpVal());
						impInf.setIppc(pb_GuacctImp_Info.getIppc());
						impInf.setPawnCertNum(pb_GuacctImp_Info.getPawnCertNum());
						impInf.setPawnCertType(pb_GuacctImp_Info.getPawnCertType());
						impInf.setPawnName(pb_GuacctImp_Info.getPawnName());
						impInf.setImpCy(pb_GuacctImp_Info.getImpCy());
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
		perDocument.setMotgaCltalCtrctInf(motgaCltalCtrctInf);
//		String reportXML = CreateXML.convertToXml(perMotgaCltalCtrctInfo) + "\r\n";
		return perDocument;
	}
}
