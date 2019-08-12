package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Staff;
@Mapper
public interface StaffMapper {
    int deleteByPrimaryKey(String staffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(String staffId);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}