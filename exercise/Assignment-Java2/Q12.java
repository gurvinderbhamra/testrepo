/*
Output will be : 

static - grandparent
static - parent
static - child
instance - grandparent
constructor - grandparent
instance - parent
constructor - parent
instance - child
constructor - child

*/


class Parent extends Grandparent {
       
        {
        System.out.println("instance - parent");
        }

        public Parent() {
        System.out.println("constructor - parent");
        }

        static {
        System.out.println("static - parent");
        }
    }

    class Grandparent {
      
        static {
        System.out.println("static - grandparent");
        }

        {
        System.out.println("instance - grandparent");
        }

        public Grandparent() {
        System.out.println("constructor - grandparent");
        }
    }

    class Child extends Parent {

        public Child()throws Exception {
            Thread.sleep(10000l);
        System.out.println("constructor - child");
        }

        static {
        System.out.println("static - child");
        }

        {
        System.out.println("instance - child");
        }
    }

    public class Q12
    {
        public static void main(String... s)throws Exception
        {
            new Child();
        }
    }


