package com.hbx.itzy;

import com.hbx.itzy.mapper.UserMapper;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.hbx.itzy.mapper"})
public class ItzyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItzyApplication.class, args);
    }
}
