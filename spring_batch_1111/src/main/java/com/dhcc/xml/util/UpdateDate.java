package com.dhcc.xml.util;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Title: UpdateDate<br/>
 * Description:将yyyymmdd转化为yyyy-mm-dd <br/>
 * 
 * @author 
 * @date 2019年5月27日
 */
public class UpdateDate {
	/**  
	 * Title: updataDate<br\>  
	 * Description:将yyyyMMdd转化为yyyy-MM-dd <br\>  
	 */  
	public static String updateDate(String date) {
		if(date!=null&&date.length()==8){
			date = date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8);
		}
		return date;
	}
	
	/**  
	 * Title: updateTime<br\>
	 * Description:将yyyyMMddHHmmss转化为yyyy-MM-dd HH:mm:ss  <br\>  
	 */  
	public static String updateTime(String time) {
		if(time!=null&&time.length()==14){
			time = time.substring(0, 4) + "-" + time.substring(4, 6) + "-" + time.substring(6, 8) + " " 
					+ time.substring(8, 10) + ":" + time.substring(10, 12) + ":" + time.substring(12, 14);
		}
		return time;
	}
	/**  
	 * Title: updataDate<br\>  
	 * Description:将yyyyMM转化为yyyy-MM <br\>  
	 */
	public static String updateMonth(String month) {
		if(month!=null&&month.length()==6){
			month = month.substring(0, 4) + "-" + month.substring(4, 6);
		}
		return month;
	}
	/**  
	 * Title: getDateFormat<br\>  
	 * Description: 获取格式换日期<br\>  
	 */  
	public static String getDateFormat(String formatStr){
		Date date = new Date();
		SimpleDateFormat matter=new SimpleDateFormat(formatStr);
	    return matter.format(date);
	}
	
}
