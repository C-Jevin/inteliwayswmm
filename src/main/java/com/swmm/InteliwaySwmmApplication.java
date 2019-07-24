package com.swmm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.swmm.dao")
public class InteliwaySwmmApplication {
    public static void main(String[] args) {
        SpringApplication.run(InteliwaySwmmApplication.class, args);
    }
}

