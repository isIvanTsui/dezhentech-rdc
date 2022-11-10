package com.dezhentech.b.controller;

import com.dezhentech.a.service.AClient;
import com.dezhentech.b.service.OrderService;
import com.dezhentech.common.core.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api("远程调用接口")
public class BController {
    @Autowired
    private OrderService orderService;

    @Resource
    private AClient aClient;

    @ApiOperation("B服务远程调用A服务")
    @GetMapping("consumer")
    public String feignConsumer() {
        return aClient.testFeign();
    }

    @GetMapping("pay")
    public Result pay() {
        return orderService.orderAdd();
    }
}
