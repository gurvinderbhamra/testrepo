package com.hibernatedemo;

import javax.persistence.*;
import java.util.*;

@Entity
public class Author {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id @GeneratedValue(strategy = GenerationType.TABLE)   //this creates one more table in database names hibernate_sequences
    private Integer ID;

    @Column(name = "First_Name")
    private String firstName;

    @Transient
    @Column(name = "Last_Name")     //@column name is added but this column will not be added in table
    private String lastName;

    @Column(name = "Age")
    private Integer age;

    @Temporal(TemporalType.DATE)
    @Column(name = "Date_Of_Birth")
    private Date dob;

    @Embedded
    private Address address;

    @ElementCollection
    private List<String> subjects = new ArrayList<>();

//    @OneToOne
//    @JoinColumn(name = "Book_Join")
//    private Book book;

    //Unidirectional onetomany
//    @OneToMany
//    @OneToMany(mappedBy = "author")
//    @JoinTable(joinColumns = @JoinColumn(name="AuthorID"), inverseJoinColumns = @JoinColumn(name = "BookID"))
//    @OneToMany(cascade = CascadeType.PERSIST)
    @ManyToMany
    Set<Book> books = new HashSet<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
