package com.joseph.springboot.todowebapplication.Todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {

    private static List<ToDo> todos = new ArrayList<>();

    private static int todosCount= 0;

    //initialize the static block
    static {
        todos.add(new ToDo(++todosCount,"Developer Joseph","Learn Spring Framework",
                LocalDate.now().plusDays(15),false));
        todos.add(new ToDo(++todosCount,"Developer Joseph","Learn Spring Microservices",
                LocalDate.now().plusDays(30),false));
        todos.add(new ToDo(++todosCount,"Developer Joseph","Learn CyberSecurity",
                LocalDate.now().plusDays(45),false));
    }

    public List<ToDo> findByUsername(String username){
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        ToDo todo = new ToDo(++todosCount,username,description,targetDate,done);
        todos.add(todo);
    }

    public void deleteById(int id) {
        //todo.getId() == id
        // todo -> todo.getId() == id
        Predicate<? super ToDo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }


    public ToDo findById(int id) {
        Predicate<? super ToDo> predicate = todo -> todo.getId() == id;
        ToDo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(@Valid ToDo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
