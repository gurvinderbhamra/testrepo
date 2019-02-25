import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
    String name;
    Double score;
    Double age;

    @Override
    public int compareTo(Student s)
    {
        if(this.score > s.score)
            return 1;
        else if(this.score < s.score)
            return -1;
        else
        {
            return this.name.compareTo(s.name);
        }
    }

    Student(String name, Double score, Double age)
    {
        this.name = name;
        this.score = score;
        this.age = age;
    }

//    Student(){}
}

public class Q5
{
    public static void main(String args[])
    {
        //Write a program to sort the Student objects based on Score , if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age
        List<Student> list = new ArrayList<>();
        list.add(new Student("abc", 10.0, 20.0));
        list.add(new Student("def", 9.0, 19.0));
        list.add(new Student("ghi", 11.0, 21.0));
        list.add(new Student("jkl", 9.0, 18.0));

        System.out.println("List before sorting : ");
        for(Student s : list)
        {
            System.out.println("name : " + s.name + ", score : " + s.score + ", age : " + s.age);
        }

        Collections.sort(list);

        System.out.println("\nList after sorting : ");
        for(Student s : list)
        {
            System.out.println("name : " + s.name + ", score : " + s.score + ", age : " + s.age);
        }
    }
}
