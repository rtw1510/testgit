package com.dhcc.xml.ent.batch.processor.finance;

import com.dhcc.xml.ent.entity.EntDocument;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.dhcc.xml.ent.entity.finance.BalanceSheetDlt;
import com.dhcc.xml.ent.entity.finance.EnFinance;
import com.dhcc.xml.util.CreateXML;

/**
 * Title: BalanceSheetDltProcessor<br/>
 * Description:企业资产负债表删除报文处理类<br/>
 * 
 * @author ChenJingYuan
 * @date 2018-7-24
 */
@Component("BalanceSheetDltProcessor")
@StepScope
public class BalanceSheetDltProcessor implements
        ItemProcessor<BalanceSheetDlt, Object> {

	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
	public Object process(BalanceSheetDlt balanceSheetDlt) throws Exception {
		EntDocument entDocument = new EntDocument();
		entDocument.setBalanceSheetDlt(balanceSheetDlt);
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