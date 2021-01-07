package com.dhcc.xml.parse.batch.processor;

import com.dhcc.core.cache.entity.SRInfo;
import com.dhcc.core.cache.util.EhcacheUtil;
import com.dhcc.xml.parse.entity.*;
import com.dhcc.xml.parse.service.FbMessageInfoService;
import com.dhcc.xml.util.CreateXML;
import com.dhcc.xml.util.Dom4jUtil;
import com.dhcc.xml.util.UpdateDate;
import com.dhcc.xml.validation.ValidateCollectUtils;
import net.sf.ehcache.Cache;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Element;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import sun.misc.BASE64Decoder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**  
  * Title: BatchItemProcessor<br/>  
  * Description:报文解析批处理类 <br/>  
  * @author ChenJingYuan  
  * @date 2018-8-3  
  */
@Component("batchItemProcessor")
@StepScope
public class BatchItemProcessor implements ItemProcessor<FeedBackContext,List<V_ERROR_INFO>> {
	private static final Log logger = LogFactory.getLog(BatchItemProcessor.class);
	/**本次文件处理的文件全路径*/
	@Value("#{jobParameters['fileFullPath']}")
	private String fileFullPath;
	/**文件路径*/
	@Value("#{jobParameters['filePath']}")
	private String filePath;
	/**待解析的反馈报文文件名*/
	@Value("#{jobParameters['fileName']}")
	private String fileName;
	/**记录错误表的实体类（每个错误一条记录）*/  
	private V_ERROR_INFO v_error_info;
	/**一条记录包含的所有错误类型*/  
	private List<V_ERROR_INFO> v_error_info_list;
	/**报文类型：1-个人；2-企业*/
	@Value("#{jobParameters['fileType']}")
	private String fileType;
	/**信息记录类型*/
	@Value("#{jobParameters['infRecType']}")
	private String infRecType;
	@Autowired
	private FbMessageInfoService fbMessageInfoService;
	/**根据反馈报文内容更新相应的报文信息*/  
	
	public List<V_ERROR_INFO> process(FeedBackContext item) throws Exception{
//		System.out.println("开始操作"+new SimpleDateFormat("hh：mm：ss").format(new Date()));
		v_error_info_list = new ArrayList<V_ERROR_INFO>();
		String lineStr = item.getLineContent();
		
		//1、先判断是否是反馈报文头
		if("A".equals(lineStr.charAt(0)+"") && lineStr.length()==72){
			v_error_info=new V_ERROR_INFO();
			String fb_file_name=fileName.substring(0, 30);//反馈报文名
			String fb_version=lineStr.substring(4, 9);//反馈文件版本号
			String fb_time=lineStr.substring(44, 58);//反馈文件生成时间
			String fb_succ_num=lineStr.substring(58, 65);//正确入库记录数
			String fb_err_num=lineStr.substring(65, 72);//错误反馈记录数
			
			FbMessageInfo fbMessageInfo = new FbMessageInfo();
			fbMessageInfo.setFb_file_name(fb_file_name);
			fbMessageInfo.setFb_version(fb_version);
			fbMessageInfo.setFb_time(UpdateDate.updateTime(fb_time));
			fbMessageInfo.setFb_succ_num(Integer.parseInt(fb_succ_num)+"");
			fbMessageInfo.setFb_err_num(Integer.parseInt(fb_err_num)+"");
			fbMessageInfo.setUp_date(UpdateDate.getDateFormat("yyyy-MM-dd"));
			fbMessageInfo.setUp_time(UpdateDate.getDateFormat("yyyy-MM-dd HH:mm:ss"));
			fbMessageInfo.setFb_file_sts("2");
			fbMessageInfoService.updateFbMessageInfo(fbMessageInfo);
		}else{
//			System.out.println("我是报文体："+lineStr); 
			//解析具体的报文体
			ParseContext parseContext =(ParseContext) CreateXML.xmlStrToObject(ParseContext.class, lineStr);
			List<ErrInf> errInf_List=parseContext.getFbInf().getErrInf();
			for(ErrInf errinf : errInf_List){
				v_error_info=new V_ERROR_INFO();
				v_error_info.setInfrectype(infRecType);
				v_error_info.setFb_file_name(fileName.substring(0, fileName.indexOf(".")));
				v_error_info.setFbcode(errinf.getFbCode());
				v_error_info.setFbmsg(errinf.getFbMsg());
				v_error_info.setTx_date(UpdateDate.getDateFormat("yyyyMMdd"));
				v_error_info.setOprr_no("");//加载反馈操作员
				v_error_info.setErr_type("2");//1-校验错误;2-反馈错误
				v_error_info.setCri_type(fileType);//1是个人 2是企业
				v_error_info.setConfirm_sts("0");
				v_error_info.setData_sts("0");

				String reported_XML = parseContext.getFbInf().getErrRec();
				//base64转码
				BASE64Decoder decoder = new BASE64Decoder();
				try {
					reported_XML=new String(decoder.decodeBuffer(reported_XML), "UTF-8");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				System.out.println("反馈的上报的内容："+reported_XML);
				if(reported_XML==null||"".equals(reported_XML)){
					v_error_info_list.add(v_error_info);
					v_error_info.setErr_keys(fileName);
					v_error_info.setErr_keys_desc("出错报文名："+fileName);
					continue;
				}
				ValidateCollectUtils.getFb_keys(infRecType,reported_XML,v_error_info);

				//start从缓存中获取字段的中文描述
				Cache srCache = EhcacheUtil.getInstance().get("SRCache");
				if (v_error_info.getFbmsg()!=null&&srCache.get(infRecType + v_error_info.getFbmsg())!=null) {//两个字段才能判断唯一人行标签（信息记录类型+标签名称）
					SRInfo srInfo = (SRInfo) srCache.get(infRecType + v_error_info.getFbmsg()).getObjectValue();
					v_error_info.setInfrectype(srInfo.getInfrectype());
					v_error_info.setFbmsg(srInfo.getXml_tag());
					v_error_info.setRuledesc(ValidateCollectUtils.getMsg(errinf.getFbCode(),srInfo.getXml_tag(),srInfo.getXml_tag_name(), infRecType,""));
				}else {//三个字段才能判断唯一人行标签（信息记录类型+标签名称+父级标签（UP_ONE））
					if(v_error_info.getFbmsg()!=null){
						Element rootElement = Dom4jUtil.getRootElement(reported_XML);
						List<String> list = new ArrayList<String>();
						list = Dom4jUtil.getParentNodes(rootElement,v_error_info.getFbmsg(),list);
						if(list.size()>0){
							String parentNote = list.get(0);
							if(srCache.get(infRecType + v_error_info.getFbmsg() + parentNote)!=null){
								SRInfo srInfo = (SRInfo) srCache.get(infRecType + v_error_info.getFbmsg() + parentNote).getObjectValue();
								v_error_info.setInfrectype(srInfo.getInfrectype());
								v_error_info.setFbmsg(srInfo.getXml_tag());
								v_error_info.setRuledesc(ValidateCollectUtils.getMsg(errinf.getFbCode(), srInfo.getXml_tag(),srInfo.getXml_tag_name(), infRecType,""));
							}
						}
					}
					if(v_error_info.getRuledesc()==null||"".equals(v_error_info.getRuledesc())){
						v_error_info.setRuledesc(ValidateCollectUtils.getMsg(errinf.getFbCode(), errinf.getFbMsg(),errinf.getFbMsg(), infRecType,""));
					}
				}
				//end从缓存中获取字段的中文描述
				v_error_info_list.add(v_error_info);
			}
		}
		return v_error_info_list;
	}
	
	public static int getStringNumberMethod1(String fileName, String str) throws Exception {
	    int num = 0;

	    BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
	    String readLine = "";
	    StringBuffer stringBuffer = new StringBuffer();
	    while((readLine = bufferedReader.readLine()) != null){
	        stringBuffer.append(readLine);
	    }
	    for(int i = 0; i < stringBuffer.length(); i++){
	        if(stringBuffer.indexOf(str, i) != -1){
	            i = stringBuffer.indexOf(str, i);
	            num++;
	        }
	    }
	    return num;

	}
	/**  
	 * 获取 fileName
	 * @return the fileName 本次文件处理的文件名 
	 */
	public String getFileName() {
		return fileName;
	}
	/**  
	 * 设置 fileName  
	 * @param fileName 本次文件处理的文件名  
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**  
	 * 获取 v_error_info
	 * @return the v_error_info 记录错误表的实体类（每个错误一条记录） 
	 */
	public V_ERROR_INFO getV_error_info() {
		return v_error_info;
	}
	/**  
	 * 设置 v_error_info  
	 * @param vErrorInfo 记录错误表的实体类（每个错误一条记录）
	 */
	public void setV_error_info(V_ERROR_INFO vErrorInfo) {
		v_error_info = vErrorInfo;
	}
	/**  
	 * 获取 v_error_info_list
	 * @return the v_error_info_list 一条记录包含的所有错误类型 
	 */
	public List<V_ERROR_INFO> getV_error_info_list() {
		return v_error_info_list;
	}
	/**  
	 * 设置 v_error_info_list  
	 * @param vErrorInfoList 一条记录包含的所有错误类型
	 */
	public void setV_error_info_list(List<V_ERROR_INFO> vErrorInfoList) {
		v_error_info_list = vErrorInfoList;
	}

	public String getFileFullPath() {
		return fileFullPath;
	}

	public void setFileFullPath(String fileFullPath) {
		this.fileFullPath = fileFullPath;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getInfRecType() {
		return infRecType;
	}

	public void setInfRecType(String infRecType) {
		this.infRecType = infRecType;
	}
}
