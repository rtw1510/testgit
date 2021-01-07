package com.dhcc.xml.parse.service.impl;

import com.dhcc.xml.parse.dao.BatchItemDao;
import com.dhcc.xml.parse.entity.V_ERROR_INFO;
import com.dhcc.xml.parse.service.BatchItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**  
  * Title: BatchItemBoImpl<br/>  
  * Description:批处理业务对象实现层 <br/>  
  * @author ChenJingYuan  
  * @date 2018-8-4  
  */
@Service
public class BatchItemServiceImpl implements BatchItemService {
	@Autowired
	private BatchItemDao batchItemDao;

	public void insertFBErrorInfo(V_ERROR_INFO v_error_info) {
		batchItemDao.insertFBErrorInfo(v_error_info);
	}
	

	/*
	 * 110 个人基本信息(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustBaseInfo(java.util.Map)
	 */
	public String selectPbCustBaseInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectPbCustBaseInfo(map);
		return recordBrno;
	}
	public void updatePbCustBaseInfo(Map<String,String> map) {
		batchItemDao.updatePbCustBaseInfo(map);
	}
	public void updatePbCustBaseInfoh(Map<String,String> map) {
		batchItemDao.updatePbCustBaseInfoh(map);
	}
	public void updatePbCustBaseInfo1(Map<String,String> map) {
		batchItemDao.updatePbCustBaseInfo1(map);
	}
	public void updatePbCustBaseInfoh1(Map<String,String> map) {
		batchItemDao.updatePbCustBaseInfoh1(map);
	}
	/*
	 * 114个人基本信息整笔删除(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectPbCustDLTInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno= batchItemDao.selectPbCustDLTInfo(map);
		return recordBrno;
	}
	public void updatePbCustDLTInfo(Map<String,String> map) {
		batchItemDao.updatePbCustDLTInfo(map);
	}
	public void updatePbCustDLTInfoh(Map<String,String> map) {
		batchItemDao.updatePbCustDLTInfoh(map);
	}
	public void updatePbCustDLTInfo1(Map<String,String> map) {
		batchItemDao.updatePbCustDLTInfo1(map);
	}
	public void updatePbCustDLTInfoh1(Map<String,String> map) {
		batchItemDao.updatePbCustDLTInfoh1(map);
	}
	/*
	 * 120家族关系信息(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectPbCustFamInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno= batchItemDao.selectPbCustFamInfo(map);
		return recordBrno;
	}
	public void updatePbCustFamInfo(Map<String,String> map) {
		batchItemDao.updatePbCustFamInfo(map);
	}
	public void updatePbCustFamInfoh(Map<String,String> map) {
		batchItemDao.updatePbCustFamInfoh(map);
	}
	public void updatePbCustFamInfo1(Map<String,String> map) {
		batchItemDao.updatePbCustFamInfo1(map);
	}
	public void updatePbCustFamInfoh1(Map<String,String> map) {
		batchItemDao.updatePbCustFamInfoh1(map);
	}
	/*
	 * 130个人证件有效期信息(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectPbCustCtfFltgInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno= batchItemDao.selectPbCustCtfFltgInfo(map);
		return recordBrno;
	}
	public void updatePbCustCtfFltgInfo(Map<String,String> map) {
		batchItemDao.updatePbCustCtfFltgInfo(map);
	}
	public void updatePbCustCtfFltgInfoh(Map<String,String> map) {
		batchItemDao.updatePbCustCtfFltgInfoh(map);
	}
	public void updatePbCustCtfFltgInfo1(Map<String,String> map) {
		batchItemDao.updatePbCustCtfFltgInfo1(map);
	}
	public void updatePbCustCtfFltgInfoh1(Map<String,String> map) {
		batchItemDao.updatePbCustCtfFltgInfoh1(map);
	}
	/*
	 * 140个人证件整合信息记录(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectPbCustDefctInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno= batchItemDao.selectPbCustDefctInfo(map);
		return recordBrno;
	}
	public void updatePbCustDefctInfo(Map<String,String> map) {
		batchItemDao.updatePbCustDefctInfo(map);
	}
	public void updatePbCustDefctInfoh(Map<String,String> map) {
		batchItemDao.updatePbCustDefctInfoh(map);
	}
	public void updatePbCustDefctInfo1(Map<String,String> map) {
		batchItemDao.updatePbCustDefctInfo1(map);
	}
	public void updatePbCustDefctInfoh1(Map<String,String> map) {
		batchItemDao.updatePbCustDefctInfoh1(map);
	}
	/*
	 * 210个人借贷账户信息记录(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectPbLnacctInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno= batchItemDao.selectPbLnacctInfo(map);
		return recordBrno;
	}
	public void updatePbLnacctInfo(Map<String,String> map) {
		batchItemDao.updatePbLnacctInfo(map);
	}
	public void updatePbLnacctInfoh(Map<String,String> map) {
		batchItemDao.updatePbLnacctInfoh(map);
	}
	public void updatePbLnacctInfo1(Map<String,String> map) {
		batchItemDao.updatePbLnacctInfo1(map);
	}
	public void updatePbLnacctInfoh1(Map<String,String> map) {
		batchItemDao.updatePbLnacctInfoh1(map);
	}
	/*
	 * 211 个人借贷账户标识变更请求记录  221  231(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectPbAcctChgInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno= batchItemDao.selectPbAcctChgInfo(map);
		return recordBrno;
	}
	public void updatePbAcctChgInfo(Map<String,String> map) {
		batchItemDao.updatePbAcctChgInfo(map);
	}
	public void updatePbAcctChgInfoh(Map<String,String> map) {
		batchItemDao.updatePbAcctChgInfoh(map);
	}
	public void updatePbAcctChgInfo1(Map<String,String> map) {
		batchItemDao.updatePbAcctChgInfo1(map);
	}
	public void updatePbAcctChgInfoh1(Map<String,String> map) {
		batchItemDao.updatePbAcctChgInfoh1(map);
	}
	
	/*
	 * 211 个人借贷账户标识变更请求记录  221  231(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectPbAcctMdfInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno= batchItemDao.selectPbAcctMdfInfo(map);
		return recordBrno;
	}
	public void updatePbAcctMdfInfo(Map<String,String> map) {
		batchItemDao.updatePbAcctMdfInfo(map);
	}
	public void updatePbAcctMdfInfoh(Map<String,String> map) {
		batchItemDao.updatePbAcctMdfInfoh(map);
	}
	public void updatePbAcctMdfInfo1(Map<String,String> map) {
		batchItemDao.updatePbAcctMdfInfo1(map);
	}
	public void updatePbAcctMdfInfoh1(Map<String,String> map) {
		batchItemDao.updatePbAcctMdfInfoh1(map);
	}
	/*
	 * 213 个人借贷账户按段删除请求记录   223 233(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectPbAcctDLTInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno= batchItemDao.selectPbAcctDLTInfo(map);
		return recordBrno;
	}
	public void updatePbAcctDLTInfo(Map<String,String> map) {
		batchItemDao.updatePbAcctDLTInfo(map);
	}
	public void updatePbAcctDLTInfoh(Map<String,String> map) {
		batchItemDao.updatePbAcctDLTInfoh(map);
	}
	public void updatePbAcctDLTInfo1(Map<String,String> map) {
		batchItemDao.updatePbAcctDLTInfo1(map);
	}
	public void updatePbAcctDLTInfoh1(Map<String,String> map) {
		batchItemDao.updatePbAcctDLTInfoh1(map);
	}
	/*
	 *  214 个人借贷账户整笔删除请求记录   224 234 (non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectPbAcctAllDLTInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno= batchItemDao.selectPbAcctAllDLTInfo(map);
		return recordBrno;
	}
	public void updatePbAcctAllDLTInfo(Map<String,String> map) {
		batchItemDao.updatePbAcctAllDLTInfo(map);
	}
	public void updatePbAcctAllDLTInfoh(Map<String,String> map) {
		batchItemDao.updatePbAcctAllDLTInfoh(map);
	}
	public void updatePbAcctAllDLTInfo1(Map<String,String> map) {
		batchItemDao.updatePbAcctAllDLTInfo1(map);
	}
	public void updatePbAcctAllDLTInfoh1(Map<String,String> map) {
		batchItemDao.updatePbAcctAllDLTInfoh1(map);
	}
	/*
	 *  215 个人借贷账户特殊事件说明记录 (non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectPbLnspcEvtInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno= batchItemDao.selectPbLnspcEvtInfo(map);
		return recordBrno;
	}
	public void updatePbLnspcEvtInfo(Map<String,String> map) {
		batchItemDao.updatePbLnspcEvtInfo(map);
	}
	public void updatePbLnspcEvtInfoh(Map<String,String> map) {
		batchItemDao.updatePbLnspcEvtInfoh(map);
	}
	public void updatePbLnspcEvtInfo1(Map<String,String> map) {
		batchItemDao.updatePbLnspcEvtInfo1(map);
	}
	public void updatePbLnspcEvtInfoh1(Map<String,String> map) {
		batchItemDao.updatePbLnspcEvtInfoh1(map);
	}
	/*
	 * 220 个人授信协议信息记录 (non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectPbLnctrctBaseInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno= batchItemDao.selectPbLnctrctBaseInfo(map);
		return recordBrno;
	}
	public void updatePbLnctrctBaseInfo(Map<String,String> map) {
		batchItemDao.updatePbLnctrctBaseInfo(map);
	}
	public void updatePbLnctrctBaseInfoh(Map<String,String> map) {
		batchItemDao.updatePbLnctrctBaseInfoh(map);
	}
	public void updatePbLnctrctBaseInfo1(Map<String,String> map) {
		batchItemDao.updatePbLnctrctBaseInfo1(map);
	}
	public void updatePbLnctrctBaseInfoh1(Map<String,String> map) {
		batchItemDao.updatePbLnctrctBaseInfoh1(map);
	}
	/*
	 *  230 个人担保账户信息记录 (non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectPbLnsecAcctInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno= batchItemDao.selectPbLnsecAcctInfo(map);
		return recordBrno;
	}
	public void updatePbLnsecAcctInfo(Map<String,String> map) {
		batchItemDao.updatePbLnsecAcctInfo(map);
	}
	public void updatePbLnsecAcctInfoh(Map<String,String> map) {
		batchItemDao.updatePbLnsecAcctInfoh(map);
	}
	public void updatePbLnsecAcctInfo1(Map<String,String> map) {
		batchItemDao.updatePbLnsecAcctInfo1(map);
	}
	public void updatePbLnsecAcctInfoh1(Map<String,String> map) {
		batchItemDao.updatePbLnsecAcctInfoh1(map);
	}
	/*
	 *  310 企业基本信息记录  (non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectEbCustBaseInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbCustBaseInfo(map);
		return recordBrno;
	}
	public void updateEbCustBaseInfo(Map<String,String> map) {
		batchItemDao.updateEbCustBaseInfo(map);
	}
	public void updateEbCustBaseInfoh(Map<String,String> map) {
		batchItemDao.updateEbCustBaseInfoh(map);
	}
	public void updateEbCustBaseInfo1(Map<String,String> map) {
		batchItemDao.updateEbCustBaseInfo1(map);
	}
	public void updateEbCustBaseInfoh1(Map<String,String> map) {
		batchItemDao.updateEbCustBaseInfoh1(map);
	}
	/*
	 *  314 企业基本信息整笔删除请求记录  (non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectEbCustDLTInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbCustDLTInfo(map);
		return recordBrno;
	}
	public void updateEbCustDLTInfo(Map<String,String> map) {
		batchItemDao.updateEbCustDLTInfo(map);
	}
	public void updateEbCustDLTInfoh(Map<String,String> map) {
		batchItemDao.updateEbCustDLTInfoh(map);
	}
	public void updateEbCustDLTInfo1(Map<String,String> map) {
		batchItemDao.updateEbCustDLTInfo1(map);
	}
	public void updateEbCustDLTInfoh1(Map<String,String> map) {
		batchItemDao.updateEbCustDLTInfoh1(map);
	}
	/*
	 *  340  企业身份标识整合信息记录 (non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectEbCustCtfInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbCustCtfInfo(map);
		return recordBrno;
	}
	public void updateEbCustCtfInfo(Map<String,String> map) {
		batchItemDao.updateEbCustCtfInfo(map);
	}
	public void updateEbCustCtfInfoh(Map<String,String> map) {
		batchItemDao.updateEbCustCtfInfoh(map);
	}
	public void updateEbCustCtfInfo1(Map<String,String> map) {
		batchItemDao.updateEbCustCtfInfo1(map);
	}
	public void updateEbCustCtfInfoh1(Map<String,String> map) {
		batchItemDao.updateEbCustCtfInfoh1(map);
	}
	/*
	 *  350  企业间关联关系信息记录 (non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectEbCustRltInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbCustRltInfo(map);
		return recordBrno;
	}
	public void updateEbCustRltInfo(Map<String,String> map) {
		batchItemDao.updateEbCustCtfInfo(map);
	}
	public void updateEbCustRltInfoh(Map<String,String> map) {
		batchItemDao.updateEbCustCtfInfoh(map);
	}
	public void updateEbCustRltInfo1(Map<String,String> map) {
		batchItemDao.updateEbCustCtfInfo1(map);
	}
	public void updateEbCustRltInfoh1(Map<String,String> map) {
		batchItemDao.updateEbCustCtfInfoh1(map);
	}
	/*
	 *  410  企业借贷账户记录 (non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectEbCorpAcctInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbCorpAcctInfo(map);
		return recordBrno;
	}
	public void updateEbCorpAcctInfo(Map<String,String> map) {
		batchItemDao.updateEbCorpAcctInfo(map);
	}
	public void updateEbCorpAcctInfoh(Map<String,String> map) {
		batchItemDao.updateEbCorpAcctInfoh(map);
	}
	public void updateEbCorpAcctInfo1(Map<String,String> map) {
		batchItemDao.updateEbCorpAcctInfo1(map);
	}
	public void updateEbCorpAcctInfoh1(Map<String,String> map) {
		batchItemDao.updateEbCorpAcctInfoh1(map);
	}
	/*
	 * 411  企业借贷账户标识变更请求记录 421 441 (non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectEbAcctChgInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbAcctChgInfo(map);
		return recordBrno;
	}
	public void updateEbAcctChgInfo(Map<String,String> map) {
		batchItemDao.updateEbAcctChgInfo(map);
	}
	public void updateEbAcctChgInfoh(Map<String,String> map) {
		batchItemDao.updateEbAcctChgInfoh(map);
	}
	public void updateEbAcctChgInfo1(Map<String,String> map) {
		batchItemDao.updateEbAcctChgInfo1(map);
	}
	public void updateEbAcctChgInfoh1(Map<String,String> map) {
		batchItemDao.updateEbAcctChgInfoh1(map);
	}
	/*
	 * 412    企业借贷账户更正请求记录 422 442 (non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectEbAcctMdfInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbAcctMdfInfo(map);
		return recordBrno;
	}
	public void updateEbAcctMdfInfo(Map<String,String> map) {
		batchItemDao.updateEbAcctMdfInfo(map);
	}
	public void updateEbAcctMdfInfoh(Map<String,String> map) {
		batchItemDao.updateEbAcctMdfInfoh(map);
	}
	public void updateEbAcctMdfInfo1(Map<String,String> map) {
		batchItemDao.updateEbAcctMdfInfo1(map);
	}
	public void updateEbAcctMdfInfoh1(Map<String,String> map) {
		batchItemDao.updateEbAcctMdfInfoh1(map);
	}
	/*
	 * 413    企业借贷账户按段删除请求记录 423 443 (non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectEbAcctDLTInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbAcctDLTInfo(map);
		return recordBrno;
	}
	public void updateEbAcctDLTInfo(Map<String,String> map) {
		batchItemDao.updateEbAcctDLTInfo(map);
	}
	public void updateEbAcctDLTInfoh(Map<String,String> map) {
		batchItemDao.updateEbAcctDLTInfoh(map);
	}
	public void updateEbAcctDLTInfo1(Map<String,String> map) {
		batchItemDao.updateEbAcctDLTInfo1(map);
	}
	public void updateEbAcctDLTInfoh1(Map<String,String> map) {
		batchItemDao.updateEbAcctDLTInfoh1(map);
	}
	/*
	 * 414    企业借贷账户整笔删除请求记录 424 444(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectEbAcctAllDLTInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbAcctAllDLTInfo(map);
		return recordBrno;
	}
	public void updateEbAcctAllDLTInfo(Map<String,String> map) {
		batchItemDao.updateEbAcctAllDLTInfo(map);
	}
	public void updateEbAcctAllDLTInfoh(Map<String,String> map) {
		batchItemDao.updateEbAcctAllDLTInfoh(map);
	}
	public void updateEbAcctAllDLTInfo1(Map<String,String> map) {
		batchItemDao.updateEbAcctAllDLTInfo1(map);
	}
	public void updateEbAcctAllDLTInfoh1(Map<String,String> map) {
		batchItemDao.updateEbAcctAllDLTInfoh1(map);
	}
	/*
	 * 420    企业授信协议信息记录(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectEbCorpCtrInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbCorpCtrInfo(map);
		return recordBrno;
	}
	public void updateEbCorpCtrInfo(Map<String,String> map) {
		batchItemDao.updateEbCorpCtrInfo(map);
	}
	public void updateEbCorpCtrInfoh(Map<String,String> map) {
		batchItemDao.updateEbCorpCtrInfoh(map);
	}
	public void updateEbCorpCtrInfo1(Map<String,String> map) {
		batchItemDao.updateEbCorpCtrInfo1(map);
	}
	public void updateEbCorpCtrInfoh1(Map<String,String> map) {
		batchItemDao.updateEbCorpCtrInfoh1(map);
	}
	/*
	 *440    企业担保交易信息相关记录(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	public String selectEbGuArAccInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbGuArAccInfo(map);
		return recordBrno;
	}
	public void updateEbGuArAccInfo(Map<String,String> map) {
		batchItemDao.updateEbGuArAccInfo(map);
	}
	public void updateEbGuArAccInfoh(Map<String,String> map) {
		batchItemDao.updateEbGuArAccInfoh(map);
	}
	public void updateEbGuArAccInfo1(Map<String,String> map) {
		batchItemDao.updateEbGuArAccInfo1(map);
	}
	public void updateEbGuArAccInfoh1(Map<String,String> map) {
		batchItemDao.updateEbGuArAccInfoh1(map);
	}
	/*
	 *510    抵（质）押合同信息记录(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	//个人
	public String selectYpGuAcctInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectYpGuAcctInfo(map);
		return recordBrno;
	}
	public void updateYpGuAcctInfo(Map<String,String> map) {
		batchItemDao.updateYpGuAcctInfo(map);
	}
	public void updateYpGuAcctInfoh(Map<String,String> map) {
		batchItemDao.updateYpGuAcctInfoh(map);
	}
	public void updateYpGuAcctInfo1(Map<String,String> map) {
		batchItemDao.updateYpGuAcctInfo1(map);
	}
	public void updateYpGuAcctInfoh1(Map<String,String> map) {
		batchItemDao.updateYpGuAcctInfoh1(map);
	}
	//企业
	public String selectYpGuAcctImpInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectYpGuAcctImpInfo(map);
		return recordBrno;
	}
	public void updateYpGuAcctImpInfo(Map<String,String> map) {
		batchItemDao.updateYpGuAcctImpInfo(map);
	}
	public void updateYpGuAcctImpInfoh(Map<String,String> map) {
		batchItemDao.updateYpGuAcctImpInfoh(map);
	}
	public void updateYpGuAcctImpInfo1(Map<String,String> map) {
		batchItemDao.updateYpGuAcctImpInfo1(map);
	}
	public void updateYpGuAcctImpInfoh1(Map<String,String> map) {
		batchItemDao.updateYpGuAcctImpInfoh1(map);
	}
	/*
	 *511   抵（质）押合同标识变更请求记录(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	//个人
	public String selectYpAcctChgInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectYpAcctChgInfo(map);
		return recordBrno;
	}
	public void updateYpAcctChgInfo(Map<String,String> map) {
		batchItemDao.updateYpAcctChgInfo(map);
	}
	public void updateYpAcctChgInfoh(Map<String,String> map) {
		batchItemDao.updateYpAcctChgInfoh(map);
	}
	public void updateYpAcctChgInfo1(Map<String,String> map) {
		batchItemDao.updateYpAcctChgInfo1(map);
	}
	public void updateYpAcctChgInfoh1(Map<String,String> map) {
		batchItemDao.updateYpAcctChgInfoh1(map);
	}
	//企业
	public String selectYeAcctChgInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectYeAcctChgInfo(map);
		return recordBrno;
	}
	public void updateYeAcctChgInfo(Map<String,String> map) {
		batchItemDao.updateYeAcctChgInfo(map);
	}
	public void updateYeAcctChgInfoh(Map<String,String> map) {
		batchItemDao.updateYeAcctChgInfoh(map);
	}
	public void updateYeAcctChgInfo1(Map<String,String> map) {
		batchItemDao.updateYeAcctChgInfo1(map);
	}
	public void updateYeAcctChgInfoh1(Map<String,String> map) {
		batchItemDao.updateYeAcctChgInfoh1(map);
	}
	/*
	 *514 抵（质）押合同整笔删除请求记录(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	//个人
	public String selectYpAcctAllDLTInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectYpAcctAllDLTInfo(map);
		return recordBrno;
	}
	public void updateYpAcctAllDLTInfo(Map<String,String> map) {
		batchItemDao.updateYpAcctAllDLTInfo(map);
	}
	public void updateYpAcctAllDLTInfoh(Map<String,String> map) {
		batchItemDao.updateYpAcctAllDLTInfoh(map);
	}
	public void updateYpAcctAllDLTInfo1(Map<String,String> map) {
		batchItemDao.updateYpAcctAllDLTInfo1(map);
	}
	public void updateYpAcctAllDLTInfoh1(Map<String,String> map) {
		batchItemDao.updateYpAcctAllDLTInfoh1(map);
	}
	//企业
	public String selectYeAcctAllDLTInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectYeAcctAllDLTInfo(map);
		return recordBrno;
	}
	public void updateYeAcctAllDLTInfo(Map<String,String> map) {
		batchItemDao.updateYeAcctAllDLTInfo(map);
	}
	public void updateYeAcctAllDLTInfoh(Map<String,String> map) {
		batchItemDao.updateYeAcctAllDLTInfoh(map);
	}
	public void updateYeAcctAllDLTInfo1(Map<String,String> map) {
		batchItemDao.updateYeAcctAllDLTInfo1(map);
	}
	public void updateYeAcctAllDLTInfoh1(Map<String,String> map) {
		batchItemDao.updateYeAcctAllDLTInfoh1(map);
	}
	/*
	 *610  企业资产负债表信息记录(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	//02版
	public String selectEbFinaBal02Info(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbFinaBal02Info(map);
		return recordBrno;
	}
	public void updateEbFinaBal02Info(Map<String,String> map) {
		batchItemDao.updateEbFinaBal02Info(map);
	}
	public void updateEbFinaBal02Infoh(Map<String,String> map) {
		batchItemDao.updateEbFinaBal02Infoh(map);
	}
	public void updateEbFinaBal02Info1(Map<String,String> map) {
		batchItemDao.updateEbFinaBal02Info1(map);
	}
	public void updateEbFinaBal02Infoh1(Map<String,String> map) {
		batchItemDao.updateEbFinaBal02Infoh1(map);
	}
	//07版
	public String selectEbFinaBal07Info(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbFinaBal07Info(map);
		return recordBrno;
	}
	public void updateEbFinaBal07Info(Map<String,String> map) {
		batchItemDao.updateEbFinaBal07Info(map);
	}
	public void updateEbFinaBal07Infoh(Map<String,String> map) {
		batchItemDao.updateEbFinaBal07Infoh(map);
	}
	public void updateEbFinaBal07Info1(Map<String,String> map) {
		batchItemDao.updateEbFinaBal07Info1(map);
	}
	public void updateEbFinaBal07Infoh1(Map<String,String> map) {
		batchItemDao.updateEbFinaBal07Infoh1(map);
	}
	/*
	 *620  企业利润及利润分配表信息记录(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	//02版
	public String selectEbFinaPro02Info(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbFinaPro02Info(map);
		return recordBrno;
	}
	public void updateEbFinaPro02Info(Map<String,String> map) {
		batchItemDao.updateEbFinaPro02Info(map);
	}
	public void updateEbFinaPro02Infoh(Map<String,String> map) {
		batchItemDao.updateEbFinaPro02Infoh(map);
	}
	public void updateEbFinaPro02Info1(Map<String,String> map) {
		batchItemDao.updateEbFinaPro02Info1(map);
	}
	public void updateEbFinaPro02Infoh1(Map<String,String> map) {
		batchItemDao.updateEbFinaPro02Infoh1(map);
	}
	//07版
	public String selectEbFinaPro07Info(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbFinaPro07Info(map);
		return recordBrno;
	}
	public void updateEbFinaPro07Info(Map<String,String> map) {
		batchItemDao.updateEbFinaPro07Info(map);
	}
	public void updateEbFinaPro07Infoh(Map<String,String> map) {
		batchItemDao.updateEbFinaPro07Infoh(map);
	}
	public void updateEbFinaPro07Info1(Map<String,String> map) {
		batchItemDao.updateEbFinaPro07Info1(map);
	}
	public void updateEbFinaPro07Infoh1(Map<String,String> map) {
		batchItemDao.updateEbFinaPro07Infoh1(map);
	}
	/*
	 *630  企业现金流量表信息记录(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	//02版
	public String selectEbFinaCsh02Info(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbFinaCsh02Info(map);
		return recordBrno;
	}
	public void updateEbFinaCsh02Info(Map<String,String> map) {
		batchItemDao.updateEbFinaCsh02Info(map);
	}
	public void updateEbFinaCsh02Infoh(Map<String,String> map) {
		batchItemDao.updateEbFinaCsh02Infoh(map);
	}
	public void updateEbFinaCsh02Info1(Map<String,String> map) {
		batchItemDao.updateEbFinaCsh02Info1(map);
	}
	public void updateEbFinaCsh02Infoh1(Map<String,String> map) {
		batchItemDao.updateEbFinaCsh02Infoh1(map);
	}
	//07版
	public String selectEbFinaCsh07Info(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbFinaCsh07Info(map);
		return recordBrno;
	}
	public void updateEbFinaCsh07Info(Map<String,String> map) {
		batchItemDao.updateEbFinaCsh07Info(map);
	}
	public void updateEbFinaCsh07Infoh(Map<String,String> map) {
		batchItemDao.updateEbFinaCsh07Infoh(map);
	}
	public void updateEbFinaCsh07Info1(Map<String,String> map) {
		batchItemDao.updateEbFinaCsh07Info1(map);
	}
	public void updateEbFinaCsh07Infoh1(Map<String,String> map) {
		batchItemDao.updateEbFinaCsh07Infoh1(map);
	}
	/*
	 *640  事业单位资产负债表信息记录(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	//02版
	public String selectEbFinaInsbalInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbFinaInsbalInfo(map);
		return recordBrno;
	}
	public void updateEbFinaInsbalInfo(Map<String,String> map) {
		batchItemDao.updateEbFinaInsbalInfo(map);
	}
	public void updateEbFinaInsbalInfoh(Map<String,String> map) {
		batchItemDao.updateEbFinaInsbalInfoh(map);
	}
	public void updateEbFinaInsbalInfo1(Map<String,String> map) {
		batchItemDao.updateEbFinaInsbalInfo1(map);
	}
	public void updateEbFinaInsbalInfoh1(Map<String,String> map) {
		batchItemDao.updateEbFinaInsbalInfoh1(map);
	}
	/*
	 *650  事业单位收入支出表信息记录(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	//02版
	public String selectEbFinaIncexpInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbFinaIncexpInfo(map);
		return recordBrno;
	}
	public void updateEbFinaIncexpInfo(Map<String,String> map) {
		batchItemDao.updateEbFinaIncexpInfo(map);
	}
	public void updateEbFinaIncexpInfoh(Map<String,String> map) {
		batchItemDao.updateEbFinaIncexpInfoh(map);
	}
	public void updateEbFinaIncexpInfo1(Map<String,String> map) {
		batchItemDao.updateEbFinaIncexpInfo1(map);
	}
	public void updateEbFinaIncexpInfoh1(Map<String,String> map) {
		batchItemDao.updateEbFinaIncexpInfoh1(map);
	}
	/*
	 * 614  企业资产负债表整笔删除请求记录(non-Javadoc)
	 * @see com.dhcc.xml.parse.bo.BatchItemBo#selectPbCustDLTInfo(java.util.Map)
	 */
	//02版
	public String selectEbNaDLTInfo(Map<String,String> map) {
		String recordBrno;
		recordBrno=batchItemDao.selectEbNaDLTInfo(map);
		return recordBrno;
	}
	public void updateEbNaDLTInfo(Map<String,String> map) {
		batchItemDao.updateEbNaDLTInfo(map);
	}
	public void updateEbNaDLTInfoh(Map<String,String> map) {
		batchItemDao.updateEbNaDLTInfoh(map);
	}
	public void updateEbNaDLTInfo1(Map<String,String> map) {
		batchItemDao.updateEbNaDLTInfo1(map);
	}
	public void updateEbNaDLTInfoh1(Map<String,String> map) {
		batchItemDao.updateEbNaDLTInfoh1(map);
	}
	
	
	
	
	
	
	
	public BatchItemDao getBatchItemDao() {
		return batchItemDao;
	}

	public void setBatchItemDao(BatchItemDao batchItemDao) {
		this.batchItemDao = batchItemDao;
	}

}
