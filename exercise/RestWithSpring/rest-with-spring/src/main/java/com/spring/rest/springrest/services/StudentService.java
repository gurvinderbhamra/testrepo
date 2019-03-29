package com.spring.rest.springrest.services;

import com.spring.rest.springrest.entities.Student;
import com.spring.rest.springrest.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return (List<Student>) studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        Optional<Student> optionalStudent = studentRepository.findById(id);
        return optionalStudent.isPresent() ? optionalStudent.get() : null;
    }

    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

    public void updateStudent(Student student){
        Student student1 = studentRepository.findById(student.getId()).get();
        student1.setName(student.getName());
        student1.setAge(student.getAge());
        studentRepository.save(student1);
    }
}
