package com.joseph.rest.webservices.restful_web_services.hello;

import org.springframework.web.bind.annotation.*;

@RestController    //This is a controller that will expose a rest API
public class HelloController {

    @GetMapping (path = "/") //URL to REST APA
//    @ResponseBody
    public String hello(){
        return "Hello Developer Joseph Sagwe";
    }

    @GetMapping("/hello-bean/{name}")
    public HelloBean helloBean(@PathVariable String name){
        return new HelloBean(String.format("Hello Buddy I am Developer %s", name));
    }

    //pathVariables. used to extract values from the URL path
    @GetMapping("/user/{name}/{age}")
    public String variable(@PathVariable String name, @PathVariable Long age){
        return "My name is " + name + "and i am " + age +" years old";
    }
}

