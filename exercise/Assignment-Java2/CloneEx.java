public class CloneEx {
    public static void main(String args[]){

        //Clone via cloneable
        CloneObj obj = new CloneObj();

        try
        {
            //cloning object
            CloneObj obj2 = (CloneObj) obj.clone();
        }
        catch(Exception exc)
        {}

        //Clone via copy constructor
        CloneConstruct cobj = new CloneConstruct();
        CloneConstruct copy_obj = new CloneConstruct(cobj);
    }
}

class CloneObj implements Cloneable{

    public CloneObj(){
        System.out.println("Object via default constructor");
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}

class CloneConstruct{

    int a, b;

    public CloneConstruct(CloneConstruct obj)
    {
        this.a = obj.a;
        this.b = obj.b;
    }

    public CloneConstruct(){
        System.out.println("Object created via default constructor");
    }
}