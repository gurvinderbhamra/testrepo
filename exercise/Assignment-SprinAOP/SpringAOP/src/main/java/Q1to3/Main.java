package Q1to3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springaop.Dummy;

public class Main {
    public static void main(String[] args) {
        //----------------
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        ctx.start();
        Dummy dummy = ctx.getBean("dummy", Dummy.class);
        dummy.display();
        ctx.stop();

        CustomEventPublisher customEventPublisher = ctx.getBean("customEventPublisher", CustomEventPublisher.class);
        customEventPublisher.display();

        //---------------------------------------
        Database database = ctx.getBean("database", Database.class);
        database.connect(customEventPublisher);
        System.out.println("Database Name : " + database.getName());
        System.out.println("Database Port : " + database.getPort());
    }
}
