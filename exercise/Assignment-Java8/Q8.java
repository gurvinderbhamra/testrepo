// Implement multiple inheritance with default method inside  interface.

interface Test{
    int x = 1;
    default void print(){
        System.out.println("This is default method of first interface");
    }
}

interface Test2 {
    int x = 2;
    default void print(){
        System.out.println("This is default method of second interface");
    }
}

interface Test3 extends Test, Test2{
    //using x here will generate ambiguity
    default void print(){
        System.out.println("This method is overridden in Child interface");
    }
}

public class Q8 {
    public static void main(String args[]){
        Test3 t = new Test3(){};
        t.print();
    }
}

