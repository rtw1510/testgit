package com.dhcc.xml.parse.service;

import com.dhcc.xml.parse.entity.V_ERROR_INFO;

import java.util.Map;

/**  
  * Title: BatchItemBo<br/>  
  * Description: 批处理业务对象层<br/>  
  * @author ChenJingYuan  
  * @date 2018-8-4  
  */  
public interface BatchItemService {
	/**  
	 * Title: insertFBErrorInfo<br\>  
	 * Description: 将反馈报文的内容解析插入到数据库<br\>  
	 * @return 插入条数
	 * @return String 
	 * @throws 
	 */ 
	public void insertFBErrorInfo(V_ERROR_INFO v_error_info);
	
	
	/**
	 * 110 110个人基本信息
	 * @param map
	 * @return
	 */
	public String selectPbCustBaseInfo(Map<String,String> map);
	public void updatePbCustBaseInfo(Map<String,String> map);
	public void updatePbCustBaseInfoh(Map<String,String> map);
	public void updatePbCustBaseInfo1(Map<String,String> map);//反馈报文有错误时修改在原来表中的修改状态110
	public void updatePbCustBaseInfoh1(Map<String,String> map);//反馈报文有错误时修改历史表在原来表中的修改状态110
	/**
	 * 114个人基本信息整笔删除
	 * @param record_id
	 * @param filename
	 * @return
	 */
	public String selectPbCustDLTInfo(Map<String,String> map);////个人基本信息整笔删除请求记录114
	public void updatePbCustDLTInfo(Map<String,String> map);////个人基本信息整笔删除请求记录114
	public void updatePbCustDLTInfoh(Map<String,String> map);////个人基本信息整笔删除请求记录历史114
	public void updatePbCustDLTInfo1(Map<String,String> map);////个人基本信息整笔删除请求记录114
	public void updatePbCustDLTInfoh1(Map<String,String> map);////个人基本信息整笔删除请求记录历史114
	/**
	 * 120家族关系信息
	 * @param record_id
	 * @param filename
	 * @return
	 */
	public String selectPbCustFamInfo(Map<String,String> map);//////家族关系信息记录120
	public void updatePbCustFamInfo(Map<String,String> map);//////家族关系信息记录120
	public void updatePbCustFamInfoh(Map<String,String> map);//////家族关系信息记录120
	public void updatePbCustFamInfo1(Map<String,String> map);//////家族关系信息记录120
	public void updatePbCustFamInfoh1(Map<String,String> map);//////家族关系信息记录120	
	/**
	 * 130个人证件有效期信息
	 * @param map
	 * @return
	 */
	public String selectPbCustCtfFltgInfo(Map<String,String> map);
	public void updatePbCustCtfFltgInfo(Map<String,String> map);
	public void updatePbCustCtfFltgInfoh(Map<String,String> map);
	public void updatePbCustCtfFltgInfo1(Map<String,String> map);
	public void updatePbCustCtfFltgInfoh1(Map<String,String> map);
	/**
	 * 140个人证件整合信息记录
	 * @param map
	 * @return
	 */
	public String selectPbCustDefctInfo(Map<String,String> map);
	public void updatePbCustDefctInfo(Map<String,String> map);
	public void updatePbCustDefctInfoh(Map<String,String> map);
	public void updatePbCustDefctInfo1(Map<String,String> map);
	public void updatePbCustDefctInfoh1(Map<String,String> map);

	/**
	 * 210个人借贷账户信息记录
	 * @param map
	 * @return
	 */
	public String selectPbLnacctInfo(Map<String,String> map);
	public void updatePbLnacctInfo(Map<String,String> map);
	public void updatePbLnacctInfoh(Map<String,String> map);
	public void updatePbLnacctInfo1(Map<String,String> map);
	public void updatePbLnacctInfoh1(Map<String,String> map);
	/**
	 * 211 个人借贷账户标识变更请求记录  221  231
	 * @param map
	 * @return
	 */
	public String selectPbAcctChgInfo(Map<String,String> map);
	public void updatePbAcctChgInfo(Map<String,String> map);
	public void updatePbAcctChgInfoh(Map<String,String> map);
	public void updatePbAcctChgInfo1(Map<String,String> map);
	public void updatePbAcctChgInfoh1(Map<String,String> map);
	
	/**
	 * 212 个人借贷账户按段更正请求记录    232 
	 * @param map
	 * @return
	 */
	public String selectPbAcctMdfInfo(Map<String,String> map); 
	public void updatePbAcctMdfInfo(Map<String,String> map);
	public void updatePbAcctMdfInfoh(Map<String,String> map);
	public void updatePbAcctMdfInfo1(Map<String,String> map);
	public void updatePbAcctMdfInfoh1(Map<String,String> map);
	/**
	 * 213 个人借贷账户按段删除请求记录   223 233 
	 * @param map
	 * @return
	 */
	public String selectPbAcctDLTInfo(Map<String,String> map); 
	public void updatePbAcctDLTInfo(Map<String,String> map);
	public void updatePbAcctDLTInfoh(Map<String,String> map);
	public void updatePbAcctDLTInfo1(Map<String,String> map);
	public void updatePbAcctDLTInfoh1(Map<String,String> map);
	/**
	 * 214 个人借贷账户整笔删除请求记录   224 234 
	 * @param map
	 * @return
	 */
	public String selectPbAcctAllDLTInfo(Map<String,String> map); 
	public void updatePbAcctAllDLTInfo(Map<String,String> map);
	public void updatePbAcctAllDLTInfoh(Map<String,String> map);
	public void updatePbAcctAllDLTInfo1(Map<String,String> map);
	public void updatePbAcctAllDLTInfoh1(Map<String,String> map);
	/**
	 * 215 个人借贷账户特殊事件说明记录
	 * @param map
	 * @return
	 */
	public String selectPbLnspcEvtInfo(Map<String,String> map); 
	public void updatePbLnspcEvtInfo(Map<String,String> map);
	public void updatePbLnspcEvtInfoh(Map<String,String> map);
	public void updatePbLnspcEvtInfo1(Map<String,String> map);
	public void updatePbLnspcEvtInfoh1(Map<String,String> map);
	/**
	 * 220 个人授信协议信息记录
	 * @param map
	 * @return
	 */
	public String selectPbLnctrctBaseInfo(Map<String,String> map); 
	public void updatePbLnctrctBaseInfo(Map<String,String> map);
	public void updatePbLnctrctBaseInfoh(Map<String,String> map);
	public void updatePbLnctrctBaseInfo1(Map<String,String> map);
	public void updatePbLnctrctBaseInfoh1(Map<String,String> map);
	/**
	 * 230 个人担保账户信息记录
	 * @param map
	 * @return
	 */
	public String selectPbLnsecAcctInfo(Map<String,String> map); 
	public void updatePbLnsecAcctInfo(Map<String,String> map);
	public void updatePbLnsecAcctInfoh(Map<String,String> map);
	public void updatePbLnsecAcctInfo1(Map<String,String> map);
	public void updatePbLnsecAcctInfoh1(Map<String,String> map);
	
	/**
	 * 310 企业基本信息记录 
	 * @param map
	 * @return
	 */
	public String selectEbCustBaseInfo(Map<String,String> map);
	public void updateEbCustBaseInfo(Map<String,String> map);
	public void updateEbCustBaseInfoh(Map<String,String> map);
	public void updateEbCustBaseInfo1(Map<String,String> map);
	public void updateEbCustBaseInfoh1(Map<String,String> map);
	/**
	 * 314 企业基本信息整笔删除请求记录
	 * @param map
	 * @return
	 */
	public String selectEbCustDLTInfo(Map<String,String> map);
	public void updateEbCustDLTInfo(Map<String,String> map);
	public void updateEbCustDLTInfoh(Map<String,String> map);	
	public void updateEbCustDLTInfo1(Map<String,String> map);
	public void updateEbCustDLTInfoh1(Map<String,String> map);
	/**
	 * 340  企业身份标识整合信息记录
	 * @param map
	 * @return
	 */
	public String selectEbCustCtfInfo(Map<String,String> map);
	public void updateEbCustCtfInfo(Map<String,String> map);
	public void updateEbCustCtfInfoh(Map<String,String> map);	
	public void updateEbCustCtfInfo1(Map<String,String> map);
	public void updateEbCustCtfInfoh1(Map<String,String> map);
	/**
	 * 350  企业间关联关系信息记录
	 * @param map
	 * @return
	 */
	public String selectEbCustRltInfo(Map<String,String> map);
	public void updateEbCustRltInfo(Map<String,String> map);
	public void updateEbCustRltInfoh(Map<String,String> map);
	public void updateEbCustRltInfo1(Map<String,String> map);
	public void updateEbCustRltInfoh1(Map<String,String> map);
	/**
	 * 410  企业借贷账户记录
	 * @param map
	 * @return
	 */
	public String selectEbCorpAcctInfo(Map<String,String> map);
	public void updateEbCorpAcctInfo(Map<String,String> map);
	public void updateEbCorpAcctInfoh(Map<String,String> map);
	public void updateEbCorpAcctInfo1(Map<String,String> map);
	public void updateEbCorpAcctInfoh1(Map<String,String> map);
	
	/**
	 * 411  企业借贷账户标识变更请求记录 421 441
	 * @param map
	 * @return
	 */
	public String selectEbAcctChgInfo(Map<String,String> map);
	public void updateEbAcctChgInfo(Map<String,String> map);
	public void updateEbAcctChgInfoh(Map<String,String> map);
	public void updateEbAcctChgInfo1(Map<String,String> map);
	public void updateEbAcctChgInfoh1(Map<String,String> map);
	/**
	 * 412    企业借贷账户更正请求记录 422 442
	 * @param map
	 * @return
	 */
	public String selectEbAcctMdfInfo(Map<String,String> map);
	public void updateEbAcctMdfInfo(Map<String,String> map);
	public void updateEbAcctMdfInfoh(Map<String,String> map);
	public void updateEbAcctMdfInfo1(Map<String,String> map);
	public void updateEbAcctMdfInfoh1(Map<String,String> map);
	/**
	 * 413    企业借贷账户按段删除请求记录 423 443
	 * @param map
	 * @return
	 */
	public String selectEbAcctDLTInfo(Map<String,String> map);
	public void updateEbAcctDLTInfo(Map<String,String> map);
	public void updateEbAcctDLTInfoh(Map<String,String> map);
	public void updateEbAcctDLTInfo1(Map<String,String> map);
	public void updateEbAcctDLTInfoh1(Map<String,String> map);
	/**
	 * 414    企业借贷账户整笔删除请求记录 424 444
	 * @param map
	 * @return
	 */
	public String selectEbAcctAllDLTInfo(Map<String,String> map);
	public void updateEbAcctAllDLTInfo(Map<String,String> map);
	public void updateEbAcctAllDLTInfoh(Map<String,String> map);
	public void updateEbAcctAllDLTInfo1(Map<String,String> map);
	public void updateEbAcctAllDLTInfoh1(Map<String,String> map);
	
	/**
	 * 420    企业授信协议信息记录
	 * @param map
	 * @return
	 */
	public String selectEbCorpCtrInfo(Map<String,String> map);
	public void updateEbCorpCtrInfo(Map<String,String> map);
	public void updateEbCorpCtrInfoh(Map<String,String> map);
	public void updateEbCorpCtrInfo1(Map<String,String> map);
	public void updateEbCorpCtrInfoh1(Map<String,String> map);
	/**
	 * 440    企业担保交易信息相关记录
	 * @param map
	 * @return
	 */
	public String selectEbGuArAccInfo(Map<String,String> map);
	public void updateEbGuArAccInfo(Map<String,String> map);
	public void updateEbGuArAccInfoh(Map<String,String> map);
	public void updateEbGuArAccInfo1(Map<String,String> map);
	public void updateEbGuArAccInfoh1(Map<String,String> map);
	/**
	 * 510    抵（质）押合同信息记录
	 * @param map
	 * @return
	 */
	//个人
	public String selectYpGuAcctInfo(Map<String,String> map);
	public void updateYpGuAcctInfo(Map<String,String> map);
	public void updateYpGuAcctInfoh(Map<String,String> map);
	public void updateYpGuAcctInfo1(Map<String,String> map);
	public void updateYpGuAcctInfoh1(Map<String,String> map);
	//企业
	public String selectYpGuAcctImpInfo(Map<String,String> map);
	public void updateYpGuAcctImpInfo(Map<String,String> map);
	public void updateYpGuAcctImpInfoh(Map<String,String> map);
	public void updateYpGuAcctImpInfo1(Map<String,String> map);
	public void updateYpGuAcctImpInfoh1(Map<String,String> map);
	/**
	 * 511   抵（质）押合同标识变更请求记录
	 * @param map
	 * @return
	 */
	//个人
	public String selectYpAcctChgInfo(Map<String,String> map);
	public void updateYpAcctChgInfo(Map<String,String> map);
	public void updateYpAcctChgInfoh(Map<String,String> map);
	public void updateYpAcctChgInfo1(Map<String,String> map);
	public void updateYpAcctChgInfoh1(Map<String,String> map);
	//企业
	public String selectYeAcctChgInfo(Map<String,String> map);
	public void updateYeAcctChgInfo(Map<String,String> map);
	public void updateYeAcctChgInfoh(Map<String,String> map);
	public void updateYeAcctChgInfo1(Map<String,String> map);
	public void updateYeAcctChgInfoh1(Map<String,String> map);
	
	/**
	 * 514 抵（质）押合同整笔删除请求记录
	 * @param map
	 * @return
	 */
	//个人
	public String selectYpAcctAllDLTInfo(Map<String,String> map);
	public void updateYpAcctAllDLTInfo(Map<String,String> map);
	public void updateYpAcctAllDLTInfoh(Map<String,String> map);
	public void updateYpAcctAllDLTInfo1(Map<String,String> map);
	public void updateYpAcctAllDLTInfoh1(Map<String,String> map);
	//企业
	public String selectYeAcctAllDLTInfo(Map<String,String> map);
	public void updateYeAcctAllDLTInfo(Map<String,String> map);
	public void updateYeAcctAllDLTInfoh(Map<String,String> map);
	public void updateYeAcctAllDLTInfo1(Map<String,String> map);
	public void updateYeAcctAllDLTInfoh1(Map<String,String> map);
	
	/**
	 * 610  企业资产负债表信息记录
	 * @param map
	 * @return
	 */
	//02版
	public String selectEbFinaBal02Info(Map<String,String> map);
	public void updateEbFinaBal02Info(Map<String,String> map);
	public void updateEbFinaBal02Infoh(Map<String,String> map);
	public void updateEbFinaBal02Info1(Map<String,String> map);
	public void updateEbFinaBal02Infoh1(Map<String,String> map);
	//07版
	public String selectEbFinaBal07Info(Map<String,String> map);
	public void updateEbFinaBal07Info(Map<String,String> map);
	public void updateEbFinaBal07Infoh(Map<String,String> map);
	public void updateEbFinaBal07Info1(Map<String,String> map);
	public void updateEbFinaBal07Infoh1(Map<String,String> map);
	/**
	 * 620  企业利润及利润分配表信息记录
	 * @param map
	 * @return
	 */
	//02版
	public String selectEbFinaPro02Info(Map<String,String> map);
	public void updateEbFinaPro02Info(Map<String,String> map);
	public void updateEbFinaPro02Infoh(Map<String,String> map);
	public void updateEbFinaPro02Info1(Map<String,String> map);
	public void updateEbFinaPro02Infoh1(Map<String,String> map);
	//07版
	public String selectEbFinaPro07Info(Map<String,String> map);
	public void updateEbFinaPro07Info(Map<String,String> map);
	public void updateEbFinaPro07Infoh(Map<String,String> map);
	public void updateEbFinaPro07Info1(Map<String,String> map);
	public void updateEbFinaPro07Infoh1(Map<String,String> map);
	/**
	 * 630  企业现金流量表信息记录
	 * @param map
	 * @return
	 */
	//02版
	public String selectEbFinaCsh02Info(Map<String,String> map);
	public void updateEbFinaCsh02Info(Map<String,String> map);
	public void updateEbFinaCsh02Infoh(Map<String,String> map);
	public void updateEbFinaCsh02Info1(Map<String,String> map);
	public void updateEbFinaCsh02Infoh1(Map<String,String> map);
	//07版
	public String selectEbFinaCsh07Info(Map<String,String> map);
	public void updateEbFinaCsh07Info(Map<String,String> map);
	public void updateEbFinaCsh07Infoh(Map<String,String> map);
	public void updateEbFinaCsh07Info1(Map<String,String> map);
	public void updateEbFinaCsh07Infoh1(Map<String,String> map);
	/**
	 * 640  事业单位资产负债表信息记录
	 * @param map
	 * @return
	 */
	public String selectEbFinaInsbalInfo(Map<String,String> map);
	public void updateEbFinaInsbalInfo(Map<String,String> map);
	public void updateEbFinaInsbalInfoh(Map<String,String> map);
	public void updateEbFinaInsbalInfo1(Map<String,String> map);
	public void updateEbFinaInsbalInfoh1(Map<String,String> map);
	/**
	 * 650  事业单位收入支出表信息记录
	 * @param map
	 * @return
	 */
	public String selectEbFinaIncexpInfo(Map<String,String> map);
	public void updateEbFinaIncexpInfo(Map<String,String> map);
	public void updateEbFinaIncexpInfoh(Map<String,String> map);
	public void updateEbFinaIncexpInfo1(Map<String,String> map);
	public void updateEbFinaIncexpInfoh1(Map<String,String> map);
	/**
	 * 614  企业资产负债表整笔删除请求记录
	 * @param map
	 * @return
	 */
	public String selectEbNaDLTInfo(Map<String,String> map);
	public void updateEbNaDLTInfo(Map<String,String> map);
	public void updateEbNaDLTInfoh(Map<String,String> map);
	public void updateEbNaDLTInfo1(Map<String,String> map);
	public void updateEbNaDLTInfoh1(Map<String,String> map);
}
