import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1 {

    public static void main(String args[])
    {
        List<Float> list = new ArrayList<>();
        list.add(1.1f);
        list.add(2.2f);
        list.add(3.3f);
        list.add(4.4f);
        list.add(5.5f);
        
        Iterator<Float> iterator = list.iterator();
        Float sum = 0.0f;
        while(iterator.hasNext())
        {
            sum = sum + iterator.next();
        }
        System.out.println("Sum of floating list is : " + sum);

    }
}
