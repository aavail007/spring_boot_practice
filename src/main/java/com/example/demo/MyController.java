package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/test")
    public String test() {
        throw new RuntimeException("test error");
    }

    @RequestMapping("/test2")
    public  String test2() {
        throw new IllegalArgumentException("test2 error");
    }
}
