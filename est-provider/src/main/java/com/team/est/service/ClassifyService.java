package com.team.est.service;

import com.team.est.dto.ClassifyDto;
import com.team.est.entity.Classify;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ClassifyService {
    List<ClassifyDto> getClassify();
}
