package com.joseph.springsecurity.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Software Developer Joseph Sagwe Birisio";
    }
}
