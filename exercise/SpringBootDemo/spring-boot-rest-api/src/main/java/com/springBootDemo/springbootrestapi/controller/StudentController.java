package com.springBootDemo.springbootrestapi.controller;

import com.springBootDemo.springbootrestapi.entity.Student;
import com.springBootDemo.springbootrestapi.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    StudentService studentService;


    @GetMapping("/students")
    public List<Student> getStudents(){
        logger.info("Getting list of Students : ", Student.class);
        return studentService.getStudents();
    }
}
