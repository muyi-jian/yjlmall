package com.yjlmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
//排除DataSourceAutoConfiguration此类的**AutoConfig**，即禁止 **SpringBoot** 自动注入数据源配置。
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class YjlmallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(YjlmallGatewayApplication.class, args);
    }

}
