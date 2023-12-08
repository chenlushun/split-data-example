package com.chenlushun.split.data.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

@SpringBootApplication(exclude = JtaAutoConfiguration.class)
@MapperScan("com.chenlushun.split.data.example.mapper")
public class SplitDataExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SplitDataExampleApplication.class, args);
    }

}
