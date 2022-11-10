package com.dezhentech.a.service.fallback;

import com.dezhentech.a.service.AClient;
import com.dezhentech.common.core.response.Result;
import org.springframework.stereotype.Component;

@Component
public class AClientFallback implements AClient {
    @Override
    public String testFeign() {
        return "服务降级了";
    }

    @Override
    public Result reduceStock(String sid) {
        return Result.error("建库存失败");
    }
}
