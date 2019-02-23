import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Q3
{
    public static void main(String args[])throws InterruptedException
    {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try
        {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread1::" + Thread.currentThread().getName());
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread2::" + Thread.currentThread().getName());
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread3::" + Thread.currentThread().getName());
                }
            });
        }
        catch(Exception exc)
        {}
        finally {
            executorService.shutdown();
        }
    }
}

