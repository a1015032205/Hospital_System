package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Permission;
@Mapper
public interface PermissionMapper {
    int deleteByPrimaryKey(String permissionId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(String permissionId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}