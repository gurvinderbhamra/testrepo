package springaop;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

//Question 2
public class MyEventListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("Event fired");
    }
}
