package com.lsl.blogs.schema.strategy;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author shiliang.li
 * @version 1.0.0
 * @Title: blogs
 * @Package com.lsl.blogs.schema.strategy
 * @Description: :
 * @time 2020/1/20 9:58
 */

@Data
public class OrderDTO {

    private String code;

    private BigDecimal price;

    private String type;
}
