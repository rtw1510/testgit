package com.dhcc.xml.ent.batch.processor.baseinfo;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.baseinfo.EnBaseInfo;
import com.dhcc.xml.ent.entity.baseinfo.EnIcdnRltpInf;
import com.dhcc.xml.util.CreateXML;

/**
 * Title: EnIcdnRltpInfProcessor<br/>
 * Description:企业间关联关系信息处理<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-7-24
 */
@Component("EnIcdnRltpInfProcessor")
@StepScope
public class EnIcdnRltpInfProcessor implements ItemProcessor<EnIcdnRltpInf, Object> {
	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
	
	public Object process(EnIcdnRltpInf enIcdnRltpInf) throws Exception {
		EntDocument entDocument = new EntDocument();
		enIcdnRltpInf.setRptDate(UpdateDate.updateDate(enIcdnRltpInf.getRptDate()));
		if("30".equals(enIcdnRltpInf.getEntCertType())) {
			enIcdnRltpInf.setEntCertNum(enIcdnRltpInf.getEntCertNum() == null ? enIcdnRltpInf.getEntCertNum() :
					enIcdnRltpInf.getEntCertNum().replace("-",""));
		}
		if("30".equals(enIcdnRltpInf.getAssoEntCertType())) {
			enIcdnRltpInf.setAssoEntCertNum(enIcdnRltpInf.getAssoEntCertNum() == null ? enIcdnRltpInf.getAssoEntCertNum() :
					enIcdnRltpInf.getAssoEntCertNum().replace("-",""));
		}
		entDocument.setEnIcdnRltpInf(enIcdnRltpInf);
//		String reportXML=CreateXML.convertToXml(enBaseInfo) + "\r\n";
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
