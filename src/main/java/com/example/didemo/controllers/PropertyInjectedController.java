package com.example.didemo.controllers;

import com.example.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }
}
