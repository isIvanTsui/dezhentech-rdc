package com.dezhentech;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description: rdc管理应用程序
 * @title: com.dezhentech.RdcAdminApplication
 * @author: yingfan.cui@dezhentech.com
 * @create: 2022/10/28 03:48:01
 * @version: 1.0.0
 **/
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class RdcAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(RdcAdminApplication.class);
    }
}
