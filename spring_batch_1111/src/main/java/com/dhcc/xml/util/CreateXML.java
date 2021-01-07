package com.dhcc.xml.util;

import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Title: CreateXML<br/>
 * Description:Jaxb组XML报文工具类 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年4月4日
 */
public class CreateXML {
	private final static Logger log = Logger.getLogger(CreateXML.class);

	public static Map<String, JAXBContext> jaxbContextMap = new HashMap<String, JAXBContext>();

	/**
	 * 将pojo转换为XML字符串
	 * 
	 * @param object
	 * @return
	 */
	public static String convertToXml(Object object) {
		Writer sw = new StringWriter();
		try {
			// 利用jdk中自带的转换类实现
//			JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
			JAXBContext jaxbContext = jaxbContextMap.get(object.getClass().getName());
			if (jaxbContext == null) {
				// 如果每次都调用JAXBContext.newInstance方法，会导致性能急剧下降
				jaxbContext = JAXBContext.newInstance(object.getClass());
				jaxbContextMap.put(object.getClass().getName(), jaxbContext);
			}
			Marshaller marshaller = jaxbContext.createMarshaller();
			// 格式化xml输出的格式
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);// xml头信息
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);// 格式化
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");// 编码
			// 将对象转换成输出流形式的xml
			marshaller.marshal(object, sw);
		} catch (JAXBException e) {
			e.printStackTrace();
		} finally {
			if (sw != null) {
				try {
					sw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return sw.toString();
	}
	/**
	 * Title: convertToXmlFile<br\>
	 * Description: 将pojo转换为XML文件<br\>
	 * @param obj 传入的对象
	 * @param savePath 保存的路径
	 * @return
	 * @return File 返回文件格式
	 * @throws
	 */
	public static File convertToXmlFile(Object obj, String savePath) {
		File file = null;
		String xmlStr = convertToXml(obj);
		if (xmlStr != null && !"".equals(xmlStr)) {
			file = new File(savePath);
			if (!file.exists() && file.isFile()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (file.isDirectory()) {
				System.out.println(MessageFormat.format("{0}不是有效的文件路径.",
						savePath));
				return null;
			}

			Writer writer = null;

			try {
				writer = new FileWriter(file);
				writer.write(xmlStr);
				writer.flush();
				log.info("XML文件生成成功！");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (writer != null) {
					try {
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}

		}
		return file;
	}

	/**
	 * Title: xmlFileToObject<br\>
	 * Description:将XML文件转换为指定类型的pojo <br\>
	 * @param clazz
	 * @param xmlPath
	 * @return
	 * @return Object
	 * @throws
	 */
	public static Object xmlFileToObject(Class<?> clazz, String xmlPath) {
		Object xmlObject = null;
		Reader fr = null;
		try {
			JAXBContext context = JAXBContext.newInstance(clazz);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			fr = new FileReader(xmlPath);
			xmlObject = unmarshaller.unmarshal(fr);
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (null != fr) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return xmlObject;
	}

	/**
	 * Title: xmlStrToObject<br\>
	 * Description: 将XML字符串转换为指定类型的pojo<br\>
	 */
	public static Object xmlStrToObject(Class<?> clazz, String xmlStr) {
		Object xmlObject = null;
		Reader reader = null;

		try {
			JAXBContext jaxbContext = jaxbContextMap.get(clazz.getName());
			if (jaxbContext == null) {
				// 如果每次都调用JAXBContext.newInstance方法，会导致性能急剧下降
				jaxbContext = JAXBContext.newInstance(clazz);
				jaxbContextMap.put(clazz.getName(), jaxbContext);
			}
			// 进行将Xml转成对象的核心接口
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			reader = new StringReader(xmlStr);
			xmlObject = unmarshaller.unmarshal(reader);
		} catch (JAXBException e) {
			e.printStackTrace();
		} finally {
			if (null != reader) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return xmlObject;
	}

	/**
	 * Title: writeReport<br\>
	 * Description: 报文公共写方法<br\>
	 * @param filePath 报文路径
	 * @param fileName 生成报文名称
	 * @param context 报文内容
	 */
	public static void writeReport(String filePath,String fileName,String context){
		//一页的缓存数据
		File file1 = new File(filePath);
		if(!file1.exists()){
			file1.mkdirs();
		}
		File file2 = new File(filePath+fileName);
		FileOutputStream fis = null;
		try {
			fis = new FileOutputStream(file2,true);
			fis.write(context.getBytes("UTF-8"));
			fis.flush();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("写报文信息出现异常！");
		}
	}
}
