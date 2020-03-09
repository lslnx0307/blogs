package com.lsl.blogs.schema.strategy;

/**
 * @author shiliang.li
 * @version 1.0.0
 * @Title: blogs
 * @Package com.lsl.blogs.schema.strategy
 * @Description: :
 * @time 2020/1/20 9:58
 */
public interface IOrderService {

    /**
     * 根据订单不同的做出不同的处理
     * @param dto
     * @return
     */
    String handle(OrderDTO dto);
}
