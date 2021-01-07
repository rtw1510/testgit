package com.dhcc.xml.ent.batch.processor.baseinfo;

import com.dhcc.xml.ent.entity.EntDocument;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dhcc.xml.ent.entity.baseinfo.EnBaseInfo;
import com.dhcc.xml.ent.entity.baseinfo.EnBsInfDlt;
import com.dhcc.xml.util.CreateXML;

/**
 * Title: EnBsInfDltProcessor<br/>
 * Description: 企业基本信息删除报文处理<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-7-24
 */
@Component("EnBsInfDltProcessor")
@StepScope
public class EnBsInfDltProcessor implements ItemProcessor<EnBsInfDlt, Object> {
	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;

	public Object process(EnBsInfDlt enBsInfDlt) throws Exception {
		EntDocument entDocument = new EntDocument();
		entDocument.setEnBsInfDlt(enBsInfDlt);
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