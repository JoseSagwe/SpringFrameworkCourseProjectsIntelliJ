package com.joseph.springboot.todowebapplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller// by using this it will handle the view @ResponseBody
//@Controller using this you must use the @ResponseBody to handle the view
public class HelloWordControllerJSP {
    @RequestMapping("/hello-jsp")
//    @ResponseBody // Used to return the string view text as it is
    public String halloJSP(){
        return "hello";   //Will redirect to jsp page
    }
}
