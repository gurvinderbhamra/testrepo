public class SingletonEx {

    public static void main(String args[])
    {
        Singleton obj = Singleton.getObject();
    }
}
class Singleton {

    static Singleton obj = new Singleton();

    private Singleton(){
        System.out.println("Default private constructor");
    }

    public static Singleton getObject(){
        return obj;
    }
}
