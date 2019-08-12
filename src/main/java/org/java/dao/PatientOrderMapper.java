package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.PatientOrder;
@Mapper
public interface PatientOrderMapper {
    int deleteByPrimaryKey(String patientOrderId);

    int insert(PatientOrder record);

    int insertSelective(PatientOrder record);

    PatientOrder selectByPrimaryKey(String patientOrderId);

    int updateByPrimaryKeySelective(PatientOrder record);

    int updateByPrimaryKey(PatientOrder record);
}