package com.hbx.itzy.controller;


import com.hbx.itzy.mapper.CommentMapper;
import com.hbx.itzy.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
@Api(tags = "评论相关接口", description = "提供评论相关的 Rest API")
public class CommentController {
    @Autowired
    private CommentMapper commentMapper;

    @ApiOperation("根据用户 id 和视频 id 获取视频的评论内容")
    @GetMapping("/getUserById/{userId}/{videoId}")
    public String getComment(@PathVariable("userId") int userId, @PathVariable("videoId") int videoId) {
        return commentMapper.getComment(userId, videoId);
    }

}
