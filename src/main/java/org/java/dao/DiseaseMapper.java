package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Disease;
@Mapper
public interface DiseaseMapper {
    int deleteByPrimaryKey(Integer diseaseId);

    int insert(Disease record);

    int insertSelective(Disease record);

    Disease selectByPrimaryKey(Integer diseaseId);

    int updateByPrimaryKeySelective(Disease record);

    int updateByPrimaryKey(Disease record);
}