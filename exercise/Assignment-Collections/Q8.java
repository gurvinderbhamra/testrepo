import java.text.SimpleDateFormat;
import java.util.Date;

public class Q8 {
    public static void main(String[] args) 
    {
        SimpleDateFormat formatter  = new SimpleDateFormat("dd-MMMM-YYYY");
        System.out.println("Today's Date: " + formatter.format(new Date()));
    }
}
