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
 * �����ࡣ
 */
@Component("InAcctDelProcessor")
@StepScope
public class InAcctDelProcessor implements ItemProcessor<InAcctDel, Object> {
	/** ���ɱ�����*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** ���ɱ���·�� */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** �߳�����*/
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
