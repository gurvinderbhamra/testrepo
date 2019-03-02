//Implement Bridge Design Pattern for Color and Shape such that Shape and Color
// can be combined together e.g BlueSquare, RedSquare, PinkTriangle etc.

interface Color{
    String getColorType();
}

class Red implements Color{
    @Override
    public String getColorType(){
        return "Red";
    }
}

class Blue implements Color{
    @Override
    public String getColorType(){
        return "Blue";
    }
}

class Pink implements Color{
    @Override
    public String getColorType(){
        return "Pink";
    }
}

abstract class Shape{
    String type;
    Color color;

    public Shape(String type, Color color){
        this.type = type;
        this.color = color;
    }
}

class Rectangle extends Shape{

    public Rectangle(Color color){
        super("rectangle", color);
    }

    @Override
    public String toString(){
        return "Rectangle(color : " + color.getColorType() + ")";
    }
}

class Traingle extends Shape{

    public Traingle(Color color){
        super("traingle", color);
    }

    @Override
    public String toString(){
        return "Traingle(color : " + color.getColorType() + ")";
    }
}

public class Q5 {
    public static void main(String args[]){
        Rectangle rectangle = new Rectangle(new Red());
        System.out.println(rectangle);

        Traingle traingle = new Traingle(new Blue());
        System.out.println(traingle);
    }
}

