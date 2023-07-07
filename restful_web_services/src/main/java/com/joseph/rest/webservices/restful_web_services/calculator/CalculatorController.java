package com.joseph.rest.webservices.restful_web_services.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    OperationsClass operation;

    @Autowired
    public CalculatorController(OperationsClass operation) {
        this.operation = operation;
    }

    @GetMapping("/addition")
    public String add(){
        return "The total is: " + operation.addition(50,30);
    }

    @GetMapping("/multiplication")
    public String multiplication(){
        return "The multiplication is: " + operation.multiplication(50,30);
    }


}
