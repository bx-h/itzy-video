package com.hbx.itzy.mapper;

import com.hbx.itzy.model.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;


@RunWith(SpringRunner.class)
@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void getUserById() {
        User user = userMapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    void addUser() {
        User user = new User(501,"hbx","220041038","123",6,"1");
        userMapper.addUser(user);

    }


    @Test
    void updateUserName() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("userId", 501);
        map.put("userName", "hbx2");
        userMapper.updateUserName(map);
    }
}