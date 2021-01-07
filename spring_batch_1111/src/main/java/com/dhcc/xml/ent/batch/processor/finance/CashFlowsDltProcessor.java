package com.dhcc.xml.ent.batch.processor.finance;

import com.dhcc.xml.ent.entity.EntDocument;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.finance.CashFlowsDlt;
import com.dhcc.xml.ent.entity.finance.EnFinance;
import com.dhcc.xml.util.CreateXML;

/**
 * �����ࡣ
 */
@Component("CashFlowsDltProcessor")
@StepScope
public class CashFlowsDltProcessor implements ItemProcessor<CashFlowsDlt, Object> {

	/** ���ɱ�����*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** ���ɱ���·�� */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** �߳�����*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
	public Object process(CashFlowsDlt cashFlowsDlt) throws Exception {
		EntDocument entDocument = new EntDocument();
		entDocument.setCashFlowsDlt(cashFlowsDlt);
//		String reportXML = CreateXML.convertToXml(enFinance) + "\r\n";
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