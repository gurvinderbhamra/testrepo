//Create an Employee Class with instance variables (String) name, (Integer)age, (String)city and get the instance of the Class using constructor reference

@FunctionalInterface
interface EmployeeInterface{
    Employee getEmployee(String name, Integer age, String city);
}

class Employee{
    String name;
    Integer age;
    String city;

    Employee(String name, Integer age, String city){
        System.out.println("Name : " + name);
        System.out.println("Age : " + name);
        System.out.println("City : " + city);
    }
}

public class Q4 {
    public static void main(String args[]){
        EmployeeInterface emp = Employee::new;
        emp.getEmployee("Rohan", 20, "Delhi");
    }
}

