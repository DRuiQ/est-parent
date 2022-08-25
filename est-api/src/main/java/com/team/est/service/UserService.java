package com.team.est.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserService {
    @RequestMapping("login")
    public String login(@RequestParam("phone") String phone,
                        @RequestParam("pwd") String pwd);
}
