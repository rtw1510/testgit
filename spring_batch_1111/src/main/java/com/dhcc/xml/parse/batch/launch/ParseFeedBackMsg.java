package com.dhcc.xml.parse.batch.launch;


import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ParseFeedBackMsg {
	@Autowired
	private JobLauncher jobLauncher;
	/**  
	 * Title: ParseFeedBackMsgLaunch<br\>  
	 * Description: <br\>  
	 * @param filePath 文件路径
	 * @param fileName 文件名称
	 * @param infRecType 信息记录类型
	 * @param fileType 报文类型：1-个人；2-企业
	 */  
	public void ParseFeedBackMsgLaunch(String filePath,String fileName,String infRecType,String fileType) {
		/*ApplicationContext context = SourceTemplate.getContext();
		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("parseFeedBackJob");*/
		/*String fileFullPath = filePath+fileName;//文件的绝对路径
			try {
				JobExecution run = jobLauncher.run(job,new JobParametersBuilder()
								.addString("fileFullPath",fileFullPath)
								.addString("filePath",filePath)
								.addString("fileName",fileName)
								.addString("infRecType",infRecType)
								.addString("fileType",fileType)
								.addString("random",new Random()+"")
								.toJobParameters());
				System.out.println(run.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}*/
		}
}
