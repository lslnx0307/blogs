package com.lsl.blogs.schema.strategy;

/**
 * @author shiliang.li
 * @version 1.0.0
 * @Title: blogs
 * @Package com.lsl.blogs.schema.strategy
 * @Description: :
 * @time 2020/1/20 10:03
 */
public abstract class AbstractHandler {
    abstract public String handler(OrderDTO dto);
}
