package com.dhcc.xml.parse.dao.impl;

import com.dhcc.xml.parse.dao.FbMessageInfoDao;
import com.dhcc.xml.parse.entity.FbMessageInfo;
import com.dhcc.xml.parse.entity.V_ERROR_INFO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("deprecation")
@Repository
public class FbMessageInfoDaoImpl implements FbMessageInfoDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	/**  
	 * Title: updateFbMessageInfo<br\>  
	 * Description:根据反馈报文信息更新反馈报文状态 <br\>  
	 */
	public Integer updateFbMessageInfo(FbMessageInfo fbMessageInfo) {
		return sqlSessionTemplate.update("FbMessageInfo_updateFbMessageInfo", fbMessageInfo);
	}
	/**  
	 * Title: updateFbFileSts<br\>  
	 * Description:根据反馈报文信息更新反馈报文状态 <br\>  
	 */  
	public Integer updateFbFileSts(FbMessageInfo fbMessageInfo){
		return sqlSessionTemplate.update("FbMessageInfo_updateFbFileSts", fbMessageInfo);
	}
	/**  
	 * Title: getFbMessageInfo<br\>  
	 * Description:根据反馈报问名获取反馈报文信息<br\>  
	 */  
	public FbMessageInfo getFbMessageInfo(FbMessageInfo fbMessageInfo){
		return (FbMessageInfo) sqlSessionTemplate.selectOne("FbMessageInfo_getFbMessageInfo", fbMessageInfo);
	}
	/**  
	 * Title: getFbMessageInfo<br\>  
	 * Description: 批量插入List集合错误数据<br\>  
	 */  
	public Integer insertVErrorInfo(List<V_ERROR_INFO> VErrorInfoList){
		Map<String, List<V_ERROR_INFO>> map = new HashMap<String, List<V_ERROR_INFO>>();
		map.put("VErrorInfoList",VErrorInfoList);
		return  (Integer) sqlSessionTemplate.insert("FbMessageInfo_insertVErrorInfo", map);
	}
	/**  
	 * Title: getTableNames<br\>  
	 * Description:根据信息记录类型获取对应主表名 <br\>  
	 */  
	public String getTableNames(Map<String,String> map){
		return  (String) sqlSessionTemplate.selectOne("FbMessageInfo_getTableName", map);
	}
	/**  
	 * Title: updateDataTableFail<br\>  
	 * Description:根据表名和原报文名称更新上报状态 <br\>  
	 */  
	public Integer updateDataTableFail(String statementName,Map<String,String> map){
		return  (Integer) sqlSessionTemplate.update(statementName, map);
	}
	/**  
	 * Title: updateDataTableSucc<br\>  
	 * Description:根据表名和原报文名称更新上报状态 <br\>  
	 */  
	public Integer updateDataTableSucc(String statementName,Map<String,String> map){
		return  (Integer) sqlSessionTemplate.update(statementName, map);
	}
	/**  
	 * Title: updateErrorTable<br\>  
	 * Description:根据原数据更新错误表相关信息<br\>  
	 */  
	public Integer updateErrorTable(Map<String,String> map){
		return  (Integer) sqlSessionTemplate.update("FbMessageInfo_updateErrorTable", map);
	}
	/**  
	 * Title: updateRuleCode<br\>  
	 * Description:更新错误表的校验规则代码 <br\>  
	 */  
	public Integer updateRuleCode(Map<String,String> map){
		return  (Integer) sqlSessionTemplate.update("FbMessageInfo_updateRuleCode", map);
	}
	
}
