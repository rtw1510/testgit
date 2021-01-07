package com.dhcc.client.collt.service.impl;


import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.pbccrc.archive.collect.messagetools.validators.IValidator;
import org.pbccrc.archive.collect.messagetools.validators.ValidatorContext;
import org.pbccrc.archive.collect.messagetools.validators.utils.DynClassPackagePosition;
import org.pbccrc.archive.collect.messagetools.validators.utils.ValidatorClassLoader;
import org.pbccrc.archive.collect.nature.messagetools.ValidatorFactory;
import org.pbccrc.archive.feedback.Feedback;
import org.pbccrc.collectclient.api.reportfile.CcConstants;
import org.pbccrc.collectclient.api.reportfile.Loader;
import org.pbccrc.collectclient.api.reportfile.VldContextUtil;
import org.pbccrc.collectclient.api.reportfile.validator.BaseValidator;
import org.pbccrc.collectclient.preprocess.FileProcComponent;
import org.pbccrc.collectclient.preprocess.GzipProcResult;
import org.pbccrc.collectclient.preprocess.Sm4ProcResult;

import com.dhcc.client.collt.service.ValidateCollectService;
import com.dhcc.client.collt.entity.EncodeResults;
import com.dhcc.client.collt.entity.VerifyResults;
import com.dhcc.xml.per.entity.baseinfo.InBasInf;
import com.dhcc.xml.per.entity.baseinfo.BsSgmt;

import com.dhcc.xml.validation.ValidateCollectUtils;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtMethod;
import javassist.CtNewMethod;
import javassist.LoaderClassPath;
import javassist.NotFoundException;

/**  
  * Title: ValidateCollectBoImpl<br/>  
  * Description:人行校验方法功能实现类<br/>  
  * @author ChenJingYuan  
  * @date 2019-2-20  
  */  
public class ValidateCollectServiceImpl extends UnicastRemoteObject implements ValidateCollectService {

	private static final long serialVersionUID = 1L;

	public ValidateCollectServiceImpl() throws RemoteException {
		super();
	}

	public VerifyResults Verify(String feedbackDir, String filename) throws RemoteException {
		VerifyResults collectResults = new VerifyResults();
		long begintime = System.currentTimeMillis();
		/**1、定义需要校验的文件和反馈文件的路径*/
		// 定义待进行格式校验处理的文件对象 
		File txtFile = new File(filename); 
		// 定义记录错误信息的文件对象 
		/**2、校验开始
		// 调用处理组件实例的加压解压方法进行加压处理 
		VerifyResult verifyResult = FileProcComponent.verifyFile(txtFile, BizType.COLLECT, feedbackDir); 
		//得到进行格式校验的数据上报文件名称 
		String vFilename = verifyResult.getFileName(); 
		//得到处理状态 
		String vStatus = verifyResult.getStatus(); 
		//得到文件记录数 
		Integer vTotalCount = verifyResult.getTotalCount(); 
		//得到通过格式校验的记录数 
		Integer vRightCount = verifyResult.getRightCount(); 
		//得到出错记录数 
		Integer vWrongCount = verifyResult.getWrongCount(); 
		//得到数据反馈文件存储路径 
		String fbFileSavePath = verifyResult.getFeedbackFilePath(); 
		System.out.println("格式化校验的文件名："+vFilename);
		System.out.println("格式化校验处理状态："+vStatus);
		System.out.println("格式化校验总记录数："+vTotalCount);
		System.out.println("格式化校验正确记录数："+vRightCount);
		System.out.println("格式化校验错误记录数："+vWrongCount);
		System.out.println("反馈文件路径："+fbFileSavePath);
		collectResults.setVerifyFileName(vFilename);
		collectResults.setVerifyStatus(vStatus);
		collectResults.setVerifyTotalCount(vTotalCount);
		collectResults.setVerifyRightCount(vRightCount);
		collectResults.setVerifyWrongCount(vWrongCount);
		collectResults.setVerifyFeedbackFilePath(fbFileSavePath);
		*/
		/**3、文件加压开始*/
		//得到进行加压处理的文件名称
		String gzipFilename = "";
		//得到加压处理状态
		String gzipStatus="";
		//得到加压处理错误原因
		String gzipErrorMsg = "";
		//得到加压处理后生成的压缩文件存储路径
		String gzipFilePath = "";
		
//		if("SUCCESS".equals(vStatus)&&(vTotalCount==vRightCount)){
			// 调用处理组件实例的加压解压方法进行加压处理
			GzipProcResult gzipProcResult = FileProcComponent.gzip(txtFile,FileProcComponent.COMPRESS, feedbackDir);
			gzipFilename = gzipProcResult.getFileName();
			gzipStatus = gzipProcResult.getStatus();
			gzipErrorMsg = gzipProcResult.getErrorMsg();
			gzipFilePath = gzipProcResult.getFilePath();
			
			System.out.println("加压处理的文件名称："+gzipFilename);
			System.out.println("加压处理状态："+gzipStatus);
			System.out.println("加压错误原因："+gzipErrorMsg);
			System.out.println("加压后文件的存储路径："+gzipFilePath);
			
			collectResults.setGzipFileName(gzipFilename);
			collectResults.setGzipStatus(gzipStatus);
			collectResults.setGzipFilePath(gzipFilePath);
			collectResults.setGzipErrorMsg(gzipErrorMsg);
//		}
		//得到进行加密处理的文件名称
		String sm4EncFilename = "";
		//得到加密处理状态
		String sm4EncStatus = "";
		//得到加密处理错误原因
		String sm4EncErrorMsg = "";
		//得到加密处理后生成的 enc 文件存储路径
		String sm4EncFilePath = "";
		if("SUCCESS".equals(gzipStatus)&&gzipErrorMsg==null){
			File zipFile = new File(gzipFilePath);
			// 调用处理组件实例的加密解密方法进行加密处理
			Sm4ProcResult sm4ProcResult = FileProcComponent.sm4(zipFile,FileProcComponent.ENCRYPT,feedbackDir);
			sm4EncFilename = sm4ProcResult.getFileName();
			sm4EncStatus = sm4ProcResult.getStatus();
			sm4EncErrorMsg = sm4ProcResult.getErrorMsg();
			sm4EncFilePath = sm4ProcResult.getFilePath();
			
			System.out.println("加密处理的文件名称" + sm4EncFilename);
			System.out.println("加密处理状态" + sm4EncStatus);
			System.out.println("加密处理错误原因" + sm4EncErrorMsg);
			System.out.println("加密处理后生成的 enc 文件存储路径" + sm4EncFilePath);
			
			collectResults.setSm4EncFlename(sm4EncFilename);
			collectResults.setSm4EncStatus(sm4EncStatus);
			collectResults.setSm4EncErrorMsg(sm4EncErrorMsg);
			collectResults.setSm4EncFilePath(sm4EncFilePath);
		}
		//运算代码
		long endtinme=System.currentTimeMillis();
		long costTime = (endtinme - begintime);
		System.out.println("第一次校验处理运行时间：" + costTime);
		return collectResults;
	}


	public EncodeResults Encode(String feedbackDir, String filename) throws RemoteException {
		EncodeResults encodeResults = new EncodeResults();
		// 1.对数据反馈文件进行解密处理
		// 定义待解密的文件对象
		File encFile = new File(filename);
		// 定义解密后的文件存储目录
		String zipFileSaveDir= feedbackDir;
		// 调用处理组件实例的加密解密方法进行解密处理
		Sm4ProcResult sm4Result = FileProcComponent.sm4(encFile,
		FileProcComponent.DECRYPT, zipFileSaveDir);
		//得到进行解密处理的文件名称
		String sm4Filename = sm4Result.getFileName();
		//得到解密处理状态
		String sm4Status = sm4Result.getStatus();
		//得到解密处理错误原因
		String sm4ErrorMsg = sm4Result.getErrorMsg();
		//得到解密处理后生成的压缩文件存储路径
		String sm4ZipFilePath = sm4Result.getFilePath();
		System.out.println("解密处理的文件名称:"+sm4Filename);
		System.out.println("解密处理状态:"+sm4Status);
		System.out.println("解密处理错误原因:"+sm4ErrorMsg);
		System.out.println("解密处理后生成的压缩文件存储路径:"+sm4ZipFilePath);
		encodeResults.setSm4Filename(sm4Filename);
		encodeResults.setSm4Status(sm4Status);
		encodeResults.setSm4ErrorMsg(sm4ErrorMsg);
		encodeResults.setSm4ZipFilePath(sm4ZipFilePath);
		// 2.对解密后生成的压缩文件进行解压处理
		//得到进行解压处理的文件名称
		String zipFilename="";
		//得到解压处理状态
		String zipStatus = "";
		//得到解压处理错误原因
		String zipErrorMsg = "";
		//得到解压处理后生成的压缩文件存储路径
		String zipTxtFilePath = "";
		if("SUCCESS".equals(sm4Status)&&sm4ErrorMsg==null){
			// 定义待解压的文件对象
			File zipFile = new File(sm4ZipFilePath);
			// 定义解压后的文件存储目录
			String txtFileSaveDir= zipFileSaveDir; 
			// 调用处理组件实例的加压解压方法进行解压处理
			GzipProcResult result = FileProcComponent.gzip(zipFile,
			FileProcComponent.DECOMPRESS, txtFileSaveDir);
			zipFilename = result.getFileName();
			zipStatus = result.getStatus();
			zipErrorMsg = result.getErrorMsg();
			zipTxtFilePath = result.getFilePath();
			System.out.println("解压处理的文件名称:"+zipFilename);
			System.out.println("解压处理状态:"+zipStatus);
			System.out.println("解压处理错误原因:"+zipErrorMsg);
			System.out.println("解压处理后生成的压缩文件存储路径:"+zipTxtFilePath);
			encodeResults.setZipFilename(zipFilename);
			encodeResults.setZipStatus(zipStatus);
			encodeResults.setZipErrorMsg(zipErrorMsg);
			encodeResults.setZipTxtFilePath(zipTxtFilePath);
		}
		return encodeResults;
	}
	/**  
	 * Title: main<br\>  
	 * Description:功能测试函数 <br\>  
	 */  
	public static void main(String[] args) throws Exception {
//		ValidateCollectBoImpl validateCollectBoImpl = new ValidateCollectBoImpl();
//		VerifyResults verifyResults = validateCollectBoImpl.Verify("E://file//dest//", "E://file//G10128210H03112019020121400030.txt");
//		EncodeResults encodeResults = validateCollectBoImpl.Encode("D:\\home\\dhcc\\error","D:\\home\\dhcc\\error\\J10157910H00012020071021000013.enc");
//		System.out.println(verifyResults.toString());
//		System.out.println(encodeResults.toString());
		
//		File sourceFile=new File("D://home//dhcc//G10128210H03112020072011000040.txt");
//		DefaultReportFileProcess1 process = new DefaultReportFileProcess1(null);
//	    ReportFileValidateResult resultV = process.validate(sourceFile.getParent(), sourceFile, 0, "D://home//dhcc//");	
		int a=1;
		
		if(a==1){
			//初始化人行jar缓存
			try {
				Loader.loadCache(null);
			} catch (IOException e3) {
				e3.printStackTrace();
			}
			Loader.loadValidator(null);
			
//			BaseValidator validator110 = ValidateCollectUtils.getBaseValidator(110);
			ValidatorContext vldContext = null;
			String versionCode = "2.0.0";
			long cltFileTypeId = 0L;
			Map<Long, Long> recordTypeMap = CcConstants.getRecordTypeMapper();
			cltFileTypeId = ((Long)recordTypeMap.get(Long.valueOf(110))).longValue();
		    vldContext = VldContextUtil.genContext(cltFileTypeId, versionCode);
		    vldContext.addAttribute("FILE_CREATE_DATE", new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()));//文件创建时间
		    vldContext.addAttribute("FINAN_CODE", "G10128210H0311");//人行分配金融机构代码
		    vldContext.addAttribute("REC_TYPE", 110+"");//信息记录类型
		    vldContext.addAttribute("FINAN_ID_ROOT", "1");
		    vldContext.addAttribute("FINAN_ID", "1");
//			int lineCnt=1;//
//			String lineContent="<Document><InBasInf><BsSgmt><InfRecType>110</InfRecType><InfSurcCode>G10138316H0077837001</InfSurcCode><Name>韩*辉</Name><IDType>10</IDType><IDNum>370829199209081712</IDNum><RptDate>2019-01-15</RptDate><RptDateCode>20</RptDateCode><Cimoc>NH123456789012</Cimoc><CustomerType>11</CustomerType></BsSgmt><IDSgmt><IDNm>1</IDNm><IDRec><Alias>韩*辉</Alias><OthIDType>2</OthIDType><OthIDNum>551323949131319497</OthIDNum></IDRec><IDInfoUpDate>2019-01-15</IDInfoUpDate></IDSgmt><FcsInfSgmt><Sex>0</Sex><DOB>1980-12-21</DOB><Nation>CHN</Nation><HouseAdd>广东省深圳市崇明大街33号</HouseAdd><HhDist>513534</HhDist><CellPhone>13902607663</CellPhone><Email>34525488@163.com</Email><FcsInfoUpDate>2019-01-15</FcsInfoUpDate></FcsInfSgmt><SpsInfSgmt><MariStatus>21</MariStatus><SpoName>钟小建</SpoName><SpoIDType>1</SpoIDType><SpoIDNum>511204197601152616</SpoIDNum><SpoTel>13281907832</SpoTel><SpsCmpyNm>广东省深圳市崇明大街33号</SpsCmpyNm><SpsInfoUpDate>2019-01-15</SpsInfoUpDate></SpsInfSgmt><EduInfSgmt><EduLevel>40</EduLevel><AcaDegree>5</AcaDegree><EduInfoUpDate>2019-01-15</EduInfoUpDate></EduInfSgmt><OctpnInfSgmt><EmpStatus>11</EmpStatus><CpnName>永红副食店</CpnName><CpnType>40</CpnType><Industry>H</Industry><CpnAddr>广东省深圳市崇明大街33号</CpnAddr><CpnPc>382544</CpnPc><CpnDist>234111</CpnDist><CpnTEL>0534-354215</CpnTEL><Occupation>6</Occupation><Title>2</Title><TechTitle>1</TechTitle><WorkStartDate>2016</WorkStartDate><OctpnInfoUpDate>2019-01-15</OctpnInfoUpDate></OctpnInfSgmt><RedncInfSgmt><ResiStatus>1</ResiStatus><ResiAddr>广东省深圳市崇明大街33号</ResiAddr><ResiPc>254355</ResiPc><ResiDist>274200</ResiDist><HomeTel>15865849952</HomeTel><ResiInfoUpDate>2019-01-15</ResiInfoUpDate></RedncInfSgmt><MlgInfSgmt><MailAddr>广东省深圳市崇明大街33号</MailAddr><MailPc>637000</MailPc><MailDist>321423</MailDist><MlgInfoUpDate>2019-01-15</MlgInfoUpDate></MlgInfSgmt><IncInfSgmt><AnnlInc>1524865</AnnlInc><TaxIncome>1520000</TaxIncome><IncInfoUpDate>2010-06-03</IncInfoUpDate></IncInfSgmt></InBasInf></Document>";
//			List<Feedback> lineFeedback = null;
//			lineFeedback = validator110.process(lineContent, lineCnt, vldContext);
		    System.out.println("自定义实体类");
		    IValidator<Feedback, InBasInf> validator = ValidatorFactory.getValidator("30078832.0.010",
					/* 30 */       Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
					/* 30 */       vldContext);
		    InBasInf record = new InBasInf();
		    BsSgmt bsSgmt = new BsSgmt();
		    record.setBsSgmt(bsSgmt);
		    List<Feedback> lineFeedback=null;
	        try {
//	           record.preHandle();
	         } catch (Exception e) {
	           lineFeedback.add(new Feedback("ABR000", "0000"));
	         }
	         try
	         {
	        	 lineFeedback = validator.validate(record);
	         } catch (Exception e) {
	           lineFeedback.add(new Feedback("ABR000", "0000"));
	           e.printStackTrace();
	         }
			for(Feedback feedback:lineFeedback){
				System.out.println(feedback.toString());
				System.out.println(new ValidateCollectUtils().getMsg(feedback.getCode(),feedback.getTag(),feedback.getTag(),"110",feedback.getValue()));
			}	
//			 System.out.println("jar实体类");
//			 IValidator<Feedback, IdentifyNormalRecord> validator1 = ValidatorFactory.getValidator("30078832.0.010", 
//						/* 30 */       Integer.valueOf(BaseValidator.DEFAULT_MAX_ERR_COUNT), 
//						/* 30 */       vldContext);
//			 org.pbccrc.archive.collect.messagetools.ntridentify.msg.IdentifyNormalRecord record1 = new org.pbccrc.archive.collect.messagetools.ntridentify.msg.IdentifyNormalRecord();
//			 org.pbccrc.archive.collect.messagetools.ntridentify.msg.segment.BsSgmt bsSgmt1 = new org.pbccrc.archive.collect.messagetools.ntridentify.msg.segment.BsSgmt();
//			    record1.setBsSgmt(bsSgmt1);
//			    List<Feedback> lineFeedback1 = validator1.validate(record1);
//				for(Feedback feedback:lineFeedback1){
//					System.out.println(feedback.toString());
//					System.out.println(new ValidateCollectUtils().getMsg(feedback.getCode(),feedback.getTag(),"110"));
//				}
		}else{
			String validatorId="30079192.0.0";
			String fieldName="recHead";
			String	 methodStr="public Object getValue ( Object obj){\r\n" + 
					"org.pbccrc.archive.collect.messagetools.entcontract.message.ContractAlterRecord r = (org.pbccrc.archive.collect.messagetools.entcontract.message.ContractAlterRecord)obj;\r\n" + 
					"return r.getRecHead();\r\n" + 
					"}";
			AtomicLong autographId = new AtomicLong(0L);
			CtClass impCtClass = null;
		    ClassPool pool = new ClassPool(true);
		    CtClass ctInterface = null;
			try {
//				pool.insertClassPath(new ClassClassPath(IGetValueHandler.class));
				pool.appendClassPath(new LoaderClassPath(Thread.currentThread().getContextClassLoader()));
				ctInterface = pool.getCtClass("com.dhcc.xml.per.launch.IGetValueHandler");
				System.out.println("ctInterface="+ctInterface);
			} catch (NotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} 
		    pool.importPackage("java.lang.Long");
		    System.out.println("validatorId="+validatorId);
		    String packageStr = new StringBuilder().append(DynClassPackagePosition.class.getPackage().getName())
		      .append(validatorId
		      .replace(".", "_")
		      .replace("-", "_").replace(";", "_")).toString();
		    System.out.println("packageStr="+packageStr);
			System.out.println("fieldName="+fieldName);
			System.out.println("autographId="+autographId);
		    impCtClass = pool.makeClass(new StringBuilder().append(packageStr).append(".").append("GFNameVH$_").append(fieldName)
		      .append(autographId
		      .getAndIncrement()).toString());
		    System.out.println("impCtClass="+impCtClass);
		    impCtClass.addInterface(ctInterface);

		    CtConstructor constructor = new CtConstructor(null, impCtClass);
		    constructor.setModifiers(1);
		    try {
				constructor.setBody("{}");
			} catch (CannotCompileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    try {
				impCtClass.addConstructor(constructor);
			} catch (CannotCompileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    try
		    {
		    	  System.out.println("methodStr="+methodStr);
			      CtMethod method = CtNewMethod.make(methodStr, impCtClass);
			      impCtClass.addMethod(method);
			      System.out.println("impCtClass="+impCtClass.toString());
		      } catch (Exception e) {
		    	  
		    }
		    try {
				Class clazz = impCtClass.toClass(new ValidatorClassLoader());
			} catch (CannotCompileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
