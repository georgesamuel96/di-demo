package com.example.didemo.controllers;


import com.example.didemo.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayHello();
    }

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
