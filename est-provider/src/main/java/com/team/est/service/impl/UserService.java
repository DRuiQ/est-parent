package com.team.est.service.impl;

import com.team.est.dto.UserDto;
import com.team.est.entity.Users;
import com.team.est.entity.UsersExample;
import com.team.est.mapper.UsersMapper;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/user/")
public class UserService {
    @Resource
    private UsersMapper  usersMapper;
    @Resource
    private RedisTemplate redisTemplate;
    @RequestMapping("login")
    public String login(@RequestParam("phone") String phone,
                  @RequestParam("pwd") String pwd){
          //通过用户名密码登录
        UsersExample usersExample=new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andAccountEqualTo(phone);
        criteria.andPasswordEqualTo(pwd);
        List<Users> users = usersMapper.selectByExample(usersExample);
        if (users!=null  && users.size()==1){
            String toKer = UUID.randomUUID().toString().replace("-","");//替换uuid的段线
            ValueOperations<String,Users> valueOperations = redisTemplate.opsForValue();//调用redis
            valueOperations.set("toKen:"+toKer,users.get(0),10, TimeUnit.MINUTES);//保存toKen
            return toKer;//返回toKen
        }
        return "";
    }
    @RequestMapping("getUserInfo")
      public UserDto getUserInfo(@RequestParam("toKen") String toKen) {
        ValueOperations<String, Users> valueOperations = redisTemplate.opsForValue();
        Users users = valueOperations.get("toKen:" + toKen);
        if (users != null) {
            UserDto userDto = new UserDto(users.getId(), users.getAccount(), users.getUserName(), users.getSex(), users.getFaceUrl());
            userDto.setToKen(toKen);
            return userDto;
        }else {
            return null;
        }
    }
}
