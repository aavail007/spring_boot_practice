package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @RequestMapping("/test1")
    public String test1(@RequestParam Integer id,
                        @RequestParam(required = false) String name,
                        @RequestParam(defaultValue = "12") String age){
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        return  "Hello test1" + id + name;
    }

    @RequestMapping("/test2")
    public String test2(@RequestBody Student student) {
        System.out.println("student ID = " + student.id);
        System.out.println("student name = " + student.name);
        return "Hello test2";
    }

    @RequestMapping("/test3")
    public  String test3(@RequestHeader String info) {
        System.out.println("header info" + info);
        return "Hello test3";
    }
}

