package com.dhcc.xml.per.batch.processor.guarantee;

import com.dhcc.xml.per.entity.PerDocument;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.per.entity.guarantee.InSecAcctEntDel;
import com.dhcc.xml.per.entity.guarantee.PerGuarantee;
import com.dhcc.xml.util.CreateXML;

/**
 * 处理类。
 */
@Component("InSecAcctEntDelProcessor")
@StepScope
public class InSecAcctEntDelProcessor implements ItemProcessor<InSecAcctEntDel, Object> {
	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
	public Object process(InSecAcctEntDel inSecAcctEntDel) throws Exception {
		PerDocument perDocument = new PerDocument();
		perDocument.setInSecAcctEntDel(inSecAcctEntDel);
//		String reportXML = CreateXML.convertToXml(perGuarantee) + "\r\n";
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