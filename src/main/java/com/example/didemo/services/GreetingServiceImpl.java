package com.example.didemo.services;

public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_GEORGE = "Hello George !";

    @Override
    public String sayHello() {
        return HELLO_GEORGE;
    }
}
