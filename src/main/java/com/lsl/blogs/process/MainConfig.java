package com.lsl.blogs.process;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ComponentScan(basePackages = "com.lsl.blogs.process")
public class MainConfig {

    @Bean
    public Apple apple() {
        return new Apple();
    }
}
