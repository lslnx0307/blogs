package com.lsl.blogs.beaninst;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath:spring-bean.xml")
public class MainConfig {

}
