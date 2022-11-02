package com.dezhentech.a.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope// 添加此注解表示会实时更新value 另外需要给属性添加get set方法
@RestController
@Data
@Api("动态Config测试接口")
public class ConfigController {


    /**
     * .
     * 获取自定义属性值
     */
    @Value("${test.name:default}")
    private String name;


    /**
     * .
     * 使用注解方式
     *
     * @return
     */
    @ApiOperation("测试动态获取配置信息")
    @GetMapping("/config")
    public String config() {
        return name;
    }
}