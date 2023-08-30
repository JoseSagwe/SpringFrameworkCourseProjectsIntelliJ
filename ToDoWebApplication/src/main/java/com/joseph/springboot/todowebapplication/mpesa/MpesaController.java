package com.joseph.springboot.todowebapplication.mpesa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MpesaController {

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcomeUser";
    }

    @RequestMapping("/sendMoney")
    public String sendMoney(){
        return "sendMoney";
    }
}

