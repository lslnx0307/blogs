package com.lsl.blogs;


import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BlogsApplicationTests {

    @Test
    void contextLoads() {
    }


    @Test
    public void test01() {
        System.out.println(1 < 1);
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student = new Student();
        Student.a a = new Student.a();
        a.setAge(19);
        student.setA(a);
        list.add(student);
        System.out.println(JSON.toJSONString(student));
        System.out.println(list);
    }
}
