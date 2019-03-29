package com.spring.rest.springrest.entities;

public class StudentV2 {

    private Name name;

    public StudentV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentV2{" +
                "name=" + name +
                '}';
    }
}
