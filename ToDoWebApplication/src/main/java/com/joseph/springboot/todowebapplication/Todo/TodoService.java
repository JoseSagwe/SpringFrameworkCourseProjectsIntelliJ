package com.joseph.springboot.todowebapplication.Todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<ToDo> todos = new ArrayList<>();

    //initialize the static block
    static {
        todos.add(new ToDo(1,"Developer Joseph","Learn Spring Framework",
                LocalDate.now().plusDays(15),false));
        todos.add(new ToDo(2,"Developer Joseph","Learn Spring Microservices",
                LocalDate.now().plusDays(30),false));
        todos.add(new ToDo(3,"Developer Joseph","Learn CyberSecurity",
                LocalDate.now().plusDays(45),false));
    }

    public List<ToDo> findByUsername(String username){
        return todos;
    }

}
