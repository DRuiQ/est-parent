package com.team.est.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Malfunction {
    private Long id;

    private Long modelId;

    private String title;

    private Integer isHint;

    private String hintTitle;

    private String hintInfo;

    private String hintImg;

    private BigDecimal maintainTopPrice;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getIsHint() {
        return isHint;
    }

    public void setIsHint(Integer isHint) {
        this.isHint = isHint;
    }

    public String getHintTitle() {
        return hintTitle;
    }

    public void setHintTitle(String hintTitle) {
        this.hintTitle = hintTitle == null ? null : hintTitle.trim();
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

    public BigDecimal getMaintainTopPrice() {
        return maintainTopPrice;
    }

    public void setMaintainTopPrice(BigDecimal maintainTopPrice) {
        this.maintainTopPrice = maintainTopPrice;
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