package com.joseph.rest.webservices.restful_web_services.user;

import com.joseph.rest.webservices.restful_web_services.exception.UserNotFoundException;
import com.joseph.rest.webservices.restful_web_services.jpa.PostRepository;
import com.joseph.rest.webservices.restful_web_services.jpa.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserJpaResource {

    private UserRepository repository;

    private PostRepository postRepository;

    @Autowired
    public UserJpaResource(UserRepository repository, PostRepository postRepository) {
        this.repository= repository;
        this.postRepository= postRepository;
    }


    //GET /users
    @GetMapping("jpa/users")
    public List<User> retrieveAllUsers(){
        return repository.findAll();
    }


    //GET /users
    @GetMapping("jpa/users/{id}")
    public User retrieveUser(@PathVariable int id){
        Optional<User> user = repository.findById(id);
        if(user.isEmpty())
            throw new UserNotFoundException("id:"+id);
        return user.get();
    }

    @DeleteMapping("jpa/users/{id}")
    public void deleteUser(@PathVariable int id){
        repository.deleteById(id);
    }



    //POST /users
//    @PostMapping("/users")
//    public void addUser(@RequestBody User user){
//        service.saveUser(user);
//    }


    //Adding Response type e.g. 201 and location e.g. localhost:8080/users/5
    //POST /users

    @PostMapping("jpa/users")
    public ResponseEntity<User> addUserWithResponse(@Valid @RequestBody User user){

        User savedUser = repository.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    //HATEOAS Hypermedia As The Engine Of Application State
    @GetMapping("jpa/usersWithLink/{id}")
    public EntityModel<User> retrieveUserWihLink(@PathVariable int id) {
        Optional<User> user = repository.findById(id);

        if(user.isEmpty())
            throw new UserNotFoundException("id:"+id);

        EntityModel<User> entityModel = EntityModel.of(user.get());

        WebMvcLinkBuilder link =  linkTo(methodOn(this.getClass()).retrieveAllUsers());
        entityModel.add(link.withRel("all-users"));

        return entityModel;
    }

    //Getting post for a specific user
    @GetMapping("jpa/users/{id}/posts")
    public List<Post> retrieveUserPosts(@PathVariable int id){
        Optional<User> user = repository.findById(id);
        if(user.isEmpty())
            throw new UserNotFoundException("id:"+id);
        return  user.get().getPosts();
    }

    //Getting post for a specific user
    @PostMapping("jpa/users/{id}/posts")
    public ResponseEntity<Object> createUserPosts(@PathVariable int id, @Valid @RequestBody Post post){
        Optional<User> user = repository.findById(id);
        if(user.isEmpty())
            throw new UserNotFoundException("id:"+id);
        post.setUser(user.get());

        Post savedPost = postRepository.save(post);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedPost.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

}
