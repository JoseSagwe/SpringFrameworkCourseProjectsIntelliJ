package com.joseph.rest.webservices.restful_web_services.hello;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController    //This is a controller that will expose a rest API
public class HelloController {

   private MessageSource messageSource;

    public HelloController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

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

    @GetMapping (path = "hello-internationalization") //URL to REST APA
    public String helloInternationalization(){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default Message", locale );



//		- Example: `en` - English (Good Morning)
//		- Example: `nl` - Dutch (Goedemorgen)
//		- Example: `fr` - French (Bonjour)
//		- Example: `de` - Deutsch (Guten Morgen)
    }
}

