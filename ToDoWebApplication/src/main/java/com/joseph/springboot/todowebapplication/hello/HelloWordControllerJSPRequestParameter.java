package com.joseph.springboot.todowebapplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller// by using this it will handle the view @ResponseBody
//@Controller using this you must use the @ResponseBody to handle the view
public class HelloWordControllerJSPRequestParameter {

    @RequestMapping("/hello-jsp1")

//    To request parameter in the browser
    //i.e  http://localhost:8080/hello-jsp?name=jose
    //use model concept to pass the name in the login jsp page
    public String halloJSP1(@RequestParam String name, ModelMap model){
        model.put("name",name);
        System.out.println("Welcome developer" + name);
        return "hello";
    }
}
