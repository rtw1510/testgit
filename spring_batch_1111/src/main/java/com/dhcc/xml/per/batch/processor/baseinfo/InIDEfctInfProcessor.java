package com.dhcc.xml.per.batch.processor.baseinfo;

import com.dhcc.xml.per.entity.PerDocument;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import com.dhcc.xml.per.entity.baseinfo.InIDEfctInf;
import com.dhcc.xml.per.entity.baseinfo.PerBaseInfo;
import com.dhcc.xml.util.CreateXML;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//@Component("InIDEfctInfProcessor")

/**
  * Title: InIDEfctInfProcessor<br/>  
  * Description: 个人证件有效期信息记录-130<br/>  
  * @author ChenJingYuan  
  * @date 2020-4-26  
  */
@Component("InIDEfctInfProcessor")
@StepScope
public class InIDEfctInfProcessor implements ItemProcessor<InIDEfctInf, Object> {
	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;

	public Object process(InIDEfctInf inIDEfctInf) throws Exception {
		PerDocument perDocument = new PerDocument();
		inIDEfctInf.setIDEfctDate(UpdateDate.updateDate(inIDEfctInf.getIDEfctDate()));
		inIDEfctInf.setIDDueDate(UpdateDate.updateDate(inIDEfctInf.getIDDueDate()));
		inIDEfctInf.setRptDate(UpdateDate.updateDate(inIDEfctInf.getRptDate()));
		perDocument.setInIDEfctInf(inIDEfctInf);
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
