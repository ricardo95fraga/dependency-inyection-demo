package com.ricardo.dependencyinyectiondemo.controllers;

import com.ricardo.dependencyinyectiondemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/*
    Datys 5 >>> Ricardo Alberto Fraga   30/1/2020 15:24
*/
@Controller
public class GetterInjectedController {
    @Autowired
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
