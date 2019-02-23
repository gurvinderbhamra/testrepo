public class ExceptionEx {

    private void noClassDefFound()
    {
        throw new NoClassDefFoundError();
    }

    private void classNotFound()throws ClassNotFoundException
    {
        throw new ClassNotFoundException();
    }

    public static void main(String args[])
    {
        ExceptionEx ex = new ExceptionEx();

        //produce a NoClassDefFoundError
        ex.noClassDefFound();

        try
        {
            ex.classNotFound();
        }
        catch(ClassNotFoundException exc)
        {
            System.out.println(exc);
        }
    }
}
