package com.joseph.springboot.todowebapplication.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// by using this it will handle the view @ResponseBody
//@Controller using this you must use the @ResponseBody to handle the view
public class HelloWordControllerHTML {

    @RequestMapping("/hello-html")
//    @ResponseBody // Used to return the string view text as it is
    public String hallo(){
        StringBuffer sb = new StringBuffer();
        sb.append("<Html>");
        sb.append("<title>Welcome Developer Joseph</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Welcome Developer Joseph</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
}
