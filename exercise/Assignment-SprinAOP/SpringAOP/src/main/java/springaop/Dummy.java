package springaop;

import org.springframework.stereotype.Service;

@Service("dummy")
public class Dummy {
    public void display(){
        System.out.println("Display of dummy class");
    }
}
