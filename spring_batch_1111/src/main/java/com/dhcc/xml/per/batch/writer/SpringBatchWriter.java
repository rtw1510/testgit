package com.dhcc.xml.per.batch.writer;


import com.dhcc.xml.per.entity.PerDocument;
import com.dhcc.xml.per.entity.PerDocumentList;
import com.dhcc.xml.util.CreateXML;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
@StepScope
public class SpringBatchWriter implements ItemWriter<Object> {
	/** 生成报文名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/** 生成报文路径 */
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/** 线程名称*/
	@Value("#{stepExecutionContext[threadName]}")
	private String threadName;
	//private String type="1";
	@Value("#{jobParameters['type']}")
	private String type;
	public void write(List<?> items) throws Exception {
		if ("1".equals(type)) {//1、报文生成
			//多表查询写操作在processor中写报文文件，单表查询的写操作在write中写报文
			if (items != null && items.get(0) != null) {
				PerDocumentList perDocumentList = new PerDocumentList();
				List<PerDocument> objects = (List<PerDocument>) items;
				perDocumentList.setDocument(objects);
				//根据线程名称设定临时文件的命名
				String count = threadName.substring(threadName.indexOf(":") + 1, threadName.length());
//				StringBuffer strbuf = new StringBuffer();
//				for(int i=0;i<items.size();i++){
//					String reportXML = CreateXML.convertToXml(items.get(i))+"\r\n";//对象转化为XML
//					strbuf.append(reportXML);
//				}
				//System.err.println(perDocumentList);
				String reportXML = CreateXML.convertToXml(perDocumentList);//对象转化为XML
				//System.err.println(reportXML);
				reportXML = reportXML.substring(3, reportXML.length() - 4).replace("</Document>", "</Document>\r\n");
				CreateXML.writeReport("d:\\test\\", fileName + "-" + count + ".txt", reportXML);

				//CreateXML.writeReport(filePath,fileName+"-"+count+".txt", reportXML);
			}
		}
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}

