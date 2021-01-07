package com.dhcc.xml.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dhcc.xml.entity.BatchExecuteInfo;
import com.dhcc.xml.entity.BatchJob;
import com.dhcc.xml.entity.MessageInfo;
import com.dhcc.xml.service.MessageInfoService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageInfoService")
public class MessageInfoServiceImpl implements MessageInfoService {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @SuppressWarnings("deprecation")
    @Override
    public void insertMessageInfo(String statement, MessageInfo messageInfo) {
        sqlSessionTemplate.insert(statement, messageInfo);
    }

    @Override
    public String updateMessageInfo(String statement, MessageInfo messageInfo) {
        int count = (int)sqlSessionTemplate.update(statement, messageInfo);
        return count+"";
    }

    @Override
    public String updateRptType(String statement, Map<String, String> map) {
        int count = (int)sqlSessionTemplate.update(statement, map);
        return count+"";
    }

    @Override
    public String updateFileName(String statement, Map<String, String> map) {
        int count = (int)sqlSessionTemplate.update(statement, map);
        return count+"";
    }
    /**
     * Title: getBatchJob<br\>
     * Description:获取生成报文节点入口<br\>
     */
    public BatchJob getBatchJob(String statement, BatchJob batchJob){
        return (BatchJob)sqlSessionTemplate.selectOne(statement,batchJob);
    }
    /**
     * Title: insertExecuteInfo<br\>
     * Description: 报文生产插入执行情况信息表<br\>
     */
    public void insertExecuteInfo(String statement, BatchExecuteInfo batchExecuteInfo){
        sqlSessionTemplate.insert(statement, batchExecuteInfo);
    }
    /**
     * Title: updateExecuteInfo<br\>
     * Description: 报文生产更新执行情况信息表<br\>
     */
    public String updateExecuteInfo(String statement, BatchExecuteInfo batchExecuteInfo){
        int count = (int)sqlSessionTemplate.update(statement, batchExecuteInfo);
        return count+"";
    }
    /**
     * Title: getBatchJobList<br\>
     * Description:获取所有的BatchJob列表 <br\>
     */
    public List<BatchJob> getBatchJobList(String statement){
        List<BatchJob> batchJobList = new ArrayList<BatchJob>();
        Object obj=sqlSessionTemplate.selectList(statement);
        batchJobList=(List<BatchJob>)obj;
        return batchJobList;
    }

    @Override
    public String updateErrorTable(String statement, String mainTableName) {
        // TODO Auto-generated method stub
        int count = (int)sqlSessionTemplate.update(statement, mainTableName);
        return count+"";
    }

    @Override
    public String updateCheckSts(String statement, String mainTableName) {
        // TODO Auto-generated method stub
        int count = (int)sqlSessionTemplate.update(statement, mainTableName);
        return count+"";
    }

    @Override
    public String SingleupdateErrorTable(String statement, Map<String, String> SingleMap) {
        // TODO Auto-generated method stub
        int count = (int)sqlSessionTemplate.update(statement, SingleMap);
        return count+"";
    }

    @Override
    public String SingleupdateCheckSts(String statement, Map<String, String> SingleMap) {
        // TODO Auto-generated method stub
        int count = (int)sqlSessionTemplate.update(statement, SingleMap);
        return count+"";
    }


    @Override
    public int getCount_ExcuteSts(String statement) {
        int count=0;
        count = (Integer) sqlSessionTemplate.selectOne(statement);
        return count;
    }
    @Override
    public Object getMessageObject(String statement, Map<String, String> map){
        Object object;
        object =sqlSessionTemplate.selectOne(statement,map);
        return object;
    }
    @Override
    public List<BatchJob> getBatchJobup(String statement, String infrence) {
        List<BatchJob> batchJobList = new ArrayList<BatchJob>();
        Object obj=sqlSessionTemplate.selectList(statement,infrence);
        batchJobList = (List<BatchJob>) obj;
        return batchJobList;
    }
    @Override
    public int deleteSingleErrorInfo(Map<String,String> map) {
        int count =  sqlSessionTemplate.delete("MessageInfo.deleteSingleErrorInfo",map);
        return 0;
    }

    @Override
    public int deleteErrorInfo(Map<String,String> map) {
        int count =  sqlSessionTemplate.delete("MessageInfo.deleteErrorInfo",map);
        return 0;
    }
}
