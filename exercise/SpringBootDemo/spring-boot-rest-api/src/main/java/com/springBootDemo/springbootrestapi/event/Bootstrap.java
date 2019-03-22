package com.springBootDemo.springbootrestapi.event;

import com.springBootDemo.springbootrestapi.entity.Student;
import com.springBootDemo.springbootrestapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class Bootstrap {

    @Autowired
    StudentRepository studentRepository;

    @EventListener(ApplicationStartedEvent.class)
    public void init(){
        System.out.println("Application is in running state");
        Iterator<Student> iterator = studentRepository.findAll().iterator();
        if(!iterator.hasNext()){
            for (int i = 1; i <= 10; i++) {
                Student student = new Student(i, "Name : " + i, "Address : " + i);
                studentRepository.save(student);
                System.out.println("Student " + i + " created");
            }
        }
    }
}
