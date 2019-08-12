package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Patient;
@Mapper
public interface PatientMapper {
    int deleteByPrimaryKey(String patientId);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(String patientId);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);
}