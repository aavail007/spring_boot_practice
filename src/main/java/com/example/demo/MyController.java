package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}

