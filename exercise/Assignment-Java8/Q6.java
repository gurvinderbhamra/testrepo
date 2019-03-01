//Create and access default and static method of an interface.

interface Test{
    default void print(){
        System.out.println("This is default method of interface");
    }

    static void display(){
        System.out.println("This is static method of interface");
    }
}

public class Q6 {
    public static void main(String args[]){
        Test.display();
        new Test(){}.print();
    }
}

