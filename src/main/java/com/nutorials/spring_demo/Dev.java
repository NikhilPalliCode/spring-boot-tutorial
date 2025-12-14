package com.nutorials.spring_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    /*
    Field Injection
    */
    @Autowired
    Laptop laptop;

    /*
    Constructor Injection
    public Dev(Laptop laptop){
        this.laptop = laptop;

    }
    Field Injection
    @Autowired
    public void setLaptop(Laptop laptop){
        this.laptop = laptop;
    }
    */
    public void build(){
        laptop.compile();
        System.out.println("Working on the project");
    }
}
