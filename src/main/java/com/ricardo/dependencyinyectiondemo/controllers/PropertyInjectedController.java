package com.ricardo.dependencyinyectiondemo.controllers;

import com.ricardo.dependencyinyectiondemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/*
    Datys 5 >>> Ricardo Alberto Fraga   30/1/2020 15:25
*/
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
