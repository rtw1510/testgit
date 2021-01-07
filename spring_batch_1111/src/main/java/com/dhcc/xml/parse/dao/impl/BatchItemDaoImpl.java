package com.dhcc.xml.parse.dao.impl;

import com.dhcc.xml.parse.dao.BatchItemDao;
import com.dhcc.xml.parse.entity.V_ERROR_INFO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**  
  * Title: BatchItemBoImpl<br/>  
  * Description:批处理业务对象实现层 <br/>  
  * @author ChenJingYuan  
  * @date 2018-8-4  
  */  
@SuppressWarnings("deprecation")
@Repository
public class BatchItemDaoImpl  implements BatchItemDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	public void insertFBErrorInfo(V_ERROR_INFO v_error_info) {
		sqlSessionTemplate.insert("BatchItem_insertFBErrorInfo", v_error_info);
	}
	public String selectEbCustBaseInfo(String record_id,String filename) {
		Map map = new HashMap();
		map.put("record_id",record_id);
		map.put("filename",filename);
		String recordBrno;
		recordBrno= (String)sqlSessionTemplate.selectOne("Eb_custbase_info_select", map);
		return recordBrno;
	}
	/*
	 * 110个人基本信息(non-Javadoc)
	 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustBaseInfo(java.util.Map)
	 */
		public String selectPbCustBaseInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno= (String)sqlSessionTemplate.selectOne("pb_custbase_info_select", map);
		return recordBrno;
	}
		
		public void updatePbCustBaseInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustBaseInfo_update",map);
			
		}
		public void updatePbCustBaseInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustBaseInfoh_update", map);
			
		}
		public void updatePbCustBaseInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustBaseInfo1_update",map);
			
		}
		public void updatePbCustBaseInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustBaseInfoh1_update", map);
			
		}
		/*
		 * 114个人基本信息整笔删除(non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		
		public String selectPbCustDLTInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectPbCustDLTInfo_select", map);
			return recordBrno;
		}
		public void updatePbCustDLTInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustDLTInfo_update", map);
			
		}public void updatePbCustDLTInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustDLTInfoh_update", map);
			
		}
		public void updatePbCustDLTInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustDLTInfo_update", map);
			
		}public void updatePbCustDLTInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustDLTInfoh_update", map);
			
		}
		/*
		 * 120家族关系信息(non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectPbCustFamInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectPbCustFamInfo_select", map);
			return recordBrno;
		}
		public void updatePbCustFamInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustFamInfo_update", map);
			
		}public void updatePbCustFamInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustFamInfoh_update", map);
			
		}
		public void updatePbCustFamInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustFamInfo1_update", map);
			
		}public void updatePbCustFamInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustFamInfoh1_update", map);
			
		}
		/*
		 * 130个人证件有效期信息(non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectPbCustCtfFltgInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectPbCustCtfFltgInfo_select", map);
			return recordBrno;
		}
		public void updatePbCustCtfFltgInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustCtfFltgInfo_update", map);
			
		}public void updatePbCustCtfFltgInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustCtfFltgInfoh_update", map);
			
		}
		public void updatePbCustCtfFltgInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustCtfFltgInfo1_update", map);
			
		}public void updatePbCustCtfFltgInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustCtfFltgInfoh1_update", map);
			
		}
		/*
		 * 140个人证件整合信息记录(non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectPbCustDefctInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectPbCustDefctInfo_select", map);
			return recordBrno;
		}
		public void updatePbCustDefctInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustDefctInfo_update", map);
			
		}public void updatePbCustDefctInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustDefctInfoh_update", map);
			
		}
		public void updatePbCustDefctInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustDefctInfo1_update", map);
			
		}public void updatePbCustDefctInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbCustDefctInfoh1_update", map);
			
		}
		/*
		 * 210个人借贷账户信息记录(non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectPbLnacctInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectPbLnacctInfo_select", map);
			return recordBrno;
		}
		public void updatePbLnacctInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnacctInfo_update", map);
			
		}public void updatePbLnacctInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnacctInfoh_update", map);
			
		}
		public void updatePbLnacctInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnacctInfo1_update", map);
			
		}public void updatePbLnacctInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnacctInfoh1_update", map);
			
		}
		/*
		 * 211 个人借贷账户标识变更请求记录  221  231(non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectPbAcctChgInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectPbAcctChgInfo_select", map);
			return recordBrno;
		}
		public void updatePbAcctChgInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctChgInfo_update", map);
			
		}public void updatePbAcctChgInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctChgInfoh_update", map);
			
		}
		public void updatePbAcctChgInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctChgInfo1_update", map);
			
		}public void updatePbAcctChgInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctChgInfoh1_update", map);
			
		}
		/*
		 *  212 个人借贷账户按段更正请求记录    232(non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectPbAcctMdfInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectPbAcctMdfInfo_select", map);
			return recordBrno;
		}
		public void updatePbAcctMdfInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctMdfInfo_update", map);
			
		}public void updatePbAcctMdfInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctMdfInfoh_update", map);
			
		}
		public void updatePbAcctMdfInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctMdfInfo1_update", map);
			
		}public void updatePbAcctMdfInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctMdfInfoh1_update", map);
			
		}
		
		/*
		 *  213 个人借贷账户按段删除请求记录   223 233 (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectPbAcctDLTInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectPbAcctDLTInfo_select", map);
			return recordBrno;
		}
		public void updatePbAcctDLTInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctDLTInfo_update", map);
			
		}public void updatePbAcctDLTInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctDLTInfoh_update", map);
			
		}
		public void updatePbAcctDLTInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctDLTInfo1_update", map);
			
		}public void updatePbAcctDLTInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctDLTInfoh1_update", map);
			
		}
		/*
		 *  214 个人借贷账户整笔删除请求记录   224 234  (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectPbAcctAllDLTInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectPbAcctAllDLTInfo_select", map);
			return recordBrno;
		}
		public void updatePbAcctAllDLTInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctAllDLTInfo_update", map);
			
		}public void updatePbAcctAllDLTInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctAllDLTInfoh_update", map);
			
		}
		public void updatePbAcctAllDLTInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctAllDLTInfo1_update", map);
			
		}public void updatePbAcctAllDLTInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbAcctAllDLTInfoh1_update", map);
			
		}
		/*
		 *  215 个人借贷账户特殊事件说明记录  (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectPbLnspcEvtInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectPbLnspcEvtInfo_select", map);
			return recordBrno;
		}
		public void updatePbLnspcEvtInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnspcEvtInfo_update", map);
			
		}public void updatePbLnspcEvtInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnspcEvtInfoh_update", map);
			
		}
		public void updatePbLnspcEvtInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnspcEvtInfo1_update", map);
			
		}public void updatePbLnspcEvtInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnspcEvtInfoh1_update", map);
			
		}
		/*
		 *  220 个人授信协议信息记录  (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectPbLnctrctBaseInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectPbLnctrctBaseInfo_select", map);
			return recordBrno;
		}
		public void updatePbLnctrctBaseInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnctrctBaseInfo_update", map);
			
		}public void updatePbLnctrctBaseInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnctrctBaseInfoh_update", map);
			
		}
		public void updatePbLnctrctBaseInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnctrctBaseInfo1_update", map);
			
		}public void updatePbLnctrctBaseInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnctrctBaseInfoh1_update", map);
			
		}
		/*
		 *  230 个人担保账户信息记录 (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectPbLnsecAcctInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectPbLnsecAcctInfo_select", map);
			return recordBrno;
		}
		public void updatePbLnsecAcctInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnsecAcctInfo_update", map);
			
		}public void updatePbLnsecAcctInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnsecAcctInfoh_update", map);
			
		}
		public void updatePbLnsecAcctInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnsecAcctInfo1_update", map);
			
		}public void updatePbLnsecAcctInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updatePbLnsecAcctInfoh1_update", map);
			
		}
		/*
		 *  310 企业基本信息记录   (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectEbCustBaseInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbCustBaseInfo_select", map);
			return recordBrno;
		}
		public void updateEbCustBaseInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustBaseInfo_update", map);
			
		}public void updateEbCustBaseInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustBaseInfoh_update", map);
			
		}
		public void updateEbCustBaseInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustBaseInfo1_update", map);
			
		}public void updateEbCustBaseInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustBaseInfoh1_update", map);
			
		}
		/*
		 *  314 企业基本信息整笔删除请求记录   (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectEbCustDLTInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbCustDLTInfo_select", map);
			return recordBrno;
		}
		public void updateEbCustDLTInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustDLTInfo_update", map);
			
		}public void updateEbCustDLTInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustDLTInfoh_update", map);
			
		}
		public void updateEbCustDLTInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustDLTInfo1_update", map);
			
		}public void updateEbCustDLTInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustDLTInfoh1_update", map);
			
		}
		/*
		 *  340   企业身份标识整合信息记录  (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectEbCustCtfInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbCustCtfInfo_select", map);
			return recordBrno;
		}
		public void updateEbCustCtfInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustCtfInfo_update", map);
			
		}public void updateEbCustCtfInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustCtfInfoh_update", map);
			
		}
		public void updateEbCustCtfInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustCtfInfo1_update", map);
			
		}public void updateEbCustCtfInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustCtfInfoh1_update", map);
			
		}
		/*
		 *  350  企业间关联关系信息记录  (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectEbCustRltInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbCustRltInfo_select", map);
			return recordBrno;
		}
		public void updateEbCustRltInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustRltInfo_update", map);
			
		}public void updateEbCustRltInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustRltInfoh_update", map);
			
		}
		public void updateEbCustRltInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustRltInfo1_update", map);
			
		}public void updateEbCustRltInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCustRltInfoh1_update", map);
			
		}
		/*
		 *   410  企业借贷账户记录  (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectEbCorpAcctInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbCorpAcctInfo_select", map);
			return recordBrno;
		}
		public void updateEbCorpAcctInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCorpAcctInfo_update", map);
			
		}public void updateEbCorpAcctInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCorpAcctInfoh_update", map);
			
		}
		public void updateEbCorpAcctInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCorpAcctInfo1_update", map);
			
		}public void updateEbCorpAcctInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCorpAcctInfoh1_update", map);
			
		}
		/*
		 *   411  企业借贷账户标识变更请求记录 421 441 (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectEbAcctChgInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbAcctChgInfo_select", map);
			return recordBrno;
		}
		public void updateEbAcctChgInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctChgInfo_update", map);
			
		}public void updateEbAcctChgInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctChgInfoh_update", map);
			
		}
		public void updateEbAcctChgInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctChgInfo1_update", map);
			
		}public void updateEbAcctChgInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctChgInfoh1_update", map);
			
		}
		/*
		 *   412    企业借贷账户更正请求记录 422 442 (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectEbAcctMdfInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbAcctMdfInfo_select", map);
			return recordBrno;
		}
		public void updateEbAcctMdfInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctMdfInfo_update", map);
			
		}public void updateEbAcctMdfInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctMdfInfoh_update", map);
			
		}
		public void updateEbAcctMdfInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctMdfInfo1_update", map);
			
		}public void updateEbAcctMdfInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctMdfInfoh1_update", map);
			
		}
		/*
		 *   413    企业借贷账户按段删除请求记录 423 443 (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectEbAcctDLTInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbAcctDLTInfo_select", map);
			return recordBrno;
		}
		public void updateEbAcctDLTInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctDLTInfo_update", map);
			
		}public void updateEbAcctDLTInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctDLTInfoh_update", map);
			
		}
		public void updateEbAcctDLTInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctDLTInfo1_update", map);
			
		}public void updateEbAcctDLTInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctDLTInfoh1_update", map);
			
		}
		/*
		 *   414    企业借贷账户整笔删除请求记录 424 444 (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectEbAcctAllDLTInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbAcctAllDLTInfo_select", map);
			return recordBrno;
		}
		public void updateEbAcctAllDLTInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctAllDLTInfo_update", map);
			
		}public void updateEbAcctAllDLTInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctAllDLTInfoh_update", map);
			
		}
		public void updateEbAcctAllDLTInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctAllDLTInfo1_update", map);
			
		}public void updateEbAcctAllDLTInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbAcctAllDLTInfoh1_update", map);
			
		}
		/*
		 *  420    企业授信协议信息记录 (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectEbCorpCtrInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbCorpCtrInfo_select", map);
			return recordBrno;
		}
		public void updateEbCorpCtrInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCorpCtrInfo_update", map);
			
		}public void updateEbCorpCtrInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCorpCtrInfoh_update", map);
			
		}
		public void updateEbCorpCtrInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCorpCtrInfo1_update", map);
			
		}public void updateEbCorpCtrInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbCorpCtrInfoh1_update", map);
			
		}
		
		/*
		 *  440    企业担保交易信息相关记录 (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectEbGuArAccInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbGuArAccInfo_select", map);
			return recordBrno;
		}
		public void updateEbGuArAccInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbGuArAccInfo_update", map);
			
		}public void updateEbGuArAccInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbGuArAccInfoh_update", map);
			
		}
		public void updateEbGuArAccInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbGuArAccInfo1_update", map);
			
		}public void updateEbGuArAccInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbGuArAccInfoh1_update", map);
			
		}
		/*
		 *  510    抵（质）押合同信息记录 (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
	  //个人
		public String selectYpGuAcctInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectYpGuAcctInfo_select", map);
			return recordBrno;
		}
		public void updateYpGuAcctInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpGuAcctInfo_update", map);
			
		}public void updateYpGuAcctInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpGuAcctInfoh_update", map);
		}
		public void updateYpGuAcctInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpGuAcctInfo1_update", map);
			
		}public void updateYpGuAcctInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpGuAcctInfoh1_update", map);
		}
		  //企业
		public String selectYpGuAcctImpInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectYpGuAcctImpInfo_select", map);
			return recordBrno;
		}
		public void updateYpGuAcctImpInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpGuAcctImpInfo", map);
			
		}public void updateYpGuAcctImpInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpGuAcctImpInfoh", map);
		}
		public void updateYpGuAcctImpInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpGuAcctImpInfo1", map);
			
		}public void updateYpGuAcctImpInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpGuAcctImpInfoh1", map);
		}	
		/*
		 *  511   抵（质）押合同标识变更请求记录 (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
	  //个人
		public String selectYpAcctChgInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectYpAcctChgInfo_select", map);
			return recordBrno;
		}
		public void updateYpAcctChgInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpAcctChgInfo_update", map);
			
		}public void updateYpAcctChgInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpAcctChgInfoh_update", map);
		}
		public void updateYpAcctChgInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpAcctChgInfo1_update", map);
			
		}public void updateYpAcctChgInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpAcctChgInfoh1_update", map);
		}
		  //企业
		public String selectYeAcctChgInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectYeAcctChgInfo_select", map);
			return recordBrno;
		}
		public void updateYeAcctChgInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateYeAcctChgInfo", map);
			
		}public void updateYeAcctChgInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateYeAcctChgInfoh", map);
		}	
		public void updateYeAcctChgInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateYeAcctChgInfo1", map);
			
		}public void updateYeAcctChgInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateYeAcctChgInfoh1", map);
		}	
		/*
		 *   514 抵（质）押合同整笔删除请求记录 (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
	  //个人
		public String selectYpAcctAllDLTInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectYpAcctAllDLTInfo_select", map);
			return recordBrno;
		}
		public void updateYpAcctAllDLTInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpAcctAllDLTInfo_update", map);
			
		}public void updateYpAcctAllDLTInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpAcctAllDLTInfoh_update", map);
		}
		public void updateYpAcctAllDLTInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpAcctAllDLTInfo1_update", map);
			
		}public void updateYpAcctAllDLTInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateYpAcctAllDLTInfoh1_update", map);
		}
		  //企业
		public String selectYeAcctAllDLTInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectYeAcctAllDLTInfo_select", map);
			return recordBrno;
		}
		public void updateYeAcctAllDLTInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateYeAcctAllDLTInfo", map);
			
		}public void updateYeAcctAllDLTInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateYeAcctAllDLTInfoh", map);
		}	
		public void updateYeAcctAllDLTInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateYeAcctAllDLTInfo1", map);
			
		}public void updateYeAcctAllDLTInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateYeAcctAllDLTInfoh1", map);
		}
		/*
		 *   610  企业资产负债表信息记录 (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		//02版
		public String selectEbFinaBal02Info(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbFinaBal02Info_select", map);
			return recordBrno;
		}
		public void updateEbFinaBal02Info(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaBal02Info_update", map);
			
		}public void updateEbFinaBal02Infoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaBal02Infoh_update", map);
		}
		public void updateEbFinaBal02Info1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaBal02Info1_update", map);
			
		}public void updateEbFinaBal02Infoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaBal02Infoh1_update", map);
		}
		//07版
		public String selectEbFinaBal07Info(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbFinaBal07Info_select", map);
			return recordBrno;
		}
		public void updateEbFinaBal07Info(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaBal07Info_update", map);
			
		}public void updateEbFinaBal07Infoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaBal07Infoh_update", map);
		}	
		public void updateEbFinaBal07Info1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaBal07Info1_update", map);
			
		}public void updateEbFinaBal07Infoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaBal07Infoh1_update", map);
		}	
		/*
		 *   620  企业利润及利润分配表信息记录 (non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		//02版
		public String selectEbFinaPro02Info(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbFinaPro02Info_select", map);
			return recordBrno;
		}
		public void updateEbFinaPro02Info(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaPro02Info_update", map);
			
		}public void updateEbFinaPro02Infoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaPro02Infoh_update", map);
		}
		public void updateEbFinaPro02Info1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaPro02Info1_update", map);
			
		}public void updateEbFinaPro02Infoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaPro02Infoh1_update", map);
		}
		//07版
		public String selectEbFinaPro07Info(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbFinaPro07Info_select", map);
			return recordBrno;
		}
		public void updateEbFinaPro07Info(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaPro07Info_update", map);
			
		}public void updateEbFinaPro07Infoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaPro07Infoh_update", map);
		}
		public void updateEbFinaPro07Info1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaPro07Info1_update", map);
			
		}public void updateEbFinaPro07Infoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaPro07Infoh1_update", map);
		}
		/*
		 *    630  企业现金流量表信息记录(non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		//02版
		public String selectEbFinaCsh02Info(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbFinaCsh02Info_select", map);
			return recordBrno;
		}
		public void updateEbFinaCsh02Info(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaCsh02Info_update", map);
			
		}public void updateEbFinaCsh02Infoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaCsh02Infoh_update", map);
		}
		public void updateEbFinaCsh02Info1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaCsh02Info1_update", map);
			
		}public void updateEbFinaCsh02Infoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaCsh02Infoh1_update", map);
		}
		//07版
		public String selectEbFinaCsh07Info(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbFinaCsh07Info_select", map);
			return recordBrno;
		}
		public void updateEbFinaCsh07Info(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaCsh07Info_update", map);
			
		}public void updateEbFinaCsh07Infoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaCsh07Infoh_update", map);
		}
		public void updateEbFinaCsh07Info1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaCsh07Info1_update", map);
			
		}public void updateEbFinaCsh07Infoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaCsh07Infoh1_update", map);
		}
		/*
		 *  640  事业单位资产负债表信息记录(non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectEbFinaInsbalInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbFinaInsbalInfo_select", map);
			return recordBrno;
		}
		public void updateEbFinaInsbalInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaInsbalInfo_update", map);
			
		}public void updateEbFinaInsbalInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaInsbalInfoh_update", map);
		}
		public void updateEbFinaInsbalInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaInsbalInfo1_update", map);
			
		}public void updateEbFinaInsbalInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaInsbalInfoh1_update", map);
		}
		/*
		 * 650  事业单位收入支出表信息记录(non-Javadoc)
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectEbFinaIncexpInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbFinaIncexpInfo_select", map);
			return recordBrno;
		}
		public void updateEbFinaIncexpInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaIncexpInfo_update", map);
			
		}public void updateEbFinaIncexpInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaIncexpInfoh_update", map);
		}
		public void updateEbFinaIncexpInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaIncexpInfo1_update", map);
			
		}public void updateEbFinaIncexpInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbFinaIncexpInfoh1_update", map);
		}
		/*
		 * 614  企业资产负债表整笔删除请求记录(non-Javadoc) 624 634 644 654
		 * @see com.dhcc.xml.parse.dao.BatchItemDao#selectPbCustDLTInfo(java.util.Map)
		 */
		public String selectEbNaDLTInfo(Map<String,String> map) {
			String recordBrno;
			recordBrno= (String)sqlSessionTemplate.selectOne("selectEbNaDLTInfo_select", map);
			return recordBrno;
		}
		public void updateEbNaDLTInfo(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbNaDLTInfo_update", map);
			
		}public void updateEbNaDLTInfoh(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbNaDLTInfoh_update", map);
		}
		public void updateEbNaDLTInfo1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbNaDLTInfo1_update", map);
			
		}public void updateEbNaDLTInfoh1(Map<String,String> map) {
			sqlSessionTemplate.update("updateEbNaDLTInfoh1_update", map);
		}
}
