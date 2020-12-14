package com.hbx.itzy.controller;

import com.hbx.itzy.mapper.VideoMapper;
import com.hbx.itzy.model.Video;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/video")
@Api(tags = "视频相关接口", description = "提供视频相关的 Rest API")
public class VideoController {
    @Autowired
    private VideoMapper videoMapper;

    @ApiOperation("新增视频")
    @PostMapping("/add")
    public boolean addUser(@RequestBody Video video) {
        try {
            videoMapper.addVideo(video);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @ApiOperation("根据视频 id 获取视频信息")
    @GetMapping("/getVideo/{id}")
    public Video getVideoById(@PathVariable("id") int id) {
        return videoMapper.getVideoById(id);
    }
}
