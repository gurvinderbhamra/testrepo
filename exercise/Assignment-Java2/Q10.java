import java.util.Scanner;
class Customer 
{
    public String name;
    public String pdt;
    public int price;
    private static int  token=190;

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    Customer(String name) 
    {
        this.name=name;
        pdt = "Latte";
        price = 100;
    }

    public void order() 
    {
        System.out.println("\n"+name+"'s order");
        System.out.println(pdt + " " + price+"/");
    }

    public int pay() 
    {
        System.out.println("\n"+name+" paid price "+price);
        return price;
    }




    public void ready()
    {
        System.out.println("Order taken by Customer "+token);
	token++;
    }

}

class Cashier 
{
    static int token=190;

    public void  payment(int price) 
    {
        System.out.println("\nCashier accpeted payment of " + price + "/");
    }
    public int getToken()
    {
        int token4=token;
        System.out.println("Token id-"+Cashier.token);
        token++;
        return token4;
    }
}

class Barista
{
    String next_order="Y";
    static int token3=190;
    public Barista() 
    {
        System.out.println("\nWelcome to Barista");
        this.next_order="Y";
    }

    public boolean manage()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("\nIs there new order(Y/N)");

        next_order=s.next();
        char order=next_order.charAt(0);

        if(order=='Y'||order=='y'){
            return true;
        }
        else
            return false;
    }

    public void entry(String name)
    {
        System.out.println("Hi "+name);
    }

    public void prepare()
    {
        System.out.println("Order under preparartion");
    }


    public void readyCoffee()
    {
                System.out.println("Order Ready for token id "+token3);
                token3++;
    }

}

class Q10 {
    public static void main(String[] args) 
    {
        Barista b=new Barista();
        Barista [] bar=new Barista[100];
        while(true)
        {
          if(b.manage()) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter customer name");
            String name=s.nextLine();
            Customer cs = new Customer(name);
            b.entry(cs.getName());
            cs.order();
            cs.pay();
            Cashier ch = new Cashier();
            ch.getToken();
            b.prepare();
            b.readyCoffee();
            cs.ready();
          }
          else{
            System.out.println("Order from Barista!!!We are always ready to serve you");
            System.exit(0);
          }
    }
}}


