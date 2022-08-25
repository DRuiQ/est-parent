package com.team.est.mapper;

import com.team.est.dto.BrandDto;
import com.team.est.entity.Brand;
import com.team.est.entity.BrandExample;
import java.util.List;

public interface BrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Brand record);

    int insertSelective(Brand record);

    List<Brand> selectByExample(BrandExample example);

    Brand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);

    List<BrandDto> getBrand(Long id);
}