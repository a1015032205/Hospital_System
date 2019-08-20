package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.java.entity.Staff;

import java.util.Map;

@Mapper
public interface StaffMapper {
    int deleteByPrimaryKey(String staffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(String staffId);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);

    /**
     * 后台登录
     *
     * @param map
     * @return
     */
    Map<String, Object> oaLogin(@Param("staff_job_number") String username);
}