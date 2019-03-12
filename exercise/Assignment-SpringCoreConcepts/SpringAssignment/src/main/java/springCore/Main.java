package springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Database database = context.getBean("database", Database.class);

        System.out.println(database);

        System.out.println("Database Name : " + database.getName());
        System.out.println("Database Port : " + database.getPort());

        Restaurant restaurant = context.getBean("teaRestaurant", Restaurant.class);
        System.out.println("\n" + restaurant);

        restaurant = context.getBean("expressTeaRestaurant", Restaurant.class);
        System.out.println("\n" + restaurant);

        Complex complex = context.getBean("complexObject", Complex.class);
        System.out.println("Complex List : " + complex.getList());
        System.out.println("Complex Map : " + complex.getMap());
        System.out.println("Complex Set : " + complex.getSet());

        System.out.println("\nteaRestaurant has prototype scope : " + context.isPrototype("teaRestaurant"));
    }
}
