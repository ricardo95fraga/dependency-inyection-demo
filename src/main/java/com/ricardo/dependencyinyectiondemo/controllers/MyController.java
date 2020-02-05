package com.ricardo.dependencyinyectiondemo.controllers;

import org.springframework.stereotype.Controller;

/*
    Datys 5 >>> Ricardo Alberto Fraga   30/01/2020
*/
@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!!!");

        return "foo";
    }
}
