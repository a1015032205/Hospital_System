package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Patient;

import java.util.Map;

@Mapper
public interface PatientMapper {
    int deleteByPrimaryKey(String patientId);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(String patientId);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);

    /**
     * 登录
     * @param map
     * @return
     */
    Map<String, Object> userLogin(Map<String, Object> map);
}