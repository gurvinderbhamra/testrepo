import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparator<Employee>
{
    Double age;
    Double salary;
    String name;

    Employee(){}

    Employee(Double age, Double salary, String name)
    {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compare(Employee e1, Employee e2)
    {
        if(e1.salary > e2.salary)
            return 1;
        else if(e1.salary < e2.salary)
            return -1;
        return 0;
    }
}

public class Q4 {

    //Write a program to sort Employee objects based on highest salary using Comparator. Employee class{ Double Age; Double Salary; String Name

    public static void main(String args[])
    {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(20.0, 9000.0, "abc"));
        list.add(new Employee(22.0, 6000.0, "def"));
        list.add(new Employee(21.0, 8000.0, "ghi"));
        list.add(new Employee(23.0, 10000.0, "jkl"));

        System.out.println("Before sorting : ");
        for(Employee emp : list)
        {
            System.out.println("name : " + emp.name + ", age : " + emp.age + ", salary : " + emp.salary);
        }

        Collections.sort(list, new Employee());


        System.out.println("After sorting : ");
        for(Employee emp : list)
        {
            System.out.println("name : " + emp.name + ", age : " + emp.age + ", salary : " + emp.salary);
        }
    }
}

