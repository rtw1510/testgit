package com.dhcc.xml.ent.batch.processor.credit;

import com.dhcc.xml.ent.entity.EntDocument;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.credit.EnCredit;
import com.dhcc.xml.ent.entity.credit.EnCtrctInfEntDel;
import com.dhcc.xml.util.CreateXML;

/**
 * 处理类。
 */
@Component("EnCtrctInfEntDelProcessor")
@StepScope
public class EnCtrctInfEntDelProcessor implements ItemProcessor<EnCtrctInfEntDel, Object> {

	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;

	public Object process(EnCtrctInfEntDel enCtrctInfEntDel) throws Exception {
		EntDocument entDocument = new EntDocument();
		entDocument.setEnCtrctInfEntDel(enCtrctInfEntDel);
//		String reportXML = CreateXML.convertToXml(enCredit) + "\r\n";
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