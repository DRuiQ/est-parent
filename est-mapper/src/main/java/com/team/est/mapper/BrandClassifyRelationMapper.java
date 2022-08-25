package com.team.est.mapper;

import com.team.est.entity.BrandClassifyRelation;
import com.team.est.entity.BrandClassifyRelationExample;
import java.util.List;

public interface BrandClassifyRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BrandClassifyRelation record);

    int insertSelective(BrandClassifyRelation record);

    List<BrandClassifyRelation> selectByExample(BrandClassifyRelationExample example);

    BrandClassifyRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BrandClassifyRelation record);

    int updateByPrimaryKey(BrandClassifyRelation record);
}