package com.joseph.springboot.todowebapplication.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<ToDo, Integer> {
    List<ToDo> findByUsername(String username);
}
