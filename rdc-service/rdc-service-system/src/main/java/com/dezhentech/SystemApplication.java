package com.dezhentech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: System服务启动器
 * @title: com.dezhentech.SystemApplication
 * @author: yingfan.cui@dezhentech.com
 * @create: 2022/11/04 10:18:16
 * @version: 1.0.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class);
    }
}
