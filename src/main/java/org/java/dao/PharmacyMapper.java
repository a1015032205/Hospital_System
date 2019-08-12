package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Pharmacy;
@Mapper
public interface PharmacyMapper {
    int deleteByPrimaryKey(Integer pharmacyId);

    int insert(Pharmacy record);

    int insertSelective(Pharmacy record);

    Pharmacy selectByPrimaryKey(Integer pharmacyId);

    int updateByPrimaryKeySelective(Pharmacy record);

    int updateByPrimaryKey(Pharmacy record);
}