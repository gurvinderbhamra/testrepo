package com.spring.rest.springrest.controllers;


import com.spring.rest.springrest.entities.User;
import com.spring.rest.springrest.exceptions.UserNotFoundException;
import com.spring.rest.springrest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@ControllerAdvice
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/users")
    List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    User getUserById(@PathVariable Long id){

        User user = userService.getUserById(id);
        if (user == null) {
            throw new UserNotFoundException("Sorry, User not found. Please try with another id");
        }
        return userService.getUserById(id);
    }

    @PostMapping("/users")
    ResponseEntity<User> saveUser(@RequestBody User user){
        userService.saveUser(user);

        URI uri=ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}").buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

}
