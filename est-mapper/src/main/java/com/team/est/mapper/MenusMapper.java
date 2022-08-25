package com.team.est.mapper;

import com.team.est.entity.Menus;
import com.team.est.entity.MenusExample;
import java.util.List;

public interface MenusMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Menus record);

    int insertSelective(Menus record);

    List<Menus> selectByExample(MenusExample example);

    Menus selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Menus record);

    int updateByPrimaryKey(Menus record);
}