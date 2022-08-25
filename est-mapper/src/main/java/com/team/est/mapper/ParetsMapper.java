package com.team.est.mapper;

import com.team.est.entity.Parets;
import com.team.est.entity.ParetsExample;
import java.util.List;

public interface ParetsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Parets record);

    int insertSelective(Parets record);

    List<Parets> selectByExample(ParetsExample example);

    Parets selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Parets record);

    int updateByPrimaryKey(Parets record);
}