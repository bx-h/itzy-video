package com.hbx.itzy.mapper;

import com.hbx.itzy.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;


public interface UserMapper {
    User getUserById(int id);

    int addUser(User user);

    int updateUserName(Map map);
}
