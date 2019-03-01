//Sum all the numbers greater than 5 in the integer list.

import java.util.ArrayList;
import java.util.List;

public class Q10 {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < 20 ; i++)
            list.add(i);

        System.out.println(list.stream().filter(e -> e > 5).reduce(0, (i, j) -> (i+j)));
    }
}

