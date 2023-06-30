package com.joseph.springboot.todowebapplication.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean Authentication(String username, String password){
        boolean validUsername = username.equalsIgnoreCase("developer");
        boolean validPassword = password.equalsIgnoreCase("1234");
        return validUsername && validPassword;
    }

}
