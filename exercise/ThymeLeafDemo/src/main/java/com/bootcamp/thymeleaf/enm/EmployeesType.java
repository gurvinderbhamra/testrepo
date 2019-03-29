package com.bootcamp.thymeleaf.enm;

import java.util.Arrays;
import java.util.List;

public enum EmployeesType {
    USER("USER"), ADMIN("ADMIN"), SUPER_ADMIN("SUPER_ADMIN");

    String value;

    EmployeesType(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public static List<EmployeesType> getValues(){
        return Arrays.asList(USER, ADMIN, SUPER_ADMIN);
    }
}
