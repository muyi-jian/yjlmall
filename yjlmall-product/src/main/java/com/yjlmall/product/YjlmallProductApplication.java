package com.yjlmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yjlmall.product.dao")
@SpringBootApplication
public class YjlmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(YjlmallProductApplication.class, args);
    }

}
