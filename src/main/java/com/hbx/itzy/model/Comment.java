package com.hbx.itzy.model;

import io.swagger.annotations.ApiModel;

@ApiModel("评论实体")
public class Comment {
    private int userId;
    private int videoId;
    private String commentText;

    public Comment() {
    }

    public Comment(int userId, int videoId, String commentText) {
        this.userId = userId;
        this.videoId = videoId;
        this.commentText = commentText;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "userId=" + userId +
                ", videoId=" + videoId +
                ", commentText='" + commentText + '\'' +
                '}';
    }
}
