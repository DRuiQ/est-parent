package com.team.est.mapper;

import com.team.est.entity.MaintainOrder;
import com.team.est.entity.MaintainOrderExample;
import java.util.List;

public interface MaintainOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MaintainOrder record);

    int insertSelective(MaintainOrder record);

    List<MaintainOrder> selectByExample(MaintainOrderExample example);

    MaintainOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MaintainOrder record);

    int updateByPrimaryKey(MaintainOrder record);
}