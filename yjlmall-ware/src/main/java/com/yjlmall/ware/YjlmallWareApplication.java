package com.yjlmall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yjlmall.ware.dao")
@SpringBootApplication
public class YjlmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(YjlmallWareApplication.class, args);
    }

}
