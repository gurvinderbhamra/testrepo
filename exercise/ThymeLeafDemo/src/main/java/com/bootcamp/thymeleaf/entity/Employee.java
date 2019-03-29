package com.bootcamp.thymeleaf.entity;

import com.bootcamp.thymeleaf.enm.EmployeesType;

public class Employee {
    private String name;
    private Integer age;
    private String address;
    private Integer phone;
    private Boolean isAdmin;
    private EmployeesType employeesType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", isAdmin=" + isAdmin +
                '}';
    }

    public EmployeesType getEmployeesType() {
        return employeesType;
    }

    public void setEmployeesType(EmployeesType employeesType) {
        this.employeesType = employeesType;
    }
}
