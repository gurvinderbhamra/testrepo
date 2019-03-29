package com.spring.rest.springrest.controllers;


import com.spring.rest.springrest.entities.*;
import com.spring.rest.springrest.exceptions.UserNotFoundException;
import com.spring.rest.springrest.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Locale;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    MessageSource messageSource;

    @GetMapping("/hello")
    String helloWorld(@RequestHeader(name="Accept-Language", required = false)Locale locale){
        return messageSource.getMessage("good.morning.message", null, locale);
    }

    @GetMapping("/student")
    List<Student> getUsers(){
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    Student getStudentById(@PathVariable Long id){

        Student student = studentService.getStudentById(id);
        if (student == null) {
            throw new UserNotFoundException("Sorry, Student not found. Please try with another id");
        }
        return studentService.getStudentById(id);
    }

    @PostMapping("/student")
    ResponseEntity<Student> saveStudent(@Valid @RequestBody Student student){
        studentService.saveStudent(student);

        URI uri=ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}").buildAndExpand(student.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/student/{id}")
    void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

    @PutMapping("/student/{id}")
    void update(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    //uri versioning
    @GetMapping("/name/V1/{name}")
    StudentV1 getStudentV1(@PathVariable String name){
        return new StudentV1(name);
    }

    //uri versioning
    @GetMapping("/name/V2/{firstName}/{lastName}")
    StudentV2 getStudentV2(@PathVariable String firstName, @PathVariable String lastName){
        return new StudentV2(new Name(firstName, lastName));
    }

    //parameter versioning
    @GetMapping(value = "/student/param", params = "version=2")
    StudentV2 getStudentParam2(){
        return new StudentV2(new Name("Peter", "Chaudhary"));
    }

    //header versioning
    @GetMapping(value = "/student/header", headers = "API-VERSON=1")
    StudentV1 getStudentHeader1(){
        return new StudentV1("Peter Kumar");
    }

    @GetMapping(value = "/student/header", headers = "API-VERSON=2")
    StudentV2 getStudentHeader2(){
        return new StudentV2(new Name("Peter", "Kumar"));
    }
}
