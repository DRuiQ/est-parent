package com.team.est.controller;

import com.team.est.dto.ClassifyDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.team.est.service.ClassifyService;
import com.team.est.uitl.Result;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/home/")
public class classifyController {

    @Resource
    private ClassifyService classifyService;
    @GetMapping("classifyTree")
    public Result<List<ClassifyDto>> classifyTree(){
        List<ClassifyDto> dto = classifyService.getClassify();
        return new Result<List<ClassifyDto>>("0","成功",dto);
    }

}
