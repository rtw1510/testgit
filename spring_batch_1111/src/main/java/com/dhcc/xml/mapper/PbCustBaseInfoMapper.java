package com.dhcc.xml.mapper;

import com.dhcc.xml.per.entities.baseinfo.db.Pb_CustBase_Info;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PbCustBaseInfoMapper {
    public List<Pb_CustBase_Info> selectAll();
}
