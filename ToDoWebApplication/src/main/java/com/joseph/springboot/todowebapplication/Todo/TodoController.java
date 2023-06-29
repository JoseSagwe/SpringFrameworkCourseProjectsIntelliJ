package com.joseph.springboot.todowebapplication.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {
   private TodoService todoservice;

   @Autowired
    public TodoController(TodoService todoservice) {
        this.todoservice = todoservice;
    }

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model){
       List<ToDo> todos =  todoservice.findByUsername("Developer Joseph");
       model.addAttribute("todos", todos);
        return "listTodos";
    }
}
