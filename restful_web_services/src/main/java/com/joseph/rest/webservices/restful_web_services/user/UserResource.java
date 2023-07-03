package com.joseph.rest.webservices.restful_web_services.user;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    private UserDataAccessObjectService service;

    @Autowired
    public UserResource(UserDataAccessObjectService service) {
        this.service = service;
    }


    //GET /users
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }


    //GET /users
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User user = service.findOne(id);
        if(user==null)
            throw new UserNotFoundException("id:"+id);
        return user;

    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        service.deleteById(id);
    }

    //POST /users
//    @PostMapping("/users")
//    public void addUser(@RequestBody User user){
//        service.saveUser(user);
//    }


    //Adding Response type e.g. 201 and location e.g. localhost:8080/users/5
    //POST /users

    @PostMapping("/users")
    public ResponseEntity<User> addUserWithResponse(@Valid @RequestBody User user){

        User savedUser = service.saveUser(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

}
