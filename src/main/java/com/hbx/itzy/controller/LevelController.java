package com.hbx.itzy.controller;


import com.hbx.itzy.mapper.LevelMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/level")
@Api(tags = "等级相关接口", description = "提供等级相关的 Rest API")
public class LevelController {
    @Autowired
    private LevelMapper levelMapper;


    @ApiOperation("根据等级获取该等级所需要的经验值")
    @GetMapping("/getExp/{id}")
    public String getExpNeeded(int id) {
        return levelMapper.getExpNeeded(id);
    }
}
