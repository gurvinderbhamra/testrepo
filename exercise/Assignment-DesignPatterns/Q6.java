//Implement Decorator pattern to decorate the Pizza with topings.

interface Pizza{
    String info();
}

class PaneerPizza implements Pizza{

    private String size;

    public PaneerPizza(String size){
        this.size = size;
    }

    public PaneerPizza(){
        this.setSize("medium");
    }

    @Override
    public String info(){
        return "Paneer Pizza " + getSize() + " size";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

class ChickenPizza implements Pizza{

    private String size;

    public ChickenPizza(String size){
        this.size = size;
    }

    public ChickenPizza(){
        this.setSize("medium");
    }

    @Override
    public String info(){
        return "Chicken Pizza " + getSize() + " size";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

class DoubleCheesePizza implements Pizza{

    private String size;

    public DoubleCheesePizza(String size){
        this.size = size;
    }

    public DoubleCheesePizza(){
        this.setSize("medium");
    }

    @Override
    public String info(){
        return "Double Cheese Pizza  of " + getSize() + " size";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

class PizzaWithTopings implements Pizza{
    @Override
    public String info(){
        return "Pizza with topings";
    }
}

class PizzaWithoutToping implements Pizza{
    @Override
    public String info(){
        return "Pizza without toppings";
    }
}

public class Q6 {
    public static void main(String args[]){
        PizzaWithTopings pizzaWithTopings = new PizzaWithTopings();
        System.out.println(pizzaWithTopings.info());
        PaneerPizza paneerPizza = new PaneerPizza();
        System.out.println(paneerPizza.info());
        ChickenPizza chickenPizza = new ChickenPizza("large");
        System.out.println(chickenPizza.info());
    }
}

