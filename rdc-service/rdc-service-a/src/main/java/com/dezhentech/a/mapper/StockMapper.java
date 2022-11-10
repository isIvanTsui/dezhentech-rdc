package com.dezhentech.a.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dezhentech.a.domain.Stock;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author IvanTsui
 * @description 针对表【stock】的数据库操作Mapper
 * @createDate 2022-11-10 10:14:55
 * @Entity generator.domain.Stock
 */
@Mapper
public interface StockMapper extends BaseMapper<Stock> {

}




