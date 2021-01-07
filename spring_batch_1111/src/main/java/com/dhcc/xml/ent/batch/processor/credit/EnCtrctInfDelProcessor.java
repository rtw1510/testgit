package com.dhcc.xml.ent.batch.processor.credit;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.credit.EnCredit;
import com.dhcc.xml.ent.entity.credit.EnCtrctInfDel;
import com.dhcc.xml.util.CreateXML;

/**
 * �����ࡣ
 */
@Component("EnCtrctInfDelProcessor")
@StepScope
public class EnCtrctInfDelProcessor implements ItemProcessor<EnCtrctInfDel, Object> {

	/** ���ɱ�����*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** ���ɱ���·�� */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** �߳�����*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
	

    public Object process(EnCtrctInfDel enCtrctInfDel) throws Exception {
		EntDocument entDocument = new EntDocument();
		enCtrctInfDel.setDelStartDate(UpdateDate.updateDate(enCtrctInfDel.getDelStartDate()));
		enCtrctInfDel.setDelEndDate(UpdateDate.updateDate(enCtrctInfDel.getDelEndDate()));
		entDocument.setEnCtrctInfDel(enCtrctInfDel);
//    	String reportXML=CreateXML.convertToXml(enCredit) + "\r\n";
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
