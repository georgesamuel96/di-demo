package com.example.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello(String s){
        System.out.println("Hello : " + s);
        return "foo";
    }
}
