package com.team.est.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.est.dto.ModelDto;
import com.team.est.entity.Model;
import com.team.est.entity.ModelExample;
import com.team.est.mapper.ModelMapper;
import com.team.est.req.ModelReq;
import com.team.est.service.ModelService;
import com.team.est.uitl.Page;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/model/")
public class ModelServiceImpl implements ModelService {
    @Resource
    private ModelMapper modelMapper;
    @RequestMapping("searchModel")
    @Override
    public Page<ModelDto> searchModel(@RequestBody ModelReq modelReq) {
        PageHelper.startPage(modelReq.getPageNo(),modelReq.getPageSize());
        ModelExample example=new ModelExample();
        ModelExample.Criteria criteria = example.createCriteria();
        if(!StringUtils.isEmpty(modelReq.getModelName())){
             criteria.andModelNameLike("%"+modelReq.getModelName()+"%");
        }
        if (modelReq.getClassifyId()!=null){ //不为空就等于getClassifyId
            criteria.andClassifyIdEqualTo(modelReq.getClassifyId());
        }
        if(modelReq.getBrandId()!=null){
            criteria.andClassifyIdEqualTo(modelReq.getBrandId());
        }
        List<Model> models = modelMapper.selectByExample(example);
        PageInfo<Model> pageInfo=new PageInfo<>(models);
        Page<ModelDto> page=new Page<ModelDto>(pageInfo.getPageNum(),pageInfo.getPageSize(),(int)pageInfo.getTotal());
        page.setPages(pageInfo.getPages());
        //2.2 将实体集合转化为DTO集合
        List<ModelDto> modelDtoList=new ArrayList<>();
        for(Model model:pageInfo.getList()){  //循环实体集合
            //创建ModelDto
            ModelDto modelDto=new ModelDto(model.getId(),model.getModelName(),model.getFaceImg());
            modelDtoList.add(modelDto);
        }
        //设置到分页实体中
        page.setList(modelDtoList);
        return page;
    }
}
