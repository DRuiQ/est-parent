package com.team.est.service.impl;

import com.team.est.dto.BrandDto;
import com.team.est.dto.ClassifyDto;
import com.team.est.dto.ModelDto;
import com.team.est.entity.Classify;
import com.team.est.mapper.BrandMapper;
import com.team.est.mapper.ClassifyMapper;
import com.team.est.mapper.ModelMapper;
import com.team.est.service.ClassifyService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/classify/")
public class ClassifyServiceImpl implements ClassifyService {
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private ClassifyMapper classifyMapper;
    @Resource
    private BrandMapper brandMapper;
   @Resource
   private ModelMapper modelMapper;
    @Override
    @GetMapping("getClassify")
    public List<ClassifyDto> getClassify() {
        ValueOperations<String,List<ClassifyDto>> vo = redisTemplate.opsForValue();
        List<ClassifyDto> classifyDtos=null;
        if(redisTemplate.hasKey("classTree")){
            classifyDtos=vo.get("classTree");
        }else {
            classifyDtos = classifyMapper.getClassify();
            for (ClassifyDto c:classifyDtos){
                List<BrandDto> brandDtos= brandMapper.getBrand(c.getId());
                for (BrandDto d:brandDtos){
                    Map<String,Long> map=new HashMap();
                    map.put("classifyId",c.getId());
                    map.put("brandId",d.getId());
                    List<ModelDto> modelDtos=modelMapper.getModel(map);
                    d.setModelDto(modelDtos);
                }
                c.setBrandDto(brandDtos);
            }
            vo.set("classTree",classifyDtos,20, TimeUnit.MINUTES);
        }

        return classifyDtos;
    }
}
