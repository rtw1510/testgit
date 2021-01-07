package com.dhcc.xml.service;

import com.dhcc.xml.entity.SubmitOrgInfo;

import java.util.Map;

public interface DBLaunchService {
    /**
     * Description:更新待生成报文的PageNumber并获取条数<br\>
     */
    public String updatePageNumber(String statement, Map<String, String> map);
    /**
     * Description:按查询条件来获取可上报数据的条数 <br\>
     */
    public String queryCount(String statement, Map<String, String> map);
    /**
     * 功能描述：获取路径信息
     */
    public String getPath(String statement, String name);
    /**
     * 功能描述：查询上报人员信息
     */
    public SubmitOrgInfo querySubmitOrgInfo(String statement);
    /**
     * 功能描述：获取报文序列号
     */
    public String getSerialNo(String statement, String orgCode, String msgDate, String infRecType);
    /**
     * 功能描述：更新报文序列号
     */
    public void updSerialNo(String statement, String orgCode, String msg_date, String infRecType);

    /**
     * 功能描述：新增序号信息
     */
    public void insSerialNo(String statement, String orgCode, String msgDate, String infRecType);
}

