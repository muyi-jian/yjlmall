package com.yjlmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yjlmall.coupon.dao")
@SpringBootApplication
public class YjlmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(YjlmallCouponApplication.class, args);
    }

}
