package com.joseph.rest.webservices.restful_web_services.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OperationsClass {

    private int a;
    private int b;
    public double addition(int a, int b){
        return a + b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }
}
