package com.joseph.springboot.todowebapplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController// by using this it will handle the view @ResponseBody
//@Controller using this you must use the @ResponseBody to handle the view
public class HelloWordController {

    @RequestMapping("/hello")
//    @ResponseBody // Used to return the string view text as it is
    public String hallo(){
        return "Hello Developer Joseph. What are you up to Today?";
    }
}
