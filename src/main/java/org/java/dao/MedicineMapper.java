package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Medicine;
@Mapper
public interface MedicineMapper {
    int deleteByPrimaryKey(Integer medicineId);

    int insert(Medicine record);

    int insertSelective(Medicine record);

    Medicine selectByPrimaryKey(Integer medicineId);

    int updateByPrimaryKeySelective(Medicine record);

    int updateByPrimaryKey(Medicine record);
}