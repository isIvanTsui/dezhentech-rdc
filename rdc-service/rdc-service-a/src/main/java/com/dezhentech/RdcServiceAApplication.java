package com.dezhentech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: rdcService应用程序
 * @title: com.dezhentech.RdcServiceApplication
 * @author: yingfan.cui@dezhentech.com
 * @create: 2022/10/28 01:33:47
 * @version: 1.0.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class RdcServiceAApplication {
    public static void main(String[] args) {
        SpringApplication.run(RdcServiceAApplication.class, args);
    }
}
