package com.lsl.blogs.schema.strategy;

import org.springframework.stereotype.Component;

/**
 * @author shiliang.li
 * @version 1.0.0
 * @Title: blogs
 * @Package com.lsl.blogs.schema.strategy
 * @Description: :
 * @time 2020/1/20 10:06
 */
@Component
@HandlerType("1")
public class NormalHandler extends AbstractHandler {

    @Override
    public String handler(OrderDTO dto) {
        return "处理普通订单";
    }
}
