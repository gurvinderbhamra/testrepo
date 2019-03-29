package com.spring.rest.springrest.events;

import com.spring.rest.springrest.entities.Student;
import com.spring.rest.springrest.entities.User;
import com.spring.rest.springrest.repositories.StudentRepository;
import com.spring.rest.springrest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
public class Bootstrap {

    @Autowired
    UserRepository userRepository;

    @Autowired
    StudentRepository studentRepository;

    @EventListener(ContextRefreshedEvent.class)
    void setUp(){

        if(!userRepository.findAll().iterator().hasNext()) {
            IntStream.range(0, 10).forEach(e -> {
                User user = new User();
                user.setAge(20 + e);
                user.setName("name" + e);
                userRepository.save(user);
            });
        }

        if(!studentRepository.findAll().iterator().hasNext()) {
            IntStream.range(0,10).forEach(e -> {
                Student student = new Student();
                student.setAge(18 + e);
                student.setName("name" + e);
                studentRepository.save(student);
            });
        }
    }

}
