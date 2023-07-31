package com.joseph.docker.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "{\"message\":\"Hello Developer Joseph Sagwe Birisio \"}";
//        return "{\"message\":\"Hello World Java v1\"}";
    }
}
