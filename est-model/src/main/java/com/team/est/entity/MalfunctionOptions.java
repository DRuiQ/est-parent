package com.team.est.entity;

import java.util.Date;

public class MalfunctionOptions {
    private Long id;

    private Long modelId;

    private Long malfId;

    private String optionName;

    private Integer isHint;

    private String hintInfo;

    private String hintImg;

    private Integer processType;

    private Integer ratio;

    private Long createdUserId;

    private Long updatedUserId;

    private Date creatdTime;

    private Date updatedTime;

    private Integer isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getMalfId() {
        return malfId;
    }

    public void setMalfId(Long malfId) {
        this.malfId = malfId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    public Integer getIsHint() {
        return isHint;
    }

    public void setIsHint(Integer isHint) {
        this.isHint = isHint;
    }

    public String getHintInfo() {
        return hintInfo;
    }

    public void setHintInfo(String hintInfo) {
        this.hintInfo = hintInfo == null ? null : hintInfo.trim();
    }

    public String getHintImg() {
        return hintImg;
    }

    public void setHintImg(String hintImg) {
        this.hintImg = hintImg == null ? null : hintImg.trim();
    }

    public Integer getProcessType() {
        return processType;
    }

    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    public Integer getRatio() {
        return ratio;
    }

    public void setRatio(Integer ratio) {
        this.ratio = ratio;
    }

    public Long getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(Long createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Long getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(Long updatedUserId) {
        this.updatedUserId = updatedUserId;
    }

    public Date getCreatdTime() {
        return creatdTime;
    }

    public void setCreatdTime(Date creatdTime) {
        this.creatdTime = creatdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}