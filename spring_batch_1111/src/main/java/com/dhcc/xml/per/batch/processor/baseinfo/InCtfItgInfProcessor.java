package com.dhcc.xml.per.batch.processor.baseinfo;

import com.dhcc.xml.per.entity.PerDocument;
import com.dhcc.xml.per.entity.baseinfo.InCtfItgInf;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**  
 * Title: InCtfItgInfProcessor<br/>  
 * Description:����֤��������Ϣ��¼-140<br/>  
 * @author ChenJingYuan  
 * @date 2020-4-26  
 */  
@Component("InCtfItgInfProcessor")
@StepScope
public class InCtfItgInfProcessor implements ItemProcessor<InCtfItgInf, Object> {
	/** ���ɱ�����*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** ���ɱ���·�� */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** �߳�����*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;

	public Object process(InCtfItgInf inCtfItgInf) throws Exception {
		PerDocument perDocument = new PerDocument();
		inCtfItgInf.setRptDate(UpdateDate.updateDate(inCtfItgInf.getRptDate()));
		perDocument.setInCtfItgInf(inCtfItgInf);
//		String reportXML = CreateXML.convertToXml(perBaseInfo) + "\r\n";
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
