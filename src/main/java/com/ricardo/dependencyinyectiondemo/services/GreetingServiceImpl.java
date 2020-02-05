package com.ricardo.dependencyinyectiondemo.services;

import org.springframework.stereotype.Service;

/*
    Datys 5 >>> Ricardo Alberto Fraga   30/1/2020 15:22
*/
@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
