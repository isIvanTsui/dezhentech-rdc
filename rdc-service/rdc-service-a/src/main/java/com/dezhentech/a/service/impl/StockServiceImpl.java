package com.dezhentech.a.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dezhentech.a.domain.Stock;
import com.dezhentech.a.mapper.StockMapper;
import com.dezhentech.a.service.StockService;
import org.springframework.stereotype.Service;

/**
 * @author IvanTsui
 * @description 针对表【stock】的数据库操作Service实现
 * @createDate 2022-11-10 10:14:55
 */
@Service
public class StockServiceImpl extends ServiceImpl<StockMapper, Stock>
        implements StockService {

}




