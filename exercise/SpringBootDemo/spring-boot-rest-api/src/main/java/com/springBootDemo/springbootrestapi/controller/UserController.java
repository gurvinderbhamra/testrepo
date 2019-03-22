package com.springBootDemo.springbootrestapi.controller;

import com.springBootDemo.springbootrestapi.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    User user;

    @GetMapping("/getUsers")
    public String getUser(){
        logger.debug("Getting user having name : " + user.getUsername());
        return user.toString();
    }
}
