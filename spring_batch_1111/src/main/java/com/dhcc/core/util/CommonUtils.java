package com.dhcc.core.util;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Title: CommonUtils<br/>
 * Description:单例获取工具类 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018-8-1
 */
public class CommonUtils {

	private CommonUtils() {
	}

	private static CommonUtils instance = new CommonUtils();
	private static Map<String, String> propertiesMap = new HashMap<String, String>();

	public static CommonUtils getInstance() {
		return instance;
	}

	/**
	 * Title: getUUID<br\>
	 * Description:用于获取随机数Id <br\>
	 * 
	 * @return 获取的UUID随机数
	 * @return String
	 * @throws
	 */
	public static String getUUID() {
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();
		String uuidStr = str.replace("-", "");
		return uuidStr;
	}

	/**
	 * Title: getNowTime<br\>
	 * Description:按照yyyy-MM-dd HH:mm:ss的格式获取当前时间 <br\>
	 * 
	 * @return 返回当前日期
	 * @return String
	 * @throws
	 */
	public static String getNowTime() {
		return getNowTime("yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * Title: getNowTime<br\>
	 * Description:根据指定模板获取当前时间 <br\>
	 * 
	 * @param format
	 * @return 指定的格式化日期
	 * @return String
	 * @throws
	 */
	public static String getNowTime(String format) {
		SimpleDateFormat sf = new SimpleDateFormat(format);
		Date time = new Date();
		return sf.format(time);
	}

	/**
	 * Title: fmtStringEmpty<br\>
	 * Description: 将Object类型的对象转化为String类型<br\>
	 * 
	 * @param obj
	 * @return
	 * @return String
	 * @throws
	 */
	public static String fmtStringEmpty(Object obj) {
		String fmtStr = "";
		if (obj == null) {
			return fmtStr;
		} else {
			if (obj instanceof Date) {
				fmtStr = String.valueOf(obj);
				if (fmtStr.length() > 0) {
					fmtStr = fmtStr.substring(0, 19);
				}
			} else {
				fmtStr = String.valueOf(obj);
				if ("null".equalsIgnoreCase(fmtStr)) {
					fmtStr = "";
				}
			}
			return fmtStr;
		}
	}

	/**
	 * Title: getProperty<br\>
	 * Description:读取配置文件 <br\>
	 * 
	 * @param key
	 *            文件中包含的键值
	 * @param propName
	 *            文件路径+名称
	 * @return 获取的value值
	 * @return String
	 * @throws
	 */
	public static String getProperty(String key, String propName) {
		if (propertiesMap.containsKey(key))
			return propertiesMap.get(key);
		String value = "";
		Properties pro = new Properties();
		InputStream in = CommonUtils.class.getClassLoader()
				.getResourceAsStream(propName);
		try {
			pro.load(in);
			value = pro.containsKey(key) ? pro.getProperty(key) : "";
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (!value.trim().equals(""))
			propertiesMap.put(key, value);
		return value;
	}
	/**  
	 * Title: formatCount<br\>  
	 * Description:格式化指定长度的数值为字符串 <br\>  
	 * @return
	 * @return String 
	 */  
	public static String formatCount(String strCount,Integer length){
		if (strCount != null && !"0".equals(strCount)) {
			while (strCount.length() < length) {
				strCount = "0" + strCount;
			}
		} else {
			strCount = "0000000";
		}
		return strCount;
	}
}
