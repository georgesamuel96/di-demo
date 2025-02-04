package com.example.didemo.controllers;

import com.example.didemo.services.GreetingService;

public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayHello();
    }
}
