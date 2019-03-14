package Q8_9;

import org.springframework.stereotype.Component;

@Component("dummy2")
public class Dummy2 {
    void display(){
        System.out.println("Display of dummy class");
    }

    void displayFunctionDetails(){
        System.out.println("\nFunction Details : " );
    }
}
