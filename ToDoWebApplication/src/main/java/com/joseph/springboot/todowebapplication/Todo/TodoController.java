package com.joseph.springboot.todowebapplication.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("username")
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

    @RequestMapping("/add-to")
    public String addToDo(){
       return "addTodo";
    }
}
