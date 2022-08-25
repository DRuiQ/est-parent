package com.team.est.mapper;

import com.team.est.entity.MaintainOrderFlow;
import com.team.est.entity.MaintainOrderFlowExample;
import java.util.List;

public interface MaintainOrderFlowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MaintainOrderFlow record);

    int insertSelective(MaintainOrderFlow record);

    List<MaintainOrderFlow> selectByExample(MaintainOrderFlowExample example);

    MaintainOrderFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MaintainOrderFlow record);

    int updateByPrimaryKey(MaintainOrderFlow record);
}