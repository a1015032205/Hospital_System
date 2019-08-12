package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Pathography;
@Mapper
public interface PathographyMapper {
    int deleteByPrimaryKey(String pathographyId);

    int insert(Pathography record);

    int insertSelective(Pathography record);

    Pathography selectByPrimaryKey(String pathographyId);

    int updateByPrimaryKeySelective(Pathography record);

    int updateByPrimaryKey(Pathography record);
}