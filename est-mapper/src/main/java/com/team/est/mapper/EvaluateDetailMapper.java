package com.team.est.mapper;

import com.team.est.entity.EvaluateDetail;
import com.team.est.entity.EvaluateDetailExample;
import java.util.List;

public interface EvaluateDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EvaluateDetail record);

    int insertSelective(EvaluateDetail record);

    List<EvaluateDetail> selectByExample(EvaluateDetailExample example);

    EvaluateDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EvaluateDetail record);

    int updateByPrimaryKey(EvaluateDetail record);
}