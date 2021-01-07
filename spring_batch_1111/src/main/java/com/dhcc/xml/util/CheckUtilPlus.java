package com.dhcc.xml.util;

import java.util.List;
import java.util.Map;

/**  
  * Title: CheckUtilPlus<br/>  
  * Description:校验工具 <br/>  
  * @author ChenJingYuan  
  * @date 2020-7-16  
  */  
public class CheckUtilPlus {
	/**  
	 * Title: checkStr<br\>  
	 * Description:字符串非空判断 <br\>  
	 * true:str != null && !str.isEmpty()<br\>
	 */  
	public static boolean checkStr(String str) {
		boolean flag = false;
		if(str != null && !str.isEmpty()){
			flag=true;
		}
		return flag;
	}
	/**  
	 * Title: checkArray<br\>  
	 * Description: 数组非空判断<br\>  
	 * true:arr != null && arr.length!=0<br\>
	 */  
	public static boolean checkArray(Object[] arr) {
		boolean flag = false;
		if(arr != null && arr.length!=0){
			flag = true;
		}
		return flag;
	}
	
	/**  
	 * Title: checkList<br\>  
	 * Description: List非空判断  <br\>
	 * true:list != null && list.size() > 0<br\>
	 */  
	public static boolean checkList(List list) {
		boolean flag = false;
		if(list != null && list.size() > 0){
			flag = true;
		}
		return flag;
	}
	
	/**  
	 * Title: checkMap<br\>  
	 * Description: <br\>  
	 * true:map!= null && map.size() > 0<br\>
	 */  
	public static boolean checkMap(Map map) {
		boolean flag = false;
		if(map!= null && map.size() > 0){
			flag = true;
		}
		return flag;
	}
}
