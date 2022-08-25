package com.team.est.dto;

import java.util.List;

public class ClassifyDto {
        private Long id;
        private String classifyName;
        private String icon;
        private String bigIcon;
        private List<BrandDto> brandDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getBigIcon() {
        return bigIcon;
    }

    public void setBigIcon(String bigIcon) {
        this.bigIcon = bigIcon;
    }

    public List<BrandDto> getBrandDto() {
        return brandDto;
    }

    public void setBrandDto(List<BrandDto> brandDto) {
        this.brandDto = brandDto;
    }
}
