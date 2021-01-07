package com.dhcc.xml.parse.batch.writer;

import com.dhcc.xml.parse.entity.V_ERROR_INFO;
import com.dhcc.xml.parse.service.FbMessageInfoService;
import com.dhcc.xml.util.DBUtils;
import com.dhcc.xml.util.UpdateDate;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**  
  * Title: BatchItemWriter<br/>  
  * Description:解析反馈的报文批量写入数据库报文的记录 <br/>  
  * @author ChenJingYuan  
  * @date 2018-8-1  
  */
@Component("batchItemWriter")
public class BatchItemWriter implements ItemWriter<List<V_ERROR_INFO>> {
	/**
	 *批处理业务对象层
	 */
	@Autowired
	private FbMessageInfoService fbMessageInfoService;
	private int i=1;

	public void write(List<? extends List<V_ERROR_INFO>> items) throws Exception {
		List<String> sqlList=new ArrayList<String>();
		for(List<V_ERROR_INFO> item : items){
			for(V_ERROR_INFO v_error_info : item){
				if(v_error_info!=null){
					String str=("INSERT INTO V_ERROR_INFO(ID,INFRECTYPE,ERR_KEYS,ERR_KEYS_DESC,FB_FILE_NAME,FBCODE,FBMSG,ERR_TYPE,ERR_TYPE_DETAIL,CRI_TYPE,RECORD_ID,TX_DATE,DATA_STS,CONFIRM_STS,RULEDESC)" +
							"VALUES(V_ERROR_INFO_SEQ.NEXTVAL,'"+v_error_info.getInfrectype()+"','"+v_error_info.getErr_keys()+"','"+v_error_info.getErr_keys_desc()+"','"+v_error_info.getFb_file_name()+"','"+v_error_info.getFbcode()+"','"+v_error_info.getFbmsg()+"','"+
					v_error_info.getErr_type()+"','"+v_error_info.getErr_type_detail()+"','"+v_error_info.getCri_type()+"','"+v_error_info.getRecord_id()+"','"+
					v_error_info.getTx_date()+"','"+v_error_info.getData_sts()+"','"+v_error_info.getConfirm_sts()+"','"+v_error_info.getRuledesc()+"')").replace("null", "");
					sqlList.add(str);
				}
			}			
		}
		System.out.println("插入开始时间"+ UpdateDate.getDateFormat("HHmmss")+"...........................");
		DBUtils.execute_sql(sqlList);
		/*List<V_ERROR_INFO> VErrorInfoList = new ArrayList<V_ERROR_INFO>();
		for(List<V_ERROR_INFO> item : items){
			for(V_ERROR_INFO v_error_info : item){
				if(v_error_info!=null){
					VErrorInfoList.add(v_error_info);
				}
			}
		}*/
//		fbMessageInfoBo.insertVErrorInfo(VErrorInfoList);
		System.out.println("插入结束时间"+ UpdateDate.getDateFormat("HHmmss")+"..............................");
		System.out.println("第"+i+"次数据库插入..............................");
		i++;
	}

}
