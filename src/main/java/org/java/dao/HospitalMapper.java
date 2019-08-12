package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Hospital;
@Mapper
public interface HospitalMapper {
    int deleteByPrimaryKey(String hospitalId);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(String hospitalId);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);
}