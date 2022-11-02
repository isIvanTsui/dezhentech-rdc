package com.dezhentech.a.controller;

import com.dezhentech.a.service.AClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController implements AClient {
    @Override
    public String testFeign() {
        return "rdc-service-a的testFeign()方法被调用了";
    }
}
