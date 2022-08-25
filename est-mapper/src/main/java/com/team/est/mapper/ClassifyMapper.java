package com.team.est.mapper;

import com.team.est.dto.ClassifyDto;
import com.team.est.entity.Classify;
import com.team.est.entity.ClassifyExample;
import java.util.List;

public interface ClassifyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Classify record);

    int insertSelective(Classify record);

    List<Classify> selectByExample(ClassifyExample example);

    Classify selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Classify record);

    int updateByPrimaryKey(Classify record);

    List<ClassifyDto> getClassify();
}