interface Furniture 
{
    void fireTest();
    void stressTest();
}

abstract class Chair 
{
    Chair() 
    {
        System.out.println("This is a chair");
    }
}

class WoodenChair extends Chair implements Furniture 
{
    static String chairType = "wooden";
    
    WoodenChair() 
    {
        super();
        System.out.println("This is a " + chairType + " chair");
    }
    
    @Override
    public void fireTest()  
    {
        System.out.println("Wooden chairs have low resistance to fire");
    }
    
    @Override
    public void stressTest() 
    {
        System.out.println("Wooden chairs have moderate resistance to stress");
    }
}

class MetallicChair extends Chair implements Furniture 
{
    static String chairType = "metallic";
    
    MetallicChair() 
    {
        System.out.println("This is a " + chairType + " chair");
    }
    
    @Override
    public void fireTest() 
    {
        System.out.println("Metallic chairs have high resistance to fire");
    }
    
    @Override
    public void stressTest() 
    {
        System.out.println("Metallic chairs have high resistance to stress");
    }
}

abstract class Table 
{
    Table()
    {
        System.out.println("This is a table");
    }
}

class WoodenTable extends Table implements Furniture 
{
    static String tableType = "wooden";
    
    WoodenTable()
    {
        super();
        System.out.println("This is a " + tableType + " table");
    }
    
    @Override
    public void fireTest() 
    {
        System.out.println("Wooden tables have low resistance to fire");
    }
    
    @Override
    public void stressTest() 
    {
        System.out.println("Wooden tables have moderate resistance to stress");
    }
}

class MetallicTable extends Table implements Furniture 
{
    static String tableType = "Metallic";
    
    MetallicTable() 
    {
        System.out.println("This is a " + tableType + " table");
    }
    
    @Override
    public void fireTest() 
    {
        System.out.println("Metallic tables have high resistance to fire");
    }
    
    @Override
    public void stressTest() 
    {
        System.out.println("Metallic tables have high resistance to stress");
    }
}

public class Q9 
{
    public static void main(String[] args) 
    {
        WoodenChair woodenChair = new WoodenChair();
        woodenChair.fireTest();
        woodenChair.stressTest();
        MetallicChair metallicChair = new MetallicChair();
        metallicChair.fireTest();
        metallicChair.stressTest();
        WoodenTable woodenTable = new WoodenTable();
        woodenTable.fireTest();
        woodenTable.stressTest();
        MetallicTable metallicTable = new MetallicTable();
        metallicTable.fireTest();
        metallicTable.stressTest();
    }
}

