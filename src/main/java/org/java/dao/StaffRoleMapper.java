package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.StaffRole;
@Mapper
public interface StaffRoleMapper {
    int deleteByPrimaryKey(String staffRoleId);

    int insert(StaffRole record);

    int insertSelective(StaffRole record);

    StaffRole selectByPrimaryKey(String staffRoleId);

    int updateByPrimaryKeySelective(StaffRole record);

    int updateByPrimaryKey(StaffRole record);
}