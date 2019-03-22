package com.springBootDemo.springbootrestapi.service;

import com.springBootDemo.springbootrestapi.entity.Student;
import com.springBootDemo.springbootrestapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents(){
        List<Student> studentList = new ArrayList<>();
        Iterator<Student> studentIterator = studentRepository.findAll().iterator();
        studentIterator.forEachRemaining(studentList::add);
        return studentList;
    }
}
