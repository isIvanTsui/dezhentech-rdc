package com.dezhentech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description: rdc应用程序
 * @title: com.dezhentech.RdcApplication
 * @author: yingfan.cui@dezhentech.com
 * @create: 2022/10/28 01:09:48
 * @version: 1.0.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class RdcGatewaylication {
    public static void main(String[] args) {
        SpringApplication.run(RdcGatewaylication.class, args);
    }
}
