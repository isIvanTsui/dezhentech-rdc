package com.dezhentech.a.service.fallback;

import com.dezhentech.a.service.AClient;
import org.springframework.stereotype.Component;

@Component
public class AClientFallback implements AClient {
    @Override
    public String testFeign() {
        return "服务降级了";
    }
}
