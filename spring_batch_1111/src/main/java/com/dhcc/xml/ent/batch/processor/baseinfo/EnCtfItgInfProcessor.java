package com.dhcc.xml.ent.batch.processor.baseinfo;

import com.dhcc.xml.ent.entity.EntDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;

import com.dhcc.xml.ent.entity.baseinfo.EnCtfItgInf;
import com.dhcc.xml.util.CreateXML;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Title: EnCtfItgInfProcessor<br/>
 * Description:��ҵ��ݱ�ʶ������Ϣ����<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-7-24
 */
@Component("EnCtfItgInfProcessor")
@StepScope
public class EnCtfItgInfProcessor implements ItemProcessor<EnCtfItgInf, Object> {
	/** ���ɱ�����*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** ���ɱ���·�� */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** �߳�����*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
	
	public Object process(EnCtfItgInf enCtfItgInf) throws Exception {
		EntDocument entDocument = new EntDocument();
		enCtfItgInf.setRptDate(UpdateDate.updateDate(enCtfItgInf.getRptDate()));
		entDocument.setEnCtfItgInf(enCtfItgInf);
//		String reportXML=CreateXML.convertToXml(enBaseInfo) + "\r\n";
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
