package com.dezhentech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: 使用者应用程序
 * @title: com.dezhentech.ConsumerApplication
 * @author: yingfan.cui@dezhentech.com
 * @create: 2022/10/31 10:01:06
 * @version: 1.0.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class RdcServiceBApplication {
    public static void main(String[] args) {
        SpringApplication.run(RdcServiceBApplication.class);
    }
}
