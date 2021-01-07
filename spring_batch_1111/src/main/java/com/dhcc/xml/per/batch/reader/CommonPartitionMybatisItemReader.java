package com.dhcc.xml.per.batch.reader;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.batch.MyBatisPagingItemReader;

import java.util.HashMap;
import java.util.Map;

@Deprecated
public class CommonPartitionMybatisItemReader<T> extends MyBatisPagingItemReader<T> {
    public CommonPartitionMybatisItemReader(SqlSessionFactory sqlSessionFactory, String name,String fromId,String toId) {
        setQueryId("selectAll");
        setSqlSessionFactory(sqlSessionFactory);
        Map<String,Object> parameterValues = new HashMap<>();
        parameterValues.put("fromId", fromId);
        parameterValues.put("toId", toId);
        setParameterValues(parameterValues);
        setPageSize(15);
    }
}

