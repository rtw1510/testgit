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
 * �����ࡣ
 */
@Component("EnAcctInfDelProcessor")
@StepScope
public class EnAcctInfDelProcessor implements ItemProcessor<EnAcctInfDel, Object> {

	/** ���ɱ�����*/
	private String fileName;
	/** ���ɱ���·�� */
	private String filePath;
	/** �߳�����*/
	private String threadName;
	/** �߳�����*/
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
