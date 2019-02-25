import java.util.HashSet;
import java.util.Set;

public class Q2 {

    private int uniqueCharacters(String s)
    {
        Set<Character> set = new HashSet<>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            //it will override the duplicate character
            set.add(s.charAt(i));
        }
        return set.size();
    }

    public static void main(String args[])
    {
        String str = "gurvinder"; //number of unique characters : g,u,r,v,i,n,d,e (8)
        System.out.println("Number of unique chracters in string is : " + new Q2().uniqueCharacters(str));
    }
}

