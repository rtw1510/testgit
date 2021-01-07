package com.dhcc.xml.ent.batch.processor.loaninfo;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.loaninfo.EnAcctInfDel;
import com.dhcc.xml.ent.entity.loaninfo.EnLoanInfo;
import com.dhcc.xml.util.CreateXML;

/**
 * 处理类。
 */
@Component("EnAcctInfDelProcessor")
@StepScope
public class EnAcctInfDelProcessor implements ItemProcessor<EnAcctInfDel, Object> {

	/** 生成报文名*/
	private String fileName;
	/** 生成报文路径 */
	private String filePath;
	/** 线程名称*/
	private String threadName;
	/** 线程名称*/
    public Object process(EnAcctInfDel enAcctInfDel) throws Exception {
		EntDocument entDocument = new EntDocument();
    	enAcctInfDel.setDelStartDate(UpdateDate.updateDate(enAcctInfDel.getDelStartDate()));
    	enAcctInfDel.setDelEndDate(UpdateDate.updateDate(enAcctInfDel.getDelEndDate()));
		entDocument.setEnAcctInfDel(enAcctInfDel);
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
