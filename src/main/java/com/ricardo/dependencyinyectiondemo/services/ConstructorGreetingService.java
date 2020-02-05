package com.ricardo.dependencyinyectiondemo.services;

import org.springframework.stereotype.Service;

/*
    Datys 5 >>> Ricardo Alberto Fraga   5/2/2020 10:24
*/
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was inyected via the constructor!!!";
    }
}
