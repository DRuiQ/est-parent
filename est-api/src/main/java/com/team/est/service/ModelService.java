package com.team.est.service;

import com.team.est.dto.ModelDto;
import com.team.est.req.ModelReq;
import com.team.est.uitl.Page;
import org.springframework.web.bind.annotation.RequestBody;

public interface ModelService {
    public Page<ModelDto> searchModel(@RequestBody ModelReq modelReq);
}
