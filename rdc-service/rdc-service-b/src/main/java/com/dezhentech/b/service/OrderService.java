package com.dezhentech.b.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dezhentech.b.domain.Order;
import com.dezhentech.common.core.response.Result;

/**
 * @author IvanTsui
 * @description 针对表【order】的数据库操作Service
 * @createDate 2022-11-10 10:07:38
 */
public interface OrderService extends IService<Order> {
    Result orderAdd();
}
