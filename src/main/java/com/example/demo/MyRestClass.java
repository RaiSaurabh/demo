package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class MyRestClass {
    
    @GetMapping
    public  String hello(){
        System.out.println("######::::::::::::###########:::::::::Request Received##############");
        return "Hello World......";
    }
}
