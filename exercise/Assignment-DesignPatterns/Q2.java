//Implement Factory Pattern to get the
// Polygon of differnt type.

interface Polygon{
    void createPolygon();
}

class Pentagon implements Polygon{
    @Override
    public void createPolygon(){
        System.out.println("Pentagon is created");
    }

    @Override
    public String toString(){
        return "pentagon";
    }
}

class Triangle implements Polygon{
    @Override
    public void createPolygon(){
        System.out.println("Triangle is created");
    }

    @Override
    public String toString(){
        return "triangle";
    }
}

class Quadrilateral implements Polygon{
    @Override
    public void createPolygon(){
        System.out.println("Quadrilateral is created");
    }

    @Override
    public String toString(){
        return "quadrilateral";
    }
}

class Figure
{
    private Polygon polygon;

    public Polygon getPolygon(){
        return polygon;
    }

    public void setPolygon(Polygon polygon){
        this.polygon = polygon;
    }

    @Override
    public String toString(){
        return "figure";
    }
}

class FigureFactory{
    static Figure getFigureObject(String name){
        Figure figure = new Figure();
        switch(name){
            case "pentagon":
                figure.setPolygon(new Pentagon());
                break;
            case "triangle":
                figure.setPolygon(new Triangle());
                break;
            case "quadrilateral":
                figure.setPolygon(new Quadrilateral());
                break;
        }
        return figure;
    }
}

public class Q2 {
    public static void main(String args[]){
        Figure figure = FigureFactory.getFigureObject("triangle");
        figure.getPolygon().createPolygon();
        Figure figure2 = FigureFactory.getFigureObject("quadrilateral");
        figure2.getPolygon().createPolygon();
    }
}

