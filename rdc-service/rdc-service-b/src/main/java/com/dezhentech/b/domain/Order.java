package com.dezhentech.b.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: 订单
 * @title: com.dezhentech.b.domain.Order
 * @author: yingfan.cui@dezhentech.com
 * @create: 2022/11/10 10:12:59
 * @version: 1.0.0
 **/
@TableName(value ="tb_order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {

    public Order(Integer sid, String orderInfo) {
        this.sid = sid;
        this.orderInfo = orderInfo;
    }

    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Integer sid;

    /**
     * 
     */
    private String orderInfo;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}