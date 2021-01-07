package com.dhcc.xml.service;

import com.dhcc.xml.entity.BatchExecuteInfo;
import com.dhcc.xml.entity.BatchJob;
import com.dhcc.xml.entity.MessageInfo;

import java.util.List;
import java.util.Map;

public interface MessageInfoService {
    /**
     * Title: insertMessageInfo<br\>
     * Description:将生成报文信息 插入数据库<br\>
     */
    public void insertMessageInfo(String statement, MessageInfo messageInfo);
    /**
     * Title: updateMessageInfo<br\>
     * Description: 更新对应的报文信息<br\>
     */
    public String updateMessageInfo(String statement, MessageInfo messageInfo);
    /**
     * Title: updateRptType<br\>
     * Description:生成报文后更新对应表数据上报状态<br\>
     */
    public String updateRptType(String statement, Map<String, String> map);
    /**
     * Title: updateFileName<br\>
     * Description:生成报文后更新对应表数据报文名称<br\>
     */
    public String updateFileName(String statement, Map<String, String> map);
    /**
     * Title: getBatchJob<br\>
     * Description:获取生成报文节点入口<br\>
     */
    public BatchJob getBatchJob(String statement, BatchJob batchJob);
    /**
     * Title: insertExecuteInfo<br\>
     * Description: 报文生产插入执行情况信息表<br\>
     */
    public void insertExecuteInfo(String statement, BatchExecuteInfo batchExecuteInfo);
    /**
     * Title: updateExecuteInfo<br\>
     * Description: 报文生产更新执行情况信息表<br\>
     */
    public String updateExecuteInfo(String statement, BatchExecuteInfo batchExecuteInfo);
    /**
     * Title: getBatchJobList<br\>
     * Description:获取所有的BatchJob列表 <br\>
     */
    public List<BatchJob> getBatchJobList(String statement);
    public String updateErrorTable(String statement, String mainTableName);
    public String updateCheckSts(String statement, String mainTableName);
    //根据信息记录类型查询batchjob
    public String SingleupdateErrorTable(String statement, Map<String, String> SingleMap);
    public String SingleupdateCheckSts(String statement, Map<String, String> SingleMap);
    public List<BatchJob> getBatchJobup(String statement , String infrence);
    /**
     * Title: getCount_ExcuteSts<br\>
     * Description:获取正在跑批的步骤数 <br\>
     */
    public int getCount_ExcuteSts(String statement);
    public Object getMessageObject(String statement, Map<String, String> map);
    /** 单笔校验删除对应的错误表信息*/
    public int deleteSingleErrorInfo(Map<String,String> map);
    /**批量校验删除对应的错误信息*/
    public int deleteErrorInfo(Map<String,String> map);

}
