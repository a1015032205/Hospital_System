package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Attendance;
@Mapper
public interface AttendanceMapper {
    int deleteByPrimaryKey(Integer attendanceId);

    int insert(Attendance record);

    int insertSelective(Attendance record);

    Attendance selectByPrimaryKey(Integer attendanceId);

    int updateByPrimaryKeySelective(Attendance record);

    int updateByPrimaryKey(Attendance record);
}