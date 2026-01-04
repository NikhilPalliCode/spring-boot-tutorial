package com.nutorials.spring_demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello, Welcome to the HomePage";
    }
}
