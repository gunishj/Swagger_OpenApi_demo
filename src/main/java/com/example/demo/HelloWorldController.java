package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String HelloWorld(){
        return "Hello world from the spring boot";
    }

    @RequestMapping("/goodbye")
    public String GoodBye(){
        return "Goodbye from the spring boot";
    }
}
