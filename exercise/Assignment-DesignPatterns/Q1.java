
//Implement Singleton Design Pattern on a dummy class.

class Employee{
    private static Employee emp;
    int id;
    String name;

    private Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    static Employee getInstance(){
        if (emp == null) {
            emp = new Employee(1, "abc");
        }
        return emp;
    }

    @Override
    public String toString(){
        return "Employee ID : " + this.id + "\t Employee Name : " + this.name;
    }
}

public class Q1 {
    public static void main(String args[]){
        System.out.println(Employee.getInstance());
        System.out.println(Employee.getInstance());
    }
}

