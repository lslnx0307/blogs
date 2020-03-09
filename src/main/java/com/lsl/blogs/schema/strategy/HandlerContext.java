package com.lsl.blogs.schema.strategy;

import org.springframework.beans.BeanUtils;

import java.util.Map;

/**
 * @author shiliang.li
 * @version 1.0.0
 * @Title: blogs
 * @Package com.lsl.blogs.schema.strategy
 * @Description: :
 * @time 2020/1/20 10:09
 */
public class HandlerContext {

    private Map<String, Class> handlerMap;

    public HandlerContext(Map<String, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public AbstractHandler getAbstractHandler(String type) {
        Class aClass = handlerMap.get(type);
        if (aClass == null) {
            throw new IllegalArgumentException("not found handler for type: " + type);
        }
        return (AbstractHandler) BeanUtils.instantiateClass(aClass);
    }
}
