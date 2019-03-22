package com.springBootDemo.springbootrestapi.controller;

import com.springBootDemo.springbootrestapi.entity.Database;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {

    Logger logger = LoggerFactory.getLogger(DatabaseController.class);

    @Autowired
    Database database;

    @GetMapping("/database")
    public String database(){
        logger.info("Database controller: database method");
        return database.toString();
    }
}
