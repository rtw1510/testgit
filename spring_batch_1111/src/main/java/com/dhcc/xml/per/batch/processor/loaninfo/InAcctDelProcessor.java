package com.dhcc.xml.per.batch.processor.loaninfo;

import com.dhcc.xml.per.entity.PerDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import com.dhcc.xml.per.entity.loaninfo.InAcctDel;
import com.dhcc.xml.per.entity.loaninfo.PerLoanInfo;
import com.dhcc.xml.util.CreateXML;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 处理类。
 */
@Component("InAcctDelProcessor")
@StepScope
public class InAcctDelProcessor implements ItemProcessor<InAcctDel, Object> {
	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;

	public Object process(InAcctDel inAcctDel) throws Exception {
		PerDocument perDocument = new PerDocument();
		inAcctDel.setDelStartDate(UpdateDate.updateDate(inAcctDel.getDelStartDate()));
		inAcctDel.setDelEndDate(UpdateDate.updateDate(inAcctDel.getDelEndDate()));
		perDocument.setInAcctDel(inAcctDel);
//		String reportXML = CreateXML.convertToXml(perLoanInfo) + "\r\n";
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
