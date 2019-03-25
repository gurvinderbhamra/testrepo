package com.jpademo.repositories;

import com.jpademo.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {
    List<Person> findByFirstName(String firstName);
    List<Person> findByLastName(String lastName);
    Person findById(Integer id);

    List<Person> findAll();

    @Query("SELECT p.firstName FROM Person p WHERE p.age = 25")
    List<Person> findByAgeOf25();

    @Query("SELECT p.firstName, p.lastName FROM Person p WHERE p.age = 25")
    List<Object[]> findFirstNameLastNameByAge25();

    @Query("SELECT p from Person p where p.age = 25")
    List<Person> findAllByAge25();

    @Query("SELECT COUNT(*) FROM Person where firstName='Peter'")
    Integer countPeters();

    Integer countByFirstName(String firstName);

    List<Person> findDistinctByAge(Integer age);

    List<Person> findByFirstNameOrAge(String firstName, Integer age);

    List<Person> findByFirstNameAndAge(String firstName, Integer age);

    List<Person> findByAgeBetween(Integer min, Integer max);

    List<Person> findByAgeLessThan(int age);

    List<Person> findByAgeGreaterThan(int age);

    List<Person> findByFirstNameLike(String firstName);

    List<Person> findByFirstNameNot(String firstName);

    List<Person> findByAgeIn(List<Integer> ageList);

    List<Person> findByFirstNameIgnoreCase(String name);

    @Query("SELECT p FROM Person p WHERE p.age > 25 ORDER BY id")
    List<Person> sortById();

    List<Person> findAll(Sort sort);

    Page<Person> findAll(Pageable pageable);
}
