package com.dhcc.core.cache.service;

import com.dhcc.core.cache.entity.SRInfo;

import java.util.List;

/**
 * Author: HuLin
 * Date: 2020/11/5 14:47
 */
public interface SRInfoService {
    List<SRInfo> findAll(String statement);
}
