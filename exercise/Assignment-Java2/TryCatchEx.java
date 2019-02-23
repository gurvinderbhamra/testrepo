class TryCatchEx {
    
    public static void main(String[] args) {
        try
        {
            int x = 10/0;
        }
        catch(ArithmeticException exc)
        {
            System.out.println("caught by arithmetic exception");
        }
        catch(Exception exc)
        {
            System.out.println("caught by exception");
        }
    }
}
