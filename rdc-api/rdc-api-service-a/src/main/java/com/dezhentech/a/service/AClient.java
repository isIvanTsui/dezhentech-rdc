package com.dezhentech.a.service;

import com.dezhentech.a.service.fallback.AClientFallback;
import com.dezhentech.common.core.response.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "rdc-service-a", fallback = AClientFallback.class)
public interface AClient {

    @GetMapping("feignTest")
    String testFeign();

    @GetMapping("reduce")
    Result reduceStock(@RequestParam("sid") String sid);
}
