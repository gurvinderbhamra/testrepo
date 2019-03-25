package com.jpademo;

import com.jpademo.config.PersistenceContext;
import com.jpademo.entity.Person;
import com.jpademo.repositories.PersonRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceContext.class);

        Person person= new Person();
        person.setId(1);
        person.setAge(25);
        person.setFirstName("Gurvinder");
        person.setLastName("Singh");
        person.setSalary(400000);

        PersonRepository personRepository = applicationContext.getBean(PersonRepository.class);
        personRepository.save(person);

        Person person1= new Person();
        person1.setId(2);
        person1.setAge(31);
        person1.setFirstName("Dharmender");
        person1.setLastName("Singh");
        person1.setSalary(400000);
        personRepository.save(person1);

        Person person2= new Person();
        person2.setId(3);
        person2.setAge(27);
        person2.setFirstName("Nitin");
        person2.setLastName("Singh");
        person2.setSalary(400000);
        personRepository.save(person2);

        Person person3 = new Person();
        person3.setId(4);
        person3.setAge(18);
        person3.setFirstName("Peter");
        person3.setLastName("Kumar");
        person3.setSalary(4000);
        personRepository.save(person3);

        Person person4 = new Person();
        person3.setId(4);
        person3.setAge(18);
        person3.setFirstName("Peter");
        person3.setLastName("Kumar");
        person3.setSalary(4000);
        personRepository.save(person3);

        //get all the persons
        List<Person> personList = personRepository.findAll();
        printPersonList(personList);

        //get person with id=1
        System.out.println("\n" + personRepository.findById(1));

        //get persons with firstName
        System.out.println("\n" + personRepository.findByFirstName("Gurvinder"));

        //get persons with lastName
        System.out.println("\n" + personRepository.findByLastName("Singh"));

        //delete
//        personRepository.delete(2);
//        personRepository.delete(person2);

        //find first name with age 25
        System.out.println("\n" + personRepository.findByAgeOf25());

        //find firstName and lastName with age 25
       personRepository.findFirstNameLastNameByAge25().forEach(e-> System.out.println(Arrays.toString(e)));

       //find all information with age 25
        List<Person> personList1 = personRepository.findAllByAge25();
        printPersonList(personList1);

        //count number of persons having firstname = Peter
        System.out.println("\n\nNumber of person having name 'Peter' : " + personRepository.countPeters());

        //various operations
        variousOperations(personRepository);

        System.out.println("\n\nSort persons by id with age > 25 : ");
        List<Person> personList2 = personRepository.sortById();
        printPersonList(personList2);

        System.out.println("\n\nUsing sort function:");
        personList2 = personRepository.findAll(new Sort(Sort.Direction.DESC,"age").and(
                new Sort(Sort.Direction.ASC,"firstName")));
        printPersonList(personList2);

        System.out.println("\n\nPagination:");
        Page<Person> personPage = personRepository.findAll(new PageRequest(0,3, new Sort(Sort.Direction.DESC, "id")));
        personList = personPage.getContent();
        System.out.println(personList);
    }

    static void variousOperations(PersonRepository personRepository){
        System.out.println("\nCount : " + personRepository.countByFirstName("Gurvinder"));
        System.out.println("\nDistinct by age: " + personRepository.findDistinctByAge(24));
        System.out.println("\nFind by First Name or Age : " + personRepository.findByFirstNameOrAge("Gurvinder", 22));
        System.out.println("\nFind by First Name And Age : " + personRepository.findByFirstNameAndAge("Dharmender", 21));
        System.out.println("\nFind by age between 18 and 25 : " + personRepository.findByAgeBetween(18, 25));
        System.out.println("\nFind by age less than 20 : " + personRepository.findByAgeLessThan(20));
        System.out.println("\nFind by age greater than 20 : " + personRepository.findByAgeGreaterThan(20));
        System.out.println("\nFind by first name like : " + personRepository.findByFirstNameLike("Gurvin%"));
        System.out.println("\nFind by first name not : " + personRepository.findByFirstNameNot("Gurvin%"));
        System.out.println("\nFind by Age In : " + personRepository.findByAgeIn(Arrays.asList(10, 18, 20, 22, 23, 24)));
        System.out.println("\nFind by first name ignore case : " + personRepository.findByFirstNameIgnoreCase("Dharmender"));
    }

    static void printPersonList(List<Person> list){
        for(Person p : list)
            System.out.println(p);
    }
}
