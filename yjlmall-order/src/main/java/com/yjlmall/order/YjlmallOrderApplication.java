package com.yjlmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yjlmall.order.dao")
@SpringBootApplication
public class YjlmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(YjlmallOrderApplication.class, args);
    }

}
