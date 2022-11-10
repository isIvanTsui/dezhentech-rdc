package com.dezhentech.b.service.impl;

import cn.hutool.core.util.NumberUtil;
import cn.hutool.http.HttpStatus;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dezhentech.a.service.AClient;
import com.dezhentech.b.domain.Order;
import com.dezhentech.b.mapper.OrderMapper;
import com.dezhentech.b.service.OrderService;
import com.dezhentech.common.core.exceptions.ServiceException;
import com.dezhentech.common.core.response.Result;
import io.seata.core.context.RootContext;
import io.seata.core.exception.TransactionException;
import io.seata.spring.annotation.GlobalTransactional;
import io.seata.tm.api.GlobalTransactionContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author IvanTsui
 * @description 针对表【order】的数据库操作Service实现
 * @createDate 2022-11-10 10:07:38
 */
@Service
@Slf4j
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
        implements OrderService {
    @Resource
    private AClient aClient;

    @Override
    @GlobalTransactional
    public Result orderAdd() {
        log.info("Seata全局事务id=================>{}", RootContext.getXID());
        Order order = new Order(1, "雪花牛肉哦");
        this.save(order);
        Result result = aClient.reduceStock(1 + "");
        if (NumberUtil.equals(HttpStatus.HTTP_INTERNAL_ERROR, result.getCode())) {
            try {
                GlobalTransactionContext.reload(RootContext.getXID()).rollback();
                return Result.error("添加订单失败，事务已回滚");
            } catch (TransactionException e) {
                throw new ServiceException("回滚失败");
            }
        }
        return Result.success("添加订单成功");
    }

}




