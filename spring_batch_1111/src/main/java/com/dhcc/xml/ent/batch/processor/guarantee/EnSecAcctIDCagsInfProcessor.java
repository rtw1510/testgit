package com.dhcc.xml.ent.batch.processor.guarantee;

import com.dhcc.xml.ent.entity.EntDocument;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.guarantee.EnGuarantee;
import com.dhcc.xml.ent.entity.guarantee.EnSecAcctIDCagsInf;
import com.dhcc.xml.util.CreateXML;

/**
 * 处理类。
 */
@Component("EnSecAcctIDCagsInfProcessor")
@StepScope
public class EnSecAcctIDCagsInfProcessor implements ItemProcessor<EnSecAcctIDCagsInf, Object> {
	/** 生成报文名*/
	private String fileName;
	/** 生成报文路径 */
	private String filePath;
	/** 线程名称*/
	private String threadName;
    public Object process(EnSecAcctIDCagsInf enSecAcctIDCagsInf) throws Exception {
		EntDocument entDocument = new EntDocument();
		entDocument.setEnSecAcctIDCagsInf(enSecAcctIDCagsInf);
//    	String reportXML = CreateXML.convertToXml(enGuarantee) + "\r\n";
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