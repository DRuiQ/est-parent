package com.team.est.controller;

import com.team.est.dto.UserDto;
import com.team.est.service.UserService;
import com.team.est.uitl.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Resource
    private UserService userService;
    @RequestMapping("login/normal")
    public Result<Map<String,String>> login(String phone,String pwd){
        String toKen = userService.login(phone, pwd);
        if(toKen==null){
            return new Result<>("1002","登陆失败");
        }else {
            Map<String,String> map=new HashMap<>();
            map.put("toKen",toKen);
            return new Result<>("0","登陆成功",map);
        }
    }
    @RequestMapping("info")
    public Result<UserDto> info(HttpServletRequest request) {
        String toKen = request.getHeader("toKen");

       return null;
    }
}
