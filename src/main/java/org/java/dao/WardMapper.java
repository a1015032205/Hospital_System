package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Ward;
@Mapper
public interface WardMapper {
    int deleteByPrimaryKey(Integer wardId);

    int insert(Ward record);

    int insertSelective(Ward record);

    Ward selectByPrimaryKey(Integer wardId);

    int updateByPrimaryKeySelective(Ward record);

    int updateByPrimaryKey(Ward record);
}