package com.yjlmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yjlmall.member.dao")
@SpringBootApplication
public class YjlmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(YjlmallMemberApplication.class, args);
    }

}
