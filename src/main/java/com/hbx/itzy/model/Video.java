package com.hbx.itzy.model;

import io.swagger.annotations.ApiModel;

import java.util.Date;

@ApiModel("视频实体")
public class Video {
    private int videoId;
    private int userId;
    private String videoName;
    private String videoType;
    private Date videoTime;

    public Video() {
    }

    public Video(int videoId, int userId, String videoName, String videoType, Date videoTime) {
        this.videoId = videoId;
        this.userId = userId;
        this.videoName = videoName;
        this.videoType = videoType;
        this.videoTime = videoTime;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public Date getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(Date videoTime) {
        this.videoTime = videoTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoId=" + videoId +
                ", userId=" + userId +
                ", videoName='" + videoName + '\'' +
                ", videoType='" + videoType + '\'' +
                ", videoTime=" + videoTime +
                '}';
    }
}
