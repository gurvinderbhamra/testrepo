
@FunctionalInterface
interface Greater
{
    boolean isGreater(int a, int b);
}

@FunctionalInterface
interface Increment
{
    int increment(int x);
}

@FunctionalInterface
interface Concat
{
    String concat(String a, String b);
}

@FunctionalInterface
interface Upper
{
    String upper(String a);
}

public class Q1 {
    public static void main(String args[])
    {
        System.out.println(((Greater)(a, b)->{
            if(a>b)
                return true;
            return false;
        }).isGreater(10, 20));

        System.out.println(((Increment)(a) ->  ++a).increment(10));

        Concat concat = (a, b) -> String.valueOf(a+b);

        System.out.println(concat.concat("Hello ", "Java"));

        System.out.println(((Upper)(a)->{
            a = a.toUpperCase();
            return a;
        }).upper("Hello "));


    }
}

