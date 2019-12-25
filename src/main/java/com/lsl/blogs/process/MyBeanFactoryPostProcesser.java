package com.lsl.blogs.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

//@Component
public class MyBeanFactoryPostProcesser implements BeanFactoryPostProcessor {
    /**
     * BeanFactoryPostProcessor在bean定义已经被加载到ioc容器但未被初始化的时候，对bean定义信息进行修改
     * @param configurableListableBeanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("lsl_BeanFactoryPostProcessor run ...");
        BeanDefinition apple = configurableListableBeanFactory.getBeanDefinition("apple");
        apple.getPropertyValues().add("name", "红富士");
    }
}
