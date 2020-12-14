package com.hbx.itzy.controller;

import com.hbx.itzy.mapper.UserMapper;
import com.hbx.itzy.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Api(tags = "用户相关接口", description = "提供用户相关的 Rest API")
public class UserController {

    @Autowired
    private UserMapper userMapper;


    @ApiOperation("新增用户")
    @PostMapping("/addUser")
    public boolean addUser(@RequestBody User user) {
        try {
            userMapper.addUser(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @ApiOperation("根据用户 id 获取用户信息")
    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userMapper.getUserById(id);
    }

    @ApiOperation("更新用户名称")
    @PutMapping("/updateUserName")
    public boolean update(@RequestBody Map map) {
        if (map.get("userId") != null && map.get("userName") != null) {
            userMapper.updateUserName(map);
            return true;
        }
        return false;
    }
}
