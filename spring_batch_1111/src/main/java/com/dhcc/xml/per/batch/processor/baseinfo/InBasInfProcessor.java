package com.dhcc.xml.per.batch.processor.baseinfo;

import com.dhcc.xml.per.entity.PerDocument;
import com.dhcc.xml.per.entity.baseinfo.*;
import com.dhcc.xml.per.entity.baseinfo.db.Pb_CustBaseOth_Info;
import com.dhcc.xml.per.entity.baseinfo.db.Pb_CustBase_Info;
import com.dhcc.xml.util.CheckUtilPlus;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component("InBasInfProcessor")
@StepScope
public class InBasInfProcessor implements ItemProcessor<Pb_CustBase_Info,Object> {
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
     * @param pb_CustBase_info
     *  数据库映射的对象
     */
    public Object process(Pb_CustBase_Info pb_CustBase_info) throws Exception {

//		System.out.println("=======================================PROCESS.START=========================================================");
        PerDocument perDocument;
        InBasInf inBasInf;
        /* 1、基础段 */
        BsSgmt bsSgmt;
        /* 2、其他标识段 */
        IDSgmt iDSgmt;
        List<IDRec> liIDRec;
        IDRec iDRec;
        /* 3、基本概况段 */
        FcsInfSgmt fcsInfSgmt;
        /* 4、婚姻信息段 */
        SpsInfSgmt spsInfSgmt;
        /* 5、教育信息段 [0..1] */
        EduInfSgmt eduInfSgmt;
        /* 6、职业信息段 [0..1] */
        OctpnInfSgmt octpnInfSgmt;
        /* 7、居住地址段 [0..1] */
        RedncInfSgmt redncInfSgmt;
        /* 8、通讯地址段 [0..1] */
        MlgInfSgmt mlgInfSgmt;
        /* 9、收入信息段 [0..1] */
        IncInfSgmt incInfSgmt;

        perDocument = new PerDocument();// 二代征信企业基本信息报文入口类
        inBasInf = new InBasInf();
        bsSgmt = new BsSgmt();
        iDSgmt = new IDSgmt();
        liIDRec = new ArrayList<IDRec>();
        fcsInfSgmt = new FcsInfSgmt();
        spsInfSgmt = new SpsInfSgmt();
        eduInfSgmt = new EduInfSgmt();
        octpnInfSgmt = new OctpnInfSgmt();
        redncInfSgmt = new RedncInfSgmt();
        mlgInfSgmt = new MlgInfSgmt();
        incInfSgmt = new IncInfSgmt();

        /* 1、基础段信息 */
        bsSgmt.setCimoc(pb_CustBase_info.getCimoc());
        bsSgmt.setCustomerType(pb_CustBase_info.getCustomerType());
        bsSgmt.setIDNum(pb_CustBase_info.getIDNum());
        bsSgmt.setIDType(pb_CustBase_info.getIDType());
        bsSgmt.setInfRecType(pb_CustBase_info.getInfRecType());
        bsSgmt.setInfSurcCode(pb_CustBase_info.getInfSurcCode());
        bsSgmt.setName(pb_CustBase_info.getName());
        bsSgmt.setRptDate(UpdateDate.updateDate(pb_CustBase_info.getRptDate()));
        bsSgmt.setRptDateCode(pb_CustBase_info.getRptDateCode());
        inBasInf.setBsSgmt(bsSgmt);

        /* 2、其他标识段 */
        if ("1".equals(pb_CustBase_info.getCUSTBASEOTH_FLAG())) {
            List<Pb_CustBaseOth_Info> Pb_CustBaseOth_Info_List = pb_CustBase_info.getPb_CustBaseOth_Info_List();
            if (CheckUtilPlus.checkList(Pb_CustBaseOth_Info_List)) {
                for (Pb_CustBaseOth_Info pb_CustBaseOth_Info : Pb_CustBaseOth_Info_List) {
                    if(CheckUtilPlus.checkStr(pb_CustBaseOth_Info.getOthIDNum())){
                        iDRec = new IDRec();
                        iDRec.setAlias(pb_CustBaseOth_Info.getAlias());
                        iDRec.setOthIDNum(pb_CustBaseOth_Info.getOthIDNum());
                        iDRec.setOthIDType(pb_CustBaseOth_Info.getOthIDType());
                        liIDRec.add(iDRec);
                    }
                }
                if(CheckUtilPlus.checkList(liIDRec)){
                    iDSgmt.setIDNm(liIDRec.size() + "");
                    iDSgmt.setIDRec(liIDRec);
                    iDSgmt.setIDInfoUpDate(UpdateDate.updateDate(pb_CustBase_info.getRptDate()));
                    inBasInf.setIDSgmt(iDSgmt);
                }
            }
        }

        /* 3、基本概况段 */
        if("1".equals(pb_CustBase_info.getCUSTBASEINF_FLAG())&&CheckUtilPlus.checkStr(pb_CustBase_info.getSex())){
            fcsInfSgmt.setCellPhone(pb_CustBase_info.getCellPhone());
            fcsInfSgmt.setDOB(UpdateDate.updateDate(pb_CustBase_info.getDOB()));
            fcsInfSgmt.setEmail(pb_CustBase_info.getEmail());
            fcsInfSgmt.setFcsInfoUpDate(UpdateDate.updateDate(pb_CustBase_info.getFcsInfoUpDate()));
            fcsInfSgmt.setHhDist(pb_CustBase_info.getHhDist());
            fcsInfSgmt.setHouseAdd(pb_CustBase_info.getHouseAdd());
            fcsInfSgmt.setNation(pb_CustBase_info.getNation());
            fcsInfSgmt.setSex(pb_CustBase_info.getSex());
            inBasInf.setFcsInfSgmt(fcsInfSgmt);
        }

        /* 4、婚姻信息段 */
        if("1".equals(pb_CustBase_info.getCUSTBASEMARI_FLAG())&&CheckUtilPlus.checkStr(pb_CustBase_info.getMariStatus())){
            spsInfSgmt.setMariStatus(pb_CustBase_info.getMariStatus());
            if(JudgeMariStatus(pb_CustBase_info.getMariStatus())){
                spsInfSgmt.setSpoIDNum(pb_CustBase_info.getSpoIDNum());
                spsInfSgmt.setSpoIDType(pb_CustBase_info.getSpoIDType());
                spsInfSgmt.setSpoName(pb_CustBase_info.getSpoName());
                spsInfSgmt.setSpoTel(pb_CustBase_info.getSpoTel());
                spsInfSgmt.setSpsCmpyNm(pb_CustBase_info.getSpsCmpyNm());
            }
            spsInfSgmt.setSpsInfoUpDate(UpdateDate.updateDate(pb_CustBase_info.getSpsInfoUpDate()));
            inBasInf.setSpsInfSgmt(spsInfSgmt);
        }

        /* 5、教育信息段 */
        if("1".equals(pb_CustBase_info.getCUSTBASEEDU_FLAG())&&CheckUtilPlus.checkStr(pb_CustBase_info.getEduLevel())){
            eduInfSgmt.setAcaDegree(pb_CustBase_info.getAcaDegree());
            eduInfSgmt.setEduInfoUpDate(UpdateDate.updateDate(pb_CustBase_info.getEduInfoUpDate()));
            eduInfSgmt.setEduLevel(pb_CustBase_info.getEduLevel());
            inBasInf.setEduInfSgmt(eduInfSgmt);
        }

        /* 6、职业信息段  */
        if("1".equals(pb_CustBase_info.getCUSTBASEJOB_FLAG())&&CheckUtilPlus.checkStr(pb_CustBase_info.getEmpStatus())){
            octpnInfSgmt.setEmpStatus(pb_CustBase_info.getEmpStatus());
            if(JudgeEmpStatus(pb_CustBase_info.getEmpStatus())){
                octpnInfSgmt.setCpnAddr(pb_CustBase_info.getCpnAddr());
                octpnInfSgmt.setCpnDist(pb_CustBase_info.getCpnDist());
                octpnInfSgmt.setCpnName(pb_CustBase_info.getCpnName());
                octpnInfSgmt.setCpnPc(pb_CustBase_info.getCpnPc());
                octpnInfSgmt.setCpnTEL(pb_CustBase_info.getCpnTEL());
                octpnInfSgmt.setCpnType(pb_CustBase_info.getCpnType());
                octpnInfSgmt.setIndustry(pb_CustBase_info.getIndustry());
                octpnInfSgmt.setOccupation(pb_CustBase_info.getOccupation());
                octpnInfSgmt.setTechTitle(pb_CustBase_info.getTechTitle());
                octpnInfSgmt.setTitle(pb_CustBase_info.getTitle());
                octpnInfSgmt.setWorkStartDate(pb_CustBase_info.getWorkStartDate());
            }
            octpnInfSgmt.setOctpnInfoUpDate(UpdateDate.updateDate(pb_CustBase_info.getOctpnInfoUpDate()));
            inBasInf.setOctpnInfSgmt(octpnInfSgmt);
        }

        /* 7、居住地址段  */
        if("1".equals(pb_CustBase_info.getCUSTBASEADD_FLAG())&&CheckUtilPlus.checkStr(pb_CustBase_info.getResiStatus())){
            redncInfSgmt.setHomeTel(pb_CustBase_info.getHomeTel());
            redncInfSgmt.setResiAddr(pb_CustBase_info.getResiAddr());
            redncInfSgmt.setResiDist(pb_CustBase_info.getResiDist());
            redncInfSgmt.setResiInfoUpDate(UpdateDate.updateDate(pb_CustBase_info.getResiInfoUpDate()));
            redncInfSgmt.setResiPc(pb_CustBase_info.getResiPc());
            redncInfSgmt.setResiStatus(pb_CustBase_info.getResiStatus());
            inBasInf.setRedncInfSgmt(redncInfSgmt);
        }

        /* 8、通讯地址段  */
        if("1".equals(pb_CustBase_info.getCUSTBASETEL_FLAG())&&CheckUtilPlus.checkStr(pb_CustBase_info.getMailAddr())){
            mlgInfSgmt.setMailAddr(pb_CustBase_info.getMailAddr());
            mlgInfSgmt.setMailDist(pb_CustBase_info.getMailDist());
            mlgInfSgmt.setMailPc(pb_CustBase_info.getMailPc());
            mlgInfSgmt.setMlgInfoUpDate(UpdateDate.updateDate(pb_CustBase_info.getMlgInfoUpDate()));
            inBasInf.setMlgInfSgmt(mlgInfSgmt);
        }

        /* 9、收入信息段  */
        if("1".equals(pb_CustBase_info.getCUSTBASEMONEY_FLAG())&&CheckUtilPlus.checkStr(pb_CustBase_info.getAnnlInc())){
            incInfSgmt.setAnnlInc(pb_CustBase_info.getAnnlInc());
            incInfSgmt.setIncInfoUpDate(UpdateDate.updateDate(pb_CustBase_info.getIncInfoUpDate()));
            incInfSgmt.setTaxIncome(pb_CustBase_info.getTaxIncome());
            inBasInf.setIncInfSgmt(incInfSgmt);
        }

        perDocument.setInBasInf(inBasInf);
//		String reportXML = CreateXML.convertToXml(perBaseInfo)+"\r\n";//对象转化为XML
//		System.out.println("=======================================PROCESS.END=========================================================");
        return perDocument;
    }


    public InBasInfProcessor() {
        super();
    }

    public Boolean JudgeMariStatus(String MariStatus){//“20-已婚”、“21-初婚”、“22-再婚”、“23-复婚”
        Boolean rs = false;

        if("20".equals(MariStatus)){
            rs = true;
        }else if("21".equals(MariStatus)){
            rs = true;
        }else if("22".equals(MariStatus)){
            rs = true;
        }else if("23".equals(MariStatus)){
            rs = true;
        }

        return rs;
    }

    public Boolean JudgeEmpStatus(String EmpStatus){//11-国家公务员”、“13-专业技术人员”、“17-职员”、“21-企业管理人员”、“24-工人”、“37-现役军人”或“91
        Boolean rs = false;

        if("11".equals(EmpStatus)){
            rs = true;
        }else if("13".equals(EmpStatus)){
            rs = true;
        }else if("17".equals(EmpStatus)){
            rs = true;
        }else if("21".equals(EmpStatus)){
            rs = true;
        }else if("24".equals(EmpStatus)){
            rs = true;
        }else if("37".equals(EmpStatus)){
            rs = true;
        }else if("91".equals(EmpStatus)){
            rs = true;
        }
        return rs;
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
