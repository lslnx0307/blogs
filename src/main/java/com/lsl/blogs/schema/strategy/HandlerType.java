package com.lsl.blogs.schema.strategy;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author shiliang.li
 * @version 1.0.0
 * @Title: blogs
 * @Package com.lsl.blogs.schema.strategy
 * @Description: :
 * @time 2020/1/20 10:04
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandlerType {

    String value();
}
