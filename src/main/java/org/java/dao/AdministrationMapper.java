package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Administration;
@Mapper
public interface AdministrationMapper {
    int deleteByPrimaryKey(Integer administrationId);

    int insert(Administration record);

    int insertSelective(Administration record);

    Administration selectByPrimaryKey(Integer administrationId);

    int updateByPrimaryKeySelective(Administration record);

    int updateByPrimaryKey(Administration record);
}