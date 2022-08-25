package com.team.est.mapper;

import com.team.est.entity.Store;
import com.team.est.entity.StoreExample;
import java.util.List;

public interface StoreMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Store record);

    int insertSelective(Store record);

    List<Store> selectByExample(StoreExample example);

    Store selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}