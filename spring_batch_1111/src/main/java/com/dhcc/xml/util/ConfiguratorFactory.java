package com.dhcc.xml.util;

/**  
  * Title: ConfiguratorFactory<br/>  
  * Description:?????????? <br/>  
  * @author ChenJingYuan  
  * @date 2019-9-17  
  */  
public class ConfiguratorFactory {
	
	public ConfiguratorFactory() {
	}

	/**  
	 * Title: createClass<br\>  
	 * Description: ????????????<br\>  
	 */  
	public static Class<?> createClass(String className)  {
		try {
			Class<?> c = Class.forName(className);
			return c;
		} catch (Exception e) {
		}
		return null;

	}

	/**  
	 * Title: create<br\>  
	 * Description:???????????? <br\>  
	 * @param className
	 * ???????·??
	 */  
	public static Object create(String className)  {
		try {
			Class<?> clazz = Class.forName(className);
			return clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return className;
	}
	
	/**  
	 * Title: main<br\>  
	 * Description:????main <br\>  
	 */  
	public static void main(String[] args){
		String className = "dhcc.cri.batch.validator.baseCheck.EmptyChecker";
	    Object o = create(className);
	    System.out.println(o.toString());
	}
}
