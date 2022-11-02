package com.dezhentech.b.controller;

import com.dezhentech.a.service.AClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api("远程调用接口")
public class BController {

    @Resource
    private AClient aClient;

    @ApiOperation("B服务远程调用A服务")
    @GetMapping("consumer")
    public String feignConsumer() {
        return aClient.testFeign();
    }
}
