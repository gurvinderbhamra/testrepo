package Q1to3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void display(){
        CustomEvent customEvent = new CustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
        System.out.println("Custom event published...");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
