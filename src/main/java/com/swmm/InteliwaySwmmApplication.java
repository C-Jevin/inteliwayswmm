package com.swmm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@ComponentScan("com.swmm.configurer")
@SpringBootApplication
//@EnableSwagger2
@EnableAsync
@MapperScan("com.swmm.dao")
public class InteliwaySwmmApplication {
    public static void main(String[] args) {
        SpringApplication.run(InteliwaySwmmApplication.class, args);
    }
}

