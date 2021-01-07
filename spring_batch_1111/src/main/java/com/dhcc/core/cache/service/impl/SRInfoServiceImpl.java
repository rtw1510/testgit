package com.dhcc.core.cache.service.impl;

import com.dhcc.core.cache.entity.SRInfo;
import com.dhcc.core.cache.service.SRInfoService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: HuLin
 * Date: 2020/11/5 14:48
 */

@SuppressWarnings("deprecation")
@Service
public class SRInfoServiceImpl implements SRInfoService {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    @Override
    public List<SRInfo> findAll(String statement) {

        List<SRInfo> SRInfoList = new ArrayList<SRInfo>();

        SRInfoList = sqlSessionTemplate.selectList(statement);

        return SRInfoList;
    }

}
