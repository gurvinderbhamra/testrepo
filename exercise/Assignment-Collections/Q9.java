import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Q9
{
    public static void main(String args[])
    {
        Date d1 = new Date();
        System.out.println("Today's date : " + d1);

        Locale italian = new Locale("it", "IT");
        Locale indian = new Locale("hi", "IN");

        DateFormat ind = DateFormat.getDateInstance(DateFormat.FULL, indian);
        DateFormat ita = DateFormat.getDateInstance(DateFormat.FULL, italian);

        System.out.println("Indian : " + ind.format(d1));
        System.out.println("Indian : " + ita.format(d1));
    }
}
