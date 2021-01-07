package com.dhcc.xml.parse.entity;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**  
  * Title: FeedBackContentMapper<br/>  
  * Description:用于Springbatch批量文件的读取映射 <br/>  
  * @author ChenJingYuan  
  * @date 2018-8-1  
  */  
public class FeedBackContextMapper implements FieldSetMapper<FeedBackContext> {

	public FeedBackContext mapFieldSet(FieldSet fieldSet) throws BindException {
		//映射参数在/crs/src/main/resources/batch-config/per/parse/oraclebatch-parse.xml文件中配置
		return new FeedBackContext(fieldSet.readString("lineStr"));
	}
}
