package com.lsl.blogs.process;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@ToString
@Getter
@Setter
public class Apple implements InitializingBean, DisposableBean {

    private String name;

    public Apple() {
        System.out.println("lsl_苹果初始化...");
    }

//    public void init() {
//        System.out.println("init...");
//    }
//
//    public void destroy() {
//        System.out.println("destroy");
//    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("lsl_InitializingBean.afterPropertiesSet...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("lsl_DisposableBean.destroy...");
    }
}
