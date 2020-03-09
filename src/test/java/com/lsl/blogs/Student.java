package com.lsl.blogs;

import lombok.Data;

/**
 * @author shiliang.li
 * @version 1.0.0
 * @Title: blogs
 * @Package com.lsl.blogs
 * @Description: :
 * @time 2020/1/16 15:21
 */
@Data
public class Student {

    private a a;

    @Data
    public static class a {
        private String name;

        private Integer age;
    }
}
