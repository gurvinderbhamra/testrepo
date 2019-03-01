
//Implement following functional interfaces from java.util.function using lambdas:
//(1) Consumer
//(2) Supplier
//(3) Predicate
//(4) Function

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Employees{
    static private String companyName = "To The New";
    static String getCompanyName(){
        return companyName;
    }
}

public class Q5 {
    public static void main(String args[]){
        Consumer<String> consumer = System.out::println;
        consumer.accept("This is string for consumer");

        Supplier<String> supplier = Employees::getCompanyName;
        System.out.println("Supplier : " + supplier.get());

        Predicate<Integer> predicate = a -> a > 5;
        System.out.println("Predicate : " + predicate.test(17));
        System.out.println("Predicate : " + predicate.test(1));

        Function<String, String> function = String::toUpperCase;
        System.out.println("Function : " + function.apply("this will convert to uppercase"));
    }
}

