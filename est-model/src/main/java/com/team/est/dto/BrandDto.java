package com.team.est.dto;

import java.util.List;

public class BrandDto {
    private Long id;
    private String brandName;
    private String logo;
    private List<ModelDto> modelDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<ModelDto> getModelDto() {
        return modelDto;
    }

    public void setModelDto(List<ModelDto> modelDto) {
        this.modelDto = modelDto;
    }
}
