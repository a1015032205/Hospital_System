package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.RolePermission;
@Mapper
public interface RolePermissionMapper {
    int deleteByPrimaryKey(String rolePermissionId);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(String rolePermissionId);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}