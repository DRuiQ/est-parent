package com.team.est.mapper;

import com.team.est.entity.MalfunctionOptions;
import com.team.est.entity.MalfunctionOptionsExample;
import java.util.List;

public interface MalfunctionOptionsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MalfunctionOptions record);

    int insertSelective(MalfunctionOptions record);

    List<MalfunctionOptions> selectByExample(MalfunctionOptionsExample example);

    MalfunctionOptions selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MalfunctionOptions record);

    int updateByPrimaryKey(MalfunctionOptions record);
}