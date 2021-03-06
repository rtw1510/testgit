package com.dhcc.xml.ent.batch.processor.loaninfo;

import com.dhcc.xml.ent.entity.EntDocument;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.loaninfo.EnAcctInfIDCagsInf;
import com.dhcc.xml.ent.entity.loaninfo.EnLoanInfo;
import com.dhcc.xml.util.CreateXML;

/**
 * 处理类。
 */
@Component("EnAcctInfIDCagsInfProcessor")
@StepScope
public class EnAcctInfIDCagsInfProcessor implements ItemProcessor<EnAcctInfIDCagsInf, Object> {

    /**
     * 内容处理。
     * 
     */
	/** 生成报文名*/
	private String fileName;
	/** 生成报文路径 */
	private String filePath;
	/** 线程名称*/
	private String threadName;
    public Object process(EnAcctInfIDCagsInf enAcctInfIDCagsInf) throws Exception {
		EntDocument entDocument = new EntDocument();
		entDocument.setEnAcctInfIDCagsInf(enAcctInfIDCagsInf);
//    	String reportXML = CreateXML.convertToXml(enLoanInfo) + "\r\n";
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