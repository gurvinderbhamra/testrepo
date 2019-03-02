//Implement Abstract Factory Pattern to create cars of
// different categories from different countries.

enum CarType{
    HATCHBACK, SEDAN, LUXURY;
}

enum Country{
    DEFAULT, INDIA, USA;
}

abstract class Car{
    CarType carType;
    Country country;

    public Car(CarType carType, Country country){
        this.carType = carType;
        this.country = country;
    }

    abstract void construct();

    @Override
    public String toString(){
        return "Car(carType : " + carType +
                ", country : " + country + ")";
    }
}

class HatchbackCar extends Car{
    public HatchbackCar(Country country){
        super(CarType.HATCHBACK, country);
    }

    @Override
    public void construct(){
        System.out.println("connecting to hatchback car");
    }
}

class SedanCar extends Car{
    public SedanCar(Country country){
        super(CarType.SEDAN, country);
    }

    @Override
    public void construct(){
        System.out.println("connecting to sedan car");
    }
}

class LuxuryCar extends Car{
    public LuxuryCar(Country country){
        super(CarType.LUXURY, country);
    }

    @Override
    public void construct(){
        System.out.println("connecting to luxury car");
    }
}

class IndianCarFactory{
    static Car buildCar(CarType carType){
        Car car = null;
        switch(carType){
            case HATCHBACK:
                car = new HatchbackCar(Country.INDIA);
                break;
            case SEDAN:
                car = new SedanCar(Country.INDIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Country.INDIA);
                break;
        }
        return car;
    }
}

class USACarFactory{
    static Car buildCar(CarType carType){
        Car car = null;
        switch(carType){
            case HATCHBACK:
                car = new HatchbackCar(Country.USA);
                break;
            case SEDAN:
                car = new SedanCar(Country.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Country.USA);
                break;
        }
        return car;
    }
}

class DefaultCarFactory{
    static Car buildCar(CarType carType){
        Car car = null;
        switch(carType){
            case HATCHBACK:
                car = new HatchbackCar(Country.DEFAULT);
                break;
            case SEDAN:
                car = new SedanCar(Country.DEFAULT);
                break;
            case LUXURY:
                car = new LuxuryCar(Country.DEFAULT);
                break;
        }
        return car;
    }
}

class CarFactory{
    Car car = null;

    static Car buildCar(CarType carType, Country country){
        Car car = null;
        switch(country){
            case INDIA:
                car = IndianCarFactory.buildCar(carType);
                break;
            case USA:
                car = USACarFactory.buildCar(carType);
                break;
            case DEFAULT:
                car = DefaultCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}


public class Q3 {
    public  static void main(String args[]){
        System.out.println(CarFactory.buildCar(CarType.LUXURY, Country.INDIA));
    }
}

