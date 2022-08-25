package com.team.est.dto;

public class UserDto {
    private Long id;
    private String account;
    private String UserName;
    private Integer sex;
    private String faceUrl;

    private  String toKen;

    public String getToKen() {
        return toKen;
    }

    public void setToKen(String toKen) {
        this.toKen = toKen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public UserDto(Long id, String account, String userName, Integer sex, String faceUrl) {
        this.id = id;
        this.account = account;
        UserName = userName;
        this.sex = sex;
        this.faceUrl = faceUrl;
    }

    public UserDto() {
    }
}
