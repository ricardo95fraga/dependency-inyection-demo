package com.ricardo.dependencyinyectiondemo.services;

import org.springframework.stereotype.Service;

/*
    Datys 5 >>> Ricardo Alberto Fraga   5/2/2020 10:29
*/
@Service
public class GetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - I was inyecter by the getter";
    }
}
