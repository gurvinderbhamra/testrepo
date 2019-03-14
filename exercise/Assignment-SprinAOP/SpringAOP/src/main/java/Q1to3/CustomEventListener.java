package Q1to3;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("Custom event listener ..");
    }
}
