package com.yjlmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.yjlmall.product.feign")
@MapperScan("com.yjlmall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class YjlmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(YjlmallProductApplication.class, args);
    }

}
