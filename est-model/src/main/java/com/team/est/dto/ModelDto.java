package com.team.est.dto;

public class ModelDto {
    private Long id;
    private String modelName;
    private String faceImg;

    public ModelDto() {
    }

    public ModelDto(Long id, String modelName, String faceImg) {
        this.id = id;
        this.modelName = modelName;
        this.faceImg = faceImg;
    }
    public String getFaceImg() {
        return faceImg;
    }



    public void setFaceImg(String faceImg) {
        this.faceImg = faceImg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
