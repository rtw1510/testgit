package com.dhcc.xml.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.dhcc.xml.entity.SubmitOrgInfo;
import com.dhcc.xml.service.DBLaunchService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Title: DBLaunchBoImpl<br/>
 * Description:报文生成公共的操作数据库业务逻辑层 <br/>
 * @author ChenJingYuan
 * @date 2018-8-9
 */
@SuppressWarnings("deprecation")
@Service("dbLaunchService")
public class DBLaunchServiceImpl  implements DBLaunchService {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * Description:更新待生成报文的PageNumber并获取条数<br\>
     */
    public String updatePageNumber(String statement, Map<String, String> map){
        int count=(int) sqlSessionTemplate.update(statement, map);
        return count+"";
    }

    /**
     * Description:根据主表信息获取需要生成的报文的数量 <br\>
     */
    public String queryCount(String statement, Map<String, String> map){
        String count=(String) sqlSessionTemplate.selectOne(statement, map);
        return count;
    }

    /**
     * 功能描述：获取路径信息
     * @param name 路径字段名称
     */
    public String getPath(String statement, String name){
        String count=(String) sqlSessionTemplate.selectOne(statement, name);
        return count;
    }

    /**
     * 功能描述：获取上报人员信息
     *
     */
    public SubmitOrgInfo querySubmitOrgInfo(String statement){
        SubmitOrgInfo orgInfo =null;
        orgInfo=(SubmitOrgInfo)sqlSessionTemplate.selectOne(statement);
        return orgInfo;
    }

    /**
     *功能描述：获取报文序号
     *
     */
    public String getSerialNo(String statement, String orgCode, String msgDate,
                              String infRecType) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("orgCode", orgCode);
        param.put("msgDate", msgDate);
        param.put("infRecType", infRecType);
        String serialNo=(String)sqlSessionTemplate.selectOne(statement, param);
        if(serialNo==null){
            serialNo="001";
            this.insSerialNo("S_MSG_SERIALNO_insSerialNo",orgCode,  msgDate, infRecType);
        }else{
            this.updSerialNo("S_MSG_SERIALNO_updSerialNo",orgCode,  msgDate, infRecType);
        }
        return serialNo;
    }

    /**
     *功能描述：更新报文序号
     */
    public void updSerialNo(String statement, String orgCode, String msgDate, String infRecType) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("orgCode", orgCode);
        param.put("msgDate", msgDate);
        param.put("infRecType", infRecType);
        sqlSessionTemplate.update(statement, param);
    }

    /**
     * 功能描述：新增报文序号
     */
    public void insSerialNo(String statement, String orgCode, String msgDate,
                            String infRecType) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("orgCode", orgCode);
        param.put("msgDate", msgDate);
        param.put("infRecType", infRecType);
        sqlSessionTemplate.insert(statement, param);

    }
}