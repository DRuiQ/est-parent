package com.team.est.mapper;

import com.team.est.entity.PayOrder;
import com.team.est.entity.PayOrderExample;
import java.util.List;

public interface PayOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PayOrder record);

    int insertSelective(PayOrder record);

    List<PayOrder> selectByExample(PayOrderExample example);

    PayOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PayOrder record);

    int updateByPrimaryKey(PayOrder record);
}