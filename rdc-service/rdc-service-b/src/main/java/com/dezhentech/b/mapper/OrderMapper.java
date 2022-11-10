package com.dezhentech.b.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dezhentech.b.domain.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author IvanTsui
 * @description 针对表【order】的数据库操作Mapper
 * @createDate 2022-11-10 10:07:38
 * @Entity generator.domain.Order
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}




