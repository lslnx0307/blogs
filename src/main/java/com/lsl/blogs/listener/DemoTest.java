package com.lsl.blogs.listener;

import com.lsl.blogs.service.BlogTypeEnum;

public class DemoTest {

    public static void main(String[] args) {
        BlogTypeEnum.valueOf("zaoshang").eat();
        BlogTypeEnum.valueOf("wanshang").eat();
        BlogTypeEnum.valueOf("zhongwu").eat();
    }
}
