package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Registration;
@Mapper
public interface RegistrationMapper {
    int deleteByPrimaryKey(String registrationId);

    int insert(Registration record);

    int insertSelective(Registration record);

    Registration selectByPrimaryKey(String registrationId);

    int updateByPrimaryKeySelective(Registration record);

    int updateByPrimaryKey(Registration record);
}