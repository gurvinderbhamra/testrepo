package com.springBootDemo.springbootrestapi.repository;

import com.springBootDemo.springbootrestapi.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
