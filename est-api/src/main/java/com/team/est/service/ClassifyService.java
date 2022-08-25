package com.team.est.service;

import com.team.est.dto.ClassifyDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "est-provider")
public interface  ClassifyService {

    @RequestMapping("/classify/getClassify")
   public  List<ClassifyDto> getClassify();
}
