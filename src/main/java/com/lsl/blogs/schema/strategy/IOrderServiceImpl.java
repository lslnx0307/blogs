package com.lsl.blogs.schema.strategy;

import org.springframework.stereotype.Service;

/**
 * @author shiliang.li
 * @version 1.0.0
 * @Title: blogs
 * @Package com.lsl.blogs.schema.strategy
 * @Description: :
 * @time 2020/1/20 9:59
 */
@Service
public class IOrderServiceImpl implements IOrderService{
    /**
     * 常规的写法
     * @param dto
     * @return
     */
    @Override
    public String handle(OrderDTO dto) {
        if (("1").equals(dto.getType())) {
            return "处理普通订单";
        }else if (("2").equals(dto.getType())) {
            return "处理团购订单";
        }else if("3".equals(dto.getType())) {
            return "处理促销订单";
        }
        return null;
    }


}
