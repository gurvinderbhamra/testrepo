import java.util.HashMap;
import java.util.Map;

public class Q3 {

    //Write a method that takes a string and print the number of occurrence of each character characters in the string.

    private void occurrences(String s)
    {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
        {
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);
            }
        }
        System.out.println("Occurrences of characters are as follows : " + map);
    }

    public static void main(String args[])
    {
        String str = "this is string";
        new Q3().occurrences(str);
    }
}

