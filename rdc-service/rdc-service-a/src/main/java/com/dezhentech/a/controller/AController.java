package com.dezhentech.a.controller;

import com.dezhentech.a.domain.Stock;
import com.dezhentech.a.service.AClient;
import com.dezhentech.a.service.StockService;
import com.dezhentech.common.core.exceptions.ServiceException;
import com.dezhentech.common.core.response.Result;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class AController implements AClient {
    @Autowired
    private StockService service;
    @Override
    public String testFeign() {
        return "rdc-service-a的testFeign()方法被调用了";
    }

    @Override
    @Transactional
    public Result reduceStock(String sid) {
        try {
            int a = 1/0;
            Stock stock = service.getById(sid);
            stock.setCount(stock.getCount() - 1);
            service.updateById(stock);
        } catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
        return Result.success("减库存成功");
    }
}
