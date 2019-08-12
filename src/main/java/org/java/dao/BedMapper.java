package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Bed;
@Mapper
public interface BedMapper {
    int deleteByPrimaryKey(Integer bedId);

    int insert(Bed record);

    int insertSelective(Bed record);

    Bed selectByPrimaryKey(Integer bedId);

    int updateByPrimaryKeySelective(Bed record);

    int updateByPrimaryKey(Bed record);
}