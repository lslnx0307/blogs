package com.lsl.blogs.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class MyListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent myEvent) {
        System.out.println("MyListener 监听了：" + myEvent);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        context.publishEvent(new ApplicationEvent("自已的事件") {
            @Override
            public Object getSource() {
                return super.getSource();
            }
        });
        context.close();
    }
}
