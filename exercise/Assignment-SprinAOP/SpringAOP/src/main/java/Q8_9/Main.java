package Q8_9;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //----------------
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        Dummy2 dummy = ctx.getBean(Dummy2.class);
        dummy.display();
        dummy.displayFunctionDetails();
    }
}
