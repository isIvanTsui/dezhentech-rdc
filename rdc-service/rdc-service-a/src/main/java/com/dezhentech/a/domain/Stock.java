package com.dezhentech.a.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: 股票
 * @title: com.dezhentech.a.domain.Stock
 * @author: yingfan.cui@dezhentech.com
 * @create: 2022/11/10 10:16:30
 * @version: 1.0.0
 **/
@TableName(value ="stock")
@Data
public class Stock implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer count;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}