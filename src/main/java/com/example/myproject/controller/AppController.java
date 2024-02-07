package com.example.myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController{
    @GetMapping
    public String getHello(){
        return "Hello SprinBoot";
    }
}
