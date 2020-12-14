package com.hbx.itzy.model;

import io.swagger.annotations.ApiModel;

@ApiModel("用户实体")

public class User {
    private int userId;
    private String userName;
    private String userAccount;
    private String userPassword;
    private int levelId;
    private String userFans;

    public User() {
    }

    public User(int userId, String userName, String userAccount, String userPassword, int levelId, String userFans) {
        this.userId = userId;
        this.userName = userName;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.levelId = levelId;
        this.userFans = userFans;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public String getUserFans() {
        return userFans;
    }

    public void setUserFans(String userFans) {
        this.userFans = userFans;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", levelId=" + levelId +
                ", userFans='" + userFans + '\'' +
                '}';
    }
}
