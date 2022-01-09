package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HpPrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println("HP印表機:" + message);
    }
}
