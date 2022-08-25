package com.team.est.mapper;

import com.team.est.entity.SmsLog;
import com.team.est.entity.SmsLogExample;
import java.util.List;

public interface SmsLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsLog record);

    int insertSelective(SmsLog record);

    List<SmsLog> selectByExample(SmsLogExample example);

    SmsLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsLog record);

    int updateByPrimaryKey(SmsLog record);
}