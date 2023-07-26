package com.joseph.springsecurity.resources;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResource {

    public static final List<Todo> LIST_TODOS = List.of(new Todo("Joseph", "Learn Ethical Hacking"),
                                                        new Todo("Joseph", "Learn Cyber security"));

    @GetMapping("/todos")
    public List<Todo> retrieveAllTodos() {
        return LIST_TODOS;
    }


    @GetMapping("/users/{username}/todos")
    public Todo retrieveTodosForASpecificUser(@PathVariable String username){
        return LIST_TODOS.get(0);
    }

    @PostMapping ("/users/{username}/todos")
    public void createTodoForASpecificUser(@PathVariable String username, @RequestBody Todo todo){
       
    }
}


record Todo (String username, String description){}
