//Create a functional interface whose method takes 2 integers and return one integer.

@FunctionalInterface
interface FuncInterface
{
    int function(int a, int b);
}

public class Q2 {
    public static void main(String args[])
    {
        //it will return the greater number
        System.out.println("Value return from function : " + ((FuncInterface)(a, b) -> a > b ? a : b).function(10, 20));
    }
}

