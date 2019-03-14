package springaop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //----------------
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        //-----------------------------------------
        Services services = ctx.getBean("services", Services.class);
        services.service1();
        services.service2();
        services.service3();
        services.service4(10);

        //----------------------------------------
        try {
            services.service5();
        }
        catch (IOException e) { }

        //---------------------------------------

    }
}
