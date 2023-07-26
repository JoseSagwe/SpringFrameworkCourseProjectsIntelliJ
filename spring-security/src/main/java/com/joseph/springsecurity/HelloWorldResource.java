package com.joseph.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

    @GetMapping("hello")
    public String helloWorld(){
        return "Developer Joseph Sagwe Birisio";
    }
}
