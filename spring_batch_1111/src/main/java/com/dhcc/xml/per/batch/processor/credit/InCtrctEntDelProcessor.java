package com.dhcc.xml.per.batch.processor.credit;

import com.dhcc.xml.per.entity.PerDocument;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;

import com.dhcc.xml.per.entity.credit.InCtrctEntDel;
import com.dhcc.xml.per.entity.credit.PerCredit;
import com.dhcc.xml.util.CreateXML;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 处理类。
 */
@Component("InCtrctEntDelProcessor")
@StepScope
public class InCtrctEntDelProcessor implements ItemProcessor<InCtrctEntDel, Object> {

	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;

	public Object process(InCtrctEntDel inCtrctEntDel) throws Exception {
		PerDocument perDocument = new PerDocument();
		perDocument.setInCtrctEntDel(inCtrctEntDel);
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