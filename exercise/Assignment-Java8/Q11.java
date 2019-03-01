//Find average of the number inside integer list after doubling it.

import java.util.stream.IntStream;

public class Q11 {
    public static void main(String args[]) {

        IntStream intStream = IntStream.rangeClosed(1, 10).map(e -> e * 2);
        System.out.println(intStream.average().getAsDouble());
    }
}

