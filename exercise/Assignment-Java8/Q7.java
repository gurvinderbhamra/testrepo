//Override the default method of the interface.

interface Test{
    default void print(){
        System.out.println("This is default method of first interface");
    }
}

interface Test2 {
    default void print(){
        System.out.println("This is default method of second interface");
    }
}

class Impl implements Test, Test2{
    public void print(){
        System.out.println("This is overridden method in class that implements two interface having same function");
    }
}

public class Q7 {
    public static void main(String args[]){
        Test2 t1 = new Impl();
        t1.print();
    }
}

