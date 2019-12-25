package com.lsl.blogs.service;

public enum BlogTypeEnum implements PersonService {
    zaoshang {
        @Override
        public void eat() {
            System.out.println("吃包子");
        }
    },
    zhongwu {
        @Override
        public void eat() {
            System.out.println("吃面");
        }
    },
    wanshang {
        @Override
        public void eat() {
            System.out.println("撸串");
        }
    }
}
